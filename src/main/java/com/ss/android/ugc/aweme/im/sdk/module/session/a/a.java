package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.session.IAction;

public class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51886a;

    /* renamed from: b  reason: collision with root package name */
    public C0604a f51887b = C0604a.NONE;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.a.a$a  reason: collision with other inner class name */
    public enum C0604a {
        NONE,
        MUSICIAN,
        ENTERPRISE,
        OTHER;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public int b() {
        return 0;
    }

    public IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51886a, false, 52460, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51888a;

                public final void a(Context context, com.ss.android.ugc.aweme.im.service.session.a aVar, int i) {
                    final boolean z;
                    int i2;
                    Context context2 = context;
                    com.ss.android.ugc.aweme.im.service.session.a aVar2 = aVar;
                    int i3 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51888a, false, 52462, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f51888a, false, 52462, new Class[]{Context.class, com.ss.android.ugc.aweme.im.service.session.a.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    String valueOf = String.valueOf(e.a(aVar.O_()));
                    if (i3 == 1) {
                        if (valueOf.equals(d.b())) {
                            z.a().a("", "to_myself");
                        } else {
                            z.a().a(valueOf, "no_stranger");
                            z.a().a(a.this.h, valueOf, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, "click_message", "message");
                        }
                        z.a().a("chat_notice_click", aVar2.m);
                        IMUser b2 = com.ss.android.ugc.aweme.im.sdk.d.e.a().b(valueOf);
                        if (b2 == null) {
                            b2 = new IMUser();
                            b2.setUid(valueOf);
                            if (a.this.i instanceof UrlModel) {
                                b2.setAvatarThumb((UrlModel) a.this.i);
                            }
                            b2.setNickName(a.this.j);
                        }
                        b2.setType(-1);
                        ChatRoomActivity.a(context2, b2, 3);
                    } else if (i3 == 2) {
                        j.f51270d.c(valueOf);
                        ay.f52524b.a(valueOf);
                        z.a().b(a.this.O_(), "message");
                        z.a().b(valueOf, "message", "click_head");
                    } else {
                        if (i3 == 0) {
                            final e eVar = new e(aVar.O_());
                            if (eVar.a() == null || !eVar.a().isStickTop()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                            String[] strArr = new String[2];
                            if (z) {
                                i2 = C0906R.string.apl;
                            } else {
                                i2 = C0906R.string.ayg;
                            }
                            strArr[0] = context2.getString(i2);
                            strArr[1] = context2.getString(C0906R.string.aqo);
                            final Context context3 = context;
                            final com.ss.android.ugc.aweme.im.service.session.a aVar4 = aVar;
                            AnonymousClass1 r0 = new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f51890a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51890a, false, 52463, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51890a, false, 52463, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    switch (i) {
                                        case 0:
                                            eVar.a(!z, (b<com.bytedance.im.core.d.b>) new b<com.bytedance.im.core.d.b>() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f51896a;

                                                public final /* bridge */ /* synthetic */ void a(Object obj) {
                                                }

                                                public final void a(com.bytedance.im.core.d.j jVar) {
                                                    int i;
                                                    if (PatchProxy.isSupport(new Object[]{jVar}, this, f51896a, false, 52464, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{jVar}, this, f51896a, false, 52464, new Class[]{com.bytedance.im.core.d.j.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (z) {
                                                        i = C0906R.string.apm;
                                                    } else {
                                                        i = C0906R.string.ayh;
                                                    }
                                                    com.bytedance.ies.dmt.ui.d.a.b(context3, i).a();
                                                }
                                            });
                                            return;
                                        case 1:
                                            com.bytedance.im.core.d.d.a();
                                            com.bytedance.im.core.d.d.b(aVar4.O_());
                                            z.a().b(aVar4.O_());
                                            break;
                                    }
                                }
                            };
                            aVar3.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) r0);
                            aVar3.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f51886a, false, 52460, new Class[0], IAction.class);
    }

    public IMUser c() {
        if (PatchProxy.isSupport(new Object[0], this, f51886a, false, 52461, new Class[0], IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[0], this, f51886a, false, 52461, new Class[0], IMUser.class);
        }
        return com.ss.android.ugc.aweme.im.sdk.d.e.a().b(String.valueOf(e.a(O_())));
    }
}
