package com.ss.android.account;

import org.json.JSONObject;

public class b extends a {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public String j;
    public String k;
    public long l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public String q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public long y;
    public String z;

    public static class a implements com.bytedance.sdk.account.k.a<b> {
        public final /* synthetic */ com.bytedance.sdk.account.k.b a(JSONObject jSONObject) throws Exception {
            return b(jSONObject);
        }

        public static b b(JSONObject jSONObject) throws Exception {
            b bVar = new b(jSONObject);
            bVar.a();
            return bVar;
        }
    }

    public final void a() throws Exception {
        super.a();
        JSONObject jSONObject = this.f22520e;
        this.r = jSONObject.optInt("can_be_found_by_phone");
        this.s = jSONObject.optInt("share_to_repost", -1);
        boolean z2 = true;
        this.t = jSONObject.optInt("user_privacy_extend") & 1;
        this.u = jSONObject.optInt("user_privacy_extend");
        this.B = jSONObject.optInt("gender");
        this.j = jSONObject.optString("screen_name");
        this.k = jSONObject.optString("verified_content");
        this.C = jSONObject.optBoolean("is_generated");
        this.D = jSONObject.optBoolean("user_verified");
        if (jSONObject.optInt("is_recommend_allowed") == 0) {
            z2 = false;
        }
        this.o = z2;
        this.p = jSONObject.optString("recommend_hint_message");
        this.q = jSONObject.optString("user_decoration");
        JSONObject optJSONObject = jSONObject.optJSONObject("media");
        if (optJSONObject != null) {
            this.m = optJSONObject.optString("avatar_url");
            this.l = optJSONObject.optLong("id");
            this.n = optJSONObject.optString("name");
            this.A = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        this.v = jSONObject.optInt("followings_count");
        this.w = jSONObject.optInt("followers_count");
        this.x = jSONObject.optInt("visit_count_recent");
        this.y = jSONObject.optLong("media_id");
        this.z = jSONObject.optString("bg_img_url");
    }

    public b(JSONObject jSONObject) {
        super(jSONObject);
    }
}
