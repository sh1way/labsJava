package my.l1frame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

// --- Главный класс формы ---
public class L1frame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(L1frame.class.getName());
    private DefaultTableModel tableModel;
    private List<RecIntegral> integralRecords;  // Коллекция для хранения данных

    public L1frame() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();
        integralRecords = new ArrayList<>();

        // --- Простое оформление ---
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLACK);

        jButton2.setBackground(Color.WHITE.darker());
        jButton2.setForeground(Color.BLACK);

        jButton3.setBackground(Color.RED);
        jButton3.setForeground(Color.WHITE);

        jButtonClear.setBackground(Color.PINK);
        jButtonClear.setForeground(Color.WHITE);

        jButtonFillFromCollection.setBackground(Color.PINK);
        jButtonFillFromCollection.setForeground(Color.WHITE);

        jTable1.setBackground(Color.LIGHT_GRAY);
        jTable1.setForeground(Color.BLACK);
        jTable1.getTableHeader().setBackground(Color.DARK_GRAY);
        jTable1.getTableHeader().setForeground(Color.WHITE);

        jLabel1.setForeground(Color.MAGENTA);
        jLabel3.setForeground(Color.MAGENTA);
        jLabel4.setForeground(Color.MAGENTA);
        jLabel5.setForeground(Color.MAGENTA);
        jLabel6.setForeground(Color.MAGENTA);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonFillFromCollection = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14));
        jLabel1.setText("Функция для расчета: e^x/x");

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 12));
        jLabel3.setText("");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 12));
        jLabel4.setText("Верхний предел:");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 12));
        jLabel5.setText("Нижний предел:");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 12));
        jLabel6.setText("Шаг:");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton1.setText("Добавить");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Рассчитать");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Удалить строку");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButtonClear.setText("Очистить таблицу");
        jButtonClear.addActionListener(this::jButtonClearActionPerformed);

        jButtonFillFromCollection.setText("Заполнить из коллекции");
        jButtonFillFromCollection.addActionListener(this::jButtonFillFromCollectionActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"Нижний предел", "Верхний предел", "Шаг", "Результат"}
        ));
        jScrollPane1.
setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButtonClear)
                            .addComponent(jButtonFillFromCollection)
                            .addComponent(jButton3))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFillFromCollection)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}

    // --- Добавление записи с проверкой диапазона ---
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            double lowerLimit = Double.parseDouble(jTextField2.getText().trim());
            double upperLimit = Double.parseDouble(jTextField1.getText().trim());
            double step = Double.parseDouble(jTextField3.getText().trim());

           // if (lowerLimit >= upperLimit) {
            //    javax.swing.JOptionPane.showMessageDialog(this,
                //        "Нижний предел должен быть меньше верхнего!",
                 //       "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
                //return;
           // }

           // if (step <= 0) {
                //javax.swing.JOptionPane.showMessageDialog(this,
                 //       "Шаг должен быть положительным числом!",
                  //      "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
               // return;
          //  }

            // Создание объекта с проверкой диапазона
            RecIntegral record = new RecIntegral(lowerLimit, upperLimit, step);
            integralRecords.add(record);
            tableModel.addRow(new Object[]{lowerLimit, upperLimit, step, record.getResult()});

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Пожалуйста, введите корректные числовые значения!",
                    "Ошибка ввода", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (InvalidRangeException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Некорректный диапазон", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }

    // --- Расчет интеграла ---
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int calculatedCount = 0;
        for (int i = 0; i < integralRecords.size(); i++) {
            RecIntegral record = integralRecords.get(i);
            if (!record.getResult().isEmpty()) continue;

            double lower = record.getLowerLimit();
            double upper = record.getUpperLimit();
            double step = record.getStep();

            if (lower >= upper) {
                record.setResult("Ошибка: нижний >= верхний");
                tableModel.setValueAt(record.getResult(), i, 3);
                continue;
            }

            if (step <= 0) {
                record.setResult("Ошибка: шаг <= 0");
                tableModel.setValueAt(record.getResult(), i, 3);
                continue;
            }

            try {
                double result = calculateIntegral(lower, upper, step);
                record.setResult(String.format("%.6f", result));
                tableModel.setValueAt(record.getResult(), i, 3);
                calculatedCount++;
            } catch (Exception ex) {
                record.setResult("Ошибка");
                tableModel.setValueAt(record.getResult(), i, 3);
            }
        }

        if (calculatedCount == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Нет строк для расчета (все строки уже содержат результаты или имеют ошибки)",
                    "Информация",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // --- Удаление выбранной строки ---
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this,
    "Пожалуйста, выберите строку для удаления!",
                    "Предупреждение", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        integralRecords.remove(selectedRow);
        tableModel.removeRow(selectedRow);
    }

    // --- Очистить таблицу ---
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {
        tableModel.setRowCount(0);
    }

    // --- Заполнить таблицу из коллекции ---
    private void jButtonFillFromCollectionActionPerformed(java.awt.event.ActionEvent evt) {
        tableModel.setRowCount(0);
        for (RecIntegral record : integralRecords) {
            tableModel.addRow(new Object[]{
                    record.getLowerLimit(),
                    record.getUpperLimit(),
                    record.getStep(),
                    record.getResult()
            });
        }
    }

    private double calculateIntegral(double a, double b, double h) {
        double sum = 0.0;
        double x = a;

        while (x < b) {
            double nextX = Math.min(x + h, b);
            double y1 = Math.exp(x) / x;
            double y2 = Math.exp(nextX) / nextX;
            sum += (y1 + y2) * (nextX - x) / 2.0;
            x = nextX;
        }

        return sum;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new L1frame().setVisible(true));
    }

    // --- Переменные интерфейса ---
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonFillFromCollection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
}

// --- Пользовательское исключение ---
class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}

// --- Класс для хранения одной записи таблицы ---
class RecIntegral {
    private double lowerLimit;
    private double upperLimit;
    private double step;
    private String result;

    public RecIntegral(double lowerLimit, double upperLimit, double step) throws InvalidRangeException {
        if (!isValid(lowerLimit) || !isValid(upperLimit) || !isValid(step)) {
            throw new InvalidRangeException(
                "Все значения должны быть числами от 0.000001 до 1000000!"
            );
        }
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.step = step;
        this.result = "";
    }

    private boolean isValid(double value) {
        return value >= 0.000001 && value <= 1000000;
    }

    public double getLowerLimit() { return lowerLimit; }
    public double getUpperLimit() { return upperLimit; }
    public double getStep() { return step; }
    public String getResult() { return result; }
    public void setResult(String result) { this.result = result; }
}