package com.bytedance.ad.symphony.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public String f7576a;

    /* renamed from: b  reason: collision with root package name */
    public String f7577b;

    /* renamed from: c  reason: collision with root package name */
    public String f7578c;

    /* renamed from: d  reason: collision with root package name */
    public String f7579d;

    /* renamed from: e  reason: collision with root package name */
    public int f7580e;

    /* renamed from: f  reason: collision with root package name */
    public String f7581f;

    /* renamed from: com.bytedance.ad.symphony.b.a$a  reason: collision with other inner class name */
    public static class C0059a extends a {
        public final String a() {
            return "ad_sdk_bid_request";
        }

        public C0059a(String str) {
            super(str);
        }
    }

    public static class b extends a {
        public final String a() {
            return "ad_sdk_bid_response";
        }

        public b(String str) {
            super(str);
        }
    }

    public static class c extends a {
        public final String a() {
            return "ad_sdk_creative_request";
        }

        public c(String str) {
            super(str);
        }
    }

    public static class d extends a {
        public final String a() {
            return "ad_sdk_creative_response";
        }

        public d(String str) {
            super(str);
        }
    }

    public static class e extends a {
        public final String a() {
            return "ad_sdk_loss_notice";
        }

        public e(String str) {
            super(str);
        }
    }

    public static class f extends a {
        public final String a() {
            return "ad_sdk_win_notice";
        }

        public f(String str) {
            super(str);
        }
    }

    public abstract String a();

    public a(String str) {
        this.f7579d = str;
    }
}
