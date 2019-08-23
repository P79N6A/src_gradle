package com.ss.android.ugc.aweme.shortvideo.l;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import dmt.av.video.b.a.c;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68283a;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f68284c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f68285d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68286b;

    /* renamed from: e  reason: collision with root package name */
    public c f68287e;

    /* renamed from: f  reason: collision with root package name */
    private Context f68288f;
    private int g = a();

    private boolean d() {
        if (this.g == 1 || this.g == 2 || this.g == 3) {
            return true;
        }
        return false;
    }

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f68283a, true, 78502, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f68283a, true, 78502, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.L.b(e.a.ShakeFreeWhiteList) == -1) {
            return a.a(Build.MODEL);
        }
        return a.L.b(e.a.ShakeFreeWhiteList);
    }

    public static boolean b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], null, f68283a, true, 78504, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68283a, true, 78504, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (a.L.b(e.a.CurrentShakeFreeMode) != 0) {
            return f68285d;
        }
        boolean c2 = c();
        e eVar = a.L;
        e.a aVar = e.a.CurrentShakeFreeMode;
        if (c2) {
            i = 1;
        } else {
            i = 2;
        }
        eVar.a(aVar, i);
        f68284c = c2;
        f68285d = c2;
        return c2;
    }

    private static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f68283a, true, 78503, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f68283a, true, 78503, new Class[0], Boolean.TYPE)).booleanValue();
        }
        switch (a()) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            default:
                return false;
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68283a, false, 78512, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68283a, false, 78512, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (d() && Build.VERSION.SDK_INT >= 23) {
            if (z) {
                this.f68287e.b(false);
                return;
            }
            this.f68287e.b(b());
        }
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68283a, false, 78511, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68283a, false, 78511, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!d() || Build.VERSION.SDK_INT < 23) {
            a.L.a(e.a.CurrentShakeFreeMode, 2);
            f68284c = false;
            f68285d = false;
        } else {
            boolean b2 = b();
            f68284c = b2;
            f68285d = b2;
            c cVar = this.f68287e;
            if (!b2 || !z) {
                z2 = false;
            }
            cVar.b(z2);
        }
    }

    public b(Context context, c cVar) {
        this.f68288f = context;
        this.f68286b = true;
        this.f68287e = cVar;
    }

    public void a(Context context, final boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68283a, false, 78509, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f68283a, false, 78509, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f68286b && d() && Build.VERSION.SDK_INT >= 23) {
            this.f68287e.b(z);
            this.f68287e.a(this.f68287e.f(), new com.ss.android.medialib.camera.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68289a;

                public final void a(int i) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68289a, false, 78513, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68289a, false, 78513, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str = "on ";
                    } else {
                        str = "off";
                    }
                    sb.append(str);
                    sb.append(", camera open success: Camera id:");
                    sb.append(b.this.f68287e.f());
                    sb.append(", camera type");
                    sb.append(i);
                    b.f68284c = z;
                }

                public final void a(int i, int i2, String str) {
                    String str2;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f68289a, false, 78514, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f68289a, false, 78514, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Antishake ");
                    if (z) {
                        str2 = "on ";
                    } else {
                        str2 = "off";
                    }
                    sb.append(str2);
                    sb.append(", camera open fail: Camera id:");
                    sb.append(b.this.f68287e.f());
                    sb.append(", camera type");
                    int i3 = i;
                    sb.append(i);
                }
            });
        }
    }

    public final boolean a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68283a, false, 78510, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f68283a, false, 78510, new Class[]{Boolean.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.g == 1) {
            if (z || z2) {
                return false;
            }
            return true;
        } else if (this.g == 2) {
            if (z || !dmt.av.video.b.a.a.a(this.f68288f, 5, 0)) {
                return false;
            }
            return true;
        } else if (this.g != 3 || z) {
            return false;
        } else {
            return true;
        }
    }
}
