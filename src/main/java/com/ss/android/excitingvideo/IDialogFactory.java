package com.ss.android.excitingvideo;

import android.app.Activity;
import android.app.Dialog;
import com.ss.android.excitingvideo.model.VideoAd;

public interface IDialogFactory {
    Dialog createDialog(Activity activity, VideoAd videoAd, IDialogClickCallback iDialogClickCallback);
}
