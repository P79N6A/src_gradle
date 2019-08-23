package com.tt.miniapphost.host;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.ss.android.excitingvideo.IAdEventListener;
import com.ss.android.excitingvideo.IDownloadListener;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.IOpenWebListener;
import com.tt.essential.HostEssentialDepend;
import com.tt.essential.LoaderOptions;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.download.IDownloadInterface;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.ChooseImageResultEntity;
import com.tt.miniapphost.entity.ChooseVideoResultEntity;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.entity.GamePayResultEntity;
import com.tt.miniapphost.entity.InitParamsEntity;
import com.tt.miniapphost.entity.ScanResultEntity;
import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import com.tt.miniapphost.util.AppbrandBaseEventUtil;
import com.tt.option.HostOptionDepend;
import com.tt.option.HostOptionDependRegister;
import com.tt.option.HostOptionLowPriorityDepend;
import com.tt.option.ext.HostOptionApiDepend;
import com.tt.option.ext.HostOptionNativeViewExtDepend;
import com.tt.option.media.HostOptionMediaDepend;
import com.tt.option.media.IFileChooseHandler;
import com.tt.option.menu.ITitleMenuItem;
import com.tt.option.net.HostOptionNetDepend;
import com.tt.option.net.TmaFileRequest;
import com.tt.option.net.TmaFileResponse;
import com.tt.option.net.TmaRequest;
import com.tt.option.net.TmaResponse;
import com.tt.option.permission.PermissionCustomDialogMsgEntity;
import com.tt.option.share.HostOptionShareDepend;
import com.tt.option.share.OnGetShareBaseInfoListener;
import com.tt.option.share.OnGetShareTokenInfoListener;
import com.tt.option.share.OnShareDialogEventListener;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import com.tt.option.ui.HostOptionUiDepend;
import java.util.List;
import org.json.JSONObject;

public class HostDependManager extends HostOptionLowPriorityDepend implements HostEssentialDepend, HostOptionDepend {
    @NonNull
    private HostEssentialDepend hostEssentialDepend;
    @NonNull
    private HostOptionDependRegister hostOptionDependRegister;
    private final Object lock = new Object();
    private volatile boolean mIsCheckedHostSupportAdFeature;
    private volatile boolean mIsHostSupportAdFeature;

    static class Holder {
        static HostDependManager sInstance = new HostDependManager();

        Holder() {
        }
    }

    public static HostDependManager getInst() {
        return Holder.sInstance;
    }

    @AnyProcess
    public InitParamsEntity createInitParams() {
        return this.hostEssentialDepend.createInitParams();
    }

    public List<IAsyncHostDataHandler> createAsyncHostDataHandlerList() {
        return this.hostOptionDependRegister.getDataHandlerDepend().createAsyncHostDataHandlerList();
    }

    @AnyProcess
    public HostOptionApiDepend.ExtApiHandlerCreator createExtHandler() {
        return this.hostOptionDependRegister.getApiDepend().createExtHandler();
    }

    @Nullable
    @AnyProcess
    public AppBrandLogger.ILogger createLogger() {
        return this.hostOptionDependRegister.getLoggerDepend().createLogger();
    }

    @MiniAppProcess
    public HostOptionNativeViewExtDepend.ExtNativeViewCreator createNativeView() {
        return this.hostOptionDependRegister.getNativeViewExtDepend().createNativeView();
    }

    @HostProcess
    public List<ISyncHostDataHandler> createSyncHostDataHandlerList() {
        return this.hostOptionDependRegister.getDataHandlerDepend().createSyncHostDataHandlerList();
    }

    @MiniAppProcess
    public List<ITitleMenuItem> createTitleMenuItems() {
        return this.hostOptionDependRegister.getMenuDepend().createTitleMenuItems();
    }

    @MiniAppProcess
    public PermissionCustomDialogMsgEntity getPermissionCustomDialogMsgEntity() {
        return this.hostOptionDependRegister.getPermissionDepend().getPermissionCustomDialogMsgEntity();
    }

    @AnyProcess
    public void hideToast() {
        this.hostOptionDependRegister.getUiDepend().hideToast();
    }

    @Nullable
    @MiniAppProcess
    public HostOptionShareDepend.ObtainShareInfoCallback obtainShareInfoCallback() {
        return this.hostOptionDependRegister.getShareDepend().obtainShareInfoCallback();
    }

    @Nullable
    @AnyProcess
    public List<AppLaunchInfo> getAppLaunchInfo() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getAppLaunchInfo();
        }
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IAdEventListener getIAdEventListener() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getIAdEventListener();
        }
        return null;
    }

    @Nullable
    public IDownloadInterface getIDownloadInterface() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getIDownloadInterface();
        }
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IDownloadListener getIDownloadListener() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getIDownloadListener();
        }
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IImageLoadFactory getIImageLoadFactory() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getIImageLoadFactory();
        }
        return null;
    }

    @Nullable
    public INetworkListener getINetworkListener() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getINetworkListener();
        }
        return null;
    }

    @Nullable
    @MiniAppProcess
    public IOpenWebListener getIOpenWebListener() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getIOpenWebListener();
        }
        return null;
    }

    @Nullable
    @AnyProcess
    public List<AppLaunchInfo> getRecommendList() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getRecommendList();
        }
        return null;
    }

    @AnyProcess
    public long getSettingsRequestDelayTime() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getSettingsRequestDelayTime();
        }
        return 3000;
    }

    @Nullable
    @AnyProcess
    public JSONObject getTmaFeatureConfig() {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().getTmaFeatureConfig();
        }
        return null;
    }

    public boolean isHostSupportAdFeature() {
        boolean z;
        if (!this.mIsCheckedHostSupportAdFeature) {
            synchronized (this.lock) {
                if (!this.mIsCheckedHostSupportAdFeature) {
                    if (getINetworkListener() == null || getIImageLoadFactory() == null || getIDownloadListener() == null || getIOpenWebListener() == null || getIAdEventListener() == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.mIsHostSupportAdFeature = z;
                    this.mIsCheckedHostSupportAdFeature = true;
                }
            }
        }
        return this.mIsHostSupportAdFeature;
    }

    public boolean openLoginActivity(@NonNull Activity activity) {
        return this.hostEssentialDepend.openLoginActivity(activity);
    }

    @Nullable
    @AnyProcess
    public IFileChooseHandler createChooseFileHandler(Activity activity) {
        return this.hostOptionDependRegister.getMediaDepend().createChooseFileHandler(activity);
    }

    @AnyProcess
    public List<NativeModule> createNativeModules(AppbrandContext appbrandContext) {
        return this.hostOptionDependRegister.getModuleExtDepend().createNativeModules(appbrandContext);
    }

    @MiniAppProcess
    public String getScene(String str) {
        return this.hostOptionDependRegister.getSceneDepend().getScene(str);
    }

    @MiniAppProcess
    public boolean bindPhoneNumber(@NonNull HostOptionLowPriorityDepend.BindPhoneNumberCallback bindPhoneNumberCallback) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().bindPhoneNumber(bindPhoneNumberCallback);
        }
        return false;
    }

    @AnyProcess
    public boolean isSlideActivity(String str) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().isSlideActivity(str);
        }
        return false;
    }

    @AnyProcess
    public String replaceProcessName(String str) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().replaceProcessName(str);
        }
        return super.replaceProcessName(str);
    }

    @MiniAppProcess
    public void syncWebViewLoginCookie(String str) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            this.hostOptionDependRegister.getHostOptionLowPriorityDepend().syncWebViewLoginCookie(str);
        }
    }

    @AnyProcess
    public TmaResponse doGet(TmaRequest tmaRequest) {
        TmaResponse tmaResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            tmaResponse = this.hostOptionDependRegister.getNetDepend().doGet(tmaRequest);
        } catch (Exception e2) {
            TmaResponse tmaResponse2 = new TmaResponse();
            tmaResponse2.setMessage(e2.getClass() + ":" + e2.getMessage());
            tmaResponse2.setThrowable(e2);
            if (AppBrandLogger.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, "网络请求失败 " + e2.getMessage(), 0, null);
            }
            tmaResponse = tmaResponse2;
        }
        if (tmaResponse == null) {
            tmaResponse = new TmaResponse();
            tmaResponse.setMessage("unknown net error");
        }
        AppbrandBaseEventUtil.mpRequestResult(tmaRequest, tmaResponse, System.currentTimeMillis() - currentTimeMillis);
        return tmaResponse;
    }

    public TmaResponse doPostBody(TmaRequest tmaRequest) {
        TmaResponse tmaResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            tmaResponse = this.hostOptionDependRegister.getNetDepend().doPostBody(tmaRequest);
        } catch (Exception e2) {
            TmaResponse tmaResponse2 = new TmaResponse();
            tmaResponse2.setMessage(e2.getClass() + ":" + e2.getMessage());
            tmaResponse2.setThrowable(e2);
            if (AppBrandLogger.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, "网络请求失败 " + e2.getMessage(), 0, null);
            }
            tmaResponse = tmaResponse2;
        }
        if (tmaResponse == null) {
            tmaResponse = new TmaResponse();
            tmaResponse.setMessage("unknown net error");
        }
        AppbrandBaseEventUtil.mpRequestResult(tmaRequest, tmaResponse, System.currentTimeMillis() - currentTimeMillis);
        return tmaResponse;
    }

    public TmaResponse postMultiPart(TmaRequest tmaRequest) throws Exception {
        TmaResponse tmaResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            tmaResponse = this.hostOptionDependRegister.getNetDepend().postMultiPart(tmaRequest);
        } catch (Exception e2) {
            TmaResponse tmaResponse2 = new TmaResponse();
            tmaResponse2.setMessage(e2.getClass() + ":" + e2.getMessage());
            tmaResponse2.setThrowable(e2);
            if (AppBrandLogger.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, "网络请求失败 " + e2.getMessage(), 0, null);
            }
            tmaResponse = tmaResponse2;
        }
        if (tmaResponse == null) {
            tmaResponse = new TmaResponse();
            tmaResponse.setMessage("unknown net error");
        }
        AppbrandBaseEventUtil.mpRequestResult(tmaRequest, tmaResponse, System.currentTimeMillis() - currentTimeMillis);
        return tmaResponse;
    }

    @AnyProcess
    public void loadImage(@NonNull Context context, LoaderOptions loaderOptions) {
        this.hostEssentialDepend.loadImage(context, loaderOptions);
    }

    @MiniAppProcess
    public void showShareDialog(@NonNull Activity activity, OnShareDialogEventListener onShareDialogEventListener) {
        this.hostEssentialDepend.showShareDialog(activity, onShareDialogEventListener);
    }

    @AnyProcess
    public Dialog getLoadingDialog(@NonNull Activity activity, String str) {
        return this.hostOptionDependRegister.getUiDepend().getLoadingDialog(activity, str);
    }

    @MiniAppProcess
    public void getShareBaseInfo(String str, OnGetShareBaseInfoListener onGetShareBaseInfoListener) {
        this.hostOptionDependRegister.getShareDepend().getShareBaseInfo(str, onGetShareBaseInfoListener);
    }

    @MiniAppProcess
    public void getShareToken(ShareInfoModel shareInfoModel, OnGetShareTokenInfoListener onGetShareTokenInfoListener) {
        this.hostOptionDependRegister.getShareDepend().getShareToken(shareInfoModel, onGetShareTokenInfoListener);
    }

    @AnyProcess
    public boolean handleAppbrandDisablePage(@NonNull Context context, String str) {
        return this.hostOptionDependRegister.getRouterDepend().handleAppbrandDisablePage(context, str);
    }

    @AnyProcess
    public boolean interceptOpenWebUrl(@Nullable Context context, String str) {
        return this.hostOptionDependRegister.getRouterDepend().interceptOpenWebUrl(context, str);
    }

    @AnyProcess
    public boolean openProfile(@NonNull Activity activity, @Nullable String str) {
        return this.hostOptionDependRegister.getRouterDepend().openProfile(activity, str);
    }

    @AnyProcess
    public boolean openSchema(@NonNull Context context, @NonNull String str) {
        return this.hostOptionDependRegister.getRouterDepend().openSchema(context, str);
    }

    @MiniAppProcess
    public void savePermissionGrant(AppbrandPermissionType appbrandPermissionType, boolean z) {
        this.hostOptionDependRegister.getPermissionDepend().savePermissionGrant(appbrandPermissionType, z);
    }

    @AnyProcess
    public boolean scanCode(@NonNull Activity activity, @NonNull HostOptionMediaDepend.ExtendScanCodeCallBack extendScanCodeCallBack) {
        return this.hostOptionDependRegister.getMediaDepend().scanCode(activity, extendScanCodeCallBack);
    }

    @AnyProcess
    public void setHostDepend(@NonNull HostEssentialDepend hostEssentialDepend2, @Nullable HostOptionDependRegister hostOptionDependRegister2) {
        this.hostEssentialDepend = hostEssentialDepend2;
        if (hostOptionDependRegister2 == null) {
            this.hostOptionDependRegister = new HostOptionDependRegister();
        } else {
            this.hostOptionDependRegister = hostOptionDependRegister2;
        }
    }

    @AnyProcess
    public boolean startMiniAppActivity(@NonNull Context context, @NonNull Intent intent) {
        return this.hostOptionDependRegister.getRouterDepend().startMiniAppActivity(context, intent);
    }

    @AnyProcess
    public boolean startMiniAppService(@NonNull Context context, @NonNull Intent intent) {
        return this.hostOptionDependRegister.getRouterDepend().startMiniAppService(context, intent);
    }

    @Nullable
    @AnyProcess
    public DisableStateEntity checkExtraAppbrandDisableState(Context context, int i) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().checkExtraAppbrandDisableState(context, i);
        }
        return null;
    }

    @AnyProcess
    public TmaFileResponse downloadFile(TmaFileRequest tmaFileRequest, HostOptionNetDepend.IDownloadListener iDownloadListener) {
        TmaFileResponse tmaFileResponse;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            tmaFileResponse = this.hostOptionDependRegister.getNetDepend().downloadFile(tmaFileRequest, iDownloadListener);
        } catch (Exception e2) {
            TmaFileResponse tmaFileResponse2 = new TmaFileResponse();
            tmaFileResponse2.setMessage(e2.getClass() + ":" + e2.getMessage());
            tmaFileResponse2.setThrowable(e2);
            if (AppBrandLogger.debug()) {
                Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                showToast(applicationContext, null, "网络请求失败 " + e2.getMessage(), 0, null);
            }
            tmaFileResponse = tmaFileResponse2;
        }
        if (tmaFileResponse == null) {
            tmaFileResponse = new TmaFileResponse();
            tmaFileResponse.setMessage("unknown net error");
        }
        AppbrandBaseEventUtil.mpRequestResult(tmaFileRequest, tmaFileResponse, System.currentTimeMillis() - currentTimeMillis);
        return tmaFileResponse;
    }

    public boolean handleActivityLoginResult(int i, int i2, Intent intent) {
        return this.hostEssentialDepend.handleActivityLoginResult(i, i2, intent);
    }

    @MiniAppProcess
    @NonNull
    public boolean handleActivityShareResult(int i, int i2, Intent intent) {
        return this.hostEssentialDepend.handleActivityShareResult(i, i2, intent);
    }

    @MiniAppProcess
    public boolean share(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        return this.hostEssentialDepend.share(activity, shareInfoModel, onShareEventListener);
    }

    @AnyProcess
    @NonNull
    public ChooseImageResultEntity handleActivityImageResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.getMediaDepend().handleActivityImageResult(i, i2, intent);
    }

    @AnyProcess
    @NonNull
    public ScanResultEntity handleActivityScanResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.getMediaDepend().handleActivityScanResult(i, i2, intent);
    }

    @AnyProcess
    @NonNull
    public ChooseVideoResultEntity handleActivityVideoResult(int i, int i2, Intent intent) {
        return this.hostOptionDependRegister.getMediaDepend().handleActivityVideoResult(i, i2, intent);
    }

    @AnyProcess
    public void loadImage(@NonNull Context context, ImageView imageView, Uri uri) {
        this.hostEssentialDepend.loadImage(context, new LoaderOptions(uri).into(imageView));
    }

    @AnyProcess
    public boolean openWebBrowser(@NonNull Context context, String str, boolean z) {
        return this.hostOptionDependRegister.getRouterDepend().openWebBrowser(context, str, z);
    }

    @AnyProcess
    public void overridePendingTransition(@NonNull Activity activity, int i, int i2) {
        this.hostOptionDependRegister.getRouterDepend().overridePendingTransition(activity, i, i2);
    }

    @MiniAppProcess
    public boolean gamePay(@NonNull Activity activity, @NonNull JSONObject jSONObject, String str) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().gamePay(activity, jSONObject, str);
        }
        return false;
    }

    @MiniAppProcess
    @NonNull
    public GamePayResultEntity handleActivityGamePayResult(int i, int i2, Intent intent) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().handleActivityGamePayResult(i, i2, intent);
        }
        return new GamePayResultEntity();
    }

    @MiniAppProcess
    public boolean wxRequestPay(@NonNull Activity activity, @NonNull String str, HostOptionLowPriorityDepend.WXPayCallback wXPayCallback) {
        if (this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
            return this.hostOptionDependRegister.getHostOptionLowPriorityDepend().wxRequestPay(activity, str, wXPayCallback);
        }
        return false;
    }

    @HostProcess
    public void onActivityLifecycleCallback(@Nullable Activity activity, @Nullable Bundle bundle, @NonNull String str) {
        if (activity != null && activity.getComponentName() != null) {
            String className = activity.getComponentName().getClassName();
            if (!TextUtils.isEmpty(className) && className.startsWith("com.tt.miniapp") && this.hostOptionDependRegister.getHostOptionLowPriorityDepend() != null) {
                this.hostOptionDependRegister.getHostOptionLowPriorityDepend().onActivityLifecycleCallback(activity, bundle, str);
            }
        }
    }

    @AnyProcess
    public boolean startImagePreviewActivity(@NonNull Activity activity, @Nullable String str, @Nullable List<String> list, int i) {
        return this.hostEssentialDepend.startImagePreviewActivity(activity, str, list, i);
    }

    @AnyProcess
    public void jumpToWebView(@NonNull Context context, String str, String str2, boolean z) {
        this.hostOptionDependRegister.getRouterDepend().jumpToWebView(context, str, str2, z);
    }

    @AnyProcess
    public void showActionSheet(@NonNull Context context, @Nullable String str, @Nullable String[] strArr, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback) {
        this.hostOptionDependRegister.getUiDepend().showActionSheet(context, str, strArr, nativeModuleCallback);
    }

    @AnyProcess
    public Dialog showPermissionDialog(@NonNull Activity activity, AppbrandPermissionType appbrandPermissionType, @NonNull String str, @NonNull IPermissionsResultAction iPermissionsResultAction) {
        return this.hostOptionDependRegister.getUiDepend().showPermissionDialog(activity, appbrandPermissionType, str, iPermissionsResultAction);
    }

    public void showRegionPickerView(@NonNull Activity activity, @Nullable String str, @Nullable String[] strArr, @NonNull HostOptionUiDepend.ExtendRegionPickerCallBack extendRegionPickerCallBack) {
        this.hostOptionDependRegister.getUiDepend().showRegionPickerView(activity, str, strArr, extendRegionPickerCallBack);
    }

    @AnyProcess
    public void chooseImage(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str) {
        this.hostOptionDependRegister.getMediaDepend().chooseImage(activity, i, z, z2, str);
    }

    @AnyProcess
    public void chooseVideo(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str) {
        this.hostOptionDependRegister.getMediaDepend().chooseVideo(activity, i, z, z2, str);
    }

    @AnyProcess
    public void showMultiPickerView(@NonNull Activity activity, @Nullable String str, @Nullable List<List<String>> list, @Nullable int[] iArr, @NonNull HostOptionUiDepend.ExtendMultiPickerCallBack extendMultiPickerCallBack) {
        this.hostOptionDependRegister.getUiDepend().showMultiPickerView(activity, str, list, iArr, extendMultiPickerCallBack);
    }

    @AnyProcess
    public void showPickerView(@NonNull Activity activity, @Nullable String str, int i, @NonNull List<String> list, @NonNull HostOptionUiDepend.ExtendNormalPickerCallBack<String> extendNormalPickerCallBack) {
        this.hostOptionDependRegister.getUiDepend().showPickerView(activity, str, i, list, extendNormalPickerCallBack);
    }

    @AnyProcess
    public void showToast(@NonNull Context context, @Nullable String str, @Nullable String str2, long j, @Nullable String str3) {
        this.hostOptionDependRegister.getUiDepend().showToast(context, str, str2, j, str3);
    }

    @AnyProcess
    public boolean openLocation(@NonNull Activity activity, @Nullable String str, @Nullable String str2, double d2, double d3, int i, @Nullable String str3) {
        return this.hostOptionDependRegister.getNormalDepend().openLocation(activity, str, str2, d2, d3, i, str3);
    }

    @AnyProcess
    public void showTimePickerView(@NonNull Activity activity, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, @NonNull HostOptionUiDepend.ExtendTimePickerCallBack<String> extendTimePickerCallBack) {
        this.hostOptionDependRegister.getUiDepend().showTimePickerView(activity, str, i, i2, i3, i4, i5, i6, extendTimePickerCallBack);
    }

    @AnyProcess
    public void showModal(@NonNull Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NonNull NativeModule.NativeModuleCallback<Integer> nativeModuleCallback) {
        this.hostOptionDependRegister.getUiDepend().showModal(context, str, str2, str3, z, str4, str5, str6, str7, nativeModuleCallback);
    }

    @AnyProcess
    public void showDatePickerView(@NonNull Activity activity, @Nullable String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NonNull HostOptionUiDepend.ExtendDatePickerCallBack<String> extendDatePickerCallBack) {
        this.hostOptionDependRegister.getUiDepend().showDatePickerView(activity, str, str2, i, i2, i3, i4, i5, i6, i7, i8, i9, extendDatePickerCallBack);
    }
}
