package com.example.android.miwok;

/**
 * Created by alin- on 10.06.2017.
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = -1;
    private int audioResourceId;

    public Word(String miwokTranslation, String defaultTranslation,int audioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId,int audioResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public int getAudioResourceId(){return audioResourceId;}
}
