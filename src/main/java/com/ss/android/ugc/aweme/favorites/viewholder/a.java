package com.ss.android.ugc.aweme.favorites.viewholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public final /* synthetic */ class a implements bv.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44405a;

    /* renamed from: b  reason: collision with root package name */
    static final bv.a f44406b = new a();

    private a() {
    }

    public final void a(String str, Effect effect) {
        String str2 = str;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{str2, effect2}, this, f44405a, false, 39710, new Class[]{String.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, effect2}, this, f44405a, false, 39710, new Class[]{String.class, Effect.class}, Void.TYPE);
            return;
        }
        r.a("shoot", (Map) d.a().a("creation_id", str2).a("shoot_way", "prop_page").a("prop_id", effect2.effect_id).a("enter_from", "prop_collection").f34114b);
    }
}
