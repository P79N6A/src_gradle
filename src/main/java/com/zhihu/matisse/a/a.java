package com.zhihu.matisse.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

public interface a {
    void a(Context context, int i, int i2, ImageView imageView, Uri uri);

    void a(Context context, int i, Drawable drawable, ImageView imageView, Uri uri);

    void b(Context context, int i, int i2, ImageView imageView, Uri uri);

    void b(Context context, int i, Drawable drawable, ImageView imageView, Uri uri);
}
