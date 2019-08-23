package com.ss.android.ugc.aweme.opensdk.share.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Keep;
import com.bytedance.sdk.account.b.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public abstract class DYBaseResp extends b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int errorCode;
    public String errorMsg;
    public Bundle extras;

    @SuppressLint({"MissingSuperCall"})
    @CallSuper
    public boolean checkArgs() {
        return true;
    }

    public abstract int getType();

    public boolean isSuccess() {
        if (this.errorCode == 20000) {
            return true;
        }
        return false;
    }

    @SuppressLint({"MissingSuperCall"})
    @CallSuper
    public void fromBundle(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63411, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63411, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.errorCode = bundle.getInt("_aweme_open_sdk_params_error_code");
        this.errorMsg = bundle.getString("_aweme_open_sdk_params_error_msg");
        this.extras = bundle.getBundle("_aweme_open_sdk_params_extra");
    }

    @SuppressLint({"MissingSuperCall"})
    @CallSuper
    public void toBundle(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63410, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63410, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle.putInt("_aweme_open_sdk_params_error_code", this.errorCode);
        bundle.putString("_aweme_open_sdk_params_error_msg", this.errorMsg);
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_aweme_open_sdk_params_extra", this.extras);
    }
}
