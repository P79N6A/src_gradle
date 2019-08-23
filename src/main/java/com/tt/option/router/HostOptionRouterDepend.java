package com.tt.option.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.process.annotation.AnyProcess;

public interface HostOptionRouterDepend {
    @AnyProcess
    boolean handleAppbrandDisablePage(@NonNull Context context, String str);

    @AnyProcess
    boolean interceptOpenWebUrl(@Nullable Context context, String str);

    @AnyProcess
    void jumpToWebView(@NonNull Context context, String str, String str2, boolean z);

    @AnyProcess
    boolean openProfile(@NonNull Activity activity, @Nullable String str);

    @AnyProcess
    boolean openSchema(@NonNull Context context, @NonNull String str);

    @AnyProcess
    boolean openWebBrowser(@NonNull Context context, String str, boolean z);

    @AnyProcess
    void overridePendingTransition(@NonNull Activity activity, int i, int i2);

    @AnyProcess
    boolean startMiniAppActivity(@NonNull Context context, @NonNull Intent intent);

    @AnyProcess
    boolean startMiniAppService(@NonNull Context context, @NonNull Intent intent);
}
