package com.ss.android.ugc.aweme.commerce.portfolio.holders;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.commerce.service.logs.am;
import com.ss.android.ugc.aweme.commerce.service.models.w;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J<\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "parentView", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "uid", "", "selectColumn", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mCB", "Lkotlin/Function2;", "setCouponAndReduction", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37064a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37065b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioHolder$Companion;", "", "()V", "VALUE_100", "", "VALUE_13", "", "VALUE_15", "VALUE_35", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioHolder$bind$2", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "o", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.widget.flowlayout.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioHolder f37067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f37068c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PortfolioHolder portfolioHolder, w wVar, List list) {
            super(list);
            this.f37067b = portfolioHolder;
            this.f37068c = wVar;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37066a, false, 28462, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37066a, false, 28462, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(str, "o");
            View view = this.f37067b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            LayoutInflater from = LayoutInflater.from(view.getContext());
            View view2 = this.f37067b.itemView;
            if (view2 != null) {
                View inflate = from.inflate(C0906R.layout.a2r, (ViewGroup) view2, false);
                if (inflate != null) {
                    TextView textView = (TextView) inflate;
                    textView.setText(str);
                    textView.setIncludeFontPadding(false);
                    return textView;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37069a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f37070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f37071c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37072d;

        public c(Function2 function2, w wVar, String str) {
            this.f37070b = function2;
            this.f37071c = wVar;
            this.f37072d = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37069a, false, 28463, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37069a, false, 28463, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2 function2 = this.f37070b;
            if (function2 != null) {
                function2.invoke(this.f37071c, this.f37072d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioHolder f37074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ w f37075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f37076d;

        public d(PortfolioHolder portfolioHolder, w wVar, String str) {
            this.f37074b = portfolioHolder;
            this.f37075c = wVar;
            this.f37076d = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37073a, false, 28464, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37073a, false, 28464, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            new am().a(Long.valueOf(this.f37075c.getCommodityType())).c(this.f37075c.getLastAwemeId()).b(this.f37076d).a(this.f37075c.getPromotionId()).d("store_page").a(this.f37075c.getElasticType()).b();
            if (!TextUtils.isEmpty(this.f37075c.getLastAwemeId())) {
                h a2 = h.a();
                View view2 = this.f37074b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = view2.getContext();
                if (context != null) {
                    a2.a((Activity) context, "aweme://aweme/detail/" + this.f37075c.getLastAwemeId());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioHolder$setCouponAndReduction$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioHolder f37078b;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f37077a, false, 28465, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37077a, false, 28465, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f37078b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(C0906R.id.c4h);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "itemView.portfolio_reduction_tag");
            int width = dmtTextView.getWidth();
            View view2 = this.f37078b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            ((DmtTextView) view2.findViewById(C0906R.id.c4h)).measure(0, 0);
            View view3 = this.f37078b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(C0906R.id.c4h);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "itemView.portfolio_reduction_tag");
            if (width < dmtTextView2.getMeasuredWidth()) {
                View view4 = this.f37078b.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                LinearLayout linearLayout = (LinearLayout) view4.findViewById(C0906R.id.c4c);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.portfolio_coupon_ll");
                linearLayout.setVisibility(8);
            }
            View view5 = this.f37078b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            LinearLayout linearLayout2 = (LinearLayout) view5.findViewById(C0906R.id.a16);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.coupon_reduction_ll");
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public e(PortfolioHolder portfolioHolder) {
            this.f37078b = portfolioHolder;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PortfolioHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.rf, viewGroup, false));
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
    }
}
