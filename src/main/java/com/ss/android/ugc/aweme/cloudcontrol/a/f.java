package com.ss.android.ugc.aweme.cloudcontrol.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.monitor.cloudmessage.callback.ITemplateConsumer;
import com.monitor.cloudmessage.entity.ConsumerResult;
import com.ss.android.ugc.aweme.cloudcontrol.c.a;
import com.ss.android.ugc.aweme.cloudcontrol.c.b;
import com.ss.android.ugc.aweme.cloudcontrol.c.c;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;
import org.json.JSONObject;

public final class f implements ITemplateConsumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36221a;

    /* renamed from: b  reason: collision with root package name */
    private a f36222b = new b();

    /* renamed from: c  reason: collision with root package name */
    private ConsumerResult f36223c;

    @NonNull
    public final ConsumerResult b() {
        return this.f36223c;
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f36221a, false, 27047, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f36221a, false, 27047, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f36222b.a(cVar2);
    }

    public final String handleTemplateMessage(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f36221a, false, 27046, new Class[]{JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f36221a, false, 27046, new Class[]{JSONObject.class}, String.class);
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2) || this.f36222b == null) {
            this.f36223c = ConsumerResult.build(false, null, null);
            return null;
        }
        TemplateResponse a2 = this.f36222b.a(jSONObject2);
        this.f36223c = ConsumerResult.build(true, null, null);
        if (a2 == null) {
            return null;
        }
        return a2.message;
    }
}
