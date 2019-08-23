package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class z implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76844a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f76845b;

    /* renamed from: c  reason: collision with root package name */
    private a f76846c;

    public z(WeakReference<Context> weakReference, a aVar) {
        this.f76845b = weakReference;
        this.f76846c = aVar;
    }

    public final void a(h hVar, boolean z) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f76844a, false, 90010, new Class[]{h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, Byte.valueOf(z)}, this, f76844a, false, 90010, new Class[]{h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", z ? 1 : 0);
        } catch (JSONException unused) {
        }
        this.f76846c.a(hVar2.f20621b, jSONObject);
    }

    public final void call(final h hVar, JSONObject jSONObject) throws Exception {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76844a, false, 90009, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76844a, false, 90009, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (this.f76845b.get() != null) {
            hVar.f20625f = false;
            String optString = hVar.f20623d.optString(PushConstants.CONTENT);
            String optString2 = hVar.f20623d.optString(PushConstants.TITLE);
            String optString3 = hVar.f20623d.optString("confirm_text");
            String optString4 = hVar.f20623d.optString("cancel_text");
            final boolean optBoolean = hVar.f20623d.optBoolean("swap");
            a.C0185a aVar = new a.C0185a((Context) this.f76845b.get());
            a.C0185a b2 = aVar.a(optString2).b(optString);
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            a.C0185a a2 = b2.a(str, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76851a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76851a, false, 90012, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76851a, false, 90012, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    z.this.a(hVar, !optBoolean);
                }
            });
            if (!optBoolean) {
                optString3 = optString4;
            }
            a2.b(optString3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76847a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76847a, false, 90011, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76847a, false, 90011, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    z.this.a(hVar, optBoolean);
                }
            });
            aVar.a().a().setCancelable(false);
        }
    }
}
