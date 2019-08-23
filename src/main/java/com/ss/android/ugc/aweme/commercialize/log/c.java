package com.ss.android.ugc.aweme.commercialize.log;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39293a;

    /* renamed from: b  reason: collision with root package name */
    private String f39294b;

    /* renamed from: c  reason: collision with root package name */
    private String f39295c;

    /* renamed from: d  reason: collision with root package name */
    private String f39296d;

    /* renamed from: e  reason: collision with root package name */
    private long f39297e;

    /* renamed from: f  reason: collision with root package name */
    private String f39298f;
    private long g;
    private JSONObject h;
    private JSONObject i;
    private String j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39299a;

        /* renamed from: b  reason: collision with root package name */
        public String f39300b;

        /* renamed from: c  reason: collision with root package name */
        private String f39301c;

        /* renamed from: d  reason: collision with root package name */
        private String f39302d;

        /* renamed from: e  reason: collision with root package name */
        private String f39303e;

        /* renamed from: f  reason: collision with root package name */
        private long f39304f;
        private String g;
        private long h;
        private JSONObject i;
        private JSONObject j;

        public final c a() {
            if (PatchProxy.isSupport(new Object[0], this, f39299a, false, 31448, new Class[0], c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[0], this, f39299a, false, 31448, new Class[0], c.class);
            }
            if (TextUtils.isEmpty(this.f39300b)) {
                this.f39300b = "umeng";
            }
            c cVar = new c(this.f39300b, this.f39301c, this.f39302d, this.f39303e, this.f39304f, this.g, this.h, this.i, this.j);
            return cVar;
        }

        public final a a(long j2) {
            this.f39304f = j2;
            return this;
        }

        public final a b(long j2) {
            this.h = j2;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a a(String str) {
            this.f39301c = str;
            return this;
        }

        public final a b(String str) {
            this.f39302d = str;
            return this;
        }

        public final a a(JSONObject jSONObject) {
            this.j = jSONObject;
            return this;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39293a, false, 31447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39293a, false, 31447, new Class[0], Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("category", this.f39294b);
        bundle.putLong("nt", (long) NetworkUtils.getNetworkType(GlobalContext.getContext()).getValue());
        bundle.putString("tag", this.f39296d);
        bundle.putString("label", this.j);
        bundle.putString("value", String.valueOf(this.f39297e));
        bundle.putString("log_extra", this.f39298f);
        bundle.putString("ext_value", String.valueOf(this.g));
        bundle.putString("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (this.h != null) {
            bundle.putString("ad_extra_data", String.valueOf(this.h));
        }
        if (this.i != null) {
            try {
                if (this.h == null) {
                    bundle.putString("ad_extra_data", this.i.optString("ad_extra_data"));
                }
                Iterator<String> keys = this.i.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, this.i.getString(next));
                }
            } catch (JSONException unused) {
            }
        }
        AppLogNewUtils.onEventV3Bundle(this.f39295c, bundle);
    }

    c(String str, String str2, String str3, String str4, long j2, String str5, long j3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f39294b = str;
        this.f39295c = str2;
        this.f39296d = str3;
        this.j = str4;
        this.f39297e = j2;
        this.f39298f = str5;
        this.g = j3;
        this.h = jSONObject;
        this.i = jSONObject2;
    }
}
