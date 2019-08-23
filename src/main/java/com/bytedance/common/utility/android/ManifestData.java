package com.bytedance.common.utility.android;

import android.content.Context;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class ManifestData {
    public static Object get(Context context, String str) {
        return readKey(context, str);
    }

    public static Boolean getBoolean(Context context, String str) {
        return (Boolean) readKey(context, str);
    }

    public static String getString(Context context, String str) {
        return (String) readKey(context, str);
    }

    public static int getInt(Context context, String str) {
        return ((Integer) readKey(context, str)).intValue();
    }

    private static Object readKey(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData.get(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
