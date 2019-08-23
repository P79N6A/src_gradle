package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52477a;

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f52477a, true, 53678, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f52477a, true, 53678, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        ((ClipboardManager) context2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy_im_label", str2));
    }

    public static int[] a(View view, View view2) {
        boolean z;
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4}, null, f52477a, true, 53677, new Class[]{View.class, View.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{view3, view4}, null, f52477a, true, 53677, new Class[]{View.class, View.class}, int[].class);
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view3.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int screenHeight = UIUtils.getScreenHeight(view.getContext());
        int screenWidth = UIUtils.getScreenWidth(view.getContext());
        view4.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (screenHeight / 2 < iArr2[1]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[1] = iArr2[1] + height;
        }
        iArr[0] = (screenWidth - measuredWidth) / 2;
        return iArr;
    }

    public static PopupWindow a(Context context, @LayoutRes int i, View view) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(C0906R.layout.rx), view}, null, f52477a, true, 53676, new Class[]{Context.class, Integer.TYPE, View.class}, PopupWindow.class)) {
            return (PopupWindow) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(C0906R.layout.rx), view}, null, f52477a, true, 53676, new Class[]{Context.class, Integer.TYPE, View.class}, PopupWindow.class);
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.rx, null);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setWidth((int) UIUtils.dip2Px(context2, 100.0f));
        popupWindow.setAnimationStyle(C0906R.style.g1);
        popupWindow.setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(C0906R.color.co)));
        popupWindow.setContentView(inflate);
        popupWindow.setTouchable(true);
        return popupWindow;
    }
}
