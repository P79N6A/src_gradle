package com.ss.android.ugc.effectmanager.effect.c;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.f.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.g;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public EffectChannelResponse f77364a;

    /* renamed from: b  reason: collision with root package name */
    public g f77365b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Effect> f77366c = new ArrayList();

    public c(g gVar) {
        this.f77365b = gVar;
    }

    public final boolean a(Effect effect) {
        if (b(effect)) {
            return false;
        }
        return d.a(effect.unzipPath);
    }

    public final boolean b(Effect effect) {
        if (effect == null) {
            return false;
        }
        synchronized (this.f77366c) {
            for (Effect effect2 : this.f77366c) {
                if (TextUtils.equals(effect2.effect_id, effect.effect_id)) {
                    return true;
                }
            }
            return false;
        }
    }
}
