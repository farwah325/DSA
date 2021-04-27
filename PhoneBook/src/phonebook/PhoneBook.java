
package phonebook;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class PhoneBook extends javax.swing.JFrame {

    Linked_List list = new Linked_List();
    
    
    public PhoneBook() {
        initComponents();
      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PhoneBook = new javax.swing.JPanel();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddContact = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddContactPanel = new javax.swing.JPanel();
        Name = new javax.swing.JTextField();
        Number = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EditPannel = new javax.swing.JPanel();
        EditName = new javax.swing.JTextField();
        EditNumber = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        AddContact.setText("Add Contact");
        AddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddContactActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 2, 48)); // NOI18N
        jLabel1.setText("Phone Book");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel2.setText("By Farwah Shaikh");

        javax.swing.GroupLayout PhoneBookLayout = new javax.swing.GroupLayout(PhoneBook);
        PhoneBook.setLayout(PhoneBookLayout);
        PhoneBookLayout.setHorizontalGroup(
            PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneBookLayout.createSequentialGroup()
                .addGroup(PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PhoneBookLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PhoneBookLayout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addGroup(PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PhoneBookLayout.createSequentialGroup()
                                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PhoneBookLayout.createSequentialGroup()
                                    .addGap(348, 348, 348)
                                    .addComponent(AddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PhoneBookLayout.createSequentialGroup()
                                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PhoneBookLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PhoneBookLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        PhoneBookLayout.setVerticalGroup(
            PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhoneBookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(PhoneBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(PhoneBook, "card2");

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add contact");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setText("Phone Number:");

        javax.swing.GroupLayout AddContactPanelLayout = new javax.swing.GroupLayout(AddContactPanel);
        AddContactPanel.setLayout(AddContactPanelLayout);
        AddContactPanelLayout.setHorizontalGroup(
            AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddContactPanelLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddContactPanelLayout.createSequentialGroup()
                        .addGroup(AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddContactPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddContactPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddContactPanelLayout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        AddContactPanelLayout.setVerticalGroup(
            AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddContactPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(AddContactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        getContentPane().add(AddContactPanel, "card2");

        EditName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditNameActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel5.setText("Phone Number:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel6.setText("Name:");

        javax.swing.GroupLayout EditPannelLayout = new javax.swing.GroupLayout(EditPannel);
        EditPannel.setLayout(EditPannelLayout);
        EditPannelLayout.setHorizontalGroup(
            EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPannelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPannelLayout.createSequentialGroup()
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPannelLayout.createSequentialGroup()
                        .addGroup(EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EditPannelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addGroup(EditPannelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EditPannelLayout.createSequentialGroup()
                                .addComponent(EditName, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))))))
        );
        EditPannelLayout.setVerticalGroup(
            EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPannelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(EditPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(EditPannel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddContactActionPerformed
        // TODO add your handling code here
        PhoneBook.setVisible(false);
        AddContactPanel.setVisible(true);
    }//GEN-LAST:event_AddContactActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        if(Name.getText().isEmpty() || Number.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Can not save contact without name or number!");
        }
        else{
        if(list.contains(Name.getText(), Number.getText())){
            JOptionPane.showMessageDialog(null,"You already have contact with this name or number");
        }
        else{
        list.add(Name.getText(), Number.getText());
        JOptionPane.showMessageDialog(null,"Contact has been saved successfully!");
        
         
         refresh();
        
          Name.setText("");
          Number.setText("");
        AddContactPanel.setVisible(false);
        PhoneBook.setVisible(true);
        
        }
        }
    }//GEN-LAST:event_AddActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
        PhoneBook.setVisible(false);
        EditPannel.setVisible(true);
        
    }//GEN-LAST:event_EditActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
  
    }//GEN-LAST:event_SearchKeyPressed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
         String text = SearchField.getText();
       DefaultTableModel model =(DefaultTableModel)Table.getModel();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      Table.setRowSorter(tr);
  if (text.trim().equals(SearchField.getText())) {
      tr.setRowFilter(RowFilter.regexFilter(text));
 
  } else {
      tr.setRowFilter(null);
  }
    }//GEN-LAST:event_SearchActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model =(DefaultTableModel)Table.getModel();
        int index = Table.getSelectedRow();
        if(EditName.getText().isEmpty()||EditNumber.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please select valid contact to edit! ");
        }
        else{ list.edit(model.getValueAt(index,0).toString(),EditName.getText(),model.getValueAt(index,1).toString(),EditNumber.getText());
        JOptionPane.showMessageDialog(null, "The contact has saved successfully!");
      refresh();}
      EditPannel.setVisible(false);
      PhoneBook.setVisible(true);
    }//GEN-LAST:event_SaveActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)Table.getModel();
        int selectedRowIndex = Table.getSelectedRow();
        EditName.setText(model.getValueAt(selectedRowIndex,0).toString());
        EditNumber.setText(model.getValueAt(selectedRowIndex,1).toString());
        
        
    }//GEN-LAST:event_TableMouseClicked

    private void EditNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditNameActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        list.delete(EditName.getText(), EditNumber.getText());
        JOptionPane.showMessageDialog(null, "The contact has deleted successfully!");
        refresh();
  
        
    }//GEN-LAST:event_DeleteActionPerformed

    public void refresh(){
      DefaultTableModel model =  (DefaultTableModel)Table.getModel();
          model.setRowCount(0);
          Node n;
          for(n=list.head;n!=null;n=n.next){
          model.addRow(new Object [] {n.Name,n.Number});}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneBook().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddContact;
    private javax.swing.JPanel AddContactPanel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField EditName;
    private javax.swing.JTextField EditNumber;
    private javax.swing.JPanel EditPannel;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number;
    private javax.swing.JPanel PhoneBook;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
