package com.bytedance.neverland.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import com.bytedance.neverland.Callback;
import com.bytedance.neverland.Config;
import com.bytedance.neverland.Neverland;
import com.bytedance.neverland.network.Reporter;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import org.json.JSONObject;

public class NeverlandImpl extends Neverland {
    private static NeverlandImpl instance = new NeverlandImpl();
    int appId;
    private Context context;
    long costMultiDex;
    String detailVersion;
    String deviceId;
    boolean enable;
    File filesDirPath;
    private boolean isFirstLaunch;
    private boolean isTooMuchNativeCrash;
    JSONObject jsonObjectMultiDex;
    String packageName;
    String randomId;
    private SharedPreferences sp;
    String unFatalExceptions;
    private String url;
    String version;

    public Neverland setCallback(String str, Callback callback) {
        return null;
    }

    public static NeverlandImpl getInstance() {
        return instance;
    }

    public Context getContext() {
        return this.context;
    }

    public SharedPreferences getSp() {
        return this.sp;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isFirstLaunch() {
        return this.isFirstLaunch;
    }

    public boolean isTooMuchNativeCrash() {
        return this.isTooMuchNativeCrash;
    }

    public Neverland setEnable(boolean z) {
        this.enable = z;
        try {
            CrashHandler.setEnableCatchNativeCrash(z);
        } catch (Throwable unused) {
        }
        return this;
    }

    public Neverland report(String str) {
        new Reporter().addParams("app_id", Integer.valueOf(this.appId)).addParams("device_platform", "android").addParams("os_version_code", Integer.valueOf(Build.VERSION.SDK_INT)).addParams("device_type", Build.MODEL).addParams("device_fingerprint", Build.FINGERPRINT).addParams("sdk_int", Build.VERSION.RELEASE).addParams("random_id", this.randomId).addParams("device_id", this.deviceId).addParams("package_name", this.packageName).addParams("app_version", this.version).addParams("app_detail_version", this.detailVersion).addParams("is_first_launch", Boolean.valueOf(isFirstLaunch())).addParams("unfatal_exception_msg", this.unFatalExceptions).addParams("multidex_cost_time", Long.valueOf(this.costMultiDex)).addParams("timestamp", Utility.getReadableTime(System.currentTimeMillis())).addParams("exception_msg", str).addParams("exception_type", "report").report(2);
        return this;
    }

    public Neverland setUp(@NonNull Context context2, @NonNull Config config) {
        if (this.context == context2) {
            return null;
        }
        this.context = context2;
        this.packageName = context2.getPackageName();
        boolean z = false;
        this.sp = c.a(context2, "neverland", 0);
        this.filesDirPath = new File(context2.getFilesDir(), "neverland");
        if (!this.filesDirPath.exists()) {
            this.filesDirPath.mkdirs();
        }
        try {
            this.version = String.valueOf(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.appId = config.appId;
        this.detailVersion = config.detailVersion;
        this.randomId = config.randomId;
        this.deviceId = config.deviceId;
        this.url = config.host + "/aweme/v1/app/exception/log/";
        if (new CrashHandler(this, config).checkCrashFiles() >= 2) {
            z = true;
        }
        this.isTooMuchNativeCrash = z;
        if (this.isTooMuchNativeCrash) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException unused2) {
            }
        }
        setEnable(true);
        return this;
    }

    public Neverland setMultiDexInfo(long j, boolean z, String str, JSONObject jSONObject) {
        this.costMultiDex = j;
        this.isFirstLaunch = z;
        this.unFatalExceptions = str;
        this.jsonObjectMultiDex = jSONObject;
        return this;
    }
}
