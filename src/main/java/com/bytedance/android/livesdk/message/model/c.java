package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.h.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.ss.ugc.live.sdk.message.data.IMessage;

public abstract class c<T extends Message> extends a implements IMessage {
    public static ChangeQuickRedirect changeQuickRedirect;

    public int getPriority() {
        return 0;
    }

    public boolean supportDisplayText() {
        return false;
    }

    public abstract c wrap(T t);

    public long getMessageId() {
        if (this.baseMessage != null) {
            return this.baseMessage.f18777d;
        }
        return 0;
    }

    public boolean needMonitor() {
        if (this.baseMessage == null || this.baseMessage.i == 0) {
            return false;
        }
        return true;
    }

    public int getIntType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 11021, new Class[0], Integer.TYPE)) {
            return this.type.getIntType();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 11021, new Class[0], Integer.TYPE)).intValue();
    }
}
