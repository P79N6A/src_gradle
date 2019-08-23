package com.ss.android.ugc.aweme.commercialize.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.discover.model.Category;
import com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.ss.android.ugc.aweme.discover.model.HotSearchAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39305a;

    /* renamed from: b  reason: collision with root package name */
    private static b f39306b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39307a;

        /* renamed from: b  reason: collision with root package name */
        public JSONObject f39308b;

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f39308b = null;
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject b() {
            if (PatchProxy.isSupport(new Object[0], this, f39307a, false, 31452, new Class[0], JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f39307a, false, 31452, new Class[0], JSONObject.class);
            }
            if (this.f39308b == null) {
                this.f39308b = new JSONObject();
            }
            return this.f39308b;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f39307a, false, 31456, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f39307a, false, 31456, new Class[]{String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            try {
                b().put(str2, j2);
            } catch (JSONException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, Object obj) {
            String str2 = str;
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f39307a, false, 31457, new Class[]{String.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f39307a, false, 31457, new Class[]{String.class, Object.class}, Void.TYPE);
                return;
            }
            try {
                b().put(str2, obj2);
            } catch (JSONException unused) {
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39309a;

        /* renamed from: b  reason: collision with root package name */
        public final a f39310b = new a((byte) 0);

        /* renamed from: c  reason: collision with root package name */
        private String f39311c;

        /* renamed from: d  reason: collision with root package name */
        private String f39312d;

        /* renamed from: e  reason: collision with root package name */
        private String f39313e;

        /* renamed from: f  reason: collision with root package name */
        private String f39314f;
        private String g;

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39309a, false, 31458, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39309a, false, 31458, new Class[0], Void.TYPE);
                return;
            }
            this.f39311c = null;
            this.f39312d = null;
            this.f39313e = null;
            this.f39314f = null;
            this.f39310b.a();
        }

        public final b a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f39309a, false, 31463, new Class[]{Boolean.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f39309a, false, 31463, new Class[]{Boolean.TYPE}, b.class);
            }
            a aVar = this.f39310b;
            if (PatchProxy.isSupport(new Object[]{"is_i18n_sdk", 1}, aVar, a.f39307a, false, 31455, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {"is_i18n_sdk", 1};
                a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, a.f39307a, false, 31455, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            } else {
                try {
                    aVar.b().put("is_i18n_sdk", 1);
                } catch (JSONException unused) {
                }
            }
            this.f39310b.a("value", (Object) "1590015508824073");
            return this;
        }

        public final b a(AwemeRawAd awemeRawAd) {
            if (PatchProxy.isSupport(new Object[]{awemeRawAd}, this, f39309a, false, 31466, new Class[]{AwemeRawAd.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{awemeRawAd}, this, f39309a, false, 31466, new Class[]{AwemeRawAd.class}, b.class);
            }
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                g(awemeRawAd.getLogExtra());
                this.f39310b.a("ad_id", (Object) awemeRawAd.getAdId());
            }
            return this;
        }

        public final b a(Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f39309a, false, 31467, new Class[]{Aweme.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39309a, false, 31467, new Class[]{Aweme.class}, b.class);
            }
            if (!(aweme == null && aweme.getAwemeRawAd() == null)) {
                a(aweme.getAwemeRawAd().getCreativeId());
                g(aweme.getAwemeRawAd().getLogExtra());
                this.f39310b.a("ad_id", (Object) aweme.getAwemeRawAd().getAdId());
            }
            return this;
        }

        public final b a(CategoryListAdInfo categoryListAdInfo) {
            if (PatchProxy.isSupport(new Object[]{categoryListAdInfo}, this, f39309a, false, 31468, new Class[]{CategoryListAdInfo.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{categoryListAdInfo}, this, f39309a, false, 31468, new Class[]{CategoryListAdInfo.class}, b.class);
            }
            if (categoryListAdInfo != null) {
                a(categoryListAdInfo.getCreativeId());
                g(categoryListAdInfo.getLogExtra());
                if (categoryListAdInfo.getAdId() == null) {
                    this.f39310b.a("ad_id", -1);
                } else {
                    this.f39310b.a("ad_id", (Object) categoryListAdInfo.getAdId());
                }
            }
            return this;
        }

        public final b a(HotSearchAdData hotSearchAdData) {
            if (PatchProxy.isSupport(new Object[]{hotSearchAdData}, this, f39309a, false, 31470, new Class[]{HotSearchAdData.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{hotSearchAdData}, this, f39309a, false, 31470, new Class[]{HotSearchAdData.class}, b.class);
            }
            if (hotSearchAdData != null) {
                a(Long.valueOf(hotSearchAdData.getCreativeId()));
                g(hotSearchAdData.getLogExtra());
                this.f39310b.a("ad_id", -1);
            }
            return this;
        }

        public final b a(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f39309a, false, 31476, new Class[]{Object.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{obj}, this, f39309a, false, 31476, new Class[]{Object.class}, b.class);
            }
            this.f39310b.a("ad_extra_data", (Object) new Gson().toJson(obj));
            return this;
        }

        @SuppressLint({"LogNotTimber"})
        public final void a(Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f39309a, false, 31482, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f39309a, false, 31482, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Context a2 = context == null ? com.ss.android.ugc.aweme.base.utils.d.a() : context;
            b(a2);
            g.a(a2, this.f39311c, this.f39312d, this.f39310b.f39308b, (this.f39313e == null || !this.f39313e.matches("[+-]?\\d+")) ? PushConstants.PUSH_TYPE_NOTIFY : this.f39313e, d());
            d.a(this);
        }

        private long d() {
            if (PatchProxy.isSupport(new Object[0], this, f39309a, false, 31483, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], this, f39309a, false, 31483, new Class[0], Long.TYPE)).longValue();
            }
            long j = 0;
            try {
                if (this.f39314f != null) {
                    j = Long.parseLong(this.f39314f);
                }
            } catch (NumberFormatException unused) {
            }
            return j;
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f39309a, false, 31485, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39309a, false, 31485, new Class[0], Void.TYPE);
                return;
            }
            c((Context) null);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f39309a, false, 31481, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39309a, false, 31481, new Class[0], Void.TYPE);
                return;
            }
            a((Context) null);
        }

        public final b a(String str) {
            this.f39311c = str;
            return this;
        }

        public final b b(String str) {
            this.f39312d = str;
            return this;
        }

        public final b c(String str) {
            this.f39313e = str;
            return this;
        }

        public final b h(String str) {
            this.g = str;
            return this;
        }

        private b c(Long l) {
            String str;
            if (PatchProxy.isSupport(new Object[]{l}, this, f39309a, false, 31460, new Class[]{Long.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{l}, this, f39309a, false, 31460, new Class[]{Long.class}, b.class);
            }
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f39314f = str;
            return this;
        }

        public final b a(Long l) {
            String str;
            if (PatchProxy.isSupport(new Object[]{l}, this, f39309a, false, 31459, new Class[]{Long.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{l}, this, f39309a, false, 31459, new Class[]{Long.class}, b.class);
            }
            if (l == null) {
                str = null;
            } else {
                str = l.toString();
            }
            this.f39313e = str;
            return this;
        }

        public final b b(Long l) {
            if (PatchProxy.isSupport(new Object[]{l}, this, f39309a, false, 31474, new Class[]{Long.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{l}, this, f39309a, false, 31474, new Class[]{Long.class}, b.class);
            }
            this.f39310b.a("ad_id", (Object) l);
            return this;
        }

        public final b e(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39309a, false, 31465, new Class[]{String.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f39309a, false, 31465, new Class[]{String.class}, b.class);
            }
            this.f39310b.a("item_id", (Object) str);
            return this;
        }

        public final b f(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39309a, false, 31475, new Class[]{String.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f39309a, false, 31475, new Class[]{String.class}, b.class);
            }
            this.f39310b.a("track_label", (Object) str);
            return this;
        }

        public final b g(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39309a, false, 31477, new Class[]{String.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f39309a, false, 31477, new Class[]{String.class}, b.class);
            }
            this.f39310b.a("log_extra", (Object) str);
            return this;
        }

        private void b(Context context) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f39309a, false, 31484, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f39309a, false, 31484, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            this.f39310b.a("is_ad_event", (Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            if (!StringUtils.isEmpty(networkAccessType)) {
                this.f39310b.a("nt", (Object) networkAccessType);
            }
        }

        public final b a(long j) {
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f39309a, false, 31462, new Class[]{Long.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f39309a, false, 31462, new Class[]{Long.TYPE}, b.class);
            }
            this.f39310b.a("duration", j);
            return this;
        }

        public final b d(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39309a, false, 31461, new Class[]{String.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{str}, this, f39309a, false, 31461, new Class[]{String.class}, b.class);
            }
            this.f39310b.a("refer", (Object) str);
            return this;
        }

        private void c(Context context) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f39309a, false, 31486, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f39309a, false, 31486, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            b(GlobalContext.getContext());
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("category", "umeng");
                if (!TextUtils.isEmpty(this.f39311c)) {
                    hashMap.put("tag", this.f39311c);
                }
                if (!TextUtils.isEmpty(this.f39312d)) {
                    hashMap.put("label", this.f39312d);
                }
                if (!TextUtils.isEmpty(this.f39313e)) {
                    hashMap.put("value", this.f39313e);
                }
                if (!TextUtils.isEmpty(this.f39314f)) {
                    hashMap.put("ext_value", this.f39314f);
                }
                JSONObject b2 = this.f39310b.b();
                Iterator<String> keys = b2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals("has_v3", next)) {
                        try {
                            Object opt = b2.opt(next);
                            if (opt instanceof String) {
                                hashMap.put(next, (String) opt);
                            } else {
                                hashMap.put(next, new Gson().toJson(opt));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(this.g)) {
                    r.a(this.g, (Map) hashMap);
                }
            } catch (Exception unused2) {
            }
            d.a(this);
        }

        public final b a(j jVar) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{jVar}, this, f39309a, false, 31471, new Class[]{j.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{jVar}, this, f39309a, false, 31471, new Class[]{j.class}, b.class);
            }
            if (jVar != null) {
                if (jVar.creativeId == null) {
                    str = "";
                } else {
                    str = jVar.creativeId;
                }
                c(str);
                if (jVar.logExtra == null) {
                    str2 = "";
                } else {
                    str2 = jVar.logExtra;
                }
                g(str2);
                this.f39310b.a("ad_id", -1);
            }
            return this;
        }

        public final b b(long j) {
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f39309a, false, 31464, new Class[]{Long.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f39309a, false, 31464, new Class[]{Long.TYPE}, b.class);
            }
            this.f39310b.a("video_length", j);
            return this;
        }

        public final b a(n nVar) {
            if (PatchProxy.isSupport(new Object[]{nVar}, this, f39309a, false, 31472, new Class[]{n.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{nVar}, this, f39309a, false, 31472, new Class[]{n.class}, b.class);
            }
            if (nVar != null) {
                a(Long.valueOf(nVar.id));
                g(nVar.logExtra);
                this.f39310b.a("ad_id", nVar.adId);
            }
            return this;
        }

        public final b b(Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f39309a, false, 31478, new Class[]{Aweme.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39309a, false, 31478, new Class[]{Aweme.class}, b.class);
            }
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                b(aweme.getAwemeRawAd());
            }
            return this;
        }

        public final b a(Banner banner) {
            String str;
            if (PatchProxy.isSupport(new Object[]{banner}, this, f39309a, false, 31469, new Class[]{Banner.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{banner}, this, f39309a, false, 31469, new Class[]{Banner.class}, b.class);
            }
            if (banner != null) {
                a(Long.valueOf(banner.getCreativeId()));
                if (banner.getLogExtra() == null) {
                    str = "";
                } else {
                    str = banner.getLogExtra();
                }
                g(str);
                this.f39310b.a("ad_id", -1);
            }
            return this;
        }

        public final b b(AwemeRawAd awemeRawAd) {
            if (PatchProxy.isSupport(new Object[]{awemeRawAd}, this, f39309a, false, 31479, new Class[]{AwemeRawAd.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{awemeRawAd}, this, f39309a, false, 31479, new Class[]{AwemeRawAd.class}, b.class);
            }
            if (awemeRawAd != null) {
                a(awemeRawAd.getCreativeId());
                c(awemeRawAd.getGroupId());
                g(awemeRawAd.getLogExtra());
            }
            return this;
        }

        public final b a(Category category) {
            String str;
            if (PatchProxy.isSupport(new Object[]{category}, this, f39309a, false, 31473, new Class[]{Category.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{category}, this, f39309a, false, 31473, new Class[]{Category.class}, b.class);
            }
            if (category != null) {
                a(Long.valueOf(category.getCreativeId()));
                if (category.getLogExtra() == null) {
                    str = "";
                } else {
                    str = category.getLogExtra();
                }
                g(str);
                this.f39310b.a("ad_id", -1);
            }
            return this;
        }
    }

    public static b a() {
        b bVar;
        if (PatchProxy.isSupport(new Object[0], null, f39305a, true, 31449, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f39305a, true, 31449, new Class[0], b.class);
        }
        synchronized (d.class) {
            if (f39306b != null) {
                bVar = f39306b;
                f39306b = null;
            } else {
                bVar = null;
            }
        }
        if (bVar == null) {
            bVar = new b();
        } else {
            bVar.a();
        }
        return bVar;
    }

    static void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, null, f39305a, true, 31451, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, null, f39305a, true, 31451, new Class[]{b.class}, Void.TYPE);
            return;
        }
        synchronized (d.class) {
            if (f39306b == null) {
                f39306b = bVar;
                bVar.a();
            }
        }
    }

    public static b a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, null, f39305a, true, 31450, new Class[]{String.class, String.class, Long.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, null, f39305a, true, 31450, new Class[]{String.class, String.class, Long.TYPE}, b.class);
        }
        b a2 = a();
        a2.f39310b.a("ad_event_priority", (Object) "10");
        a2.f39310b.a("ad_event_type", (Object) "monitor");
        a2.f39310b.a("track_url_list", (Object) str3);
        a2.f39310b.a("track_status", (Object) str4);
        a2.f39310b.a(TimeDisplaySetting.TIME_DISPLAY_SETTING, j2);
        String a3 = z.a();
        if (!TextUtils.isEmpty(a3)) {
            a2.f39310b.a("user_agent", (Object) a3);
        }
        return a2;
    }
}
