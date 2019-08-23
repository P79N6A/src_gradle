package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59656a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiBannerViewHolder f59657b;

    public a(PoiBannerViewHolder poiBannerViewHolder) {
        this.f59657b = poiBannerViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59656a, false, 64792, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59656a, false, 64792, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiBannerViewHolder poiBannerViewHolder = this.f59657b;
        if (poiBannerViewHolder.f59489c != null) {
            poiBannerViewHolder.f59489c.a();
        }
    }
}
