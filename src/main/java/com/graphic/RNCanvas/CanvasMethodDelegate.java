package com.graphic.RNCanvas;

import com.facebook.common.logging.FLog;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CanvasMethodDelegate {
    private final String TAG = "CanvasMethodDelegate";
    private final HashMap<String, CanvasMethodWrapper> mMethods;
    private final Class mModuleClass;

    private void findMethods() {
        for (Method canvasMethodWrapper : this.mModuleClass.getDeclaredMethods()) {
            CanvasMethodWrapper canvasMethodWrapper2 = new CanvasMethodWrapper(canvasMethodWrapper);
            this.mMethods.put(canvasMethodWrapper2.getName(), canvasMethodWrapper2);
        }
    }

    public CanvasMethodDelegate(Class cls) {
        this.mModuleClass = cls;
        this.mMethods = new HashMap<>();
        findMethods();
    }

    public void invoke(Object obj, String str, Object[] objArr) {
        CanvasMethodWrapper canvasMethodWrapper = this.mMethods.get(str);
        if (canvasMethodWrapper != null) {
            canvasMethodWrapper.invoke(obj, objArr);
            return;
        }
        FLog.w("CanvasMethodDelegate", "Could not find method " + str);
    }
}
