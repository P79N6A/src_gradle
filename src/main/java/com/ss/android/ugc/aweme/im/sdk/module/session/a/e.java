package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import java.util.HashMap;
import java.util.Map;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51918a;

    public final String O_() {
        return "message_helper_session";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 10;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51918a, false, 52480, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51919a;

                public final void a(Context context, a aVar, int i) {
                    String str;
                    Context context2 = context;
                    a aVar2 = aVar;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51919a, false, 52483, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51919a, false, 52483, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i2 == 1 || i2 == 2) {
                        if (aVar2.r == null) {
                            str = "";
                        } else {
                            str = aVar2.r.get("position");
                        }
                        int i3 = aVar2.m;
                        if (PatchProxy.isSupport(new Object[]{"message_assistant", str, Integer.valueOf(i3), (byte) 0}, null, z.f52670a, true, 53624, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{"message_assistant", str, Integer.valueOf(i3), (byte) 0}, null, z.f52670a, true, 53624, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("account_type", "message_assistant");
                            hashMap.put("client_order", str);
                            if (i3 > 0) {
                                hashMap.put("notice_type", "yellow_dot");
                            }
                            r.a("enter_official_message", (Map) hashMap);
                        }
                        e eVar = e.this;
                        if (PatchProxy.isSupport(new Object[0], eVar, e.f51918a, false, 52482, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], eVar, e.f51918a, false, 52482, new Class[0], Void.TYPE);
                        } else {
                            o.a().a(eVar.m);
                            k.a().a((a) eVar);
                        }
                        if (PatchProxy.isSupport(new Object[]{context2}, null, MessageHelperActivity.f51830a, true, 52366, new Class[]{Context.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context2}, null, MessageHelperActivity.f51830a, true, 52366, new Class[]{Context.class}, Void.TYPE);
                            return;
                        }
                        context2.startActivity(new Intent(context2, MessageHelperActivity.class));
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51918a, false, 52480, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51918a, false, 52479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51918a, false, 52479, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.axx);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840502);
    }

    public final int f() {
        if (!PatchProxy.isSupport(new Object[0], this, f51918a, false, 52481, new Class[0], Integer.TYPE)) {
            return this.m - o.a().b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51918a, false, 52481, new Class[0], Integer.TYPE)).intValue();
    }
}
