package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.e;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class t extends a<ay> {
    public static ChangeQuickRedirect j;
    private static final String[] k = {PushConstants.PUSH_TYPE_THROUGH_MESSAGE, PushConstants.PUSH_TYPE_UPLOAD_LOG, "3", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, "5", "6", "7", "8", "9", "10", "cmd_pk_mvp_show_list", "cmd_show_gift_task_info", "cmd_show_steal_tower_info"};
    private final boolean l;

    public final User e() {
        return null;
    }

    public final boolean d() {
        return this.l;
    }

    public final ImageModel a() {
        return ((ay) this.f10013b).f16526b.f16530d;
    }

    public final int b() {
        return ((ay) this.f10013b).f16526b.k;
    }

    public final ImageModel c() {
        return ((ay) this.f10013b).f16526b.h;
    }

    public final String g() {
        return ((ay) this.f10013b).f16526b.f16528b;
    }

    public final ImageModel h() {
        return ((ay) this.f10013b).f16526b.i;
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5410, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5410, new Class[0], Spannable.class);
        }
        CharSequence charSequence = ((ay) this.f10013b).f16526b.j;
        if (TextUtils.isEmpty(charSequence) || !(charSequence instanceof Spannable)) {
            return new SpannableString(((ay) this.f10013b).f16526b.f16527a);
        }
        return (Spannable) charSequence;
    }

    public t(ay ayVar) {
        super(ayVar);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= k.length) {
                break;
            } else if (TextUtils.equals(k[i], ayVar.f16526b.f16532f)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.l = z;
    }

    public final void a(Context context, Room room) {
        if (PatchProxy.isSupport(new Object[]{context, room}, this, j, false, 5411, new Class[]{Context.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, room}, this, j, false, 5411, new Class[]{Context.class, Room.class}, Void.TYPE);
            return;
        }
        a.a().a((Object) new e((ay) this.f10013b));
    }
}
