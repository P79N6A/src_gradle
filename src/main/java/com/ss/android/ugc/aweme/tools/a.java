package com.ss.android.ugc.aweme.tools;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/AVExecutor;", "", "()V", "draftExecutor", "Ljava/util/concurrent/ExecutorService;", "getDraftExecutor", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74593a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f74594b;

    private a() {
    }

    @NotNull
    public static ExecutorService a() {
        return f74594b;
    }

    static {
        ExecutorService a2 = h.a(m.a(p.SERIAL).a("draft-executor").a());
        Intrinsics.checkExpressionValueIsNotNull(a2, "ThreadPoolHelper.createE…                .build())");
        f74594b = a2;
    }
}
