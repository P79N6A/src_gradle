package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Looper;
import java.util.Date;
import java.util.List;

public class di extends dk {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5960b = true;

    /* access modifiers changed from: protected */
    public String a(List<cy> list) {
        return null;
    }

    protected di(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        String a2 = cz.a(new Date().getTime());
        return cv.c(str + a2);
    }

    /* access modifiers changed from: protected */
    public boolean a(Context context) {
        if (!f5960b) {
            return false;
        }
        f5960b = false;
        synchronized (Looper.getMainLooper()) {
            dx dxVar = new dx(context);
            dy a2 = dxVar.a();
            if (a2 == null) {
                return true;
            }
            if (!a2.a()) {
                return false;
            }
            a2.a(false);
            dxVar.a(a2);
            return true;
        }
    }
}
