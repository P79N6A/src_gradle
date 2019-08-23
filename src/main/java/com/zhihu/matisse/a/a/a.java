package com.zhihu.matisse.a.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestOptions;

public final class a implements com.zhihu.matisse.a.a {
    public final void a(Context context, int i, int i2, ImageView imageView, Uri uri) {
        Glide.with(context).load(uri).apply(RequestOptions.overrideOf(i, i2).priority(Priority.HIGH).fitCenter()).into(imageView);
    }

    public final void b(Context context, int i, int i2, ImageView imageView, Uri uri) {
        Glide.with(context).asGif().load(uri).apply(RequestOptions.overrideOf(i, i2).priority(Priority.HIGH)).into(imageView);
    }

    public final void a(Context context, int i, Drawable drawable, ImageView imageView, Uri uri) {
        Glide.with(context).asBitmap().load(uri).apply(RequestOptions.placeholderOf(drawable).override(i, i).centerCrop()).into(imageView);
    }

    public final void b(Context context, int i, Drawable drawable, ImageView imageView, Uri uri) {
        Glide.with(context).asBitmap().load(uri).apply(RequestOptions.placeholderOf(drawable).override(i, i).centerCrop()).into(imageView);
    }
}
