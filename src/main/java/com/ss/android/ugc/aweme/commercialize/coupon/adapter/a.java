package com.ss.android.ugc.aweme.commercialize.coupon.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38575a;

    /* renamed from: b  reason: collision with root package name */
    private final CouponListAdapter.CouponListViewHolder f38576b;

    /* renamed from: c  reason: collision with root package name */
    private final c f38577c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38578d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38579e;

    a(CouponListAdapter.CouponListViewHolder couponListViewHolder, c cVar, int i, boolean z) {
        this.f38576b = couponListViewHolder;
        this.f38577c = cVar;
        this.f38578d = i;
        this.f38579e = z;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38575a, false, 30438, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38575a, false, 30438, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CouponListAdapter.CouponListViewHolder couponListViewHolder = this.f38576b;
        c cVar = this.f38577c;
        int i = this.f38578d;
        boolean z = this.f38579e;
        if (couponListViewHolder.h.get() != null) {
            Activity activity = (Activity) couponListViewHolder.h.get();
            int couponId = cVar.getCouponId();
            String codeId = cVar.getCodeId();
            int i2 = CouponListAdapter.f38561c;
            if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(couponId), codeId, Integer.valueOf(i), Integer.valueOf(i2)}, null, CouponDetailActivity.f2896a, true, 30470, new Class[]{Activity.class, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(couponId), codeId, Integer.valueOf(i), Integer.valueOf(i2)}, null, CouponDetailActivity.f2896a, true, 30470, new Class[]{Activity.class, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Intent intent = new Intent(activity, CouponDetailActivity.class);
                intent.putExtra("coupon_id", String.valueOf(couponId));
                intent.putExtra("code_id", codeId);
                intent.putExtra("coupon_list_position", i);
                activity.startActivityForResult(intent, i2);
            }
        }
        r.a("click_coupon", (Map) d.a().a("enter_from", z ? "card_bag" : "invalid_card_bag").a("previous_page", z ? "card_bag" : "invalid_card_bag").a("enter_method", "click_card_bag").a("coupon_id", cVar.getCouponId()).a("coupon_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(view.getContext(), cVar.getStatus(), true)).a("source_type", com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).f34114b);
    }
}
