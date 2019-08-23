package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.u.aa;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60670a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiAdLayout f60671b;

    /* renamed from: c  reason: collision with root package name */
    private final c f60672c;

    /* renamed from: d  reason: collision with root package name */
    private final String f60673d;

    /* renamed from: e  reason: collision with root package name */
    private final AwemeRawAd f60674e;

    e(PoiAdLayout poiAdLayout, c cVar, String str, AwemeRawAd awemeRawAd) {
        this.f60671b = poiAdLayout;
        this.f60672c = cVar;
        this.f60673d = str;
        this.f60674e = awemeRawAd;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60670a, false, 66339, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60670a, false, 66339, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiAdLayout poiAdLayout = this.f60671b;
        c cVar = this.f60672c;
        String str = this.f60673d;
        AwemeRawAd awemeRawAd = this.f60674e;
        a a2 = new a.C0670a().b(cVar.getPoiId()).a("poi_page").e(cVar.getPreviousPage()).i(str).f("click_button").a();
        if (PatchProxy.isSupport(new Object[]{a2}, null, b.f59767a, true, 64987, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{a2}, null, b.f59767a, true, 64987, new Class[]{a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(a2, "params");
            d a3 = d.a();
            if (!TextUtils.isEmpty(a2.f59756b)) {
                a3.a("poi_id", a2.f59756b);
            }
            if (!TextUtils.isEmpty(a2.f59755a)) {
                a3.a("enter_from", a2.f59755a);
            }
            if (!TextUtils.isEmpty(a2.f59760f)) {
                a3.a("enter_method", a2.f59760f);
            }
            if (!TextUtils.isEmpty(a2.j)) {
                a3.a("content_type", a2.j);
            }
            if (!TextUtils.isEmpty(a2.f59759e)) {
                a3.a("previous_page", a2.f59759e);
            }
            a3.a("city_info", aa.a());
            a3.a("poi_channel", aa.f75005b);
            h.a(a2, "click_ctrip_reserve_button", a3);
        }
        g.c(poiAdLayout.getContext(), j.a().a(cVar.getAwemeId()), "reserve", cVar.getPoiId());
        if (!com.ss.android.ugc.aweme.commercialize.utils.g.a(poiAdLayout.getContext(), awemeRawAd.getOpenUrl(), false)) {
            if (com.ss.android.ugc.aweme.commercialize.utils.g.a(poiAdLayout.getContext(), awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle()) && TextUtils.isEmpty(cVar.getAwemeId())) {
                g.d(poiAdLayout.getContext(), awemeRawAd, cVar.getPoiId());
                g.b(poiAdLayout.getContext(), awemeRawAd, cVar.getPoiId());
            }
        } else if (TextUtils.isEmpty(cVar.getAwemeId())) {
            g.d(poiAdLayout.getContext(), awemeRawAd, cVar.getPoiId());
            g.a(poiAdLayout.getContext(), awemeRawAd, cVar.getPoiId());
        }
    }
}
