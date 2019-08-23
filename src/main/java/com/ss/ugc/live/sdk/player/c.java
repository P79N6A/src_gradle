package com.ss.ugc.live.sdk.player;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.ugc.live.sdk.player.ILivePlayer;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f78758a;

    /* renamed from: b  reason: collision with root package name */
    a f78759b = a.IDLE;

    /* renamed from: c  reason: collision with root package name */
    protected long f78760c;

    /* renamed from: d  reason: collision with root package name */
    int f78761d;

    /* renamed from: e  reason: collision with root package name */
    long f78762e;

    /* renamed from: f  reason: collision with root package name */
    long f78763f;
    public long g;
    public String h;
    public String i;
    String j;
    String k;
    ILivePlayer.c l = ILivePlayer.c.VIDEO;
    int m = 0;
    private final Handler n = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1024) {
                try {
                    JSONObject put = new JSONObject().put("body_type", "onPlay").put("video_buff_length", c.this.h()).put("audio_buff_length", c.this.i()).put("stream_delay", new JSONObject().put("delay", c.this.g).put("vendor", c.this.i).put("push_dev", c.this.h));
                    c.this.a(put);
                    c.this.f78758a.a(put);
                    c.this.e();
                } catch (JSONException unused) {
                }
            }
        }
    };
    private final boolean o;

    enum a {
        IDLE,
        PREPARING,
        PREPARED
    }

    /* access modifiers changed from: protected */
    public abstract void b(JSONObject jSONObject) throws JSONException;

    /* access modifiers changed from: protected */
    public abstract long g();

    /* access modifiers changed from: protected */
    public abstract long h();

    /* access modifiers changed from: protected */
    public abstract long i();

    /* access modifiers changed from: protected */
    public abstract String j();

    /* access modifiers changed from: protected */
    public abstract String k();

    /* access modifiers changed from: protected */
    public abstract String l();

    private void m() {
        this.n.removeMessages(1024);
    }

    public final void e() {
        if (!this.n.hasMessages(1024)) {
            this.n.sendEmptyMessageDelayed(1024, 5000);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f78761d = 0;
        this.f78762e = 0;
        this.f78763f = 0;
        this.f78760c = 0;
        this.g = 0;
        this.h = null;
        this.i = null;
    }

    public final void a() {
        if (this.f78759b == a.IDLE) {
            this.f78759b = a.PREPARING;
            this.f78761d = 0;
            this.f78762e = 0;
            this.f78763f = 0;
            this.f78760c = System.currentTimeMillis();
            this.g = 0;
            this.h = null;
            this.i = null;
        }
    }

    public final void b() {
        m();
        long g2 = g();
        long currentTimeMillis = System.currentTimeMillis() - this.f78760c;
        try {
            JSONObject put = new JSONObject().put("body_type", "onPause").put("block_cnt", this.f78761d).put("block_time", this.f78763f).put("down_size", g2 / 1024).put("play_len", currentTimeMillis).put("play_speed", g2 / currentTimeMillis);
            a(put);
            this.f78758a.a(put);
        } catch (JSONException unused) {
        }
    }

    public final void c() {
        m();
        long g2 = g();
        long currentTimeMillis = System.currentTimeMillis() - this.f78760c;
        try {
            JSONObject put = new JSONObject().put("body_type", "onPlayEnd").put("block_cnt", this.f78761d).put("block_time", this.f78763f).put("down_size", g2 / 1024).put("play_len", currentTimeMillis).put("play_speed", g2 / currentTimeMillis);
            a(put);
            this.f78758a.a(put);
        } catch (JSONException unused) {
        }
        this.f78759b = a.IDLE;
        f();
    }

    public final void d() {
        if (this.f78759b != a.PREPARED) {
            this.f78759b = a.PREPARED;
            try {
                JSONObject put = new JSONObject().put("body_type", "onPrepared").put("first_screen", System.currentTimeMillis() - this.f78760c).put("play_stat", "ok").put("fail_code", 0).put("retry_times", this.m);
                this.m = 0;
                b(put);
                a(put);
                this.f78758a.a(put);
                m();
                e();
            } catch (JSONException unused) {
            }
        }
    }

    public c(b bVar) {
        this.f78758a = bVar;
        this.o = Logger.debug();
    }

    public final void a(int i2) {
        JSONObject jSONObject;
        m();
        try {
            if (this.f78759b != a.PREPARED) {
                this.f78759b = a.PREPARED;
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("first_screen", 0).put("play_stat", "fail").put("fail_code", i2).put("error_msg", l());
                b(jSONObject);
            } else {
                jSONObject = new JSONObject().put("body_type", "onPrepared").put("fail_code", i2).put("error_msg", l());
            }
            int i3 = this.m + 1;
            this.m = i3;
            jSONObject.put("fail_count", i3);
            a(jSONObject);
            this.f78758a.a(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final void a(JSONObject jSONObject) throws JSONException {
        if (!TextUtils.isEmpty(this.k)) {
            String j2 = j();
            Uri parse = Uri.parse(this.k);
            String queryParameter = parse.getQueryParameter("anchor_version");
            String queryParameter2 = parse.getQueryParameter("anchor_device_platform");
            String queryParameter3 = parse.getQueryParameter("room_id");
            jSONObject.put("anchor_version", queryParameter).put("anchor_device_platform", queryParameter2).put("room_id", queryParameter3).put("serverIp", j2).put("stream_type", this.l.ordinal()).put("tt_url", this.k).put("anchor_rtmp_service", this.i).put("anchor_uid", parse.getQueryParameter("anchor_id")).put("player_type", k());
        }
    }
}
