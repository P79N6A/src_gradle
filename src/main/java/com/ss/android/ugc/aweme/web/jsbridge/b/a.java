package com.ss.android.ugc.aweme.web.jsbridge.b;

import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76726a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b.a$a  reason: collision with other inner class name */
    public static class C0802a {

        /* renamed from: a  reason: collision with root package name */
        public String f76727a;

        /* renamed from: b  reason: collision with root package name */
        public String f76728b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f76729c;

        public C0802a(String str, String str2, JSONObject jSONObject) {
            this.f76727a = str;
            this.f76728b = str2;
            this.f76729c = jSONObject;
        }
    }

    public interface b {
        void a(C0802a aVar, c cVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f76730a;

        /* renamed from: b  reason: collision with root package name */
        public Exception f76731b;

        public c(JSONObject jSONObject, Exception exc) {
            this.f76730a = jSONObject;
            this.f76731b = exc;
        }
    }

    public static String a(h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, null, f76726a, true, 90055, new Class[]{h.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{hVar2}, null, f76726a, true, 90055, new Class[]{h.class}, String.class);
        }
        try {
            return hVar2.f20623d.getString("proto");
        } catch (Exception unused) {
            return "";
        }
    }
}
