package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.VectorDrawableCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39739a;

    public static Drawable a(Resources resources, @DrawableRes int i) {
        Resources resources2 = resources;
        if (!PatchProxy.isSupport(new Object[]{resources2, 2130840356}, null, f39739a, true, 32675, new Class[]{Resources.class, Integer.TYPE}, Drawable.class)) {
            return a(resources2, 2130840356, null);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[]{resources2, 2130840356}, null, f39739a, true, 32675, new Class[]{Resources.class, Integer.TYPE}, Drawable.class);
    }

    private static Drawable a(Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        Resources resources2 = resources;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{resources2, Integer.valueOf(i), null}, null, f39739a, true, 32676, new Class[]{Resources.class, Integer.TYPE, Resources.Theme.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{resources2, Integer.valueOf(i), null}, null, f39739a, true, 32676, new Class[]{Resources.class, Integer.TYPE, Resources.Theme.class}, Drawable.class);
        } else if (Build.VERSION.SDK_INT > 21) {
            return resources2.getDrawable(i2, null);
        } else {
            try {
                return VectorDrawableCompat.create(resources2, i2, null);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
    }
}
