package com.bytedance.android.live.core.paging.b;

import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.paging.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;

public final class a<CacheKey, V> extends c<Long, V, CacheKey> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7928a;
    private final b<V> k;

    public a(d<CacheKey, V> dVar) {
        super(dVar);
        this.k = dVar.g;
    }

    public final /* synthetic */ Object a(Extra extra) {
        Extra extra2 = extra;
        if (PatchProxy.isSupport(new Object[]{extra2}, this, f7928a, false, 549, new Class[]{Extra.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{extra2}, this, f7928a, false, 549, new Class[]{Extra.class}, Long.class);
        } else if (extra2 == null || !extra2.hasMore) {
            return null;
        } else {
            return Long.valueOf(extra2.maxTime);
        }
    }

    @NonNull
    public final /* synthetic */ Observable a(boolean z, Object obj, int i) {
        Long l = (Long) obj;
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), l, Integer.valueOf(i)}, this, f7928a, false, 548, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class)) {
            return this.k.a(z, l, i);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), l, Integer.valueOf(i)}, this, f7928a, false, 548, new Class[]{Boolean.TYPE, Long.class, Integer.TYPE}, Observable.class);
    }
}
