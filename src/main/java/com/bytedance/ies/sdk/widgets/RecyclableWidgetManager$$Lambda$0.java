package com.bytedance.ies.sdk.widgets;

import android.support.v4.view.AsyncLayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class RecyclableWidgetManager$$Lambda$0 implements AsyncLayoutInflater.OnInflateFinishedListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecyclableWidgetManager arg$1;
    private final LiveRecyclableWidget arg$2;
    private final ViewGroup arg$3;

    RecyclableWidgetManager$$Lambda$0(RecyclableWidgetManager recyclableWidgetManager, LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup) {
        this.arg$1 = recyclableWidgetManager;
        this.arg$2 = liveRecyclableWidget;
        this.arg$3 = viewGroup;
    }

    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), viewGroup}, this, changeQuickRedirect, false, 15201, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), viewGroup}, this, changeQuickRedirect, false, 15201, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        this.arg$1.lambda$load$0$RecyclableWidgetManager(this.arg$2, this.arg$3, view, i, viewGroup);
    }
}
