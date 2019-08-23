package kotlinx.coroutines.android;

import android.support.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-android"}, k = 1, mv = {1, 1, 13})
public final class AndroidExceptionPreHandler extends a implements CoroutineExceptionHandler {
    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f83784a);
    }

    public final void handleException(@NotNull e eVar, @NotNull Throwable th) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(th, "exception");
        Method method = a.f83801a;
        if (method != null) {
            obj = method.invoke(null, new Object[0]);
        } else {
            obj = null;
        }
        if (!(obj instanceof Thread.UncaughtExceptionHandler)) {
            obj = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
