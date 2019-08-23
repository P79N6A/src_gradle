package anet.channel.util;

import android.util.Base64;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f1447a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f1448b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1449c;

    /* renamed from: d  reason: collision with root package name */
    private final String f1450d;

    public static g a() {
        return f1447a;
    }

    public Proxy b() {
        return this.f1448b;
    }

    public String c() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f1449c);
        sb.append(":");
        sb.append(this.f1450d);
        String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 0);
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Basic ");
        sb2.append(encodeToString);
        return sb2.toString();
    }

    public g(String str, int i, String str2, String str3) {
        this.f1448b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i));
        this.f1449c = str2;
        this.f1450d = str3;
    }
}
