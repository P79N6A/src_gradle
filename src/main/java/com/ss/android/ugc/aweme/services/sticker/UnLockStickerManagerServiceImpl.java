package com.ss.android.ugc.aweme.services.sticker;

import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.LockStickerTextBean;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockStickerApi;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.k;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J2\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/sticker/UnLockStickerManagerServiceImpl;", "Lcom/ss/android/ugc/aweme/services/sticker/IUnLockStickerManagerService;", "()V", "addUnlockedStickerId", "", "id", "", "clearUnlockedStickerIds", "getDefaultTextBean", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/LockStickerTextBean;", "getShareString", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getTextBeanForActivity", "getUnlockedStickerIds", "Ljava/util/ArrayList;", "getUpdateState", "", "resolve2UnlockSticker", "onUnlockSucceed", "Lkotlin/Function1;", "", "onUnlockFailed", "Lkotlin/Function0;", "updateLockStickerTextBeans", "list", "", "updateUnlockedIdsFromNet", "listener", "Lcom/ss/android/ugc/aweme/common/INotifyListener;", "updateUnlockedStickerIdList", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UnLockStickerManagerServiceImpl implements IUnLockStickerManagerService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void clearUnlockedStickerIds() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71572, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71572, new Class[0], Void.TYPE);
            return;
        }
        n.c();
    }

    @NotNull
    public final LockStickerTextBean getDefaultTextBean() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71574, new Class[0], LockStickerTextBean.class)) {
            return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71574, new Class[0], LockStickerTextBean.class);
        }
        LockStickerTextBean d2 = n.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "UnlockedStickersManager.getDefaultTextBean()");
        return d2;
    }

    @NotNull
    public final ArrayList<String> getUnlockedStickerIds() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71568, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71568, new Class[0], ArrayList.class);
        }
        ArrayList<String> a2 = n.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UnlockedStickersManager.getUnlockedStickerIds()");
        return a2;
    }

    public final boolean getUpdateState() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71569, new Class[0], Boolean.TYPE)) {
            return n.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71569, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void addUnlockedStickerId(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71571, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71571, new Class[]{String.class}, Void.TYPE);
            return;
        }
        n.a(str);
    }

    @Nullable
    public final LockStickerTextBean getShareString(@Nullable Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, changeQuickRedirect, false, 71575, new Class[]{Effect.class}, LockStickerTextBean.class)) {
            return n.a(effect);
        }
        return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[]{effect}, this, changeQuickRedirect, false, 71575, new Class[]{Effect.class}, LockStickerTextBean.class);
    }

    public final void updateLockStickerTextBeans(@Nullable List<? extends LockStickerTextBean> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 71573, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 71573, new Class[]{List.class}, Void.TYPE);
            return;
        }
        n.b(list);
    }

    public final void updateUnlockedIdsFromNet(@Nullable p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, changeQuickRedirect, false, 71577, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, changeQuickRedirect, false, 71577, new Class[]{p.class}, Void.TYPE);
            return;
        }
        if (a.a()) {
            n.a(pVar);
        }
    }

    public final void updateUnlockedStickerIdList(@Nullable List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 71570, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 71570, new Class[]{List.class}, Void.TYPE);
            return;
        }
        n.a(list);
    }

    @Nullable
    public final LockStickerTextBean getTextBeanForActivity(@NotNull Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, changeQuickRedirect, false, 71576, new Class[]{Effect.class}, LockStickerTextBean.class)) {
            return (LockStickerTextBean) PatchProxy.accessDispatch(new Object[]{effect2}, this, changeQuickRedirect, false, 71576, new Class[]{Effect.class}, LockStickerTextBean.class);
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        return n.b(ae.k(effect));
    }

    public final void resolve2UnlockSticker(@NotNull Effect effect, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function0<Unit> function0) {
        Effect effect2 = effect;
        Function1<? super Integer, Unit> function12 = function1;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{effect2, function12, function02}, this, changeQuickRedirect, false, 71578, new Class[]{Effect.class, Function1.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, function12, function02}, this, changeQuickRedirect, false, 71578, new Class[]{Effect.class, Function1.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect2, "effect");
        Intrinsics.checkParameterIsNotNull(function12, "onUnlockSucceed");
        Intrinsics.checkParameterIsNotNull(function02, "onUnlockFailed");
        k kVar = new k();
        kVar.f70224a = ae.k(effect);
        kVar.f70225b = CollectionsKt.listOf(effect2.effect_id);
        l.a(UnlockStickerApi.a(com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) kVar)), new UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(effect2, function12, function02));
    }
}
