package com.tt.miniapphost;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.View;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

@MiniAppProcess
public interface IActivityProxy {
    @MiniAppProcess
    void checkNotchInScreen();

    @MiniAppProcess
    View findViewById(int i);

    @MiniAppProcess
    String getCurrentPage();

    @MiniAppProcess
    View getSwipeBackLayout();

    @MiniAppProcess
    boolean isBackground();

    @AnyThread
    boolean isGoingBackground();

    @MiniAppProcess
    boolean onActivityResult(int i, int i2, Intent intent);

    @MiniAppProcess
    void onBackPressed();

    @MiniAppProcess
    void onCreate(Bundle bundle);

    @MiniAppProcess
    boolean onCreateBannerView(String str, int i, int i2, int i3);

    @MiniAppProcess
    boolean onCreateVideoAd(String str);

    @MiniAppProcess
    void onDestroy();

    @MiniAppProcess
    void onNewIntent(Intent intent);

    @MiniAppProcess
    boolean onOperateBannerView(String str, String str2);

    @MiniAppProcess
    boolean onOperateVideoAd(String str, String str2);

    @MiniAppProcess
    void onPause();

    @MiniAppProcess
    void onPostCreate(Bundle bundle);

    @MiniAppProcess
    void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    @MiniAppProcess
    void onResume();

    @MiniAppProcess
    void onSwipeBack();

    @MiniAppProcess
    boolean onUpdateBannerView(String str, int i, int i2, int i3);

    @UiThread
    void setGoingBackground(boolean z);

    @MiniAppProcess
    void setSwipeBackEnable(boolean z);

    @MiniAppProcess
    boolean swipeBackPriority();

    @MiniAppProcess
    void updateForcegroundState(boolean z);
}
