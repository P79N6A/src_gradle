package com.bytedance.android.livesdk.chatroom.e;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.i18n.b;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.android.livesdkapi.h.f;
import com.bytedance.android.livesdkapi.h.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10030a;

    private static int a(String str) {
        int i;
        if (PatchProxy.isSupport(new Object[]{str}, null, f10030a, true, 5440, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, f10030a, true, 5440, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = ac.b((int) C0906R.color.si);
        }
        return i;
    }

    public static Spannable a(e eVar, String str) {
        String str2;
        e eVar2 = eVar;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{eVar2, str3}, null, f10030a, true, 5435, new Class[]{e.class, String.class}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{eVar2, str3}, null, f10030a, true, 5435, new Class[]{e.class, String.class}, Spannable.class);
        } else if (eVar2 == null && TextUtils.isEmpty(str)) {
            return x.f10027b;
        } else {
            if (eVar2 == null) {
                return new SpannableString(str3);
            }
            if (eVar2.f18782a == null || TextUtils.isEmpty(b.a().a(eVar2.f18782a))) {
                str2 = eVar2.f18783b;
            } else {
                str2 = b.a().a(eVar2.f18782a);
            }
            Spannable a2 = a(str2, eVar2);
            if (a2 != x.f10027b) {
                return a2;
            }
            if (TextUtils.isEmpty(str)) {
                return x.f10027b;
            }
            return new SpannableString(str3);
        }
    }

    public static Spannable a(String str, e eVar) {
        String str2 = str;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{str2, eVar2}, null, f10030a, true, 5434, new Class[]{String.class, e.class}, Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[]{str2, eVar2}, null, f10030a, true, 5434, new Class[]{String.class, e.class}, Spannable.class);
        } else if (TextUtils.isEmpty(str) || eVar2 == null) {
            return x.f10027b;
        } else {
            if (eVar2.f18785d == null || eVar2.f18785d.size() == 0) {
                SpannableString spannableString = new SpannableString(str2);
                if (eVar2.f18784c != null) {
                    f fVar = eVar2.f18784c;
                    if (!TextUtils.isEmpty(fVar.f18786a)) {
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a(fVar.f18786a));
                        int length = spannableString.length();
                        if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 18}, null, z.f10031a, true, 5441, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 18}, null, z.f10031a, true, 5441, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            spannableString.setSpan(foregroundColorSpan, 0, length, 18);
                        }
                    }
                }
                return spannableString;
            }
            try {
                List<g> list = eVar2.f18785d;
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                a(str2, list, arrayList, linkedHashMap);
                if (arrayList.size() <= 0 || arrayList.size() != linkedHashMap.size()) {
                    return x.f10027b;
                }
                return a(eVar2, arrayList, linkedHashMap);
            } catch (Exception e2) {
                a.a(6, "ttlive_exception", e2.getStackTrace());
                StringWriter stringWriter = new StringWriter();
                com.google.a.a.a.a.a.a.a((Throwable) e2, new PrintWriter(stringWriter));
                HashMap hashMap = new HashMap();
                hashMap.put("stack_trace", stringWriter.toString());
                com.bytedance.android.live.core.d.e.a(d.b("ttlive_parse_text_status"), 1, (Map<String, Object>) hashMap);
                return x.f10027b;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: android.text.Spannable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0341  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Spannable a(com.bytedance.android.livesdkapi.h.e r29, java.util.List<java.lang.String> r30, java.util.Map<java.lang.Integer, com.bytedance.android.livesdkapi.h.g> r31) {
        /*
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f10030a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.bytedance.android.livesdkapi.h.e> r5 = com.bytedance.android.livesdkapi.h.e.class
            r9[r11] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r9[r12] = r5
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r9[r13] = r5
            java.lang.Class<android.text.Spannable> r10 = android.text.Spannable.class
            r5 = 0
            r7 = 1
            r8 = 5439(0x153f, float:7.622E-42)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f10030a
            r17 = 1
            r18 = 5439(0x153f, float:7.622E-42)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.bytedance.android.livesdkapi.h.e> r1 = com.bytedance.android.livesdkapi.h.e.class
            r0[r11] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r12] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r13] = r1
            java.lang.Class<android.text.Spannable> r20 = android.text.Spannable.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            android.text.Spannable r0 = (android.text.Spannable) r0
            return r0
        L_0x0056:
            int r4 = r30.size()
            if (r4 == 0) goto L_0x03b0
            int r4 = r31.size()
            if (r4 != 0) goto L_0x0064
            goto L_0x03b0
        L_0x0064:
            int r4 = r30.size()
            int r5 = r31.size()
            if (r4 == r5) goto L_0x0071
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.x.f10027b
            return r0
        L_0x0071:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r5 = r30.iterator()
        L_0x007a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            goto L_0x007a
        L_0x008a:
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r4)
            com.bytedance.android.livesdkapi.h.f r4 = r0.f18784c
            if (r4 == 0) goto L_0x00b1
            com.bytedance.android.livesdkapi.h.f r4 = r0.f18784c
            java.lang.String r6 = r4.f18786a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x00b1
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan
            java.lang.String r4 = r4.f18786a
            int r4 = a(r4)
            r6.<init>(r4)
            int r4 = r5.length()
            r7 = 18
            r5.setSpan(r6, r11, r4, r7)
        L_0x00b1:
            r4 = 0
            r6 = 0
        L_0x00b3:
            int r7 = r30.size()
            if (r4 >= r7) goto L_0x03af
            java.lang.Object r7 = r1.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x00c3
            java.lang.String r7 = ""
        L_0x00c3:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r2.get(r8)
            com.bytedance.android.livesdkapi.h.g r8 = (com.bytedance.android.livesdkapi.h.g) r8
            if (r8 == 0) goto L_0x03a3
            boolean r9 = r8 instanceof com.bytedance.android.livesdk.chatroom.e.q
            if (r9 == 0) goto L_0x00d5
            goto L_0x03a3
        L_0x00d5:
            int r9 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.STRING
            int r10 = r10.getPieceType()
            if (r9 != r10) goto L_0x00e3
            com.bytedance.android.livesdkapi.h.f r9 = r8.f18790b
            if (r9 == 0) goto L_0x00f2
        L_0x00e3:
            int r9 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.PATTERN_REF
            int r10 = r10.getPieceType()
            if (r9 != r10) goto L_0x00f6
            com.bytedance.android.livesdkapi.h.f r9 = r8.f18790b
            if (r9 == 0) goto L_0x00f2
            goto L_0x00f6
        L_0x00f2:
            r21 = r4
            goto L_0x039d
        L_0x00f6:
            com.bytedance.android.livesdkapi.h.f r9 = r8.f18790b
            if (r9 != 0) goto L_0x00fd
            com.bytedance.android.livesdkapi.h.f r9 = r0.f18784c
            goto L_0x00ff
        L_0x00fd:
            com.bytedance.android.livesdkapi.h.f r9 = r8.f18790b
        L_0x00ff:
            int r10 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r14 = com.bytedance.android.livesdkapi.h.d.STRING
            int r14 = r14.getPieceType()
            r15 = 17
            if (r10 == r14) goto L_0x035f
            int r10 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r14 = com.bytedance.android.livesdkapi.h.d.PATTERN_REF
            int r14 = r14.getPieceType()
            if (r10 != r14) goto L_0x0117
            goto L_0x035f
        L_0x0117:
            int r10 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r14 = com.bytedance.android.livesdkapi.h.d.USER
            int r14 = r14.getPieceType()
            if (r10 != r14) goto L_0x014d
            com.bytedance.android.livesdkapi.h.k r10 = r8.f18792d
            if (r10 == 0) goto L_0x014d
            java.lang.String r10 = r9.f18786a
            int r10 = a(r10)
            com.bytedance.android.livesdk.chatroom.ui.ei r14 = new com.bytedance.android.livesdk.chatroom.ui.ei
            com.bytedance.android.livesdkapi.h.k r8 = r8.f18792d
            com.bytedance.android.live.base.model.user.User r8 = r8.f18800a
            r14.<init>(r8, r10, r11)
            int r8 = r7.length()
            int r8 = r8 + r6
            r5.setSpan(r14, r6, r8, r15)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r8.<init>(r10)
            int r10 = r7.length()
            int r10 = r10 + r6
            r5.setSpan(r8, r6, r10, r15)
            r21 = r4
            goto L_0x0374
        L_0x014d:
            int r10 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r14 = com.bytedance.android.livesdkapi.h.d.GIFT
            int r14 = r14.getPieceType()
            if (r10 != r14) goto L_0x023f
            com.bytedance.android.livesdkapi.h.h r10 = r8.f18793e
            if (r10 == 0) goto L_0x023f
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r10 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r10 = com.bytedance.android.live.utility.b.a(r10)
            com.bytedance.android.live.gift.IGiftService r10 = (com.bytedance.android.live.gift.IGiftService) r10
            com.bytedance.android.livesdkapi.h.h r8 = r8.f18793e
            r21 = r4
            long r3 = r8.f18795a
            android.graphics.Bitmap r3 = r10.getGiftIconBitmap(r3)
            java.lang.String r4 = r9.f18786a
            int r4 = a(r4)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            r8.<init>(r4)
            int r4 = r7.length()
            int r4 = r4 + r6
            r5.setSpan(r8, r6, r4, r15)
            int r4 = r7.length()
            int r4 = r4 + r6
            int r4 = r4 - r12
            int r8 = r7.length()
            int r8 = r8 + r6
            r10 = 4
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r5
            r14[r12] = r3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            r14[r13] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r16 = 3
            r14[r16] = r15
            com.meituan.robust.ChangeQuickRedirect r16 = com.bytedance.android.livesdk.chatroom.e.x.f10026a
            r17 = 1
            r18 = 5427(0x1533, float:7.605E-42)
            java.lang.Class[] r15 = new java.lang.Class[r10]
            java.lang.Class<android.text.Spannable> r19 = android.text.Spannable.class
            r15[r11] = r19
            java.lang.Class<android.graphics.Bitmap> r19 = android.graphics.Bitmap.class
            r15[r12] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r15[r13] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r20 = 3
            r15[r20] = r19
            java.lang.Class<android.text.Spannable> r20 = android.text.Spannable.class
            r19 = r15
            r15 = 0
            boolean r14 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r14 == 0) goto L_0x0201
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r5
            r14[r12] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r14[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 3
            r14[r4] = r3
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.bytedance.android.livesdk.chatroom.e.x.f10026a
            r25 = 1
            r26 = 5427(0x1533, float:7.605E-42)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class<android.text.Spannable> r4 = android.text.Spannable.class
            r3[r11] = r4
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r3[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r5 = 3
            r3[r5] = r4
            java.lang.Class<android.text.Spannable> r28 = android.text.Spannable.class
            r22 = r14
            r27 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            r5 = r3
            android.text.Spannable r5 = (android.text.Spannable) r5
            goto L_0x023c
        L_0x0201:
            if (r3 == 0) goto L_0x023c
            if (r5 == 0) goto L_0x023c
            int r10 = r5.length()
            if (r10 == 0) goto L_0x023c
            if (r4 < 0) goto L_0x023c
            int r10 = r5.length()
            if (r4 > r10) goto L_0x023c
            if (r4 <= r8) goto L_0x0216
            goto L_0x023c
        L_0x0216:
            android.content.Context r10 = com.bytedance.android.live.core.utils.ac.e()
            android.content.Context r14 = com.bytedance.android.live.core.utils.ac.e()
            int r15 = com.bytedance.android.livesdk.chatroom.e.x.f10028c
            float r15 = (float) r15
            float r14 = com.bytedance.common.utility.UIUtils.dip2Px(r14, r15)
            int r14 = (int) r14
            android.graphics.drawable.BitmapDrawable r15 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r10 = r10.getResources()
            r15.<init>(r10, r3)
            r15.setBounds(r11, r11, r14, r14)
            com.bytedance.android.livesdk.widget.c r3 = new com.bytedance.android.livesdk.widget.c
            r3.<init>(r15)
            r10 = 33
            r5.setSpan(r3, r4, r8, r10)
        L_0x023c:
            r3 = 3
            goto L_0x0374
        L_0x023f:
            r21 = r4
            int r3 = r8.f18789a
            com.bytedance.android.livesdkapi.h.d r4 = com.bytedance.android.livesdkapi.h.d.HEART
            int r4 = r4.getPieceType()
            if (r3 != r4) goto L_0x023c
            com.bytedance.android.livesdkapi.h.i r3 = r8.f18794f
            if (r3 == 0) goto L_0x023c
            android.content.Context r3 = com.bytedance.android.live.core.utils.ac.e()
            android.content.res.Resources r4 = r3.getResources()
            r10 = 2131427911(0x7f0b0247, float:1.8477452E38)
            int r4 = r4.getDimensionPixelSize(r10)
            android.content.res.Resources r10 = r3.getResources()
            r14 = 2131427910(0x7f0b0246, float:1.847745E38)
            int r10 = r10.getDimensionPixelSize(r14)
            com.bytedance.android.livesdkapi.h.i r8 = r8.f18794f
            java.lang.String r8 = r8.f18797a
            int r8 = a(r8)
            boolean r14 = com.bytedance.android.live.uikit.a.a.a()
            if (r14 == 0) goto L_0x0353
            r14 = 3
            java.lang.Object[] r8 = new java.lang.Object[r14]
            r8[r11] = r3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            r8[r12] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r8[r13] = r15
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.bytedance.android.livesdk.widget.h.f18473a
            r25 = 1
            r26 = 14402(0x3842, float:2.0182E-41)
            java.lang.Class[] r15 = new java.lang.Class[r14]
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r15[r11] = r14
            java.lang.Class r14 = java.lang.Integer.TYPE
            r15[r12] = r14
            java.lang.Class r14 = java.lang.Integer.TYPE
            r15[r13] = r14
            java.lang.Class<android.graphics.Bitmap> r28 = android.graphics.Bitmap.class
            r22 = r8
            r27 = r15
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
            r14 = 0
            if (r8 == 0) goto L_0x02e1
            r15 = 3
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r8[r12] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r8[r13] = r3
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.bytedance.android.livesdk.widget.h.f18473a
            r25 = 1
            r26 = 14402(0x3842, float:2.0182E-41)
            java.lang.Class[] r3 = new java.lang.Class[r15]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r12] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r13] = r4
            java.lang.Class<android.graphics.Bitmap> r28 = android.graphics.Bitmap.class
            r22 = r8
            r27 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            r14 = r3
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            goto L_0x0358
        L_0x02e1:
            r15 = 3
            java.lang.ref.WeakReference<android.graphics.Bitmap> r8 = com.bytedance.android.livesdk.widget.h.f18475c
            if (r8 == 0) goto L_0x0307
            java.lang.ref.WeakReference<android.graphics.Bitmap> r8 = com.bytedance.android.livesdk.widget.h.f18475c
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x0305
            boolean r16 = r8.isRecycled()
            if (r16 != 0) goto L_0x0305
            int r13 = r8.getWidth()
            if (r13 != r4) goto L_0x0305
            int r13 = r8.getHeight()
            if (r13 == r10) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r14 = r8
            goto L_0x0358
        L_0x0305:
            com.bytedance.android.livesdk.widget.h.f18475c = r14
        L_0x0307:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.ref.WeakReference<android.graphics.Bitmap> r8 = com.bytedance.android.livesdk.widget.h.f18474b
            if (r8 == 0) goto L_0x0322
            java.lang.ref.WeakReference<android.graphics.Bitmap> r8 = com.bytedance.android.livesdk.widget.h.f18474b
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L_0x0320
            boolean r13 = r8.isRecycled()
            if (r13 != 0) goto L_0x0320
            goto L_0x0323
        L_0x0320:
            com.bytedance.android.livesdk.widget.h.f18474b = r14
        L_0x0322:
            r8 = r14
        L_0x0323:
            if (r8 != 0) goto L_0x033a
            r8 = 2130841193(0x7f020e69, float:1.7287446E38)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeResource(r3, r8)
            if (r8 != 0) goto L_0x032f
            goto L_0x0358
        L_0x032f:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r3 = com.bytedance.android.livesdk.widget.h.f18474b
            if (r3 != 0) goto L_0x033a
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r8)
            com.bytedance.android.livesdk.widget.h.f18474b = r3
        L_0x033a:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r8, r4, r10, r11)
            if (r3 != 0) goto L_0x0341
            goto L_0x0358
        L_0x0341:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            com.bytedance.android.livesdk.widget.h.f18475c = r4
            boolean r4 = r8.isRecycled()
            if (r4 != 0) goto L_0x0351
            r8.recycle()
        L_0x0351:
            r14 = r3
            goto L_0x0358
        L_0x0353:
            r15 = 3
            android.graphics.Bitmap r14 = com.bytedance.android.livesdk.widget.h.a(r3, r8, r4, r10)
        L_0x0358:
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.e.x.a((android.text.Spannable) r5, (android.graphics.Bitmap) r14)
            r5 = r3
            goto L_0x023c
        L_0x035f:
            r21 = r4
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            java.lang.String r8 = r9.f18786a
            int r8 = a(r8)
            r4.<init>(r8)
            int r8 = r7.length()
            int r8 = r8 + r6
            r5.setSpan(r4, r6, r8, r15)
        L_0x0374:
            int r4 = r9.f18788c
            r8 = 700(0x2bc, float:9.81E-43)
            if (r4 < r8) goto L_0x038a
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r12)
            int r8 = r7.length()
            int r8 = r8 + r6
            r10 = 33
            r5.setSpan(r4, r6, r8, r10)
            goto L_0x039d
        L_0x038a:
            r10 = 33
            int r4 = r9.f18788c
            if (r4 <= 0) goto L_0x039d
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r11)
            int r8 = r7.length()
            int r8 = r8 + r6
            r5.setSpan(r4, r6, r8, r10)
        L_0x039d:
            int r4 = r7.length()
            int r6 = r6 + r4
            goto L_0x03aa
        L_0x03a3:
            r21 = r4
            int r4 = r7.length()
            int r6 = r6 + r4
        L_0x03aa:
            int r4 = r21 + 1
            r13 = 2
            goto L_0x00b3
        L_0x03af:
            return r5
        L_0x03b0:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.e.x.f10027b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.e.y.a(com.bytedance.android.livesdkapi.h.e, java.util.List, java.util.Map):android.text.Spannable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e3, code lost:
        if (r10.getTag().equals(r8) != false) goto L_0x01e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r24, java.util.List<com.bytedance.android.livesdkapi.h.g> r25, java.util.List<java.lang.String> r26, java.util.Map<java.lang.Integer, com.bytedance.android.livesdkapi.h.g> r27) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f10030a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r12] = r6
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r10[r13] = r6
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r10[r14] = r6
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 5437(0x153d, float:7.619E-42)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0065
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f10030a
            r19 = 1
            r20 = 5437(0x153d, float:7.619E-42)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r14] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0065:
            if (r0 == 0) goto L_0x0477
            if (r1 == 0) goto L_0x0477
            int r4 = r25.size()
            if (r4 != 0) goto L_0x0071
            goto L_0x0477
        L_0x0071:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            r4.add(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = -1
            r9 = -1
            r10 = -1
        L_0x0087:
            int r11 = r24.length()
            if (r6 >= r11) goto L_0x0450
            char r11 = r0.charAt(r6)
            r14 = 58
            r13 = 125(0x7d, float:1.75E-43)
            if (r11 == r14) goto L_0x0425
            r14 = 123(0x7b, float:1.72E-43)
            if (r11 == r14) goto L_0x03ed
            if (r11 == r13) goto L_0x00a3
            r5 = 125(0x7d, float:1.75E-43)
            r23 = 2
            goto L_0x0443
        L_0x00a3:
            if (r8 == r5) goto L_0x00ae
            java.lang.CharSequence r8 = r0.subSequence(r8, r6)
            java.lang.String r8 = r8.toString()
            goto L_0x00c0
        L_0x00ae:
            java.lang.String r8 = "string"
            java.lang.CharSequence r10 = r0.subSequence(r9, r6)
            java.lang.String r10 = r10.toString()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r10 = r10.intValue()
        L_0x00c0:
            if (r10 == r5) goto L_0x03ec
            int r14 = r4.length()
            if (r14 <= 0) goto L_0x00cf
            int r14 = r4.length()
            r4.delete(r12, r14)
        L_0x00cf:
            java.lang.Object[] r14 = new java.lang.Object[r15]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            r14[r12] = r16
            r16 = 1
            r14[r16] = r8
            r17 = 2
            r14[r17] = r1
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = f10030a
            r20 = 1
            r21 = 5438(0x153e, float:7.62E-42)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r22 = java.lang.Integer.TYPE
            r5[r12] = r22
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            r5[r16] = r22
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r5[r17] = r16
            java.lang.Class<com.bytedance.android.livesdkapi.h.g> r22 = com.bytedance.android.livesdkapi.h.g.class
            r16 = r14
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x013c
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r12] = r10
            r10 = 1
            r5[r10] = r8
            r23 = 2
            r5[r23] = r1
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f10030a
            r19 = 1
            r20 = 5438(0x153e, float:7.62E-42)
            java.lang.Class[] r8 = new java.lang.Class[r15]
            java.lang.Class r16 = java.lang.Integer.TYPE
            r8[r12] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r8[r10] = r16
            java.lang.Class<java.util.List> r10 = java.util.List.class
            r8[r23] = r10
            java.lang.Class<com.bytedance.android.livesdkapi.h.g> r22 = com.bytedance.android.livesdkapi.h.g.class
            r16 = r5
            r21 = r8
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.bytedance.android.livesdkapi.h.g r5 = (com.bytedance.android.livesdkapi.h.g) r5
            goto L_0x01e7
        L_0x013c:
            r23 = 2
            if (r10 < 0) goto L_0x01e6
            int r5 = r25.size()
            if (r10 >= r5) goto L_0x01e6
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x01e6
            if (r1 == 0) goto L_0x01e6
            int r5 = r25.size()
            if (r5 != 0) goto L_0x0156
            goto L_0x01e6
        L_0x0156:
            java.lang.Object r5 = r1.get(r10)
            com.bytedance.android.livesdkapi.h.g r5 = (com.bytedance.android.livesdkapi.h.g) r5
            int r10 = r5.f18789a
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            r15[r12] = r16
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f10030a
            r19 = 1
            r20 = 5429(0x1535, float:7.608E-42)
            java.lang.Class[] r13 = new java.lang.Class[r14]
            java.lang.Class r14 = java.lang.Integer.TYPE
            r13[r12] = r14
            java.lang.Class<com.bytedance.android.livesdkapi.h.d> r22 = com.bytedance.android.livesdkapi.h.d.class
            r16 = r15
            r21 = r13
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r13 == 0) goto L_0x01a2
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14[r12] = r10
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f10030a
            r17 = 1
            r18 = 5429(0x1535, float:7.608E-42)
            java.lang.Class[] r10 = new java.lang.Class[r13]
            java.lang.Class r13 = java.lang.Integer.TYPE
            r10[r12] = r13
            java.lang.Class<com.bytedance.android.livesdkapi.h.d> r20 = com.bytedance.android.livesdkapi.h.d.class
            r19 = r10
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.bytedance.android.livesdkapi.h.d r10 = (com.bytedance.android.livesdkapi.h.d) r10
            goto L_0x01db
        L_0x01a2:
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.HEART
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x01ad
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.HEART
            goto L_0x01db
        L_0x01ad:
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.USER
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x01b8
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.USER
            goto L_0x01db
        L_0x01b8:
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.STRING
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x01c3
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.STRING
            goto L_0x01db
        L_0x01c3:
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.GIFT
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x01ce
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.GIFT
            goto L_0x01db
        L_0x01ce:
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.PATTERN_REF
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x01d9
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.PATTERN_REF
            goto L_0x01db
        L_0x01d9:
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.UNKNOWN
        L_0x01db:
            java.lang.String r10 = r10.getTag()
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x01e6
            goto L_0x01e7
        L_0x01e6:
            r5 = 0
        L_0x01e7:
            if (r5 == 0) goto L_0x03e5
            r8 = 1
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r12] = r5
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5430(0x1536, float:7.609E-42)
            java.lang.Class[] r10 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdkapi.h.g> r8 = com.bytedance.android.livesdkapi.h.g.class
            r10[r12] = r8
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r10
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r8 == 0) goto L_0x0224
            r8 = 1
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r12] = r5
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5430(0x1536, float:7.609E-42)
            java.lang.Class[] r10 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.android.livesdkapi.h.g> r8 = com.bytedance.android.livesdkapi.h.g.class
            r10[r12] = r8
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r10
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x03d5
        L_0x0224:
            if (r5 != 0) goto L_0x0229
        L_0x0226:
            r14 = 0
            goto L_0x03d5
        L_0x0229:
            int r8 = r5.f18789a
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.STRING
            int r10 = r10.getPieceType()
            if (r8 != r10) goto L_0x0237
            java.lang.String r8 = r5.f18791c
            goto L_0x03d4
        L_0x0237:
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.USER
            int r10 = r10.getPieceType()
            if (r8 != r10) goto L_0x02a3
            com.bytedance.android.livesdkapi.h.k r8 = r5.f18792d
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5431(0x1537, float:7.61E-42)
            java.lang.Class[] r14 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.k> r10 = com.bytedance.android.livesdkapi.h.k.class
            r14[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r14
            r10 = 0
            r14 = r10
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x027d
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5431(0x1537, float:7.61E-42)
            java.lang.Class[] r8 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.k> r10 = com.bytedance.android.livesdkapi.h.k.class
            r8[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r8
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x03d5
        L_0x027d:
            if (r8 == 0) goto L_0x0226
            com.bytedance.android.live.base.model.user.User r10 = r8.f18800a
            if (r10 != 0) goto L_0x0284
            goto L_0x0226
        L_0x0284:
            java.lang.String r10 = ""
            boolean r13 = r8.f18801b
            if (r13 == 0) goto L_0x028c
            java.lang.String r10 = " :"
        L_0x028c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.bytedance.android.live.base.model.user.User r8 = r8.f18800a
            java.lang.String r8 = com.bytedance.android.livesdk.message.c.a(r8)
            r13.append(r8)
            r13.append(r10)
            java.lang.String r14 = r13.toString()
            goto L_0x03d5
        L_0x02a3:
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.GIFT
            int r10 = r10.getPieceType()
            if (r8 != r10) goto L_0x034c
            com.bytedance.android.livesdkapi.h.h r8 = r5.f18793e
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5432(0x1538, float:7.612E-42)
            java.lang.Class[] r14 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.h> r10 = com.bytedance.android.livesdkapi.h.h.class
            r14[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r14
            r10 = 0
            r14 = r10
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x02e9
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5432(0x1538, float:7.612E-42)
            java.lang.Class[] r8 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.h> r10 = com.bytedance.android.livesdkapi.h.h.class
            r8[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r8
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x03d5
        L_0x02e9:
            if (r8 != 0) goto L_0x02ed
            goto L_0x0226
        L_0x02ed:
            com.bytedance.android.livesdkapi.h.c r10 = r8.f18796b
            r13 = 2131563648(0x7f0d1480, float:1.8752759E38)
            if (r10 == 0) goto L_0x0335
            com.bytedance.android.livesdkapi.h.c r10 = r8.f18796b
            java.lang.String r10 = r10.f18780a
            if (r10 == 0) goto L_0x0335
            java.lang.String r10 = ""
            com.bytedance.android.livesdkapi.h.c r14 = r8.f18796b
            java.lang.String r14 = r14.f18780a
            if (r14 == 0) goto L_0x030e
            com.bytedance.android.livesdk.i18n.b r10 = com.bytedance.android.livesdk.i18n.b.a()
            com.bytedance.android.livesdkapi.h.c r14 = r8.f18796b
            java.lang.String r14 = r14.f18780a
            java.lang.String r10 = r10.a(r14)
        L_0x030e:
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            if (r14 == 0) goto L_0x0318
            com.bytedance.android.livesdkapi.h.c r8 = r8.f18796b
            java.lang.String r10 = r8.f18781b
        L_0x0318:
            boolean r8 = android.text.TextUtils.isEmpty(r10)
            if (r8 == 0) goto L_0x0322
            java.lang.String r10 = com.bytedance.android.live.core.utils.ac.a((int) r13)
        L_0x0322:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            java.lang.String r10 = " ."
            r8.append(r10)
            java.lang.String r14 = r8.toString()
            goto L_0x03d5
        L_0x0335:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = com.bytedance.android.live.core.utils.ac.a((int) r13)
            r8.append(r10)
            java.lang.String r10 = " ."
            r8.append(r10)
            java.lang.String r14 = r8.toString()
            goto L_0x03d5
        L_0x034c:
            int r10 = r5.f18789a
            com.bytedance.android.livesdkapi.h.d r13 = com.bytedance.android.livesdkapi.h.d.HEART
            int r13 = r13.getPieceType()
            if (r10 != r13) goto L_0x035a
            java.lang.String r8 = " "
            goto L_0x03d4
        L_0x035a:
            com.bytedance.android.livesdkapi.h.d r10 = com.bytedance.android.livesdkapi.h.d.PATTERN_REF
            int r10 = r10.getPieceType()
            if (r8 != r10) goto L_0x0226
            com.bytedance.android.livesdkapi.h.j r8 = r5.g
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5433(0x1539, float:7.613E-42)
            java.lang.Class[] r14 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.j> r10 = com.bytedance.android.livesdkapi.h.j.class
            r14[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r14
            r10 = 0
            r14 = r10
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r10 == 0) goto L_0x039e
            r10 = 1
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r12] = r8
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f10030a
            r16 = 1
            r17 = 5433(0x1539, float:7.613E-42)
            java.lang.Class[] r8 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.android.livesdkapi.h.j> r10 = com.bytedance.android.livesdkapi.h.j.class
            r8[r12] = r10
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r8
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x03d4
        L_0x039e:
            if (r8 != 0) goto L_0x03a3
            java.lang.String r8 = ""
            goto L_0x03d4
        L_0x03a3:
            java.lang.String r10 = ""
            java.lang.String r13 = r8.f18798a
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x03c8
            com.bytedance.android.livesdk.i18n.b r13 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r14 = r8.f18798a
            java.lang.String r13 = r13.a(r14)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x03c8
            com.bytedance.android.livesdk.i18n.b r10 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r8 = r8.f18798a
            java.lang.String r8 = r10.a(r8)
            goto L_0x03d4
        L_0x03c8:
            java.lang.String r13 = r8.f18799b
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x03d3
            java.lang.String r8 = r8.f18799b
            goto L_0x03d4
        L_0x03d3:
            r8 = r10
        L_0x03d4:
            r14 = r8
        L_0x03d5:
            r2.add(r14)
            int r8 = r26.size()
            r10 = 1
            int r8 = r8 - r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3.put(r8, r5)
        L_0x03e5:
            int r7 = r7 + -1
            r5 = 125(0x7d, float:1.75E-43)
            r8 = -1
            r10 = -1
            goto L_0x0443
        L_0x03ec:
            return
        L_0x03ed:
            r23 = 2
            int r7 = r7 + 1
            r5 = 1
            if (r7 == r5) goto L_0x03f5
            return
        L_0x03f5:
            int r9 = r6 + 1
            int r13 = r4.length()
            if (r13 <= 0) goto L_0x0422
            int r13 = r4.length()
            if (r13 <= 0) goto L_0x0422
            java.lang.String r13 = r4.toString()
            r2.add(r13)
            int r13 = r26.size()
            int r13 = r13 - r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            com.bytedance.android.livesdk.chatroom.e.q r13 = new com.bytedance.android.livesdk.chatroom.e.q
            r13.<init>()
            r3.put(r5, r13)
            int r5 = r4.length()
            r4.delete(r12, r5)
        L_0x0422:
            r5 = 125(0x7d, float:1.75E-43)
            goto L_0x0443
        L_0x0425:
            r23 = 2
            if (r7 == 0) goto L_0x0448
            r5 = 1
            if (r7 == r5) goto L_0x042d
            return
        L_0x042d:
            java.lang.CharSequence r5 = r0.subSequence(r9, r6)
            java.lang.String r5 = r5.toString()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            int r8 = r6 + 1
            r10 = r5
            r5 = 125(0x7d, float:1.75E-43)
            r9 = -1
        L_0x0443:
            if (r11 == r5) goto L_0x0448
            r4.append(r11)
        L_0x0448:
            int r6 = r6 + 1
            r5 = -1
            r13 = 1
            r14 = 2
            r15 = 3
            goto L_0x0087
        L_0x0450:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0476
            java.lang.String r0 = r4.toString()
            r2.add(r0)
            int r0 = r26.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bytedance.android.livesdk.chatroom.e.q r1 = new com.bytedance.android.livesdk.chatroom.e.q
            r1.<init>()
            r3.put(r0, r1)
            int r0 = r4.length()
            r4.delete(r12, r0)
        L_0x0476:
            return
        L_0x0477:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.e.y.a(java.lang.String, java.util.List, java.util.List, java.util.Map):void");
    }
}
