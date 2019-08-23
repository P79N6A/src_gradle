package com.loc;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.security.MessageDigest;
import java.util.Locale;

public final class cy {

    /* renamed from: a  reason: collision with root package name */
    static String f25731a = "";

    /* renamed from: b  reason: collision with root package name */
    static String f25732b = null;

    /* renamed from: c  reason: collision with root package name */
    static boolean f25733c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f25734d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f25735e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f25736f = "";

    public static String a(Context context) {
        try {
            return h(context);
        } catch (Throwable th) {
            a.b(th);
            return f25736f;
        }
    }

    static void a(final Context context, final String str) {
        if (!TextUtils.isEmpty(str)) {
            f25736f = str;
            if (context != null) {
                i.d().submit(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c A[SYNTHETIC, Splitter:B:24:0x004c] */
                    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[SYNTHETIC, Splitter:B:31:0x0057] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r5 = this;
                            r0 = 0
                            android.content.Context r1 = r2     // Catch:{ Throwable -> 0x0042 }
                            java.lang.String r2 = "k.store"
                            java.lang.String r1 = com.loc.g.c(r1, r2)     // Catch:{ Throwable -> 0x0042 }
                            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0042 }
                            r2.<init>(r1)     // Catch:{ Throwable -> 0x0042 }
                            java.io.File r1 = r2.getParentFile()     // Catch:{ Throwable -> 0x0042 }
                            boolean r1 = r1.exists()     // Catch:{ Throwable -> 0x0042 }
                            if (r1 != 0) goto L_0x001f
                            java.io.File r1 = r2.getParentFile()     // Catch:{ Throwable -> 0x0042 }
                            r1.mkdirs()     // Catch:{ Throwable -> 0x0042 }
                        L_0x001f:
                            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0042 }
                            r1.<init>(r2)     // Catch:{ Throwable -> 0x0042 }
                            java.lang.String r0 = r3     // Catch:{ Throwable -> 0x003b, all -> 0x0036 }
                            byte[] r0 = com.loc.di.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x003b, all -> 0x0036 }
                            r1.write(r0)     // Catch:{ Throwable -> 0x003b, all -> 0x0036 }
                            r1.close()     // Catch:{ Throwable -> 0x0031 }
                            return
                        L_0x0031:
                            r0 = move-exception
                            com.google.a.a.a.a.a.a.b(r0)
                            return
                        L_0x0036:
                            r0 = move-exception
                            r4 = r1
                            r1 = r0
                            r0 = r4
                            goto L_0x0055
                        L_0x003b:
                            r0 = move-exception
                            r4 = r1
                            r1 = r0
                            r0 = r4
                            goto L_0x0043
                        L_0x0040:
                            r1 = move-exception
                            goto L_0x0055
                        L_0x0042:
                            r1 = move-exception
                        L_0x0043:
                            java.lang.String r2 = "AI"
                            java.lang.String r3 = "stf"
                            com.loc.f.a((java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0040 }
                            if (r0 == 0) goto L_0x0054
                            r0.close()     // Catch:{ Throwable -> 0x0050 }
                            return
                        L_0x0050:
                            r0 = move-exception
                            com.google.a.a.a.a.a.a.b(r0)
                        L_0x0054:
                            return
                        L_0x0055:
                            if (r0 == 0) goto L_0x005f
                            r0.close()     // Catch:{ Throwable -> 0x005b }
                            goto L_0x005f
                        L_0x005b:
                            r0 = move-exception
                            com.google.a.a.a.a.a.a.b(r0)
                        L_0x005f:
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.loc.cy.AnonymousClass1.run():void");
                    }
                });
            }
        }
    }

    static boolean a() {
        try {
            if (f25733c) {
                return true;
            }
            if (a(f25732b)) {
                f25733c = true;
                return true;
            } else if (!TextUtils.isEmpty(f25732b)) {
                f25733c = false;
                f25732b = null;
                return false;
            } else if (a(f25731a)) {
                f25733c = true;
                return true;
            } else {
                if (!TextUtils.isEmpty(f25731a)) {
                    f25733c = false;
                    f25731a = null;
                    return false;
                }
                return true;
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c2 : str.toCharArray()) {
            if (('A' > c2 || c2 > 'z') && (('0' > c2 || c2 > ':') && c2 != '.')) {
                try {
                    i.b(di.a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    public static String b(Context context) {
        try {
            if (!"".equals(f25734d)) {
                return f25734d;
            }
            PackageManager packageManager = context.getPackageManager();
            f25734d = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return f25734d;
        } catch (Throwable th) {
            f.a(th, "AI", "gAN");
        }
    }

    public static String c(Context context) {
        try {
            if (f25731a != null && !"".equals(f25731a)) {
                return f25731a;
            }
            String packageName = context.getPackageName();
            f25731a = packageName;
            if (!a(packageName)) {
                f25731a = context.getPackageName();
            }
            return f25731a;
        } catch (Throwable th) {
            f.a(th, "AI", "gpck");
        }
    }

    public static String d(Context context) {
        try {
            if (!"".equals(f25735e)) {
                return f25735e;
            }
            f25735e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return f25735e == null ? "" : f25735e;
        } catch (Throwable th) {
            f.a(th, "AI", "gAV");
        }
    }

    public static String e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append(PushConstants.PUSH_TYPE_NOTIFY);
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(":");
            }
            String str = packageInfo.packageName;
            if (a(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(f25731a)) {
                str = c(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            f25732b = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            f.a(th, "AI", "gsp");
            return f25732b;
        }
    }

    public static String f(Context context) {
        try {
            return h(context);
        } catch (Throwable th) {
            f.a(th, "AI", "gKy");
            return f25736f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[Catch:{ Throwable -> 0x0056, all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[SYNTHETIC, Splitter:B:33:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006a A[SYNTHETIC, Splitter:B:41:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String g(android.content.Context r5) {
        /*
            java.lang.String r0 = "k.store"
            java.lang.String r5 = com.loc.g.c(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L_0x0014
            java.lang.String r5 = ""
            return r5
        L_0x0014:
            r5 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0041, all -> 0x003d }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0041, all -> 0x003d }
            int r5 = r1.available()     // Catch:{ Throwable -> 0x003b }
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x003b }
            r1.read(r5)     // Catch:{ Throwable -> 0x003b }
            java.lang.String r5 = com.loc.di.a((byte[]) r5)     // Catch:{ Throwable -> 0x003b }
            int r2 = r5.length()     // Catch:{ Throwable -> 0x003b }
            r3 = 32
            if (r2 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            java.lang.String r5 = ""
        L_0x0032:
            r1.close()     // Catch:{ Throwable -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x003a:
            return r5
        L_0x003b:
            r5 = move-exception
            goto L_0x0045
        L_0x003d:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0068
        L_0x0041:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
        L_0x0045:
            java.lang.String r2 = "AI"
            java.lang.String r3 = "gKe"
            com.loc.f.a((java.lang.Throwable) r5, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0067 }
            boolean r5 = r0.exists()     // Catch:{ Throwable -> 0x0056 }
            if (r5 == 0) goto L_0x005a
            r0.delete()     // Catch:{ Throwable -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)     // Catch:{ all -> 0x0067 }
        L_0x005a:
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0064:
            java.lang.String r5 = ""
            return r5
        L_0x0067:
            r5 = move-exception
        L_0x0068:
            if (r1 == 0) goto L_0x0072
            r1.close()     // Catch:{ Throwable -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0072:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cy.g(android.content.Context):java.lang.String");
    }

    private static String h(Context context) throws PackageManager.NameNotFoundException {
        if (f25736f == null || f25736f.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return f25736f;
            }
            String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            f25736f = string;
            if (string == null) {
                f25736f = g(context);
            }
        }
        return f25736f;
    }
}
