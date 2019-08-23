package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35596a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f35597b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f35598c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f35599d;

    /* renamed from: e  reason: collision with root package name */
    private final int f35600e;

    /* renamed from: f  reason: collision with root package name */
    private final int f35601f;
    private final boolean g;
    private final SpannableString h;
    private final SpannableString i;
    private final TextView j;

    e(ImageView imageView, ViewGroup viewGroup, TextView textView, int i2, int i3, boolean z, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f35597b = imageView;
        this.f35598c = viewGroup;
        this.f35599d = textView;
        this.f35600e = i2;
        this.f35601f = i3;
        this.g = z;
        this.h = spannableString;
        this.i = spannableString2;
        this.j = textView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r7 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = f35596a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26004(0x6594, float:3.644E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r20
            com.meituan.robust.ChangeQuickRedirect r2 = f35596a
            r3 = 0
            r4 = 26004(0x6594, float:3.644E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r20)
            android.widget.ImageView r0 = r7.f35597b
            android.view.ViewGroup r1 = r7.f35598c
            android.widget.TextView r2 = r7.f35599d
            int r14 = r7.f35600e
            int r15 = r7.f35601f
            boolean r3 = r7.g
            android.text.SpannableString r4 = r7.h
            android.text.SpannableString r5 = r7.i
            android.widget.TextView r6 = r7.j
            boolean r8 = r0.isSelected()
            com.ss.android.ugc.aweme.challenge.ui.b$1 r13 = new com.ss.android.ugc.aweme.challenge.ui.b$1
            r13.<init>(r8, r2, r4)
            r11 = r1
            r12 = r0
            r4 = r13
            r13 = r2
            r16 = r8
            r17 = r3
            r18 = r4
            com.ss.android.ugc.aweme.utils.ak.a(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r8 == 0) goto L_0x0064
            r2.setText(r5)
        L_0x0064:
            android.content.Context r2 = r2.getContext()
            if (r8 == 0) goto L_0x006e
            r3 = 2131560036(0x7f0d0664, float:1.8745433E38)
            goto L_0x0071
        L_0x006e:
            r3 = 2131559901(0x7f0d05dd, float:1.874516E38)
        L_0x0071:
            java.lang.String r2 = r2.getString(r3)
            r6.setText(r2)
            r2 = r8 ^ 1
            r0.setSelected(r2)
            if (r8 != 0) goto L_0x00cb
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.b.f35583a
            r14 = 1
            r15 = 25997(0x658d, float:3.643E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00b1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.challenge.ui.b.f35583a
            r14 = 1
            r15 = 25997(0x658d, float:3.643E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00b1:
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00c2
            android.view.ViewParent r0 = r1.getParent()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r0 == 0) goto L_0x00b1
        L_0x00c2:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r0 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r1 = (com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout) r1
            r1.scrollTo(r10, r10)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.e.onClick(android.view.View):void");
    }
}
