package com.ss.android.ugc.aweme.services.sticker;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.n;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/services/sticker/UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$2$1"}, k = 3, mv = {1, 1, 15})
final class UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$$inlined$let$lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ g $it;
    final /* synthetic */ UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 this$0;

    UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$$inlined$let$lambda$1(g gVar, UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 unLockStickerManagerServiceImpl$resolve2UnlockSticker$1) {
        this.$it = gVar;
        this.this$0 = unLockStickerManagerServiceImpl$resolve2UnlockSticker$1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71582, new Class[0], Void.TYPE);
            return;
        }
        n.a(this.this$0.$effect.effect_id);
        this.this$0.$onUnlockSucceed.invoke(Integer.valueOf(this.$it.f70204a));
    }
}
