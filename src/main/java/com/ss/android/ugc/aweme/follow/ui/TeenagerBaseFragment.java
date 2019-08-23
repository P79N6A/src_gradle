package com.ss.android.ugc.aweme.follow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;

public abstract class TeenagerBaseFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47843a;

    public abstract int a();

    public abstract String b();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00df  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r22, @android.support.annotation.Nullable android.view.ViewGroup r23, @android.support.annotation.Nullable android.os.Bundle r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r24
            com.meituan.robust.ChangeQuickRedirect r6 = f47843a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.view.LayoutInflater> r5 = android.view.LayoutInflater.class
            r9[r11] = r5
            java.lang.Class<android.view.ViewGroup> r5 = android.view.ViewGroup.class
            r9[r12] = r5
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r9[r13] = r5
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r7 = 0
            r8 = 44747(0xaecb, float:6.2704E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r24
            com.meituan.robust.ChangeQuickRedirect r16 = f47843a
            r17 = 0
            r18 = 44747(0xaecb, float:6.2704E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r0[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r0[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r0[r13] = r1
            java.lang.Class<android.view.View> r20 = android.view.View.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0058:
            r2 = 2131690124(0x7f0f028c, float:1.9009283E38)
            android.view.View r0 = r0.inflate(r2, r1, r11)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f47843a
            r4 = 0
            r5 = 44748(0xaecc, float:6.2705E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0093
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f47843a
            r5 = 0
            r6 = 44748(0xaecc, float:6.2705E-41)
            java.lang.Class[] r7 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r7[r11] = r1
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
        L_0x0090:
            r10 = r21
            goto L_0x00ad
        L_0x0093:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x0090
            r1 = 2131165952(0x7f070300, float:1.7946136E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.setVisibility(r11)
            com.ss.android.ugc.aweme.follow.ui.a r2 = new com.ss.android.ugc.aweme.follow.ui.a
            r10 = r21
            r2.<init>(r10)
            r1.setOnClickListener(r2)
        L_0x00ad:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = f47843a
            r6 = 0
            r7 = 44749(0xaecd, float:6.2707E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r8[r11] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x00df
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = f47843a
            r6 = 0
            r7 = 44749(0xaecd, float:6.2707E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r8[r11] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00f1
        L_0x00df:
            r1 = 2131171073(0x7f071701, float:1.7956522E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            if (r1 == 0) goto L_0x00f1
            int r2 = r21.a()
            r1.setText(r2)
        L_0x00f1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.follow.ui.TeenagerBaseFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
