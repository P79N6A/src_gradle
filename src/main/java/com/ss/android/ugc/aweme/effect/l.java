package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.bytex.a.a.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43761a;

    public static void a(int i, ImageView imageView) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), imageView2}, null, f43761a, true, 38622, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), imageView2}, null, f43761a, true, 38622, new Class[]{Integer.TYPE, ImageView.class}, Void.TYPE);
            return;
        }
        Context context = imageView.getContext();
        switch (i) {
            case 0:
                imageView2.setImageDrawable(a.a(context.getResources(), 2130838645));
                return;
            case 1:
                imageView2.setImageDrawable(a.a(context.getResources(), 2130838646));
                return;
            case 2:
                imageView2.setImageDrawable(a.a(context.getResources(), 2130838647));
                return;
            case 3:
                imageView2.setImageDrawable(a.a(context.getResources(), 2130838648));
                break;
        }
    }
}
