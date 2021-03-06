

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saurabh0719
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(102, 153, 255));
        botReply("Hello! I'm a task oriented desktop Assistant.");
        botReply("How can I help you today?");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        userText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setText("         Task Oriented Desktop Assistant");
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setFocusable(false);

        chatArea.setBackground(new java.awt.Color(255, 255, 204));
        chatArea.setColumns(20);
        chatArea.setRows(5);
        chatArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chatArea.setFocusable(false);
        jScrollPane1.setViewportView(chatArea);

        userText.setBackground(new java.awt.Color(255, 255, 204));
        userText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Clear Chat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userText))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean containsIgnoreCase(String src, String what) {
    final int length = what.length();
    if (length == 0)
        return true; // Empty string is contained

    final char firstLo = Character.toLowerCase(what.charAt(0));
    final char firstUp = Character.toUpperCase(what.charAt(0));

    for (int i = src.length() - length; i >= 0; i--) {
        // Quick check before calling the more expensive regionMatches() method:
        final char ch = src.charAt(i);
        if (ch != firstLo && ch != firstUp)
            continue;

        if (src.regionMatches(true, i, what, 0, length))
            return true;
    }

    return false;
}
    public void botReply(String str){
        chatArea.append("BOT: "+str+"\n");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String str = userText.getText().toLowerCase();
chatArea.append("USER: "+str+"\n");
userText.setText("");
if(containsIgnoreCase(str,"Hi") || containsIgnoreCase(str,"hello") || containsIgnoreCase(str,"hey")) { 
    botReply("Hello! How can I help you?");
}

else if(containsIgnoreCase(str,"wass")){
    botReply("hello wasup");
}

//Opens chrome browser
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"browser") || containsIgnoreCase(str,"google") || containsIgnoreCase(str,"chrome"))){
    try {
        botReply("Chrome browser will open on an external window!");
        Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

//Opens notepad++
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"notepad++"))){
    try {
        botReply("I shall open notepad++");
        Process p = Runtime.getRuntime().exec("C:/Program Files (x86)/Notepad++/notepad++.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

//Opens notepad
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"notepad"))){
    try {
        botReply("I shall open notepad");
        Process p = Runtime.getRuntime().exec("notepad"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
        /*testing to open and run files and apps */

/* else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"run"))){
    try {
        botReply("I shall open notepad");
        Process p = Runtime.getRuntime().exec("C:/Users/Lenovo/AppData/Roaming/Microsoft/Windows/Start Menu/Programs/System Tools/run.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    } */ 
        
//Opens Command prompt
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"command prompt") || containsIgnoreCase(str," cmd"))){
    try {
        botReply("I shall open the command prompt");
        Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }


//Opens calculator
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"calculator"))){
    try {
        botReply("I shall open the calculator");
        Process p = Runtime.getRuntime().exec("calc"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

//opens gmail
else if(containsIgnoreCase(str,"Open") && containsIgnoreCase(str,"mail")){
    botReply("Gmail will open in the browser!");
        Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI("http://gmail.com"));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//opens facebook
else if(containsIgnoreCase(str,"Open") && containsIgnoreCase(str,"facebook")){
    botReply("Facebook will open in the browser!");
        Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI("http://facebook.com"));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//opens youtube
else if(containsIgnoreCase(str,"Open") && containsIgnoreCase(str,"youtube")){
    botReply("Youtube will open in the browser!");
        Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI("http://youtube.com"));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        //Opens netbeans IDE
else if(containsIgnoreCase(str,"Open") && containsIgnoreCase(str,"netbeans")){
    try {
        botReply("I shall open Netbeans IDE!");
        Process p = Runtime.getRuntime().exec("C:/Program Files/NetBeans 8.2/bin/netbeans64.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

        //Runs the virtual machine
else if(containsIgnoreCase(str,"Open") && (containsIgnoreCase(str,"ubuntu") || containsIgnoreCase(str,"Virtual box") || containsIgnoreCase(str,"linux"))){
    try {
        botReply("I shall open the Virtual Machine on this PC!");
        Process p = Runtime.getRuntime().exec("C:/Program Files/Oracle/VirtualBox/VirtualBox.exe"); 
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//shows date and time
else if(containsIgnoreCase(str,"what is the date?") || containsIgnoreCase(str,"what is the time?") || containsIgnoreCase(str,"tell me the time") || containsIgnoreCase(str,"tell me the date")){
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'Time: ' hh:mm:ss a zzz");

      botReply("Current Date: " + ft.format(dNow));
}

//opens a specific website. "open xyz website"
else if(containsIgnoreCase(str,"open") && containsIgnoreCase(str, "website")){
    String[] sp = str.split(" ");
    botReply(""+sp[1]+" will be opened in the browser!");
    Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI("http://"+sp[1]+".com"));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//performs google search. "search xyz abc on google" SAFE SEARCH
else if(containsIgnoreCase(str,"Search") && containsIgnoreCase(str, "on google")){
botReply("Okay");
String first_str = "http://www.google.com/search?h1=en&q=";
String last_str = "&btnG=Google+Search";
String[] sp = str.split(" ");
int count = sp.length;
count -=3;
String temp = "";
int i;
for(i=1; i<=count; i++){
    temp = temp+sp[i];
    if(i!=count){
        temp = temp + "+";
    }
}
String main_str = first_str + temp + last_str;
Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI(""+main_str));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }

}

//performs youtube search.
else if(containsIgnoreCase(str,"play") && containsIgnoreCase(str, "on youtube")){
botReply("Okay");
String first_str = "https://www.youtube.com/results?search_query=";
String[] sp = str.split(" ");
int count = sp.length;
count -=3;
String temp = "";
int i;
for(i=1; i<=count; i++){
    temp = temp+sp[i];
    if(i!=count){
        temp = temp + "+";
    }
}
String main_str = first_str + temp;
Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI(""+main_str));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }

}

//standard google search for question tags
else if(containsIgnoreCase(str,"why") || containsIgnoreCase(str,"where") || containsIgnoreCase(str,"what") || containsIgnoreCase(str,"when") || containsIgnoreCase(str,"how") || containsIgnoreCase(str,"?") || containsIgnoreCase(str,"score")){
botReply("I shall open up a google search for your query.");
String first_str = "http://www.google.com/search?h1=en&q=";
String last_str = "&btnG=Google+Search";
String[] sp = str.split(" ");
int count = sp.length;
String temp = "";
int i;
for(i=0; i<count; i++){
    temp = temp+sp[i];
    if(i!=(count-1)){
        temp = temp + "+";
    }
}
String main_str = first_str + temp + last_str;
Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI(""+main_str));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//shows date and time
else if(containsIgnoreCase(str,"date") || containsIgnoreCase(str,"time")){
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'Time: ' hh:mm:ss a zzz");

      botReply("Current Date: " + ft.format(dNow));
}


//opens a specific website. "open github.com"
else if(containsIgnoreCase(str,"open") && containsIgnoreCase(str, ".com")){
    String[] sp = str.split(" ");
    String s = sp[1].substring(0, sp[1].length() - 4);
    botReply(""+s+" will be opened in the browser!");
    Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI("http://"+s+".com"));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//defult reply
        //performs google search for unknown query
else{
botReply("Sorry, I don't understand.");
if( !"".equals(str)){
    botReply("I shall open up a google search for your query.");
    String first_str = "http://www.google.com/search?h1=en&q=";
    String last_str = "&btnG=Google+Search";
    String[] sp = str.split(" ");
    int count = sp.length;
    String temp = "";
    int i;
    for(i=0; i<count; i++){
        temp = temp+sp[i];
        if(i!=(count-1)){
            temp = temp + "+";
        }
    }
    String main_str = first_str + temp + last_str;
    Desktop d = Desktop.getDesktop();
    try {
        d.browse(new URI(""+main_str));
    } catch (URISyntaxException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
chatArea.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea chatArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
