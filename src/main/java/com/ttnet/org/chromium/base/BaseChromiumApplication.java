package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ttnet.org.chromium.base.annotations.SuppressFBWarnings;
import com.ttnet.org.chromium.base.multidex.ChromiumMultiDexInstaller;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class BaseChromiumApplication extends Application {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mShouldInitializeApplicationStatusTracking;
    public ObserverList<WindowFocusChangedListener> mWindowFocusListeners;

    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(Activity activity, boolean z);
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                System.exit(i);
                return;
            }
            throw new RuntimeException("Process killed, status is " + i);
        }
    }

    class WindowCallbackProxy implements InvocationHandler {
        private final Activity mActivity;
        private final Window.Callback mCallback;

        public void onWindowFocusChanged(boolean z) {
            this.mCallback.onWindowFocusChanged(z);
            Iterator it2 = BaseChromiumApplication.this.mWindowFocusListeners.iterator();
            while (it2.hasNext()) {
                ((WindowFocusChangedListener) it2.next()).onWindowFocusChanged(this.mActivity, z);
            }
        }

        public WindowCallbackProxy(Activity activity, Window.Callback callback) {
            this.mCallback = callback;
            this.mActivity = activity;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (!method.getName().equals("onWindowFocusChanged") || objArr.length != 1 || !(objArr[0] instanceof Boolean)) {
                try {
                    return method.invoke(this.mCallback, objArr);
                } catch (InvocationTargetException e2) {
                    if (e2.getCause() instanceof AbstractMethodError) {
                        throw e2.getCause();
                    }
                    throw e2;
                }
            } else {
                onWindowFocusChanged(objArr[0].booleanValue());
                return null;
            }
        }
    }

    public void initCommandLine() {
    }

    public BaseChromiumApplication() {
        this(true);
    }

    private void startTrackingApplicationStatus() {
        ApplicationStatus.initialize(this);
        registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
            }

            public void onActivityResumed(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
            }

            public void onActivityStopped(Activity activity) {
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                Window.Callback callback = activity.getWindow().getCallback();
                activity.getWindow().setCallback((Window.Callback) java.lang.reflect.Proxy.newProxyInstance(Window.Callback.class.getClassLoader(), new Class[]{Window.Callback.class}, new WindowCallbackProxy(activity, callback)));
            }
        });
    }

    public void onCreate() {
        super.onCreate();
        if (this.mShouldInitializeApplicationStatusTracking) {
            startTrackingApplicationStatus();
        }
    }

    @SuppressFBWarnings({"DM_EXIT"})
    private void checkAppBeingReplaced() {
        if (getResources() == null) {
            Log.e("base", "getResources() null, closing app.", new Object[0]);
            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(0);
        }
    }

    public void registerWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        this.mWindowFocusListeners.addObserver(windowFocusChangedListener);
    }

    public void unregisterWindowFocusChangedListener(WindowFocusChangedListener windowFocusChangedListener) {
        this.mWindowFocusListeners.removeObserver(windowFocusChangedListener);
    }

    protected BaseChromiumApplication(boolean z) {
        this.mWindowFocusListeners = new ObserverList<>();
        this.mShouldInitializeApplicationStatusTracking = z;
    }

    @VisibleForTesting
    public static void initCommandLine(Context context) {
        ((BaseChromiumApplication) context.getApplicationContext()).initCommandLine();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        checkAppBeingReplaced();
        ChromiumMultiDexInstaller.install(this);
    }
}
