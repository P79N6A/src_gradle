package com.ss.android.ugc.aweme.opensdk.share.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Keep;
import com.bytedance.sdk.account.b.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public abstract class DYBaseRequest extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Bundle extras;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mState;

    public abstract int getType();

    public String getCallerLocalEntry() {
        return this.callerLocalEntry;
    }

    public String getCallerPackage() {
        return this.mCallerPackage;
    }

    public String getCallerVersion() {
        return this.mCallerSDKVersion;
    }

    @SuppressLint({"MissingSuperCall"})
    @CallSuper
    public void fromBundle(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63409, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63409, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.extras = bundle.getBundle("_aweme_open_sdk_params_extra");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
    }

    @SuppressLint({"MissingSuperCall"})
    @CallSuper
    public void toBundle(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63408, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63408, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle.putInt("_aweme_open_sdk_params_type", getType());
        bundle.putBundle("_aweme_open_sdk_params_extra", this.extras);
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
    }
}
