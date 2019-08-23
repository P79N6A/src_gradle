package com.ss.android.ugc.aweme.qrcode.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public final /* synthetic */ class h implements bv.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63434a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63435b;

    h(String str) {
        this.f63435b = str;
    }

    public final void a(String str, Effect effect) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, effect}, this, f63434a, false, 70468, new Class[]{String.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, effect}, this, f63434a, false, 70468, new Class[]{String.class, Effect.class}, Void.TYPE);
            return;
        }
        r.a("shoot", (Map) d.a().a("creation_id", str2).a("shoot_way", "scan").a("prop_id", this.f63435b).a("_staging_flag", a.b() ^ true ? 1 : 0).f34114b);
    }
}
