package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class EffectGameViewHolder extends EffectStickerBaseViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69182a;

    public final void a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69182a, false, 78551, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69182a, false, 78551, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.a(effect);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69182a, false, 78549, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69182a, false, 78549, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b(false);
        if (a().f69297d != 2) {
            this.h.g.a(a().f69295b.id, a().f69295b.tags_updated_at, e.f69520b);
            if (a().f69295b == null || a().f69295b.effect_type != 1) {
                this.h.a(a(), (k.c) this);
                return;
            }
            a().f69297d = 1;
            this.f69200d.c();
            b();
            a(true);
            this.h.b(a().f69295b, this.f69202f, null);
        }
    }

    public final void b(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f69182a, false, 78552, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f69182a, false, 78552, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.b(effect);
        if (TextUtils.equals(effect2.effect_id, a().f69295b.effect_id)) {
            EffectStickerManager effectStickerManager = this.h;
            int i = this.f69202f;
            if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i)}, effectStickerManager, EffectStickerManager.f3970a, false, 78594, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE)) {
                EffectStickerManager effectStickerManager2 = effectStickerManager;
                PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i)}, effectStickerManager2, EffectStickerManager.f3970a, false, 78594, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (effectStickerManager.l != null && effectStickerManager.n) {
                a.f75468b.a("prop_click", d.a().a("prop_id", effect2.effect_id).a("tab_name", FaceStickerBean.sCurPropSource).a("order", i - 1).a("enter_method", "click_main_panel").a("enter_from", "video_shoot_page").a("creation_id", effectStickerManager.l.q).a("shoot_way", effectStickerManager.l.r).a("draft_id", effectStickerManager.l.v).f34114b);
            }
            ((CurParentStickerViewModel) ViewModelProviders.of((FragmentActivity) effectStickerManager.f3973d).get(CurParentStickerViewModel.class)).a(new Pair(effectStickerManager.f3971b, null));
            effectStickerManager.h.c(q.a(effect));
        }
    }

    public final void a(Effect effect, c cVar) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar}, this, f69182a, false, 78553, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar}, this, f69182a, false, 78553, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        super.a(effect, cVar);
        if (TextUtils.equals(effect2.effect_id, a().f69295b.effect_id)) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f69201e, (int) C0906R.string.aa6, 0).a();
        }
    }

    public final void a(Effect effect, boolean z) {
        if (PatchProxy.isSupport(new Object[]{effect, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69182a, false, 78550, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Byte.valueOf(z)}, this, f69182a, false, 78550, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE);
        } else if (!effect.getTags().contains("new") || !z) {
            b(false);
        } else {
            b(true);
        }
    }

    public EffectGameViewHolder(View view, EffectStickerManager effectStickerManager, List<ah> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }
}
