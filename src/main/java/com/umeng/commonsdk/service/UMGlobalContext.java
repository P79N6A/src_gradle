package com.umeng.commonsdk.service;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;

public class UMGlobalContext {
    private String mAppVersion;
    private String mAppkey;
    private Context mApplicationContext;
    private String mChannel;
    private int mDeviceType;
    private boolean mIsDebugMode;
    private boolean mIsMainProcess;
    private String mModules;
    private String mProcessName;
    private String mPushSecret;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f80875a;

        /* renamed from: b  reason: collision with root package name */
        public int f80876b;

        /* renamed from: c  reason: collision with root package name */
        public String f80877c;

        /* renamed from: d  reason: collision with root package name */
        public String f80878d;

        /* renamed from: e  reason: collision with root package name */
        public String f80879e;

        /* renamed from: f  reason: collision with root package name */
        public String f80880f;
        public boolean g;
        public String h;
        public String i;
        public boolean j;
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final UMGlobalContext f80881a = new UMGlobalContext();

        private b() {
        }
    }

    public boolean hasInternalModule() {
        return true;
    }

    public Context getAppContextDirectly() {
        return this.mApplicationContext;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAppkey() {
        return this.mAppkey;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public String getPushSecret() {
        return this.mPushSecret;
    }

    public boolean isDebugMode() {
        return this.mIsDebugMode;
    }

    private UMGlobalContext() {
        this.mProcessName = "unknown";
    }

    public static UMGlobalContext getInstance() {
        return b.f80881a;
    }

    public boolean hasAnalyticsSdk() {
        return this.mModules.contains("a");
    }

    public boolean hasErrorSdk() {
        return this.mModules.contains("e");
    }

    public boolean hasOplusModule() {
        return this.mModules.contains("o");
    }

    public boolean hasPushSdk() {
        return this.mModules.contains("p");
    }

    public boolean hasShareSdk() {
        return this.mModules.contains(NotifyType.SOUND);
    }

    public boolean hasVisualDebugSdk() {
        return this.mModules.contains("x");
    }

    public boolean hasVisualSdk() {
        return this.mModules.contains(NotifyType.VIBRATE);
    }

    public String toString() {
        if (b.f80881a.mApplicationContext == null) {
            return "uninitialized.";
        }
        return "[" + ("devType:" + this.mDeviceType + ",") + ("appkey:" + this.mAppkey + ",") + ("channel:" + this.mChannel + ",") + ("procName:" + this.mProcessName + "]");
    }

    public static Context getAppContext(Context context) {
        if (context == null) {
            return b.f80881a.mApplicationContext;
        }
        Context context2 = b.f80881a.mApplicationContext;
        if (context2 != null) {
            return context2;
        }
        return context.getApplicationContext();
    }

    public String getProcessName(Context context) {
        if (context == null) {
            return b.f80881a.mProcessName;
        }
        if (b.f80881a.mApplicationContext != null) {
            return this.mProcessName;
        }
        return UMFrUtils.getCurrentProcessName(context);
    }

    public boolean isMainProcess(Context context) {
        if (context == null) {
            return b.f80881a.mIsMainProcess;
        }
        if (b.f80881a.mApplicationContext != null) {
            return b.f80881a.mIsMainProcess;
        }
        return UMUtils.isMainProgress(context.getApplicationContext());
    }

    public static UMGlobalContext newUMGlobalContext(a aVar) {
        getInstance();
        b.f80881a.mDeviceType = aVar.f80876b;
        b.f80881a.mPushSecret = aVar.f80877c;
        b.f80881a.mAppkey = aVar.f80878d;
        b.f80881a.mChannel = aVar.f80879e;
        b.f80881a.mModules = aVar.f80880f;
        b.f80881a.mIsDebugMode = aVar.g;
        b.f80881a.mProcessName = aVar.h;
        b.f80881a.mAppVersion = aVar.i;
        b.f80881a.mIsMainProcess = aVar.j;
        if (aVar.f80875a != null) {
            b.f80881a.mApplicationContext = aVar.f80875a.getApplicationContext();
        }
        return b.f80881a;
    }
}
