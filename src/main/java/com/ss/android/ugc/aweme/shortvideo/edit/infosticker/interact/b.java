package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.vesdk.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67249a;

    public static void a(p pVar, String str) {
        p pVar2 = pVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{pVar2, str2}, null, f67249a, true, 76898, new Class[]{p.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, str2}, null, f67249a, true, 76898, new Class[]{p.class, String.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            Collection<InteractStickerStruct> a2 = a(str2, d.TRACK_PAGE_RECORD);
            if (!CollectionUtils.isEmpty(a2)) {
                hashMap.put("interaction_stickers", a.D.getRetrofitFactoryGson().toJson((Object) a2));
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", a.D.getRetrofitFactoryGson().toJson((Object) hashMap));
            } catch (JSONException unused) {
            }
            pVar2.a("com.android.information", jSONObject.toString());
        }
    }

    public static c a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f67249a, true, 76891, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2}, null, f67249a, true, 76891, new Class[]{String.class}, c.class);
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            try {
                return ((e) a.D.getRetrofitFactoryGson().fromJson(str2, e.class)).mInteractStickerContext;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f67249a, true, 76895, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f67249a, true, 76895, new Class[]{String.class}, String.class);
        }
        String str3 = "";
        InteractStickerStruct a2 = a(str2, 1, d.TRACK_PAGE_EDIT);
        if (a2 == null || StringUtils.isEmpty(a2.getAttr())) {
            return str3;
        }
        try {
            HashMap hashMap = (HashMap) a.D.getRetrofitFactoryGson().fromJson(a2.getAttr(), new TypeToken<HashMap<String, String>>() {
            }.getType());
            if (hashMap != null && hashMap.containsKey("poll_sticker_id")) {
                str3 = (String) hashMap.get("poll_sticker_id");
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        return str3;
    }

    public static NormalTrackTimeStamp a(InteractStickerStruct interactStickerStruct) {
        List list;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, null, f67249a, true, 76899, new Class[]{InteractStickerStruct.class}, NormalTrackTimeStamp.class)) {
            return (NormalTrackTimeStamp) PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, null, f67249a, true, 76899, new Class[]{InteractStickerStruct.class}, NormalTrackTimeStamp.class);
        }
        try {
            list = (List) a.D.getRetrofitFactoryGson().fromJson(interactStickerStruct.getTrackList(), new TypeToken<List<NormalTrackTimeStamp>>() {
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return (NormalTrackTimeStamp) list.get(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> b(java.lang.String r19, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d... r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f67249a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 76897(0x12c61, float:1.07756E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f67249a
            r15 = 1
            r16 = 76897(0x12c61, float:1.07756E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0046:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c r0 = a((java.lang.String) r19)
            if (r0 == 0) goto L_0x007a
            boolean r3 = r0.isEmpty(r1)
            if (r3 == 0) goto L_0x0058
            goto L_0x007a
        L_0x0058:
            java.util.List r0 = r0.getStickerStructsByPage(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x0060:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0076
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.getVoteStruct()
            if (r3 == 0) goto L_0x0060
            r1.remove()
            goto L_0x0060
        L_0x0076:
            r2.addAll(r0)
            return r2
        L_0x007a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Collection<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> a(java.lang.String r19, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d... r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f67249a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r8[r11] = r4
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            r4 = 0
            r6 = 1
            r7 = 76894(0x12c5e, float:1.07751E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f67249a
            r15 = 1
            r16 = 76894(0x12c5e, float:1.07751E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r1 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r0[r11] = r1
            java.lang.Class<java.util.Collection> r18 = java.util.Collection.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
        L_0x0046:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c r0 = a((java.lang.String) r19)
            if (r0 == 0) goto L_0x00f6
            boolean r3 = r0.isEmpty(r1)
            if (r3 == 0) goto L_0x0054
            goto L_0x00f6
        L_0x0054:
            java.util.List r0 = r0.getStickerStructsByPage(r1)
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r4 = r3.getPoiStruct()
            if (r4 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r4 = new com.ss.android.ugc.aweme.sticker.data.PoiStruct
            r4.<init>()
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r5 = r3.getPoiStruct()
            java.lang.String r5 = r5.getPoiId()
            r4.setPoiId(r5)
            r3.setPoiStruct(r4)
        L_0x0081:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r3.getVoteStruct()
            if (r4 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.getVoteStruct()
            java.util.List r4 = r3.getOptions()
            boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x005c
            java.util.List r4 = r3.getOptions()
            int r4 = r4.size()
            if (r4 < r2) goto L_0x005c
            java.util.List r4 = r3.getOptions()
            java.lang.Object r4 = r4.get(r10)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
            java.lang.String r4 = r4.getPostOption()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x00c9
            java.util.List r4 = r3.getOptions()
            java.lang.Object r4 = r4.get(r10)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
            android.app.Application r5 = com.ss.android.ugc.aweme.port.in.a.f61119b
            r6 = 2131564623(0x7f0d184f, float:1.8754736E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setPostOption(r5)
        L_0x00c9:
            java.util.List r4 = r3.getOptions()
            java.lang.Object r4 = r4.get(r11)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r4 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r4
            java.lang.String r4 = r4.getPostOption()
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x005c
            java.util.List r3 = r3.getOptions()
            java.lang.Object r3 = r3.get(r11)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
            android.app.Application r4 = com.ss.android.ugc.aweme.port.in.a.f61119b
            r5 = 2131564624(0x7f0d1850, float:1.8754739E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setPostOption(r4)
            goto L_0x005c
        L_0x00f5:
            return r0
        L_0x00f6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]):java.util.Collection");
    }

    public static InteractStickerStruct a(String str, int i, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), dVar2}, null, f67249a, true, 76889, new Class[]{String.class, Integer.TYPE, d.class}, InteractStickerStruct.class)) {
            return (InteractStickerStruct) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), dVar2}, null, f67249a, true, 76889, new Class[]{String.class, Integer.TYPE, d.class}, InteractStickerStruct.class);
        }
        c a2 = a(str);
        if (a2 == null) {
            return null;
        }
        return a2.getTrackByIndex(String.valueOf(i), dVar2);
    }

    public static String a(String str, List<InteractStickerStruct> list, d dVar) {
        e eVar;
        c cVar;
        String str2 = str;
        List<InteractStickerStruct> list2 = list;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, list2, dVar2}, null, f67249a, true, 76890, new Class[]{String.class, List.class, d.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, list2, dVar2}, null, f67249a, true, 76890, new Class[]{String.class, List.class, d.class}, String.class);
        }
        if (StringUtils.isEmpty(str)) {
            eVar = new e();
        } else {
            try {
                eVar = (e) a.D.getRetrofitFactoryGson().fromJson(str2, e.class);
            } catch (Exception unused) {
                eVar = new e();
            }
        }
        if (eVar.mInteractStickerContext == null) {
            cVar = new c();
        } else {
            cVar = eVar.mInteractStickerContext;
        }
        cVar.upDateStickerStructs(list2, dVar2);
        eVar.setInteractStickerContext(cVar);
        return a.D.getRetrofitFactoryGson().toJson((Object) eVar);
    }
}
