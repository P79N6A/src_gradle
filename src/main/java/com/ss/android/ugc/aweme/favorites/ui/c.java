package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.views.l;

public final class c implements l<FragmentPagerAdapter> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44362a;

    public final View a(Context context) {
        return null;
    }

    public final int b(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f44362a, false, 39674, new Class[]{Context.class}, Integer.TYPE)) {
            return b.a(context2, 84.5f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f44362a, false, 39674, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public final View a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f44362a, false, 39673, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f44362a, false, 39673, new Class[]{Context.class, Integer.TYPE}, View.class);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, u.a(2.0d));
        layoutParams.gravity = 8388691;
        view.setBackgroundColor(context.getResources().getColor(C0906R.color.zo));
        view.setLayoutParams(layoutParams);
        return view;
    }

    public final /* synthetic */ View a(Context context, ViewGroup viewGroup, PagerAdapter pagerAdapter, int i, int i2, View.OnClickListener onClickListener) {
        LinearLayout.LayoutParams layoutParams;
        Context context2 = context;
        int i3 = i2;
        View.OnClickListener onClickListener2 = onClickListener;
        FragmentPagerAdapter fragmentPagerAdapter = (FragmentPagerAdapter) pagerAdapter;
        if (PatchProxy.isSupport(new Object[]{context2, viewGroup, fragmentPagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f44362a, false, 39672, new Class[]{Context.class, ViewGroup.class, FragmentPagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class)) {
            Object[] objArr = {context2, viewGroup, fragmentPagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2};
            return (View) PatchProxy.accessDispatch(objArr, this, f44362a, false, 39672, new Class[]{Context.class, ViewGroup.class, FragmentPagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class);
        }
        String valueOf = String.valueOf(fragmentPagerAdapter.getPageTitle(i));
        DmtTabTextView dmtTabTextView = new DmtTabTextView(context2);
        if (i3 > 0) {
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
        }
        dmtTabTextView.setLayoutParams(layoutParams);
        dmtTabTextView.setGravity(17);
        dmtTabTextView.setText(valueOf);
        dmtTabTextView.setTextSize(1, 15.0f);
        dmtTabTextView.setBackgroundColor(context.getResources().getColor(C0906R.color.ano));
        dmtTabTextView.setTextColor(context.getResources().getColorStateList(C0906R.color.jo));
        dmtTabTextView.setOnClickListener(onClickListener2);
        return dmtTabTextView;
    }
}
