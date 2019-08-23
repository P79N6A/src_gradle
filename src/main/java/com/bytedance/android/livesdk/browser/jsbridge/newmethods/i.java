package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class i extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9590a;

    /* renamed from: b  reason: collision with root package name */
    private DialogFragment f9591b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f9592c;

    public i(Activity activity) {
        this.f9592c = activity;
    }

    public i(DialogFragment dialogFragment) {
        this.f9591b = dialogFragment;
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9590a, false, 3670, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9590a, false, 3670, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        if (this.f9591b != null) {
            this.f9591b.dismissAllowingStateLoss();
        } else if (this.f9592c != null) {
            this.f9592c.finish();
        } else {
            terminate();
        }
        return null;
    }
}
