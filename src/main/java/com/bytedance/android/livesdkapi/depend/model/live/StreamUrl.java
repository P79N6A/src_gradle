package com.bytedance.android.livesdkapi.depend.model.live;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StreamUrl {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18706a;
    @SerializedName("provider")

    /* renamed from: b  reason: collision with root package name */
    public int f18707b;
    @SerializedName("rtmp_push_url")

    /* renamed from: c  reason: collision with root package name */
    public String f18708c;
    @SerializedName("push_urls")

    /* renamed from: d  reason: collision with root package name */
    public List<String> f18709d;
    @SerializedName("rtmp_pull_url")

    /* renamed from: e  reason: collision with root package name */
    public String f18710e;
    @SerializedName("flv_pull_url")

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f18711f;
    @SerializedName("resolution_name")
    public Map<String, String> g;
    @SerializedName("candidate_resolution")
    public String[] h;
    @SerializedName("default_resolution")
    public String i;
    @SerializedName("extra")
    public f j;
    @SerializedName("rtmp_push_url_params")
    public String k;
    public String l;
    public String m;
    public String n = null;
    public String o = null;
    @SerializedName("flv_pull_url_params")
    private Map<String, String> p;
    @SerializedName("rtmp_pull_url_params")
    private String q;
    @Keep
    final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    @Keep
    final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f18706a, false, 14996, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f18706a, false, 14996, new Class[0], String.class);
        } else if (StringUtils.isEmpty(this.l)) {
            return this.f18708c;
        } else {
            return this.l;
        }
    }

    public final Set<String> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f18706a, false, 15000, new Class[0], Set.class)) {
            return this.qualityMap.keySet();
        }
        return (Set) PatchProxy.accessDispatch(new Object[0], this, f18706a, false, 15000, new Class[0], Set.class);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f18706a, false, 14998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18706a, false, 14998, new Class[0], Void.TYPE);
            return;
        }
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.n = null;
        this.o = null;
        if (!(this.h == null || this.g == null || this.f18711f == null)) {
            for (String str2 : this.h) {
                String str3 = this.g.get(str2);
                if (str3 != null) {
                    String str4 = this.f18711f.get(str2);
                    if (str4 != null) {
                        if (this.p == null) {
                            str = null;
                        } else {
                            str = this.p.get(str2);
                        }
                        this.qualityMap.put(str3, str4);
                        this.sdkParamsMap.put(str3, str);
                        if (str2.equals(this.i)) {
                            this.n = str3;
                        } else if (this.n == null) {
                            this.n = str3;
                        }
                        if (this.o == null) {
                            this.o = str3;
                        }
                    }
                }
            }
        }
        if (this.qualityMap.isEmpty() && !TextUtils.isEmpty(this.f18710e)) {
            this.n = "default";
            this.o = this.n;
            this.qualityMap.put(this.n, this.f18710e);
            this.sdkParamsMap.put(this.n, this.q);
        }
    }
}
