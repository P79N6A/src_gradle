package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.annotation.Keep;

@Keep
public interface IPrivacySettingService {

    public interface OnPostNowClickListener {
        void onPostNowClick();
    }

    boolean needShowPrivacyConfirmationDialog(Activity activity);

    AlertDialog showPrivacyConfirmationDialog(Activity activity, OnPostNowClickListener onPostNowClickListener);
}
