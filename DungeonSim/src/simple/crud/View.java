package simple.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingWorker;
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
        simulate = new javax.swing.JButton();
        monster1id = new javax.swing.JTextField();
        monster2id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DungeonSim");
        setPreferredSize(new java.awt.Dimension(1000, 650));

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

        simulate.setText("Simulate");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter ID for 2 monster to simulate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(serachData, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchBtn))
                        .addComponent(mName)
                        .addComponent(health)
                        .addComponent(armorclass)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(submit)
                            .addGap(18, 18, 18)
                            .addComponent(update)
                            .addGap(18, 18, 18)
                            .addComponent(delete)
                            .addGap(18, 18, 18)
                            .addComponent(Clear))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(monster1id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(monster2id, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monster1id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monster2id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
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
                    String i, f, l, e;
                    while (rs.next()) {
                        i = rs.getString("id");
                        f = rs.getString("name");
                        l = rs.getString("hp");
                        e = rs.getString("ac");
                        model.addRow(new Object[]{i, f, l, e});
                    }
                    con.close();
                } catch (Exception e) {
                    System.out.println("Error " + e.getMessage());
                }
                return null;
            }
        };

        worker.execute();
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

    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        String ID1, ID2, name1 = null, name2 = null;
        int notFound = 0;
        int hp1 = 0;
        int ac1 = 0;
        int hp2 = 0;
        int ac2 = 0;
        int time = 0;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySQL://localhost:3306/dungeonsim";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            
            ID1 = monster1id.getText();
            ID2 = monster2id.getText();
            if("".equals(ID1) || "".equals(ID2)){
              JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
               String sq1 = "SELECT * FROM monsters WHERE id="+ID1;
               String sq2 = "SELECT * FROM monsters WHERE id="+ID2;
               ResultSet rs1 = st.executeQuery(sq1);
               while(rs1.next()){
                   String hp = rs1.getString("hp");
                   hp1 = Integer.valueOf(hp);
                   String ac = rs1.getString("ac");
                   ac1 = Integer.valueOf(ac);
                   name1 = rs1.getString("name");
                   notFound = 1;
                   monster monster1 = new monster(name1, hp1, ac1); 
               }
               ResultSet rs2 = st.executeQuery(sq2);
               while(rs2.next()){
                   String hp = rs2.getString("hp");
                   hp2 = Integer.valueOf(hp);
                   String ac = rs2.getString("ac");
                   ac2 = Integer.valueOf(ac);
                   name2 = rs2.getString("name");
                   monster monster2 = new monster(name2, hp2, ac2);
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
        
        while(true){
            time = time + 6;
            hp2 = hp2 - ac1;
            if(hp2 < 1){
                break;
            }
            hp1 = hp1 - ac2;
            if(hp1 < 1){
                break;
            }
        }
        if(hp1 > 0){
             JOptionPane.showMessageDialog(null, name1+" wins vs "+name2+". Remaing health: "+hp1+". Combat took "+time+" seconds.");
        }else{
             JOptionPane.showMessageDialog(null, name2+" wins vs "+name1+". Remaing health: "+hp2+". Combat took "+time+" seconds.");
        }
    }//GEN-LAST:event_simulateActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField monster1id;
    private javax.swing.JTextField monster2id;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField serachData;
    private javax.swing.JButton simulate;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
