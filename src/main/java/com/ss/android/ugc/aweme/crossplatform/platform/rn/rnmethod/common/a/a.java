package com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.a;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.util.j;

public final class a implements com.ss.android.ugc.aweme.framework.bridge.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40935a;

    public static void a(String str, String str2, Callback callback) {
        final String str3 = str;
        final String str4 = str2;
        final Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str3, str4, callback2}, null, f40935a, true, 34403, new Class[]{String.class, String.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, callback2}, null, f40935a, true, 34403, new Class[]{String.class, String.class, Callback.class}, Void.TYPE);
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40936a;

            public final void run() {
                int i;
                if (PatchProxy.isSupport(new Object[0], this, f40936a, false, 34405, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40936a, false, 34405, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.framework.activity.a reactViewById = ReactInstance.getReactViewById(str3);
                if (TextUtils.isEmpty(str4) || reactViewById == null) {
                    j.a(callback2, com.ss.android.ugc.aweme.framework.c.a.f48480d, "schema is not legal");
                    return;
                }
                if (str4.startsWith("aweme://live/")) {
                    Uri parse = Uri.parse(str4);
                    String queryParameter = parse.getQueryParameter("room_id");
                    String queryParameter2 = parse.getQueryParameter("user_id");
                    if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                        f.f34171e.a(reactViewById.getActivity(), str4.replace("aweme", e.f34152b), null);
                        j.a(callback2, com.ss.android.ugc.aweme.framework.c.a.f48479c);
                    } else {
                        j.a(callback2, com.ss.android.ugc.aweme.framework.c.a.f48480d);
                    }
                } else {
                    boolean a2 = h.a().a(reactViewById.getActivity(), str4);
                    Callback callback = callback2;
                    if (a2) {
                        i = com.ss.android.ugc.aweme.framework.c.a.f48479c;
                    } else {
                        i = com.ss.android.ugc.aweme.framework.c.a.f48480d;
                    }
                    j.a(callback, i);
                }
            }
        });
    }

    public final void a(String str, ReadableMap readableMap, Callback callback) {
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str, readableMap2, callback2}, this, f40935a, false, 34404, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, readableMap2, callback2}, this, f40935a, false, 34404, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
            return;
        }
        a(readableMap2.getString("reactId"), readableMap2.getString("sheme"), callback2);
    }
}
