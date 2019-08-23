package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.view.AsyncLayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/view/ViewGroup;", "onInflateFinished"}, k = 3, mv = {1, 1, 15})
final class WidgetManager$load$1 implements AsyncLayoutInflater.OnInflateFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f22905a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Widget f22906b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ViewGroup f22907c;

    public final void onInflateFinished(@NotNull View view, int i, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!this.f22905a.f22912c.isDetached() && !this.f22905a.f22912c.isRemoving() && this.f22905a.f22913d.getCurrentState() != Lifecycle.State.DESTROYED) {
            a aVar = this.f22905a;
            Widget widget = this.f22906b;
            ViewGroup viewGroup2 = this.f22907c;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "container");
            Intrinsics.checkParameterIsNotNull(view, "contentView");
            widget.f2335d = view;
            viewGroup2.addView(view);
            aVar.f22911b.add(widget);
            aVar.f22912c.a(widget);
            aVar.f22913d.addObserver(widget);
        }
    }
}
