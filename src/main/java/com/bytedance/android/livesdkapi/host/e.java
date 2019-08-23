package com.bytedance.android.livesdkapi.host;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;

public interface e extends com.bytedance.android.live.base.b {

    public static class a {
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a(Bitmap bitmap);
    }

    a a(ImageModel imageModel, c cVar);

    void a(String str);

    void a(String str, b bVar);

    boolean a(ImageModel imageModel);

    String b(ImageModel imageModel);

    String b(String str);
}
