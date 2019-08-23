package com.ss.android.ugc.aweme.story.a.b;

import com.bytedance.jedi.model.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.feed.api.StoryStatsApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryReadStatsFetcher;", "Lcom/bytedance/jedi/model/fetcher/SimpleFetcher;", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryStatsParam;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "requestActual", "Lio/reactivex/Observable;", "req", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends c<k, BaseResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71817a;

    public final /* synthetic */ Observable b(Object obj) {
        k kVar = (k) obj;
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f71817a, false, 85066, new Class[]{k.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{kVar}, this, f71817a, false, 85066, new Class[]{k.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(kVar, "req");
        Observable a2 = StoryStatsApi.a(kVar.f71820c, 0, 1, kVar.f71821d);
        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryStatsApi.awemeStats…d, 0, 1, req.relationTyp)");
        return a2;
    }
}
