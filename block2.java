
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author siva
 */
public class block2 extends javax.swing.JFrame {

    /**
     * Creates new form a1
     */
    public block2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("BLOCK 2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 80, 24);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MESSAGES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 63, 122, 23);

        ta.setBackground(new java.awt.Color(0, 0, 0));
        ta.setColumns(20);
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(44, 97, 350, 160);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CHAIN DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 120, 170, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 70, 171, 39);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 320, 108, 37);

        tf1.setBackground(new java.awt.Color(0, 0, 0));
        tf1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf1);
        tf1.setBounds(50, 270, 340, 30);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("RETRIEVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(410, 180, 170, 40);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("FRAGMENTATION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(410, 240, 170, 40);

        jLabel3.setBackground(java.awt.SystemColor.controlLtHighlight);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 380);

        setSize(new java.awt.Dimension(615, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ta.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ins();
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       chain("chain2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        repair("chain3");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      int bck =  blockck();
        if(bck==0)
        {
            retr("b2","chain2");
        }
        if(bck==1)
        {
        retr("b2","chain3");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    
    
    
    
    
    
    
    ///////////////////////////repair start
    
    public void repair(String table)
    {
       
        try
    {
        
            String host = "localhost";
         String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
             Statement stmt=conn.createStatement();
             
    ResultSet rs=stmt.executeQuery("select * from "+table+"where blockname ='b2'" );
    while(rs.next())
    {
     
    ta.setText("");
    String st=rs.getString("blockadd1");
        ta.append("value retrieved from=>" +st);
        
    }
    }
    catch(Exception e)
    {
        System.out.println("error"+e);
    }
        
      
  
     
           
       
        
    }
    
    
      ///////////////////////////repair end
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////retrieve start
    
    public void retr(String bl,String table)
    {
       
        try
    {
        
            String host = "localhost";
         String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
             Statement stmt=conn.createStatement();
             
    ResultSet rs=stmt.executeQuery("select * from "+table+"where blockname ='"+bl+"'" );
    while(rs.next())
    {
     
    ta.setText("");
    String st=rs.getString("filename");
        ta.append("value retrieved from=>" +st);
        
    }
    }
    catch(Exception e)
    {
        System.out.println("error"+e);
    }
        
      
  
     
           
       
        
    }
    
    
      ///////////////////////////repair end
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////////////////chain start
    
    public String chain(String table)
    {
        String st="";
       
        try
    {
        
            String host = "localhost";
         String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
             Statement stmt=conn.createStatement();
             
    ResultSet rs=stmt.executeQuery("select * from "+table+"where blockname ='b2'" );
    while(rs.next())
    {
     
    ta.setText("");
     st=rs.getString("blockadd3");
        ta.append(st);
        
    }
    }
    catch(Exception e)
    {
        System.out.println("error"+e);
    }
        
      
  
     return st;
           
       
        
    }
    
    
      ///////////////////////////chain end
    
    
    
    
    /////////////////////////////////////////////////ins start
     public void ins()
    
    {
try
{
    String host = "localhost";
    String table = "chain2";
    
           String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
           
             PreparedStatement ps;
            String sql;
            
            sql="insert into"+table+" values(?,?,?,?,?)";
            
            ps=conn.prepareStatement(sql);
              long keyval1=1269;
			    ECIES crypt;


  String ss=tf1.getText();
	            ECDomainParameters dp = ECDomainParameters.NIST_B_163();
            	ECPrivKey skA = new ECPrivKey(dp, BigInteger.valueOf(keyval1));
				System.out.println("the value skA is  "+skA);
                            
				ECPubKey pkA = new ECPubKey(skA);
                                System.out.println(ss);
				crypt = new ECIES(skA, pkA, ss.getBytes()); // encrypt the data
				    System.out.println("the encrypted value is "+crypt);
       
                                    String s3= crypt+"";
          int k=  blad("chain2");
            String s2 ="";
            if(k==0)
            {
                s2="b1";
                inbac("block9",s3);
                inbac("block17",s3);
            }
            if(k==1)
            {
                s2="b1,b2";
                inbac("block10",s3);
                inbac("block18",s3);
            }
             if(k==2)
            {
                s2="b1,b2,b3";
                inbac("block11",s3);
                inbac("block19",s3);
                
            }
              if(k==3)
            {
                s2="b1,b2,b3,b4";
                inbac("block12",s3);
                inbac("block20",s3);
                
            }
               if(k==4)
            {
                s2="b1,b2,b3,b4";
                inbac("block13",s3);
                inbac("block21",s3);
                
            }
                if(k==5)
            {
                s2="b1,b2,b3,b4,b5";
                inbac("block14",s3);
                inbac("block22",s3);
                
            }
                 if(k==6)
            {
                s2="b1,b2,b3,b4,b5,b6";
                inbac("block15",s3);
                inbac("block23",s3);
                
            }
                  if(k==7)
            {
                s2="b1,b2,b3,b4,b5,b6,b7";
                inbac("block16",s3);
                inbac("block24",s3);
                
            }
                   if(k==8)
                     ta.setText("block error => add block to continue");
                   
            
            
            ps.setString(1,"b2");
            ps.setString(2,ss);
            ps.setString(3,s3);
            
            ps.setString(4,s2);
            ps.setString(5,s2);
            ps.executeUpdate();
            
    ins2("b2",ss,s3,s2);
}
catch(Exception ex)
{
System.out.println(ex);
}
}
     
/////////////////////////////////////ins end     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    /////////////////////////////////////////////////ins2 start
     public void ins2(String j1,String j2,String j3,String j4)
    
    {
try
{
    String host = "localhost";
    String table = "chain3";
    
           String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
           
             PreparedStatement ps;
            String sql;
            
            sql="insert into"+table+" values(?,?,?,?,?)";
            
            ps=conn.prepareStatement(sql);
             
       
            ps.setString(1,j1);
            ps.setString(2,j2);
            ps.setString(3,j3);
            
            ps.setString(4,j4);
            ps.setString(5,j4);
            ps.executeUpdate();
            
    
}
catch(Exception ex)
{
System.out.println(ex);
}
}
     
/////////////////////////////////////ins end     
     
    
     
     
 
    /////////////////////////////////////////////////inbac start
     public void inbac(String table,String cryp)
    
    {
try
{
    String host = "localhost";
   
    
           String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
           
             PreparedStatement ps;
            String sql;
            
            sql="insert into"+table+" values(?)";
            
            ps=conn.prepareStatement(sql);
             
       
            ps.setString(1,cryp);
          
            ps.executeUpdate();
            
    
}
catch(Exception ex)
{
System.out.println(ex);
}
}
     
/////////////////////////////////////inbac end     
     
        
     
     
     
     
     
     
     
     
     
     
     
     
     
     /////////////////////////////////////////blad start
     
    public int blad(String table)
     {
         int ch=0;
        try
    {
        
            String host = "localhost";
         String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
           Class.forName("com.mysql.jdbc.Driver");
           String DB_URL = "jdbc:mysql://"+host+":3306/blockchain?autoReconnect=true";
           Connection conn = DriverManager.getConnection(DB_URL,"root","system");
             Statement stmt=conn.createStatement();
             
    ResultSet rs=stmt.executeQuery("select * from "+table+"");
    while(rs.next())
    {
     
    ch++;
    }
    }
    catch(Exception e)
    {
        System.out.println("error"+e);
    }
        
      
     return ch;
     
     }
     
     
     /////////////////////////////////////////////blad end
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
    
    
    ///////////////////////////////////////send start
    
    
    Socket s;
     public int blockck()
    {
        
        
        int z=0;
        int p=0;
        
                            
    String st = chain("chain2");
     String str = st;
        String[] arrOfStr = str.split(",", 5);
  
        for (String a : arrOfStr)
        {
            System.out.println(a);
            p++;
        }
        String hos="";
         int port =0;
     for(int i=0;i<p;i++)
     {
         if(i==0)
         {
         hos = "localhost";
         port=7000;
         }
         if(i==1)
         {
         hos = "localhost";
         port=7001;
         }
         if(i==2)
         {
         hos = "localhost";
         port=7002;
         }
         if(i==3)
         {
         hos = "localhost";
         port=7003;
         }
         if(i==4)
         {
         hos = "localhost";
         port=7004;
         }
         if(i==5)
         {
         hos = "localhost";
         port=7005;
         }        
         if(i==6)
         {
         hos = "localhost";
         port=7006;
         }
         if(i==7)
         {
         hos = "localhost";
         port=7007;
         }
         
        try
        {
            
   
             s=new Socket(hos,port);
            System.out.println("connect");
       
          
       ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());
          Vector a = new Vector() ;
       a.add(0,"s1");
     
       
       out.writeObject(a);
       
       
       
       
        ObjectInputStream inn=new ObjectInputStream(s.getInputStream());
                        String b =(String) inn.readObject();
                        System.out.println(b);
    
	out.flush();
	out.close();
	s.close();
        
     }
                
        
        
        catch( Exception exe)
        {
            System.out.println(exe+"fbex");
            z=1;
        }
     }
        return z;
    }
     
     
    
    
    
     ///////////////////////////////////////send end
    
    
    
    
    
    
    
    
    
    //////////////////////////////start start
    
     ServerSocket ss;
   
    public void sstart()
    {
       
     
         try{
       
             
             
             
             
      ss =new ServerSocket(6001);
        String data;
         System.out.println("listening");
         
         while(true)
         {
              s=ss.accept();

         
	ObjectInputStream inn=new ObjectInputStream(s.getInputStream());
   Vector   b=(Vector)inn.readObject();
      System.out.println("the received values is"+b);
     String bb=b.get(0).toString();
   
     
     
      ta.append("\n "+bb);
         
         
   
         
     ObjectOutputStream dis=new ObjectOutputStream(s.getOutputStream());
     dis.writeObject("ack");
   
         }
        }
        catch(Exception e)
        {
           System.out.println(e); 
        }
    }
   
    
      //////////////////////////////start end
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(block1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(block1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(block1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(block1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
       
        
         block2 bb=new block2();
           bb.setVisible(true);
        bb.sstart();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
