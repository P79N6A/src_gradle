package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J0\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/IVideoRecordEntranceService;", "", "notifyToolPermissionActivity", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "recreateSupport", "", "clearOld", "isBack2Main", "startToolPermissionActivity", "Landroid/app/Activity;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface IVideoRecordEntranceService {
    void notifyToolPermissionActivity(@NotNull Context context, @NotNull Intent intent, boolean z, boolean z2, boolean z3);

    void startToolPermissionActivity(@Nullable Activity activity, @Nullable Intent intent);

    void startToolPermissionActivity(@NotNull Activity activity, @NotNull Intent intent, boolean z, boolean z2, boolean z3);

    void startToolPermissionActivity(@Nullable Context context, @Nullable Intent intent);
}
