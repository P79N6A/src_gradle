package com.ss.ugc.live.sdk.player.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ttm.player.TTMediaPlayer;
import com.ss.ugc.live.sdk.player.b;
import com.ss.ugc.live.sdk.player.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends c {
    private final TTMediaPlayer n;

    public final String k() {
        return PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP;
    }

    public final long g() {
        return this.n.getLongOption(46, 0);
    }

    public final long h() {
        return this.n.getLongOption(72, 0);
    }

    public final long i() {
        return this.n.getLongOption(73, 0);
    }

    public final String j() {
        return this.n.getStringOption(71);
    }

    public final String l() {
        return this.n.getStringOption(5002);
    }

    private long b(int i) {
        if (this.f78760c <= 0) {
            return 0;
        }
        long longOption = this.n.getLongOption(i, -1);
        if (longOption <= 0) {
            return 0;
        }
        return Math.max(0, longOption - this.f78760c);
    }

    public final void b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("dns_time", b(68)).put("tcp_connect_time", b(69)).put("tcp_first_packet_time", b(70)).put("first_video_frame_received", b(75)).put("first_audio_frame_received", b(76)).put("first_video_frame_decoded", b(77)).put("first_audio_frame_decoded", b(78));
    }

    a(b bVar, TTMediaPlayer tTMediaPlayer) {
        super(bVar);
        this.n = tTMediaPlayer;
    }
}
