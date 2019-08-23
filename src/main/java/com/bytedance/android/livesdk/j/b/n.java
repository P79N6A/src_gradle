package com.bytedance.android.livesdk.j.b;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class n extends a<Room> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f15660b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f15661c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f15662d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public String f15663e;

    /* renamed from: f  reason: collision with root package name */
    public long f15664f;

    public final void a(Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f15660b, false, 10948, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f15660b, false, 10948, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        super.a(map);
        map.put("request_id", this.f15662d.get(this.f15663e));
        map.put("log_pb", this.f15661c.get(this.f15663e));
    }

    public final void a(Room room) {
        String str;
        if (PatchProxy.isSupport(new Object[]{room}, this, f15660b, false, 10946, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, f15660b, false, 10946, new Class[]{Room.class}, Void.TYPE);
        } else if (room != null) {
            this.f15663e = String.valueOf(room.getId());
            Map a2 = a();
            if (room.getId() != 0) {
                a2.put("room_id", String.valueOf(room.getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                a2.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                a2.put("log_pb", room.getLog_pb());
            } else {
                a2.remove("log_pb");
            }
            if (room.getOwner() != null) {
                a2.put("anchor_id", String.valueOf(room.getOwner().getId()));
            } else {
                a2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                a2.put("moment_room_source", room.getSourceType());
            }
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            a2.put("live_type", str);
        }
    }

    public final /* synthetic */ void a(Map map, Object obj) {
        String str;
        Map map2 = map;
        Room room = (Room) obj;
        if (PatchProxy.isSupport(new Object[]{map2, room}, this, f15660b, false, 10947, new Class[]{Map.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2, room}, this, f15660b, false, 10947, new Class[]{Map.class, Room.class}, Void.TYPE);
            return;
        }
        if (room != null) {
            if (room.getId() != 0) {
                map2.put("room_id", String.valueOf(room.getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                map2.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                map2.put("log_pb", room.getLog_pb());
            }
            if (room.getOwner() != null) {
                map2.put("anchor_id", String.valueOf(room.getOwner().getId()));
            } else {
                map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                map2.put("moment_room_source", room.getSourceType());
            }
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            map2.put("live_type", str);
        }
    }
}
