package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.adpater;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerBaseViewHolder;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ac;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.k;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class MultiStickerViewHolder extends EffectStickerBaseViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70162a;
    List<ah> l;

    public final void a(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f70162a, false, 79817, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f70162a, false, 79817, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.a(effect);
    }

    public final void b(Effect effect) {
        ah ahVar;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f70162a, false, 79818, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f70162a, false, 79818, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        super.b(effect);
        if (effect2.effect_id.equals(a().f69295b.effect_id)) {
            this.f69202f = getAdapterPosition();
            a(true);
            EffectStickerManager effectStickerManager = this.h;
            int i = this.f69202f;
            EffectStickerManager effectStickerManager2 = this.h;
            List<ah> list = this.l;
            int i2 = this.f69202f;
            if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, effectStickerManager2, EffectStickerManager.f3970a, false, 78602, new Class[]{List.class, Integer.TYPE}, ah.class)) {
                EffectStickerManager effectStickerManager3 = effectStickerManager2;
                ahVar = (ah) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, effectStickerManager3, EffectStickerManager.f3970a, false, 78602, new Class[]{List.class, Integer.TYPE}, ah.class);
            } else {
                if (list != null && list.size() >= i2) {
                    int i3 = i2 + 1;
                    while (true) {
                        if (i3 >= list.size()) {
                            break;
                        } else if (effectStickerManager2.a(list.get(i3))) {
                            ahVar = list.get(i3);
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                ahVar = null;
            }
            effectStickerManager.b(effect2, i, ahVar);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70162a, false, 79815, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70162a, false, 79815, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (PatchProxy.isSupport(new Object[0], this, f70162a, false, 79816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70162a, false, 79816, new Class[0], Void.TYPE);
        } else if (a().f69295b == null || a().f69295b.effect_type != 2) {
            if (this.f69200d.a()) {
                b(false);
            }
            if (a().f69297d != 2) {
                this.h.a(a(), (k.c) this);
            }
        } else {
            ac.a(a().f69295b);
        }
    }

    public final void a(Effect effect, int i) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i)}, this, f70162a, false, 79820, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i)}, this, f70162a, false, 79820, new Class[]{Effect.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(effect2.effect_id, a().f69295b.effect_id)) {
            a().f69297d = 5;
            this.f69200d.a(i);
            b();
        }
    }

    MultiStickerViewHolder(View view, EffectStickerManager effectStickerManager) {
        super(view, effectStickerManager, null);
        if (PatchProxy.isSupport(new Object[]{view}, this, EffectStickerBaseViewHolder.f69198b, false, 78584, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, EffectStickerBaseViewHolder.f69198b, false, 78584, new Class[]{View.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(view, "<set-?>");
            this.g = view;
        }
        Context context = view.getContext();
        if (PatchProxy.isSupport(new Object[]{context}, this, EffectStickerBaseViewHolder.f69198b, false, 78576, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, EffectStickerBaseViewHolder.f69198b, false, 78576, new Class[]{Context.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(context, "<set-?>");
            this.f69201e = context;
        }
        this.h = effectStickerManager;
        if (PatchProxy.isSupport(new Object[0], this, f70162a, false, 79813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70162a, false, 79813, new Class[0], Void.TYPE);
            return;
        }
        this.itemView.setOnClickListener(this);
    }

    public final void a(Effect effect, c cVar) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, cVar}, this, f70162a, false, 79819, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, cVar}, this, f70162a, false, 79819, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        super.a(effect, cVar);
        if (effect2.effect_id.equals(a().f69295b.effect_id)) {
            a.b(this.f69201e, (int) C0906R.string.aa6, 0).a();
        }
    }

    public final void a(Effect effect, boolean z) {
        if (PatchProxy.isSupport(new Object[]{effect, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70162a, false, 79821, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, Byte.valueOf(z)}, this, f70162a, false, 79821, new Class[]{Effect.class, Boolean.TYPE}, Void.TYPE);
        } else if (!effect.getTags().contains("new") || !z) {
            b(false);
        } else {
            b(true);
        }
    }
}
