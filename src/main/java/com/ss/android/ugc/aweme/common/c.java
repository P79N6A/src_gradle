package com.ss.android.ugc.aweme.common;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public abstract class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String callerLocalEntry;
    public String mAppName;
    public String mCallerPackage;
    public String mCallerSDKVersion;
    public String mClientKey;
    public String mCurrentPage;
    public String mHashTag;
    public String mMicroAppInfo;
    public boolean mNeedShowDialog = true;
    public String mState;

    public c() {
    }

    public Bundle getShareRequestBundle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 33205, new Class[0], Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 33205, new Class[0], Bundle.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.callerLocalEntry);
        bundle.putString("_aweme_open_sdk_params_client_key", this.mClientKey);
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", this.mCallerSDKVersion);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.mCallerPackage);
        bundle.putString("_aweme_open_sdk_params_state", this.mState);
        bundle.putString("_aweme_open_sdk_params_target_scene", this.mHashTag);
        bundle.putString("_aweme_open_sdk_params_micro_app_info", this.mMicroAppInfo);
        return bundle;
    }

    public c(Bundle bundle) {
        this.mCallerPackage = bundle.getString("_aweme_open_sdk_params_caller_package");
        this.mCallerSDKVersion = bundle.getString("_aweme_open_sdk_params_caller_sdk_version");
        this.callerLocalEntry = bundle.getString("_aweme_open_sdk_params_caller_local_entry");
        this.mState = bundle.getString("_aweme_open_sdk_params_state");
        this.mClientKey = bundle.getString("_aweme_open_sdk_params_client_key");
        this.mHashTag = bundle.getString("_aweme_open_sdk_params_target_scene");
        this.mMicroAppInfo = bundle.getString("_aweme_open_sdk_params_micro_app_info");
    }
}
