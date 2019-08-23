package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.model.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final class i extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f58056b;

    public final String O_() {
        return "poi_life_assistant_session";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 16;
    }

    public final int i() {
        return 33;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58056b, false, 63212, new Class[0], IAction.class)) {
            return new j(this);
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58056b, false, 63212, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58056b, false, 63211, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58056b, false, 63211, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.j = GlobalContext.getContext().getString(C0906R.string.au7);
        this.i = a.a(2130840499);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58056b, false, 63213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58056b, false, 63213, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), 0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i == 0) {
            f();
            k();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, int i) {
        if (i == 1 || i == 2) {
            r.a("enter_life_message", (Map) d.a().a("account_type", "poi_life").f34114b);
            j();
            f();
            return;
        }
        if (i == 0) {
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(context);
            aVar.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new k(this));
            aVar.b();
        }
    }
}
