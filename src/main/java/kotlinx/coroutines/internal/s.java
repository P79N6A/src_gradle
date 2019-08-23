package kotlinx.coroutines.internal;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.ai;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a9\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u0002H\u00052\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002¢\u0006\u0002\u0010\f\u001a\u001e\u0010\r\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002\u001a1\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0010\u0010\b\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\nH\u0002¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006HHø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a+\u0010\u001a\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0002¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001c\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u00052\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0000¢\u0006\u0002\u0010\u001f\u001a\u001f\u0010 \u001a\u00020!\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0002¢\u0006\u0002\u0010\"\u001a\u0018\u0010#\u001a\u00060\u0001j\u0002`\u000b2\n\u0010$\u001a\u00060\u0001j\u0002`\u000bH\u0007\u001a\u001f\u0010%\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0018\u001a\u0002H\u0005H\u0000¢\u0006\u0002\u0010\u001d\u001a1\u0010&\u001a\u0018\u0012\u0004\u0012\u0002H\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00140'\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002¢\u0006\u0002\u0010(\u001a\u001c\u0010)\u001a\u00020!*\u00060\u0001j\u0002`\u000b2\n\u0010*\u001a\u00060\u0001j\u0002`\u000bH\u0002\u001a#\u0010+\u001a\u00020,*\f\u0012\b\u0012\u00060\u0001j\u0002`\u000b0\u00142\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020!*\u00060\u0001j\u0002`\u000bH\u0000\u001a\u001b\u00100\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0006*\u0002H\u0005H\u0002¢\u0006\u0002\u0010\u001d*\f\b\u0000\u00101\"\u00020\u000f2\u00020\u000f*\f\b\u0000\u00102\"\u00020\u00012\u00020\u0001\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"artificialFrame", "Ljava/lang/StackTraceElement;", "message", "", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "Lkotlinx/coroutines/internal/StackTraceElement;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "recoveryDisabled", "", "(Ljava/lang/Throwable;)Z", "sanitize", "element", "unwrap", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class s {
    private static final ArrayDeque<StackTraceElement> a(e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(a(stackTraceElement));
        }
        while (true) {
            if (!(eVar instanceof e)) {
                eVar = null;
            }
            if (eVar == null) {
                break;
            }
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(a(stackTraceElement2));
            }
        }
        return arrayDeque;
    }

    private static final boolean a(@NotNull StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.areEqual((Object) stackTraceElement.getMethodName(), (Object) stackTraceElement2.getMethodName()) && Intrinsics.areEqual((Object) stackTraceElement.getFileName(), (Object) stackTraceElement2.getFileName()) && Intrinsics.areEqual((Object) stackTraceElement.getClassName(), (Object) stackTraceElement2.getClassName());
    }

    private static final void a(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (b(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                Intrinsics.checkExpressionValueIsNotNull(last, "result.last");
                if (a(stackTraceElement, last)) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    private static boolean b(@NotNull StackTraceElement stackTraceElement) {
        Intrinsics.checkParameterIsNotNull(stackTraceElement, "receiver$0");
        String className = stackTraceElement.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className, "className");
        return StringsKt.startsWith$default(className, "\b\b\b", false, 2, null);
    }

    @NotNull
    @InternalCoroutinesApi
    private static StackTraceElement a(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    public static final <E extends Throwable> boolean b(E e2) {
        if (!ai.f83796b || !ai.f83795a || (e2 instanceof CancellationException) || (e2 instanceof o)) {
            return true;
        }
        return false;
    }

    @NotNull
    @InternalCoroutinesApi
    private static StackTraceElement a(@NotNull StackTraceElement stackTraceElement) {
        Intrinsics.checkParameterIsNotNull(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className, "element.className");
        if (!StringsKt.contains$default((CharSequence) className, '/', false, 2, (Object) null)) {
            return stackTraceElement;
        }
        String className2 = stackTraceElement.getClassName();
        Intrinsics.checkExpressionValueIsNotNull(className2, "element.className");
        return new StackTraceElement(StringsKt.replace$default(className2, '/', '.', false, 4, (Object) null), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    private static final <E extends Throwable> Pair<E, StackTraceElement[]> c(@NotNull E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !Intrinsics.areEqual((Object) cause.getClass(), (Object) e2.getClass())) {
            return TuplesKt.to(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "currentTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, AdvanceSetting.NETWORK_TYPE);
            if (b(stackTraceElement)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return TuplesKt.to(cause, stackTrace);
        }
        return TuplesKt.to(e2, new StackTraceElement[0]);
    }

    @NotNull
    public static final <E extends Throwable> E a(@NotNull E e2) {
        Intrinsics.checkParameterIsNotNull(e2, "exception");
        if (b(e2)) {
            return e2;
        }
        Throwable cause = e2.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!Intrinsics.areEqual((Object) cause.getClass(), (Object) e2.getClass()))) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                Intrinsics.checkExpressionValueIsNotNull(stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    Intrinsics.checkExpressionValueIsNotNull(stackTraceElement, AdvanceSetting.NETWORK_TYPE);
                    if (b(stackTraceElement)) {
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return e2;
                }
                E cause2 = e2.getCause();
                if (!(cause2 instanceof Throwable)) {
                    cause2 = null;
                }
                if (cause2 != null) {
                    e2 = cause2;
                }
                return e2;
            }
        }
        return e2;
    }

    private static final int a(@NotNull StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.areEqual((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    @NotNull
    public static final <E extends Throwable> E a(@NotNull E e2, @NotNull c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(e2, "exception");
        Intrinsics.checkParameterIsNotNull(cVar, "continuation");
        if (b(e2) || !(cVar instanceof e)) {
            return e2;
        }
        return a(e2, (e) cVar);
    }

    public static final <E extends Throwable> E a(E e2, e eVar) {
        Pair c2 = c(e2);
        E e3 = (Throwable) c2.component1();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c2.component2();
        Throwable a2 = f.a(e3);
        if (a2 == null) {
            return e2;
        }
        ArrayDeque a3 = a(eVar);
        if (a3.isEmpty()) {
            return e2;
        }
        if (e3 != e2) {
            a(stackTraceElementArr, a3);
        }
        return a(e3, a2, a3);
    }

    private static final <E extends Throwable> E a(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(a("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        Intrinsics.checkExpressionValueIsNotNull(stackTrace, "causeTrace");
        int a2 = a(stackTrace, "kotlin.coroutines.jvm.internal.BaseContinuationImpl");
        int i = 0;
        if (a2 == -1) {
            Collection collection = arrayDeque;
            if (collection != null) {
                Object[] array = collection.toArray(new StackTraceElement[0]);
                if (array != null) {
                    e3.setStackTrace((StackTraceElement[]) array);
                    return e3;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + a2)];
        for (int i2 = 0; i2 < a2; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[a2 + i] = stackTraceElement;
            i++;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }
}
