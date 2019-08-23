package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class ba {
    private ba() {
    }

    public static SharedPreferences a(Context context) {
        return c.a(context, "umeng_general_config", 0);
    }

    public static SharedPreferences a(Context context, String str) {
        return c.a(context, str, 0);
    }
}
