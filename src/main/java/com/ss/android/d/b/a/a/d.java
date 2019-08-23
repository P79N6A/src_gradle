package com.ss.android.d.b.a.a;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.ss.android.ugc.aweme.C0906R;
import java.security.Key;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends b {
    private static volatile Pair<byte[], String> h;
    private static volatile Pair<String, byte[]> i;

    /* renamed from: a  reason: collision with root package name */
    final String f28370a = Environment.getExternalStorageState();

    /* renamed from: b  reason: collision with root package name */
    String f28371b;

    /* renamed from: d  reason: collision with root package name */
    public volatile Map<String, String> f28372d;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f28373e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private final Context f28374f;
    private final boolean g;

    class a implements Runnable {
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0090 */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00a0 A[SYNTHETIC, Splitter:B:44:0x00a0] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5 A[SYNTHETIC, Splitter:B:48:0x00a5] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac A[SYNTHETIC, Splitter:B:56:0x00ac] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1 A[SYNTHETIC, Splitter:B:60:0x00b1] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.ss.android.d.b.a.a.d r0 = com.ss.android.d.b.a.a.d.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f28373e
                r1 = 0
                r0.set(r1)
                java.lang.String r0 = ""
                com.ss.android.d.b.a.a.d r1 = com.ss.android.d.b.a.a.d.this     // Catch:{ Throwable -> 0x0046 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f28372d     // Catch:{ Throwable -> 0x0046 }
                if (r1 == 0) goto L_0x0046
                com.ss.android.d.b.a.a.d r1 = com.ss.android.d.b.a.a.d.this     // Catch:{ Throwable -> 0x0046 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f28372d     // Catch:{ Throwable -> 0x0046 }
                if (r1 != 0) goto L_0x001a
                java.lang.String r1 = ""
            L_0x0018:
                r0 = r1
                goto L_0x0046
            L_0x001a:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0046 }
                r2.<init>()     // Catch:{ Throwable -> 0x0046 }
                java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x0046 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0046 }
            L_0x0027:
                boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x0046 }
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x0046 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Throwable -> 0x0046 }
                java.lang.Object r4 = r3.getKey()     // Catch:{ Throwable -> 0x0046 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0046 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ Throwable -> 0x0046 }
                r2.put(r4, r3)     // Catch:{ Throwable -> 0x0046 }
                goto L_0x0027
            L_0x0041:
                java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x0046 }
                goto L_0x0018
            L_0x0046:
                com.ss.android.d.b.a.a.d r1 = com.ss.android.d.b.a.a.d.this
                java.lang.String r2 = "mounted"
                java.lang.String r3 = r1.f28370a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00b7
                r2 = 0
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r4 = r1.f28371b     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                if (r4 != 0) goto L_0x0067
                boolean r3 = r3.mkdirs()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                if (r3 != 0) goto L_0x0067
                return
            L_0x0067:
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r4 = r1.a()     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                r3.<init>(r4)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.lang.String r5 = "rwd"
                r4.<init>(r3, r5)     // Catch:{ Exception -> 0x00a9, all -> 0x009c }
                java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Exception -> 0x00aa, all -> 0x009a }
                java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00aa, all -> 0x009a }
                byte[] r0 = r1.d(r0)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                r1 = 0
                r4.setLength(r1)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                r4.write(r0)     // Catch:{ Exception -> 0x0098, all -> 0x0095 }
                if (r3 == 0) goto L_0x0090
                r3.release()     // Catch:{ Exception -> 0x0090 }
            L_0x0090:
                r4.close()     // Catch:{ Exception -> 0x0094 }
                return
            L_0x0094:
                return
            L_0x0095:
                r0 = move-exception
                r2 = r3
                goto L_0x009e
            L_0x0098:
                r2 = r3
                goto L_0x00aa
            L_0x009a:
                r0 = move-exception
                goto L_0x009e
            L_0x009c:
                r0 = move-exception
                r4 = r2
            L_0x009e:
                if (r2 == 0) goto L_0x00a3
                r2.release()     // Catch:{ Exception -> 0x00a3 }
            L_0x00a3:
                if (r4 == 0) goto L_0x00a8
                r4.close()     // Catch:{ Exception -> 0x00a8 }
            L_0x00a8:
                throw r0
            L_0x00a9:
                r4 = r2
            L_0x00aa:
                if (r2 == 0) goto L_0x00af
                r2.release()     // Catch:{ Exception -> 0x00af }
            L_0x00af:
                if (r4 == 0) goto L_0x00b6
                r4.close()     // Catch:{ Exception -> 0x00b5 }
                goto L_0x00b6
            L_0x00b5:
                return
            L_0x00b6:
                return
            L_0x00b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.b.a.a.d.a.run():void");
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f28371b + "/device_parameters" + ".dat";
    }

    private String b() {
        char[] cArr = new char[21];
        String str = this.f28374f.getString(C0906R.string.b44) + c.a();
        cArr[5] = str.charAt(10);
        cArr[11] = str.charAt(13);
        cArr[17] = str.charAt(11);
        cArr[2] = str.charAt(1);
        cArr[18] = str.charAt(4);
        cArr[10] = str.charAt(12);
        cArr[0] = str.charAt(1);
        cArr[6] = str.charAt(8);
        cArr[13] = str.charAt(5);
        cArr[8] = str.charAt(9);
        cArr[1] = str.charAt(3);
        cArr[12] = str.charAt(13);
        cArr[4] = str.charAt(15);
        cArr[14] = str.charAt(18);
        cArr[7] = str.charAt(17);
        cArr[16] = str.charAt(14);
        cArr[3] = str.charAt(11);
        cArr[15] = str.charAt(13);
        cArr[19] = str.charAt(19);
        cArr[9] = str.charAt(9);
        cArr[20] = str.charAt(7);
        return new String(cArr).substring(2, 18);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        return e(str);
    }

    /* access modifiers changed from: protected */
    public final String[] b(String str) {
        String e2 = e(str);
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        return e2.split("\n");
    }

    public final void c(String str) {
        if (this.f28372d != null && this.f28372d.containsKey(str)) {
            this.f28372d.remove(str);
        }
        g(str, null);
        super.c(str);
    }

    private static Map<String, String> f(String str) throws JSONException {
        if (StringUtils.isEmpty(str)) {
            return new ConcurrentHashMap();
        }
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            concurrentHashMap.put(next, (String) jSONObject.get(next));
        }
        return concurrentHashMap;
    }

    private String a(byte[] bArr) {
        if (h != null && Arrays.equals(bArr, (byte[]) h.first)) {
            return (String) h.second;
        }
        if (i != null && Arrays.equals(bArr, (byte[]) i.second)) {
            return (String) i.first;
        }
        String str = null;
        try {
            String b2 = b();
            byte[] decode = Base64.decode(bArr, 0);
            SecureRandom secureRandom = new SecureRandom();
            Key a2 = c.a(b2.getBytes());
            Cipher instance = Cipher.getInstance("DES");
            instance.init(2, a2, secureRandom);
            str = new String(instance.doFinal(decode), "UTF-8");
        } catch (Exception unused) {
        }
        if (str != null) {
            h = new Pair<>(bArr, str);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public byte[] d(String str) {
        if (i != null && StringUtils.equal(str, (String) i.first)) {
            return (byte[]) i.second;
        }
        if (h != null && StringUtils.equal(str, (String) h.second)) {
            return (byte[]) h.first;
        }
        byte[] bArr = null;
        try {
            String b2 = b();
            SecureRandom secureRandom = new SecureRandom();
            Key a2 = c.a(b2.getBytes());
            Cipher instance = Cipher.getInstance("DES");
            instance.init(1, a2, secureRandom);
            bArr = Base64.encode(instance.doFinal(str.getBytes("UTF-8")), 0);
        } catch (Exception unused) {
        }
        if (bArr != null) {
            i = new Pair<>(str, bArr);
        }
        return bArr;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:28|(1:30)|(2:32|33)|34|35|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:38|39|40|(1:42)|(2:44|45)|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00f4, code lost:
        if (r2 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00a9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9 A[SYNTHETIC, Splitter:B:70:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00de A[SYNTHETIC, Splitter:B:74:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f1 A[SYNTHETIC, Splitter:B:84:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String e(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0016
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f28372d
            if (r0 == 0) goto L_0x0016
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f28372d
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            com.bytedance.common.utility.Logger.debug()
            return r7
        L_0x0016:
            java.lang.String r0 = "mounted"
            java.lang.String r1 = r6.f28370a
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            java.lang.String r2 = r6.f28371b     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            if (r0 != 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f28372d
            if (r7 != 0) goto L_0x003a
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f28372d = r7
        L_0x003a:
            return r1
        L_0x003b:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            java.lang.String r2 = r6.a()     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            java.lang.String r3 = "rwd"
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x00e2, all -> 0x00ca }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ Exception -> 0x00c8, all -> 0x00c6 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00c8, all -> 0x00c6 }
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            if (r0 == 0) goto L_0x00ad
            r0 = 2049(0x801, float:2.871E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r5 = 0
            int r5 = r2.read(r4, r5, r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            if (r5 <= 0) goto L_0x00ad
            if (r5 >= r0) goto L_0x00ad
            byte[] r0 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r0 = r6.a((byte[]) r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.util.Map r0 = f(r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            r6.f28372d = r0     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            if (r0 == 0) goto L_0x008e
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f28372d
            if (r7 != 0) goto L_0x0085
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f28372d = r7
        L_0x0085:
            if (r3 == 0) goto L_0x008a
            r3.release()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            r2.close()     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            return r1
        L_0x008e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f28372d     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00c4, all -> 0x00c1 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f28372d
            if (r0 != 0) goto L_0x00a4
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f28372d = r0
        L_0x00a4:
            if (r3 == 0) goto L_0x00a9
            r3.release()     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r2.close()     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            return r7
        L_0x00ad:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f28372d
            if (r7 != 0) goto L_0x00b8
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f28372d = r7
        L_0x00b8:
            if (r3 == 0) goto L_0x00bd
            r3.release()     // Catch:{ Exception -> 0x00bd }
        L_0x00bd:
            r2.close()     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00f7
        L_0x00c1:
            r7 = move-exception
            r1 = r3
            goto L_0x00cc
        L_0x00c4:
            goto L_0x00e4
        L_0x00c6:
            r7 = move-exception
            goto L_0x00cc
        L_0x00c8:
            r3 = r1
            goto L_0x00e4
        L_0x00ca:
            r7 = move-exception
            r2 = r1
        L_0x00cc:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f28372d
            if (r0 != 0) goto L_0x00d7
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f28372d = r0
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r1.release()     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            if (r2 == 0) goto L_0x00e1
            r2.close()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            throw r7
        L_0x00e2:
            r2 = r1
            r3 = r2
        L_0x00e4:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f28372d
            if (r7 != 0) goto L_0x00ef
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f28372d = r7
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.release()     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            if (r2 == 0) goto L_0x00f7
            goto L_0x00bd
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.b.a.a.d.e(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2) {
        Logger.debug();
        g(str, str2);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String[] strArr) {
        if (strArr != null) {
            a(str, TextUtils.join("\n", strArr));
        }
    }

    private void g(String str, String str2) {
        if (this.f28372d == null) {
            e(null);
            if (this.f28372d == null) {
                this.f28372d = new ConcurrentHashMap();
            }
        }
        if (!StringUtils.equal(this.f28372d.get(str), str2)) {
            if (TextUtils.isEmpty(str2) && this.f28372d.containsKey(str)) {
                this.f28372d.remove(str);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f28372d.put(str, str2);
            }
            if (this.g && this.f28373e.compareAndSet(false, true)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        ThreadPlus.submitRunnable(new a(d.this, (byte) 0));
                    }
                }, 1000);
            }
        }
    }

    public d(Context context, boolean z, String str) {
        this.f28371b = str;
        this.g = z;
        this.f28374f = context;
    }
}
