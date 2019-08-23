package com.ss.android.ugc.aweme.port.in;

import android.content.Context;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J:\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/port/in/IUnlockStickerService;", "", "shotFrom", "", "showErrorToast", "", "context", "Landroid/content/Context;", "showStickerUnlockedToast", "from", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "unLockOperationHandler", "Lcom/ss/android/ugc/aweme/sticker/IUnlockStickerOperation;", "listener", "Lcom/ss/android/ugc/aweme/services/sticker/OnUnlockShareFinishListener;", "removeBackground", "", "moveAbove", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface ap {
    @NotNull
    b a(@NotNull String str, @NotNull Context context, @Nullable Effect effect, @NotNull OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2);

    @NotNull
    String a();

    void a(@NotNull Context context);

    void a(@NotNull Context context, @NotNull String str, @Nullable Effect effect);
}
