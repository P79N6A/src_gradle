package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class PreferenceWrapper {
    private PreferenceWrapper() {
    }

    public static SharedPreferences getDefault(Context context) {
        if (context != null) {
            return c.a(context, "umeng_general_config", 0);
        }
        return null;
    }

    public static SharedPreferences getInstance(Context context, String str) {
        if (context != null) {
            return c.a(context, str, 0);
        }
        return null;
    }
}
