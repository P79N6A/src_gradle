package io.reactivex.rxkotlin;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function3;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 11})
public final class FlowableKt$sam$io_reactivex_functions_Function3$0 implements Function3 {
    private final /* synthetic */ kotlin.jvm.functions.Function3 function;

    FlowableKt$sam$io_reactivex_functions_Function3$0(kotlin.jvm.functions.Function3 function3) {
        this.function = function3;
    }

    @NonNull
    public final /* synthetic */ R apply(@NonNull T1 t1, @NonNull T2 t2, @NonNull T3 t3) {
        return this.function.invoke(t1, t2, t3);
    }
}
