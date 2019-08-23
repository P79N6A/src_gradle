package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.Position;
import java.lang.Character;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35013a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f35014b = new String("&");

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7 A[EDGE_INSN: B:34:0x00a7->B:28:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r21, int r22, java.lang.String r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r12 = 1
            r4[r12] = r5
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f35013a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 25182(0x625e, float:3.5287E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r14[r12] = r0
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f35013a
            r17 = 1
            r18 = 25182(0x625e, float:3.5287E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x005e:
            boolean r3 = android.text.TextUtils.isEmpty(r21)
            if (r3 == 0) goto L_0x0065
            return r0
        L_0x0065:
            if (r1 > 0) goto L_0x006a
            java.lang.String r0 = ""
            return r0
        L_0x006a:
            int r3 = r21.length()
            if (r3 > r1) goto L_0x0071
            return r0
        L_0x0071:
            r3 = -1
            r4 = 0
        L_0x0073:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = r3 + 1
            int r7 = r21.length()
            if (r6 >= r7) goto L_0x00a7
            int r7 = b(r0, r6)
            if (r7 != r13) goto L_0x0087
            r5 = 2
        L_0x0084:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0095
        L_0x0087:
            boolean r7 = c(r0, r6)
            if (r7 == 0) goto L_0x0093
            r5 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0095
        L_0x0093:
            r5 = 1
            goto L_0x0084
        L_0x0095:
            int r3 = r3 + r5
            int r5 = r21.length()
            if (r3 >= r5) goto L_0x00a7
            float r4 = r4 + r7
            float r5 = (float) r1
            r7 = 1008981770(0x3c23d70a, float:0.01)
            float r5 = r5 + r7
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            goto L_0x0073
        L_0x00a7:
            int r1 = r21.length()
            if (r6 < r1) goto L_0x00ae
            return r0
        L_0x00ae:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.substring(r11, r6)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.utils.a.a(java.lang.String, int, java.lang.String):java.lang.String");
    }

    private static boolean a(char c2) {
        if (PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, null, f35013a, true, 25185, new Class[]{Character.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, null, f35013a, true, 25185, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c2);
        return of == Character.UnicodeBlock.BASIC_LATIN || of == Character.UnicodeBlock.LATIN_1_SUPPLEMENT || of == Character.UnicodeBlock.LATIN_EXTENDED_A || of == Character.UnicodeBlock.LATIN_EXTENDED_B || of == Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL;
    }

    public static boolean a(String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, str2}, null, f35013a, true, 25186, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, null, f35013a, true, 25186, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static float a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f35013a, true, 25181, new Class[]{String.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{str2}, null, f35013a, true, 25181, new Class[]{String.class}, Float.TYPE)).floatValue();
        }
        float f2 = 0.0f;
        if (str2 == null) {
            return 0.0f;
        }
        int i = -1;
        while (true) {
            float f3 = 1.0f;
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return f2;
            }
            int i3 = 2;
            if (b(str2, i2) != 2) {
                if (c(str2, i2)) {
                    f3 = 0.5f;
                }
                i3 = 1;
            }
            i += i3;
            f2 += f3;
        }
    }

    public static String b(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f35013a, true, 25191, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f35013a, true, 25191, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            StringBuilder sb = new StringBuilder();
            while (i < str.length()) {
                int b2 = b(str2, i);
                if (b2 > 0) {
                    i += b2;
                } else {
                    sb.append(str2.charAt(i));
                    i++;
                }
            }
            return sb.toString();
        }
    }

    private static boolean c(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f35013a, true, 25184, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f35013a, true, 25184, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i >= str.length()) {
            return false;
        } else {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || (Character.isLowerCase(charAt) && a(charAt))) {
                return true;
            }
            return false;
        }
    }

    private static int b(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f35013a, true, 25183, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f35013a, true, 25183, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        char charAt = str.charAt(i);
        if (55296 <= charAt && charAt <= 56319) {
            int i2 = i + 1;
            if (i2 < str.length()) {
                int charAt2 = ((charAt - 55296) * 1024) + (str2.charAt(i2) - 56320) + 65536;
                if (118784 <= charAt2 && charAt2 <= 128895) {
                    return 2;
                }
            }
        } else if (8448 <= charAt && charAt <= 10239) {
            return 1;
        } else {
            if (11013 <= charAt && charAt <= 11015) {
                return 1;
            }
            if (10548 <= charAt && charAt <= 10549) {
                return 1;
            }
            if ((12951 <= charAt && charAt <= 12953) || charAt == 169 || charAt == 174 || charAt == 12349 || charAt == 12336 || charAt == 11093 || charAt == 11036 || charAt == 11035 || charAt == 11088) {
                return 1;
            }
            int i3 = i + 1;
            if (i3 < str.length() && str2.charAt(i3) == 8419) {
                return 2;
            }
        }
        return -1;
    }

    public static String a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f35013a, true, 25180, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f35013a, true, 25180, new Class[]{String.class, Integer.TYPE}, String.class);
        }
        return a(str2, i, f35014b);
    }

    public static SpannableString a(Context context, String str, List<Position> list) {
        Context context2 = context;
        String str2 = str;
        List<Position> list2 = list;
        if (!PatchProxy.isSupport(new Object[]{context2, str2, list2}, null, f35013a, true, 25193, new Class[]{Context.class, String.class, List.class}, SpannableString.class)) {
            return a(context2, str2, list2, 0);
        }
        return (SpannableString) PatchProxy.accessDispatch(new Object[]{context2, str2, list2}, null, f35013a, true, 25193, new Class[]{Context.class, String.class, List.class}, SpannableString.class);
    }

    public static SpannableString a(Context context, String str, List<Position> list, int i) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{context, str, list, Integer.valueOf(i)}, null, f35013a, true, 25194, new Class[]{Context.class, String.class, List.class, Integer.TYPE}, SpannableString.class)) {
            Object[] objArr = {context, str, list, Integer.valueOf(i)};
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, f35013a, true, 25194, new Class[]{Context.class, String.class, List.class, Integer.TYPE}, SpannableString.class);
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (context == null || TextUtils.isEmpty(str2) || CollectionUtils.isEmpty(list)) {
            return new SpannableString(str2);
        }
        SpannableString spannableString = new SpannableString(str2);
        for (Position next : list) {
            if (next != null) {
                spannableString = a(spannableString, next.getBegin() + i, next.getEnd() + 1 + i, context.getResources().getColor(C0906R.color.zl));
            }
        }
        return spannableString;
    }

    public static SpannableString a(SpannableString spannableString, int i, int i2, int i3) {
        SpannableString spannableString2 = spannableString;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f35013a, true, 25190, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f35013a, true, 25190, new Class[]{SpannableString.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class);
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i4 || max >= spannableString.length() || i4 > spannableString.length()) {
            return spannableString2;
        }
        b.a(spannableString2, new ForegroundColorSpan(i3), max, i4, 17);
        return spannableString2;
    }
}
