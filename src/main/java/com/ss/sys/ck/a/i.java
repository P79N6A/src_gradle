package com.ss.sys.ck.a;

import android.app.Application;
import android.content.Context;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Application f78564a;

    public static String a() {
        try {
            Context applicationContext = c().getApplicationContext();
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionCode;
            return i;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        String str = "";
        String str2 = "";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equals(nextElement.getName())) {
                    for (InterfaceAddress next : nextElement.getInterfaceAddresses()) {
                        if (next.getAddress() instanceof Inet4Address) {
                            str = ((Inet4Address) next.getAddress()).getHostAddress();
                        }
                    }
                }
                if ("rmnet0".equals(nextElement.getName())) {
                    for (InterfaceAddress next2 : nextElement.getInterfaceAddresses()) {
                        if (next2.getAddress() instanceof Inet4Address) {
                            str2 = ((Inet4Address) next2.getAddress()).getHostAddress();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return !str.equals("") ? str : str2;
    }

    private static Application c() {
        if (f78564a != null) {
            return f78564a;
        }
        try {
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            f78564a = application;
            return application;
        } catch (Throwable unused) {
            return null;
        }
    }
}
