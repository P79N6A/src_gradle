package com.ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/services/sticker/StickerUtilsServiceImpl;", "Lcom/ss/android/ugc/aweme/services/sticker/IStickerUtilsService;", "()V", "hasUnlocked", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "isCommerceLockSticker", "isLockCommerceFaceSticker", "newFaceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerBean;", "isLockFaceSticker", "isLockSticker", "isStickerPreviewable", "showCommerceStickerDialog", "context", "Landroid/content/Context;", "enterFrom", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final boolean isCommerceLockSticker(@Nullable Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, changeQuickRedirect, false, 71561, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ae.h(effect);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, changeQuickRedirect, false, 71561, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean isLockSticker(@Nullable Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, changeQuickRedirect, false, 71566, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ae.g(effect);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, changeQuickRedirect, false, 71566, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean hasUnlocked(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, changeQuickRedirect, false, 71564, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, this, changeQuickRedirect, false, 71564, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        return ae.n(effect);
    }

    public final boolean isLockCommerceFaceSticker(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 71562, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 71562, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "newFaceStickerBean");
        return ae.b(dVar);
    }

    public final boolean isLockFaceSticker(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 71567, new Class[]{d.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 71567, new Class[]{d.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "newFaceStickerBean");
        return ae.a(dVar);
    }

    public final boolean isStickerPreviewable(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, changeQuickRedirect, false, 71565, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, this, changeQuickRedirect, false, 71565, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        return ae.j(effect);
    }

    public final boolean showCommerceStickerDialog(@NotNull Context context, @Nullable d dVar, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, dVar, str2}, this, changeQuickRedirect, false, 71563, new Class[]{Context.class, d.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, dVar, str2}, this, changeQuickRedirect, false, 71563, new Class[]{Context.class, d.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        return ae.a(context, dVar, str);
    }
}
