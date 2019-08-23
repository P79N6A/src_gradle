package com.bytedance.android.livesdk.feed.tab.b;

import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14432a;

    /* renamed from: b  reason: collision with root package name */
    private FeedTabApi f14433b;

    public final Observable<List<g>> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f14432a, false, 8938, new Class[0], Observable.class)) {
            return this.f14433b.queryTab().subscribeOn(Schedulers.io()).map(n.f14435b);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f14432a, false, 8938, new Class[0], Observable.class);
    }

    public final List<g> b() {
        if (PatchProxy.isSupport(new Object[0], this, f14432a, false, 8939, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f14432a, false, 8939, new Class[0], List.class);
        }
        throw new RuntimeException("do not support");
    }

    public m(FeedTabApi feedTabApi) {
        this.f14433b = feedTabApi;
    }

    public final g a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14432a, false, 8943, new Class[]{Long.TYPE}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14432a, false, 8943, new Class[]{Long.TYPE}, g.class);
        }
        throw new RuntimeException("do not support");
    }

    public final boolean a(List<g> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f14432a, false, 8940, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, this, f14432a, false, 8940, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        throw new RuntimeException("do not support");
    }
}
