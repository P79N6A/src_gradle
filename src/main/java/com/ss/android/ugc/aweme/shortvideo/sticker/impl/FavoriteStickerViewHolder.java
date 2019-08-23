package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class FavoriteStickerViewHolder extends EffectStickerBaseViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69628a;

    public final void a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69628a, false, 79189, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69628a, false, 79189, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.a(effect);
    }

    public final void b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69628a, false, 79190, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69628a, false, 79190, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.b(effect);
        if (effect.effect_id.equals(a().f69295b.effect_id)) {
            a(true);
            this.h.b(effect, this.f69202f, this.h.a(this.i, this.f69202f));
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69628a, false, 79187, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69628a, false, 79187, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b(false);
        if (a().f69297d != 2) {
            if (this.h.b(a().f69295b)) {
                this.h.a(a().f69295b);
                a(false);
                return;
            }
            this.h.g.a(a().f69295b.id, a().f69295b.tags_updated_at, (p) new p() {
                public final void a() {
                }
            });
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

    public final void a(Effect effect, c cVar) {
        if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f69628a, false, 79191, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f69628a, false, 79191, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        super.a(effect, cVar);
    }

    public FavoriteStickerViewHolder(EffectStickerManager effectStickerManager, View view, List<ah> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }
}
