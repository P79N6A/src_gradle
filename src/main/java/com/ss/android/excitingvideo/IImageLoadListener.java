package com.ss.android.excitingvideo;

import android.content.Context;
import android.view.View;

public interface IImageLoadListener {
    View createImageView(Context context, float f2);

    void setRadius(Context context, float f2, float f3, float f4, float f5);

    void setUrl(Context context, String str, int i, int i2, ImageLoadCallback imageLoadCallback);
}
