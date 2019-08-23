package com.ss.android.ugc.aweme.profile;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61355a;

    /* renamed from: b  reason: collision with root package name */
    private final View f61356b;

    /* renamed from: c  reason: collision with root package name */
    private final View f61357c;

    public d(View view, View view2) {
        this.f61356b = view;
        this.f61357c = view2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61355a, false, 67231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61355a, false, 67231, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f61356b;
        View view2 = this.f61357c;
        int a2 = u.a(58.0d);
        v.a(view, 8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams.height != a2) {
            layoutParams.height = a2;
            view2.setLayoutParams(layoutParams);
        }
    }
}
