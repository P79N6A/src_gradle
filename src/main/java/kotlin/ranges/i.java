package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "(III)V", "finalElement", "hasNext", "", "next", "getStep", "()I", "nextInt", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class i extends IntIterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f83638a;

    /* renamed from: b  reason: collision with root package name */
    private final int f83639b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f83640c;

    /* renamed from: d  reason: collision with root package name */
    private int f83641d;

    public final boolean hasNext() {
        return this.f83640c;
    }

    public final int nextInt() {
        int i = this.f83641d;
        if (i != this.f83639b) {
            this.f83641d += this.f83638a;
        } else if (this.f83640c) {
            this.f83640c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public i(int i, int i2, int i3) {
        this.f83638a = i3;
        this.f83639b = i2;
        boolean z = false;
        if (this.f83638a <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f83640c = z;
        this.f83641d = !this.f83640c ? this.f83639b : i;
    }
}
