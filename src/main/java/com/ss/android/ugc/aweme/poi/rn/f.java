package com.ss.android.ugc.aweme.poi.rn;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

public final class f implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60307a;

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f60307a, false, 65676, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f60307a, false, 65676, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f60307a, false, 65677, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.singletonList(new VideoViewManager());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f60307a, false, 65677, new Class[]{ReactApplicationContext.class}, List.class);
    }
}
