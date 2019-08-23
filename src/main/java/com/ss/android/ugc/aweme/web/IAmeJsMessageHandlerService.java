package com.ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import com.ss.android.sdk.c.b;
import java.lang.ref.WeakReference;
import java.util.List;

@Keep
public interface IAmeJsMessageHandlerService {
    List<String> getSafeHosts();

    boolean isSafeDomain(String str);

    void registerJavaMethod(b bVar, WeakReference<Context> weakReference, Activity activity);
}
