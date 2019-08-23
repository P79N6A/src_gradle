package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.b.g;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f79915a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Integer> f79916b;

    /* renamed from: c  reason: collision with root package name */
    private h f79917c = null;

    public o(Context context, Map<String, Integer> map, h hVar) {
        this.f79915a = context;
    }

    private static c a(String str, int i) {
        int i2;
        c cVar = new c();
        Socket socket = new Socket();
        try {
            cVar.f79881c = str;
            cVar.f79882d = i;
            long currentTimeMillis = System.currentTimeMillis();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
            socket.connect(inetSocketAddress, 30000);
            cVar.f79879a = System.currentTimeMillis() - currentTimeMillis;
            cVar.f79883e = inetSocketAddress.getAddress().getHostAddress();
            socket.close();
            try {
                socket.close();
            } catch (Throwable unused) {
            }
            i2 = 0;
        } catch (IOException unused2) {
            i2 = -1;
            socket.close();
        } catch (Throwable unused3) {
        }
        cVar.f79880b = i2;
        return cVar;
        throw th;
    }

    private static Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        String a2 = d.a("__MTA_TEST_SPEED__", (String) null);
        if (!(a2 == null || a2.trim().length() == 0)) {
            for (String split : a2.split(";")) {
                String[] split2 = split.split(",");
                if (split2 != null && split2.length == 2) {
                    String str = split2[0];
                    if (!(str == null || str.trim().length() == 0)) {
                        try {
                            hashMap.put(str, Integer.valueOf(Integer.valueOf(split2[1]).intValue()));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public final void run() {
        b e2;
        String str;
        try {
            if (this.f79916b == null) {
                this.f79916b = a();
            }
            if (this.f79916b != null) {
                if (this.f79916b.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry next : this.f79916b.entrySet()) {
                        String str2 = (String) next.getKey();
                        if (str2 != null) {
                            if (str2.length() != 0) {
                                if (((Integer) next.getValue()) == null) {
                                    e2 = g.r;
                                    str = "port is null for ".concat(String.valueOf(str2));
                                    e2.c(str);
                                } else {
                                    jSONArray.put(a((String) next.getKey(), ((Integer) next.getValue()).intValue()).a());
                                }
                            }
                        }
                        e2 = g.r;
                        str = "empty domain name.";
                        e2.c(str);
                    }
                    if (jSONArray.length() != 0) {
                        g gVar = new g(this.f79915a, g.a(this.f79915a, false, this.f79917c), this.f79917c);
                        gVar.f79876a = jSONArray.toString();
                        new p(gVar).a();
                        return;
                    }
                    return;
                }
            }
            g.r.a("empty domain list.");
        } catch (Throwable unused) {
        }
    }
}
