package com.bytedance.android.livesdk.share;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.h.a;
import io.reactivex.Single;

public interface b {
    Single<Object> a(Activity activity, com.bytedance.android.livesdkapi.depend.h.b bVar);

    Single<String> a(String str);

    void a(Activity activity, com.bytedance.android.livesdkapi.depend.h.b bVar, a aVar);

    void a(Activity activity, com.bytedance.android.livesdkapi.depend.h.b bVar, String str);

    boolean a(Activity activity, String str);
}
