package com.tt.miniapphost;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.tt.frontendapiinterface.ApiHandlerManager;
import com.tt.miniapphost.placeholder.MiniappReceiver0;
import com.tt.miniapphost.placeholder.MiniappReceiver1;
import com.tt.miniapphost.placeholder.MiniappReceiver2;
import com.tt.miniapphost.placeholder.MiniappReceiver3;
import com.tt.miniapphost.placeholder.MiniappReceiver4;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.base.MiniappHostReceiver;
import com.tt.miniapphost.util.ProcessUtil;

@MiniAppProcess
public class MiniappHostBase extends FragmentActivity {
    private int appType = 1;
    private boolean isAnimaStarted;
    private boolean isInLockMode;
    private boolean isTransluent = true;
    protected IActivityProxy mActivityProxy;
    private int mDefaultFragmentBackground;
    private MiniappHostReceiver receiver;

    @Nullable
    public IActivityProxy getActivityProxy() {
        return this.mActivityProxy;
    }

    public int getDefaultFragmentBackground() {
        return this.mDefaultFragmentBackground;
    }

    public boolean isAnimaStarted() {
        return this.isAnimaStarted;
    }

    public boolean isInLockMode() {
        return this.isInLockMode;
    }

    public boolean isTransluent() {
        return this.isTransluent;
    }

    public void finish() {
        super.finish();
        AppBrandLogger.d("MiniappHostBase", "finish");
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public String getRealActivityClassName() {
        switch (this.appType) {
            case 1:
                return "com.tt.miniapp.TTAppbrandTabUI";
            case 2:
                return "com.tt.miniapp.game.TTAppbrandGameActivity";
            default:
                return "com.tt.miniapp.TTAppbrandTabUI";
        }
    }

    public View getSwipeBackLayout() {
        AppBrandLogger.d("MiniappHostBase", "onBackPressed");
        if (this.mActivityProxy != null) {
            return this.mActivityProxy.getSwipeBackLayout();
        }
        return null;
    }

    public void onBackPressed() {
        AppBrandLogger.d("MiniappHostBase", "onBackPressed");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onBackPressed();
        }
    }

    public void onPause() {
        super.onPause();
        AppBrandLogger.d("MiniappHostBase", "onPause");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onPause();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        AppBrandLogger.d("MiniappHostBase", "onRestart");
    }

    public void onResume() {
        super.onResume();
        AppBrandLogger.d("MiniappHostBase", "onResume");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onResume();
        }
    }

    public void onStart() {
        super.onStart();
        AppBrandLogger.d("MiniappHostBase", "onStart");
    }

    public void onStop() {
        super.onStop();
        AppBrandLogger.d("MiniappHostBase", "onStop");
    }

    public boolean swipeBackPriority() {
        if (this.mActivityProxy != null) {
            return this.mActivityProxy.swipeBackPriority();
        }
        if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public void createRealActivity() throws Exception {
        this.mActivityProxy = (IActivityProxy) Class.forName(getRealActivityClassName()).getDeclaredConstructor(new Class[]{FragmentActivity.class}).newInstance(new Object[]{this});
    }

    public void onDestroy() {
        super.onDestroy();
        AppBrandLogger.d("MiniappHostBase", "onDestroy");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onDestroy();
        }
        ActivityContainer.getInst().removeActivity(this);
        AppbrandContext inst = AppbrandContext.getInst();
        if (inst != null && inst.getCurrentActivity() == this) {
            inst.setCurrentActivity(null);
        }
        if (this.receiver != null) {
            unregisterReceiver(this.receiver);
        }
        ProcessUtil.killCurrentMiniAppProcess();
    }

    @MiniAppProcess
    public void registeBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        String processFlag = ProcessUtil.getProcessFlag();
        if (!TextUtils.isEmpty(processFlag)) {
            char c2 = 65535;
            switch (processFlag.hashCode()) {
                case -1359418618:
                    if (processFlag.equals("miniapp0")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1359418617:
                    if (processFlag.equals("miniapp1")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1359418616:
                    if (processFlag.equals("miniapp2")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1359418615:
                    if (processFlag.equals("miniapp3")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1359418614:
                    if (processFlag.equals("miniapp4")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.receiver = new MiniappReceiver0();
                    intentFilter.addAction("com.receiver.appbrand0");
                    break;
                case 1:
                    this.receiver = new MiniappReceiver1();
                    intentFilter.addAction("com.receiver.appbrand1");
                    break;
                case 2:
                    this.receiver = new MiniappReceiver2();
                    intentFilter.addAction("com.receiver.appbrand2");
                    break;
                case 3:
                    this.receiver = new MiniappReceiver3();
                    intentFilter.addAction("com.receiver.appbrand3");
                    break;
                case 4:
                    this.receiver = new MiniappReceiver4();
                    intentFilter.addAction("com.receiver.appbrand4");
                    break;
            }
        }
        if (this.receiver != null) {
            registerReceiver(this.receiver, intentFilter, AppbrandContext.getInst().getProcessCommunicationPermission(), null);
        }
    }

    public void setAnimaStarted(boolean z) {
        this.isAnimaStarted = z;
    }

    public void setDefaultFragmentBackground(@DrawableRes int i) {
        this.mDefaultFragmentBackground = i;
    }

    public void setInLockMode(boolean z) {
        this.isInLockMode = z;
    }

    public void setTransluent(boolean z) {
        this.isTransluent = z;
    }

    @MiniAppProcess
    private void handleIntent(Intent intent) {
        if (intent != null) {
            this.appType = intent.getIntExtra("app_type", 1);
        }
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onPostCreate(bundle);
        }
    }

    public void setSwipeBackEnable(boolean z) {
        if (this.mActivityProxy != null) {
            this.mActivityProxy.setSwipeBackEnable(z);
        }
    }

    public View findViewById(int i) {
        if (this.mActivityProxy == null) {
            return super.findViewById(i);
        }
        if (this.mActivityProxy.findViewById(i) == null) {
            return super.findViewById(i);
        }
        return this.mActivityProxy.findViewById(i);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AppBrandLogger.d("MiniappHostBase", "onNewIntent");
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onNewIntent(intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppBrandLogger.d("MiniappHostBase", "onCreate");
        handleIntent(getIntent());
        ActivityContainer.getInst().addActivity(this);
        AppbrandContext inst = AppbrandContext.getInst();
        if (inst != null) {
            inst.setCurrentActivity(this);
        }
        try {
            createRealActivity();
            this.mActivityProxy.checkNotchInScreen();
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "MiniappHostBase", e2.getStackTrace());
            this.mActivityProxy = null;
        }
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onCreate(bundle);
        }
        registeBroadcast();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.mActivityProxy != null) {
            this.mActivityProxy.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityProxy == null || !this.mActivityProxy.onActivityResult(i, i2, intent)) {
            ApiHandlerManager.getInst().unRegisterActivityResultAllHandler();
            super.onActivityResult(i, i2, intent);
            return;
        }
        ApiHandlerManager.getInst().unRegisterActivityResultAllHandler();
    }
}
