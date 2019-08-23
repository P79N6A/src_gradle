package com.tt.frontendapiinterface;

import android.app.Activity;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.ext.WebEventCallback;
import java.util.List;

@MiniAppProcess
public interface IBaseRender {
    @MiniAppProcess
    void addNativeView(int i, String str, String str2, WebEventCallback webEventCallback);

    @MiniAppProcess
    List<IBackPressedListener> getBackPressedListener();

    @MiniAppProcess
    Activity getCurrentActivity();

    @MiniAppProcess
    String getPage();

    @MiniAppProcess
    String getQuery();

    @MiniAppProcess
    int getRenderHeight();

    @MiniAppProcess
    int getRenderWidth();

    @MiniAppProcess
    int getTitleBarHeight();

    @MiniAppProcess
    FrameLayout getTopContainer();

    @MiniAppProcess
    WebView getWebView();

    @MiniAppProcess
    int getWebViewId();

    @MiniAppProcess
    void hideConfirmBar();

    @MiniAppProcess
    void hideTopContainer();

    @MiniAppProcess
    void initReady();

    @MiniAppProcess
    void onStartPullDownRefresh();

    @MiniAppProcess
    void onStopPullDownRefresh();

    @MiniAppProcess
    void onWebViewRender();

    @MiniAppProcess
    void onWebviewReady();

    @MiniAppProcess
    boolean pullDownRefreshEnabled();

    @MiniAppProcess
    void registerBackPressedListener(IBackPressedListener iBackPressedListener);

    @MiniAppProcess
    void removeNativeView(int i, WebEventCallback webEventCallback);

    @MiniAppProcess
    void setNavigationBarTitle(String str);

    @MiniAppProcess
    void showConfirmBar();

    @MiniAppProcess
    void showKeyboard(int i);

    @MiniAppProcess
    void unregisterBackPressedListener(IBackPressedListener iBackPressedListener);

    @MiniAppProcess
    void updateNativeView(int i, String str, WebEventCallback webEventCallback);
}
