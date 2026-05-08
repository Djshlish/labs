package LAB_9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Головний клас програми, що реалізує графічний інтерфейс користувача.
 */
public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    
    private JPanel contentPane;
    private JTextField txtArea;        // Поле для площі S
    private JTextField txtDistance;    // Поле для відстані d
    private JTextField txtCapacitance; // Поле для ємності C
    private JButton btnCalculate;
    
    // Екземпляр класу для обчислень (принцип композиції)
    private CapacitorCalculator calculator = new CapacitorCalculator();

    public Main() {
        // Налаштування фрейму
        setTitle("Лабораторна 9 - Конденсатор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 380, 250);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Абсолютне позиціонування згідно з методичкою
        setContentPane(contentPane);

        // Створення елементів керування
        JLabel lblArea = new JLabel("Площа S (м²):");
        lblArea.setBounds(30, 30, 120, 20);
        contentPane.add(lblArea);

        txtArea = new JTextField();
        txtArea.setBounds(160, 30, 150, 20);
        contentPane.add(txtArea);

        JLabel lblDistance = new JLabel("Відстань d (м):");
        lblDistance.setBounds(30, 60, 120, 20);
        contentPane.add(lblDistance);

        txtDistance = new JTextField();
        txtDistance.setBounds(160, 60, 150, 20);
        contentPane.add(txtDistance);

        JLabel lblCapacitance = new JLabel("Ємність C (Ф):");
        lblCapacitance.setBounds(30, 90, 120, 20);
        contentPane.add(lblCapacitance);

        txtCapacitance = new JTextField();
        txtCapacitance.setBounds(160, 90, 150, 20);
        contentPane.add(txtCapacitance);

        btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(160, 130, 150, 30);
        contentPane.add(btnCalculate);

        // Обробник події натискання кнопки
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processCalculation();
            }
        });

        setVisible(true);
    }

    /**
     * Логіка обробки введених даних та виклику обчислень (обернена задача).
     */
    private void processCalculation() {
        try {
            String sText = txtArea.getText().trim().replace(",", ".");
            String dText = txtDistance.getText().trim().replace(",", ".");
            String cText = txtCapacitance.getText().trim().replace(",", ".");

            // Визначаємо, яку величину потрібно знайти (порожнє поле)
            if (cText.isEmpty() && !sText.isEmpty() && !dText.isEmpty()) {
                double s = Double.parseDouble(sText);
                double d = Double.parseDouble(dText);
                txtCapacitance.setText(String.format("%E", calculator.calculateC(s, d)));
            } 
            else if (sText.isEmpty() && !cText.isEmpty() && !dText.isEmpty()) {
                double c = Double.parseDouble(cText);
                double d = Double.parseDouble(dText);
                txtArea.setText(String.format("%E", calculator.calculateS(c, d)));
            } 
            else if (dText.isEmpty() && !cText.isEmpty() && !sText.isEmpty()) {
                double c = Double.parseDouble(cText);
                double s = Double.parseDouble(sText);
                txtDistance.setText(String.format("%E", calculator.calculateD(c, s)));
            } 
            else {
                JOptionPane.showMessageDialog(this, "Заповніть рівно два поля для обчислення третього!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Помилка: введіть коректні числові значення!");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Математична помилка: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        // Запуск програми
        SwingUtilities.invokeLater(() -> new Main());
    }
}

/**
 * Допоміжний клас для обчислювальної логіки (відокремлення даних від інтерфейсу).
 */
class CapacitorCalculator {
    // Електрична стала ε0 ≈ 8.854 * 10^-12 Ф/м
    private static final double EPS0 = 8.854187817e-12;

    // Обчислення ємності: C = (ε0 * S) / d
    public double calculateC(double s, double d) {
        if (d <= 0) throw new ArithmeticException("Відстань d повинна бути більшою за 0");
        return (EPS0 * s) / d;
    }

    // Обчислення площі: S = (C * d) / ε0
    public double calculateS(double c, double d) {
        return (c * d) / EPS0;
    }

    // Обчислення відстані: d = (ε0 * S) / C
    public double calculateD(double c, double s) {
        if (c <= 0) throw new ArithmeticException("Ємність C повинна бути більшою за 0");
        return (EPS0 * s) / c;
    }
}
