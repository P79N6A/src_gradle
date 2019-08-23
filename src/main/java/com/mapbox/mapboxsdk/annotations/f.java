package com.mapbox.mapboxsdk.annotations;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.b.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Bitmap f26437a = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: c  reason: collision with root package name */
    private static f f26438c;

    /* renamed from: b  reason: collision with root package name */
    private Context f26439b;

    /* renamed from: d  reason: collision with root package name */
    private e f26440d;

    /* renamed from: e  reason: collision with root package name */
    private e f26441e;

    /* renamed from: f  reason: collision with root package name */
    private BitmapFactory.Options f26442f;
    private int g;

    public final e a() {
        if (this.f26440d == null) {
            this.f26440d = a(2130840262);
        }
        return this.f26440d;
    }

    public final e b() {
        if (this.f26441e == null) {
            this.f26441e = a(2130840263);
        }
        return this.f26441e;
    }

    private e a(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(this.f26439b, i);
        if (drawable instanceof BitmapDrawable) {
            return a(((BitmapDrawable) drawable).getBitmap());
        }
        throw new IllegalArgumentException("Failed to decode image. The resource provided must be a Bitmap.");
    }

    public static synchronized f a(@NonNull Context context) {
        f fVar;
        synchronized (f.class) {
            if (f26438c == null) {
                f26438c = new f(context.getApplicationContext());
            }
            fVar = f26438c;
        }
        return fVar;
    }

    private f(@NonNull Context context) {
        DisplayMetrics displayMetrics;
        this.f26439b = context;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics2);
        this.f26442f = new BitmapFactory.Options();
        this.f26442f.inScaled = true;
        this.f26442f.inDensity = 160;
        this.f26442f.inTargetDensity = displayMetrics2.densityDpi;
        if (displayMetrics != null) {
            this.f26442f.inScreenDensity = displayMetrics.densityDpi;
        }
    }

    public final e a(@NonNull Bitmap bitmap) {
        if (this.g >= 0) {
            StringBuilder sb = new StringBuilder("com.mapbox.icons.icon_");
            int i = this.g + 1;
            this.g = i;
            sb.append(i);
            return new e(sb.toString(), bitmap);
        }
        throw new e();
    }

    public static e a(@NonNull String str, @NonNull Bitmap bitmap) {
        return new e(str, bitmap);
    }
}
