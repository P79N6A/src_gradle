package com.bytedance.android.livesdk.sticker.a;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.s;
import com.bytedance.android.livesdk.sticker.a.c;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17242a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, com.bytedance.android.livesdk.sticker.b.a>> f17243b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<com.bytedance.android.livesdk.sticker.b.a, Map<String, Float>> f17244c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c.b> f17245d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c.a> f17246e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f17247f;
    private final Map<String, Map<String, Float>> g;
    private final List<com.bytedance.android.livesdk.sticker.b.a> h;
    private final List<String> i;
    private final Map<String, Map<String, Float>> j;
    private d k;
    private boolean l;

    public static final class a implements h.b<c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17248a;

        @NonNull
        public final h.b.a<c> a(h.b.a<c> aVar) {
            h.b.a<c> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17248a, false, 13409, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new e((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17248a, false, 13409, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final Map<String, Map<String, com.bytedance.android.livesdk.sticker.b.a>> a() {
        return this.f17243b;
    }

    public final void a(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17242a, false, 13391, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17242a, false, 13391, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
        } else if (aVar != null && this.k != null) {
            if (!this.f17243b.containsKey(str)) {
                this.f17243b.put(str, new HashMap());
            }
            Map map = this.f17243b.get(str);
            if (map.containsKey(aVar.r)) {
                ((com.bytedance.android.livesdk.sticker.b.a) map.get(aVar.r)).i.addAll(aVar.i);
                return;
            }
            map.put(aVar.r, aVar);
            if (this.k.f17234b.contains(str)) {
                if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17242a, false, 13405, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17242a, false, 13405, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
                } else if (this.k != null && aVar != null && !StringUtils.isEmpty(aVar.r) && this.k.f17234b.contains(str) && !this.f17247f.contains(aVar.r)) {
                    this.f17247f.add(aVar.r);
                }
            }
            c();
            for (c.b a2 : this.f17245d) {
                a2.a(true, str, aVar);
            }
        }
    }

    public final void a(c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f17242a, false, 13392, new Class[]{c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f17242a, false, 13392, new Class[]{c.b.class}, Void.TYPE);
            return;
        }
        if (bVar != null && !this.f17245d.contains(bVar)) {
            this.f17245d.add(bVar);
        }
    }

    public final void a(EffectChannelResponse effectChannelResponse) {
        Float f2;
        if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f17242a, false, 13399, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f17242a, false, 13399, new Class[]{EffectChannelResponse.class}, Void.TYPE);
            return;
        }
        if (this.k != null && !this.i.isEmpty() && this.k.f17234b.contains(effectChannelResponse.panel)) {
            for (Effect next : effectChannelResponse.allCategoryEffects) {
                if (next != null && this.i.contains(next.unzipPath)) {
                    try {
                        JsonObject asJsonObject = new JsonParser().parse(next.extra).getAsJsonObject();
                        if (asJsonObject.has("ab_group") && ((Integer) LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP.a()).intValue() != asJsonObject.get("ab_group").getAsInt()) {
                        }
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.a("LiveComposerManager", (Throwable) e2);
                    }
                    if (this.j.containsKey(next.unzipPath)) {
                        com.bytedance.android.livesdk.sticker.b.a a2 = com.bytedance.android.livesdk.sticker.h.a(next);
                        Map map = this.j.get(next.unzipPath);
                        a2.i.addAll(map.keySet());
                        a(effectChannelResponse.panel, a2);
                        for (Object next2 : map.keySet()) {
                            if (!this.g.containsKey(next.unzipPath) || !this.g.get(next.unzipPath).containsKey(next2)) {
                                String str = (String) next2;
                                if (next.extra.contains(str)) {
                                    a2.i.add(str);
                                    Object obj = map.get(next2);
                                    if (obj instanceof Double) {
                                        f2 = Float.valueOf(((Double) obj).floatValue());
                                    } else {
                                        f2 = (Float) obj;
                                    }
                                    a(str, f2.floatValue());
                                }
                            }
                        }
                    } else {
                        a(effectChannelResponse.panel, com.bytedance.android.livesdk.sticker.h.a(next));
                    }
                }
            }
        }
    }

    public final void a(String str, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2)}, this, f17242a, false, 13400, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2)}, this, f17242a, false, 13400, new Class[]{String.class, Float.TYPE}, Void.TYPE);
        } else if (this.k != null) {
            for (com.bytedance.android.livesdk.sticker.b.a next : this.h) {
                if (!Lists.isEmpty(next.i) && next.i.contains(str)) {
                    if (!this.f17244c.containsKey(next) || !this.f17244c.get(next).containsKey(str) || !((Float) this.f17244c.get(next).get(str)).equals(Float.valueOf(f2))) {
                        int a2 = this.k.f17235c.a(next.r, str, f2);
                        com.bytedance.android.live.core.c.a.a("LiveComposerManager", "updateTagValue path:" + next.r + " tag:" + str + " value:" + f2 + " return:" + a2);
                        if (!this.f17244c.containsKey(next)) {
                            this.f17244c.put(next, new HashMap());
                        }
                        this.f17244c.get(next).put(str, Float.valueOf(f2));
                        a(next, str, f2);
                        if (!this.f17246e.isEmpty()) {
                            String str2 = "";
                            Iterator<String> it2 = this.f17243b.keySet().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (this.f17243b.get(next2).containsValue(next)) {
                                    str2 = next2;
                                    break;
                                }
                            }
                            for (c.a next3 : this.f17246e) {
                                if (next3 != null) {
                                    next3.a(str2, next, str, f2);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    private e() {
        this.f17244c = new HashMap();
        this.g = new HashMap();
        this.f17245d = new ArrayList();
        this.i = (List) b.af.a();
        this.j = (Map) b.ag.a();
        this.f17247f = new ArrayList();
        this.f17243b = new HashMap();
        this.h = new ArrayList();
        this.f17246e = new ArrayList();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17242a, false, 13403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17242a, false, 13403, new Class[0], Void.TYPE);
            return;
        }
        this.l = true;
        b.af.a(this.f17247f);
        b.ag.a(this.g);
        if (!(this.k == null || this.k.f17235c == null)) {
            this.k.f17235c.a(new String[0]);
            this.k.f17235c.a();
        }
        this.i.clear();
        this.i.addAll(this.f17247f);
        this.j.clear();
        this.j.putAll(this.g);
        this.f17243b.clear();
        this.f17245d.clear();
        this.f17246e.clear();
        this.f17247f.clear();
        this.h.clear();
        this.f17244c.clear();
        this.g.clear();
        this.k = null;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17242a, false, 13408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17242a, false, 13408, new Class[0], Void.TYPE);
        } else if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (a next : this.k.f17233a) {
                if (this.f17243b.containsKey(next.f17231b) && a((List<Integer>) arrayList2, next.f17230a)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(next.f17230a);
                    } else {
                        arrayList2.retainAll(next.f17230a);
                    }
                    if (this.k.f17236d.contains(next.f17231b)) {
                        z = true;
                    }
                    arrayList.addAll(this.f17243b.get(next.f17231b).values());
                }
            }
            if (!this.h.containsAll(arrayList) || !arrayList.containsAll(this.h)) {
                this.h.clear();
                this.h.addAll(arrayList);
                if (this.l) {
                    int a2 = this.k.f17235c.a(s.INST.getLiveComposerFilePath(), z);
                    com.bytedance.android.live.core.c.a.a("LiveComposerManager", "show sticker: " + s.INST.getLiveComposerFilePath() + " return: " + a2);
                    this.l = false;
                }
                this.k.f17235c.a(z);
                String[] a3 = com.bytedance.android.livesdk.sticker.a.a(arrayList);
                int a4 = this.k.f17235c.a(a3);
                com.bytedance.android.live.core.c.a.a("LiveComposerManager", "show sticker composer: " + Arrays.toString(a3) + " return: " + a4);
            }
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    public final void a(d dVar) {
        this.k = dVar;
        this.l = true;
    }

    public final void b(c.a aVar) {
        c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17242a, false, 13395, new Class[]{c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17242a, false, 13395, new Class[]{c.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            this.f17246e.remove(aVar2);
        }
    }

    private void a(com.bytedance.android.livesdk.sticker.b.a aVar) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17242a, false, 13406, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17242a, false, 13406, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && !StringUtils.isEmpty(aVar2.r)) {
            this.f17247f.remove(aVar2.r);
        }
    }

    public final void b(c.b bVar) {
        c.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f17242a, false, 13393, new Class[]{c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f17242a, false, 13393, new Class[]{c.b.class}, Void.TYPE);
        } else if (bVar2 != null) {
            this.f17245d.remove(bVar2);
        }
    }

    public final Float c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f17242a, false, 13401, new Class[]{String.class}, Float.class)) {
            return (Float) PatchProxy.accessDispatch(new Object[]{str2}, this, f17242a, false, 13401, new Class[]{String.class}, Float.class);
        }
        for (Map next : this.f17244c.values()) {
            if (next != null && next.containsKey(str2)) {
                return (Float) next.get(str2);
            }
        }
        return null;
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f17242a, false, 13397, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f17242a, false, 13397, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f17243b.containsKey(str) && this.f17243b.get(str).size() > 0) {
            for (com.bytedance.android.livesdk.sticker.b.a a2 : this.f17243b.get(str).values()) {
                a(a2);
            }
            this.f17243b.remove(str);
            c();
            for (c.b a3 : this.f17245d) {
                a3.a(false, str, null);
            }
        }
    }

    public final List<com.bytedance.android.livesdk.sticker.b.a> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f17242a, false, 13396, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f17242a, false, 13396, new Class[]{String.class}, List.class);
        } else if (this.f17243b.containsKey(str)) {
            return new ArrayList(this.f17243b.get(str).values());
        } else {
            return new ArrayList();
        }
    }

    public final void a(c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17242a, false, 13394, new Class[]{c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17242a, false, 13394, new Class[]{c.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && !this.f17246e.contains(aVar)) {
            this.f17246e.add(aVar);
        }
    }

    private boolean a(List<Integer> list, List<Integer> list2) {
        List<Integer> list3 = list2;
        if (PatchProxy.isSupport(new Object[]{list, list3}, this, f17242a, false, 13407, new Class[]{List.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, list3}, this, f17242a, false, 13407, new Class[]{List.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (list.isEmpty()) {
            return true;
        } else {
            for (Integer contains : list) {
                if (list3.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void b(String str, com.bytedance.android.livesdk.sticker.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f17242a, false, 13398, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f17242a, false, 13398, new Class[]{String.class, com.bytedance.android.livesdk.sticker.b.a.class}, Void.TYPE);
            return;
        }
        if (this.k != null && this.f17243b.containsKey(str) && this.f17243b.get(str).size() > 0) {
            this.f17243b.get(str).remove(aVar.r);
            if (this.k.f17234b.contains(str)) {
                a(aVar);
            }
            c();
            for (c.b a2 : this.f17245d) {
                a2.a(false, str, aVar);
            }
        }
    }

    private void a(com.bytedance.android.livesdk.sticker.b.a aVar, String str, float f2) {
        com.bytedance.android.livesdk.sticker.b.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, Float.valueOf(f2)}, this, f17242a, false, 13404, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, Float.valueOf(f2)}, this, f17242a, false, 13404, new Class[]{com.bytedance.android.livesdk.sticker.b.a.class, String.class, Float.TYPE}, Void.TYPE);
        } else if (this.f17247f.contains(aVar2.r)) {
            if (!this.g.containsKey(aVar2.r)) {
                this.g.put(aVar2.r, new HashMap());
            }
            this.g.get(aVar2.r).put(str2, Float.valueOf(f2));
        }
    }
}
