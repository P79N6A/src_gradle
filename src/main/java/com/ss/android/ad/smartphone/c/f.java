package com.ss.android.ad.smartphone.c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

public final class f {
    public static Activity a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
