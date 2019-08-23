package com.ss.android.ugc.aweme.account.j;

import a.g;
import a.i;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.sdk.account.api.a.f;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.b;
import com.bytedance.sdk.account.api.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.sdk.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.terminal.e;
import com.ss.android.ugc.aweme.account.util.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.w;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31994a;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f31995e;

    /* renamed from: b  reason: collision with root package name */
    public IAccountUserService f31996b = w.a();

    /* renamed from: c  reason: collision with root package name */
    public String f31997c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHandler f31998d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: f  reason: collision with root package name */
    private d f31999f;

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f31994a, true, 20876, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f31994a, true, 20876, new Class[0], a.class);
        }
        if (f31995e == null) {
            synchronized (a.class) {
                if (f31995e == null) {
                    f31995e = new a();
                }
            }
        }
        return f31995e;
    }

    private d b() {
        if (PatchProxy.isSupport(new Object[0], this, f31994a, false, 20883, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f31994a, false, 20883, new Class[0], d.class);
        }
        if (this.f31999f == null) {
            this.f31999f = com.bytedance.sdk.account.d.d.a(w.b());
        }
        return this.f31999f;
    }

    private void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f31994a, false, 20881, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f31994a, false, 20881, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        try {
            try {
                a(message2.obj);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f31994a, false, 20880, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f31994a, false, 20880, new Class[]{Message.class}, Void.TYPE);
        } else if (message.obj instanceof Exception) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) message.obj;
                int errorCode = aVar.getErrorCode();
                if (errorCode != 14) {
                    switch (errorCode) {
                        case 9:
                            this.f31996b.setUserBanned();
                            break;
                    }
                } else {
                    this.f31996b.setUserLogicDelete(aVar.getErrorMsg());
                }
            }
            if (message.what == 123) {
                a(message);
            }
        } else {
            if (message.what == 123) {
                a(message);
            }
        }
    }

    private void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f31994a, false, 20882, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f31994a, false, 20882, new Class[]{Object.class}, Void.TYPE);
        } else if (obj2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) obj2;
            e.a(1, "checkout", aVar.getErrorCode(), aVar.getErrorMsg());
            w.a(false);
        } else {
            b().a((com.bytedance.sdk.account.api.call.a<b>) new com.bytedance.sdk.account.api.call.a<b>() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32006c;

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse) {
                    b bVar = (b) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f32006c, false, 20891, new Class[]{b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f32006c, false, 20891, new Class[]{b.class}, Void.TYPE);
                    } else if (bVar.success) {
                        AppLog.setUserId(0);
                        AppLog.setSessionKey(a.this.f31996b.getSessionKey());
                        com.ss.android.sdk.b.b a2 = com.ss.android.sdk.b.b.a();
                        Application b2 = w.b();
                        for (c cVar : a2.f30690a) {
                            cVar.o = false;
                        }
                        a2.a((Context) b2);
                        LocalBroadcastManager.getInstance(w.b()).sendBroadcast(new Intent("session_expire"));
                        a.this.f31996b.clear("logout");
                        if (a.this.f31996b.allUidList().size() <= 0 || !w.i().isEnableMultiAccountLogin()) {
                            e.a(0, "", 0, "");
                            if (PatchProxy.isSupport(new Object[0], null, w.f50726a, true, 19485, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, w.f50726a, true, 19485, new Class[0], Void.TYPE);
                            } else {
                                w.a().accountUserClear();
                            }
                            w.a(true);
                            w.f().c(ad.a().a("previous_uid", a.this.f31997c).f75487b);
                        } else {
                            String str = a.this.f31996b.allUidList().get(a.this.f31996b.allUidList().size() - 1);
                            String e2 = w.e();
                            String obj = w.a().allUidList().toString();
                            if (PatchProxy.isSupport(new Object[]{e2, str, obj, "after logout"}, null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20039, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{e2, str, obj, "after logout"}, null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20039, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(e2, "fromUid");
                                Intrinsics.checkParameterIsNotNull(str, "switchToUid");
                                Intrinsics.checkParameterIsNotNull("after logout", "from");
                                HashMap hashMap = new HashMap();
                                hashMap.put("event", "start switch account");
                                hashMap.put("from", "after logout");
                                hashMap.put(PushConstants.EXTRA, "from " + e2 + " to " + str + " with " + obj);
                                com.ss.android.ugc.aweme.account.i.b bVar2 = com.ss.android.ugc.aweme.account.i.b.f31986b;
                                String hashMap2 = hashMap.toString();
                                Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                                bVar2.c(hashMap2);
                            }
                            a.this.a(str, null, new f() {

                                /* renamed from: c  reason: collision with root package name */
                                public static ChangeQuickRedirect f32008c;

                                public final /* bridge */ /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                                }

                                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                                    com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                                    if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f32008c, false, 20892, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f32008c, false, 20892, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), (int) C0906R.string.abl).a();
                                }
                            });
                        }
                        a.this.f31997c = "";
                    } else {
                        e.a(1, "passport logout", bVar.error, bVar.errorMsg);
                        w.a(false);
                        if (!TextUtils.isEmpty(bVar.errorMsg)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) w.b(), bVar.errorMsg).a();
                        }
                    }
                }
            });
        }
    }

    public final void a(final String str, @Nullable Bundle bundle, @Nullable f fVar) {
        final Bundle bundle2;
        String str2 = str;
        final f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str2, bundle, fVar2}, this, f31994a, false, 20879, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle, fVar2}, this, f31994a, false, 20879, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE);
        } else if (!TextUtils.equals(str, this.f31996b.getCurUserId())) {
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = bundle;
            }
            if (this.f31996b.isLogin()) {
                bundle2.putString("previous_uid", this.f31996b.getCurUserId());
            } else {
                bundle2.putString("previous_uid", this.f31997c);
            }
            b().a(str, (f) new f() {

                /* renamed from: c  reason: collision with root package name */
                public static ChangeQuickRedirect f32002c;

                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                    com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{fVar}, this, f32002c, false, 20886, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar}, this, f32002c, false, 20886, new Class[]{com.bytedance.sdk.account.api.c.f.class}, Void.TYPE);
                        return;
                    }
                    try {
                        w.a(fVar.f22252a);
                        r.a(bundle2).b((g<TResult, i<TContinuationResult>>) new c<TResult,i<TContinuationResult>>(bundle2)).b(d.f32016b).b((g<TResult, i<TContinuationResult>>) new e<TResult,i<TContinuationResult>>(this, bundle2));
                    } catch (Exception unused) {
                    }
                    if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20040, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20040, new Class[0], Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "switch account successfully");
                        com.ss.android.ugc.aweme.account.i.b bVar = com.ss.android.ugc.aweme.account.i.b.f31986b;
                        String hashMap2 = hashMap.toString();
                        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                        bVar.c(hashMap2);
                    }
                    e.a(0, 0, "");
                    if (fVar2 != null) {
                        fVar2.g(fVar);
                    }
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                    int i2 = i;
                    com.bytedance.sdk.account.api.c.f fVar = (com.bytedance.sdk.account.api.c.f) baseApiResponse;
                    if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f32002c, false, 20887, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f32002c, false, 20887, new Class[]{com.bytedance.sdk.account.api.c.f.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i2 == 4 || i2 == 1) {
                        a.this.f31996b.delete(str, "switch error:1|4");
                    }
                    int i3 = fVar.error;
                    String str = fVar.errorMsg;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), str}, null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20041, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), str}, null, com.ss.android.ugc.aweme.account.i.b.f31985a, true, 20041, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "switch account failed");
                        hashMap.put("errorCode", String.valueOf(i3));
                        if (str == null) {
                            str = "";
                        }
                        hashMap.put("errorMsg", str);
                        com.ss.android.ugc.aweme.account.i.b bVar = com.ss.android.ugc.aweme.account.i.b.f31986b;
                        String hashMap2 = hashMap.toString();
                        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
                        bVar.c(hashMap2);
                    }
                    e.a(1, fVar.error, fVar.errorMsg);
                    w.a(false, (User) null);
                    if (fVar2 != null) {
                        fVar2.a(fVar, i2);
                    }
                }
            });
        }
    }
}
