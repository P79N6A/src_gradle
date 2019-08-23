package com.ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.ss.android.ugc.aweme.crossplatform.activity.f;
import com.ss.android.ugc.aweme.crossplatform.base.c;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.b;

public interface a extends c {
    @NonNull
    <T extends g> T a(Class<T> cls);

    void a(Activity activity);

    void b(Activity activity);

    void c(Activity activity);

    boolean c();

    void d(Activity activity);

    String getCurrentUrl();

    @NonNull
    e getViewStatusRegistry();

    void setCrossPlatformActivityContainer(f fVar);

    void setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler);

    void setFullScreen(b bVar);
}
