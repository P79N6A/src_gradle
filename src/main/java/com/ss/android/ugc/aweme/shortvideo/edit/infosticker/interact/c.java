package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

public class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String extra;
    private LinkedHashMap<String, InteractStickerStruct> structEditLinkedHashMap;
    private LinkedHashMap<String, InteractStickerStruct> structRecordLinkedHashMap;

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    private LinkedHashMap<String, InteractStickerStruct> a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, changeQuickRedirect, false, 76905, new Class[]{d.class}, LinkedHashMap.class)) {
            return (LinkedHashMap) PatchProxy.accessDispatch(new Object[]{dVar}, this, changeQuickRedirect, false, 76905, new Class[]{d.class}, LinkedHashMap.class);
        }
        switch (dVar) {
            case TRACK_PAGE_RECORD:
                if (this.structRecordLinkedHashMap == null) {
                    this.structRecordLinkedHashMap = new LinkedHashMap<>();
                }
                return this.structRecordLinkedHashMap;
            case TRACK_PAGE_EDIT:
                if (this.structEditLinkedHashMap == null) {
                    this.structEditLinkedHashMap = new LinkedHashMap<>();
                }
                return this.structEditLinkedHashMap;
            default:
                return new LinkedHashMap<>();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> getStickerStructsByPage(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r5 = 0
            r6 = 76901(0x12c65, float:1.07761E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 76901(0x12c65, float:1.07761E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0039:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
        L_0x003f:
            if (r9 >= r2) goto L_0x0068
            r3 = r0[r9]
            r4 = r17
            java.util.LinkedHashMap r3 = r4.a(r3)
            java.util.Set r5 = r3.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0051:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0065
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r3.get(r6)
            r1.add(r6)
            goto L_0x0051
        L_0x0065:
            int r9 = r9 + 1
            goto L_0x003f
        L_0x0068:
            r4 = r17
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.getStickerStructsByPage(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 76904(0x12c68, float:1.07765E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 76904(0x12c68, float:1.07765E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            int r2 = r0.length
            r3 = 0
        L_0x003f:
            if (r3 >= r2) goto L_0x0054
            r4 = r0[r3]
            r5 = r17
            java.util.LinkedHashMap r4 = r5.a(r4)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0051
            r1 = 0
            goto L_0x0056
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x0054:
            r5 = r17
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c.isEmpty(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]):boolean");
    }

    public InteractStickerStruct getTrackByIndex(String str, d dVar) {
        String str2 = str;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str2, dVar2}, this, changeQuickRedirect, false, 76902, new Class[]{String.class, d.class}, InteractStickerStruct.class)) {
            return (InteractStickerStruct) PatchProxy.accessDispatch(new Object[]{str2, dVar2}, this, changeQuickRedirect, false, 76902, new Class[]{String.class, d.class}, InteractStickerStruct.class);
        }
        LinkedHashMap<String, InteractStickerStruct> a2 = a(dVar2);
        if (a2.isEmpty()) {
            return null;
        }
        return a2.get(str2);
    }

    public void upDateStickerStructs(List<InteractStickerStruct> list, d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{list, dVar2}, this, changeQuickRedirect, false, 76906, new Class[]{List.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, dVar2}, this, changeQuickRedirect, false, 76906, new Class[]{List.class, d.class}, Void.TYPE);
            return;
        }
        LinkedHashMap<String, InteractStickerStruct> a2 = a(dVar2);
        a2.clear();
        if (!CollectionUtils.isEmpty(list)) {
            for (InteractStickerStruct next : list) {
                a2.put(String.valueOf(next.getIndex()), next);
            }
        }
    }

    public void updateStickerStruct(InteractStickerStruct interactStickerStruct, d dVar) {
        InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct2, dVar2}, this, changeQuickRedirect, false, 76903, new Class[]{InteractStickerStruct.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct2, dVar2}, this, changeQuickRedirect, false, 76903, new Class[]{InteractStickerStruct.class, d.class}, Void.TYPE);
            return;
        }
        a(dVar2).put(String.valueOf(interactStickerStruct.getIndex()), interactStickerStruct2);
    }
}
