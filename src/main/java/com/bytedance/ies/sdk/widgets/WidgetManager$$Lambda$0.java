package com.bytedance.ies.sdk.widgets;

import android.support.v4.view.AsyncLayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class WidgetManager$$Lambda$0 implements AsyncLayoutInflater.OnInflateFinishedListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WidgetManager arg$1;
    private final Widget arg$2;
    private final ViewGroup arg$3;

    WidgetManager$$Lambda$0(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.arg$1 = widgetManager;
        this.arg$2 = widget;
        this.arg$3 = viewGroup;
    }

    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), viewGroup}, this, changeQuickRedirect, false, 15228, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), viewGroup}, this, changeQuickRedirect, false, 15228, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$load$0$WidgetManager(this.arg$2, this.arg$3, view, i, viewGroup);
    }
}
