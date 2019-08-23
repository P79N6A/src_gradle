package com.ss.android.ugc.aweme.shortvideo.widget;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.m;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.ss.android.ugc.aweme.sticker.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.greenrobot.eventbus.c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71445a;

    /* renamed from: b  reason: collision with root package name */
    FragmentActivity f71446b;

    /* renamed from: c  reason: collision with root package name */
    b f71447c;

    /* renamed from: d  reason: collision with root package name */
    OnUnlockShareFinishListener f71448d = new OnUnlockShareFinishListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71449a;

        public final void onVKShareSucceed(Effect effect) {
        }

        public final void onShareAppFailed() {
            if (PatchProxy.isSupport(new Object[0], this, f71449a, false, 81427, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71449a, false, 81427, new Class[0], Void.TYPE);
                return;
            }
            a.J.a(g.this.f71446b);
        }

        public final void onShareAppSucceed(Effect effect) {
            Effect effect2 = effect;
            if (PatchProxy.isSupport(new Object[]{effect2}, this, f71449a, false, 81426, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect2}, this, f71449a, false, 81426, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            m mVar = new m();
            mVar.f70227a = UnLockSticker.STICKER_UNLOCKED;
            mVar.f70228b = effect2;
            mVar.f70230d = true;
            c.a().e(mVar);
        }
    };

    public g(FragmentActivity fragmentActivity) {
        this.f71446b = fragmentActivity;
        Effect a2 = a(fragmentActivity);
        ap apVar = a.J;
        this.f71447c = apVar.a(apVar.a(), fragmentActivity, a2, this.f71448d, true, false);
    }

    /* access modifiers changed from: package-private */
    public Effect a(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, this, f71445a, false, 81425, new Class[]{FragmentActivity.class}, Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, this, f71445a, false, 81425, new Class[]{FragmentActivity.class}, Effect.class);
        } else if (fragmentActivity != null) {
            return (Effect) ((CurUseStickerViewModel) ViewModelProviders.of(fragmentActivity).get(CurUseStickerViewModel.class)).f70249b.getValue();
        } else {
            return null;
        }
    }
}
