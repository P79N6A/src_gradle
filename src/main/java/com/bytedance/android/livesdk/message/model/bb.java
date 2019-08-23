package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.RoomMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;

public class bb extends c<RoomMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16541a;
    @SerializedName("content")

    /* renamed from: b  reason: collision with root package name */
    public String f16542b;

    public bb() {
        this.type = a.ROOM;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public boolean canText() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f16541a, false, 11091, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16541a, false, 11091, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f16542b)) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ c wrap(Message message) {
        RoomMessage roomMessage = (RoomMessage) message;
        if (PatchProxy.isSupport(new Object[]{roomMessage}, this, f16541a, false, 11092, new Class[]{RoomMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{roomMessage}, this, f16541a, false, 11092, new Class[]{RoomMessage.class}, c.class);
        }
        bb bbVar = new bb();
        bbVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(roomMessage.common);
        bbVar.f16542b = roomMessage.content;
        return bbVar;
    }
}
