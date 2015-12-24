package musicjungle.fileHandler.gui;
import java.awt.event.ActionListener;
import musicjungle.data.CodingConstants;

/**
 * FileHandlerView
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerView extends javax.swing.JPanel 
{
    protected FileHandlerView() {
        initComponents();
        
        jButtonBrowse.setActionCommand(CodingConstants.BROWSE_BUTTON_AC);
        jButtonPlay.setActionCommand(CodingConstants.PLAY_MUSIC_BUTTON_AC);
        jButtonAdd.setActionCommand(CodingConstants.ADD_BUTTON_AC);
        jButtonCancel.setActionCommand(CodingConstants.CANCEL_BUTTON_AC);
    }
    
    protected void addButtonListener(ActionListener listener) {
        jButtonBrowse.addActionListener(listener);
        jButtonPlay.addActionListener(listener);
        jButtonAdd.addActionListener(listener);
        jButtonCancel.addActionListener(listener);
    }
    
    protected void setFilepath(String path) {
        jTextFieldFilePathInput.setText(path);
    }
    
    protected String getFilepath() {
        return jTextFieldFilePathInput.getText();
    }
    
    protected void setFileName(String fileName) {
        jTextFieldFileNameInput.setText(fileName);
    }
    
    protected String getFileName() {
        return jTextFieldFileNameInput.getText();
    }
    
    protected void setSongTitle(String title) {
        jTextFieldSongTitleInput.setText(title);
    }
    
    protected String getSongTitle() {
        return jTextFieldSongTitleInput.getText();
    }
    
    protected void setArtist(String artist) {
        jTextFieldArtistInput.setText(artist);
    }
    
    protected String getArtist() {
        return jTextFieldArtistInput.getText();
    }
    
    protected void setAlbum(String album) {
        jTextFieldAlbumInput.setText(album);
    }
    
    protected String getAlbum() {
        return jTextFieldAlbumInput.getText();
    }
    
    protected void setDuration(String duration) {
        jTextFieldDurationInput.setText(duration);
    }
    
    protected String getDuration() {
        return jTextFieldDurationInput.getText();
    }
    
    protected void setBitRate(String bitRate) {
        jTextFieldBitRateInput.setText(bitRate);
    }
    
    protected String getBitRate() {
        return jTextFieldBitRateInput.getText();
    }
    
    protected void playButtonEnable(boolean enabled) {
        jButtonPlay.setEnabled(enabled);
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
        jLabelFileTitle = new javax.swing.JLabel();
        jTextFieldFileNameInput = new javax.swing.JTextField();
        jLabelDurationTitle = new javax.swing.JLabel();
        jTextFieldDurationInput = new javax.swing.JTextField();
        jLabelDurationPostfex = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelBitRateTitle = new javax.swing.JLabel();
        jTextFieldBitRateInput = new javax.swing.JTextField();
        jButtonPlay = new javax.swing.JButton();

        jLabelTitle.setText("Add Song");

        jLabelFilePathTitle.setText("Choose a music file");

        jTextFieldFilePathInput.setEditable(false);

        jButtonBrowse.setText("Browse");

        jLabelSongTitleTitle.setText("Song Title");

        jLabelArtistTitle.setText("Artist");

        jLabelAlbumTitle.setText("Album");

        jLabelFileTitle.setText("File Name");

        jTextFieldFileNameInput.setEditable(false);

        jLabelDurationTitle.setText("Duration");

        jTextFieldDurationInput.setEditable(false);

        jLabelDurationPostfex.setText("s");

        jButtonAdd.setText("Add");

        jButtonCancel.setText("Cancel");

        jLabelBitRateTitle.setText("Bit Rate");

        jTextFieldBitRateInput.setEditable(false);

        jButtonPlay.setText("Play Song");
        jButtonPlay.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSongTitleTitle)
                                    .addComponent(jLabelAlbumTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSongTitleInput)
                                    .addComponent(jTextFieldAlbumInput)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFileTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldFileNameInput))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelArtistTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldArtistInput))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFilePathTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldFilePathInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBrowse))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPlay))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelDurationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDurationInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDurationPostfex))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jButtonCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBitRateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBitRateInput)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabelAlbumTitle, jLabelArtistTitle, jLabelBitRateTitle, jLabelDurationTitle, jLabelFileTitle, jLabelSongTitleTitle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jButtonPlay))
                .addGap(18, 18, 18)
                .addComponent(jLabelFilePathTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilePathInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBrowse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFileTitle)
                    .addComponent(jTextFieldFileNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSongTitleTitle)
                    .addComponent(jTextFieldSongTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArtistTitle)
                    .addComponent(jTextFieldArtistInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlbumTitle)
                    .addComponent(jTextFieldAlbumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDurationTitle)
                    .addComponent(jTextFieldDurationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDurationPostfex))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBitRateTitle)
                    .addComponent(jTextFieldBitRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBrowse;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JLabel jLabelAlbumTitle;
    private javax.swing.JLabel jLabelArtistTitle;
    private javax.swing.JLabel jLabelBitRateTitle;
    private javax.swing.JLabel jLabelDurationPostfex;
    private javax.swing.JLabel jLabelDurationTitle;
    private javax.swing.JLabel jLabelFilePathTitle;
    private javax.swing.JLabel jLabelFileTitle;
    private javax.swing.JLabel jLabelSongTitleTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldAlbumInput;
    private javax.swing.JTextField jTextFieldArtistInput;
    private javax.swing.JTextField jTextFieldBitRateInput;
    private javax.swing.JTextField jTextFieldDurationInput;
    private javax.swing.JTextField jTextFieldFileNameInput;
    private javax.swing.JTextField jTextFieldFilePathInput;
    private javax.swing.JTextField jTextFieldSongTitleInput;
    // End of variables declaration//GEN-END:variables
}