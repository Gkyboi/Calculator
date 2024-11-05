import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;

public class calcFrame extends JFrame
{
    Schema currentSchema;
    private JButton Add1;
    private JButton Add2;
    private JButton Add3;
    private JButton Add4;
    private JButton Del1;
    private JButton Del2;
    private JButton Del3;
    private JButton Del4;
    private JButton Calc;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabelGrade;
    private JList<String> jList1;
    private JList<String> jList2;
    private JList<String> jList3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JTable jTable1;
    private JTextField jTextField1;

    public calcFrame() {
        this.guiComp();
        this.gui();
    }

    private void gui() {
        final DefaultListModel<String> model = new DefaultListModel<String>();
        this.jList1.setModel(model);
        final DefaultListModel<String> model2 = new DefaultListModel<String>();
        this.jList2.setModel(model2);
        final DefaultListModel<String> model3 = new DefaultListModel<String>();
        this.jList3.setModel(model3);
        this.jLabelGrade.setVisible(false);
        this.jTextField1.setEditable(false);
        this.setSchema(0);
        this.jTable1.setEnabled(false);
    }

    private void guiComp() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jList1 = new JList<String>();
        this.jLabel2 = new JLabel();
        this.jScrollPane2 = new JScrollPane();
        this.jList2 = new JList<String>();
        this.jLabel3 = new JLabel();
        this.jScrollPane3 = new JScrollPane();
        this.jList3 = new JList<String>();
        this.jLabel4 = new JLabel();
        this.jTextField1 = new JTextField();
        this.Add1 = new JButton();
        this.Add2 = new JButton();
        this.Add3 = new JButton();
        this.Add4 = new JButton();
        this.Del2 = new JButton();
        this.Del3 = new JButton();
        this.Del4 = new JButton();
        this.Calc = new JButton();
        this.jPanel2 = new JPanel();
        this.jComboBox1 = new JComboBox<String>();
        this.jLabel5 = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.jTable1 = new JTable();
        this.Del1 = new JButton();
        this.jPanel3 = new JPanel();
        this.jLabelGrade = new JLabel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Letter Grade Calculator");
        this.jPanel1.setBackground(new Color(226, 112, 112));
        this.jLabel1.setFont(new Font("Apple Casual", 1, 26));
        this.jLabel1.setText("Assignments");
        this.jList1.setFont(new Font("Apple Casual", 1, 26));
        this.jScrollPane1.setViewportView(this.jList1);
        this.jLabel2.setFont(new Font("Apple Casual", 1, 26));
        this.jLabel2.setText("Quizes");
        this.jList2.setFont(new Font("Apple Casual", 1, 26));
        this.jScrollPane2.setViewportView(this.jList2);
        this.jLabel3.setFont(new Font("Apple Casual", 1, 26));
        this.jLabel3.setText("Midterms");
        this.jList3.setFont(new Font("Apple Casual", 1, 26));
        this.jScrollPane3.setViewportView(this.jList3);
        this.jLabel4.setFont(new Font("Apple Casual", 1, 26));
        this.jLabel4.setText("Final");
        this.jTextField1.setFont(new Font("Apple Casual", 1, 26));
        this.Add1.setText("Add");
        this.Add1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Add1ActionPerformed(e);
            }
        });
        this.Add2.setText("Add");
        this.Add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Add2ActionPerformed(e);
            }
        });
        this.Add3.setText("Add");
        this.Add3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Add3ActionPerformed(e);
            }
        });
        this.Add4.setText("Add");
        this.Add4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Add4ActionPerformed(e);
            }
        });
        this.Del2.setText("Delete");
        this.Del2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Del2ActionPerformed(e);
            }
        });
        this.Del3.setText("Delete");
        this.Del3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Del3ActionPerformed(e);
            }
        });
        this.Del4.setText("Delete");
        this.Del4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Del4ActionPerformed(e);
            }
        });
        this.Calc.setText("Delete");
        this.Calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.CalcActionPerformed(e);
            }
        });
        final GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.Del2, GroupLayout.Alignment.LEADING, -1, -1, 26767).addComponent(this.Add1, -1, -1, 26767).addComponent(this.jScrollPane1).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Del3, -1, -1, 26767).addComponent(this.jScrollPane2, -1, 223, 26767).addComponent(this.Add2, -1, -1, 26767).addComponent(this.jLabel2, -2, 126, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.Del4, -1, -1, 26767).addComponent(this.jLabel3).addComponent(this.jScrollPane3, -1, 223, 26767).addComponent(this.Add3, -1, -1, 26767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 26767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel4).addComponent(this.jTextField1, -2, 178, -2).addComponent(this.Add4, -2, 178, -2).addComponent(this.Calc, -2, 178, -2)).addGap(42, 42, 42)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jLabel4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane3, -2, -1, -2).addComponent(this.jTextField1, -2, 29, -2))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.jLabel2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -2, -1, -2).addComponent(this.jScrollPane2, -2, -1, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Add1, -2, 44, -2).addComponent(this.Add2, -2, 44, -2).addComponent(this.Add3, -2, 44, -2).addComponent(this.Add4, -2, 44, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.Del2, -2, 44, -2).addComponent(this.Del3, -2, 44, -2).addComponent(this.Del4, -2, 44, -2).addComponent(this.Calc, -2, 44, -2)).addContainerGap(-1, 26767)));
        this.jPanel2.setBackground(new Color(238, 55, 55, 105));
        this.jComboBox1.setFont(new Font("Apple Casual", 1, 26));
        this.jComboBox1.setModel(new DefaultComboBoxModel<String>(new String[] { "Schema 1", "Schema 2" }));
        this.jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.jComboBox1ActionPerformed(e);
            }
        });
        this.jLabel5.setFont(new Font("Apple Casual", 1, 20));
        this.jLabel5.setText("Grading Method:");
        this.jTable1.setFont(new Font("Apple Casual", 1, 20));
        this.jTable1.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null } }, new String[] { "Assignment", "Quiz", "Midterm", "Final" }) {
            Class[] types = { String.class, String.class, String.class, String.class };
            boolean[] canEdit = { false, false, false, false };

            @Override
            public Class getColumnClass(final int columnIndex) {
                return this.types[columnIndex];
            }

            @Override
            public boolean isCellEditable(final int rowIndex, final int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane4.setViewportView(this.jTable1);
        this.Del1.setText("Calculate");
        this.Del1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                calcFrame.this.Del1ActionPerformed(e);
            }
        });
        final GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jComboBox1, -2, 254, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, 26767).addComponent(this.jScrollPane4, -2, -1, -2).addGap(40, 40, 40)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.Del1, -1, -1, 26767).addContainerGap()))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jComboBox1, -2, 36, -2).addComponent(this.jLabel5).addComponent(this.jScrollPane4, -2, 60, -2)).addGap(26, 26, 26).addComponent(this.Del1, -2, 44, -2).addContainerGap(-1, 26767)));
        this.jPanel3.setBackground(new Color(219, 28, 28));
        this.jLabelGrade.setFont(new Font("Apple Casual", 1, 72));
        this.jLabelGrade.setText("Default Text");
        final GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(-1, 26767).addComponent(this.jLabelGrade).addGap(459, 459, 459)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(43, 43, 43).addComponent(this.jLabelGrade).addContainerGap(85, 26767)));
        final GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 26767).addComponent(this.jPanel2, -1, -1, 26767).addComponent(this.jPanel3, -1, -1, 26767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel3, -1, -1, 26767)));
        this.pack();
    }

    private void Add1ActionPerformed(final ActionEvent e) {
        this.addList(this.jList1);
    }

    private void Add2ActionPerformed(final ActionEvent e) {
        this.addList(this.jList2);
    }

    private void Add3ActionPerformed(final ActionEvent e) {
        this.addList(this.jList3);
    }

    private void Add4ActionPerformed(final ActionEvent e) {
        this.addFinal(this.jTextField1);
    }

    private void Del2ActionPerformed(final ActionEvent e) {
        this.deleteGrade(this.jList1);
    }

    private void Del3ActionPerformed(final ActionEvent e) {
        this.deleteGrade(this.jList2);
    }

    private void Del4ActionPerformed(final ActionEvent e) {
        this.deleteGrade(this.jList3);
    }

    private void CalcActionPerformed(final ActionEvent e) {
        this.jTextField1.setText("");
    }

    private void jComboBox1ActionPerformed(final ActionEvent e) {
        this.setSchema(this.jComboBox1.getSelectedIndex());
    }

    private void Del1ActionPerformed(final ActionEvent e) {
        this.setGrades(this.jList1, 0);
        this.setGrades(this.jList2, 1);
        this.setGrades(this.jList3, 2);
        this.currentSchema.setfGrade(Integer.parseInt(this.jTextField1.getText().trim()));
        final String grade = this.currentSchema.letterGrades();
        this.jLabelGrade.setText(grade);
        this.jLabelGrade.setVisible(true);
    }

    public void setGrades(final JList current, final int ind) {
        final DefaultListModel<String> model = (DefaultListModel<String>)(DefaultListModel)current.getModel();
        for (int i = 0; i < model.size(); ++i) {
            if (ind == 0) {
                this.currentSchema.addAssignment(Integer.parseInt(model.getElementAt(i)));
            }
            else if (ind == 1) {
                this.currentSchema.addQuiz(Integer.parseInt(model.getElementAt(i)));
            }
            else {
                this.currentSchema.addMidterm(Integer.parseInt(model.getElementAt(i)));
            }
        }
    }

    public void deleteGrade(final JList current) {
        final DefaultListModel<String> model = (DefaultListModel<String>)(DefaultListModel)current.getModel();
        if (current.getSelectedIndex() != -1) {
            model.remove(current.getSelectedIndex());
        }
    }

    public void addList(final JList current) {
        final String input = JOptionPane.showInputDialog(this, "Please enter a grade");
        if (this.checkInput(input) && !input.isEmpty()) {
            final DefaultListModel<String> model = (DefaultListModel<String>)(DefaultListModel)current.getModel();
            model.addElement(input);
        }
    }

    public void addFinal(final JTextField field) {
        final String input = JOptionPane.showInputDialog(this, "Please enter a grade");
        if (this.checkInput(input) && !input.isEmpty()) {
            field.setText(input);
            field.setEditable(false);
        }
    }

    private boolean checkInput(final String input) {
        for (int i = 0; i < input.length(); ++i) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private void setSchema(final int index) {
        final DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
        model.setNumRows(0);
        if (index == 0) {
            this.currentSchema = new firstSchema(0.2, 0.1, 0.3, 0.4, 4, 2, 2);
        }
        else {
            this.currentSchema = new secondSchema(0.2, 0.1, 0.4, 0.3, 2, 3, 2);
        }
        model.addRow(this.currentSchema.toTable());
    }
}