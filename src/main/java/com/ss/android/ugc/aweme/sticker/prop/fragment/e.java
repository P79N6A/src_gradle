package com.ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sticker.model.a;
import java.util.Map;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71726a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerPropDetailFragment f71727b;

    /* renamed from: c  reason: collision with root package name */
    private final a f71728c;

    e(StickerPropDetailFragment stickerPropDetailFragment, a aVar) {
        this.f71727b = stickerPropDetailFragment;
        this.f71728c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71726a, false, 82047, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71726a, false, 82047, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment stickerPropDetailFragment = this.f71727b;
        a aVar = this.f71728c;
        r.a("click_link", (Map) new d().a("enter_from", "prop_page").a("type", "web_link").a("prop_id", aVar.getId()).f34114b);
        if (!g.a(stickerPropDetailFragment.getContext(), aVar.getDetailOpenUrl(), false)) {
            g.a(stickerPropDetailFragment.getContext(), aVar.getDetailWebUrl(), aVar.getDetailWebUrlTitle());
        }
    }
}
