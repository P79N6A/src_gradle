package com.ss.android.ugc.aweme.story.a.b;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0014J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/storydetail/StoryDislikeFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a<String, String, String, BaseResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71802a;

    public final /* synthetic */ Observable b(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f71802a, false, 85051, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str}, this, f71802a, false, 85051, new Class[]{String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Observable b2 = StoryApi.b(str);
        Intrinsics.checkExpressionValueIsNotNull(b2, "StoryApi.dislikeStroy(req)");
        return b2;
    }

    public final /* synthetic */ Object c(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f71802a, false, 85049, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f71802a, false, 85049, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        return str;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (PatchProxy.isSupport(new Object[]{str, baseResponse}, this, f71802a, false, 85050, new Class[]{String.class, BaseResponse.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, baseResponse}, this, f71802a, false, 85050, new Class[]{String.class, BaseResponse.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Intrinsics.checkParameterIsNotNull(baseResponse, "resp");
        return str;
    }
}
