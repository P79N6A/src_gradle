package com.alimama.tunion.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.base.ITUnionCommon;
import com.alimama.tunion.trade.base.ITUnionCookie;
import java.util.HashMap;
import java.util.Map;

public final class TUnionPhoneInfoUtils {
    private static TUnionPhoneInfoUtils j;

    /* renamed from: a  reason: collision with root package name */
    private String f5225a;

    /* renamed from: b  reason: collision with root package name */
    private String f5226b;

    /* renamed from: c  reason: collision with root package name */
    private String f5227c;

    /* renamed from: d  reason: collision with root package name */
    private String f5228d;

    /* renamed from: e  reason: collision with root package name */
    private String f5229e;

    /* renamed from: f  reason: collision with root package name */
    private String f5230f;
    private String g;
    private long h = System.currentTimeMillis();
    private final Map<String, String> i = new HashMap<String, String>() {
        {
            put("com.taobao.taobao", "tb");
            put("com.tmall.wireless", "tm");
            put("com.taobao.ju.android", "ju");
        }
    };
    public String utdid;

    static class SystemField {
        public static String MOBILE_NETWORK = "cell";
        public static String SEPARATOR = "x";
        public static String UNKNOWN = "unknown";
        public static String WIFI = "wifi";

        private SystemField() {
        }
    }

    public static String getBuildModel() {
        return Build.MODEL;
    }

    public static String getSDKVersion() {
        return Build.VERSION.RELEASE;
    }

    public final String getAppVersion() {
        return this.f5228d;
    }

    public final String getPackageName() {
        return this.f5225a;
    }

    public final void initCid() {
        this.h = System.currentTimeMillis();
    }

    public static TUnionPhoneInfoUtils getInstance() {
        if (j == null) {
            synchronized (TUnionPhoneInfoUtils.class) {
                if (j == null) {
                    j = new TUnionPhoneInfoUtils();
                }
            }
        }
        return j;
    }

    public final String getMcid() {
        return String.format("tunion4android@%s", new Object[]{getDeviceID()});
    }

    public final String getCid() {
        if (this.h <= 0) {
            this.h = System.currentTimeMillis();
        }
        return String.format("%s_%s", new Object[]{getMcid(), Long.valueOf(this.h)});
    }

    public final String getAliApp() {
        StringBuffer stringBuffer = new StringBuffer("");
        for (Map.Entry next : this.i.entrySet()) {
            if (b((String) next.getKey())) {
                stringBuffer.append((String) next.getValue());
                stringBuffer.append(",");
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        if (!TextUtils.isEmpty(stringBuffer2)) {
            return stringBuffer2.substring(0, stringBuffer2.length() - 1);
        }
        return stringBuffer2;
    }

    public final String getCnaCookie() {
        String str;
        ITUnionCookie tUnionCookie = TUnionTradeSDK.getInstance().getTUnionCookie();
        if (tUnionCookie != null) {
            str = tUnionCookie.getCookie(".taobao.com");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            String str2 = split[i2];
            if (!TextUtils.isEmpty(str2)) {
                String[] split2 = str2.split("=");
                if (split2.length > 1 && TextUtils.equals(split2[0].toLowerCase().trim(), "cna")) {
                    this.f5227c = split2[1];
                    break;
                }
            }
            i2++;
        }
        return this.f5227c;
    }

    public final String getDeviceID() {
        String str = this.utdid;
        Context context = TUnionTradeSDK.getContext();
        if (context == null && !TextUtils.isEmpty(str)) {
            return str;
        }
        if (TextUtils.isEmpty(str) || str.length() < 6) {
            if (!TextUtils.isEmpty(this.f5230f) && !SystemField.UNKNOWN.equals(this.f5230f) && this.f5230f.length() >= 6) {
                str = this.f5230f;
            } else if (TextUtils.isEmpty(this.g) || SystemField.UNKNOWN.equals(this.g) || this.g.length() < 6) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } else {
                str = this.g;
            }
        }
        return str;
    }

    private TUnionPhoneInfoUtils() {
        Context context = TUnionTradeSDK.getContext();
        if (context != null) {
            if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                this.f5230f = a(((TelephonyManager) context.getSystemService("phone")).getDeviceId());
            }
            this.g = a(((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress());
            this.f5225a = a(context.getPackageName());
            ITUnionCommon tUnionCommon = TUnionTradeSDK.getInstance().getTUnionCommon();
            if (tUnionCommon != null) {
                this.utdid = tUnionCommon.getUtdid();
            }
            PackageManager packageManager = context.getPackageManager();
            try {
                this.f5226b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f5225a, 0)).toString();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (TextUtils.isEmpty(this.f5226b)) {
                this.f5226b = this.f5225a;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                this.f5228d = a(packageInfo.versionName);
                this.f5229e = a(String.valueOf(packageInfo.versionCode));
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return SystemField.UNKNOWN;
        }
        return str.replaceAll(" ", "");
    }

    private boolean b(String str) {
        Context context = TUnionTradeSDK.getContext();
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
