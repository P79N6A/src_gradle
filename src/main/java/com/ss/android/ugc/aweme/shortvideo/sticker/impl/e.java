package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.game.GameResultViewModel;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69662a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewImpl f69663b;

    e(EffectStickerViewImpl effectStickerViewImpl) {
        this.f69663b = effectStickerViewImpl;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69662a, false, 79135, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69662a, false, 79135, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EffectStickerViewImpl effectStickerViewImpl = this.f69663b;
        if (!effectStickerViewImpl.w) {
            a.c((Context) effectStickerViewImpl.f3995b, effectStickerViewImpl.f3995b.getResources().getString(C0906R.string.bwn)).a();
            return;
        }
        if (!((GameResultViewModel) ViewModelProviders.of((FragmentActivity) effectStickerViewImpl.f3995b).get(GameResultViewModel.class)).f67849b) {
            effectStickerViewImpl.l.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new f(effectStickerViewImpl)).withEndAction(new g(effectStickerViewImpl)).start();
            if (effectStickerViewImpl.r != null) {
                effectStickerViewImpl.r.onClick(effectStickerViewImpl.l);
            }
        }
    }
}
