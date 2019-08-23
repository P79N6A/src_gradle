package com.ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.d.a.a;
import com.ss.android.ugc.aweme.q.c;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28123a;

    /* renamed from: b  reason: collision with root package name */
    Context f28124b;

    /* renamed from: c  reason: collision with root package name */
    String f28125c;

    /* renamed from: d  reason: collision with root package name */
    long f28126d;

    /* renamed from: e  reason: collision with root package name */
    boolean f28127e;

    /* renamed from: f  reason: collision with root package name */
    String f28128f;
    long g;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28123a, false, 15687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28123a, false, 15687, new Class[0], Void.TYPE);
            return;
        }
        if (this.f28127e) {
            this.f28127e = false;
            this.f28125c = this.f28128f;
            this.f28126d = this.g;
            SharedPreferences.Editor edit = c.a(this.f28124b, a.a(), 0).edit();
            edit.putString("last_wifi_bssid", this.f28125c);
            edit.putLong("last_check_bssid_time", this.f28126d);
            SharedPrefsEditorCompat.apply(edit);
        }
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f28123a, false, 15688, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f28123a, false, 15688, new Class[0], String.class);
        } else if (this.f28124b == null) {
            return null;
        } else {
            WifiManager wifiManager = (WifiManager) this.f28124b.getSystemService("wifi");
            if (wifiManager == null) {
                return null;
            }
            try {
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (connectionInfo != null) {
                    return connectionInfo.getBSSID();
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public af(Context context) {
        this.f28124b = context.getApplicationContext();
        SharedPreferences a2 = c.a(this.f28124b, a.a(), 0);
        this.f28125c = a2.getString("last_wifi_bssid", null);
        this.f28126d = a2.getLong("last_check_bssid_time", 0);
    }
}
