package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class hh {

    /* renamed from: a  reason: collision with root package name */
    private static long f82164a = 0;

    /* renamed from: a  reason: collision with other field name */
    protected static final String f487a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: a  reason: collision with other field name */
    public static final DateFormat f488a;

    /* renamed from: b  reason: collision with root package name */
    private static String f82165b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f82166c = (hs.a(5) + "-");

    /* renamed from: a  reason: collision with other field name */
    private hl f489a = null;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f490a = new CopyOnWriteArrayList();

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, Object> f491a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private String f82167d = f82165b;

    /* renamed from: e  reason: collision with root package name */
    private String f82168e;

    /* renamed from: f  reason: collision with root package name */
    private String f82169f;
    private String g;
    private String h;
    private String i;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f488a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public hh() {
    }

    public hh(Bundle bundle) {
        this.f82169f = bundle.getString("ext_to");
        this.g = bundle.getString("ext_from");
        this.h = bundle.getString("ext_chid");
        this.f82168e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f490a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                he a2 = he.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f490a.add(a2);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f489a = new hl(bundle2);
        }
    }

    public static String i() {
        String sb;
        synchronized (hh.class) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f82166c);
                long j = f82164a;
                f82164a = 1 + j;
                sb2.append(Long.toString(j));
                sb = sb2.toString();
            } catch (Throwable th) {
                Class<hh> cls = hh.class;
                throw th;
            }
        }
        return sb;
    }

    public static String q() {
        return f487a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f82167d)) {
            bundle.putString("ext_ns", this.f82167d);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("ext_from", this.g);
        }
        if (!TextUtils.isEmpty(this.f82169f)) {
            bundle.putString("ext_to", this.f82169f);
        }
        if (!TextUtils.isEmpty(this.f82168e)) {
            bundle.putString("ext_pkt_id", this.f82168e);
        }
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("ext_chid", this.h);
        }
        if (this.f489a != null) {
            bundle.putBundle("ext_ERROR", this.f489a.a());
        }
        if (this.f490a != null) {
            Bundle[] bundleArr = new Bundle[this.f490a.size()];
            int i2 = 0;
            for (he a2 : this.f490a) {
                Bundle a3 = a2.a();
                if (a3 != null) {
                    bundleArr[i2] = a3;
                    i2++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public he a(String str) {
        return a(str, null);
    }

    public he a(String str, String str2) {
        for (he next : this.f490a) {
            if ((str2 == null || str2.equals(next.b())) && str.equals(next.a())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public hl m365a() {
        return this.f489a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Object m366a(String str) {
        Object obj;
        synchronized (this) {
            obj = this.f491a == null ? null : this.f491a.get(str);
        }
        return obj;
    }

    /* renamed from: a  reason: collision with other method in class */
    public abstract String m367a();

    /* renamed from: a  reason: collision with other method in class */
    public Collection<he> m368a() {
        List emptyList;
        synchronized (this) {
            emptyList = this.f490a == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(this.f490a));
        }
        return emptyList;
    }

    public void a(he heVar) {
        this.f490a.add(heVar);
    }

    public void a(hl hlVar) {
        this.f489a = hlVar;
    }

    public Collection<String> b() {
        Set emptySet;
        synchronized (this) {
            emptySet = this.f491a == null ? Collections.emptySet() : Collections.unmodifiableSet(new HashSet(this.f491a.keySet()));
        }
        return emptySet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a5, code lost:
        if (r4.f82167d.equals(r5.f82167d) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
        if (r5.f82167d == null) goto L_0x0004;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L_0x0007
        L_0x0004:
            r1 = 1
            goto L_0x00b0
        L_0x0007:
            if (r5 == 0) goto L_0x00b0
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 != r3) goto L_0x00b0
            com.xiaomi.push.hh r5 = (com.xiaomi.push.hh) r5
            com.xiaomi.push.hl r2 = r4.f489a
            if (r2 == 0) goto L_0x0024
            com.xiaomi.push.hl r2 = r4.f489a
            com.xiaomi.push.hl r3 = r5.f489a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x002a
        L_0x0024:
            com.xiaomi.push.hl r2 = r5.f489a
            if (r2 == 0) goto L_0x002a
            goto L_0x00b0
        L_0x002a:
            java.lang.String r2 = r4.g
            if (r2 == 0) goto L_0x0039
            java.lang.String r2 = r4.g
            java.lang.String r3 = r5.g
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x003f
        L_0x0039:
            java.lang.String r2 = r5.g
            if (r2 == 0) goto L_0x003f
            goto L_0x00b0
        L_0x003f:
            java.util.List<com.xiaomi.push.he> r2 = r4.f490a
            java.util.List<com.xiaomi.push.he> r3 = r5.f490a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r2 = r4.f82168e
            if (r2 == 0) goto L_0x0058
            java.lang.String r2 = r4.f82168e
            java.lang.String r3 = r5.f82168e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x005d
        L_0x0058:
            java.lang.String r2 = r5.f82168e
            if (r2 == 0) goto L_0x005d
            goto L_0x00b0
        L_0x005d:
            java.lang.String r2 = r4.h
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r4.h
            java.lang.String r3 = r5.h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x0071
        L_0x006c:
            java.lang.String r2 = r5.h
            if (r2 == 0) goto L_0x0071
            goto L_0x00b0
        L_0x0071:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.f491a
            if (r2 == 0) goto L_0x0080
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.f491a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f491a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x0085
        L_0x0080:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f491a
            if (r2 == 0) goto L_0x0085
            goto L_0x00b0
        L_0x0085:
            java.lang.String r2 = r4.f82169f
            if (r2 == 0) goto L_0x0094
            java.lang.String r2 = r4.f82169f
            java.lang.String r3 = r5.f82169f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b0
            goto L_0x0099
        L_0x0094:
            java.lang.String r2 = r5.f82169f
            if (r2 == 0) goto L_0x0099
            goto L_0x00b0
        L_0x0099:
            java.lang.String r2 = r4.f82167d
            if (r2 == 0) goto L_0x00a8
            java.lang.String r2 = r4.f82167d
            java.lang.String r5 = r5.f82167d
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x00af
            goto L_0x00ae
        L_0x00a8:
            java.lang.String r5 = r5.f82167d
            if (r5 != 0) goto L_0x00ae
            goto L_0x0004
        L_0x00ae:
            r0 = 0
        L_0x00af:
            r1 = r0
        L_0x00b0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hh.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = this.f82167d != null ? this.f82167d.hashCode() : 0;
        int hashCode2 = this.f82168e != null ? this.f82168e.hashCode() : 0;
        int hashCode3 = this.f82169f != null ? this.f82169f.hashCode() : 0;
        int hashCode4 = this.g != null ? this.g.hashCode() : 0;
        int hashCode5 = this.h != null ? this.h.hashCode() : 0;
        int hashCode6 = this.f490a.hashCode();
        int hashCode7 = this.f491a.hashCode();
        if (this.f489a != null) {
            i2 = this.f489a.hashCode();
        }
        return ((((((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31)) * 31) + hashCode6) * 31) + hashCode7) * 31) + i2;
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.f82168e)) {
            return null;
        }
        if (this.f82168e == null) {
            this.f82168e = i();
        }
        return this.f82168e;
    }

    public String k() {
        return this.h;
    }

    public void k(String str) {
        this.f82168e = str;
    }

    public String l() {
        return this.f82169f;
    }

    public void l(String str) {
        this.h = str;
    }

    public String m() {
        return this.g;
    }

    public void m(String str) {
        this.f82169f = str;
    }

    public String n() {
        return this.i;
    }

    public void n(String str) {
        this.g = str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:43|44|(2:52|53)|(2:56|57)|58|59) */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        if (r4 == null) goto L_0x0117;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x010b */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101 A[SYNTHETIC, Splitter:B:52:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0108 A[SYNTHETIC, Splitter:B:56:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f A[SYNTHETIC, Splitter:B:63:0x010f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String o() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r0.<init>()     // Catch:{ all -> 0x0129 }
            java.util.Collection r1 = r6.a()     // Catch:{ all -> 0x0129 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0129 }
        L_0x000e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0129 }
            com.xiaomi.push.hi r2 = (com.xiaomi.push.hi) r2     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = r2.d()     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x000e
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f491a     // Catch:{ all -> 0x0129 }
            if (r1 == 0) goto L_0x0123
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f491a     // Catch:{ all -> 0x0129 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0129 }
            if (r1 != 0) goto L_0x0123
            java.lang.String r1 = "<properties xmlns=\"http://www.jivesoftware.com/xmlns/xmpp/properties\">"
            r0.append(r1)     // Catch:{ all -> 0x0129 }
            java.util.Collection r1 = r6.b()     // Catch:{ all -> 0x0129 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0129 }
        L_0x003b:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0129 }
            java.lang.Object r3 = r6.a((java.lang.String) r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = "<property>"
            r0.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = "<name>"
            r0.append(r4)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = com.xiaomi.push.hs.a((java.lang.String) r2)     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</name>"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "<value type=\""
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            boolean r2 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = "integer\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
        L_0x0074:
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x0117
        L_0x0079:
            boolean r2 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = "long\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x0088:
            boolean r2 = r3 instanceof java.lang.Float     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "float\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x0097:
            boolean r2 = r3 instanceof java.lang.Double     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = "double\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00a6:
            boolean r2 = r3 instanceof java.lang.Boolean     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x00b5
            java.lang.String r2 = "boolean\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            r0.append(r3)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00b5:
            boolean r2 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0129 }
            if (r2 == 0) goto L_0x00ca
            java.lang.String r2 = "string\">"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = com.xiaomi.push.hs.a((java.lang.String) r3)     // Catch:{ all -> 0x0129 }
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            java.lang.String r2 = "</value>"
            goto L_0x0074
        L_0x00ca:
            r2 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x010c, all -> 0x00fd }
            r4.<init>()     // Catch:{ Exception -> 0x010c, all -> 0x00fd }
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00fb, all -> 0x00f9 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00fb, all -> 0x00f9 }
            r5.writeObject(r3)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.lang.String r2 = "java-object\">"
            r0.append(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            byte[] r2 = r4.toByteArray()     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.lang.String r2 = com.xiaomi.push.hs.a((byte[]) r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r0.append(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.lang.String r2 = "</value>"
            r0.append(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r5.close()     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            r4.close()     // Catch:{ Exception -> 0x0117 }
            goto L_0x0117
        L_0x00f4:
            r0 = move-exception
            r2 = r5
            goto L_0x00ff
        L_0x00f7:
            r2 = r5
            goto L_0x010d
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            goto L_0x010d
        L_0x00fd:
            r0 = move-exception
            r4 = r2
        L_0x00ff:
            if (r2 == 0) goto L_0x0106
            r2.close()     // Catch:{ Exception -> 0x0105 }
            goto L_0x0106
        L_0x0105:
        L_0x0106:
            if (r4 == 0) goto L_0x010b
            r4.close()     // Catch:{ Exception -> 0x010b }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x0129 }
        L_0x010c:
            r4 = r2
        L_0x010d:
            if (r2 == 0) goto L_0x0114
            r2.close()     // Catch:{ Exception -> 0x0113 }
            goto L_0x0114
        L_0x0113:
        L_0x0114:
            if (r4 == 0) goto L_0x0117
            goto L_0x00f0
        L_0x0117:
            java.lang.String r2 = "</property>"
            r0.append(r2)     // Catch:{ all -> 0x0129 }
            goto L_0x003b
        L_0x011e:
            java.lang.String r1 = "</properties>"
            r0.append(r1)     // Catch:{ all -> 0x0129 }
        L_0x0123:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0129 }
            monitor-exit(r6)
            return r0
        L_0x0129:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hh.o():java.lang.String");
    }

    public void o(String str) {
        this.i = str;
    }

    public String p() {
        return this.f82167d;
    }
}
