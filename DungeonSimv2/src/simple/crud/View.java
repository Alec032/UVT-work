/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simple.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;



public class View extends javax.swing.JFrame {

   
    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        health = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        armorclass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        serachData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DungeonSim");
        setPreferredSize(new java.awt.Dimension(1000, 550));

        mName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Monster Name");

        health.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthActionPerformed(evt);
            }
        });

        jLabel3.setText("Monster Health");

        armorclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armorclassActionPerformed(evt);
            }
        });

        jLabel4.setText("Amor Class");

        submit.setText("Create");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        searchBtn.setText("Find");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Monster Name", "HP", "AC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setPreferredSize(new java.awt.Dimension(500, 400));
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        serachData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachDataActionPerformed(evt);
            }
        });

        jLabel5.setText("ID select");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(serachData, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(health, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(armorclass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(submit)
                                    .addGap(18, 18, 18)
                                    .addComponent(update)
                                    .addGap(18, 18, 18)
                                    .addComponent(delete)
                                    .addGap(18, 18, 18)
                                    .addComponent(Clear))))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(armorclass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serachData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNameActionPerformed

    }//GEN-LAST:event_mNameActionPerformed

    private void healthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthActionPerformed

    }//GEN-LAST:event_healthActionPerformed

    private void armorclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armorclassActionPerformed

    }//GEN-LAST:event_armorclassActionPerformed
    
    public void loadData(){
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:MySQL://localhost:3306/dungeonsim";
        String user = "root";
        String pass = "";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
            
       DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Monster Name", "HP", "AC"}, 0);
      
       Table.setModel(model);
       String sql = "SELECT * FROM monsters";
       
       ResultSet rs = st.executeQuery(sql);
       String i, f, l,e;
       while(rs.next()){
         i = rs.getString("id");
         f = rs.getString("name");
         l = rs.getString("hp");
         e = rs.getString("ac");
         model.addRow(new Object[]{i, f, l, e});
       }
     }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
     }   
                
       
    }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String mN, hp, ac, query;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/dungeonsim";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            if("".equals(mName.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "Monster Name is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(health.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "HP is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(armorclass.getText())){
             
                JOptionPane.showMessageDialog(new JFrame(), "AC is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
                mN = mName.getText();
                hp = health.getText();
                ac = armorclass.getText();
                query = "INSERT INTO monsters (name, hp, ac) "
                        + "VALUES ('"+mN+"','"+hp+"','"+ac+"')";
               
               st.executeUpdate(query);
               mName.setText("");
               health.setText("");
               armorclass.setText("");
               showMessageDialog(null, "Successfully added.");
               loadData();
               con.close();
            }   
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String ID;
        int notFound = 0;
        String mN, hp, ac;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/dungeonsim";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = serachData.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM monsters WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 mN = mName.getText();
                 hp = health.getText();
                 ac = armorclass.getText();
                 String sql2 = "UPDATE monsters SET name='"+mN+"', hp='"+hp+"', ac='"+ac+"'  WHERE id="+ID;
                 st.executeUpdate(sql2); 
                 loadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        } 
    }//GEN-LAST:event_updateActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/dungeonsim";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = serachData.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM monsters WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                   mName.setText(rs.getString("name"));
                   health.setText(rs.getString("hp"));
                   armorclass.setText(rs.getString("ac"));
                   notFound = 1;

                  con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "Invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }    
        
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String ID;
        int notFound = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:MySQL://localhost:3306/dungeonsim";
            String user = "root";
            String pass = "";
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID = serachData.getText();
            if("".equals(ID)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sql = "SELECT * FROM monsters WHERE id="+ID;
               ResultSet rs = st.executeQuery(sql);
               while(rs.next()){
                 notFound = 1;
                 String sql2 = "DELETE FROM monsters WHERE id="+ID;
                 st.executeUpdate(sql2); 
                 loadData();
                 con.close();
               }
               if(notFound == 0){
                  JOptionPane.showMessageDialog(new JFrame(), "Invalid ID", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
               }
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }  
    }//GEN-LAST:event_deleteActionPerformed

    private void serachDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachDataActionPerformed

    }//GEN-LAST:event_serachDataActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        mName.setText("");
        health.setText("");
        armorclass.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                View x = new View();
                x.loadData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTable Table;
    private javax.swing.JTextField armorclass;
    private javax.swing.JButton delete;
    private javax.swing.JTextField health;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mName;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField serachData;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
