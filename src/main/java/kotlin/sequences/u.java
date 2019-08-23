package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class u<T> implements Sequence<T>, e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence<T> f83738a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83739b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TakeSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Iterator<T>, kotlin.jvm.internal.a.a {

        /* renamed from: a  reason: collision with root package name */
        public int f83740a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final Iterator<T> f83741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f83742c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f83740a <= 0 || !this.f83741b.hasNext()) {
                return false;
            }
            return true;
        }

        public final T next() {
            if (this.f83740a != 0) {
                this.f83740a--;
                return this.f83741b.next();
            }
            throw new NoSuchElementException();
        }

        a(u uVar) {
            this.f83742c = uVar;
            this.f83740a = uVar.f83739b;
            this.f83741b = uVar.f83738a.iterator();
        }
    }

    @NotNull
    public final Iterator<T> iterator() {
        return new a<>(this);
    }

    @NotNull
    public final Sequence<T> a(int i) {
        if (i >= this.f83739b) {
            return SequencesKt.emptySequence();
        }
        return new t<>(this.f83738a, i, this.f83739b);
    }

    @NotNull
    public final Sequence<T> b(int i) {
        if (i >= this.f83739b) {
            return this;
        }
        return new u<>(this.f83738a, i);
    }

    public u(@NotNull Sequence<? extends T> sequence, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        this.f83738a = sequence;
        this.f83739b = i;
        if (this.f83739b >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.f83739b + '.').toString());
        }
    }
}
