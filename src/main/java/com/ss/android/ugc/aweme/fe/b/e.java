package com.ss.android.ugc.aweme.fe.b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.crossplatform.params.c;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010J \u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J*\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J,\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015J \u0010\f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010J4\u0010\f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J>\u0010\f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004J \u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/utils/RnMonitor;", "", "()V", "CHANNEL_NAME", "", "ERROR", "ERROR_DESC", "MODULE_NAME", "MSG_TYPE", "NORMAL", "TAG", "WARNING", "log", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tag", "channelName", "moduleName", "extraParams", "", "type", "logTime", "key", "time", "", "rnInfo", "Lcom/ss/android/ugc/aweme/crossplatform/params/RnInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44416a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f44417b = new e();

    private e() {
    }

    public final void a(@Nullable Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f44416a, false, 39903, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f44416a, false, 39903, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a("error", exc2);
    }

    public final void a(@Nullable String str, @Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{str, exc}, this, f44416a, false, 39905, new Class[]{String.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, exc}, this, f44416a, false, 39905, new Class[]{String.class, Exception.class}, Void.TYPE);
            return;
        }
        a(str, exc, null, null, null);
    }

    public final void a(@NotNull String str, long j, @Nullable c cVar) {
        String str2;
        String str3 = str;
        long j2 = j;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), cVar2}, this, f44416a, false, 39910, new Class[]{String.class, Long.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), cVar2}, this, f44416a, false, 39910, new Class[]{String.class, Long.TYPE, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "key");
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a(str3, Long.valueOf(j));
        String str4 = null;
        if (cVar2 != null) {
            str2 = cVar.a();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.d.c a3 = a2.a("channel_name", str2);
        if (cVar2 != null) {
            str4 = cVar2.f40821f;
        }
        n.a("aweme_rn_performance", a3.a("module_name", str4).b());
    }

    public final void a(@Nullable String str, @Nullable Exception exc, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        String str5 = str;
        String str6 = str3;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, exc, null, str6, str7}, this, f44416a, false, 39909, new Class[]{String.class, Exception.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str5, exc, null, str6, str7};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f44416a, false, 39909, new Class[]{String.class, Exception.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        CharSequence charSequence = str5;
        if (!TextUtils.isEmpty(charSequence)) {
            a2.a("msg_type", str5);
        }
        if (exc != null) {
            a2.a("error_desc", Log.getStackTraceString(exc));
        }
        if (!TextUtils.isEmpty(null)) {
            a2.a("tag", (String) null);
        }
        if (!TextUtils.isEmpty(str6)) {
            a2.a("channel_name", str6);
        }
        if (!TextUtils.isEmpty(str7)) {
            a2.a("module_name", str7);
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "build");
        if (!a2.f34112b.isEmpty()) {
            n.a("aweme_rn_log", a2.b());
            if (TextUtils.equals(charSequence, "error")) {
                Throwable th = exc;
                a.a((Throwable) new h(th));
                ExceptionMonitor.ensureNotReachHere(th, "aweme_rn_log");
            }
        }
    }
}
