package com.alipay.c.a;

import android.content.Context;
import com.alipay.c.d.e;
import com.alipay.c.f.d;
import com.alipay.c.f.g;
import com.alipay.c.f.h;
import com.alipay.c.f.i;
import com.alipay.d.a.a.c.a.b;
import com.alipay.d.a.a.c.a.c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f5311a;

    /* renamed from: b  reason: collision with root package name */
    private com.alipay.c.b.a f5312b = com.alipay.c.b.a.a();

    /* renamed from: c  reason: collision with root package name */
    private int f5313c = 4;

    public a(Context context) {
        this.f5311a = context;
    }

    public static String a(Context context) {
        String b2 = b(context);
        return com.alipay.d.a.a.a.a.a(b2) ? h.c(context) : b2;
    }

    public static String a(Context context, String str) {
        try {
            String a2 = i.a(str);
            if (!com.alipay.d.a.a.a.a.a(a2)) {
                return a2;
            }
            String a3 = g.a(context, str);
            i.a(str, a3);
            if (!com.alipay.d.a.a.a.a.a(a3)) {
                return a3;
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    private static boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2016-11-10 2016-11-11", "2016-12-11 2016-12-12"};
        int random = ((int) (Math.random() * 24.0d * 60.0d * 60.0d)) * 1;
        int i = 0;
        while (i < 2) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse2);
                    instance.add(13, random);
                    Date time = instance.getTime();
                    if (date.after(parse) && date.before(time)) {
                        return true;
                    }
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private b b(Map<String, String> map) {
        try {
            Context context = this.f5311a;
            c cVar = new c();
            String str = "";
            String str2 = "";
            String str3 = "";
            String a2 = com.alipay.c.e.a.a();
            String a3 = com.alipay.d.a.a.a.a.a(map, "rpcVersion", "");
            String a4 = a(context, com.alipay.d.a.a.a.a.a(map, "appName", ""));
            com.alipay.c.f.c c2 = d.c(context);
            com.alipay.c.f.c a5 = d.a();
            if (c2 != null) {
                str = c2.f5322a;
                str3 = c2.f5324c;
            }
            if (com.alipay.d.a.a.a.a.a(str)) {
                com.alipay.c.f.b c3 = com.alipay.c.f.a.c(context);
                if (c3 != null) {
                    str = c3.f5319a;
                    str3 = c3.f5321c;
                }
            }
            if (a5 != null) {
                str2 = a5.f5322a;
            }
            if (com.alipay.d.a.a.a.a.a(str2)) {
                com.alipay.c.f.b a6 = com.alipay.c.f.a.a();
                if (a6 != null) {
                    str2 = a6.f5319a;
                }
            }
            cVar.f5367a = "android";
            cVar.f5370d = str;
            cVar.f5369c = str2;
            cVar.f5371e = a4;
            cVar.f5372f = a2;
            cVar.h = str3;
            cVar.g = a3;
            cVar.i = e.a(context, map);
            return com.alipay.d.a.a.c.d.a(this.f5311a, this.f5312b.b()).a(cVar);
        } catch (Throwable th) {
            com.alipay.c.c.a.a(th);
            return null;
        }
    }

    private static String b(Context context) {
        try {
            String a2 = i.a();
            if (!com.alipay.d.a.a.a.a.a(a2)) {
                return a2;
            }
            com.alipay.c.f.c b2 = d.b(context);
            if (b2 != null) {
                i.a(b2);
                String str = b2.f5322a;
                if (com.alipay.d.a.a.a.a.b(str)) {
                    return str;
                }
            }
            com.alipay.c.f.b b3 = com.alipay.c.f.a.b(context);
            if (b3 != null) {
                i.a(b3);
                String str2 = b3.f5319a;
                if (com.alipay.d.a.a.a.a.b(str2)) {
                    return str2;
                }
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3 A[Catch:{ Exception -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01d7 A[Catch:{ Exception -> 0x0220 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = "tid"
            java.lang.String r2 = ""
            java.lang.String r1 = com.alipay.d.a.a.a.a.a(r9, r1, r2)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r2 = "utdid"
            java.lang.String r3 = ""
            java.lang.String r2 = com.alipay.d.a.a.a.a.a(r9, r2, r3)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r3 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r3 = a((android.content.Context) r3)     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.c.a.a(r0, r1, r2, r3)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = "appName"
            java.lang.String r1 = ""
            java.lang.String r0 = com.alipay.d.a.a.a.a.a(r9, r0, r1)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            b((android.content.Context) r1)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            a(r1, r0)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = a()     // Catch:{ Exception -> 0x0220 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0054
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = a(r1, r0)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x0044
        L_0x0041:
            r1 = 1
            goto L_0x00be
        L_0x0044:
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = b((android.content.Context) r1)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0041
        L_0x0051:
            r1 = 0
            goto L_0x00be
        L_0x0054:
            com.alipay.c.d.e.a()     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = com.alipay.c.d.e.b(r1, r9)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = com.alipay.c.f.i.b()     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a(r1, r4)     // Catch:{ Exception -> 0x0220 }
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0069
            goto L_0x0041
        L_0x0069:
            java.lang.String r1 = "tid"
            java.lang.String r4 = ""
            java.lang.String r1 = com.alipay.d.a.a.a.a.a(r9, r1, r4)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = "utdid"
            java.lang.String r5 = ""
            java.lang.String r4 = com.alipay.d.a.a.a.a.a(r9, r4, r5)     // Catch:{ Exception -> 0x0220 }
            boolean r5 = com.alipay.d.a.a.a.a.b(r1)     // Catch:{ Exception -> 0x0220 }
            if (r5 == 0) goto L_0x008a
            java.lang.String r5 = com.alipay.c.f.i.c()     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a(r1, r5)     // Catch:{ Exception -> 0x0220 }
            if (r1 != 0) goto L_0x008a
            goto L_0x0041
        L_0x008a:
            boolean r1 = com.alipay.d.a.a.a.a.b(r4)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = com.alipay.c.f.i.d()     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a(r4, r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 != 0) goto L_0x009b
            goto L_0x0041
        L_0x009b:
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.c.f.i.a((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0220 }
            if (r1 != 0) goto L_0x00a4
            goto L_0x0041
        L_0x00a4:
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = a(r1, r0)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x00b1
            goto L_0x0041
        L_0x00b1:
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = b((android.content.Context) r1)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x0051
            goto L_0x0041
        L_0x00be:
            if (r1 != 0) goto L_0x00c3
        L_0x00c0:
            r9 = 0
            goto L_0x01bc
        L_0x00c3:
            com.alipay.d.a.a.c.a.b r1 = r8.b((java.util.Map<java.lang.String, java.lang.String>) r9)     // Catch:{ Exception -> 0x0220 }
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x00e4
            boolean r6 = r1.f5361a     // Catch:{ Exception -> 0x0220 }
            if (r6 == 0) goto L_0x00d9
            java.lang.String r6 = r1.f5363c     // Catch:{ Exception -> 0x0220 }
            boolean r6 = com.alipay.d.a.a.a.a.a((java.lang.String) r6)     // Catch:{ Exception -> 0x0220 }
            if (r6 != 0) goto L_0x00e4
            r5 = 1
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r6 = "APPKEY_ERROR"
            java.lang.String r7 = r1.f5362b     // Catch:{ Exception -> 0x0220 }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x0220 }
            if (r6 == 0) goto L_0x00e4
            r5 = 3
        L_0x00e4:
            if (r5 == r3) goto L_0x0113
            if (r5 == r4) goto L_0x0110
            if (r1 == 0) goto L_0x00fe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = "Server error, result:"
            r9.<init>(r4)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = r1.f5362b     // Catch:{ Exception -> 0x0220 }
            r9.append(r1)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0220 }
        L_0x00fa:
            com.alipay.c.c.a.a((java.lang.String) r9)     // Catch:{ Exception -> 0x0220 }
            goto L_0x0101
        L_0x00fe:
            java.lang.String r9 = "Server error, returned null"
            goto L_0x00fa
        L_0x0101:
            android.content.Context r9 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r9 = a(r9, r0)     // Catch:{ Exception -> 0x0220 }
            boolean r9 = com.alipay.d.a.a.a.a.a((java.lang.String) r9)     // Catch:{ Exception -> 0x0220 }
            if (r9 == 0) goto L_0x00c0
            r9 = 4
            goto L_0x01bc
        L_0x0110:
            r9 = 1
            goto L_0x01bc
        L_0x0113:
            android.content.Context r4 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r5 = "1"
            java.lang.String r6 = r1.h     // Catch:{ Exception -> 0x0220 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.h.a((android.content.Context) r4, (boolean) r5)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r4 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r5 = r1.j     // Catch:{ Exception -> 0x0220 }
            if (r5 != 0) goto L_0x0129
            java.lang.String r5 = "0"
            goto L_0x012b
        L_0x0129:
            java.lang.String r5 = r1.j     // Catch:{ Exception -> 0x0220 }
        L_0x012b:
            com.alipay.c.f.h.a((android.content.Context) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r4 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = com.alipay.c.d.e.b(r4, r9)     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.i.f5334b = r4     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = r1.f5364d     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.i.a((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = r1.f5363c     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.i.f5333a = r4     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = r1.f5365e     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.i.f5335c = r1     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = "tid"
            java.lang.String r4 = ""
            java.lang.String r1 = com.alipay.d.a.a.a.a.a(r9, r1, r4)     // Catch:{ Exception -> 0x0220 }
            boolean r4 = com.alipay.d.a.a.a.a.b(r1)     // Catch:{ Exception -> 0x0220 }
            if (r4 == 0) goto L_0x015f
            java.lang.String r4 = com.alipay.c.f.i.c()     // Catch:{ Exception -> 0x0220 }
            boolean r4 = com.alipay.d.a.a.a.a.a(r1, r4)     // Catch:{ Exception -> 0x0220 }
            if (r4 != 0) goto L_0x015f
            com.alipay.c.f.i.b(r1)     // Catch:{ Exception -> 0x0220 }
            goto L_0x0163
        L_0x015f:
            java.lang.String r1 = com.alipay.c.f.i.c()     // Catch:{ Exception -> 0x0220 }
        L_0x0163:
            com.alipay.c.f.i.b(r1)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r1 = "utdid"
            java.lang.String r4 = ""
            java.lang.String r9 = com.alipay.d.a.a.a.a.a(r9, r1, r4)     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.b(r9)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = com.alipay.c.f.i.d()     // Catch:{ Exception -> 0x0220 }
            boolean r1 = com.alipay.d.a.a.a.a.a(r9, r1)     // Catch:{ Exception -> 0x0220 }
            if (r1 != 0) goto L_0x0182
            com.alipay.c.f.i.c(r9)     // Catch:{ Exception -> 0x0220 }
            goto L_0x0186
        L_0x0182:
            java.lang.String r9 = com.alipay.c.f.i.d()     // Catch:{ Exception -> 0x0220 }
        L_0x0186:
            com.alipay.c.f.i.c(r9)     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.c r9 = com.alipay.c.f.i.f()     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.d.a(r1, r9)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r9 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.b r1 = new com.alipay.c.f.b     // Catch:{ Exception -> 0x0220 }
            java.lang.String r4 = com.alipay.c.f.i.a()     // Catch:{ Exception -> 0x0220 }
            java.lang.String r5 = com.alipay.c.f.i.b()     // Catch:{ Exception -> 0x0220 }
            java.lang.String r6 = com.alipay.c.f.i.e()     // Catch:{ Exception -> 0x0220 }
            r1.<init>(r4, r5, r6)     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.a.a(r9, r1)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r9 = com.alipay.c.f.i.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r1 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.g.a(r1, r0, r9)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r9 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.f.h.a(r9, r0, r4)     // Catch:{ Exception -> 0x0220 }
            goto L_0x00c0
        L_0x01bc:
            r8.f5313c = r9     // Catch:{ Exception -> 0x0220 }
            android.content.Context r9 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            com.alipay.c.b.a r0 = r8.f5312b     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0220 }
            com.alipay.d.a.a.c.b.a r9 = com.alipay.d.a.a.c.d.a(r9, r0)     // Catch:{ Exception -> 0x0220 }
            android.content.Context r0 = r8.f5311a     // Catch:{ Exception -> 0x0220 }
            r1 = 0
            java.lang.String r4 = "connectivity"
            java.lang.Object r4 = r0.getSystemService(r4)     // Catch:{ Exception -> 0x0220 }
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch:{ Exception -> 0x0220 }
            if (r4 == 0) goto L_0x01db
            android.net.NetworkInfo r1 = r4.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0220 }
        L_0x01db:
            if (r1 == 0) goto L_0x01ea
            boolean r4 = r1.isConnected()     // Catch:{ Exception -> 0x0220 }
            if (r4 == 0) goto L_0x01ea
            int r1 = r1.getType()     // Catch:{ Exception -> 0x0220 }
            if (r1 != r3) goto L_0x01ea
            r2 = 1
        L_0x01ea:
            if (r2 == 0) goto L_0x0224
            boolean r1 = com.alipay.c.f.h.b(r0)     // Catch:{ Exception -> 0x0220 }
            if (r1 == 0) goto L_0x0224
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0220 }
            r1.<init>()     // Catch:{ Exception -> 0x0220 }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0220 }
            r1.append(r0)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = "/log/ap"
            r1.append(r0)     // Catch:{ Exception -> 0x0220 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0220 }
            com.alipay.d.a.a.e.b r1 = new com.alipay.d.a.a.e.b     // Catch:{ Exception -> 0x0220 }
            r1.<init>(r0, r9)     // Catch:{ Exception -> 0x0220 }
            java.lang.Thread r9 = new java.lang.Thread     // Catch:{ Exception -> 0x0220 }
            com.alipay.d.a.a.e.c r0 = new com.alipay.d.a.a.e.c     // Catch:{ Exception -> 0x0220 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0220 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0220 }
            r9.start()     // Catch:{ Exception -> 0x0220 }
            goto L_0x0224
        L_0x021e:
            r9 = move-exception
            goto L_0x0227
        L_0x0220:
            r9 = move-exception
            com.alipay.c.c.a.a((java.lang.Throwable) r9)     // Catch:{ all -> 0x021e }
        L_0x0224:
            int r9 = r8.f5313c
            return r9
        L_0x0227:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.c.a.a.a(java.util.Map):int");
    }
}
