package com.ss.android.ugc.aweme.fastimage;

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
    public static ChangeQuickRedirect f44172a;

    /* renamed from: b  reason: collision with root package name */
    private String f44173b;

    public b(String str) {
        this.f44173b = str;
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext2}, this, f44172a, false, 39344, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.singletonList(new FastImageViewModule(reactApplicationContext2));
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext2}, this, f44172a, false, 39344, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f44172a, false, 39345, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.singletonList(new TTReactImageManager());
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f44172a, false, 39345, new Class[]{ReactApplicationContext.class}, List.class);
    }
}
