package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 1, 13})
public final class e {
    public static final <T> T a(@NotNull kotlin.coroutines.e eVar, @NotNull Function2<? super af, ? super c<? super T>, ? extends Object> function2) throws InterruptedException {
        return f.a(eVar, function2);
    }

    @NotNull
    public static final bk a(@NotNull af afVar, @NotNull kotlin.coroutines.e eVar, @NotNull ag agVar, @NotNull Function2<? super af, ? super c<? super Unit>, ? extends Object> function2) {
        cb cbVar;
        Intrinsics.checkParameterIsNotNull(afVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(agVar, "start");
        Intrinsics.checkParameterIsNotNull(function2, "block");
        kotlin.coroutines.e a2 = z.a(afVar, eVar);
        if (agVar.isLazy()) {
            cbVar = new br(a2, function2);
        } else {
            cbVar = new cb(a2, true);
        }
        cbVar.a(agVar, cbVar, function2);
        return cbVar;
    }
}
