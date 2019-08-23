package com.tt.option;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.excitingvideo.IAdEventListener;
import com.ss.android.excitingvideo.IDownloadListener;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.IOpenWebListener;
import com.tt.miniapphost.download.IDownloadImpl;
import com.tt.miniapphost.download.IDownloadInterface;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.entity.GamePayResultEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.List;
import org.json.JSONObject;

public class HostOptionLowPriorityDepend {

    @MiniAppProcess
    public interface BindPhoneNumberCallback {
        @MiniAppProcess
        void onBindPhoneResult(boolean z);
    }

    public interface WXPayCallback {
        @MiniAppProcess
        void onCancel(String str);

        @MiniAppProcess
        void onFail(String str);

        @MiniAppProcess
        void onSuccess(String str);
    }

    @MiniAppProcess
    public boolean bindPhoneNumber(@NonNull BindPhoneNumberCallback bindPhoneNumberCallback) {
        return false;
    }

    @AnyProcess
    public DisableStateEntity checkExtraAppbrandDisableState(Context context, int i) {
        return null;
    }

    @MiniAppProcess
    public boolean gamePay(@NonNull Activity activity, @NonNull JSONObject jSONObject, String str) {
        return false;
    }

    @AnyProcess
    public List<AppLaunchInfo> getAppLaunchInfo() {
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IAdEventListener getIAdEventListener() {
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IDownloadListener getIDownloadListener() {
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IImageLoadFactory getIImageLoadFactory() {
        return null;
    }

    @Nullable
    @MiniAppProcess
    public INetworkListener getINetworkListener() {
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IOpenWebListener getIOpenWebListener() {
        return null;
    }

    @AnyProcess
    public List<AppLaunchInfo> getRecommendList() {
        return null;
    }

    @AnyProcess
    public long getSettingsRequestDelayTime() {
        return 3000;
    }

    @AnyProcess
    public JSONObject getTmaFeatureConfig() {
        return null;
    }

    @AnyProcess
    public boolean isSlideActivity(String str) {
        return false;
    }

    @HostProcess
    public void onActivityLifecycleCallback(@Nullable Activity activity, @Nullable Bundle bundle, @NonNull String str) {
    }

    @AnyProcess
    public String replaceProcessName(String str) {
        return str;
    }

    @MiniAppProcess
    public void syncWebViewLoginCookie(String str) {
    }

    @MiniAppProcess
    public boolean wxRequestPay(@NonNull Activity activity, @NonNull String str, WXPayCallback wXPayCallback) {
        return false;
    }

    @Nullable
    public IDownloadInterface getIDownloadInterface() {
        return new IDownloadImpl();
    }

    @MiniAppProcess
    @NonNull
    public GamePayResultEntity handleActivityGamePayResult(int i, int i2, Intent intent) {
        return new GamePayResultEntity();
    }
}
