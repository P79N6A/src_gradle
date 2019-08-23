package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public interface e {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public interface b extends e {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        public static final class a {
            @NotNull
            public static e a(b bVar, @NotNull e eVar) {
                Intrinsics.checkParameterIsNotNull(eVar, "context");
                return a.a(bVar, eVar);
            }

            @Nullable
            public static <E extends b> E a(b bVar, @NotNull c<E> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "key");
                if (!Intrinsics.areEqual((Object) bVar.getKey(), (Object) cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            }

            @NotNull
            public static e b(b bVar, @NotNull c<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "key");
                if (Intrinsics.areEqual((Object) bVar.getKey(), (Object) cVar)) {
                    return f.INSTANCE;
                }
                return bVar;
            }

            public static <R> R a(b bVar, R r, @NotNull Function2<? super R, ? super b, ? extends R> function2) {
                Intrinsics.checkParameterIsNotNull(function2, "operation");
                return function2.invoke(r, bVar);
            }
        }

        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: kotlin.coroutines.e$a$a  reason: collision with other inner class name */
        static final class C0892a extends Lambda implements Function2<e, b, e> {
            public static final C0892a INSTANCE = new C0892a();

            C0892a() {
                super(2);
            }

            @NotNull
            public final e invoke(@NotNull e eVar, @NotNull b bVar) {
                b bVar2;
                Intrinsics.checkParameterIsNotNull(eVar, "acc");
                Intrinsics.checkParameterIsNotNull(bVar, "element");
                e minusKey = eVar.minusKey(bVar.getKey());
                if (minusKey == f.INSTANCE) {
                    bVar2 = bVar;
                } else {
                    d dVar = (d) minusKey.get(d.f83521b);
                    if (dVar == null) {
                        bVar2 = new b(minusKey, bVar);
                    } else {
                        e minusKey2 = minusKey.minusKey(d.f83521b);
                        if (minusKey2 == f.INSTANCE) {
                            bVar2 = new b(bVar, dVar);
                        } else {
                            bVar2 = new b(new b(minusKey2, bVar), dVar);
                        }
                    }
                }
                return bVar2;
            }
        }

        @NotNull
        public static e a(e eVar, @NotNull e eVar2) {
            Intrinsics.checkParameterIsNotNull(eVar2, "context");
            if (eVar2 == f.INSTANCE) {
                return eVar;
            }
            return (e) eVar2.fold(eVar, C0892a.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public interface c<E extends b> {
    }

    <R> R fold(R r, @NotNull Function2<? super R, ? super b, ? extends R> function2);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    e minusKey(@NotNull c<?> cVar);

    @NotNull
    e plus(@NotNull e eVar);
}
