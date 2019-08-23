package com.ss.android.ugc.aweme.poi.e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59803a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f59804b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f59805c;

    /* renamed from: d  reason: collision with root package name */
    private final PoiDetail f59806d;

    /* renamed from: e  reason: collision with root package name */
    private final c f59807e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f59808f;
    private final String g;
    private final String h;

    public k(boolean z, Context context, PoiDetail poiDetail, c cVar, String[] strArr, String str, String str2) {
        this.f59804b = z;
        this.f59805c = context;
        this.f59806d = poiDetail;
        this.f59807e = cVar;
        this.f59808f = strArr;
        this.g = str;
        this.h = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59803a, false, 66854, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f59803a, false, 66854, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean z = this.f59804b;
        Context context = this.f59805c;
        PoiDetail poiDetail = this.f59806d;
        c cVar = this.f59807e;
        String[] strArr = this.f59808f;
        String str = this.g;
        String str2 = this.h;
        if (i != 0 || !z) {
            h.a(cVar, "poi_contact_method", d.a().a("enter_method", "click").a("previous_page", cVar.getPreviousPage()).a("poi_id", poiDetail.getPoiId()).a("content_type", "phone"));
            h.b(context, strArr[i], str, str2, cVar);
        } else {
            if (PatchProxy.isSupport(new Object[]{context, poiDetail, cVar}, null, h.f59792a, true, 66832, new Class[]{Context.class, PoiDetail.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, poiDetail, cVar}, null, h.f59792a, true, 66832, new Class[]{Context.class, PoiDetail.class, c.class}, Void.TYPE);
            } else {
                if (poiDetail.isEnterprise()) {
                    h.a(cVar, "poi_contact_method", d.a().a("enter_method", "click").a("previous_page", cVar.getPreviousPage()).a("poi_id", poiDetail.getPoiId()).a("content_type", "message"));
                    if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        e.a((Activity) context, "poi_page", "click_chat_button", (f) new l(context, poiDetail));
                    } else {
                        h.a(context, poiDetail);
                    }
                }
            }
        }
    }
}
