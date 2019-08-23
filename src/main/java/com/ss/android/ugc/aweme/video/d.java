package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.video.a.a;
import java.util.HashMap;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76035a;

    /* renamed from: d  reason: collision with root package name */
    private static d f76036d;

    /* renamed from: e  reason: collision with root package name */
    private static long f76037e;

    /* renamed from: b  reason: collision with root package name */
    public o f76038b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, RoomStruct> f76039c = new HashMap<>();

    public static long a() {
        return f76037e;
    }

    private d() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76035a, false, 88914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76035a, false, 88914, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76038b != null) {
            this.f76038b.a();
        }
    }

    public static d b() {
        if (PatchProxy.isSupport(new Object[0], null, f76035a, true, 88913, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f76035a, true, 88913, new Class[0], d.class);
        }
        if (f76036d == null) {
            synchronized (d.class) {
                if (f76036d == null) {
                    f76036d = new d();
                }
            }
        }
        return f76036d;
    }

    public static void a(long j) {
        f76037e = j;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76035a, false, 88915, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f76035a, false, 88915, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f76038b != null) {
            this.f76038b.a();
        }
    }

    public final void a(IFeedViewHolder iFeedViewHolder, Aweme aweme) {
        IFeedViewHolder iFeedViewHolder2 = iFeedViewHolder;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder2, aweme2}, this, f76035a, false, 88916, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder2, aweme2}, this, f76035a, false, 88916, new Class[]{IFeedViewHolder.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (!(iFeedViewHolder2 == null || aweme2 == null || !(iFeedViewHolder2 instanceof com.ss.android.ugc.aweme.feed.adapter.a))) {
            ((com.ss.android.ugc.aweme.feed.adapter.a) iFeedViewHolder2).a_(aweme2);
        }
    }
}
