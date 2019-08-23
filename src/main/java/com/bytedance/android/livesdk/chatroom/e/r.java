package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.c;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class r extends a<at> {
    public static ChangeQuickRedirect j;

    public final ImageModel a() {
        return null;
    }

    public final int b() {
        return 0;
    }

    public final boolean d() {
        return true;
    }

    public final String g() {
        return "#ff8533";
    }

    public final Spannable l() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5406, new Class[0], Spannable.class)) {
            return new SpannableString(((at) this.f10013b).f16497b.f16499b);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5406, new Class[0], Spannable.class);
    }

    public r(at atVar) {
        super(atVar);
    }

    public final void a(Context context, Room room) {
        if (PatchProxy.isSupport(new Object[]{context, room}, this, j, false, 5407, new Class[]{Context.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, room}, this, j, false, 5407, new Class[]{Context.class, Room.class}, Void.TYPE);
            return;
        }
        a.a().a((Object) new c((at) this.f10013b));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
        } catch (Exception unused) {
        }
        f.a(context).a("click_adcard", "anchor_click_bubble", TTLiveSDKContext.getHostService().k().b(), room.getId(), jSONObject);
    }
}
