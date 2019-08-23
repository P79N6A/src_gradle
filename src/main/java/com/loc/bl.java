package com.loc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.TextUtils;
import com.amap.api.location.DPoint;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class bl {

    /* renamed from: a  reason: collision with root package name */
    Context f25533a;

    /* renamed from: b  reason: collision with root package name */
    boolean f25534b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f25535c;
    /* access modifiers changed from: package-private */

    /* renamed from: d  reason: collision with root package name */
    public cw f25536d;

    /* renamed from: e  reason: collision with root package name */
    ServiceConnection f25537e;

    /* renamed from: f  reason: collision with root package name */
    ServiceConnection f25538f;
    ServiceConnection g;
    boolean h = false;
    boolean i = false;
    boolean j = false;
    boolean k = false;
    boolean l = false;
    boolean m = false;
    List<Intent> n = new ArrayList();
    boolean o = false;
    private String p;
    private Intent q = new Intent();
    private String r = "com.autonavi.minimap";
    private String s = "com.amap.api.service.AMapService";
    private String t = "com.autonavi.minimap.LBSConnectionService";

    public bl(Context context) {
        this.f25533a = context;
        try {
            this.p = dd.b(bt.a(cy.f(context).getBytes("UTF-8"), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n"));
        } catch (Throwable th) {
            ce.a(th, "ConnectionServiceManager", "ConnectionServiceManager");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[Catch:{ Throwable -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[EDGE_INSN: B:33:0x006f->B:26:0x006f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x003f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            boolean r0 = r6.o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            android.content.Context r1 = r6.f25533a     // Catch:{ Throwable -> 0x0077 }
            boolean r1 = com.loc.cd.b((android.content.Context) r1)     // Catch:{ Throwable -> 0x0077 }
            if (r1 == 0) goto L_0x0071
            android.content.Intent r1 = r6.q     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r2 = "appkey"
            java.lang.String r3 = r6.p     // Catch:{ Throwable -> 0x0077 }
            r1.putExtra(r2, r3)     // Catch:{ Throwable -> 0x0077 }
            android.content.Intent r1 = r6.q     // Catch:{ Throwable -> 0x0077 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r3 = r6.r     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r4 = r6.s     // Catch:{ Throwable -> 0x0077 }
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0077 }
            r1.setComponent(r2)     // Catch:{ Throwable -> 0x0077 }
            android.content.Context r1 = r6.f25533a     // Catch:{ Throwable -> 0x0031 }
            android.content.Intent r2 = r6.q     // Catch:{ Throwable -> 0x0031 }
            android.content.ServiceConnection r3 = r6.f25537e     // Catch:{ Throwable -> 0x0031 }
            boolean r1 = r1.bindService(r2, r3, r0)     // Catch:{ Throwable -> 0x0031 }
            r6.h = r1     // Catch:{ Throwable -> 0x0031 }
        L_0x0031:
            boolean r1 = r6.h     // Catch:{ Throwable -> 0x0077 }
            if (r1 != 0) goto L_0x006f
            java.util.ArrayList r1 = com.loc.cd.c()     // Catch:{ Throwable -> 0x0077 }
            if (r1 == 0) goto L_0x006f
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0077 }
        L_0x003f:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x0077 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r3 = r6.s     // Catch:{ Throwable -> 0x0077 }
            boolean r3 = r2.equals(r3)     // Catch:{ Throwable -> 0x0077 }
            if (r3 != 0) goto L_0x003f
            android.content.Intent r3 = r6.q     // Catch:{ Throwable -> 0x0077 }
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ Throwable -> 0x0077 }
            java.lang.String r5 = r6.r     // Catch:{ Throwable -> 0x0077 }
            r4.<init>(r5, r2)     // Catch:{ Throwable -> 0x0077 }
            r3.setComponent(r4)     // Catch:{ Throwable -> 0x0077 }
            android.content.Context r2 = r6.f25533a     // Catch:{ Throwable -> 0x006b }
            android.content.Intent r3 = r6.q     // Catch:{ Throwable -> 0x006b }
            android.content.ServiceConnection r4 = r6.f25537e     // Catch:{ Throwable -> 0x006b }
            boolean r2 = r2.bindService(r3, r4, r0)     // Catch:{ Throwable -> 0x006b }
            r6.h = r2     // Catch:{ Throwable -> 0x006b }
        L_0x006b:
            boolean r2 = r6.h     // Catch:{ Throwable -> 0x0077 }
            if (r2 == 0) goto L_0x003f
        L_0x006f:
            r6.k = r0     // Catch:{ Throwable -> 0x0077 }
        L_0x0071:
            r6.d()     // Catch:{ Throwable -> 0x0077 }
            r6.b()     // Catch:{ Throwable -> 0x0077 }
        L_0x0077:
            r6.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bl.a():void");
    }

    public final void b() {
        if (!this.m && !this.o) {
            try {
                if (cd.f(this.f25533a)) {
                    List<cg> h2 = cd.h();
                    if (h2 != null && h2.size() > 0) {
                        for (cg cgVar : h2) {
                            if (cgVar != null) {
                                if (cgVar.f25651a) {
                                    Intent intent = new Intent();
                                    intent.setComponent(new ComponentName(cgVar.f25652b, cgVar.f25653c));
                                    if (!TextUtils.isEmpty(cgVar.f25655e)) {
                                        intent.setAction(cgVar.f25655e);
                                    }
                                    List<Map<String, String>> list = cgVar.f25654d;
                                    if (list != null && list.size() > 0) {
                                        for (int i2 = 0; i2 < list.size(); i2++) {
                                            Iterator it2 = list.get(i2).entrySet().iterator();
                                            if (it2.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it2.next();
                                                intent.putExtra(((String) entry.getKey()).toString(), ((String) entry.getValue()).toString());
                                            }
                                        }
                                    }
                                    if (cgVar.f25656f) {
                                        this.f25533a.startService(intent);
                                        this.n.add(intent);
                                    }
                                    if (this.f25533a.bindService(intent, this.g, 1)) {
                                        this.j = true;
                                    }
                                }
                            }
                        }
                    }
                    this.m = true;
                }
            } catch (Throwable th) {
                ce.a(th, "ConnectionServiceManager", "bindOtherService");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AMapLocationServer c() {
        try {
            if (this.f25534b) {
                if (this.h) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "corse");
                    bundle.putString("appkey", this.p);
                    bundle.putInt("opensdk", 1);
                    if (this.f25536d != null) {
                        this.f25536d.a(bundle);
                        if (bundle.size() > 0) {
                            return a(bundle);
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            ce.a(th, "ConnectionServiceManager", "sendCommand");
        }
    }

    private void d() {
        Context context = this.f25533a;
        boolean z = false;
        if (cd.r) {
            if (!(cd.s == -1 || cd.t == 0)) {
                if (!cn.b(cd.t, cl.b(context, "pref", "pushSerTime", 0))) {
                    cd.c(context);
                    cl.a(context, "pref", "pushCount", 1);
                } else {
                    int b2 = cl.b(context, "pref", "pushCount", 0);
                    if (b2 < cd.s) {
                        cl.a(context, "pref", "pushCount", b2 + 1);
                    }
                }
            }
            z = true;
        }
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("appkey", this.p);
            intent.setComponent(new ComponentName(this.r, this.t));
            try {
                this.i = this.f25533a.bindService(intent, this.f25538f, 1);
            } catch (Throwable unused) {
            }
            if (!this.i) {
                ArrayList<String> arrayList = cd.u;
                if (arrayList != null) {
                    Iterator<String> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (!next.equals(this.t)) {
                            intent.setComponent(new ComponentName(this.r, next));
                            try {
                                this.i = this.f25533a.bindService(intent, this.f25538f, 1);
                            } catch (Throwable unused2) {
                            }
                            if (this.h) {
                                break;
                            }
                        }
                    }
                }
            }
            this.l = true;
        }
    }

    private AMapLocationServer a(Bundle bundle) {
        byte[] bArr;
        DPoint dPoint;
        if (!bundle.containsKey("key")) {
            return null;
        }
        try {
            bArr = bt.b(dd.b(bundle.getString("key")), "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDCEYwdO3V2ANrhApjqyk7X8FH5AEaWly58kP9IDAhMqwtIbmcJrUK9oO9Afh3KZnOlDtjiowy733YqpLRO7WBvdbW/c4Dz/d3dy/m+6HMqxaak+GQQRHw/VPdKciaZ3eIZp4MWOyIQwiFSQvPTAo/Na8hV4SgBZHB3lGFw0yu+BmG+h32eIE6p4Y8EDCn+G+yzekX+taMrWTQIysledrygZSGPv1ukbdFDnH/xZEI0dCr9pZT+AZQl3o9a2aMyuRrHM0oupXKKiYl69Y8fKh1Tyd752rF6LrR5uOb9aOfXt18hb+3YL5P9rQ+ZRYbyHYFaxzBPA2jLq0KUQ+Dmg7YhAgMBAAECggEAL9pj0lF3BUHwtssNKdf42QZJMD0BKuDcdZrLV9ifs0f54EJY5enzKw8j76MpdV8N5QVkNX4/BZR0bs9uJogh31oHFs5EXeWbb7V8P7bRrxpNnSAijGBWwscQsyqymf48YlcL28949ujnjoEz3jQjgWOyYnrCgpVhphrQbCGmB5TcZnTFvHfozt/0tzuMj5na5lRnkD0kYXgr0x/SRZcPoCybSpc3t/B/9MAAboGaV/QQkTotr7VOuJfaPRjvg8rzyPzavo3evxsjXj7vDXbN4w0cbk/Uqn2JtvPQ8HoysmF2HdYvILZibvJmWH1hA58b4sn5s6AqFRjMOL7rHdD+gQKBgQD+IzoofmZK5tTxgO9sWsG71IUeshQP9fe159jKCehk1RfuIqqbRP0UcxJiw4eNjHs4zU0HeRL3iF5XfUs0FQanO/pp6YL1xgVdfQlDdTdk6KFHJ0sUJapnJn1S2k7IKfRKE1+rkofSXMYUTsgHF1fDp+gxy4yUMY+h9O+JlKVKOwKBgQDDfaDIblaSm+B0lyG//wFPynAeGd0Q8wcMZbQQ/LWMJZhMZ7fyUZ+A6eL/jB53a2tgnaw2rXBpMe1qu8uSpym2plU0fkgLAnVugS5+KRhOkUHyorcbpVZbs5azf7GlTydR5dI1PHF3Bncemoa6IsEvumHWgQbVyTTz/O9mlFafUwKBgQCvDebms8KUf5JY1F6XfaCLWGVl8nZdVCmQFKbA7Lg2lI5KS3jHQWsupeEZRORffU/3nXsc1apZ9YY+r6CYvI77rRXd1KqPzxos/o7d96TzjkZhc9CEjTlmmh2jb5rqx/Ns/xFcZq/GGH+cx3ODZvHeZQ9NFY+9GLJ+dfB2DX0ZtwKBgQC+9/lZ8telbpqMqpqwqRaJ8LMn5JIdHZu0E6IcuhFLr+ogMW3zTKMpVtGGXEXi2M/TWRPDchiO2tQX4Q5T2/KW19QCbJ5KCwPWiGF3owN4tNOciDGh0xkSidRc0xAh8bnyejSoBry8zlcNUVztdkgMLOGonvCjZWPSOTNQnPYluwKBgCV+WVftpTk3l+OfAJTaXEPNYdh7+WQjzxZKjUaDzx80Ts7hRo2U+EQT7FBjQQNqmmDnWtujo5p1YmJC0FT3n1CVa7g901pb3b0RcOziYWAoJi0/+kLyeo6XBhuLeZ7h90S70GGh1o0V/j/9N1jb5DCL4xKkvdYePPTSTku0BM+n");
        } catch (Throwable th) {
            ce.a(th, "ConnectionServiceManager", "parseData part");
            bArr = null;
        }
        if (bundle.containsKey("result")) {
            byte[] b2 = dd.b(bundle.getString("result"));
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, new SecretKeySpec(bArr, "AES"), bt.f25583a);
                JSONObject jSONObject = new JSONObject(new String(instance.doFinal(b2), "utf-8"));
                if (jSONObject.has("error")) {
                    String string = jSONObject.getString("error");
                    if ("invaid type".equals(string)) {
                        this.f25534b = false;
                    }
                    if ("empty appkey".equals(string)) {
                        this.f25534b = false;
                    }
                    if ("refused".equals(string)) {
                        this.f25534b = false;
                    }
                    "failed".equals(string);
                    return null;
                }
                AMapLocationServer aMapLocationServer = new AMapLocationServer("");
                aMapLocationServer.b(jSONObject);
                aMapLocationServer.setProvider("lbs");
                aMapLocationServer.setLocationType(7);
                if ("WGS84".equals(aMapLocationServer.e()) && ce.a(aMapLocationServer.getLatitude(), aMapLocationServer.getLongitude())) {
                    Context context = this.f25533a;
                    double longitude = aMapLocationServer.getLongitude();
                    double latitude = aMapLocationServer.getLatitude();
                    if (context == null) {
                        dPoint = null;
                    } else {
                        dPoint = cf.a(context, new DPoint(latitude, longitude));
                    }
                    aMapLocationServer.setLatitude(dPoint.getLatitude());
                    aMapLocationServer.setLongitude(dPoint.getLongitude());
                }
                return aMapLocationServer;
            } catch (Throwable th2) {
                ce.a(th2, bl.class.getName(), "parseData");
            }
        }
        return null;
    }
}
