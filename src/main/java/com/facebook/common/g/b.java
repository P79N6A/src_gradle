package com.facebook.common.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

public interface b {

    public interface a {
        void onWebpErrorLog(String str, String str2);
    }

    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);

    void setBitmapCreator(a aVar);

    void setWebpErrorLogger(a aVar);
}
