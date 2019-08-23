package com.bytedance.aweme;

import android.content.Context;
import com.bytedance.aweme.facebook.soloader.SoLoader;

public class AwemeSoLoader {
    private static boolean initialized;

    public static void init(Context context) {
        try {
            SoLoader.init(context, false);
            initialized = true;
        } catch (RuntimeException unused) {
        }
    }

    public static void loadLibrary(String str) {
        if (initialized) {
            SoLoader.loadLibrary(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
