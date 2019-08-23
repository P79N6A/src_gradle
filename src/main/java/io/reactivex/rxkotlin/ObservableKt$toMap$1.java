package io.reactivex.rxkotlin;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "A", "", "B", "it", "Lkotlin/Pair;", "apply", "(Lkotlin/Pair;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 11})
final class ObservableKt$toMap$1<T, R> implements Function<T, K> {
    public static final ObservableKt$toMap$1 INSTANCE = new ObservableKt$toMap$1();

    ObservableKt$toMap$1() {
    }

    @NotNull
    public final A apply(@NotNull Pair<? extends A, ? extends B> pair) {
        Intrinsics.checkParameterIsNotNull(pair, AdvanceSetting.NETWORK_TYPE);
        return pair.getFirst();
    }
}
