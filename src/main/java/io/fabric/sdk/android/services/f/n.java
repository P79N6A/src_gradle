package io.fabric.sdk.android.services.f;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.services.b.i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f83332a;

    /* renamed from: b  reason: collision with root package name */
    public final int f83333b;

    /* renamed from: c  reason: collision with root package name */
    public final int f83334c;

    /* renamed from: d  reason: collision with root package name */
    public final int f83335d;

    public static n a(Context context, String str) {
        if (str != null) {
            try {
                int g = i.g(context);
                new StringBuilder("App icon resource ID is ").append(g);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), g, options);
                return new n(str, g, options.outWidth, options.outHeight);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private n(String str, int i, int i2, int i3) {
        this.f83332a = str;
        this.f83333b = i;
        this.f83334c = i2;
        this.f83335d = i3;
    }
}
