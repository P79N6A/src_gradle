package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0019J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J1\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0013\"\u00020\nH&¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u0018\u001a\u00020\u0016H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/port/in/IPermissionService;", "", "checkAudioPermission", "", "context", "Landroid/content/Context;", "checkCameraPermission", "checkExternalStoragePermission", "checkSelfPermission", "permission", "", "openSettingActivity", "", "requestPermissions", "activity", "Landroid/support/v4/app/FragmentActivity;", "requestListener", "Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;", "permissions", "", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;[Ljava/lang/String;)V", "shouldShowRequestPermissionRationale", "", "Landroid/app/Activity;", "systemSupportsRuntimePermission", "IPermissionRequestListener", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface ad {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;", "", "onRequestPermissionResult", "", "permissions", "", "", "grantResults", "", "([Ljava/lang/String;[I)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@Nullable String[] strArr, @Nullable int[] iArr);
    }

    int a(@NotNull Context context);

    int a(@NotNull Context context, @NotNull String str);

    void a(@NotNull FragmentActivity fragmentActivity, @NotNull a aVar, @NotNull String... strArr);

    boolean a();

    boolean a(@NotNull Activity activity, @NotNull String str);

    int b(@NotNull Context context);

    int c(@NotNull Context context);

    void d(@NotNull Context context);
}
