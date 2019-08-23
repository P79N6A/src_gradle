package com.bytedance.android.livesdk.message.c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.ap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

public final class e implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16418a;

    public final boolean onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f16418a, false, 11015, new Class[]{IMessage.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f16418a, false, 11015, new Class[]{IMessage.class}, Boolean.TYPE)).booleanValue();
        } else if (!(iMessage2 instanceof ap)) {
            return false;
        } else {
            return TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.a());
        }
    }
}
