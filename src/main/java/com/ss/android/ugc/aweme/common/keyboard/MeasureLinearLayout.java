package com.ss.android.ugc.aweme.common.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;

public class MeasureLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40234a;

    /* renamed from: b  reason: collision with root package name */
    public int f40235b;

    /* renamed from: c  reason: collision with root package name */
    private a f40236c;

    /* renamed from: d  reason: collision with root package name */
    private int f40237d;

    public a getKeyBoardObservable() {
        return this.f40236c;
    }

    public MeasureLinearLayout(Context context) {
        this(context, null);
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0165, code lost:
        if (r3 == false) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r10 = 1
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40234a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33448(0x82a8, float:4.687E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40234a
            r3 = 0
            r4 = 33448(0x82a8, float:4.687E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            int r0 = r7.f40237d
            int r1 = r7.f40235b
            if (r0 != r1) goto L_0x019b
            com.ss.android.ugc.aweme.common.keyboard.a r0 = r7.f40236c
            android.content.Context r1 = r18.getContext()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33444(0x82a4, float:4.6865E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00a8
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33444(0x82a4, float:4.6865E-41)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x019f
        L_0x00a8:
            int r2 = android.view.View.MeasureSpec.getSize(r20)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33446(0x82a6, float:4.6868E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x00fc
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33446(0x82a6, float:4.6868E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0169
        L_0x00fc:
            boolean r3 = com.ss.android.ugc.aweme.utils.imm.RomUtils.b()
            if (r3 == 0) goto L_0x0168
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33447(0x82a7, float:4.6869E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x013d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.common.keyboard.a.f40238a
            r14 = 0
            r15 = 33447(0x82a7, float:4.6869E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0153
        L_0x013d:
            java.lang.String r3 = "window"
            java.lang.Object r3 = r1.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getSize(r4)
            int r3 = r4.y
        L_0x0153:
            if (r2 <= r3) goto L_0x0157
        L_0x0155:
            r3 = 1
            goto L_0x0169
        L_0x0157:
            int r4 = r0.f40240b
            if (r4 != 0) goto L_0x015e
            r0.f40240b = r3
            goto L_0x0164
        L_0x015e:
            int r4 = r0.f40240b
            if (r4 == r3) goto L_0x0164
            r3 = 1
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            if (r3 == 0) goto L_0x0168
            goto L_0x0155
        L_0x0168:
            r3 = 0
        L_0x0169:
            if (r3 != 0) goto L_0x019f
            int r3 = r0.f40241c
            if (r3 != 0) goto L_0x0172
            r0.f40241c = r2
            goto L_0x019f
        L_0x0172:
            int r3 = r0.f40241c
            if (r3 == r2) goto L_0x019f
            int r3 = r0.f40241c
            int r3 = r3 - r2
            int r4 = java.lang.Math.abs(r3)
            float r4 = (float) r4
            r5 = 1117782016(0x42a00000, float:80.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r5)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x019f
            if (r3 <= 0) goto L_0x018d
            r0.f40243e = r10
            goto L_0x018f
        L_0x018d:
            r0.f40243e = r9
        L_0x018f:
            int r1 = java.lang.Math.abs(r3)
            boolean r3 = r0.f40243e
            r0.a(r3, r1)
            r0.f40241c = r2
            goto L_0x019f
        L_0x019b:
            int r0 = r7.f40235b
            r7.f40237d = r0
        L_0x019f:
            super.onMeasure(r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout.onMeasure(int, int):void");
    }

    public MeasureLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40236c = new a();
    }
}
