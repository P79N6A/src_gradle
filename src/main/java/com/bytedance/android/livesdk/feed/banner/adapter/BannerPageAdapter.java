package com.bytedance.android.livesdk.feed.banner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.b.a;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.livesdk.feed.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class BannerPageAdapter extends AbsPagerAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f14041e;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f14042f = new ArrayList();
    public String g;
    private n h;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f14041e, false, 8556, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14041e, false, 8556, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f14042f == null) {
            return 0;
        } else {
            if (this.f14042f.size() > 1) {
                return Integer.MAX_VALUE;
            }
            return this.f14042f.size();
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f14041e, false, 8555, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f14041e, false, 8555, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            if (this.f8713b.size() < this.f14042f.size()) {
                this.f8713b.add(view);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.bytedance.android.livesdk.feed.banner.adapter.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(int r20, android.view.View r21, android.view.ViewGroup r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r22
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r10 = 0
            r0[r10] = r1
            r11 = 1
            r0[r11] = r21
            r12 = 2
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f14041e
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 8554(0x216a, float:1.1987E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            r0[r11] = r21
            r0[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f14041e
            r3 = 0
            r4 = 8554(0x216a, float:1.1987E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x005b:
            if (r21 != 0) goto L_0x0077
            android.view.LayoutInflater r0 = r7.f8714c
            r1 = 2131691222(0x7f0f06d6, float:1.901151E38)
            android.view.View r0 = r0.inflate(r1, r8, r10)
            com.bytedance.android.livesdk.feed.banner.adapter.a r1 = new com.bytedance.android.livesdk.feed.banner.adapter.a
            android.content.Context r2 = r22.getContext()
            java.lang.String r3 = r7.g
            com.bytedance.android.livesdk.feed.n r4 = r7.h
            r1.<init>(r0, r2, r3, r4)
            r0.setTag(r1)
            goto L_0x0080
        L_0x0077:
            java.lang.Object r0 = r21.getTag()
            r1 = r0
            com.bytedance.android.livesdk.feed.banner.adapter.a r1 = (com.bytedance.android.livesdk.feed.banner.adapter.a) r1
            r0 = r21
        L_0x0080:
            java.util.List<com.bytedance.android.live.base.model.b.a> r2 = r7.f14042f
            if (r2 == 0) goto L_0x0120
            java.util.List<com.bytedance.android.live.base.model.b.a> r2 = r7.f14042f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0120
            java.util.List<com.bytedance.android.live.base.model.b.a> r2 = r7.f14042f
            int r3 = r2.size()
            int r3 = r20 % r3
            java.lang.Object r2 = r2.get(r3)
            com.bytedance.android.live.base.model.b.a r2 = (com.bytedance.android.live.base.model.b.a) r2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.feed.banner.adapter.a.f14043a
            r15 = 0
            r16 = 8550(0x2166, float:1.1981E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.b.a> r4 = com.bytedance.android.live.base.model.b.a.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x00cc
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.feed.banner.adapter.a.f14043a
            r15 = 0
            r16 = 8550(0x2166, float:1.1981E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.b.a> r3 = com.bytedance.android.live.base.model.b.a.class
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r1
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0120
        L_0x00cc:
            r1.f14048f = r2
            if (r2 == 0) goto L_0x0120
            android.widget.TextView r3 = r1.f14046d
            r4 = 8
            r3.setVisibility(r4)
            java.lang.String r3 = r2.i
            com.bytedance.android.live.base.model.ImageModel r5 = r2.a()
            if (r5 == 0) goto L_0x010a
            com.bytedance.android.live.base.model.ImageModel r5 = r2.a()
            java.util.List r5 = r5.getUrls()
            if (r5 == 0) goto L_0x010a
            com.bytedance.android.live.base.model.ImageModel r5 = r2.a()
            java.util.List r5 = r5.getUrls()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x010a
            com.bytedance.android.live.core.widget.HSImageView r5 = r1.f14044b
            com.bytedance.android.live.base.model.ImageModel r2 = r2.a()
            java.util.List r2 = r2.getUrls()
            java.lang.Object r2 = r2.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            r5.setImageURI((java.lang.String) r2)
        L_0x010a:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0116
            android.widget.TextView r1 = r1.f14045c
            r1.setVisibility(r4)
            goto L_0x0120
        L_0x0116:
            android.widget.TextView r2 = r1.f14045c
            r2.setVisibility(r10)
            android.widget.TextView r1 = r1.f14045c
            r1.setText(r3)
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.banner.adapter.BannerPageAdapter.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public BannerPageAdapter(Context context, LayoutInflater layoutInflater, String str, n nVar) {
        super(context, layoutInflater);
        this.g = str;
        this.h = nVar;
    }
}
