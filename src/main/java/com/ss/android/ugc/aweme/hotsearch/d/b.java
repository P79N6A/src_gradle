package com.ss.android.ugc.aweme.hotsearch.d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.hotsearch.a.d;
import com.ss.android.ugc.bytex.a.a.a;
import com.taobao.android.dexposed.ClassUtils;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49723a;

    /* renamed from: b  reason: collision with root package name */
    public static int[] f49724b = {2130838551, 2130838552, 2130838553};

    public static void a(TextView textView, String str) {
        long j;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, str}, null, f49723a, true, 49812, new Class[]{TextView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str}, null, f49723a, true, 49812, new Class[]{TextView.class, String.class}, Void.TYPE);
            return;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        textView2.setText(com.ss.android.ugc.aweme.i18n.b.a(j));
    }

    public static void b(Context context, TextView textView, int i) {
        Drawable drawable;
        TextView textView2 = textView;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context, textView2, Integer.valueOf(i)}, null, f49723a, true, 49810, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, textView2, Integer.valueOf(i)}, null, f49723a, true, 49810, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 <= 0 || i2 > d.f49650a.length) {
            drawable = null;
        } else {
            drawable = a.a(context.getResources(), d.f49650a[i2 - 1]);
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
    }

    public static void a(Context context, TextView textView, int i) {
        int i2;
        TextView textView2 = textView;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{context, textView2, Integer.valueOf(i)}, null, f49723a, true, 49809, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, textView2, Integer.valueOf(i)}, null, f49723a, true, 49809, new Class[]{Context.class, TextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 < 3) {
            i2 = C0906R.color.a1t;
        } else {
            i2 = C0906R.color.a0b;
        }
        textView2.setTextColor(context.getResources().getColor(i2));
        textView2.setText(context.getResources().getString(C0906R.string.bjc, new Object[]{Integer.valueOf(i3 + 1)}));
    }

    public static void a(TextView textView, ImageView imageView, int i) {
        TextView textView2 = textView;
        ImageView imageView2 = imageView;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{textView2, imageView2, Integer.valueOf(i)}, null, f49723a, true, 49807, new Class[]{TextView.class, ImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, imageView2, Integer.valueOf(i)}, null, f49723a, true, 49807, new Class[]{TextView.class, ImageView.class, Integer.TYPE}, Void.TYPE);
        } else if (textView2 != null) {
            if (i2 < 0 || i2 >= 3) {
                textView2.setText((i2 + 1) + ClassUtils.PACKAGE_SEPARATOR);
                imageView2.setVisibility(8);
                textView2.setVisibility(0);
                return;
            }
            imageView2.setImageResource(f49724b[i2]);
            imageView2.setVisibility(0);
            textView2.setVisibility(8);
        }
    }

    public static void a(RemoteImageView remoteImageView, boolean z, boolean z2, int i) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i)}, null, f49723a, true, 49808, new Class[]{RemoteImageView.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i)}, null, f49723a, true, 49808, new Class[]{RemoteImageView.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (remoteImageView2 != null) {
            if (z) {
                remoteImageView2.setVisibility(0);
                if (z2 || i > 0) {
                    c.a(remoteImageView2, 2130839254);
                } else if (i < 0) {
                    c.a(remoteImageView2, 2130839252);
                } else {
                    c.a(remoteImageView2, 2130839253);
                }
            } else {
                remoteImageView2.setVisibility(8);
            }
        }
    }
}
