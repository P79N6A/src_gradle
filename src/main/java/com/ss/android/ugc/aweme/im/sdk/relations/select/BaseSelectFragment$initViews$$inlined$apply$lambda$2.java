package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.relations.FloatingBarItemDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$initViews$2$2", "Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;", "onInterceptTouchEvent", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "motionEvent", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "p0", "onTouchEvent", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BaseSelectFragment$initViews$$inlined$apply$lambda$2 implements RecyclerView.OnItemTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseSelectFragment f52212b;

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
        RecyclerView recyclerView2 = recyclerView;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, motionEvent2}, this, f52211a, false, 52984, new Class[]{RecyclerView.class, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, motionEvent2}, this, f52211a, false, 52984, new Class[]{RecyclerView.class, MotionEvent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        Intrinsics.checkParameterIsNotNull(motionEvent2, "motionEvent");
    }

    BaseSelectFragment$initViews$$inlined$apply$lambda$2(BaseSelectFragment baseSelectFragment) {
        this.f52212b = baseSelectFragment;
    }

    public final boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
        RecyclerView recyclerView2 = recyclerView;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, motionEvent2}, this, f52211a, false, 52985, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2, motionEvent2}, this, f52211a, false, 52985, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        Intrinsics.checkParameterIsNotNull(motionEvent2, "motionEvent");
        FloatingBarItemDecoration floatingBarItemDecoration = this.f52212b.j;
        if (floatingBarItemDecoration == null || !floatingBarItemDecoration.f51978d) {
            return false;
        }
        if (motionEvent.getY() < UIUtils.dip2Px(recyclerView.getContext(), 32.0f)) {
            return true;
        }
        return false;
    }
}
