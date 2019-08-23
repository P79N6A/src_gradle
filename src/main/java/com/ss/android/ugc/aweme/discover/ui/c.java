package com.ss.android.ugc.aweme.discover.ui;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43156a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseDiscoveryAndSearchFragment f43157b;

    c(BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment) {
        this.f43157b = baseDiscoveryAndSearchFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f43156a, false, 37390, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f43156a, false, 37390, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment = this.f43157b;
        if (motionEvent.getAction() == 1) {
            baseDiscoveryAndSearchFragment.a(view2);
        }
        return false;
    }
}
