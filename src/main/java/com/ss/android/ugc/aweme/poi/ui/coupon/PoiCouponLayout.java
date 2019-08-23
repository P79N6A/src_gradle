package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.coupon.model.a;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment;
import java.util.List;

public class PoiCouponLayout extends RelativeLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60638a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f60639b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f60640c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f60641d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f60642e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f60643f;
    private ImageView g;
    private ImageView h;
    private boolean i;
    private c j;
    private AbsFragment k;
    private com.ss.android.ugc.aweme.poi.c l;

    public final void a(Bundle bundle) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60638a, false, 66344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60638a, false, 66344, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60638a, false, 66345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60638a, false, 66345, new Class[0], Void.TYPE);
            return;
        }
        ((AbsPoiAwemeFeedFragment) this.k).a(this.l.getPoiId(), this.j.getActivityId());
        b(this.j);
    }

    public PoiCouponLayout(Context context) {
        this(context, null);
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f60638a, false, 66341, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f60638a, false, 66341, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null && this.f60643f != null) {
            if (cVar.getStatus() == a.StatusRedeemed.value) {
                this.f60643f.setText(getContext().getString(C0906R.string.a2o));
            } else {
                this.f60643f.setText(getContext().getString(C0906R.string.a32));
            }
            setOnClickListener(new g(this, cVar));
        }
    }

    private void c(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f60638a, false, 66342, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f60638a, false, 66342, new Class[]{c.class}, Void.TYPE);
        } else if (!this.i) {
            this.i = true;
            b.d(new a.C0670a().b(this.l.getPoiId()).a("poi_page").e(this.l.getPreviousPage()).g(String.valueOf(cVar.getCouponId())).f("click_button").h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(getContext(), cVar.getStatus(), true)).j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).a(this.l).a());
        }
    }

    /* access modifiers changed from: package-private */
    public void b(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f60638a, false, 66343, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f60638a, false, 66343, new Class[]{c.class}, Void.TYPE);
            return;
        }
        g.g(getContext(), j.a().a(this.l.getAwemeId()), this.l.getPoiId());
        b.e(new a.C0670a().b(this.l.getPoiId()).a("poi_page").e(this.l.getPreviousPage()).g(String.valueOf(cVar.getCouponId())).f("click_button").h(com.ss.android.ugc.aweme.commercialize.coupon.a.a(getContext(), cVar.getStatus(), true)).j(com.ss.android.ugc.aweme.commercialize.coupon.a.a(cVar)).a(this.l).a());
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(C0906R.layout.a7e, this);
        this.f60639b = (RelativeLayout) findViewById(C0906R.id.bzy);
        this.f60640c = (RemoteImageView) findViewById(C0906R.id.bzz);
        this.f60641d = (TextView) findViewById(C0906R.id.a10);
        this.f60642e = (TextView) findViewById(C0906R.id.c03);
        this.f60643f = (TextView) findViewById(C0906R.id.c02);
        this.g = (ImageView) findViewById(C0906R.id.asr);
        this.h = (ImageView) findViewById(C0906R.id.ass);
    }

    public final void a(c cVar, AbsFragment absFragment, List<String> list, com.ss.android.ugc.aweme.poi.c cVar2) {
        c cVar3 = cVar;
        AbsFragment absFragment2 = absFragment;
        com.ss.android.ugc.aweme.poi.c cVar4 = cVar2;
        if (PatchProxy.isSupport(new Object[]{cVar3, absFragment2, list, cVar4}, this, f60638a, false, 66340, new Class[]{c.class, AbsFragment.class, List.class, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar3, absFragment2, list, cVar4}, this, f60638a, false, 66340, new Class[]{c.class, AbsFragment.class, List.class, com.ss.android.ugc.aweme.poi.c.class}, Void.TYPE);
        } else if (cVar3 != null && p.a(list)) {
            this.l = cVar4;
            this.j = cVar3;
            this.k = absFragment2;
            this.f60639b.setVisibility(0);
            com.ss.android.ugc.aweme.base.c.b(this.f60640c, cVar.getHeadImageUrl());
            if (!TextUtils.isEmpty(cVar3.validDateText)) {
                this.f60641d.setVisibility(0);
                this.f60641d.setText(cVar3.validDateText);
            } else {
                this.f60641d.setVisibility(8);
            }
            this.f60642e.setText(cVar.getTitle());
            if (cVar.isDefaultHeadImage()) {
                this.g.setVisibility(8);
                this.h.setVisibility(8);
                this.f60642e.setShadowLayer(UIUtils.dip2Px(getContext(), 1.5f), 0.0f, UIUtils.dip2Px(getContext(), 0.5f), getResources().getColor(C0906R.color.xm));
                this.f60641d.setShadowLayer(UIUtils.dip2Px(getContext(), 1.5f), 0.0f, UIUtils.dip2Px(getContext(), 0.5f), getResources().getColor(C0906R.color.xm));
            } else {
                this.g.setVisibility(0);
                this.g.setImageResource(2130837899);
                this.g.setAlpha(1.0f);
                this.h.setVisibility(0);
                this.h.setImageResource(2130837900);
                this.h.setAlpha(1.0f);
            }
            if (cVar.getStatus() == com.ss.android.ugc.aweme.commercialize.coupon.model.a.StatusUnReceived.value) {
                this.f60643f.setText(getContext().getString(C0906R.string.a38));
                setOnClickListener(new f(this, absFragment2));
            } else {
                a(cVar);
            }
            c(cVar);
        }
    }
}
