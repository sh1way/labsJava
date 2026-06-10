package my.l1frame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class L1frame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(L1frame.class.getName());

    private DefaultTableModel tableModel;
    private List<RecIntegral> integralRecords;

    public L1frame() {
        initComponents();

        tableModel = (DefaultTableModel) jTable1.getModel();
        integralRecords = new ArrayList<>();

        tableModel.addTableModelListener(e -> {
            
            if (e.getType() != TableModelEvent.UPDATE) {
                return;
            }

            int row = e.getFirstRow();
            int column = e.getColumn();

            if (column >= 0 && column <= 2) {

                try {
                    double lower =
                            Double.parseDouble(tableModel.getValueAt(row, 0).toString());

                    double upper =
                            Double.parseDouble(tableModel.getValueAt(row, 1).toString());

                    double step =
                            Double.parseDouble(tableModel.getValueAt(row, 2).toString());

                    String result;

                    if (lower >= upper) {
                        result = "Ошибка: нижний >= верхний";
                    } else if (step <= 0) {
                        result = "Ошибка: шаг <= 0";
                    } else {
                        double value = calculateIntegral(lower, upper, step);
                        result = String.format("%.6f", value);
                    }

                    tableModel.setValueAt(result, row, 3);

                    if (row < integralRecords.size()) {
                        RecIntegral record = integralRecords.get(row);

                        record.setLowerLimit(lower);
                        record.setUpperLimit(upper);
                        record.setStep(step);
                        record.setResult(result);
                    }

                } catch (Exception ex) {
                    tableModel.setValueAt("Ошибка", row, 3);
                }
            }
        });

        // Цвета
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
        setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14));
        jLabel1.setText("Функция для расчета: e^x / x");

        jLabel4.setText("Верхний предел:");
        jLabel5.setText("Нижний предел:");
        jLabel6.setText("Шаг:");

        jButton1.setText("Добавить");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Рассчитать");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Удалить строку");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButtonClear.setText("Очистить таблицу");
        jButtonClear.addActionListener(this::jButtonClearActionPerformed);

        jButtonFillFromCollection.setText("Заполнить из коллекции");
        jButtonFillFromCollection.addActionListener(
                this::jButtonFillFromCollectionActionPerformed
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                        "Нижний предел",
                        "Верхний предел",
                        "Шаг",
                        "Результат"
                }
        ));

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)

                                        .addComponent(jLabel1)

                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)

                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))

                                                .addGap(20, 20, 20)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)

                                                        .addComponent(jTextField1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                80,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                        .addComponent(jTextField2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                80,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)

                                                        .addComponent(jTextField3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                80,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))

                                                .addGap(30, 30, 30)

                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)

                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton3)
                                                        .addComponent(jButtonClear)
                                                        .addComponent(jButtonFillFromCollection)
                                                )
                                        )
                                )
                                .addContainerGap(30, Short.MAX_VALUE)
                        )
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()

                                .addContainerGap()

                                .addComponent(jLabel1)

                                .addGap(20, 20, 20)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jLabel4)
                                        .addComponent(jTextField1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)
                                )

                                .addGap(10, 10, 10)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jLabel5)
                                        .addComponent(jTextField2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2)
                                )

                                .addGap(10, 10, 10)

                                .addGroup(layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(jLabel6)
                                        .addComponent(jTextField3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonClear)
                                )

                                .addGap(10, 10, 10)

                                .addComponent(jButtonFillFromCollection)

                                .addGap(20, 20, 20)

                                .addComponent(jScrollPane1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(20, 20, 20)

                                .addComponent(jButton3)

                                .addContainerGap(20, Short.MAX_VALUE)
                        )
        );

        pack();
    }

    //добавить строку
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        try {

            double lowerLimit =
                    Double.parseDouble(jTextField2.getText().trim());

            double upperLimit =
                    Double.parseDouble(jTextField1.getText().trim());

            double step =
                    Double.parseDouble(jTextField3.getText().trim());

            if (lowerLimit >= upperLimit) {

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Нижний предел должен быть меньше верхнего!"
                );

                return;
            }

            if (step <= 0) {

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Шаг должен быть положительным!"
                );

                return;
            }

            double result =
                    calculateIntegral(lowerLimit, upperLimit, step);

            String formatted =
                    String.format("%.6f", result);

            RecIntegral record =
                    new RecIntegral(lowerLimit, upperLimit, step);

            record.setResult(formatted);

            integralRecords.add(record);

            tableModel.addRow(new Object[]{
                    lowerLimit,
                    upperLimit,
                    step,
                    formatted
            });

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

        } catch (Exception ex) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Введите корректные числа!"
            );
        }
    }

    //рассчитат
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        for (int i = 0; i < integralRecords.size(); i++) {

            RecIntegral record = integralRecords.get(i);

            double result =
                    calculateIntegral(
                            record.getLowerLimit(),
                            record.getUpperLimit(),
                            record.getStep()
                    );

            String formatted =
                    String.format("%.6f", result);

            record.setResult(formatted);

            tableModel.setValueAt(formatted, i, 3);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Выберите строку!"
            );

            return;
        }

        integralRecords.remove(selectedRow);
        tableModel.removeRow(selectedRow);
    }

    //jчистить таблицу
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {

        integralRecords.clear();
        tableModel.setRowCount(0);
    }

    //заполнить таблицу из коллекции
    private void jButtonFillFromCollectionActionPerformed(
            java.awt.event.ActionEvent evt
    ) {

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

    //интегрирование
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

        java.awt.EventQueue.invokeLater(() ->
                new L1frame().setVisible(true)
        );
    }

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

class RecIntegral {

    private double lowerLimit;
    private double upperLimit;
    private double step;
    private String result;

    public RecIntegral(double lowerLimit,
                       double upperLimit,
                       double step) {

        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.step = step;
        this.result = "";
    }

    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getStep() {
        return step;
    }

    public String getResult() {
        return result;
    }

    public void setLowerLimit(double lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setUpperLimit(double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public void setResult(String result) {
        this.result = result;
    }
}