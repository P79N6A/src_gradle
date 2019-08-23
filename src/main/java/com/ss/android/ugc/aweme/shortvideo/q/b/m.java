package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.festival.j;
import com.ss.android.ugc.aweme.shortvideo.festival.l;
import java.util.ArrayList;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68997a;

    public static l[] a(String str, boolean z) {
        String str2 = str;
        char c2 = 2;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f68997a, true, 81183, new Class[]{String.class, Boolean.TYPE}, l[].class)) {
            return (l[]) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f68997a, true, 81183, new Class[]{String.class, Boolean.TYPE}, l[].class);
        }
        TypedArray obtainTypedArray = a.f61119b.getResources().obtainTypedArray(C0906R.array.aq);
        int length = obtainTypedArray.length();
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < length) {
            l lVar = new l();
            iArr[i] = obtainTypedArray.getResourceId(i, 0);
            int i2 = iArr[i];
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            objArr[1] = Integer.valueOf(i2);
            objArr[c2] = Byte.valueOf(z);
            ChangeQuickRedirect changeQuickRedirect = l.f68995a;
            Class[] clsArr = new Class[3];
            clsArr[0] = String.class;
            clsArr[1] = Integer.TYPE;
            clsArr[c2] = Boolean.TYPE;
            Class[] clsArr2 = clsArr;
            if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, 81178, clsArr2, l.class)) {
                l lVar2 = lVar;
                l lVar3 = (l) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), Byte.valueOf(z)}, lVar2, l.f68995a, false, 81178, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, l.class);
                boolean z2 = z;
            } else {
                lVar.a(str2, BitmapFactory.decodeResource(a.f61119b.getResources(), i2, null), z);
            }
            arrayList.add(lVar);
            i++;
            c2 = 2;
        }
        obtainTypedArray.recycle();
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    private static l[] a(String str, String str2, boolean z) {
        String str3 = str;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f68997a, true, 81186, new Class[]{String.class, String.class, Boolean.TYPE}, l[].class)) {
            return (l[]) PatchProxy.accessDispatch(new Object[]{str3, str2, Byte.valueOf(z)}, null, f68997a, true, 81186, new Class[]{String.class, String.class, Boolean.TYPE}, l[].class);
        }
        List a2 = l.a(str2);
        if (Lists.isEmpty(a2)) {
            return a(str3, z2);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a2.size(); i++) {
            l lVar = new l();
            String str4 = ((j) a2.get(i)).f67709c;
            if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z)}, lVar, l.f68995a, false, 81177, new Class[]{String.class, String.class, Boolean.TYPE}, l.class)) {
                l lVar2 = lVar;
                l lVar3 = (l) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, lVar2, l.f68995a, false, 81177, new Class[]{String.class, String.class, Boolean.TYPE}, l.class);
            } else {
                lVar.a(str3, BitmapFactory.decodeFile(str4), z2);
            }
            arrayList.add(lVar);
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(com.ss.android.ugc.aweme.shortvideo.q.b.l[] r21, java.lang.String r22, java.lang.String r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f68997a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.l[]> r5 = com.ss.android.ugc.aweme.shortvideo.q.b.l[].class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
            r5 = 0
            r7 = 1
            r8 = 81184(0x13d20, float:1.13763E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f68997a
            r17 = 1
            r18 = 81184(0x13d20, float:1.13763E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.l[]> r1 = com.ss.android.ugc.aweme.shortvideo.q.b.l[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String[]> r20 = java.lang.String[].class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L_0x0058:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x005d:
            int r4 = r0.length
            if (r11 >= r4) goto L_0x008b
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r11)
            java.lang.String r6 = ".png"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r1, r5)
            java.lang.String r4 = r4.getPath()
            r5 = r0[r11]
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0088
            r3.add(r4)
        L_0x0088:
            int r11 = r11 + 1
            goto L_0x005d
        L_0x008b:
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.m.a(com.ss.android.ugc.aweme.shortvideo.q.b.l[], java.lang.String, java.lang.String):java.lang.String[]");
    }

    public static String[] a(String str, String str2, String str3, String str4, boolean z) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (!PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, Byte.valueOf(z ? (byte) 1 : 0)}, null, f68997a, true, 81185, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, String[].class)) {
            return a(a(str5, str8, z), str6, str7);
        }
        Object[] objArr = {str5, str6, str7, str8, Byte.valueOf(z)};
        return (String[]) PatchProxy.accessDispatch(objArr, null, f68997a, true, 81185, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, String[].class);
    }
}
