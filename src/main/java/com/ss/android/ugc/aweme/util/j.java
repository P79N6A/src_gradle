package com.ss.android.ugc.aweme.util;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75436a;

    public static void a(Callback callback, int i) {
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{callback2, Integer.valueOf(i)}, null, f75436a, true, 87818, new Class[]{Callback.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callback2, Integer.valueOf(i)}, null, f75436a, true, 87818, new Class[]{Callback.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(callback2, i, null);
    }

    public static void a(Callback callback, int i, String str) {
        Callback callback2 = callback;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{callback2, Integer.valueOf(i), str2}, null, f75436a, true, 87819, new Class[]{Callback.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callback2, Integer.valueOf(i), str2}, null, f75436a, true, 87819, new Class[]{Callback.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(callback2, i, str2, null);
    }

    private static void a(Callback callback, int i, String str, WritableMap writableMap) {
        Callback callback2 = callback;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{callback2, Integer.valueOf(i), str2, null}, null, f75436a, true, 87820, new Class[]{Callback.class, Integer.TYPE, String.class, WritableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callback2, Integer.valueOf(i), str2, null}, null, f75436a, true, 87820, new Class[]{Callback.class, Integer.TYPE, String.class, WritableMap.class}, Void.TYPE);
        } else if (callback2 != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("code", i);
            createMap.putString("message", str2);
            createMap.putMap("data", null);
            callback2.invoke(createMap);
        }
    }
}
