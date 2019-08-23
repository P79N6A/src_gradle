package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.List;

public class AwemeViewPagerNavigator extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76285a = null;
    public static final String h = "AwemeViewPagerNavigator";

    /* renamed from: b  reason: collision with root package name */
    public View f76286b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f76287c;

    /* renamed from: d  reason: collision with root package name */
    public int f76288d;

    /* renamed from: e  reason: collision with root package name */
    public View f76289e;

    /* renamed from: f  reason: collision with root package name */
    h f76290f;
    ViewPager.OnPageChangeListener g;
    boolean i;
    ViewPager j;
    public boolean k;
    private int l;
    private boolean m;
    private List<View> n;
    private FrameLayout o;

    public interface a {
        void a(View view, int i);

        void a(View view, int i, boolean z);
    }

    public int getAllTabWidth() {
        return this.l;
    }

    public View getLastSelectedTab() {
        return this.f76289e;
    }

    public ViewPager getViewPager() {
        return this.j;
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76285a, false, 89394, new Class[0], Boolean.TYPE)) {
            return ey.a(getContext());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76285a, false, 89394, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public int getTabCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f76285a, false, 89402, new Class[0], Integer.TYPE)) {
            return this.f76287c.getChildCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76285a, false, 89402, new Class[0], Integer.TYPE)).intValue();
    }

    public void setAllTabWidth(int i2) {
        this.l = i2;
    }

    public AwemeViewPagerNavigator(Context context) {
        this(context, null);
    }

    private void setIndicatorPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76285a, false, 89400, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76285a, false, 89400, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f76286b != null) {
            float f2 = (float) (this.f76288d * i2);
            if (a()) {
                f2 = -f2;
            }
            this.f76286b.setTranslationX(f2);
        }
    }

    public void setScrollable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76285a, false, 89393, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76285a, false, 89393, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = z;
        this.f76290f.setScrollable(z);
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76285a, false, 89403, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76285a, false, 89403, new Class[]{Integer.TYPE}, View.class);
        } else if (com.ss.android.g.a.a()) {
            return this.f76287c.getChildAt(i2);
        } else {
            if (this.n == null || i2 < 0 || i2 >= this.n.size()) {
                return null;
            }
            return this.n.get(i2);
        }
    }

    public AwemeViewPagerNavigator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(ViewPager viewPager, l lVar) {
        ViewPager viewPager2 = viewPager;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{viewPager2, lVar2}, this, f76285a, false, 89395, new Class[]{ViewPager.class, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, lVar2}, this, f76285a, false, 89395, new Class[]{ViewPager.class, l.class}, Void.TYPE);
            return;
        }
        a(viewPager2, lVar2, (a) null);
    }

    private void a(ViewPager viewPager, a aVar, int i2) {
        ViewPager viewPager2 = viewPager;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{viewPager2, aVar2, Integer.valueOf(i2)}, this, f76285a, false, 89399, new Class[]{ViewPager.class, a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, aVar2, Integer.valueOf(i2)}, this, f76285a, false, 89399, new Class[]{ViewPager.class, a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            viewPager.removeOnPageChangeListener(this.g);
        }
        final int i3 = i2;
        this.g = new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76296a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
                View view;
                int i2;
                int i3 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76296a, false, 89406, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76296a, false, 89406, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (com.ss.android.g.a.a()) {
                    view = AwemeViewPagerNavigator.this.f76287c.getChildAt(i3);
                } else {
                    view = AwemeViewPagerNavigator.this.a(i3);
                }
                if (AwemeViewPagerNavigator.this.f76289e != null) {
                    AwemeViewPagerNavigator.this.f76289e.setSelected(false);
                }
                if (view != null) {
                    view.setSelected(true);
                    AwemeViewPagerNavigator.this.f76289e = view;
                }
                if (aVar2 != null) {
                    aVar2.a(view, i3, false);
                }
                AwemeViewPagerNavigator awemeViewPagerNavigator = AwemeViewPagerNavigator.this;
                int i4 = i3;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i4)}, awemeViewPagerNavigator, AwemeViewPagerNavigator.f76285a, false, 89401, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    AwemeViewPagerNavigator awemeViewPagerNavigator2 = awemeViewPagerNavigator;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i4)}, awemeViewPagerNavigator2, AwemeViewPagerNavigator.f76285a, false, 89401, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (!awemeViewPagerNavigator.i && awemeViewPagerNavigator.f76289e != null && !awemeViewPagerNavigator.a()) {
                    int scrollX = (awemeViewPagerNavigator.f76288d * i3) - awemeViewPagerNavigator.f76290f.getScrollX();
                    if (scrollX <= awemeViewPagerNavigator.f76288d / 2) {
                        if (i3 == 1) {
                            i2 = scrollX - awemeViewPagerNavigator.f76288d;
                        } else {
                            i2 = scrollX - (awemeViewPagerNavigator.f76288d / 2);
                        }
                    } else if (scrollX < (awemeViewPagerNavigator.getMeasuredWidth() - (awemeViewPagerNavigator.f76288d / 2)) - awemeViewPagerNavigator.f76288d) {
                        i2 = 0;
                    } else if (i3 == i4 - 2) {
                        i2 = awemeViewPagerNavigator.f76288d + ((scrollX + awemeViewPagerNavigator.f76288d) - awemeViewPagerNavigator.getMeasuredWidth());
                    } else {
                        i2 = (awemeViewPagerNavigator.f76288d / 2) + ((scrollX + awemeViewPagerNavigator.f76288d) - awemeViewPagerNavigator.getMeasuredWidth());
                    }
                    awemeViewPagerNavigator.f76290f.smoothScrollBy(i2, 0);
                }
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f76296a, false, 89405, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f76296a, false, 89405, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (AwemeViewPagerNavigator.this.f76286b != null) {
                    float f3 = ((float) AwemeViewPagerNavigator.this.f76288d) * (((float) i) + f2);
                    if (AwemeViewPagerNavigator.this.a()) {
                        f3 = -f3;
                    }
                    AwemeViewPagerNavigator.this.f76286b.setTranslationX(f3);
                }
            }
        };
        viewPager.setOnPageChangeListener(this.g);
    }

    public AwemeViewPagerNavigator(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = -1;
        this.i = true;
        this.k = true;
        if (PatchProxy.isSupport(new Object[0], this, f76285a, false, 89392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76285a, false, 89392, new Class[0], Void.TYPE);
            return;
        }
        this.f76290f = new h(getContext());
        this.f76290f.setScrollable(false);
        this.f76290f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f76290f);
        this.f76290f.setHorizontalFadingEdgeEnabled(false);
        this.f76290f.setHorizontalScrollBarEnabled(false);
        this.o = new FrameLayout(getContext());
        this.f76290f.addView(this.o, new ViewGroup.LayoutParams(-2, -1));
        this.f76287c = new LinearLayout(getContext());
        this.f76287c.setOrientation(0);
        this.f76287c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.o.addView(this.f76287c);
    }

    public final void a(ViewPager viewPager, l lVar, a aVar) {
        ViewPager viewPager2 = viewPager;
        l lVar2 = lVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{viewPager2, lVar2, aVar2}, this, f76285a, false, 89396, new Class[]{ViewPager.class, l.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, lVar2, aVar2}, this, f76285a, false, 89396, new Class[]{ViewPager.class, l.class, a.class}, Void.TYPE);
            return;
        }
        a(viewPager2, lVar2, aVar2, 0);
    }

    public final void a(ViewPager viewPager, l lVar, a aVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewPager, lVar, aVar, Integer.valueOf(i2)}, this, f76285a, false, 89397, new Class[]{ViewPager.class, l.class, a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager, lVar, aVar, Integer.valueOf(i2)}, this, f76285a, false, 89397, new Class[]{ViewPager.class, l.class, a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(viewPager, lVar, aVar, i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.support.v4.view.ViewPager r18, com.ss.android.ugc.aweme.views.l r19, com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a r20, int r21, boolean r22) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = 5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r15 = 3
            r0[r15] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r16 = 4
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f76285a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.support.v4.view.ViewPager> r1 = android.support.v4.view.ViewPager.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.views.l> r1 = com.ss.android.ugc.aweme.views.l.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$a> r1 = com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 89398(0x15d36, float:1.25273E-40)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0081
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r15] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f76285a
            r3 = 0
            r4 = 89398(0x15d36, float:1.25273E-40)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.support.v4.view.ViewPager> r1 = android.support.v4.view.ViewPager.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.views.l> r1 = com.ss.android.ugc.aweme.views.l.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$a> r1 = com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0081:
            com.facebook.common.internal.Preconditions.checkNotNull(r18)
            android.support.v4.view.PagerAdapter r0 = r18.getAdapter()
            com.facebook.common.internal.Preconditions.checkNotNull(r0)
            com.facebook.common.internal.Preconditions.checkNotNull(r19)
            r7.j = r8
            android.support.v4.view.PagerAdapter r14 = r18.getAdapter()
            int r15 = r14.getCount()
            if (r15 > 0) goto L_0x009b
            return
        L_0x009b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.n = r0
            android.view.View r0 = r7.f76286b
            if (r0 == 0) goto L_0x00ad
            android.widget.FrameLayout r0 = r7.o
            android.view.View r1 = r7.f76286b
            r0.removeView(r1)
        L_0x00ad:
            int r0 = r17.getAllTabWidth()
            if (r0 >= 0) goto L_0x00b8
            int r0 = r17.getMeasuredWidth()
            goto L_0x00bc
        L_0x00b8:
            int r0 = r17.getAllTabWidth()
        L_0x00bc:
            if (r0 <= 0) goto L_0x00c0
            if (r22 == 0) goto L_0x00c8
        L_0x00c0:
            android.content.Context r0 = r17.getContext()
            int r0 = com.ss.android.ugc.aweme.base.utils.p.c(r0)
        L_0x00c8:
            int r1 = r0 / r15
            r7.f76288d = r1
            r1 = -1
            if (r15 <= r11) goto L_0x00e7
            android.content.Context r2 = r17.getContext()
            int r2 = r9.b(r2)
            if (r2 <= 0) goto L_0x00e7
            int r2 = r2 * r15
            if (r0 >= r2) goto L_0x00e7
            float r0 = (float) r0
            r2 = 1083179008(0x40900000, float:4.5)
            float r0 = r0 / r2
            int r0 = (int) r0
            r7.f76288d = r0
            r7.i = r12
            goto L_0x00e8
        L_0x00e7:
            r0 = -1
        L_0x00e8:
            if (r0 != r1) goto L_0x00ec
            int r0 = r7.f76288d
        L_0x00ec:
            r11 = r0
            android.content.Context r0 = r17.getContext()
            int r1 = r7.f76288d
            android.view.View r0 = r9.a(r0, r1)
            r7.f76286b = r0
            android.view.View r0 = r7.f76286b
            if (r0 == 0) goto L_0x0104
            android.widget.FrameLayout r0 = r7.o
            android.view.View r1 = r7.f76286b
            r0.addView(r1, r12)
        L_0x0104:
            android.widget.LinearLayout r0 = r7.f76287c
            r0.removeAllViews()
            r6 = 0
        L_0x010a:
            if (r6 >= r15) goto L_0x0154
            android.content.Context r1 = r17.getContext()
            android.widget.LinearLayout r2 = r7.f76287c
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$1 r5 = new com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$1
            r5.<init>(r10, r6, r8)
            r0 = r19
            r3 = r14
            r4 = r6
            r16 = r5
            r5 = r11
            r13 = r6
            r6 = r16
            android.view.View r0 = r0.a(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0137
            android.widget.LinearLayout r1 = r7.f76287c
            r1.addView(r0)
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x0137
            java.util.List<android.view.View> r1 = r7.n
            r1.add(r0)
        L_0x0137:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0150
            int r0 = r15 + -1
            if (r13 >= r0) goto L_0x0150
            android.content.Context r0 = r17.getContext()
            android.view.View r0 = r9.a(r0)
            if (r0 == 0) goto L_0x0150
            android.widget.LinearLayout r1 = r7.f76287c
            r1.addView(r0)
        L_0x0150:
            int r6 = r13 + 1
            r13 = 1
            goto L_0x010a
        L_0x0154:
            r0 = r21
            android.view.View r1 = r7.a(r0)
            if (r1 != 0) goto L_0x0161
            android.view.View r1 = r7.a(r12)
            goto L_0x0162
        L_0x0161:
            r12 = r0
        L_0x0162:
            if (r1 == 0) goto L_0x017b
            r7.f76289e = r1
            r0 = 1
            r1.setSelected(r0)
            if (r10 == 0) goto L_0x016f
            r10.a(r1, r12, r0)
        L_0x016f:
            if (r12 <= 0) goto L_0x017b
            android.view.View r0 = r7.f76286b
            int r1 = r7.f76288d
            int r1 = r1 * r12
            float r1 = (float) r1
            r0.setTranslationX(r1)
        L_0x017b:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0195
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x0195
            android.content.Context r0 = r17.getContext()
            android.view.View r0 = r9.a(r0)
            if (r0 == 0) goto L_0x0192
            r7.addView(r0)
        L_0x0192:
            r0 = 1
            r7.m = r0
        L_0x0195:
            r7.a((android.support.v4.view.ViewPager) r8, (com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a) r10, (int) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator.a(android.support.v4.view.ViewPager, com.ss.android.ugc.aweme.views.l, com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator$a, int, boolean):void");
    }
}
