package com.ss.android.ugc.aweme.f;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.aa;
import kotlinx.coroutines.android.b;
import kotlinx.coroutines.android.c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014\"\u001a\u0010\u0000\u001a\u00020\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"FastImmediate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getFastImmediate", "()Lkotlinx/coroutines/CoroutineDispatcher;", "setFastImmediate", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "FastMain", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getFastMain", "()Lkotlinx/coroutines/android/HandlerDispatcher;", "setFastMain", "(Lkotlinx/coroutines/android/HandlerDispatcher;)V", "asHandler", "Landroid/os/Handler;", "Landroid/os/Looper;", "async", "", "postInCoroutine", "", "Landroid/view/View;", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43884a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static c f43885b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static aa f43886c = new C0549a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/coroutine/CoroutineExtentionKt$FastImmediate$1", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.f.a$a  reason: collision with other inner class name */
    public static final class C0549a extends aa {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43887a;

        public final boolean a(@NotNull e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f43887a, false, 34092, new Class[]{e.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar2}, this, f43887a, false, 34092, new Class[]{e.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "context");
            return false;
        }

        C0549a() {
        }

        public final void a(@NotNull e eVar, @NotNull Runnable runnable) {
            e eVar2 = eVar;
            Runnable runnable2 = runnable;
            if (PatchProxy.isSupport(new Object[]{eVar2, runnable2}, this, f43887a, false, 34091, new Class[]{e.class, Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2, runnable2}, this, f43887a, false, 34091, new Class[]{e.class, Runnable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "context");
            Intrinsics.checkParameterIsNotNull(runnable2, "block");
            runnable.run();
        }
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
        Handler a2 = a(mainLooper, true);
        Intrinsics.checkParameterIsNotNull(a2, "receiver$0");
        f43885b = new b(a2, "fast-main");
    }

    @NotNull
    private static Handler a(@NotNull Looper looper, boolean z) {
        Looper looper2 = looper;
        if (PatchProxy.isSupport(new Object[]{looper2, (byte) 1}, null, f43884a, true, 34090, new Class[]{Looper.class, Boolean.TYPE}, Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[]{looper2, (byte) 1}, null, f43884a, true, 34090, new Class[]{Looper.class, Boolean.TYPE}, Handler.class);
        }
        Intrinsics.checkParameterIsNotNull(looper2, "$this$asHandler");
        if (Build.VERSION.SDK_INT < 16) {
            return new Handler(looper2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper2});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            Constructor<Handler> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE});
            Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Handler newInstance = declaredConstructor.newInstance(new Object[]{looper2, null, Boolean.TRUE});
            Intrinsics.checkExpressionValueIsNotNull(newInstance, "constructor.newInstance(this, null, true)");
            return newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper2);
        }
    }
}
