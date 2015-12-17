package musicjungle.gui.game;
import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 * GameView
 * @author SteamedCow
 * @version 17-12-2015
 */
public class GameView extends javax.swing.JPanel 
{
    protected GameView() {
        initComponents();
    }
    
    protected void addButton(JButton button) {
        jPanelVPButtons.add(button);
    }
    
    protected JProgressBar getTimer() {
        return jProgressBarTimer;
    }
    
    protected void setRound(int round) {
        jLabelRound.setText("" + round);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelRoundTitle = new javax.swing.JLabel();
        jLabelRound = new javax.swing.JLabel();
        jLabelScoreTitle = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jPanelVPWindow = new javax.swing.JPanel();
        jProgressBarTimer = new javax.swing.JProgressBar();
        jPanelVPButtons = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();

        jLabelTitle.setText("Title");

        jLabelRoundTitle.setText("Round");

        jLabelRound.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelScoreTitle.setText("Score");

        jLabelScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jProgressBarTimer.setMaximum(1000);
        jProgressBarTimer.setValue(1000);

        javax.swing.GroupLayout jPanelVPWindowLayout = new javax.swing.GroupLayout(jPanelVPWindow);
        jPanelVPWindow.setLayout(jPanelVPWindowLayout);
        jPanelVPWindowLayout.setHorizontalGroup(
            jPanelVPWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBarTimer, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        jPanelVPWindowLayout.setVerticalGroup(
            jPanelVPWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVPWindowLayout.createSequentialGroup()
                .addComponent(jProgressBarTimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        jPanelVPButtons.setLayout(new java.awt.GridLayout(0, 1));

        jButtonExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRoundTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRound)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelScoreTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelScore))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExit))
                    .addComponent(jPanelVPButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVPWindow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelScore)
                    .addComponent(jLabelScoreTitle)
                    .addComponent(jLabelRound)
                    .addComponent(jLabelRoundTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVPWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVPButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelRound;
    private javax.swing.JLabel jLabelRoundTitle;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelScoreTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelVPButtons;
    private javax.swing.JPanel jPanelVPWindow;
    private javax.swing.JProgressBar jProgressBarTimer;
    // End of variables declaration//GEN-END:variables
}