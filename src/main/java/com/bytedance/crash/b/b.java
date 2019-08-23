package com.bytedance.crash.b;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.f;
import com.bytedance.crash.runtime.h;
import com.ss.android.ugc.aweme.q.c;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    static volatile boolean f19352d = true;

    /* renamed from: a  reason: collision with root package name */
    public a f19353a;

    /* renamed from: b  reason: collision with root package name */
    public c f19354b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f19355c;

    /* renamed from: e  reason: collision with root package name */
    private final Context f19356e;

    /* renamed from: f  reason: collision with root package name */
    private volatile long f19357f;
    private final SharedPreferences g;

    private static void a(String str) {
        for (g a2 : j.b().f19345f) {
            a2.a(d.ANR, str, null);
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.trim().length() > 0) {
                sb.append(readLine);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public b(Context context) {
        if (context == null || !(context instanceof Application)) {
            throw new IllegalArgumentException("context must not be null or not application");
        }
        this.f19356e = context;
        this.g = c.a(this.f19356e, "anr_monitor_table", 0);
        this.f19357f = this.g.getLong("trace_anr_happen_time", 0);
        if (e.f19365a) {
            e.f19366b = 100;
            e.f19369e = 100;
            e.f19367c = new ArrayList();
            com.bytedance.crash.runtime.g.a(4);
            f.a().b();
            f.a().b(new Printer() {
                public final void println(String str) {
                    int i;
                    if (e.f19365a) {
                        e.m = str;
                        if (!e.l) {
                            e.l = true;
                            e.o = Process.myTid();
                            e.g = h.a();
                            e.f19370f = SystemClock.uptimeMillis();
                            e.j = new Handler(e.g.getLooper());
                            com.bytedance.crash.runtime.g.a(8);
                            e.j.postDelayed(new Runnable() {
                                public final void run() {
                                    long j;
                                    e.f19368d.set((SystemClock.uptimeMillis() - e.f19370f) / e.f19369e);
                                    long uptimeMillis = (SystemClock.uptimeMillis() - e.f19370f) % e.f19369e;
                                    if (uptimeMillis >= 95) {
                                        e.f19368d.incrementAndGet();
                                        j = (e.f19369e << 1) - uptimeMillis;
                                    } else {
                                        j = e.f19369e - uptimeMillis;
                                    }
                                    e.j.postDelayed(this, j);
                                }
                            }, e.f19369e);
                        }
                        e.p = e.f19368d.get();
                        if (e.q != -1) {
                            long j = e.p - e.q;
                            if (j <= 0) {
                                e.k++;
                                return;
                            }
                            if (j == 1) {
                                if (e.k > 1) {
                                    i = 7;
                                } else if (e.k == 1) {
                                    i = 3;
                                } else {
                                    i = 0;
                                }
                            } else if (e.k > 1) {
                                i = 5;
                            } else if (e.k == 1) {
                                i = 6;
                            } else {
                                i = 1;
                            }
                            long d2 = e.d();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (!e.n) {
                                e.a(e.a(), d2 - e.h, uptimeMillis - e.i, j, i, e.k, null);
                            }
                            e.h = d2;
                            e.i = uptimeMillis;
                            e.k = 1;
                        }
                    }
                }
            });
            f.a().a((Printer) new Printer() {
                public final void println(String str) {
                    int i;
                    e.q = e.f19368d.get();
                    if (e.p > 0) {
                        long j = e.q - e.p;
                        if (j > 0) {
                            long d2 = e.d();
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (j == 1 && e.k > 1) {
                                i = 9;
                            } else if (j == 1 && e.k == 1) {
                                i = 2;
                            } else if (j > 1 && e.k > 1) {
                                i = 4;
                            } else if (j <= 1 || e.k != 1) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            if (!e.n) {
                                e.a(e.a(), d2 - e.h, uptimeMillis - e.i, j, i, e.k, str);
                            }
                            e.h = d2;
                            e.i = uptimeMillis;
                            e.k = 0;
                            e.p = -1;
                        }
                    }
                }
            });
            e.h = e.d();
            e.i = SystemClock.uptimeMillis();
            e.a(e.c());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[EDGE_INSN: B:15:0x0028->B:13:0x0028 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000b A[Catch:{ Throwable -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] a(java.io.BufferedReader r7, java.util.regex.Pattern... r8) throws java.io.IOException {
        /*
            int r0 = r8.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            java.lang.String r0 = r7.readLine()     // Catch:{ Throwable -> 0x0028 }
            if (r0 == 0) goto L_0x0028
            int r2 = r8.length     // Catch:{ Throwable -> 0x0028 }
            r3 = 0
            r4 = 0
        L_0x000e:
            if (r4 >= r2) goto L_0x0005
            r5 = r8[r4]     // Catch:{ Throwable -> 0x0028 }
            java.util.regex.Matcher r6 = r5.matcher(r0)     // Catch:{ Throwable -> 0x0028 }
            boolean r6 = r6.matches()     // Catch:{ Throwable -> 0x0028 }
            if (r6 == 0) goto L_0x0025
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0028 }
            r7[r3] = r5     // Catch:{ Throwable -> 0x0028 }
            r8 = 1
            r7[r8] = r0     // Catch:{ Throwable -> 0x0028 }
            return r7
        L_0x0025:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.b.a(java.io.BufferedReader, java.util.regex.Pattern[]):java.lang.Object[]");
    }

    private JSONObject a(String str, int i, String str2) {
        BufferedReader bufferedReader;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                Pattern compile = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
                Pattern compile2 = Pattern.compile("-{5}\\send\\s\\d+\\s-{5}");
                Pattern compile3 = Pattern.compile("Cmd\\sline:\\s(\\S+)");
                Pattern compile4 = Pattern.compile("\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                boolean z = false;
                Object[] a2 = a(bufferedReader, compile);
                if (a2 == null) {
                    com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                    return null;
                }
                long parseLong = Long.parseLong(a2[1].toString().split("\\s")[2]);
                long time = simpleDateFormat.parse(a2[1].toString().split("\\s")[4] + " " + a2[1].toString().split("\\s")[5]).getTime();
                Object[] a3 = a(bufferedReader, compile3);
                if (a3 == null) {
                    com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                    return null;
                }
                String str3 = a3[1].toString().split("\\s")[2];
                if (parseLong == ((long) i)) {
                    if (str3.equalsIgnoreCase(str2)) {
                        if (this.f19357f == 0 || Math.abs(this.f19357f - time) >= 20000) {
                            this.f19357f = time;
                            if (this.g != null) {
                                this.g.edit().putLong("trace_anr_happen_time", this.f19357f).apply();
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("anrTime", time);
                            while (true) {
                                Object[] a4 = a(bufferedReader, compile2, compile4);
                                if (a4 == null || a4[0] != compile4) {
                                    break;
                                }
                                String str4 = "";
                                Matcher matcher = Pattern.compile("\".+\"").matcher(a4[1].toString());
                                if (matcher.find()) {
                                    str4 = matcher.group().substring(1, matcher.group().length() - 1);
                                }
                                Matcher matcher2 = Pattern.compile("tid=\\d+").matcher(a4[1].toString());
                                if (matcher2.find()) {
                                    String group = matcher2.group();
                                    i2 = Integer.parseInt(group.substring(group.indexOf("=") + 1));
                                } else {
                                    i2 = -1;
                                }
                                String a5 = a(bufferedReader);
                                if (i2 != -1 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(a5) && str4.equalsIgnoreCase("main")) {
                                    jSONObject.put("mainStackFromTrace", a5);
                                    z = true;
                                    break;
                                }
                            }
                            if (!z) {
                                com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                                return null;
                            }
                            jSONObject.put("thread_number", 1);
                            com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                            return jSONObject;
                        }
                        com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                        return null;
                    }
                }
                com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                return null;
            } catch (Exception unused) {
                com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th) {
                th = th;
                com.bytedance.crash.i.f.a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            com.bytedance.crash.i.f.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            com.bytedance.crash.i.f.a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|(3:30|31|(1:33))|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0122, code lost:
        if (r10.length() > 0) goto L_0x0126;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x01fe */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            org.json.JSONArray r0 = com.bytedance.crash.b.e.b()
            long r1 = android.os.SystemClock.uptimeMillis()
            org.json.JSONObject r3 = com.bytedance.crash.b.e.e()
            r4 = 100
            org.json.JSONArray r1 = com.bytedance.crash.b.e.a((int) r4, (long) r1)
            r2 = 0
            r4 = 1
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch:{ JSONException -> 0x0034 }
            java.lang.Thread r5 = r5.getThread()     // Catch:{ JSONException -> 0x0034 }
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ JSONException -> 0x0034 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0034 }
            r6.<init>()     // Catch:{ JSONException -> 0x0034 }
            java.lang.String r7 = "thread_number"
            r6.put(r7, r4)     // Catch:{ JSONException -> 0x0034 }
            java.lang.String r7 = "mainStackFromTrace"
            java.lang.String r5 = com.bytedance.crash.i.m.a((java.lang.StackTraceElement[]) r5)     // Catch:{ JSONException -> 0x0034 }
            r6.put(r7, r5)     // Catch:{ JSONException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r6 = r2
        L_0x0035:
            android.content.Context r5 = r9.f19356e
            android.app.ActivityManager$ProcessErrorStateInfo r12 = com.bytedance.crash.i.a.a((android.content.Context) r5, (int) r12)
            if (r12 == 0) goto L_0x0101
            int r5 = android.os.Process.myPid()
            int r7 = r12.pid
            if (r5 != r7) goto L_0x0101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "|------------- processErrorStateInfo--------------|\n"
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "condition: "
            r7.<init>(r8)
            int r8 = r12.condition
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "processName: "
            r7.<init>(r8)
            java.lang.String r8 = r12.processName
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "pid: "
            r7.<init>(r8)
            int r8 = r12.pid
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "uid: "
            r7.<init>(r8)
            int r8 = r12.uid
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "tag: "
            r7.<init>(r8)
            java.lang.String r8 = r12.tag
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "shortMsg : "
            r7.<init>(r8)
            java.lang.String r8 = r12.shortMsg
            r7.append(r8)
            java.lang.String r8 = "\n"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r5.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "longMsg : "
            r7.<init>(r8)
            java.lang.String r12 = r12.longMsg
            r7.append(r12)
            java.lang.String r12 = "\n"
            r7.append(r12)
            java.lang.String r12 = r7.toString()
            r5.append(r12)
            java.lang.String r12 = "-----------------------end----------------------------"
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            goto L_0x0102
        L_0x0101:
            r12 = r2
        L_0x0102:
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            r7 = 0
            if (r5 == 0) goto L_0x010a
            return r7
        L_0x010a:
            r5 = 200(0xc8, float:2.8E-43)
            if (r10 != r5) goto L_0x0125
            int r10 = android.os.Process.myPid()
            android.content.Context r5 = r9.f19356e
            java.lang.String r5 = r5.getPackageName()
            org.json.JSONObject r10 = r9.a((java.lang.String) r11, (int) r10, (java.lang.String) r5)
            if (r10 == 0) goto L_0x0125
            int r11 = r10.length()
            if (r11 <= 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r10 = r6
        L_0x0126:
            if (r10 == 0) goto L_0x0201
            int r11 = r10.length()
            if (r11 <= 0) goto L_0x0201
            java.lang.String r11 = "pid"
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0201 }
            r10.put(r11, r5)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r11 = "package"
            android.content.Context r5 = r9.f19356e     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ Throwable -> 0x0201 }
            r10.put(r11, r5)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r11 = "is_remote_process"
            r10.put(r11, r7)     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.e.a r11 = new com.bytedance.crash.e.a     // Catch:{ Throwable -> 0x0201 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0201 }
            r5.<init>()     // Catch:{ Throwable -> 0x0201 }
            r11.<init>(r5)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r5 = "data"
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x0201 }
            r11.a((java.lang.String) r5, (java.lang.Object) r10)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "is_anr"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0201 }
            r11.a((java.lang.String) r10, (java.lang.Object) r5)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "history_message"
            r11.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "current_message"
            r11.a((java.lang.String) r10, (java.lang.Object) r3)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "pending_messages"
            r11.a((java.lang.String) r10, (java.lang.Object) r1)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "anr_time"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0201 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0201 }
            r11.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "crash_time"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0201 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Throwable -> 0x0201 }
            r11.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "anr_info"
            r11.a((java.lang.String) r10, (java.lang.Object) r12)     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r10 = "all_thread_stacks"
            org.json.JSONObject r0 = com.bytedance.crash.i.m.a((java.lang.String) r2)     // Catch:{ Throwable -> 0x0201 }
            r11.a((java.lang.String) r10, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.runtime.assembly.e r10 = com.bytedance.crash.runtime.assembly.e.a()     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.d r0 = com.bytedance.crash.d.ANR     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.e.a r10 = r10.a(r0, r11)     // Catch:{ Throwable -> 0x0201 }
            android.content.Context r11 = r9.f19356e     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.d r0 = com.bytedance.crash.d.ANR     // Catch:{ Throwable -> 0x0201 }
            java.lang.String r0 = r0.getName()     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.i.d.a((android.content.Context) r11, (java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0201 }
            com.bytedance.crash.upload.a r11 = com.bytedance.crash.upload.a.a()     // Catch:{ Throwable -> 0x0201 }
            org.json.JSONObject r10 = r10.f19417a     // Catch:{ Throwable -> 0x0201 }
            if (r10 == 0) goto L_0x01fe
            int r0 = r10.length()     // Catch:{ Throwable -> 0x0201 }
            if (r0 > 0) goto L_0x01be
            goto L_0x01fe
        L_0x01be:
            com.bytedance.crash.runtime.a r0 = com.bytedance.crash.j.a()     // Catch:{ Throwable -> 0x01fe }
            java.util.Map r0 = r0.a()     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r0 = com.bytedance.crash.upload.b.a((java.util.Map) r0)     // Catch:{ Throwable -> 0x01fe }
            android.content.Context r11 = r11.f19560a     // Catch:{ Throwable -> 0x01fe }
            java.io.File r11 = com.bytedance.crash.i.h.a(r11)     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r1 = "anr_%s.npth"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x01fe }
            long r5 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x01fe }
            r2[r7] = r3     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r11 = com.bytedance.crash.i.d.a(r11, r1, r0, r10, r4)     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r1 = "upload_scene"
            java.lang.String r2 = "direct"
            r10.put(r1, r2)     // Catch:{ Throwable -> 0x01fe }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x01fe }
            com.bytedance.crash.upload.h r10 = com.bytedance.crash.upload.b.b(r0, r10)     // Catch:{ Throwable -> 0x01fe }
            boolean r10 = r10.a()     // Catch:{ Throwable -> 0x01fe }
            if (r10 == 0) goto L_0x01fe
            com.bytedance.crash.i.d.a((java.lang.String) r11)     // Catch:{ Throwable -> 0x01fe }
        L_0x01fe:
            a((java.lang.String) r12)     // Catch:{ Throwable -> 0x0201 }
        L_0x0201:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.b.b.a(int, java.lang.String, int):boolean");
    }
}
