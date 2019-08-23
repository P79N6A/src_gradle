package cn.com.chinatelecom.account.api.b;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import cn.com.chinatelecom.account.api.CtAuth;
import java.net.InetAddress;

public class d extends a {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f1772b = "d";
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f1773c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ConnectivityManager f1774d;

    /* renamed from: e  reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f1775e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public a f1776f;
    /* access modifiers changed from: private */
    public long g;
    /* access modifiers changed from: private */
    public long h;

    public interface a {
        void a();

        void a(int i, String str, long j);

        void a(Network network, long j);
    }

    public static int a(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (Throwable th) {
            CtAuth.warn(f1772b, "When InetAddress.getByName(),throws exception", th);
            return -1;
        }
    }

    @TargetApi(21)
    private void a(Context context) {
        this.g = 0;
        this.f1774d = (ConnectivityManager) context.getSystemService("connectivity");
        this.h = System.currentTimeMillis();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        NetworkRequest build = builder.build();
        this.f1775e = new ConnectivityManager.NetworkCallback() {
            public void onAvailable(Network network) {
                long unused = d.this.g = System.currentTimeMillis() - d.this.h;
                boolean unused2 = d.this.f1773c = true;
                if (d.this.f1776f != null) {
                    d.this.f1776f.a(network, d.this.g);
                }
                if (d.this.f1774d != null) {
                    try {
                        d.this.f1774d.unregisterNetworkCallback(this);
                        ConnectivityManager unused3 = d.this.f1774d = null;
                    } catch (Throwable th) {
                        CtAuth.warn(d.f1772b, "switchToMobileForAboveL", th);
                    }
                }
            }
        };
        this.f1774d.requestNetwork(build, this.f1775e);
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
        return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
    }

    /* access modifiers changed from: private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 21 && this.f1774d != null && this.f1775e != null) {
            try {
                this.f1774d.unregisterNetworkCallback(this.f1775e);
            } catch (Throwable th) {
                CtAuth.warn(f1772b, "unregisterNetworkCallback", th);
            }
            this.f1774d = null;
        }
    }

    private boolean b(Context context, String str) {
        Class<?> cls;
        boolean z = false;
        try {
            cls = Class.forName("android.net.ConnectivityManager");
            this.g = 0;
            this.h = System.currentTimeMillis();
            this.f1774d = (ConnectivityManager) context.getSystemService("connectivity");
            if (this.f1774d.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0) {
                cls.getMethod("startUsingNetworkFeature", new Class[]{Integer.TYPE, String.class}).invoke(this.f1774d, new Object[]{0, "enableHIPRI"});
                for (int i = 0; i < 5; i++) {
                    if (this.f1774d.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                        break;
                    }
                    Thread.sleep(500);
                }
            }
        } catch (Throwable th) {
            th = th;
            CtAuth.warn(f1772b, "4.x网络切换异常", th);
            return z;
        }
        int a2 = a(b(str));
        boolean booleanValue = ((Boolean) cls.getMethod("requestRouteToHost", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(this.f1774d, new Object[]{5, Integer.valueOf(a2)})).booleanValue();
        try {
            this.g = System.currentTimeMillis() - this.h;
            String str2 = f1772b;
            CtAuth.info(str2, "Switch network result ： " + booleanValue + " (4.x) , expendTime ：" + this.g);
            return booleanValue;
        } catch (Throwable th2) {
            z = booleanValue;
            th = th2;
        }
    }

    public void a(final int i) {
        f.a(new Runnable() {
            public void run() {
                if (i > 2500) {
                    try {
                        Thread.sleep(2500);
                    } catch (Throwable th) {
                        CtAuth.warn(d.f1772b, "timeoutCheckRunnable exception!", th);
                    }
                    if (!d.this.f1773c) {
                        if (d.this.f1776f != null) {
                            d.this.f1776f.a(-720002, "切换移动网络超时", 2500);
                        }
                        CtAuth.info(d.f1772b, "切换网络超时(L)");
                        d.this.b();
                        return;
                    }
                }
                try {
                    Thread.sleep((long) (i <= 2500 ? i : i - 2500));
                } catch (Throwable th2) {
                    CtAuth.warn(d.f1772b, "timeoutCheckRunnable exception!", th2);
                }
                if (d.this.f1776f != null) {
                    d.this.f1776f.a();
                }
            }
        });
    }

    public void a(Context context, a aVar) {
        this.f1776f = aVar;
        try {
            a(context);
        } catch (Throwable th) {
            CtAuth.warn(f1772b, "switchToMobileForAboveL", th);
            if (this.f1776f != null) {
                this.f1776f.a(-720001, "切换网络出现异常", -1);
            }
        }
    }

    public boolean a(Context context, String str) {
        return b(context, str);
    }
}
