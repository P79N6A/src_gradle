package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.React;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68194a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68195b;

    b(a aVar) {
        this.f68195b = aVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f68194a, false, 78288, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68194a, false, 78288, new Class[0], Object.class);
        }
        String aid = this.f68195b.f68177c.getAid();
        if (!PatchProxy.isSupport(new Object[]{aid}, null, DetailApi.f41156a, true, 34727, new Class[]{String.class}, React.class)) {
            return (React) DetailApi.f41157b.fetchReactApi(aid).execute().body();
        }
        return (React) PatchProxy.accessDispatch(new Object[]{aid}, null, DetailApi.f41156a, true, 34727, new Class[]{String.class}, React.class);
    }
}
