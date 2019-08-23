package com.ss.android.ugc.aweme.story.profile.view;

import android.support.v4.widget.SwipeRefreshLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onRefresh", "com/ss/android/ugc/aweme/story/profile/view/AllStoryWidget$initView$3$1"}, k = 3, mv = {1, 1, 15})
final class AllStoryWidget$initView$$inlined$apply$lambda$2 implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73327a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllStoryWidget f73328b;

    AllStoryWidget$initView$$inlined$apply$lambda$2(AllStoryWidget allStoryWidget) {
        this.f73328b = allStoryWidget;
    }

    public final void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f73327a, false, 84959, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73327a, false, 84959, new Class[0], Void.TYPE);
            return;
        }
        this.f73328b.f();
    }
}
