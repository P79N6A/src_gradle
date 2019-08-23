package com.cmic.sso.sdk.d;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class v {
    public static String a() {
        StringBuilder sb = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        sb.append(nextElement.getHostAddress());
                        sb.append(",");
                    }
                }
            }
            StringBuilder delete = sb.delete(sb.length() - 1, sb.length());
            f.b("UmcIPUtils", "IPV4 ip：" + delete);
            return delete.toString();
        } catch (SocketException unused) {
            return "";
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet6Address) && !nextElement.isLinkLocalAddress()) {
                        sb.append(nextElement.getHostAddress());
                        sb.append(",");
                    }
                }
            }
            if (sb.length() > 1) {
                sb = sb.delete(sb.length() - 1, sb.length());
            }
            f.b("UmcIPUtils", "IPV6 ip：" + sb);
            return sb.toString();
        } catch (SocketException unused) {
            return "";
        }
    }
}
