package com.ss.android.ugc.aweme.account;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.account.model.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J8\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0005H&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0007H&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/IAccountService;", "", "getCurrentUser", "Lcom/ss/android/ugc/aweme/account/model/IAVUser;", "getCurrentUserID", "", "isChildrenMode", "", "isLogin", "isTeenModeOn", "login", "", "activity", "Landroid/app/Activity;", "enterMethod", "callback", "Lcom/ss/android/ugc/aweme/account/IAccountService$Callback;", "enterFrom", "bundle", "Landroid/os/Bundle;", "fragment", "Landroid/support/v4/app/Fragment;", "queryUser", "uid", "setIsOldUser", "isOldUser", "Callback", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public interface f {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/account/IAccountService$Callback;", "", "onCancel", "", "onSuccess", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();

        void b();
    }

    @NotNull
    e a(@NotNull String str) throws Exception;

    void a(@NotNull Activity activity, @NotNull String str, @Nullable a aVar);

    void a(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @Nullable Bundle bundle, @Nullable a aVar);

    void a(@NotNull Fragment fragment, @NotNull String str, @NotNull String str2, @Nullable Bundle bundle, @Nullable a aVar);

    void a(boolean z);

    boolean a();

    boolean b();

    boolean c();

    @NotNull
    String d();

    @Nullable
    e e();
}
