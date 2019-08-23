package com.ss.android.ugc.aweme.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Enumeration;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75209a;

    static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f75209a, true, 87360, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75209a, true, 87360, new Class[0], String.class);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && !nextElement.isLinkLocalAddress()) {
                            return nextElement.getHostAddress();
                        }
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75209a, true, 87361, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75209a, true, 87361, new Class[]{String.class}, String.class);
        }
        try {
            return InetAddress.getByName(new URL(str2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
            return "";
        }
    }
}
