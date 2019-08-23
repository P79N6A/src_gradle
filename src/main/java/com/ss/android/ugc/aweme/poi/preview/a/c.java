package com.ss.android.ugc.aweme.poi.preview.a;

import android.graphics.drawable.Drawable;
import android.support.annotation.UiThread;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.poi.preview.transfer.g;

public interface c {

    public interface a {
        @UiThread
        void a();

        @UiThread
        void a(int i);
    }

    public interface b {
        @UiThread
        void a(Drawable drawable);
    }

    Drawable a(String str, g gVar);

    void a(String str, ImageView imageView, Drawable drawable, g gVar, a aVar);

    void a(String str, g gVar, b bVar);

    boolean a(String str);
}
