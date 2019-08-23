package com.ss.android.ugc.aweme.app.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.main.h.n;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/InteractStickerService;", "Lcom/ss/android/ugc/aweme/main/service/IInteractStickerService;", "()V", "createInteractStickerWidget", "Lcom/ss/android/ugc/aweme/arch/widgets/base/LifecycleOwnerWidget;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class q implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34285a;

    @NotNull
    public final LifecycleOwnerWidget a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34285a, false, 23625, new Class[0], LifecycleOwnerWidget.class)) {
            return new InteractStickerWidget();
        }
        return (LifecycleOwnerWidget) PatchProxy.accessDispatch(new Object[0], this, f34285a, false, 23625, new Class[0], LifecycleOwnerWidget.class);
    }
}
