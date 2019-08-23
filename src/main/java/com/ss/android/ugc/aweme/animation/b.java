package com.ss.android.ugc.aweme.animation;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

public final class b implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33363a;

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f33363a, false, 21681, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f33363a, false, 21681, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f33363a, false, 21682, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.singletonList(new AnimatedReactImageManager());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f33363a, false, 21682, new Class[]{ReactApplicationContext.class}, List.class);
    }
}
