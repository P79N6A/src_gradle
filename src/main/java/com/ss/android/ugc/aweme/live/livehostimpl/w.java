package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.host.n;
import com.bytedance.android.livesdkapi.host.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.wallet.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53486a;

    public final void a(Activity activity, c cVar, n.a aVar) {
    }

    public final String b() {
        return null;
    }

    public final String c() {
        return null;
    }

    public final Map<String, String> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53486a, false, 55855, new Class[0], Map.class)) {
            return new HashMap();
        }
        return (Map) PatchProxy.accessDispatch(new Object[0], this, f53486a, false, 55855, new Class[0], Map.class);
    }

    public final void a(Context context, c cVar, n.a aVar) {
        IWalletService iWalletService;
        c cVar2 = cVar;
        final n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, cVar2, aVar2}, this, f53486a, false, 55854, new Class[]{Context.class, c.class, n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, cVar2, aVar2}, this, f53486a, false, 55854, new Class[]{Context.class, c.class, n.a.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", cVar2.h);
            jSONObject.put("prepay_id", cVar2.j);
            jSONObject.put("timestamp", cVar2.l);
            jSONObject.put("nonce_str", cVar2.k);
            jSONObject.put("order_id", cVar2.f18695a);
            jSONObject.put("partner_id", cVar2.i);
            jSONObject.put("sign", cVar2.m);
            try {
                AnonymousClass1 r1 = new IWalletService.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53487a;

                    public final void onFail(Exception exc) {
                        Exception exc2 = exc;
                        if (PatchProxy.isSupport(new Object[]{exc2}, this, f53487a, false, 55857, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc2}, this, f53487a, false, 55857, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        aVar2.a(r.WEIXIN, exc2);
                    }

                    public final void onSuccess(JSONObject jSONObject) {
                        int i = 0;
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f53487a, false, 55856, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f53487a, false, 55856, new Class[]{JSONObject.class}, Void.TYPE);
                            return;
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("args");
                        String str = "";
                        String str2 = "";
                        if (optJSONObject != null) {
                            str = optJSONObject.optString("order_id");
                            str2 = optJSONObject.optString("message");
                            i = optJSONObject.optInt("code");
                        }
                        if (i == 1) {
                            aVar2.a(r.WEIXIN, str, PushConstants.PUSH_TYPE_NOTIFY, "");
                        } else if (TextUtils.equals("支付取消", str2)) {
                            aVar2.a(r.WEIXIN, str, "-2", "");
                        } else {
                            aVar2.a(r.WEIXIN, str, "-1", "");
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[0], null, a.f76553a, true, 89781, new Class[0], IWalletService.class)) {
                    iWalletService = (IWalletService) PatchProxy.accessDispatch(new Object[0], null, a.f76553a, true, 89781, new Class[0], IWalletService.class);
                } else {
                    iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                }
                if (!iWalletService.pay("weixin", jSONObject, r1)) {
                    r1.onFail(new RuntimeException("吊起微信失败"));
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
