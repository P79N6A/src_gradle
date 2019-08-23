package com.bytedance.lighten.core.b;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.lighten.core.i;

public interface g {
    void a(Uri uri, @Nullable View view);

    void a(Uri uri, @Nullable View view, @Nullable i iVar, @Nullable Animatable animatable);

    void a(Uri uri, @Nullable View view, @Nullable Throwable th);
}
