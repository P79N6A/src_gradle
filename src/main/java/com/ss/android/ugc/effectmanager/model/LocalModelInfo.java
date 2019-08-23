package com.ss.android.ugc.effectmanager.model;

import android.net.Uri;
import com.ss.android.ugc.effectmanager.common.c;
import java.io.File;

public class LocalModelInfo {
    private final Uri mUri;

    public Uri getUri() {
        return this.mUri;
    }

    public String getVersion() {
        return getVersionOfModel(this.mUri.getPath());
    }

    public String getName() {
        return c.a(new File(this.mUri.getPath()).getName());
    }

    private LocalModelInfo(Uri uri) {
        this.mUri = uri;
    }

    public static LocalModelInfo fromFile(String str) {
        return new LocalModelInfo(Uri.parse("file://" + str));
    }

    private static String getVersionOfModel(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int lastIndexOf2 = str.lastIndexOf("_model");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, lastIndexOf2).replace('_', '.');
        }
        return "v1.0";
    }
}
