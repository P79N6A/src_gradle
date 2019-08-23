package com.bytedance.android.livesdk.chatroom.interact;

import android.content.Context;
import com.bytedance.android.live.core.utils.aa;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import io.reactivex.functions.Function;
import org.json.JSONObject;

public final /* synthetic */ class o implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10986a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10987b;

    o(n nVar) {
        this.f10987b = nVar;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10986a, false, 4422, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f10986a, false, 4422, new Class[]{Object.class}, Object.class);
        }
        n nVar = this.f10987b;
        JSONObject jSONObject = new JSONObject();
        float a2 = ((float) aa.a()) / 1024.0f;
        float f2 = a2 - nVar.f10983d;
        String a3 = aa.a(ac.e().getPackageName());
        Context e2 = ac.e();
        jSONObject.put("vendor", nVar.f10981b);
        jSONObject.put("server_ip", nVar.f10982c);
        jSONObject.put("resolution_ratio", nVar.f10985f * nVar.g);
        jSONObject.put("memory", a2 + "MB");
        jSONObject.put("live_push_memory", f2 + "MB");
        jSONObject.put("cpu", a3);
        jSONObject.put("room_id", nVar.f10984e);
        jSONObject.put("video_bitrate", nVar.h);
        jSONObject.put("video_fps", nVar.i);
        jSONObject.put("rtmp_type", 2);
        r rVar = new r();
        rVar.f11157a = jSONObject.toString();
        rVar.f11159c = TTLiveSDKContext.getHostService().k().b();
        rVar.f11158b = TTLiveSDKContext.getHostService().a().d();
        rVar.f11161e = NetworkUtils.getNetworkOperatorCode(e2);
        rVar.f11160d = NetworkUtils.getNetworkAccessType(e2);
        return rVar;
    }
}
