package com.bytedance.android.livesdk.gift.impl;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GiftItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15042a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f15043b;

    /* renamed from: c  reason: collision with root package name */
    private int f15044c;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f15042a, false, 9783, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f15042a, false, 9783, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f15042a, false, 9785, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f15042a, false, 9785, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
        } else {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView2.getChildAt(i);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                int top = childAt.getTop() - layoutParams.topMargin;
                int bottom = childAt.getBottom() + layoutParams.bottomMargin;
                int right = childAt.getRight() + layoutParams.rightMargin;
                int i2 = this.f15044c + right;
                if (this.f15043b != null) {
                    this.f15043b.setBounds(right, top, i2, bottom);
                    this.f15043b.draw(canvas);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f15042a, false, 9784, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f15042a, false, 9784, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt2 = recyclerView2.getChildAt(i3);
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
            int left = childAt2.getLeft() - layoutParams2.leftMargin;
            int right2 = childAt2.getRight() + layoutParams2.rightMargin + this.f15044c;
            int bottom2 = childAt2.getBottom() + layoutParams2.bottomMargin;
            int i4 = this.f15044c + bottom2;
            if (this.f15043b != null) {
                this.f15043b.setBounds(left, bottom2, right2, i4);
                this.f15043b.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x014c, code lost:
        if (r9 >= r17) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getItemOffsets(android.graphics.Rect r19, android.view.View r20, android.support.v7.widget.RecyclerView r21, android.support.v7.widget.RecyclerView.State r22) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r15] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 9786(0x263a, float:1.3713E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            r0[r16] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            r3 = 0
            r4 = 9786(0x263a, float:1.3713E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r14] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r15] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$State> r1 = android.support.v7.widget.RecyclerView.State.class
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0062:
            super.getItemOffsets(r19, r20, r21, r22)
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            r3 = 0
            r4 = 9789(0x263d, float:1.3717E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009d
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r13] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            r3 = 0
            r4 = 9789(0x263d, float:1.3717E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x009b:
            r11 = r0
            goto L_0x00b8
        L_0x009d:
            r0 = -1
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r21.getLayoutManager()
            boolean r2 = r1 instanceof android.support.v7.widget.GridLayoutManager
            if (r2 == 0) goto L_0x00ad
            android.support.v7.widget.GridLayoutManager r1 = (android.support.v7.widget.GridLayoutManager) r1
            int r0 = r1.getSpanCount()
            goto L_0x009b
        L_0x00ad:
            boolean r2 = r1 instanceof android.support.v7.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L_0x009b
            android.support.v7.widget.StaggeredGridLayoutManager r1 = (android.support.v7.widget.StaggeredGridLayoutManager) r1
            int r0 = r1.getSpanCount()
            goto L_0x009b
        L_0x00b8:
            android.support.v7.widget.RecyclerView$Adapter r0 = r21.getAdapter()
            int r17 = r0.getItemCount()
            int r9 = r10.getChildAdapterPosition(r9)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            r3 = 0
            r4 = 9788(0x263c, float:1.3716E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0138
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f15042a
            r3 = 0
            r4 = 9788(0x263c, float:1.3716E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r14 = r0
            goto L_0x0168
        L_0x0138:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r21.getLayoutManager()
            boolean r1 = r0 instanceof android.support.v7.widget.GridLayoutManager
            if (r1 == 0) goto L_0x014f
            int r0 = r17 % r11
            if (r0 == 0) goto L_0x0149
            int r17 = r17 - r0
        L_0x0146:
            r0 = r17
            goto L_0x014c
        L_0x0149:
            int r17 = r17 - r11
            goto L_0x0146
        L_0x014c:
            if (r9 < r0) goto L_0x0167
            goto L_0x0168
        L_0x014f:
            boolean r1 = r0 instanceof android.support.v7.widget.StaggeredGridLayoutManager
            if (r1 == 0) goto L_0x0167
            android.support.v7.widget.StaggeredGridLayoutManager r0 = (android.support.v7.widget.StaggeredGridLayoutManager) r0
            int r0 = r0.getOrientation()
            if (r0 != r14) goto L_0x0162
            int r0 = r17 % r11
            int r0 = r17 - r0
            if (r9 < r0) goto L_0x0167
            goto L_0x0168
        L_0x0162:
            int r9 = r9 + r14
            int r9 = r9 % r11
            if (r9 != 0) goto L_0x0167
            goto L_0x0168
        L_0x0167:
            r14 = 0
        L_0x0168:
            if (r14 == 0) goto L_0x0170
            int r0 = r7.f15044c
            r8.set(r13, r13, r0, r13)
            return
        L_0x0170:
            int r0 = r7.f15044c
            int r1 = r7.f15044c
            r8.set(r13, r13, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.impl.GiftItemDecoration.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }
}
