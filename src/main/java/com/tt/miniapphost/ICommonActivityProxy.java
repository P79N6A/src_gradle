package com.tt.miniapphost;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import com.tt.miniapphost.process.annotation.MiniAppProcess;

public interface ICommonActivityProxy {
    @MiniAppProcess
    View getSwipeBackLayout();

    @MiniAppProcess
    void onActivityResult(int i, int i2, Intent intent);

    @MiniAppProcess
    void onBackPressed();

    @MiniAppProcess
    void onCreate(Bundle bundle);

    @MiniAppProcess
    void onDestroy();

    @MiniAppProcess
    void onNewIntent(Intent intent);

    @MiniAppProcess
    void onPause();

    @MiniAppProcess
    void onPostCreate(Bundle bundle);

    @MiniAppProcess
    void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    @MiniAppProcess
    void onResume();

    @MiniAppProcess
    void onSaveInstanceState(Bundle bundle);

    @MiniAppProcess
    void onSwipeBack();

    @MiniAppProcess
    void setSwipeBackEnable(boolean z);

    @MiniAppProcess
    boolean swipeBackPriority();
}
