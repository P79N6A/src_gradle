package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62538a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62539b;

    bo(MyProfileFragment myProfileFragment) {
        this.f62539b = myProfileFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62538a, false, 68569, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62538a, false, 68569, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MyProfileFragment myProfileFragment = this.f62539b;
        myProfileFragment.H();
        myProfileFragment.i(false);
    }
}
