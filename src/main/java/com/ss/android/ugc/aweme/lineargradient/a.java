package com.ss.android.ugc.aweme.lineargradient;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

public final class a implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53155a;

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f53155a, false, 55338, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f53155a, false, 55338, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f53155a, false, 55339, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.singletonList(new LinearGradientManager());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f53155a, false, 55339, new Class[]{ReactApplicationContext.class}, List.class);
    }
}
