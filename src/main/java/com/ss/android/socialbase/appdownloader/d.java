package com.ss.android.socialbase.appdownloader;

import android.content.Context;

public final class d {
    public static int a(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "layout", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "string", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int c(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "style", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int d(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "id", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int e(Context context, String str) {
        try {
            return context.getResources().getIdentifier(str, "color", context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int a(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, "drawable", str2);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, "attr", str2);
        } catch (Exception unused) {
            return 0;
        }
    }
}
