package com.ss.android.ugc.aweme.story.shootvideo.friends.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.f.c;
import java.util.List;

public final class g extends b<f, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73540a;

    /* renamed from: b  reason: collision with root package name */
    List<k> f73541b;

    public g() {
        a(new f());
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73540a, false, 85328, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73540a, false, 85328, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.a(new h(this, z));
    }
}
