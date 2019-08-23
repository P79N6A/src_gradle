package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.aweme.utils.de;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class EffectStickerViewHolder extends EffectStickerBaseViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69217a;

    public final void a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69217a, false, 78630, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69217a, false, 78630, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.a(effect);
    }

    public final void b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f69217a, false, 78631, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f69217a, false, 78631, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.b(effect);
        if (effect.effect_id.equals(a().f69295b.effect_id)) {
            a(true);
            this.h.b(effect, this.f69202f, this.h.a(this.i, this.f69202f));
        }
    }

    public void onClick(View view) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f69217a, false, 78623, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69217a, false, 78623, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Effect effect = a().f69295b;
        if (PatchProxy.isSupport(new Object[]{effect}, null, de.f75735a, true, 88498, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, null, de.f75735a, true, 88498, new Class[]{Effect.class}, Void.TYPE);
        } else if (a.a() && de.f75736b.b(effect)) {
            r rVar = com.ss.android.ugc.aweme.port.in.a.n;
            if (effect != null) {
                str = effect.ad_raw_data;
            } else {
                str = null;
            }
            rVar.a("camera_ad", "click", "sticker", str, null);
        }
        if (this.f69200d.a()) {
            b(false);
        }
        if (a().f69297d != 2 && !ae.c(this.h.f3971b)) {
            if (this.h.b(a().f69295b)) {
                this.h.a(a().f69295b);
                a(false);
            } else if (a().f69295b == null || a().f69295b.effect_type != 2) {
                this.h.g.a(a().f69295b.id, a().f69295b.tags_updated_at, (p) new p() {
                    public final void a() {
                    }
                });
                if (PatchProxy.isSupport(new Object[0], this, f69217a, false, 78629, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69217a, false, 78629, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    Effect effect2 = a().f69295b;
                    if (effect2 == null || (effect2.effect_type != 1 && !effect2.getTags().contains("hw_beauty"))) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    a().f69297d = 1;
                    this.f69200d.c();
                    b();
                    a(true);
                    this.h.b(a().f69295b, this.f69202f, null);
                    return;
                }
                this.h.a(a(), (k.c) this);
            } else {
                ac.a(a().f69295b);
            }
        }
    }

    public final void a(Effect effect, c cVar) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar}, this, f69217a, false, 78632, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar}, this, f69217a, false, 78632, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        super.a(effect, cVar);
        if (effect2.effect_id.equals(a().f69295b.effect_id)) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f69201e, (int) C0906R.string.aa6, 0).a();
        }
    }

    public final void a(Effect effect, boolean z) {
        if (PatchProxy.isSupport(new Object[]{effect, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69217a, false, 78624, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Byte.valueOf(z)}, this, f69217a, false, 78624, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE);
        } else if (!effect.getTags().contains("new") || !z) {
            b(false);
        } else {
            b(true);
        }
    }

    public EffectStickerViewHolder(View view, EffectStickerManager effectStickerManager, List<ah> list) {
        super(view, effectStickerManager, list);
        view.setOnClickListener(this);
    }
}
