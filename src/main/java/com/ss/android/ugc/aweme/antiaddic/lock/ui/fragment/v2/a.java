package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33602a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsAboutFragmentV2 f33603b;

    a(AbsAboutFragmentV2 absAboutFragmentV2) {
        this.f33603b = absAboutFragmentV2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33602a, false, 22020, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33602a, false, 22020, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f33603b.getActivity().onBackPressed();
    }
}
