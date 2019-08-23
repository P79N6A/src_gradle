package com.ss.android.ugc.aweme.im.sdk.j;

import a.g;
import a.i;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.im.core.a.a;
import com.bytedance.im.core.a.b;
import com.bytedance.im.core.b.c.a.c;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Response;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.h;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.utils.ag;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.p;
import com.ss.android.ugc.aweme.im.sdk.utils.q;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.websocket.b.b;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51701a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f51702b;

    /* renamed from: c  reason: collision with root package name */
    private b f51703c = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51709a;

        public final int a(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, f51709a, false, 54023, new Class[]{n.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{nVar}, this, f51709a, false, 54023, new Class[]{n.class}, Integer.TYPE)).intValue();
            }
            if (nVar.getMsgType() == 15) {
                com.ss.android.ugc.aweme.im.service.b abInterface = ((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface();
                if (abInterface != null && !abInterface.b()) {
                    return 1;
                }
            }
            return 0;
        }

        public final MessageBody a(MessageBody messageBody, int i) {
            MessageBody messageBody2 = messageBody;
            if (PatchProxy.isSupport(new Object[]{messageBody2, Integer.valueOf(i)}, this, f51709a, false, 54024, new Class[]{MessageBody.class, Integer.TYPE}, MessageBody.class)) {
                return (MessageBody) PatchProxy.accessDispatch(new Object[]{messageBody2, Integer.valueOf(i)}, this, f51709a, false, 54024, new Class[]{MessageBody.class, Integer.TYPE}, MessageBody.class);
            } else if (messageBody2 == null || messageBody2.message_type.intValue() == 50010 || messageBody2.message_type.intValue() == 60001) {
                return null;
            } else {
                if (messageBody2.message_type.intValue() > 50000) {
                    return messageBody2;
                }
                if (messageBody2.message_type.intValue() < 0 || messageBody2.message_type.intValue() > 1999) {
                    return null;
                }
                if (messageBody2.message_type.intValue() == 1002) {
                    try {
                        if (TextUtils.isEmpty(messageBody2.content) || ((SayHelloContent) l.a(messageBody2.content, SayHelloContent.class)).getType() != 100200) {
                            return messageBody2;
                        }
                        return null;
                    } catch (Exception unused) {
                        return messageBody2;
                    }
                }
                return messageBody2;
            }
        }
    };

    public final b e() {
        return this.f51703c;
    }

    public final void g() {
        if (!f51702b) {
            f51702b = true;
        }
    }

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f51701a, false, 54012, new Class[0], Long.TYPE)) {
            return com.ss.android.ugc.aweme.im.sdk.utils.d.d();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f51701a, false, 54012, new Class[0], Long.TYPE)).longValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f51701a, false, 54013, new Class[0], String.class)) {
            return o.a().j();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f51701a, false, 54013, new Class[0], String.class);
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f51701a, false, 54015, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51701a, false, 54015, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c.a().f3384d == b.a.CONNECTED) {
            return true;
        } else {
            return false;
        }
    }

    public final String c() {
        CharSequence charSequence;
        if (PatchProxy.isSupport(new Object[0], this, f51701a, false, 54014, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51701a, false, 54014, new Class[0], String.class);
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.im.sdk.utils.d.f52581a, true, 53335, new Class[0], CharSequence.class)) {
            charSequence = (CharSequence) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.im.sdk.utils.d.f52581a, true, 53335, new Class[0], CharSequence.class);
        } else {
            charSequence = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = "-1";
            }
        }
        return charSequence.toString();
    }

    public final Map<String, String> f() {
        if (PatchProxy.isSupport(new Object[0], this, f51701a, false, 54020, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f51701a, false, 54020, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(AppLog.getInstallId())) {
            hashMap.put("iid", AppLog.getInstallId());
        }
        hashMap.put("aid", String.valueOf(AppLog.getAppId()));
        String f2 = com.ss.android.ugc.aweme.im.sdk.utils.d.f();
        if (!TextUtils.isEmpty(f2)) {
            hashMap.put("sim_mcc_mnc", f2);
        }
        String e2 = com.ss.android.ugc.aweme.im.sdk.utils.d.e();
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("net_mcc_mnc", e2);
        }
        return hashMap;
    }

    public final void a(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f51701a, false, 54018, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f51701a, false, 54018, new Class[]{List.class}, Void.TYPE);
            return;
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && iUserService.isLogin() && list != null && !list.isEmpty()) {
            final n nVar = list.get(list.size() - 1);
            ag.a(new q<Pair<IMUser, BaseContent>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51704a;

                /* access modifiers changed from: private */
                /* renamed from: b */
                public Pair<IMUser, BaseContent> a() {
                    if (PatchProxy.isSupport(new Object[0], this, f51704a, false, 54021, new Class[0], Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[0], this, f51704a, false, 54021, new Class[0], Pair.class);
                    }
                    try {
                        String valueOf = String.valueOf(nVar.getSender());
                        IMUser b2 = e.a().b(valueOf);
                        if (b2 == null) {
                            UserStruct userStruct = (UserStruct) r.a().queryUser(valueOf, j.f51270d.b(valueOf)).get();
                            if (userStruct != null) {
                                b2 = IMUser.fromUser(userStruct.getUser());
                                e.a().a(b2);
                            }
                        }
                        if (b2 != null) {
                            BaseContent content = m.content(nVar);
                            if (content != null && !TextUtils.isEmpty(content.getMsgHint())) {
                                return new Pair<>(b2, content);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return null;
                }
            }, new p<Pair<IMUser, BaseContent>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51707a;

                public final /* synthetic */ void a(Object obj) {
                    Pair pair = (Pair) obj;
                    if (PatchProxy.isSupport(new Object[]{pair}, this, f51707a, false, 54022, new Class[]{Pair.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pair}, this, f51707a, false, 54022, new Class[]{Pair.class}, Void.TYPE);
                        return;
                    }
                    if (pair != null) {
                        com.ss.android.ugc.aweme.im.sdk.d.a.a().e().showNotification(((IMUser) pair.first).getNickName(), ((BaseContent) pair.second).getMsgHint());
                    }
                }
            });
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51701a, false, 54017, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51701a, false, 54017, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        h b2 = h.b();
        if (PatchProxy.isSupport(new Object[0], b2, h.f51240a, false, 51757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], b2, h.f51240a, false, 51757, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.im.sdk.utils.d.a()) {
            b2.f51242b.add(r.a().fetchMixInit(0, 0, 1).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new h.C0598h(b2), new h.i(b2)));
        }
    }

    public final void a(com.bytedance.im.core.b.c.a.b bVar, com.bytedance.im.core.b.c.a.a aVar) {
        com.bytedance.im.core.b.c.a.b bVar2 = bVar;
        com.bytedance.im.core.b.c.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2}, this, f51701a, false, 54019, new Class[]{com.bytedance.im.core.b.c.a.b.class, com.bytedance.im.core.b.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, aVar2}, this, f51701a, false, 54019, new Class[]{com.bytedance.im.core.b.c.a.b.class, com.bytedance.im.core.b.c.a.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{bVar2, aVar2}, null, r.f52611a, true, 53474, new Class[]{com.bytedance.im.core.b.c.a.b.class, com.bytedance.im.core.b.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, aVar2}, null, r.f52611a, true, 53474, new Class[]{com.bytedance.im.core.b.c.a.b.class, com.bytedance.im.core.b.c.a.a.class}, Void.TYPE);
            return;
        }
        r.f52612b.postIMSDK(bVar2.f21140a, bVar2.f21143d, bVar2.f21141b).a((g<TResult, TContinuationResult>) new g<Response, Void>(aVar2) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52633a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.im.core.b.c.a.a f52634b;

            {
                this.f52634b = r1;
            }

            public final /* synthetic */ Object then(i iVar) throws Exception {
                c cVar;
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52633a, false, 53483, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52633a, false, 53483, new Class[]{i.class}, Void.class);
                }
                if (!iVar.b() || iVar.e() == null) {
                    this.f52634b.a(iVar.f(), "", "", -1000);
                } else {
                    com.bytedance.im.core.b.c.a.a aVar = this.f52634b;
                    Response response = (Response) iVar.e();
                    if (PatchProxy.isSupport(new Object[]{response}, null, r.f52611a, true, 53475, new Class[]{Response.class}, c.class)) {
                        cVar = (c) PatchProxy.accessDispatch(new Object[]{response}, null, r.f52611a, true, 53475, new Class[]{Response.class}, c.class);
                    } else {
                        c.a aVar2 = new c.a();
                        aVar2.f21149a.f21145a = 200;
                        aVar2.f21149a.f21146b = "";
                        aVar2.f21149a.f21148d = response;
                        cVar = aVar2.f21149a;
                    }
                    aVar.a(cVar, "", "", 200);
                }
                return null;
            }
        }, (Executor) i.f1051a);
    }

    public final void a(int i, long j, String str, byte[] bArr) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), str, bArr}, this, f51701a, false, 54016, new Class[]{Integer.TYPE, Long.TYPE, String.class, byte[].class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), new Long(j2), str, bArr};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f51701a, false, 54016, new Class[]{Integer.TYPE, Long.TYPE, String.class, byte[].class}, Void.TYPE);
            return;
        }
        c a2 = c.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), str, bArr}, a2, c.f3379a, false, 54002, new Class[]{Integer.TYPE, Long.TYPE, String.class, byte[].class}, Void.TYPE)) {
            Object[] objArr3 = {Integer.valueOf(i), new Long(j2), str, bArr};
            ChangeQuickRedirect changeQuickRedirect = c.f3379a;
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect, false, 54002, new Class[]{Integer.TYPE, Long.TYPE, String.class, byte[].class}, Void.TYPE);
            return;
        }
        if (a2.f3384d == b.a.CONNECTED) {
            HashMap hashMap = new HashMap();
            hashMap.put("cmd", String.valueOf(i));
            hashMap.put("seq_id", String.valueOf(j));
            com.ss.android.websocket.b.a.e eVar = new com.ss.android.websocket.b.a.e(a2.b(), 5, j, 0, 1, bArr, "pb", str, hashMap);
            org.greenrobot.eventbus.c.a().d(new com.ss.android.websocket.b.a.d(a2.b(), eVar));
        }
    }
}
