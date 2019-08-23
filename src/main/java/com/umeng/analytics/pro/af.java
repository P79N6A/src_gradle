package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class af {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f80349b = "pbl0".getBytes();

    /* renamed from: f  reason: collision with root package name */
    private static af f80350f;

    /* renamed from: c  reason: collision with root package name */
    private az f80351c;

    /* renamed from: d  reason: collision with root package name */
    private a f80352d = new a();

    /* renamed from: e  reason: collision with root package name */
    private bn f80353e = null;
    private Context g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f80354a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f80355b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f80356c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f80357d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f80358e = -1;

        /* renamed from: f  reason: collision with root package name */
        private String f80359f;
        private int g = -1;
        private String h;
        private int i = -1;
        private int j = -1;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;

        public boolean a() {
            if (this.g != -1) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (this.i == 1) {
                return true;
            }
            return false;
        }

        a() {
        }

        public String g(String str) {
            return this.h;
        }

        public String a(String str) {
            if (this.n != null) {
                return this.n;
            }
            return str;
        }

        public String b(String str) {
            if (this.o != null) {
                return this.o;
            }
            return str;
        }

        public String c(String str) {
            if (this.m != null) {
                return this.m;
            }
            return str;
        }

        public String d(String str) {
            if (this.l != null) {
                return this.l;
            }
            return str;
        }

        public String e(String str) {
            if (this.k != null) {
                return this.k;
            }
            return str;
        }

        public int a(int i2) {
            if (this.f80354a != -1 && this.f80354a <= 3 && this.f80354a >= 0) {
                return this.f80354a;
            }
            return i2;
        }

        public int b(int i2) {
            if (this.f80355b != -1 && this.f80355b >= 0 && this.f80355b <= 1800) {
                return this.f80355b * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            }
            return i2;
        }

        public int c(int i2) {
            if (this.f80356c == 0 || this.f80356c == 1 || this.f80356c == -1) {
                return this.f80356c;
            }
            return i2;
        }

        public int d(int i2) {
            if (this.g == -1 || this.g < 90 || this.g > 86400) {
                return i2;
            }
            return this.g * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        }

        public String f(String str) {
            if (this.f80359f == null || !bg.a(this.f80359f)) {
                return str;
            }
            return this.f80359f;
        }

        a(bn bnVar) {
            a(bnVar);
        }

        public long a(long j2) {
            if (this.j != -1 && this.j >= 48) {
                return ((long) this.j) * 3600000;
            }
            return j2;
        }

        public void a(bn bnVar) {
            if (bnVar != null) {
                this.f80354a = a(bnVar, "defcon");
                this.f80355b = a(bnVar, "latent");
                this.f80356c = a(bnVar, "codex");
                this.f80357d = a(bnVar, "report_policy");
                this.f80358e = a(bnVar, "report_interval");
                this.f80359f = b(bnVar, "client_test");
                this.g = a(bnVar, "test_report_interval");
                this.h = b(bnVar, "umid");
                this.i = a(bnVar, "integrated_test");
                this.j = a(bnVar, "latent_hours");
                this.k = b(bnVar, "country");
                this.l = b(bnVar, "domain_p");
                this.m = b(bnVar, "domain_s");
                this.n = b(bnVar, "initial_view_time");
                this.o = b(bnVar, "track_list");
            }
        }

        private int a(bn bnVar, String str) {
            if (bnVar != null) {
                try {
                    if (bnVar.f()) {
                        bo boVar = (bo) bnVar.d().get(str);
                        if (boVar != null) {
                            if (!TextUtils.isEmpty(boVar.c())) {
                                return Integer.parseInt(boVar.c().trim());
                            }
                        }
                        return -1;
                    }
                } catch (Exception unused) {
                    return -1;
                }
            }
            return -1;
        }

        private String b(bn bnVar, String str) {
            String str2;
            if (bnVar != null) {
                try {
                    if (bnVar.f()) {
                        bo boVar = (bo) bnVar.d().get(str);
                        if (boVar != null) {
                            if (!TextUtils.isEmpty(boVar.c())) {
                                str2 = boVar.c();
                                return str2;
                            }
                        }
                        return null;
                    }
                } catch (Exception unused) {
                    str2 = null;
                }
            }
            return null;
        }

        public int[] a(int i2, int i3) {
            if (this.f80357d == -1 || !ca.a(this.f80357d)) {
                return new int[]{i2, i3};
            }
            if (this.f80358e == -1 || this.f80358e < 90 || this.f80358e > 86400) {
                this.f80358e = 90;
            }
            return new int[]{this.f80357d, this.f80358e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE};
        }
    }

    public a b() {
        return this.f80352d;
    }

    public synchronized bn a() {
        return this.f80353e;
    }

    public boolean e() {
        return new File(this.g.getFilesDir(), ".imprint").delete();
    }

    public void d() {
        if (this.f80353e != null) {
            try {
                bw.a(new File(this.g.getFilesDir(), ".imprint"), new cp().a(this.f80353e));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[SYNTHETIC, Splitter:B:19:0x0036] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r4.g
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".imprint"
            r0.<init>(r1, r2)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            r0 = 0
            android.content.Context r1 = r4.g     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            java.lang.String r2 = ".imprint"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            byte[] r2 = com.umeng.analytics.pro.bw.b((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0031, all -> 0x0026 }
            com.umeng.analytics.pro.bw.c(r1)
            r0 = r2
            goto L_0x0034
        L_0x0026:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x002c
        L_0x002b:
            r1 = move-exception
        L_0x002c:
            com.umeng.analytics.pro.bw.c(r0)
            throw r1
        L_0x0030:
            r1 = r0
        L_0x0031:
            com.umeng.analytics.pro.bw.c(r1)
        L_0x0034:
            if (r0 == 0) goto L_0x004b
            com.umeng.analytics.pro.bn r1 = new com.umeng.analytics.pro.bn     // Catch:{ Exception -> 0x004b }
            r1.<init>()     // Catch:{ Exception -> 0x004b }
            com.umeng.analytics.pro.cj r2 = new com.umeng.analytics.pro.cj     // Catch:{ Exception -> 0x004b }
            r2.<init>()     // Catch:{ Exception -> 0x004b }
            r2.a((com.umeng.analytics.pro.cg) r1, (byte[]) r0)     // Catch:{ Exception -> 0x004b }
            r4.f80353e = r1     // Catch:{ Exception -> 0x004b }
            com.umeng.analytics.pro.af$a r0 = r4.f80352d     // Catch:{ Exception -> 0x004b }
            r0.a((com.umeng.analytics.pro.bn) r1)     // Catch:{ Exception -> 0x004b }
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.af.c():void");
    }

    public void a(az azVar) {
        this.f80351c = azVar;
    }

    af(Context context) {
        this.g = context;
    }

    public static synchronized af a(Context context) {
        af afVar;
        synchronized (af.class) {
            if (f80350f == null) {
                af afVar2 = new af(context);
                f80350f = afVar2;
                afVar2.c();
            }
            afVar = f80350f;
        }
        return afVar;
    }

    public byte[] a(bo boVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(boVar.f());
        byte[] array = allocate.array();
        byte[] bArr = f80349b;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (array[i] ^ bArr[i]);
        }
        return bArr2;
    }

    private boolean c(bn bnVar) {
        if (!bnVar.j().equals(a(bnVar))) {
            return false;
        }
        for (bo boVar : bnVar.d().values()) {
            byte[] a2 = bt.a(boVar.i());
            byte[] a3 = a(boVar);
            int i = 0;
            while (true) {
                if (i < 4) {
                    if (a2[i] != a3[i]) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    private bn d(bn bnVar) {
        Map d2 = bnVar.d();
        ArrayList<String> arrayList = new ArrayList<>(d2.size() / 2);
        for (Map.Entry entry : d2.entrySet()) {
            if (!((bo) entry.getValue()).e()) {
                arrayList.add(entry.getKey());
            }
        }
        for (String remove : arrayList) {
            d2.remove(remove);
        }
        return bnVar;
    }

    public void b(bn bnVar) {
        String str;
        bn bnVar2;
        boolean z;
        if (bnVar != null && c(bnVar)) {
            synchronized (this) {
                bn bnVar3 = this.f80353e;
                String str2 = null;
                if (bnVar3 == null) {
                    str = null;
                } else {
                    str = bnVar3.j();
                }
                if (bnVar3 == null) {
                    bnVar2 = d(bnVar);
                } else {
                    bnVar2 = a(bnVar3, bnVar);
                }
                this.f80353e = bnVar2;
                if (bnVar2 != null) {
                    str2 = bnVar2.j();
                }
                z = !a(str, str2);
            }
            if (this.f80353e != null && z) {
                this.f80352d.a(this.f80353e);
                if (this.f80351c != null) {
                    this.f80351c.a(this.f80352d);
                }
            }
        }
    }

    public String a(bn bnVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(bnVar.d()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((bo) entry.getValue()).e()) {
                sb.append(((bo) entry.getValue()).c());
            }
            sb.append(((bo) entry.getValue()).f());
            sb.append(((bo) entry.getValue()).i());
        }
        sb.append(bnVar.f80490b);
        return bw.a(sb.toString()).toLowerCase(Locale.US);
    }

    private boolean a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    private bn a(bn bnVar, bn bnVar2) {
        if (bnVar2 == null) {
            return bnVar;
        }
        Map d2 = bnVar.d();
        for (Map.Entry entry : bnVar2.d().entrySet()) {
            if (((bo) entry.getValue()).e()) {
                d2.put(entry.getKey(), entry.getValue());
            } else {
                d2.remove(entry.getKey());
            }
        }
        bnVar.a(bnVar2.g());
        bnVar.a(a(bnVar));
        return bnVar;
    }
}
