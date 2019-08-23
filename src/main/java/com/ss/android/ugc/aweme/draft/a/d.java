package com.ss.android.ugc.aweme.draft.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/draft/model/DefaultSelectStickerPoi;", "Ljava/io/Serializable;", "stickerPoi", "Lcom/ss/android/ugc/aweme/shortvideo/ui/StickerPoi;", "(Lcom/ss/android/ugc/aweme/shortvideo/ui/StickerPoi;)V", "isCancelSelect", "", "()Z", "setCancelSelect", "(Z)V", "getStickerPoi", "()Lcom/ss/android/ugc/aweme/shortvideo/ui/StickerPoi;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isCancelSelect;
    @NotNull
    private final z stickerPoi;

    @NotNull
    public final z getStickerPoi() {
        return this.stickerPoi;
    }

    public final boolean isCancelSelect() {
        return this.isCancelSelect;
    }

    public final void setCancelSelect(boolean z) {
        this.isCancelSelect = z;
    }

    public d(@NotNull z zVar) {
        Intrinsics.checkParameterIsNotNull(zVar, "stickerPoi");
        this.stickerPoi = zVar;
    }
}
