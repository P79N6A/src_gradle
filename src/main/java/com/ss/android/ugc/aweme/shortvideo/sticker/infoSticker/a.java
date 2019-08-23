package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.annotation.NonNull;
import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

public final class a implements f<ProviderEffect, Effect> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69817a;

    /* renamed from: a */
    public final Effect apply(@NonNull ProviderEffect providerEffect) {
        ProviderEffect providerEffect2 = providerEffect;
        if (PatchProxy.isSupport(new Object[]{providerEffect2}, this, f69817a, false, 79242, new Class[]{ProviderEffect.class}, Effect.class)) {
            return (Effect) PatchProxy.accessDispatch(new Object[]{providerEffect2}, this, f69817a, false, 79242, new Class[]{ProviderEffect.class}, Effect.class);
        }
        Effect effect = new Effect();
        effect.effect_id = providerEffect2.id;
        effect.name = providerEffect2.title;
        effect.unzipPath = providerEffect2.path;
        effect.effect_type = 10;
        return effect;
    }
}
