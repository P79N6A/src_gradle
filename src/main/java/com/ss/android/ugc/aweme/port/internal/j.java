package com.ss.android.ugc.aweme.port.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class j implements IVideoConfigService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61177a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f61178b = 576;

    /* renamed from: c  reason: collision with root package name */
    private static int f61179c = 1024;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f61180d = new AtomicBoolean(false);

    public final int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, f61177a, false, 67193, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61177a, false, 67193, new Class[0], Integer.TYPE)).intValue();
        }
        a();
        return f61179c;
    }

    public final int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, f61177a, false, 67192, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61177a, false, 67192, new Class[0], Integer.TYPE)).intValue();
        }
        a();
        return f61178b;
    }

    public final void invalidate() {
        if (PatchProxy.isSupport(new Object[0], this, f61177a, false, 67191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61177a, false, 67191, new Class[0], Void.TYPE);
            return;
        }
        f61180d.set(false);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61177a, false, 67189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61177a, false, 67189, new Class[0], Void.TYPE);
        } else if (!f61180d.get()) {
            synchronized (f61180d) {
                if (f61180d.compareAndSet(false, true)) {
                    if (PatchProxy.isSupport(new Object[0], this, f61177a, false, 67190, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61177a, false, 67190, new Class[0], Void.TYPE);
                    } else {
                        int[] j = f.j();
                        if (j != null && j.length == 2 && j[0] > 0 && j[1] > 0) {
                            f61178b = j[0];
                            f61179c = j[1];
                        }
                    }
                }
            }
        }
    }
}
