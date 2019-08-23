package com.ss.android.ugc.aweme.commerce.floatvideo.widget;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/ugc/aweme/commerce/floatvideo/widget/DragRelativeLayout$initDragHelper$1", "Landroid/support/v4/widget/ViewDragHelper$Callback;", "clampViewPositionHorizontal", "", "child", "Landroid/view/View;", "left", "dx", "clampViewPositionVertical", "top", "dy", "getViewHorizontalDragRange", "getViewVerticalDragRange", "onViewReleased", "", "releasedChild", "xvel", "", "yvel", "tryCaptureView", "", "view", "i", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DragRelativeLayout$initDragHelper$1 extends ViewDragHelper.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DragRelativeLayout f36950b;

    DragRelativeLayout$initDragHelper$1(DragRelativeLayout dragRelativeLayout) {
        this.f36950b = dragRelativeLayout;
    }

    public final int getViewHorizontalDragRange(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36949a, false, 28225, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f36949a, false, 28225, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "child");
        return this.f36950b.getMeasuredWidth() - view.getMeasuredWidth();
    }

    public final int getViewVerticalDragRange(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36949a, false, 28226, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, f36949a, false, 28226, new Class[]{View.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "child");
        return this.f36950b.getMeasuredHeight() - view.getMeasuredHeight();
    }

    public final boolean tryCaptureView(@NotNull View view, int i) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f36949a, false, 28221, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f36949a, false, 28221, new Class[]{View.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (view2 == this.f36950b.g) {
            return true;
        }
        return false;
    }

    public final int clampViewPositionHorizontal(@NotNull View view, int i, int i2) {
        View view2 = view;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36949a, false, 28222, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36949a, false, 28222, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        if (i3 > this.f36950b.getWidth() - view.getWidth()) {
            return this.f36950b.getWidth() - view.getWidth();
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final int clampViewPositionVertical(@NotNull View view, int i, int i2) {
        View view2 = view;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36949a, false, 28223, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36949a, false, 28223, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(view, "child");
        if (i3 > this.f36950b.getHeight() - view.getHeight()) {
            return this.f36950b.getHeight() - view.getHeight();
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewReleased(@org.jetbrains.annotations.NotNull android.view.View r14, float r15, float r16) {
        /*
            r13 = this;
            r7 = r13
            r8 = r14
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r15)
            r11 = 1
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            r12 = 2
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36949a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28224(0x6e40, float:3.955E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Float r1 = java.lang.Float.valueOf(r15)
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r16)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36949a
            r3 = 0
            r4 = 28224(0x6e40, float:3.955E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            java.lang.String r0 = "releasedChild"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            android.view.View r0 = r0.g
            if (r8 == r0) goto L_0x0068
            return
        L_0x0068:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r0 = r0.f36936b
            if (r0 != r9) goto L_0x006f
            return
        L_0x006f:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r0 = r0.getWidth()
            int r1 = r14.getWidth()
            int r0 = r0 - r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            int r1 = r1.getHeight()
            int r2 = r14.getHeight()
            int r1 = r1 - r2
            int r2 = r14.getLeft()
            int r3 = r14.getTop()
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.getWidth()
            int r4 = r4 / r12
            int r5 = r14.getWidth()
            int r5 = r5 / r12
            int r4 = r4 - r5
            r5 = 4
            if (r2 >= r4) goto L_0x0114
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r0 = r0.getHeight()
            int r0 = r0 / r12
            int r4 = r14.getWidth()
            int r4 = r4 / r12
            int r0 = r0 - r4
            if (r3 >= r0) goto L_0x00df
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r0 = r0.f36939e
            int r0 = r3 - r0
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            int r1 = r1.f36937c
            int r1 = r2 - r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.f36936b
            switch(r4) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c0;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x00de
        L_0x00c0:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r1, r10, r5)
            goto L_0x00de
        L_0x00c7:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            int r0 = -r0
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r1, r14, r10, r0, r12)
            return
        L_0x00ce:
            if (r2 <= r3) goto L_0x00d7
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            int r0 = -r0
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r1, r14, r10, r0, r12)
            return
        L_0x00d7:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r1, r10, r5)
            return
        L_0x00de:
            return
        L_0x00df:
            int r1 = r1 - r3
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r0 = r0.f36940f
            int r0 = r1 - r0
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r3 = r7.f36950b
            int r3 = r3.f36937c
            int r3 = r2 - r3
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.f36936b
            switch(r4) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f4;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x0113
        L_0x00f4:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r3
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r1, r10, r5)
            goto L_0x0113
        L_0x00fb:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r1, r14, r10, r0, r12)
            goto L_0x0185
        L_0x0102:
            if (r2 <= r1) goto L_0x010b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r1, r14, r10, r0, r12)
            goto L_0x0185
        L_0x010b:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r3
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r1, r10, r5)
            goto L_0x0185
        L_0x0113:
            return
        L_0x0114:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.getHeight()
            int r4 = r4 / r12
            int r6 = r14.getWidth()
            int r6 = r6 / r12
            int r4 = r4 - r6
            if (r3 >= r4) goto L_0x0155
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r1 = r7.f36950b
            int r1 = r1.f36939e
            int r1 = r3 - r1
            int r0 = r0 - r2
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r2 = r7.f36950b
            int r2 = r2.f36938d
            int r2 = r0 - r2
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.f36936b
            switch(r4) {
                case 0: goto L_0x0145;
                case 1: goto L_0x013e;
                case 2: goto L_0x0138;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x0154
        L_0x0138:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r2, r10, r5)
            goto L_0x0154
        L_0x013e:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r10, r1, r12)
            return
        L_0x0145:
            if (r0 <= r3) goto L_0x014e
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            int r1 = -r1
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r10, r1, r12)
            return
        L_0x014e:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r2, r10, r5)
            return
        L_0x0154:
            return
        L_0x0155:
            int r1 = r1 - r3
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r3 = r7.f36950b
            int r3 = r3.f36940f
            int r3 = r1 - r3
            int r0 = r0 - r2
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r2 = r7.f36950b
            int r2 = r2.f36938d
            int r2 = r0 - r2
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r4 = r7.f36950b
            int r4 = r4.f36936b
            switch(r4) {
                case 0: goto L_0x0177;
                case 1: goto L_0x0171;
                case 2: goto L_0x016b;
                default: goto L_0x016a;
            }
        L_0x016a:
            goto L_0x0185
        L_0x016b:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r2, r10, r5)
            goto L_0x0185
        L_0x0171:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r10, r3, r12)
            return
        L_0x0177:
            if (r0 <= r1) goto L_0x017f
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r10, r3, r12)
            return
        L_0x017f:
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout r0 = r7.f36950b
            com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout.a(r0, r14, r2, r10, r5)
            return
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.floatvideo.widget.DragRelativeLayout$initDragHelper$1.onViewReleased(android.view.View, float, float):void");
    }
}
