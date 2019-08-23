package com.bytedance.android.livesdk.chatroom.end;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class LiveEndFragment extends BaseFragment {
    public static ChangeQuickRedirect A;
    protected Room B;
    protected boolean C;
    protected boolean D;
    protected String E;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 4265, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 4265, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 4263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 4263, new Class[0], Void.TYPE);
        } else if (this.B != null && this.B.getOwner() != null) {
            User owner = this.B.getOwner();
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.E);
            hashMap.put("sec_user_id", owner.getSecUid());
            j.q().m().a(owner.getId(), null, hashMap);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, A, false, 4264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, A, false, 4264, new Class[0], Void.TYPE);
            return;
        }
        if (!this.C) {
            f.a((Context) getActivity()).a("audience_live_over", "back", 0, 0);
        }
        a.a().a((Object) new s(5));
    }

    public final <T extends View> T a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, A, false, 4262, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, A, false, 4262, new Class[]{Integer.TYPE}, View.class);
        } else if (getView() == null) {
            return null;
        } else {
            return getView().findViewById(i);
        }
    }
}
