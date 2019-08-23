package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.sdk.account.api.a.f;
import com.ss.android.ugc.aweme.IAccountService;

public interface p {
    String getLoginMobEnterFrom();

    String getLoginMobEnterMethod();

    boolean isLoginActivity(Activity activity);

    void logout(String str);

    void openPrivacyPolicy(@NonNull Activity activity);

    void showLoginAndRegisterView(@NonNull IAccountService.c cVar);

    void switchAccount(String str, @Nullable Bundle bundle, @Nullable f fVar);
}
