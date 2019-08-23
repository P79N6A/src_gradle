package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class d implements Sequence<IntRange> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f83758a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83759b;

    /* renamed from: c  reason: collision with root package name */
    public final int f83760c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> f83761d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Iterator<IntRange>, kotlin.jvm.internal.a.a {

        /* renamed from: a  reason: collision with root package name */
        public int f83762a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f83763b;

        /* renamed from: c  reason: collision with root package name */
        public int f83764c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public IntRange f83765d;

        /* renamed from: e  reason: collision with root package name */
        public int f83766e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f83767f;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            if (this.f83762a == -1) {
                a();
            }
            if (this.f83762a == 1) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ Object next() {
            if (this.f83762a == -1) {
                a();
            }
            if (this.f83762a != 0) {
                IntRange intRange = this.f83765d;
                if (intRange != null) {
                    this.f83765d = null;
                    this.f83762a = -1;
                    return intRange;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
            if (r6.f83766e < r6.f83767f.f83760c) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f83764c
                r1 = 0
                if (r0 >= 0) goto L_0x000b
                r6.f83762a = r1
                r0 = 0
                r6.f83765d = r0
                return
            L_0x000b:
                kotlin.text.d r0 = r6.f83767f
                int r0 = r0.f83760c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0020
                int r0 = r6.f83766e
                int r0 = r0 + r3
                r6.f83766e = r0
                int r0 = r6.f83766e
                kotlin.text.d r4 = r6.f83767f
                int r4 = r4.f83760c
                if (r0 >= r4) goto L_0x002c
            L_0x0020:
                int r0 = r6.f83764c
                kotlin.text.d r4 = r6.f83767f
                java.lang.CharSequence r4 = r4.f83758a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0040
            L_0x002c:
                int r0 = r6.f83763b
                kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
                kotlin.text.d r4 = r6.f83767f
                java.lang.CharSequence r4 = r4.f83758a
                int r4 = kotlin.text.StringsKt.getLastIndex(r4)
                r1.<init>(r0, r4)
                r6.f83765d = r1
                r6.f83764c = r2
                goto L_0x0091
            L_0x0040:
                kotlin.text.d r0 = r6.f83767f
                kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r0.f83761d
                kotlin.text.d r4 = r6.f83767f
                java.lang.CharSequence r4 = r4.f83758a
                int r5 = r6.f83764c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x006a
                int r0 = r6.f83763b
                kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
                kotlin.text.d r4 = r6.f83767f
                java.lang.CharSequence r4 = r4.f83758a
                int r4 = kotlin.text.StringsKt.getLastIndex(r4)
                r1.<init>(r0, r4)
                r6.f83765d = r1
                r6.f83764c = r2
                goto L_0x0091
            L_0x006a:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f83763b
                kotlin.ranges.IntRange r4 = kotlin.ranges.RangesKt.until((int) r4, (int) r2)
                r6.f83765d = r4
                int r2 = r2 + r0
                r6.f83763b = r2
                int r2 = r6.f83763b
                if (r0 != 0) goto L_0x008e
                r1 = 1
            L_0x008e:
                int r2 = r2 + r1
                r6.f83764c = r2
            L_0x0091:
                r6.f83762a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.d.a.a():void");
        }

        a(d dVar) {
            this.f83767f = dVar;
            this.f83763b = RangesKt.coerceIn(dVar.f83759b, 0, dVar.f83758a.length());
            this.f83764c = this.f83763b;
        }
    }

    @NotNull
    public final Iterator<IntRange> iterator() {
        return new a<>(this);
    }

    public d(@NotNull CharSequence charSequence, int i, int i2, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        Intrinsics.checkParameterIsNotNull(function2, "getNextMatch");
        this.f83758a = charSequence;
        this.f83759b = i;
        this.f83760c = i2;
        this.f83761d = function2;
    }
}
