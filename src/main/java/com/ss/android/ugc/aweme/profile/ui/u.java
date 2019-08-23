package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.commerce.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.profile.d.c;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62976a;

    /* renamed from: b  reason: collision with root package name */
    private final EnterpriseTransformLayout f62977b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62978c;

    /* renamed from: d  reason: collision with root package name */
    private final d f62979d;

    /* renamed from: e  reason: collision with root package name */
    private final String f62980e;

    u(EnterpriseTransformLayout enterpriseTransformLayout, String str, d dVar, String str2) {
        this.f62977b = enterpriseTransformLayout;
        this.f62978c = str;
        this.f62979d = dVar;
        this.f62980e = str2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62976a, false, 68044, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62976a, false, 68044, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f62977b;
        String str = this.f62978c;
        d dVar = this.f62979d;
        String str2 = this.f62980e;
        Context context = view.getContext();
        String text = a.a() ? dVar.getText() : null;
        if (PatchProxy.isSupport(new Object[]{context, str, text}, null, c.f61385a, true, 69887, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, text}, null, c.f61385a, true, 69887, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (!g.a(context, str, true)) {
            g.a(context, str, text);
        }
        enterpriseTransformLayout.a(str2);
    }
}
