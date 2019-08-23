package com.ss.android.ugc.aweme.views;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76467a;

    /* renamed from: b  reason: collision with root package name */
    private final HotRightSearchGuideView f76468b;

    i(HotRightSearchGuideView hotRightSearchGuideView) {
        this.f76468b = hotRightSearchGuideView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f76467a, false, 89523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76467a, false, 89523, new Class[0], Void.TYPE);
            return;
        }
        HotRightSearchGuideView hotRightSearchGuideView = this.f76468b;
        hotRightSearchGuideView.i.animate().alpha(1.0f).setDuration(300).start();
        hotRightSearchGuideView.i.animate().scaleX(0.7f).setDuration(300).start();
        hotRightSearchGuideView.i.animate().scaleY(0.7f).setDuration(300).start();
    }
}
