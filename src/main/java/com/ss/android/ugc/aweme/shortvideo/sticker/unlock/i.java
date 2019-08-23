package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.aj;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.b;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70207a;

    /* renamed from: b  reason: collision with root package name */
    Effect f70208b;

    /* renamed from: c  reason: collision with root package name */
    public OnUnlockShareFinishListener f70209c;

    /* renamed from: d  reason: collision with root package name */
    String f70210d;

    /* renamed from: e  reason: collision with root package name */
    public s<IStickerUtilsService> f70211e = new s<IStickerUtilsService>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70214a;

        /* renamed from: b  reason: collision with root package name */
        IStickerUtilsService f70215b;

        public final /* synthetic */ Object get() {
            if (PatchProxy.isSupport(new Object[0], this, f70214a, false, 79862, new Class[0], IStickerUtilsService.class)) {
                return (IStickerUtilsService) PatchProxy.accessDispatch(new Object[0], this, f70214a, false, 79862, new Class[0], IStickerUtilsService.class);
            }
            if (this.f70215b == null) {
                this.f70215b = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
            }
            return this.f70215b;
        }
    };

    /* renamed from: f  reason: collision with root package name */
    aj.a f70212f = new aj.a() {
    };
    private AppCompatDialog g;
    private Context h;
    private aj.b i = new aj.b() {
    };
    private boolean j = false;
    private boolean k = false;

    public final void a() {
        String str;
        AppCompatDialog appCompatDialog;
        if (PatchProxy.isSupport(new Object[0], this, f70207a, false, 79856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70207a, false, 79856, new Class[0], Void.TYPE);
        } else if (a.a() && !ex.b() && this.f70208b != null) {
            LockStickerTextBean shareString = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getShareString(this.f70208b);
            if (shareString != null && this.h != null) {
                if (this.g == null) {
                    Context context = this.h;
                    aj.a aVar = this.f70212f;
                    Effect effect = this.f70208b;
                    boolean z = this.j;
                    boolean z2 = this.k;
                    aj.b bVar = this.i;
                    if (PatchProxy.isSupport(new Object[]{context, aVar, shareString, effect, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), bVar}, null, c.f70197a, true, 79841, new Class[]{Context.class, aj.a.class, LockStickerTextBean.class, Effect.class, Boolean.TYPE, Boolean.TYPE, aj.b.class}, AppCompatDialog.class)) {
                        Object[] objArr = {context, aVar, shareString, effect, Byte.valueOf(z), Byte.valueOf(z2), bVar};
                        Object[] objArr2 = objArr;
                        appCompatDialog = (AppCompatDialog) PatchProxy.accessDispatch(objArr2, null, c.f70197a, true, 79841, new Class[]{Context.class, aj.a.class, LockStickerTextBean.class, Effect.class, Boolean.TYPE, Boolean.TYPE, aj.b.class}, AppCompatDialog.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(context, "context");
                        Intrinsics.checkParameterIsNotNull(aVar, "onShareMethodClickListener");
                        Intrinsics.checkParameterIsNotNull(shareString, "bean");
                        Intrinsics.checkParameterIsNotNull(effect, "effect");
                        Intrinsics.checkParameterIsNotNull(bVar, "vkShareDialogListener");
                        appCompatDialog = null;
                    }
                    this.g = appCompatDialog;
                }
                if (this.g != null) {
                    d a2 = d.a().a("enter_method", this.f70210d).a("prop_id", this.f70208b.effect_id);
                    if (((IStickerUtilsService) this.f70211e.get()).isStickerPreviewable(this.f70208b)) {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    r.a("locked_prop_share_pop_up_show", (Map) a2.a("is_visible", str).f34114b);
                    this.g.show();
                }
            }
        }
    }

    public final void a(Effect effect) {
        this.f70208b = effect;
    }

    public i(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        this.f70210d = str;
        this.h = context;
        this.f70208b = effect;
        this.f70209c = onUnlockShareFinishListener;
        this.j = z;
        this.k = z2;
    }
}
