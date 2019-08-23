package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public abstract class a implements Serializable, c<Object>, e {
    @Nullable
    private final c<Object> completion;

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    @Nullable
    public final c<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public e getCallerFrame() {
        c<Object> cVar = this.completion;
        if (!(cVar instanceof e)) {
            cVar = null;
        }
        return (e) cVar;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement getStackTraceElement() {
        /*
            r8 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<kotlin.coroutines.jvm.internal.DebugMetadata> r1 = kotlin.coroutines.jvm.internal.DebugMetadata.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            kotlin.coroutines.jvm.internal.DebugMetadata r0 = (kotlin.coroutines.jvm.internal.DebugMetadata) r0
            r1 = 0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            int r2 = r0.a()
            r3 = 1
            if (r2 > r3) goto L_0x009e
            int r2 = kotlin.coroutines.jvm.internal.f.a(r8)
            if (r2 >= 0) goto L_0x0024
            r2 = -1
            goto L_0x002a
        L_0x0024:
            int[] r3 = r0.c()
            r2 = r3[r2]
        L_0x002a:
            kotlin.coroutines.jvm.internal.h r3 = kotlin.coroutines.jvm.internal.h.f83531c
            java.lang.String r3 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r3)
            kotlin.coroutines.jvm.internal.h$a r3 = kotlin.coroutines.jvm.internal.h.f83530b
            if (r3 != 0) goto L_0x0039
            kotlin.coroutines.jvm.internal.h$a r3 = kotlin.coroutines.jvm.internal.h.a(r8)
        L_0x0039:
            kotlin.coroutines.jvm.internal.h$a r4 = kotlin.coroutines.jvm.internal.h.f83529a
            if (r3 != r4) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            java.lang.reflect.Method r4 = r3.f83532a
            if (r4 == 0) goto L_0x0071
            java.lang.Class r5 = r8.getClass()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r4.invoke(r5, r7)
            if (r4 != 0) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            java.lang.reflect.Method r5 = r3.f83533b
            if (r5 == 0) goto L_0x0071
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r5.invoke(r4, r7)
            if (r4 != 0) goto L_0x005d
            goto L_0x0071
        L_0x005d:
            java.lang.reflect.Method r3 = r3.f83534c
            if (r3 == 0) goto L_0x0068
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Object r3 = r3.invoke(r4, r5)
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = r3
        L_0x006f:
            java.lang.String r1 = (java.lang.String) r1
        L_0x0071:
            if (r1 != 0) goto L_0x0078
            java.lang.String r1 = r0.e()
            goto L_0x0090
        L_0x0078:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.e()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x0090:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.d()
            java.lang.String r0 = r0.b()
            r3.<init>(r1, r4, r0, r2)
            return r3
        L_0x009e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.a.getStackTraceElement():java.lang.StackTraceElement");
    }

    public a(@Nullable c<Object> cVar) {
        this.completion = cVar;
    }

    @NotNull
    public c<Unit> create(@NotNull c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public final void resumeWith(@NotNull Object obj) {
        c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            Intrinsics.checkParameterIsNotNull(aVar, "frame");
            c cVar2 = aVar.completion;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != b.a()) {
                    obj = l.m673constructorimpl(invokeSuspend);
                    aVar.a();
                    if (cVar2 instanceof a) {
                        cVar = cVar2;
                    } else {
                        cVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = l.m673constructorimpl(m.a(th));
            }
        }
    }

    @NotNull
    public c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
