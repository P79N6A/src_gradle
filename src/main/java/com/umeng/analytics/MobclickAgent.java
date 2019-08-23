package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.social.UMPlatformData;
import com.umeng.analytics.social.UMSocialService;
import com.umeng.analytics.social.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

public class MobclickAgent {

    /* renamed from: b  reason: collision with root package name */
    private static final b f80286b = new b();

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1),
        E_UM_ANALYTICS_OEM(224),
        E_UM_GAME_OEM(225);
        

        /* renamed from: a  reason: collision with root package name */
        private int f80288a;

        public final int toValue() {
            return this.f80288a;
        }

        private EScenarioType(int i) {
            this.f80288a = i;
        }
    }

    public static class UMAnalyticsConfig {
        public String mAppkey;
        public String mChannelId;
        public Context mContext;
        public boolean mIsCrashEnable;
        public EScenarioType mType;

        private UMAnalyticsConfig() {
            this.mIsCrashEnable = true;
            this.mType = EScenarioType.E_UM_NORMAL;
        }

        public UMAnalyticsConfig(Context context, String str, String str2) {
            this(context, str, str2, null, true);
        }

        public UMAnalyticsConfig(Context context, String str, String str2, EScenarioType eScenarioType) {
            this(context, str, str2, eScenarioType, true);
        }

        public UMAnalyticsConfig(Context context, String str, String str2, EScenarioType eScenarioType, boolean z) {
            this.mIsCrashEnable = true;
            this.mType = EScenarioType.E_UM_NORMAL;
            this.mContext = context;
            this.mAppkey = str;
            this.mChannelId = str2;
            this.mIsCrashEnable = z;
            if (eScenarioType != null) {
                this.mType = eScenarioType;
                return;
            }
            switch (AnalyticsConfig.getVerticalType(context)) {
                case 0:
                    this.mType = EScenarioType.E_UM_NORMAL;
                    return;
                case 1:
                    this.mType = EScenarioType.E_UM_GAME;
                    return;
                case 224:
                    this.mType = EScenarioType.E_UM_ANALYTICS_OEM;
                    return;
                case 225:
                    this.mType = EScenarioType.E_UM_GAME_OEM;
                    break;
            }
        }
    }

    public static b getAgent() {
        return f80286b;
    }

    public static void onProfileSignOff() {
        f80286b.b();
    }

    public static void enableEncrypt(boolean z) {
        f80286b.e(z);
    }

    public static void onKillProcess(Context context) {
        f80286b.d(context);
    }

    public static void onPause(Context context) {
        f80286b.b(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void openActivityDurationTrack(boolean z) {
        f80286b.b(z);
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        f80286b.a(z);
    }

    public static void setCheckDevice(boolean z) {
        f80286b.c(z);
    }

    public static void setDebugMode(boolean z) {
        f80286b.d(z);
    }

    public static void setLatencyWindow(long j) {
        f80286b.a(j);
    }

    public static void setOpenGLContext(GL10 gl10) {
        f80286b.a(gl10);
    }

    public static void setSessionContinueMillis(long j) {
        f80286b.b(j);
    }

    public static void startWithConfigure(UMAnalyticsConfig uMAnalyticsConfig) {
        if (uMAnalyticsConfig != null) {
            f80286b.a(uMAnalyticsConfig);
        }
    }

    public static void onResume(Context context) {
        if (context == null) {
            by.e("unexpected null context in onResume");
        } else {
            f80286b.a(context);
        }
    }

    public static void onPageEnd(String str) {
        if (!TextUtils.isEmpty(str)) {
            f80286b.b(str);
        } else {
            by.e("pageName is null or empty");
        }
    }

    public static void onPageStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            f80286b.a(str);
        } else {
            by.e("pageName is null or empty");
        }
    }

    public static void reportError(Context context, String str) {
        f80286b.a(context, str);
    }

    public static void setLocation(double d2, double d3) {
        f80286b.a(d2, d3);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
        f80286b.a(context, eScenarioType);
    }

    public static void setSecret(Context context, String str) {
        f80286b.b(context, str);
    }

    public static void onEvent(Context context, String str) {
        f80286b.a(context, str, null, -1, 1);
    }

    public static void reportError(Context context, Throwable th) {
        f80286b.a(context, th);
    }

    public static void onSocialEvent(Context context, UMPlatformData... uMPlatformDataArr) {
        if (context == null) {
            by.e("context is null in onShareEvent");
            return;
        }
        d.f80726d = "3";
        UMSocialService.share(context, uMPlatformDataArr);
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            by.d("uid is null");
        } else if (str2.length() > 64) {
            by.d("uid is Illegal(length bigger then  legitimate length).");
        } else if (TextUtils.isEmpty(str)) {
            f80286b.a("_adhoc", str2);
        } else if (str.length() > 32) {
            by.d("provider is Illegal(length bigger then  legitimate length).");
        } else {
            f80286b.a(str, str2);
        }
    }

    public static void onSocialEvent(Context context, String str, UMPlatformData... uMPlatformDataArr) {
        if (context == null) {
            by.e("context is null in onShareEvent");
            return;
        }
        d.f80726d = "3";
        UMSocialService.share(context, str, uMPlatformDataArr);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            by.c("label is null or empty");
        } else {
            f80286b.a(context, str, str2, -1, 1);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            by.e("input map is null");
            return;
        }
        f80286b.a(context, str, (Map<String, Object>) new HashMap<String,Object>(map), -1);
    }

    public static void onEvent(Context context, List<String> list, int i, String str) {
        f80286b.a(context, list, i, str);
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("__ct__", Integer.valueOf(i));
        f80286b.a(context, str, (Map<String, Object>) hashMap, -1);
    }
}
