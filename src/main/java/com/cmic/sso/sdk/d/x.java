package com.cmic.sso.sdk.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class x {

    /* renamed from: a  reason: collision with root package name */
    static ConnectivityManager f23094a;

    /* renamed from: b  reason: collision with root package name */
    private static x f23095b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Network f23096c;

    /* renamed from: d  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f23097d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f23098e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f23099f;

    public interface a {
        void a(Network network);
    }

    public void b() {
        try {
            if (Build.VERSION.SDK_INT < 21) {
                this.f23099f = false;
                return;
            }
            if (f23094a != null) {
                if (this.f23097d != null) {
                    f23094a.unregisterNetworkCallback(this.f23097d);
                    this.f23097d = null;
                    this.f23096c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT < 21) {
            return this.f23099f;
        }
        if (this.f23096c != null) {
            return true;
        }
        return false;
    }

    private x(Context context) {
        f23094a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public void a(boolean z) {
        this.f23099f = z;
    }

    public static x a(Context context) {
        if (f23095b == null) {
            synchronized (x.class) {
                if (f23095b == null) {
                    f23095b = new x(context);
                }
            }
        }
        return f23095b;
    }

    static int a(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (UnknownHostException unused) {
            return -1;
        }
    }

    static String b(String str) {
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

    /* access modifiers changed from: package-private */
    public void a(final a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (this.f23096c != null && !this.f23098e) {
                NetworkInfo networkInfo = f23094a.getNetworkInfo(this.f23096c);
                if (networkInfo != null && networkInfo.isAvailable()) {
                    aVar.a(this.f23096c);
                    return;
                }
            }
            if (this.f23097d != null) {
                try {
                    f23094a.unregisterNetworkCallback(this.f23097d);
                } catch (Exception unused) {
                    this.f23097d = null;
                }
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(0).build();
            this.f23097d = new ConnectivityManager.NetworkCallback() {
                public void onLost(Network network) {
                    boolean unused = x.this.f23098e = true;
                }

                public void onAvailable(Network network) {
                    Network unused = x.this.f23096c = network;
                    aVar.a(network);
                    boolean unused2 = x.this.f23098e = false;
                }
            };
            f23094a.requestNetwork(build, this.f23097d);
        }
    }
}
