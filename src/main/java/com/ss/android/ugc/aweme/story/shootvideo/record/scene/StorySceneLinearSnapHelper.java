package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R7\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLinearSnapHelper;", "Landroid/support/v7/widget/LinearSnapHelper;", "()V", "onScrollListener", "com/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLinearSnapHelper$onScrollListener$1", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneLinearSnapHelper$onScrollListener$1;", "onSnapListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "getOnSnapListener", "()Lkotlin/jvm/functions/Function1;", "setOnSnapListener", "(Lkotlin/jvm/functions/Function1;)V", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "snapPosition", "attachToRecyclerView", "getSnapPosition", "notifySnapChanged", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneLinearSnapHelper extends LinearSnapHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74027a;

    /* renamed from: b  reason: collision with root package name */
    int f74028b = -1;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f74029c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public Function1<? super Integer, Unit> f74030d;

    /* renamed from: e  reason: collision with root package name */
    private final StorySceneLinearSnapHelper$onScrollListener$1 f74031e = new StorySceneLinearSnapHelper$onScrollListener$1(this);

    public final void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f74027a, false, 85925, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f74027a, false, 85925, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.attachToRecyclerView(recyclerView);
        this.f74029c = recyclerView;
        RecyclerView recyclerView2 = this.f74029c;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.f74031e);
        }
    }
}
