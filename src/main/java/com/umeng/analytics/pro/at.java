package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class at {

    /* renamed from: b  reason: collision with root package name */
    private final int f80402b = SearchJediMixFeedAdapter.f42517f;

    /* renamed from: c  reason: collision with root package name */
    private final int f80403c = 256;

    /* renamed from: d  reason: collision with root package name */
    private final int f80404d = 10;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f80405e;

    /* renamed from: f  reason: collision with root package name */
    private ar f80406f;
    private aq g;
    private JSONObject h;
    private ar i;

    public void a(String str, Map<String, Object> map) {
    }

    public boolean a(List<String> list, int i2, String str) {
        try {
            n a2 = n.a();
            if (list == null) {
                by.e("cklist is null!");
            } else if (list.size() <= 0) {
                by.e("the KeyList is null!");
                return false;
            } else {
                ArrayList arrayList = new ArrayList(list);
                if (!a2.b((String) arrayList.get(0))) {
                    by.e("Primary key Invalid!");
                    return false;
                }
                if (arrayList.size() > 8) {
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                    arrayList.add("__cc");
                    arrayList.add("illegal");
                } else if (!a2.a((List<String>) arrayList)) {
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                    arrayList.add("__cc");
                    arrayList.add("illegal");
                } else if (!a2.b((List<String>) arrayList)) {
                    arrayList.clear();
                    arrayList.add((String) arrayList.get(0));
                    arrayList.add("__cc");
                    arrayList.add("illegal");
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        String str2 = (String) arrayList.get(i3);
                        if (str2.length() > 16) {
                            arrayList.remove(i3);
                            arrayList.add(i3, str2.substring(0, 16));
                        }
                    }
                }
                if (!a2.a(str)) {
                    by.e("label  Invalid!");
                    str = "__illegal";
                }
                final HashMap hashMap = new HashMap();
                ArrayList arrayList2 = arrayList;
                l lVar = new l(arrayList2, (long) i2, str, System.currentTimeMillis());
                hashMap.put(arrayList, lVar);
                bz.b(new cb() {
                    public void a() {
                        m.a(at.this.f80405e).a((f) new f() {
                            public void a(Object obj, boolean z) {
                                obj.equals("success");
                            }
                        }, hashMap);
                    }
                });
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private void a() {
        try {
            if (!TextUtils.isEmpty(this.g.f80380a)) {
                String[] split = this.g.f80380a.split("!");
                JSONObject jSONObject = new JSONObject();
                int i2 = 0;
                if (this.h != null) {
                    for (String a2 : split) {
                        String a3 = bw.a(a2, (int) SearchJediMixFeedAdapter.f42517f);
                        if (this.h.has(a3)) {
                            jSONObject.put(a3, this.h.get(a3));
                        }
                    }
                }
                this.h = new JSONObject();
                if (split.length >= 10) {
                    while (i2 < 10) {
                        a(split[i2], jSONObject);
                        i2++;
                    }
                } else {
                    while (i2 < split.length) {
                        a(split[i2], jSONObject);
                        i2++;
                    }
                }
                b(this.f80405e);
                this.g.f80380a = null;
            }
        } catch (Exception unused) {
        }
    }

    private void a(Context context) {
        try {
            String string = ba.a(context).getString("fs_lc_tl", null);
            if (!TextUtils.isEmpty(string)) {
                this.h = new JSONObject(string);
            }
            a();
        } catch (Exception unused) {
        }
    }

    private void b(Context context) {
        try {
            if (this.h != null) {
                ba.a(this.f80405e).edit().putString("fs_lc_tl", this.h.toString()).commit();
            }
        } catch (Exception unused) {
        }
    }

    public at(Context context) {
        if (context == null) {
            try {
                by.e("Context is null, can't track event");
            } catch (Exception unused) {
                return;
            }
        }
        this.i = ar.b(context);
        this.f80405e = context;
        this.f80406f = ar.b(this.f80405e);
        this.g = this.f80406f.a(this.f80405e);
        if (this.h == null) {
            a(context);
        }
    }

    private boolean b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
            by.e("Event label or value is empty or too long in tracking Event");
            return false;
        } catch (Exception unused) {
        }
    }

    private boolean b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry next : map.entrySet()) {
                        if (!a((String) next.getKey()) || next.getValue() == null) {
                            return false;
                        }
                        if ((next.getValue() instanceof String) && !b(next.getValue().toString())) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        by.e("map is null or empty in onEvent");
        return false;
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : map.entrySet()) {
                try {
                    String str = (String) next.getKey();
                    if (str != null) {
                        String a2 = bw.a(str, (int) SearchJediMixFeedAdapter.f42517f);
                        Object value = next.getValue();
                        if (value != null) {
                            if (value.getClass().isArray()) {
                                int i2 = 0;
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    ArrayList arrayList = new ArrayList();
                                    while (i2 < iArr.length) {
                                        arrayList.add(Integer.valueOf(iArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    ArrayList arrayList2 = new ArrayList();
                                    while (i2 < dArr.length) {
                                        arrayList2.add(Double.valueOf(dArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < jArr.length) {
                                        arrayList3.add(Long.valueOf(jArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    ArrayList arrayList4 = new ArrayList();
                                    while (i2 < fArr.length) {
                                        arrayList4.add(Float.valueOf(fArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList4);
                                } else if (value instanceof boolean[]) {
                                    boolean[] zArr = (boolean[]) value;
                                    ArrayList arrayList5 = new ArrayList();
                                    while (i2 < zArr.length) {
                                        arrayList5.add(Boolean.valueOf(zArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList5);
                                } else if (value instanceof byte[]) {
                                    byte[] bArr = (byte[]) value;
                                    ArrayList arrayList6 = new ArrayList();
                                    while (i2 < bArr.length) {
                                        arrayList6.add(Byte.valueOf(bArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList6);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    ArrayList arrayList7 = new ArrayList();
                                    while (i2 < sArr.length) {
                                        arrayList7.add(Short.valueOf(sArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList7);
                                } else if (value instanceof char[]) {
                                    char[] cArr = (char[]) value;
                                    ArrayList arrayList8 = new ArrayList();
                                    while (i2 < cArr.length) {
                                        arrayList8.add(Character.valueOf(cArr[i2]));
                                        i2++;
                                    }
                                    jSONObject.put(a2, arrayList8);
                                } else {
                                    jSONObject.put(a2, new ArrayList(Arrays.asList((Object[]) value)));
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(a2, bw.a(value.toString(), 256));
                            } else {
                                jSONObject.put(a2, value);
                            }
                        }
                    }
                } catch (Exception e2) {
                    by.e((Throwable) e2);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        by.e("Event id is empty or too long in tracking Event");
        return false;
    }

    public void a(Context context, List<String> list) {
        try {
            if (this.f80405e == null && context != null) {
                this.f80405e = context;
            }
        } catch (Exception unused) {
        }
    }

    private void a(String str, JSONObject jSONObject) throws JSONException {
        String a2 = bw.a(str, (int) SearchJediMixFeedAdapter.f42517f);
        if (jSONObject.has(a2)) {
            a(a2, ((Boolean) jSONObject.get(a2)).booleanValue());
        } else {
            a(a2, false);
        }
    }

    private void a(String str, boolean z) {
        try {
            if (!"$st_fl".equals(str) && !"dplus_st".equals(str) && !"du".equals(str) && !"id".equals(str) && !TimeDisplaySetting.TIME_DISPLAY_SETTING.equals(str) && !this.h.has(str)) {
                this.h.put(str, z);
            }
        } catch (Exception unused) {
        }
    }

    public void b(String str, Map<String, Object> map) {
        try {
            if (a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                jSONObject.put("du", 0);
                jSONObject.put("__t", 2050);
                Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
                for (int i2 = 0; i2 < 10 && it2.hasNext(); i2++) {
                    Map.Entry next = it2.next();
                    if (!"$st_fl".equals(next.getKey()) && !"dplus_st".equals(next.getKey()) && !"du".equals(next.getKey()) && !"id".equals(next.getKey()) && !TimeDisplaySetting.TIME_DISPLAY_SETTING.equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put((String) next.getKey(), value);
                        }
                    }
                }
                jSONObject.put("__i", bd.g(this.f80405e));
                this.i.a((Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, Map<String, Object> map, long j) {
        try {
            if (a(str) && b(map)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put("du", j);
                }
                jSONObject.put("__t", 2049);
                Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
                for (int i2 = 0; i2 < 10 && it2.hasNext(); i2++) {
                    Map.Entry next = it2.next();
                    if (!"$st_fl".equals(next.getKey()) && !"dplus_st".equals(next.getKey()) && !"du".equals(next.getKey()) && !"id".equals(next.getKey()) && !TimeDisplaySetting.TIME_DISPLAY_SETTING.equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put((String) next.getKey(), value);
                        }
                    }
                }
                jSONObject.put("__i", bd.g(this.f80405e));
                jSONObject.put("_umpname", ap.f80374a);
                this.i.a((Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2, long j, int i2) {
        try {
            if (a(str)) {
                if (b(str2)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    if (j > 0) {
                        jSONObject.put("du", j);
                    }
                    jSONObject.put("__t", 2049);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                    jSONObject.put("__i", bd.g(this.f80405e));
                    jSONObject.put("_umpname", ap.f80374a);
                    this.i.a((Object) jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
