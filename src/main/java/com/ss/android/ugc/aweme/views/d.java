package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;

public class d implements l {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f76459c;

    public final int b(Context context) {
        return -1;
    }

    public View a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f76459c, false, 89443, new Class[]{Context.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2}, this, f76459c, false, 89443, new Class[]{Context.class}, View.class);
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(u.a(1.0d), u.a(16.0d));
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(context.getResources().getColor(C0906R.color.a0i));
        return view;
    }

    public View a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f76459c, false, 89442, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f76459c, false, 89442, new Class[]{Context.class, Integer.TYPE}, View.class);
        }
        View view = new View(context2);
        view.setBackgroundColor(context.getResources().getColor(C0906R.color.a1s));
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

    public View a(Context context, ViewGroup viewGroup, PagerAdapter pagerAdapter, int i, int i2, View.OnClickListener onClickListener) {
        LinearLayout.LayoutParams layoutParams;
        Context context2 = context;
        int i3 = i2;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f76459c, false, 89441, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class)) {
            Object[] objArr = {context2, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2};
            return (View) PatchProxy.accessDispatch(objArr, this, f76459c, false, 89441, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class);
        }
        String valueOf = String.valueOf(pagerAdapter.getPageTitle(i));
        DmtTextView dmtTextView = new DmtTextView(context2);
        if (i3 > 0) {
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
        }
        dmtTextView.setLayoutParams(layoutParams);
        dmtTextView.setGravity(17);
        dmtTextView.setText(valueOf);
        dmtTextView.setBackgroundColor(context.getResources().getColor(C0906R.color.ano));
        dmtTextView.setTextColor(context.getResources().getColorStateList(C0906R.color.jo));
        dmtTextView.setOnClickListener(onClickListener2);
        return dmtTextView;
    }
}
