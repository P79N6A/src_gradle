package com.ss.android.ugc.aweme.framework;

import android.app.Application;
import android.text.TextUtils;
import com.dylanvann.fastimage1.g;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.animation.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class a extends ReactNativeHost implements NativeModuleCallExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48450a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Object> f48451b;

    /* renamed from: c  reason: collision with root package name */
    public RNDegradeExceptionHandler f48452c;

    /* renamed from: d  reason: collision with root package name */
    public String f48453d = "";

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.framework.b.a f48454e = ReactInstance.getConfig();

    public boolean getUseDeveloperSupport() {
        return false;
    }

    public RNDegradeExceptionHandler getDegradeExceptionHandler() {
        return this.f48452c;
    }

    @Nullable
    public String getBundleAssetName() {
        if (!PatchProxy.isSupport(new Object[0], this, f48450a, false, 45828, new Class[0], String.class)) {
            return this.f48454e.h();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45828, new Class[0], String.class);
    }

    @Nullable
    public String getJSBundleFile() {
        if (!PatchProxy.isSupport(new Object[0], this, f48450a, false, 45826, new Class[0], String.class)) {
            return ReactInstance.getProxy().a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45826, new Class[0], String.class);
    }

    public String getJSMainModuleName() {
        if (!PatchProxy.isSupport(new Object[0], this, f48450a, false, 45824, new Class[0], String.class)) {
            return this.f48454e.i();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45824, new Class[0], String.class);
    }

    public List<ReactPackage> getPackages() {
        ReactPackage reactPackage;
        if (PatchProxy.isSupport(new Object[0], this, f48450a, false, 45822, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45822, new Class[0], List.class);
        }
        MainPackageConfig.Builder builder = new MainPackageConfig.Builder();
        builder.setFrescoConfig(this.f48454e.f());
        ReactPackage[] reactPackageArr = new ReactPackage[9];
        reactPackageArr[0] = new com.ss.android.ugc.aweme.lineargradient.a();
        reactPackageArr[1] = new MainReactPackage(builder.build());
        reactPackageArr[2] = new c();
        reactPackageArr[3] = new com.ss.android.ugc.aweme.iconfont.a();
        reactPackageArr[4] = new b();
        reactPackageArr[5] = new com.airbnb.android.react.lottie.a();
        reactPackageArr[6] = new com.brentvatne.react.a();
        if (this.f48454e.d()) {
            reactPackage = new com.ss.android.ugc.aweme.fastimage.b("FrescoFastImage");
        } else {
            reactPackage = new g();
        }
        reactPackageArr[7] = reactPackage;
        reactPackageArr[8] = new com.ss.android.ugc.aweme.viewshot.b();
        ArrayList arrayList = new ArrayList(Arrays.asList(reactPackageArr));
        if (this.f48454e.a() != null && this.f48454e.a().size() > 0) {
            arrayList.addAll(this.f48454e.a());
        }
        return arrayList;
    }

    public ReactInstanceManager createReactInstanceManager() {
        LifecycleState lifecycleState;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f48450a, false, 45823, new Class[0], ReactInstanceManager.class)) {
            return (ReactInstanceManager) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45823, new Class[0], ReactInstanceManager.class);
        }
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        ReactInstanceManagerBuilder nativeModuleCallExceptionHandler = ReactInstanceManager.builder().setApplication(getApplication()).setJSMainModulePath(getJSMainModuleName()).setUseDeveloperSupport(getUseDeveloperSupport()).setRedBoxHandler(getRedBoxHandler()).setJavaScriptExecutorFactory(getJavaScriptExecutorFactory()).setUIImplementationProvider(getUIImplementationProvider()).setJSIModulesProvider(getJSIModulesProvider()).setNativeModuleCallExceptionHandler(this);
        if (PatchProxy.isSupport(new Object[0], this, f48450a, false, 45825, new Class[0], LifecycleState.class)) {
            lifecycleState = (LifecycleState) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45825, new Class[0], LifecycleState.class);
        } else {
            lifecycleState = this.f48454e.g();
        }
        ReactInstanceManagerBuilder degradeExceptionHandler = nativeModuleCallExceptionHandler.setInitialLifecycleState(lifecycleState).setDegradeExceptionHandler(getDegradeExceptionHandler());
        for (ReactPackage addPackage : getPackages()) {
            degradeExceptionHandler.addPackage(addPackage);
        }
        if (PatchProxy.isSupport(new Object[0], this, f48450a, false, 45827, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f48450a, false, 45827, new Class[0], String.class);
        } else {
            str = ReactInstance.getProxy().b();
        }
        String jSBundleFile = getJSBundleFile();
        if (this.f48454e == null || !this.f48454e.c()) {
            if (!TextUtils.isEmpty(jSBundleFile)) {
                degradeExceptionHandler.setSplitCommonBundleFile(jSBundleFile, RNJavaScriptRuntime.SplitCommonType.SPLIT_COMMONJS);
            } else {
                degradeExceptionHandler.setSplitCommonType(RNJavaScriptRuntime.SplitCommonType.SPLIT_COMMONJS);
            }
        } else if (!TextUtils.isEmpty(str)) {
            degradeExceptionHandler.setSplitCommonBundleFile(str, RNJavaScriptRuntime.SplitCommonType.SPLIT_SNAPSHOT);
        } else if (!TextUtils.isEmpty(jSBundleFile)) {
            degradeExceptionHandler.setSplitCommonBundleFile(jSBundleFile, RNJavaScriptRuntime.SplitCommonType.SPLIT_COMMONJS);
        } else {
            degradeExceptionHandler.setSplitCommonType(RNJavaScriptRuntime.SplitCommonType.SPLIT_SNAPSHOT);
        }
        ReactInstanceManager prebuild = degradeExceptionHandler.prebuild();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return prebuild;
    }

    public a(Application application) {
        super(application);
    }

    public void handleException(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f48450a, false, 45829, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f48450a, false, 45829, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        ReactInstance.getProxy().a(exc2, this.f48451b);
    }
}
