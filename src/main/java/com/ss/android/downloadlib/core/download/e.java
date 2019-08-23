package com.ss.android.downloadlib.core.download;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.a.a;
import com.ss.android.download.api.b.a.b;
import com.ss.android.downloadlib.c.g;
import com.ss.android.downloadlib.core.download.f;
import com.ss.android.downloadlib.core.download.j;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"UseSparseArrays"})
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f28981b = new Object();
    private static e i;
    private static NotificationChannel l = null;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f28982a = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final g f28983c = new g();

    /* renamed from: d  reason: collision with root package name */
    private Map<Long, WeakHashMap<b, Boolean>> f28984d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<Long, String> f28985e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map<Long, com.ss.android.download.api.c.e> f28986f = new ConcurrentHashMap();
    private final Context g;
    private final NotificationManager h;
    private final HashMap<String, Long> j = new HashMap<>();
    private final g k = new g();

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 3;
    }

    private static boolean b(int i2) {
        return i2 == 1 || i2 == 0;
    }

    public final e a(Long l2, b bVar) {
        WeakHashMap weakHashMap = this.f28984d.get(l2);
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.f28984d.put(l2, weakHashMap);
        }
        if (bVar != null) {
            bVar.a(l2.longValue());
            weakHashMap.put(bVar, Boolean.TRUE);
            this.f28986f.put(l2, new com.ss.android.download.api.c.e());
        }
        return this;
    }

    public final e a(Long l2, String str, int i2, String str2, boolean z, long j2) {
        if (!TextUtils.isEmpty(str)) {
            if (i2 >= 0) {
                StringBuilder sb = new StringBuilder(str);
                sb.append("##");
                sb.append(i2);
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("##");
                    sb.append(str2);
                    sb.append("##");
                    sb.append(z ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
                    sb.append("##");
                    sb.append(j2);
                }
                this.f28985e.put(l2, sb.toString());
            } else {
                this.f28985e.put(l2, str);
            }
        }
        return this;
    }

    public final String a(long j2) {
        if (this.f28985e != null) {
            return this.f28985e.get(Long.valueOf(j2));
        }
        return null;
    }

    public final void a() {
        synchronized (f28981b) {
            Iterator<String> it2 = this.f28982a.iterator();
            while (it2.hasNext()) {
                this.h.cancel(it2.next(), 0);
                it2.remove();
            }
        }
    }

    public final void a(long j2, long j3) {
        synchronized (this.f28983c) {
            if (j3 != 0) {
                try {
                    this.f28983c.a(j2, j3);
                    this.k.a(j2, SystemClock.elapsedRealtime());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f28983c.a(j2);
                this.k.a(j2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r14 = new android.support.v4.app.NotificationCompat.Builder(r1.g);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b4 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a2 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b9 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0346 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0539 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4 A[Catch:{ all -> 0x02a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection<com.ss.android.downloadlib.core.download.c> r34) {
        /*
            r33 = this;
            r1 = r33
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r1.j
            monitor-enter(r2)
            android.content.Context r0 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x059d }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x059d }
            r3.<init>()     // Catch:{ all -> 0x059d }
            java.util.Iterator r4 = r34.iterator()     // Catch:{ all -> 0x059d }
        L_0x0014:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x059d }
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            if (r5 == 0) goto L_0x006e
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x059d }
            com.ss.android.downloadlib.core.download.c r5 = (com.ss.android.downloadlib.core.download.c) r5     // Catch:{ all -> 0x059d }
            java.lang.String r11 = b((com.ss.android.downloadlib.core.download.c) r5)     // Catch:{ all -> 0x059d }
            if (r11 == 0) goto L_0x002e
            r3.put(r11, r5)     // Catch:{ all -> 0x059d }
        L_0x002e:
            int r11 = r5.j     // Catch:{ all -> 0x059d }
            r12 = 192(0xc0, float:2.69E-43)
            if (r11 != r12) goto L_0x0038
            r1.a((com.ss.android.downloadlib.core.download.c) r5, (int) r10, (long) r8)     // Catch:{ all -> 0x059d }
            goto L_0x0014
        L_0x0038:
            int r10 = r5.j     // Catch:{ all -> 0x059d }
            r11 = 196(0xc4, float:2.75E-43)
            if (r10 == r11) goto L_0x006a
            int r10 = r5.j     // Catch:{ all -> 0x059d }
            r11 = 193(0xc1, float:2.7E-43)
            if (r10 == r11) goto L_0x006a
            int r10 = r5.j     // Catch:{ all -> 0x059d }
            r11 = 194(0xc2, float:2.72E-43)
            if (r10 == r11) goto L_0x006a
            int r10 = r5.j     // Catch:{ all -> 0x059d }
            r11 = 195(0xc3, float:2.73E-43)
            if (r10 != r11) goto L_0x0051
            goto L_0x006a
        L_0x0051:
            int r7 = r5.j     // Catch:{ all -> 0x059d }
            boolean r7 = com.ss.android.download.api.a.a.C0337a.b(r7)     // Catch:{ all -> 0x059d }
            if (r7 == 0) goto L_0x005e
            r6 = 4
            r1.a((com.ss.android.downloadlib.core.download.c) r5, (int) r6, (long) r8)     // Catch:{ all -> 0x059d }
            goto L_0x0014
        L_0x005e:
            int r7 = r5.j     // Catch:{ all -> 0x059d }
            boolean r7 = com.ss.android.download.api.a.a.C0337a.a(r7)     // Catch:{ all -> 0x059d }
            if (r7 == 0) goto L_0x0014
            r1.a((com.ss.android.downloadlib.core.download.c) r5, (int) r6, (long) r8)     // Catch:{ all -> 0x059d }
            goto L_0x0014
        L_0x006a:
            r1.a((com.ss.android.downloadlib.core.download.c) r5, (int) r7, (long) r8)     // Catch:{ all -> 0x059d }
            goto L_0x0014
        L_0x006e:
            java.util.Set r4 = r3.keySet()     // Catch:{ all -> 0x059d }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x059d }
        L_0x0076:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x059d }
            r11 = 0
            if (r5 == 0) goto L_0x055c
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x059d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x059d }
            r12 = 58
            int r12 = r5.indexOf(r12)     // Catch:{ all -> 0x059d }
            java.lang.String r12 = r5.substring(r11, r12)     // Catch:{ all -> 0x059d }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ all -> 0x059d }
            java.lang.Object r13 = r3.get(r5)     // Catch:{ all -> 0x059d }
            com.ss.android.downloadlib.core.download.c r13 = (com.ss.android.downloadlib.core.download.c) r13     // Catch:{ all -> 0x059d }
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059d }
            r15 = 26
            if (r14 >= r15) goto L_0x00a5
            android.support.v4.app.NotificationCompat$Builder r14 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ all -> 0x059d }
            android.content.Context r15 = r1.g     // Catch:{ all -> 0x059d }
            r14.<init>(r15)     // Catch:{ all -> 0x059d }
            goto L_0x00bb
        L_0x00a5:
            android.content.Context r14 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.String r14 = b((android.content.Context) r14)     // Catch:{ all -> 0x059d }
            android.support.v4.app.NotificationCompat$Builder r15 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ NoSuchMethodError -> 0x00b4 }
            android.content.Context r8 = r1.g     // Catch:{ NoSuchMethodError -> 0x00b4 }
            r15.<init>(r8, r14)     // Catch:{ NoSuchMethodError -> 0x00b4 }
            r14 = r15
            goto L_0x00bb
        L_0x00b4:
            android.support.v4.app.NotificationCompat$Builder r14 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ all -> 0x059d }
            android.content.Context r8 = r1.g     // Catch:{ all -> 0x059d }
            r14.<init>(r8)     // Catch:{ all -> 0x059d }
        L_0x00bb:
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = r1.j     // Catch:{ all -> 0x059d }
            boolean r8 = r8.containsKey(r5)     // Catch:{ all -> 0x059d }
            if (r8 == 0) goto L_0x00d0
            java.util.HashMap<java.lang.String, java.lang.Long> r8 = r1.j     // Catch:{ all -> 0x059d }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x059d }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x059d }
            long r8 = r8.longValue()     // Catch:{ all -> 0x059d }
            goto L_0x00dd
        L_0x00d0:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x059d }
            java.util.HashMap<java.lang.String, java.lang.Long> r15 = r1.j     // Catch:{ all -> 0x059d }
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x059d }
            r15.put(r5, r11)     // Catch:{ all -> 0x059d }
        L_0x00dd:
            if (r12 != r10) goto L_0x00e3
            r11 = 17301633(0x1080081, float:2.4979616E-38)
            goto L_0x00f0
        L_0x00e3:
            if (r12 != r7) goto L_0x00e9
            r11 = 17301642(0x108008a, float:2.4979642E-38)
            goto L_0x00f0
        L_0x00e9:
            if (r12 != r6) goto L_0x00ef
            r11 = 17301634(0x1080082, float:2.497962E-38)
            goto L_0x00f0
        L_0x00ef:
            r11 = 0
        L_0x00f0:
            r15 = 134217728(0x8000000, float:3.85186E-34)
            if (r12 == r10) goto L_0x015b
            if (r12 != r7) goto L_0x00f7
            goto L_0x015b
        L_0x00f7:
            if (r12 != r6) goto L_0x0158
            android.net.Uri r6 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ all -> 0x059d }
            r19 = r8
            long r7 = r13.f28942a     // Catch:{ all -> 0x059d }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r7)     // Catch:{ all -> 0x059d }
            r14.setAutoCancel(r10)     // Catch:{ all -> 0x059d }
            int r7 = r13.j     // Catch:{ all -> 0x059d }
            boolean r7 = com.ss.android.download.api.a.a.C0337a.b(r7)     // Catch:{ all -> 0x059d }
            if (r7 != 0) goto L_0x0118
            boolean r7 = c(r13)     // Catch:{ all -> 0x059d }
            if (r7 == 0) goto L_0x0115
            goto L_0x0118
        L_0x0115:
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_OPEN"
            goto L_0x011a
        L_0x0118:
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_DELETE"
        L_0x011a:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ all -> 0x059d }
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadHandlerService> r10 = com.ss.android.downloadlib.core.download.DownloadHandlerService.class
            r8.<init>(r7, r6, r9, r10)     // Catch:{ all -> 0x059d }
            java.lang.String r7 = "status"
            int r9 = r13.j     // Catch:{ all -> 0x059d }
            r8.putExtra(r7, r9)     // Catch:{ all -> 0x059d }
            java.lang.String r7 = "time_cost"
            long r9 = r13.D     // Catch:{ all -> 0x059d }
            r8.putExtra(r7, r9)     // Catch:{ all -> 0x059d }
            java.lang.String r7 = "extra_click_download_ids"
            long r9 = r13.f28942a     // Catch:{ all -> 0x059d }
            r8.putExtra(r7, r9)     // Catch:{ all -> 0x059d }
            android.content.Context r7 = r1.g     // Catch:{ all -> 0x059d }
            r9 = 0
            android.app.PendingIntent r7 = android.app.PendingIntent.getService(r7, r9, r8, r15)     // Catch:{ all -> 0x059d }
            r14.setContentIntent(r7)     // Catch:{ all -> 0x059d }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_HIDE"
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadHandlerService> r10 = com.ss.android.downloadlib.core.download.DownloadHandlerService.class
            r7.<init>(r8, r6, r9, r10)     // Catch:{ all -> 0x059d }
            android.content.Context r6 = r1.g     // Catch:{ all -> 0x059d }
            r8 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r8, r7, r8)     // Catch:{ all -> 0x059d }
            r14.setDeleteIntent(r6)     // Catch:{ all -> 0x059d }
            goto L_0x0184
        L_0x0158:
            r19 = r8
            goto L_0x0184
        L_0x015b:
            r19 = r8
            android.net.Uri r6 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ all -> 0x059d }
            long r7 = r13.f28942a     // Catch:{ all -> 0x059d }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r7)     // Catch:{ all -> 0x059d }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x059d }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_DELETE"
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadHandlerService> r10 = com.ss.android.downloadlib.core.download.DownloadHandlerService.class
            r7.<init>(r8, r6, r9, r10)     // Catch:{ all -> 0x059d }
            android.content.Context r6 = r1.g     // Catch:{ all -> 0x059d }
            r8 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r8, r7, r15)     // Catch:{ all -> 0x059d }
            r14.setContentIntent(r6)     // Catch:{ all -> 0x059d }
            r6 = 1
            if (r12 != r6) goto L_0x0181
            r14.setOngoing(r6)     // Catch:{ all -> 0x059d }
            goto L_0x0184
        L_0x0181:
            r14.setAutoCancel(r6)     // Catch:{ all -> 0x059d }
        L_0x0184:
            android.net.Uri r6 = com.ss.android.downloadlib.core.download.j.a.f29029a     // Catch:{ all -> 0x059d }
            long r7 = r13.f28942a     // Catch:{ all -> 0x059d }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r7)     // Catch:{ all -> 0x059d }
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_CLICK"
            android.content.Intent r8 = new android.content.Intent     // Catch:{ all -> 0x059d }
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadHandlerService> r10 = com.ss.android.downloadlib.core.download.DownloadHandlerService.class
            r8.<init>(r7, r6, r9, r10)     // Catch:{ all -> 0x059d }
            java.lang.String r6 = "status"
            int r7 = r13.j     // Catch:{ all -> 0x059d }
            r8.putExtra(r6, r7)     // Catch:{ all -> 0x059d }
            java.lang.String r6 = "time_cost"
            long r9 = r13.D     // Catch:{ all -> 0x059d }
            r8.putExtra(r6, r9)     // Catch:{ all -> 0x059d }
            java.lang.String r6 = "extra_click_download_ids"
            long r9 = r13.f28942a     // Catch:{ all -> 0x059d }
            r8.putExtra(r6, r9)     // Catch:{ all -> 0x059d }
            java.lang.String r6 = "extra_notification_tag"
            r8.putExtra(r6, r5)     // Catch:{ all -> 0x059d }
            r7 = 1
            if (r12 != r7) goto L_0x02a2
            com.ss.android.downloadlib.c.g r7 = r1.f28983c     // Catch:{ all -> 0x059d }
            monitor-enter(r7)     // Catch:{ all -> 0x059d }
            long r9 = r13.s     // Catch:{ all -> 0x029b }
            r22 = -1
            int r24 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r24 == 0) goto L_0x01ef
            long r9 = r13.t     // Catch:{ all -> 0x029b }
            r22 = 0
            r16 = 0
            long r9 = r9 + r16
            r26 = r7
            long r6 = r13.s     // Catch:{ all -> 0x02a0 }
            r22 = 0
            long r6 = r6 + r16
            com.ss.android.downloadlib.c.g r15 = r1.f28983c     // Catch:{ all -> 0x02a0 }
            r27 = r6
            long r6 = r13.f28942a     // Catch:{ all -> 0x02a0 }
            r29 = r4
            long[] r4 = r15.f28890a     // Catch:{ all -> 0x02a0 }
            r30 = r9
            int r9 = r15.f28892c     // Catch:{ all -> 0x02a0 }
            int r4 = com.ss.android.downloadlib.c.g.a(r4, r9, r6)     // Catch:{ all -> 0x02a0 }
            if (r4 >= 0) goto L_0x01e6
            r9 = 0
            goto L_0x01ea
        L_0x01e6:
            long[] r6 = r15.f28891b     // Catch:{ all -> 0x02a0 }
            r9 = r6[r4]     // Catch:{ all -> 0x02a0 }
        L_0x01ea:
            r4 = 0
            r6 = 0
            long r9 = r9 + r6
            goto L_0x01f9
        L_0x01ef:
            r29 = r4
            r26 = r7
            r9 = 0
            r27 = 0
            r30 = 0
        L_0x01f9:
            monitor-exit(r26)     // Catch:{ all -> 0x02a0 }
            r6 = 0
            int r4 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x02a4
            r6 = 100
            long r6 = r6 * r30
            long r6 = r6 / r27
            int r4 = (int) r6     // Catch:{ all -> 0x059d }
            r6 = 2131559706(0x7f0d051a, float:1.8744764E38)
            r7 = 1
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ all -> 0x059d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x059d }
            r18 = 0
            r15[r18] = r7     // Catch:{ all -> 0x059d }
            java.lang.String r6 = r0.getString(r6, r15)     // Catch:{ all -> 0x059d }
            r15 = 0
            int r7 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r7 <= 0) goto L_0x0296
            long r27 = r27 - r30
            r22 = 1000(0x3e8, double:4.94E-321)
            long r27 = r27 * r22
            long r27 = r27 / r9
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x059d }
            r24 = 3600000(0x36ee80, double:1.7786363E-317)
            int r17 = (r27 > r24 ? 1 : (r27 == r24 ? 0 : -1))
            if (r17 < 0) goto L_0x024d
            r21 = 1800000(0x1b7740, double:8.89318E-318)
            long r27 = r27 + r21
            r32 = r8
            long r7 = r27 / r24
            int r7 = (int) r7     // Catch:{ all -> 0x059d }
            r8 = 2131559730(0x7f0d0532, float:1.8744812E38)
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x059d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x059d }
            r9 = 0
            r15[r9] = r7     // Catch:{ all -> 0x059d }
            java.lang.String r7 = r0.getString(r8, r15)     // Catch:{ all -> 0x059d }
        L_0x024b:
            r9 = 0
            goto L_0x028a
        L_0x024d:
            r32 = r8
            r7 = 60000(0xea60, double:2.9644E-319)
            int r9 = (r27 > r7 ? 1 : (r27 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0272
            r7 = 30000(0x7530, double:1.4822E-319)
            long r27 = r27 + r7
            r7 = 60000(0xea60, double:2.9644E-319)
            long r7 = r27 / r7
            int r7 = (int) r7     // Catch:{ all -> 0x059d }
            r8 = 2131559731(0x7f0d0533, float:1.8744814E38)
            r9 = 1
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x059d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x059d }
            r9 = 0
            r15[r9] = r7     // Catch:{ all -> 0x059d }
            java.lang.String r7 = r0.getString(r8, r15)     // Catch:{ all -> 0x059d }
            goto L_0x024b
        L_0x0272:
            r7 = 500(0x1f4, double:2.47E-321)
            long r27 = r27 + r7
            long r7 = r27 / r22
            int r7 = (int) r7     // Catch:{ all -> 0x059d }
            r8 = 2131559732(0x7f0d0534, float:1.8744816E38)
            r9 = 1
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x059d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x059d }
            r9 = 0
            r15[r9] = r7     // Catch:{ all -> 0x059d }
            java.lang.String r7 = r0.getString(r8, r15)     // Catch:{ all -> 0x059d }
        L_0x028a:
            r10[r9] = r7     // Catch:{ all -> 0x059d }
            r7 = 2131559707(0x7f0d051b, float:1.8744766E38)
            java.lang.String r7 = r0.getString(r7, r10)     // Catch:{ all -> 0x059d }
            r8 = r19
            goto L_0x02ab
        L_0x0296:
            r32 = r8
            r8 = r19
            goto L_0x02aa
        L_0x029b:
            r0 = move-exception
            r26 = r7
        L_0x029e:
            monitor-exit(r26)     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x059d }
        L_0x02a0:
            r0 = move-exception
            goto L_0x029e
        L_0x02a2:
            r29 = r4
        L_0x02a4:
            r32 = r8
            r8 = r19
            r4 = 0
            r6 = 0
        L_0x02aa:
            r7 = 0
        L_0x02ab:
            r14.setWhen(r8)     // Catch:{ all -> 0x059d }
            r14.setSmallIcon(r11)     // Catch:{ all -> 0x059d }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059d }
            r9 = 100
            r10 = 8
            if (r8 > r10) goto L_0x0346
            java.lang.CharSequence r8 = a((android.content.res.Resources) r0, (com.ss.android.downloadlib.core.download.c) r13)     // Catch:{ all -> 0x059d }
            r14.setContentTitle(r8)     // Catch:{ all -> 0x059d }
            r14.setContentText(r6)     // Catch:{ all -> 0x059d }
            r6 = 1
            if (r12 != r6) goto L_0x02dc
            java.lang.String r6 = r13.B     // Catch:{ all -> 0x059d }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x059d }
            if (r6 != 0) goto L_0x02d4
            java.lang.String r6 = r13.B     // Catch:{ all -> 0x059d }
            r14.setContentInfo(r6)     // Catch:{ all -> 0x059d }
            goto L_0x02d7
        L_0x02d4:
            r14.setContentInfo(r7)     // Catch:{ all -> 0x059d }
        L_0x02d7:
            r6 = 0
            r14.setProgress(r9, r4, r6)     // Catch:{ all -> 0x059d }
            goto L_0x033f
        L_0x02dc:
            r4 = 2
            if (r12 != r4) goto L_0x02ea
            r4 = 2131561532(0x7f0d0c3c, float:1.8748467E38)
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x059d }
            r14.setContentText(r4)     // Catch:{ all -> 0x059d }
            goto L_0x033f
        L_0x02ea:
            r4 = 3
            if (r12 != r4) goto L_0x033f
            int r4 = r13.j     // Catch:{ all -> 0x059d }
            boolean r4 = com.ss.android.download.api.a.a.C0337a.b(r4)     // Catch:{ all -> 0x059d }
            if (r4 != 0) goto L_0x0324
            boolean r4 = c(r13)     // Catch:{ all -> 0x059d }
            if (r4 == 0) goto L_0x02fc
            goto L_0x0324
        L_0x02fc:
            int r4 = r13.j     // Catch:{ all -> 0x059d }
            boolean r4 = com.ss.android.download.api.a.a.C0337a.a(r4)     // Catch:{ all -> 0x059d }
            if (r4 == 0) goto L_0x033f
            android.content.Context r4 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.String r6 = r13.f28946e     // Catch:{ all -> 0x059d }
            boolean r4 = com.ss.android.downloadlib.c.k.c(r4, r6)     // Catch:{ all -> 0x059d }
            if (r4 == 0) goto L_0x0319
            r4 = 2131561520(0x7f0d0c30, float:1.8748443E38)
            java.lang.CharSequence r4 = r0.getText(r4)     // Catch:{ all -> 0x059d }
            r14.setContentText(r4)     // Catch:{ all -> 0x059d }
            goto L_0x033f
        L_0x0319:
            r4 = 2131561519(0x7f0d0c2f, float:1.874844E38)
            java.lang.CharSequence r4 = r0.getText(r4)     // Catch:{ all -> 0x059d }
            r14.setContentText(r4)     // Catch:{ all -> 0x059d }
            goto L_0x033f
        L_0x0324:
            boolean r4 = c(r13)     // Catch:{ all -> 0x059d }
            if (r4 == 0) goto L_0x0335
            r4 = 2131561528(0x7f0d0c38, float:1.874846E38)
            java.lang.CharSequence r4 = r0.getText(r4)     // Catch:{ all -> 0x059d }
            r14.setContentText(r4)     // Catch:{ all -> 0x059d }
            goto L_0x033f
        L_0x0335:
            r4 = 2131561522(0x7f0d0c32, float:1.8748447E38)
            java.lang.CharSequence r4 = r0.getText(r4)     // Catch:{ all -> 0x059d }
            r14.setContentText(r4)     // Catch:{ all -> 0x059d }
        L_0x033f:
            android.app.Notification r4 = r14.build()     // Catch:{ all -> 0x059d }
            r15 = 3
            goto L_0x0536
        L_0x0346:
            android.widget.RemoteViews r6 = new android.widget.RemoteViews     // Catch:{ all -> 0x059d }
            android.content.Context r7 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x059d }
            r8 = 2131689914(0x7f0f01ba, float:1.9008857E38)
            r6.<init>(r7, r8)     // Catch:{ all -> 0x059d }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059d }
            r8 = 20
            if (r7 <= r8) goto L_0x0370
            android.content.Context r7 = r1.g     // Catch:{ Throwable -> 0x0370 }
            boolean r7 = com.ss.android.downloadlib.c.k.b((android.content.Context) r7)     // Catch:{ Throwable -> 0x0370 }
            if (r7 == 0) goto L_0x0370
            r7 = 2131169611(0x7f07114b, float:1.7953557E38)
            java.lang.String r8 = "setBackgroundColor"
            java.lang.String r15 = "#fffafafa"
            int r15 = android.graphics.Color.parseColor(r15)     // Catch:{ Throwable -> 0x0370 }
            r6.setInt(r7, r8, r15)     // Catch:{ Throwable -> 0x0370 }
        L_0x0370:
            r7 = 2131166447(0x7f0704ef, float:1.794714E38)
            r8 = 0
            r6.setProgressBar(r7, r9, r4, r8)     // Catch:{ all -> 0x059d }
            r4 = 2131167184(0x7f0707d0, float:1.7948634E38)
            r6.setImageViewResource(r4, r11)     // Catch:{ all -> 0x059d }
            android.content.Context r4 = r1.g     // Catch:{ all -> 0x059d }
            r9 = r32
            r11 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r4, r8, r9, r11)     // Catch:{ all -> 0x059d }
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setOnClickPendingIntent(r8, r4)     // Catch:{ all -> 0x059d }
            r4 = 2131166313(0x7f070469, float:1.7946868E38)
            java.lang.CharSequence r9 = a((android.content.res.Resources) r0, (com.ss.android.downloadlib.core.download.c) r13)     // Catch:{ all -> 0x059d }
            r6.setTextViewText(r4, r9)     // Catch:{ all -> 0x059d }
            java.lang.String r4 = ""
            java.lang.String r9 = ""
            java.lang.String r11 = ""
            r8 = 2131166454(0x7f0704f6, float:1.7947154E38)
            r15 = 1
            if (r12 != r15) goto L_0x040a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x059d }
            r4.<init>()     // Catch:{ all -> 0x059d }
            long r11 = r13.t     // Catch:{ all -> 0x059d }
            java.lang.String r9 = com.ss.android.downloadlib.c.k.a((long) r11)     // Catch:{ all -> 0x059d }
            r4.append(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r9 = "/"
            r4.append(r9)     // Catch:{ all -> 0x059d }
            long r11 = r13.s     // Catch:{ all -> 0x059d }
            java.lang.String r9 = com.ss.android.downloadlib.c.k.a((long) r11)     // Catch:{ all -> 0x059d }
            r4.append(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x059d }
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561529(0x7f0d0c39, float:1.8748461E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
            android.content.Context r11 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x059d }
            r12 = 2131561525(0x7f0d0c35, float:1.8748453E38)
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x059d }
            r12 = 0
            r6.setViewVisibility(r7, r12)     // Catch:{ all -> 0x059d }
            r6.setViewVisibility(r8, r10)     // Catch:{ all -> 0x059d }
            r7 = 2131166457(0x7f0704f9, float:1.794716E38)
            r6.setViewVisibility(r7, r12)     // Catch:{ all -> 0x059d }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059d }
            r8 = 11
            if (r7 < r8) goto L_0x0401
            long r7 = r13.f28942a     // Catch:{ all -> 0x059d }
            boolean r7 = r1.b((long) r7)     // Catch:{ all -> 0x059d }
            if (r7 == 0) goto L_0x03f9
            goto L_0x0401
        L_0x03f9:
            r7 = 0
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setViewVisibility(r8, r7)     // Catch:{ all -> 0x059d }
            goto L_0x0407
        L_0x0401:
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setViewVisibility(r8, r10)     // Catch:{ all -> 0x059d }
        L_0x0407:
            r15 = 3
            goto L_0x050e
        L_0x040a:
            r15 = 2
            if (r12 != r15) goto L_0x0472
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x059d }
            r4.<init>()     // Catch:{ all -> 0x059d }
            long r11 = r13.t     // Catch:{ all -> 0x059d }
            java.lang.String r9 = com.ss.android.downloadlib.c.k.a((long) r11)     // Catch:{ all -> 0x059d }
            r4.append(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r9 = "/"
            r4.append(r9)     // Catch:{ all -> 0x059d }
            long r11 = r13.s     // Catch:{ all -> 0x059d }
            java.lang.String r9 = com.ss.android.downloadlib.c.k.a((long) r11)     // Catch:{ all -> 0x059d }
            r4.append(r9)     // Catch:{ all -> 0x059d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x059d }
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561525(0x7f0d0c35, float:1.8748453E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
            android.content.Context r11 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x059d }
            r12 = 2131561527(0x7f0d0c37, float:1.8748457E38)
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x059d }
            r6.setViewVisibility(r7, r10)     // Catch:{ all -> 0x059d }
            r6.setViewVisibility(r8, r10)     // Catch:{ all -> 0x059d }
            r7 = 0
            r8 = 2131166457(0x7f0704f9, float:1.794716E38)
            r6.setViewVisibility(r8, r7)     // Catch:{ all -> 0x059d }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x059d }
            r8 = 11
            if (r7 < r8) goto L_0x046b
            long r7 = r13.f28942a     // Catch:{ all -> 0x059d }
            boolean r7 = r1.b((long) r7)     // Catch:{ all -> 0x059d }
            if (r7 == 0) goto L_0x0463
            goto L_0x046b
        L_0x0463:
            r7 = 0
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setViewVisibility(r8, r7)     // Catch:{ all -> 0x059d }
            goto L_0x0407
        L_0x046b:
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setViewVisibility(r8, r10)     // Catch:{ all -> 0x059d }
            goto L_0x0407
        L_0x0472:
            r15 = 3
            if (r12 != r15) goto L_0x050e
            int r12 = r13.j     // Catch:{ all -> 0x059d }
            boolean r12 = com.ss.android.download.api.a.a.C0337a.b(r12)     // Catch:{ all -> 0x059d }
            if (r12 != 0) goto L_0x04c5
            boolean r12 = c(r13)     // Catch:{ all -> 0x059d }
            if (r12 == 0) goto L_0x0484
            goto L_0x04c5
        L_0x0484:
            int r12 = r13.j     // Catch:{ all -> 0x059d }
            boolean r12 = com.ss.android.download.api.a.a.C0337a.a(r12)     // Catch:{ all -> 0x059d }
            if (r12 == 0) goto L_0x04fb
            long r11 = r13.s     // Catch:{ all -> 0x059d }
            java.lang.String r4 = com.ss.android.downloadlib.c.k.a((long) r11)     // Catch:{ all -> 0x059d }
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            java.lang.String r11 = r13.f28946e     // Catch:{ all -> 0x059d }
            boolean r9 = com.ss.android.downloadlib.c.k.c(r9, r11)     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x04aa
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561520(0x7f0d0c30, float:1.8748443E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
            goto L_0x04b7
        L_0x04aa:
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561519(0x7f0d0c2f, float:1.874844E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
        L_0x04b7:
            android.content.Context r11 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x059d }
            r12 = 2131561523(0x7f0d0c33, float:1.8748449E38)
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x059d }
            goto L_0x04fb
        L_0x04c5:
            java.lang.String r4 = ""
            r9 = 2131166455(0x7f0704f7, float:1.7947156E38)
            r6.setViewVisibility(r9, r10)     // Catch:{ all -> 0x059d }
            boolean r9 = c(r13)     // Catch:{ all -> 0x059d }
            if (r9 == 0) goto L_0x04e1
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561528(0x7f0d0c38, float:1.874846E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
            goto L_0x04ee
        L_0x04e1:
            android.content.Context r9 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x059d }
            r11 = 2131561522(0x7f0d0c32, float:1.8748447E38)
            java.lang.String r9 = r9.getString(r11)     // Catch:{ all -> 0x059d }
        L_0x04ee:
            android.content.Context r11 = r1.g     // Catch:{ all -> 0x059d }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x059d }
            r12 = 2131561526(0x7f0d0c36, float:1.8748455E38)
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x059d }
        L_0x04fb:
            r6.setViewVisibility(r7, r10)     // Catch:{ all -> 0x059d }
            r7 = 0
            r6.setViewVisibility(r8, r7)     // Catch:{ all -> 0x059d }
            r7 = 2131166457(0x7f0704f9, float:1.794716E38)
            r6.setViewVisibility(r7, r10)     // Catch:{ all -> 0x059d }
            r7 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setViewVisibility(r7, r10)     // Catch:{ all -> 0x059d }
        L_0x050e:
            r7 = 2131166449(0x7f0704f1, float:1.7947144E38)
            r6.setTextViewText(r7, r4)     // Catch:{ all -> 0x059d }
            r7 = 2131166450(0x7f0704f2, float:1.7947146E38)
            r6.setTextViewText(r7, r9)     // Catch:{ all -> 0x059d }
            r7 = 2131166455(0x7f0704f7, float:1.7947156E38)
            r6.setTextViewText(r7, r4)     // Catch:{ all -> 0x059d }
            r4 = 2131166456(0x7f0704f8, float:1.7947158E38)
            r6.setTextViewText(r4, r9)     // Catch:{ all -> 0x059d }
            r4 = 2131165210(0x7f07001a, float:1.794463E38)
            r6.setTextViewText(r4, r11)     // Catch:{ all -> 0x059d }
            com.ss.android.download.api.config.h r4 = com.ss.android.downloadlib.addownload.k.d()     // Catch:{ all -> 0x059d }
            android.app.Notification r4 = r4.a((android.support.v4.app.NotificationCompat.Builder) r14)     // Catch:{ all -> 0x059d }
            r4.contentView = r6     // Catch:{ all -> 0x059d }
        L_0x0536:
            java.lang.Object r6 = f28981b     // Catch:{ all -> 0x059d }
            monitor-enter(r6)     // Catch:{ all -> 0x059d }
            java.util.Set<java.lang.String> r7 = r1.f28982a     // Catch:{ all -> 0x0559 }
            boolean r7 = r7.contains(r5)     // Catch:{ all -> 0x0559 }
            if (r7 != 0) goto L_0x0549
            java.util.Set<java.lang.String> r7 = r1.f28982a     // Catch:{ all -> 0x0559 }
            r7.add(r5)     // Catch:{ all -> 0x0559 }
            r33.b()     // Catch:{ all -> 0x0559 }
        L_0x0549:
            monitor-exit(r6)     // Catch:{ all -> 0x0559 }
            android.app.NotificationManager r6 = r1.h     // Catch:{ Throwable -> 0x0550 }
            r7 = 0
            r6.notify(r5, r7, r4)     // Catch:{ Throwable -> 0x0550 }
        L_0x0550:
            r4 = r29
            r6 = 3
            r7 = 2
            r8 = 0
            r10 = 1
            goto L_0x0076
        L_0x0559:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0559 }
            throw r0     // Catch:{ all -> 0x059d }
        L_0x055c:
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.j     // Catch:{ all -> 0x059d }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x059d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x059d }
        L_0x0566:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x059d }
            if (r4 == 0) goto L_0x059b
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x059d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x059d }
            boolean r5 = r3.containsKey(r4)     // Catch:{ all -> 0x059d }
            if (r5 != 0) goto L_0x0599
            android.app.NotificationManager r5 = r1.h     // Catch:{ all -> 0x059d }
            r6 = 0
            r5.cancel(r4, r6)     // Catch:{ all -> 0x059d }
            java.lang.Object r5 = f28981b     // Catch:{ all -> 0x059d }
            monitor-enter(r5)     // Catch:{ all -> 0x059d }
            java.util.Set<java.lang.String> r7 = r1.f28982a     // Catch:{ all -> 0x0596 }
            boolean r7 = r7.contains(r4)     // Catch:{ all -> 0x0596 }
            if (r7 == 0) goto L_0x0591
            java.util.Set<java.lang.String> r7 = r1.f28982a     // Catch:{ all -> 0x0596 }
            r7.remove(r4)     // Catch:{ all -> 0x0596 }
            r33.b()     // Catch:{ all -> 0x0596 }
        L_0x0591:
            monitor-exit(r5)     // Catch:{ all -> 0x0596 }
            r0.remove()     // Catch:{ all -> 0x059d }
            goto L_0x0566
        L_0x0596:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0596 }
            throw r0     // Catch:{ all -> 0x059d }
        L_0x0599:
            r6 = 0
            goto L_0x0566
        L_0x059b:
            monitor-exit(r2)     // Catch:{ all -> 0x059d }
            return
        L_0x059d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x059d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.e.a(java.util.Collection):void");
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.h.cancel(str, 0);
            synchronized (f28981b) {
                if (this.f28982a.contains(str)) {
                    this.f28982a.remove(str);
                    b();
                }
            }
        }
    }

    public final void a(c cVar) {
        if (cVar.w && b(cVar.f28942a)) {
            cVar.j = 490;
            a(cVar, 3, 0);
        }
    }

    public final void a(Context context, long j2) {
        Cursor a2 = g.a(context).a(ContentUris.withAppendedId(j.a.f29029a, j2), (String[]) null, (String) null, (String[]) null, (String) null);
        try {
            if (a2.moveToFirst()) {
                int a3 = a(a2, "status");
                int a4 = a(a2, "visibility");
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused) {
                    }
                }
                a(context, j2, a3, a4);
                a(j2, a3, a4);
                return;
            }
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused4) {
                }
            }
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused5) {
                }
            }
            throw th;
        }
    }

    private void b() {
        if (this.f28982a != null) {
            try {
                StringBuilder sb = new StringBuilder();
                synchronized (f28981b) {
                    int i2 = 0;
                    for (String next : this.f28982a) {
                        if (i2 != this.f28982a.size() - 1) {
                            sb.append(next);
                            sb.append("|");
                        } else {
                            sb.append(next);
                        }
                        i2++;
                    }
                }
                final String sb2 = sb.toString();
                f.a(this.g, (f.b) new f.b() {
                    public final void a(SharedPreferences.Editor editor) {
                        editor.putString("notifs_string", sb2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private static boolean c(c cVar) {
        return a(cVar.j, cVar.h);
    }

    private static boolean f(c cVar) {
        return b(cVar.j, cVar.h);
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (i == null) {
                i = new e(context);
            }
            eVar = i;
        }
        return eVar;
    }

    private static boolean d(c cVar) {
        if (cVar.j != 192 || !b(cVar.h)) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    private static String b(@NonNull Context context) {
        try {
            if (l == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111110", "channel_ttdownloader", 3);
                l = notificationChannel;
                notificationChannel.setSound(null, null);
                l.setShowBadge(false);
                ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(l);
            }
        } catch (Throwable unused) {
        }
        return "111110";
    }

    private static boolean e(c cVar) {
        if ((cVar.j == 196 || cVar.j == 193 || cVar.j == 194 || cVar.j == 195) && b(cVar.h)) {
            return true;
        }
        return false;
    }

    private e(Context context) {
        this.g = context.getApplicationContext();
        this.h = (NotificationManager) this.g.getSystemService("notification");
        try {
            f.a(this.g, (f.a) new f.a() {
                public final void a(SharedPreferences sharedPreferences) {
                    String[] split = sharedPreferences.getString("notifs_string", "").split("\\|");
                    if (split != null) {
                        synchronized (e.f28981b) {
                            for (int i = 0; i < split.length; i++) {
                                if (TextUtils.isEmpty(split[i])) {
                                    e.this.f28982a.add(split[i]);
                                }
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    static String b(c cVar) {
        if (e(cVar)) {
            return "2:" + cVar.f28942a;
        } else if (d(cVar)) {
            return "1:" + cVar.f28942a;
        } else if (!c(cVar) && !f(cVar)) {
            return null;
        } else {
            return "3:" + cVar.f28942a;
        }
    }

    public final boolean b(long j2) {
        String str = this.f28985e.get(Long.valueOf(j2));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("##");
        if (split == null || split.length <= 0 || !"bind_app".equals(split[0])) {
            return false;
        }
        return true;
    }

    public static int a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    private static boolean b(int i2, int i3) {
        if (!a.C0337a.c(i2) || !a(i3)) {
            return false;
        }
        return true;
    }

    private static CharSequence a(Resources resources, c cVar) {
        if (!TextUtils.isEmpty(cVar.A)) {
            return cVar.A;
        }
        return resources.getString(C0906R.string.a7t);
    }

    public final e b(Long l2, b bVar) {
        WeakHashMap weakHashMap = this.f28984d.get(l2);
        if (weakHashMap != null) {
            weakHashMap.remove(bVar);
            this.f28986f.remove(l2);
        }
        if (weakHashMap == null || weakHashMap.isEmpty()) {
            this.f28984d.remove(l2);
        }
        return this;
    }

    private static boolean a(int i2, int i3) {
        if ((i2 == 199 || i2 == 198) && a(i3)) {
            return true;
        }
        return false;
    }

    private void a(long j2, int i2, int i3) {
        if (b(i2, i3)) {
            a("3:" + j2);
        }
    }

    private void a(c cVar, int i2, long j2) {
        if (this.f28984d.get(Long.valueOf(cVar.f28942a)) != null) {
            Map map = this.f28984d.get(Long.valueOf(cVar.f28942a));
            com.ss.android.download.api.c.e eVar = this.f28986f.get(Long.valueOf(cVar.f28942a));
            if (eVar == null) {
                eVar = new com.ss.android.download.api.c.e();
                this.f28986f.put(Long.valueOf(cVar.f28942a), eVar);
            }
            eVar.f28491a = cVar.f28942a;
            eVar.f28492b = d.a(cVar.j);
            eVar.f28493c = cVar.s;
            eVar.f28494d = cVar.t;
            eVar.f28495e = cVar.f28946e;
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        for (b bVar : map.keySet()) {
                            if (bVar != null) {
                                bVar.a(eVar, i2, cVar.s, cVar.t, 0);
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static void a(Context context, long j2, int i2, int i3) {
        if (b(i2, i3) || a(i2, i3)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("visibility", 200);
            contentValues.put("visibility", 0);
            g.a(context).a(ContentUris.withAppendedId(j.a.f29029a, j2), contentValues, (String) null, (String[]) null);
        }
    }
}
