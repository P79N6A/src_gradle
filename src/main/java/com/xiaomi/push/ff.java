package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.ag;
import org.json.JSONObject;

public class ff extends ex {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f82009a;

    /* renamed from: a  reason: collision with other field name */
    private cb f324a = new fg(this);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public final Object f325a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public String f326a;

    public ff(Context context, int i) {
        super(context, i);
        a(context);
    }

    private void a(Context context) {
        bl.a(context).b();
        bl.a().a(this.f324a, 1);
    }

    /* access modifiers changed from: private */
    public static String b(String str) {
        try {
            String jSONArray = new JSONObject(str).getJSONArray("devices").toString();
            String substring = jSONArray.substring(1, jSONArray.length() - 1);
            if (!TextUtils.isEmpty(substring)) {
                return az.c(substring);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public int a() {
        return 14;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m227a() {
        return im.WifiDevicesMac;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m228a() {
        if (at.d(this.f321a)) {
            bl.a().a();
            synchronized (this.f325a) {
                try {
                    this.f325a.wait(10000);
                } catch (Exception e2) {
                    b.a((Throwable) e2);
                }
            }
            this.f82009a = c.a(this.f321a, "mipush_extra", 4);
            SharedPreferences.Editor edit = this.f82009a.edit();
            edit.putLong("last_mac_upload_timestamp", System.currentTimeMillis());
            edit.commit();
        }
        String str = this.f326a;
        this.f326a = "";
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public boolean m229a() {
        if (c()) {
            return ah.a(this.f321a, String.valueOf(a()), (long) this.f81991a);
        }
        int max = Math.max(3600, ag.a(this.f321a).a(ip.WifiDevicesMacWifiUnchangedCollectionFrequency.a(), 7200));
        long currentTimeMillis = System.currentTimeMillis();
        this.f82009a = c.a(this.f321a, "mipush_extra", 4);
        return ((((float) Math.abs(currentTimeMillis - this.f82009a.getLong("last_mac_upload_timestamp", 0))) > (((float) (max * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) * 0.9f) ? 1 : (((float) Math.abs(currentTimeMillis - this.f82009a.getLong("last_mac_upload_timestamp", 0))) == (((float) (max * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) * 0.9f) ? 0 : -1)) >= 0) && ah.a(this.f321a, String.valueOf(a()), (long) max);
    }

    public boolean c() {
        try {
            this.f82009a = c.a(this.f321a, "mipush_extra", 4);
            String string = this.f82009a.getString("last_wifi_ssid", "");
            WifiManager wifiManager = (WifiManager) this.f321a.getSystemService("wifi");
            if (!wifiManager.isWifiEnabled()) {
                return true;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo == null) {
                return true;
            }
            SharedPreferences.Editor edit = this.f82009a.edit();
            edit.putString("last_wifi_ssid", connectionInfo.getSSID());
            edit.commit();
            return !TextUtils.isEmpty(string) && !TextUtils.equals(connectionInfo.getSSID(), string);
        } catch (Throwable unused) {
            return true;
        }
    }
}
