package com.ss.android.ugc.aweme.sticker.prop.adapter;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.sticker.model.d;
import java.util.ArrayList;
import java.util.List;

public final class a extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71667a;

    /* renamed from: b  reason: collision with root package name */
    public List<d> f71668b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f71669c;

    /* renamed from: d  reason: collision with root package name */
    private Context f71670d;

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.adapter.a$a  reason: collision with other inner class name */
    static class C0744a {

        /* renamed from: a  reason: collision with root package name */
        public View f71671a;

        /* renamed from: b  reason: collision with root package name */
        public RemoteImageView f71672b;

        C0744a() {
        }
    }

    public final Object getItem(int i) {
        return null;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f71667a, false, 81999, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71667a, false, 81999, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f71668b == null) {
            return 0;
        } else {
            return this.f71668b.size();
        }
    }

    public a(Context context) {
        this.f71670d = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.ss.android.ugc.aweme.sticker.prop.adapter.a$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r16
            r13 = 2
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f71667a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 82000(0x14050, float:1.14906E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0059
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r16
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f71667a
            r3 = 0
            r4 = 82000(0x14050, float:1.14906E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0059:
            if (r16 != 0) goto L_0x0087
            android.content.Context r0 = r7.f71670d
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690506(0x7f0f040a, float:1.9010058E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            com.ss.android.ugc.aweme.sticker.prop.adapter.a$a r1 = new com.ss.android.ugc.aweme.sticker.prop.adapter.a$a
            r1.<init>()
            r2 = 2131167258(0x7f07081a, float:1.7948785E38)
            android.view.View r2 = r0.findViewById(r2)
            r1.f71671a = r2
            r2 = 2131170125(0x7f07134d, float:1.79546E38)
            android.view.View r2 = r0.findViewById(r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r2
            r1.f71672b = r2
            r0.setTag(r1)
            r9 = r0
            goto L_0x0090
        L_0x0087:
            java.lang.Object r0 = r16.getTag()
            r1 = r0
            com.ss.android.ugc.aweme.sticker.prop.adapter.a$a r1 = (com.ss.android.ugc.aweme.sticker.prop.adapter.a.C0744a) r1
            r9 = r16
        L_0x0090:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r1.f71672b
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r2 = r7.f71668b
            java.lang.Object r2 = r2.get(r15)
            com.ss.android.ugc.aweme.sticker.model.d r2 = (com.ss.android.ugc.aweme.sticker.model.d) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.iconUrl
            com.ss.android.ugc.aweme.base.c.b(r0, r2)
            java.util.List<com.ss.android.ugc.aweme.sticker.model.d> r0 = r7.f71668b
            java.lang.Object r0 = r0.get(r15)
            com.ss.android.ugc.aweme.sticker.model.d r0 = (com.ss.android.ugc.aweme.sticker.model.d) r0
            boolean r0 = r0.mIsSelect
            if (r0 == 0) goto L_0x0112
            android.view.View r0 = r1.f71671a
            r0.setVisibility(r11)
            android.view.View r8 = r1.f71671a
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71667a
            r3 = 0
            r4 = 82001(0x14051, float:1.14908E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f6
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f71667a
            r3 = 0
            r4 = 82001(0x14051, float:1.14908E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0118
        L_0x00f6:
            java.lang.String r0 = "alpha"
            float[] r1 = new float[r13]
            r1 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r8, r0, r1)
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            r0.start()
            goto L_0x0118
        L_0x0112:
            android.view.View r0 = r1.f71671a
            r1 = 4
            r0.setVisibility(r1)
        L_0x0118:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.prop.adapter.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
