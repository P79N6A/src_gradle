package com.bytedance.android.livesdkapi.g;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class g implements e {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f1871f;

    /* renamed from: a  reason: collision with root package name */
    private final Set<e.a> f1872a = new HashSet();

    public void a(int i, FeedItem feedItem) {
    }

    public abstract void a(long j);

    public abstract void b(int i);

    @NonNull
    public abstract List<Room> d();

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f1871f, false, 15060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1871f, false, 15060, new Class[0], Void.TYPE);
            return;
        }
        this.f1872a.clear();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f1871f, false, 15061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1871f, false, 15061, new Class[0], Void.TYPE);
            return;
        }
        for (e.a a2 : this.f1872a) {
            a2.a();
        }
    }

    public final void a(e.a aVar) {
        e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f1871f, false, 15058, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f1871f, false, 15058, new Class[]{e.a.class}, Void.TYPE);
            return;
        }
        this.f1872a.add(aVar2);
    }

    public final void b(e.a aVar) {
        e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f1871f, false, 15059, new Class[]{e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f1871f, false, 15059, new Class[]{e.a.class}, Void.TYPE);
            return;
        }
        this.f1872a.remove(aVar2);
    }
}
