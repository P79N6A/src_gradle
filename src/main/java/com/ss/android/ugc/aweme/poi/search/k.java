package com.ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.hotsearch.a.c;
import com.ss.android.ugc.aweme.views.l;

public final class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60348a;

    public final View a(Context context) {
        return null;
    }

    public final int b(Context context) {
        return -1;
    }

    public final View a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f60348a, false, 65747, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f60348a, false, 65747, new Class[]{Context.class, Integer.TYPE}, View.class);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, u.a(2.0d));
        int dip2Px = (int) UIUtils.dip2Px(context2, 16.0f);
        int i2 = dip2Px / 2;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i2);
        }
        layoutParams.width -= dip2Px;
        layoutParams.gravity = 8388691;
        view.setBackgroundColor(context.getResources().getColor(C0906R.color.zo));
        view.setLayoutParams(layoutParams);
        return view;
    }

    public final View a(Context context, ViewGroup viewGroup, PagerAdapter pagerAdapter, int i, int i2, View.OnClickListener onClickListener) {
        LinearLayout.LayoutParams layoutParams;
        Context context2 = context;
        int i3 = i2;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2}, this, f60348a, false, 65746, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class)) {
            Object[] objArr = {context2, viewGroup, pagerAdapter, Integer.valueOf(i), Integer.valueOf(i2), onClickListener2};
            return (View) PatchProxy.accessDispatch(objArr, this, f60348a, false, 65746, new Class[]{Context.class, ViewGroup.class, PagerAdapter.class, Integer.TYPE, Integer.TYPE, View.OnClickListener.class}, View.class);
        }
        c cVar = new c(context2);
        if (i3 > 0) {
            layoutParams = new LinearLayout.LayoutParams(i3, -1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
        }
        cVar.setGravity(17);
        cVar.setLayoutParams(layoutParams);
        TextView title = cVar.getTitle();
        if (title != null) {
            title.setText(String.valueOf(pagerAdapter.getPageTitle(i)));
            title.setTextSize(1, 15.0f);
            title.setBackgroundColor(context.getResources().getColor(C0906R.color.ano));
            title.setTextColor(context.getResources().getColorStateList(C0906R.color.jo));
            cVar.setOnClickListener(onClickListener2);
        }
        return cVar;
    }
}
