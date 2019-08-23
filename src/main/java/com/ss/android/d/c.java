package com.ss.android.d;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.d.b.a.a;
import com.ss.android.d.b.a.a.b;
import com.ss.android.d.b.a.a.e;
import java.util.UUID;

public final class c implements a {

    /* renamed from: b  reason: collision with root package name */
    public static String f28387b;

    /* renamed from: e  reason: collision with root package name */
    private static String f28388e;

    /* renamed from: f  reason: collision with root package name */
    private static String f28389f;
    private static String g;
    private static String[] h;
    private static String i;

    /* renamed from: a  reason: collision with root package name */
    public b f28390a = new e(this.f28391c);

    /* renamed from: c  reason: collision with root package name */
    private final Context f28391c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.d.b.a.a.a f28392d = new com.ss.android.d.b.a.a.a(this.f28391c);

    public final String b() {
        if (!StringUtils.isEmpty(i)) {
            return i;
        }
        try {
            String d2 = this.f28390a.d(null, Build.SERIAL);
            i = d2;
            return d2;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String d() {
        if (!StringUtils.isEmpty(g)) {
            return g;
        }
        try {
            String e2 = this.f28390a.e(null, com.ss.android.d.c.c.c(this.f28391c));
            g = e2;
            return e2;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String e() {
        if (!StringUtils.isEmpty(f28387b)) {
            return f28387b;
        }
        String f2 = this.f28390a.f("", "");
        f28387b = f2;
        return f2;
    }

    public final String[] c() {
        if (h != null && h.length > 0) {
            return h;
        }
        try {
            String[] a2 = this.f28390a.a((String[]) null, com.ss.android.d.c.c.a(this.f28391c));
            if (a2 == null) {
                a2 = new String[0];
            }
            h = a2;
            return a2;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a() {
        if (!TextUtils.isEmpty(f28389f)) {
            return f28389f;
        }
        try {
            SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.f28391c, com.ss.android.d.a.a.c(), 0);
            String string = a2.getString("clientudid", null);
            if (!com.ss.android.d.c.b.a(string)) {
                string = UUID.randomUUID().toString();
                String c2 = this.f28392d.c(a("clientudid.dat", null), string);
                if (com.ss.android.d.c.b.a(c2)) {
                    string = c2;
                }
                SharedPreferences.Editor edit = a2.edit();
                edit.putString("clientudid", string);
                edit.commit();
            } else {
                this.f28392d.c(string, null);
            }
            f28389f = string;
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(Account account) {
        this.f28392d.a(account);
    }

    public final void a(String str) {
        if (!NetUtil.isBadId(str) && !StringUtils.equal(str, f28387b)) {
            f28387b = this.f28390a.f(str, f28387b);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0092 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    c(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            android.content.Context r6 = r6.getApplicationContext()
            r5.f28391c = r6
            com.ss.android.d.b r6 = new com.ss.android.d.b
            r6.<init>()
            com.ss.android.d.b.a.a.e r0 = new com.ss.android.d.b.a.a.e
            android.content.Context r1 = r5.f28391c
            r0.<init>(r1)
            r5.f28390a = r0
            com.ss.android.d.b.a.a.a r0 = new com.ss.android.d.b.a.a.a
            android.content.Context r1 = r5.f28391c
            r0.<init>(r1)
            r5.f28392d = r0
            com.ss.android.d.b.a.a.b r0 = r5.f28390a
            com.ss.android.d.b.a.a.a r1 = r5.f28392d
            r0.f28362c = r1
            com.ss.android.d.b.a.a.a r0 = r5.f28392d
            r1 = 1
            boolean r2 = com.ss.android.d.a.a.b()     // Catch:{ Exception -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "device_id"
            goto L_0x0036
        L_0x0032:
            java.lang.String r2 = com.ss.android.d.b.a.a.c.a()     // Catch:{ Exception -> 0x0061 }
        L_0x0036:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r3.<init>()     // Catch:{ Exception -> 0x0061 }
            android.content.Context r4 = r5.f28391c     // Catch:{ Exception -> 0x0061 }
            java.io.File r4 = r4.getExternalCacheDir()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = r4.getParent()     // Catch:{ Exception -> 0x0061 }
            r3.append(r4)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ Exception -> 0x0061 }
            r3.append(r2)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0061 }
            com.ss.android.d.b.a.a.d r3 = new com.ss.android.d.b.a.a.d     // Catch:{ Exception -> 0x0061 }
            android.content.Context r4 = r5.f28391c     // Catch:{ Exception -> 0x0061 }
            r3.<init>(r4, r1, r2)     // Catch:{ Exception -> 0x0061 }
            r0.f28362c = r3     // Catch:{ Exception -> 0x0061 }
            r6.a(r2)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0062
        L_0x0061:
            r3 = r0
        L_0x0062:
            boolean r0 = com.ss.android.d.a.a.b()
            r0 = r0 ^ r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            r1.<init>()     // Catch:{ Exception -> 0x0091 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0091 }
            r1.append(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r2 = "L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9ieXRlZGFuY2U="
            java.lang.String r2 = com.ss.android.d.b.a.a.c.a((java.lang.String) r2)     // Catch:{ Exception -> 0x0091 }
            r1.append(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0091 }
            com.ss.android.d.b.a.a.d r2 = new com.ss.android.d.b.a.a.d     // Catch:{ Exception -> 0x0091 }
            android.content.Context r4 = r5.f28391c     // Catch:{ Exception -> 0x0091 }
            r2.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x0091 }
            r3.f28362c = r2     // Catch:{ Exception -> 0x0091 }
            r6.a(r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r1.<init>()     // Catch:{ Exception -> 0x00be }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00be }
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = "/"
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = com.ss.android.d.b.a.a.c.a()     // Catch:{ Exception -> 0x00be }
            r1.append(r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00be }
            com.ss.android.d.b.a.a.d r3 = new com.ss.android.d.b.a.a.d     // Catch:{ Exception -> 0x00be }
            android.content.Context r4 = r5.f28391c     // Catch:{ Exception -> 0x00be }
            r3.<init>(r4, r0, r1)     // Catch:{ Exception -> 0x00be }
            r2.f28362c = r3     // Catch:{ Exception -> 0x00be }
            r6.a(r1)     // Catch:{ Exception -> 0x00be }
        L_0x00be:
            boolean r0 = com.ss.android.d.a.a.b()
            if (r0 != 0) goto L_0x00d1
            com.ss.android.d.b$1 r0 = new com.ss.android.d.b$1
            r0.<init>()
            java.lang.Thread r6 = new java.lang.Thread
            r6.<init>(r0)
            r6.start()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(boolean r8) {
        /*
            r7 = this;
            java.lang.String r8 = f28388e
            boolean r8 = com.bytedance.common.utility.StringUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x000b
            java.lang.String r8 = f28388e
            return r8
        L_0x000b:
            android.content.Context r8 = r7.f28391c
            java.lang.String r8 = com.ss.android.d.c.c.b(r8)
            r0 = 13
            r1 = 0
            if (r8 == 0) goto L_0x0031
            java.lang.String r2 = "9774d56d682e549c"
            boolean r2 = r8.equals(r2)     // Catch:{ Exception -> 0x002e }
            if (r2 != 0) goto L_0x0031
            int r2 = r8.length()     // Catch:{ Exception -> 0x002e }
            if (r2 >= r0) goto L_0x0025
            goto L_0x0031
        L_0x0025:
            com.ss.android.d.b.a.a.b r0 = r7.f28390a     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r0.b(r1, r8)     // Catch:{ Exception -> 0x002e }
        L_0x002b:
            r8 = r0
            goto L_0x00ab
        L_0x002e:
            goto L_0x00ab
        L_0x0031:
            android.content.Context r2 = r7.f28391c     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = com.ss.android.d.a.a.c()     // Catch:{ Exception -> 0x002e }
            r4 = 0
            android.content.SharedPreferences r2 = com.ss.android.ugc.aweme.q.c.a(r2, r3, r4)     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = "openudid"
            java.lang.String r3 = r2.getString(r3, r1)     // Catch:{ Exception -> 0x002e }
            boolean r5 = com.ss.android.d.c.b.a(r3)     // Catch:{ Exception -> 0x002e }
            if (r5 != 0) goto L_0x00a5
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ Exception -> 0x002e }
            r3.<init>()     // Catch:{ Exception -> 0x002e }
            java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ Exception -> 0x002e }
            r6 = 80
            r5.<init>(r6, r3)     // Catch:{ Exception -> 0x002e }
            r3 = 16
            java.lang.String r3 = r5.toString(r3)     // Catch:{ Exception -> 0x002e }
            char r4 = r3.charAt(r4)     // Catch:{ Exception -> 0x002e }
            r5 = 45
            if (r4 != r5) goto L_0x0067
            r4 = 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x002e }
        L_0x0067:
            int r4 = r3.length()     // Catch:{ Exception -> 0x002e }
            int r0 = r0 - r4
            if (r0 <= 0) goto L_0x0084
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002e }
            r4.<init>()     // Catch:{ Exception -> 0x002e }
        L_0x0073:
            if (r0 <= 0) goto L_0x007d
            r5 = 70
            r4.append(r5)     // Catch:{ Exception -> 0x002e }
            int r0 = r0 + -1
            goto L_0x0073
        L_0x007d:
            r4.append(r3)     // Catch:{ Exception -> 0x002e }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x002e }
        L_0x0084:
            java.lang.String r0 = "openudid.dat"
            java.lang.String r0 = a(r0, r1)     // Catch:{ Exception -> 0x002e }
            com.ss.android.d.b.a.a.a r1 = r7.f28392d     // Catch:{ Exception -> 0x002e }
            java.lang.String r0 = r1.b(r0, r3)     // Catch:{ Exception -> 0x002e }
            boolean r1 = com.ss.android.d.c.b.a(r0)     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r0 = r3
        L_0x0098:
            android.content.SharedPreferences$Editor r1 = r2.edit()     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "openudid"
            r1.putString(r2, r0)     // Catch:{ Exception -> 0x002e }
            r1.commit()     // Catch:{ Exception -> 0x002e }
            goto L_0x002b
        L_0x00a5:
            com.ss.android.d.b.a.a.a r0 = r7.f28392d     // Catch:{ Exception -> 0x002e }
            r0.b(r3, r1)     // Catch:{ Exception -> 0x002e }
            r8 = r3
        L_0x00ab:
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00b3
            f28388e = r8
        L_0x00b3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.a(boolean):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.nio.channels.FileLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:19|20)|21|22|23) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:(2:29|30)|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:35|36|37|(2:39|40)|41|42|43) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00aa */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b9 A[SYNTHETIC, Splitter:B:53:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC, Splitter:B:57:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c6 A[SYNTHETIC, Splitter:B:65:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb A[SYNTHETIC, Splitter:B:69:0x00cb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r7 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r7 = r0.equals(r7)
            r0 = 0
            if (r7 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.<init>()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.append(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = "L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9jYWNoZQ=="
            java.lang.String r1 = com.ss.android.d.b.a.a.c.a((java.lang.String) r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.append(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.<init>()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.append(r6)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r1.<init>(r7)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            boolean r7 = r1.exists()     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            if (r7 != 0) goto L_0x004b
            return r0
        L_0x004b:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.lang.String r1 = "rwd"
            r6.<init>(r7, r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00b5 }
            java.nio.channels.FileChannel r1 = r6.getChannel()     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            boolean r7 = r7.isFile()     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r7 == 0) goto L_0x0088
            r7 = 161(0xa1, float:2.26E-43)
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r3 = 0
            int r4 = r6.read(r2, r3, r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r4 <= 0) goto L_0x0088
            if (r4 >= r7) goto L_0x0088
            java.lang.String r7 = new java.lang.String     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            java.lang.String r5 = "UTF-8"
            r7.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            boolean r2 = com.ss.android.d.c.b.a(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r2 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0084
            r1.release()     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r6.close()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            return r7
        L_0x0088:
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r7 == 0) goto L_0x0097
            if (r1 == 0) goto L_0x0093
            r1.release()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            r6.close()     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            return r0
        L_0x0097:
            java.lang.String r7 = "UTF-8"
            byte[] r7 = r0.getBytes(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r2 = 0
            r6.setLength(r2)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            r6.write(r7)     // Catch:{ Exception -> 0x00c4, all -> 0x00ae }
            if (r1 == 0) goto L_0x00aa
            r1.release()     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r6.close()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            return r0
        L_0x00ae:
            r7 = move-exception
            r0 = r1
            goto L_0x00b7
        L_0x00b1:
            r7 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r1 = r0
            goto L_0x00c4
        L_0x00b5:
            r7 = move-exception
            r6 = r0
        L_0x00b7:
            if (r0 == 0) goto L_0x00bc
            r0.release()     // Catch:{ Exception -> 0x00bc }
        L_0x00bc:
            if (r6 == 0) goto L_0x00c1
            r6.close()     // Catch:{ Exception -> 0x00c1 }
        L_0x00c1:
            throw r7
        L_0x00c2:
            r6 = r0
            r1 = r6
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r1.release()     // Catch:{ Exception -> 0x00c9 }
        L_0x00c9:
            if (r6 == 0) goto L_0x00ce
            r6.close()     // Catch:{ Exception -> 0x00ce }
        L_0x00ce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.c.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
