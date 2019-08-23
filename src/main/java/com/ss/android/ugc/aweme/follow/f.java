package com.ss.android.ugc.aweme.follow;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47762a;

    /* renamed from: b  reason: collision with root package name */
    private static f f47763b;

    private f() {
    }

    public final b<FollowStatus> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f47762a, false, 44616, new Class[0], b.class)) {
            return a.a().a("#FollowStatus", FollowStatus.class);
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f47762a, false, 44616, new Class[0], b.class);
    }

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f47762a, true, 44615, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f47762a, true, 44615, new Class[0], f.class);
        }
        if (f47763b == null) {
            synchronized (f.class) {
                if (f47763b == null) {
                    f47763b = new f();
                }
            }
        }
        return f47763b;
    }
}
