package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.g;

public final /* synthetic */ class dw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75780a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f75781b;

    /* renamed from: c  reason: collision with root package name */
    private final g f75782c;

    /* renamed from: d  reason: collision with root package name */
    private final Snackbar f75783d;

    dw(Context context, g gVar, Snackbar snackbar) {
        this.f75781b = context;
        this.f75782c = gVar;
        this.f75783d = snackbar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f75780a, false, 88553, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f75780a, false, 88553, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Context context = this.f75781b;
        g gVar = this.f75782c;
        Snackbar snackbar = this.f75783d;
        if (PatchProxy.isSupport(new Object[]{context, gVar}, null, dv.f75779a, true, 88551, new Class[]{Context.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, gVar}, null, dv.f75779a, true, 88551, new Class[]{Context.class, g.class}, Void.TYPE);
        } else if (gVar.isMulti) {
            Intent mainActivityIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getMainActivityIntent(context);
            mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            context.startActivity(mainActivityIntent);
        } else {
            IIMService a2 = b.a(false);
            if (a2 != null) {
                a2.startChat(context, gVar.contact);
            }
        }
        snackbar.dismiss();
    }
}
