package com.ss.android.d;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.d.a.d;
import com.ss.android.d.b.a.a;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static a f28398a;

    /* renamed from: b  reason: collision with root package name */
    public static Account f28399b;

    /* renamed from: c  reason: collision with root package name */
    private static String f28400c;

    /* renamed from: d  reason: collision with root package name */
    private static AccountManager f28401d;

    /* renamed from: e  reason: collision with root package name */
    private static Account f28402e;

    private static boolean a() {
        if (TextUtils.isEmpty(f28400c)) {
            f28400c = d.c();
        }
        return "local_test".equals(f28400c);
    }

    public static boolean b(Context context) {
        if (context == null || !a()) {
            return false;
        }
        if (f28402e == null) {
            f28402e = c(context);
        }
        if (f28402e == null || f28401d == null) {
            return false;
        }
        return Boolean.valueOf(f28401d.getUserData(f28402e, "new_user")).booleanValue();
    }

    private static Account c(Context context) {
        Account account = null;
        try {
            f28401d = AccountManager.get(context);
            String packageName = context.getPackageName();
            String string = context.getString(context.getApplicationInfo().labelRes);
            if (!TextUtils.isEmpty(string)) {
                if (!TextUtils.isEmpty(packageName)) {
                    Account[] accountsByType = f28401d.getAccountsByType(packageName);
                    int length = accountsByType.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Account account2 = accountsByType[i];
                        if (account2 != null && string.equals(account2.name)) {
                            account = account2;
                            break;
                        }
                        i++;
                    }
                    return account;
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|(3:12|13|14)|15|16|(2:18|(1:20))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.d.b.a.a a(android.content.Context r6) throws java.lang.IllegalArgumentException {
        /*
            boolean r0 = com.ss.android.d.d.f2453b
            if (r0 == 0) goto L_0x005e
            com.ss.android.d.b.a.a r0 = f28398a
            if (r0 != 0) goto L_0x005b
            java.lang.Class<com.ss.android.d.f> r0 = com.ss.android.d.f.class
            monitor-enter(r0)
            com.ss.android.d.b.a.a r1 = f28398a     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x0056
            if (r6 == 0) goto L_0x004e
            boolean r1 = b(r6)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0035
            java.lang.String r1 = "com.ss.android.deviceregister.newuser.DeviceParamsProvider"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0035 }
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0035 }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0035 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0035 }
            r2[r5] = r6     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ Exception -> 0x0035 }
            com.ss.android.d.b.a.a r1 = (com.ss.android.d.b.a.a) r1     // Catch:{ Exception -> 0x0035 }
            f28398a = r1     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            com.ss.android.d.b.a.a r1 = f28398a     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x0056
            com.ss.android.d.c r1 = new com.ss.android.d.c     // Catch:{ all -> 0x0058 }
            r1.<init>(r6)     // Catch:{ all -> 0x0058 }
            f28398a = r1     // Catch:{ all -> 0x0058 }
            android.accounts.Account r6 = f28399b     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0056
            com.ss.android.d.b.a.a r6 = f28398a     // Catch:{ all -> 0x0058 }
            com.ss.android.d.c r6 = (com.ss.android.d.c) r6     // Catch:{ all -> 0x0058 }
            android.accounts.Account r1 = f28399b     // Catch:{ all -> 0x0058 }
            r6.a((android.accounts.Account) r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0056
        L_0x004e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "context == null"
            r6.<init>(r1)     // Catch:{ all -> 0x0058 }
            throw r6     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r6
        L_0x005b:
            com.ss.android.d.b.a.a r6 = f28398a
            return r6
        L_0x005e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "please init TeaAgent first"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.f.a(android.content.Context):com.ss.android.d.b.a.a");
    }

    @SuppressLint({"MissingPermission"})
    public static void a(Context context, boolean z) {
        if (context != null && a()) {
            if (f28402e == null) {
                f28402e = c(context);
            }
            if (f28402e != null && f28401d != null) {
                try {
                    f28401d.setUserData(f28402e, "new_user", String.valueOf(z));
                } catch (Exception unused) {
                }
            }
        }
    }
}
