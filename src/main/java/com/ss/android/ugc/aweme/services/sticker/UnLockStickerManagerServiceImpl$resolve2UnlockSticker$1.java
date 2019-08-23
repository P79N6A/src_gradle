package com.ss.android.ugc.aweme.services.sticker;

import com.google.common.util.concurrent.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/services/sticker/UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockStickerInfo;", "onFailure", "", "t", "", "onSuccess", "result", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 implements k<g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ Effect $effect;
    final /* synthetic */ Function0 $onUnlockFailed;
    final /* synthetic */ Function1 $onUnlockSucceed;

    public final void onFailure(@NotNull Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, changeQuickRedirect, false, 71580, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, changeQuickRedirect, false, 71580, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(th2, "t");
        a.b(new UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onFailure$1(this));
    }

    public final void onSuccess(@Nullable g gVar) {
        g gVar2 = gVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, changeQuickRedirect, false, 71579, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, changeQuickRedirect, false, 71579, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (gVar2 != null) {
            if (gVar2.f70204a != 0) {
                z = false;
            }
            if (!z) {
                gVar2 = null;
            }
            if (gVar2 != null) {
                a.b(new UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$$inlined$let$lambda$1(gVar2, this));
                return;
            }
        }
    }

    UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(Effect effect, Function1 function1, Function0 function0) {
        this.$effect = effect;
        this.$onUnlockSucceed = function1;
        this.$onUnlockFailed = function0;
    }
}
