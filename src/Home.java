
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new RoundedPanel(100,Color.GREEN);
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(100,new Color(251, 54, 64));
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new RoundedPanel(100,Color.YELLOW);
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(95, 95, 94));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(95, 95, 94,80));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DS\\images\\4.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("       Shortest Path");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("   Ek Bar azmaish Bar Bar Farmaish");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 250, 440));

        jPanel4.setBackground(new java.awt.Color(95,95,94,80));
        jPanel4.setForeground(new java.awt.Color(251, 54, 64));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DS\\images\\5.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("           Hotels");

        jLabel7.setText("Trust Us --->");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 440));

        jPanel5.setBackground(new java.awt.Color(95,95,94,80));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DS\\images\\3.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Transport Medium");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("   Ek Bar azmaish Bar Bar Farmaish");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 250, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(251,54,64));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:
        jPanel4.setBackground(new Color(230,50,60));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(252, 191, 73));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
        jPanel5.setBackground(new Color(255,200,80));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
                jPanel3.setBackground(new Color(91,140,90));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
                jPanel3.setBackground(new Color(95,145,95));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Hotel rf = new Hotel();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        ShortestPath rf = new ShortestPath();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jPanel3MouseClicked


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

//public class RoundedPanelExample extends JFrame
//{
//    public RoundedPanelExample()
//    {
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("Rounded Panel Example");
//        setResizable(true);
//        setDefaultLookAndFeelDecorated(true);
//        setSize(500, 500);
//
//        Container pane = getContentPane();
//        pane.setLayout(null);
//        pane.setBackground(Color.LIGHT_GRAY);
//
//        JPanel p1 = new RoundedPanel(10, Color.CYAN);
//        p1.setBounds(10,10,100,60);
//        p1.setOpaque(false);
//        pane.add(p1);
//
//        JPanel p2 = new RoundedPanel(15, Color.RED);
//        p2.setBounds(150,10,50,50);
//        p2.setOpaque(false);
//        pane.add(p2);
//
//        JPanel p3 = new RoundedPanel(30);
//        p3.setBounds(230,10,100,150);
//        p3.setOpaque(false);
//        pane.add(p3);
//
//        JPanel p4 = new RoundedPanel(20);
//        p4.setBounds(10,200,100,100);
//        p4.setBackground(Color.GREEN);
//        p4.setOpaque(false);
//        pane.add(p4);
//
//        JPanel p5 = new RoundedPanel(200);
//        p5.setBounds(150,200,200,200);
//        p5.setBackground(Color.BLUE);
//        p5.setOpaque(false);
//        pane.add(p5);
//    }

class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
           // Color bgColor = getColorNameFromRgb(r,g,b);
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }       
}
}
//class ColorUtils{
//
//    /**
//     * Initialize the color list that we have.
//     */
//    private ArrayList<ColorName> initColorList() {
//        ArrayList<ColorName> colorList = new ArrayList<ColorName>();
//        colorList.add(new ColorName("AliceBlue", 0xF0, 0xF8, 0xFF));
//        colorList.add(new ColorName("AntiqueWhite", 0xFA, 0xEB, 0xD7));
//        colorList.add(new ColorName("Aqua", 0x00, 0xFF, 0xFF));
//        colorList.add(new ColorName("Aquamarine", 0x7F, 0xFF, 0xD4));
//        colorList.add(new ColorName("Azure", 0xF0, 0xFF, 0xFF));
//        colorList.add(new ColorName("Beige", 0xF5, 0xF5, 0xDC));
//        colorList.add(new ColorName("Bisque", 0xFF, 0xE4, 0xC4));
//        colorList.add(new ColorName("Black", 0x00, 0x00, 0x00));
//        colorList.add(new ColorName("BlanchedAlmond", 0xFF, 0xEB, 0xCD));
//        colorList.add(new ColorName("Blue", 0x00, 0x00, 0xFF));
//        colorList.add(new ColorName("BlueViolet", 0x8A, 0x2B, 0xE2));
//        colorList.add(new ColorName("Brown", 0xA5, 0x2A, 0x2A));
//        colorList.add(new ColorName("BurlyWood", 0xDE, 0xB8, 0x87));
//        colorList.add(new ColorName("CadetBlue", 0x5F, 0x9E, 0xA0));
//        colorList.add(new ColorName("Chartreuse", 0x7F, 0xFF, 0x00));
//        colorList.add(new ColorName("Chocolate", 0xD2, 0x69, 0x1E));
//        colorList.add(new ColorName("Coral", 0xFF, 0x7F, 0x50));
//        colorList.add(new ColorName("CornflowerBlue", 0x64, 0x95, 0xED));
//        colorList.add(new ColorName("Cornsilk", 0xFF, 0xF8, 0xDC));
//        colorList.add(new ColorName("Crimson", 0xDC, 0x14, 0x3C));
//        colorList.add(new ColorName("Cyan", 0x00, 0xFF, 0xFF));
//        colorList.add(new ColorName("DarkBlue", 0x00, 0x00, 0x8B));
//        colorList.add(new ColorName("DarkCyan", 0x00, 0x8B, 0x8B));
//        colorList.add(new ColorName("DarkGoldenRod", 0xB8, 0x86, 0x0B));
//        colorList.add(new ColorName("DarkGray", 0xA9, 0xA9, 0xA9));
//        colorList.add(new ColorName("DarkGreen", 0x00, 0x64, 0x00));
//        colorList.add(new ColorName("DarkKhaki", 0xBD, 0xB7, 0x6B));
//        colorList.add(new ColorName("DarkMagenta", 0x8B, 0x00, 0x8B));
//        colorList.add(new ColorName("DarkOliveGreen", 0x55, 0x6B, 0x2F));
//        colorList.add(new ColorName("DarkOrange", 0xFF, 0x8C, 0x00));
//        colorList.add(new ColorName("DarkOrchid", 0x99, 0x32, 0xCC));
//        colorList.add(new ColorName("DarkRed", 0x8B, 0x00, 0x00));
//        colorList.add(new ColorName("DarkSalmon", 0xE9, 0x96, 0x7A));
//        colorList.add(new ColorName("DarkSeaGreen", 0x8F, 0xBC, 0x8F));
//        colorList.add(new ColorName("DarkSlateBlue", 0x48, 0x3D, 0x8B));
//        colorList.add(new ColorName("DarkSlateGray", 0x2F, 0x4F, 0x4F));
//        colorList.add(new ColorName("DarkTurquoise", 0x00, 0xCE, 0xD1));
//        colorList.add(new ColorName("DarkViolet", 0x94, 0x00, 0xD3));
//        colorList.add(new ColorName("DeepPink", 0xFF, 0x14, 0x93));
//        colorList.add(new ColorName("DeepSkyBlue", 0x00, 0xBF, 0xFF));
//        colorList.add(new ColorName("DimGray", 0x69, 0x69, 0x69));
//        colorList.add(new ColorName("DodgerBlue", 0x1E, 0x90, 0xFF));
//        colorList.add(new ColorName("FireBrick", 0xB2, 0x22, 0x22));
//        colorList.add(new ColorName("FloralWhite", 0xFF, 0xFA, 0xF0));
//        colorList.add(new ColorName("ForestGreen", 0x22, 0x8B, 0x22));
//        colorList.add(new ColorName("Fuchsia", 0xFF, 0x00, 0xFF));
//        colorList.add(new ColorName("Gainsboro", 0xDC, 0xDC, 0xDC));
//        colorList.add(new ColorName("GhostWhite", 0xF8, 0xF8, 0xFF));
//        colorList.add(new ColorName("Gold", 0xFF, 0xD7, 0x00));
//        colorList.add(new ColorName("GoldenRod", 0xDA, 0xA5, 0x20));
//        colorList.add(new ColorName("Gray", 0x80, 0x80, 0x80));
//        colorList.add(new ColorName("Green", 0x00, 0x80, 0x00));
//        colorList.add(new ColorName("GreenYellow", 0xAD, 0xFF, 0x2F));
//        colorList.add(new ColorName("HoneyDew", 0xF0, 0xFF, 0xF0));
//        colorList.add(new ColorName("HotPink", 0xFF, 0x69, 0xB4));
//        colorList.add(new ColorName("IndianRed", 0xCD, 0x5C, 0x5C));
//        colorList.add(new ColorName("Indigo", 0x4B, 0x00, 0x82));
//        colorList.add(new ColorName("Ivory", 0xFF, 0xFF, 0xF0));
//        colorList.add(new ColorName("Khaki", 0xF0, 0xE6, 0x8C));
//        colorList.add(new ColorName("Lavender", 0xE6, 0xE6, 0xFA));
//        colorList.add(new ColorName("LavenderBlush", 0xFF, 0xF0, 0xF5));
//        colorList.add(new ColorName("LawnGreen", 0x7C, 0xFC, 0x00));
//        colorList.add(new ColorName("LemonChiffon", 0xFF, 0xFA, 0xCD));
//        colorList.add(new ColorName("LightBlue", 0xAD, 0xD8, 0xE6));
//        colorList.add(new ColorName("LightCoral", 0xF0, 0x80, 0x80));
//        colorList.add(new ColorName("LightCyan", 0xE0, 0xFF, 0xFF));
//        colorList.add(new ColorName("LightGoldenRodYellow", 0xFA, 0xFA, 0xD2));
//        colorList.add(new ColorName("LightGray", 0xD3, 0xD3, 0xD3));
//        colorList.add(new ColorName("LightGreen", 0x90, 0xEE, 0x90));
//        colorList.add(new ColorName("LightPink", 0xFF, 0xB6, 0xC1));
//        colorList.add(new ColorName("LightSalmon", 0xFF, 0xA0, 0x7A));
//        colorList.add(new ColorName("LightSeaGreen", 0x20, 0xB2, 0xAA));
//        colorList.add(new ColorName("LightSkyBlue", 0x87, 0xCE, 0xFA));
//        colorList.add(new ColorName("LightSlateGray", 0x77, 0x88, 0x99));
//        colorList.add(new ColorName("LightSteelBlue", 0xB0, 0xC4, 0xDE));
//        colorList.add(new ColorName("LightYellow", 0xFF, 0xFF, 0xE0));
//        colorList.add(new ColorName("Lime", 0x00, 0xFF, 0x00));
//        colorList.add(new ColorName("LimeGreen", 0x32, 0xCD, 0x32));
//        colorList.add(new ColorName("Linen", 0xFA, 0xF0, 0xE6));
//        colorList.add(new ColorName("Magenta", 0xFF, 0x00, 0xFF));
//        colorList.add(new ColorName("Maroon", 0x80, 0x00, 0x00));
//        colorList.add(new ColorName("MediumAquaMarine", 0x66, 0xCD, 0xAA));
//        colorList.add(new ColorName("MediumBlue", 0x00, 0x00, 0xCD));
//        colorList.add(new ColorName("MediumOrchid", 0xBA, 0x55, 0xD3));
//        colorList.add(new ColorName("MediumPurple", 0x93, 0x70, 0xDB));
//        colorList.add(new ColorName("MediumSeaGreen", 0x3C, 0xB3, 0x71));
//        colorList.add(new ColorName("MediumSlateBlue", 0x7B, 0x68, 0xEE));
//        colorList.add(new ColorName("MediumSpringGreen", 0x00, 0xFA, 0x9A));
//        colorList.add(new ColorName("MediumTurquoise", 0x48, 0xD1, 0xCC));
//        colorList.add(new ColorName("MediumVioletRed", 0xC7, 0x15, 0x85));
//        colorList.add(new ColorName("MidnightBlue", 0x19, 0x19, 0x70));
//        colorList.add(new ColorName("MintCream", 0xF5, 0xFF, 0xFA));
//        colorList.add(new ColorName("MistyRose", 0xFF, 0xE4, 0xE1));
//        colorList.add(new ColorName("Moccasin", 0xFF, 0xE4, 0xB5));
//        colorList.add(new ColorName("NavajoWhite", 0xFF, 0xDE, 0xAD));
//        colorList.add(new ColorName("Navy", 0x00, 0x00, 0x80));
//        colorList.add(new ColorName("OldLace", 0xFD, 0xF5, 0xE6));
//        colorList.add(new ColorName("Olive", 0x80, 0x80, 0x00));
//        colorList.add(new ColorName("OliveDrab", 0x6B, 0x8E, 0x23));
//        colorList.add(new ColorName("Orange", 0xFF, 0xA5, 0x00));
//        colorList.add(new ColorName("OrangeRed", 0xFF, 0x45, 0x00));
//        colorList.add(new ColorName("Orchid", 0xDA, 0x70, 0xD6));
//        colorList.add(new ColorName("PaleGoldenRod", 0xEE, 0xE8, 0xAA));
//        colorList.add(new ColorName("PaleGreen", 0x98, 0xFB, 0x98));
//        colorList.add(new ColorName("PaleTurquoise", 0xAF, 0xEE, 0xEE));
//        colorList.add(new ColorName("PaleVioletRed", 0xDB, 0x70, 0x93));
//        colorList.add(new ColorName("PapayaWhip", 0xFF, 0xEF, 0xD5));
//        colorList.add(new ColorName("PeachPuff", 0xFF, 0xDA, 0xB9));
//        colorList.add(new ColorName("Peru", 0xCD, 0x85, 0x3F));
//        colorList.add(new ColorName("Pink", 0xFF, 0xC0, 0xCB));
//        colorList.add(new ColorName("Plum", 0xDD, 0xA0, 0xDD));
//        colorList.add(new ColorName("PowderBlue", 0xB0, 0xE0, 0xE6));
//        colorList.add(new ColorName("Purple", 0x80, 0x00, 0x80));
//        colorList.add(new ColorName("Red", 0xFF, 0x00, 0x00));
//        colorList.add(new ColorName("RosyBrown", 0xBC, 0x8F, 0x8F));
//        colorList.add(new ColorName("RoyalBlue", 0x41, 0x69, 0xE1));
//        colorList.add(new ColorName("SaddleBrown", 0x8B, 0x45, 0x13));
//        colorList.add(new ColorName("Salmon", 0xFA, 0x80, 0x72));
//        colorList.add(new ColorName("SandyBrown", 0xF4, 0xA4, 0x60));
//        colorList.add(new ColorName("SeaGreen", 0x2E, 0x8B, 0x57));
//        colorList.add(new ColorName("SeaShell", 0xFF, 0xF5, 0xEE));
//        colorList.add(new ColorName("Sienna", 0xA0, 0x52, 0x2D));
//        colorList.add(new ColorName("Silver", 0xC0, 0xC0, 0xC0));
//        colorList.add(new ColorName("SkyBlue", 0x87, 0xCE, 0xEB));
//        colorList.add(new ColorName("SlateBlue", 0x6A, 0x5A, 0xCD));
//        colorList.add(new ColorName("SlateGray", 0x70, 0x80, 0x90));
//        colorList.add(new ColorName("Snow", 0xFF, 0xFA, 0xFA));
//        colorList.add(new ColorName("SpringGreen", 0x00, 0xFF, 0x7F));
//        colorList.add(new ColorName("SteelBlue", 0x46, 0x82, 0xB4));
//        colorList.add(new ColorName("Tan", 0xD2, 0xB4, 0x8C));
//        colorList.add(new ColorName("Teal", 0x00, 0x80, 0x80));
//        colorList.add(new ColorName("Thistle", 0xD8, 0xBF, 0xD8));
//        colorList.add(new ColorName("Tomato", 0xFF, 0x63, 0x47));
//        colorList.add(new ColorName("Turquoise", 0x40, 0xE0, 0xD0));
//        colorList.add(new ColorName("Violet", 0xEE, 0x82, 0xEE));
//        colorList.add(new ColorName("Wheat", 0xF5, 0xDE, 0xB3));
//        colorList.add(new ColorName("White", 0xFF, 0xFF, 0xFF));
//        colorList.add(new ColorName("WhiteSmoke", 0xF5, 0xF5, 0xF5));
//        colorList.add(new ColorName("Yellow", 0xFF, 0xFF, 0x00));
//        colorList.add(new ColorName("YellowGreen", 0x9A, 0xCD, 0x32));
//        return colorList;
//    }
//
//    /**
//     * Get the closest color name from our list
//     * 
//     * @param r
//     * @param g
//     * @param b
//     * @return
//     */
//    public String getColorNameFromRgb(int r, int g, int b) {
//        ArrayList<ColorName> colorList = initColorList();
//        ColorName closestMatch = null;
//        int minMSE = Integer.MAX_VALUE;
//        int mse;
//        for (ColorName c : colorList) {
//            mse = c.computeMSE(r, g, b);
//            if (mse < minMSE) {
//                minMSE = mse;
//                closestMatch = c;
//            }
//        }
//
//        if (closestMatch != null) {
//            return closestMatch.getName();
//        } else {
//            return "No matched color name.";
//        }
//    }
//
//    /**
//     * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
//     * 
//     * @param hexColor
//     * @return
//     */
//    public String getColorNameFromHex(int hexColor) {
//        int r = (hexColor & 0xFF0000) >> 16;
//        int g = (hexColor & 0xFF00) >> 8;
//        int b = (hexColor & 0xFF);
//        return getColorNameFromRgb(r, g, b);
//    }
//
//    public int colorToHex(Color c) {
//        return Integer.decode("0x"
//                + Integer.toHexString(c.getRGB()).substring(2));
//    }
//
//    public String getColorNameFromColor(Color color) {
//        return getColorNameFromRgb(color.getRed(), color.getGreen(),
//                color.getBlue());
//    }
//
//    /**
//     * SubClass of ColorUtils. In order to lookup color name
//     * 
//     * @author Xiaoxiao Li
//     * 
//     */
//    public class ColorName {
//        public int r, g, b;
//        public String name;
//
//        public ColorName(String name, int r, int g, int b) {
//            this.r = r;
//            this.g = g;
//            this.b = b;
//            this.name = name;
//        }
//
//        public int computeMSE(int pixR, int pixG, int pixB) {
//            return (int) (((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
//                    * (pixB - b)) / 3);
//        }
//
//        public int getR() {
//            return r;
//        }
//
//        public int getG() {
//            return g;
//        }
//
//        public int getB() {
//            return b;
//        }
//
//        public String getName() {
//            return name;
//        }
//    }
//}



