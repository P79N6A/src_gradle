package com.ss.android.ugc.aweme.feedback;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47144a;

    /* renamed from: b  reason: collision with root package name */
    public long f47145b;

    /* renamed from: c  reason: collision with root package name */
    public long f47146c;

    /* renamed from: d  reason: collision with root package name */
    public int f47147d;

    /* renamed from: e  reason: collision with root package name */
    public long f47148e;

    /* renamed from: f  reason: collision with root package name */
    public String f47149f;
    public String g;
    public String h;
    public int i;
    public int j;
    public int k;
    public String l;
    public List<b> m;
    public List<a> n;
    public boolean o;

    class a {

        /* renamed from: a  reason: collision with root package name */
        public int f47150a;

        /* renamed from: b  reason: collision with root package name */
        public int f47151b;

        /* renamed from: c  reason: collision with root package name */
        public String f47152c;

        a(String str, int i, int i2) {
            this.f47150a = i;
            this.f47151b = i2;
            this.f47152c = str;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47154a;

        /* renamed from: b  reason: collision with root package name */
        public int f47155b;

        /* renamed from: c  reason: collision with root package name */
        public int f47156c;

        /* renamed from: d  reason: collision with root package name */
        public String f47157d;

        public b() {
        }
    }

    public final void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f47144a, false, 43776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47144a, false, 43776, new Class[0], Void.TYPE);
        } else if (!StringUtils.isEmpty(this.l)) {
            try {
                JSONArray jSONArray = new JSONArray(this.l);
                int length = jSONArray.length();
                if (length != 0) {
                    this.m = new ArrayList();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        b bVar = new b();
                        bVar.f47155b = jSONObject.optInt("start", -1);
                        bVar.f47156c = jSONObject.optInt("length", -1);
                        bVar.f47157d = jSONObject.optString(PushConstants.WEB_URL);
                        if (PatchProxy.isSupport(new Object[0], bVar, b.f47154a, false, 43777, new Class[0], Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f47154a, false, 43777, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            if (bVar.f47155b >= 0) {
                                if (bVar.f47156c >= 0) {
                                    if (!StringUtils.isEmpty(d.this.f47149f)) {
                                        if (bVar.f47155b + bVar.f47156c <= d.this.f47149f.length()) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                            z = false;
                        }
                        if (z) {
                            this.m.add(bVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public d(long j2) {
        this(j2, j2, 0);
    }

    private List<a> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f47144a, false, 43775, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f47144a, false, 43775, new Class[]{String.class}, List.class);
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                if (length == 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                this.g = jSONObject.optString("image_url");
                this.i = jSONObject.optInt("image_width", 0);
                this.j = jSONObject.optInt("image_height", 0);
                for (int i2 = 1; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    arrayList.add(new a(jSONObject2.optString("image_url"), jSONObject2.optInt("image_width", 0), jSONObject2.optInt("image_height", 0)));
                }
                return arrayList;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f47144a, false, 43774, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f47144a, false, 43774, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        this.f47148e = jSONObject.optLong("pub_date");
        this.f47149f = jSONObject.optString(PushConstants.CONTENT);
        this.g = jSONObject.optString("image_url");
        this.h = jSONObject.optString("avatar_url");
        this.i = jSONObject.optInt("image_width", 0);
        this.j = jSONObject.optInt("image_height", 0);
        this.k = jSONObject.optInt("type", 0);
        this.l = jSONObject.optString("links");
        if (jSONObject.optInt("multi_image", 0) == 1) {
            this.n = a(jSONObject.optString("image_list"));
        }
    }

    public d(long j2, long j3, int i2) {
        this.f47145b = j2;
        this.f47146c = j3;
        this.f47147d = i2;
    }
}
