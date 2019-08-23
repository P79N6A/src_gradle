package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class BottomSheetUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69901a;

    static class BottomSheetViewPagerListener extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69902a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f69903b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewPagerBottomSheetBehavior<View> f69904c;

        public void onPageSelected(int i) {
            Runnable runnable;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69902a, false, 79522, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69902a, false, 79522, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            ViewPager viewPager = this.f69903b;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f69904c;
            viewPagerBottomSheetBehavior.getClass();
            if (PatchProxy.isSupport(new Object[]{viewPagerBottomSheetBehavior}, null, a.f69938a, true, 79523, new Class[]{ViewPagerBottomSheetBehavior.class}, Runnable.class)) {
                runnable = (Runnable) PatchProxy.accessDispatch(new Object[]{viewPagerBottomSheetBehavior}, null, a.f69938a, true, 79523, new Class[]{ViewPagerBottomSheetBehavior.class}, Runnable.class);
            } else {
                runnable = new a(viewPagerBottomSheetBehavior);
            }
            viewPager.post(runnable);
        }

        private BottomSheetViewPagerListener(ViewPager viewPager, View view) {
            this.f69903b = viewPager;
            this.f69904c = ViewPagerBottomSheetBehavior.b(view);
        }

        /* synthetic */ BottomSheetViewPagerListener(ViewPager viewPager, View view, byte b2) {
            this(viewPager, view);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.support.v4.view.ViewPager r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f69901a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.view.ViewPager> r3 = android.support.v4.view.ViewPager.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 79520(0x136a0, float:1.11431E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f69901a
            r13 = 1
            r14 = 79520(0x136a0, float:1.11431E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.view.ViewPager> r0 = android.support.v4.view.ViewPager.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f69901a
            r5 = 1
            r6 = 79521(0x136a1, float:1.11433E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.view.View> r8 = android.view.View.class
            r7[r9] = r8
            java.lang.Class<android.view.View> r8 = android.view.View.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0068
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f69901a
            r13 = 1
            r14 = 79521(0x136a1, float:1.11433E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r15[r9] = r1
            java.lang.Class<android.view.View> r16 = android.view.View.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L_0x008f
        L_0x0068:
            r1 = r0
        L_0x0069:
            if (r1 == 0) goto L_0x008f
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            boolean r4 = r2 instanceof android.support.design.widget.CoordinatorLayout.LayoutParams
            if (r4 == 0) goto L_0x007f
            android.support.design.widget.CoordinatorLayout$LayoutParams r2 = (android.support.design.widget.CoordinatorLayout.LayoutParams) r2
            android.support.design.widget.CoordinatorLayout$Behavior r2 = r2.getBehavior()
            boolean r2 = r2 instanceof com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior
            if (r2 == 0) goto L_0x007f
            r3 = r1
            goto L_0x008f
        L_0x007f:
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L_0x008d
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L_0x008a
            goto L_0x008d
        L_0x008a:
            android.view.View r1 = (android.view.View) r1
            goto L_0x0069
        L_0x008d:
            r1 = r3
            goto L_0x0069
        L_0x008f:
            if (r3 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.BottomSheetUtils$BottomSheetViewPagerListener r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.BottomSheetUtils$BottomSheetViewPagerListener
            r1.<init>(r0, r3, r9)
            r0.addOnPageChangeListener(r1)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.BottomSheetUtils.a(android.support.v4.view.ViewPager):void");
    }
}
