package com.ss.android.ugc.aweme.services.sticker;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/services/sticker/OnUnlockShareFinishListener;", "", "onShareAppFailed", "", "onShareAppSucceed", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "onVKShareSucceed", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface OnUnlockShareFinishListener {
    void onShareAppFailed();

    void onShareAppSucceed(@NotNull Effect effect);

    void onVKShareSucceed(@NotNull Effect effect);
}
