package com.tt.miniapphost;

import android.os.Handler;
import android.os.Looper;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.frontendapiinterface.IRuntime;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.SDKBuildConfigEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AppbrandApplication {
    private static AppbrandApplication sRealAppbrandApplication;
    private IActivityLife mActivityLife;
    private AppInfoEntity mAppInfo;
    private String mAppInstallPath;
    private String mCurrentPagePath;
    private String mCurrentPageType;
    private int mCurrentWebViewId;
    protected List<ILifecycleObserver> mObservers = new CopyOnWriteArrayList();
    private String mSchema;
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private AppInfoEntity updateAppInfo;

    @MiniAppProcess
    public interface ILifecycleObserver {
        @MiniAppProcess
        void onHide();

        @MiniAppProcess
        void onShow();
    }

    @MiniAppProcess
    public abstract void execJsInCurrentThread(String str);

    @MiniAppProcess
    public abstract void executeInGLThread(Runnable runnable);

    @MiniAppProcess
    public abstract void executeInJsThread(Runnable runnable);

    @MiniAppProcess
    public abstract void executeScript(String str);

    @MiniAppProcess
    public abstract SDKBuildConfigEntity getBuildConfig();

    @MiniAppProcess
    public abstract String getCurrentPage();

    @MiniAppProcess
    public abstract IJsBridge getJsBridge();

    @MiniAppProcess
    public abstract IRuntime getRuntime();

    @MiniAppProcess
    public abstract void invokeHandler(int i, int i2, String str);

    @MiniAppProcess
    public abstract void onCreate();

    @MiniAppProcess
    public void onDrawFrame() {
    }

    @MiniAppProcess
    public abstract void publish(int i, String str, String str2);

    @MiniAppProcess
    public IActivityLife getActivityLife() {
        return this.mActivityLife;
    }

    @MiniAppProcess
    public AppInfoEntity getAppInfo() {
        return this.mAppInfo;
    }

    @MiniAppProcess
    public String getAppInstallPath() {
        return this.mAppInstallPath;
    }

    @MiniAppProcess
    public String getCurrentPagePath() {
        return this.mCurrentPagePath;
    }

    @MiniAppProcess
    public String getCurrentPageType() {
        return this.mCurrentPageType;
    }

    @MiniAppProcess
    public int getCurrentWebViewId() {
        return this.mCurrentWebViewId;
    }

    @AnyProcess
    public Handler getMainHandler() {
        return this.mainHandler;
    }

    @MiniAppProcess
    public String getSchema() {
        return this.mSchema;
    }

    @MiniAppProcess
    public AppInfoEntity getUpdateAppInfo() {
        return this.updateAppInfo;
    }

    @AnyProcess
    public static synchronized AppbrandApplication getInst() {
        AppbrandApplication appbrandApplication;
        synchronized (AppbrandApplication.class) {
            if (sRealAppbrandApplication == null) {
                try {
                    sRealAppbrandApplication = (AppbrandApplication) Class.forName("com.tt.miniapp.AppbrandApplicationImpl").getDeclaredMethod("getInst", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e2) {
                    AppBrandLogger.stacktrace(6, "AppbrandApplication", e2.getStackTrace());
                }
            }
            appbrandApplication = sRealAppbrandApplication;
        }
        return appbrandApplication;
    }

    @MiniAppProcess
    public String getRequestRefer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("https://tmaservice.developer.toutiao.com");
        if (!(this.mAppInfo == null || this.mAppInfo.appId == null || this.mAppInfo.version == null)) {
            stringBuffer.append("?appid=");
            stringBuffer.append(this.mAppInfo.appId);
            stringBuffer.append("&version=");
            stringBuffer.append(this.mAppInfo.version);
        }
        return stringBuffer.toString();
    }

    @MiniAppProcess
    public void setActivityLife(IActivityLife iActivityLife) {
        this.mActivityLife = iActivityLife;
    }

    @MiniAppProcess
    public void setAppInstallPath(String str) {
        this.mAppInstallPath = str;
    }

    @MiniAppProcess
    public void setCurrentPagePath(String str) {
        this.mCurrentPagePath = str;
    }

    @MiniAppProcess
    public void setCurrentPageType(String str) {
        this.mCurrentPageType = str;
    }

    @MiniAppProcess
    public void setCurrentWebViewId(int i) {
        this.mCurrentWebViewId = i;
    }

    @MiniAppProcess
    public void setSchema(String str) {
        this.mSchema = str;
    }

    @MiniAppProcess
    public void setUpdateAppInfo(AppInfoEntity appInfoEntity) {
        this.updateAppInfo = appInfoEntity;
    }

    @MiniAppProcess
    public void registerLifecycleObserver(ILifecycleObserver iLifecycleObserver) {
        this.mObservers.add(iLifecycleObserver);
    }

    @MiniAppProcess
    public void setAppInfo(AppInfoEntity appInfoEntity) {
        this.mAppInfo = appInfoEntity;
        this.mAppInfo.parseDomain();
    }

    @MiniAppProcess
    public void ungisterLifecycleObserver(ILifecycleObserver iLifecycleObserver) {
        this.mObservers.remove(iLifecycleObserver);
    }
}
