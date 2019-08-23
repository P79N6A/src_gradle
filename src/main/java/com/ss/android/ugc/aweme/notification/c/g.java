package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final class g extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f58048b;

    public final String O_() {
        return "luban_order";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 14;
    }

    public final int i() {
        return 29;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58048b, false, 63204, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58049a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58049a, false, 63206, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58049a, false, 63206, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        r.a("click_commerce_message", (Map) d.a().a("click_type", "ad_order_assistant_message").f34114b);
                        g.this.j();
                        g.this.f();
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context);
                            aVar2.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58051a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58051a, false, 63207, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58051a, false, 63207, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        g.this.k();
                                    }
                                }
                            });
                            aVar2.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58048b, false, 63204, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58048b, false, 63203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58048b, false, 63203, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.j = GlobalContext.getContext().getString(C0906R.string.aun);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840501);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58048b, false, 63205, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58048b, false, 63205, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new c(i(), 0));
    }
}
