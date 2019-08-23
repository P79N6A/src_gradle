package com.ss.android.ugc.aweme.poi.ui;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60681a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsPoiAwemeFeedFragment f60682b;

    d(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment) {
        this.f60682b = absPoiAwemeFeedFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f60681a, false, 65902, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f60681a, false, 65902, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.f60682b.s = true;
        return false;
    }
}
