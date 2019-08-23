package com.ss.android.ugc.aweme.v;

import com.bytedance.retrofit2.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR-\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR\u001a\u0010\"\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\n¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/monitor/ApiRetrofitMetrics;", "Lcom/bytedance/retrofit2/RetrofitMetrics;", "appCallStart", "", "getInterceptorChain", "(JJ)V", "endTime", "getEndTime", "()J", "setEndTime", "(J)V", "interceptorDurations", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getInterceptorDurations", "()Ljava/util/HashMap;", "interceptorsAfterTotalTime", "getInterceptorsAfterTotalTime", "setInterceptorsAfterTotalTime", "lastInterceptorEndTime", "getLastInterceptorEndTime", "setLastInterceptorEndTime", "lastInterceptorName", "getLastInterceptorName", "()Ljava/lang/String;", "setLastInterceptorName", "(Ljava/lang/String;)V", "lastInterceptorTime", "getLastInterceptorTime", "setLastInterceptorTime", "parseResponseDuration", "getParseResponseDuration", "setParseResponseDuration", "parseResponseTime", "getParseResponseTime", "setParseResponseTime", "addInterceptorDuration", "", "name", "duration", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends o {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f75982c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Long> f75983d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public long f75984e;

    /* renamed from: f  reason: collision with root package name */
    public long f75985f;
    @NotNull
    public String g = "";
    public long h;
    public long i;
    public long j;
    public long k;

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75982c, false, 59757, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f75982c, false, 59757, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.g = str2;
    }

    public b(long j2, long j3) {
        super(j2, j3);
    }

    public final void a(@NotNull String str, long j2) {
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3)}, this, f75982c, false, 59758, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j3)}, this, f75982c, false, 59758, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "name");
        Long l = this.f75983d.get(str);
        if (l == null) {
            l = 0L;
        }
        Intrinsics.checkExpressionValueIsNotNull(l, "interceptorDurations.get(name) ?: 0");
        this.f75983d.put(str, Long.valueOf(l.longValue() + j3));
    }
}
