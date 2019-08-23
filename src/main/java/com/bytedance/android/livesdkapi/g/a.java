package com.bytedance.android.livesdkapi.g;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.android.livesdkapi.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18763a;

    public static Bundle a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, null, f18763a, true, 15056, new Class[]{Room.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{room}, null, f18763a, true, 15056, new Class[]{Room.class}, Bundle.class);
        }
        Bundle bundle = new Bundle();
        if (room != null) {
            bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
            if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null)) {
                bundle.putStringArrayList("live.intent.extra.BG_URLS", new ArrayList(room.getOwner().getAvatarThumb().getUrls()));
            }
            bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
            bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
            bundle.putString("live.intent.extra.SOURCE_EXTRA", room.getSourceType());
            if (!(h.e() == null || h.e().d() == null || h.e().d().a() == null)) {
                Room a2 = h.e().d().a();
                bundle.putLong("live.intent.extra.USER_FROM", a2.getUserFrom());
                bundle.putBoolean("live.intent.extra.IS_THIRD_PARTY", a2.isThirdParty);
            }
            bundle.putString("live.intent.extra.ROOM_LABELS", room.getLabels());
            bundle.putString("live.intent.extra.PULL_STREAM_URL", room.buildPullUrl());
            f.a aVar = room.getStreamUrlExtraSafely().o;
            if (aVar != null) {
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f18732a);
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f18733b);
                bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f18734c);
            }
            bundle.putInt("live.intent.extra.STREAM_TYPE", room.getStreamType().ordinal());
            bundle.putString("live.intent.extra.PRIVATE_INFO", room.getPrivateInfo());
            bundle.putLong("anchor_id", room.getOwnerUserId());
        }
        return bundle;
    }
}
