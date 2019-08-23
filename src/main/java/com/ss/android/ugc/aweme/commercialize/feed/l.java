package com.ss.android.ugc.aweme.commercialize.feed;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38839a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38840b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38841c;

    l(CommerceVideoDelegate commerceVideoDelegate, int i) {
        this.f38840b = commerceVideoDelegate;
        this.f38841c = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38839a, false, 30691, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38839a, false, 30691, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceVideoDelegate commerceVideoDelegate = this.f38840b;
        int i = this.f38841c;
        String a2 = b.b().a(commerceVideoDelegate.k, "star_atlas_url_redirect");
        if (!TextUtils.isEmpty(a2)) {
            r.a("starmap_bar_review_click", (Map) d.a().a("group_id", commerceVideoDelegate.f38688e.getAid()).a("enter_from", "click_bar").a("tag_label", c.a(i)).f34114b);
            Uri.Builder buildUpon = Uri.parse(a2).buildUpon();
            buildUpon.appendQueryParameter("scene", "video_status");
            buildUpon.appendQueryParameter("item_id", commerceVideoDelegate.f38688e.getAid());
            buildUpon.appendQueryParameter("order_id", String.valueOf(commerceVideoDelegate.f38688e.getStarAtlasOrderId()));
            g.a(commerceVideoDelegate.k, buildUpon.toString(), "");
        }
    }
}
