package com.ss.android.download;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.download.b.c;
import com.ss.android.download.b.e;
import com.ss.android.download.e;
import com.ss.android.download.g;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

@SuppressLint({"UseSparseArrays"})
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f28550b = new Object();
    private static f j;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f28551a = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final e f28552c = new e();

    /* renamed from: d  reason: collision with root package name */
    private Map<Long, WeakHashMap<Object, Boolean>> f28553d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private Map<Long, String> f28554e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map<Long, JSONObject> f28555f = new ConcurrentHashMap();
    private Map<Long, e.b> g = new ConcurrentHashMap();
    private final Context h;
    private final NotificationManager i;
    private final HashMap<String, Long> k = new HashMap<>();
    private final com.ss.android.download.b.e l = new com.ss.android.download.b.e();

    private static boolean a(int i2) {
        return i2 == 1 || i2 == 3;
    }

    private static boolean b(int i2) {
        return i2 == 1 || i2 == 0;
    }

    public final void a() {
        synchronized (f28550b) {
            Iterator<String> it2 = this.f28551a.iterator();
            while (it2.hasNext()) {
                this.i.cancel(it2.next(), 0);
                it2.remove();
            }
        }
    }

    public final void a(long j2, long j3) {
        synchronized (this.f28552c) {
            if (j3 != 0) {
                try {
                    this.f28552c.a(j2, j3);
                    this.l.a(j2, SystemClock.elapsedRealtime());
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f28552c.b(j2);
                this.l.b(j2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02fe A[Catch:{ all -> 0x0258 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04f1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x016d A[Catch:{ all -> 0x0258 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x025a A[Catch:{ all -> 0x0258 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0271 A[Catch:{ all -> 0x0258 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Collection<com.ss.android.download.d> r34) {
        /*
            r33 = this;
            r1 = r33
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r1.k
            monitor-enter(r2)
            boolean r0 = com.ss.android.download.k.a()     // Catch:{ all -> 0x055b }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x055b }
            return
        L_0x000d:
            android.content.Context r0 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x055b }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x055b }
            r3.<init>()     // Catch:{ all -> 0x055b }
            java.util.Iterator r4 = r34.iterator()     // Catch:{ all -> 0x055b }
        L_0x001c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x055b }
            r6 = 3
            r7 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x055b }
            com.ss.android.download.d r5 = (com.ss.android.download.d) r5     // Catch:{ all -> 0x055b }
            java.lang.String r9 = b((com.ss.android.download.d) r5)     // Catch:{ all -> 0x055b }
            if (r9 == 0) goto L_0x0035
            r3.put(r9, r5)     // Catch:{ all -> 0x055b }
            goto L_0x001c
        L_0x0035:
            int r9 = r5.j     // Catch:{ all -> 0x055b }
            boolean r9 = com.ss.android.download.b.c.a.c(r9)     // Catch:{ all -> 0x055b }
            if (r9 == 0) goto L_0x001c
            r1.a((com.ss.android.download.d) r5, (int) r6, (long) r7)     // Catch:{ all -> 0x055b }
            goto L_0x001c
        L_0x0041:
            java.util.Set r4 = r3.keySet()     // Catch:{ all -> 0x055b }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x055b }
        L_0x0049:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x055b }
            r9 = 0
            if (r5 == 0) goto L_0x0514
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x055b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x055b }
            r10 = 58
            int r10 = r5.indexOf(r10)     // Catch:{ all -> 0x055b }
            java.lang.String r10 = r5.substring(r9, r10)     // Catch:{ all -> 0x055b }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ all -> 0x055b }
            java.lang.Object r11 = r3.get(r5)     // Catch:{ all -> 0x055b }
            com.ss.android.download.d r11 = (com.ss.android.download.d) r11     // Catch:{ all -> 0x055b }
            android.support.v4.app.NotificationCompat$Builder r12 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ all -> 0x055b }
            android.content.Context r13 = r1.h     // Catch:{ all -> 0x055b }
            r12.<init>(r13)     // Catch:{ all -> 0x055b }
            java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.k     // Catch:{ all -> 0x055b }
            boolean r13 = r13.containsKey(r5)     // Catch:{ all -> 0x055b }
            if (r13 == 0) goto L_0x0086
            java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.k     // Catch:{ all -> 0x055b }
            java.lang.Object r13 = r13.get(r5)     // Catch:{ all -> 0x055b }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x055b }
            long r13 = r13.longValue()     // Catch:{ all -> 0x055b }
            goto L_0x0093
        L_0x0086:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x055b }
            java.util.HashMap<java.lang.String, java.lang.Long> r15 = r1.k     // Catch:{ all -> 0x055b }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x055b }
            r15.put(r5, r9)     // Catch:{ all -> 0x055b }
        L_0x0093:
            r9 = 2
            r15 = 1
            if (r10 != r15) goto L_0x009e
            r17 = 17301633(0x1080081, float:2.4979616E-38)
            r18 = 17301633(0x1080081, float:2.4979616E-38)
            goto L_0x00b8
        L_0x009e:
            if (r10 != r9) goto L_0x00aa
            r17 = 17301642(0x108008a, float:2.4979642E-38)
            r1.a((com.ss.android.download.d) r11, (int) r9, (long) r7)     // Catch:{ all -> 0x055b }
            r18 = 17301642(0x108008a, float:2.4979642E-38)
            goto L_0x00b8
        L_0x00aa:
            if (r10 != r6) goto L_0x00b6
            r17 = 17301634(0x1080082, float:2.497962E-38)
            r1.a((com.ss.android.download.d) r11, (int) r6, (long) r7)     // Catch:{ all -> 0x055b }
            r18 = 17301634(0x1080082, float:2.497962E-38)
            goto L_0x00b8
        L_0x00b6:
            r18 = 0
        L_0x00b8:
            if (r10 == r15) goto L_0x011a
            if (r10 != r9) goto L_0x00bd
            goto L_0x011a
        L_0x00bd:
            if (r10 != r6) goto L_0x0118
            android.net.Uri r8 = com.ss.android.download.b.c.a.f28513a     // Catch:{ all -> 0x055b }
            r21 = r10
            long r9 = r11.f28523a     // Catch:{ all -> 0x055b }
            android.net.Uri r8 = android.content.ContentUris.withAppendedId(r8, r9)     // Catch:{ all -> 0x055b }
            r12.setAutoCancel(r15)     // Catch:{ all -> 0x055b }
            int r9 = r11.j     // Catch:{ all -> 0x055b }
            boolean r9 = com.ss.android.download.b.c.a.b(r9)     // Catch:{ all -> 0x055b }
            if (r9 != 0) goto L_0x00de
            boolean r9 = c(r11)     // Catch:{ all -> 0x055b }
            if (r9 == 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            java.lang.String r9 = "android.ss.intent.action.DOWNLOAD_OPEN"
            goto L_0x00e0
        L_0x00de:
            java.lang.String r9 = "android.ss.intent.action.DOWNLOAD_DELETE"
        L_0x00e0:
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r15 = com.ss.android.download.DownloadHandlerService.class
            r10.<init>(r9, r8, r6, r15)     // Catch:{ all -> 0x055b }
            java.lang.String r6 = "extra_click_download_ids"
            r22 = r8
            long r7 = r11.f28523a     // Catch:{ all -> 0x055b }
            r10.putExtra(r6, r7)     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            r7 = 0
            r8 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r7, r10, r8)     // Catch:{ all -> 0x055b }
            r12.setContentIntent(r6)     // Catch:{ all -> 0x055b }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x055b }
            java.lang.String r7 = "android.ss.intent.action.DOWNLOAD_HIDE"
            android.content.Context r8 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r9 = com.ss.android.download.DownloadHandlerService.class
            r10 = r22
            r6.<init>(r7, r10, r8, r9)     // Catch:{ all -> 0x055b }
            android.content.Context r7 = r1.h     // Catch:{ all -> 0x055b }
            r8 = 0
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r7, r8, r6, r8)     // Catch:{ all -> 0x055b }
            r12.setDeleteIntent(r6)     // Catch:{ all -> 0x055b }
            r6 = r21
            goto L_0x0147
        L_0x0118:
            r6 = r10
            goto L_0x0147
        L_0x011a:
            r21 = r10
            android.net.Uri r6 = com.ss.android.download.b.c.a.f28513a     // Catch:{ all -> 0x055b }
            long r7 = r11.f28523a     // Catch:{ all -> 0x055b }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r6, r7)     // Catch:{ all -> 0x055b }
            android.content.Intent r7 = new android.content.Intent     // Catch:{ all -> 0x055b }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_DELETE"
            android.content.Context r9 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r10 = com.ss.android.download.DownloadHandlerService.class
            r7.<init>(r8, r6, r9, r10)     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            r8 = 0
            r9 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r6 = android.app.PendingIntent.getService(r6, r8, r7, r9)     // Catch:{ all -> 0x055b }
            r12.setContentIntent(r6)     // Catch:{ all -> 0x055b }
            r6 = r21
            r7 = 1
            if (r6 != r7) goto L_0x0144
            r12.setOngoing(r7)     // Catch:{ all -> 0x055b }
            goto L_0x0147
        L_0x0144:
            r12.setAutoCancel(r7)     // Catch:{ all -> 0x055b }
        L_0x0147:
            android.net.Uri r7 = com.ss.android.download.b.c.a.f28513a     // Catch:{ all -> 0x055b }
            long r8 = r11.f28523a     // Catch:{ all -> 0x055b }
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r7, r8)     // Catch:{ all -> 0x055b }
            java.lang.String r8 = "android.ss.intent.action.DOWNLOAD_CLICK"
            android.content.Intent r9 = new android.content.Intent     // Catch:{ all -> 0x055b }
            android.content.Context r10 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r15 = com.ss.android.download.DownloadHandlerService.class
            r9.<init>(r8, r7, r10, r15)     // Catch:{ all -> 0x055b }
            java.lang.String r7 = "extra_click_download_ids"
            r23 = r3
            r24 = r4
            long r3 = r11.f28523a     // Catch:{ all -> 0x055b }
            r9.putExtra(r7, r3)     // Catch:{ all -> 0x055b }
            java.lang.String r3 = "extra_notification_tag"
            r9.putExtra(r3, r5)     // Catch:{ all -> 0x055b }
            r4 = 1
            if (r6 != r4) goto L_0x025a
            com.ss.android.download.b.e r4 = r1.f28552c     // Catch:{ all -> 0x055b }
            monitor-enter(r4)     // Catch:{ all -> 0x055b }
            long r7 = r11.s     // Catch:{ all -> 0x0253 }
            r25 = -1
            int r10 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r10 == 0) goto L_0x0194
            long r7 = r11.t     // Catch:{ all -> 0x0253 }
            r10 = 0
            r19 = 0
            long r7 = r7 + r19
            r28 = r4
            long r3 = r11.s     // Catch:{ all -> 0x0258 }
            r10 = 0
            long r3 = r3 + r19
            com.ss.android.download.b.e r10 = r1.f28552c     // Catch:{ all -> 0x0258 }
            r29 = r3
            long r3 = r11.f28523a     // Catch:{ all -> 0x0258 }
            long r3 = r10.a((long) r3)     // Catch:{ all -> 0x0258 }
            r10 = 0
            long r3 = r3 + r19
            goto L_0x019c
        L_0x0194:
            r28 = r4
            r3 = 0
            r7 = 0
            r29 = 0
        L_0x019c:
            monitor-exit(r28)     // Catch:{ all -> 0x0258 }
            r19 = 0
            int r10 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r10 <= 0) goto L_0x0244
            r25 = 100
            long r25 = r25 * r7
            r31 = r9
            long r9 = r25 / r29
            int r9 = (int) r9     // Catch:{ all -> 0x055b }
            r15 = 1
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ all -> 0x055b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x055b }
            r16 = 0
            r10[r16] = r15     // Catch:{ all -> 0x055b }
            r15 = 2131559706(0x7f0d051a, float:1.8744764E38)
            java.lang.String r10 = r0.getString(r15, r10)     // Catch:{ all -> 0x055b }
            r19 = 0
            int r15 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r15 <= 0) goto L_0x0240
            long r29 = r29 - r7
            r7 = 1000(0x3e8, double:4.94E-321)
            long r29 = r29 * r7
            long r29 = r29 / r3
            r15 = 1
            java.lang.Object[] r7 = new java.lang.Object[r15]     // Catch:{ all -> 0x055b }
            r25 = 3600000(0x36ee80, double:1.7786363E-317)
            int r8 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r8 < 0) goto L_0x01f2
            r27 = 1800000(0x1b7740, double:8.89318E-318)
            long r29 = r29 + r27
            r32 = r9
            long r8 = r29 / r25
            int r8 = (int) r8     // Catch:{ all -> 0x055b }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x055b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x055b }
            r15 = 0
            r9[r15] = r8     // Catch:{ all -> 0x055b }
            r8 = 2131559730(0x7f0d0532, float:1.8744812E38)
            java.lang.String r8 = r0.getString(r8, r9)     // Catch:{ all -> 0x055b }
        L_0x01f0:
            r15 = 0
            goto L_0x0231
        L_0x01f2:
            r32 = r9
            r8 = 60000(0xea60, double:2.9644E-319)
            int r15 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x0217
            r8 = 30000(0x7530, double:1.4822E-319)
            long r29 = r29 + r8
            r8 = 60000(0xea60, double:2.9644E-319)
            long r8 = r29 / r8
            int r8 = (int) r8     // Catch:{ all -> 0x055b }
            r15 = 1
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x055b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x055b }
            r15 = 0
            r9[r15] = r8     // Catch:{ all -> 0x055b }
            r8 = 2131559731(0x7f0d0533, float:1.8744814E38)
            java.lang.String r8 = r0.getString(r8, r9)     // Catch:{ all -> 0x055b }
            goto L_0x01f0
        L_0x0217:
            r8 = 500(0x1f4, double:2.47E-321)
            long r29 = r29 + r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r29 / r8
            int r8 = (int) r8     // Catch:{ all -> 0x055b }
            r15 = 1
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ all -> 0x055b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x055b }
            r15 = 0
            r9[r15] = r8     // Catch:{ all -> 0x055b }
            r8 = 2131559732(0x7f0d0534, float:1.8744816E38)
            java.lang.String r8 = r0.getString(r8, r9)     // Catch:{ all -> 0x055b }
        L_0x0231:
            r7[r15] = r8     // Catch:{ all -> 0x055b }
            r8 = 2131559707(0x7f0d051b, float:1.8744766E38)
            java.lang.String r7 = r0.getString(r8, r7)     // Catch:{ all -> 0x055b }
            r27 = r7
            r9 = r32
            r7 = 1
            goto L_0x024d
        L_0x0240:
            r32 = r9
            r7 = 1
            goto L_0x024b
        L_0x0244:
            r31 = r9
            r19 = 0
            r7 = 1
            r9 = 0
            r10 = 0
        L_0x024b:
            r27 = 0
        L_0x024d:
            r1.a((com.ss.android.download.d) r11, (int) r7, (long) r3)     // Catch:{ all -> 0x055b }
            r3 = r27
            goto L_0x0261
        L_0x0253:
            r0 = move-exception
            r28 = r4
        L_0x0256:
            monitor-exit(r28)     // Catch:{ all -> 0x0258 }
            throw r0     // Catch:{ all -> 0x055b }
        L_0x0258:
            r0 = move-exception
            goto L_0x0256
        L_0x025a:
            r31 = r9
            r19 = 0
            r3 = 0
            r9 = 0
            r10 = 0
        L_0x0261:
            r12.setWhen(r13)     // Catch:{ all -> 0x055b }
            r4 = r18
            r12.setSmallIcon(r4)     // Catch:{ all -> 0x055b }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x055b }
            r8 = 100
            r13 = 8
            if (r7 > r13) goto L_0x02fe
            java.lang.CharSequence r4 = a((android.content.res.Resources) r0, (com.ss.android.download.d) r11)     // Catch:{ all -> 0x055b }
            r12.setContentTitle(r4)     // Catch:{ all -> 0x055b }
            r12.setContentText(r10)     // Catch:{ all -> 0x055b }
            r4 = 1
            if (r6 != r4) goto L_0x0294
            java.lang.String r4 = r11.B     // Catch:{ all -> 0x055b }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x055b }
            if (r4 != 0) goto L_0x028c
            java.lang.String r3 = r11.B     // Catch:{ all -> 0x055b }
            r12.setContentInfo(r3)     // Catch:{ all -> 0x055b }
            goto L_0x028f
        L_0x028c:
            r12.setContentInfo(r3)     // Catch:{ all -> 0x055b }
        L_0x028f:
            r3 = 0
            r12.setProgress(r8, r9, r3)     // Catch:{ all -> 0x055b }
            goto L_0x02f7
        L_0x0294:
            r3 = 2
            if (r6 != r3) goto L_0x02a2
            r3 = 2131561532(0x7f0d0c3c, float:1.8748467E38)
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x055b }
            r12.setContentText(r3)     // Catch:{ all -> 0x055b }
            goto L_0x02f7
        L_0x02a2:
            r3 = 3
            if (r6 != r3) goto L_0x02f7
            int r3 = r11.j     // Catch:{ all -> 0x055b }
            boolean r3 = com.ss.android.download.b.c.a.b(r3)     // Catch:{ all -> 0x055b }
            if (r3 != 0) goto L_0x02dc
            boolean r3 = c(r11)     // Catch:{ all -> 0x055b }
            if (r3 == 0) goto L_0x02b4
            goto L_0x02dc
        L_0x02b4:
            int r3 = r11.j     // Catch:{ all -> 0x055b }
            boolean r3 = com.ss.android.download.b.c.a.a(r3)     // Catch:{ all -> 0x055b }
            if (r3 == 0) goto L_0x02f7
            android.content.Context r3 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.String r4 = r11.f28527e     // Catch:{ all -> 0x055b }
            boolean r3 = com.ss.android.download.b.f.a(r3, r4)     // Catch:{ all -> 0x055b }
            if (r3 == 0) goto L_0x02d1
            r3 = 2131561520(0x7f0d0c30, float:1.8748443E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x055b }
            r12.setContentText(r3)     // Catch:{ all -> 0x055b }
            goto L_0x02f7
        L_0x02d1:
            r3 = 2131561519(0x7f0d0c2f, float:1.874844E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x055b }
            r12.setContentText(r3)     // Catch:{ all -> 0x055b }
            goto L_0x02f7
        L_0x02dc:
            boolean r3 = c(r11)     // Catch:{ all -> 0x055b }
            if (r3 == 0) goto L_0x02ed
            r3 = 2131561528(0x7f0d0c38, float:1.874846E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x055b }
            r12.setContentText(r3)     // Catch:{ all -> 0x055b }
            goto L_0x02f7
        L_0x02ed:
            r3 = 2131561522(0x7f0d0c32, float:1.8748447E38)
            java.lang.CharSequence r3 = r0.getText(r3)     // Catch:{ all -> 0x055b }
            r12.setContentText(r3)     // Catch:{ all -> 0x055b }
        L_0x02f7:
            android.app.Notification r3 = r12.build()     // Catch:{ all -> 0x055b }
            r8 = 3
            goto L_0x04ee
        L_0x02fe:
            android.widget.RemoteViews r3 = new android.widget.RemoteViews     // Catch:{ all -> 0x055b }
            android.content.Context r7 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ all -> 0x055b }
            r10 = 2131689914(0x7f0f01ba, float:1.9008857E38)
            r3.<init>(r7, r10)     // Catch:{ all -> 0x055b }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x055b }
            r10 = 20
            if (r7 <= r10) goto L_0x032f
            android.content.Context r7 = r1.h     // Catch:{ Throwable -> 0x032f }
            boolean r7 = com.bytedance.ies.uikit.util.IESUIUtils.isMaterialNotification(r7)     // Catch:{ Throwable -> 0x032f }
            if (r7 == 0) goto L_0x032f
            r7 = 2131169611(0x7f07114b, float:1.7953557E38)
            java.lang.String r10 = "setBackgroundColor"
            android.content.Context r14 = r1.h     // Catch:{ Throwable -> 0x032f }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ Throwable -> 0x032f }
            r15 = 2131624821(0x7f0e0375, float:1.8876833E38)
            int r14 = r14.getColor(r15)     // Catch:{ Throwable -> 0x032f }
            r3.setInt(r7, r10, r14)     // Catch:{ Throwable -> 0x032f }
        L_0x032f:
            r7 = 2131166447(0x7f0704ef, float:1.794714E38)
            r10 = 0
            r3.setProgressBar(r7, r8, r9, r10)     // Catch:{ all -> 0x055b }
            r8 = 2131167184(0x7f0707d0, float:1.7948634E38)
            r3.setImageViewResource(r8, r4)     // Catch:{ all -> 0x055b }
            android.content.Context r4 = r1.h     // Catch:{ all -> 0x055b }
            r8 = r31
            r9 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r4, r10, r8, r9)     // Catch:{ all -> 0x055b }
            r8 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setOnClickPendingIntent(r8, r4)     // Catch:{ all -> 0x055b }
            r4 = 2131166313(0x7f070469, float:1.7946868E38)
            java.lang.CharSequence r9 = a((android.content.res.Resources) r0, (com.ss.android.download.d) r11)     // Catch:{ all -> 0x055b }
            r3.setTextViewText(r4, r9)     // Catch:{ all -> 0x055b }
            java.lang.String r4 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r14 = 2131166457(0x7f0704f9, float:1.794716E38)
            r15 = 2131166454(0x7f0704f6, float:1.7947154E38)
            r8 = 1
            if (r6 != r8) goto L_0x03c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            long r8 = r11.t     // Catch:{ all -> 0x055b }
            java.lang.String r6 = com.bytedance.common.utility.StringUtils.bytesToHuman(r8)     // Catch:{ all -> 0x055b }
            r4.append(r6)     // Catch:{ all -> 0x055b }
            java.lang.String r6 = "/"
            r4.append(r6)     // Catch:{ all -> 0x055b }
            long r8 = r11.s     // Catch:{ all -> 0x055b }
            java.lang.String r6 = com.bytedance.common.utility.StringUtils.bytesToHuman(r8)     // Catch:{ all -> 0x055b }
            r4.append(r6)     // Catch:{ all -> 0x055b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r8 = 2131561529(0x7f0d0c39, float:1.8748461E38)
            java.lang.String r9 = r6.getString(r8)     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r8 = 2131561525(0x7f0d0c35, float:1.8748453E38)
            java.lang.String r10 = r6.getString(r8)     // Catch:{ all -> 0x055b }
            r6 = 0
            r3.setViewVisibility(r7, r6)     // Catch:{ all -> 0x055b }
            r3.setViewVisibility(r15, r13)     // Catch:{ all -> 0x055b }
            r3.setViewVisibility(r14, r6)     // Catch:{ all -> 0x055b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x055b }
            r7 = 11
            if (r6 < r7) goto L_0x03c0
            long r6 = r11.f28523a     // Catch:{ all -> 0x055b }
            boolean r6 = r1.a((long) r6)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x03b8
            goto L_0x03c0
        L_0x03b8:
            r6 = 0
            r7 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setViewVisibility(r7, r6)     // Catch:{ all -> 0x055b }
            goto L_0x03c6
        L_0x03c0:
            r7 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setViewVisibility(r7, r13)     // Catch:{ all -> 0x055b }
        L_0x03c6:
            r8 = 3
            goto L_0x04c9
        L_0x03c9:
            r8 = 2
            if (r6 != r8) goto L_0x042e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x055b }
            r4.<init>()     // Catch:{ all -> 0x055b }
            long r8 = r11.t     // Catch:{ all -> 0x055b }
            java.lang.String r6 = com.bytedance.common.utility.StringUtils.bytesToHuman(r8)     // Catch:{ all -> 0x055b }
            r4.append(r6)     // Catch:{ all -> 0x055b }
            java.lang.String r6 = "/"
            r4.append(r6)     // Catch:{ all -> 0x055b }
            long r8 = r11.s     // Catch:{ all -> 0x055b }
            java.lang.String r6 = com.bytedance.common.utility.StringUtils.bytesToHuman(r8)     // Catch:{ all -> 0x055b }
            r4.append(r6)     // Catch:{ all -> 0x055b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r8 = 2131561525(0x7f0d0c35, float:1.8748453E38)
            java.lang.String r9 = r6.getString(r8)     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r8 = 2131561527(0x7f0d0c37, float:1.8748457E38)
            java.lang.String r10 = r6.getString(r8)     // Catch:{ all -> 0x055b }
            r3.setViewVisibility(r7, r13)     // Catch:{ all -> 0x055b }
            r3.setViewVisibility(r15, r13)     // Catch:{ all -> 0x055b }
            r6 = 0
            r3.setViewVisibility(r14, r6)     // Catch:{ all -> 0x055b }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x055b }
            r7 = 11
            if (r6 < r7) goto L_0x0427
            long r6 = r11.f28523a     // Catch:{ all -> 0x055b }
            boolean r6 = r1.a((long) r6)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x041f
            goto L_0x0427
        L_0x041f:
            r6 = 0
            r7 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setViewVisibility(r7, r6)     // Catch:{ all -> 0x055b }
            goto L_0x03c6
        L_0x0427:
            r7 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setViewVisibility(r7, r13)     // Catch:{ all -> 0x055b }
            goto L_0x03c6
        L_0x042e:
            r8 = 3
            if (r6 != r8) goto L_0x04c9
            int r6 = r11.j     // Catch:{ all -> 0x055b }
            boolean r6 = com.ss.android.download.b.c.a.b(r6)     // Catch:{ all -> 0x055b }
            if (r6 != 0) goto L_0x0481
            boolean r6 = c(r11)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x0440
            goto L_0x0481
        L_0x0440:
            int r6 = r11.j     // Catch:{ all -> 0x055b }
            boolean r6 = com.ss.android.download.b.c.a.a(r6)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x04b9
            long r9 = r11.s     // Catch:{ all -> 0x055b }
            java.lang.String r4 = com.bytedance.common.utility.StringUtils.bytesToHuman(r9)     // Catch:{ all -> 0x055b }
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            java.lang.String r9 = r11.f28527e     // Catch:{ all -> 0x055b }
            boolean r6 = com.ss.android.download.b.f.a(r6, r9)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x0466
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r9 = 2131561520(0x7f0d0c30, float:1.8748443E38)
            java.lang.String r6 = r6.getString(r9)     // Catch:{ all -> 0x055b }
            goto L_0x0473
        L_0x0466:
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r9 = 2131561519(0x7f0d0c2f, float:1.874844E38)
            java.lang.String r6 = r6.getString(r9)     // Catch:{ all -> 0x055b }
        L_0x0473:
            android.content.Context r9 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x055b }
            r10 = 2131561523(0x7f0d0c33, float:1.8748449E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x055b }
            goto L_0x04b7
        L_0x0481:
            java.lang.String r4 = ""
            r6 = 2131166455(0x7f0704f7, float:1.7947156E38)
            r3.setViewVisibility(r6, r13)     // Catch:{ all -> 0x055b }
            boolean r6 = c(r11)     // Catch:{ all -> 0x055b }
            if (r6 == 0) goto L_0x049d
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r9 = 2131561528(0x7f0d0c38, float:1.874846E38)
            java.lang.String r6 = r6.getString(r9)     // Catch:{ all -> 0x055b }
            goto L_0x04aa
        L_0x049d:
            android.content.Context r6 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x055b }
            r9 = 2131561522(0x7f0d0c32, float:1.8748447E38)
            java.lang.String r6 = r6.getString(r9)     // Catch:{ all -> 0x055b }
        L_0x04aa:
            android.content.Context r9 = r1.h     // Catch:{ all -> 0x055b }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x055b }
            r10 = 2131561526(0x7f0d0c36, float:1.8748455E38)
            java.lang.String r9 = r9.getString(r10)     // Catch:{ all -> 0x055b }
        L_0x04b7:
            r10 = r9
            r9 = r6
        L_0x04b9:
            r3.setViewVisibility(r7, r13)     // Catch:{ all -> 0x055b }
            r6 = 0
            r3.setViewVisibility(r15, r6)     // Catch:{ all -> 0x055b }
            r3.setViewVisibility(r14, r13)     // Catch:{ all -> 0x055b }
            r6 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setViewVisibility(r6, r13)     // Catch:{ all -> 0x055b }
        L_0x04c9:
            r6 = 2131166449(0x7f0704f1, float:1.7947144E38)
            r3.setTextViewText(r6, r4)     // Catch:{ all -> 0x055b }
            r6 = 2131166450(0x7f0704f2, float:1.7947146E38)
            r3.setTextViewText(r6, r9)     // Catch:{ all -> 0x055b }
            r6 = 2131166455(0x7f0704f7, float:1.7947156E38)
            r3.setTextViewText(r6, r4)     // Catch:{ all -> 0x055b }
            r4 = 2131166456(0x7f0704f8, float:1.7947158E38)
            r3.setTextViewText(r4, r9)     // Catch:{ all -> 0x055b }
            r4 = 2131165210(0x7f07001a, float:1.794463E38)
            r3.setTextViewText(r4, r10)     // Catch:{ all -> 0x055b }
            android.app.Notification r4 = r12.build()     // Catch:{ all -> 0x055b }
            r4.contentView = r3     // Catch:{ all -> 0x055b }
            r3 = r4
        L_0x04ee:
            java.lang.Object r4 = f28550b     // Catch:{ all -> 0x055b }
            monitor-enter(r4)     // Catch:{ all -> 0x055b }
            java.util.Set<java.lang.String> r6 = r1.f28551a     // Catch:{ all -> 0x0511 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0511 }
            if (r6 != 0) goto L_0x0501
            java.util.Set<java.lang.String> r6 = r1.f28551a     // Catch:{ all -> 0x0511 }
            r6.add(r5)     // Catch:{ all -> 0x0511 }
            r33.b()     // Catch:{ all -> 0x0511 }
        L_0x0501:
            monitor-exit(r4)     // Catch:{ all -> 0x0511 }
            android.app.NotificationManager r4 = r1.i     // Catch:{ Throwable -> 0x0508 }
            r6 = 0
            r4.notify(r5, r6, r3)     // Catch:{ Throwable -> 0x0508 }
        L_0x0508:
            r7 = r19
            r3 = r23
            r4 = r24
            r6 = 3
            goto L_0x0049
        L_0x0511:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0511 }
            throw r0     // Catch:{ all -> 0x055b }
        L_0x0514:
            r23 = r3
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.k     // Catch:{ all -> 0x055b }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x055b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x055b }
        L_0x0520:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x055b }
            if (r3 == 0) goto L_0x0559
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x055b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x055b }
            r4 = r23
            boolean r5 = r4.containsKey(r3)     // Catch:{ all -> 0x055b }
            if (r5 != 0) goto L_0x0555
            android.app.NotificationManager r5 = r1.i     // Catch:{ all -> 0x055b }
            r6 = 0
            r5.cancel(r3, r6)     // Catch:{ all -> 0x055b }
            java.lang.Object r5 = f28550b     // Catch:{ all -> 0x055b }
            monitor-enter(r5)     // Catch:{ all -> 0x055b }
            java.util.Set<java.lang.String> r7 = r1.f28551a     // Catch:{ all -> 0x0552 }
            boolean r7 = r7.contains(r3)     // Catch:{ all -> 0x0552 }
            if (r7 == 0) goto L_0x054d
            java.util.Set<java.lang.String> r7 = r1.f28551a     // Catch:{ all -> 0x0552 }
            r7.remove(r3)     // Catch:{ all -> 0x0552 }
            r33.b()     // Catch:{ all -> 0x0552 }
        L_0x054d:
            monitor-exit(r5)     // Catch:{ all -> 0x0552 }
            r0.remove()     // Catch:{ all -> 0x055b }
            goto L_0x0556
        L_0x0552:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0552 }
            throw r0     // Catch:{ all -> 0x055b }
        L_0x0555:
            r6 = 0
        L_0x0556:
            r23 = r4
            goto L_0x0520
        L_0x0559:
            monitor-exit(r2)     // Catch:{ all -> 0x055b }
            return
        L_0x055b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x055b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.f.a(java.util.Collection):void");
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.i.cancel(str, 0);
            synchronized (f28550b) {
                if (this.f28551a.contains(str)) {
                    this.f28551a.remove(str);
                    b();
                }
            }
        }
    }

    public final void a(d dVar) {
        if (dVar.w && a(dVar.f28523a)) {
            dVar.j = 490;
            a(dVar, 3, 0);
        }
    }

    public final boolean a(long j2) {
        JSONObject jSONObject = this.f28555f.get(Long.valueOf(j2));
        if (jSONObject != null && jSONObject.optBoolean("bind_app", false)) {
            return true;
        }
        String str = this.f28554e.get(Long.valueOf(j2));
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("##");
        return split != null && split.length > 0 && "bind_app".equals(split[0]);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, long j2) {
        Cursor a2 = h.a(context).a(ContentUris.withAppendedId(c.a.f28513a, j2), (String[]) null, (String) null, (String[]) null, (String) null);
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
        if (this.f28551a != null) {
            try {
                StringBuilder sb = new StringBuilder();
                synchronized (f28550b) {
                    int i2 = 0;
                    for (String next : this.f28551a) {
                        if (i2 != this.f28551a.size() - 1) {
                            sb.append(next);
                            sb.append("|");
                        } else {
                            sb.append(next);
                        }
                        i2++;
                    }
                }
                final String sb2 = sb.toString();
                g.a(this.h, (g.b) new g.b() {
                    public final void a(SharedPreferences.Editor editor) {
                        Logger.debug();
                        editor.putString("notifs_string", sb2);
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    private static boolean c(d dVar) {
        return a(dVar.j, dVar.h);
    }

    private static boolean f(d dVar) {
        return b(dVar.j, dVar.h);
    }

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (f.class) {
            if (j == null) {
                j = new f(context);
            }
            fVar = j;
        }
        return fVar;
    }

    private static boolean d(d dVar) {
        if (dVar.j != 192 || !b(dVar.h)) {
            return false;
        }
        return true;
    }

    private static boolean e(d dVar) {
        if ((dVar.j == 196 || dVar.j == 193 || dVar.j == 194 || dVar.j == 195) && b(dVar.h)) {
            return true;
        }
        return false;
    }

    private f(Context context) {
        this.h = context.getApplicationContext();
        this.i = (NotificationManager) this.h.getSystemService("notification");
        try {
            g.a(this.h, (g.a) new g.a() {
                public final void a(SharedPreferences sharedPreferences) {
                    String string = sharedPreferences.getString("notifs_string", "");
                    Logger.debug();
                    String[] split = string.split("\\|");
                    if (split != null) {
                        synchronized (f.f28550b) {
                            for (int i = 0; i < split.length; i++) {
                                if (TextUtils.isEmpty(split[i])) {
                                    f.this.f28551a.add(split[i]);
                                }
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    static String b(d dVar) {
        if (e(dVar)) {
            return "2:" + dVar.f28523a;
        } else if (d(dVar)) {
            return "1:" + dVar.f28523a;
        } else if (!c(dVar) && !f(dVar)) {
            return null;
        } else {
            return "3:" + dVar.f28523a;
        }
    }

    public static int a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    private static boolean b(int i2, int i3) {
        if (!c.a.c(i2) || !a(i3)) {
            return false;
        }
        return true;
    }

    private static CharSequence a(Resources resources, d dVar) {
        if (!TextUtils.isEmpty(dVar.A)) {
            return dVar.A;
        }
        return resources.getString(C0906R.string.a7t);
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

    private void a(d dVar, int i2, long j2) {
        if (this.f28553d.get(Long.valueOf(dVar.f28523a)) != null) {
            Map map = this.f28553d.get(Long.valueOf(dVar.f28523a));
            e.b bVar = this.g.get(Long.valueOf(dVar.f28523a));
            if (bVar == null) {
                e a2 = e.a(this.h);
                a2.getClass();
                bVar = new e.b();
                this.g.put(Long.valueOf(dVar.f28523a), bVar);
            }
            bVar.f28538a = dVar.f28523a;
            bVar.f28539b = e.a(dVar.j);
            bVar.f28540c = dVar.s;
            bVar.f28541d = dVar.t;
            bVar.f28542e = dVar.f28527e;
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            it2.next();
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
            h.a(context).a(ContentUris.withAppendedId(c.a.f28513a, j2), contentValues, (String) null, (String[]) null);
        }
    }
}
