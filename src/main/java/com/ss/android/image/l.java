package com.ss.android.image;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

public final class l {
    public static void a(Context context, String str) {
        try {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
        } catch (Exception unused) {
        }
    }
}
