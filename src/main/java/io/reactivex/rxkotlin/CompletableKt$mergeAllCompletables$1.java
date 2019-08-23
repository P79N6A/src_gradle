package io.reactivex.rxkotlin;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "apply"}, k = 3, mv = {1, 1, 11})
final class CompletableKt$mergeAllCompletables$1<T, R> implements Function<Completable, CompletableSource> {
    public static final CompletableKt$mergeAllCompletables$1 INSTANCE = new CompletableKt$mergeAllCompletables$1();

    CompletableKt$mergeAllCompletables$1() {
    }

    @NotNull
    public final Completable apply(@NotNull Completable completable) {
        Intrinsics.checkParameterIsNotNull(completable, AdvanceSetting.NETWORK_TYPE);
        return completable;
    }
}