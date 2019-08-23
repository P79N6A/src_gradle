package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLinearSnapHelper$onScrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneLinearSnapHelper$onScrollListener$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74032a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StorySceneLinearSnapHelper f74033b;

    StorySceneLinearSnapHelper$onScrollListener$1(StorySceneLinearSnapHelper storySceneLinearSnapHelper) {
        this.f74033b = storySceneLinearSnapHelper;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        int i2;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f74032a, false, 85928, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f74032a, false, 85928, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            StorySceneLinearSnapHelper storySceneLinearSnapHelper = this.f74033b;
            if (PatchProxy.isSupport(new Object[0], storySceneLinearSnapHelper, StorySceneLinearSnapHelper.f74027a, false, 85926, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storySceneLinearSnapHelper, StorySceneLinearSnapHelper.f74027a, false, 85926, new Class[0], Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[0], storySceneLinearSnapHelper, StorySceneLinearSnapHelper.f74027a, false, 85927, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], storySceneLinearSnapHelper, StorySceneLinearSnapHelper.f74027a, false, 85927, new Class[0], Integer.TYPE)).intValue();
            } else {
                RecyclerView recyclerView3 = storySceneLinearSnapHelper.f74029c;
                if (recyclerView3 != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView3.getLayoutManager();
                    if (layoutManager != null) {
                        Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView?.layoutMana… RecyclerView.NO_POSITION");
                        View findSnapView = storySceneLinearSnapHelper.findSnapView(layoutManager);
                        if (findSnapView != null) {
                            Intrinsics.checkExpressionValueIsNotNull(findSnapView, "findSnapView(layoutManag… RecyclerView.NO_POSITION");
                            i2 = layoutManager.getPosition(findSnapView);
                        }
                    }
                }
                i2 = -1;
            }
            if (i2 != -1) {
                Function1<? super Integer, Unit> function1 = storySceneLinearSnapHelper.f74030d;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i2));
                }
                storySceneLinearSnapHelper.f74028b = i2;
            }
        }
    }
}
