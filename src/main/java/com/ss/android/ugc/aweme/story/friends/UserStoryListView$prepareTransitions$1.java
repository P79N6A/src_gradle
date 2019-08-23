package com.ss.android.ugc.aweme.story.friends;

import android.support.v4.app.SharedElementCallback;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.detail.f;
import com.ss.android.ugc.aweme.story.feed.c.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/story/friends/UserStoryListView$prepareTransitions$1", "Landroid/support/v4/app/SharedElementCallback;", "onMapSharedElements", "", "names", "", "", "sharedElements", "", "Landroid/view/View;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListView$prepareTransitions$1 extends SharedElementCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserStoryListView f73022b;

    UserStoryListView$prepareTransitions$1(UserStoryListView userStoryListView) {
        this.f73022b = userStoryListView;
    }

    public final void onMapSharedElements(@Nullable List<String> list, @Nullable Map<String, View> map) {
        View view;
        if (PatchProxy.isSupport(new Object[]{list, map}, this, f73021a, false, 84490, new Class[]{List.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, map}, this, f73021a, false, 84490, new Class[]{List.class, Map.class}, Void.TYPE);
            return;
        }
        g.a aVar = g.f72503b;
        List d2 = this.f73022b.getMAdapter().d();
        if (d2 == null) {
            Intrinsics.throwNpe();
        }
        f a2 = f.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryDetailHelper.getInstance()");
        String str = a2.f72432d;
        Intrinsics.checkExpressionValueIsNotNull(str, "StoryDetailHelper.getInstance().curUserStoryUid");
        int a3 = aVar.a(d2, str);
        if (a3 >= 0) {
            LinearLayoutManager linearLayoutManager = this.f73022b.getLinearLayoutManager();
            if (linearLayoutManager != null) {
                view = linearLayoutManager.findViewByPosition(a3);
            } else {
                view = null;
            }
            if (view != null) {
                View findViewById = view.findViewById(C0906R.id.d6g);
                View findViewById2 = view.findViewById(C0906R.id.b08);
                if (findViewById2 != null && findViewById != null) {
                    if (list != null) {
                        if (list != null) {
                            ((ArrayList) list).clear();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
                        }
                    }
                    if (map != null) {
                        map.clear();
                    }
                    if (map != null) {
                        map.put("transition_params_bg", findViewById);
                    }
                    if (map != null) {
                        map.put("transition_params_avatar", findViewById2);
                    }
                }
            }
        }
    }
}
