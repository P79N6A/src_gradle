package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.utils.bg;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58017a;

    public final String O_() {
        return "ad_helper";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 7;
    }

    public final int i() {
        return 21;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58017a, false, 63179, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58018a;

                public final void a(Context context, com.ss.android.ugc.aweme.im.service.session.a aVar, int i) {
                    Context context2 = context;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58018a, false, 63181, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58018a, false, 63181, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        a.this.f();
                        NotificationDetailActivity.a(context, 7, a.this.m);
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context);
                            aVar2.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58020a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58020a, false, 63182, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58020a, false, 63182, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        a.this.k();
                                    }
                                }
                            });
                            aVar2.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58017a, false, 63179, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58017a, false, 63178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58017a, false, 63178, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.axj);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840498);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58017a, false, 63180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58017a, false, 63180, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), -1));
    }
}
