package com.ss.android.ugc.aweme.profile;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61537a;

    /* renamed from: b  reason: collision with root package name */
    private final View f61538b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61539c;

    public f(View view, int i) {
        this.f61538b = view;
        this.f61539c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61537a, false, 67233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61537a, false, 67233, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f61538b;
        int i = this.f61539c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
