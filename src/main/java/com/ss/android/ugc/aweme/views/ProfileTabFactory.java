package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.profile.ui.ProfileTabView;

public final class ProfileTabFactory implements l<FragmentPagerAdapter> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76389a;
    @TabMode

    /* renamed from: b  reason: collision with root package name */
    public int f76390b;

    @interface TabMode {
    }

    public final int b(Context context) {
        return -1;
    }

    public final View a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f76389a, false, 89597, new Class[]{Context.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2}, this, f76389a, false, 89597, new Class[]{Context.class}, View.class);
        } else if (a.a()) {
            return null;
        } else {
            View view = new View(context2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(u.a(0.5d), u.a(16.0d));
            layoutParams.gravity = 16;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(context.getResources().getColor(C0906R.color.a0i));
            return view;
        }
    }

    private void a(View.OnClickListener onClickListener, ProfileTabView profileTabView) {
        View.OnClickListener onClickListener2 = onClickListener;
        ProfileTabView profileTabView2 = profileTabView;
        if (PatchProxy.isSupport(new Object[]{onClickListener2, profileTabView2}, this, f76389a, false, 89598, new Class[]{View.OnClickListener.class, ProfileTabView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2, profileTabView2}, this, f76389a, false, 89598, new Class[]{View.OnClickListener.class, ProfileTabView.class}, Void.TYPE);
            return;
        }
        if (onClickListener2 != null) {
            profileTabView2.setOnClickListener(onClickListener2);
        }
    }

    public final View a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f76389a, false, 89596, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f76389a, false, 89596, new Class[]{Context.class, Integer.TYPE}, View.class);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, u.a(2.5d));
        int dip2Px = (int) UIUtils.dip2Px(context2, 15.0f);
        int i2 = dip2Px / 2;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i2);
        }
        layoutParams.width -= dip2Px;
        layoutParams.gravity = 8388691;
        view.setBackgroundColor(context.getResources().getColor(C0906R.color.a1s));
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.profile.ui.ProfileTabView a(android.content.Context r24, int r25, android.view.ViewGroup r26, java.lang.String r27) {
        /*
            r23 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r24
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r13 = 1
            r5[r13] = r6
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f76389a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            r10[r14] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r15] = r6
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ProfileTabView> r11 = com.ss.android.ugc.aweme.profile.ui.ProfileTabView.class
            r8 = 0
            r9 = 89599(0x15dff, float:1.25555E-40)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0071
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r13] = r0
            r5[r14] = r2
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f76389a
            r19 = 0
            r20 = 89599(0x15dff, float:1.25555E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ProfileTabView> r22 = com.ss.android.ugc.aweme.profile.ui.ProfileTabView.class
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.ss.android.ugc.aweme.profile.ui.ProfileTabView r0 = (com.ss.android.ugc.aweme.profile.ui.ProfileTabView) r0
            return r0
        L_0x0071:
            r4 = 0
            if (r1 != r13) goto L_0x0089
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r24)
            r1 = 2131691557(0x7f0f0825, float:1.901219E38)
            android.view.View r0 = r0.inflate(r1, r2, r12)
            r4 = r0
            com.ss.android.ugc.aweme.profile.ui.ProfileTabView r4 = (com.ss.android.ugc.aweme.profile.ui.ProfileTabView) r4
            r4.setText(r3)
            r4.setAnimationEnabled(r13)
            goto L_0x009c
        L_0x0089:
            if (r1 != 0) goto L_0x009c
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r24)
            r1 = 2131691555(0x7f0f0823, float:1.9012185E38)
            android.view.View r0 = r0.inflate(r1, r2, r12)
            r4 = r0
            com.ss.android.ugc.aweme.profile.ui.ProfileTabView r4 = (com.ss.android.ugc.aweme.profile.ui.ProfileTabView) r4
            r4.setText(r3)
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.ProfileTabFactory.a(android.content.Context, int, android.view.ViewGroup, java.lang.String):com.ss.android.ugc.aweme.profile.ui.ProfileTabView");
    }

    public final /* synthetic */ View a(Context context, ViewGroup viewGroup, PagerAdapter pagerAdapter, int i, int i2, View.OnClickListener onClickListener) {
        ProfileTabView profileTabView;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        View.OnClickListener onClickListener2 = onClickListener;
        FragmentPagerAdapter fragmentPagerAdapter = (FragmentPagerAdapter) pagerAdapter;
        if (PatchProxy.isSupport(new Object[]{context2, viewGroup2, fragmentPagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f76389a, false, 89595, new Class[]{Context.class, ViewGroup.class, FragmentPagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, viewGroup2, fragmentPagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f76389a, false, 89595, new Class[]{Context.class, ViewGroup.class, FragmentPagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class);
        }
        int itemId = (int) fragmentPagerAdapter.getItemId(i);
        switch (itemId) {
            case 0:
                int i4 = this.f76390b;
                Resources a2 = o.a();
                int i5 = this.f76390b;
                profileTabView = a(context2, i4, viewGroup2, a2.getString(C0906R.string.du_));
                a(onClickListener2, profileTabView);
                break;
            case 1:
                int i6 = this.f76390b;
                Resources a3 = o.a();
                int i7 = this.f76390b;
                profileTabView = a(context2, i6, viewGroup2, a3.getString(C0906R.string.b5j));
                a(onClickListener2, profileTabView);
                break;
            case 2:
                if (a.a()) {
                    int i8 = this.f76390b;
                    Resources a4 = o.a();
                    int i9 = this.f76390b;
                    profileTabView = a(context2, i8, viewGroup2, a4.getString(C0906R.string.cg5));
                    a(onClickListener2, profileTabView);
                    profileTabView.setAnimationEnabled(true);
                    break;
                } else {
                    throw new IllegalArgumentException("unknown aweme list type: " + itemId);
                }
            case 3:
                profileTabView = a(context2, this.f76390b, viewGroup2, o.a().getString(C0906R.string.bee));
                a(onClickListener2, profileTabView);
                profileTabView.setSelected(true);
                break;
            case 5:
                int i10 = this.f76390b;
                Resources a5 = o.a();
                int i11 = this.f76390b;
                profileTabView = a(context2, i10, viewGroup2, a5.getString(C0906R.string.aej));
                a(onClickListener2, profileTabView);
                break;
            case 6:
                profileTabView = a(context2, this.f76390b, viewGroup2, o.a().getString(C0906R.string.cnk));
                a(onClickListener2, profileTabView);
                break;
            case e.l:
                profileTabView = a(context2, this.f76390b, viewGroup2, o.a().getString(C0906R.string.ab8));
                a(onClickListener2, profileTabView);
                profileTabView.setSelected(true);
                break;
            case 8:
                int i12 = this.f76390b;
                Resources a6 = o.a();
                int i13 = this.f76390b;
                profileTabView = a(context2, i12, viewGroup2, a6.getString(C0906R.string.brr));
                a(onClickListener2, profileTabView);
                break;
            default:
                throw new IllegalArgumentException("unknown aweme list type: " + itemId);
        }
        if (i3 > 0) {
            profileTabView.setLayoutParams(new LinearLayout.LayoutParams(i3, -1));
        }
        return profileTabView;
    }
}
