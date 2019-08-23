package com.ss.android.ugc.aweme.follow.ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47846a;

    /* renamed from: b  reason: collision with root package name */
    private final TeenagerBaseFragment f47847b;

    a(TeenagerBaseFragment teenagerBaseFragment) {
        this.f47847b = teenagerBaseFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47846a, false, 44750, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47846a, false, 44750, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TeenagerBaseFragment teenagerBaseFragment = this.f47847b;
        if (teenagerBaseFragment.getActivity() != null && !teenagerBaseFragment.getActivity().isFinishing()) {
            r.a("enter_teen_mode", (Map) d.a().a("enter_from", teenagerBaseFragment.b()).f34114b);
            if (TimeLockRuler.isParentalPlatformContentFilterOn()) {
                ParentalPlatformManager.a((Activity) teenagerBaseFragment.getActivity());
            } else if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) x.a().l().c()).booleanValue()) {
                SetTimeLockActivity.a(teenagerBaseFragment.getActivity(), 1);
            }
        }
    }
}
