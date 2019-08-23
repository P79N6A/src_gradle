package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.f;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final class q extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58076a;

    public final String O_() {
        return "system_notice";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 4;
    }

    public final int i() {
        return 47;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58076a, false, 63232, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58077a;

                public final void a(Context context, a aVar, int i) {
                    String str;
                    Context context2 = context;
                    a aVar2 = aVar;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58077a, false, 63234, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58077a, false, 63234, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        NotificationDetailActivity.a(context2, 5, q.this.m);
                        q.this.f();
                        r.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("system_info"));
                        if (aVar2.r == null) {
                            str = "";
                        } else {
                            str = aVar2.r.get("position");
                        }
                        f.a("official_info", str, aVar2.m, true);
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                            aVar3.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58079a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58079a, false, 63235, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58079a, false, 63235, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        q.this.f();
                                        q.this.k();
                                        r.onEvent(MobClick.obtain().setEventName("message_delete").setLabelName("system_info"));
                                        r.a("hide_official_message", (Map) d.a().a("account_type", "official_info").f34114b);
                                        r.a("delete_official_message", (Map) d.a().a("account_type", "official_info").f34114b);
                                    }
                                }
                            });
                            aVar3.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58076a, false, 63232, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58076a, false, 63231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58076a, false, 63231, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.ay1);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840507);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58076a, false, 63233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58076a, false, 63233, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), 0));
    }
}
