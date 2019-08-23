package com.ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.u.aa;
import java.io.Serializable;
import java.util.HashMap;

public class l implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String activityId;
    public String authorId;
    public String awemeid;
    public String backendType;
    public String bannerId;
    public String challengeId;
    public String cityCode;
    public String clickMethod;
    public String contentType;
    public String couponId;
    public int displayStyle;
    public String distanceInfo;
    public String districtCode;
    public HashMap<String, String> forwardTypeV3Params;
    public String from;
    public String fromPoiId;
    public String fromUserId;
    public boolean hasActivity;
    public String isCoupon;
    public boolean isPreviewMode;
    public String logPb;
    public int order;
    public String pageType;
    public String playMode;
    public String poiChannel;
    public String poiId;
    public String poiLabelType;
    public String poiName;
    public String poiType;
    public String rankIndex;
    public String requestId;
    public String searchKeyWord;
    public String sticker;
    public String subClass;
    public String toUserId;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59931a;
        private String A;
        private String B;
        private String C;
        private String D;
        private String E;
        private String F;
        private String G;
        private int H;

        /* renamed from: b  reason: collision with root package name */
        public boolean f59932b;

        /* renamed from: c  reason: collision with root package name */
        public String f59933c;

        /* renamed from: d  reason: collision with root package name */
        public String f59934d;

        /* renamed from: e  reason: collision with root package name */
        public String f59935e;

        /* renamed from: f  reason: collision with root package name */
        public int f59936f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public boolean p;
        public String q;
        public String r;
        private String s;
        private String t;
        private String u;
        private String v;
        private String w;
        private String x = "click_label";
        private String y;
        private Aweme z;

        public final l a() {
            if (PatchProxy.isSupport(new Object[0], this, f59931a, false, 65025, new Class[0], l.class)) {
                return (l) PatchProxy.accessDispatch(new Object[0], this, f59931a, false, 65025, new Class[0], l.class);
            }
            l lVar = new l();
            lVar.poiId = this.s;
            lVar.activityId = this.i;
            lVar.couponId = this.j;
            lVar.rankIndex = this.k;
            lVar.subClass = this.l;
            lVar.districtCode = this.m;
            lVar.poiType = this.u;
            lVar.poiName = this.t;
            lVar.from = this.v;
            lVar.awemeid = this.w;
            lVar.toUserId = this.f59933c;
            lVar.fromUserId = this.f59934d;
            lVar.clickMethod = this.x;
            lVar.isPreviewMode = this.f59932b;
            lVar.pageType = this.y;
            lVar.forwardTypeV3Params = com.ss.android.ugc.aweme.forward.e.a.b(this.z, this.y);
            lVar.distanceInfo = aa.i(this.z);
            lVar.requestId = aa.c(this.z);
            lVar.authorId = aa.a(this.z);
            if (!TextUtils.isEmpty(this.G)) {
                lVar.authorId = this.G;
            }
            if (StringUtils.isEmpty(this.w)) {
                lVar.awemeid = aa.m(this.z);
            } else {
                lVar.awemeid = this.w;
            }
            lVar.poiChannel = this.E;
            lVar.searchKeyWord = this.f59935e;
            lVar.logPb = this.F;
            lVar.order = this.f59936f;
            lVar.isCoupon = this.A;
            lVar.bannerId = this.B;
            lVar.fromPoiId = this.C;
            lVar.poiLabelType = this.D;
            lVar.contentType = this.g;
            lVar.playMode = this.h;
            lVar.displayStyle = this.H;
            lVar.hasActivity = this.p;
            lVar.challengeId = this.q;
            lVar.sticker = this.r;
            lVar.backendType = this.n;
            lVar.cityCode = this.o;
            return lVar;
        }

        public final a a(int i2) {
            this.H = 0;
            return this;
        }

        public final a b(String str) {
            this.f59934d = str;
            return this;
        }

        public final a c(String str) {
            this.s = str;
            return this;
        }

        public final a d(String str) {
            this.i = str;
            return this;
        }

        public final a e(String str) {
            this.j = str;
            return this;
        }

        public final a f(String str) {
            this.u = str;
            return this;
        }

        public final a g(String str) {
            this.t = str;
            return this;
        }

        public final a h(String str) {
            this.G = str;
            return this;
        }

        public final a i(String str) {
            this.v = str;
            return this;
        }

        public final a j(String str) {
            this.y = str;
            return this;
        }

        public final a k(String str) {
            this.w = str;
            return this;
        }

        public final a l(String str) {
            this.x = str;
            return this;
        }

        public final a m(String str) {
            this.E = str;
            return this;
        }

        public final a n(String str) {
            this.F = str;
            return this;
        }

        public final a o(String str) {
            this.A = str;
            return this;
        }

        public final a p(String str) {
            this.B = str;
            return this;
        }

        public final a q(String str) {
            this.C = str;
            return this;
        }

        public final a r(String str) {
            this.D = str;
            return this;
        }

        public final a s(String str) {
            this.g = str;
            return this;
        }

        public final a t(String str) {
            this.h = str;
            return this;
        }

        public final a a(String str) {
            this.f59933c = str;
            return this;
        }

        public final a a(Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f59931a, false, 65021, new Class[]{Aweme.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{aweme}, this, f59931a, false, 65021, new Class[]{Aweme.class}, a.class);
            }
            this.z = aweme;
            this.w = aa.m(aweme);
            return this;
        }

        public final a a(SimplePoiInfoStruct simplePoiInfoStruct) {
            if (PatchProxy.isSupport(new Object[]{simplePoiInfoStruct}, this, f59931a, false, 65023, new Class[]{SimplePoiInfoStruct.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{simplePoiInfoStruct}, this, f59931a, false, 65023, new Class[]{SimplePoiInfoStruct.class}, a.class);
            }
            if (simplePoiInfoStruct != null) {
                this.n = simplePoiInfoStruct.getPoiBackendType();
                if (!TextUtils.isEmpty(simplePoiInfoStruct.getCityCode())) {
                    this.o = simplePoiInfoStruct.getCityCode();
                }
            }
            return this;
        }

        public final a a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f59931a, false, 65024, new Class[]{c.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{cVar}, this, f59931a, false, 65024, new Class[]{c.class}, a.class);
            }
            if (cVar != null) {
                this.n = cVar.getBackendType();
                if (!TextUtils.isEmpty(cVar.getPoiCity())) {
                    this.o = cVar.getPoiCity();
                }
            }
            return this;
        }

        public final a a(PoiStruct poiStruct) {
            if (PatchProxy.isSupport(new Object[]{poiStruct}, this, f59931a, false, 65022, new Class[]{PoiStruct.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{poiStruct}, this, f59931a, false, 65022, new Class[]{PoiStruct.class}, a.class);
            }
            if (poiStruct != null) {
                this.n = poiStruct.getBackendTypeCode();
                if (poiStruct.getAddress() != null) {
                    this.o = poiStruct.getAddress().cityCode;
                }
            }
            return this;
        }
    }

    public l() {
    }

    public boolean hasActivity() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65020, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65020, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.hasActivity || !TextUtils.isEmpty(this.sticker) || !TextUtils.isEmpty(this.challengeId)) {
            return true;
        } else {
            return false;
        }
    }

    public l(String str) {
        this.poiId = str;
    }
}
