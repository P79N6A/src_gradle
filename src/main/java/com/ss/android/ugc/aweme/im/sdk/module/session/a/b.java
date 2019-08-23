package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.c;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import java.util.HashMap;
import java.util.Map;

public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51901a;

    /* renamed from: b  reason: collision with root package name */
    public int f51902b;

    public final String O_() {
        return "flip_chat_helper_session";
    }

    public final int b() {
        return 17;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51901a, false, 52468, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51903a;

                public final void a(Context context, a aVar, int i) {
                    Context context2 = context;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f51903a, false, 52469, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar, Integer.valueOf(i)}, this, f51903a, false, 52469, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i2 == 1 || i2 == 2) {
                        c e2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e();
                        if (e2 != null) {
                            e2.openFFSdkSchema("sslocal://fusion_fuel/main");
                            z a2 = z.a();
                            boolean isFFSDKBind = e2.isFFSDKBind();
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isFFSDKBind ? (byte) 1 : 0)}, a2, z.f52670a, false, 53587, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                z zVar = a2;
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isFFSDKBind)}, zVar, z.f52670a, false, 53587, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("action_type", "click");
                                r.a("flipchat_message_entrance", (Map) hashMap);
                                HashMap hashMap2 = new HashMap();
                                if (isFFSDKBind) {
                                    hashMap2.put("need_login", "no");
                                } else {
                                    hashMap2.put("need_login", "yes");
                                }
                                r.a("flipchat_sdk_entrance_click", (Map) hashMap2);
                            }
                        }
                    } else if (i2 == 0) {
                        com.ss.android.ugc.aweme.common.ui.a aVar2 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                        aVar2.a((CharSequence[]) new String[]{context2.getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f51905a;

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51905a, false, 52470, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51905a, false, 52470, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                dialogInterface.dismiss();
                                if (i == 0) {
                                    c e2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e();
                                    if (e2 != null && e2.isFFSDKBind()) {
                                        com.ss.android.ugc.aweme.im.sdk.utils.r.a(1);
                                    }
                                    o.a().b(true);
                                    k.a().g();
                                }
                            }
                        });
                        aVar2.b();
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51901a, false, 52468, new Class[0], IAction.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f51901a, false, 52467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51901a, false, 52467, new Class[0], Void.TYPE);
            return;
        }
        this.j = GlobalContext.getContext().getString(C0906R.string.axu);
        this.i = com.ss.android.ugc.aweme.base.model.a.a(2130840115);
    }
}
