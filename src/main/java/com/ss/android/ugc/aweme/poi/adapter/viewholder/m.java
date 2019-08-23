package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/adapter/viewholder/PoiTourProductPresenter;", "", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mContext", "Landroid/content/Context;", "mDiscount", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mImg", "Lcom/ss/android/ugc/aweme/base/ui/SquareImageView;", "mPrice", "mPriceEnd", "mTag1", "mTag2", "mTag2Divider", "mTitle", "bind", "", "ad", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "poiSimpleBundle", "Lcom/ss/android/ugc/aweme/poi/PoiSimpleBundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59694a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f59695b;

    /* renamed from: c  reason: collision with root package name */
    private final SquareImageView f59696c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtTextView f59697d;

    /* renamed from: e  reason: collision with root package name */
    private final DmtTextView f59698e;

    /* renamed from: f  reason: collision with root package name */
    private final DmtTextView f59699f;
    private final View g;
    private final DmtTextView h;
    private final View i;
    private final DmtTextView j;
    private final View k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f59701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f59702c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f59703d;

        a(m mVar, c cVar, AwemeRawAd awemeRawAd) {
            this.f59701b = mVar;
            this.f59702c = cVar;
            this.f59703d = awemeRawAd;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (PatchProxy.isSupport(new Object[]{view}, this, f59700a, false, 64908, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f59700a, false, 64908, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            c cVar = this.f59702c;
            d a2 = d.a().a("enter_from", "poi_page");
            c cVar2 = this.f59702c;
            String str6 = null;
            if (cVar2 != null) {
                str = cVar2.getPoiId();
            } else {
                str = null;
            }
            h.a(cVar, "click_poi_product", a2.a("poi_id", str).a("product_id", this.f59703d.getCreativeIdStr()).a("poi_posititon", "poi_page"));
            if (g.a(this.f59701b.f59695b, this.f59703d.getOpenUrl(), false)) {
                c cVar3 = this.f59702c;
                if (cVar3 != null) {
                    str2 = cVar3.getAwemeId();
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    Context context = this.f59701b.f59695b;
                    AwemeRawAd awemeRawAd = this.f59703d;
                    c cVar4 = this.f59702c;
                    if (cVar4 != null) {
                        str3 = cVar4.getPoiId();
                    } else {
                        str3 = null;
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.d(context, awemeRawAd, str3);
                    Context context2 = this.f59701b.f59695b;
                    AwemeRawAd awemeRawAd2 = this.f59703d;
                    c cVar5 = this.f59702c;
                    if (cVar5 != null) {
                        str6 = cVar5.getPoiId();
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.a(context2, awemeRawAd2, str6);
                }
            } else if (g.a(this.f59701b.f59695b, this.f59703d.getWebUrl(), this.f59703d.getWebTitle())) {
                c cVar6 = this.f59702c;
                if (cVar6 != null) {
                    str4 = cVar6.getAwemeId();
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    Context context3 = this.f59701b.f59695b;
                    AwemeRawAd awemeRawAd3 = this.f59703d;
                    c cVar7 = this.f59702c;
                    if (cVar7 != null) {
                        str5 = cVar7.getPoiId();
                    } else {
                        str5 = null;
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.d(context3, awemeRawAd3, str5);
                    Context context4 = this.f59701b.f59695b;
                    AwemeRawAd awemeRawAd4 = this.f59703d;
                    c cVar8 = this.f59702c;
                    if (cVar8 != null) {
                        str6 = cVar8.getPoiId();
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.b(context4, awemeRawAd4, str6);
                }
            }
        }
    }

    public m(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.k = view;
        Context context = this.k.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        this.f59695b = context;
        View findViewById = this.k.findViewById(C0906R.id.c3l);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.poi_tour_img)");
        this.f59696c = (SquareImageView) findViewById;
        View findViewById2 = this.k.findViewById(C0906R.id.c3x);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.poi_tour_title)");
        this.f59697d = (DmtTextView) findViewById2;
        View findViewById3 = this.k.findViewById(C0906R.id.c3u);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.poi_tour_tag1)");
        this.f59698e = (DmtTextView) findViewById3;
        View findViewById4 = this.k.findViewById(C0906R.id.c3v);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.poi_tour_tag2)");
        this.f59699f = (DmtTextView) findViewById4;
        View findViewById5 = this.k.findViewById(C0906R.id.c3w);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.poi_tour_tag2_divider)");
        this.g = findViewById5;
        View findViewById6 = this.k.findViewById(C0906R.id.c3n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.poi_tour_price)");
        this.h = (DmtTextView) findViewById6;
        View findViewById7 = this.k.findViewById(C0906R.id.c3p);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.poi_tour_price_end)");
        this.i = findViewById7;
        View findViewById8 = this.k.findViewById(C0906R.id.c3o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.….poi_tour_price_discount)");
        this.j = (DmtTextView) findViewById8;
    }

    public final void a(@NotNull AwemeRawAd awemeRawAd, @Nullable c cVar) {
        String str;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{awemeRawAd2, cVar2}, this, f59694a, false, 64907, new Class[]{AwemeRawAd.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeRawAd2, cVar2}, this, f59694a, false, 64907, new Class[]{AwemeRawAd.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(awemeRawAd2, "ad");
        d a2 = d.a().a("enter_from", "poi_page").a("enter_method", "show");
        if (cVar2 != null) {
            str = cVar.getPoiId();
        } else {
            str = null;
        }
        h.a(cVar2, "show_poi_product", a2.a("poi_id", str).a("poi_posititon", "poi_page").a("product_id", awemeRawAd.getCreativeIdStr()));
        this.k.setOnClickListener(new a(this, cVar2, awemeRawAd2));
        if (!CollectionUtils.isEmpty(awemeRawAd.getImageList())) {
            com.ss.android.ugc.aweme.base.c.b(this.f59696c, awemeRawAd.getImageList().get(0));
        }
        this.f59697d.setText(awemeRawAd.getTitle());
        this.f59698e.setVisibility(8);
        this.f59699f.setVisibility(8);
        this.g.setVisibility(8);
        if (!TextUtils.isEmpty(awemeRawAd.getFeatureLabel())) {
            try {
                String featureLabel = awemeRawAd.getFeatureLabel();
                Intrinsics.checkExpressionValueIsNotNull(featureLabel, "ad.featureLabel");
                List split$default = StringsKt.split$default((CharSequence) featureLabel, new String[]{"|"}, false, 0, 6, (Object) null);
                if (!CollectionUtils.isEmpty(split$default)) {
                    this.f59698e.setVisibility(0);
                    this.f59698e.setText((CharSequence) split$default.get(0));
                    if (split$default.size() > 1) {
                        this.g.setVisibility(0);
                        this.f59699f.setVisibility(0);
                        this.f59699f.setText((CharSequence) split$default.get(1));
                    }
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
        if (TextUtils.isEmpty(awemeRawAd.getPrice())) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.i.setVisibility(0);
            this.h.setText(awemeRawAd.getPrice());
        }
        if (TextUtils.isEmpty(awemeRawAd.getPromotionLabel())) {
            this.j.setVisibility(8);
            return;
        }
        this.j.setVisibility(0);
        this.j.setText(awemeRawAd.getPromotionLabel());
    }
}
