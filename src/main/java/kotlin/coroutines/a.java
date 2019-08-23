package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public abstract class a implements e.b {
    @NotNull
    private final e.c<?> key;

    @NotNull
    public e.c<?> getKey() {
        return this.key;
    }

    public a(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        this.key = cVar;
    }

    @Nullable
    public <E extends e.b> E get(@NotNull e.c<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.a((e.b) this, cVar);
    }

    @NotNull
    public e minusKey(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.b(this, cVar);
    }

    @NotNull
    public e plus(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        return e.b.a.a((e.b) this, eVar);
    }

    public <R> R fold(R r, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        return e.b.a.a(this, r, function2);
    }
}
