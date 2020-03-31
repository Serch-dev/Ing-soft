package amazon;

import java.io.File;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Store extends javax.swing.JFrame {
    
    Account a     = new Account();
    NewAccount na = new NewAccount();
    
    Item i        = new Item();
    NewItem it    = new  NewItem();
    
    String route = null;
    Item auxStore = new Item();
    int cant = 0;
    
    public Store() {
        
        initComponents();
        initPanel();
        
    }
    
    public void initPanel(){
        
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        
        jLabelSearchAccount.setVisible(false);
        jLabelEditAccount.setVisible(false);
        jLabelDeleteAccount.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelaContrasena = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelSignIn = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNameAccount = new javax.swing.JLabel();
        jTextFieldNameAccount = new javax.swing.JTextField();
        jLabelUsername = new javax.swing.JLabel();
        jTextFieldUsernameAccount = new javax.swing.JTextField();
        jLabelPhoneAccount = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelCreateAccount = new javax.swing.JLabel();
        jLabelCountryAccount = new javax.swing.JLabel();
        jTextFieldCountryAccount = new javax.swing.JTextField();
        jLabelEmailAccount = new javax.swing.JLabel();
        jTextFieldEmailAccount = new javax.swing.JTextField();
        jLabelPasswordAccount = new javax.swing.JLabel();
        jTextFieldPasswordAccount = new javax.swing.JTextField();
        jLabelComfirmPassword = new javax.swing.JLabel();
        jTextFieldComfirmPassword = new javax.swing.JTextField();
        jComboBoxTipeAccount = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabelSearchAccount = new javax.swing.JLabel();
        jLabelEditAccount = new javax.swing.JLabel();
        jLabelDeleteAccount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNameItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDescriptionItem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPriceItem = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabelImageItem = new javax.swing.JLabel();
        jLabelSelectIcon = new javax.swing.JLabel();
        jLabelAddItem = new javax.swing.JLabel();
        jLabelSearchItem = new javax.swing.JLabel();
        jLabelDeleteItem = new javax.swing.JLabel();
        jLabelEditItem = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldNameItemStore = new javax.swing.JTextField();
        jLabelSearchItemStore = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelUserNameStore = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelAddItemStore = new javax.swing.JLabel();
        jTextFieldNItemsStore = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldTotalStore = new javax.swing.JTextField();
        jLabelBuyStore = new javax.swing.JLabel();
        jLabelIconStore = new javax.swing.JLabel();
        jLabelNameItemStore = new javax.swing.JLabel();
        jLabelDescriptionItemStore = new javax.swing.JLabel();
        jLabelPriceItemStore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("www.amazon.com");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanelaContrasena.setBackground(new java.awt.Color(0, 0, 0));
        jPanelaContrasena.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUser.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("User");
        jPanelaContrasena.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 25));

        jLabelPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password");
        jPanelaContrasena.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 80, 30));

        jLabelSignIn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelSignIn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSignIn.setText("Sign In");
        jLabelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignInMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSignInMouseExited(evt);
            }
        });
        jLabelSignIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSignInMouseMoved(evt);
            }
        });
        jPanelaContrasena.add(jLabelSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 160, 30));
        jPanelaContrasena.add(jTextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, -1));

        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Create new account.");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanelaContrasena.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 20));
        jPanelaContrasena.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c41.jpg"))); // NOI18N
        jPanelaContrasena.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 440, 140));

        jTabbedPane1.addTab("Sign in", jPanelaContrasena);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Amazon-Logo-PNG.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        jLabelNameAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelNameAccount.setText("Name");
        jPanel2.add(jLabelNameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanel2.add(jTextFieldNameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 140, -1));

        jLabelUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelUsername.setText("Username");
        jPanel2.add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));
        jPanel2.add(jTextFieldUsernameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, -1));

        jLabelPhoneAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelPhoneAccount.setText("Phone");
        jPanel2.add(jLabelPhoneAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));
        jPanel2.add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 140, -1));

        jLabelCreateAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCreateAccount.setForeground(new java.awt.Color(0, 51, 51));
        jLabelCreateAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCreateAccount.setText("Create a new Amazon account");
        jLabelCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseExited(evt);
            }
        });
        jLabelCreateAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelCreateAccountMouseMoved(evt);
            }
        });
        jPanel2.add(jLabelCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, 30));

        jLabelCountryAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelCountryAccount.setText("Country");
        jPanel2.add(jLabelCountryAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        jPanel2.add(jTextFieldCountryAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, -1));

        jLabelEmailAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEmailAccount.setText("Email");
        jPanel2.add(jLabelEmailAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));
        jPanel2.add(jTextFieldEmailAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, -1));

        jLabelPasswordAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelPasswordAccount.setText("Password");
        jPanel2.add(jLabelPasswordAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));
        jPanel2.add(jTextFieldPasswordAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, -1));

        jLabelComfirmPassword.setText("Confirm Password");
        jPanel2.add(jLabelComfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));
        jPanel2.add(jTextFieldComfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        jComboBoxTipeAccount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Client", "Seller" }));
        jPanel2.add(jComboBoxTipeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Account");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabelSearchAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSearchAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearchAccount.setText("Search");
        jLabelSearchAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchAccountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchAccountMouseExited(evt);
            }
        });
        jLabelSearchAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSearchAccountMouseMoved(evt);
            }
        });
        jPanel2.add(jLabelSearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 50, -1));

        jLabelEditAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditAccount.setText("Edit");
        jLabelEditAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelEditAccountMouseMoved(evt);
            }
        });
        jLabelEditAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditAccountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditAccountMouseExited(evt);
            }
        });
        jPanel2.add(jLabelEditAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 50, -1));

        jLabelDeleteAccount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDeleteAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteAccount.setText("Delete");
        jLabelDeleteAccount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelDeleteAccountMouseMoved(evt);
            }
        });
        jLabelDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteAccountMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDeleteAccountMouseExited(evt);
            }
        });
        jPanel2.add(jLabelDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 50, -1));

        jTabbedPane1.addTab("New account", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Amazon-Logo-PNG.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 30, 10));
        jPanel1.add(jTextFieldIdItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel1.add(jTextFieldNameItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Description");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));
        jPanel1.add(jTextFieldDescriptionItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 130, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Price ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        jPanel1.add(jTextFieldPriceItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 130, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelImageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 130, 120));

        jLabelSelectIcon.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSelectIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSelectIcon.setText("Select Icon");
        jLabelSelectIcon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSelectIconMouseMoved(evt);
            }
        });
        jLabelSelectIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectIconMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSelectIconMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSelectIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 90, -1));

        jLabelAddItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAddItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddItem.setText("Add Item");
        jLabelAddItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelAddItemMouseMoved(evt);
            }
        });
        jLabelAddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddItemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAddItemMouseExited(evt);
            }
        });
        jPanel1.add(jLabelAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 60, 20));

        jLabelSearchItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSearchItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearchItem.setText("Search");
        jLabelSearchItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSearchItemMouseMoved(evt);
            }
        });
        jLabelSearchItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchItemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchItemMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSearchItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 50, 20));

        jLabelDeleteItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelDeleteItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeleteItem.setText("Delete");
        jLabelDeleteItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelDeleteItemMouseMoved(evt);
            }
        });
        jLabelDeleteItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteItemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDeleteItemMouseExited(evt);
            }
        });
        jPanel1.add(jLabelDeleteItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 50, 20));

        jLabelEditItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelEditItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEditItem.setText("Edit");
        jLabelEditItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelEditItemMouseMoved(evt);
            }
        });
        jLabelEditItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEditItemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEditItemMouseExited(evt);
            }
        });
        jPanel1.add(jLabelEditItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 40, 20));

        jTabbedPane1.addTab("New Item", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));

        jLabelSearchItemStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelSearchItemStore.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSearchItemStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearchItemStore.setText("Search");
        jLabelSearchItemStore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelSearchItemStoreMouseMoved(evt);
            }
        });
        jLabelSearchItemStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchItemStoreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchItemStoreMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User:");

        jLabelUserNameStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelUserNameStore.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUserNameStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(jTextFieldNameItemStore, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSearchItemStore, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelSearchItemStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNameItemStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jLabelUserNameStore)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAddItemStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelAddItemStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAddItemStore.setText("Add Item");
        jLabelAddItemStore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelAddItemStoreMouseMoved(evt);
            }
        });
        jLabelAddItemStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAddItemStoreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAddItemStoreMouseExited(evt);
            }
        });
        jPanel8.add(jLabelAddItemStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 78, 22));
        jPanel8.add(jTextFieldNItemsStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 51, 90, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("No. Items");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 54, 17));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Total");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 54, -1));

        jTextFieldTotalStore.setEditable(false);
        jPanel8.add(jTextFieldTotalStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, -1));

        jLabelBuyStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabelBuyStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuyStore.setText("Buy");
        jLabelBuyStore.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelBuyStoreMouseMoved(evt);
            }
        });
        jLabelBuyStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBuyStoreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBuyStoreMouseExited(evt);
            }
        });
        jPanel8.add(jLabelBuyStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 173, 64, 26));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 190, 270));
        jPanel6.add(jLabelIconStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 130));

        jLabelNameItemStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel6.add(jLabelNameItemStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 20));

        jLabelDescriptionItemStore.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel6.add(jLabelDescriptionItemStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 160, 20));
        jPanel6.add(jLabelPriceItemStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, 20));

        jTabbedPane1.addTab("Store", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInMouseExited
        jLabelSignIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelSignInMouseExited

    private void jLabelSignInMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInMouseMoved
        jLabelSignIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelSignInMouseMoved

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabelCreateAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseExited
        jLabelCreateAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelCreateAccountMouseExited

    private void jLabelCreateAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseMoved
        jLabelCreateAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelCreateAccountMouseMoved

    private void jLabelCreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccountMouseClicked
        
        try{
            
            a.setNameAccount(jTextFieldNameAccount.getText());
            a.setUserNameAccount(jTextFieldUsernameAccount.getText());
            a.setPhoneAccount(jTextFieldPhone.getText());
            a.setCountryAccount(jTextFieldCountryAccount.getText());
            a.setEmailAccount(jTextFieldEmailAccount.getText());
            a.setPasswordAccount(jTextFieldPasswordAccount.getText());
            a.setTipeAccount(jComboBoxTipeAccount.getSelectedIndex());
            na.addNewAccount(a);
            JOptionPane.showMessageDialog(this, "Data saved!");
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelCreateAccountMouseClicked

    private void jLabelSearchAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchAccountMouseMoved
        jLabelSearchAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelSearchAccountMouseMoved

    private void jLabelSearchAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchAccountMouseExited
        jLabelSearchAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelSearchAccountMouseExited

    private void jLabelEditAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditAccountMouseExited
        jLabelEditAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelEditAccountMouseExited

    private void jLabelEditAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditAccountMouseMoved
        jLabelEditAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelEditAccountMouseMoved

    private void jLabelDeleteAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteAccountMouseExited
        jLabelDeleteAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelDeleteAccountMouseExited

    private void jLabelDeleteAccountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteAccountMouseMoved
        jLabelDeleteAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelDeleteAccountMouseMoved

    private void jLabelSearchAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchAccountMouseClicked
        
        try{
            
            a.setUserNameAccount(jTextFieldUsernameAccount.getText());
            na.showAccount(a);
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelSearchAccountMouseClicked

    private void jLabelEditAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditAccountMouseClicked
        
        try{
            
            a.setNameAccount(jTextFieldNameAccount.getText());
            a.setUserNameAccount(jTextFieldUsernameAccount.getText());
            a.setPhoneAccount(jTextFieldPhone.getText());
            a.setCountryAccount(jTextFieldCountryAccount.getText());
            a.setEmailAccount(jTextFieldEmailAccount.getText());
            a.setPasswordAccount(jTextFieldPasswordAccount.getText());
            a.setTipeAccount(jComboBoxTipeAccount.getSelectedIndex());
            na.editAccount(a);
            JOptionPane.showMessageDialog(this, "Data saved!");
        }
        
        catch(Exception ex){}
    }//GEN-LAST:event_jLabelEditAccountMouseClicked

    private void jLabelDeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteAccountMouseClicked
        
        try{
            
            a.setUserNameAccount(jTextFieldUsernameAccount.getText());
            na.deleteAccount(a);
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelDeleteAccountMouseClicked

    private void jLabelSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInMouseClicked
        
        try{
            
            a.setUserNameAccount(jTextFieldUser.getText());
            a.setPasswordAccount(jPasswordFieldPassword.getText());
            Account objAux = new Account();
            
            objAux = na.singIn(a);
            
            if(objAux!=null){
                
                if(objAux.getTipeAccount()==0){
                    
                    jTabbedPane1.setEnabledAt(1, true);
                    jTabbedPane1.setEnabledAt(2, true);
                    jTabbedPane1.setEnabledAt(3, true);
                    
                    jLabelSearchAccount.setVisible(true);
                    jLabelEditAccount.setVisible(true);
                    jLabelDeleteAccount.setVisible(true);
                }
                else{
                    
                    jTabbedPane1.setEnabledAt(1, false);
                    jTabbedPane1.setEnabledAt(2, false);
                }
                
                jTabbedPane1.setEnabledAt(0, false);
                jTabbedPane1.setSelectedIndex(3);
                jLabelUserNameStore.setText(objAux.getUserNameAccount());
                JOptionPane.showMessageDialog(this, "Welcome: "+objAux.getNameAccount());
            }
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelSignInMouseClicked

    private void jLabelAddItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemMouseExited
        jLabelAddItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelAddItemMouseExited

    private void jLabelAddItemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemMouseMoved
        jLabelAddItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelAddItemMouseMoved

    private void jLabelSearchItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemMouseExited
        jLabelSearchItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelSearchItemMouseExited

    private void jLabelSearchItemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemMouseMoved
        jLabelSearchItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelSearchItemMouseMoved

    private void jLabelEditItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditItemMouseExited
        jLabelEditItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelEditItemMouseExited

    private void jLabelEditItemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditItemMouseMoved
        jLabelEditItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelEditItemMouseMoved

    private void jLabelDeleteItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteItemMouseExited
        jLabelDeleteItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelDeleteItemMouseExited

    private void jLabelDeleteItemMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteItemMouseMoved
        jLabelDeleteItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelDeleteItemMouseMoved

    private void jLabelSelectIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectIconMouseExited
        jLabelSelectIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelSelectIconMouseExited

    private void jLabelSelectIconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectIconMouseMoved
        jLabelSelectIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelSelectIconMouseMoved

    private void jLabelAddItemStoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemStoreMouseExited
        jLabelAddItemStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelAddItemStoreMouseExited

    private void jLabelAddItemStoreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemStoreMouseMoved
        jLabelAddItemStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelAddItemStoreMouseMoved

    private void jLabelBuyStoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuyStoreMouseExited
        jLabelBuyStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelBuyStoreMouseExited

    private void jLabelBuyStoreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuyStoreMouseMoved
        jLabelBuyStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelBuyStoreMouseMoved

    private void jLabelAddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemMouseClicked
        
        try{
            
            i.setIdItem(Integer.parseInt(jTextFieldIdItem.getText()));
            i.setNameItem(jTextFieldNameItem.getText());
            i.setDescrptionItem(jTextFieldDescriptionItem.getText());
            i.setPriceItem(Integer.parseInt(jTextFieldPriceItem.getText()));
            
            if(route==null){
                
                JFileChooser fc = new JFileChooser();
                fc.setDialogTitle("Load Image");
        
                if(fc.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            
                //File archivo = new File(fc.getSelectedFile().toString());
            
                route = fc.getSelectedFile().toString();
                rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImageItem, route);
                i.setIconItem(route);
                }
                
            }
            else{
                
                it.addNewItem(i);
                JOptionPane.showMessageDialog(this, "Data saved!");
                route = null;  
            }
            
            
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelAddItemMouseClicked

    private void jLabelSearchItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemMouseClicked
        
        try{
            
            i.setIdItem(Integer.parseInt(jTextFieldIdItem.getText()));
            
            Item auxi = new Item();
            auxi = it.showItem(i);
            
            if(auxi!=null){
                rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImageItem, auxi.getIconItem());
            }
            
        }
        
        catch(Exception ex){}
    }//GEN-LAST:event_jLabelSearchItemMouseClicked

    private void jLabelEditItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEditItemMouseClicked
        
        try{
            
            i.setNameItem(jTextFieldNameItem.getText());
            i.setDescrptionItem(jTextFieldDescriptionItem.getText());
            i.setPriceItem(Integer.parseInt(jTextFieldPriceItem.getText()));
            
            it.editItem(i);
            JOptionPane.showMessageDialog(this, "Data saved!");
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelEditItemMouseClicked

    private void jLabelDeleteItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteItemMouseClicked
         
        try{
            
            i.setIdItem(Integer.parseInt(jTextFieldIdItem.getText()));
            it.deleteItem(i);
            JOptionPane.showMessageDialog(this, "Data saved!");
        }
        
        catch(Exception ex){}
    }//GEN-LAST:event_jLabelDeleteItemMouseClicked

    private void jLabelSelectIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectIconMouseClicked
        
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Load Image");
        
        if(fc.showOpenDialog(this)== JFileChooser.APPROVE_OPTION){
            
            //File archivo = new File(fc.getSelectedFile().toString());
            
            route = fc.getSelectedFile().toString();
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabelImageItem, route);
        }
    }//GEN-LAST:event_jLabelSelectIconMouseClicked

    private void jLabelSearchItemStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemStoreMouseClicked
        
        try{
            
            i.setNameItem(jTextFieldNameItemStore.getText());

            auxStore = it.showItemStore(i);
            
            if(auxStore!=null){
                rsscalelabel.RSScaleLabel.setScaleLabel(jLabelIconStore, auxStore.getIconItem());
            }
            
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelSearchItemStoreMouseClicked

    private void jLabelSearchItemStoreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemStoreMouseExited
        jLabelSearchItemStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLabelSearchItemStoreMouseExited

    private void jLabelSearchItemStoreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchItemStoreMouseMoved
        jLabelSearchItemStore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelSearchItemStoreMouseMoved

    private void jLabelAddItemStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAddItemStoreMouseClicked
        
        try{
            
            it.generatePDF(auxStore, Integer.parseInt(jTextFieldNItemsStore.getText()));
            cant = cant + ( auxStore.getPriceItem() * Integer.parseInt(jTextFieldNItemsStore.getText()) );
            jTextFieldTotalStore.setText(Integer.toString(cant));
        }
        
        catch(Exception ex){}
        
    }//GEN-LAST:event_jLabelAddItemStoreMouseClicked

    private void jLabelBuyStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBuyStoreMouseClicked

            
            Properties p = new Properties();
            p.setProperty("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.auth", "true");
            
            Session sesion = Session.getDefaultInstance(p);
            
            String correo = "serch.hgracia@gmail.com";
            String passwordEmail = "GoldenSh12";
            String destinatarioEmail = "serch.hgracia@gmail.com";
            String asunto = "Shop list";
            String message = "Your shop list is avalible now at amazon.org/mi-shop-list";
            
            MimeMessage mail = new MimeMessage(sesion);
            
        try {
            
            mail.setFrom(new InternetAddress(correo));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatarioEmail));
            mail.setSubject(asunto);
            mail.setText(message);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correo, passwordEmail);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(this, "Email send!");
            
        } catch (AddressException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_jLabelBuyStoreMouseClicked

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Store().setVisible(true);
                    
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox jComboBoxTipeAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddItem;
    private javax.swing.JLabel jLabelAddItemStore;
    private javax.swing.JLabel jLabelBuyStore;
    private javax.swing.JLabel jLabelComfirmPassword;
    private javax.swing.JLabel jLabelCountryAccount;
    private javax.swing.JLabel jLabelCreateAccount;
    private javax.swing.JLabel jLabelDeleteAccount;
    private javax.swing.JLabel jLabelDeleteItem;
    public static javax.swing.JLabel jLabelDescriptionItemStore;
    private javax.swing.JLabel jLabelEditAccount;
    private javax.swing.JLabel jLabelEditItem;
    private javax.swing.JLabel jLabelEmailAccount;
    private javax.swing.JLabel jLabelIconStore;
    private javax.swing.JLabel jLabelImageItem;
    private javax.swing.JLabel jLabelNameAccount;
    public static javax.swing.JLabel jLabelNameItemStore;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordAccount;
    private javax.swing.JLabel jLabelPhoneAccount;
    public static javax.swing.JLabel jLabelPriceItemStore;
    private javax.swing.JLabel jLabelSearchAccount;
    private javax.swing.JLabel jLabelSearchItem;
    private javax.swing.JLabel jLabelSearchItemStore;
    private javax.swing.JLabel jLabelSelectIcon;
    private javax.swing.JLabel jLabelSignIn;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUserNameStore;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelaContrasena;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTextField jTextFieldComfirmPassword;
    public static javax.swing.JTextField jTextFieldCountryAccount;
    public static javax.swing.JTextField jTextFieldDescriptionItem;
    public static javax.swing.JTextField jTextFieldEmailAccount;
    public static javax.swing.JTextField jTextFieldIdItem;
    private javax.swing.JTextField jTextFieldNItemsStore;
    public static javax.swing.JTextField jTextFieldNameAccount;
    public static javax.swing.JTextField jTextFieldNameItem;
    private javax.swing.JTextField jTextFieldNameItemStore;
    public static javax.swing.JTextField jTextFieldPasswordAccount;
    public static javax.swing.JTextField jTextFieldPhone;
    public static javax.swing.JTextField jTextFieldPriceItem;
    private javax.swing.JTextField jTextFieldTotalStore;
    private javax.swing.JTextField jTextFieldUser;
    public static javax.swing.JTextField jTextFieldUsernameAccount;
    // End of variables declaration//GEN-END:variables
}
