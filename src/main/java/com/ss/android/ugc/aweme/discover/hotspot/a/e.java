package com.ss.android.ugc.aweme.discover.hotspot.a;

import com.bytedance.jedi.model.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.api.HotSearchApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesFetcher;", "Lcom/bytedance/jedi/model/fetcher/SimpleFetcher;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesRequestParam;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotAwemes;", "()V", "requestActual", "Lio/reactivex/Observable;", "req", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends c<g, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42435a;

    public final /* synthetic */ Observable b(Object obj) {
        g gVar = (g) obj;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f42435a, false, 36575, new Class[]{g.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{gVar}, this, f42435a, false, 36575, new Class[]{g.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(gVar, "req");
        return HotSearchApi.a.a().getAwemesByHotWord(gVar.f42439b, gVar.f42438a.f21388b, 10, gVar.f42441d, gVar.f42440c ? 1 : 0);
    }
}
