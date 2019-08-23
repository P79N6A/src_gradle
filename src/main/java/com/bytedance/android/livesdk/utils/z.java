package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.WeakHashMap;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17650a = null;

    /* renamed from: b */
    public static final int c0m = 2130841097;

    /* renamed from: c */
    public static final int ca7 = 2130841585;

    /* renamed from: d  reason: collision with root package name */
    private static WeakHashMap<Integer, Bitmap> f17651d = new WeakHashMap<>();

    public static Bitmap a(Context context, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f17650a, true, 13703, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f17650a, true, 13703, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        Bitmap bitmap = f17651d.get(Integer.valueOf(i));
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        if (decodeResource == null) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i3, false);
        if (createScaledBitmap == null) {
            return null;
        }
        f17651d.put(Integer.valueOf(i), createScaledBitmap);
        return createScaledBitmap;
    }
}
