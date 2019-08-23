package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.u;
import java.lang.reflect.Type;

public final class bo implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65817a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65818b;

    public bo(VideoRecordNewActivity videoRecordNewActivity) {
        this.f65818b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65817a, false, 74118, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65817a, false, 74118, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != u.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65819a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65819a, false, 74119, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65819a, false, 74119, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    bo.this.f65818b.m.c(((u) t).f74940b);
                    q.a(bo.this.f65818b, "light", "click", 0, 0, bo.this.f65818b.i());
                }
            };
        }
    }
}
