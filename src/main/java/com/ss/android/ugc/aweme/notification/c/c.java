package com.ss.android.ugc.aweme.notification.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.session.IAction;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.d.a;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58025a;

    /* renamed from: b  reason: collision with root package name */
    public long f58026b;

    /* renamed from: c  reason: collision with root package name */
    public String f58027c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58028e;

    public final String O_() {
        return "game_helper";
    }

    public final int P_() {
        return 1;
    }

    public final int b() {
        return 6;
    }

    public final void d() {
    }

    public final int i() {
        return 999;
    }

    public final IAction a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58025a, false, 63185, new Class[0], IAction.class)) {
            return new IAction() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58029a;

                public final void a(Context context, a aVar, int i) {
                    String str;
                    String str2;
                    Context context2 = context;
                    final a aVar2 = aVar;
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58029a, false, 63189, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, aVar2, Integer.valueOf(i)}, this, f58029a, false, 63189, new Class[]{Context.class, a.class, Integer.TYPE}, Void.TYPE);
                    } else if (i2 == 1) {
                        c.this.f();
                        c cVar = c.this;
                        Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                        if (PatchProxy.isSupport(new Object[]{a2}, cVar, c.f58025a, false, 63186, new Class[]{Activity.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{a2}, cVar, c.f58025a, false, 63186, new Class[]{Activity.class}, Void.TYPE);
                        } else {
                            d a3 = d.a().a("vid", cVar.q).a("position", "game_center_entry");
                            if (cVar.m > 0) {
                                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                            } else {
                                str = PushConstants.PUSH_TYPE_NOTIFY;
                            }
                            d a4 = a3.a("is_red_dot", str);
                            if (TextUtils.isEmpty(cVar.k)) {
                                str2 = PushConstants.PUSH_TYPE_NOTIFY;
                            } else {
                                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                            }
                            r.a("ad_game_center_click", (Map) a4.a("is_tag", str2).a("plan_id", String.valueOf(cVar.p)).f34114b);
                            boolean a5 = ((d) com.ss.android.ugc.aweme.base.sharedpref.c.a(GlobalContext.getContext(), d.class)).a(false);
                            if (!TextUtils.isEmpty(cVar.f58027c) && a2 != null) {
                                Intent intent = new Intent(a2, CrossPlatformActivity.class);
                                i iVar = new i(cVar.f58027c);
                                iVar.a("stick_game", a5 ? 1 : 0);
                                intent.setData(Uri.parse(iVar.a()));
                                intent.putExtra(PushConstants.TITLE, GlobalContext.getContext().getResources().getString(C0906R.string.aqv));
                                intent.putExtra("enter_from", "game_helper");
                                a2.startActivity(intent);
                            }
                        }
                        r.a("message_click", (Map) d.a().a("message_type", "game_assistant").f34114b);
                    } else if (i2 == 2) {
                        h a6 = h.a();
                        a6.a("aweme://user/profile/" + c.this.f58026b);
                    } else {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(context2);
                            final boolean a7 = ((d) com.ss.android.ugc.aweme.base.sharedpref.c.a(GlobalContext.getContext(), d.class)).a(false);
                            aVar3.a((CharSequence[]) a7 ? new String[]{context.getResources().getString(C0906R.string.az8)} : new String[]{context.getResources().getString(C0906R.string.az9), context.getResources().getString(C0906R.string.aqo)}, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f58031a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58031a, false, 63190, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58031a, false, 63190, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                    switch (i) {
                                        case 0:
                                            if (a7) {
                                                ((d) com.ss.android.ugc.aweme.base.sharedpref.c.a(GlobalContext.getContext(), d.class)).b(false);
                                                c.this.o = 0;
                                                b.a().updateNoticeSession(aVar2);
                                                r.a("message_remove_top", (Map) d.a().a("message_type", "game_assistant").f34114b);
                                                return;
                                            }
                                            com.ss.android.ugc.aweme.notification.d.a a2 = com.ss.android.ugc.aweme.notification.d.a.a();
                                            AnonymousClass1 r1 = new a.e() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f58035a;

                                                public final void a() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f58035a, false, 63191, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f58035a, false, 63191, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    c.this.f();
                                                    b.a().deleteNoticeSession(aVar2);
                                                }

                                                public final void a(Exception exc) {
                                                    if (PatchProxy.isSupport(new Object[]{exc}, this, f58035a, false, 63192, new Class[]{Exception.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{exc}, this, f58035a, false, 63192, new Class[]{Exception.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.bga);
                                                }
                                            };
                                            if (PatchProxy.isSupport(new Object[]{(byte) 0, r1}, a2, com.ss.android.ugc.aweme.notification.d.a.f58093a, false, 63246, new Class[]{Boolean.TYPE, a.e.class}, Void.TYPE)) {
                                                Object[] objArr = {(byte) 0, r1};
                                                ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.notification.d.a.f58093a;
                                                com.ss.android.ugc.aweme.notification.d.a aVar = a2;
                                                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                                                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect2, false, 63246, new Class[]{Boolean.TYPE, a.e.class}, Void.TYPE);
                                            } else {
                                                a2.f58096d = r1;
                                                m.a().a(a2.f58094b, new Callable<BaseResponse>(false) {

                                                    /* renamed from: a  reason: collision with root package name */
                                                    public static ChangeQuickRedirect f58107a;

                                                    /* renamed from: b  reason: collision with root package name */
                                                    final /* synthetic */ boolean f58108b;

                                                    /* access modifiers changed from: private */
                                                    /* renamed from: a */
                                                    public BaseResponse call() throws Exception {
                                                        if (PatchProxy.isSupport(new Object[0], this, f58107a, false, 63254, new Class[0], BaseResponse.class)) {
                                                            return (BaseResponse) PatchProxy.accessDispatch(new Object[0], this, f58107a, false, 63254, new Class[0], BaseResponse.class);
                                                        }
                                                        try {
                                                            return NoticeApiManager.a(this.f58108b ? 1 : 0);
                                                        } catch (ExecutionException e2) {
                                                            a.this.f58096d.a(e2);
                                                            a.this.f58096d = null;
                                                            throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                                                        }
                                                    }

                                                    {
                                                        this.f58108b = r2;
                                                    }
                                                }, 9984);
                                            }
                                            r.a("message_block", (Map) d.a().a("message_type", "game_assistant").f34114b);
                                            return;
                                        case 1:
                                            c.this.f();
                                            c.this.k();
                                            break;
                                    }
                                }
                            });
                            aVar3.b();
                        }
                    }
                }
            };
        }
        return (IAction) PatchProxy.accessDispatch(new Object[0], this, f58025a, false, 63185, new Class[0], IAction.class);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58025a, false, 63188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58025a, false, 63188, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        bg.a(new com.ss.android.ugc.aweme.message.b.c(i(), -1));
    }

    public final void g() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f58025a, false, 63187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58025a, false, 63187, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f58028e) {
            d a2 = d.a().a("vid", this.q).a("position", "game_center_entry");
            if (this.m > 0) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            d a3 = a2.a("is_red_dot", str);
            if (TextUtils.isEmpty(this.k)) {
                str2 = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            r.a("ad_game_center_show", (Map) a3.a("is_tag", str2).a("plan_id", String.valueOf(this.p)).f34114b);
        }
        this.f58028e = true;
    }
}
