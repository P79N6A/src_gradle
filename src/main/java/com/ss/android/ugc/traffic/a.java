package com.ss.android.ugc.traffic;

import a.i;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020N2\u0006\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020:H\u0002J\u0018\u0010V\u001a\u00020R2\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020:H\u0002J\b\u0010Y\u001a\u00020RH\u0002J\u0010\u0010Z\u001a\u00020R2\b\u0010[\u001a\u0004\u0018\u00010\\J\u0010\u0010]\u001a\u00020R2\u0006\u0010S\u001a\u00020NH\u0002J\u000e\u0010^\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u000e\u0010_\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u000e\u0010`\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u000e\u0010a\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u000e\u0010b\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u000e\u0010c\u001a\u00020R2\u0006\u0010X\u001a\u00020:J\u0006\u0010d\u001a\u00020RR\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0014\u0010!\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0014\u0010)\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0014\u0010-\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u0018XD¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001aR\u0014\u00101\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020:X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010<\"\u0004\bL\u0010>R\u0011\u0010M\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006e"}, d2 = {"Lcom/ss/android/ugc/traffic/DataUsager;", "", "()V", "GB", "", "getGB", "()I", "INDEX_API", "getINDEX_API", "INDEX_IMAGE", "getINDEX_IMAGE", "INDEX_MUSIC", "getINDEX_MUSIC", "INDEX_VIDEO_CACHE", "getINDEX_VIDEO_CACHE", "INDEX_VIDEO_DOWNLOAD", "getINDEX_VIDEO_DOWNLOAD", "INDEX_VIDEO_SHARE", "getINDEX_VIDEO_SHARE", "INDEX_WEBVIEW", "getINDEX_WEBVIEW", "INTERVAL", "getINTERVAL", "KEY_API_SZIE", "", "getKEY_API_SZIE", "()Ljava/lang/String;", "KEY_IMAGE_SZIE", "getKEY_IMAGE_SZIE", "KEY_LAST_STATIS_TIME", "getKEY_LAST_STATIS_TIME", "KEY_MUSIC_SZIE", "getKEY_MUSIC_SZIE", "KEY_SUFFIX", "getKEY_SUFFIX", "KEY_VIDEO_CACHE_SZIE", "getKEY_VIDEO_CACHE_SZIE", "KEY_VIDEO_DOWNLOAD_SZIE", "getKEY_VIDEO_DOWNLOAD_SZIE", "KEY_VIDEO_SHARE_SZIE", "getKEY_VIDEO_SHARE_SZIE", "KEY_WEBVIEW_SZIE", "getKEY_WEBVIEW_SZIE", "PERF_NAME", "getPERF_NAME", "SIZE", "getSIZE", "TAG", "getTAG", "WATCH_DURATION", "getWATCH_DURATION", "keepOn", "", "getKeepOn", "()Z", "setKeepOn", "(Z)V", "lastRecordTime", "", "getLastRecordTime", "()J", "setLastRecordTime", "(J)V", "lastStartTime", "getLastStartTime", "setLastStartTime", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "maxSize", "getMaxSize", "setMaxSize", "(I)V", "totalSize", "getTotalSize", "setTotalSize", "totalSizes", "", "getTotalSizes", "()[J", "async", "", "sizeArr", "time", "tSize", "getAddSet", "index", "size", "initStoredSize", "setConfig", "config", "Lcom/ss/android/ugc/traffic/UsageConfig;", "store", "updateApi", "updateImage", "updateMusicDownload", "updateVideoCache", "updateVideoDownload", "updateVideoShare", "updateWebview", "traffic_release"}, k = 1, mv = {1, 1, 15})
public final class a {
    @NotNull
    private static final String A = A;
    private static final int B = B;
    private static boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    static final int f77807a = 7;

    /* renamed from: b  reason: collision with root package name */
    public static final int f77808b = 1;

    /* renamed from: c  reason: collision with root package name */
    static final int f77809c = 2;

    /* renamed from: d  reason: collision with root package name */
    static final int f77810d = 3;

    /* renamed from: e  reason: collision with root package name */
    static final int f77811e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f77812f = 5;
    public static final int g = 6;
    @NotNull
    static final String h = h;
    @NotNull
    static final String i = (A + 0);
    @NotNull
    static final String j = (A + f77808b);
    @NotNull
    static final String k = (A + f77809c);
    @NotNull
    static final String l = (A + f77810d);
    @NotNull
    static final String m = (A + f77811e);
    @NotNull
    static final String n = (A + f77812f);
    @NotNull
    static final String o = (A + g);
    @NotNull
    static final String p = p;
    @NotNull
    static final long[] q = new long[f77807a];
    static long r = 0;
    static volatile long s = 0;
    static volatile long t = 0;
    static final int u = u;
    static final int v = 86400000;
    static int w = (B * 5);
    @NotNull
    static final Object x = new Object();
    public static final a y = new a();
    @NotNull
    private static final String z = z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.traffic.a$a  reason: collision with other inner class name */
    static final class C0828a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f77813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f77814b;

        C0828a(int i, long j) {
            this.f77813a = i;
            this.f77814b = j;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            boolean z2;
            long j;
            long[] jArr = new long[0];
            synchronized (a.x) {
                if (a.b() <= 0 && GlobalContext.getContext() != null) {
                    SharedPreferences a2 = c.a(GlobalContext.getContext(), a.h, 0);
                    a.q[0] = a2.getLong(a.i, 0);
                    a.q[a.f77812f] = a2.getLong(a.n, 0);
                    a.q[a.f77808b] = a2.getLong(a.j, 0);
                    a.q[a.f77810d] = a2.getLong(a.l, 0);
                    a.q[a.f77809c] = a2.getLong(a.k, 0);
                    a.q[a.f77811e] = a2.getLong(a.m, 0);
                    a.q[a.g] = a2.getLong(a.o, 0);
                    long j2 = a2.getLong(a.p, 0);
                    a.s = j2;
                    if (j2 <= 0) {
                        a.s = SystemClock.elapsedRealtime();
                        a2.edit().putLong(a.p, a.s).apply();
                    }
                    a.t = SystemClock.elapsedRealtime();
                    a.r = ArraysKt.sum(a.q);
                }
                long[] a3 = a.a();
                int i = this.f77813a;
                a3[i] = a3[i] + this.f77814b;
                a.a(a.r + this.f77814b);
                z = true;
                if (SystemClock.elapsedRealtime() - a.b() > ((long) a.v)) {
                    a.s = SystemClock.elapsedRealtime();
                    long[] a4 = a.a();
                    jArr = Arrays.copyOf(a4, a4.length);
                    Intrinsics.checkExpressionValueIsNotNull(jArr, "java.util.Arrays.copyOf(this, size)");
                    j = a.b();
                    long[] a5 = a.a();
                    Collection arrayList = new ArrayList(a5.length);
                    int length = a5.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(0);
                    }
                    a.a(0);
                    z2 = false;
                } else {
                    if (SystemClock.elapsedRealtime() - a.t > ((long) a.u)) {
                        a.t = SystemClock.elapsedRealtime();
                        long[] a6 = a.a();
                        jArr = Arrays.copyOf(a6, a6.length);
                        Intrinsics.checkExpressionValueIsNotNull(jArr, "java.util.Arrays.copyOf(this, size)");
                        j = 0;
                        z2 = true;
                    } else {
                        j = 0;
                        z2 = false;
                    }
                    z = false;
                }
            }
            if (z) {
                if (GlobalContext.getContext() != null) {
                    SharedPreferences.Editor edit = c.a(GlobalContext.getContext(), a.h, 0).edit();
                    edit.putLong(a.p, j);
                    edit.putLong(a.i, 0);
                    edit.putLong(a.n, 0);
                    edit.putLong(a.j, 0);
                    edit.putLong(a.l, 0);
                    edit.putLong(a.k, 0);
                    edit.putLong(a.m, 0);
                    edit.putLong(a.o, 0);
                    edit.apply();
                    if (a.r > ((long) a.w)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("api", jArr[0]);
                        jSONObject.put("image", jArr[a.f77812f]);
                        jSONObject.put("video_cache", jArr[a.f77808b]);
                        jSONObject.put("video_download", jArr[a.f77810d]);
                        jSONObject.put("music", jArr[a.f77809c]);
                        jSONObject.put("share", jArr[a.f77811e]);
                        jSONObject.put(f.f34167a, jArr[a.g]);
                        MonitorUtils.monitorCommonLog("data_usage", jSONObject);
                    }
                }
            } else if (z2 && GlobalContext.getContext() != null && jArr.length == a.f77807a) {
                SharedPreferences.Editor edit2 = c.a(GlobalContext.getContext(), a.h, 0).edit();
                edit2.putLong(a.i, jArr[0]);
                edit2.putLong(a.n, jArr[a.f77812f]);
                edit2.putLong(a.j, jArr[a.f77808b]);
                edit2.putLong(a.l, jArr[a.f77810d]);
                edit2.putLong(a.k, jArr[a.f77809c]);
                edit2.putLong(a.m, jArr[a.f77811e]);
                edit2.putLong(a.o, jArr[a.g]);
                edit2.apply();
            }
            return Unit.INSTANCE;
        }
    }

    private a() {
    }

    public static long b() {
        return s;
    }

    @NotNull
    public static long[] a() {
        return q;
    }

    public static void a(long j2) {
        r = j2;
    }

    public final void b(long j2) {
        a(f77809c, j2);
    }

    public final void c(long j2) {
        a(f77810d, j2);
    }

    public static void a(int i2, long j2) {
        if (C && j2 > 0) {
            i.a((Callable<TResult>) new C0828a<TResult>(i2, j2));
        }
    }
}
