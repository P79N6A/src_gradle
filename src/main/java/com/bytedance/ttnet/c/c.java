package com.bytedance.ttnet.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.c.a.a;
import java.util.HashMap;

public final class c implements a {

    /* renamed from: e  reason: collision with root package name */
    private static c f22568e;

    /* renamed from: a  reason: collision with root package name */
    long f22569a;

    /* renamed from: b  reason: collision with root package name */
    Context f22570b;

    /* renamed from: c  reason: collision with root package name */
    public b f22571c;

    /* renamed from: d  reason: collision with root package name */
    Handler f22572d = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            boolean z;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                c cVar = c.this;
                a b2 = cVar.b();
                if (b2 != null) {
                    Logger.debug();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (z || cVar.f22569a + (((long) b2.k) * 1000) <= elapsedRealtime) {
                        cVar.f22569a = elapsedRealtime;
                        com.bytedance.ttnet.config.a.a(cVar.f22570b).b(NetworkUtils.isNetworkAvailable(cVar.f22570b));
                    } else {
                        Logger.debug();
                    }
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private boolean f22573f;
    private int g;
    private long h;
    private int i;
    private HashMap<String, Integer> j = new HashMap<>();
    private HashMap<String, Integer> k = new HashMap<>();
    private int l = 0;
    private HashMap<String, Integer> m = new HashMap<>();
    private HashMap<String, Integer> n = new HashMap<>();
    private boolean o = true;

    public final a b() {
        if (this.f22571c != null) {
            return this.f22571c.f22566b;
        }
        return null;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f22568e == null) {
                f22568e = new c();
            }
            cVar = f22568e;
        }
        return cVar;
    }

    private void c() {
        Logger.debug();
        this.i = 0;
        this.j.clear();
        this.k.clear();
        this.l = 0;
        this.m.clear();
        this.n.clear();
    }

    private c() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "/get_domains/v4"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0018
            goto L_0x00a2
        L_0x0018:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x0027 }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x0027 }
            java.lang.String r2 = r1.getProtocol()     // Catch:{ Throwable -> 0x0027 }
            java.lang.String r1 = r1.getHost()     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0029
        L_0x0027:
            r2 = r0
        L_0x0028:
            r1 = r0
        L_0x0029:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00a1
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x003f
            java.lang.String r3 = "https"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00a1
        L_0x003f:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0046
            goto L_0x00a1
        L_0x0046:
            com.bytedance.ttnet.c.a r3 = r5.b()
            if (r3 == 0) goto L_0x004e
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f22562d
        L_0x004e:
            if (r0 == 0) goto L_0x009d
            boolean r3 = r0.containsKey(r1)
            if (r3 != 0) goto L_0x0057
            goto L_0x009d
        L_0x0057:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0064
            return r6
        L_0x0064:
            com.bytedance.common.utility.Logger.debug()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r4 = "://"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "://"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r2 = r6.startsWith(r1)
            if (r2 == 0) goto L_0x0099
            java.lang.String r6 = r6.replaceFirst(r1, r0)
        L_0x0099:
            com.bytedance.common.utility.Logger.debug()
            return r6
        L_0x009d:
            com.bytedance.common.utility.Logger.debug()
            return r6
        L_0x00a1:
            return r6
        L_0x00a2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.c.c.a(java.lang.String):java.lang.String");
    }

    private void a(boolean z, long j2) {
        if (!this.f22572d.hasMessages(10000)) {
            Message obtainMessage = this.f22572d.obtainMessage();
            obtainMessage.what = 10000;
            obtainMessage.arg1 = z ? 1 : 0;
            if (j2 > 0) {
                this.f22572d.sendMessageDelayed(obtainMessage, j2);
            } else {
                this.f22572d.sendMessage(obtainMessage);
            }
        }
    }

    public final synchronized void a(Context context, boolean z) {
        if (!this.f22573f) {
            this.f22570b = context;
            this.o = z;
            this.f22571c = new b(context, z);
            if (z) {
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.f22570b, "ttnet_tnc_config", 0);
                this.g = a2.getInt("tnc_probe_cmd", 0);
                this.h = a2.getLong("tnc_probe_version", 0);
            }
            Logger.debug();
            this.f22573f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(okhttp3.Request r6, java.lang.Exception r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r5)
            return
        L_0x0005:
            boolean r0 = r5.o     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            android.content.Context r0 = r5.f22570b     // Catch:{ all -> 0x00e0 }
            boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r5)
            return
        L_0x0015:
            okhttp3.HttpUrl r0 = r6.url()     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r0.scheme()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r0.host()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.encodedPath()     // Catch:{ all -> 0x00e0 }
            java.lang.String r6 = r6.getIpAddrStr()     // Catch:{ all -> 0x00e0 }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ all -> 0x00e0 }
            r3.<init>()     // Catch:{ all -> 0x00e0 }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ all -> 0x00e0 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e0 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r7, (java.io.PrintWriter) r4)     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x00e0 }
            if (r3 != 0) goto L_0x0050
            java.lang.String r3 = "https"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0050
            monitor-exit(r5)
            return
        L_0x0050:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0058
            monitor-exit(r5)
            return
        L_0x0058:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x00de
            java.lang.String r1 = "timeout"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = "time out"
            boolean r1 = r7.contains(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = "unreachable"
            boolean r7 = r7.contains(r1)     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x0077
            goto L_0x00de
        L_0x0077:
            com.bytedance.ttnet.c.a r7 = r5.b()     // Catch:{ all -> 0x00e0 }
            if (r7 == 0) goto L_0x00dc
            boolean r1 = r7.f22559a     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0082
            goto L_0x00dc
        L_0x0082:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f22561c     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x00da
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f22561c     // Catch:{ all -> 0x00e0 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e0 }
            if (r1 <= 0) goto L_0x00da
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r7.f22561c     // Catch:{ all -> 0x00e0 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x00e0 }
            if (r1 != 0) goto L_0x0097
            goto L_0x00da
        L_0x0097:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00e0 }
            int r1 = r5.i     // Catch:{ all -> 0x00e0 }
            int r1 = r1 + 1
            r5.i = r1     // Catch:{ all -> 0x00e0 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.j     // Catch:{ all -> 0x00e0 }
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e0 }
            r1.put(r0, r3)     // Catch:{ all -> 0x00e0 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.k     // Catch:{ all -> 0x00e0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00e0 }
            r0.put(r6, r1)     // Catch:{ all -> 0x00e0 }
            int r6 = r5.i     // Catch:{ all -> 0x00e0 }
            int r0 = r7.f22563e     // Catch:{ all -> 0x00e0 }
            if (r6 < r0) goto L_0x00d8
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.j     // Catch:{ all -> 0x00e0 }
            int r6 = r6.size()     // Catch:{ all -> 0x00e0 }
            int r0 = r7.f22564f     // Catch:{ all -> 0x00e0 }
            if (r6 < r0) goto L_0x00d8
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.k     // Catch:{ all -> 0x00e0 }
            int r6 = r6.size()     // Catch:{ all -> 0x00e0 }
            int r7 = r7.g     // Catch:{ all -> 0x00e0 }
            if (r6 < r7) goto L_0x00d8
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00e0 }
            r6 = 0
            r5.a((boolean) r2, (long) r6)     // Catch:{ all -> 0x00e0 }
            r5.c()     // Catch:{ all -> 0x00e0 }
        L_0x00d8:
            monitor-exit(r5)
            return
        L_0x00da:
            monitor-exit(r5)
            return
        L_0x00dc:
            monitor-exit(r5)
            return
        L_0x00de:
            monitor-exit(r5)
            return
        L_0x00e0:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.c.c.a(okhttp3.Request, java.lang.Exception):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x019a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x019c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x019e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.bytedance.common.utility.Logger.debug();
        r9 = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0095 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(okhttp3.Request r14, okhttp3.Response r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            if (r14 == 0) goto L_0x01a2
            if (r15 != 0) goto L_0x0007
            goto L_0x01a2
        L_0x0007:
            boolean r0 = r13.o     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r13)
            return
        L_0x000d:
            android.content.Context r0 = r13.f22570b     // Catch:{ all -> 0x019f }
            boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r13)
            return
        L_0x0017:
            okhttp3.HttpUrl r0 = r14.url()     // Catch:{ all -> 0x019f }
            java.lang.String r1 = r0.scheme()     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r0.host()     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r0.encodedPath()     // Catch:{ all -> 0x019f }
            java.lang.String r14 = r14.getIpAddrStr()     // Catch:{ all -> 0x019f }
            int r3 = r15.code()     // Catch:{ all -> 0x019f }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x019f }
            if (r4 != 0) goto L_0x0041
            java.lang.String r4 = "https"
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x019f }
            if (r1 != 0) goto L_0x0041
            monitor-exit(r13)
            return
        L_0x0041:
            boolean r1 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x019f }
            if (r1 == 0) goto L_0x0049
            monitor-exit(r13)
            return
        L_0x0049:
            okhttp3.Response r1 = r15.networkResponse()     // Catch:{ all -> 0x019f }
            if (r1 != 0) goto L_0x0051
            monitor-exit(r13)
            return
        L_0x0051:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            com.bytedance.ttnet.c.a r1 = r13.b()     // Catch:{ all -> 0x019f }
            r4 = 0
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L_0x00f1
            boolean r8 = r1.f22560b     // Catch:{ all -> 0x019f }
            if (r8 == 0) goto L_0x00f1
            if (r15 == 0) goto L_0x00f1
            boolean r8 = r13.o     // Catch:{ all -> 0x019f }
            if (r8 == 0) goto L_0x00f1
            java.lang.String r8 = "tt-idc-switch"
            r9 = 0
            java.lang.String r15 = r15.header(r8, r9)     // Catch:{ all -> 0x019f }
            boolean r8 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x019f }
            if (r8 == 0) goto L_0x007a
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            goto L_0x00f1
        L_0x007a:
            java.lang.String r8 = "@"
            java.lang.String[] r15 = r15.split(r8)     // Catch:{ all -> 0x019f }
            if (r15 == 0) goto L_0x00ee
            int r8 = r15.length     // Catch:{ all -> 0x019f }
            r9 = 2
            if (r8 == r9) goto L_0x0087
            goto L_0x00ee
        L_0x0087:
            r8 = r15[r7]     // Catch:{ Throwable -> 0x0094 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Throwable -> 0x0094 }
            r15 = r15[r6]     // Catch:{ Throwable -> 0x0095 }
            long r9 = java.lang.Long.parseLong(r15)     // Catch:{ Throwable -> 0x0095 }
            goto L_0x0099
        L_0x0094:
            r8 = 0
        L_0x0095:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            r9 = r4
        L_0x0099:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            long r11 = r13.h     // Catch:{ all -> 0x019f }
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f1
            r13.g = r8     // Catch:{ all -> 0x019f }
            r13.h = r9     // Catch:{ all -> 0x019f }
            android.content.Context r15 = r13.f22570b     // Catch:{ all -> 0x019f }
            java.lang.String r11 = "ttnet_tnc_config"
            android.content.SharedPreferences r15 = com.ss.android.ugc.aweme.q.c.a(r15, r11, r7)     // Catch:{ all -> 0x019f }
            android.content.SharedPreferences$Editor r15 = r15.edit()     // Catch:{ all -> 0x019f }
            java.lang.String r11 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r15 = r15.putInt(r11, r8)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r15 = r15.putLong(r8, r9)     // Catch:{ all -> 0x019f }
            r15.apply()     // Catch:{ all -> 0x019f }
            int r15 = r13.g     // Catch:{ all -> 0x019f }
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r15 != r8) goto L_0x00f1
            com.bytedance.ttnet.c.a r15 = r13.b()     // Catch:{ all -> 0x019f }
            if (r15 == 0) goto L_0x00f1
            java.util.Random r8 = new java.util.Random     // Catch:{ all -> 0x019f }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x019f }
            r8.<init>(r9)     // Catch:{ all -> 0x019f }
            int r9 = r15.l     // Catch:{ all -> 0x019f }
            if (r9 <= 0) goto L_0x00e6
            int r15 = r15.l     // Catch:{ all -> 0x019f }
            int r15 = r8.nextInt(r15)     // Catch:{ all -> 0x019f }
            long r8 = (long) r15     // Catch:{ all -> 0x019f }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            goto L_0x00e7
        L_0x00e6:
            r8 = r4
        L_0x00e7:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            r13.a((boolean) r6, (long) r8)     // Catch:{ all -> 0x019f }
            goto L_0x00f1
        L_0x00ee:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
        L_0x00f1:
            if (r1 == 0) goto L_0x019d
            boolean r15 = r1.f22559a     // Catch:{ all -> 0x019f }
            if (r15 != 0) goto L_0x00f9
            goto L_0x019d
        L_0x00f9:
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f22561c     // Catch:{ all -> 0x019f }
            if (r15 == 0) goto L_0x019b
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f22561c     // Catch:{ all -> 0x019f }
            int r15 = r15.size()     // Catch:{ all -> 0x019f }
            if (r15 <= 0) goto L_0x019b
            java.util.Map<java.lang.String, java.lang.Integer> r15 = r1.f22561c     // Catch:{ all -> 0x019f }
            boolean r15 = r15.containsKey(r2)     // Catch:{ all -> 0x019f }
            if (r15 != 0) goto L_0x010f
            goto L_0x019b
        L_0x010f:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            if (r3 <= 0) goto L_0x0199
            r15 = 200(0xc8, float:2.8E-43)
            if (r3 < r15) goto L_0x011e
            r15 = 400(0x190, float:5.6E-43)
            if (r3 >= r15) goto L_0x011e
            r15 = 1
            goto L_0x011f
        L_0x011e:
            r15 = 0
        L_0x011f:
            if (r15 == 0) goto L_0x012e
            int r14 = r13.i     // Catch:{ all -> 0x019f }
            if (r14 > 0) goto L_0x0129
            int r14 = r13.l     // Catch:{ all -> 0x019f }
            if (r14 <= 0) goto L_0x0199
        L_0x0129:
            r13.c()     // Catch:{ all -> 0x019f }
            monitor-exit(r13)
            return
        L_0x012e:
            r15 = 100
            if (r3 < r15) goto L_0x015c
            r15 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r15) goto L_0x0137
            goto L_0x015c
        L_0x0137:
            com.bytedance.ttnet.c.a r15 = r13.b()     // Catch:{ all -> 0x019f }
            if (r15 == 0) goto L_0x015a
            java.lang.String r2 = r15.m     // Catch:{ all -> 0x019f }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x019f }
            if (r2 != 0) goto L_0x015a
            java.lang.String r15 = r15.m     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r2.<init>()     // Catch:{ all -> 0x019f }
            r2.append(r3)     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x019f }
            boolean r15 = r15.contains(r2)     // Catch:{ all -> 0x019f }
            if (r15 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r15 = 0
            goto L_0x015d
        L_0x015c:
            r15 = 1
        L_0x015d:
            if (r15 != 0) goto L_0x0199
            int r15 = r13.l     // Catch:{ all -> 0x019f }
            int r15 = r15 + r6
            r13.l = r15     // Catch:{ all -> 0x019f }
            java.util.HashMap<java.lang.String, java.lang.Integer> r15 = r13.m     // Catch:{ all -> 0x019f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x019f }
            r15.put(r0, r2)     // Catch:{ all -> 0x019f }
            java.util.HashMap<java.lang.String, java.lang.Integer> r15 = r13.n     // Catch:{ all -> 0x019f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x019f }
            r15.put(r14, r0)     // Catch:{ all -> 0x019f }
            int r14 = r13.l     // Catch:{ all -> 0x019f }
            int r15 = r1.h     // Catch:{ all -> 0x019f }
            if (r14 < r15) goto L_0x0199
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r13.m     // Catch:{ all -> 0x019f }
            int r14 = r14.size()     // Catch:{ all -> 0x019f }
            int r15 = r1.i     // Catch:{ all -> 0x019f }
            if (r14 < r15) goto L_0x0199
            java.util.HashMap<java.lang.String, java.lang.Integer> r14 = r13.n     // Catch:{ all -> 0x019f }
            int r14 = r14.size()     // Catch:{ all -> 0x019f }
            int r15 = r1.j     // Catch:{ all -> 0x019f }
            if (r14 < r15) goto L_0x0199
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x019f }
            r13.a((boolean) r7, (long) r4)     // Catch:{ all -> 0x019f }
            r13.c()     // Catch:{ all -> 0x019f }
        L_0x0199:
            monitor-exit(r13)
            return
        L_0x019b:
            monitor-exit(r13)
            return
        L_0x019d:
            monitor-exit(r13)
            return
        L_0x019f:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x01a2:
            monitor-exit(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.c.c.a(okhttp3.Request, okhttp3.Response):void");
    }
}
