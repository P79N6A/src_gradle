package com.ss.android.ugc.bytex.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.LongSparseArray;
import com.ss.android.ugc.bytex.replacement.annotation.Replacement;
import java.lang.ref.WeakReference;
import java.util.HashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4322a = false;

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<Integer> f4323b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private static LongSparseArray<WeakReference<Drawable>> f4324c = new LongSparseArray<>();

    static {
        f4323b.add(2130840320);
        f4323b.add(2130839169);
        f4323b.add(2130838023);
        f4323b.add(2130838027);
        f4323b.add(2130841224);
        f4323b.add(2130838281);
        f4323b.add(2130838030);
        f4323b.add(2130838028);
        f4323b.add(2130838029);
        f4323b.add(2130838674);
        f4323b.add(2130840338);
        f4323b.add(2130838675);
        f4323b.add(2130840336);
        f4323b.add(2130840337);
        f4323b.add(2130838678);
        f4323b.add(2130838676);
        f4323b.add(2130838677);
        f4323b.add(2130839573);
        f4323b.add(2130840219);
        f4323b.add(2130841118);
        f4323b.add(2130839708);
        f4323b.add(2130840099);
        f4323b.add(2130839731);
        f4323b.add(2130837942);
        f4323b.add(2130841014);
        f4323b.add(2130837813);
        f4323b.add(2130840505);
        f4323b.add(2130839486);
        f4323b.add(2130840127);
        f4323b.add(2130840133);
        f4323b.add(2130840141);
        f4323b.add(2130838482);
        f4323b.add(2130840534);
        f4323b.add(2130841047);
        f4323b.add(2130840532);
        f4323b.add(2130838484);
        f4323b.add(2130840533);
        f4323b.add(2130841695);
        f4323b.add(2130837731);
        f4323b.add(2130837989);
        f4323b.add(2130841061);
        f4323b.add(2130841704);
        f4323b.add(2130841705);
        f4323b.add(2130838131);
        f4323b.add(2130841328);
        f4323b.add(2130841329);
        f4323b.add(2130840567);
        f4323b.add(2130840186);
        f4323b.add(2130840442);
        f4323b.add(2130838139);
        f4323b.add(2130838270);
        f4323b.add(2130838140);
        f4323b.add(2130838141);
        f4323b.add(2130839165);
    }

    private static Drawable a(int i) {
        long j = (long) i;
        if (f4324c.get(j) == null || f4324c.get(j).get() == null) {
            return null;
        }
        return (Drawable) f4324c.get(j).get();
    }

    @Replacement
    public static Drawable a(Resources resources, int i) {
        return a(resources, i, null);
    }

    @Replacement
    public static Drawable a(Context context, int i) {
        return a(context.getResources(), i, context.getTheme());
    }

    private static void a(int i, Drawable drawable) {
        f4324c.put((long) i, new WeakReference(drawable));
    }

    private static Drawable a(Resources resources, int i, Resources.Theme theme) {
        if (f4322a && f4323b.contains(Integer.valueOf(i))) {
            Drawable a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
            if (decodeResource != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, decodeResource);
                a(i, (Drawable) bitmapDrawable);
                return bitmapDrawable;
            } else if (Build.VERSION.SDK_INT >= 21) {
                return resources.getDrawable(i, theme);
            } else {
                return resources.getDrawable(i);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        } else {
            return resources.getDrawable(i);
        }
    }
}
