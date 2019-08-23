package com.ss.android.ugc.aweme.profile;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61533a;

    /* renamed from: b  reason: collision with root package name */
    private final View f61534b;

    /* renamed from: c  reason: collision with root package name */
    private final View f61535c;

    /* renamed from: d  reason: collision with root package name */
    private final View f61536d;

    public e(View view, View view2, View view3) {
        this.f61534b = view;
        this.f61535c = view2;
        this.f61536d = view3;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61533a, false, 67232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61533a, false, 67232, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f61534b;
        View view2 = this.f61535c;
        View view3 = this.f61536d;
        int a2 = u.a(58.0d);
        v.a(view, 8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams.height != a2) {
            layoutParams.height = a2;
            view2.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view3.getLayoutParams();
        layoutParams2.bottomMargin += u.a(11.0d);
        view3.setLayoutParams(layoutParams2);
    }
}
