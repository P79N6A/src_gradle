package com.ss.android.ugc.aweme.filter.d;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.utils.es;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47571a;

    /* renamed from: b  reason: collision with root package name */
    public EffectPlatform f47572b;

    public final EffectPlatform a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f47571a, false, 44459, new Class[]{Context.class}, EffectPlatform.class)) {
            return (EffectPlatform) PatchProxy.accessDispatch(new Object[]{context}, this, f47571a, false, 44459, new Class[]{Context.class}, EffectPlatform.class);
        }
        if (this.f47572b == null) {
            this.f47572b = new EffectPlatform(context, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
        }
        return this.f47572b;
    }

    @NonNull
    public final List<h> a(List<Effect> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47571a, false, 44461, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f47571a, false, 44461, new Class[]{List.class}, List.class);
        } else if (Lists.isEmpty(list)) {
            return new ArrayList();
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (Effect next : list) {
                h hVar = new h();
                hVar.f47599c = next.name;
                hVar.f47600d = w.a(next);
                hVar.f47598b = Integer.parseInt(next.effect_id);
                hVar.f47601e = es.a(com.ss.android.ugc.aweme.effectplatform.a.a(next.file_url));
                hVar.k = next.getTags();
                hVar.g = Uri.parse(next.icon_url.url_list.get(0));
                arrayList.add(hVar);
            }
            return arrayList;
        }
    }
}
