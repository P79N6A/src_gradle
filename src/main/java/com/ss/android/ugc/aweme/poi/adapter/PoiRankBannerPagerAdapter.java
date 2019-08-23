package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.views.SmartAnimatedImageView;
import java.util.List;

public class PoiRankBannerPagerAdapter extends AbsPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59431a;

    /* renamed from: c  reason: collision with root package name */
    public static int f59432c;

    /* renamed from: d  reason: collision with root package name */
    public static int f59433d;

    /* renamed from: b  reason: collision with root package name */
    public c f59434b;

    /* renamed from: e  reason: collision with root package name */
    private List<PoiClassRankBannerStruct> f59435e;

    /* renamed from: f  reason: collision with root package name */
    private int f59436f;
    private String g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59437a;

        /* renamed from: b  reason: collision with root package name */
        View f59438b;

        /* renamed from: c  reason: collision with root package name */
        Context f59439c;

        /* renamed from: d  reason: collision with root package name */
        int f59440d;

        /* renamed from: e  reason: collision with root package name */
        SmartAnimatedImageView f59441e;

        /* renamed from: f  reason: collision with root package name */
        DmtTextView f59442f;
        DmtTextView g;
        View h;
        View i;
        String j;
        c k;

        a(View view, int i2, String str, c cVar) {
            this.f59438b = view;
            this.f59440d = i2;
            this.j = str;
            this.f59439c = view.getContext();
            this.f59441e = (SmartAnimatedImageView) view.findViewById(C0906R.id.an4);
            this.f59442f = (DmtTextView) view.findViewById(C0906R.id.an0);
            this.h = view.findViewById(C0906R.id.bay);
            this.i = view.findViewById(C0906R.id.cen);
            this.g = (DmtTextView) view.findViewById(C0906R.id.ana);
            this.k = new c(cVar, str, i2);
        }
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59431a, false, 64774, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59431a, false, 64774, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f59435e == null) {
            return 0;
        } else {
            return this.f59435e.size();
        }
    }

    public PoiRankBannerPagerAdapter(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        if (f59432c == 0) {
            int screenWidth = UIUtils.getScreenWidth(context);
            f59432c = screenWidth;
            double d2 = (double) screenWidth;
            Double.isNaN(d2);
            f59433d = (int) (d2 / 4.787d);
        }
    }

    public final void a(List<PoiClassRankBannerStruct> list, int i, int i2) {
        List<PoiClassRankBannerStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59431a, false, 64772, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59431a, false, 64772, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f59436f = i;
        this.f59435e = list2;
        switch (i2) {
            case 51:
                this.g = "categorized_city_poi";
                break;
            case 53:
                this.g = "poi_page";
                break;
            case 54:
                this.g = "homepage_fresh";
                break;
            default:
                this.g = "homepage_fresh";
                break;
        }
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            r10 = r25
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r12 = 0
            r0[r12] = r1
            r13 = 1
            r0[r13] = r24
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f59431a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r13] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 64773(0xfd05, float:9.0766E-41)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r12] = r1
            r0[r13] = r24
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f59431a
            r3 = 0
            r4 = 64773(0xfd05, float:9.0766E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r13] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r14] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x005f:
            if (r24 != 0) goto L_0x0079
            android.view.LayoutInflater r0 = r7.mInflater
            r1 = 2131690426(0x7f0f03ba, float:1.9009895E38)
            android.view.View r0 = r0.inflate(r1, r10, r12)
            com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter$a r1 = new com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter$a
            int r2 = r7.f59436f
            java.lang.String r3 = r7.g
            com.ss.android.ugc.aweme.poi.c r4 = r7.f59434b
            r1.<init>(r0, r2, r3, r4)
            r0.setTag(r1)
            goto L_0x0082
        L_0x0079:
            java.lang.Object r0 = r24.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter$a r1 = (com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter.a) r1
            r0 = r24
        L_0x0082:
            int r2 = r22.getCount()
            if (r2 <= 0) goto L_0x014e
            java.util.List<com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct> r2 = r7.f59435e
            java.lang.Object r2 = r2.get(r8)
            com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct r2 = (com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct) r2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r12] = r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r15[r13] = r3
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter.a.f59437a
            r18 = 0
            r19 = 64775(0xfd07, float:9.0769E-41)
            java.lang.Class[] r3 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct> r4 = com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct.class
            r3[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x00dc
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r12] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r15[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter.a.f59437a
            r18 = 0
            r19 = 64775(0xfd07, float:9.0769E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct> r3 = com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct.class
            r2[r12] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r13] = r3
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x014e
        L_0x00dc:
            com.ss.android.ugc.aweme.views.SmartAnimatedImageView r3 = r1.f59441e
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r2.getBannerUrl()
            int r5 = f59432c
            int r6 = f59433d
            java.lang.String r9 = "poi"
            com.ss.android.ugc.aweme.views.m.a((com.bytedance.lighten.loader.SmartImageView) r3, (com.ss.android.ugc.aweme.base.model.UrlModel) r4, (int) r5, (int) r6, (java.lang.String) r9)
            java.lang.String r3 = r2.getSchema()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 8
            if (r3 == 0) goto L_0x0110
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f59442f
            r3.setVisibility(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f59442f
            java.lang.String r5 = r2.getDescription()
            r3.setText(r5)
            android.view.View r3 = r1.h
            r3.setVisibility(r12)
            android.view.View r3 = r1.i
            r3.setVisibility(r12)
            goto L_0x013f
        L_0x0110:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f59442f
            r3.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.f59442f
            java.lang.String r5 = ""
            r3.setText(r5)
            android.view.View r3 = r1.h
            r3.setVisibility(r4)
            android.view.View r3 = r1.i
            r3.setVisibility(r4)
            java.lang.String r3 = r2.getTag()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x013f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.g
            java.lang.String r4 = r2.getTag()
            r3.setText(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.g
            r3.setVisibility(r12)
            goto L_0x0144
        L_0x013f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.g
            r3.setVisibility(r4)
        L_0x0144:
            android.view.View r3 = r1.f59438b
            com.ss.android.ugc.aweme.poi.adapter.d r4 = new com.ss.android.ugc.aweme.poi.adapter.d
            r4.<init>(r1, r2, r8)
            r3.setOnClickListener(r4)
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
