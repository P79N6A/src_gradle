package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

public class ey extends ex {

    /* renamed from: a  reason: collision with root package name */
    private boolean f81992a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f81993b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f81994c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f81995d;

    public ey(Context context, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, i);
        this.f81992a = z;
        this.f81993b = z2;
        if (m.d()) {
            this.f81993b = false;
        }
        this.f81994c = z3;
        this.f81995d = z4;
    }

    private String a(Context context) {
        if (!this.f81995d) {
            return "off";
        }
        String str = "";
        try {
            if (!m.d()) {
                Iterator it2 = j.a(context).iterator();
                str = "";
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!TextUtils.isEmpty(str)) {
                        str = str + ";";
                    }
                    str = str + az.a(str2) + "," + az.b(str2);
                }
            }
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    private String b() {
        if (!this.f81992a) {
            return "off";
        }
        try {
            String c2 = c();
            if (TextUtils.isEmpty(c2)) {
                return "";
            }
            return az.a(c2) + "," + az.b(c2);
        } catch (Throwable unused) {
        }
    }

    @TargetApi(9)
    private String c() {
        if (!m.d()) {
            String str = "";
            if (Build.VERSION.SDK_INT < 23) {
                str = ((WifiManager) this.f321a.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (Build.VERSION.SDK_INT >= 9) {
                try {
                    Iterator<T> it2 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        NetworkInterface networkInterface = (NetworkInterface) it2.next();
                        if ("wlan0".equalsIgnoreCase(networkInterface.getName())) {
                            byte[] hardwareAddress = networkInterface.getHardwareAddress();
                            if (hardwareAddress != null) {
                                StringBuilder sb = new StringBuilder();
                                for (byte valueOf : hardwareAddress) {
                                    sb.append(String.format("%02x:", new Object[]{Byte.valueOf(valueOf)}));
                                }
                                if (sb.length() > 0) {
                                    sb.deleteCharAt(sb.length() - 1);
                                }
                                return sb.toString().toUpperCase();
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return "";
    }

    private String d() {
        if (!this.f81993b) {
            return "off";
        }
        try {
            String subscriberId = ((TelephonyManager) this.f321a.getSystemService("phone")).getSubscriberId();
            if (TextUtils.isEmpty(subscriberId)) {
                return "";
            }
            return az.a(subscriberId) + "," + az.b(subscriberId);
        } catch (Throwable unused) {
        }
    }

    private String e() {
        if (!this.f81994c) {
            return "off";
        }
        try {
            String simSerialNumber = ((TelephonyManager) this.f321a.getSystemService("phone")).getSimSerialNumber();
            if (TextUtils.isEmpty(simSerialNumber)) {
                return "";
            }
            return az.a(simSerialNumber) + "," + az.b(simSerialNumber);
        } catch (Throwable unused) {
        }
    }

    public int a() {
        return 13;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m215a() {
        return im.DeviceBaseInfo;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m216a() {
        return b() + "|" + d() + "|" + e() + "|" + a(this.f321a);
    }
}
