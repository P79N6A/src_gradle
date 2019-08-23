package com.bytedance.android.livesdk.message.c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.h;
import com.bytedance.android.livesdk.message.model.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class b implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16407a;

    /* renamed from: b  reason: collision with root package name */
    private long f16408b;

    public final boolean onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f16407a, false, 11007, new Class[]{IMessage.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMessage}, this, f16407a, false, 11007, new Class[]{IMessage.class}, Boolean.TYPE)).booleanValue();
        } else if (!(iMessage instanceof e)) {
            return false;
        } else {
            e eVar = (e) iMessage;
            if (this.f16408b <= 0) {
                this.f16408b = TTLiveSDKContext.getHostService().k().b();
            }
            if (eVar.f16615d == null) {
                new h().a(PushConstants.CONTENT, (Object) eVar.f16614c).a("is_visiable_to_senter", (Object) String.valueOf(eVar.f16616e)).a("support_display_text", (Object) String.valueOf(eVar.supportDisplayText())).a("client_user_id", (Object) String.valueOf(this.f16408b)).a("chat_message_exception_log", 0);
                return true;
            } else if (eVar.f16616e || eVar.f16615d == null || this.f16408b <= 0 || this.f16408b != eVar.f16615d.getId()) {
                return false;
            } else {
                return true;
            }
        }
    }
}
