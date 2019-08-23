package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.model.a;

public class PoiAdLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60632a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f60633b;

    /* renamed from: c  reason: collision with root package name */
    private CircleImageView f60634c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f60635d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f60636e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f60637f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private boolean k;

    public PoiAdLayout(Context context) {
        this(context, null);
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(@NonNull AwemeRawAd awemeRawAd, String str) {
        if (PatchProxy.isSupport(new Object[]{awemeRawAd, str}, this, f60632a, false, 66338, new Class[]{AwemeRawAd.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeRawAd, str}, this, f60632a, false, 66338, new Class[]{AwemeRawAd.class, String.class}, Void.TYPE);
        } else if (!this.k) {
            this.k = true;
            g.c(getContext(), awemeRawAd, str);
        }
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(C0906R.layout.a79, this);
        this.f60633b = (RelativeLayout) findViewById(C0906R.id.byt);
        this.f60634c = (CircleImageView) findViewById(C0906R.id.bys);
        this.f60635d = (TextView) findViewById(C0906R.id.bz2);
        this.f60636e = (TextView) findViewById(C0906R.id.bz4);
        this.f60637f = (TextView) findViewById(C0906R.id.byw);
        this.g = (TextView) findViewById(C0906R.id.bz1);
        this.h = (TextView) findViewById(C0906R.id.byz);
        this.i = (TextView) findViewById(C0906R.id.byy);
        this.j = (TextView) findViewById(C0906R.id.byu);
    }

    public final void a(a aVar, String str, c cVar) {
        String str2 = str;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{aVar, str2, cVar2}, this, f60632a, false, 66337, new Class[]{a.class, String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, str2, cVar2}, this, f60632a, false, 66337, new Class[]{a.class, String.class, c.class}, Void.TYPE);
        } else if (aVar != null) {
            AwemeRawAd awemeAd = aVar.getAwemeAd();
            if (awemeAd != null) {
                b.c(new a.C0670a().b(cVar.getPoiId()).a("poi_page").e(cVar.getPreviousPage()).i(str2).a(cVar2).f("click_button").a());
                this.f60633b.setVisibility(0);
                com.ss.android.ugc.aweme.base.c.b(this.f60634c, awemeAd.getAvatarIcon());
                this.f60635d.setText(awemeAd.getSource());
                this.f60636e.setText(awemeAd.getTitle());
                this.j.setText(awemeAd.getButtonText());
                if (TextUtils.isEmpty(awemeAd.getFeatureLabel())) {
                    this.f60637f.setVisibility(8);
                } else {
                    this.f60637f.setVisibility(0);
                    this.f60637f.setText(awemeAd.getFeatureLabel());
                }
                String price = awemeAd.getPrice();
                if (TextUtils.isEmpty(price)) {
                    this.g.setVisibility(8);
                    this.h.setVisibility(8);
                    this.i.setVisibility(8);
                } else {
                    this.g.setText(price);
                    if (TextUtils.isEmpty(awemeAd.getOriginPrice())) {
                        this.h.setVisibility(8);
                    } else {
                        this.i.setText(awemeAd.getOriginPrice());
                        this.i.getPaint().setFlags(16);
                    }
                }
                this.f60633b.setOnClickListener(new e(this, cVar2, str2, awemeAd));
                if (TextUtils.isEmpty(cVar.getAwemeId())) {
                    a(awemeAd, cVar.getPoiId());
                }
            }
        }
    }
}
