package com.ss.android.ugc.aweme.utils;

import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public final class eh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75820a;

    public static void a(ImageView imageView, boolean z) {
        ImageView imageView2 = imageView;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{imageView2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75820a, true, 88612, new Class[]{ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, Byte.valueOf(z)}, null, f75820a, true, 88612, new Class[]{ImageView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            i = 3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        marginLayoutParams.leftMargin = u.a((double) i);
        imageView2.setLayoutParams(marginLayoutParams);
    }

    public static String a(@NonNull TextPaint textPaint, float f2, String str) {
        double d2;
        TextPaint textPaint2 = textPaint;
        float f3 = f2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textPaint2, Float.valueOf(f2), str2}, null, f75820a, true, 88611, new Class[]{TextPaint.class, Float.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{textPaint2, Float.valueOf(f2), str2}, null, f75820a, true, 88611, new Class[]{TextPaint.class, Float.TYPE, String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if (f3 <= 0.0f) {
                d2 = 200.0d;
            } else {
                d2 = (double) f3;
            }
            CharSequence ellipsize = TextUtils.ellipsize(str2, textPaint2, (float) u.a(d2), TextUtils.TruncateAt.END);
            if (ellipsize != null) {
                return ellipsize.toString();
            }
            return "";
        }
    }
}
