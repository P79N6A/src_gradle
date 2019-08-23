package com.ss.android.ugc.aweme.effectplatform;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.e;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43862a;

    /* renamed from: b  reason: collision with root package name */
    private final i f43863b;

    /* renamed from: c  reason: collision with root package name */
    private long f43864c;

    private k(@Nullable i iVar) {
        this.f43863b = iVar;
    }

    public static k a(@NonNull i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, null, f43862a, true, 39001, new Class[]{i.class}, k.class)) {
            return new k(iVar2);
        }
        return (k) PatchProxy.accessDispatch(new Object[]{iVar2}, null, f43862a, true, 39001, new Class[]{i.class}, k.class);
    }

    public final void b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43862a, false, 39005, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f43862a, false, 39005, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.f43864c = System.currentTimeMillis();
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f43862a, true, 39002, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f43862a, true, 39002, new Class[]{JSONObject.class}, JSONObject.class);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", "ttlive_sdk");
            if (jSONObject2 != null) {
                jSONObject3.put(PushConstants.EXTRA, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    public final void a(Effect effect) {
        int i;
        String str;
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43862a, false, 39003, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f43862a, false, 39003, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43862a, false, 39006, new Class[]{Effect.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{effect}, this, f43862a, false, 39006, new Class[]{Effect.class}, Integer.TYPE)).intValue();
        } else {
            if (effect != null) {
                List<String> list = effect.types;
                if (!CollectionUtils.isEmpty(list) && list.contains("AR")) {
                    i = 1;
                }
            }
            i = 0;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f43864c;
        n.a("sticker_download_error_rate", 0, new bi().a("type", String.valueOf(i)).a(PushConstants.WEB_URL, a.f61120c.toJson((Object) effect.file_url)).a("duration", String.valueOf(currentTimeMillis)).b());
        if (i == 1) {
            str = "ar_sticker";
        } else {
            str = "effect_1_1_sticker";
        }
        n.a("sticker_download_time", str, (float) currentTimeMillis);
        n.a("ttlive_download_sticker_all", 0, new bi().a("duration", Long.valueOf(currentTimeMillis)).b(), a((JSONObject) null));
        if (this.f43863b != null) {
            this.f43863b.a(effect);
        }
    }

    public final void a(Effect effect, @NonNull c cVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f43862a, false, 39004, new Class[]{Effect.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f43862a, false, 39004, new Class[]{Effect.class, c.class}, Void.TYPE);
            return;
        }
        bi biVar = new bi();
        if (effect == null) {
            str = "";
        } else {
            str = effect.effect_id;
        }
        bi a2 = biVar.a("sticker_id", str).a("errorCode", String.valueOf(cVar.f77315a)).a("errorMsg", String.valueOf(cVar.f77316b));
        if (effect == null) {
            str2 = "";
        } else {
            str2 = a.f61120c.toJson((Object) effect.file_url);
        }
        n.a("sticker_download_error_rate", 1, a2.a(PushConstants.WEB_URL, str2).b());
        JSONObject b2 = new bi().a("error_code", Integer.valueOf(cVar.f77315a)).a("error_msg", cVar.f77316b).b();
        n.a("ttlive_download_sticker_all", 1, null, a(b2));
        n.a("ttlive_download_sticker_error", 1, b2);
        if (this.f43863b != null) {
            this.f43863b.a(effect, cVar);
        }
    }

    public final void a(Effect effect, int i, long j) {
        Effect effect2 = effect;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f43862a, false, 39007, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i), new Long(j2)}, this, f43862a, false, 39007, new Class[]{Effect.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f43863b instanceof e) {
            ((e) this.f43863b).a(effect2, i, j2);
        }
    }
}
