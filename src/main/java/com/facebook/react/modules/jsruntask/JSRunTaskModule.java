package com.facebook.react.modules.jsruntask;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.lang.reflect.Method;

@DoNotStrip
@ReactModule(name = "JSRunTask")
public final class JSRunTaskModule extends ReactContextBaseJavaModule {
    public final String getName() {
        return "JSRunTask";
    }

    public JSRunTaskModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public final void runJs(String str) {
        if (str != null) {
            CatalystInstance catalystInstance = getReactApplicationContext().getCatalystInstance();
            if (catalystInstance != null) {
                catalystInstance.loadJavaScript(catalystInstance.getSourceURL(), str, false);
            }
        }
    }

    @ReactMethod
    public final void runJsFromAssets(String str) {
        if (str != null && str.startsWith("assets")) {
            loadScriptFromAsset(getReactApplicationContext().getApplicationContext(), getReactApplicationContext().getCatalystInstance(), str);
        }
    }

    @ReactMethod
    public final void runJsFromFile(String str) {
        if (str != null) {
            try {
                if (!str.startsWith("/")) {
                    String mainJsBundlePath = getReactApplicationContext().getCatalystInstance().getMainJsBundlePath();
                    if (mainJsBundlePath != null) {
                        if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                            str = str.substring(1);
                        }
                        if (new File(mainJsBundlePath + str).exists()) {
                            CatalystInstance catalystInstance = getReactApplicationContext().getCatalystInstance();
                            loadScriptFromFile(catalystInstance, mainJsBundlePath + str);
                        }
                    }
                } else if (new File(str).exists()) {
                    loadScriptFromFile(getReactApplicationContext().getCatalystInstance(), str);
                }
            } catch (Exception unused) {
            }
        }
    }

    private boolean loadScriptFromFile(CatalystInstance catalystInstance, String str) {
        Class<CatalystInstanceImpl> cls = CatalystInstanceImpl.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("loadScriptFromFile", new Class[]{String.class, String.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(catalystInstance, new Object[]{str, str, Boolean.FALSE});
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean loadScriptFromAsset(Context context, CatalystInstance catalystInstance, String str) {
        Class<CatalystInstanceImpl> cls = CatalystInstanceImpl.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("loadScriptFromAssets", new Class[]{AssetManager.class, String.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(catalystInstance, new Object[]{context.getAssets(), str, Boolean.FALSE});
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
