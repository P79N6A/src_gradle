package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ah;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "(JJJ)V", "finalElement", "hasNext", "", "next", "getStep", "()J", "nextLong", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class j extends ah {

    /* renamed from: a  reason: collision with root package name */
    public final long f83642a;

    /* renamed from: b  reason: collision with root package name */
    private final long f83643b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f83644c;

    /* renamed from: d  reason: collision with root package name */
    private long f83645d;

    public final boolean hasNext() {
        return this.f83644c;
    }

    public final long a() {
        long j = this.f83645d;
        if (j != this.f83643b) {
            this.f83645d += this.f83642a;
        } else if (this.f83644c) {
            this.f83644c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public j(long j, long j2, long j3) {
        this.f83642a = j3;
        this.f83643b = j2;
        boolean z = false;
        if (this.f83642a <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f83644c = z;
        this.f83645d = !this.f83644c ? this.f83643b : j;
    }
}
