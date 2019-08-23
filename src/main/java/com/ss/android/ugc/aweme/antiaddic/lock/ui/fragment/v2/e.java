package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.d;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33610a;

    /* renamed from: b  reason: collision with root package name */
    private final TeenagerLockOptionsFragmentV2 f33611b;

    e(TeenagerLockOptionsFragmentV2 teenagerLockOptionsFragmentV2) {
        this.f33611b = teenagerLockOptionsFragmentV2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33610a, false, 22051, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33610a, false, 22051, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f33611b.getContext() != null) {
            d.a("teen_mode", "appeal");
        }
    }
}
