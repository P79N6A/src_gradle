package com.ttnet.org.chromium.base;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.ttnet.org.chromium.base.LifeCycleMonitor;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;

@JNINamespace("base::android")
public class PowerMonitor implements LifeCycleMonitor.AppStateListener {
    public static String CRONET_ACTION_BACK = null;
    public static String CRONET_ACTION_FORE = null;
    private static final String TAG = "PowerMonitor";
    public static String WSCHANNEL_ACTION_BACK;
    public static String WSCHANNEL_ACTION_FORE;
    private static Context mContext;
    private static LifeCycleMonitor mLifeCycleMonitor = new LifeCycleMonitor();
    public static long receive_back_action = 0;
    public static long receive_fore_action = 0;
    private static AppStateReceiver receiver;
    private static PowerMonitor sInstance;
    private final Handler mHandler;
    private boolean mIsBatteryPower;

    public static class AppStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.CRONET_ACTION_FORE) || action.equals(PowerMonitor.WSCHANNEL_ACTION_FORE)) {
                PowerMonitor.receive_fore_action = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.receive_fore_action > 10000) {
                    PowerMonitor.nativeOnResume();
                }
                return;
            }
            if (action.equals(PowerMonitor.CRONET_ACTION_BACK) || action.equals(PowerMonitor.WSCHANNEL_ACTION_BACK)) {
                PowerMonitor.receive_back_action = currentTimeMillis;
                if (currentTimeMillis - PowerMonitor.receive_back_action > 10000) {
                    PowerMonitor.nativeOnSuspend();
                }
            }
        }
    }

    static class LazyHolder {
        public static final PowerMonitor INSTANCE = new PowerMonitor();

        private LazyHolder() {
        }
    }

    private static native void nativeOnBatteryChargingChanged();

    public static native void nativeOnResume();

    public static native void nativeOnSuspend();

    @CalledByNative
    private static boolean isBatteryPower() {
        return sInstance.mIsBatteryPower;
    }

    private PowerMonitor() {
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public void onEnterToBackground() {
        if (ProcessUtils.isMainProcess(mContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_BACK);
            mContext.sendBroadcast(intent);
        }
        nativeOnSuspend();
    }

    public void onEnterToForeground() {
        if (ProcessUtils.isMainProcess(mContext)) {
            Intent intent = new Intent();
            intent.setAction(CRONET_ACTION_FORE);
            mContext.sendBroadcast(intent);
        }
        nativeOnResume();
    }

    public static void createForTests(Context context) {
        sInstance = LazyHolder.INSTANCE;
    }

    public static void onBatteryChargingChanged(Intent intent) {
        if (sInstance != null) {
            int intExtra = intent.getIntExtra("plugged", -1);
            PowerMonitor powerMonitor = sInstance;
            boolean z = true;
            if (intExtra == 2 || intExtra == 1) {
                z = false;
            }
            powerMonitor.mIsBatteryPower = z;
            nativeOnBatteryChargingChanged();
        }
    }

    public static void create(Context context) {
        mContext = context.getApplicationContext();
        CRONET_ACTION_BACK = mContext.getPackageName() + ".cronet.APP_BACKGROUND";
        CRONET_ACTION_FORE = mContext.getPackageName() + ".cronet.APP_FOREGROUND";
        WSCHANNEL_ACTION_BACK = mContext.getPackageName() + ".wschannel.APP_BACKGROUND";
        WSCHANNEL_ACTION_FORE = mContext.getPackageName() + ".wschannel.APP_FOREGROUND";
        if (sInstance == null) {
            sInstance = LazyHolder.INSTANCE;
            Intent registerReceiver = mContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                onBatteryChargingChanged(registerReceiver);
            }
            if (ProcessUtils.isMainProcess(mContext)) {
                mLifeCycleMonitor.setAppStateChangedListener(sInstance);
                ((Application) mContext).registerActivityLifecycleCallbacks(mLifeCycleMonitor);
                return;
            }
            receiver = new AppStateReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(CRONET_ACTION_BACK);
            intentFilter.addAction(CRONET_ACTION_FORE);
            intentFilter.addAction(WSCHANNEL_ACTION_BACK);
            intentFilter.addAction(WSCHANNEL_ACTION_FORE);
            mContext.registerReceiver(receiver, intentFilter);
        }
    }
}
