package com.ss.android.ugc.aweme.player.a;

import android.os.SystemClock;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.c.b;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59095a;

    /* renamed from: b  reason: collision with root package name */
    public IFeedViewHolder f59096b;

    /* renamed from: c  reason: collision with root package name */
    public String f59097c;

    /* renamed from: d  reason: collision with root package name */
    public Video f59098d;

    /* renamed from: e  reason: collision with root package name */
    public String f59099e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f59100f;
    public int g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public f f59101a = new f();

        public final a a(int i) {
            this.f59101a.g = i;
            return this;
        }

        public final a b(String str) {
            this.f59101a.f59099e = str;
            return this;
        }

        public final a a(Fragment fragment) {
            this.f59101a.f59100f = fragment;
            return this;
        }

        public final a a(IFeedViewHolder iFeedViewHolder) {
            this.f59101a.f59096b = iFeedViewHolder;
            return this;
        }

        public final a a(Video video) {
            this.f59101a.f59098d = video;
            return this;
        }

        public final a a(String str) {
            this.f59101a.f59097c = str;
            return this;
        }
    }

    public final void a() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f59095a, false, 64216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59095a, false, 64216, new Class[0], Void.TYPE);
        } else if (this.f59096b != null && this.f59096b.d() != null && this.f59098d != null && this.f59098d.getPlayAddr() != null && this.f59100f != null) {
            try {
                i = b.e();
            } catch (Exception unused) {
                i = 0;
            }
            boolean a2 = com.ss.android.ugc.aweme.feed.cache.a.f45154c.a(this.f59096b.d().getAid());
            t a3 = new t().a("request_id", this.f59099e).a("duration", this.f59097c);
            if (!this.f59100f.getUserVisibleHint()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            t a4 = a3.a("is_success", String.valueOf(i2)).a("internet_speed", String.valueOf(i)).a("video_quality", String.valueOf(com.ss.android.ugc.aweme.feed.k.b.b(this.f59096b))).a("is_cache", String.valueOf(g.f().a(this.f59098d.getPlayAddr()) ? 1 : 0));
            if (a2) {
                i3 = -1;
            } else if (com.ss.android.ugc.aweme.u.b.a.a()) {
                i3 = 1;
            }
            JSONObject a5 = a4.a("is_first", String.valueOf(i3)).a("group_id", this.f59096b.d().getAid()).a("status", String.valueOf(this.g)).a("is_from_feed_cache", String.valueOf(a2 ? 1 : 0)).a();
            if (!a2) {
                com.ss.android.ugc.aweme.u.b.a.b();
            }
            r.onEvent(MobClick.obtain().setEventName("video_request_response").setLabelName("perf_monitor").setValue(this.f59096b.d().getAid()).setJsonObject(a5));
            r.a("video_request_response", a5);
            com.ss.android.ugc.aweme.t.b.b("video_request_response", a5);
            long c2 = z.c();
            long j = 0;
            if (c2 > 0) {
                j = SystemClock.elapsedRealtime() - c2;
            }
            com.ss.android.ugc.aweme.u.b.a.a("video_request_response", a5, "duration", Long.toString(j));
        }
    }
}
