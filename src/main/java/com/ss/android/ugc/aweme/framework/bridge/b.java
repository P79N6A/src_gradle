package com.ss.android.ugc.aweme.framework.bridge;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48473a;

    /* renamed from: b  reason: collision with root package name */
    public static Map<ReactContext, b> f48474b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, a> f48475c = new HashMap<>();

    public static b a(ReactContext reactContext) {
        ReactContext reactContext2 = reactContext;
        if (PatchProxy.isSupport(new Object[]{reactContext2}, null, f48473a, true, 45889, new Class[]{ReactContext.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{reactContext2}, null, f48473a, true, 45889, new Class[]{ReactContext.class}, b.class);
        } else if (reactContext2 != null) {
            b bVar = f48474b.get(reactContext2);
            if (bVar == null) {
                bVar = new b();
                f48474b.put(reactContext2, bVar);
            }
            return bVar;
        } else {
            throw new RuntimeException("reactContext should not be null!");
        }
    }

    public final b a(String str, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f48473a, false, 45891, new Class[]{String.class, a.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f48473a, false, 45891, new Class[]{String.class, a.class}, b.class);
        }
        this.f48475c.put(str, aVar);
        return this;
    }

    public final void a(String str, ReadableMap readableMap, Callback callback) {
        String str2 = str;
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap2, callback2}, this, f48473a, false, 45892, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, readableMap2, callback2}, this, f48473a, false, 45892, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
            return;
        }
        a aVar = this.f48475c.get(str2);
        if (aVar != null) {
            aVar.a(str2, readableMap2, callback2);
            return;
        }
        throw new RuntimeException("method " + str2 + "is not added!");
    }
}
