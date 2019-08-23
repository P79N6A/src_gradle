package com.ss.android.ugc.aweme.discover.ui;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HotSearchImageSectionDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42919a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f42920b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f42921c;

    private int a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f42919a, false, 37668, new Class[]{RecyclerView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f42919a, false, 37668, new Class[]{RecyclerView.class}, Integer.TYPE)).intValue();
        }
        int i = -1;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            i = ((GridLayoutManager) layoutManager).getSpanCount();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            i = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        }
        return i;
    }

    public HotSearchImageSectionDecoration(Drawable drawable, Drawable drawable2) {
        this.f42920b = drawable;
        this.f42921c = drawable2;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f42919a, false, 37665, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f42919a, false, 37665, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f42919a, false, 37669, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f42919a, false, 37669, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
        } else {
            int a2 = a(recyclerView2);
            int childCount = recyclerView.getChildCount();
            int i3 = childCount / a2;
            int i4 = childCount % a2;
            for (int i5 = 1; i5 < a2; i5++) {
                if (i5 < i4) {
                    i2 = i3 * a2;
                } else {
                    i2 = (i3 - 1) * a2;
                }
                View childAt = recyclerView2.getChildAt(i5);
                View childAt2 = recyclerView2.getChildAt(i2 + i5);
                int top = childAt.getTop();
                int left = childAt.getLeft();
                int bottom = childAt2.getBottom();
                this.f42920b.setBounds(left - this.f42920b.getIntrinsicWidth(), top, left, bottom);
                this.f42920b.draw(canvas2);
            }
        }
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2}, this, f42919a, false, 37670, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2}, this, f42919a, false, 37670, new Class[]{Canvas.class, RecyclerView.class}, Void.TYPE);
            return;
        }
        int a3 = a(recyclerView2);
        int childCount2 = recyclerView.getChildCount() / a3;
        for (int i6 = 1; i6 < childCount2; i6++) {
            if (i6 == childCount2) {
                i = recyclerView.getChildCount();
            } else {
                i = (i6 * a3) + a3;
            }
            View childAt3 = recyclerView2.getChildAt(i6 * a3);
            View childAt4 = recyclerView2.getChildAt(i - 1);
            int left2 = childAt3.getLeft();
            int top2 = childAt3.getTop();
            int right = childAt4.getRight();
            this.f42921c.setBounds(left2, top2 - this.f42921c.getIntrinsicHeight(), right, top2);
            this.f42921c.draw(canvas2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0107, code lost:
        if (r17 == ((r9 / r11) + 1)) goto L_0x0124;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getItemOffsets(android.graphics.Rect r19, android.view.View r20, android.support.v7.widget.RecyclerView r21, android.support.v7.widget.RecyclerView.State r22) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r10 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r20
            r15 = 2
            r0[r15] = r10
            r16 = 3
            r0[r16] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f42919a
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
            r4 = 37666(0x9322, float:5.2781E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r20
            r0[r15] = r10
            r0[r16] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f42919a
            r3 = 0
            r4 = 37666(0x9322, float:5.2781E-41)
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
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            android.support.v7.widget.RecyclerView$LayoutParams r0 = (android.support.v7.widget.RecyclerView.LayoutParams) r0
            int r9 = r0.getViewLayoutPosition()
            int r11 = r7.a(r10)
            android.support.v7.widget.RecyclerView$Adapter r0 = r21.getAdapter()
            int r17 = r0.getItemCount()
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42919a
            r3 = 0
            r4 = 37667(0x9323, float:5.2783E-41)
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
            if (r0 == 0) goto L_0x00ee
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42919a
            r3 = 0
            r4 = 37667(0x9323, float:5.2783E-41)
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
            goto L_0x0124
        L_0x00ee:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r21.getLayoutManager()
            boolean r1 = r0 instanceof android.support.v7.widget.GridLayoutManager
            if (r1 == 0) goto L_0x010a
            int r0 = r17 % r11
            if (r0 != 0) goto L_0x00ff
            int r17 = r17 / r11
        L_0x00fc:
            r0 = r17
            goto L_0x0104
        L_0x00ff:
            int r17 = r17 / r11
            int r17 = r17 + 1
            goto L_0x00fc
        L_0x0104:
            int r1 = r9 / r11
            int r1 = r1 + r14
            if (r0 != r1) goto L_0x0123
            goto L_0x0124
        L_0x010a:
            boolean r1 = r0 instanceof android.support.v7.widget.StaggeredGridLayoutManager
            if (r1 == 0) goto L_0x0123
            android.support.v7.widget.StaggeredGridLayoutManager r0 = (android.support.v7.widget.StaggeredGridLayoutManager) r0
            int r0 = r0.getOrientation()
            if (r0 != r14) goto L_0x011d
            int r0 = r17 % r11
            int r0 = r17 - r0
            if (r9 < r0) goto L_0x0123
            goto L_0x0124
        L_0x011d:
            int r0 = r9 + 1
            int r0 = r0 % r11
            if (r0 != 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r14 = 0
        L_0x0124:
            int r0 = r11 + -1
            android.graphics.drawable.Drawable r1 = r7.f42920b
            int r1 = r1.getIntrinsicWidth()
            int r0 = r0 * r1
            int r0 = r0 / r11
            android.graphics.drawable.Drawable r1 = r7.f42920b
            int r1 = r1.getIntrinsicWidth()
            int r1 = r1 - r0
            int r9 = r9 % r11
            int r9 = r9 * r1
            int r0 = r0 - r9
            android.graphics.drawable.Drawable r1 = r7.f42921c
            int r1 = r1.getIntrinsicHeight()
            if (r14 == 0) goto L_0x0143
            r1 = 0
        L_0x0143:
            r8.set(r9, r13, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.HotSearchImageSectionDecoration.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }
}
