package com.ss.android.ugc.aweme.iconfont;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a implements ReactPackage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29727a;

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (!PatchProxy.isSupport(new Object[]{reactApplicationContext}, this, f29727a, false, 49955, new Class[]{ReactApplicationContext.class}, List.class)) {
            return Collections.emptyList();
        }
        return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext}, this, f29727a, false, 49955, new Class[]{ReactApplicationContext.class}, List.class);
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        if (PatchProxy.isSupport(new Object[]{reactApplicationContext2}, this, f29727a, false, 49954, new Class[]{ReactApplicationContext.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{reactApplicationContext2}, this, f29727a, false, 49954, new Class[]{ReactApplicationContext.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VectorIconsModule(reactApplicationContext2));
        return arrayList;
    }
}
