package com.ss.android.ugc.aweme.discover.hotspot.a;

import com.bytedance.jedi.model.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000b\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00160\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotRepo;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "raceLampFetcher", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotsFetcher;", "spotsAwemesCache", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesCache;", "spotsAwemesFetcher", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesFetcher;", "spotsListFetcher", "getAllSpots", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "getAwemesBySpot", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotAwemes;", "payload", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesRequestParam;", "getLampRace", "hotword", "", "loadMore", "toSingle", "T", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42428a;

    /* renamed from: b  reason: collision with root package name */
    public c f42429b = new c(3);

    /* renamed from: c  reason: collision with root package name */
    public e f42430c = new e();

    /* renamed from: d  reason: collision with root package name */
    private c f42431d = new c(2);

    /* renamed from: e  reason: collision with root package name */
    private d f42432e = new d();

    public final <T> Single<T> a(@NotNull Observable<T> observable) {
        if (PatchProxy.isSupport(new Object[]{observable}, this, f42428a, false, 36571, new Class[]{Observable.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{observable}, this, f42428a, false, 36571, new Class[]{Observable.class}, Single.class);
        }
        Single<T> subscribeOn = Single.fromObservable(observable).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "Single.fromObservable(th…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @NotNull
    public final Single<HotSearchListResponse> a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42428a, false, 36569, new Class[]{String.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{str}, this, f42428a, false, 36569, new Class[]{String.class}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "hotword");
        return a(this.f42431d.a(str));
    }
}
