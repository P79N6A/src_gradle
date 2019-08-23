package com.bytedance.android.livesdk.chatroom.ui;

import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.chatroom.api.AutoReplyApi;
import com.bytedance.android.livesdk.chatroom.ui.ah;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final /* synthetic */ class ai implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11825a;

    /* renamed from: b  reason: collision with root package name */
    private final ToggleButton f11826b;

    ai(ToggleButton toggleButton) {
        this.f11826b = toggleButton;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f11825a, false, 5654, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f11825a, false, 5654, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ToggleButton toggleButton = this.f11826b;
        if (!ah.f11820b) {
            ((AutoReplyApi) j.q().d().a(AutoReplyApi.class)).enableAutoReply(z2 ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY).compose(i.a()).subscribe(new ah.a(z2, (byte) 0), new ah.b(toggleButton, (byte) 0));
        }
    }
}
