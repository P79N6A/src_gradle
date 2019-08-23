package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import com.ss.android.ugc.aweme.IAccountService;

public interface m {
    void bindMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar);

    Fragment createLiveBindPhoneFragment(@Nullable IAccountService.h hVar);

    Intent getAuthorizeActivityStartIntent(@NonNull Context context);

    m keepCallback();

    void modifyMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar);

    void setAuthorzieBindResult(y yVar);

    void showThirdPartyAccountManagerActivity(Activity activity);
}
