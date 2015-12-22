package musicjungle.fileHandler.gui;

import java.awt.event.ActionListener;

/**
 * FileHandlerView
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerView extends javax.swing.JPanel 
{
    public FileHandlerView() {
        initComponents();
    }
    
    protected void addBrowserListener(ActionListener listener) {
        jButtonBrowse.addActionListener(listener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelFilePathTitle = new javax.swing.JLabel();
        jTextFieldFilePathInput = new javax.swing.JTextField();
        jButtonBrowse = new javax.swing.JButton();
        jLabelSongTitleTitle = new javax.swing.JLabel();
        jTextFieldSongTitleInput = new javax.swing.JTextField();
        jLabelArtistTitle = new javax.swing.JLabel();
        jTextFieldArtistInput = new javax.swing.JTextField();
        jLabelAlbumTitle = new javax.swing.JLabel();
        jTextFieldAlbumInput = new javax.swing.JTextField();

        jLabelTitle.setText("Add Song");

        jLabelFilePathTitle.setText("Choose a music file");

        jTextFieldFilePathInput.setEditable(false);

        jButtonBrowse.setText("Browse");

        jLabelSongTitleTitle.setText("Title");

        jTextFieldSongTitleInput.setEnabled(false);

        jLabelArtistTitle.setText("Artist");

        jTextFieldArtistInput.setEnabled(false);

        jLabelAlbumTitle.setText("Album");

        jTextFieldAlbumInput.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldFilePathInput)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBrowse))
                                    .addComponent(jTextFieldSongTitleInput)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitle)
                                    .addComponent(jLabelFilePathTitle)
                                    .addComponent(jLabelSongTitleTitle)
                                    .addComponent(jLabelArtistTitle))
                                .addGap(0, 289, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldArtistInput))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldAlbumInput))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAlbumTitle)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBrowse)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFilePathTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFilePathInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabelSongTitleTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSongTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelArtistTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldArtistInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAlbumTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAlbumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JLabel jLabelAlbumTitle;
    private javax.swing.JLabel jLabelArtistTitle;
    private javax.swing.JLabel jLabelFilePathTitle;
    private javax.swing.JLabel jLabelSongTitleTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldAlbumInput;
    private javax.swing.JTextField jTextFieldArtistInput;
    private javax.swing.JTextField jTextFieldFilePathInput;
    private javax.swing.JTextField jTextFieldSongTitleInput;
    // End of variables declaration//GEN-END:variables
}