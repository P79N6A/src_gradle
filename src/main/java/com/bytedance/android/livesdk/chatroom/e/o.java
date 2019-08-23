package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.ab;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public final class o extends a<aq> {
    public static ChangeQuickRedirect j;

    public final ImageModel a() {
        return null;
    }

    public final int b() {
        return 2130841326;
    }

    public final boolean d() {
        return true;
    }

    public final User e() {
        return ((aq) this.f10013b).f16477b;
    }

    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5398, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 5398, new Class[0], String.class);
        } else if (a.a()) {
            return "#fe2c55";
        } else {
            return "#ff4e33";
        }
    }

    public final Spannable l() {
        long j2;
        long j3;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5397, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5397, new Class[0], Spannable.class);
        }
        String str2 = null;
        Room a2 = TTLiveSDKContext.getLiveService().d().a();
        if (Room.isValid(a2)) {
            j2 = a2.getOwner().getId();
        } else {
            j2 = 0;
        }
        if (((aq) this.f10013b).f16477b != null) {
            if (((aq) this.f10013b).f16477b.getId() == j2) {
                str2 = ac.a((int) C0906R.string.cp5);
            } else {
                str2 = ((aq) this.f10013b).f16477b.getNickName();
                if (str2 == null) {
                    str2 = "";
                }
            }
        }
        int i = ((aq) this.f10013b).h;
        aq aqVar = (aq) this.f10013b;
        if (PatchProxy.isSupport(new Object[0], aqVar, aq.f16476a, false, 11069, new Class[0], Long.TYPE)) {
            j3 = ((Long) PatchProxy.accessDispatch(new Object[0], aqVar, aq.f16476a, false, 11069, new Class[0], Long.TYPE)).longValue();
        } else {
            j3 = (aqVar.f16479d + ((long) (aqVar.f16480e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) - com.bytedance.android.livesdk.utils.a.a.a();
        }
        int i2 = ((int) j3) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (((aq) this.f10013b).o || i2 <= 0) {
            str = ac.a((int) C0906R.string.dit, str2, Integer.valueOf(i), ((aq) this.f10013b).g);
        } else if (i2 < 60) {
            str = ac.a((int) C0906R.string.dis, str2, Integer.valueOf(i), ((aq) this.f10013b).g, Integer.valueOf(i2));
        } else {
            str = ac.a((int) C0906R.string.dir, str2, Integer.valueOf(i), ((aq) this.f10013b).g, Integer.valueOf(i2 / 60));
        }
        return new SpannableString(str);
    }

    o(aq aqVar) {
        super(aqVar);
    }

    public final void a(Context context, Room room) {
        if (PatchProxy.isSupport(new Object[]{context, room}, this, j, false, 5399, new Class[]{Context.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, room}, this, j, false, 5399, new Class[]{Context.class, Room.class}, Void.TYPE);
            return;
        }
        ab abVar = new ab(1);
        abVar.f10134b = this.f10013b;
        com.bytedance.android.livesdk.u.a.a().a((Object) abVar);
    }
}
