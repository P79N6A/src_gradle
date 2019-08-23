package com.bytedance.android.livesdk.r;

import android.content.Context;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.annotations.Nullable;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16870a;

    public static void a(Context context, Room room, b bVar) {
        Context context2 = context;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, room, bVar2}, null, f16870a, true, 12850, new Class[]{Context.class, Room.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, room, bVar2}, null, f16870a, true, 12850, new Class[]{Context.class, Room.class, b.class}, Void.TYPE);
        } else if (context2 != null && room != null && bVar2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("gift_value", bVar2.f15107f);
            } catch (Exception unused) {
            }
            a(context2, room.getId(), "live_gift", jSONObject);
        }
    }

    public static void a(Context context, Room room, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, room, str2}, null, f16870a, true, 12849, new Class[]{Context.class, Room.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, room, str2}, null, f16870a, true, 12849, new Class[]{Context.class, Room.class, String.class}, Void.TYPE);
        } else if (context2 != null && room != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", str2);
            } catch (Exception unused) {
            }
            a(context2, room.getId(), "follow", jSONObject);
        }
    }

    public static void a(Context context, long j, @Nullable String str, @Nullable JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j2), str, jSONObject}, null, f16870a, true, 12851, new Class[]{Context.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context, new Long(j2), str, jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f16870a, true, 12851, new Class[]{Context.class, Long.TYPE, String.class, JSONObject.class}, Void.TYPE);
        } else if (context != null) {
            com.bytedance.android.live.utility.b.a(f.class);
        }
    }
}
