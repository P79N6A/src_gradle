package com.ss.android.ugc.aweme.sdk;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.sdk.bean.a;
import com.ss.android.ugc.aweme.sdk.bean.b;
import com.ss.android.ugc.aweme.sdk.bean.c;
import com.ss.android.ugc.aweme.sdk.wallet.app.WalletSDKContext;
import com.ss.android.ugc.aweme.sdk.wallet.jsbridge.AuthJavaMethod;
import com.ss.android.ugc.aweme.sdk.wallet.jsbridge.ChargeJavaMethod;
import com.ss.android.ugc.aweme.sdk.wallet.module.pay.PayFactory;
import com.ss.android.ugc.aweme.sdk.wallet.module.pay.WXPay;
import com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AuthFactory;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class WalletService implements IWalletService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IWXAPIEventHandler iwxapiEventHandler = new IWXAPIEventHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63688a;

        public final void onReq(BaseReq baseReq) {
        }

        public final void onResp(BaseResp baseResp) {
            BaseResp baseResp2 = baseResp;
            if (PatchProxy.isSupport(new Object[]{baseResp2}, this, f63688a, false, 71045, new Class[]{BaseResp.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResp2}, this, f63688a, false, 71045, new Class[]{BaseResp.class}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (WXPay.getWXPayResultCallback() != null) {
                WXPay.getWXPayResultCallback().onPayResult(baseResp2.errCode, WalletSDKContext.getInstance().getCurrentOrderId());
            }
        }
    };

    public void setSetting(c cVar) {
    }

    public void clearWallet() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71039, new Class[0], Void.TYPE);
            return;
        }
        c a2 = c.a();
        if (a2.f63710b != null) {
            a2.f63710b.f63706a = 0;
        }
    }

    public long getAvailableCurrency() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71037, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71037, new Class[0], Long.TYPE)).longValue();
        }
        c a2 = c.a();
        if (a2.f63710b == null) {
            return 0;
        }
        return a2.f63710b.f63706a;
    }

    public i<Long> syncWallet() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71035, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71035, new Class[0], i.class);
        }
        c a2 = c.a();
        if (!PatchProxy.isSupport(new Object[0], a2, c.f63708a, false, 71030, new Class[0], i.class)) {
            return i.a((Callable<TResult>) new Callable<b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63713a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.ss.android.ugc.aweme.sdk.api.WalletApi} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                    /*
                        r12 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f63713a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.bean.b> r7 = com.ss.android.ugc.aweme.sdk.bean.b.class
                        r4 = 0
                        r5 = 71032(0x11578, float:9.9537E-41)
                        r2 = r12
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0028
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f63713a
                        r5 = 0
                        r6 = 71032(0x11578, float:9.9537E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.bean.b> r8 = com.ss.android.ugc.aweme.sdk.bean.b.class
                        r3 = r12
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        com.ss.android.ugc.aweme.sdk.bean.b r0 = (com.ss.android.ugc.aweme.sdk.bean.b) r0
                        return r0
                    L_0x0028:
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r2 = 0
                        com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.sdk.api.a.f63702a
                        r4 = 1
                        r5 = 71047(0x11587, float:9.9558E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.bean.b> r7 = com.ss.android.ugc.aweme.sdk.bean.b.class
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x004f
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r3 = 0
                        com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.sdk.api.a.f63702a
                        r5 = 1
                        r6 = 71047(0x11587, float:9.9558E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.bean.b> r8 = com.ss.android.ugc.aweme.sdk.bean.b.class
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        com.ss.android.ugc.aweme.sdk.bean.b r0 = (com.ss.android.ugc.aweme.sdk.bean.b) r0
                        return r0
                    L_0x004f:
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r2 = 0
                        com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.sdk.api.a.f63702a
                        r4 = 1
                        r5 = 71046(0x11586, float:9.9557E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.api.WalletApi> r7 = com.ss.android.ugc.aweme.sdk.api.WalletApi.class
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        r2 = 1
                        if (r1 == 0) goto L_0x0078
                        java.lang.Object[] r3 = new java.lang.Object[r0]
                        r4 = 0
                        com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.sdk.api.a.f63702a
                        r6 = 1
                        r7 = 71046(0x11586, float:9.9557E-41)
                        java.lang.Class[] r8 = new java.lang.Class[r0]
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.api.WalletApi> r9 = com.ss.android.ugc.aweme.sdk.api.WalletApi.class
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                        com.ss.android.ugc.aweme.sdk.api.WalletApi r0 = (com.ss.android.ugc.aweme.sdk.api.WalletApi) r0
                        goto L_0x0103
                    L_0x0078:
                        r1 = 0
                        java.lang.ref.WeakReference<com.ss.android.ugc.aweme.sdk.api.WalletApi> r3 = com.ss.android.ugc.aweme.sdk.api.a.f63703b
                        java.lang.Object r3 = r3.get()
                        if (r3 != 0) goto L_0x00fb
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r3 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r4 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
                        java.lang.Object r3 = r3.getService(r4)
                        com.ss.android.ugc.aweme.framework.services.IRetrofitService r3 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r3
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.IWalletMainProxy> r5 = com.ss.android.ugc.aweme.sdk.IWalletMainProxy.class
                        java.lang.Object r4 = r4.getService(r5)
                        com.ss.android.ugc.aweme.sdk.IWalletMainProxy r4 = (com.ss.android.ugc.aweme.sdk.IWalletMainProxy) r4
                        if (r3 == 0) goto L_0x00f9
                        java.lang.String r1 = r4.getHost()
                        java.lang.Object[] r4 = new java.lang.Object[r2]
                        r4[r0] = r1
                        r5 = 0
                        com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.sdk.b.f63704a
                        r7 = 1
                        r8 = 71026(0x11572, float:9.9529E-41)
                        java.lang.Class[] r9 = new java.lang.Class[r2]
                        java.lang.Class<java.lang.String> r10 = java.lang.String.class
                        r9[r0] = r10
                        java.lang.Class<java.lang.String> r10 = java.lang.String.class
                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                        if (r4 == 0) goto L_0x00d2
                        java.lang.Object[] r5 = new java.lang.Object[r2]
                        r5[r0] = r1
                        r6 = 0
                        com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.sdk.b.f63704a
                        r8 = 1
                        r9 = 71026(0x11572, float:9.9529E-41)
                        java.lang.Class[] r10 = new java.lang.Class[r2]
                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                        r10[r0] = r1
                        java.lang.Class<java.lang.String> r11 = java.lang.String.class
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
                        java.lang.String r0 = (java.lang.String) r0
                        goto L_0x00e5
                    L_0x00d2:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r4 = "https://"
                        r0.<init>(r4)
                        r0.append(r1)
                        java.lang.String r1 = "/"
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                    L_0x00e5:
                        com.ss.android.ugc.aweme.framework.services.IRetrofit r0 = r3.createNewRetrofit(r0)
                        java.lang.Class<com.ss.android.ugc.aweme.sdk.api.WalletApi> r1 = com.ss.android.ugc.aweme.sdk.api.WalletApi.class
                        java.lang.Object r0 = r0.create(r1)
                        r1 = r0
                        com.ss.android.ugc.aweme.sdk.api.WalletApi r1 = (com.ss.android.ugc.aweme.sdk.api.WalletApi) r1
                        java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                        r0.<init>(r1)
                        com.ss.android.ugc.aweme.sdk.api.a.f63703b = r0
                    L_0x00f9:
                        r0 = r1
                        goto L_0x0103
                    L_0x00fb:
                        java.lang.ref.WeakReference<com.ss.android.ugc.aweme.sdk.api.WalletApi> r0 = com.ss.android.ugc.aweme.sdk.api.a.f63703b
                        java.lang.Object r0 = r0.get()
                        com.ss.android.ugc.aweme.sdk.api.WalletApi r0 = (com.ss.android.ugc.aweme.sdk.api.WalletApi) r0
                    L_0x0103:
                        com.google.common.util.concurrent.q r0 = r0.getMyWallet(r2)
                        java.lang.Object r0 = r0.get()
                        com.ss.android.ugc.aweme.sdk.bean.b r0 = (com.ss.android.ugc.aweme.sdk.bean.b) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sdk.c.AnonymousClass2.call():java.lang.Object");
                }
            }).a((g<TResult, TContinuationResult>) new g<b, Long>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63711a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f63711a, false, 71031, new Class[]{i.class}, Long.class)) {
                        return (Long) PatchProxy.accessDispatch(new Object[]{iVar}, this, f63711a, false, 71031, new Class[]{i.class}, Long.class);
                    } else if (iVar.d() || iVar.c()) {
                        return -1L;
                    } else {
                        b bVar = (b) iVar.e();
                        c.this.f63710b = bVar.f63707a;
                        return Long.valueOf(bVar.f63707a.f63706a);
                    }
                }
            }, i.f1052b);
        }
        return (i) PatchProxy.accessDispatch(new Object[0], a2, c.f63708a, false, 71030, new Class[0], i.class);
    }

    public void openWallet(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71040, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71040, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.openWallet(activity2);
        }
    }

    public void syncWallet(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 71036, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 71036, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        a aVar = c.a().f63710b;
        if (aVar != null) {
            aVar.f63706a = j2;
        }
    }

    public void cashOut(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, changeQuickRedirect, false, 71042, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, changeQuickRedirect, false, 71042, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.cashOut(context2, str2);
        }
    }

    public void onWxIntent(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 71038, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 71038, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        WalletSDKContext.getInstance().createWXAPI(context2).handleIntent(intent2, this.iwxapiEventHandler);
    }

    public Map<String, d> buildJavaMethods(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        WeakReference<Context> weakReference2 = weakReference;
        com.bytedance.ies.f.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71034, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71034, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Map.class);
        }
        a a2 = a.a().a(aVar2).b(new AuthJavaMethod(weakReference2, aVar2)).a((d) new ChargeJavaMethod(aVar2)).a();
        com.ss.android.ugc.aweme.sdk.a.a a3 = com.ss.android.ugc.aweme.sdk.a.a.a();
        if (PatchProxy.isSupport(new Object[]{a2}, a3, com.ss.android.ugc.aweme.sdk.a.a.f63701a, false, 71052, new Class[]{a.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{a2}, a3, com.ss.android.ugc.aweme.sdk.a.a.f63701a, false, 71052, new Class[]{a.class}, Map.class);
        }
        if (PatchProxy.isSupport(new Object[0], a2, a.f63690a, false, 71023, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], a2, a.f63690a, false, 71023, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(a2.f63694e.first, a2.f63694e.second);
        hashMap.put(a2.f63695f.first, a2.f63695f.second);
        if (a2.g != null && !a2.g.isEmpty()) {
            hashMap.putAll(a2.g);
        }
        return hashMap;
    }

    public void openWallet(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, changeQuickRedirect, false, 71041, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, changeQuickRedirect, false, 71041, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.openWallet(activity2, str2);
        }
    }

    public void init(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        WeakReference<Context> weakReference2 = weakReference;
        com.bytedance.ies.f.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71033, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{weakReference2, aVar2}, this, changeQuickRedirect, false, 71033, new Class[]{WeakReference.class, com.bytedance.ies.f.a.a.class}, Void.TYPE);
            return;
        }
        a a2 = a.a().a(aVar2).b(new AuthJavaMethod(weakReference2, aVar2)).a((d) new ChargeJavaMethod(aVar2)).a();
        com.ss.android.ugc.aweme.sdk.a.a a3 = com.ss.android.ugc.aweme.sdk.a.a.a();
        if (PatchProxy.isSupport(new Object[]{a2}, a3, com.ss.android.ugc.aweme.sdk.a.a.f63701a, false, 71051, new Class[]{a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.sdk.a.a aVar3 = a3;
            PatchProxy.accessDispatch(new Object[]{a2}, aVar3, com.ss.android.ugc.aweme.sdk.a.a.f63701a, false, 71051, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], a2, a.f63690a, false, 71022, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, a.f63690a, false, 71022, new Class[0], Void.TYPE);
            return;
        }
        a2.f63691b.a((String) a2.f63694e.first, (d) a2.f63694e.second);
        a2.f63691b.a((String) a2.f63695f.first, (d) a2.f63695f.second);
        if (a2.g != null && !a2.g.isEmpty()) {
            for (String next : a2.g.keySet()) {
                a2.f63691b.a(next, a2.g.get(next));
            }
        }
    }

    public boolean pay(String str, JSONObject jSONObject, IWalletService.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        IWalletService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject2, aVar2}, this, changeQuickRedirect, false, 71043, new Class[]{String.class, JSONObject.class, IWalletService.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, jSONObject2, aVar2}, this, changeQuickRedirect, false, 71043, new Class[]{String.class, JSONObject.class, IWalletService.a.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return PayFactory.createIPay(str).pay(jSONObject2, aVar2);
        } catch (Exception unused) {
            return false;
        }
    }

    public void auth(Context context, String str, String str2, IWalletService.a aVar) {
        Context context2 = context;
        String str3 = str2;
        IWalletService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, str, str3, aVar2}, this, changeQuickRedirect, false, 71044, new Class[]{Context.class, String.class, String.class, IWalletService.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, str, str3, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71044, new Class[]{Context.class, String.class, String.class, IWalletService.a.class}, Void.TYPE);
            return;
        }
        AuthFactory.createIAuth(str).auth(context2, str3, aVar2);
    }
}
