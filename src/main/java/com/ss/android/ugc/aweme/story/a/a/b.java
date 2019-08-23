package com.ss.android.ugc.aweme.story.a.a;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\t\u001a\u00020\u0005H\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRequestParam;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "()V", "convertKeyActual", "req", "(Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRequestParam;)Ljava/lang/Long;", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a<Long, List<? extends UserStory>, d, com.ss.android.ugc.aweme.story.feed.model.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71777a;

    public final /* synthetic */ Observable b(Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f71777a, false, 85016, new Class[]{d.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{dVar}, this, f71777a, false, 85016, new Class[]{d.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        Observable a2 = StoryApi.a(dVar.f71787b, dVar.f71788c, dVar.f71789d, dVar.f71790e);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryApi.fetchLifeFeed(r…abType, req.insertUserId)");
        return a2;
    }

    public final /* synthetic */ Object c(Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f71777a, false, 85017, new Class[]{d.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{dVar}, this, f71777a, false, 85017, new Class[]{d.class}, Long.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        return Long.valueOf(dVar.f71787b);
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        d dVar = (d) obj;
        com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) obj2;
        if (PatchProxy.isSupport(new Object[]{dVar, aVar}, this, f71777a, false, 85018, new Class[]{d.class, com.ss.android.ugc.aweme.story.feed.model.a.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{dVar, aVar}, this, f71777a, false, 85018, new Class[]{d.class, com.ss.android.ugc.aweme.story.feed.model.a.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(dVar, "req");
        Intrinsics.checkParameterIsNotNull(aVar, "resp");
        return aVar.getUserStoryList();
    }
}
