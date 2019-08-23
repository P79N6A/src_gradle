package com.airbnb.lottie.b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;
import com.airbnb.lottie.b;
import com.airbnb.lottie.c.h;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h<String> f4669a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<h<String>, Typeface> f4670b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Typeface> f4671c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f4672d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public b f4673e;

    /* renamed from: f  reason: collision with root package name */
    public String f4674f = ".ttf";

    public a(Drawable.Callback callback, @Nullable b bVar) {
        this.f4673e = bVar;
        if (!(callback instanceof View)) {
            this.f4672d = null;
        } else {
            this.f4672d = ((View) callback).getContext().getAssets();
        }
    }
}
