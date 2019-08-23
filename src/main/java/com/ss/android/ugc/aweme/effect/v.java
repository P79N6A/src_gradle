package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43780a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43781b;

    v(VEEffectHelper vEEffectHelper) {
        this.f43781b = vEEffectHelper;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43780a, false, 38723, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43780a, false, 38723, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VEEffectHelper vEEffectHelper = this.f43781b;
        vEEffectHelper.mViewPager.setCurrentItem(((Integer) view.getTag()).intValue());
    }
}
