package com.bytedance.jedi.arch;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"SMART_MAIN", "Lcom/bytedance/jedi/arch/SmartHandlerScheduler;", "getSMART_MAIN", "()Lcom/bytedance/jedi/arch/SmartHandlerScheduler;", "main", "", "getMain", "()Z", "arch_release"}, k = 2, mv = {1, 1, 15})
public final class w {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final v f21429a = new v(new Handler(Looper.getMainLooper()), false);

    @NotNull
    public static final v a() {
        return f21429a;
    }

    public static final boolean b() {
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        if (currentThread == mainLooper.getThread()) {
            return true;
        }
        return false;
    }
}
