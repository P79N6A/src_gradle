package com.bytedance.android.live.uikit.c;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8495a;

    private static int a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f8495a, true, 2312, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f8495a, true, 2312, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    private static View b(Activity activity, int i) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i)}, null, f8495a, true, 2311, new Class[]{Activity.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i)}, null, f8495a, true, 2311, new Class[]{Activity.class, Integer.TYPE}, View.class);
        }
        View view = new View(activity2);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a(activity)));
        view.setBackgroundColor(i);
        return view;
    }

    public static void a(Activity activity, int i) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i)}, null, f8495a, true, 2307, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i)}, null, f8495a, true, 2307, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(b(activity, i));
            ViewGroup viewGroup = (ViewGroup) activity2.findViewById(16908290);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            viewGroup2.setFitsSystemWindows(true);
            viewGroup2.setClipToPadding(true);
        }
    }
}
