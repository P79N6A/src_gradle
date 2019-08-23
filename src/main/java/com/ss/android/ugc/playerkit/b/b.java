package com.ss.android.ugc.playerkit.b;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f77704a = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f77705b;

    /* renamed from: c  reason: collision with root package name */
    public static a f77706c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile LruCache<String, List<a>> f77707d = new LruCache<>(4);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f77708a;

        /* renamed from: b  reason: collision with root package name */
        String f77709b;

        public final int hashCode() {
            return this.f77708a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f77708a == ((a) obj).f77708a) {
                return true;
            }
            return false;
        }

        a(int i, String str) {
            this.f77708a = i;
            this.f77709b = str;
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str) && ((List) f77707d.get(str)) == null) {
            f77707d.put(str, new CopyOnWriteArrayList());
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        List list = (List) f77707d.get(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        a[] aVarArr = (a[]) list.toArray(new a[list.size()]);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < aVarArr.length - 1; i++) {
                jSONArray.put(aVarArr[i].f77708a);
                sb.append(aVarArr[i].f77709b);
                sb.append(",");
            }
            jSONArray.put(aVarArr[aVarArr.length - 1].f77708a);
            sb.append(aVarArr[aVarArr.length - 1].f77709b);
            sb.append("]");
            list.clear();
            jSONObject.put("codes", jSONArray);
            jSONObject.put(PushConstants.EXTRA, sb.toString());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return jSONObject.toString();
    }

    public static void a(String str, String str2) {
        a(str, str2, com.ss.android.ugc.playerkit.session.a.a().b().uri);
    }

    public static void a(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List list = (List) f77707d.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                f77707d.put(str, list);
            }
            if (list.size() < 16) {
                a aVar = new a(i, str2);
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
            }
        }
    }

    private static void a(String str, String str2, String str3) {
        if (f77706c != null) {
            f77706c.a(str, str2, str3);
        }
    }
}
