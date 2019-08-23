package com.ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/services/sticker/IStickerUtilsService;", "", "hasUnlocked", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "isCommerceLockSticker", "isLockCommerceFaceSticker", "newFaceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerBean;", "isLockFaceSticker", "isLockSticker", "isStickerPreviewable", "showCommerceStickerDialog", "context", "Landroid/content/Context;", "enterFrom", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IStickerUtilsService {
    boolean hasUnlocked(@NotNull Effect effect);

    boolean isCommerceLockSticker(@Nullable Effect effect);

    boolean isLockCommerceFaceSticker(@NotNull d dVar);

    boolean isLockFaceSticker(@NotNull d dVar);

    boolean isLockSticker(@Nullable Effect effect);

    boolean isStickerPreviewable(@NotNull Effect effect);

    boolean showCommerceStickerDialog(@NotNull Context context, @Nullable d dVar, @NotNull String str);
}
