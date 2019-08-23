package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.e;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdk.j.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import org.json.JSONObject;

public final /* synthetic */ class es implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12221a;

    /* renamed from: b  reason: collision with root package name */
    private final eq f12222b;

    es(eq eqVar) {
        this.f12222b = eqVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12221a, false, 6406, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12221a, false, 6406, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        eq eqVar = this.f12222b;
        Throwable th = (Throwable) obj;
        if (PatchProxy.isSupport(new Object[]{th}, eqVar, eq.f12213a, false, 6404, new Class[]{Throwable.class}, Void.TYPE)) {
            eq eqVar2 = eqVar;
            PatchProxy.accessDispatch(new Object[]{th}, eqVar2, eq.f12213a, false, 6404, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        e eVar = eqVar.f12216d;
        String message = th.getMessage();
        if (PatchProxy.isSupport(new Object[]{1, message}, eVar, e.f10009b, false, 3908, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {1, message};
            Object[] objArr2 = objArr;
            e eVar2 = eVar;
            PatchProxy.accessDispatch(objArr2, eVar2, e.f10009b, false, 3908, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else {
            eVar.a();
            JSONObject jSONObject = new JSONObject();
            e.a(jSONObject, "error_code", 1);
            e.a(jSONObject, "error_msg", message);
            com.bytedance.android.live.core.d.e.b("ttlive_load_decoration_list_all", 1, jSONObject);
            com.bytedance.android.live.core.d.e.a("ttlive_load_decoration_list_error", 1, jSONObject);
            a.a().a(b.Room.info, "ttlive_load_decoration_list", 1, jSONObject);
        }
        if (eqVar.f12215c) {
            eqVar.dismiss();
        }
    }
}
