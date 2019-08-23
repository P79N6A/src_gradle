package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0006J\u0015\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010 J'\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010\"J9\u0010#\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\t2\u0006\u0010\u0014\u001a\u0002H\u00012\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "[Ljava/lang/Object;", "getCapacity", "()I", "<set-?>", "size", "getSize", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "fill", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class at<T> extends d<T> implements RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f83435b;

    /* renamed from: c  reason: collision with root package name */
    public int f83436c;

    /* renamed from: d  reason: collision with root package name */
    public int f83437d;

    /* renamed from: e  reason: collision with root package name */
    public final int f83438e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "count", "", "index", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ at f83439a;

        /* renamed from: b  reason: collision with root package name */
        private int f83440b;

        /* renamed from: c  reason: collision with root package name */
        private int f83441c;

        /* access modifiers changed from: protected */
        public final void a() {
            if (this.f83440b == 0) {
                b();
                return;
            }
            a(this.f83439a.f83435b[this.f83441c]);
            this.f83441c = (this.f83441c + 1) % this.f83439a.f83438e;
            this.f83440b--;
        }

        a(at atVar) {
            this.f83439a = atVar;
            this.f83440b = atVar.size();
            this.f83441c = atVar.f83436c;
        }
    }

    public final int a() {
        return this.f83437d;
    }

    @NotNull
    public final Iterator<T> iterator() {
        return new a<>(this);
    }

    public final boolean b() {
        if (size() == this.f83438e) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final T get(int i) {
        d.a.a(i, size());
        return this.f83435b[(this.f83436c + i) % this.f83438e];
    }

    public at(int i) {
        boolean z;
        this.f83438e = i;
        if (this.f83438e >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f83435b = new Object[this.f83438e];
            return;
        }
        throw new IllegalArgumentException(("ring buffer capacity should not be negative but it is " + this.f83438e).toString());
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f83436c;
                int i3 = (i2 + i) % this.f83438e;
                if (i2 > i3) {
                    a(this.f83435b, null, i2, this.f83438e);
                    a(this.f83435b, null, 0, i3);
                } else {
                    a(this.f83435b, null, i2, i3);
                }
                this.f83436c = i3;
                this.f83437d = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    @NotNull
    public final <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            Intrinsics.checkExpressionValueIsNotNull(tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = this.f83436c;
        int i3 = 0;
        while (i3 < size && i2 < this.f83438e) {
            tArr[i3] = this.f83435b[i2];
            i3++;
            i2++;
        }
        while (i3 < size) {
            tArr[i3] = this.f83435b[i];
            i3++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private static <T> void a(@NotNull T[] tArr, T t, int i, int i2) {
        while (i < i2) {
            tArr[i] = null;
            i++;
        }
    }
}
