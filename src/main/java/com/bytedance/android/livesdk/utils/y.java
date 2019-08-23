package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.b.k;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.j.c.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import org.json.JSONObject;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17645a;

    /* renamed from: b  reason: collision with root package name */
    public Context f17646b;

    /* renamed from: c  reason: collision with root package name */
    public Room f17647c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17648d;

    /* renamed from: e  reason: collision with root package name */
    private long f17649e;

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f17645a, false, 13701, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f17645a, false, 13701, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g a2 = a.a().a(j.class);
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str2);
        if (a2 instanceof k) {
            k kVar = (k) a2;
            if (kVar.a().containsKey("enter_from_merge")) {
                hashMap.put("enter_from_merge", (String) kVar.a().get("enter_from_merge"));
            }
            if (kVar.a().containsKey("enter_method")) {
                hashMap.put("enter_method", (String) kVar.a().get("enter_method"));
            }
            if (kVar.a().containsKey("action_type")) {
                hashMap.put("action_type", kVar.a().get("action_type"));
            }
            if (kVar.a().containsKey("video_id")) {
                hashMap.put("video_id", kVar.a().get("video_id"));
            }
        }
        g a3 = a.a().a(Room.class);
        if (a3 instanceof n) {
            n nVar = (n) a3;
            if (nVar.a().containsKey("anchor_id")) {
                hashMap.put("anchor_id", (String) nVar.a().get("anchor_id"));
            }
            if (nVar.a().containsKey("room_id")) {
                hashMap.put("room_id", (String) nVar.a().get("room_id"));
            }
            if (nVar.a().containsKey("log_pb")) {
                hashMap.put("log_pb", (String) nVar.a().get("log_pb"));
            }
            if (nVar.a().containsKey("request_id")) {
                hashMap.put("request_id", (String) nVar.a().get("request_id"));
            }
        }
        a.a().a("livesdk_enter_personal_detail", hashMap, new Object[0]);
    }

    public final void a(String str, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2)}, this, f17645a, false, 13697, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2)}, this, f17645a, false, 13697, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rid", this.f17647c.getId());
            jSONObject.put("request_id", this.f17647c.getRequestId());
            jSONObject.put("log_pb", this.f17647c.getLog_pb());
        } catch (Exception unused) {
        }
    }

    public y(Context context, Room room, long j) {
        this.f17646b = context;
        this.f17647c = room;
        this.f17649e = j;
    }

    public final void a(boolean z, long j, String str, boolean z2, int i, String str2, boolean z3) {
        String str3;
        boolean z4 = z;
        long j2 = j;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j2), str4, Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i), str2, Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f17645a, false, 13699, new Class[]{Boolean.TYPE, Long.TYPE, String.class, Boolean.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j2), str4, Byte.valueOf(z2), Integer.valueOf(i), str2, Byte.valueOf(z3)}, this, f17645a, false, 13699, new Class[]{Boolean.TYPE, Long.TYPE, String.class, Boolean.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        c cVar = new c("", this.f17649e);
        if (z3) {
            cVar.f15674d = "right_anchor";
        }
        if (TextUtils.isEmpty(str)) {
            str4 = null;
        } else if (str4.equals("guest_connection") || str4.equals("guest_contribution_list") || str4.equals("guest_waiting_list")) {
            cVar.f15674d = str4;
        }
        if (z2) {
            if (z3) {
                cVar.f15671a = "anchor_c_anchor";
            } else {
                cVar.f15671a = "live_anchor_c_audience";
                if (cVar.f15674d == null) {
                    str4 = "live_anchor_c_audience";
                }
            }
            if (TextUtils.isEmpty(str4)) {
                cVar.f15671a = "live_anchor_c_audience";
            }
        } else if (i != 1) {
            cVar.f15671a = "live_audience_c_anchor";
        } else {
            if (z3) {
                cVar.f15671a = "audience_c_anchor";
                if (cVar.f15674d == null) {
                    str4 = "audience_c_anchor";
                }
            } else {
                cVar.f15671a = "live_audience_c_audience";
                if (cVar.f15674d == null) {
                    str4 = "live_audience_c_audience";
                }
            }
            if (TextUtils.isEmpty(str4)) {
                cVar.f15671a = "live_audience_c_audience";
            }
        }
        cVar.f15675e = z4;
        HashMap hashMap = new HashMap();
        if (z4) {
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        a a2 = a.a();
        if (z4) {
            str3 = "follow";
        } else {
            str3 = "unfollow";
        }
        a2.a(str3, hashMap, cVar, new j().b("live_interact").a("live_detail"), Room.class);
    }
}
