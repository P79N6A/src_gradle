package com.ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder;
import com.ss.android.ugc.aweme.poi.model.al;
import java.util.List;

public class PoiBannerAdapter extends AbsPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59417a;

    /* renamed from: b  reason: collision with root package name */
    public List<al> f59418b;

    /* renamed from: c  reason: collision with root package name */
    private PoiBannerViewHolder.a f59419c;

    /* renamed from: d  reason: collision with root package name */
    private String f59420d;

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f59417a, false, 64759, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59417a, false, 64759, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f59418b == null) {
            return 0;
        } else {
            return this.f59418b.size();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            r21 = this;
            r7 = r21
            r9 = r24
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r23
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f59417a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 64758(0xfcf6, float:9.0745E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r11] = r1
            r0[r12] = r23
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f59417a
            r3 = 0
            r4 = 64758(0xfcf6, float:9.0745E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x005d:
            if (r23 != 0) goto L_0x0079
            android.content.Context r0 = r24.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690417(0x7f0f03b1, float:1.9009877E38)
            android.view.View r0 = r0.inflate(r1, r9, r11)
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder r1 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder$a r2 = r7.f59419c
            r1.<init>(r0, r2)
            r0.setTag(r1)
            goto L_0x0082
        L_0x0079:
            java.lang.Object r0 = r23.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder r1 = (com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder) r1
            r0 = r23
        L_0x0082:
            int r2 = r21.getCount()
            if (r2 <= 0) goto L_0x012c
            java.util.List<com.ss.android.ugc.aweme.poi.model.al> r2 = r7.f59418b
            r3 = r22
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.poi.model.al r2 = (com.ss.android.ugc.aweme.poi.model.al) r2
            java.lang.String r3 = r7.f59420d
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r2
            r14[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.f59487a
            r17 = 0
            r18 = 64791(0xfd17, float:9.0792E-41)
            java.lang.Class[] r4 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.al> r5 = com.ss.android.ugc.aweme.poi.model.al.class
            r4[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r12] = r5
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r1
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x00d6
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r2
            r14[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.f59487a
            r17 = 0
            r18 = 64791(0xfd17, float:9.0792E-41)
            java.lang.Class[] r2 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.poi.model.al> r3 = com.ss.android.ugc.aweme.poi.model.al.class
            r2[r11] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r12] = r3
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r1
            r19 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x012c
        L_0x00d6:
            if (r2 == 0) goto L_0x012c
            r1.f59488b = r2
            com.ss.android.ugc.aweme.poi.model.al r4 = r1.f59488b
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getPicMedium()
            if (r4 == 0) goto L_0x00f7
            java.util.List r5 = r4.getUrlList()
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00f7
            java.util.List r5 = r4.getUrlList()
            java.lang.Object r5 = r5.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = r1.mSdCover
            com.ss.android.ugc.aweme.poi.e.q r8 = new com.ss.android.ugc.aweme.poi.e.q
            int r9 = com.ss.android.ugc.aweme.poi.e.p.a()
            r8.<init>(r3, r5, r9)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r6, (com.ss.android.ugc.aweme.base.model.UrlModel) r4, (com.facebook.imagepipeline.request.Postprocessor) r8)
            java.lang.String r3 = r2.uploadImageWaterMark
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x011b
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.mWaterMark
            r3.setVisibility(r11)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r1.mWaterMark
            java.lang.String r2 = r2.uploadImageWaterMark
            r3.setText(r2)
            goto L_0x0122
        L_0x011b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r1.mWaterMark
            r3 = 8
            r2.setVisibility(r3)
        L_0x0122:
            android.view.View r2 = r1.itemView
            com.ss.android.ugc.aweme.poi.adapter.viewholder.a r3 = new com.ss.android.ugc.aweme.poi.adapter.viewholder.a
            r3.<init>(r1)
            r2.setOnClickListener(r3)
        L_0x012c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.adapter.PoiBannerAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public PoiBannerAdapter(Context context, LayoutInflater layoutInflater, String str, PoiBannerViewHolder.a aVar) {
        super(context, layoutInflater);
        this.f59419c = aVar;
        this.f59420d = str;
    }
}
