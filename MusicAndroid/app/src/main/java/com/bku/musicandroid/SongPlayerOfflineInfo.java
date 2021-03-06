package com.bku.musicandroid;

import android.media.MediaMetadataRetriever;
import android.provider.MediaStore;

import com.bku.musicandroid.SongPlayerInfo;

import java.io.File;

public class SongPlayerOfflineInfo extends SongPlayerInfo {
    private File fileSong;

    public SongPlayerOfflineInfo() {
    }

    public SongPlayerOfflineInfo(File fileSong) {
        this.fileSong = fileSong;

        MediaMetadataRetriever m = new MediaMetadataRetriever();
        m.setDataSource(fileSong.getAbsolutePath());
        String songName = m.extractMetadata(MediaMetadataRetriever.METADATA_KEY_TITLE);
        String songArtist = m.extractMetadata(MediaMetadataRetriever.METADATA_KEY_ARTIST);
        if (songName == null){
            songName = fileSong.getName();
        }
        if (songArtist == null){
            songArtist = "Unknown";
        }
        this.setSongName(songName);
        this.setSongArtists(songArtist);
    }

    public File getFileSong() {
        return fileSong;
    }

    public void setFileSong(File fileSong) {
        this.fileSong = fileSong;
    }
}
