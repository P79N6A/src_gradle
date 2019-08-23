package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68216a;

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i == 0 || i2 == 0) {
            return 1;
        }
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i4 > i || i5 > i2) {
            int i6 = i4 >> 1;
            int i7 = i5 >> 1;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    @Nullable
    private static BitmapDrawable a(Resources resources, int i, BitmapFactory.Options options) {
        Resources resources2 = resources;
        BitmapFactory.Options options2 = options;
        if (PatchProxy.isSupport(new Object[]{resources2, Integer.valueOf(i), options2}, null, f68216a, true, 77509, new Class[]{Resources.class, Integer.TYPE, BitmapFactory.Options.class}, BitmapDrawable.class)) {
            return (BitmapDrawable) PatchProxy.accessDispatch(new Object[]{resources2, Integer.valueOf(i), options2}, null, f68216a, true, 77509, new Class[]{Resources.class, Integer.TYPE, BitmapFactory.Options.class}, BitmapDrawable.class);
        }
        options2.inJustDecodeBounds = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(resources.openRawResource(i), null, options2);
            if (decodeStream != null) {
                return new BitmapDrawable(resources2, decodeStream);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Nullable
    private static BitmapDrawable a(Resources resources, String str, BitmapFactory.Options options) {
        Resources resources2 = resources;
        BitmapFactory.Options options2 = options;
        if (PatchProxy.isSupport(new Object[]{resources2, str, options2}, null, f68216a, true, 77507, new Class[]{Resources.class, String.class, BitmapFactory.Options.class}, BitmapDrawable.class)) {
            return (BitmapDrawable) PatchProxy.accessDispatch(new Object[]{resources2, str, options2}, null, f68216a, true, 77507, new Class[]{Resources.class, String.class, BitmapFactory.Options.class}, BitmapDrawable.class);
        }
        options2.inJustDecodeBounds = false;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile != null) {
                return new BitmapDrawable(resources2, decodeFile);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Nullable
    static BitmapDrawable a(Resources resources, @NonNull String str, int i, int i2, float f2, int i3, b bVar) {
        Resources resources2 = resources;
        String str2 = str;
        int i4 = i3;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{resources2, str2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), bVar2}, null, f68216a, true, 77506, new Class[]{Resources.class, String.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, b.class}, BitmapDrawable.class)) {
            return (BitmapDrawable) PatchProxy.accessDispatch(new Object[]{resources2, str2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), bVar2}, null, f68216a, true, 77506, new Class[]{Resources.class, String.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, b.class}, BitmapDrawable.class);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str2, options);
        options.inSampleSize = a(options, i, i2);
        if (f2 > 0.0f && i4 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i4) / f2);
            options.inTargetDensity = i4;
        }
        BitmapDrawable a2 = bVar2.a(str2);
        if (a2 != null) {
            return a2;
        }
        BitmapDrawable a3 = a(resources2, str2, options);
        if (a3 != null) {
            bVar2.a(str2, a3);
        }
        return a3;
    }

    @Nullable
    static BitmapDrawable a(Resources resources, int i, int i2, int i3, float f2, int i4, b bVar) {
        Resources resources2 = resources;
        int i5 = i4;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{resources2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), bVar2}, null, f68216a, true, 77508, new Class[]{Resources.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, b.class}, BitmapDrawable.class)) {
            return (BitmapDrawable) PatchProxy.accessDispatch(new Object[]{resources2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), bVar2}, null, f68216a, true, 77508, new Class[]{Resources.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, b.class}, BitmapDrawable.class);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(resources.openRawResource(i), null, options);
        options.inSampleSize = a(options, i2, i3);
        if (f2 > 0.0f && i5 > 0) {
            options.inScaled = true;
            options.inDensity = (int) (((float) i5) / f2);
            options.inTargetDensity = i5;
        }
        String resourceName = resources.getResourceName(i);
        BitmapDrawable a2 = bVar2.a(resourceName);
        if (a2 != null) {
            return a2;
        }
        BitmapDrawable a3 = a(resources2, i, options);
        if (a3 != null) {
            bVar2.a(resourceName, a3);
        }
        return a3;
    }
}
