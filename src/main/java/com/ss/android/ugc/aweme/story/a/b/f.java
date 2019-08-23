package com.ss.android.ugc.aweme.story.a.b;

import com.bytedance.jedi.model.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.model.b;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryOneDayFetcher;", "Lcom/bytedance/jedi/model/fetcher/SimpleFetcher;", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryOneDayParam;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "()V", "requestActual", "Lio/reactivex/Observable;", "req", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f extends c<g, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71803a;

    public final /* synthetic */ Observable b(Object obj) {
        g gVar = (g) obj;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f71803a, false, 85056, new Class[]{g.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{gVar}, this, f71803a, false, 85056, new Class[]{g.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(gVar, "req");
        Observable subscribeOn = StoryApi.a(gVar.f71805b, gVar.f71806c, gVar.f71807d, gVar.f71808e, gVar.f71809f).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "StoryApi.fetchOneDayLife…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
