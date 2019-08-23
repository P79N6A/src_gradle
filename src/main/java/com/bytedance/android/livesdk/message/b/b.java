package com.bytedance.android.livesdk.message.b;

import com.bytedance.android.livesdk.chatroom.bl.a;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.v.j;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageConverter;

public final class b implements IMessageConverter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16397a;

    public final IMessage convert(String str, String str2, long j) {
        String str3 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str3, new Long(j2)}, this, f16397a, false, 10999, new Class[]{String.class, String.class, Long.TYPE}, IMessage.class)) {
            return (IMessage) PatchProxy.accessDispatch(new Object[]{str, str3, new Long(j2)}, this, f16397a, false, 10999, new Class[]{String.class, String.class, Long.TYPE}, IMessage.class);
        }
        Class<? extends c> messageClass = a.getMessageClass(str);
        if (messageClass == null) {
            return null;
        }
        try {
            c cVar = (c) j.q().c().fromJson(str3, messageClass);
            cVar.timestamp = j2;
            return cVar;
        } catch (JsonParseException unused) {
            return null;
        }
    }
}
