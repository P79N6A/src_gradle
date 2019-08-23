package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76796a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76797b;

    public m(WeakReference<Context> weakReference) {
        this.f76797b = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76796a, false, 89947, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76796a, false, 89947, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = null;
        if (hVar2.f20623d.has("args")) {
            jSONObject2 = hVar2.f20623d.getJSONObject("args");
        }
        if (jSONObject2 != null && jSONObject2.has(PushConstants.CONTENT)) {
            String string = jSONObject2.getString(PushConstants.CONTENT);
            Context context = (Context) this.f76797b.get();
            if (string != null) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                ClipData newPlainText = ClipData.newPlainText(string, string);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
            }
        }
    }
}
