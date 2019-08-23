package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.framework.e.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0018\u00010 R\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0006H\u0016R\u001a\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "delta", "getDelta", "()I", "setDelta", "(I)V", "factor", "", "getFactor", "()F", "setFactor", "(F)V", "getExtraLayoutSpace", "state", "Landroid/support/v7/widget/RecyclerView$State;", "scrollHorizontallyBy", "dx", "recycler", "Landroid/support/v7/widget/RecyclerView$Recycler;", "Landroid/support/v7/widget/RecyclerView;", "smoothScrollToPosition", "", "recyclerView", "position", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74021a;

    /* renamed from: b  reason: collision with root package name */
    public float f74022b = 2.5f;

    /* renamed from: c  reason: collision with root package name */
    public int f74023c = u.a(40.0d);

    public final int getExtraLayoutSpace(@Nullable RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f74021a, false, 85923, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return UIUtils.getScreenWidth(a.a()) * 2;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f74021a, false, 85923, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public StorySceneLayoutManager(@Nullable Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public final void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state, int i) {
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, state2, Integer.valueOf(i)}, this, f74021a, false, 85921, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, state2, Integer.valueOf(i)}, this, f74021a, false, 85921, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        StorySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 storySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 = new StorySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1(this, recyclerView, recyclerView.getContext());
        storySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1.setTargetPosition(i);
        startSmoothScroll(storySceneLayoutManager$smoothScrollToPosition$linearSmoothScroller$1);
    }

    public final int scrollHorizontallyBy(int i, @Nullable RecyclerView.Recycler recycler, @Nullable RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f74021a, false, 85922, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f74021a, false, 85922, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        int width = getWidth() / 2;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                float min = ((((float) (this.f74023c - Math.min(this.f74023c, Math.abs(width - ((getDecoratedRight(childAt) + getDecoratedLeft(childAt)) / 2))))) * 0.15f) / ((float) this.f74023c)) + 1.0f;
                childAt.setScaleX(min);
                childAt.setScaleY(min);
            }
        }
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    public StorySceneLayoutManager(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
