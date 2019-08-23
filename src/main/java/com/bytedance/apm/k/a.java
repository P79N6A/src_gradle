package com.bytedance.apm.k;

import android.app.Application;
import android.content.Context;

public final class a {
    public static Application a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return (Application) context.getApplicationContext();
    }
}
