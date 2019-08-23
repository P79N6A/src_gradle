package com.ss.android.ugc.aweme.im.sdk.resources.model;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.Serializable;

public class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("animate_type")
    private String animateType;
    @SerializedName("animate_uri")
    private String animateUrl;
    @SerializedName("height")
    private int height;
    @SerializedName("static_type")
    private String staticType;
    @SerializedName("static_uri")
    private String staticUrl;
    @SerializedName("width")
    private int width;

    public String getAnimateType() {
        return this.animateType;
    }

    public String getAnimateUrl() {
        return this.animateUrl;
    }

    public int getHeight() {
        return this.height;
    }

    public String getStaticType() {
        return this.staticType;
    }

    public String getStaticUrl() {
        return this.staticUrl;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAnimateType(String str) {
        this.animateType = str;
    }

    public void setAnimateUrl(String str) {
        this.animateUrl = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setStaticType(String str) {
        this.staticType = str;
    }

    public void setStaticUrl(String str) {
        this.staticUrl = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static b obtain(String str, String str2) {
        int i;
        String str3 = str;
        String str4 = str2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 53167, new Class[]{String.class, String.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 53167, new Class[]{String.class, String.class}, b.class);
        } else if (TextUtils.isEmpty(str2)) {
            return null;
        } else {
            b bVar = new b();
            bVar.animateUrl = str4;
            bVar.staticUrl = str4;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str3, options);
            if (options.outWidth == 0 || options.outHeight == 0) {
                i = 0;
            } else if (options.outWidth <= 140 && options.outHeight <= 140) {
                i2 = options.outWidth;
                i = options.outHeight;
            } else if (options.outWidth >= options.outHeight) {
                i = (options.outHeight * 140) / options.outWidth;
                i2 = 140;
            } else {
                i2 = (options.outWidth * 140) / options.outHeight;
                i = 140;
            }
            bVar.width = i2;
            bVar.height = i;
            if (FileUtils.isGif(new File(str3))) {
                bVar.animateType = "gif";
                bVar.staticType = "gif";
            } else {
                bVar.animateType = "jpeg";
                bVar.staticType = "jpeg";
            }
            return bVar;
        }
    }
}
