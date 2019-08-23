package kotlinx.coroutines.internal;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.l;
import kotlin.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00052\u0006\u0010\t\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"0\u0010\u0002\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00060\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionConstructors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final ReentrantReadWriteLock f83922a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f83923b = new WeakHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 1, 13})
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            Intrinsics.checkExpressionValueIsNotNull(constructor, AdvanceSetting.NETWORK_TYPE);
            Constructor constructor2 = (Constructor) t;
            Intrinsics.checkExpressionValueIsNotNull(constructor2, AdvanceSetting.NETWORK_TYPE);
            return ComparisonsKt.compareValues(Integer.valueOf(constructor.getParameterTypes().length), Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "E", "", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function1<Throwable, E> {
        final /* synthetic */ Constructor $constructor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Constructor constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Nullable
        public final E invoke(@NotNull Throwable th) {
            E e2;
            Intrinsics.checkParameterIsNotNull(th, "e");
            try {
                Object newInstance = this.$constructor.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    e2 = l.m673constructorimpl((Throwable) newInstance);
                    if (l.m678isFailureimpl(e2)) {
                        e2 = null;
                    }
                    return (Throwable) e2;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e2 = l.m673constructorimpl(m.a(th2));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "E", "", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function1<Throwable, E> {
        final /* synthetic */ Constructor $constructor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Constructor constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Nullable
        public final E invoke(@NotNull Throwable th) {
            E e2;
            Intrinsics.checkParameterIsNotNull(th, "e");
            try {
                Object newInstance = this.$constructor.newInstance(new Object[]{th});
                if (newInstance != null) {
                    e2 = l.m673constructorimpl((Throwable) newInstance);
                    if (l.m678isFailureimpl(e2)) {
                        e2 = null;
                    }
                    return (Throwable) e2;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e2 = l.m673constructorimpl(m.a(th2));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "E", "", "e", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function1<Throwable, E> {
        final /* synthetic */ Constructor $constructor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Constructor constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Nullable
        public final E invoke(@NotNull Throwable th) {
            E e2;
            Intrinsics.checkParameterIsNotNull(th, "e");
            try {
                Object newInstance = this.$constructor.newInstance(new Object[0]);
                if (newInstance != null) {
                    e2 = l.m673constructorimpl((Throwable) newInstance);
                    if (l.m678isFailureimpl(e2)) {
                        e2 = null;
                    }
                    E e3 = (Throwable) e2;
                    if (e3 == null) {
                        return null;
                    }
                    e3.initCause(th);
                    return e3;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e2 = l.m673constructorimpl(m.a(th2));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class e extends Lambda implements Function1 {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Nullable
        public final Void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            return null;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @org.jetbrains.annotations.Nullable
    public static final <E extends java.lang.Throwable> E a(@org.jetbrains.annotations.NotNull E r9) {
        /*
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f83922a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r1 = f83923b     // Catch:{ all -> 0x00fb }
            java.lang.Class r2 = r9.getClass()     // Catch:{ all -> 0x00fb }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00fb }
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch:{ all -> 0x00fb }
            r0.unlock()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0026:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r1 = "exception.javaClass.constructors"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            kotlinx.coroutines.internal.f$a r1 = new kotlinx.coroutines.internal.f$a
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r0 = kotlin.collections.ArraysKt.sortedWith((T[]) r0, (java.util.Comparator<? super T>) r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0042:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r4 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            java.lang.Class[] r4 = r1.getParameterTypes()
            int r5 = r4.length
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L_0x007a
            r5 = r4[r3]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x007a
            r5 = r4[r7]
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x007a
            kotlinx.coroutines.internal.f$b r0 = new kotlinx.coroutines.internal.f$b
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L_0x00a4
        L_0x007a:
            int r5 = r4.length
            if (r5 != r7) goto L_0x008f
            r5 = r4[r3]
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x008f
            kotlinx.coroutines.internal.f$c r0 = new kotlinx.coroutines.internal.f$c
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L_0x00a4
        L_0x008f:
            java.lang.String r5 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            int r4 = r4.length
            if (r4 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            if (r7 == 0) goto L_0x0042
            kotlinx.coroutines.internal.f$d r0 = new kotlinx.coroutines.internal.f$d
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L_0x00a4
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f83922a
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r5 = r1.getWriteHoldCount()
            if (r5 != 0) goto L_0x00b5
            int r5 = r1.getReadHoldCount()
            goto L_0x00b6
        L_0x00b5:
            r5 = 0
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            if (r6 >= r5) goto L_0x00bf
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x00b7
        L_0x00bf:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>> r6 = f83923b     // Catch:{ all -> 0x00ee }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x00ee }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x00ee }
            if (r0 != 0) goto L_0x00d5
            kotlinx.coroutines.internal.f$e r8 = kotlinx.coroutines.internal.f.e.INSTANCE     // Catch:{ all -> 0x00ee }
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8     // Catch:{ all -> 0x00ee }
            goto L_0x00d6
        L_0x00d5:
            r8 = r0
        L_0x00d6:
            r6.put(r7, r8)     // Catch:{ all -> 0x00ee }
        L_0x00d9:
            if (r3 >= r5) goto L_0x00e1
            r4.lock()
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x00e1:
            r1.unlock()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r9 = r0.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x00ed:
            return r2
        L_0x00ee:
            r9 = move-exception
        L_0x00ef:
            if (r3 >= r5) goto L_0x00f7
            r4.lock()
            int r3 = r3 + 1
            goto L_0x00ef
        L_0x00f7:
            r1.unlock()
            throw r9
        L_0x00fb:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.f.a(java.lang.Throwable):java.lang.Throwable");
    }
}
