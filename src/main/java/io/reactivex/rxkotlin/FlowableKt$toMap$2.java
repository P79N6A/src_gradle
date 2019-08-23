package io.reactivex.rxkotlin;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "B", "A", "", "it", "Lkotlin/Pair;", "apply", "(Lkotlin/Pair;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 11})
final class FlowableKt$toMap$2<T, R> implements Function<T, V> {
    public static final FlowableKt$toMap$2 INSTANCE = new FlowableKt$toMap$2();

    FlowableKt$toMap$2() {
    }

    @NotNull
    public final B apply(@NotNull Pair<? extends A, ? extends B> pair) {
        Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
        return pair.getSecond();
    }
}