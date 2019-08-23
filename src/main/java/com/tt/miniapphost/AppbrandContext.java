package com.tt.miniapphost;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.excitingvideo.ExcitingVideoAd;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Schedulers;
import com.tt.miniapphost.entity.InitParamsEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.ext.HostOptionApiDepend;
import com.tt.option.ext.HostOptionNativeViewExtDepend;
import com.tt.option.menu.ITitleMenuItem;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppbrandContext {
    public static Handler mainHandler = new Handler(Looper.getMainLooper());
    private InitParamsEntity initParams;
    private HostOptionApiDepend.ExtApiHandlerCreator mApiHandlerCreator;
    private Application mApplicationContext;
    private Map<String, IAsyncHostDataHandler> mAsyncHandlerMap;
    private Activity mCurrentActivity;
    private WeakReference<Activity> mHostProcessTopActivityWr;
    boolean mIsGame;
    private boolean mIsMainProcess;
    private HostOptionNativeViewExtDepend.ExtNativeViewCreator mNativeViewCreator;
    private Map<String, ISyncHostDataHandler> mSyncHandlerMap;
    private List<ITitleMenuItem> mTitleMenuItem;

    static class Holder {
        static AppbrandContext sInstance = new AppbrandContext();

        Holder() {
        }
    }

    public static AppbrandContext getInst() {
        return Holder.sInstance;
    }

    @AnyProcess
    public Application getApplicationContext() {
        return this.mApplicationContext;
    }

    @MiniAppProcess
    public Activity getCurrentActivity() {
        return this.mCurrentActivity;
    }

    @AnyProcess
    public HostOptionApiDepend.ExtApiHandlerCreator getExtensionApiCreator() {
        return this.mApiHandlerCreator;
    }

    @MiniAppProcess
    public HostOptionNativeViewExtDepend.ExtNativeViewCreator getNativeViewCreator() {
        return this.mNativeViewCreator;
    }

    @MiniAppProcess
    public List<ITitleMenuItem> getTitleMenuItems() {
        return this.mTitleMenuItem;
    }

    @MiniAppProcess
    public boolean isGame() {
        return this.mIsGame;
    }

    @AnyProcess
    public boolean isMainProcess() {
        return this.mIsMainProcess;
    }

    @Nullable
    @HostProcess
    public Activity getHostProcessTopActivity() {
        if (this.mHostProcessTopActivityWr != null) {
            return (Activity) this.mHostProcessTopActivityWr.get();
        }
        return null;
    }

    private AppbrandContext() {
        this.mSyncHandlerMap = new HashMap();
        this.mAsyncHandlerMap = new HashMap();
    }

    @AnyProcess
    public InitParamsEntity getInitParams() {
        if (this.initParams != null || !AppBrandLogger.debug()) {
            return this.initParams;
        }
        throw new IllegalStateException("You must set init params");
    }

    @MiniAppProcess
    public void onCreate() {
        if (this.mApplicationContext != null || !AppBrandLogger.debug()) {
            AppbrandApplication inst = AppbrandApplication.getInst();
            if (inst != null) {
                inst.onCreate();
                return;
            }
            return;
        }
        throw new IllegalStateException("should call setApplicationContext first");
    }

    public boolean checkProcessCommunicationPermission() {
        if (this.mApplicationContext == null) {
            return false;
        }
        Application application = this.mApplicationContext;
        if (application.checkCallingOrSelfPermission(this.mApplicationContext.getPackageName() + ".miniapp.PROCESS_COMMUNICATION") == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getProcessCommunicationPermission() {
        if (this.mApplicationContext == null || !checkProcessCommunicationPermission()) {
            return null;
        }
        return this.mApplicationContext.getPackageName() + ".miniapp.PROCESS_COMMUNICATION";
    }

    @MiniAppProcess
    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
    }

    @AnyProcess
    public void setExtensionApiCreator(HostOptionApiDepend.ExtApiHandlerCreator extApiHandlerCreator) {
        this.mApiHandlerCreator = extApiHandlerCreator;
    }

    @MiniAppProcess
    public void setGame(boolean z) {
        this.mIsGame = z;
    }

    @AnyProcess
    public void setInitParams(InitParamsEntity initParamsEntity) {
        this.initParams = initParamsEntity;
    }

    @MiniAppProcess
    public void setNativeViewCreator(HostOptionNativeViewExtDepend.ExtNativeViewCreator extNativeViewCreator) {
        this.mNativeViewCreator = extNativeViewCreator;
    }

    @MiniAppProcess
    public void setTitleMenuItems(List<ITitleMenuItem> list) {
        this.mTitleMenuItem = list;
    }

    @AnyProcess
    public void setApplicationContext(Application application) {
        if (application != null) {
            this.mApplicationContext = application;
        }
    }

    @HostProcess
    public void setHostProcessTopActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.mHostProcessTopActivityWr = new WeakReference<>(activity);
        }
    }

    @Nullable
    @AnyProcess
    public IAsyncHostDataHandler getAsyncHandler(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mAsyncHandlerMap.get(str);
    }

    @Nullable
    @AnyProcess
    public ISyncHostDataHandler getSyncHandler(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mSyncHandlerMap.get(str);
    }

    public boolean isDataHandlerExist(@Nullable String str) {
        if (this.mSyncHandlerMap.containsKey(str) || this.mAsyncHandlerMap.containsKey(str)) {
            return true;
        }
        return false;
    }

    @AnyProcess
    private void initHostProcessDataHandler(@Nullable List<ISyncHostDataHandler> list, List<IAsyncHostDataHandler> list2) {
        if (list != null) {
            for (ISyncHostDataHandler next : list) {
                if (next != null) {
                    this.mSyncHandlerMap.put(next.getType(), next);
                }
            }
        }
        if (list2 != null) {
            for (IAsyncHostDataHandler next2 : list2) {
                if (next2 != null) {
                    this.mAsyncHandlerMap.put(next2.getType(), next2);
                }
            }
        }
    }

    @AnyProcess
    public static void init(final Application application, @NonNull final IAppbrandInitializer iAppbrandInitializer) {
        boolean z;
        if (application != null) {
            final String curProcessName = ProcessUtil.getCurProcessName(application);
            boolean isMainProcess = ProcessUtil.isMainProcess(application);
            if (curProcessName == null || !curProcessName.contains("miniapp")) {
                z = false;
            } else {
                z = true;
            }
            if (!isMainProcess && !z) {
                AppBrandLogger.d("AppbrandContext", "!isMainProcess && !isMiniAppProcess");
            } else if (isMainProcess) {
                Observable.create((Action) new Action() {
                    public final void act() {
                        try {
                            AppbrandContext.initSync(application, curProcessName, true, iAppbrandInitializer);
                        } catch (Exception e2) {
                            AppBrandLogger.e("AppbrandContext", "", e2);
                        }
                    }
                }).schudleOn(Schedulers.shortIO()).subscribeSimple();
            } else {
                initSync(application, curProcessName, false, iAppbrandInitializer);
            }
        }
    }

    @AnyProcess
    public static void initSync(Application application, String str, boolean z, @NonNull IAppbrandInitializer iAppbrandInitializer) {
        getInst().mIsMainProcess = z;
        getInst().setApplicationContext(application);
        HostDependManager.getInst().setHostDepend(iAppbrandInitializer.createEssentialDepend(), iAppbrandInitializer.createOptionDepend());
        AppBrandLogger.registerLogger(HostDependManager.getInst().createLogger());
        AppBrandLogger.updateDebugState(application, iAppbrandInitializer);
        getInst().setInitParams(HostDependManager.getInst().createInitParams());
        getInst().initHostProcessDataHandler(HostDependManager.getInst().createSyncHostDataHandlerList(), HostDependManager.getInst().createAsyncHostDataHandlerList());
        if (z) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public final void onActivityDestroyed(Activity activity) {
                    AppBrandLogger.d("AppbrandContext", "onActivityDestroyed");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, null, "onDestroy");
                }

                public final void onActivityPaused(Activity activity) {
                    AppbrandContext.getInst().setHostProcessTopActivity(activity);
                    AppBrandLogger.d("AppbrandContext", "onActivityPaused");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, null, "onPause");
                }

                public final void onActivityResumed(Activity activity) {
                    AppBrandLogger.d("AppbrandContext", "onActivityResumed");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, null, "onResume");
                }

                public final void onActivityStarted(Activity activity) {
                    AppbrandContext.getInst().setHostProcessTopActivity(activity);
                    AppBrandLogger.d("AppbrandContext", "onActivityStarted");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, null, "onStart");
                }

                public final void onActivityStopped(Activity activity) {
                    AppBrandLogger.d("AppbrandContext", "onActivityStopped");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, null, "onStop");
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    AppBrandLogger.d("AppbrandContext", "onActivityCreated");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, bundle, "onCreate");
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    AppBrandLogger.d("AppbrandContext", "onActivitySaveInstanceState");
                    HostDependManager.getInst().onActivityLifecycleCallback(activity, bundle, "onSaveInstanceState");
                }
            });
        } else {
            getInst().setTitleMenuItems(HostDependManager.getInst().createTitleMenuItems());
            HostOptionNativeViewExtDepend.ExtNativeViewCreator createNativeView = HostDependManager.getInst().createNativeView();
            if (createNativeView != null) {
                getInst().setNativeViewCreator(createNativeView);
            }
            getInst().onCreate();
            if (HostDependManager.getInst().isHostSupportAdFeature()) {
                ExcitingVideoAd.init(HostDependManager.getInst().getINetworkListener(), HostDependManager.getInst().getIImageLoadFactory(), HostDependManager.getInst().getIDownloadListener(), HostDependManager.getInst().getIOpenWebListener(), HostDependManager.getInst().getIAdEventListener());
            }
        }
        AppDownloader.getInstance().init(getInst().getApplicationContext(), getInst().getInitParams().getHostStr(1006, "com.peive.download.file_provider"));
        HostOptionApiDepend.ExtApiHandlerCreator createExtHandler = HostDependManager.getInst().createExtHandler();
        if (createExtHandler != null) {
            getInst().setExtensionApiCreator(createExtHandler);
        }
        iAppbrandInitializer.init(application, str, z);
        if (z) {
            mainHandler.postDelayed(new Runnable() {
                public final void run() {
                    AppbrandHostConstants.getBundleManager().checkUpdateBaseBundle(AppbrandContext.getInst().getApplicationContext(), true);
                }
            }, HostDependManager.getInst().getSettingsRequestDelayTime());
            return;
        }
        try {
            Class.forName("com.tt.miniapp.MiniAppInitializer").getMethod("initInMiniAppProcess", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            AppBrandLogger.e("AppbrandContext", "initInMiniAppProcess", e2);
        }
    }
}
