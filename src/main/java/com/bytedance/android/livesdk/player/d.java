package com.bytedance.android.livesdk.player;

import com.bytedance.android.livesdk.player.a.a;
import com.bytedance.android.livesdk.player.f;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16802a;

    /* renamed from: b  reason: collision with root package name */
    private final c f16803b;

    d(c cVar) {
        this.f16803b = cVar;
    }

    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f16802a, false, 12709, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f16802a, false, 12709, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        c cVar = this.f16803b;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, cVar, c.f16791a, false, 12699, new Class[]{JSONObject.class}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, cVar2, c.f16791a, false, 12699, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        f fVar = cVar.f16796f;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, fVar, f.f16805a, false, 12717, new Class[]{JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2};
            Object[] objArr2 = objArr;
            f fVar2 = fVar;
            PatchProxy.accessDispatch(objArr2, fVar2, f.f16805a, false, 12717, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        b.a().a((Callable) new f.b(fVar.f16807c, jSONObject2));
    }
}
