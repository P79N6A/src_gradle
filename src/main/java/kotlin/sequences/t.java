package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class t<T> implements Sequence<T>, e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence<T> f83732a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83733b;

    /* renamed from: c  reason: collision with root package name */
    public final int f83734c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Iterator<T>, kotlin.jvm.internal.a.a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f83735a;

        /* renamed from: b  reason: collision with root package name */
        public int f83736b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t f83737c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        private final void a() {
            while (this.f83736b < this.f83737c.f83733b && this.f83735a.hasNext()) {
                this.f83735a.next();
                this.f83736b++;
            }
        }

        public final boolean hasNext() {
            a();
            if (this.f83736b >= this.f83737c.f83734c || !this.f83735a.hasNext()) {
                return false;
            }
            return true;
        }

        public final T next() {
            a();
            if (this.f83736b < this.f83737c.f83734c) {
                this.f83736b++;
                return this.f83735a.next();
            }
            throw new NoSuchElementException();
        }

        a(t tVar) {
            this.f83737c = tVar;
            this.f83735a = tVar.f83732a.iterator();
        }
    }

    private final int a() {
        return this.f83734c - this.f83733b;
    }

    @NotNull
    public final Iterator<T> iterator() {
        return new a<>(this);
    }

    @NotNull
    public final Sequence<T> a(int i) {
        if (i >= a()) {
            return SequencesKt.emptySequence();
        }
        return new t<>(this.f83732a, this.f83733b + i, this.f83734c);
    }

    @NotNull
    public final Sequence<T> b(int i) {
        if (i >= a()) {
            return this;
        }
        return new t<>(this.f83732a, this.f83733b, this.f83733b + i);
    }

    public t(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        this.f83732a = sequence;
        this.f83733b = i;
        this.f83734c = i2;
        boolean z3 = false;
        if (this.f83733b >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f83734c >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (!(this.f83734c >= this.f83733b ? true : z3)) {
                    throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + this.f83734c + " < " + this.f83733b).toString());
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + this.f83734c).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + this.f83733b).toString());
    }
}
