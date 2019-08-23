package com.facebook.react.packagerconnection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.a;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import javax.annotation.Nullable;

public class PackagerConnectionSettings {
    private static final String TAG = "PackagerConnectionSettings";
    private final String mPackageName;
    private final SharedPreferences mPreferences;

    @Nullable
    public String getPackageName() {
        return this.mPackageName;
    }

    public String getInspectorServerHost() {
        return AndroidInfoHelpers.getInspectorProxyHost();
    }

    public String getDebugServerHost() {
        String string = this.mPreferences.getString("debug_http_host", null);
        if (!TextUtils.isEmpty(string)) {
            return (String) a.b(string);
        }
        String serverHost = AndroidInfoHelpers.getServerHost();
        if (serverHost.equals("localhost")) {
            FLog.w(TAG, "You seem to be running on device. Run 'adb reverse tcp:8081 tcp:8081' to forward the debug server's port to the device.");
        }
        return serverHost;
    }

    public PackagerConnectionSettings(Context context) {
        this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.mPackageName = context.getPackageName();
    }
}
