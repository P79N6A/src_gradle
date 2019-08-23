package com.ss.android.ugc.aweme.im.sdk.utils;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52458a;

    public static void a(View view, String str) {
        View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, str2}, null, f52458a, true, 53309, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, str2}, null, f52458a, true, 53309, new Class[]{View.class, String.class}, Void.TYPE);
        } else if (view2 != null && str2 != null) {
            ViewCompat.setAccessibilityDelegate(view2, new AccessibilityUtils$1(str2));
        }
    }

    public static void a(ImageView imageView, IMUser iMUser) {
        ImageView imageView2 = imageView;
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{imageView2, iMUser2}, null, f52458a, true, 53310, new Class[]{ImageView.class, IMUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, iMUser2}, null, f52458a, true, 53310, new Class[]{ImageView.class, IMUser.class}, Void.TYPE);
        } else if (imageView2 != null && iMUser2 != null) {
            ViewCompat.setAccessibilityDelegate(imageView2, new AccessibilityUtils$2(iMUser2));
        }
    }
}
