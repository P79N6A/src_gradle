package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.Map;

public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f58043b;

    public final String O_() {
        return "live_assistant";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 18;
    }

    public final int i() {
        return 103;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58043b, false, 63199, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58044a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58044a, false, 63201, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f58044a, false, 63201, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1 || i2 == 2) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("scene_id", "1005");
                        hashMap.put("client_order", f.this.r.get("position"));
                        hashMap.put("account_type", "live_assistant");
                        r.a("enter_official_message", (Map) hashMap);
                        NotificationDetailActivity.a(context, 17, f.this.m);
                        f.this.f();
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context);
                            aVar2.a((CharSequence[]) new String[]{context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58046a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58046a, false, 63202, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58046a, false, 63202, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    if (i == 0) {
                                        f.this.k();
                                    }
                                }
                            });
                            aVar2.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58043b, false, 63199, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58043b, false, 63198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58043b, false, 63198, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.j = GlobalContext.getContext().getString(C0906R.string.aui);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130839008);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58043b, false, 63200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58043b, false, 63200, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new c(i(), 0));
    }
}
