package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "id", "", "(J)V", "getId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ad extends kotlin.coroutines.a implements cc<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f83789b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f83790a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class a implements e.c<ad> {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ad) {
                if (this.f83790a == ((ad) obj).f83790a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f83790a;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        return "CoroutineId(" + this.f83790a + ')';
    }

    public ad(long j) {
        super(f83789b);
        this.f83790a = j;
    }

    @Nullable
    public final <E extends e.b> E get(@NotNull e.c<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.a((e.b) this, cVar);
    }

    @NotNull
    public final e minusKey(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.b(this, cVar);
    }

    @NotNull
    public final e plus(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        return e.b.a.a((e.b) this, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r10 == null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(kotlin.coroutines.e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            kotlinx.coroutines.ae$a r0 = kotlinx.coroutines.ae.f83791b
            kotlin.coroutines.e$c r0 = (kotlin.coroutines.e.c) r0
            kotlin.coroutines.e$b r10 = r10.get(r0)
            kotlinx.coroutines.ae r10 = (kotlinx.coroutines.ae) r10
            if (r10 == 0) goto L_0x0015
            java.lang.String r10 = r10.f83792a
            if (r10 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r10 = "coroutine"
        L_0x0017:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = " @"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            int r2 = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) r3, (java.lang.String) r4, (int) r5, (boolean) r6, (int) r7, (java.lang.Object) r8)
            if (r2 >= 0) goto L_0x003c
            int r2 = r1.length()
        L_0x003c:
            int r3 = r10.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r10)
            r10 = 35
            r4.append(r10)
            long r2 = r9.f83790a
            r4.append(r2)
            java.lang.String r10 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r2)
            r0.setName(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ad.a(kotlin.coroutines.e):java.lang.Object");
    }

    public final /* synthetic */ void a(e eVar, Object obj) {
        String str = (String) obj;
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(str, "oldState");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public final <R> R fold(R r, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        return e.b.a.a(this, r, function2);
    }
}
