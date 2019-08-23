package com.tt.essential;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.view.View;
import java.io.File;

public class LoaderOptions {
    public float bitmapAngle;
    public BitmapLoadCallback bitmapLoadCallBack;
    public Bitmap.Config config = Bitmap.Config.RGB_565;
    public int drawableResId;
    public int errorResId;
    public File file;
    public boolean isCenterCrop;
    public boolean isCenterInside;
    public boolean isFitXY;
    public Drawable placeholder;
    public int placeholderResId;
    public boolean skipDiskCache;
    public boolean skipMemoryCache;
    public int targetHeight;
    public View targetView;
    public int targetWidth;
    public Uri uri;
    public String url;

    public LoaderOptions centerCrop() {
        this.isCenterCrop = true;
        return this;
    }

    public LoaderOptions centerInside() {
        this.isCenterInside = true;
        return this;
    }

    public LoaderOptions fitXY() {
        this.isFitXY = true;
        return this;
    }

    public LoaderOptions angle(float f2) {
        this.bitmapAngle = f2;
        return this;
    }

    public LoaderOptions bitmapLoadCallback(BitmapLoadCallback bitmapLoadCallback) {
        this.bitmapLoadCallBack = bitmapLoadCallback;
        return this;
    }

    public LoaderOptions config(Bitmap.Config config2) {
        this.config = config2;
        return this;
    }

    public LoaderOptions error(@DrawableRes int i) {
        this.errorResId = i;
        return this;
    }

    public LoaderOptions into(View view) {
        this.targetView = view;
        return this;
    }

    public LoaderOptions placeholder(@DrawableRes int i) {
        this.placeholderResId = i;
        return this;
    }

    public LoaderOptions skipDiskCache(boolean z) {
        this.skipDiskCache = z;
        return this;
    }

    public LoaderOptions skipMemoryCache(boolean z) {
        this.skipMemoryCache = z;
        return this;
    }

    public LoaderOptions placeholder(Drawable drawable) {
        this.placeholder = drawable;
        return this;
    }

    public LoaderOptions(int i) {
        this.drawableResId = i;
    }

    public LoaderOptions(Uri uri2) {
        this.uri = uri2;
    }

    public LoaderOptions(File file2) {
        this.file = file2;
    }

    public LoaderOptions(String str) {
        this.url = str;
    }

    public LoaderOptions resize(int i, int i2) {
        this.targetWidth = i;
        this.targetHeight = i2;
        return this;
    }
}
