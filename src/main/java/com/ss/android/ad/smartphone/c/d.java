package com.ss.android.ad.smartphone.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static e f22748a;

    /* renamed from: b  reason: collision with root package name */
    private static Handler f22749b = new Handler(Looper.getMainLooper());

    public static void a(Context context, @StringRes int i) {
        a(context, i, 0);
    }

    private static void a(Context context, @StringRes int i, @DrawableRes int i2) {
        a(context, i, 0, 1500);
    }

    private static void a(Context context, @StringRes int i, @DrawableRes int i2, int i3) {
        String str;
        Drawable drawable;
        if (context != null) {
            if (i > 0) {
                str = context.getString(i);
            } else {
                str = "";
            }
            if (i2 > 0) {
                drawable = a.a(context.getResources(), i2);
            } else {
                drawable = null;
            }
            a(context, str, drawable, 1500);
        }
    }

    private static void a(Context context, final String str, final Drawable drawable, final int i) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            f22749b.post(new Runnable() {
                public final void run() {
                    try {
                        if (d.f22748a != null) {
                            d.f22748a.cancel();
                        }
                        Context context = applicationContext;
                        String str = str;
                        int i = i;
                        e eVar = new e(context);
                        View inflate = View.inflate(context, C0906R.layout.ad6, null);
                        inflate.setBackgroundResource(2130840544);
                        int i2 = 8;
                        inflate.findViewById(C0906R.id.aq8).setVisibility(8);
                        eVar.setView(inflate);
                        ((TextView) inflate.findViewById(C0906R.id.text)).setText(str);
                        eVar.setDuration(i);
                        d.f22748a = eVar;
                        eVar.a(17);
                        e eVar2 = d.f22748a;
                        Drawable drawable = drawable;
                        View view = eVar2.getView();
                        if (view != null) {
                            ImageView imageView = (ImageView) view.findViewById(C0906R.id.aq8);
                            if (imageView != null) {
                                imageView.setImageDrawable(drawable);
                                if (drawable != null) {
                                    i2 = 0;
                                }
                                imageView.setVisibility(i2);
                                d.f22748a.show();
                                return;
                            }
                            throw new RuntimeException("This Toast was not created with Toast.makeText()");
                        }
                        throw new RuntimeException("This Toast was not created with Toast.makeText()");
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
