package com.ss.android.ugc.aweme.commerce.portfolio;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import com.ss.android.ugc.aweme.commerce.service.models.w;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBY\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0013\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016R\u000e\u0010\f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/holders/PortfolioHolder;", "mGoods", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "mUid", "", "mEnterMethod", "sourcePage", "selectContainer", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter$SelectContainer;", "mCarrierType", "mCb", "Lkotlin/Function2;", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter$SelectContainer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "mIdRecords", "Ljava/util/HashSet;", "clearRecords", "getItemCount", "", "getSelectColumn", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SelectContainer", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioAdapter extends RecyclerView.Adapter<PortfolioHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37018a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f37019b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final List<w> f37020c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37021d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37022e;

    /* renamed from: f  reason: collision with root package name */
    private final String f37023f;
    private final a g;
    private final String h;
    private final Function2<w, String, Unit> i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter$SelectContainer;", "", "getSelectedColumn", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        @Nullable
        t c();
    }

    private final t b() {
        if (!PatchProxy.isSupport(new Object[0], this, f37018a, false, 28418, new Class[0], t.class)) {
            return this.g.c();
        }
        return (t) PatchProxy.accessDispatch(new Object[0], this, f37018a, false, 28418, new Class[0], t.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37018a, false, 28416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37018a, false, 28416, new Class[0], Void.TYPE);
            return;
        }
        this.f37019b.clear();
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f37018a, false, 28417, new Class[0], Integer.TYPE)) {
            return this.f37020c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37018a, false, 28417, new Class[0], Integer.TYPE)).intValue();
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        PortfolioHolder portfolioHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f37018a, false, 28414, new Class[]{ViewGroup.class, Integer.TYPE}, PortfolioHolder.class)) {
            portfolioHolder = (PortfolioHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f37018a, false, 28414, new Class[]{ViewGroup.class, Integer.TYPE}, PortfolioHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            portfolioHolder = new PortfolioHolder(viewGroup2);
        }
        return portfolioHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x05d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r29, int r30) {
        /*
            r28 = this;
            r7 = r28
            r8 = r30
            r9 = r29
            com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder r9 = (com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder) r9
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f37018a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder> r1 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28415(0x6eff, float:3.9818E-41)
            r1 = r28
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f37018a
            r3 = 0
            r4 = 28415(0x6eff, float:3.9818E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder> r1 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r28
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r0 = r7.f37020c
            java.lang.Object r0 = r0.get(r8)
            r13 = r0
            com.ss.android.ugc.aweme.commerce.service.models.w r13 = (com.ss.android.ugc.aweme.commerce.service.models.w) r13
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r0 = r7.f37020c
            java.lang.Object r0 = r0.get(r8)
            r8 = r0
            com.ss.android.ugc.aweme.commerce.service.models.w r8 = (com.ss.android.ugc.aweme.commerce.service.models.w) r8
            java.lang.String r14 = r7.f37021d
            com.ss.android.ugc.aweme.commerce.service.models.t r15 = r28.b()
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.commerce.service.models.w, java.lang.String, kotlin.Unit> r6 = r7.i
            r5 = 4
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r11] = r8
            r0[r12] = r14
            r0[r10] = r15
            r16 = 3
            r0[r16] = r6
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.f37064a
            r3 = 0
            r4 = 28459(0x6f2b, float:3.988E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.w> r17 = com.ss.android.ugc.aweme.commerce.service.models.w.class
            r1[r11] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r1[r12] = r17
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.t> r17 = com.ss.android.ugc.aweme.commerce.service.models.t.class
            r1[r10] = r17
            java.lang.Class<kotlin.jvm.functions.Function2> r17 = kotlin.jvm.functions.Function2.class
            r1[r16] = r17
            java.lang.Class r17 = java.lang.Void.TYPE
            r18 = r1
            r1 = r9
            r10 = 4
            r5 = r18
            r19 = r6
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r17 = 0
            if (r0 == 0) goto L_0x00d4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r14
            r1 = 2
            r0[r1] = r15
            r6 = r19
            r0[r16] = r6
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.f37064a
            r3 = 0
            r4 = 28459(0x6f2b, float:3.988E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.w> r6 = com.ss.android.ugc.aweme.commerce.service.models.w.class
            r5[r11] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r12] = r6
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.t> r6 = com.ss.android.ugc.aweme.commerce.service.models.t.class
            r5[r1] = r6
            java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r27 = r13
            goto L_0x060d
        L_0x00d4:
            r6 = r19
            java.lang.String r0 = "good"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            boolean r0 = r8.isGoodInPreSale()
            r1 = 2131170612(0x7f071534, float:1.7955587E38)
            if (r0 == 0) goto L_0x0107
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r0 = r0.getContext()
            r2 = 2131561794(0x7f0d0d42, float:1.8748999E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0151
        L_0x0107:
            boolean r0 = r8.isGoodInAppointment()
            if (r0 == 0) goto L_0x012b
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r0 = r0.getContext()
            r2 = 2131558676(0x7f0d0114, float:1.8742675E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0151
        L_0x012b:
            boolean r0 = r8.isGoodInSecKill()
            if (r0 == 0) goto L_0x014f
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r2 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.content.Context r0 = r0.getContext()
            r2 = 2131562258(0x7f0d0f12, float:1.874994E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0151
        L_0x014f:
            r0 = r17
        L_0x0151:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 2131169083(0x7f070f3b, float:1.7952486E38)
            r5 = 8
            if (r2 != 0) goto L_0x01d5
            android.view.View r2 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r4 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            r2.setVisibility(r11)
            android.view.View r2 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.view.View r1 = r2.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setText(r0)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r1 = r8.longTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            android.text.style.LeadingMarginSpan$Standard r1 = new android.text.style.LeadingMarginSpan$Standard
            android.view.View r2 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r4 = "itemView.portfolio_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.content.Context r2 = r2.getContext()
            r4 = 1108082688(0x420c0000, float:35.0)
            int r2 = com.ss.android.ugc.aweme.framework.e.b.a(r2, r4)
            r1.<init>(r2, r11)
            int r2 = r0.length()
            r4 = 18
            com.ss.android.ugc.aweme.commerce.portfolio.holders.a.a(r0, r1, r11, r2, r4)
            android.view.View r1 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.View r1 = r1.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.portfolio_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            goto L_0x0205
        L_0x01d5:
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "itemView.tv_activity_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r5)
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r0 = r0.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "itemView.portfolio_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r8.longTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0205:
            java.util.List r0 = r8.preferredImages()
            r1 = 2131169077(0x7f070f35, float:1.7952474E38)
            r2 = 100
            if (r0 == 0) goto L_0x0295
            java.util.List r0 = r8.preferredImages()
            if (r0 != 0) goto L_0x0219
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0219:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x0295
            java.util.List r0 = r8.preferredImages()
            if (r0 != 0) goto L_0x022b
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x022b:
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = (com.ss.android.ugc.aweme.base.model.UrlModel) r0
            int r3 = r0.getWidth()
            if (r3 != 0) goto L_0x023a
            r0.setWidth(r2)
        L_0x023a:
            int r3 = r0.getHeight()
            if (r3 != 0) goto L_0x0243
            r0.setHeight(r2)
        L_0x0243:
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r3 = 2131167239(0x7f070807, float:1.7948746E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r3 = com.ss.android.ugc.aweme.commerce.service.l.j.f38032c
            int r4 = r0.getHeight()
            int r3 = r3 * r4
            int r4 = r0.getWidth()
            int r3 = r3 / r4
            r2.height = r3
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView r2 = (com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView) r2
            java.lang.String r3 = "itemView.portfolio_item_image"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.facebook.drawee.interfaces.DraweeHierarchy r2 = r2.getHierarchy()
            com.facebook.drawee.generic.GenericDraweeHierarchy r2 = (com.facebook.drawee.generic.GenericDraweeHierarchy) r2
            r3 = 2130839758(0x7f0208ce, float:1.7284536E38)
            r2.setPlaceholderImage((int) r3)
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r1 = r2.findViewById(r1)
            com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView r1 = (com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView) r1
            com.ss.android.ugc.aweme.base.c.b(r1, r0)
            goto L_0x02e0
        L_0x0295:
            r0 = 2130839758(0x7f0208ce, float:1.7284536E38)
            com.facebook.imagepipeline.request.ImageRequestBuilder r0 = com.facebook.imagepipeline.request.ImageRequestBuilder.newBuilderWithResourceId(r0)
            com.facebook.imagepipeline.common.ResizeOptions r3 = new com.facebook.imagepipeline.common.ResizeOptions
            r3.<init>(r2, r2)
            com.facebook.imagepipeline.request.ImageRequestBuilder r0 = r0.setResizeOptions(r3)
            com.facebook.imagepipeline.request.ImageRequest r0 = r0.build()
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            android.view.View r3 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.view.View r3 = r3.findViewById(r1)
            com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView r3 = (com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView) r3
            com.facebook.drawee.interfaces.DraweeController r3 = r3.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r2 = r2.setOldController((com.facebook.drawee.interfaces.DraweeController) r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r2
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r2.setImageRequest(r0)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeController r0 = r0.build()
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r1 = r2.findViewById(r1)
            com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView r1 = (com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView) r1
            com.facebook.drawee.interfaces.DraweeController r0 = (com.facebook.drawee.interfaces.DraweeController) r0
            r1.setController(r0)
        L_0x02e0:
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131169085(0x7f070f3d, float:1.795249E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "itemView.portfolio_vv_count_tv"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.service.l.m$a r1 = com.ss.android.ugc.aweme.commerce.service.l.m.f38042b
            com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor r2 = r8.getVisitor()
            if (r2 == 0) goto L_0x0302
            long r2 = r2.getCount()
            goto L_0x0304
        L_0x0302:
            r2 = 0
        L_0x0304:
            java.lang.String r1 = r1.a(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.f37064a
            r3 = 0
            r4 = 28460(0x6f2c, float:3.9881E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.w> r16 = com.ss.android.ugc.aweme.commerce.service.models.w.class
            r1[r11] = r16
            java.lang.Class r16 = java.lang.Void.TYPE
            r18 = r1
            r1 = r9
            r10 = 8
            r5 = r18
            r20 = r6
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0346
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder.f37064a
            r3 = 0
            r4 = 28460(0x6f2c, float:3.9881E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.w> r1 = com.ss.android.ugc.aweme.commerce.service.models.w.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0437
        L_0x0346:
            boolean r0 = r8.hasCoupon()
            if (r0 == 0) goto L_0x0385
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131169075(0x7f070f33, float:1.795247E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "itemView.portfolio_coupon_ll"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r11)
            com.ss.android.ugc.aweme.commerce.service.l.e$a r0 = com.ss.android.ugc.aweme.commerce.service.l.e.f38011b
            android.view.View r1 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r2 = 2131169076(0x7f070f34, float:1.7952472E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.portfolio_coupon_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r8
            com.ss.android.ugc.aweme.commerce.service.models.c r2 = (com.ss.android.ugc.aweme.commerce.service.models.c) r2
            r0.a((android.widget.TextView) r1, (com.ss.android.ugc.aweme.commerce.service.models.c) r2)
            r0 = 1
            goto L_0x039e
        L_0x0385:
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131169075(0x7f070f33, float:1.795247E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "itemView.portfolio_coupon_ll"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
            r0 = 0
        L_0x039e:
            java.lang.String r1 = r8.getFirstFullReduction()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 2131169080(0x7f070f38, float:1.795248E38)
            if (r2 != 0) goto L_0x03d9
            android.view.View r2 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r4 = "itemView.portfolio_reduction_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            r2.setVisibility(r11)
            android.view.View r2 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.view.View r2 = r2.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r2
            java.lang.String r3 = "itemView.portfolio_reduction_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r2.setText(r1)
            r1 = 1
            goto L_0x03ef
        L_0x03d9:
            android.view.View r1 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.View r1 = r1.findViewById(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "itemView.portfolio_reduction_tag"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r10)
            r1 = 0
        L_0x03ef:
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r3 = 2131166222(0x7f07040e, float:1.7946683E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "itemView.coupon_reduction_ll"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            if (r0 != 0) goto L_0x040c
            if (r1 == 0) goto L_0x0409
            goto L_0x040c
        L_0x0409:
            r3 = 8
            goto L_0x040d
        L_0x040c:
            r3 = 0
        L_0x040d:
            r2.setVisibility(r3)
            if (r0 == 0) goto L_0x0437
            if (r1 == 0) goto L_0x0437
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131166222(0x7f07040e, float:1.7946683E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = "itemView.coupon_reduction_ll"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$e r1 = new com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$e
            r1.<init>(r9)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r0.addOnGlobalLayoutListener(r1)
        L_0x0437:
            java.util.List r0 = r8.getLabels()
            r1 = 2131169078(0x7f070f36, float:1.7952476E38)
            if (r0 == 0) goto L_0x047f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r12
            if (r0 != r12) goto L_0x047f
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r0 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r0
            java.lang.String r2 = "itemView.portfolio_item_you_tags"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r11)
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r0 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r0
            java.lang.String r1 = "itemView.portfolio_item_you_tags"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$b r1 = new com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$b
            java.util.List r2 = r8.getLabels()
            r1.<init>(r9, r8, r2)
            com.ss.android.ugc.aweme.widget.flowlayout.a r1 = (com.ss.android.ugc.aweme.widget.flowlayout.a) r1
            r0.setAdapter(r1)
            goto L_0x0494
        L_0x047f:
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout r0 = (com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout) r0
            java.lang.String r1 = "itemView.portfolio_item_you_tags"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setVisibility(r10)
        L_0x0494:
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131168553(0x7f070d29, float:1.7951411E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "itemView.new_come_label"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r1 = r8.getElasticType()
            r2 = 2
            if (r1 != r2) goto L_0x04c3
            if (r15 == 0) goto L_0x04b7
            java.lang.String r1 = r15.getId()
            goto L_0x04b9
        L_0x04b7:
            r1 = r17
        L_0x04b9:
            java.lang.String r2 = "0"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x04c3
            r1 = 0
            goto L_0x04c5
        L_0x04c3:
            r1 = 8
        L_0x04c5:
            r0.setVisibility(r1)
            boolean r0 = r8.isThirdParty()
            r1 = 2131169079(0x7f070f37, float:1.7952478E38)
            if (r0 == 0) goto L_0x0506
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView r1 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView) r1
            int r2 = r8.getPrice()
            com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            android.view.View r3 = r9.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r4 = 2131624203(0x7f0e010b, float:1.887558E38)
            int r3 = r0.a(r3, r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r5 = 1097859072(0x41700000, float:15.0)
            r6 = 1095761920(0x41500000, float:13.0)
            r1.a(r2, r3, r4, r5, r6)
            goto L_0x0565
        L_0x0506:
            com.ss.android.ugc.aweme.commerce.service.models.r r0 = r8.getToutiao()
            if (r0 == 0) goto L_0x0515
            int r0 = r0.getMinPrice()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0517
        L_0x0515:
            r0 = r17
        L_0x0517:
            if (r0 != 0) goto L_0x0530
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView r0 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView) r0
            java.lang.String r1 = "itemView.portfolio_price"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 4
            r0.setVisibility(r1)
            goto L_0x0565
        L_0x0530:
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r1 = r2.findViewById(r1)
            r21 = r1
            com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView r21 = (com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView) r21
            int r22 = r0.intValue()
            com.ss.android.ugc.aweme.commerce.service.l.g$a r0 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            android.view.View r1 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r2 = 2131624203(0x7f0e010b, float:1.887558E38)
            int r23 = r0.a(r1, r2)
            r24 = 1095761920(0x41500000, float:13.0)
            r25 = 1097859072(0x41700000, float:15.0)
            r26 = 1095761920(0x41500000, float:13.0)
            r21.a(r22, r23, r24, r25, r26)
        L_0x0565:
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131169082(0x7f070f3a, float:1.7952484E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "itemView.portfolio_sale"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.service.l.g$a r1 = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "itemView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r3 = 2131561285(0x7f0d0b45, float:1.8747966E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.commerce.service.l.m$a r5 = com.ss.android.ugc.aweme.commerce.service.l.m.f38042b
            int r6 = r8.getSales()
            r27 = r13
            long r12 = (long) r6
            java.lang.String r5 = r5.a(r12)
            r4[r11] = r5
            java.lang.String r1 = r1.a(r2, r3, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r9.itemView
            com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$c r1 = new com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$c
            r2 = r20
            r1.<init>(r2, r8, r14)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.View r0 = r9.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 2131169086(0x7f070f3e, float:1.7952492E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r2 = "itemView.portfolio_watch_video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r8.getLastAwemeId()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x05d9
            goto L_0x05da
        L_0x05d9:
            r10 = 0
        L_0x05da:
            r0.setVisibility(r10)
            android.view.View r0 = r9.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$d r2 = new com.ss.android.ugc.aweme.commerce.portfolio.holders.PortfolioHolder$d
            r2.<init>(r9, r8, r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            com.ss.android.ugc.aweme.commerce.service.l.o r0 = com.ss.android.ugc.aweme.commerce.service.l.o.f38047b
            android.view.View r2 = r9.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "itemView.portfolio_watch_video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r0.a(r1)
        L_0x060d:
            java.util.HashSet<java.lang.String> r0 = r7.f37019b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.String r1 = r27.getPromotionId()
            boolean r0 = kotlin.collections.CollectionsKt.contains(r0, r1)
            if (r0 != 0) goto L_0x06db
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = new com.ss.android.ugc.aweme.commerce.service.logs.al
            r0.<init>()
            java.lang.String r1 = r7.f37021d
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.f(r1)
            boolean r1 = r27.hasCoupon()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.Boolean) r1)
            int r1 = r27.getElasticType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.Integer) r1)
            java.lang.String r1 = r7.h
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.b((java.lang.String) r1)
            java.lang.String r1 = r27.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.c((java.lang.String) r1)
            java.lang.String r1 = r27.getLastAwemeId()
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.d(r1)
            java.lang.String r1 = r7.f37023f
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.String) r1)
            long r1 = r27.getCommodityType()
            int r1 = (int) r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.Integer) r1)
            java.lang.String r1 = r7.f37022e
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.e(r1)
            com.ss.android.ugc.aweme.commerce.service.c.a$a r1 = com.ss.android.ugc.aweme.commerce.service.c.a.f37960a
            com.ss.android.ugc.aweme.commerce.service.models.t r2 = r28.b()
            if (r2 == 0) goto L_0x0679
            java.lang.String r17 = r2.getId()
        L_0x0679:
            r2 = r17
            java.lang.String r1 = r1.a(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.i(r1)
            r0.b()
            java.lang.String r0 = r27.getLastAwemeId()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06ce
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = new com.ss.android.ugc.aweme.commerce.service.logs.au
            r0.<init>()
            java.lang.String r1 = r7.f37021d
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.d(r1)
            java.lang.String r1 = r27.getPromotionId()
            if (r1 != 0) goto L_0x06a5
            java.lang.String r1 = ""
        L_0x06a5:
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.c(r1)
            long r1 = r27.getCommodityType()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.a((java.lang.Long) r1)
            java.lang.String r1 = "store_page"
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.a((java.lang.String) r1)
            int r1 = r27.getElasticType()
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.a((int) r1)
            java.lang.String r1 = r27.getLastAwemeId()
            com.ss.android.ugc.aweme.commerce.service.logs.au r0 = r0.b(r1)
            r0.b()
        L_0x06ce:
            java.util.HashSet<java.lang.String> r0 = r7.f37019b
            java.lang.String r1 = r27.getPromotionId()
            if (r1 != 0) goto L_0x06d8
            java.lang.String r1 = ""
        L_0x06d8:
            r0.add(r1)
        L_0x06db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.PortfolioAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }

    public PortfolioAdapter(@NotNull List<w> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull a aVar, @NotNull String str4, @Nullable Function2<? super w, ? super String, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(list, "mGoods");
        Intrinsics.checkParameterIsNotNull(str, "mUid");
        Intrinsics.checkParameterIsNotNull(str2, "mEnterMethod");
        Intrinsics.checkParameterIsNotNull(str3, "sourcePage");
        Intrinsics.checkParameterIsNotNull(aVar, "selectContainer");
        Intrinsics.checkParameterIsNotNull(str4, "mCarrierType");
        this.f37020c = list;
        this.f37021d = str;
        this.f37022e = str2;
        this.f37023f = str3;
        this.g = aVar;
        this.h = str4;
        this.i = function2;
    }
}
