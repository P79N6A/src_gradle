package com.bytedance.android.livesdk.j.a;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.j.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15643a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f15644b = c.b();

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f15645c;

    public final void a(String str, String str2, int i, JSONObject jSONObject) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), jSONObject}, this, f15643a, false, 10912, new Class[]{String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), jSONObject}, this, f15643a, false, 10912, new Class[]{String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
        } else if (jSONObject != null) {
            JSONObject a2 = a(jSONObject.toString());
            if (a2 != null) {
                a(a2, "service", str4);
                a(a2, "status_code", i);
                f15644b.b(str3, a2);
            }
        }
    }

    public final void a(Map map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f15643a, false, 10913, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f15643a, false, 10913, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        a(b(map));
    }

    public void a(JSONObject jSONObject, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, Integer.valueOf(i)}, this, f15643a, false, 10920, new Class[]{JSONObject.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, Integer.valueOf(i)}, this, f15643a, false, 10920, new Class[]{JSONObject.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (jSONObject != null) {
            try {
                jSONObject.put(str, i);
            } catch (Exception unused) {
            }
        }
    }

    public void a(JSONObject jSONObject, String str, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, new Long(j2)}, this, f15643a, false, 10921, new Class[]{JSONObject.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, new Long(j2)}, this, f15643a, false, 10921, new Class[]{JSONObject.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, str2}, this, f15643a, false, 10922, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, str2}, this, f15643a, false, 10922, new Class[]{JSONObject.class, String.class, String.class}, Void.TYPE);
        } else if (jSONObject != null) {
            try {
                jSONObject.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f15643a, true, 10908, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f15643a, true, 10908, new Class[0], a.class);
        }
        if (f15645c == null) {
            synchronized (a.class) {
                if (f15645c == null) {
                    f15645c = new a();
                }
            }
        }
        return f15645c;
    }

    @SuppressLint({"ResourceType"})
    private String a(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f15643a, false, 10923, new Class[]{View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{view}, this, f15643a, false, 10923, new Class[]{View.class}, String.class);
        } else if (view == null || view.getId() <= 0 || view.getContext() == null) {
            return "";
        } else {
            try {
                str = view.getContext().getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                str = "";
            }
            return str;
        }
    }

    private String b(View view) {
        String str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f15643a, false, 10924, new Class[]{View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{view2}, this, f15643a, false, 10924, new Class[]{View.class}, String.class);
        }
        if (view2 instanceof TextView) {
            str = ((TextView) view2).getText().toString();
        } else {
            str = "";
        }
        return str;
    }

    private String c(View view) {
        Object obj;
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f15643a, false, 10925, new Class[]{View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{view}, this, f15643a, false, 10925, new Class[]{View.class}, String.class);
        }
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = "";
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = "";
        }
        return str;
    }

    private String d(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f15643a, false, 10926, new Class[]{View.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{view}, this, f15643a, false, 10926, new Class[]{View.class}, String.class);
        }
        if (view != null) {
            str = (String) view.getContentDescription();
        } else {
            str = "";
        }
        return str;
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f15643a, false, 10914, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f15643a, false, 10914, new Class[]{JSONObject.class}, Void.TYPE);
        } else if (jSONObject2 != null) {
            f15644b.b(b.Page.info, jSONObject2);
        }
    }

    public JSONObject b(Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f15643a, false, 10916, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map}, this, f15643a, false, 10916, new Class[]{Map.class}, JSONObject.class);
        } else if (map == null) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
    }

    public JSONObject a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15643a, false, 10917, new Class[]{String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str2}, this, f15643a, false, 10917, new Class[]{String.class}, JSONObject.class);
        }
        try {
            return new JSONObject(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Map<String, String> a(View view, String str) {
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{view, str4}, this, f15643a, false, 10927, new Class[]{View.class, String.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{view, str4}, this, f15643a, false, 10927, new Class[]{View.class, String.class}, Map.class);
        }
        if (a(view).equals("")) {
            str2 = "";
        } else {
            str2 = "R.id." + r2;
        }
        String b2 = b(view);
        String c2 = c(view);
        String d2 = d(view);
        if (d2 == null) {
            d2 = "";
        }
        if (view != null) {
            str3 = view.getClass().getName();
        } else {
            str3 = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", str2);
        hashMap.put("text", b2);
        hashMap.put("tag", c2);
        hashMap.put("description", d2);
        hashMap.put("className", str3);
        hashMap.put("action", str4);
        return hashMap;
    }

    public final void a(String str, String str2, int i, Map map) {
        String str3 = str;
        String str4 = str2;
        Map map2 = map;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), map2}, this, f15643a, false, 10911, new Class[]{String.class, String.class, Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i), map2}, this, f15643a, false, 10911, new Class[]{String.class, String.class, Integer.TYPE, Map.class}, Void.TYPE);
            return;
        }
        a(str3, str4, i, b(map2));
    }
}
