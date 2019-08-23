package com.ss.android.ugc.aweme.sdk.wallet.module.pay;

import android.support.annotation.NonNull;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.sdk.b.a;
import com.ss.android.ugc.aweme.sdk.b.b;
import com.ss.android.ugc.aweme.sdk.wallet.app.WXOrderInfo;
import com.ss.android.ugc.aweme.sdk.wallet.app.WalletSDKContext;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import org.json.JSONObject;

public class WXPay implements IPay {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static WXPayResultCallback sPayResultCallback;

    public interface WXPayResultCallback {
        void onPayResult(int i, String str);
    }

    public void checkOrderStatus() {
    }

    public void createOrder() {
    }

    public static WXPayResultCallback getWXPayResultCallback() {
        return sPayResultCallback;
    }

    private void createCallback(IWalletService.a aVar) {
        final IWalletService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 71068, new Class[]{IWalletService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 71068, new Class[]{IWalletService.a.class}, Void.TYPE);
            return;
        }
        sPayResultCallback = new WXPayResultCallback() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onPayResult(int i, String str) {
                a aVar;
                int i2 = i;
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 71071, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, changeQuickRedirect, false, 71071, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                WXPay.sPayResultCallback = null;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (i2 == 0) {
                        jSONObject.put("code", 1);
                        jSONObject.put("message", "支付成功");
                    } else {
                        jSONObject.put("code", 0);
                        if (i2 == -2) {
                            jSONObject.put("message", "支付取消");
                        } else {
                            jSONObject.put("message", "支付失败");
                        }
                    }
                    if (PatchProxy.isSupport(new Object[0], null, b.f63705a, true, 71057, new Class[0], a.class)) {
                        aVar = (a) PatchProxy.accessDispatch(new Object[0], null, b.f63705a, true, 71057, new Class[0], a.class);
                    } else {
                        aVar = new b();
                    }
                    aVar.a("aweme_live_charge_status", i2, jSONObject);
                    jSONObject.put("order_id", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", "weixin");
                    jSONObject2.put("args", jSONObject);
                    aVar2.onSuccess(jSONObject2);
                } catch (Exception e2) {
                    aVar2.onFail(e2);
                }
            }
        };
    }

    private static boolean isAvailable(IWXAPI iwxapi) {
        if (PatchProxy.isSupport(new Object[]{iwxapi}, null, changeQuickRedirect, true, 71070, new Class[]{IWXAPI.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iwxapi}, null, changeQuickRedirect, true, 71070, new Class[]{IWXAPI.class}, Boolean.TYPE)).booleanValue();
        } else if (iwxapi.getWXAppSupportAPI() >= 570425345) {
            return true;
        } else {
            return false;
        }
    }

    private boolean callWXPay(WXOrderInfo wXOrderInfo, IWXAPI iwxapi) {
        IWXAPI iwxapi2 = iwxapi;
        if (PatchProxy.isSupport(new Object[]{wXOrderInfo, iwxapi2}, this, changeQuickRedirect, false, 71069, new Class[]{WXOrderInfo.class, IWXAPI.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{wXOrderInfo, iwxapi2}, this, changeQuickRedirect, false, 71069, new Class[]{WXOrderInfo.class, IWXAPI.class}, Boolean.TYPE)).booleanValue();
        } else if (wXOrderInfo == null || iwxapi2 == null) {
            return false;
        } else {
            if (!iwxapi.isWXAppInstalled()) {
                UIUtils.displayToast(GlobalContext.getContext(), "微信未安装!");
                return false;
            } else if (!isAvailable(iwxapi)) {
                return false;
            } else {
                PayReq payReq = new PayReq();
                payReq.appId = wXOrderInfo.getWXAppId();
                payReq.partnerId = wXOrderInfo.getWXPartnerId();
                payReq.prepayId = wXOrderInfo.getWXPrePayId();
                payReq.packageValue = "Sign=WXPay";
                payReq.nonceStr = wXOrderInfo.getWXNonceString();
                payReq.timeStamp = wXOrderInfo.getWXTimeStamp();
                payReq.sign = wXOrderInfo.getWXSign();
                return iwxapi2.sendReq(payReq);
            }
        }
    }

    public boolean pay(@NonNull JSONObject jSONObject, IWalletService.a aVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, changeQuickRedirect, false, 71067, new Class[]{JSONObject.class, IWalletService.a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, changeQuickRedirect, false, 71067, new Class[]{JSONObject.class, IWalletService.a.class}, Boolean.TYPE)).booleanValue();
        }
        WXOrderInfo wXOrderInfo = new WXOrderInfo();
        wXOrderInfo.mWXAppId = jSONObject.optString("app_id");
        wXOrderInfo.mWXPrePayId = jSONObject.optString("prepay_id");
        wXOrderInfo.mWXTimeStamp = jSONObject.optString("timestamp");
        wXOrderInfo.mWXNonceString = jSONObject.optString("nonce_str");
        wXOrderInfo.mOrderId = jSONObject.optString("order_id");
        wXOrderInfo.mWXPartnerId = jSONObject.optString("partner_id");
        wXOrderInfo.mWXSign = jSONObject.optString("sign");
        WalletSDKContext.getInstance().setCurrentOrderId(wXOrderInfo.mOrderId);
        createCallback(aVar);
        return callWXPay(wXOrderInfo, WalletSDKContext.getInstance().createWXAPI(GlobalContext.getContext()));
    }
}
