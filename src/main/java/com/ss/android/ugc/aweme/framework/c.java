package com.ss.android.ugc.aweme.framework;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.bridge.RNBridgeModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48476a;

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f48476a, false, 45831, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f48476a, false, 45831, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        if (PatchProxy.isSupport(new Object[]{reactApplicationContext2}, this, f48476a, false, 45830, new Class[]{ReactApplicationContext.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext2}, this, f48476a, false, 45830, new Class[]{ReactApplicationContext.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNBridgeModule(reactApplicationContext2));
        List<NativeModule> a2 = ReactInstance.getConfig().a(reactApplicationContext2);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        return arrayList;
    }
}
