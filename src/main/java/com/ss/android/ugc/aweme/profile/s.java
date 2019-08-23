package com.ss.android.ugc.aweme.profile;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61671a;

    /* renamed from: b  reason: collision with root package name */
    public String f61672b;

    /* renamed from: c  reason: collision with root package name */
    public String f61673c;
    @User.BirthdayHideLevel

    /* renamed from: d  reason: collision with root package name */
    public int f61674d;

    /* renamed from: e  reason: collision with root package name */
    public String f61675e;

    /* renamed from: f  reason: collision with root package name */
    public String f61676f;
    public String g;
    public String h;
    public boolean i;
    public String j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public int t;

    public final Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f61671a, false, 67350, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f61671a, false, 67350, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f61673c)) {
            hashMap.put("birthday", this.f61673c);
        }
        if (this.f61674d != 0) {
            hashMap.put("birthday_hide_level", String.valueOf(this.f61674d));
        }
        if (!TextUtils.isEmpty(this.f61672b)) {
            hashMap.put("nickname", this.f61672b);
        }
        if (!TextUtils.isEmpty(this.f61675e)) {
            hashMap.put("gender", this.f61675e);
        }
        if (this.f61676f != null) {
            hashMap.put("signature", this.f61676f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            hashMap.put("unique_id", this.g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            hashMap.put("avatar_uri", this.h);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("school_name", this.j);
        }
        if (!TextUtils.isEmpty(this.m)) {
            hashMap.put("college_name", this.m);
        }
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put("enroll_year", this.n);
        }
        if (!TextUtils.isEmpty(this.k)) {
            hashMap.put("poi_id", this.k);
        }
        if (!TextUtils.isEmpty(this.o)) {
            hashMap.put("iso_country_code", this.o);
        }
        if (this.p != null) {
            hashMap.put("country", this.p);
        }
        if (this.r != null) {
            hashMap.put("city", this.r);
        }
        if (this.q != null) {
            hashMap.put("province", this.q);
        }
        if (this.s != null) {
            hashMap.put("district", this.s);
        }
        hashMap.put("school_type", String.valueOf(this.l));
        hashMap.put("show_gender_strategy", String.valueOf(this.t));
        hashMap.put("is_binded_weibo", String.valueOf(this.i ? 1 : 0));
        return hashMap;
    }
}
