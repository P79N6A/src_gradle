package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.g;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.by;
import com.ss.android.ugc.aweme.shortvideo.bz;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.ss.android.ugc.aweme.shortvideo.s.f;
import dmt.av.video.b.a.c;
import dmt.av.video.b.a.d;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71137a;

    public static String a(int i) {
        switch (i) {
            case 1:
                return "camera1";
            case 2:
                return "camera2";
            case 3:
                return "hwcamera";
            case 4:
                return "xiaomicamera";
            case 5:
                return "oppocamera";
            default:
                return "";
        }
    }

    private static int d() {
        if (PatchProxy.isSupport(new Object[0], null, f71137a, true, 80871, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f71137a, true, 80871, new Class[0], Integer.TYPE)).intValue();
        }
        return a.M.b(a.C0682a.RecordCameraTypeAB);
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f71137a, true, 80874, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f71137a, true, 80874, new Class[0], String.class);
        }
        switch (g.b().a()) {
            case 1:
                return "camera1";
            case 2:
                return "camera2";
            case 3:
                return "hwcamera";
            case 4:
                return "xiaomicamera";
            case 5:
                return "oppocamera";
            default:
                return "";
        }
    }

    private static int b() {
        if (PatchProxy.isSupport(new Object[0], null, f71137a, true, 80869, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f71137a, true, 80869, new Class[0], Integer.TYPE)).intValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordCameraCompatLevelAB) == -1) {
            return com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordCameraCompatLevel);
        }
        return com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordCameraCompatLevelAB);
    }

    private static int c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f71137a, true, 80870, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f71137a, true, 80870, new Class[0], Integer.TYPE)).intValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.InCamera2BlackList) == 1) {
            return 1;
        }
        switch (d()) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordCameraType) == 1) {
                    z = true;
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    public static void a(g gVar, Context context) {
        g gVar2 = gVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{gVar2, context2}, null, f71137a, true, 80867, new Class[]{g.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2, context2}, null, f71137a, true, 80867, new Class[]{g.class, Context.class}, Void.TYPE);
            return;
        }
        a((c) new d(context2, gVar2), context2);
    }

    public static void a(c cVar, Context context) {
        com.ss.android.medialib.camera.d dVar;
        c cVar2 = cVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{cVar2, context2}, null, f71137a, true, 80868, new Class[]{c.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, context2}, null, f71137a, true, 80868, new Class[]{c.class, Context.class}, Void.TYPE);
            return;
        }
        bz bzVar = new bz(context2);
        int a2 = f.a(context);
        int a3 = b.a();
        if (bzVar.a() || a2 == 1 || by.a() || a3 == 3) {
            dVar = new com.ss.android.medialib.camera.d(context2, 3);
        } else if (a2 == 3 || a3 == 1) {
            dVar = new com.ss.android.medialib.camera.d(context2, 4);
        } else if (a3 == 2) {
            dVar = new com.ss.android.medialib.camera.d(context2, 5);
        } else if (a2 == 2) {
            com.ss.android.medialib.camera.d dVar2 = new com.ss.android.medialib.camera.d(context2, 2);
            dVar2.p = 0;
            dVar2.s = false;
            dVar = dVar2;
        } else {
            dVar = new com.ss.android.medialib.camera.d(context2, c());
            dVar.p = b();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableExposureOptimize)) {
            dVar.q = (byte) (dVar.q | 1);
        } else {
            dVar.q = (byte) (dVar.q & -2);
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.CameraOptionFlagsOpt)) {
            dVar.q = (byte) (dVar.q | 8);
        }
        cVar2.a(dVar);
    }
}
