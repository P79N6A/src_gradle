package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/InteractSticker;", "", "index", "", "view", "Landroid/view/View;", "struct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "stickerView", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;", "(ILandroid/view/View;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;)V", "getIndex", "()I", "getStickerView", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IInteractStickerView;", "getStruct", "()Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getView", "()Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f69890a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final View f69891b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final InteractStickerStruct f69892c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final d f69893d;

    public b(int i, @Nullable View view, @NotNull InteractStickerStruct interactStickerStruct, @NotNull d dVar) {
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "struct");
        Intrinsics.checkParameterIsNotNull(dVar, "stickerView");
        this.f69890a = i;
        this.f69891b = view;
        this.f69892c = interactStickerStruct;
        this.f69893d = dVar;
    }
}
