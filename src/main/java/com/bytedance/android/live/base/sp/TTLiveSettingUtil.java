package com.bytedance.android.live.base.sp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import io.reactivex.subjects.PublishSubject;

@Keep
public class TTLiveSettingUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static PublishSubject<Boolean> update = PublishSubject.create();

    public static void setLocalTest(boolean z) {
    }

    public static void updateSettings(Context context, JsonObject jsonObject) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, jsonObject}, null, changeQuickRedirect, true, 131, new Class[]{Context.class, JsonObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, jsonObject}, null, changeQuickRedirect, true, 131, new Class[]{Context.class, JsonObject.class}, Void.TYPE);
            return;
        }
        if (!(context2 == null || jsonObject == null)) {
            SharedPreferences a2 = c.a(context2, "ttlive_sdk_shared_pref_cache", 0);
            if (a2 != null) {
                a2.edit().putString("key_ttlive_sdk_setting", jsonObject.toString()).commit();
                update.onNext(Boolean.TRUE);
            }
        }
    }
}
