package com.loc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.Hashtable;

public final class bu {

    /* renamed from: a  reason: collision with root package name */
    Hashtable<String, ArrayList<a>> f25586a = new Hashtable<>();

    /* renamed from: b  reason: collision with root package name */
    boolean f25587b = false;

    /* renamed from: c  reason: collision with root package name */
    String f25588c = "2.0.201501131131".replace(ClassUtils.PACKAGE_SEPARATOR, "");

    /* renamed from: d  reason: collision with root package name */
    boolean f25589d = true;

    /* renamed from: e  reason: collision with root package name */
    long f25590e = 0;

    /* renamed from: f  reason: collision with root package name */
    public String f25591f = null;
    public bp g = null;
    long h = 0;
    boolean i = true;
    boolean j = true;
    String k = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
    private long l = 0;
    private String m = null;
    private String n = null;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public AMapLocationServer f25592a;

        /* renamed from: b  reason: collision with root package name */
        public String f25593b;

        protected a() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ Throwable -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[Catch:{ Throwable -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.autonavi.aps.amapapi.model.AMapLocationServer a(java.lang.String r5, java.lang.StringBuilder r6) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "cgiwifi"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x007f }
            if (r1 == 0) goto L_0x000e
        L_0x0009:
            com.loc.bu$a r6 = r4.a((java.lang.StringBuilder) r6, (java.lang.String) r5)     // Catch:{ Throwable -> 0x007f }
            goto L_0x0038
        L_0x000e:
            java.lang.String r1 = "wifi"
            boolean r1 = r5.contains(r1)     // Catch:{ Throwable -> 0x007f }
            if (r1 == 0) goto L_0x0017
            goto L_0x0009
        L_0x0017:
            java.lang.String r6 = "cgi"
            boolean r6 = r5.contains(r6)     // Catch:{ Throwable -> 0x007f }
            if (r6 == 0) goto L_0x0037
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r6 = r4.f25586a     // Catch:{ Throwable -> 0x007f }
            boolean r6 = r6.containsKey(r5)     // Catch:{ Throwable -> 0x007f }
            if (r6 == 0) goto L_0x0037
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r6 = r4.f25586a     // Catch:{ Throwable -> 0x007f }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Throwable -> 0x007f }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Throwable -> 0x007f }
            r1 = 0
            java.lang.Object r6 = r6.get(r1)     // Catch:{ Throwable -> 0x007f }
            com.loc.bu$a r6 = (com.loc.bu.a) r6     // Catch:{ Throwable -> 0x007f }
            goto L_0x0038
        L_0x0037:
            r6 = r0
        L_0x0038:
            if (r6 == 0) goto L_0x0087
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = r6.f25592a     // Catch:{ Throwable -> 0x007f }
            boolean r1 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r1)     // Catch:{ Throwable -> 0x007f }
            if (r1 == 0) goto L_0x0087
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = r6.f25592a     // Catch:{ Throwable -> 0x007f }
            java.lang.String r2 = "mem"
            r1.e(r2)     // Catch:{ Throwable -> 0x007f }
            java.lang.String r2 = r6.f25593b     // Catch:{ Throwable -> 0x007f }
            r1.h(r2)     // Catch:{ Throwable -> 0x007f }
            long r2 = r1.getTime()     // Catch:{ Throwable -> 0x007f }
            boolean r2 = com.loc.cd.b((long) r2)     // Catch:{ Throwable -> 0x007f }
            if (r2 == 0) goto L_0x0067
            boolean r5 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r1)     // Catch:{ Throwable -> 0x007f }
            if (r5 == 0) goto L_0x0062
            r5 = 0
            r4.f25590e = r5     // Catch:{ Throwable -> 0x007f }
        L_0x0062:
            r5 = 4
            r1.setLocationType(r5)     // Catch:{ Throwable -> 0x007f }
            return r1
        L_0x0067:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r1 = r4.f25586a     // Catch:{ Throwable -> 0x007f }
            if (r1 == 0) goto L_0x0087
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r1 = r4.f25586a     // Catch:{ Throwable -> 0x007f }
            boolean r1 = r1.containsKey(r5)     // Catch:{ Throwable -> 0x007f }
            if (r1 == 0) goto L_0x0087
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r1 = r4.f25586a     // Catch:{ Throwable -> 0x007f }
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Throwable -> 0x007f }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ Throwable -> 0x007f }
            r5.remove(r6)     // Catch:{ Throwable -> 0x007f }
            goto L_0x0087
        L_0x007f:
            r5 = move-exception
            java.lang.String r6 = "Cache"
            java.lang.String r1 = "get1"
            com.loc.ce.a(r5, r6, r1)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(java.lang.String, java.lang.StringBuilder):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5 A[LOOP:1: B:34:0x00df->B:36:0x00e5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff A[LOOP:2: B:38:0x00f9->B:40:0x00ff, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.loc.bu.a a(java.lang.StringBuilder r26, java.lang.String r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r2 = r0.f25586a
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 != 0) goto L_0x018d
            boolean r2 = android.text.TextUtils.isEmpty(r26)
            if (r2 == 0) goto L_0x0015
            goto L_0x018d
        L_0x0015:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r2 = r0.f25586a
            boolean r2 = r2.containsKey(r1)
            if (r2 != 0) goto L_0x001e
            return r3
        L_0x001e:
            java.util.Hashtable r2 = new java.util.Hashtable
            r2.<init>()
            java.util.Hashtable r4 = new java.util.Hashtable
            r4.<init>()
            java.util.Hashtable r5 = new java.util.Hashtable
            r5.<init>()
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r6 = r0.f25586a
            java.lang.Object r1 = r6.get(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r6 = r1.size()
            r7 = 1
            int r6 = r6 - r7
        L_0x003b:
            if (r6 < 0) goto L_0x0181
            java.lang.Object r8 = r1.get(r6)
            com.loc.bu$a r8 = (com.loc.bu.a) r8
            java.lang.String r9 = r8.f25593b
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x017a
            java.lang.String r9 = r8.f25593b
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            r11 = 0
            if (r10 != 0) goto L_0x00b2
            boolean r10 = android.text.TextUtils.isEmpty(r26)
            if (r10 == 0) goto L_0x005b
            goto L_0x00b2
        L_0x005b:
            java.lang.String r10 = ",access"
            boolean r10 = r9.contains(r10)
            if (r10 == 0) goto L_0x00b2
            java.lang.String r10 = ",access"
            r12 = r26
            int r10 = r12.indexOf(r10)
            r13 = -1
            if (r10 != r13) goto L_0x006f
            goto L_0x00b4
        L_0x006f:
            java.lang.String r10 = ",access"
            java.lang.String[] r9 = r9.split(r10)
            r10 = r9[r11]
            java.lang.String r13 = "#"
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x008f
            r10 = r9[r11]
            r9 = r9[r11]
            java.lang.String r13 = "#"
            int r9 = r9.lastIndexOf(r13)
            int r9 = r9 + r7
            java.lang.String r9 = r10.substring(r9)
            goto L_0x0091
        L_0x008f:
            r9 = r9[r11]
        L_0x0091:
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0098
            goto L_0x00b4
        L_0x0098:
            java.lang.String r10 = r26.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            java.lang.String r9 = ",access"
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            boolean r9 = r10.contains(r9)
            goto L_0x00b5
        L_0x00b2:
            r12 = r26
        L_0x00b4:
            r9 = 0
        L_0x00b5:
            if (r9 == 0) goto L_0x00c7
            java.lang.String r9 = r8.f25593b
            java.lang.String r10 = r26.toString()
            boolean r9 = com.loc.cn.a((java.lang.String) r9, (java.lang.String) r10)
            if (r9 == 0) goto L_0x00c5
            goto L_0x0177
        L_0x00c5:
            r9 = 1
            goto L_0x00c8
        L_0x00c7:
            r9 = 0
        L_0x00c8:
            java.lang.String r10 = r8.f25593b
            a((java.lang.String) r10, (java.util.Hashtable<java.lang.String, java.lang.String>) r2)
            java.lang.String r10 = r26.toString()
            a((java.lang.String) r10, (java.util.Hashtable<java.lang.String, java.lang.String>) r4)
            r5.clear()
            java.util.Set r10 = r2.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00df:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x00f1
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ""
            r5.put(r13, r14)
            goto L_0x00df
        L_0x00f1:
            java.util.Set r10 = r4.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00f9:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x010b
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ""
            r5.put(r13, r14)
            goto L_0x00f9
        L_0x010b:
            java.util.Set r10 = r5.keySet()
            int r13 = r10.size()
            double[] r13 = new double[r13]
            int r14 = r10.size()
            double[] r14 = new double[r14]
            java.util.Iterator r15 = r10.iterator()
            r16 = 0
        L_0x0121:
            if (r15 == 0) goto L_0x0150
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x0150
            java.lang.Object r17 = r15.next()
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            boolean r17 = r2.containsKey(r3)
            r19 = 0
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r17 == 0) goto L_0x013e
            r23 = r21
            goto L_0x0140
        L_0x013e:
            r23 = r19
        L_0x0140:
            r13[r16] = r23
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L_0x014a
            r19 = r21
        L_0x014a:
            r14[r16] = r19
            int r16 = r16 + 1
            r3 = 0
            goto L_0x0121
        L_0x0150:
            r10.clear()
            double[] r3 = a((double[]) r13, (double[]) r14)
            r13 = r3[r11]
            r15 = 4605380979056443392(0x3fe99999a0000000, double:0.800000011920929)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x0163
            goto L_0x0177
        L_0x0163:
            r13 = r3[r7]
            r15 = 4603741668684706349(0x3fe3c6a7ef9db22d, double:0.618)
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 < 0) goto L_0x016f
            goto L_0x0177
        L_0x016f:
            if (r9 == 0) goto L_0x017c
            r9 = r3[r11]
            int r3 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r3 < 0) goto L_0x017c
        L_0x0177:
            r18 = r8
            goto L_0x0183
        L_0x017a:
            r12 = r26
        L_0x017c:
            int r6 = r6 + -1
            r3 = 0
            goto L_0x003b
        L_0x0181:
            r18 = 0
        L_0x0183:
            r2.clear()
            r4.clear()
            r5.clear()
            return r18
        L_0x018d:
            r1 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(java.lang.StringBuilder, java.lang.String):com.loc.bu$a");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r6, java.lang.StringBuilder r7, android.content.Context r8) {
        /*
            r5 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r5.m     // Catch:{  }
            if (r2 != 0) goto L_0x0019
            java.lang.String r2 = "MD5"
            java.lang.String r8 = com.loc.cy.c(r8)     // Catch:{  }
            java.lang.String r8 = com.loc.bt.a((java.lang.String) r2, (java.lang.String) r8)     // Catch:{  }
            r5.m = r8     // Catch:{  }
        L_0x0019:
            java.lang.String r8 = "&"
            boolean r8 = r6.contains(r8)     // Catch:{  }
            r2 = 0
            if (r8 == 0) goto L_0x002c
            java.lang.String r8 = "&"
            int r8 = r6.indexOf(r8)     // Catch:{  }
            java.lang.String r6 = r6.substring(r2, r8)     // Catch:{  }
        L_0x002c:
            java.lang.String r8 = "#"
            int r8 = r6.lastIndexOf(r8)     // Catch:{  }
            int r8 = r8 + 1
            java.lang.String r8 = r6.substring(r8)     // Catch:{  }
            java.lang.String r3 = "cgi"
            boolean r3 = r8.equals(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x0050
            java.lang.String r7 = "cgi"
            int r8 = r6.length()     // Catch:{  }
            int r8 = r8 + -12
            java.lang.String r6 = r6.substring(r2, r8)     // Catch:{  }
        L_0x004c:
            r1.put(r7, r6)     // Catch:{  }
            goto L_0x009d
        L_0x0050:
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{  }
            if (r3 != 0) goto L_0x009d
            java.lang.String r3 = ",access"
            int r3 = r7.indexOf(r3)     // Catch:{  }
            r4 = -1
            if (r3 == r4) goto L_0x009d
            int r8 = r8.length()     // Catch:{  }
            int r8 = r8 + 9
            int r3 = r6.length()     // Catch:{  }
            int r3 = r3 - r8
            java.lang.String r6 = r6.substring(r2, r3)     // Catch:{  }
            java.lang.String r8 = "cgi"
            r1.put(r8, r6)     // Catch:{  }
            java.lang.String r6 = r7.toString()     // Catch:{  }
            java.lang.String r7 = ",access"
            java.lang.String[] r6 = r6.split(r7)     // Catch:{  }
            r7 = r6[r2]     // Catch:{  }
            java.lang.String r8 = "#"
            boolean r7 = r7.contains(r8)     // Catch:{  }
            if (r7 == 0) goto L_0x0098
            r7 = r6[r2]     // Catch:{  }
            r6 = r6[r2]     // Catch:{  }
            java.lang.String r8 = "#"
            int r6 = r6.lastIndexOf(r8)     // Catch:{  }
            int r6 = r6 + 1
            java.lang.String r6 = r7.substring(r6)     // Catch:{  }
            goto L_0x009a
        L_0x0098:
            r6 = r6[r2]     // Catch:{  }
        L_0x009a:
            java.lang.String r7 = "mmac"
            goto L_0x004c
        L_0x009d:
            java.lang.String r6 = r1.toString()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r7 = "UTF-8"
            byte[] r6 = r6.getBytes(r7)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r7 = r5.m     // Catch:{ Throwable -> 0x00b2 }
            byte[] r6 = com.loc.bt.c(r6, r7)     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r6 = com.loc.dd.b((byte[]) r6)     // Catch:{  }
            return r6
        L_0x00b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(java.lang.String, java.lang.StringBuilder, android.content.Context):java.lang.String");
    }

    private void a(String str, AMapLocation aMapLocation, StringBuilder sb, Context context) throws Exception {
        if (context != null) {
            if (this.m == null) {
                this.m = bt.a("MD5", cy.c(context));
            }
            String a2 = a(str, sb, context);
            StringBuilder sb2 = new StringBuilder();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = context.openOrCreateDatabase("hmdb", 0, null);
                try {
                    sb2.append("CREATE TABLE IF NOT EXISTS hist");
                    sb2.append(this.f25588c);
                    sb2.append(" (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);");
                    sQLiteDatabase2.execSQL(sb2.toString());
                    sb2.delete(0, sb2.length());
                    sb2.append("REPLACE INTO ");
                    sb2.append("hist");
                    sb2.append(this.f25588c);
                    sb2.append(" VALUES (?, ?, ?, ?)");
                    byte[] c2 = bt.c(sb.toString().getBytes("UTF-8"), this.m);
                    Object[] objArr = {a2, c2, bt.c(aMapLocation.toStr().getBytes("UTF-8"), this.m), Long.valueOf(aMapLocation.getTime())};
                    for (int i2 = 1; i2 < 3; i2++) {
                        objArr[i2] = dd.b((byte[]) objArr[i2]);
                    }
                    sQLiteDatabase2.execSQL(sb2.toString(), objArr);
                    sb2.delete(0, sb2.length());
                    sb2.delete(0, sb2.length());
                    if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    sb2.delete(0, sb2.length());
                    if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                        sQLiteDatabase2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ce.a(th, "DB", "updateHist");
                sb2.delete(0, sb2.length());
                sQLiteDatabase.close();
            }
        }
    }

    private static void a(String str, Hashtable<String, String> hashtable) {
        if (!TextUtils.isEmpty(str)) {
            hashtable.clear();
            for (String str2 : str.split("#")) {
                if (!TextUtils.isEmpty(str2) && !str2.contains("|")) {
                    hashtable.put(str2, "");
                }
            }
        }
    }

    private static double[] a(double[] dArr, double[] dArr2) {
        double[] dArr3 = dArr;
        double[] dArr4 = new double[3];
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < dArr3.length; i4++) {
            d2 += dArr3[i4] * dArr3[i4];
            d3 += dArr2[i4] * dArr2[i4];
            d4 += dArr3[i4] * dArr2[i4];
            if (dArr2[i4] == 1.0d) {
                i3++;
                if (dArr3[i4] == 1.0d) {
                    i2++;
                }
            }
        }
        dArr4[0] = d4 / (Math.sqrt(d2) * Math.sqrt(d3));
        double d5 = (double) i2;
        Double.isNaN(d5);
        double d6 = (double) i3;
        Double.isNaN(d6);
        dArr4[1] = (d5 * 1.0d) / d6;
        dArr4[2] = d5;
        for (int i5 = 0; i5 < 2; i5++) {
            if (dArr4[i5] > 1.0d) {
                dArr4[i5] = 1.0d;
            }
        }
        return dArr4;
    }

    private boolean b() {
        return this.l != 0 && (this.f25586a.size() > 360 || cn.b() - this.l > 36000000);
    }

    public final AMapLocationServer a(Context context, String str, StringBuilder sb, boolean z) {
        if (TextUtils.isEmpty(str) || !cd.f()) {
            return null;
        }
        String str2 = str + "&" + this.i + "&" + this.j + "&" + this.k;
        if (str2.contains("gps") || !cd.f() || sb == null) {
            return null;
        }
        if (b()) {
            a();
            return null;
        }
        if (z && !this.f25587b) {
            try {
                String a2 = a(str2, sb, context);
                a();
                a(context, a2);
            } catch (Throwable unused) {
            }
        }
        if (this.f25586a.isEmpty()) {
            return null;
        }
        return a(str2, sb);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d9 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2 A[ADDED_TO_REGION, Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f2 A[Catch:{ Throwable -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ff A[Catch:{ Throwable -> 0x010c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer a(com.loc.bq r18, boolean r19, com.autonavi.aps.amapapi.model.AMapLocationServer r20, com.loc.bs r21, java.lang.StringBuilder r22, java.lang.String r23, android.content.Context r24) {
        /*
            r17 = this;
            r0 = r17
            r2 = r20
            r3 = r23
            boolean r4 = r0.f25589d
            if (r4 == 0) goto L_0x0013
            boolean r4 = com.loc.cd.f()
            if (r4 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r4 = 1
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x0018
        L_0x0016:
            r4 = 0
            goto L_0x0026
        L_0x0018:
            if (r2 == 0) goto L_0x0025
            long r7 = r20.getTime()
            boolean r4 = com.loc.cd.b((long) r7)
            if (r4 != 0) goto L_0x0025
            goto L_0x0016
        L_0x0025:
            r4 = 1
        L_0x0026:
            r7 = 0
            if (r4 != 0) goto L_0x002a
            return r7
        L_0x002a:
            com.loc.bp r4 = r18.a()     // Catch:{ Throwable -> 0x010c }
            if (r4 != 0) goto L_0x0034
            com.loc.bp r8 = r0.g     // Catch:{ Throwable -> 0x010c }
            if (r8 == 0) goto L_0x0041
        L_0x0034:
            com.loc.bp r8 = r0.g     // Catch:{ Throwable -> 0x010c }
            if (r8 == 0) goto L_0x0043
            com.loc.bp r8 = r0.g     // Catch:{ Throwable -> 0x010c }
            boolean r4 = r8.equals(r4)     // Catch:{ Throwable -> 0x010c }
            if (r4 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            if (r2 == 0) goto L_0x005e
            java.util.ArrayList r8 = r21.a()     // Catch:{ Throwable -> 0x010c }
            int r8 = r8.size()     // Catch:{ Throwable -> 0x010c }
            float r9 = r20.getAccuracy()     // Catch:{ Throwable -> 0x010c }
            r10 = 1133871104(0x43958000, float:299.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x005e
            r9 = 5
            if (r8 <= r9) goto L_0x005e
            r8 = 1
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            r9 = 3000(0xbb8, double:1.482E-320)
            r11 = 0
            if (r2 == 0) goto L_0x00a0
            java.lang.String r13 = r0.f25591f     // Catch:{ Throwable -> 0x010c }
            if (r13 == 0) goto L_0x00a0
            if (r8 != 0) goto L_0x00a0
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = r0.f25591f     // Catch:{ Throwable -> 0x010c }
            java.lang.String r13 = r22.toString()     // Catch:{ Throwable -> 0x010c }
            boolean r4 = com.loc.cn.a((java.lang.String) r4, (java.lang.String) r13)     // Catch:{ Throwable -> 0x010c }
            long r13 = r0.f25590e     // Catch:{ Throwable -> 0x010c }
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x008b
            long r13 = com.loc.cn.b()     // Catch:{ Throwable -> 0x010c }
            long r5 = r0.f25590e     // Catch:{ Throwable -> 0x010c }
            r15 = 0
            long r13 = r13 - r5
            int r5 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x008b
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r4 != 0) goto L_0x0090
            if (r5 == 0) goto L_0x00a1
        L_0x0090:
            boolean r5 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r20)     // Catch:{ Throwable -> 0x010c }
            if (r5 == 0) goto L_0x00a1
            java.lang.String r1 = "mem"
            r2.e(r1)     // Catch:{ Throwable -> 0x010c }
            r1 = 2
            r2.setLocationType(r1)     // Catch:{ Throwable -> 0x010c }
            return r2
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 != 0) goto L_0x00aa
            long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x010c }
            r0.f25590e = r4     // Catch:{ Throwable -> 0x010c }
            goto L_0x00ac
        L_0x00aa:
            r0.f25590e = r11     // Catch:{ Throwable -> 0x010c }
        L_0x00ac:
            java.lang.String r2 = r0.n     // Catch:{ Throwable -> 0x010c }
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = r0.n     // Catch:{ Throwable -> 0x010c }
            boolean r2 = r3.equals(r2)     // Catch:{ Throwable -> 0x010c }
            if (r2 != 0) goto L_0x00d0
            long r4 = com.loc.cn.a()     // Catch:{ Throwable -> 0x010c }
            long r13 = r0.h     // Catch:{ Throwable -> 0x010c }
            r2 = 0
            long r4 = r4 - r13
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c7
            java.lang.String r2 = r0.n     // Catch:{ Throwable -> 0x010c }
            goto L_0x00e0
        L_0x00c7:
            long r4 = com.loc.cn.a()     // Catch:{ Throwable -> 0x010c }
        L_0x00cb:
            r0.h = r4     // Catch:{ Throwable -> 0x010c }
            r0.n = r3     // Catch:{ Throwable -> 0x010c }
            goto L_0x00df
        L_0x00d0:
            java.lang.String r2 = r0.n     // Catch:{ Throwable -> 0x010c }
            if (r2 != 0) goto L_0x00d9
            long r4 = com.loc.cn.a()     // Catch:{ Throwable -> 0x010c }
            goto L_0x00cb
        L_0x00d9:
            long r4 = com.loc.cn.a()     // Catch:{ Throwable -> 0x010c }
            r0.h = r4     // Catch:{ Throwable -> 0x010c }
        L_0x00df:
            r2 = r3
        L_0x00e0:
            if (r8 != 0) goto L_0x00ee
            if (r19 != 0) goto L_0x00ee
            r3 = r22
            r4 = r24
            r5 = 0
            com.autonavi.aps.amapapi.model.AMapLocationServer r2 = r0.a((android.content.Context) r4, (java.lang.String) r2, (java.lang.StringBuilder) r3, (boolean) r5)     // Catch:{ Throwable -> 0x010c }
            goto L_0x00f0
        L_0x00ee:
            r5 = 0
            r2 = r7
        L_0x00f0:
            if (r19 != 0) goto L_0x00fb
            boolean r3 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r2)     // Catch:{ Throwable -> 0x010c }
            if (r3 != 0) goto L_0x00fb
            r16 = 1
            goto L_0x00fd
        L_0x00fb:
            r16 = 0
        L_0x00fd:
            if (r16 != 0) goto L_0x010c
            if (r8 == 0) goto L_0x0102
            goto L_0x010c
        L_0x0102:
            if (r19 == 0) goto L_0x0105
            return r7
        L_0x0105:
            r0.f25590e = r11     // Catch:{ Throwable -> 0x010c }
            r1 = 4
            r2.setLocationType(r1)     // Catch:{ Throwable -> 0x010c }
            return r2
        L_0x010c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(com.loc.bq, boolean, com.autonavi.aps.amapapi.model.AMapLocationServer, com.loc.bs, java.lang.StringBuilder, java.lang.String, android.content.Context):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.l = 0;
        if (!this.f25586a.isEmpty()) {
            this.f25586a.clear();
        }
        this.f25587b = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb A[Catch:{ Throwable -> 0x0268, all -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r11, java.lang.String r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = com.loc.cd.f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r11 != 0) goto L_0x000a
            return
        L_0x000a:
            r0 = 0
            java.lang.String r1 = "hmdb"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.openOrCreateDatabase(r1, r2, r0)     // Catch:{ Throwable -> 0x0271, all -> 0x026d }
            java.lang.String r3 = "hist"
            boolean r3 = com.loc.cn.a((android.database.sqlite.SQLiteDatabase) r1, (java.lang.String) r3)     // Catch:{ Throwable -> 0x026b }
            if (r3 != 0) goto L_0x0026
            if (r1 == 0) goto L_0x0025
            boolean r11 = r1.isOpen()     // Catch:{ Throwable -> 0x026b }
            if (r11 == 0) goto L_0x0025
            r1.close()     // Catch:{ Throwable -> 0x026b }
        L_0x0025:
            return
        L_0x0026:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x026b }
            r3.<init>()     // Catch:{ Throwable -> 0x026b }
            java.lang.String r4 = "SELECT feature, nb, loc FROM "
            r3.append(r4)     // Catch:{ Throwable -> 0x026b }
            java.lang.String r4 = "hist"
            r3.append(r4)     // Catch:{ Throwable -> 0x026b }
            java.lang.String r4 = r10.f25588c     // Catch:{ Throwable -> 0x026b }
            r3.append(r4)     // Catch:{ Throwable -> 0x026b }
            long r4 = com.loc.cn.a()     // Catch:{ Throwable -> 0x026b }
            long r6 = com.loc.cd.e()     // Catch:{ Throwable -> 0x026b }
            r8 = 0
            long r4 = r4 - r6
            java.lang.String r6 = " WHERE time > "
            r3.append(r6)     // Catch:{ Throwable -> 0x026b }
            r3.append(r4)     // Catch:{ Throwable -> 0x026b }
            if (r12 == 0) goto L_0x0067
            java.lang.String r4 = " and feature = '"
            r3.append(r4)     // Catch:{ Throwable -> 0x026b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x026b }
            r4.<init>()     // Catch:{ Throwable -> 0x026b }
            r4.append(r12)     // Catch:{ Throwable -> 0x026b }
            java.lang.String r12 = "'"
            r4.append(r12)     // Catch:{ Throwable -> 0x026b }
            java.lang.String r12 = r4.toString()     // Catch:{ Throwable -> 0x026b }
            r3.append(r12)     // Catch:{ Throwable -> 0x026b }
        L_0x0067:
            java.lang.String r12 = " ORDER BY time ASC;"
            r3.append(r12)     // Catch:{ Throwable -> 0x026b }
            java.lang.String r12 = r3.toString()     // Catch:{ Throwable -> 0x026b }
            android.database.Cursor r12 = r1.rawQuery(r12, r0)     // Catch:{ Throwable -> 0x026b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = r10.m     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 != 0) goto L_0x0089
            java.lang.String r4 = "MD5"
            java.lang.String r5 = com.loc.cy.c(r11)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = com.loc.bt.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r10.m = r4     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x0089:
            if (r12 == 0) goto L_0x0255
            boolean r4 = r12.moveToFirst()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 == 0) goto L_0x0255
        L_0x0091:
            java.lang.String r4 = r12.getString(r2)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "{"
            boolean r4 = r4.startsWith(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x00f4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r7 = r12.getString(r2)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.<init>(r7)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            int r7 = r0.length()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.delete(r2, r7)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r7 = r12.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r7 != 0) goto L_0x00c1
            java.lang.String r6 = r12.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x00bd:
            r0.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            goto L_0x00da
        L_0x00c1:
            java.lang.String r6 = "mmac"
            boolean r6 = com.loc.cn.a((org.json.JSONObject) r4, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r6 == 0) goto L_0x00da
            java.lang.String r6 = "#"
            r0.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "mmac"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = ",access"
            goto L_0x00bd
        L_0x00da:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = r12.getString(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "type"
            boolean r5 = com.loc.cn.a((org.json.JSONObject) r6, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r5 == 0) goto L_0x017d
            java.lang.String r5 = "type"
            java.lang.String r7 = "new"
            r6.put(r5, r7)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            goto L_0x017d
        L_0x00f4:
            java.lang.String r4 = r12.getString(r2)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.dd.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r9 = r10.m     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.bt.d(r4, r9)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r9 = "UTF-8"
            r8.<init>(r4, r9)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            int r4 = r0.length()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.delete(r2, r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = r12.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 != 0) goto L_0x0138
            java.lang.String r4 = r12.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.dd.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r8 = r10.m     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.bt.d(r4, r8)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r8 = "UTF-8"
            r6.<init>(r4, r8)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            goto L_0x0153
        L_0x0138:
            java.lang.String r4 = "mmac"
            boolean r4 = com.loc.cn.a((org.json.JSONObject) r7, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 == 0) goto L_0x0153
            java.lang.String r4 = "#"
            r0.append(r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = "mmac"
            java.lang.String r4 = r7.getString(r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.append(r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = ",access"
            r0.append(r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x0153:
            java.lang.String r4 = r12.getString(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.dd.b((java.lang.String) r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r8 = r10.m     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            byte[] r4 = com.loc.bt.d(r4, r8)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r8 = "UTF-8"
            r5.<init>(r4, r8)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r4 = "type"
            boolean r4 = com.loc.cn.a((org.json.JSONObject) r6, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 == 0) goto L_0x017c
            java.lang.String r4 = "type"
            java.lang.String r5 = "new"
            r6.put(r4, r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x017c:
            r4 = r7
        L_0x017d:
            com.autonavi.aps.amapapi.model.AMapLocationServer r7 = new com.autonavi.aps.amapapi.model.AMapLocationServer     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = ""
            r7.<init>(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r7.b((org.json.JSONObject) r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "mmac"
            boolean r5 = com.loc.cn.a((org.json.JSONObject) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r5 == 0) goto L_0x01ee
            java.lang.String r5 = "cgi"
            boolean r5 = com.loc.cn.a((org.json.JSONObject) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r5 == 0) goto L_0x01ee
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "cgi"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "network#"
            r6.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = r6.toString()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "cgi"
            java.lang.String r4 = r4.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "#"
            boolean r4 = r4.contains(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 == 0) goto L_0x01e0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "cgiwifi"
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x01da:
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5 = r4
            goto L_0x023a
        L_0x01e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "wifi"
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            goto L_0x01da
        L_0x01ee:
            java.lang.String r5 = "cgi"
            boolean r5 = com.loc.cn.a((org.json.JSONObject) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r5 == 0) goto L_0x0241
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "cgi"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "#"
            r5.append(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r6.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "network#"
            r6.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = r6.toString()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "cgi"
            java.lang.String r4 = r4.getString(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r6 = "#"
            boolean r4 = r4.contains(r6)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 == 0) goto L_0x0241
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.<init>()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            java.lang.String r5 = "cgi"
            r4.append(r5)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            goto L_0x01da
        L_0x023a:
            r9 = 0
            r4 = r10
            r6 = r0
            r8 = r11
            r4.a(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x0241:
            boolean r4 = r12.moveToNext()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            if (r4 != 0) goto L_0x0091
            int r11 = r0.length()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r0.delete(r2, r11)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            int r11 = r3.length()     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
            r3.delete(r2, r11)     // Catch:{ Throwable -> 0x0268, all -> 0x0266 }
        L_0x0255:
            if (r12 == 0) goto L_0x025a
            r12.close()
        L_0x025a:
            if (r1 == 0) goto L_0x0265
            boolean r11 = r1.isOpen()
            if (r11 == 0) goto L_0x0265
            r1.close()
        L_0x0265:
            return
        L_0x0266:
            r11 = move-exception
            goto L_0x028d
        L_0x0268:
            r11 = move-exception
            r0 = r12
            goto L_0x0273
        L_0x026b:
            r11 = move-exception
            goto L_0x0273
        L_0x026d:
            r11 = move-exception
            r12 = r0
            r1 = r12
            goto L_0x028d
        L_0x0271:
            r11 = move-exception
            r1 = r0
        L_0x0273:
            java.lang.String r12 = "DB"
            java.lang.String r2 = "fetchHist p2"
            com.loc.ce.a(r11, r12, r2)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x027f
            r0.close()
        L_0x027f:
            if (r1 == 0) goto L_0x028a
            boolean r11 = r1.isOpen()
            if (r11 == 0) goto L_0x028a
            r1.close()
        L_0x028a:
            return
        L_0x028b:
            r11 = move-exception
            r12 = r0
        L_0x028d:
            if (r12 == 0) goto L_0x0292
            r12.close()
        L_0x0292:
            if (r1 == 0) goto L_0x029d
            boolean r12 = r1.isOpen()
            if (r12 == 0) goto L_0x029d
            r1.close()
        L_0x029d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0120 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016f A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0171 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017b A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017e A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0190 A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019c A[Catch:{ Throwable -> 0x01af, Throwable -> 0x01b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ab A[SYNTHETIC, Splitter:B:87:0x01ab] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.StringBuilder r10, com.autonavi.aps.amapapi.model.AMapLocationServer r11, android.content.Context r12, boolean r13) {
        /*
            r8 = this;
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r11)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01b8 }
            r0.<init>()     // Catch:{ Throwable -> 0x01b8 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r9 = "&"
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            boolean r9 = r11.isOffset()     // Catch:{ Throwable -> 0x01b8 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r9 = "&"
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            boolean r9 = r11.i()     // Catch:{ Throwable -> 0x01b8 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r9 = "&"
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r9 = r11.j()     // Catch:{ Throwable -> 0x01b8 }
            r0.append(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r9 = r0.toString()     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x01b8 }
            r1 = 0
            if (r0 != 0) goto L_0x0055
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r11)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 != 0) goto L_0x0045
            goto L_0x0055
        L_0x0045:
            java.lang.String r0 = "#"
            boolean r0 = r9.startsWith(r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            java.lang.String r0 = "network"
            boolean r0 = r9.contains(r0)     // Catch:{ Throwable -> 0x01b8 }
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            return
        L_0x0059:
            java.lang.String r0 = r11.e()     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r2 = "mem"
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0066
            return
        L_0x0066:
            java.lang.String r0 = r11.e()     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r2 = "file"
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0073
            return
        L_0x0073:
            java.lang.String r0 = r11.e()     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r2 = "wifioff"
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0080
            return
        L_0x0080:
            java.lang.String r0 = "-3"
            java.lang.String r2 = r11.d()     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = r0.equals(r2)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x008d
            return
        L_0x008d:
            boolean r0 = r8.b()     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0096
            r8.a()     // Catch:{ Throwable -> 0x01b8 }
        L_0x0096:
            org.json.JSONObject r0 = r11.f()     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r2 = "offpct"
            boolean r2 = com.loc.cn.a((org.json.JSONObject) r0, (java.lang.String) r2)     // Catch:{ Throwable -> 0x01b8 }
            if (r2 == 0) goto L_0x00aa
            java.lang.String r2 = "offpct"
            r0.remove(r2)     // Catch:{ Throwable -> 0x01b8 }
            r11.a((org.json.JSONObject) r0)     // Catch:{ Throwable -> 0x01b8 }
        L_0x00aa:
            java.lang.String r0 = "wifi"
            boolean r0 = r9.contains(r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0120
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x00b9
            return
        L_0x00b9:
            float r0 = r11.getAccuracy()     // Catch:{ Throwable -> 0x01b8 }
            r2 = 1133903872(0x43960000, float:300.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
            java.lang.String r0 = r10.toString()     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r2 = "#"
            java.lang.String[] r0 = r0.split(r2)     // Catch:{ Throwable -> 0x01b8 }
            int r2 = r0.length     // Catch:{ Throwable -> 0x01b8 }
            r3 = 0
        L_0x00cf:
            if (r1 >= r2) goto L_0x00e0
            r4 = r0[r1]     // Catch:{ Throwable -> 0x01b8 }
            java.lang.String r5 = ","
            boolean r4 = r4.contains(r5)     // Catch:{ Throwable -> 0x01b8 }
            if (r4 == 0) goto L_0x00dd
            int r3 = r3 + 1
        L_0x00dd:
            int r1 = r1 + 1
            goto L_0x00cf
        L_0x00e0:
            r0 = 8
            if (r3 < r0) goto L_0x00f0
            return
        L_0x00e5:
            float r0 = r11.getAccuracy()     // Catch:{ Throwable -> 0x01b8 }
            r1 = 1077936128(0x40400000, float:3.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f0
            return
        L_0x00f0:
            java.lang.String r0 = "cgiwifi"
            boolean r0 = r9.contains(r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = r11.g()     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "cgiwifi"
            java.lang.String r1 = "cgi"
            java.lang.String r3 = r9.replace(r0, r1)     // Catch:{ Throwable -> 0x01b8 }
            com.autonavi.aps.amapapi.model.AMapLocationServer r5 = r11.h()     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r5)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0141
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01b8 }
            r4.<init>()     // Catch:{ Throwable -> 0x01b8 }
            r7 = 1
            r2 = r8
            r6 = r12
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x01b8 }
            goto L_0x0141
        L_0x0120:
            java.lang.String r0 = "cgi"
            boolean r0 = r9.contains(r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0141
            if (r10 == 0) goto L_0x0134
            java.lang.String r0 = ","
            int r0 = r10.indexOf(r0)     // Catch:{ Throwable -> 0x01b8 }
            r1 = -1
            if (r0 == r1) goto L_0x0134
            return
        L_0x0134:
            java.lang.String r0 = "4"
            java.lang.String r1 = r11.d()     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x0141
            return
        L_0x0141:
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r8.a((java.lang.String) r9, (java.lang.StringBuilder) r10)     // Catch:{ Throwable -> 0x01b8 }
            boolean r1 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)     // Catch:{ Throwable -> 0x01b8 }
            if (r1 == 0) goto L_0x015b
            java.lang.String r0 = r0.toStr()     // Catch:{ Throwable -> 0x01b8 }
            r1 = 3
            java.lang.String r1 = r11.toStr(r1)     // Catch:{ Throwable -> 0x01b8 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x01b8 }
            if (r0 == 0) goto L_0x015b
            return
        L_0x015b:
            long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x01b8 }
            r8.l = r0     // Catch:{ Throwable -> 0x01b8 }
            com.loc.bu$a r0 = new com.loc.bu$a     // Catch:{ Throwable -> 0x01b8 }
            r0.<init>()     // Catch:{ Throwable -> 0x01b8 }
            r0.f25592a = r11     // Catch:{ Throwable -> 0x01b8 }
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x01b8 }
            r2 = 0
            if (r1 == 0) goto L_0x0171
            r1 = r2
            goto L_0x0175
        L_0x0171:
            java.lang.String r1 = r10.toString()     // Catch:{ Throwable -> 0x01b8 }
        L_0x0175:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x01b8 }
            if (r3 == 0) goto L_0x017e
            r0.f25593b = r2     // Catch:{ Throwable -> 0x01b8 }
            goto L_0x0188
        L_0x017e:
            java.lang.String r2 = "##"
            java.lang.String r3 = "#"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Throwable -> 0x01b8 }
            r0.f25593b = r1     // Catch:{ Throwable -> 0x01b8 }
        L_0x0188:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r1 = r8.f25586a     // Catch:{ Throwable -> 0x01b8 }
            boolean r1 = r1.containsKey(r9)     // Catch:{ Throwable -> 0x01b8 }
            if (r1 == 0) goto L_0x019c
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r1 = r8.f25586a     // Catch:{ Throwable -> 0x01b8 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ Throwable -> 0x01b8 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Throwable -> 0x01b8 }
            r1.add(r0)     // Catch:{ Throwable -> 0x01b8 }
            goto L_0x01a9
        L_0x019c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01b8 }
            r1.<init>()     // Catch:{ Throwable -> 0x01b8 }
            r1.add(r0)     // Catch:{ Throwable -> 0x01b8 }
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.bu$a>> r0 = r8.f25586a     // Catch:{ Throwable -> 0x01b8 }
            r0.put(r9, r1)     // Catch:{ Throwable -> 0x01b8 }
        L_0x01a9:
            if (r13 == 0) goto L_0x01b7
            r8.a((java.lang.String) r9, (com.amap.api.location.AMapLocation) r11, (java.lang.StringBuilder) r10, (android.content.Context) r12)     // Catch:{ Throwable -> 0x01af }
            return
        L_0x01af:
            r9 = move-exception
            java.lang.String r10 = "Cache"
            java.lang.String r11 = "add"
            com.loc.ce.a(r9, r10, r11)     // Catch:{ Throwable -> 0x01b8 }
        L_0x01b7:
            return
        L_0x01b8:
            r9 = move-exception
            java.lang.String r10 = "Cache"
            java.lang.String r11 = "add"
            com.loc.ce.a(r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bu.a(java.lang.String, java.lang.StringBuilder, com.autonavi.aps.amapapi.model.AMapLocationServer, android.content.Context, boolean):void");
    }
}
