package com.ss.android.ugc.aweme.services.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
final class UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onFailure$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 this$0;

    UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onFailure$1(UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 unLockStickerManagerServiceImpl$resolve2UnlockSticker$1) {
        this.this$0 = unLockStickerManagerServiceImpl$resolve2UnlockSticker$1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71581, new Class[0], Void.TYPE);
            return;
        }
        this.this$0.$onUnlockFailed.invoke();
    }
}
