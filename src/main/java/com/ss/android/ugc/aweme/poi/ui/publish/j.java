package com.ss.android.ugc.aweme.poi.ui.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commerce.service.a.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.util.f;
import java.util.Map;

public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60875a;

    /* renamed from: b  reason: collision with root package name */
    private final b f60876b;

    j(b bVar) {
        this.f60876b = bVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60875a, false, 66668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60875a, false, 66668, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f60876b;
        if (PatchProxy.isSupport(new Object[0], bVar, b.f60849a, false, 66653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f60849a, false, 66653, new Class[0], Void.TYPE);
            return;
        }
        r.a("click_add_product_bar", (Map) d.a().a("enter_from", "video_post_page").a("product_status", bVar.k == null ? PushConstants.PUSH_TYPE_NOTIFY : PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
        String str = bVar.k == null ? "" : bVar.k.draftId;
        f.a a2 = f.a((String) SharePrefCache.inst().getReactAddShopUrl().c());
        a2.a("enterFrom", "videoWindow");
        a2.a("draftId", str);
        h.a().a(a2.a().toString());
    }
}
