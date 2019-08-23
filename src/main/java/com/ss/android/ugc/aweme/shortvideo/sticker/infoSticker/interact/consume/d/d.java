package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerShow;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerEvent;", "getStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getStickerType", "", "requestLayout", "", "updateStickerStruct", "struct", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface d extends b, c {
    void a(@Nullable InteractStickerStruct interactStickerStruct);

    int c();

    @Nullable
    InteractStickerStruct d();
}
