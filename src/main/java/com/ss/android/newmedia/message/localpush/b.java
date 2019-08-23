package com.ss.android.newmedia.message.localpush;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30242a;
    private static volatile b g;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30243b;

    /* renamed from: c  reason: collision with root package name */
    public a f30244c;

    /* renamed from: d  reason: collision with root package name */
    public Context f30245d;

    /* renamed from: e  reason: collision with root package name */
    public int f30246e = 1;

    /* renamed from: f  reason: collision with root package name */
    public long f30247f = 14400000;

    /* access modifiers changed from: package-private */
    public final a a() {
        if (PatchProxy.isSupport(new Object[0], this, f30242a, false, 18710, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f30242a, false, 18710, new Class[0], a.class);
        } else if (this.f30243b) {
            return this.f30244c;
        } else {
            throw new IllegalStateException("LocalPushClick#init MUST be called first");
        }
    }

    private b(Context context) {
        this.f30245d = context;
    }

    public static b a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f30242a, true, 18709, new Class[]{Context.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{context2}, null, f30242a, true, 18709, new Class[]{Context.class}, b.class);
        }
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b(context2);
                }
            }
        }
        return g;
    }
}
