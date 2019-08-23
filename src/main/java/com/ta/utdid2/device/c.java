package com.ta.utdid2.device;

import android.content.Context;
import android.provider.Settings;
import com.ta.utdid2.b.a.b;
import com.ta.utdid2.b.a.e;
import com.ta.utdid2.b.a.g;
import com.ta.utdid2.b.a.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f78876a = null;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f78877f = new Object();
    private static final String o = (".UTSystemConfig" + File.separator + "Global");

    /* renamed from: a  reason: collision with other field name */
    private com.ta.utdid2.c.a.c f55a;

    /* renamed from: a  reason: collision with other field name */
    private d f56a;

    /* renamed from: a  reason: collision with other field name */
    private Pattern f57a = Pattern.compile("[^0-9a-zA-Z=/+]+");

    /* renamed from: b  reason: collision with root package name */
    private com.ta.utdid2.c.a.c f78878b;
    private String l;
    private String m = "xx_utdid_key";
    private Context mContext;
    private String n = "xx_utdid_domain";

    private String g() {
        if (this.f78878b != null) {
            String string = this.f78878b.getString("UTDID2");
            if (!i.a(string) && this.f56a.a(string) != null) {
                return string;
            }
        }
        return null;
    }

    public synchronized String getValue() {
        if (this.l != null) {
            return this.l;
        }
        return h();
    }

    private final byte[] a() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int nextInt = new Random().nextInt();
        byte[] bytes = e.getBytes((int) (System.currentTimeMillis() / 1000));
        byte[] bytes2 = e.getBytes(nextInt);
        byteArrayOutputStream.write(bytes, 0, 4);
        byteArrayOutputStream.write(bytes2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = g.a(this.mContext);
        } catch (Exception unused) {
            str = new Random().nextInt();
        }
        byteArrayOutputStream.write(e.getBytes(i.a(str)), 0, 4);
        byteArrayOutputStream.write(e.getBytes(i.a(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private void d() {
        if (this.f78878b != null) {
            if (i.a(this.f78878b.getString("UTDID2"))) {
                String string = this.f78878b.getString("UTDID");
                if (!i.a(string)) {
                    f(string);
                }
            }
            boolean z = false;
            if (!i.a(this.f78878b.getString("DID"))) {
                this.f78878b.remove("DID");
                z = true;
            }
            if (!i.a(this.f78878b.getString("EI"))) {
                this.f78878b.remove("EI");
                z = true;
            }
            if (!i.a(this.f78878b.getString("SI"))) {
                this.f78878b.remove("SI");
                z = true;
            }
            if (z) {
                this.f78878b.commit();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018 A[SYNTHETIC, Splitter:B:10:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String h() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = ""
            android.content.Context r1 = r6.mContext     // Catch:{ Exception -> 0x0010 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0010 }
            java.lang.String r2 = "mqBRboGZkQPcAkyk"
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r2)     // Catch:{ Exception -> 0x0010 }
            r0 = r1
        L_0x0010:
            boolean r1 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x0018
            monitor-exit(r6)
            return r0
        L_0x0018:
            com.ta.utdid2.device.e r0 = new com.ta.utdid2.device.e     // Catch:{ all -> 0x010d }
            r0.<init>()     // Catch:{ all -> 0x010d }
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.mContext     // Catch:{ Exception -> 0x002c }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "dxCRMxhQkdGePGnp"
            java.lang.String r3 = android.provider.Settings.System.getString(r3, r4)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            boolean r4 = com.ta.utdid2.b.a.i.a((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = r0.c(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0042
            r6.h(r4)     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r4
        L_0x0042:
            java.lang.String r4 = r0.b(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0068
            com.ta.utdid2.device.d r5 = r6.f56a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r5.a(r4)     // Catch:{ all -> 0x010d }
            boolean r5 = com.ta.utdid2.b.a.i.a((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 != 0) goto L_0x0068
            r6.j(r4)     // Catch:{ all -> 0x010d }
            android.content.Context r4 = r6.mContext     // Catch:{ Exception -> 0x0068 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r5 = "dxCRMxhQkdGePGnp"
            java.lang.String r4 = android.provider.Settings.System.getString(r4, r5)     // Catch:{ Exception -> 0x0068 }
            r3 = r4
        L_0x0068:
            com.ta.utdid2.device.d r4 = r6.f56a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r4.b(r3)     // Catch:{ all -> 0x010d }
            boolean r5 = r6.b((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0086
            r6.l = r4     // Catch:{ all -> 0x010d }
            r6.f(r4)     // Catch:{ all -> 0x010d }
            r6.g(r3)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.l     // Catch:{ all -> 0x010d }
            r6.h(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.l     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r0
        L_0x0085:
            r1 = 1
        L_0x0086:
            java.lang.String r3 = r6.g()     // Catch:{ all -> 0x010d }
            boolean r4 = r6.b((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 == 0) goto L_0x00a5
            com.ta.utdid2.device.d r0 = r6.f56a     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.a(r3)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x009b
            r6.j(r0)     // Catch:{ all -> 0x010d }
        L_0x009b:
            r6.h(r3)     // Catch:{ all -> 0x010d }
            r6.g(r0)     // Catch:{ all -> 0x010d }
            r6.l = r3     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r3
        L_0x00a5:
            com.ta.utdid2.c.a.c r3 = r6.f55a     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r6.m     // Catch:{ all -> 0x010d }
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x010d }
            boolean r4 = com.ta.utdid2.b.a.i.a((java.lang.String) r3)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00e5
            java.lang.String r0 = r0.b(r3)     // Catch:{ all -> 0x010d }
            boolean r4 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00c3
            com.ta.utdid2.device.d r0 = r6.f56a     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r0.b(r3)     // Catch:{ all -> 0x010d }
        L_0x00c3:
            boolean r3 = r6.b((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r3 == 0) goto L_0x00e5
            com.ta.utdid2.device.d r3 = r6.f56a     // Catch:{ all -> 0x010d }
            java.lang.String r3 = r3.a(r0)     // Catch:{ all -> 0x010d }
            boolean r4 = com.ta.utdid2.b.a.i.a((java.lang.String) r0)     // Catch:{ all -> 0x010d }
            if (r4 != 0) goto L_0x00e5
            r6.l = r0     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x00dc
            r6.j(r3)     // Catch:{ all -> 0x010d }
        L_0x00dc:
            java.lang.String r0 = r6.l     // Catch:{ all -> 0x010d }
            r6.f(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = r6.l     // Catch:{ all -> 0x010d }
            monitor-exit(r6)
            return r0
        L_0x00e5:
            byte[] r0 = r6.a()     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x010b
            r3 = 2
            java.lang.String r3 = com.ta.utdid2.b.a.b.encodeToString(r0, r3)     // Catch:{ Exception -> 0x010b }
            r6.l = r3     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = r6.l     // Catch:{ Exception -> 0x010b }
            r6.f(r3)     // Catch:{ Exception -> 0x010b }
            com.ta.utdid2.device.d r3 = r6.f56a     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = r3.c(r0)     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x0107
            if (r1 == 0) goto L_0x0104
            r6.j(r0)     // Catch:{ Exception -> 0x010b }
        L_0x0104:
            r6.g(r0)     // Catch:{ Exception -> 0x010b }
        L_0x0107:
            java.lang.String r0 = r6.l     // Catch:{ Exception -> 0x010b }
            monitor-exit(r6)
            return r0
        L_0x010b:
            monitor-exit(r6)
            return r2
        L_0x010d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.device.c.h():java.lang.String");
    }

    private void j(String str) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && str != null) {
            i(str);
        }
    }

    public static c a(Context context) {
        if (context != null && f78876a == null) {
            synchronized (f78877f) {
                if (f78876a == null) {
                    c cVar = new c(context);
                    f78876a = cVar;
                    cVar.d();
                }
            }
        }
        return f78876a;
    }

    private static String b(byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes(), instance.getAlgorithm()));
        return b.encodeToString(instance.doFinal(bArr), 2);
    }

    private void f(String str) {
        if (b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && this.f78878b != null) {
                this.f78878b.putString("UTDID2", str);
                this.f78878b.commit();
            }
        }
    }

    private void g(String str) {
        if (str != null && this.f55a != null && !str.equals(this.f55a.getString(this.m))) {
            this.f55a.putString(this.m, str);
            this.f55a.commit();
        }
    }

    private void i(String str) {
        String str2;
        try {
            str2 = Settings.System.getString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp");
        } catch (Exception unused) {
            str2 = null;
        }
        if (!str.equals(str2)) {
            try {
                Settings.System.putString(this.mContext.getContentResolver(), "dxCRMxhQkdGePGnp", str);
            } catch (Exception unused2) {
            }
        }
    }

    public c(Context context) {
        this.mContext = context;
        com.ta.utdid2.c.a.c cVar = new com.ta.utdid2.c.a.c(context, o, "Alvin2", false, true);
        this.f78878b = cVar;
        com.ta.utdid2.c.a.c cVar2 = new com.ta.utdid2.c.a.c(context, ".DataStorage", "ContextData", false, true);
        this.f55a = cVar2;
        this.f56a = new d();
        this.m = String.format("K_%d", new Object[]{Integer.valueOf(i.a(this.m))});
        this.n = String.format("D_%d", new Object[]{Integer.valueOf(i.a(this.n))});
    }

    private boolean b(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 != str.length() || this.f57a.matcher(str).find()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void h(String str) {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && b(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length()) {
                String str2 = null;
                try {
                    str2 = Settings.System.getString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk");
                } catch (Exception unused) {
                }
                if (!b(str2)) {
                    try {
                        Settings.System.putString(this.mContext.getContentResolver(), "mqBRboGZkQPcAkyk", str);
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
