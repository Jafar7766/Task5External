package com.example.task5_externalstorages;

import android.net.Uri;

public class imageModel {

    private Uri path;

    public Uri getPath() {
        return path;
    }

    public void setPath(Uri path) {
        this.path = path;
    }

    public imageModel(Uri path) {
        this.path = path;
    }

}
