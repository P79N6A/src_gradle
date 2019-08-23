package com.ss.android.ugc.aweme.effect;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.VEEffectAdapter;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43764a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectAdapter.ViewHolder f43765b;

    n(VEEffectAdapter.ViewHolder viewHolder) {
        this.f43765b = viewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43764a, false, 38662, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43764a, false, 38662, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        VEEffectAdapter.ViewHolder viewHolder = this.f43765b;
        int adapterPosition = viewHolder.getAdapterPosition();
        if (-1 != adapterPosition) {
            VEEffectAdapter.this.f43561b.a(5, adapterPosition, VEEffectAdapter.this.f43711e.get(adapterPosition));
        }
    }
}
