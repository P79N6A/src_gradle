package com.bytedance.android.livesdk.livecommerce.f;

import a.i;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.livecommerce.c;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16200a;

    public interface a {
        void a(@NonNull JSONObject jSONObject) throws JSONException;
    }

    public static void a(String str, i<? extends com.bytedance.android.livesdk.livecommerce.d.a> iVar, a aVar) {
        Object obj;
        byte b2;
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, iVar, aVar2}, null, f16200a, true, 10738, new Class[]{String.class, i.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, iVar, aVar2}, null, f16200a, true, 10738, new Class[]{String.class, i.class, a.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f16200a, true, 10737, new Class[]{i.class}, Object.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{iVar}, null, f16200a, true, 10737, new Class[]{i.class}, Object.class);
        } else if (iVar == null || !iVar.b()) {
            obj = null;
        } else {
            obj = iVar.e();
        }
        com.bytedance.android.livesdk.livecommerce.d.a aVar3 = (com.bytedance.android.livesdk.livecommerce.d.a) obj;
        if (aVar3 != null) {
            try {
                if (aVar3.f16132a == 0) {
                    b2 = 1;
                } else {
                    b2 = 0;
                }
                try {
                    jSONObject.put("status_code", aVar3.f16132a);
                    jSONObject.put("status_msg", aVar3.f16133b);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                b2 = 0;
            }
        } else {
            b2 = 0;
        }
        aVar2.a(jSONObject);
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(b2), jSONObject}, null, f16200a, true, 10736, new Class[]{String.class, Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(b2), jSONObject}, null, f16200a, true, 10736, new Class[]{String.class, Boolean.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        byte b3 = b2 ^ 1;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(b3), jSONObject}, null, c.f16117a, true, 10443, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(b3), jSONObject}, null, c.f16117a, true, 10443, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        h.f().d().a(str2, (int) b3, jSONObject);
    }
}
