package com.ss.android.ugc.aweme.commerce.card;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.models.h;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36820a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceCardViewPagerAdapter f36821b;

    /* renamed from: c  reason: collision with root package name */
    private final h f36822c;

    b(CommerceCardViewPagerAdapter commerceCardViewPagerAdapter, h hVar) {
        this.f36821b = commerceCardViewPagerAdapter;
        this.f36822c = hVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36820a, false, 28021, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36820a, false, 28021, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceCardViewPagerAdapter commerceCardViewPagerAdapter = this.f36821b;
        h hVar = this.f36822c;
        if (commerceCardViewPagerAdapter.f36806d != null) {
            commerceCardViewPagerAdapter.f36806d.a(hVar);
        }
    }
}
