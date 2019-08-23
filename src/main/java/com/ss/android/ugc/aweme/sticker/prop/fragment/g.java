package com.ss.android.ugc.aweme.sticker.prop.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.bv;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public final /* synthetic */ class g implements bv.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71731a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71732b;

    g(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f71732b = stickerPropDetailFragment;
    }

    public final void a(String str, Effect effect) {
        String str2 = str;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{str2, effect2}, this, f71731a, false, 82049, new Class[]{String.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, effect2}, this, f71731a, false, 82049, new Class[]{String.class, Effect.class}, Void.TYPE);
            return;
        }
        StickerPropDetailFragment stickerPropDetailFragment = this.f71732b;
        r.a("shoot", (Map) d.a().a("creation_id", str2).a("shoot_way", "prop_page").a("prop_id", effect2.effect_id).a("group_id", stickerPropDetailFragment.y).a("log_pb", stickerPropDetailFragment.x).a("enter_from", "prop_page").a("enter_method", "click_prop_publish").f34114b);
    }
}
