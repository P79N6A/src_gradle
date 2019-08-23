package com.ss.android.ugc.aweme.poi.ui.publish;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.link.a;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60858a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60859b;

    c(b bVar) {
        this.f60859b = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60858a, false, 66661, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60858a, false, 66661, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b bVar = this.f60859b;
        if (bVar.f60853e.i) {
            com.ss.android.ugc.aweme.commercialize.link.c.b("video_post_page");
            a.a(bVar.a(), "publish");
            return;
        }
        if (bVar.i() || bVar.j() || bVar.k()) {
            UIUtils.displayToast((Context) bVar.a(), bVar.a().getString(C0906R.string.cct));
        }
    }
}
