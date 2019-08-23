package com.ss.c.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.c.a.c;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements Handler.Callback {
    public String A = "none";
    public boolean B;
    public int C = -1;
    public float D = -1.0f;
    public int E = -1;
    public float F = -1.0f;
    public int G;
    public String H = "none";
    public boolean I;
    public long J;
    public boolean K;
    public boolean L;
    public a M;
    public long N;
    public boolean O;
    public int P = -1;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public int X = -1;
    public String Y = "none";
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public Handler f78271a;
    private JSONObject aA;
    private ArrayList<Integer> aB;
    private ArrayList<Integer> aC;
    public int aa = -1;
    public int ab;
    public boolean ac;
    private Context ad;
    private String ae = "none";
    private String af = "none";
    private boolean ag;
    private long ah;
    private String ai = "none";
    private boolean aj;
    private int ak;
    private long al;
    private long am;
    private long an = -1;
    private long ao;
    private long ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private NTPUDPClient au;
    private final long av = 300000;
    private ArrayList<Long> aw;
    private ArrayList<Long> ax;
    private ArrayList<Long> ay;
    private ArrayList<Long> az;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.c.a.a f78272b;

    /* renamed from: c  reason: collision with root package name */
    public c f78273c;

    /* renamed from: d  reason: collision with root package name */
    public c f78274d;

    /* renamed from: e  reason: collision with root package name */
    public final long f78275e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f78276f;
    public String g = "none";
    public String h = "none";
    public String i = "none";
    public boolean j;
    public String k = "none";
    public String l = "none";
    public String m = "none";
    public String n = "none";
    public String o = "none";
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public String u = "none";
    public boolean v;
    public boolean w;
    public boolean x;
    public String y = "none";
    public boolean z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Handler f78277a;

        /* renamed from: b  reason: collision with root package name */
        private HandlerThread f78278b;

        public final void a(int i, long j) {
            if (this.f78278b != null && this.f78277a != null) {
                this.f78277a.sendEmptyMessage(103);
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f78274d != null && this.f78272b != null) {
            try {
                JSONObject a2 = a();
                JSONObject put = a2.put("event_key", "degrade");
                if (str == null) {
                    str = "null";
                }
                JSONObject put2 = put.put("last_cdn_play_url", str);
                if (str2 == null) {
                    str2 = "null";
                }
                put2.put("next_cdn_play_url", str2).put("reason", str3);
                this.f78272b.a(a2);
            } catch (JSONException unused) {
            }
        }
    }

    public final void b() {
        if (!this.I) {
            this.f78273c.f78281c = System.currentTimeMillis();
        }
    }

    private JSONObject f() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONObject jSONObject;
        g();
        try {
            JSONObject put = new JSONObject().put("start_time", this.f78273c.f78279a).put("render_fps_series", new JSONArray(this.aw)).put("download_bitrate_series", new JSONArray(this.ax)).put("play_buffer_series", new JSONArray(this.ay));
            if (this.aB == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(this.aB);
            }
            JSONObject put2 = put.put("push_bitrate_series", jSONArray);
            if (this.aC == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray(this.aC);
            }
            JSONObject put3 = put2.put("push_fps_series", jSONArray2);
            if (this.az == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray(this.az);
            }
            JSONObject put4 = put3.put("stall_series", jSONArray3);
            if (this.aA == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = this.aA;
            }
            return put4.put("error_series", jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void g() {
        if (this.f78274d != null && this.f78272b != null && this.f78273c != null) {
            this.f78274d.a(this.f78273c, 3);
            if (this.aw == null) {
                this.aw = new ArrayList<>();
                this.ay = new ArrayList<>();
                this.ax = new ArrayList<>();
            }
            this.aw.add(Long.valueOf((long) this.f78273c.q));
            this.ay.add(Long.valueOf(this.f78273c.t));
            this.ax.add(Long.valueOf(this.f78273c.r));
            if (this.U) {
                if (this.aC == null) {
                    this.aC = new ArrayList<>();
                    this.aB = new ArrayList<>();
                }
                this.aC.add(Integer.valueOf(this.f78273c.x));
                this.aB.add(Integer.valueOf(this.f78273c.w));
            }
        }
    }

    public final void c() {
        if (this.K) {
            this.K = false;
            JSONObject a2 = a();
            if (this.ak == -115) {
                this.ak = 0;
            }
            if (this.az == null) {
                this.az = new ArrayList<>();
            }
            this.az.add(Long.valueOf(-(System.currentTimeMillis() - this.f78273c.f78279a)));
            if (!(a2 == null || this.al == 0)) {
                try {
                    if (this.am != 0) {
                        this.aq++;
                        this.ar = (int) (((long) this.ar) + (System.currentTimeMillis() - this.am));
                    }
                    this.ao++;
                    this.ap += System.currentTimeMillis() - this.al;
                    a2.put("event_key", "stall").put("stall_start", this.al).put("stall_end", System.currentTimeMillis()).put("reason", this.an);
                    this.f78272b.a(a2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void d() {
        this.h = "none";
        this.af = "none";
        this.ag = false;
        this.ah = 0;
        this.k = "none";
        this.l = "none";
        this.m = "none";
        this.n = "none";
        this.o = "none";
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = "none";
        this.ai = "none";
        this.aj = false;
        this.w = false;
        this.x = false;
        this.B = false;
        this.C = -1;
        this.D = -1.0f;
        this.E = -1;
        this.F = -1.0f;
        this.G = 0;
        this.H = "none";
        this.X = -1;
        this.W = 0;
        this.I = false;
        this.J = 0;
        this.ak = 0;
        this.al = 0;
        this.an = -1;
        this.ao = 0;
        this.ap = 0;
        this.K = false;
        this.aq = 0;
        this.ar = 0;
        this.am = 0;
        this.as = 0;
        this.at = 0;
        this.O = false;
        this.N = 0;
        this.R = false;
        this.S = 0;
        this.T = 0;
        this.aa = -1;
        this.aw = null;
        this.ax = null;
        this.ay = null;
        this.aB = null;
        this.aC = null;
        this.aA = null;
        this.az = null;
        if (this.f78273c != null) {
            this.f78273c.a();
        }
    }

    public final JSONObject a() {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.3.2.32").put("product_line", "live");
            if (this.i == null) {
                str = "-1";
            } else {
                str = this.i;
            }
            JSONObject put2 = put.put("player_sdk_version", str);
            if (this.g == null) {
                str2 = "-1";
            } else {
                str2 = this.g;
            }
            JSONObject put3 = put2.put("project_key", str2);
            if (this.h == null) {
                str3 = "-1";
            } else {
                str3 = this.h;
            }
            JSONObject put4 = put3.put("cdn_play_url", str3);
            if (this.af == null) {
                str4 = "-1";
            } else {
                str4 = this.af;
            }
            return put4.put("cdn_ip", str4).put("ip_from_player_core", this.ag ? 1 : 0).put("is_preview", this.j ? 1 : 0).put("push_client_sdk_version", this.k).put("push_client_platform", this.l).put("push_client_os_version", this.m).put("push_client_model", this.n).put("push_client_start_time", this.o).put("push_client_is_hardware_encode", this.p).put("push_client_min_bitrate", this.q).put("push_client_max_bitrate", this.r).put("push_client_default_bitrate", this.s).put("push_client_push_protocol", this.u).put("push_client_hit_node_optimize", this.t).put("open_dns_optimizer", this.v ? 1 : 0).put("hit_node_optimize", this.aj ? 1 : 0).put("evaluator_symbol", this.ai).put("remote_sorted", this.w ? 1 : 0).put("common_tag", this.ae).put("codec_type", this.y).put("codec_name", this.A).put("hardware_decode", this.z ? 1 : 0).put("sharp", this.L ? 1 : 0).put("enable_hurry", this.B ? 1 : 0).put("hurry_time", this.C).put("catch_speed", new DecimalFormat("0.00").format((double) this.D)).put("slow_play_time", this.E).put("slow_speed", new DecimalFormat("0.00").format((double) this.F)).put("first_screen", this.I ? 1 : 0).put("enable_httpDns", this.V ? 1 : 0).put("enable_ntp", this.R ? 1 : 0).put("enable_media_codec_async", this.W).put("default_codec_id", this.X).put("url_ability", this.Y).put("max_cache_seconds", this.aa).put("width", this.S).put("height", this.T);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject e() {
        String str;
        String str2;
        String str3;
        c cVar = new c();
        this.f78274d.a(cVar, 1);
        try {
            JSONObject put = new JSONObject().put("拉流sdk版本:", "1.3.2.32");
            if (this.i == null) {
                str = "-1";
            } else {
                str = this.i;
            }
            JSONObject put2 = put.put("播放器版本:", str);
            if (this.af == null) {
                str2 = "-1";
            } else {
                str2 = this.af;
            }
            JSONObject put3 = put2.put("cdn节点:", str2).put("推流SDK版本:", this.k).put("推流平台:", this.l).put("推流设备机型:", this.n).put("推流系统版本号:", this.m).put("推流端硬编:", this.p).put("推流协议:", this.u).put("推流码率:", this.f78273c.w).put("推流帧频:", this.f78273c.x).put("命中节点优选:", this.aj ? 1 : 0).put("优选策略:", this.ai).put("服务端优选:", this.w ? 1 : 0).put("卡顿次数:", this.ao).put("卡顿时长:", this.ap);
            if (this.an == -1) {
                str3 = "无卡顿";
            } else if (this.an == 0) {
                str3 = "网络卡顿";
            } else {
                str3 = "解码卡顿";
            }
            return put3.put("卡顿原因:", str3).put("首帧:", this.f78273c.k - this.f78273c.f78279a).put("视频播放缓存:", cVar.s).put("音频播放缓存:", cVar.t).put("延迟:", this.f78273c.u).put("渲染帧频:", (double) cVar.q).put("sei_source:", this.f78273c.v).put("下载码率:", cVar.r).put("错误码:", this.ak).put("硬解:", this.z).put("编码类型:", this.y).put("解码器:", this.A).put("url:", this.h).put("width:", this.S).put("height:", this.T);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void e(String str) {
        if (str != null) {
            this.ai = str;
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (101 == i2) {
            a(false);
        }
        if (102 == i2) {
            g();
            if (this.f78276f) {
                this.f78271a.sendEmptyMessageDelayed(102, 5000);
            }
        }
        return true;
    }

    private void a(boolean z2) {
        if (this.f78274d != null && this.f78272b != null && this.f78273c != null) {
            try {
                long j2 = this.f78273c.n;
                long j3 = this.f78273c.o;
                long j4 = this.f78273c.p;
                this.f78274d.a(this.f78273c, 1);
                this.f78272b.a(a(this.f78273c, j2, j3, j4, z2));
            } catch (JSONException unused) {
            }
            if (this.f78276f) {
                this.f78271a.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, this.f78275e);
            }
        }
    }

    public final void b(int i2) {
        this.as++;
        this.at++;
        JSONObject a2 = a();
        if (a2 != null) {
            try {
                a2.put("event_key", "retry").put("reason", this.ak).put("code", i2);
                this.f78272b.a(a2);
                this.f78273c.b();
            } catch (JSONException unused) {
            }
        }
    }

    public final void c(int i2) {
        String str;
        JSONObject a2 = a();
        if (a2 != null) {
            try {
                JSONObject put = a2.put("event_key", "prepare_result");
                if (i2 != 0) {
                    str = this.f78274d.g();
                } else {
                    str = "none";
                }
                put.put("error_msg", str).put("result", i2);
                this.f78272b.a(a2);
            } catch (JSONException unused) {
            }
        }
    }

    public final void d(String str) {
        if (this.f78274d != null && this.f78272b != null) {
            JSONObject a2 = a();
            if (a2 != null) {
                try {
                    a2.put("event_key", "call_not_in_main_thread").put("api_name", str);
                    this.f78272b.a(a2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void a(int i2) {
        if (!this.I && this.f78274d != null && this.f78272b != null) {
            JSONObject a2 = a();
            if (a2 != null) {
                try {
                    a2.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i2);
                    this.f78272b.a(a2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void b(String str) {
        d();
        this.f78273c.f78279a = System.currentTimeMillis();
        this.h = str;
        JSONObject a2 = a();
        if (a2 != null) {
            try {
                a2.put("event_key", "start_play").put("start_play_time", this.f78273c.f78279a);
                this.f78272b.a(a2);
            } catch (JSONException unused) {
            }
        }
    }

    public final void c(String str) {
        if (this.f78274d != null && this.f78272b != null) {
            JSONObject a2 = a();
            if (a2 != null) {
                try {
                    a2.put("event_key", "illegal_call").put("api_name", str);
                    this.f78272b.a(a2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    private void f(String str) {
        long j2;
        if (this.I) {
            a(true);
        }
        JSONObject a2 = a();
        if (a2 != null) {
            try {
                long j3 = 0;
                if (this.I) {
                    j3 = System.currentTimeMillis() - this.J;
                    j2 = 0;
                } else if (this.ak != 0 || this.f78273c.f78279a == 0) {
                    j2 = 0;
                } else {
                    j2 = System.currentTimeMillis() - this.f78273c.f78279a;
                }
                this.f78274d.a(this.f78273c, 2);
                a2.put("event_key", "play_stop").put("stop_time", System.currentTimeMillis()).put("play_time", j3).put("is_stream_received", this.I ? 1 : 0).put("code", this.ak).put("stall_count", this.ao).put("stall_time", this.ap).put("sdk_dns_analysis_end", this.f78273c.f78280b).put("player_dns_analysis_end", this.f78273c.f78282d).put("tcp_connect_end", this.f78273c.f78283e).put("tcp_first_package_end", this.f78273c.f78284f).put("first_video_package_end", this.f78273c.g).put("first_audio_package_end", this.f78273c.h).put("first_video_frame_decode_end", this.f78273c.i).put("first_audio_frame_decode_end", this.f78273c.j).put("first_frame_render_end", this.f78273c.k).put("prepare_block_end", this.f78273c.f78281c).put("prepare_end", this.f78273c.l).put("retry_count", this.at).put("call_api_name", str).put("play_time_on_no_frame", j2);
                if (this.Z) {
                    a2.put("session_time_series", f());
                }
                this.f78272b.a(a2);
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(String str) {
        if (this.f78276f) {
            this.f78276f = false;
            this.f78271a.removeCallbacksAndMessages(null);
            if (this.M != null) {
                this.M.f78277a.removeCallbacksAndMessages(null);
            }
            this.Q = false;
        }
        f(str);
        d();
    }

    public final void a(String str, boolean z2) {
        this.af = str;
        this.ag = z2;
    }

    public final void a(boolean z2, boolean z3) {
        this.f78273c.f78280b = System.currentTimeMillis();
        this.aj = z3;
        this.x = z2;
    }

    public final void a(int i2, String str) {
        if (this.aA == null) {
            this.aA = new JSONObject();
        }
        try {
            this.aA.put(Long.toString(System.currentTimeMillis() - this.f78273c.f78279a), i2);
        } catch (JSONException unused) {
            this.aA = null;
        }
        JSONObject a2 = a();
        if (a2 != null) {
            try {
                a2.put("event_key", "play_error").put("code", i2).put("info", str);
                this.f78272b.a(a2);
                this.ak = i2;
            } catch (JSONException unused2) {
            }
        }
    }

    public final void a(int i2, boolean z2) {
        this.ak = -115;
        if (z2) {
            this.al = System.currentTimeMillis();
            this.am = this.al;
            this.an = (long) i2;
            this.K = true;
            if (this.az == null) {
                this.az = new ArrayList<>();
            }
            this.az.add(Long.valueOf(this.al - this.f78273c.f78279a));
        }
    }

    public b(c cVar, com.ss.c.a.a aVar, long j2, Context context) {
        this.ad = context;
        this.f78271a = new Handler(this);
        this.f78275e = j2 <= 0 ? 60000 : j2;
        this.f78272b = aVar;
        this.f78274d = cVar;
        this.f78273c = new c();
        this.au = new NTPUDPClient();
        this.au.setDefaultTimeout(10000);
    }

    private JSONObject a(c cVar, long j2, long j3, long j4, boolean z2) throws JSONException {
        long j5;
        JSONObject a2 = a();
        if (a2 == null) {
            return null;
        }
        long j6 = cVar.o - j3;
        long j7 = cVar.p - j4;
        long j8 = cVar.n - j2;
        if (j7 <= 0 || j8 <= 0) {
            j5 = 0;
        } else {
            j5 = (j8 * 8) / j7;
        }
        this.ah++;
        int i2 = this.aq;
        int i3 = this.ar;
        if (this.K && this.am != 0) {
            i2++;
            i3 = (int) (((long) i3) + (System.currentTimeMillis() - this.am));
            this.am = System.currentTimeMillis();
        }
        a2.put("event_key", "playing").put("video_download_size", cVar.m).put("video_play_size", cVar.n).put("render_fps", (double) cVar.q).put("video_rate", j5).put("download_speed", this.f78273c.r).put("play_time", j6).put("retry_count", this.as).put("stall_count", i2).put("stall_time", i3).put("is_last", z2 ? 1 : 0).put("index", this.ah).put("sei_delay", this.f78273c.u).put("sei_source", this.f78273c.v).put("speed_switch_count", this.G).put("speed_switch_info", this.H).put("video_buffer_time", this.f78273c.s).put("audio_buffer_time", this.f78273c.t).put("enable_sei_check", this.ac ? 1 : 0).put("ntp_sync", this.O ? 1 : 0);
        this.as = 0;
        this.aq = 0;
        this.ar = 0;
        this.G = 0;
        this.H = "none";
        return a2;
    }
}
