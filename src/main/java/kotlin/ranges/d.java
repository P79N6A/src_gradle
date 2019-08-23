package kotlin.ranges;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class d implements f<Double> {

    /* renamed from: a  reason: collision with root package name */
    private final double f83632a;

    /* renamed from: b  reason: collision with root package name */
    private final double f83633b;

    public final /* synthetic */ Comparable getEndInclusive() {
        return Double.valueOf(this.f83633b);
    }

    public final /* synthetic */ Comparable getStart() {
        return Double.valueOf(this.f83632a);
    }

    public final boolean isEmpty() {
        if (this.f83632a > this.f83633b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.f83632a).hashCode() * 31) + Double.valueOf(this.f83633b).hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f83632a + ".." + this.f83633b;
    }

    public final /* synthetic */ boolean contains(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        if (doubleValue < this.f83632a || doubleValue > this.f83633b) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r5.f83633b == r6.f83633b) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.ranges.d
            if (r0 == 0) goto L_0x0027
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.ranges.d r0 = (kotlin.ranges.d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
        L_0x0013:
            double r0 = r5.f83632a
            kotlin.ranges.d r6 = (kotlin.ranges.d) r6
            double r2 = r6.f83632a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            double r0 = r5.f83633b
            double r2 = r6.f83633b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
        L_0x0025:
            r6 = 1
            return r6
        L_0x0027:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.d.equals(java.lang.Object):boolean");
    }

    public d(double d2, double d3) {
        this.f83632a = d2;
        this.f83633b = d3;
    }

    public final /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue()) {
            return true;
        }
        return false;
    }
}
