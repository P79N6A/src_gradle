package com.ss.android.ugc.aweme.feed.e;

import android.content.SharedPreferences;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.e.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45259a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f45260b = "a";

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<C0562a> f45261c = new Comparator<C0562a>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C0562a aVar = (C0562a) obj;
            C0562a aVar2 = (C0562a) obj2;
            if (aVar.f45268c == aVar2.f45268c) {
                return 0;
            }
            if (aVar.f45268c > aVar2.f45268c) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static c<a> f45262d = new c<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45265a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f45265a, false, 41111, new Class[0], a.class)) {
                return new a((byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f45265a, false, 41111, new Class[0], a.class);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private final SharedPreferences f45263e;

    /* renamed from: f  reason: collision with root package name */
    private List<C0562a> f45264f;
    private long g;
    private long h;

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$a  reason: collision with other inner class name */
    static class C0562a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45266a;

        /* renamed from: b  reason: collision with root package name */
        String f45267b;

        /* renamed from: c  reason: collision with root package name */
        long f45268c;

        C0562a() {
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            if (PatchProxy.isSupport(new Object[0], this, f45266a, false, 41113, new Class[0], JSONObject.class)) {
                return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f45266a, false, 41113, new Class[0], JSONObject.class);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", this.f45267b);
                jSONObject.put("time", this.f45268c);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, f45266a, false, 41115, new Class[0], Integer.TYPE)) {
                return super.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f45266a, false, 41115, new Class[0], Integer.TYPE)).intValue();
        }

        /* synthetic */ C0562a(byte b2) {
            this();
        }

        public boolean equals(Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{obj2}, this, f45266a, false, 41114, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f45266a, false, 41114, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (obj2 instanceof C0562a) {
                if (StringUtils.equal(((C0562a) obj2).f45267b, this.f45267b)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f45259a, true, 41104, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f45259a, true, 41104, new Class[0], a.class);
        }
        return (a) f45262d.b();
    }

    private boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f45259a, false, 41107, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45259a, false, 41107, new Class[0], Boolean.TYPE)).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.h <= 5000) {
            return false;
        }
        this.h = currentTimeMillis;
        Collections.sort(this.f45264f, f45261c);
        int size = this.f45264f.size() - 1;
        while (size >= 0) {
            C0562a aVar = this.f45264f.get(size);
            if (aVar != null) {
                if (currentTimeMillis <= this.g + aVar.f45268c) {
                    break;
                }
                this.f45264f.remove(size);
                size--;
                z = true;
            }
        }
        if (z) {
            c();
        }
        return z;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45259a, false, 41108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45259a, false, 41108, new Class[0], Void.TYPE);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C0562a a2 : this.f45264f) {
            jSONArray.put(a2.a());
        }
        this.f45263e.edit().putString("push_list", jSONArray.toString()).apply();
    }

    private a() {
        C0562a aVar;
        this.f45264f = new ArrayList();
        this.g = 604800000;
        this.f45263e = com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "app_push_info", 0);
        String string = this.f45263e.getString("push_list", "[]");
        this.f45264f.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (PatchProxy.isSupport(new Object[]{optJSONObject}, null, C0562a.f45266a, true, 41112, new Class[]{JSONObject.class}, C0562a.class)) {
                            aVar = (C0562a) PatchProxy.accessDispatch(new Object[]{optJSONObject}, null, C0562a.f45266a, true, 41112, new Class[]{JSONObject.class}, C0562a.class);
                        } else {
                            C0562a aVar2 = new C0562a();
                            aVar2.f45267b = optJSONObject.optString("aid", "");
                            aVar2.f45268c = optJSONObject.optLong("time", 0);
                            aVar = aVar2;
                        }
                        if (!this.f45264f.contains(aVar)) {
                            this.f45264f.add(aVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f45259a, false, 41105, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f45259a, false, 41105, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, System.currentTimeMillis());
    }

    private void a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f45259a, false, 41106, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f45259a, false, 41106, new Class[]{String.class, Long.TYPE}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            C0562a aVar = new C0562a((byte) 0);
            aVar.f45268c = j2;
            aVar.f45267b = str2;
            synchronized (this) {
                if (!this.f45264f.contains(aVar)) {
                    this.f45264f.add(aVar);
                }
                if (!b()) {
                    c();
                }
            }
        }
    }

    public final void a(List<Aweme> list, String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f45259a, false, 41110, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f45259a, false, 41110, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (list != null) {
            synchronized (this) {
                b();
                Iterator<Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next != null && !StringUtils.equal(str, next.getAid())) {
                        for (C0562a next2 : this.f45264f) {
                            if (next2 != null && StringUtils.equal(next2.f45267b, next.getAid())) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
        }
    }
}
