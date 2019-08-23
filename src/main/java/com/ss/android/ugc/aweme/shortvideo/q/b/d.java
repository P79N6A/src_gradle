package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.festival.j;
import com.ss.android.ugc.aweme.shortvideo.festival.l;
import com.ss.android.ugc.aweme.util.c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68965a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(com.ss.android.ugc.aweme.shortvideo.q.b.b[] r21, java.lang.String r22, java.lang.String r23) {
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
            com.meituan.robust.ChangeQuickRedirect r6 = f68965a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.b[]> r5 = com.ss.android.ugc.aweme.shortvideo.q.b.b[].class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class<java.lang.String[]> r10 = java.lang.String[].class
            r5 = 0
            r7 = 1
            r8 = 81129(0x13ce9, float:1.13686E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f68965a
            r17 = 1
            r18 = 81129(0x13ce9, float:1.13686E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.b[]> r1 = com.ss.android.ugc.aweme.shortvideo.q.b.b[].class
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.d.a(com.ss.android.ugc.aweme.shortvideo.q.b.b[], java.lang.String, java.lang.String):java.lang.String[]");
    }

    public static b[] a(int i, int i2, String str, boolean z, boolean z2, boolean z3, c cVar) {
        String str2;
        byte b2;
        List list;
        int i3;
        ArrayList arrayList;
        b bVar;
        b bVar2;
        String str3 = str;
        c cVar2 = cVar;
        char c2 = 7;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), cVar2}, null, f68965a, true, 81128, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b[].class)) {
            return (b[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), cVar2}, null, f68965a, true, 81128, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b[].class);
        }
        List a2 = l.a(cVar2.f68961b);
        if (Lists.isEmpty(a2)) {
            return b(i, i2, str, z, z2, z3, cVar);
        }
        String str4 = "@" + str3;
        if (a.c()) {
            str2 = "ID:" + str3;
        } else {
            str2 = str4;
        }
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (i4 < a2.size()) {
            b bVar3 = new b();
            String str5 = ((j) a2.get(i4)).f67709c;
            if (!z2 || com.ss.android.ugc.aweme.port.in.a.j.c() != 0) {
                b2 = 0;
            } else {
                b2 = 1;
            }
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = str2;
            objArr[3] = str5;
            objArr[4] = Byte.valueOf(z);
            objArr[5] = Byte.valueOf(b2);
            objArr[6] = Byte.valueOf(z3);
            objArr[c2] = cVar2;
            if (PatchProxy.isSupport(objArr, bVar3, b.f68958a, false, 81117, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b.class)) {
                b bVar4 = (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, str5, Byte.valueOf(z), Byte.valueOf(b2), Byte.valueOf(z3), cVar2}, bVar3, b.f68958a, false, 81117, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b.class);
            } else {
                Bitmap decodeFile = BitmapFactory.decodeFile(str5);
                if (decodeFile == null) {
                    c.a("I18nWaterMarkImage --> pic Path   => " + str5);
                    new File(str5);
                    c.a("I18nWaterMarkImage --> pic exists => " + r1.exists());
                    c.a("I18nWaterMarkImage --> pic size   => " + r1.length());
                } else {
                    if (b2 == 0) {
                        bVar2 = bVar3;
                        i3 = i4;
                        arrayList = arrayList2;
                        list = a2;
                        bVar3.a(i, i2, str2, decodeFile, z, z3, cVar);
                    } else {
                        bVar2 = bVar3;
                        i3 = i4;
                        arrayList = arrayList2;
                        list = a2;
                        bVar2.a(i, i2, str2, decodeFile, z, z3);
                    }
                    bVar = bVar2;
                    arrayList.add(bVar);
                    i4 = i3 + 1;
                    arrayList2 = arrayList;
                    a2 = list;
                    c2 = 7;
                }
            }
            bVar = bVar3;
            i3 = i4;
            arrayList = arrayList2;
            list = a2;
            arrayList.add(bVar);
            i4 = i3 + 1;
            arrayList2 = arrayList;
            a2 = list;
            c2 = 7;
        }
        ArrayList arrayList3 = arrayList2;
        return (b[]) arrayList3.toArray(new b[arrayList3.size()]);
    }

    private static b[] b(int i, int i2, String str, boolean z, boolean z2, boolean z3, c cVar) {
        String str2;
        byte b2;
        TypedArray typedArray;
        int i3;
        int[] iArr;
        int i4;
        ArrayList arrayList;
        b bVar;
        String str3 = str;
        int i5 = 0;
        char c2 = 4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), cVar}, null, f68965a, true, 81126, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b[].class)) {
            return (b[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), cVar}, null, f68965a, true, 81126, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, b[].class);
        }
        TypedArray obtainTypedArray = com.ss.android.ugc.aweme.port.in.a.f61119b.getResources().obtainTypedArray(C0906R.array.aq);
        int length = obtainTypedArray.length();
        int[] iArr2 = new int[length];
        ArrayList arrayList2 = new ArrayList();
        String str4 = "@" + str3;
        if (a.c()) {
            str2 = "ID:" + str3;
        } else {
            str2 = str4;
        }
        int i6 = 0;
        while (i6 < length) {
            b bVar2 = new b();
            iArr2[i6] = obtainTypedArray.getResourceId(i6, i5);
            int i7 = iArr2[i6];
            if (!z2 || com.ss.android.ugc.aweme.port.in.a.j.c() != 0) {
                b2 = 0;
            } else {
                b2 = 1;
            }
            Object[] objArr = new Object[8];
            objArr[i5] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = str2;
            objArr[3] = Integer.valueOf(i7);
            objArr[c2] = Byte.valueOf(z);
            objArr[5] = Byte.valueOf(b2);
            objArr[6] = Byte.valueOf(z3);
            objArr[7] = cVar;
            ChangeQuickRedirect changeQuickRedirect = b.f68958a;
            Class[] clsArr = new Class[8];
            clsArr[i5] = Integer.TYPE;
            clsArr[1] = Integer.TYPE;
            clsArr[2] = String.class;
            clsArr[3] = Integer.TYPE;
            clsArr[4] = Boolean.TYPE;
            clsArr[5] = Boolean.TYPE;
            clsArr[6] = Boolean.TYPE;
            clsArr[7] = c.class;
            if (PatchProxy.isSupport(objArr, bVar2, changeQuickRedirect, false, 81116, clsArr, b.class)) {
                Object[] objArr2 = new Object[8];
                objArr2[i5] = Integer.valueOf(i);
                objArr2[1] = Integer.valueOf(i2);
                objArr2[2] = str2;
                objArr2[3] = Integer.valueOf(i7);
                objArr2[4] = Byte.valueOf(z);
                objArr2[5] = Byte.valueOf(b2);
                objArr2[6] = Byte.valueOf(z3);
                objArr2[7] = cVar;
                ChangeQuickRedirect changeQuickRedirect2 = b.f68958a;
                Class[] clsArr2 = new Class[8];
                clsArr2[i5] = Integer.TYPE;
                clsArr2[1] = Integer.TYPE;
                clsArr2[2] = String.class;
                clsArr2[3] = Integer.TYPE;
                clsArr2[4] = Boolean.TYPE;
                clsArr2[5] = Boolean.TYPE;
                clsArr2[6] = Boolean.TYPE;
                clsArr2[7] = c.class;
                b bVar3 = (b) PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, 81116, clsArr2, b.class);
                bVar = bVar2;
                i4 = i6;
                arrayList = arrayList2;
                iArr = iArr2;
                i3 = length;
                typedArray = obtainTypedArray;
            } else {
                Bitmap decodeResource = BitmapFactory.decodeResource(com.ss.android.ugc.aweme.port.in.a.f61119b.getResources(), i7, null);
                if (b2 == 0) {
                    bVar = bVar2;
                    i4 = i6;
                    arrayList = arrayList2;
                    iArr = iArr2;
                    i3 = length;
                    typedArray = obtainTypedArray;
                    bVar2.a(i, i2, str2, decodeResource, z, z3, cVar);
                } else {
                    bVar = bVar2;
                    i4 = i6;
                    arrayList = arrayList2;
                    iArr = iArr2;
                    i3 = length;
                    typedArray = obtainTypedArray;
                    bVar.a(i, i2, str2, decodeResource, z, z3);
                }
            }
            arrayList.add(bVar);
            i6 = i4 + 1;
            arrayList2 = arrayList;
            iArr2 = iArr;
            length = i3;
            obtainTypedArray = typedArray;
            i5 = 0;
            c2 = 4;
        }
        ArrayList arrayList3 = arrayList2;
        obtainTypedArray.recycle();
        return (b[]) arrayList3.toArray(new b[arrayList3.size()]);
    }

    @SuppressLint({"TooManyMethodParam"})
    public static String[] a(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, boolean z3, c cVar) {
        String str4 = str2;
        String str5 = str3;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str4, str5, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), cVar}, null, f68965a, true, 81127, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, String[].class)) {
            return a(a(i, i2, str, z, z2, z3, cVar), str4, str5);
        }
        return (String[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str, str4, str5, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), cVar}, null, f68965a, true, 81127, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, c.class}, String[].class);
    }
}
