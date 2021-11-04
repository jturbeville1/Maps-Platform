package com.example.maps_platform_v1;

import android.graphics.Bitmap;

public class Photo {
    private int pinId;
    private int contributorId;
    private Bitmap photo;

    public Photo(int pinId, int contributorId, Bitmap photo) {
        this.pinId = pinId;
        this.contributorId = contributorId;
        this.photo = photo;
    }

    public int getPinId() {
        return pinId;
    }

    public void setPinId(int pinId) {
        this.pinId = pinId;
    }

    public int getContributorId() {
        return contributorId;
    }

    public void setContributorId(int contributorId) {
        this.contributorId = contributorId;
    }

    public Bitmap getPhoto() {
        return photo;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }
}
