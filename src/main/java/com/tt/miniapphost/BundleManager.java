package com.tt.miniapphost;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Schedulers;
import com.tt.miniapphost.dynamic.IBaseBundleManager;
import com.tt.miniapphost.dynamic.IBundleManager;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.option.net.TmaRequest;
import org.json.JSONObject;

public class BundleManager implements IBundleManager {
    public String TAG = "BundleManager";
    private IBaseBundleManager baseBundleManager;

    @AnyProcess
    private boolean isSDKSupport() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public boolean isMiniAppReady() {
        try {
            Class.forName("com.tt.miniapp.BaseActivityProxy");
            return true;
        } catch (Throwable th) {
            AppBrandLogger.stacktrace(6, this.TAG, th.getStackTrace());
            return false;
        }
    }

    public IBaseBundleManager getBaseBundleManager() {
        if (this.baseBundleManager == null) {
            try {
                Class<?> cls = Class.forName("com.tt.miniapp.manager.BaseBundleManager");
                Object invoke = cls.getMethod("getInst", new Class[0]).invoke(cls, new Object[0]);
                if (invoke != null) {
                    this.baseBundleManager = (IBaseBundleManager) invoke;
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, this.TAG, e2.getStackTrace());
            }
        }
        return this.baseBundleManager;
    }

    private SharedPreferences getJsSdkSP(@NonNull Context context) {
        return c.a(context, "tma_jssdk_info", 0);
    }

    public SharedPreferences getBlackDevicesSP(@NonNull Context context) {
        return c.a(context, "tma_black_devices", 0);
    }

    private boolean isTMAEnable(@NonNull Context context) {
        if (context != null && getJsSdkSP(context).getInt("tma_switch", 0) == 0) {
            return true;
        }
        return false;
    }

    public void updateDeviceSupportability(final Context context) {
        Observable.create((Action) new Action() {
            public void act() {
                try {
                    String data = HostDependManager.getInst().doGet(new TmaRequest("https://developer.toutiao.com/api/apps/device/blacklist" + "?name=" + AppbrandUtil.getCurrentDeviceFlag(), "GET")).getData();
                    if (!TextUtils.isEmpty(data)) {
                        try {
                            BundleManager.this.getBlackDevicesSP(context).edit().putString("black_device_v2", new JSONObject(data).toString()).apply();
                        } catch (Exception e2) {
                            AppBrandLogger.stacktrace(6, BundleManager.this.TAG, e2.getStackTrace());
                        }
                    }
                } catch (Exception e3) {
                    AppBrandLogger.e(BundleManager.this.TAG, "", e3);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public boolean handleTmaTest(@NonNull Context context, Uri uri) {
        if (getBaseBundleManager() == null) {
            return false;
        }
        return getBaseBundleManager().handleTmaTest(context, uri);
    }

    public boolean isSDKSupport(Context context, int i) {
        if (context != null && checkMiniAppDisableState(context, i) == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public DisableStateEntity checkMiniAppDisableState(Context context, int i) {
        if (!isTMAEnable(context)) {
            return new DisableStateEntity("小程序功能被禁用", "https://developer.toutiao.com/systemdown");
        }
        if (!isCurrentDevicesSupport(context, i)) {
            return new DisableStateEntity("当前 Android 设备是黑名单机器", "https://developer.toutiao.com/unsupported?type=model_unsupported");
        }
        if (!isSDKSupport()) {
            return new DisableStateEntity("当前 Android 设备系统版本低于小程序最低支持 Android 系统版本", "https://developer.toutiao.com/unsupported?type=os_unsupported");
        }
        return HostDependManager.getInst().checkExtraAppbrandDisableState(context, i);
    }

    public void checkUpdateBaseBundle(@NonNull final Context context, final boolean z) {
        if (getBaseBundleManager() == null) {
            AppBrandLogger.i(this.TAG, "getBaseBundleManager null");
            return;
        }
        Observable.create((Action) new Action() {
            public void act() {
                BundleManager.this.getBaseBundleManager().preload(context);
                AppBrandLogger.i(BundleManager.this.TAG, "updateInfo : ", Boolean.valueOf(z));
                BundleManager.this.getBaseBundleManager().checkUpdateBaseBundle(context, z);
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    private boolean isCurrentDevicesSupport(@NonNull Context context, int i) {
        String string = getBlackDevicesSP(context).getString("black_device_v2", "");
        AppBrandLogger.i(this.TAG, "isCurrentDevicesSupport check blackDevices：", string);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                switch (i) {
                    case 1:
                        if (jSONObject.getInt("tma") != 1) {
                            return true;
                        }
                        return false;
                    case 2:
                        if (jSONObject.getInt("tmg") != 1) {
                            return true;
                        }
                        return false;
                    default:
                        if (jSONObject.getInt("tmg") == 1 && jSONObject.getInt("tma") == 1) {
                            return false;
                        }
                        return true;
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, this.TAG, e2.getStackTrace());
            }
        } else {
            updateDeviceSupportability(context);
            return true;
        }
    }
}
