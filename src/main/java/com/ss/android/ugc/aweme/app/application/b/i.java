package com.ss.android.ugc.aweme.app.application.b;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements IPluginService.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2646a;

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2646a, false, 23248, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2646a, false, 23248, new Class[]{String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_patch", str2);
        } catch (JSONException unused) {
        }
        n.a("eaaay_patch_error_new_log", jSONObject);
    }

    public final void a(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f2646a, false, 23246, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f2646a, false, 23246, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("patch_md5", str2);
            jSONObject.put("download_status", i2);
            n.a("aweme_patch_success_download_rate", i2, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void a(boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f2646a, false, 23247, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f2646a, false, 23247, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        n.a("aweme_patch_success_rate", z ^ true ? 1 : 0, (JSONObject) null);
    }
}
