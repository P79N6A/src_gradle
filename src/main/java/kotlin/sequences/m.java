package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a.a;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010#J\u001f\u0010$\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010&R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "nextIterator", "nextStep", "getNextStep", "()Lkotlin/coroutines/Continuation;", "setNextStep", "(Lkotlin/coroutines/Continuation;)V", "nextValue", "Ljava/lang/Object;", "state", "", "Lkotlin/sequences/State;", "exceptionalState", "", "hasNext", "", "next", "()Ljava/lang/Object;", "nextNotReady", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "yield", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class m<T> extends n<T> implements Iterator<T>, c<Unit>, a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public c<? super Unit> f83710a;

    /* renamed from: b  reason: collision with root package name */
    private int f83711b;

    /* renamed from: c  reason: collision with root package name */
    private T f83712c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<? extends T> f83713d;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final e getContext() {
        return f.INSTANCE;
    }

    private final Throwable a() {
        switch (this.f83711b) {
            case 4:
                return new NoSuchElementException();
            case 5:
                return new IllegalStateException("Iterator has failed.");
            default:
                return new IllegalStateException("Unexpected state of the iterator: " + this.f83711b);
        }
    }

    public final T next() {
        do {
            switch (this.f83711b) {
                case 0:
                case 1:
                    break;
                case 2:
                    this.f83711b = 1;
                    Iterator<? extends T> it2 = this.f83713d;
                    if (it2 == null) {
                        Intrinsics.throwNpe();
                    }
                    return it2.next();
                case 3:
                    this.f83711b = 0;
                    T t = this.f83712c;
                    this.f83712c = null;
                    return t;
                default:
                    throw a();
            }
        } while (hasNext());
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        while (true) {
            switch (this.f83711b) {
                case 0:
                    break;
                case 1:
                    Iterator<? extends T> it2 = this.f83713d;
                    if (it2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!it2.hasNext()) {
                        this.f83713d = null;
                        break;
                    } else {
                        this.f83711b = 2;
                        return true;
                    }
                case 2:
                case 3:
                    return true;
                case 4:
                    return false;
                default:
                    throw a();
            }
            this.f83711b = 5;
            c<? super Unit> cVar = this.f83710a;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            this.f83710a = null;
            cVar.resumeWith(l.m673constructorimpl(Unit.INSTANCE));
        }
    }

    public final void resumeWith(@NotNull Object obj) {
        this.f83711b = 4;
    }

    @Nullable
    public final Object a(T t, @NotNull c<? super Unit> cVar) {
        this.f83712c = t;
        this.f83711b = 3;
        this.f83710a = cVar;
        Object a2 = b.a();
        if (a2 == b.a()) {
            g.b(cVar);
        }
        return a2;
    }

    @Nullable
    public final Object a(@NotNull Iterator<? extends T> it2, @NotNull c<? super Unit> cVar) {
        if (!it2.hasNext()) {
            return Unit.INSTANCE;
        }
        this.f83713d = it2;
        this.f83711b = 2;
        this.f83710a = cVar;
        Object a2 = b.a();
        if (a2 == b.a()) {
            g.b(cVar);
        }
        return a2;
    }
}
