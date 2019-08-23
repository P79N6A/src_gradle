package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Looper;
import java.util.List;

public class dj extends dk {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f5961b = true;

    /* access modifiers changed from: protected */
    public String a(List<cy> list) {
        return null;
    }

    protected dj(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public boolean a(Context context) {
        if (ct.m(context) != 1 || !f5961b) {
            return false;
        }
        f5961b = false;
        synchronized (Looper.getMainLooper()) {
            dx dxVar = new dx(context);
            dy a2 = dxVar.a();
            if (a2 == null) {
                return true;
            }
            if (!a2.b()) {
                return false;
            }
            a2.b(false);
            dxVar.a(a2);
            return true;
        }
    }
}
