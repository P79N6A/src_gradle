package com.ss.android.ugc.aweme.property;

import android.os.Build;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.Lists;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.k;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import java.lang.reflect.Type;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63287a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f63288b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f63289c;

    public static int a(int i, int i2, int i3, int i4) {
        return (i <= 0 || i > 51) ? i4 : i;
    }

    public static boolean c() {
        return f63289c;
    }

    private static boolean s() {
        if (Build.VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70221, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70221, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!s() || !a.L.a(e.a.SyntheticHardCode)) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70223, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70223, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!s() || !a.L.a(e.a.WatermarkHardcode)) {
            return false;
        }
        return true;
    }

    public static boolean p() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70244, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70244, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!d() || !a.M.a(a.C0682a.EnableSaveUploadVideo)) {
            return false;
        }
        return true;
    }

    public static boolean q() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70245, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70245, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return g.b().aO().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    public static float f() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70226, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70226, new Class[0], Float.TYPE)).floatValue();
        }
        float d2 = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.SyntheticVideoBitrate);
        if (d2 != -1.0f) {
            return d2;
        }
        return com.ss.android.ugc.aweme.port.in.a.L.d(e.a.SyntheticVideoBitrate);
    }

    public static int g() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70227, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70227, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordVideoQuality);
        int b3 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordQualityCategoryIndex);
        List list = (List) a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.RecordQualityCategory), new TypeToken<List<Integer>>() {
        }.getType());
        if (Lists.notEmpty(list) && b3 < list.size()) {
            i = ((Integer) list.get(b3)).intValue();
        }
        if (i == 0) {
            i = b2;
        }
        return i;
    }

    public static String h() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70228, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70228, new Class[0], String.class);
        }
        String str = "";
        int[] j = j();
        if (j != null && j.length >= 2) {
            str = j[0] + "*" + j[1];
        }
        return str;
    }

    public static String i() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70229, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70229, new Class[0], String.class);
        }
        String str = "";
        int[] k = k();
        if (k != null && k.length >= 2) {
            str = k[0] + "*" + k[1];
        }
        return str;
    }

    @Nullable
    public static int[] j() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70230, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70230, new Class[0], int[].class);
        }
        int[] iArr = null;
        int[] a2 = a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSize));
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.VideoSizeIndex);
        List list = (List) a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSizeCategory), new TypeToken<List<String>>() {
        }.getType());
        if (Lists.notEmpty(list) && b2 < list.size()) {
            iArr = a((String) list.get(b2));
        }
        if (iArr != null) {
            return iArr;
        }
        return a2;
    }

    @Nullable
    public static int[] k() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70231, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70231, new Class[0], int[].class);
        }
        int[] iArr = null;
        int[] a2 = a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.VideoSize));
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.ImportVideoSizeIndex);
        List list = (List) a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.ImportVideoSizeCategory), new TypeToken<List<String>>() {
        }.getType());
        if (Lists.notEmpty(list) && b2 < list.size()) {
            iArr = a((String) list.get(b2));
        }
        if (iArr != null) {
            return iArr;
        }
        return a2;
    }

    public static int l() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70236, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70236, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.SyntheticVideoQuality);
        if (b2 != -1) {
            return b2;
        }
        return com.ss.android.ugc.aweme.port.in.a.L.b(e.a.SyntheticVideoQuality);
    }

    public static long m() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70237, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70237, new Class[0], Long.TYPE)).longValue();
        }
        long c2 = com.ss.android.ugc.aweme.port.in.a.M.c(a.C0682a.SyntheticVideoMaxRate);
        if (c2 != -1) {
            return c2;
        }
        return com.ss.android.ugc.aweme.port.in.a.L.c(e.a.SyntheticVideoMaxRate);
    }

    public static int n() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70238, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70238, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.SyntheticVideoPreset);
        if (b2 != -1) {
            return b2;
        }
        return com.ss.android.ugc.aweme.port.in.a.L.b(e.a.SyntheticVideoPreset);
    }

    public static int o() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70239, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70239, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.SyntheticVideoGop);
        if (b2 != -1) {
            return b2;
        }
        return com.ss.android.ugc.aweme.port.in.a.L.b(e.a.SyntheticVideoGop);
    }

    public static int r() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70246, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70246, new Class[0], Integer.TYPE)).intValue();
        }
        int i = 1090;
        try {
            int intValue = g.b().aP().intValue();
            if (intValue > 720 && intValue < 2200) {
                i = intValue;
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return i;
    }

    public static float e() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70225, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70225, new Class[0], Float.TYPE)).floatValue();
        }
        float d2 = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.VideoBitrate);
        if (d2 != -1.0f) {
            return d2;
        }
        float d3 = com.ss.android.ugc.aweme.port.in.a.L.d(e.a.VideoBitrate);
        int b2 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordBitrateCategoryIndex);
        List list = (List) a(com.ss.android.ugc.aweme.port.in.a.L.e(e.a.RecordBitrateCategory), new TypeToken<List<Float>>() {
        }.getType());
        if (!Lists.notEmpty(list) || b2 >= list.size()) {
            f2 = 0.0f;
        } else {
            f2 = ((Float) list.get(b2)).floatValue();
        }
        if (f2 != 0.0f) {
            d3 = f2;
        }
        return d3;
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f63287a, true, 70220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f63287a, true, 70220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!s() || !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.HardCode) || f63288b) {
            return false;
        }
        return true;
    }

    public static void a(boolean z) {
        f63289c = true;
    }

    public static float a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63287a, true, 70233, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63287a, true, 70233, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        return (com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.SmoothMax) / 5.0f) * ((float) k.a(i, 0, 5));
    }

    public static float b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63287a, true, 70235, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63287a, true, 70235, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        return (com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ReshapeMax) / 5.0f) * ((float) k.a(i, 0, 5));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f63287a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<int[]> r8 = int[].class
            r3 = 0
            r5 = 1
            r6 = 70241(0x11261, float:9.8429E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f63287a
            r13 = 1
            r14 = 70241(0x11261, float:9.8429E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<int[]> r16 = int[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            int[] r0 = (int[]) r0
            return r0
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            r3 = 0
            if (r2 == 0) goto L_0x003f
            return r3
        L_0x003f:
            int[] r2 = new int[r9]
            java.lang.String r4 = "x"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ Exception -> 0x008d }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x008d }
            r10[r9] = r0     // Catch:{ Exception -> 0x008d }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f63287a     // Catch:{ Exception -> 0x008d }
            r13 = 1
            r14 = 70242(0x11262, float:9.843E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x008d }
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r15[r9] = r4     // Catch:{ Exception -> 0x008d }
            java.lang.Class<int[]> r16 = int[].class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x007b
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x008d }
            r10[r9] = r0     // Catch:{ Exception -> 0x008d }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f63287a     // Catch:{ Exception -> 0x008d }
            r13 = 1
            r14 = 70242(0x11262, float:9.843E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x008d }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0     // Catch:{ Exception -> 0x008d }
            java.lang.Class<int[]> r16 = int[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x008d }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x008d }
            r2 = r0
            goto L_0x008d
        L_0x007b:
            int r1 = r0.length     // Catch:{ Exception -> 0x008d }
            int[] r1 = new int[r1]     // Catch:{ Exception -> 0x008d }
        L_0x007e:
            int r4 = r0.length     // Catch:{ Exception -> 0x008d }
            if (r9 >= r4) goto L_0x008c
            r4 = r0[r9]     // Catch:{ Exception -> 0x008d }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x008d }
            r1[r9] = r4     // Catch:{ Exception -> 0x008d }
            int r9 = r9 + 1
            goto L_0x007e
        L_0x008c:
            r2 = r1
        L_0x008d:
            int r0 = r2.length
            r1 = 2
            if (r0 == r1) goto L_0x0092
            return r3
        L_0x0092:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.f.a(java.lang.String):int[]");
    }

    @Nullable
    private static <T> T a(@Nullable String str, Type type) {
        String str2 = str;
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{str2, type2}, null, f63287a, true, 70240, new Class[]{String.class, Type.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str2, type2}, null, f63287a, true, 70240, new Class[]{String.class, Type.class}, Object.class);
        }
        try {
            return com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(str2, type2);
        } catch (Exception unused) {
            return null;
        }
    }
}
