package com.ss.android.message.sswo;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.PowerManager;
import android.view.Display;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30057a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f30058d;

    /* renamed from: b  reason: collision with root package name */
    public Context f30059b;

    /* renamed from: c  reason: collision with root package name */
    public SswoReceiver f30060c = new SswoReceiver();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30057a, false, 18117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30057a, false, 18117, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f30059b.unregisterReceiver(this.f30060c);
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f30057a, false, 18119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30057a, false, 18119, new Class[0], Void.TYPE);
            return;
        }
        try {
            SswoActivity.a(this.f30059b);
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f30057a, false, 18120, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30057a, false, 18120, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 20) {
                Display[] displays = ((DisplayManager) this.f30059b.getSystemService("display")).getDisplays();
                if (displays == null || displays.length <= 0 || 1 != displays[0].getState()) {
                    return false;
                }
                return true;
            } else if (!((PowerManager) this.f30059b.getSystemService("power")).isScreenOn()) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
        }
    }

    private a(Context context) {
        this.f30059b = context.getApplicationContext();
    }

    public static a a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30057a, true, 18115, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f30057a, true, 18115, new Class[]{Context.class}, a.class);
        }
        if (f30058d == null) {
            synchronized (a.class) {
                if (f30058d == null) {
                    f30058d = new a(context2);
                }
            }
        }
        return f30058d;
    }
}
