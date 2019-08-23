package com.ss.sys.ces.out;

import android.content.Context;
import com.ss.sys.ces.b;

public class StcSDKFactory {

    /* renamed from: a  reason: collision with root package name */
    private static ISdk f78514a;

    public static ISdk getInstance() {
        return f78514a;
    }

    public static ISdk getSDK(Context context, long j) {
        synchronized (StcSDKFactory.class) {
            if (f78514a == null) {
                f78514a = b.a(context, j, 255);
            }
        }
        return f78514a;
    }

    public static ISdk getSDK(Context context, long j, int i) {
        synchronized (StcSDKFactory.class) {
            if (f78514a == null) {
                f78514a = b.a(context, j, i);
            }
        }
        return f78514a;
    }

    public static ISdk getSDK(Context context, String str) {
        return null;
    }

    public static ISdk getSDK(Context context, String str, int i) {
        return null;
    }
}
