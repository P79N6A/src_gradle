package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.l;
import com.ss.android.ugc.aweme.poi.ui.j;
import com.ss.android.ugc.aweme.poi.widget.PoiLabelsLayout;
import com.taobao.android.dexposed.ClassUtils;

public class PoiDetailHeaderInfoPresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59561a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59562b;

    /* renamed from: c  reason: collision with root package name */
    private j f59563c;

    /* renamed from: d  reason: collision with root package name */
    private PoiDetail f59564d;

    /* renamed from: e  reason: collision with root package name */
    private b f59565e;
    @BindView(2131496247)
    protected View mLocalLayout;
    @BindView(2131496244)
    protected DmtTextView mPoiCollectContent;
    @BindView(2131496242)
    protected CheckableImageView mPoiCollectImg;
    @BindView(2131496243)
    protected View mPoiCollectLayout;
    @BindView(2131496245)
    protected PoiLabelsLayout mPoiDetails;
    @BindView(2131496248)
    protected TextView mPoiName;
    @BindView(2131496259)
    protected View mPoiNameLayout;
    @BindView(2131496260)
    protected DmtTextView mPoiOpenTimeTxt;
    @BindView(2131496254)
    protected TextView mPoiPrice;
    @BindView(2131496255)
    protected View mPoiRatingLayout;
    @BindView(2131496256)
    protected TextView mPoiSubType;
    @BindView(2131496257)
    protected TextView mPoiVisitor;

    public interface a {
        l c();

        CheckableImageView d();

        void d_(boolean z);
    }

    public interface b {
        void a(int i, float f2);
    }

    public final void a(View view) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f59561a, false, 64839, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59561a, false, 64839, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int measuredHeight = this.mLocalLayout.getMeasuredHeight();
        int height = view.getHeight();
        float measuredHeight2 = ((float) this.mPoiNameLayout.getMeasuredHeight()) + UIUtils.dip2Px(this.f59562b, 16.0f);
        float dip2Px = UIUtils.dip2Px(this.f59562b, 52.0f);
        if (Build.VERSION.SDK_INT >= 19) {
            dip2Px += (float) StatusBarUtils.getStatusBarHeight(this.f59562b);
        }
        if (this.f59565e != null) {
            b bVar = this.f59565e;
            int i = measuredHeight + height + 0;
            if (measuredHeight2 > dip2Px) {
                f2 = 0.0f;
            } else {
                f2 = dip2Px - measuredHeight2;
            }
            bVar.a(i, f2);
        }
        this.mLocalLayout.setVisibility(8);
        view.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.poi.model.PoiDetail r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiDetail> r1 = com.ss.android.ugc.aweme.poi.model.PoiDetail.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 64831(0xfd3f, float:9.0848E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64831(0xfd3f, float:9.0848E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiDetail> r1 = com.ss.android.ugc.aweme.poi.model.PoiDetail.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r7.f59564d = r8
            android.widget.TextView r0 = r7.mPoiName
            java.lang.String r1 = r19.getTitle()
            r0.setText(r1)
            com.ss.android.ugc.aweme.poi.widget.PoiLabelsLayout r0 = r7.mPoiDetails
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {2, 1, 3} // fill-array
            r0.setChildsToHideInSequence(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mPoiCollectContent
            r1 = 2131561711(0x7f0d0cef, float:1.874883E38)
            r0.setText(r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64835(0xfd43, float:9.0853E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64835(0xfd43, float:9.0853E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0124
        L_0x007d:
            android.content.Context r0 = r7.f59562b
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r7.f59564d
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.e.h.f59792a
            r14 = 1
            r15 = 66836(0x10514, float:9.3657E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiDetail> r4 = com.ss.android.ugc.aweme.poi.model.PoiDetail.class
            r3[r9] = r4
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r4 = 0
            if (r3 == 0) goto L_0x00c7
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.e.h.f59792a
            r14 = 1
            r15 = 66836(0x10514, float:9.3657E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.PoiDetail> r1 = com.ss.android.ugc.aweme.poi.model.PoiDetail.class
            r0[r9] = r1
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0114
        L_0x00c7:
            if (r1 != 0) goto L_0x00ca
            goto L_0x0114
        L_0x00ca:
            boolean r2 = r1.isPoiOwnerValid()
            if (r2 == 0) goto L_0x00eb
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131034166(0x7f050036, float:1.7678842E38)
            java.lang.String[] r2 = r2.getStringArray(r3)
            android.content.res.Resources r3 = r0.getResources()
            r5 = 2131561773(0x7f0d0d2d, float:1.8748956E38)
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r2 = r1.getEnterpriseBusinessTime(r2, r3)
            goto L_0x00ec
        L_0x00eb:
            r2 = r4
        L_0x00ec:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.poi.model.z r3 = r1.poiExtension
            if (r3 == 0) goto L_0x00fa
            com.ss.android.ugc.aweme.poi.model.z r1 = r1.poiExtension
            java.lang.String r2 = r1.open_time
        L_0x00fa:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x0101
            goto L_0x0114
        L_0x0101:
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131561774(0x7f0d0d2e, float:1.8748958E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r2
            java.lang.String r4 = java.lang.String.format(r0, r1)
        L_0x0114:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0124
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mPoiOpenTimeTxt
            r0.setVisibility(r10)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.mPoiOpenTimeTxt
            r0.setText(r4)
        L_0x0124:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64834(0xfd42, float:9.0852E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 8
            if (r0 == 0) goto L_0x0154
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64834(0xfd42, float:9.0852E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r11 = r0
            goto L_0x019a
        L_0x0154:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f59564d
            java.lang.String r0 = r0.getI18nPrice()
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f59564d
            java.lang.String r0 = r0.getPrice()
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0173
            android.widget.TextView r0 = r7.mPoiPrice
            r0.setVisibility(r8)
            r11 = 1
            goto L_0x019a
        L_0x0173:
            android.widget.TextView r1 = r7.mPoiPrice
            android.content.Context r2 = r7.f59562b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131561719(0x7f0d0cf7, float:1.8748846E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r3[r10] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.setText(r0)
            goto L_0x0199
        L_0x018e:
            android.widget.TextView r0 = r7.mPoiPrice
            com.ss.android.ugc.aweme.poi.model.PoiDetail r1 = r7.f59564d
            java.lang.String r1 = r1.getI18nPrice()
            r0.setText(r1)
        L_0x0199:
            r11 = 0
        L_0x019a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64836(0xfd44, float:9.0855E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c8
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64836(0xfd44, float:9.0855E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12 = r0
            goto L_0x01e1
        L_0x01c8:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f59564d
            java.lang.String r0 = r0.getSubType()
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x01db
            android.widget.TextView r0 = r7.mPoiSubType
            r0.setVisibility(r8)
            r12 = 1
            goto L_0x01e1
        L_0x01db:
            android.widget.TextView r1 = r7.mPoiSubType
            r1.setText(r0)
            r12 = 0
        L_0x01e1:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64837(0xfd45, float:9.0856E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x020f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64837(0xfd45, float:9.0856E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x02e9
        L_0x020f:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f59564d
            int r0 = r0.getVisitors()
            if (r0 > 0) goto L_0x021f
            android.widget.TextView r0 = r7.mPoiVisitor
            r0.setVisibility(r8)
            r0 = 1
            goto L_0x02e9
        L_0x021f:
            boolean r1 = com.ss.android.g.a.a()
            r1 = r1 ^ r9
            r2 = 2131558824(0x7f0d01a8, float:1.8742975E38)
            r3 = 2131558825(0x7f0d01a9, float:1.8742977E38)
            if (r1 == 0) goto L_0x026a
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 <= r1) goto L_0x024d
            android.widget.TextView r2 = r7.mPoiVisitor
            android.content.Context r4 = r7.f59562b
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r0 = r7.a(r0, r1)
            r4[r10] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4)
            r2.setText(r0)
            goto L_0x02e8
        L_0x024d:
            android.widget.TextView r1 = r7.mPoiVisitor
            android.content.Context r3 = r7.f59562b
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r2 = r3.getString(r2)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r10] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.setText(r0)
            goto L_0x02e8
        L_0x026a:
            r1 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 <= r1) goto L_0x029c
            android.widget.TextView r2 = r7.mPoiVisitor
            android.content.Context r4 = r7.f59562b
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r7.a(r0, r1)
            r5.append(r0)
            java.lang.String r0 = "m"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4[r10] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4)
            r2.setText(r0)
            goto L_0x02e8
        L_0x029c:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L_0x02cd
            android.widget.TextView r2 = r7.mPoiVisitor
            android.content.Context r4 = r7.f59562b
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r3 = r4.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r7.a(r0, r1)
            r5.append(r0)
            java.lang.String r0 = "k"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4[r10] = r0
            java.lang.String r0 = java.lang.String.format(r3, r4)
            r2.setText(r0)
            goto L_0x02e8
        L_0x02cd:
            android.widget.TextView r1 = r7.mPoiVisitor
            android.content.Context r3 = r7.f59562b
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r2 = r3.getString(r2)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r10] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.setText(r0)
        L_0x02e8:
            r0 = 0
        L_0x02e9:
            if (r11 == 0) goto L_0x02f0
            if (r12 == 0) goto L_0x02f0
            if (r0 == 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r9 = 0
        L_0x02f1:
            if (r9 == 0) goto L_0x031e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64833(0xfd41, float:9.085E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0319
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64833(0xfd41, float:9.085E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x031e
        L_0x0319:
            android.view.View r0 = r7.mPoiRatingLayout
            r0.setVisibility(r8)
        L_0x031e:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64832(0xfd40, float:9.0849E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0344
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f59561a
            r3 = 0
            r4 = 64832(0xfd40, float:9.0849E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0344:
            boolean r0 = com.ss.android.ugc.aweme.poi.e.p.d()
            if (r0 == 0) goto L_0x0350
            android.view.View r0 = r7.mPoiCollectLayout
            r0.setVisibility(r8)
            return
        L_0x0350:
            android.content.Context r0 = r7.f59562b
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            android.view.View r1 = r7.mPoiCollectLayout
            r2 = 2130838118(0x7f020266, float:1.728121E38)
            r1.setBackgroundResource(r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r0, r0)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r7.mPoiCollectImg
            r0.setLayoutParams(r1)
            com.ss.android.ugc.aweme.poi.ui.j r0 = r7.f59563c
            if (r0 == 0) goto L_0x0378
            com.ss.android.ugc.aweme.poi.ui.j r0 = r7.f59563c
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = r7.mPoiCollectImg
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r7.f59564d
            r0.a(r1, r2, r10)
        L_0x0378:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.a(com.ss.android.ugc.aweme.poi.model.PoiDetail):void");
    }

    @SuppressLint({"CI_DefaultLocale"})
    private String a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f59561a, false, 64838, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f59561a, false, 64838, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        String format = String.format("%.1f", new Object[]{Float.valueOf((((float) i) * 1.0f) / ((float) i2))});
        if (!format.endsWith(PushConstants.PUSH_TYPE_NOTIFY) || format.indexOf(ClassUtils.PACKAGE_SEPARATOR) == -1) {
            return format;
        }
        return format.substring(0, format.indexOf(ClassUtils.PACKAGE_SEPARATOR));
    }

    public PoiDetailHeaderInfoPresenter(AbsFragment absFragment, a aVar, View view, j jVar, b bVar) {
        this.f59562b = view.getContext();
        this.f59565e = bVar;
        ButterKnife.bind((Object) this, view);
        if (jVar != null && aVar != null) {
            this.f59563c = jVar;
            this.f59563c.a(absFragment, this.mPoiCollectImg, aVar.d());
            this.f59563c.g = aVar.c();
        }
    }
}
