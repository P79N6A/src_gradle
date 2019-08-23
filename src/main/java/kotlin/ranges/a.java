package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.c;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public class a implements Iterable<Character>, kotlin.jvm.internal.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0895a f83622d = new C0895a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final char f83623a;

    /* renamed from: b  reason: collision with root package name */
    public final char f83624b;

    /* renamed from: c  reason: collision with root package name */
    public final int f83625c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    /* renamed from: kotlin.ranges.a$a  reason: collision with other inner class name */
    public static final class C0895a {
        private C0895a() {
        }

        public /* synthetic */ C0895a(byte b2) {
            this();
        }

        @NotNull
        public static a a(char c2, char c3, int i) {
            return new a(c2, c3, i);
        }
    }

    public /* synthetic */ Iterator iterator() {
        return new b(this.f83623a, this.f83624b, this.f83625c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f83623a * 31) + this.f83624b) * 31) + this.f83625c;
    }

    public boolean isEmpty() {
        if (this.f83625c > 0) {
            if (this.f83623a > this.f83624b) {
                return true;
            }
            return false;
        } else if (this.f83623a < this.f83624b) {
            return true;
        } else {
            return false;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f83625c > 0) {
            sb = new StringBuilder();
            sb.append(this.f83623a);
            sb.append("..");
            sb.append(this.f83624b);
            sb.append(" step ");
            i = this.f83625c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f83623a);
            sb.append(" downTo ");
            sb.append(this.f83624b);
            sb.append(" step ");
            i = -this.f83625c;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f83625c == r3.f83625c) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.ranges.a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.ranges.a r0 = (kotlin.ranges.a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            char r0 = r2.f83623a
            kotlin.ranges.a r3 = (kotlin.ranges.a) r3
            char r1 = r3.f83623a
            if (r0 != r1) goto L_0x0029
            char r0 = r2.f83624b
            char r1 = r3.f83624b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f83625c
            int r3 = r3.f83625c
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            return r3
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.a.equals(java.lang.Object):boolean");
    }

    public a(char c2, char c3, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f83623a = c2;
            this.f83624b = (char) c.a((int) c2, (int) c3, i);
            this.f83625c = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
