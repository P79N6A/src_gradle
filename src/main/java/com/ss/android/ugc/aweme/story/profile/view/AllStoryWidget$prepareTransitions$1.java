package com.ss.android.ugc.aweme.story.profile.view;

import android.app.Activity;
import android.support.v4.app.SharedElementCallback;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.view.Window;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/AllStoryWidget$prepareTransitions$1", "Landroid/support/v4/app/SharedElementCallback;", "onMapSharedElements", "", "names", "", "", "sharedElements", "", "Landroid/view/View;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryWidget$prepareTransitions$1 extends SharedElementCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73335a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllStoryWidget f73336b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f73337c;

    AllStoryWidget$prepareTransitions$1(AllStoryWidget allStoryWidget, String str) {
        this.f73336b = allStoryWidget;
        this.f73337c = str;
    }

    public final void onMapSharedElements(@Nullable List<String> list, @Nullable Map<String, View> map) {
        LifeStory lifeStory;
        if (PatchProxy.isSupport(new Object[]{list, map}, this, f73335a, false, 84960, new Class[]{List.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, map}, this, f73335a, false, 84960, new Class[]{List.class, Map.class}, Void.TYPE);
            return;
        }
        Activity c2 = this.f73336b.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, PushConstants.INTENT_ACTIVITY_NAME);
        Window window = c2.getWindow();
        if (window != null) {
            ScalingUtils.ScaleType scaleType = ScalingUtils.ScaleType.CENTER_CROP;
            window.setSharedElementReturnTransition(b.a(scaleType, scaleType));
        }
        g.a aVar = g.f72503b;
        AllStoryAdapter allStoryAdapter = this.f73336b.l;
        if (allStoryAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
        }
        List data = allStoryAdapter.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "storyAdapter.data");
        Iterable<LifeStoryItem> iterable = data;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (LifeStoryItem awemeWithComment : iterable) {
            com.ss.android.ugc.aweme.story.api.model.b awemeWithComment2 = awemeWithComment.getAwemeWithComment();
            if (awemeWithComment2 != null) {
                lifeStory = awemeWithComment2.getLifeStory();
            } else {
                lifeStory = null;
            }
            arrayList.add(lifeStory);
        }
        int b2 = aVar.b((List) arrayList, this.f73337c);
        if (b2 >= 0) {
            GridLayoutManager gridLayoutManager = this.f73336b.m;
            if (gridLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gridLayoutManager");
            }
            View findViewByPosition = gridLayoutManager.findViewByPosition(b2);
            if (findViewByPosition != null) {
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
                    View findViewById = findViewByPosition.findViewById(C0906R.id.b2e);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "selectedViewHolder.findV…ById<View>(R.id.iv_image)");
                    map.put("transition_params_bg", findViewById);
                }
            }
        }
    }
}
