package com.ss.android.ugc.aweme.miniapp_api.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.option.share.OnShareDialogEventListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public interface f {
    void a(Activity activity, int i, int i2);

    void a(Activity activity, Intent intent);

    void a(Activity activity, OnShareDialogEventListener onShareDialogEventListener);

    void a(@NonNull Activity activity, ShareInfoModel shareInfoModel);

    void a(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener);

    void a(Activity activity, String str, int i, boolean z);

    void a(Context context, String str);

    void a(Context context, boolean z);

    boolean a();

    boolean a(Activity activity, @Nullable String str, @Nullable List<String> list, int i);

    boolean a(Context context, String str, String str2);

    boolean a(Context context, String str, String str2, String str3);

    boolean a(Context context, String str, boolean z);

    IAsyncHostDataHandler b();

    void b(Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener);

    void b(Context context, String str, String str2);

    boolean b(@NonNull Context context, String str);

    void c();

    void d();

    Activity e();

    boolean f();

    void g();
}
