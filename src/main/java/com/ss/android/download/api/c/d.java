package com.ss.android.download.api.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f28479a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28480b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28481c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f28482d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28483e;

    /* renamed from: f  reason: collision with root package name */
    public final String f28484f;
    public final long g;
    public final JSONObject h;
    public final List<String> i;
    public final int j;
    public final Object k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f28485a;

        /* renamed from: b  reason: collision with root package name */
        public String f28486b;

        /* renamed from: c  reason: collision with root package name */
        public String f28487c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28488d;

        /* renamed from: e  reason: collision with root package name */
        public long f28489e;

        /* renamed from: f  reason: collision with root package name */
        public String f28490f;
        public long g;
        public JSONObject h;
        public List<String> i;
        public int j;
        public Object k;
        private Map<String, Object> l;

        public final d a() {
            if (TextUtils.isEmpty(this.f28485a)) {
                this.f28485a = "umeng";
            }
            JSONObject jSONObject = new JSONObject();
            if (this.h == null) {
                this.h = new JSONObject();
            }
            try {
                if (this.l != null && !this.l.isEmpty()) {
                    for (Map.Entry next : this.l.entrySet()) {
                        if (!this.h.has((String) next.getKey())) {
                            this.h.putOpt((String) next.getKey(), next.getValue());
                        }
                    }
                }
                if (this.f28488d) {
                    jSONObject.put("ad_extra_data", this.h.toString());
                    if (!jSONObject.has("log_extra") && !TextUtils.isEmpty(this.f28490f)) {
                        jSONObject.put("log_extra", this.f28490f);
                    }
                    jSONObject.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                } else {
                    jSONObject.put(PushConstants.EXTRA, this.h);
                }
                this.h = jSONObject;
            } catch (Exception unused) {
            }
            return new d(this);
        }

        public final a a(int i2) {
            this.j = i2;
            return this;
        }

        public final a b(long j2) {
            this.g = j2;
            return this;
        }

        public final a c(String str) {
            this.f28487c = str;
            return this;
        }

        public final a d(String str) {
            this.f28490f = str;
            return this;
        }

        public final a a(long j2) {
            this.f28489e = j2;
            return this;
        }

        public final a b(String str) {
            this.f28486b = str;
            return this;
        }

        public final a a(Object obj) {
            this.k = obj;
            return this;
        }

        public final a a(String str) {
            this.f28485a = str;
            return this;
        }

        public final a a(List<String> list) {
            this.i = list;
            return this;
        }

        public final a a(JSONObject jSONObject) {
            this.h = jSONObject;
            return this;
        }

        public final a a(boolean z) {
            this.f28488d = z;
            return this;
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("category: ");
        sb.append(this.f28479a);
        sb.append("\ntag: ");
        sb.append(this.f28480b);
        sb.append("\nlabel: ");
        sb.append(this.f28481c);
        sb.append("  <------------------\nisAd: ");
        sb.append(this.f28482d);
        sb.append("\nadId: ");
        sb.append(this.f28483e);
        sb.append("\nlogExtra: ");
        sb.append(this.f28484f);
        sb.append("\nextValue: ");
        sb.append(this.g);
        sb.append("\nextJson: ");
        sb.append(this.h);
        sb.append("\nclickTrackUrl: ");
        if (this.i != null) {
            str = this.i.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("\neventSource: ");
        sb.append(this.j);
        sb.append("\nextraObject:");
        if (this.k != null) {
            str2 = this.k.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    d(a aVar) {
        this.f28479a = aVar.f28485a;
        this.f28480b = aVar.f28486b;
        this.f28481c = aVar.f28487c;
        this.f28482d = aVar.f28488d;
        this.f28483e = aVar.f28489e;
        this.f28484f = aVar.f28490f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
    }
}
