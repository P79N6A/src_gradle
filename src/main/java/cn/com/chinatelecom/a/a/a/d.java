package cn.com.chinatelecom.a.a.a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    Object f1667a = new Object();

    /* renamed from: c  reason: collision with root package name */
    boolean f1668c = false;

    /* renamed from: d  reason: collision with root package name */
    Handler f1669d = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: package-private */

    /* renamed from: e  reason: collision with root package name */
    public ConnectivityManager f1670e = null;

    /* renamed from: f  reason: collision with root package name */
    ConnectivityManager.NetworkCallback f1671f = null;
    /* access modifiers changed from: package-private */
    public a g;
    long h = 0;
    /* access modifiers changed from: package-private */
    public long i = 0;

    public interface a {
        void a();

        void a(Network network);
    }

    public static int a(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (UnknownHostException unused) {
            return -1;
        }
    }

    public static String b(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 >= 0) {
            str = str.substring(0, indexOf3);
        }
        int indexOf4 = str.indexOf(63);
        if (indexOf4 >= 0) {
            return str.substring(0, indexOf4);
        }
        return str;
    }
}
