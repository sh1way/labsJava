
package my.l1frame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;


public class l1frame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(l1frame.class.getName());
    private javax.swing.table.DefaultTableModel tableModel;

    public l1frame() {
    initComponents();
    tableModel = (javax.swing.table.DefaultTableModel) jTable1.getModel();

    jButton1.setBackground(Color.WHITE);
    jButton1.setForeground(Color.BLACK);

    jButton2.setBackground(Color.WHITE.darker());
    jButton2.setForeground(Color.BLACK);

    jButton3.setBackground(Color.RED);
    jButton3.setForeground(Color.WHITE);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14));
        jLabel1.setText("Функция для расчета: e^x/x");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 12)); 
        jLabel3.setText("");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 12)); 
        jLabel4.setText("Верхний предел:");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 12)); 
        jLabel5.setText("Нижний предел:");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 12)); 
        jLabel6.setText("Шаг:");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton1.setText("Заполнить");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Рассчитать");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Нижний предел", "Верхний предел", "Шаг", "Результат"
            }
        ));
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTable1ComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Удалить строку");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.
                        PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(57, 57, 57))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.
                swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
         int rowCount = tableModel.getRowCount();
    int calculatedCount = 0;
    
    if (rowCount == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Сначала добавьте данные через кнопку 'Заполнить'", 
            "Информация", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    for (int i = 0; i < rowCount; i++) {
        
        Object resultValue = tableModel.getValueAt(i, 3);
        boolean hasResult = resultValue != null && !resultValue.toString().trim().isEmpty();
        
        if (hasResult) {
            continue;
        }
        
        try {
            Object lowerObj = tableModel.getValueAt(i, 0);
            Object upperObj = tableModel.getValueAt(i, 1);
            Object stepObj = tableModel.getValueAt(i, 2);
            
            if (lowerObj == null  || upperObj == null || stepObj == null ||
                lowerObj.toString().trim().isEmpty() || 
                upperObj.toString().trim().isEmpty() || 
                stepObj.toString().trim().isEmpty()) {
                continue; 
            }
            
            double lowerLimit = Double.parseDouble(lowerObj.toString());
            double upperLimit = Double.parseDouble(upperObj.toString());
            double step = Double.parseDouble(stepObj.toString());
            
            if (lowerLimit >= upperLimit) {
                tableModel.setValueAt("Ошибка: нижний >= верхний", i, 3);
                continue;
            }
            
            if (step <= 0) {
                tableModel.setValueAt("Ошибка: шаг <= 0", i, 3);
                continue;
            }
            
            // вычисл интеграла
            double result = calculateIntegral(lowerLimit, upperLimit, step);
            
            tableModel.setValueAt(String.format("%.6f", result), i, 3);
            calculatedCount++;
            
        } catch (NumberFormatException ex) {
            tableModel.setValueAt("Ошибка формата", i, 3);
        } catch (Exception ex) {
            tableModel.setValueAt("Ошибка", i, 3);
        }
    }
    
    if (calculatedCount == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Нет строк для расчета (все строки уже содержат результаты или имеют ошибки)", 
            "Информация", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }                                        

    
    private void jTable1ComponentHidden(java.awt.event.ComponentEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        try {
        double lowerLimit = Double.parseDouble(jTextField2.getText().trim());
        double upperLimit = Double.parseDouble(jTextField1.getText().trim());
        double step = Double.parseDouble(jTextField3.getText().trim());
        
        if (lowerLimit >= upperLimit) {
            javax.swing.JOptionPane.showMessageDialog(this,
"Нижний предел должен быть меньше верхнего!", 
                "Ошибка", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (step <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Шаг должен быть положительным числом!", 
                "Ошибка", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        tableModel.addRow(new Object[]{lowerLimit, upperLimit, step, ""});
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
    } catch (NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Пожалуйста, введите корректные числовые значения!", 
            "Ошибка ввода", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        int selectedRow = jTable1.getSelectedRow();
    
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Пожалуйста, выберите строку для удаления!", 
            "Предупреждение", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    tableModel.removeRow(selectedRow);
    }                                        

public double calculateIntegral(double a, double b, double h) {
    double sum = 0.0;
    double x = a;
    int n = (int)((b - a) / h);
    double x0 = 0;
    double x1 = 0;
    for (int i = 0; i < n; i++){
        x0 = a + i * h;
        x1 =  a + (i + 1) * h;
        sum += (Math.exp(x0)/ x0 + Math.exp(x1) / x1) * h / 2;
    }
    if(x1 < b) sum += (Math.exp(x1)/ x1 + Math.exp(b) / b) * h / 2;
    return sum;
}
    /**
     * @param args the command line arguments
     */
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
  
        java.awt.EventQueue.invokeLater(() -> new l1frame().setVisible(true));
    }

                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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