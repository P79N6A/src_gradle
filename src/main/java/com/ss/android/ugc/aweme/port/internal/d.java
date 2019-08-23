package com.ss.android.ugc.aweme.port.internal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements IVideoConfigService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61154a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f61155b = 576;

    /* renamed from: c  reason: collision with root package name */
    private static int f61156c = 1024;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f61157d = new AtomicBoolean(false);

    public final int getVideoHeight() {
        if (PatchProxy.isSupport(new Object[0], this, f61154a, false, 67176, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61154a, false, 67176, new Class[0], Integer.TYPE)).intValue();
        }
        a();
        return f61156c;
    }

    public final int getVideoWidth() {
        if (PatchProxy.isSupport(new Object[0], this, f61154a, false, 67175, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61154a, false, 67175, new Class[0], Integer.TYPE)).intValue();
        }
        a();
        return f61155b;
    }

    public final void invalidate() {
        if (PatchProxy.isSupport(new Object[0], this, f61154a, false, 67174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61154a, false, 67174, new Class[0], Void.TYPE);
            return;
        }
        f61157d.set(false);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61154a, false, 67172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61154a, false, 67172, new Class[0], Void.TYPE);
        } else if (!f61157d.get()) {
            synchronized (f61157d) {
                if (f61157d.compareAndSet(false, true)) {
                    if (PatchProxy.isSupport(new Object[0], this, f61154a, false, 67173, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61154a, false, 67173, new Class[0], Void.TYPE);
                    } else {
                        int[] k = f.k();
                        if (k != null && k.length == 2 && k[0] > 0 && k[1] > 0) {
                            f61155b = k[0];
                            f61156c = k[1];
                        }
                    }
                }
            }
        }
    }
}
