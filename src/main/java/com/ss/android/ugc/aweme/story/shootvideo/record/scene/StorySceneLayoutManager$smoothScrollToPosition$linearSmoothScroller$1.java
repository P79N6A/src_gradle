package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1", "Landroid/support/v7/widget/LinearSmoothScroller;", "calculateSpeedPerPixel", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 extends LinearSmoothScroller {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74024a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StorySceneLayoutManager f74025b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RecyclerView f74026c;

    public final float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
        DisplayMetrics displayMetrics2 = displayMetrics;
        if (PatchProxy.isSupport(new Object[]{displayMetrics2}, this, f74024a, false, 85924, new Class[]{DisplayMetrics.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{displayMetrics2}, this, f74024a, false, 85924, new Class[]{DisplayMetrics.class}, Float.TYPE)).floatValue();
        }
        Intrinsics.checkParameterIsNotNull(displayMetrics2, "displayMetrics");
        return super.calculateSpeedPerPixel(displayMetrics) * this.f74025b.f74022b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StorySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1(StorySceneLayoutManager storySceneLayoutManager, RecyclerView recyclerView, Context context) {
        super(context);
        this.f74025b = storySceneLayoutManager;
        this.f74026c = recyclerView;
    }
}
