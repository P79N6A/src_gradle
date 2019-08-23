package com.ss.android.ugc.aweme.sdk.wallet.app;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class WalletSDKContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static WalletSDKContext sInstance = new WalletSDKContext();
    private String currentOrderId;
    private String mWxAppId = "wx76fdd06dde311af3";

    public static WalletSDKContext getInstance() {
        return sInstance;
    }

    public String getCurrentOrderId() {
        return this.currentOrderId;
    }

    private WalletSDKContext() {
    }

    public void setCurrentOrderId(String str) {
        this.currentOrderId = str;
    }

    public IWXAPI createWXAPI(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 71061, new Class[]{Context.class}, IWXAPI.class)) {
            return (IWXAPI) PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 71061, new Class[]{Context.class}, IWXAPI.class);
        }
        IWXAPI iwxapi = null;
        if (!StringUtils.isEmpty(this.mWxAppId)) {
            iwxapi = WXAPIFactory.createWXAPI(context, this.mWxAppId, true);
            iwxapi.registerApp(this.mWxAppId);
        }
        return iwxapi;
    }
}
