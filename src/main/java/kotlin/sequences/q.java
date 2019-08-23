package kotlin.sequences;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.j;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/sequences/SequencesKt")
public class q extends p {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Sequence<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function0 f83716a;

        @NotNull
        public final Iterator<T> iterator() {
            return (Iterator) this.f83716a.invoke();
        }

        public a(Function0 function0) {
            this.f83716a = function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Sequence<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f83717a;

        @NotNull
        public final Iterator<T> iterator() {
            return this.f83717a;
        }

        public b(Iterator it2) {
            this.f83717a = it2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<Sequence<? extends T>, Iterator<? extends T>> {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @NotNull
        public final Iterator<T> invoke(@NotNull Sequence<? extends T> sequence) {
            Intrinsics.checkParameterIsNotNull(sequence, AdvanceSetting.NETWORK_TYPE);
            return sequence.iterator();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<Iterable<? extends T>, Iterator<? extends T>> {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @NotNull
        public final Iterator<T> invoke(@NotNull Iterable<? extends T> iterable) {
            Intrinsics.checkParameterIsNotNull(iterable, AdvanceSetting.NETWORK_TYPE);
            return iterable.iterator();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<T, T> {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<T, T> {
        final /* synthetic */ Function0 $nextFunction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Function0 function0) {
            super(1);
            this.$nextFunction = function0;
        }

        @Nullable
        public final T invoke(@NotNull T t) {
            Intrinsics.checkParameterIsNotNull(t, AdvanceSetting.NETWORK_TYPE);
            return this.$nextFunction.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<T> {
        final /* synthetic */ Object $seed;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Object obj) {
            super(0);
            this.$seed = obj;
        }

        @Nullable
        public final T invoke() {
            return this.$seed;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "Sequences.kt", c = {67, 69}, d = "invokeSuspend", e = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1")
    static final class h extends j implements Function2<n<? super T>, kotlin.coroutines.c<? super Unit>, Object> {
        final /* synthetic */ Function0 $defaultValue;
        final /* synthetic */ Sequence $this_ifEmpty;
        Object L$0;
        Object L$1;
        int label;
        private n p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Sequence sequence, Function0 function0, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.$this_ifEmpty = sequence;
            this.$defaultValue = function0;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            h hVar = new h(this.$this_ifEmpty, this.$defaultValue, cVar);
            hVar.p$ = (n) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((h) create(obj, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    n nVar = this.p$;
                    Iterator it2 = this.$this_ifEmpty.iterator();
                    if (it2.hasNext()) {
                        this.L$0 = nVar;
                        this.L$1 = it2;
                        this.label = 1;
                        if (nVar.a(it2, (kotlin.coroutines.c<? super Unit>) this) == a2) {
                            return a2;
                        }
                    } else {
                        this.L$0 = nVar;
                        this.L$1 = it2;
                        this.label = 2;
                        if (nVar.a(((Sequence) this.$defaultValue.invoke()).iterator(), (kotlin.coroutines.c<? super Unit>) this) == a2) {
                            return a2;
                        }
                    }
                    break;
                case 1:
                case 2:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final <T> Sequence<T> emptySequence() {
        return g.f83681a;
    }

    @InlineOnly
    private static final <T> Sequence<T> Sequence(Function0<? extends Iterator<? extends T>> function0) {
        return new a<>(function0);
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> Sequence<T> orEmpty(@Nullable Sequence<? extends T> sequence) {
        if (sequence == null) {
            return SequencesKt.emptySequence();
        }
        return sequence;
    }

    @NotNull
    public static final <T> Sequence<T> flatten(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$flatten");
        return flatten$SequencesKt__SequencesKt(sequence, c.INSTANCE);
    }

    @NotNull
    @JvmName
    public static final <T> Sequence<T> flattenSequenceOfIterable(@NotNull Sequence<? extends Iterable<? extends T>> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$flatten");
        return flatten$SequencesKt__SequencesKt(sequence, d.INSTANCE);
    }

    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull Iterator<? extends T> it2) {
        Intrinsics.checkParameterIsNotNull(it2, "$this$asSequence");
        return SequencesKt.constrainOnce(new b(it2));
    }

    @NotNull
    public static final <T> Sequence<T> constrainOnce(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$constrainOnce");
        if (sequence instanceof a) {
            return sequence;
        }
        return new a<>(sequence);
    }

    @NotNull
    public static final <T> Sequence<T> sequenceOf(@NotNull T... tArr) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return SequencesKt.emptySequence();
        }
        return ArraysKt.asSequence(tArr);
    }

    @NotNull
    public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "nextFunction");
        return SequencesKt.constrainOnce(new j(function0, new f(function0)));
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> unzip(@NotNull Sequence<? extends Pair<? extends T, ? extends R>> sequence) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$unzip");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : sequence) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return TuplesKt.to(arrayList, arrayList2);
    }

    @NotNull
    @LowPriorityInOverloadResolution
    public static final <T> Sequence<T> generateSequence(@Nullable T t, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        if (t == null) {
            return g.f83681a;
        }
        return new j<>(new g(t), function1);
    }

    @NotNull
    @SinceKotlin
    public static final <T> Sequence<T> ifEmpty(@NotNull Sequence<? extends T> sequence, @NotNull Function0<? extends Sequence<? extends T>> function0) {
        Intrinsics.checkParameterIsNotNull(sequence, "$this$ifEmpty");
        Intrinsics.checkParameterIsNotNull(function0, "defaultValue");
        return SequencesKt.sequence(new h(sequence, function0, null));
    }

    private static final <T, R> Sequence<R> flatten$SequencesKt__SequencesKt(@NotNull Sequence<? extends T> sequence, Function1<? super T, ? extends Iterator<? extends R>> function1) {
        if (!(sequence instanceof x)) {
            return new i<>(sequence, e.INSTANCE, function1);
        }
        x xVar = (x) sequence;
        Intrinsics.checkParameterIsNotNull(function1, "iterator");
        return new i<>(xVar.f83754a, xVar.f83755b, function1);
    }

    @NotNull
    public static final <T> Sequence<T> generateSequence(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "seedFunction");
        Intrinsics.checkParameterIsNotNull(function1, "nextFunction");
        return new j<>(function0, function1);
    }
}
