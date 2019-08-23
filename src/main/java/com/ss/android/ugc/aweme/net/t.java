package com.ss.android.ugc.aweme.net;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\t2\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000fJ\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/net/NetMonitor;", "", "()V", "DEFAULT", "", "mFeedReqTime", "", "mMaxCount", "monitorFeedTime", "", "time", "abKey", "", "monitorRetrofitMap", "map", "", "recordFeedReqTime", "recordFeedSuccess", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57012a;

    /* renamed from: b  reason: collision with root package name */
    public static int f57013b = 30;

    /* renamed from: c  reason: collision with root package name */
    public static final t f57014c = new t();

    /* renamed from: d  reason: collision with root package name */
    private static long f57015d;

    private t() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57012a, false, 60754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57012a, false, 60754, new Class[0], Void.TYPE);
            return;
        }
        f57015d = SystemClock.uptimeMillis();
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f57012a, false, 60755, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f57012a, false, 60755, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "abKey");
        a(SystemClock.uptimeMillis() - f57015d, str2);
    }

    private final void a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, f57012a, false, 60756, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, f57012a, false, 60756, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("first_feed_duration", j2);
            jSONObject.put("is_ab_test", str2);
        } catch (JSONException unused) {
        }
        n.b("first_feed_duration", "", jSONObject);
    }
}
