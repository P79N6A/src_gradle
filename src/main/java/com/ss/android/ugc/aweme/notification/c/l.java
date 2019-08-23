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

public final class l extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58061a;

    public final String O_() {
        return "robot_1";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 3;
    }

    public final int i() {
        return 46;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58061a, false, 63217, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58062a;

                public final void a(Context context, a aVar, int i) {
                    String str;
                    Context context2 = context;
                    a aVar2 = aVar;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58062a, false, 63219, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58062a, false, 63219, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        l.this.f();
                        NotificationDetailActivity.a(context2, 4, l.this.m);
                        r.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("official"));
                        if (aVar2.r == null) {
                            str = "";
                        } else {
                            str = aVar2.r.get("position");
                        }
                        f.a("douyin_assistant", str, aVar2.m, false);
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                            aVar3.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58064a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58064a, false, 63220, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58064a, false, 63220, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        l.this.f();
                                        l.this.k();
                                        r.onEvent(MobClick.obtain().setEventName("message_delete").setLabelName("official"));
                                        r.a("delete_official_message", (Map) d.a().a("account_type", "douyin_assistant").f34114b);
                                    }
                                }
                            });
                            aVar3.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58061a, false, 63217, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58061a, false, 63216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58061a, false, 63216, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.axy);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840503);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58061a, false, 63218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58061a, false, 63218, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), -1));
    }
}
