package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.profile.a;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61540a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f61541b;

    /* renamed from: c  reason: collision with root package name */
    private final VerticalViewPager f61542c;

    /* renamed from: d  reason: collision with root package name */
    private final View f61543d;

    /* renamed from: e  reason: collision with root package name */
    private final View f61544e;

    /* renamed from: f  reason: collision with root package name */
    private final DisplayMetrics f61545f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final a.b l;

    g(Activity activity, VerticalViewPager verticalViewPager, View view, View view2, DisplayMetrics displayMetrics, boolean z, int i2, int i3, int i4, int i5, a.b bVar) {
        this.f61541b = activity;
        this.f61542c = verticalViewPager;
        this.f61543d = view;
        this.f61544e = view2;
        this.f61545f = displayMetrics;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b1 A[LOOP:0: B:99:0x02ab->B:101:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r7 = r28
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f61540a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 67234(0x106a2, float:9.4215E-41)
            r1 = r28
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f61540a
            r3 = 0
            r4 = 67234(0x106a2, float:9.4215E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r28
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            android.app.Activity r0 = r7.f61541b
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r7.f61542c
            android.view.View r2 = r7.f61543d
            android.view.View r3 = r7.f61544e
            android.util.DisplayMetrics r4 = r7.f61545f
            boolean r5 = r7.g
            int r6 = r7.h
            int r9 = r7.i
            int r10 = r7.j
            int r11 = r7.k
            com.ss.android.ugc.aweme.profile.a$b r12 = r7.l
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x02cc
            if (r1 == 0) goto L_0x02cc
            if (r2 == 0) goto L_0x02cc
            if (r3 != 0) goto L_0x004d
            goto L_0x02cc
        L_0x004d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r0 < r13) goto L_0x0058
            android.view.WindowInsets r0 = r1.getRootWindowInsets()
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r13 = 1
            if (r0 == 0) goto L_0x007e
            int r15 = android.os.Build.VERSION.SDK_INT
            r14 = 20
            if (r15 < r14) goto L_0x0071
            java.lang.Class<android.view.WindowInsets> r14 = android.view.WindowInsets.class
            java.lang.String r15 = "getDisplayCutout"
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r8] = r0
            java.lang.Object r14 = com.bytedance.common.utility.reflect.ReflectUtils.invokeMethod(r14, r15, r7)
            r16 = r14
            goto L_0x0073
        L_0x0071:
            r16 = 0
        L_0x0073:
            com.ss.android.ugc.aweme.profile.a r0 = com.ss.android.ugc.aweme.profile.a.a()
            if (r16 == 0) goto L_0x007b
            r7 = 1
            goto L_0x007c
        L_0x007b:
            r7 = 0
        L_0x007c:
            r0.m = r7
        L_0x007e:
            int r0 = r4.heightPixels
            com.ss.android.ugc.aweme.profile.a r7 = com.ss.android.ugc.aweme.profile.a.a()
            boolean r7 = r7.m
            if (r7 == 0) goto L_0x0099
            boolean r7 = com.ss.android.common.util.ToolUtils.isMiui()
            if (r7 != 0) goto L_0x0099
            boolean r7 = com.ss.android.common.util.ToolUtils.isHuaweiDevice()
            if (r7 != 0) goto L_0x0099
            int r7 = com.ss.android.ugc.aweme.base.utils.p.c()
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            int r0 = r0 + r7
            int r7 = r4.widthPixels
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            int r15 = r1.getHeight()
            r14.g = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            r14.h = r5
            com.ss.android.ugc.aweme.profile.a r5 = com.ss.android.ugc.aweme.profile.a.a()
            r5.f61218d = r6
            int r5 = r0 - r6
            double r14 = (double) r5
            r18 = r0
            r17 = r1
            double r0 = (double) r9
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r0)
            double r0 = r14 - r0
            r19 = r9
            double r8 = (double) r10
            java.lang.Double.isNaN(r8)
            double r20 = r0 - r8
            r22 = r14
            double r13 = (double) r7
            java.lang.Double.isNaN(r13)
            r24 = r4
            double r4 = r20 / r13
            java.lang.Double.isNaN(r13)
            double r0 = r0 / r13
            java.lang.Double.isNaN(r22)
            java.lang.Double.isNaN(r8)
            double r7 = r22 - r8
            java.lang.Double.isNaN(r13)
            double r7 = r7 / r13
            com.ss.android.ugc.aweme.profile.a r9 = com.ss.android.ugc.aweme.profile.a.a()
            r9.f61219e = r11
            r15 = 0
            r20 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            if (r6 <= 0) goto L_0x0130
            java.lang.Double.isNaN(r22)
            java.lang.Double.isNaN(r13)
            double r13 = r22 / r13
            int r9 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x0107
            java.lang.String r9 = "G"
        L_0x0102:
            r13 = r9
            r9 = 0
        L_0x0104:
            r11 = 0
            goto L_0x0163
        L_0x0107:
            int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x010e
            java.lang.String r9 = "D"
            goto L_0x0136
        L_0x010e:
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x0119
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x0119
            java.lang.String r9 = "G"
            goto L_0x0102
        L_0x0119:
            r9 = 0
            double r13 = r7 - r20
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x012d
            double r20 = r0 - r20
            int r9 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x012a
            int r9 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x012d
        L_0x012a:
            java.lang.String r9 = "E"
            goto L_0x0159
        L_0x012d:
            java.lang.String r9 = "F"
            goto L_0x015f
        L_0x0130:
            int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x013b
            java.lang.String r9 = "A"
        L_0x0136:
            r13 = r9
            r11 = r10
            r9 = r19
            goto L_0x0163
        L_0x013b:
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x0146
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x0146
            java.lang.String r9 = "默认"
            goto L_0x0102
        L_0x0146:
            r9 = 0
            double r13 = r7 - r20
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x015d
            double r20 = r0 - r20
            int r9 = (r20 > r15 ? 1 : (r20 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x0157
            int r9 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x015d
        L_0x0157:
            java.lang.String r9 = "B"
        L_0x0159:
            r13 = r9
            r11 = r10
            r9 = 0
            goto L_0x0163
        L_0x015d:
            java.lang.String r9 = "C"
        L_0x015f:
            r13 = r9
            r9 = r19
            goto L_0x0104
        L_0x0163:
            com.ss.android.ugc.aweme.profile.a.j = r9
            com.ss.android.ugc.aweme.profile.a.k = r11
            int r14 = r3.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x0170
            r9 = 0
        L_0x0170:
            int r14 = r2.getVisibility()
            if (r14 != r15) goto L_0x0177
            r11 = 0
        L_0x0177:
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            if (r9 == 0) goto L_0x017f
            r15 = 1
            goto L_0x0180
        L_0x017f:
            r15 = 0
        L_0x0180:
            r14.n = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            if (r11 == 0) goto L_0x018a
            r15 = 1
            goto L_0x018b
        L_0x018a:
            r15 = 0
        L_0x018b:
            r14.o = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            if (r11 == 0) goto L_0x0195
            r15 = 1
            goto L_0x0196
        L_0x0195:
            r15 = 0
        L_0x0196:
            r14.l = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            r25 = r7
            r7 = r22
            int r15 = (int) r7
            int r15 = r15 - r9
            int r15 = r15 - r11
            r14.g = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            com.ss.android.ugc.aweme.story.api.model.a r14 = r14.i
            r15 = 1
            r14.f71845a = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            com.ss.android.ugc.aweme.story.api.model.a r14 = r14.i
            r15 = r19
            r14.f71846b = r15
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            com.ss.android.ugc.aweme.story.api.model.a r14 = r14.i
            r14.f71847c = r11
            com.ss.android.ugc.aweme.profile.a r14 = com.ss.android.ugc.aweme.profile.a.a()
            com.ss.android.ugc.aweme.story.api.model.a r14 = r14.i
            r14.f71848d = r6
            android.view.ViewGroup$LayoutParams r14 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            r27 = r12
            int r12 = r14.height
            if (r12 == r9) goto L_0x01d9
            r14.height = r9
            r3.setLayoutParams(r14)
        L_0x01d9:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            int r12 = r3.height
            if (r12 == r11) goto L_0x01e8
            r3.height = r11
            r2.setLayoutParams(r3)
        L_0x01e8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "doAdaptationV2: , realDisplayMetrics.heightPixels:"
            r2.<init>(r3)
            r3 = r24
            int r3 = r3.heightPixels
            r2.append(r3)
            java.lang.String r3 = ", isAndroidPHasNotch():"
            r2.append(r3)
            com.ss.android.ugc.aweme.profile.a r3 = com.ss.android.ugc.aweme.profile.a.a()
            boolean r3 = r3.m
            r2.append(r3)
            java.lang.String r3 = ", statusBarHeight:"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ", realScreenHeight:"
            r2.append(r3)
            r3 = r18
            r2.append(r3)
            java.lang.String r3 = ", virtualBarHeight:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", appNavHeight:"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = ", screenHeightWithoutVirtualBar:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", ViewPagerHeight:"
            r2.append(r3)
            com.ss.android.ugc.aweme.profile.a r3 = com.ss.android.ugc.aweme.profile.a.a()
            int r3 = r3.g
            r2.append(r3)
            java.lang.String r3 = ", topSpaceHeight:"
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", bottomSpaceHeight:"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = ", desiredTopSpaceHeight:"
            r2.append(r3)
            int r3 = com.ss.android.ugc.aweme.profile.a.j
            r2.append(r3)
            java.lang.String r3 = ", desiredBottomSpaceHeight:"
            r2.append(r3)
            int r3 = com.ss.android.ugc.aweme.profile.a.k
            r2.append(r3)
            java.lang.String r3 = ", showTopCorner:"
            r2.append(r3)
            com.ss.android.ugc.aweme.profile.a r3 = com.ss.android.ugc.aweme.profile.a.a()
            boolean r3 = r3.n
            r2.append(r3)
            java.lang.String r3 = ", showBottomCorner:"
            r2.append(r3)
            com.ss.android.ugc.aweme.profile.a r3 = com.ss.android.ugc.aweme.profile.a.a()
            boolean r3 = r3.o
            r2.append(r3)
            java.lang.String r3 = ", 方案"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ", 减去两个栏的比例:"
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ", 只减状态栏的比例:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ", 只减DMT菜单栏的比例:"
            r3.append(r0)
            r7 = r25
            r3.append(r7)
            r0 = 0
        L_0x02ab:
            int r1 = r17.getChildCount()
            if (r0 >= r1) goto L_0x02c6
            r1 = r17
            android.view.View r2 = r1.getChildAt(r0)
            r3 = 2131166692(0x7f0705e4, float:1.7947637E38)
            java.lang.Object r2 = r2.getTag(r3)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r2 = (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r2
            r2.i()
            int r0 = r0 + 1
            goto L_0x02ab
        L_0x02c6:
            if (r27 == 0) goto L_0x02cb
            r27.a()
        L_0x02cb:
            return
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.g.run():void");
    }
}
