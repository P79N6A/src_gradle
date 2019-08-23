package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.b;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.Map;

public final class a implements NativeExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Context f79395a;

    /* renamed from: b  reason: collision with root package name */
    private final b f79396b;

    /* renamed from: c  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f79397c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.strategy.a f79398d;

    public a(Context context, com.tencent.bugly.crashreport.common.info.a aVar, b bVar, com.tencent.bugly.crashreport.common.strategy.a aVar2) {
        this.f79395a = context;
        this.f79396b = bVar;
        this.f79397c = aVar;
        this.f79398d = aVar2;
    }

    public final CrashDetailBean packageCrashDatas(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, byte[] bArr, Map<String, String> map, boolean z) {
        String str11;
        String str12;
        String str13;
        String str14 = str;
        String str15 = str8;
        byte[] bArr2 = bArr;
        boolean l = c.a().l();
        if (l) {
            x.e("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f79303b = 1;
        crashDetailBean.f79306e = this.f79397c.h();
        crashDetailBean.f79307f = this.f79397c.j;
        crashDetailBean.g = this.f79397c.w();
        crashDetailBean.m = this.f79397c.g();
        crashDetailBean.n = str3;
        if (l) {
            str11 = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
        } else {
            str11 = "";
        }
        crashDetailBean.o = str11;
        crashDetailBean.p = str4;
        if (str5 == null) {
            str12 = "";
        } else {
            str12 = str5;
        }
        crashDetailBean.q = str12;
        crashDetailBean.r = j;
        crashDetailBean.u = z.b(crashDetailBean.q.getBytes());
        crashDetailBean.z = str14;
        crashDetailBean.A = str2;
        crashDetailBean.H = this.f79397c.y();
        crashDetailBean.h = this.f79397c.v();
        crashDetailBean.i = this.f79397c.K();
        crashDetailBean.v = str15;
        NativeCrashHandler instance = NativeCrashHandler.getInstance();
        if (instance != null) {
            str13 = instance.getDumpFilePath();
        } else {
            str13 = null;
        }
        String a2 = b.a(str13, str15);
        if (!z.a(a2)) {
            crashDetailBean.T = a2;
        }
        crashDetailBean.U = b.b(str13);
        crashDetailBean.w = b.a(str9, c.f79348e, (String) null);
        crashDetailBean.I = str7;
        crashDetailBean.J = str6;
        crashDetailBean.K = str10;
        crashDetailBean.E = this.f79397c.p();
        crashDetailBean.F = this.f79397c.o();
        crashDetailBean.G = this.f79397c.q();
        if (z) {
            crashDetailBean.B = com.tencent.bugly.crashreport.common.info.b.h();
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.f();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.j();
            if (crashDetailBean.w == null) {
                crashDetailBean.w = z.a(this.f79395a, c.f79348e, (String) null);
            }
            crashDetailBean.x = y.a();
            crashDetailBean.L = this.f79397c.f79274a;
            crashDetailBean.M = this.f79397c.a();
            crashDetailBean.O = this.f79397c.H();
            crashDetailBean.P = this.f79397c.I();
            crashDetailBean.Q = this.f79397c.B();
            crashDetailBean.R = this.f79397c.G();
            crashDetailBean.y = z.a(c.f79349f, false);
            int indexOf = crashDetailBean.q.indexOf("java:\n");
            if (indexOf > 0) {
                int length = indexOf + "java:\n".length();
                if (length < crashDetailBean.q.length()) {
                    String str16 = crashDetailBean.q;
                    String substring = str16.substring(length, str16.length() - 1);
                    if (substring.length() > 0 && crashDetailBean.y.containsKey(crashDetailBean.A)) {
                        String str17 = crashDetailBean.y.get(crashDetailBean.A);
                        int indexOf2 = str17.indexOf(substring);
                        if (indexOf2 > 0) {
                            String substring2 = str17.substring(indexOf2);
                            crashDetailBean.y.put(crashDetailBean.A, substring2);
                            crashDetailBean.q = crashDetailBean.q.substring(0, length);
                            crashDetailBean.q += substring2;
                        }
                    }
                }
            }
            if (str14 == null) {
                crashDetailBean.z = this.f79397c.f79277d;
            }
            this.f79396b.c(crashDetailBean);
        } else {
            crashDetailBean.B = -1;
            crashDetailBean.C = -1;
            crashDetailBean.D = -1;
            if (crashDetailBean.w == null) {
                crashDetailBean.w = "this crash is occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.L = -1;
            crashDetailBean.O = -1;
            crashDetailBean.P = -1;
            crashDetailBean.Q = map;
            crashDetailBean.R = this.f79397c.G();
            crashDetailBean.y = null;
            if (str14 == null) {
                crashDetailBean.z = "unknown(record)";
            }
            if (bArr2 != null) {
                crashDetailBean.x = bArr2;
            }
        }
        return crashDetailBean;
    }

    public final void handleNativeException(int i, int i2, long j, long j2, String str, String str2, String str3, String str4, int i3, String str5, int i4, int i5, int i6, String str6, String str7) {
        x.a("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i, i2, j, j2, str, str2, str3, str4, i3, str5, i4, i5, i6, str6, str7, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0156 A[Catch:{ Throwable -> 0x0278 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0202 A[Catch:{ Throwable -> 0x0274 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x020b A[Catch:{ Throwable -> 0x0274 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleNativeException2(int r23, int r24, long r25, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, java.lang.String r34, int r35, int r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.String[] r40) {
        /*
            r22 = this;
            r15 = r22
            r0 = r30
            r14 = r33
            r1 = r35
            r2 = r40
            java.lang.String r3 = "Native Crash Happen v2"
            r13 = 0
            java.lang.Object[] r4 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.x.a(r3, r4)
            com.tencent.bugly.crashreport.common.strategy.a r3 = r15.f79398d     // Catch:{ Throwable -> 0x0278 }
            boolean r3 = r3.b()     // Catch:{ Throwable -> 0x0278 }
            if (r3 != 0) goto L_0x0035
            java.lang.String r3 = "waiting for remote sync"
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.e(r3, r4)     // Catch:{ Throwable -> 0x0278 }
            r3 = 0
        L_0x0022:
            com.tencent.bugly.crashreport.common.strategy.a r4 = r15.f79398d     // Catch:{ Throwable -> 0x0278 }
            boolean r4 = r4.b()     // Catch:{ Throwable -> 0x0278 }
            if (r4 != 0) goto L_0x0035
            r4 = 500(0x1f4, double:2.47E-321)
            com.tencent.bugly.proguard.z.b((long) r4)     // Catch:{ Throwable -> 0x0278 }
            int r3 = r3 + 500
            r4 = 3000(0xbb8, float:4.204E-42)
            if (r3 < r4) goto L_0x0022
        L_0x0035:
            java.lang.String r12 = com.tencent.bugly.crashreport.crash.jni.b.a((java.lang.String) r31)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = "UNKNOWN"
            if (r14 <= 0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0278 }
            r1.<init>()     // Catch:{ Throwable -> 0x0278 }
            r4 = r29
            r1.append(r4)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r4 = "("
            r1.append(r4)     // Catch:{ Throwable -> 0x0278 }
            r5 = r34
            r1.append(r5)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r4 = ")"
            r1.append(r4)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r4 = "KERNEL"
            r11 = r1
            r10 = r3
            r9 = r4
            goto L_0x0092
        L_0x0060:
            r4 = r29
            r5 = r34
            if (r1 <= 0) goto L_0x006a
            java.lang.String r3 = com.tencent.bugly.crashreport.common.info.AppInfo.a((int) r35)     // Catch:{ Throwable -> 0x0278 }
        L_0x006a:
            java.lang.String r6 = java.lang.String.valueOf(r35)     // Catch:{ Throwable -> 0x0278 }
            boolean r6 = r3.equals(r6)     // Catch:{ Throwable -> 0x0278 }
            if (r6 != 0) goto L_0x008f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0278 }
            r6.<init>()     // Catch:{ Throwable -> 0x0278 }
            r6.append(r3)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = "("
            r6.append(r3)     // Catch:{ Throwable -> 0x0278 }
            r6.append(r1)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r1 = ")"
            r6.append(r1)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r1 = r6.toString()     // Catch:{ Throwable -> 0x0278 }
            r10 = r1
            goto L_0x0090
        L_0x008f:
            r10 = r3
        L_0x0090:
            r11 = r4
            r9 = r5
        L_0x0092:
            com.tencent.bugly.crashreport.common.strategy.a r1 = r15.f79398d     // Catch:{ Throwable -> 0x0278 }
            boolean r1 = r1.b()     // Catch:{ Throwable -> 0x0278 }
            if (r1 != 0) goto L_0x00a1
            java.lang.String r1 = "no remote but still store!"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.d(r1, r3)     // Catch:{ Throwable -> 0x0278 }
        L_0x00a1:
            com.tencent.bugly.crashreport.common.strategy.a r1 = r15.f79398d     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r1 = r1.c()     // Catch:{ Throwable -> 0x0278 }
            boolean r1 = r1.g     // Catch:{ Throwable -> 0x0278 }
            if (r1 != 0) goto L_0x00f8
            com.tencent.bugly.crashreport.common.strategy.a r1 = r15.f79398d     // Catch:{ Throwable -> 0x0278 }
            boolean r1 = r1.b()     // Catch:{ Throwable -> 0x0278 }
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = "crash report was closed by remote , will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.e(r1, r2)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r1 = "NATIVE_CRASH"
            java.lang.String r2 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.crashreport.common.info.a r3 = r15.f79397c     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = r3.f79277d     // Catch:{ Throwable -> 0x0278 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x0278 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0278 }
            r5.<init>()     // Catch:{ Throwable -> 0x0278 }
            r5.append(r11)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch:{ Throwable -> 0x0278 }
            r5.append(r0)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ Throwable -> 0x0278 }
            r5.append(r12)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r0 = r5.toString()     // Catch:{ Throwable -> 0x0278 }
            r5 = 0
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r4
            r27 = r0
            r28 = r5
            com.tencent.bugly.crashreport.crash.b.a(r23, r24, r25, r26, r27, r28)     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.z.b((java.lang.String) r32)     // Catch:{ Throwable -> 0x0278 }
            return
        L_0x00f8:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x0278 }
            r1.<init>()     // Catch:{ Throwable -> 0x0278 }
            if (r2 == 0) goto L_0x0125
            int r3 = r2.length     // Catch:{ Throwable -> 0x0278 }
            r4 = 0
        L_0x0101:
            if (r4 >= r3) goto L_0x012c
            r5 = r2[r4]     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r6 = "="
            java.lang.String[] r6 = r5.split(r6)     // Catch:{ Throwable -> 0x0278 }
            int r7 = r6.length     // Catch:{ Throwable -> 0x0278 }
            r8 = 2
            if (r7 != r8) goto L_0x0118
            r5 = r6[r13]     // Catch:{ Throwable -> 0x0278 }
            r7 = 1
            r6 = r6[r7]     // Catch:{ Throwable -> 0x0278 }
            r1.put(r5, r6)     // Catch:{ Throwable -> 0x0278 }
            goto L_0x0122
        L_0x0118:
            java.lang.String r6 = "bad extraMsg %s"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0278 }
            r8[r13] = r5     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.d(r6, r8)     // Catch:{ Throwable -> 0x0278 }
        L_0x0122:
            int r4 = r4 + 1
            goto L_0x0101
        L_0x0125:
            java.lang.String r2 = "not found extraMsg"
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.c(r2, r3)     // Catch:{ Throwable -> 0x0278 }
        L_0x012c:
            java.lang.String r2 = "ExceptionProcessName"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0278 }
            if (r2 == 0) goto L_0x0148
            int r3 = r2.length()     // Catch:{ Throwable -> 0x0278 }
            if (r3 != 0) goto L_0x013d
            goto L_0x0148
        L_0x013d:
            java.lang.String r3 = "crash process name change to %s"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0278 }
            r5[r13] = r2     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.c(r3, r5)     // Catch:{ Throwable -> 0x0278 }
            goto L_0x014c
        L_0x0148:
            com.tencent.bugly.crashreport.common.info.a r2 = r15.f79397c     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r2 = r2.f79277d     // Catch:{ Throwable -> 0x0278 }
        L_0x014c:
            java.lang.String r3 = "ExceptionThreadName"
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0278 }
            if (r3 == 0) goto L_0x01a7
            int r4 = r3.length()     // Catch:{ Throwable -> 0x0278 }
            if (r4 != 0) goto L_0x015d
            goto L_0x01a7
        L_0x015d:
            java.lang.String r4 = "crash thread name change to %s"
            r8 = 1
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0278 }
            r5[r13] = r3     // Catch:{ Throwable -> 0x0278 }
            com.tencent.bugly.proguard.x.c(r4, r5)     // Catch:{ Throwable -> 0x0278 }
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()     // Catch:{ Throwable -> 0x0278 }
            java.util.Set r4 = r4.keySet()     // Catch:{ Throwable -> 0x0278 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Throwable -> 0x0278 }
        L_0x0173:
            boolean r5 = r4.hasNext()     // Catch:{ Throwable -> 0x0278 }
            if (r5 == 0) goto L_0x01cd
            java.lang.Object r5 = r4.next()     // Catch:{ Throwable -> 0x0278 }
            java.lang.Thread r5 = (java.lang.Thread) r5     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r6 = r5.getName()     // Catch:{ Throwable -> 0x0278 }
            boolean r6 = r6.equals(r3)     // Catch:{ Throwable -> 0x0278 }
            if (r6 == 0) goto L_0x0173
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0278 }
            r4.<init>()     // Catch:{ Throwable -> 0x0278 }
            r4.append(r3)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = "("
            r4.append(r3)     // Catch:{ Throwable -> 0x0278 }
            long r5 = r5.getId()     // Catch:{ Throwable -> 0x0278 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0278 }
            goto L_0x01cd
        L_0x01a7:
            r8 = 1
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x0278 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0278 }
            r4.<init>()     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r5 = r3.getName()     // Catch:{ Throwable -> 0x0278 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ Throwable -> 0x0278 }
            long r5 = r3.getId()     // Catch:{ Throwable -> 0x0278 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = ")"
            r4.append(r3)     // Catch:{ Throwable -> 0x0278 }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x0278 }
        L_0x01cd:
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r25 * r4
            long r4 = r27 / r4
            r16 = 0
            long r4 = r4 + r6
            java.lang.String r6 = "SysLogPath"
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Throwable -> 0x0278 }
            r16 = r1
            java.lang.String r16 = (java.lang.String) r16     // Catch:{ Throwable -> 0x0278 }
            r17 = 0
            r18 = 0
            r19 = 1
            r1 = r22
            r6 = r11
            r7 = r30
            r8 = r12
            r20 = r11
            r11 = r32
            r21 = r12
            r12 = r16
            r13 = r39
            r14 = r17
            r15 = r18
            r16 = r19
            com.tencent.bugly.crashreport.crash.CrashDetailBean r1 = r1.packageCrashDatas(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Throwable -> 0x0274 }
            if (r1 != 0) goto L_0x020b
            java.lang.String r0 = "pkg crash datas fail!"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0274 }
            com.tencent.bugly.proguard.x.e(r0, r1)     // Catch:{ Throwable -> 0x0274 }
            return
        L_0x020b:
            java.lang.String r2 = "NATIVE_CRASH"
            java.lang.String r3 = com.tencent.bugly.proguard.z.a()     // Catch:{ Throwable -> 0x0274 }
            r4 = r22
            com.tencent.bugly.crashreport.common.info.a r5 = r4.f79397c     // Catch:{ Throwable -> 0x0272 }
            java.lang.String r5 = r5.f79277d     // Catch:{ Throwable -> 0x0272 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x0272 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0272 }
            r7.<init>()     // Catch:{ Throwable -> 0x0272 }
            r8 = r20
            r7.append(r8)     // Catch:{ Throwable -> 0x0272 }
            java.lang.String r8 = "\n"
            r7.append(r8)     // Catch:{ Throwable -> 0x0272 }
            r7.append(r0)     // Catch:{ Throwable -> 0x0272 }
            java.lang.String r0 = "\n"
            r7.append(r0)     // Catch:{ Throwable -> 0x0272 }
            r0 = r21
            r7.append(r0)     // Catch:{ Throwable -> 0x0272 }
            java.lang.String r0 = r7.toString()     // Catch:{ Throwable -> 0x0272 }
            r23 = r2
            r24 = r3
            r25 = r5
            r26 = r6
            r27 = r0
            r28 = r1
            com.tencent.bugly.crashreport.crash.b.a(r23, r24, r25, r26, r27, r28)     // Catch:{ Throwable -> 0x0272 }
            com.tencent.bugly.crashreport.crash.b r0 = r4.f79396b     // Catch:{ Throwable -> 0x0272 }
            r2 = r33
            boolean r0 = r0.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r1, (int) r2)     // Catch:{ Throwable -> 0x0272 }
            if (r0 != 0) goto L_0x025d
            com.tencent.bugly.crashreport.crash.b r0 = r4.f79396b     // Catch:{ Throwable -> 0x0272 }
            r2 = 3000(0xbb8, double:1.482E-320)
            r5 = 1
            r0.a((com.tencent.bugly.crashreport.crash.CrashDetailBean) r1, (long) r2, (boolean) r5)     // Catch:{ Throwable -> 0x0272 }
            goto L_0x025e
        L_0x025d:
            r5 = 1
        L_0x025e:
            com.tencent.bugly.crashreport.crash.b r0 = r4.f79396b     // Catch:{ Throwable -> 0x0272 }
            r0.b((com.tencent.bugly.crashreport.crash.CrashDetailBean) r1)     // Catch:{ Throwable -> 0x0272 }
            r0 = 0
            com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler r1 = com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.getInstance()     // Catch:{ Throwable -> 0x0272 }
            if (r1 == 0) goto L_0x026e
            java.lang.String r0 = r1.getDumpFilePath()     // Catch:{ Throwable -> 0x0272 }
        L_0x026e:
            com.tencent.bugly.crashreport.crash.jni.b.a((boolean) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0272 }
            return
        L_0x0272:
            r0 = move-exception
            goto L_0x027a
        L_0x0274:
            r0 = move-exception
            r4 = r22
            goto L_0x027a
        L_0x0278:
            r0 = move-exception
            r4 = r15
        L_0x027a:
            com.tencent.bugly.proguard.x.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.jni.a.handleNativeException2(int, int, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
