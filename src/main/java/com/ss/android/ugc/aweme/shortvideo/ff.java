package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.sticker.e;
import java.io.File;

public final class ff extends fg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67712a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f67713b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f67714c = (f67717f + "music-effect/");

    /* renamed from: d  reason: collision with root package name */
    public static final String f67715d = (f67717f + "face_track.model");

    static {
        File file;
        if (PatchProxy.isSupport(new Object[0], null, e.f71638a, true, 81962, new Class[0], File.class)) {
            file = (File) PatchProxy.accessDispatch(new Object[0], null, e.f71638a, true, 81962, new Class[0], File.class);
        } else {
            file = new File(a.f61119b.getFilesDir(), "sticker_1_0/3d/resources");
        }
        f67713b = file.getPath();
    }

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f67712a, true, 74567, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f67712a, true, 74567, new Class[0], Long.TYPE)).longValue();
        }
        long c2 = a.L.c(e.a.VideoDurationLimitMillisecond);
        if (c2 < 1000 || c2 >= ea.f66827f) {
            return 1000;
        }
        return c2;
    }

    public static String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f67712a, true, 74565, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f67712a, true, 74565, new Class[]{String.class}, String.class);
        }
        return x + d(str);
    }

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f67712a, true, 74564, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f67712a, true, 74564, new Class[]{String.class}, String.class);
        }
        return f67717f + d(str);
    }
}
