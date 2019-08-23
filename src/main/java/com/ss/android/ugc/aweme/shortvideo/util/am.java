package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71109a;

    /* renamed from: b  reason: collision with root package name */
    private static am f71110b = new am();

    private am() {
    }

    public static am a() {
        return f71110b;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f71109a, false, 81069, new Class[0], Integer.TYPE)) {
            return a.o.a("key_video_record_from_source", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71109a, false, 81069, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71109a, false, 81068, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71109a, false, 81068, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a.o.b("key_video_record_from_source", i);
    }
}
