package com.ss.android.ad.splash.core.e;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.r;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.g;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public Context f27675a;

    /* renamed from: b  reason: collision with root package name */
    public d f27676b;

    class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        private c f27681b;

        /* renamed from: c  reason: collision with root package name */
        private final String f27682c;

        /* renamed from: d  reason: collision with root package name */
        private long f27683d;

        private Void a() {
            boolean z;
            String str = this.f27681b.f27685b;
            boolean z2 = false;
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return null;
            }
            if (this.f27681b.f27687d == 0) {
                b.this.f27676b.c(this.f27681b);
                return null;
            }
            while (true) {
                if (this.f27681b.f27687d > 0 && !isCancelled()) {
                    if (this.f27681b.f27687d == 5) {
                        b.this.f27676b.a(this.f27681b);
                    }
                    if (NetworkUtils.a(b.this.f27675a)) {
                        String str2 = this.f27681b.f27685b;
                        if (!TextUtils.isEmpty(str2)) {
                            long currentTimeMillis = System.currentTimeMillis();
                            this.f27683d = currentTimeMillis;
                            if (str2.contains("{TS}") || str2.contains("__TS__")) {
                                str2 = str2.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                            }
                            if ((str2.contains("{UID}") || str2.contains("__UID__")) && !TextUtils.isEmpty(this.f27682c)) {
                                str2 = str2.replace("{UID}", this.f27682c).replace("__UID__", this.f27682c);
                            }
                        }
                        int i = this.f27681b.f27688e;
                        if (this.f27681b.f27686c) {
                            str2 = a(str2);
                        }
                        if (e.t() != null) {
                            f a2 = e.t().a(str2);
                            if (a2 != null) {
                                JSONObject jSONObject = new JSONObject();
                                if (this.f27681b != null && this.f27681b.f27689f > 0) {
                                    try {
                                        jSONObject.put("track_url_list", str2);
                                        jSONObject.put("track_status", a2.f27692b);
                                        jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.f27683d);
                                        jSONObject.put("local_time_ms", System.currentTimeMillis());
                                        if (!g.a(a2.f27691a)) {
                                            jSONObject.put("user_agent", a2.f27691a);
                                        } else {
                                            jSONObject.put("user_agent", -1);
                                        }
                                        jSONObject.put("is_ad_event", 1);
                                        jSONObject.put("category", "umeng");
                                        jSONObject.put("ad_event_type", "monitor");
                                        long j = -1;
                                        if (e.e() != null && e.e().f22772e > 0) {
                                            j = e.e().f22772e;
                                        }
                                        jSONObject.put("user_id", j);
                                        if (!g.a(this.f27681b.g)) {
                                            jSONObject.put("log_extra", this.f27681b.g);
                                        } else {
                                            jSONObject.put("log_extra", -1);
                                        }
                                        String str3 = "";
                                        switch (i) {
                                            case 1:
                                                str3 = "show";
                                                break;
                                            case 2:
                                                str3 = "play";
                                                break;
                                            case 3:
                                                str3 = "click";
                                                break;
                                            case 4:
                                                str3 = "play_over";
                                                break;
                                        }
                                        jSONObject.put("track_label", str3);
                                        e.a(this.f27681b.f27689f, "track_ad", "track_url", jSONObject);
                                    } catch (Exception unused) {
                                    }
                                }
                                if (a2.f27692b >= 200 && a2.f27692b < 300) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                b.this.f27676b.c(this.f27681b);
                                new StringBuilder("track success : ").append(this.f27681b.f27685b);
                            } else {
                                new StringBuilder("track fail : ").append(this.f27681b.f27685b);
                                this.f27681b.f27687d--;
                                if (this.f27681b.f27687d == 0) {
                                    b.this.f27676b.c(this.f27681b);
                                    new StringBuilder("track fail and delete : ").append(this.f27681b.f27685b);
                                } else {
                                    b.this.f27676b.b(this.f27681b);
                                }
                            }
                        }
                    }
                }
            }
            if (!z2) {
                String str4 = this.f27681b.f27685b;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key_send_track_url", str4);
                    com.ss.android.ad.splash.b.a.a().a("service_ad_send_track_fail", (JSONObject) null, jSONObject2);
                } catch (Exception unused2) {
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        private static String a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
                try {
                    return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return replace;
                }
            } catch (Exception unused2) {
                return str;
            }
        }

        private a(c cVar, String str) {
            this.f27681b = cVar;
            this.f27682c = str;
        }

        /* synthetic */ a(b bVar, c cVar, String str, byte b2) {
            this(cVar, str);
        }
    }

    public final void a() {
        e.z().submit(new Runnable() {
            public final void run() {
                final List a2 = b.this.f27676b.a();
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        String j = r.a().j();
                        b bVar = b.this;
                        List<c> list = a2;
                        if (d.b(list)) {
                            for (c aVar : list) {
                                new a(bVar, aVar, j, (byte) 0).executeOnExecutor(e.z(), new Void[0]);
                            }
                        }
                    }
                });
            }
        });
    }

    public b(Context context, d dVar) {
        this.f27675a = context;
        this.f27676b = dVar;
    }

    public final void a(long j, String str, String str2, List<String> list, boolean z, int i) {
        if (d.b(list)) {
            for (String cVar : list) {
                long j2 = j;
                String str3 = str;
                c cVar2 = new c(j2, str3, UUID.randomUUID().toString(), cVar, true, 5, i);
                String str4 = str2;
                new a(this, cVar2, str2, (byte) 0).executeOnExecutor(e.z(), new Void[0]);
            }
        }
    }
}
