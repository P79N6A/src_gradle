package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.c.b.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.profile.api.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4315a;

    /* renamed from: b  reason: collision with root package name */
    public a f4316b;

    /* renamed from: c  reason: collision with root package name */
    public String f4317c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f4318d;

    @Subscribe
    public void onEvent(t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, f4315a, false, 89928, new Class[]{t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tVar}, this, f4315a, false, 89928, new Class[]{t.class}, Void.TYPE);
            return;
        }
        String str = tVar.f76835a;
        JSONObject jSONObject = tVar.f76836b;
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f4315a, false, 89930, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f4315a, false, 89930, new Class[]{String.class, JSONObject.class}, Void.TYPE);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", str);
                jSONObject2.put("args", jSONObject);
            } catch (JSONException unused) {
            }
            if (this.f4316b != null) {
                this.f4316b.b("H5_nativeEvent", jSONObject2);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f4315a, false, 89929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4315a, false, 89929, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
        this.f4318d = null;
    }

    public c(WeakReference<Context> weakReference, a aVar) {
        super(weakReference);
        this.f4316b = aVar;
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        final h hVar2 = hVar;
        final JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f4315a, false, 89924, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f4315a, false, 89924, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        String string = hVar2.f20623d.getString("type");
        hVar2.f20622c = "open";
        hVar2.f20623d.put("type", string);
        JSONObject jSONObject3 = null;
        this.f4317c = hVar2.f20621b;
        this.f4318d = jSONObject2;
        if (hVar2.f20623d.has("args")) {
            jSONObject3 = hVar2.f20623d.getJSONObject("args");
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
            hVar2.f20623d.put("args", jSONObject3);
        }
        final JSONObject jSONObject4 = jSONObject3;
        if ("item".equals(string)) {
            jSONObject4.put("id", jSONObject4.get("item_id"));
        } else if ("profile".equals(string)) {
            jSONObject4.put("id", jSONObject4.get("user_id"));
        } else if ("challenge".equals(string)) {
            jSONObject4.put("id", jSONObject4.get("challenge_id"));
        } else if ("music".equals(string)) {
            jSONObject4.put("id", jSONObject4.get("music_id"));
        } else if ("collection".equals(string)) {
            jSONObject4.put("id", jSONObject4.get("collection_id"));
        } else if ("live".equals(string)) {
            if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject4, jSONObject2}, this, f4315a, false, 89926, new Class[]{h.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject4, jSONObject2}, this, f4315a, false, 89926, new Class[]{h.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                return;
            }
            hVar2.f20625f = false;
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76764a;

                public final void run() {
                    final int i = 0;
                    if (PatchProxy.isSupport(new Object[0], this, f76764a, false, 89931, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76764a, false, 89931, new Class[0], Void.TYPE);
                        return;
                    }
                    int i2 = 1;
                    int i3 = 31;
                    final int i4 = 63;
                    try {
                        User a2 = d.a(com.ss.android.ugc.aweme.app.api.a.a(jSONObject4.getString("user_id")), false, null);
                        if (a2.roomId == 0) {
                            i3 = 47;
                            i2 = 0;
                        }
                        jSONObject4.put("room_id", String.valueOf(a2.roomId));
                        i = i2;
                        i4 = i3;
                    } catch (Exception | JSONException unused) {
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76769a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f76769a, false, 89932, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76769a, false, 89932, new Class[0], Void.TYPE);
                                return;
                            }
                            if (i4 != 47) {
                                c.this.open(hVar2.f20623d);
                            }
                            c cVar = c.this;
                            JSONObject jSONObject = jSONObject2;
                            int i = i;
                            if (PatchProxy.isSupport(new Object[]{jSONObject, Integer.valueOf(i)}, cVar, c.f4315a, false, 89927, new Class[]{JSONObject.class, Integer.TYPE}, Void.TYPE)) {
                                c cVar2 = cVar;
                                PatchProxy.accessDispatch(new Object[]{jSONObject, Integer.valueOf(i)}, cVar2, c.f4315a, false, 89927, new Class[]{JSONObject.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                try {
                                    jSONObject.put("code", i);
                                } catch (JSONException unused) {
                                }
                            }
                            c.this.f4316b.a(c.this.f4317c, jSONObject4);
                        }
                    });
                }
            });
            return;
        } else if (f.f34167a.equals(string)) {
            try {
                String string2 = hVar2.f20623d.getJSONObject("args").getString(PushConstants.WEB_URL);
                if (TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, Uri.parse(string2).getQueryParameter("live_half_charge_dialog"))) {
                    if (PatchProxy.isSupport(new Object[]{jSONObject2, string2}, this, f4315a, false, 89925, new Class[]{JSONObject.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{jSONObject2, string2}, this, f4315a, false, 89925, new Class[]{JSONObject.class, String.class}, Void.TYPE);
                        return;
                    }
                    bg.a(new com.ss.android.ugc.aweme.live.a.c(string2));
                    if (this.f4316b != null) {
                        this.f4316b.a(this.f4317c, jSONObject2);
                    }
                    return;
                }
            } catch (Exception unused) {
            }
        }
        bg.c(this);
        jSONObject4.put("group", PushConstants.PUSH_TYPE_NOTIFY);
        open(hVar2.f20623d);
        jSONObject2.put("code", 1);
    }
}
