package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Message;
import android.support.annotation.Keep;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.e;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class RoomCreator implements e, WeakHandler.IHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final e.a mCallback;
    private final WeakHandler mWeakHandler = new WeakHandler(this);

    public RoomCreator(e.a aVar) {
        this.mCallback = aVar;
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 3983, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 3983, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 1) {
            if (this.mCallback != null) {
                if (message2.obj instanceof Exception) {
                    Exception exc = (Exception) message2.obj;
                    if (exc instanceof a) {
                        ((a) exc).getErrorCode();
                    }
                    return;
                }
                if (message2.obj instanceof Room) {
                    Object obj = message2.obj;
                }
            }
        }
    }

    public void createRoom(String str, String str2, boolean z) {
        com.bytedance.android.livesdkapi.depend.model.live.a aVar;
        if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 3982, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 3982, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        h a2 = h.a();
        WeakHandler weakHandler = this.mWeakHandler;
        if (z) {
            aVar = com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO;
        } else {
            aVar = com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO;
        }
        a2.a(weakHandler, str, str2, aVar, -1, 0, false, 1);
    }
}
