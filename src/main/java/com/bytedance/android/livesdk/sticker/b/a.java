package com.bytedance.android.livesdk.sticker.b;

import com.bytedance.android.live.base.model.f;
import com.bytedance.android.livesdk.sticker.h;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17249a;
    @SerializedName("icon_url")

    /* renamed from: b  reason: collision with root package name */
    public f f17250b;
    @SerializedName("file_url")

    /* renamed from: c  reason: collision with root package name */
    public f f17251c;
    @SerializedName("id")

    /* renamed from: d  reason: collision with root package name */
    public long f17252d;
    @SerializedName("name")

    /* renamed from: e  reason: collision with root package name */
    public String f17253e;
    @SerializedName("description")

    /* renamed from: f  reason: collision with root package name */
    public List<String> f17254f;
    @SerializedName("tags")
    public List<String> g;
    public C0121a h;
    public List<String> i = new ArrayList();
    public Effect j;
    public String k;
    public String l;
    public String m;
    public String n = "";
    public int o = 0;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public String w;
    public String x;

    /* renamed from: com.bytedance.android.livesdk.sticker.b.a$a  reason: collision with other inner class name */
    public static class C0121a {
        @SerializedName("value")

        /* renamed from: a  reason: collision with root package name */
        public int f17255a;
        @SerializedName("tag")

        /* renamed from: b  reason: collision with root package name */
        public String f17256b = "";
        @SerializedName("max")

        /* renamed from: c  reason: collision with root package name */
        public int f17257c = 100;
        @SerializedName("min")

        /* renamed from: d  reason: collision with root package name */
        public int f17258d = 100;
        @SerializedName("doubleDirection")

        /* renamed from: e  reason: collision with root package name */
        public boolean f17259e;
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f17249a, false, 13410, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f17249a, false, 13410, new Class[0], String.class);
        } else if (h.a()) {
            return this.n;
        } else {
            if (this.f17252d == 0) {
                return "";
            }
            return String.valueOf(this.f17252d);
        }
    }

    public final boolean a(a aVar) {
        if (aVar != null && this.f17252d == aVar.f17252d) {
            return true;
        }
        return false;
    }

    public static boolean a(a aVar, a aVar2) {
        if (aVar == null || aVar2 == null || aVar.f17252d != aVar2.f17252d) {
            return false;
        }
        return true;
    }
}
