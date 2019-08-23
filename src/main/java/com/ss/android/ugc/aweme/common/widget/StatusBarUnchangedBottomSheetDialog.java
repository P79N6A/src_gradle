package com.ss.android.ugc.aweme.common.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.util.DisplayMetrics;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Deprecated
public class StatusBarUnchangedBottomSheetDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40480a;

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f40480a, false, 33777, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f40480a, false, 33777, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Activity ownerActivity = getOwnerActivity();
        if (PatchProxy.isSupport(new Object[]{ownerActivity}, null, f40480a, true, 33778, new Class[]{Activity.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{ownerActivity}, null, f40480a, true, 33778, new Class[]{Activity.class}, Integer.TYPE)).intValue();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ownerActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, null, f40480a, true, 33779, new Class[]{Context.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, f40480a, true, 33779, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = resources.getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
        }
        int i3 = i - i2;
        Window window = getWindow();
        if (i3 == 0) {
            i3 = -1;
        }
        window.setLayout(-1, i3);
    }
}
