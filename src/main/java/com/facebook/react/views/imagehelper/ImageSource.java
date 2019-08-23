package com.facebook.react.views.imagehelper;

import android.content.Context;
import android.net.Uri;
import com.facebook.infer.annotation.a;
import javax.annotation.Nullable;

public class ImageSource {
    private boolean isResource;
    private double mSize;
    private String mSource;
    @Nullable
    private Uri mUri;

    public double getSize() {
        return this.mSize;
    }

    public String getSource() {
        return this.mSource;
    }

    public boolean isResource() {
        return this.isResource;
    }

    public Uri getUri() {
        return (Uri) a.b(this.mUri);
    }

    private Uri computeLocalUri(Context context) {
        this.isResource = true;
        return ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(context, this.mSource);
    }

    private Uri computeUri(Context context) {
        try {
            Uri parse = Uri.parse(this.mSource);
            if (parse.getScheme() == null) {
                parse = computeLocalUri(context);
            }
            return parse;
        } catch (Exception unused) {
            return computeLocalUri(context);
        }
    }

    public ImageSource(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public ImageSource(Context context, String str, double d2, double d3) {
        this.mSource = str;
        this.mSize = d2 * d3;
        this.mUri = computeUri(context);
    }
}
