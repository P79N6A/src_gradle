package com.ss.c.a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.c.a.c.a;
import com.ss.c.a.c.c;
import com.ss.c.a.c.e;
import com.ss.c.a.e.a;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.TTPlayerConfiger;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static boolean J;
    public static JSONObject K;
    public static Context L;
    String A;
    public boolean B;
    public int C;
    public String D;
    public String E;
    public com.ss.optimizer.live.sdk.dns.d F;
    public long G;
    public long H;
    public boolean I;
    public long M;
    public boolean N;
    public boolean O;
    public long P;
    private final Context Q;
    private final b R;
    private final boolean S;
    private final int T;
    private com.ss.c.a.d.a U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f78304a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private float ao;
    private int ap;
    private float aq;
    private String ar;
    private int as;
    private boolean at;
    private boolean au;
    private int av;
    private int aw;
    private int ax;
    private int ay;
    private int az;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f78305b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.c.a.a.b f78306c;

    /* renamed from: d  reason: collision with root package name */
    public final a f78307d;

    /* renamed from: e  reason: collision with root package name */
    public final a f78308e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.c.a.e.a f78309f;
    public final com.ss.c.a.d.c g;
    public final com.ss.c.a.b.b h;
    public MediaPlayer i;
    public com.ss.c.a.c.c j;
    public SurfaceHolder k;
    public Surface l;
    public l m;
    public b n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public String s;
    public boolean t;
    public String u;
    public String v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f78324a;

        /* renamed from: b  reason: collision with root package name */
        public a f78325b;

        /* renamed from: c  reason: collision with root package name */
        String f78326c;

        /* renamed from: d  reason: collision with root package name */
        public b f78327d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f78328e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f78329f;
        public int g;
        public int h;
        int i;
        String j;
        boolean k;
        boolean l;
        public long m;
        public long n;
        public long o;

        private a(Context context) {
            this.g = 60000;
            this.h = 1;
            this.j = "FlvUrl";
            this.m = 10000;
            this.n = 60000;
            this.o = 8000;
            this.f78324a = context;
        }

        public /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    public enum b {
        IDLE,
        PLAYED,
        STOPPED
    }

    /* renamed from: com.ss.c.a.c$c  reason: collision with other inner class name */
    static final class C0835c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78348a;

        public C0835c(c cVar) {
            this.f78348a = new WeakReference<>(cVar);
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            c cVar = (c) this.f78348a.get();
            if (cVar != null) {
                cVar.f78307d.c();
                if (!cVar.B) {
                    if (cVar.z && cVar.h.f78295c == 3 && cVar.i()) {
                        return;
                    }
                    if (cVar.h.f78295c == 2 && cVar.j()) {
                        return;
                    }
                    if (cVar.r == 1) {
                        cVar.t = true;
                        if (cVar.q && !TextUtils.isEmpty(cVar.s)) {
                            cVar.a(cVar.s);
                            cVar.q = true;
                            if (cVar.i != null && cVar.B && !TextUtils.isEmpty(cVar.A)) {
                                cVar.i.setLooping(cVar.q);
                            }
                            cVar.d(cVar.s);
                            return;
                        }
                        return;
                    }
                    cVar.f78309f.a(new com.ss.c.a.a.a(-109, "live stream dry up, push stream may occur error", new HashMap()));
                }
            }
        }
    }

    static final class d implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78357a;

        public d(c cVar) {
            this.f78357a = new WeakReference<>(cVar);
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            c cVar = (c) this.f78357a.get();
            if (cVar == null) {
                return false;
            }
            if (i != 0) {
                cVar.f78306c.c(i);
            }
            cVar.f78307d.a(new com.ss.c.a.a.a(i, "player on error", null));
            if (cVar.B || cVar.k()) {
                return true;
            }
            if (cVar.z && cVar.h.f78295c == 3 && cVar.i()) {
                return true;
            }
            if (cVar.h.f78295c == 2 && cVar.j()) {
                return true;
            }
            new StringBuilder("onError ").append(i);
            HashMap hashMap = new HashMap();
            hashMap.put("internalCode", Integer.valueOf(i));
            hashMap.put("internalExtra", Integer.valueOf(i2));
            hashMap.put("playerType", Integer.valueOf(mediaPlayer.getPlayerType()));
            cVar.f78309f.a(new com.ss.c.a.a.a(-103, "player on error", hashMap));
            return false;
        }
    }

    static final class e implements MediaPlayer.OnExternInfoListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78358a;

        public e(c cVar) {
            this.f78358a = new WeakReference<>(cVar);
        }

        public final void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
            StringBuilder sb = new StringBuilder("onExternInfo, what:");
            sb.append(i);
            sb.append(",message:");
            sb.append(str);
            c cVar = (c) this.f78358a.get();
            if (!(cVar == null || cVar.i == null || 19 != i)) {
                if (cVar.N && !cVar.O) {
                    cVar.O = true;
                    cVar.f78305b.sendEmptyMessageDelayed(110, 3000);
                }
                cVar.P = System.currentTimeMillis();
                com.ss.c.a.a.b bVar = cVar.f78306c;
                if (!(TextUtils.isEmpty(str) || bVar.f78273c == null || bVar.f78274d == null)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(TimeDisplaySetting.TIME_DISPLAY_SETTING)) {
                            long j = jSONObject.getLong(TimeDisplaySetting.TIME_DISPLAY_SETTING);
                            long j2 = 0;
                            if (!bVar.R || !jSONObject.has("tt_ntp") || jSONObject.getInt("tt_ntp") != 1) {
                                if (bVar.Q && !jSONObject.has("tt_ntp")) {
                                    if (bVar.M != null) {
                                        bVar.M.f78277a.removeCallbacksAndMessages(null);
                                    }
                                    bVar.Q = false;
                                }
                                bVar.O = false;
                            } else {
                                if (!bVar.Q && bVar.M != null) {
                                    bVar.M.a(103, 0);
                                    bVar.Q = true;
                                }
                                j2 = bVar.N;
                                bVar.O = true;
                            }
                            bVar.f78273c.u = (System.currentTimeMillis() - j) + j2;
                            if (jSONObject.has("source")) {
                                bVar.f78273c.v = jSONObject.getString("source");
                            } else {
                                bVar.f78273c.v = "agora";
                            }
                            if (jSONObject.has("real_bitrate")) {
                                bVar.f78273c.w = jSONObject.getInt("real_bitrate");
                                bVar.U = true;
                            }
                            if (jSONObject.has("real_video_framerate")) {
                                bVar.f78273c.x = jSONObject.getInt("real_video_framerate");
                                bVar.U = true;
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                cVar.f78307d.a(str);
            }
        }
    }

    static final class f implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final String f78359a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<c> f78360b;

        public final void a(final com.ss.c.a.a.a aVar) {
            final c cVar = (c) this.f78360b.get();
            if (cVar != null) {
                cVar.a((Runnable) new Runnable() {
                    public final void run() {
                        if (cVar.i != null && cVar.f78309f != null) {
                            cVar.f78309f.a(aVar);
                        }
                    }
                });
            }
        }

        public final void a(final com.ss.c.a.b.c cVar) {
            final c cVar2 = (c) this.f78360b.get();
            if (cVar2 != null) {
                cVar2.a((Runnable) new Runnable() {
                    public final void run() {
                        if (cVar2.i != null && cVar2.f78309f != null) {
                            if (cVar == null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("liveAPI", f.this.f78359a);
                                cVar2.f78309f.a(new com.ss.c.a.a.a(-105, "live data is null", hashMap));
                                return;
                            }
                            com.ss.c.a.b.b bVar = cVar2.h;
                            bVar.f78293a = cVar;
                            bVar.f78296d = 0;
                            bVar.f78295c = 3;
                            String a2 = cVar2.h.a(cVar2.C, cVar2.E, cVar2.D);
                            if (a2 == null) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("liveAPI", f.this.f78359a);
                                cVar2.f78309f.a(new com.ss.c.a.a.a(-105, "play url is null", hashMap2));
                                return;
                            }
                            cVar2.d(a2);
                        }
                    }
                });
            }
        }

        public f(c cVar, String str) {
            this.f78360b = new WeakReference<>(cVar);
            this.f78359a = str;
        }
    }

    static final class g implements MediaPlayer.OnInfoListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78367a;

        public g(c cVar) {
            this.f78367a = new WeakReference<>(cVar);
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            String str;
            JSONObject jSONObject;
            c cVar = (c) this.f78367a.get();
            if (cVar == null) {
                return false;
            }
            if (i == 3) {
                String stringOption = cVar.i.getStringOption(142);
                com.ss.c.a.a.b bVar = cVar.f78306c;
                if (stringOption != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(stringOption);
                        if (jSONObject2.has("sdk_version")) {
                            bVar.k = jSONObject2.getString("sdk_version");
                        }
                        if (jSONObject2.has("platform")) {
                            bVar.l = jSONObject2.getString("platform");
                        }
                        if (jSONObject2.has("os_version")) {
                            bVar.m = jSONObject2.getString("os_version");
                        }
                        if (jSONObject2.has("model")) {
                            bVar.n = jSONObject2.getString("model");
                        }
                        if (jSONObject2.has("start_time")) {
                            bVar.o = jSONObject2.getString("start_time");
                        }
                        if (jSONObject2.has("is_hardware_encode")) {
                            bVar.p = jSONObject2.getInt("is_hardware_encode");
                        }
                        if (jSONObject2.has("min_bitrate")) {
                            bVar.q = jSONObject2.getInt("min_bitrate");
                        }
                        if (jSONObject2.has("max_bitrate")) {
                            bVar.r = jSONObject2.getInt("max_bitrate");
                        }
                        if (jSONObject2.has("default_bitrate")) {
                            bVar.s = jSONObject2.getInt("default_bitrate");
                        }
                        if (jSONObject2.has("hit_node_optimize")) {
                            bVar.t = jSONObject2.getInt("hit_node_optimize");
                        }
                        if (jSONObject2.has("push_protocol")) {
                            bVar.u = jSONObject2.getString("push_protocol");
                        }
                    } catch (JSONException unused) {
                    }
                }
                int intOption = cVar.i.getIntOption(141, -1);
                if (intOption == 0) {
                    cVar.f78306c.y = "h264";
                } else if (intOption == 1) {
                    cVar.f78306c.y = "h265";
                }
                int intOption2 = cVar.i.getIntOption(157, -1);
                com.ss.c.a.a.b bVar2 = cVar.f78306c;
                switch (intOption2) {
                    case 1:
                        str = "IOSHWCodec";
                        break;
                    case 2:
                        str = "hardware_codec";
                        break;
                    case 3:
                        str = "ff_H264_codec";
                        break;
                    case 4:
                        str = "ff_H265_codec";
                        break;
                    case 5:
                        str = "KS_H265_codec";
                        break;
                    case 6:
                        str = "JX_H265_codec";
                        break;
                    default:
                        str = "none_codec";
                        break;
                }
                bVar2.A = str;
                cVar.f78306c.c(0);
                cVar.x = false;
                String stringOption2 = cVar.i.getStringOption(71);
                if (stringOption2 != null && !stringOption2.equals(cVar.v)) {
                    cVar.f78306c.a(stringOption2, true);
                    cVar.v = stringOption2;
                }
                if (!cVar.p) {
                    com.ss.c.a.a.b bVar3 = cVar.f78306c;
                    long j = cVar.H;
                    bVar3.I = true;
                    bVar3.J = System.currentTimeMillis();
                    if (!(bVar3.f78274d == null || bVar3.f78272b == null || bVar3.f78273c == null)) {
                        try {
                            bVar3.f78273c.o = System.currentTimeMillis();
                            bVar3.f78274d.a(bVar3.f78273c, 0);
                            com.ss.c.a.a.c cVar2 = bVar3.f78273c;
                            boolean z = bVar3.x;
                            JSONObject a2 = bVar3.a();
                            if (a2 != null) {
                                jSONObject = a2.put("event_key", "first_frame").put("last_retry_end", 0).put("hit_cache", z ? 1 : 0).put("start", cVar2.f78279a).put("sdk_dns_analysis_end", cVar2.f78280b).put("prepare_block_end", cVar2.f78281c).put("player_dns_analysis_end", cVar2.f78282d).put("tcp_connect_end", cVar2.f78283e).put("tcp_first_package_end", cVar2.f78284f).put("first_video_package_end", cVar2.g).put("first_audio_package_end", cVar2.h).put("first_video_frame_decode_end", cVar2.i).put("first_audio_frame_decode_end", cVar2.j).put("first_frame_render_end", cVar2.k).put("stall_time", j).put("first_sei_delay", bVar3.f78273c.u).put("prepare_end", cVar2.l);
                            } else {
                                jSONObject = null;
                            }
                            bVar3.f78272b.a(jSONObject);
                            bVar3.H = "1.0:" + bVar3.J;
                        } catch (JSONException unused2) {
                        }
                    }
                    com.ss.c.a.a.b bVar4 = cVar.f78306c;
                    if (!bVar4.f78276f) {
                        bVar4.f78271a.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, bVar4.f78275e);
                        if (bVar4.Z) {
                            bVar4.f78271a.sendEmptyMessageDelayed(102, 5000);
                        }
                        if (bVar4.R && !bVar4.Q && bVar4.M != null) {
                            bVar4.M.a(103, 0);
                            bVar4.Q = true;
                        }
                        bVar4.f78276f = true;
                    }
                    cVar.p = true;
                    cVar.f78307d.a(true);
                } else {
                    cVar.f78306c.b(0);
                    cVar.f78307d.a(false);
                    if (cVar.f78306c.K) {
                        cVar.f78307d.b();
                        cVar.f78306c.c();
                    }
                }
                cVar.f78309f.b();
            } else if (i != 251658247) {
                switch (i) {
                    case 701:
                        cVar.w++;
                        cVar.x = true;
                        cVar.f78307d.a();
                        if (!cVar.p) {
                            cVar.G = System.currentTimeMillis();
                            cVar.f78306c.a(i2, false);
                        } else {
                            cVar.f78306c.a(i2, true);
                        }
                        if ((!cVar.y || cVar.h.f78295c != 3 || cVar.w < 4 || !cVar.h()) && !cVar.B) {
                            cVar.f78309f.a(true);
                            break;
                        }
                    case 702:
                        cVar.x = false;
                        cVar.f78307d.b();
                        cVar.f78309f.a(false);
                        if (!cVar.p || !cVar.f78306c.K) {
                            if (!cVar.p && cVar.G != 0) {
                                cVar.H = System.currentTimeMillis() - cVar.G;
                                break;
                            }
                        } else {
                            cVar.f78306c.c();
                            break;
                        }
                        break;
                }
            } else {
                cVar.f78306c.G++;
                StringBuilder sb = new StringBuilder();
                com.ss.c.a.a.b bVar5 = cVar.f78306c;
                sb.append(bVar5.H);
                sb.append(",");
                double d2 = (double) i2;
                Double.isNaN(d2);
                sb.append(d2 / 1000.0d);
                sb.append(":");
                sb.append(System.currentTimeMillis());
                bVar5.H = sb.toString();
            }
            return false;
        }
    }

    static class h implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78368a;

        public h(c cVar) {
            this.f78368a = new WeakReference<>(cVar);
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            c cVar = (c) this.f78368a.get();
            if (!(cVar == null || cVar.f78307d == null)) {
                cVar.f78307d.a(i, i2);
                com.ss.c.a.a.b bVar = cVar.f78306c;
                bVar.S = i;
                bVar.T = i2;
            }
        }
    }

    static final class i implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78369a;

        public i(c cVar) {
            this.f78369a = new WeakReference<>(cVar);
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            c cVar = (c) this.f78369a.get();
            if (cVar != null && cVar.m == l.PREPARING) {
                com.ss.c.a.a.b bVar = cVar.f78306c;
                if (!bVar.I) {
                    bVar.f78273c.l = System.currentTimeMillis();
                }
                cVar.m = l.PREPARED;
                cVar.i.start();
                cVar.f78307d.d();
            }
        }
    }

    static final class j implements a.C0836a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f78370a;

        public final void a() {
            c cVar = (c) this.f78370a.get();
            if (cVar != null && cVar.i != null) {
                if (cVar.i.isPlaying()) {
                    cVar.i.stop();
                }
                cVar.a();
            }
        }

        public final void b() {
            String str;
            int i;
            c cVar = (c) this.f78370a.get();
            if (cVar != null && cVar.i != null) {
                com.ss.c.a.b.b bVar = cVar.h;
                bVar.f78296d++;
                if (bVar.f78294b == null || bVar.f78294b.length == 0) {
                    str = null;
                } else {
                    if (bVar.f78296d < bVar.f78294b.length) {
                        i = bVar.f78296d;
                    } else {
                        i = 0;
                    }
                    str = bVar.f78294b[i];
                }
                cVar.f78306c.h = str;
                cVar.d();
                if (cVar.m == l.PREPARED) {
                    cVar.d(str);
                    return;
                }
                cVar.f();
                cVar.d(str);
            }
        }

        public j(c cVar) {
            this.f78370a = new WeakReference<>(cVar);
        }

        public final void a(com.ss.c.a.a.a aVar) {
            c cVar = (c) this.f78370a.get();
            if (cVar != null && cVar.i != null) {
                cVar.f78307d.a(aVar);
                cVar.j.a();
                cVar.f78309f.b();
            }
        }

        public final void a(boolean z) {
            c cVar = (c) this.f78370a.get();
            if (cVar != null && cVar.i != null) {
                new StringBuilder("onRetryResetPlayer ").append(false);
                cVar.d();
                if (cVar.m == l.PREPARED) {
                    cVar.d(cVar.h.a().f78301a);
                    return;
                }
                cVar.f();
                cVar.d(cVar.h.a().f78301a);
            }
        }
    }

    static class k implements ThreadFactory {
        private k() {
        }

        /* synthetic */ k(byte b2) {
            this();
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "VideoLiveManager");
            thread.setPriority(10);
            return thread;
        }
    }

    public enum l {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED
    }

    public final void f() {
        if (this.i != null) {
            this.i.reset();
        }
        this.m = l.INITIALIZED;
    }

    public final String g() {
        return this.i.getStringOption(5002);
    }

    public final void c() {
        e("stop");
        if (this.n != b.PLAYED) {
            this.f78306c.c("stop");
            return;
        }
        d();
        f("stop");
        this.n = b.STOPPED;
    }

    public final void d() {
        if (this.i != null && this.m == l.PREPARED) {
            this.i.stop();
        }
        this.m = l.INITIALIZED;
        new StringBuilder("prepareState: ").append(this.m);
    }

    public final void b() {
        e("play");
        if (this.n == b.PLAYED) {
            this.f78306c.c("play");
            return;
        }
        this.n = b.PLAYED;
        String str = null;
        if (!(this.h == null || this.h.a() == null)) {
            str = this.h.a().f78301a;
        }
        com.ss.c.a.a.b bVar = this.f78306c;
        if (this.B) {
            str = this.A;
        }
        bVar.b(str);
        n();
    }

    public final void e() {
        e("reset");
        if (this.i != null) {
            c("reset");
            this.f78306c.d();
            this.ar = null;
            this.s = null;
            this.y = false;
            this.z = false;
            this.A = null;
            this.B = false;
            this.p = false;
        }
    }

    public final void a() {
        com.ss.c.a.d.a aVar = this.U;
        final String str = aVar.f78373c + "/?Action=GetStreamPlayInfo&AppId=" + aVar.f78372b + "&Stream=" + aVar.f78371a;
        try {
            final String host = new URL(str).getHost();
            this.f78308e.a(host, new a.C0834a() {
                public final void a(String str, final String str2, final com.ss.c.a.a.a aVar, boolean z) {
                    if (host != null && str != null && host.equals(str)) {
                        c.this.a((Runnable) new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    aVar.code = -113;
                                    c.this.f78309f.a(aVar);
                                    return;
                                }
                                String a2 = c.this.f78308e.a(str, str2, null);
                                c cVar = c.this;
                                String str = host;
                                String str2 = str;
                                com.ss.c.a.c.c cVar2 = cVar.j;
                                f fVar = new f(cVar, str2);
                                if (!TextUtils.isEmpty(str)) {
                                    if (cVar2.f78349a != null) {
                                        cVar2.a();
                                        cVar2.f78351c = cVar2.f78349a.submit(new Runnable(a2, str, fVar) {

                                            /* renamed from: a  reason: collision with root package name */
                                            final /* synthetic */ String f78352a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ String f78353b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ a f78354c;

                                            public final void run() {
                                                e.a(c.this.f78350b, this.f78352a, this.f78353b, new e.a() {
                                                    public final void a(com.ss.c.a.a.a aVar) {
                                                        AnonymousClass1.this.f78354c.a(aVar);
                                                    }

                                                    public final void a(JSONObject jSONObject) {
                                                        AnonymousClass1.this.f78354c.a(new com.ss.c.a.b.c(jSONObject.optJSONObject("Result")));
                                                    }
                                                });
                                            }

                                            {
                                                this.f78352a = r2;
                                                this.f78353b = r3;
                                                this.f78354c = r4;
                                            }
                                        });
                                        return;
                                    }
                                    throw new IllegalStateException("mExecutor should not be null");
                                }
                            }
                        });
                    }
                }
            });
        } catch (MalformedURLException unused) {
            HashMap hashMap = new HashMap();
            hashMap.put("liveInfoAPI", str);
            this.f78309f.a(new com.ss.c.a.a.a(-106, "live info api invalid", hashMap));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h() {
        /*
            r6 = this;
            int r0 = r6.C
            r1 = 3
            r2 = 0
            if (r0 != r1) goto L_0x0007
            return r2
        L_0x0007:
            int r0 = r6.C
            r3 = 1
            int r0 = r0 + r3
        L_0x000b:
            if (r0 > r1) goto L_0x0045
            com.ss.c.a.b.b r4 = r6.h
            int r5 = r4.f78295c
            if (r5 == r1) goto L_0x0017
            com.ss.c.a.b.c r5 = r4.f78293a
            if (r5 == 0) goto L_0x003f
        L_0x0017:
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x002d;
                case 2: goto L_0x0024;
                case 3: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x003f
        L_0x001b:
            com.ss.c.a.b.c r4 = r4.f78293a
            java.lang.String r5 = "ld"
            boolean r4 = r4.a(r5)
            goto L_0x0040
        L_0x0024:
            com.ss.c.a.b.c r4 = r4.f78293a
            java.lang.String r5 = "sd"
            boolean r4 = r4.a(r5)
            goto L_0x0040
        L_0x002d:
            com.ss.c.a.b.c r4 = r4.f78293a
            java.lang.String r5 = "hd"
            boolean r4 = r4.a(r5)
            goto L_0x0040
        L_0x0036:
            com.ss.c.a.b.c r4 = r4.f78293a
            java.lang.String r5 = "origin"
            boolean r4 = r4.a(r5)
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 != 0) goto L_0x0045
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0045:
            if (r0 <= r1) goto L_0x0048
            return r2
        L_0x0048:
            r6.C = r0
            com.ss.c.a.b.b r0 = r6.h
            int r1 = r6.C
            java.lang.String r4 = r6.E
            java.lang.String r5 = "Main"
            java.lang.String r0 = r0.a(r1, r4, r5)
            if (r0 != 0) goto L_0x0059
            return r2
        L_0x0059:
            r6.u = r0
            java.lang.String r1 = "Main"
            r6.D = r1
            r6.w = r2
            r6.d(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.c.a.c.h():boolean");
    }

    public final boolean i() {
        if (this.u == null) {
            return false;
        }
        if (this.D.equals("Main")) {
            String a2 = this.h.a(this.C, this.E, "Backup");
            if (a2 != null) {
                this.f78306c.h = a2;
                this.u = a2;
                this.D = "Backup";
                d(a2);
                return true;
            }
        } else if (this.D.equals("Backup")) {
            String a3 = this.h.a(this.C, this.E, "Main");
            if (a3 != null) {
                this.f78306c.h = a3;
                this.u = a3;
                this.D = "Main";
                d(a3);
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z2 = false;
        if (this.as != 2) {
            return false;
        }
        String str = this.h.a("h264").f78301a;
        if (str == null) {
            return false;
        }
        this.f78306c.h = str;
        this.f78306c.a(this.u, str, "h265_to_h264");
        this.u = str;
        this.as = 1;
        this.f78306c.Y = "h264";
        if (this.aa != 1 && this.av == 1) {
            this.aa = 1;
            this.ak = 0;
            this.i.setIntOption(59, this.aa);
            com.ss.c.a.a.b bVar = this.f78306c;
            if (this.aa == 1) {
                z2 = true;
            }
            bVar.z = z2;
        }
        d(str);
        return true;
    }

    public final boolean k() {
        if (this.u != null && this.u.startsWith("httpk")) {
            String replaceAll = this.u.replaceAll("httpk", "http").replaceAll(":(\\d+)/", "/");
            if (replaceAll != null) {
                this.f78306c.h = replaceAll;
                this.f78306c.a(this.u, replaceAll, "httpk_to_http");
                this.u = replaceAll;
                d();
                f();
                d(this.u);
                return true;
            }
        }
        return false;
    }

    private void m() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.T != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(1, z2);
        if (this.T == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        TTPlayerConfiger.setValue(2, z3);
        TTPlayerConfiger.setValue(6, false);
        TTPlayerConfiger.setValue(11, false);
        if (this.i != null) {
            boolean isOSPlayer = this.i.isOSPlayer();
            if (this.T == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (isOSPlayer ^ z4) {
                this.i.releaseAsync();
                this.i = null;
            }
        }
        if (this.i == null) {
            this.i = com.ss.c.a.d.b.a(this.Q, this.ai);
            if (!(this.i.getPlayerType() == 1 || this.i.getPlayerType() == 2)) {
                this.aa = 0;
                this.av = 0;
                this.aw = 0;
            }
            l();
            this.i.setOnPreparedListener(new i(this));
            this.i.setOnErrorListener(new d(this));
            this.i.setOnInfoListener(new g(this));
            this.i.setOnCompletionListener(new C0835c(this));
            this.i.setOnExternInfoListener(new e(this));
            this.i.setOnVideoSizeChangedListener(new h(this));
        }
        if (this.i.isOSPlayer()) {
            this.f78306c.i = "-1";
        } else {
            this.f78306c.i = TTPlayerConfiger.getValue(14, PushConstants.PUSH_TYPE_NOTIFY);
        }
        com.ss.c.a.c.a aVar = this.f78308e;
        if (!this.S || aVar.f78330a == null) {
            z5 = false;
        }
        aVar.f78331b = z5;
        if (this.j == null) {
            this.j = new com.ss.c.a.c.c(this.f78304a, this.R);
        }
        this.g.f78376b = this.i;
    }

    private void n() {
        if (this.m == l.PREPARED && this.i != null) {
            if (this.v != null) {
                this.f78306c.a(this.v, false);
            }
            this.i.start();
        } else if (this.m == l.IDLE || this.i == null) {
            m();
            this.m = l.INITIALIZED;
            if (this.B && !TextUtils.isEmpty(this.A)) {
                this.f78306c.b();
                a(this.A, (Map<String, String>) null);
            } else if (this.h.f78295c == 1) {
                a();
            } else if (this.h.f78295c == 2) {
                d(this.h.a().f78301a);
            }
        } else {
            l();
            if (this.B && !TextUtils.isEmpty(this.A)) {
                a(this.A, (Map<String, String>) null);
            } else if (this.h.f78295c == 1) {
                a();
            } else if (this.h.f78295c == 2) {
                d(this.h.a().f78301a);
            }
        }
        this.o = false;
    }

    private void l() {
        this.i.setIntOption(36, this.Y);
        this.i.setIntOption(110, 5000);
        this.i.setIntOption(52, 1);
        boolean z2 = false;
        this.i.setIntOption(64, 0);
        if (L != null) {
            if (!J || K == null) {
                try {
                    K = com.bytedance.f.a.a(L).f19629a;
                } catch (JSONException unused) {
                    K = null;
                }
            }
            if (K != null) {
                long optLong = K.optLong("live_settings_state", 0);
                if (optLong != 0) {
                    if ((optLong & 1) == 1) {
                        this.am = K.optInt("live_hurry_type", -1);
                        if (this.am != -1) {
                            if (((optLong >> 1) & 1) == 1) {
                                this.an = K.optInt("live_hurry_time", -1);
                            }
                            if (((optLong >> 2) & 1) == 1) {
                                this.ao = (float) K.optDouble("live_hurry_speed", -1.0d);
                            }
                            if (((optLong >> 3) & 1) == 1) {
                                this.ap = K.optInt("live_slow_play_time", -1);
                            }
                            if (((optLong >> 4) & 1) == 1) {
                                this.aq = (float) K.optDouble("live_slow_play_speed", -1.0d);
                            }
                        }
                    }
                    if (((optLong >> 5) & 1) == 1) {
                        this.av = K.optInt("live_h264_hardware_decode_enable", -1);
                    }
                    if (((optLong >> 6) & 1) == 1) {
                        this.aw = K.optInt("live_h265_hardware_decode_enable", -1);
                    }
                    if (((optLong >> 7) & 1) == 1) {
                        this.ax = K.optInt("live_max_cache_seconds", -1);
                    }
                    if (((optLong >> 8) & 1) == 1) {
                        this.af = K.optInt("live_buffering_end_seconds", -1);
                    }
                    if (((optLong >> 9) & 1) == 1) {
                        this.ag = K.optInt("live_buffering_time_out", -1);
                    }
                    if (((optLong >> 10) & 1) == 1) {
                        this.ah = K.optInt("live_network_time_out", -1);
                    }
                    if (((optLong >> 11) & 1) == 1) {
                        this.aj = K.optInt("live_sharp_enable", -1);
                    }
                    if (((optLong >> 12) & 1) == 1) {
                        this.al = K.optInt("live_async_init_codec_enable", -1);
                    }
                    if (((optLong >> 13) & 1) == 1) {
                        this.I = K.optBoolean("live_upload_session_series_enable", false);
                        this.f78306c.Z = this.I;
                    }
                }
            }
        }
        if (this.aj == 1) {
            this.i.setIntOption(189, this.aj);
            if (this.f78306c != null) {
                this.f78306c.L = true;
            }
        }
        com.ss.c.a.b.d a2 = this.h.a();
        if (a2 != null) {
            String a3 = a2.a();
            if (a3 != null && a3.equals("h264")) {
                this.aa = this.av;
                this.ak = 0;
            } else if (a3 == null || !a3.equals("h265")) {
                this.aa = 0;
            } else {
                this.aa = this.aw;
                this.ak = 1;
            }
            com.ss.c.a.a.b bVar = this.f78306c;
            if (a3 == null) {
                a3 = "";
            }
            bVar.Y = a3;
        } else {
            this.aa = 0;
        }
        if (this.aa == 1) {
            this.i.setIntOption(59, this.aa);
            com.ss.c.a.a.b bVar2 = this.f78306c;
            if (this.aa == 1) {
                z2 = true;
            }
            bVar2.z = z2;
            if (this.ak != -1) {
                this.i.setIntOption(181, this.al);
                this.i.setIntOption(182, this.ak);
                this.f78306c.W = this.al;
                this.f78306c.X = this.ak;
            }
        }
        if (!(this.ae == -1 || this.aw == 1)) {
            this.i.setIntOption(67, this.ae);
        }
        if (this.ag != -1) {
            this.i.setIntOption(81, this.ag);
        }
        if (this.ao > 0.0f) {
            this.i.setFloatOption(80, this.ao);
            this.f78306c.D = this.ao;
        }
        if (this.r == -1 && this.s != null) {
            this.ar = System.currentTimeMillis();
            this.i.setStringOption(17, this.ar);
            this.i.setIntOption(14, 1);
            this.i.setCacheFile(this.s, 1);
        }
        if (this.am != -1) {
            this.i.setIntOption(84, this.am);
            this.f78306c.B = true;
        }
        if (this.am == 0 && this.an != 0) {
            this.i.setIntOption(15, this.an);
            this.f78306c.C = this.an;
        }
        if (this.B && !TextUtils.isEmpty(this.A) && this.q) {
            this.i.setLooping(this.q);
        }
        if (this.af != -1) {
            this.i.setIntOption(86, this.af);
        }
        if (this.ap != -1) {
            this.i.setIntOption(190, this.ap);
            this.f78306c.E = this.ap;
        }
        if (this.aq > 0.0f) {
            this.i.setFloatOption(191, this.aq);
            this.f78306c.F = this.aq;
        }
        if (this.ax != -1) {
            this.i.setIntOption(198, this.ax);
            this.f78306c.aa = this.ax;
        }
        if (this.ay != 0) {
            this.i.setIntOption(87, this.ay);
            this.f78306c.ab = this.ay;
        }
        if (this.az == 1) {
            this.i.setIntOption(132, this.az);
        }
        this.f78306c.Z = this.I;
    }

    public final void a(Runnable runnable) {
        this.f78305b.post(runnable);
    }

    public final void b(String str) {
        this.f78306c.g = str;
    }

    public final void a(boolean z2) {
        if (this.f78306c != null) {
            this.f78306c.j = z2;
        }
    }

    public void c(String str) {
        d();
        f();
        f(str);
        this.n = b.IDLE;
    }

    public final void a(String str) {
        e("setLocalURL");
        if (!(str == null || str.equals(this.A) || this.A == null)) {
            e();
        }
        this.A = str;
        this.B = true;
    }

    public void e(String str) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f78306c != null) {
            this.f78306c.d(str);
        }
    }

    private void f(String str) {
        if (this.j != null) {
            this.j.a();
        }
        if (this.f78308e != null) {
            this.f78308e.a();
        }
        if (!str.equals("reset") && this.n == b.PLAYED) {
            this.f78306c.a(str);
        }
        this.f78306c.d();
        this.f78309f.b();
        this.h.b();
        this.p = false;
        this.G = 0;
        this.H = 0;
        this.w = 0;
        this.o = true;
        this.n = b.STOPPED;
        this.O = false;
        this.P = 0;
        this.x = false;
        this.f78305b.removeCallbacksAndMessages(null);
    }

    public final void d(final String str) {
        if (str != null) {
            this.u = str;
            final String a2 = this.f78308e.a(str);
            if (com.ss.c.a.c.a.b(a2) || !this.au) {
                this.f78306c.a(false, false);
                this.f78306c.b();
                this.f78306c.a(a2, false);
                a(str, (Map<String, String>) null);
                this.v = a2;
                return;
            }
            this.f78309f.f78382d = a2;
            if (this.F != null && this.f78309f.a() <= 3) {
                String a3 = com.ss.optimizer.live.sdk.dns.b.a(a2, this.F);
                if (!TextUtils.isEmpty(a3)) {
                    this.f78306c.a(false, true);
                    String a4 = this.F.a(a2, a3);
                    if (a4 != null) {
                        this.f78306c.e(a4);
                    } else {
                        this.f78306c.e("sdk_previous_dns");
                    }
                    boolean b2 = this.F.b();
                    if (b2) {
                        this.f78306c.w = b2;
                    }
                    this.v = a3;
                    this.f78306c.b();
                    this.f78306c.a(a3, false);
                    HashMap hashMap = new HashMap();
                    String a5 = this.f78308e.a(str, a3, hashMap);
                    if (hashMap.isEmpty()) {
                        hashMap = null;
                    }
                    a(a5, (Map<String, String>) hashMap);
                    return;
                }
            }
            this.f78308e.a(a2, new a.C0834a() {
                public final void a(String str, final String str2, final com.ss.c.a.a.a aVar, boolean z) {
                    if (a2 != null && str != null && a2.equals(str)) {
                        c.this.f78306c.a(!z, false);
                        if (!z) {
                            if (str2 == null || str2.length() == 0) {
                                str2 = a2;
                            }
                            HashMap hashMap = new HashMap();
                            String a2 = c.this.f78308e.a(str, str2, hashMap);
                            c.this.f78306c.b();
                            c.this.f78306c.a(str2, false);
                            c cVar = c.this;
                            if (hashMap.isEmpty()) {
                                hashMap = null;
                            }
                            cVar.a(a2, (Map<String, String>) hashMap);
                            c.this.v = str2;
                            return;
                        }
                        c cVar2 = c.this;
                        cVar2.f78305b.postAtFrontOfQueue(new Runnable() {
                            public final void run() {
                                if (aVar != null) {
                                    c.this.f78309f.a(aVar);
                                    com.ss.c.a.a.a aVar = aVar;
                                } else if (!c.this.o) {
                                    String str = str2;
                                    if (str2 == null || str2.length() == 0) {
                                        str = a2;
                                    }
                                    HashMap hashMap = new HashMap();
                                    String a2 = c.this.f78308e.a(str, str, hashMap);
                                    c.this.f78306c.b();
                                    c.this.f78306c.a(str, false);
                                    c cVar = c.this;
                                    if (hashMap.isEmpty()) {
                                        hashMap = null;
                                    }
                                    cVar.a(a2, (Map<String, String>) hashMap);
                                    c.this.v = str;
                                }
                            }
                        });
                    }
                }
            });
        } else if (this.h.f78295c != 2 || !j()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(PushConstants.WEB_URL, "try out all urls");
            this.f78309f.a(new com.ss.c.a.a.a(-102, "try out all urls", hashMap2));
        }
    }

    private c(a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new k() {
        });
        this.f78304a = threadPoolExecutor;
        this.f78305b = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                if (110 == message.what) {
                    if (c.this.O) {
                        if (!c.this.x && c.this.P != 0 && System.currentTimeMillis() - c.this.P > c.this.M) {
                            c.this.f78309f.a(new com.ss.c.a.a.a(-116, "sei upload time out", null));
                        }
                    } else {
                        return;
                    }
                }
                c.this.f78305b.sendEmptyMessageDelayed(110, 3000);
            }
        };
        this.h = new com.ss.c.a.b.b();
        this.m = l.IDLE;
        this.n = b.IDLE;
        this.o = false;
        this.p = false;
        this.q = false;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 3;
        this.aa = 0;
        this.r = -1;
        this.ab = -1;
        this.ac = -1;
        this.ad = -1;
        this.ae = 1;
        this.af = -1;
        this.ag = -1;
        this.ah = -1;
        this.ai = 0;
        this.aj = 0;
        this.ak = -1;
        this.al = 0;
        this.am = -1;
        this.an = 0;
        this.ao = -1.0f;
        this.ap = -1;
        this.aq = -1.0f;
        this.s = null;
        this.ar = null;
        this.t = false;
        this.u = null;
        this.v = null;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = null;
        this.B = false;
        this.C = 0;
        this.D = "Main";
        this.E = "FlvUrl";
        this.as = 1;
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.at = false;
        this.au = true;
        this.I = false;
        this.av = 0;
        this.aw = 0;
        this.ax = -1;
        this.ay = 0;
        this.az = 1;
        this.M = 8000;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = aVar.f78324a;
        this.f78307d = aVar.f78325b;
        com.ss.c.a.a.b bVar = new com.ss.c.a.a.b(this, this.f78307d, aVar.n, this.Q);
        this.f78306c = bVar;
        this.f78306c.g = aVar.f78326c;
        com.ss.c.a.e.a aVar2 = new com.ss.c.a.e.a(new j(this), aVar.g, aVar.m, this.f78306c);
        this.f78309f = aVar2;
        this.g = new com.ss.c.a.d.c(this.Q, null);
        this.S = aVar.f78328e;
        this.f78306c.V = this.S;
        this.R = aVar.f78327d;
        this.f78308e = new com.ss.c.a.c.a(this.Q, this.f78304a, this.R);
        this.T = aVar.h;
        this.E = aVar.j;
        this.C = aVar.i;
        this.w = 0;
        this.y = aVar.k;
        this.z = aVar.l;
        this.M = aVar.o;
    }

    public /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }

    public final void a(int i2, float f2) {
        String str = "";
        switch (i2) {
            case 19:
                str = str + "catch_speed:" + f2;
                this.ao = f2;
                if (this.i != null) {
                    this.i.setFloatOption(80, f2);
                    this.f78306c.D = f2;
                    break;
                }
                break;
            case 20:
                str = str + "slow_speed:" + f2;
                this.aq = f2;
                if (this.i != null) {
                    this.i.setFloatOption(191, f2);
                    this.f78306c.F = f2;
                    break;
                }
                break;
        }
        new StringBuilder("setFloatOption ").append(str);
    }

    public final void a(com.ss.c.a.a.c cVar, int i2) {
        if (cVar != null && this.i != null) {
            if (i2 == 0) {
                cVar.f78282d = this.i.getLongOption(68, -1);
                cVar.f78283e = this.i.getLongOption(69, -1);
                cVar.f78284f = this.i.getLongOption(70, -1);
                cVar.g = this.i.getLongOption(75, -1);
                cVar.h = this.i.getLongOption(76, -1);
                cVar.i = this.i.getLongOption(77, -1);
                cVar.j = this.i.getLongOption(78, -1);
                if (i2 == 0) {
                    cVar.k = System.currentTimeMillis();
                }
            } else if (i2 == 1) {
                cVar.m = this.i.getLongOption(45, 0);
                cVar.n = this.i.getLongOption(46, 0);
                cVar.q = this.i.getFloatOption(150, 0.0f);
                cVar.r = (this.i.getLongOption(63, 0) * 8) / 1000;
                cVar.t = this.i.getLongOption(73, 0);
                cVar.s = this.i.getLongOption(72, 0);
                cVar.p = (long) this.i.getCurrentPosition();
                cVar.o = System.currentTimeMillis();
            } else if (i2 == 3) {
                cVar.q = this.i.getFloatOption(150, 0.0f);
                cVar.r = (this.i.getLongOption(63, 0) * 8) / 1000;
                cVar.t = this.i.getLongOption(73, 0);
            }
        }
    }

    public final void a(int i2, int i3) {
        String str = "";
        switch (i2) {
            case 1:
                str = str + "image_enhancement:" + i3;
                this.W = i3;
                if (this.i != null) {
                    this.i.setIntOption(37, i3);
                    break;
                }
                break;
            case 2:
                str = str + "image_scale:" + i3;
                this.X = i3;
                if (this.i != null) {
                    this.i.setIntOption(38, i3);
                    break;
                }
                break;
            case 3:
                str = str + "forbid_os_player:" + i3;
                TTPlayerConfiger.setValue(11, i3);
                break;
            case 4:
                str = str + "image_layout:" + i3;
                this.Y = i3;
                if (this.i != null) {
                    this.i.setIntOption(36, i3);
                    break;
                }
                break;
            case 5:
                str = str + "render_type:" + i3;
                this.Z = i3;
                if (this.i != null) {
                    this.i.setIntOption(56, i3);
                    break;
                }
                break;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                str = str + "hard_decode:" + i3;
                this.aa = i3;
                if (this.i != null) {
                    this.i.setIntOption(59, i3);
                    break;
                }
                break;
            case 8:
                str = str + "enable_cache_file:" + i3;
                this.r = i3;
                if (this.i != null) {
                    this.i.setIntOption(14, 1);
                    break;
                }
                break;
            case 9:
                str = str + "h265_decoder_type:" + i3;
                this.ae = i3;
                if (this.i != null) {
                    this.i.setIntOption(67, i3);
                    break;
                }
                break;
            case 10:
                str = str + "buffering_millSeconds:" + i3;
                this.af = i3;
                if (this.i != null) {
                    this.i.setIntOption(86, i3);
                    break;
                }
                break;
            case 11:
                str = str + "buffering_timeout:" + i3;
                this.ag = i3;
                if (this.i != null) {
                    this.i.setIntOption(81, i3);
                    break;
                }
                break;
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                str = str + "network_timeout:" + i3;
                this.ah = i3;
                if (this.i != null) {
                    this.i.setIntOption(9, i3 * 1000000);
                    break;
                }
                break;
            case 15:
                str = str + "use_external_dir:" + i3;
                this.ac = i3;
                break;
            case SearchJediMixFeedAdapter.f42514c:
                str = str + "use_test_action:" + i3;
                this.ab = i3;
                if (this.i != null) {
                    this.i.setIntOption(83, this.ab);
                    break;
                }
                break;
            case 17:
                str = str + "hurry_time:" + i3;
                this.an = i3;
                if (this.i != null) {
                    this.i.setIntOption(15, i3);
                    this.f78306c.C = i3;
                    break;
                }
                break;
            case 18:
                str = str + "hurry_type:" + i3;
                this.am = i3;
                if (this.i != null) {
                    this.i.setIntOption(84, i3);
                    break;
                }
                break;
            case 21:
                str = str + "slow_play_time:" + i3;
                this.ap = i3;
                if (this.i != null) {
                    this.i.setIntOption(190, i3);
                    this.f78306c.E = i3;
                    break;
                }
                break;
            case 22:
                str = str + "check side data" + i3;
                this.az = i3;
                if (this.i != null) {
                    this.i.setIntOption(132, i3);
                    break;
                }
                break;
            case 25:
                str = str + "player_degrade_mode:" + i3;
                this.ai = i3;
                break;
            case com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c.f69367f:
                str = str + "url_ability:" + i3;
                this.as = i3;
                if (i3 != 1) {
                    if (i3 == 2) {
                        this.f78306c.Y = "h265";
                        break;
                    }
                } else {
                    this.f78306c.Y = "h264";
                    break;
                }
                break;
            case 32:
                str = str + "enable_sharp:" + i3;
                this.aj = i3;
                break;
            case 33:
                str = str + "asyncInit:" + i3;
                this.al = i3;
                if (this.i != null && this.aa == 1) {
                    this.i.setIntOption(181, i3);
                    this.f78306c.W = i3;
                    break;
                }
            case 34:
                str = str + "defaultCodecID:" + i3;
                this.ak = i3;
                if (this.i != null) {
                    this.i.setIntOption(182, i3);
                    this.f78306c.X = i3;
                    break;
                }
                break;
            case 35:
                str = str + "enable 264 hardware decode " + i3;
                this.av = i3;
                break;
            case 36:
                str = str + "enable 265 hardware decode " + i3;
                this.aw = i3;
                break;
            case 37:
                str = str + "set max cache" + i3;
                this.ax = i3;
                if (this.i != null) {
                    this.i.setIntOption(198, i3);
                    this.f78306c.aa = i3;
                    break;
                }
                break;
            case 38:
                str = str + "enable test split " + i3;
                this.ay = i3;
                if (this.i != null) {
                    this.i.setIntOption(87, i3);
                    this.f78306c.ab = i3;
                    break;
                }
                break;
        }
        new StringBuilder("setIntOption ").append(str);
    }

    public final void a(String str, Map<String, String> map) {
        if (str != null && this.i != null) {
            if (this.m == l.PREPARED) {
                this.m = l.INITIALIZED;
                this.i.reset();
                if (this.r == 1 && !TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(this.ar) && !this.t) {
                    this.i.setStringOption(17, this.ar);
                    this.i.setIntOption(14, 1);
                    this.i.setCacheFile(this.s, 1);
                }
            }
            try {
                this.i.setDataSource(this.Q, Uri.parse(str), map);
                if (this.k != null) {
                    this.i.setDisplay(this.k);
                } else if (this.l != null) {
                    this.i.setSurface(this.l);
                }
                this.i.setScreenOnWhilePlaying(true);
                if (this.m == l.INITIALIZED) {
                    try {
                        this.i.prepareAsync();
                        this.m = l.PREPARING;
                    } catch (Exception e2) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(PushConstants.WEB_URL, str);
                        com.ss.c.a.a.a aVar = new com.ss.c.a.a.a(-101, e2.getMessage(), hashMap);
                        if (this.B) {
                            this.f78307d.a(aVar);
                        } else {
                            this.f78309f.a(aVar);
                        }
                    }
                }
            } catch (Exception e3) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(PushConstants.WEB_URL, str);
                com.ss.c.a.a.a aVar2 = new com.ss.c.a.a.a(-102, e3.getMessage(), hashMap2);
                if (this.B) {
                    this.f78307d.a(aVar2);
                } else {
                    this.f78309f.a(aVar2);
                }
            }
        }
    }
}
