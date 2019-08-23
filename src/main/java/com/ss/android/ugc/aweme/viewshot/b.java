package com.ss.android.ugc.aweme.viewshot;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class b implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76543a;

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f76543a, false, 89764, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f76543a, false, 89764, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        if (PatchProxy.isSupport(new Object[]{reactApplicationContext2}, this, f76543a, false, 89762, new Class[]{ReactApplicationContext.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext2}, this, f76543a, false, 89762, new Class[]{ReactApplicationContext.class}, List.class);
        }
        return Arrays.asList(new NativeModule[]{new RNViewShotModule(reactApplicationContext2)});
    }
}
