package com.airbnb.lottie.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.c;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f4675d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f4676a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public c f4677b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, g> f4678c;

    /* renamed from: e  reason: collision with root package name */
    private String f4679e;

    public final void a() {
        synchronized (f4675d) {
            for (Map.Entry<String, g> value : this.f4678c.entrySet()) {
                g gVar = (g) value.getValue();
                Bitmap bitmap = gVar.f4858f;
                if (bitmap != null) {
                    bitmap.recycle();
                    gVar.f4858f = null;
                }
            }
        }
    }

    @Nullable
    public final Bitmap a(String str) {
        g gVar = this.f4678c.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap bitmap = gVar.f4858f;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.f4677b != null) {
            Bitmap a2 = this.f4677b.a();
            if (a2 != null) {
                a(str, a2);
            }
            return a2;
        }
        String str2 = gVar.f4856d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f4679e)) {
                    AssetManager assets = this.f4676a.getAssets();
                    return a(str, BitmapFactory.decodeStream(assets.open(this.f4679e + str2), null, options));
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        }
    }

    public Bitmap a(String str, @Nullable Bitmap bitmap) {
        synchronized (f4675d) {
            this.f4678c.get(str).f4858f = bitmap;
        }
        return bitmap;
    }

    public b(Drawable.Callback callback, String str, c cVar, Map<String, g> map) {
        this.f4679e = str;
        if (!TextUtils.isEmpty(str) && this.f4679e.charAt(this.f4679e.length() - 1) != '/') {
            this.f4679e += '/';
        }
        if (!(callback instanceof View)) {
            this.f4678c = new HashMap();
            this.f4676a = null;
            return;
        }
        this.f4676a = ((View) callback).getContext();
        this.f4678c = map;
        this.f4677b = cVar;
    }
}
