package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import org.json.JSONObject;

public final /* synthetic */ class bh implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13021a;

    /* renamed from: b  reason: collision with root package name */
    public static final Predicate f13022b = new bh();

    private bh() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f13021a, false, 7034, new Class[]{Object.class}, Boolean.TYPE)) {
            return TextUtils.equals(((JSONObject) obj).optString("source"), "TTLiveSDK_Android");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f13021a, false, 7034, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
