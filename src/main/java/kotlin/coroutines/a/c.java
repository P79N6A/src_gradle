package kotlin.coroutines.a;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\u001c\b\u0004\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\b¢\u0006\u0002\b\b\u001aD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a]\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aA\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0003*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aZ\u0010\u0011\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0003*#\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u0002H\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"createCoroutineFromSuspendFunction", "Lkotlin/coroutines/Continuation;", "", "T", "completion", "block", "Lkotlin/Function1;", "", "createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt", "createCoroutineUnintercepted", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "intercepted", "startCoroutineUninterceptedOrReturn", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class c {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends i {
        final /* synthetic */ kotlin.coroutines.c $completion;
        final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
        private int label;

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            switch (this.label) {
                case 0:
                    this.label = 1;
                    kotlin.coroutines.c cVar = this;
                    Function1 function1 = this.$this_createCoroutineUnintercepted$inlined;
                    if (function1 != null) {
                        return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(cVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.label = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.c cVar, kotlin.coroutines.c cVar2, Function1 function1) {
            super(cVar2);
            this.$completion = cVar;
            this.$this_createCoroutineUnintercepted$inlined = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class b extends kotlin.coroutines.jvm.internal.d {
        final /* synthetic */ kotlin.coroutines.c $completion;
        final /* synthetic */ e $context;
        final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
        private int label;

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            switch (this.label) {
                case 0:
                    this.label = 1;
                    kotlin.coroutines.c cVar = this;
                    Function1 function1 = this.$this_createCoroutineUnintercepted$inlined;
                    if (function1 != null) {
                        return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(cVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.label = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.c cVar, e eVar, kotlin.coroutines.c cVar2, e eVar2, Function1 function1) {
            super(cVar2, eVar2);
            this.$completion = cVar;
            this.$context = eVar;
            this.$this_createCoroutineUnintercepted$inlined = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    /* renamed from: kotlin.coroutines.a.c$c  reason: collision with other inner class name */
    public static final class C0889c extends i {
        final /* synthetic */ kotlin.coroutines.c $completion;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            switch (this.label) {
                case 0:
                    this.label = 1;
                    kotlin.coroutines.c cVar = this;
                    Function2 function2 = this.$this_createCoroutineUnintercepted$inlined;
                    if (function2 != null) {
                        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(this.$receiver$inlined, cVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.label = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0889c(kotlin.coroutines.c cVar, kotlin.coroutines.c cVar2, Function2 function2, Object obj) {
            super(cVar2);
            this.$completion = cVar;
            this.$this_createCoroutineUnintercepted$inlined = function2;
            this.$receiver$inlined = obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        final /* synthetic */ kotlin.coroutines.c $completion;
        final /* synthetic */ e $context;
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            switch (this.label) {
                case 0:
                    this.label = 1;
                    kotlin.coroutines.c cVar = this;
                    Function2 function2 = this.$this_createCoroutineUnintercepted$inlined;
                    if (function2 != null) {
                        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(this.$receiver$inlined, cVar);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                case 1:
                    this.label = 2;
                    return obj;
                default:
                    throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(kotlin.coroutines.c cVar, e eVar, kotlin.coroutines.c cVar2, e eVar2, Function2 function2, Object obj) {
            super(cVar2, eVar2);
            this.$completion = cVar;
            this.$context = eVar;
            this.$this_createCoroutineUnintercepted$inlined = function2;
            this.$receiver$inlined = obj;
        }
    }

    @NotNull
    @SinceKotlin
    public static final <T> kotlin.coroutines.c<T> a(@NotNull kotlin.coroutines.c<? super T> cVar) {
        kotlin.coroutines.c<? super T> cVar2;
        Intrinsics.checkParameterIsNotNull(cVar, "$this$intercepted");
        if (!(cVar instanceof kotlin.coroutines.jvm.internal.d)) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        kotlin.coroutines.jvm.internal.d dVar = (kotlin.coroutines.jvm.internal.d) cVar2;
        if (dVar == null) {
            return cVar;
        }
        kotlin.coroutines.c<Object> intercepted = dVar.intercepted();
        if (intercepted == null) {
            return cVar;
        }
        return intercepted;
    }

    @NotNull
    @SinceKotlin
    public static final <T> kotlin.coroutines.c<Unit> a(@NotNull Function1<? super kotlin.coroutines.c<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.c<? super T> cVar) {
        Intrinsics.checkParameterIsNotNull(function1, "$this$createCoroutineUnintercepted");
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        kotlin.coroutines.c a2 = g.a(cVar);
        if (function1 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function1).create(a2);
        }
        e context = a2.getContext();
        if (context == f.INSTANCE) {
            if (a2 != null) {
                return new a<>(a2, a2, function1);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a2 != null) {
            b bVar = new b(a2, context, a2, context, function1);
            return bVar;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    @NotNull
    @SinceKotlin
    public static final <R, T> kotlin.coroutines.c<Unit> a(@NotNull Function2<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> function2, R r, @NotNull kotlin.coroutines.c<? super T> cVar) {
        Intrinsics.checkParameterIsNotNull(function2, "$this$createCoroutineUnintercepted");
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        kotlin.coroutines.c a2 = g.a(cVar);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(r, a2);
        }
        e context = a2.getContext();
        if (context == f.INSTANCE) {
            if (a2 != null) {
                return new C0889c<>(a2, a2, function2, r);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (a2 != null) {
            d dVar = new d(a2, context, a2, context, function2, r);
            return dVar;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
