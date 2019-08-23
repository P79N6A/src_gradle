package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdkapi.depend.model.c;
import java.util.Map;

public interface n {

    public interface a {
        void a(r rVar, String str, String str2, String str3);

        void a(r rVar, Throwable th);
    }

    @Nullable
    Map<String, String> a();

    void a(Activity activity, c cVar, a aVar);

    void a(Context context, c cVar, a aVar);

    String b();

    String c();
}
