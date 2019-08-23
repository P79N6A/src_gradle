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

public final class m extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f58066b;

    public final String O_() {
        return "shopping_assistant";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 5;
    }

    public final int i() {
        return 16;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58066b, false, 63222, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58067a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58067a, false, 63224, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58067a, false, 63224, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        r.a("click_commerce_message", (Map) d.a().a("click_type", "shopping_assistant_message").f34114b);
                        m.this.j();
                        m.this.f();
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context);
                            aVar2.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58069a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58069a, false, 63225, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58069a, false, 63225, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        m.this.k();
                                    }
                                }
                            });
                            aVar2.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58066b, false, 63222, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58066b, false, 63221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58066b, false, 63221, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.j = GlobalContext.getContext().getString(C0906R.string.axz);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840504);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58066b, false, 63223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58066b, false, 63223, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), 0));
    }
}
