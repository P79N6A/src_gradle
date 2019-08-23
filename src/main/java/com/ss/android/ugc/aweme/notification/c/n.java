package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.a;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.utils.bg;

public final class n extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58071a;

    public final String O_() {
        return "star_atlas";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 15;
    }

    public final int i() {
        return 32;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58071a, false, 63227, new Class[0], IAction.class)) {
            return new o(this);
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58071a, false, 63227, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58071a, false, 63226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58071a, false, 63226, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.ayb);
        this.i = a.a(2130840505);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58071a, false, 63228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58071a, false, 63228, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new c(i(), 0));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, int i) {
        if (i == 1 || i == 2) {
            NotificationDetailActivity.a(context, 16, this.m);
            f();
            return;
        }
        if (i == 0) {
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(context);
            aVar.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new p(this));
            aVar.b();
        }
    }
}
