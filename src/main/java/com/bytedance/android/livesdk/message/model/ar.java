package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.MediaLiveReplayVidMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ar extends c<MediaLiveReplayVidMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16482a;
    @SerializedName("vid")

    /* renamed from: b  reason: collision with root package name */
    public String f16483b;

    public ar() {
        this.type = a.MEDIA_REPLAY;
    }

    public final /* synthetic */ c wrap(Message message) {
        MediaLiveReplayVidMessage mediaLiveReplayVidMessage = (MediaLiveReplayVidMessage) message;
        if (PatchProxy.isSupport(new Object[]{mediaLiveReplayVidMessage}, this, f16482a, false, 11074, new Class[]{MediaLiveReplayVidMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{mediaLiveReplayVidMessage}, this, f16482a, false, 11074, new Class[]{MediaLiveReplayVidMessage.class}, c.class);
        } else if (mediaLiveReplayVidMessage == null) {
            return null;
        } else {
            ar arVar = new ar();
            arVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(mediaLiveReplayVidMessage.common);
            arVar.f16483b = (String) Wire.get(mediaLiveReplayVidMessage.vid, "");
            return arVar;
        }
    }
}
