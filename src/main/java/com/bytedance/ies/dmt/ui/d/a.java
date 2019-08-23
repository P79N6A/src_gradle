package com.bytedance.ies.dmt.ui.d;

import android.content.Context;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.d;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.utils.ep;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f2274a;

    /* renamed from: b  reason: collision with root package name */
    private int f2275b;

    /* renamed from: c  reason: collision with root package name */
    private int f2276c;

    /* renamed from: d  reason: collision with root package name */
    private int f2277d;

    /* renamed from: e  reason: collision with root package name */
    private String f2278e;

    /* renamed from: f  reason: collision with root package name */
    private Context f2279f;

    public static a c(Context context, String str) {
        return b.a(context, str);
    }

    public final void a() {
        try {
            if (this.f2279f != null && !TextUtils.isEmpty(this.f2278e) && ToolUtils.isApplicationForeground(this.f2279f, this.f2279f.getPackageName())) {
                if (d.a().f20315b) {
                    if (this.f2277d == 1) {
                        c.a(this.f2279f).a(this.f2278e, this.f2274a, this.f2275b, this.f2276c);
                    } else if (this.f2277d == 2) {
                        c.a(this.f2279f).b(this.f2278e, this.f2274a, this.f2275b, this.f2276c);
                    } else if (this.f2277d == 3) {
                        c.a(this.f2279f).c(this.f2278e, this.f2274a, this.f2275b, this.f2276c);
                    }
                    return;
                }
                UIUtils.displayToast(this.f2279f, this.f2278e);
            }
        } catch (Exception unused) {
        }
    }

    public static a d(Context context, String str) {
        return c(context, str, 1, 1);
    }

    public static a a(Context context, int i) {
        if (ep.a(context)) {
            Context context2 = context;
            a aVar = new a(context2, context.getString(i), 1, 1, 2, (int) UIUtils.dip2Px(context, 12.0f));
            return aVar;
        } else if (ep.b(context)) {
            return a(context, i, 1, 2);
        } else {
            return a(context, context.getString(i), 1, 1);
        }
    }

    public static a b(Context context, int i) {
        if (ep.a(context)) {
            Context context2 = context;
            a aVar = new a(context2, context.getString(i), 1, 2, 2, (int) UIUtils.dip2Px(context, 12.0f));
            return aVar;
        } else if (ep.b(context)) {
            return b(context, i, 1, 2);
        } else {
            return b(context, context.getString(i), 1, 1);
        }
    }

    public static a c(Context context, int i) {
        if (ep.a(context)) {
            Context context2 = context;
            a aVar = new a(context2, context.getString(i), 1, 3, 2, (int) UIUtils.dip2Px(context, 12.0f));
            return aVar;
        } else if (ep.b(context)) {
            return c(context, i, 1, 2);
        } else {
            return c(context, context.getString(i), 1, 1);
        }
    }

    public static a a(Context context, String str) {
        if (ep.a(context)) {
            a aVar = new a(context, str, 1, 1, 2, (int) UIUtils.dip2Px(context, 12.0f));
            return aVar;
        } else if (ep.b(context)) {
            return a(context, str, 1, 2);
        } else {
            return a(context, str, 1, 1);
        }
    }

    public static a b(Context context, String str) {
        if (ep.a(context)) {
            a aVar = new a(context, str, 1, 2, 2, (int) UIUtils.dip2Px(context, 12.0f));
            return aVar;
        } else if (ep.b(context)) {
            return b(context, str, 1, 2);
        } else {
            return b(context, str, 1, 1);
        }
    }

    public static a a(Context context, @StringRes int i, int i2) {
        return a(context, i, i2, 1);
    }

    public static a b(Context context, @StringRes int i, int i2) {
        return b(context, i, i2, 1);
    }

    public static a c(Context context, @StringRes int i, int i2) {
        return c(context, i, i2, 1);
    }

    public static a a(Context context, String str, int i) {
        return a(context, str, i, 1);
    }

    public static a b(Context context, String str, int i) {
        return b(context, str, i, 1);
    }

    public static a c(Context context, String str, int i) {
        return c(context, str, 0, 1);
    }

    public static a a(Context context, @StringRes int i, int i2, int i3) {
        a aVar = new a(context, context.getString(i), i2, 1, i3, 0);
        return aVar;
    }

    public static a b(Context context, @StringRes int i, int i2, int i3) {
        a aVar = new a(context, context.getString(i), i2, 2, i3, 0);
        return aVar;
    }

    public static a c(Context context, @StringRes int i, int i2, int i3) {
        a aVar = new a(context, context.getString(i), i2, 3, i3, 0);
        return aVar;
    }

    public static a a(Context context, String str, int i, int i2) {
        a aVar = new a(context, str, i, 1, i2, 0);
        return aVar;
    }

    public static a b(Context context, String str, int i, int i2) {
        a aVar = new a(context, str, i, 2, i2, 0);
        return aVar;
    }

    public static a c(Context context, String str, int i, int i2) {
        a aVar = new a(context, str, i, 3, i2, 0);
        return aVar;
    }

    public static a a(Context context, String str, int i, int i2, int i3) {
        a aVar = new a(context, str, 1, 3, 2, i3);
        return aVar;
    }

    private a(Context context, String str, int i, int i2, int i3, int i4) {
        this.f2278e = str;
        this.f2274a = i;
        this.f2277d = i2;
        this.f2279f = context;
        this.f2275b = i3;
        this.f2276c = i4;
    }
}
