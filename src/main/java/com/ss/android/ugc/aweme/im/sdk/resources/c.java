package com.ss.android.ugc.aweme.im.sdk.resources;

import a.g;
import a.i;
import android.support.annotation.MainThread;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.resources.model.e;
import com.ss.android.ugc.aweme.im.sdk.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.utils.j;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52276a;

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f52277e;

    /* renamed from: b  reason: collision with root package name */
    List<d> f52278b = new ArrayList();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52276a, false, 53089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52276a, false, 53089, new Class[0], Void.TYPE);
            return;
        }
        a("STICKER");
    }

    public static c b() {
        if (PatchProxy.isSupport(new Object[0], null, f52276a, true, 53093, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f52276a, true, 53093, new Class[0], c.class);
        }
        if (f52277e == null) {
            synchronized (c.class) {
                if (f52277e == null) {
                    f52277e = new c();
                }
            }
        }
        return f52277e;
    }

    static List<a> a(e eVar) {
        JSONObject jSONObject;
        if (PatchProxy.isSupport(new Object[]{eVar}, null, f52276a, true, 53091, new Class[]{e.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{eVar}, null, f52276a, true, 53091, new Class[]{e.class}, List.class);
        }
        String a2 = j.a(new File(i.b(eVar) + "/info.json"));
        ArrayList arrayList = new ArrayList();
        if (StringUtils.isEmpty(a2)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(a2).getJSONArray("stickers");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        a aVar = new a();
                        aVar.setAnimateType(jSONObject2.getString("animate_type"));
                        aVar.setDisplayName(jSONObject2.getString("display_name"));
                        aVar.setId(jSONObject2.getLong("id"));
                        aVar.setWidth(jSONObject2.getInt("width"));
                        aVar.setHeight(jSONObject2.getInt("height"));
                        String string = jSONObject2.getString("static_url");
                        String string2 = jSONObject2.getString("animate_url");
                        aVar.setStaticUrl(ae.a(string, aVar.getWidth(), aVar.getHeight()));
                        aVar.setStaticType(jSONObject2.getString("static_type"));
                        aVar.setAnimateUrl(ae.a(string2, aVar.getWidth(), aVar.getHeight()));
                        aVar.setVersion(eVar.getVersion());
                        aVar.setResourcesId(eVar.getId());
                        try {
                            jSONObject = jSONObject2.getJSONObject("display_name_lang");
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            if (jSONObject.keys() != null) {
                                HashMap hashMap = new HashMap();
                                Iterator<String> keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    hashMap.put(next, jSONObject.getString(next));
                                }
                                aVar.setDisplayNameLangs(hashMap);
                            }
                        }
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        return arrayList;
    }

    @MainThread
    public final void a(LinkedHashMap<e, List<a>> linkedHashMap) {
        LinkedHashMap<e, List<a>> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{linkedHashMap2}, this, f52276a, false, 53096, new Class[]{LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linkedHashMap2}, this, f52276a, false, 53096, new Class[]{LinkedHashMap.class}, Void.TYPE);
            return;
        }
        for (d a2 : this.f52278b) {
            a2.a(linkedHashMap2);
        }
    }

    @MainThread
    public final void a(e eVar, List<a> list) {
        e eVar2 = eVar;
        List<a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{eVar2, list2}, this, f52276a, false, 53095, new Class[]{e.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, list2}, this, f52276a, false, 53095, new Class[]{e.class, List.class}, Void.TYPE);
            return;
        }
        for (d a2 : this.f52278b) {
            a2.a(eVar2, list2);
        }
    }

    public final void a(e eVar, boolean z) {
        final List<a> list;
        final e eVar2 = eVar;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f52276a, false, 53094, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z)}, this, f52276a, false, 53094, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            list = a(eVar);
        } else {
            list = null;
        }
        z a2 = z.a();
        long id = eVar.getId();
        if (PatchProxy.isSupport(new Object[]{new Long(id), Byte.valueOf(z)}, a2, z.f52670a, false, 53604, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            z zVar = a2;
            PatchProxy.accessDispatch(new Object[]{new Long(id), Byte.valueOf(z)}, zVar, z.f52670a, false, 53604, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("download_success", z2 ? 1 : 0);
            } catch (JSONException unused) {
            }
            MobClick eventName = MobClick.obtain().setEventName("chat_gif_download");
            r.onEvent(eventName.setValue(id).setLabelName("perf_monitor").setJsonObject(jSONObject));
        }
        com.ss.android.b.a.a.a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52284a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f52284a, false, 53099, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52284a, false, 53099, new Class[0], Void.TYPE);
                    return;
                }
                c.this.a(eVar2, list);
            }
        });
    }

    public final void a(String str, final List<e> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f52276a, false, 53090, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f52276a, false, 53090, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new Callable<LinkedHashMap<e, List<a>>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52281a;

            public final /* synthetic */ Object call() throws Exception {
                List list;
                int i;
                if (PatchProxy.isSupport(new Object[0], this, f52281a, false, 53098, new Class[0], LinkedHashMap.class)) {
                    return (LinkedHashMap) PatchProxy.accessDispatch(new Object[0], this, f52281a, false, 53098, new Class[0], LinkedHashMap.class);
                }
                List<e> list2 = list;
                if (PatchProxy.isSupport(new Object[]{list2}, null, c.f52276a, true, 53092, new Class[]{List.class}, List.class)) {
                    list = (List) PatchProxy.accessDispatch(new Object[]{list2}, null, c.f52276a, true, 53092, new Class[]{List.class}, List.class);
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (list2.size() > 0) {
                        for (e a2 : list2) {
                            arrayList.add(c.a(a2));
                        }
                    }
                    list = arrayList;
                }
                if (list == null) {
                    i = 0;
                } else {
                    i = list.size();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    linkedHashMap.put(list.get(i2), list.get(i2));
                }
                return linkedHashMap;
            }
        }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<LinkedHashMap<e, List<a>>, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52279a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52279a, false, 53097, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52279a, false, 53097, new Class[]{i.class}, Void.class);
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.e();
                if (linkedHashMap == null || linkedHashMap.size() == 0) {
                    c.this.f52294d = true;
                } else {
                    c.this.f52294d = false;
                }
                c.this.a((LinkedHashMap) iVar.e());
                return null;
            }
        }, i.f1052b);
    }
}
