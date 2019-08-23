package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 1, 15})
public final class ay {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "SlidingWindow.kt", c = {33, 39, 46, 52, 55}, d = "invokeSuspend", e = "kotlin.collections.SlidingWindowKt$windowedIterator$1")
    static final class a extends j implements Function2<n<? super List<? extends T>>, c<? super Unit>, Object> {
        final /* synthetic */ Iterator $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private n p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i, int i2, Iterator it2, boolean z, boolean z2, c cVar) {
            super(2, cVar);
            this.$step = i;
            this.$size = i2;
            this.$iterator = it2;
            this.$reuseBuffer = z;
            this.$partialWindows = z2;
        }

        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            a aVar = new a(this.$step, this.$size, this.$iterator, this.$reuseBuffer, this.$partialWindows, cVar);
            aVar.p$ = (n) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create(obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
            if (r0.hasNext() == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
            r7 = r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
            if (r4 <= 0) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
            r4 = r4 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
            r2.add(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
            if (r2.size() != r13.$size) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
            r13.L$0 = r3;
            r13.I$0 = r5;
            r13.L$1 = r2;
            r13.I$1 = r4;
            r13.L$2 = r7;
            r13.L$3 = r0;
            r13.label = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
            if (r3.a(r2, (kotlin.coroutines.c<? super kotlin.Unit>) r13) != r6) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008d, code lost:
            return r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
            if (r13.$reuseBuffer == false) goto L_0x0096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0092, code lost:
            r2.clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
            r2 = new java.util.ArrayList(r13.$size);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
            if ((!r2.isEmpty()) == false) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
            if (r13.$partialWindows != false) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
            if (r2.size() != r13.$size) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
            r13.L$0 = r3;
            r13.I$0 = r5;
            r13.L$1 = r2;
            r13.I$1 = r4;
            r13.label = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
            if (r3.a(r2, (kotlin.coroutines.c<? super kotlin.Unit>) r13) != r6) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
            return r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
            if (r0.hasNext() == false) goto L_0x0139;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
            r6 = r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
            if (r2.b() != false) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e8, code lost:
            r2.f83435b[(r2.f83436c + r2.size()) % r2.f83438e] = r6;
            r2.f83437d = r2.size() + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
            if (r2.b() == false) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
            if (r13.$reuseBuffer == false) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x010b, code lost:
            r7 = new java.util.ArrayList(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
            r13.L$0 = r4;
            r13.I$0 = r3;
            r13.L$1 = r2;
            r13.L$2 = r6;
            r13.L$3 = r0;
            r13.label = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0126, code lost:
            if (r4.a(r7, (kotlin.coroutines.c<? super kotlin.Unit>) r13) != r5) goto L_0x0129;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0128, code lost:
            return r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
            r2.a(r13.$step);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
            throw new java.lang.IllegalStateException("ring buffer is full");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
            if (r13.$partialWindows == false) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x013d, code lost:
            r0 = r2;
            r2 = r3;
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0146, code lost:
            if (r0.size() <= r13.$step) goto L_0x0170;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x014a, code lost:
            if (r13.$reuseBuffer == false) goto L_0x0150;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x014c, code lost:
            r4 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0150, code lost:
            r4 = new java.util.ArrayList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x015a, code lost:
            r13.L$0 = r3;
            r13.I$0 = r2;
            r13.L$1 = r0;
            r13.label = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
            if (r3.a(r4, (kotlin.coroutines.c<? super kotlin.Unit>) r13) != r5) goto L_0x016a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
            return r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
            r0.a(r13.$step);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0178, code lost:
            if ((true ^ r0.isEmpty()) == false) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x017a, code lost:
            r13.L$0 = r3;
            r13.I$0 = r2;
            r13.L$1 = r0;
            r13.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
            if (r3.a(r0, (kotlin.coroutines.c<? super kotlin.Unit>) r13) != r5) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0189, code lost:
            return r5;
         */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r13 = kotlin.coroutines.a.b.a()
                int r0 = r12.label
                r1 = 1
                switch(r0) {
                    case 0: goto L_0x0045;
                    case 1: goto L_0x0032;
                    case 2: goto L_0x018a;
                    case 3: goto L_0x0020;
                    case 4: goto L_0x0012;
                    case 5: goto L_0x018a;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0012:
                java.lang.Object r0 = r12.L$1
                kotlin.collections.at r0 = (kotlin.collections.at) r0
                int r2 = r12.I$0
                java.lang.Object r3 = r12.L$0
                kotlin.sequences.n r3 = (kotlin.sequences.n) r3
                r5 = r13
                r13 = r12
                goto L_0x016a
            L_0x0020:
                java.lang.Object r0 = r12.L$3
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r2 = r12.L$1
                kotlin.collections.at r2 = (kotlin.collections.at) r2
                int r3 = r12.I$0
                java.lang.Object r4 = r12.L$0
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                r5 = r13
                r13 = r12
                goto L_0x0129
            L_0x0032:
                java.lang.Object r0 = r12.L$3
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r2 = r12.L$1
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r3 = r12.I$0
                java.lang.Object r4 = r12.L$0
                kotlin.sequences.n r4 = (kotlin.sequences.n) r4
                r6 = r13
                r5 = r3
                r3 = r4
                r13 = r12
                goto L_0x008e
            L_0x0045:
                kotlin.sequences.n r0 = r12.p$
                int r2 = r12.$step
                int r3 = r12.$size
                int r2 = r2 - r3
                if (r2 < 0) goto L_0x00c7
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = r12.$size
                r3.<init>(r4)
                r4 = 0
                java.util.Iterator r5 = r12.$iterator
                r6 = r13
                r13 = r12
                r10 = r3
                r3 = r0
                r0 = r5
                r5 = r2
                r2 = r10
            L_0x005f:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x009f
                java.lang.Object r7 = r0.next()
                if (r4 <= 0) goto L_0x006e
                int r4 = r4 + -1
                goto L_0x005f
            L_0x006e:
                r2.add(r7)
                int r8 = r2.size()
                int r9 = r13.$size
                if (r8 != r9) goto L_0x005f
                r13.L$0 = r3
                r13.I$0 = r5
                r13.L$1 = r2
                r13.I$1 = r4
                r13.L$2 = r7
                r13.L$3 = r0
                r13.label = r1
                java.lang.Object r4 = r3.a(r2, (kotlin.coroutines.c<? super kotlin.Unit>) r13)
                if (r4 != r6) goto L_0x008e
                return r6
            L_0x008e:
                boolean r4 = r13.$reuseBuffer
                if (r4 == 0) goto L_0x0096
                r2.clear()
                goto L_0x009d
            L_0x0096:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r4 = r13.$size
                r2.<init>(r4)
            L_0x009d:
                r4 = r5
                goto L_0x005f
            L_0x009f:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r1
                if (r0 == 0) goto L_0x018a
                boolean r0 = r13.$partialWindows
                if (r0 != 0) goto L_0x00b5
                int r0 = r2.size()
                int r1 = r13.$size
                if (r0 != r1) goto L_0x018a
            L_0x00b5:
                r13.L$0 = r3
                r13.I$0 = r5
                r13.L$1 = r2
                r13.I$1 = r4
                r0 = 2
                r13.label = r0
                java.lang.Object r13 = r3.a(r2, (kotlin.coroutines.c<? super kotlin.Unit>) r13)
                if (r13 != r6) goto L_0x018a
                return r6
            L_0x00c7:
                kotlin.collections.at r3 = new kotlin.collections.at
                int r4 = r12.$size
                r3.<init>(r4)
                java.util.Iterator r4 = r12.$iterator
                r5 = r13
                r13 = r12
                r10 = r4
                r4 = r0
                r0 = r10
                r11 = r3
                r3 = r2
                r2 = r11
            L_0x00d8:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0139
                java.lang.Object r6 = r0.next()
                boolean r7 = r2.b()
                if (r7 != 0) goto L_0x012f
                java.lang.Object[] r7 = r2.f83435b
                int r8 = r2.f83436c
                int r9 = r2.size()
                int r8 = r8 + r9
                int r9 = r2.f83438e
                int r8 = r8 % r9
                r7[r8] = r6
                int r7 = r2.size()
                int r7 = r7 + r1
                r2.f83437d = r7
                boolean r7 = r2.b()
                if (r7 == 0) goto L_0x00d8
                boolean r7 = r13.$reuseBuffer
                if (r7 == 0) goto L_0x010b
                r7 = r2
                java.util.List r7 = (java.util.List) r7
                goto L_0x0115
            L_0x010b:
                java.util.ArrayList r7 = new java.util.ArrayList
                r8 = r2
                java.util.Collection r8 = (java.util.Collection) r8
                r7.<init>(r8)
                java.util.List r7 = (java.util.List) r7
            L_0x0115:
                r13.L$0 = r4
                r13.I$0 = r3
                r13.L$1 = r2
                r13.L$2 = r6
                r13.L$3 = r0
                r6 = 3
                r13.label = r6
                java.lang.Object r6 = r4.a(r7, (kotlin.coroutines.c<? super kotlin.Unit>) r13)
                if (r6 != r5) goto L_0x0129
                return r5
            L_0x0129:
                int r6 = r13.$step
                r2.a(r6)
                goto L_0x00d8
            L_0x012f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "ring buffer is full"
                r13.<init>(r0)
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                throw r13
            L_0x0139:
                boolean r0 = r13.$partialWindows
                if (r0 == 0) goto L_0x018a
                r0 = r2
                r2 = r3
                r3 = r4
            L_0x0140:
                int r4 = r0.size()
                int r6 = r13.$step
                if (r4 <= r6) goto L_0x0170
                boolean r4 = r13.$reuseBuffer
                if (r4 == 0) goto L_0x0150
                r4 = r0
                java.util.List r4 = (java.util.List) r4
                goto L_0x015a
            L_0x0150:
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = r0
                java.util.Collection r6 = (java.util.Collection) r6
                r4.<init>(r6)
                java.util.List r4 = (java.util.List) r4
            L_0x015a:
                r13.L$0 = r3
                r13.I$0 = r2
                r13.L$1 = r0
                r6 = 4
                r13.label = r6
                java.lang.Object r4 = r3.a(r4, (kotlin.coroutines.c<? super kotlin.Unit>) r13)
                if (r4 != r5) goto L_0x016a
                return r5
            L_0x016a:
                int r4 = r13.$step
                r0.a(r4)
                goto L_0x0140
            L_0x0170:
                r4 = r0
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                r1 = r1 ^ r4
                if (r1 == 0) goto L_0x018a
                r13.L$0 = r3
                r13.I$0 = r2
                r13.L$1 = r0
                r1 = 5
                r13.label = r1
                java.lang.Object r13 = r3.a(r0, (kotlin.coroutines.c<? super kotlin.Unit>) r13)
                if (r13 != r5) goto L_0x018a
                return r5
            L_0x018a:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.ay.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Sequence<List<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Sequence f83442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f83443b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f83444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f83445d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f83446e;

        @NotNull
        public final Iterator<List<? extends T>> iterator() {
            return ay.a(this.f83442a.iterator(), this.f83443b, this.f83444c, this.f83445d, this.f83446e);
        }

        public b(Sequence sequence, int i, int i2, boolean z, boolean z2) {
            this.f83442a = sequence;
            this.f83443b = i;
            this.f83444c = i2;
            this.f83445d = z;
            this.f83446e = z2;
        }
    }

    public static final void a(int i, int i2) {
        boolean z;
        String str;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Sequence<List<T>> a(@NotNull Sequence<? extends T> sequence, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$windowedSequence");
        a(i, i2);
        b bVar = new b(sequence, i, i2, z, z2);
        return bVar;
    }

    @NotNull
    public static final <T> Iterator<List<T>> a(@NotNull Iterator<? extends T> it2, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(it2, "iterator");
        if (!it2.hasNext()) {
            return y.f83492a;
        }
        a aVar = new a(i2, i, it2, z2, z, null);
        return SequencesKt.iterator(aVar);
    }
}
