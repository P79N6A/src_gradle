package com.ss.android.ugc.aweme.i18n;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import java.lang.Thread;
import org.json.JSONObject;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29721a;

    /* renamed from: b  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f29722b;

    /* renamed from: c  reason: collision with root package name */
    private long f29723c = Looper.getMainLooper().getThread().getId();

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29722b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{thread, th}, this, f29721a, false, 49938, new Class[]{Thread.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{thread, th}, this, f29721a, false, 49938, new Class[]{Thread.class, Throwable.class}, Void.TYPE);
        } else if (!(th instanceof IllegalStateException) || thread == null || thread.getId() == this.f29723c || th.getMessage() == null || !"Results have already been set".equals(th.getMessage().trim())) {
            if (this.f29722b != null) {
                this.f29722b.uncaughtException(thread, th);
            }
        } else {
            n.a("gms_crash_results_have_already_been_set", (JSONObject) null);
        }
    }
}
