package com.ss.android.ad.splash.core.c;

import android.support.annotation.NonNull;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.r;
import com.ss.android.ad.splash.h;
import com.ss.android.ad.splash.origin.a;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends h implements a, Cloneable {
    public boolean A = false;
    private long C;
    private long D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int I;
    private long J;
    private String K;
    private String L;
    private String M;
    private int N;
    private int O;
    private int P = 0;
    private int Q = 0;
    private List<String> R;
    private List<String> S;
    private boolean T = false;
    private a U;
    private String V;
    private int W = 0;

    /* renamed from: a  reason: collision with root package name */
    public d f27609a;

    /* renamed from: b  reason: collision with root package name */
    public int f27610b;

    /* renamed from: c  reason: collision with root package name */
    public String f27611c;

    /* renamed from: d  reason: collision with root package name */
    public int f27612d;

    /* renamed from: e  reason: collision with root package name */
    public String f27613e;

    /* renamed from: f  reason: collision with root package name */
    public String f27614f;
    public int g;
    public int h;
    public int i;
    public final List<b> j = new ArrayList();
    public j k;
    public boolean l = false;
    public int m = 0;
    public List<String> n;
    public List<String> o;
    public int p;
    public k q;
    public boolean r = false;
    public String s;
    public String t;
    public JSONObject u;
    public int v = 0;
    public int w = 1;
    public e x;
    public i y;
    public String z;

    public final long f() {
        return this.C;
    }

    public final String g() {
        return this.L;
    }

    public final boolean i() {
        return this.r;
    }

    public final String j() {
        return this.s;
    }

    public final String k() {
        return this.t;
    }

    public final long l() {
        return this.J;
    }

    public final String m() {
        return this.K;
    }

    public final String n() {
        return this.f27613e;
    }

    public final String o() {
        return this.M;
    }

    public final int p() {
        return this.P;
    }

    public final List<String> q() {
        return this.R;
    }

    public final List<String> r() {
        return this.S;
    }

    public final int s() {
        return this.v;
    }

    public final String t() {
        return this.V;
    }

    public final int x() {
        return this.W;
    }

    public final boolean h() {
        if (this.G == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean v() {
        if (this.Q == 1) {
            return true;
        }
        return false;
    }

    public final String w() {
        return k();
    }

    public final Object clone() {
        b bVar;
        try {
            bVar = (b) super.clone();
        } catch (Exception unused) {
            bVar = null;
        }
        if (bVar == null) {
            return this;
        }
        return bVar;
    }

    public final long d() {
        return this.C + (this.E * 1000);
    }

    public final long c() {
        long j2 = this.F;
        if (j2 < 1000) {
            return 1000;
        }
        if (j2 > 10000) {
            return 10000;
        }
        return j2;
    }

    public final long e() {
        return this.C + (this.E * 1000) + (this.D * 1000);
    }

    public final boolean u() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < d() || currentTimeMillis > e()) {
            return false;
        }
        return true;
    }

    public final boolean a() {
        if (b() == 2000) {
            return true;
        }
        return false;
    }

    public final int b() {
        if (l() <= 0) {
            return 4003;
        }
        switch (p()) {
            case 0:
            case 1:
            case 4:
                if (this.f27609a == null || !this.f27609a.a()) {
                    return 4001;
                }
            case 2:
                if (this.k == null || !this.k.a()) {
                    return 4002;
                }
            case 3:
                if (this.f27609a == null || !this.f27609a.a()) {
                    return 4001;
                }
                if (this.k == null || !this.k.a()) {
                    return 4002;
                }
                break;
            default:
                return 4000;
        }
        return 2000;
    }

    public final String toString() {
        return "SplashAd{mSplashAdImageInfo=" + this.f27609a + ", mFetchTime=" + this.C + ", mExpireSeconds=" + this.D + ", mDisplayAfter=" + this.E + ", mDisplayTimeMs=" + this.F + ", mBannerMode=" + this.G + ", mRepeat=" + this.H + ", mId=" + this.J + ", mOpenUrl='" + this.K + '\'' + ", mAppOpenUrl='" + this.L + '\'' + ", mBtnText='" + this.f27611c + '\'' + ", mOpenExtraSize=" + this.f27612d + ", mLogExtra='" + this.f27613e + '\'' + ", mWebUrl='" + this.M + '\'' + ", mWebTitle='" + this.f27614f + '\'' + ", mImageMode=" + this.g + ", mClickBtnShow=" + this.h + ", mSkipBtnShow=" + this.i + ", mTimeGapSplash=" + this.j + ", mSplashId=" + this.N + ", mInterceptedFlag=" + this.O + ", mSplashType=" + this.P + ", mSplashVideoInfo=" + this.k + ", mHasCallBack=" + this.l + ", mSplashAdLoadType=" + this.m + ", mWebUrlList=" + this.n + ", mOpenUrlList=" + this.o + ", mTrackUrlList=" + this.R + ", mClickTrackUrlList=" + this.S + ", mIsForbidJump=" + this.T + ", mOrientation=" + this.p + ", mCanvasInfo=" + this.q + ", mShareAdInfo=" + this.U + ", mRealTimeShow=" + this.r + ", mSplashOpenNewUIExperiment=" + this.Q + ", mSplashShowType" + this.v + ", mSplashAdId" + this.V + ", mPredownload" + this.w + '}';
    }

    private void e(@NonNull JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("share_info");
        if (optJSONObject != null) {
            this.U = new a(optJSONObject);
        }
    }

    private void g(@NonNull JSONObject jSONObject) {
        if (this.P == 3 || p() == 2) {
            this.k = new j();
            try {
                this.k.a(jSONObject.getJSONObject("video_info"));
            } catch (Exception unused) {
            }
        }
    }

    private void h(@NonNull JSONObject jSONObject) {
        this.x = e.a(jSONObject.optJSONObject("label_info"));
        this.y = i.a(jSONObject.optJSONObject("skip_info"));
    }

    public final void a(@NonNull JSONObject jSONObject) {
        this.u = jSONObject;
        b(jSONObject);
        c(jSONObject);
        b(jSONObject, this.C);
        d(jSONObject);
        e(jSONObject);
        g(jSONObject);
        f(jSONObject);
        h(jSONObject);
    }

    public final boolean equals(Object obj) {
        if (!e.R()) {
            return super.equals(obj);
        }
        if ((obj instanceof b) && ((b) obj).l() == this.J) {
            return true;
        }
        return false;
    }

    private void c(@NonNull JSONObject jSONObject) {
        if ("canvas".equalsIgnoreCase(jSONObject.optString("style")) && !g.a(jSONObject.optString("site_id"))) {
            this.q = new k();
            this.q.f27651a = jSONObject.optString("site_id");
        }
    }

    private void d(@NonNull JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.R = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    this.R.add(optJSONArray.getString(i2));
                } catch (Exception unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("click_track_url_list");
        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
            this.S = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                try {
                    this.S.add(optJSONArray2.getString(i3));
                } catch (Exception unused2) {
                }
            }
        }
    }

    private void f(@NonNull JSONObject jSONObject) {
        if (this.P == 4) {
            if (jSONObject.has("web_url_list")) {
                this.n = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("web_url_list");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    this.n.add(optJSONArray.optString(i2));
                }
            }
            if (jSONObject.has("open_url_list")) {
                this.o = new ArrayList();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("open_url_list");
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    this.o.add(optJSONArray2.optString(i3));
                }
            }
        }
    }

    public final h a(com.ss.android.ad.splash.e eVar) {
        int a2 = f.a(eVar.f22796a);
        if (a2 == 3 || a2 == 4) {
            return new h.a().a(this.J).a(this.f27613e).b(eVar.f22797b).a(a2).a(this.T).c(this.f27614f).b(this.p).c(this.O).d(this.I).a(this.q).a(this.U).a(eVar).a();
        }
        return new h.a().a(this.J).a(this.f27613e).b(eVar.f22796a).a(a2).a(this.T).c(this.f27614f).b(this.p).c(this.O).d(this.I).a(this.q).a(this.U).a(eVar).a();
    }

    public final h b(com.ss.android.ad.splash.e eVar) {
        return new h.a().a(this.J).a(this.f27613e).a(2).b(eVar.f22797b).a(this.T).c(this.f27614f).a(this.q).b(this.p).c(this.O).d(this.I).a(this.U).a(eVar).a();
    }

    private void b(@NonNull JSONObject jSONObject) {
        boolean z2;
        this.J = jSONObject.optLong("id");
        this.M = jSONObject.optString("web_url");
        this.K = jSONObject.optString(com.ss.android.ugc.aweme.app.f.f34168b);
        this.L = jSONObject.optString("app_open_url");
        this.f27612d = jSONObject.optInt("open_extra_size");
        this.f27613e = jSONObject.optString("log_extra");
        this.l = jSONObject.optBoolean("has_callback");
        this.f27609a = d.a(jSONObject.optJSONObject("image_info"));
        this.F = jSONObject.optLong("display_time_ms");
        this.H = jSONObject.optInt("repeat");
        this.G = jSONObject.optInt("banner_mode");
        this.f27611c = jSONObject.optString("button_text");
        this.m = jSONObject.optInt("splash_load_type", 0);
        this.g = jSONObject.optInt("image_mode", 0);
        this.p = jSONObject.optInt("orientation");
        this.f27614f = jSONObject.optString("web_title");
        this.E = jSONObject.optLong("display_after", 0);
        this.D = jSONObject.optLong("expire_seconds");
        this.h = jSONObject.optInt("click_btn", 0);
        boolean z3 = true;
        this.i = jSONObject.optInt("skip_btn", 1);
        this.N = jSONObject.optInt("splash_id");
        this.O = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.T = z2;
        this.P = jSONObject.optInt("splash_type");
        this.I = jSONObject.optInt("ad_lp_style");
        this.f27610b = jSONObject.optInt("show_expected");
        this.Q = jSONObject.optInt("skip_btn_style", 0);
        this.s = jSONObject.optString("report_key");
        this.t = jSONObject.optString("item_key");
        this.v = jSONObject.optInt("splash_show_type", 0);
        this.V = jSONObject.optString("splash_ad_id", "");
        this.w = jSONObject.optInt("predownload", 1);
        this.z = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) != 1) {
            z3 = false;
        }
        this.A = z3;
        this.W = jSONObject.optInt("sound_control", 0);
        if (this.C <= 0) {
            this.C = jSONObject.optLong("model_fetch_time", 0);
            if (this.C <= 0) {
                this.C = r.a().f();
            }
        } else {
            try {
                this.u.put("model_fetch_time", this.C);
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(@NonNull JSONObject jSONObject, long j2) {
        if (j2 > 0) {
            this.C = j2;
        }
        a(jSONObject);
    }

    private void b(@NonNull JSONObject jSONObject, long j2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("interval_creative");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.a(optJSONObject, j2);
                    this.j.add(bVar);
                }
            }
        }
    }

    public final void a(@NonNull JSONObject jSONObject, long j2, boolean z2) {
        boolean z3;
        if (j2 > 0) {
            this.C = j2;
        }
        this.u = jSONObject;
        this.J = jSONObject.optLong("id");
        this.M = jSONObject.optString("web_url");
        this.K = jSONObject.optString(com.ss.android.ugc.aweme.app.f.f34168b);
        this.L = jSONObject.optString("app_open_url");
        this.f27612d = jSONObject.optInt("open_extra_size");
        this.f27613e = jSONObject.optString("log_extra");
        this.l = jSONObject.optBoolean("has_callback");
        this.f27609a = d.a(jSONObject.optJSONObject("image_info"));
        this.F = jSONObject.optLong("display_time_ms");
        this.H = jSONObject.optInt("repeat");
        this.G = jSONObject.optInt("banner_mode");
        this.f27611c = jSONObject.optString("button_text");
        this.m = jSONObject.optInt("splash_load_type", 0);
        this.g = jSONObject.optInt("image_mode", 0);
        this.p = jSONObject.optInt("orientation");
        this.f27614f = jSONObject.optString("web_title");
        this.E = jSONObject.optLong("display_after", 0);
        this.D = jSONObject.optLong("expire_seconds");
        this.h = jSONObject.optInt("click_btn", 0);
        boolean z4 = true;
        this.i = jSONObject.optInt("skip_btn", 1);
        this.N = jSONObject.optInt("splash_id");
        this.O = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.T = z3;
        this.P = jSONObject.optInt("splash_type");
        this.I = jSONObject.optInt("ad_lp_style");
        this.f27610b = jSONObject.optInt("show_expected");
        this.Q = jSONObject.optInt("skip_btn_style", 0);
        this.v = jSONObject.optInt("splash_show_type", 0);
        this.V = jSONObject.optString("splash_ad_id", "");
        this.w = jSONObject.optInt("predownload", 1);
        this.z = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) != 1) {
            z4 = false;
        }
        this.A = z4;
        this.W = jSONObject.optInt("sound_control", 0);
        if (z2 && this.C <= 0) {
            this.C = jSONObject.optLong("model_fetch_time", 0);
        } else if (!z2) {
            try {
                this.u.putOpt("model_fetch_time", Long.valueOf(this.C));
            } catch (Exception unused) {
            }
        }
        c(jSONObject);
        b(jSONObject, j2);
        d(jSONObject);
        e(jSONObject);
        g(jSONObject);
        f(jSONObject);
        h(jSONObject);
    }
}
