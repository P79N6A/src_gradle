package com.ss.android.ugc.aweme.story.friends;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/story/friends/UserStoryListView$initView$2", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListView$initView$2 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserStoryListView f73020b;

    UserStoryListView$initView$2(UserStoryListView userStoryListView) {
        this.f73020b = userStoryListView;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f73019a, false, 84488, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f73019a, false, 84488, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            UserStoryListView userStoryListView = this.f73020b;
            if (PatchProxy.isSupport(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84478, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84478, new Class[0], Void.TYPE);
                return;
            }
            Map hashMap = new HashMap();
            hashMap.put("enter_from_merge", "homepage_follow");
            hashMap.put("enter_method", "live_cover");
            r.a("livesdk_skylight_draw", hashMap);
        }
    }
}
