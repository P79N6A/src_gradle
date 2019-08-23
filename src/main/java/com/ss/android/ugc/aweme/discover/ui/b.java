package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43154a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseDiscoveryAndSearchFragment f43155b;

    b(BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment) {
        this.f43155b = baseDiscoveryAndSearchFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43154a, false, 37389, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43154a, false, 37389, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        BaseDiscoveryAndSearchFragment baseDiscoveryAndSearchFragment = this.f43155b;
        baseDiscoveryAndSearchFragment.mSearchInputView.setText("");
        baseDiscoveryAndSearchFragment.mSearchInputView.setCursorVisible(false);
        KeyboardUtils.c(baseDiscoveryAndSearchFragment.mSearchInputView);
    }
}
