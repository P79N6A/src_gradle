package com.ss.android.ugc.aweme.feed.ui.masklayer;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46702a;

    /* renamed from: b  reason: collision with root package name */
    private final MaskLayerOptionsAdapter f46703b;

    c(MaskLayerOptionsAdapter maskLayerOptionsAdapter) {
        this.f46703b = maskLayerOptionsAdapter;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f46702a, false, 43400, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f46702a, false, 43400, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        MaskLayerOptionsAdapter maskLayerOptionsAdapter = this.f46703b;
        if (motionEvent.getAction() == 0) {
            maskLayerOptionsAdapter.a(view2, 100, 0.92f);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            maskLayerOptionsAdapter.a(view2, 60, 1.0f);
        }
        return false;
    }
}
