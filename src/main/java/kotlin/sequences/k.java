package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ae;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class k<T> implements Sequence<ae<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Sequence<T> f83700a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\f\u001a\u00020\rH\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Iterator<ae<? extends T>>, kotlin.jvm.internal.a.a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<T> f83701a;

        /* renamed from: b  reason: collision with root package name */
        public int f83702b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f83703c;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f83701a.hasNext();
        }

        public final /* synthetic */ Object next() {
            int i = this.f83702b;
            this.f83702b = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            return new ae(i, this.f83701a.next());
        }

        a(k kVar) {
            this.f83703c = kVar;
            this.f83701a = kVar.f83700a.iterator();
        }
    }

    @NotNull
    public final Iterator<ae<T>> iterator() {
        return new a<>(this);
    }

    public k(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "sequence");
        this.f83700a = sequence;
    }
}