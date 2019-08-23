package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.LotteryMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;

public final class ap extends c<LotteryMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16475a;

    public ap() {
        this.type = a.LOTTERY;
    }

    public final boolean canText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ c wrap(Message message) {
        LotteryMessage lotteryMessage = (LotteryMessage) message;
        if (PatchProxy.isSupport(new Object[]{lotteryMessage}, this, f16475a, false, 11068, new Class[]{LotteryMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{lotteryMessage}, this, f16475a, false, 11068, new Class[]{LotteryMessage.class}, c.class);
        }
        ap apVar = new ap();
        apVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(lotteryMessage.common);
        return apVar;
    }
}
