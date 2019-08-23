package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.Lifecycle;
import com.bytedance.android.live.core.rxutils.autodispose.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8017a;

    /* renamed from: b  reason: collision with root package name */
    static final a f8018b = new b();

    private b() {
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8017a, false, 664, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f8017a, false, 664, new Class[]{Object.class}, Object.class);
        }
        Lifecycle.Event event = (Lifecycle.Event) obj;
        switch (event) {
            case ON_CREATE:
                return Lifecycle.Event.ON_DESTROY;
            case ON_START:
                return Lifecycle.Event.ON_STOP;
            case ON_RESUME:
                return Lifecycle.Event.ON_PAUSE;
            case ON_PAUSE:
                return Lifecycle.Event.ON_STOP;
            default:
                throw new com.bytedance.android.live.core.rxutils.autodispose.b.b("Lifecycle has ended! Last event was " + event);
        }
    }
}
