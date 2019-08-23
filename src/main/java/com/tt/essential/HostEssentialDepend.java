package com.tt.essential;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tt.miniapphost.entity.InitParamsEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.share.OnShareDialogEventListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.util.List;

@AnyProcess
public interface HostEssentialDepend {
    @AnyProcess
    InitParamsEntity createInitParams();

    @MiniAppProcess
    boolean handleActivityLoginResult(int i, int i2, Intent intent);

    @MiniAppProcess
    @NonNull
    boolean handleActivityShareResult(int i, int i2, Intent intent);

    @AnyProcess
    void loadImage(@NonNull Context context, LoaderOptions loaderOptions);

    @MiniAppProcess
    boolean openLoginActivity(@NonNull Activity activity);

    @MiniAppProcess
    boolean share(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener);

    @MiniAppProcess
    void showShareDialog(@NonNull Activity activity, OnShareDialogEventListener onShareDialogEventListener);

    @AnyProcess
    boolean startImagePreviewActivity(@NonNull Activity activity, @Nullable String str, @Nullable List<String> list, int i);
}
