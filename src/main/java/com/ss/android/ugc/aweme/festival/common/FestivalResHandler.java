package com.ss.android.ugc.aweme.festival.common;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.LruCache;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import java.io.File;

public final class FestivalResHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47284a;

    /* renamed from: b  reason: collision with root package name */
    private static LruCache<String, Drawable> f47285b = new LruCache<>(20);

    /* renamed from: c  reason: collision with root package name */
    private static LruCache<String, Bitmap> f47286c = new LruCache<>(20);

    public @interface IResKey {

        /* renamed from: a  reason: collision with root package name */
        public static final String f3225a = ("like_animation" + File.separator + "images");

        /* renamed from: b  reason: collision with root package name */
        public static final String f3226b = (f3225a + File.separator + "like_liked_3x.png");

        /* renamed from: c  reason: collision with root package name */
        public static final String f3227c = (f3225a + File.separator + "like_normal_3x.png");

        /* renamed from: d  reason: collision with root package name */
        public static final String f3228d;

        /* renamed from: e  reason: collision with root package name */
        public static final String f3229e = ("like_animation" + File.separator + "like_cancel.json");

        /* renamed from: f  reason: collision with root package name */
        public static final String[] f3230f = {"shot_icon_animation_01.png", "shot_icon_animation_02.png", "shot_icon_animation_03.png", "shot_icon_animation_04.png", "shot_icon_animation_05.png"};

        static {
            StringBuilder sb = new StringBuilder("like_animation");
            sb.append(File.separator);
            sb.append("like.json");
            f3228d = sb.toString();
        }
    }

    private static File e() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43971, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43971, new Class[0], File.class);
        }
        return b("liked_icon.png");
    }

    private static File f() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43973, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43973, new Class[0], File.class);
        }
        return b("like_icon.png");
    }

    private static File h() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43980, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43980, new Class[0], File.class);
        }
        return b("comment_icon.png");
    }

    private static File i() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43988, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43988, new Class[0], File.class);
        }
        return b("avatar_hat.png");
    }

    public static Drawable a() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43970, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43970, new Class[0], Drawable.class);
        }
        Drawable g = g();
        Drawable b2 = b();
        if (g == null || b2 == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, g);
        stateListDrawable.addState(new int[]{16842913}, b2);
        return stateListDrawable;
    }

    public static Drawable b() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43972, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43972, new Class[0], Drawable.class);
        }
        Bitmap c2 = c("liked_icon.png");
        if (c2 != null) {
            return new BitmapDrawable(k.a().getResources(), c2);
        }
        Drawable a2 = a(e());
        if (a2 instanceof BitmapDrawable) {
            a("liked_icon.png", ((BitmapDrawable) a2).getBitmap());
        }
        return a2;
    }

    public static Drawable c() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43981, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43981, new Class[0], Drawable.class);
        }
        Drawable a2 = a("comment_icon.png");
        if (a2 != null) {
            return a2;
        }
        Drawable a3 = a(h());
        if (a3 != null) {
            a("comment_icon.png", a3);
        }
        return a3;
    }

    public static Drawable d() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43989, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43989, new Class[0], Drawable.class);
        }
        Drawable a2 = a("avatar_hat.png");
        if (a2 != null) {
            return a2;
        }
        Drawable a3 = a(i());
        if (a3 != null) {
            a("avatar_hat.png", a3);
        }
        return a3;
    }

    private static Drawable g() {
        if (PatchProxy.isSupport(new Object[0], null, f47284a, true, 43974, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], null, f47284a, true, 43974, new Class[0], Drawable.class);
        }
        Bitmap c2 = c("like_icon.png");
        if (c2 != null) {
            return new BitmapDrawable(k.a().getResources(), c2);
        }
        Drawable a2 = a(f());
        if (a2 instanceof BitmapDrawable) {
            a("like_icon.png", ((BitmapDrawable) a2).getBitmap());
        }
        return a2;
    }

    public static Drawable a(File file) {
        File file2 = file;
        if (!PatchProxy.isSupport(new Object[]{file2}, null, f47284a, true, 43977, new Class[]{File.class}, Drawable.class)) {
            return a(file2, 0);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[]{file2}, null, f47284a, true, 43977, new Class[]{File.class}, Drawable.class);
    }

    @Nullable
    private static Bitmap c(@IResKey String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f47284a, true, 43966, new Class[]{String.class}, Bitmap.class)) {
            return f47286c.get(str2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{str2}, null, f47284a, true, 43966, new Class[]{String.class}, Bitmap.class);
    }

    public static File b(@IResKey String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f47284a, true, 43975, new Class[]{String.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2}, null, f47284a, true, 43975, new Class[]{String.class}, File.class);
        }
        File b2 = b.a().b();
        if (b2 == null || !b2.exists() || !b2.isDirectory()) {
            return null;
        }
        File file = new File(b2, str2);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return file;
    }

    @Nullable
    public static Drawable a(@IResKey String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f47284a, true, 43965, new Class[]{String.class}, Drawable.class)) {
            return f47285b.get(str2);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[]{str2}, null, f47284a, true, 43965, new Class[]{String.class}, Drawable.class);
    }

    private static Drawable a(File file, int i) {
        if (PatchProxy.isSupport(new Object[]{file, 0}, null, f47284a, true, 43976, new Class[]{File.class, Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{file, 0}, null, f47284a, true, 43976, new Class[]{File.class, Integer.TYPE}, Drawable.class);
        } else if (file == null || !file.exists()) {
            return null;
        } else {
            Drawable createFromPath = Drawable.createFromPath(file.getPath());
            if (createFromPath instanceof BitmapDrawable) {
                ((BitmapDrawable) createFromPath).setTargetDensity(UIUtils.getDpi(k.a()));
            }
            return createFromPath;
        }
    }

    private static void a(@IResKey String str, @NonNull Bitmap bitmap) {
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{str2, bitmap2}, null, f47284a, true, 43964, new Class[]{String.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bitmap2}, null, f47284a, true, 43964, new Class[]{String.class, Bitmap.class}, Void.TYPE);
        } else if (bitmap2 != null) {
            f47286c.put(str2, bitmap2);
        }
    }

    public static void a(@IResKey String str, @NonNull Drawable drawable) {
        String str2 = str;
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{str2, drawable2}, null, f47284a, true, 43963, new Class[]{String.class, Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, drawable2}, null, f47284a, true, 43963, new Class[]{String.class, Drawable.class}, Void.TYPE);
        } else if (drawable2 != null) {
            f47285b.put(str2, drawable2);
        }
    }
}
