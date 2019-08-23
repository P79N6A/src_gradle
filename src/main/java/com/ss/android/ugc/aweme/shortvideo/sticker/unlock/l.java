package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockStickerServiceImpl;", "Lcom/ss/android/ugc/aweme/port/in/IUnlockStickerService;", "()V", "shotFrom", "", "showErrorToast", "", "context", "Landroid/content/Context;", "showStickerUnlockedToast", "from", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "unLockOperationHandler", "Lcom/ss/android/ugc/aweme/sticker/IUnlockStickerOperation;", "listener", "Lcom/ss/android/ugc/aweme/services/sticker/OnUnlockShareFinishListener;", "removeBackground", "", "moveAbove", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l implements ap {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70226a;

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f70226a, false, 79866, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70226a, false, 79866, new Class[0], String.class);
        }
        String a2 = h.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UnlockStickerOperationHelper.getShotFrom()");
        return a2;
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f70226a, false, 79868, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f70226a, false, 79868, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        h.a(context);
    }

    public final void a(@NotNull Context context, @NotNull String str, @Nullable Effect effect) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, effect}, this, f70226a, false, 79869, new Class[]{Context.class, String.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, effect}, this, f70226a, false, 79869, new Class[]{Context.class, String.class, Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "from");
        h.a(context, str, effect);
    }

    @NotNull
    public final b a(@NotNull String str, @NotNull Context context, @Nullable Effect effect, @NotNull OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        String str2 = str;
        Context context2 = context;
        OnUnlockShareFinishListener onUnlockShareFinishListener2 = onUnlockShareFinishListener;
        if (PatchProxy.isSupport(new Object[]{str2, context2, effect, onUnlockShareFinishListener2, (byte) 1, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70226a, false, 79867, new Class[]{String.class, Context.class, Effect.class, OnUnlockShareFinishListener.class, Boolean.TYPE, Boolean.TYPE}, b.class)) {
            Object[] objArr = {str2, context2, effect, onUnlockShareFinishListener2, (byte) 1, Byte.valueOf(z2)};
            return (b) PatchProxy.accessDispatch(objArr, this, f70226a, false, 79867, new Class[]{String.class, Context.class, Effect.class, OnUnlockShareFinishListener.class, Boolean.TYPE, Boolean.TYPE}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "shotFrom");
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(onUnlockShareFinishListener2, "listener");
        i iVar = new i(str, context, effect, onUnlockShareFinishListener, true, z2);
        return iVar;
    }
}
