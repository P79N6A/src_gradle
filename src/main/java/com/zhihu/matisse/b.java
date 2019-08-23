package com.zhihu.matisse;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.zhihu.matisse.internal.a.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;

public enum b {
    JPEG("image/jpeg", arraySetOf("jpg", "jpeg")),
    PNG("image/png", arraySetOf("png")),
    GIF("image/gif", arraySetOf("gif")),
    BMP("image/x-ms-bmp", arraySetOf("bmp")),
    WEBP("image/webp", arraySetOf("webp")),
    MPEG("video/mpeg", arraySetOf("mpeg", "mpg")),
    MP4("video/mp4", arraySetOf("mp4", "m4v")),
    QUICKTIME("video/quicktime", arraySetOf("mov")),
    THREEGPP("video/3gpp", arraySetOf("3gp", "3gpp")),
    THREEGPP2("video/3gpp2", arraySetOf("3g2", "3gpp2")),
    MKV("video/x-matroska", arraySetOf("mkv")),
    WEBM("video/webm", arraySetOf("webm")),
    TS("video/mp2ts", arraySetOf(TimeDisplaySetting.TIME_DISPLAY_SETTING)),
    AVI("video/avi", arraySetOf("avi"));
    
    private final Set<String> mExtensions;
    private final String mMimeTypeName;

    public final String toString() {
        return this.mMimeTypeName;
    }

    public static Set<b> ofAll() {
        return EnumSet.allOf(b.class);
    }

    public static Set<b> ofImage() {
        return EnumSet.of(JPEG, PNG, GIF, BMP, WEBP);
    }

    public static Set<b> ofVideo() {
        return EnumSet.of(MPEG, new b[]{MP4, QUICKTIME, THREEGPP, THREEGPP2, MKV, WEBM, TS, AVI});
    }

    private static Set<String> arraySetOf(String... strArr) {
        return new ArraySet((Collection<E>) Arrays.asList(strArr));
    }

    public static Set<b> of(b bVar, b... bVarArr) {
        return EnumSet.of(bVar, bVarArr);
    }

    public final boolean checkType(ContentResolver contentResolver, Uri uri) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (uri == null) {
            return false;
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
        String str = null;
        boolean z = false;
        for (String next : this.mExtensions) {
            if (next.equals(extensionFromMimeType)) {
                return true;
            }
            if (!z) {
                String b2 = c.b(contentResolver, uri);
                if (!TextUtils.isEmpty(b2)) {
                    b2 = b2.toLowerCase(Locale.US);
                }
                str = b2;
                z = true;
            }
            if (str != null && str.endsWith(next)) {
                return true;
            }
        }
        return false;
    }

    private b(String str, Set<String> set) {
        this.mMimeTypeName = str;
        this.mExtensions = set;
    }
}
