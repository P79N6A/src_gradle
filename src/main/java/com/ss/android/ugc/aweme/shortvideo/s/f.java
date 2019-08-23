package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.e.d;
import dmt.av.video.b.a.c;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69148a;

    /* renamed from: b  reason: collision with root package name */
    public a f69149b;

    /* renamed from: c  reason: collision with root package name */
    public int f69150c;

    /* renamed from: d  reason: collision with root package name */
    private c f69151d;

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f69148a, false, 81269, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69148a, false, 81269, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.L.b(e.a.CurrentWideMode) == 0) {
            boolean b2 = this.f69149b.b();
            a(b2);
            return b2;
        } else if (a.L.b(e.a.CurrentWideMode) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f69148a, false, 81267, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69148a, false, 81267, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f69149b.b(new d().c()) && b()) {
            z = true;
        }
        return z;
    }

    public static int a(Context context) {
        int i;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f69148a, true, 81266, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f69148a, true, 81266, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        if (a.L.b(e.a.WideCameraInfo) == -1) {
            i = e.a(Build.MODEL);
        } else {
            i = a.L.b(e.a.WideCameraInfo);
        }
        switch (i) {
            case 1:
                if (dmt.av.video.b.a.a.a(context2, 3)) {
                    return 1;
                }
                break;
            case 2:
                return 2;
            case 3:
                break;
        }
        if (dmt.av.video.b.a.a.a(context2, 4)) {
            return 3;
        }
        return 0;
    }

    public static void a(boolean z) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f69148a, true, 81270, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f69148a, true, 81270, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e eVar = a.L;
        e.a aVar = e.a.CurrentWideMode;
        if (!z) {
            i = 2;
        }
        eVar.a(aVar, i);
    }

    public f(Context context, c cVar) {
        this.f69151d = cVar;
        this.f69150c = a(context);
        switch (this.f69150c) {
            case 1:
                this.f69149b = new b(this.f69151d);
                break;
            case 2:
                this.f69149b = new c(this.f69151d);
                break;
            case 3:
                this.f69149b = new g(this.f69151d);
                break;
            default:
                this.f69149b = new a();
                break;
        }
        this.f69149b.a(b());
    }
}
