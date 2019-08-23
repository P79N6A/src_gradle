package com.ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003J0\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkTypeTagsPriorityManager;", "", "()V", "COMMERCE", "", "COMPANY_LINK", "DOUPLUS", "LINK", "MICRO_APP", "POI", "STICKER", "priorityList", "", "priorityList$annotations", "getPriorityList", "()Ljava/util/List;", "setPriorityList", "(Ljava/util/List;)V", "getFirstAvailableTag", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "fromComment", "", "pageType", "", "shouldShowTag", "tagName", "updateSettings", "", "settings", "Lcom/ss/android/ugc/aweme/setting/model/AwemeSettings;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38971a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f38972b = new f();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static List<String> f38973c = CollectionsKt.mutableListOf("dou+", "company_link", "iron_man", "shopping_cart", "link", "poi", "sticker");

    @JvmStatic
    @JvmOverloads
    public static final boolean a(@NotNull String str, @Nullable Aweme aweme) {
        String str2 = str;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{str2, aweme2}, null, f38971a, true, 30891, new Class[]{String.class, Aweme.class}, Boolean.TYPE)) {
            return a(str2, aweme2, false, 0, 12);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, aweme2}, null, f38971a, true, 30891, new Class[]{String.class, Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean a(@NotNull String str, @Nullable Aweme aweme, boolean z) {
        String str2 = str;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{str2, aweme2, (byte) 1}, null, f38971a, true, 30890, new Class[]{String.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
            return a(str2, aweme2, true, 0, 8);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, aweme2, (byte) 1}, null, f38971a, true, 30890, new Class[]{String.class, Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    private f() {
    }

    @JvmStatic
    public static final void a(@Nullable AwemeSettings awemeSettings) {
        AwemeSettings awemeSettings2 = awemeSettings;
        if (PatchProxy.isSupport(new Object[]{awemeSettings2}, null, f38971a, true, 30888, new Class[]{AwemeSettings.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeSettings2}, null, f38971a, true, 30888, new Class[]{AwemeSettings.class}, Void.TYPE);
            return;
        }
        if (!(awemeSettings2 == null || awemeSettings2.adLinkPriority == null || awemeSettings2.adLinkPriority.isEmpty())) {
            List<String> list = awemeSettings2.adLinkPriority;
            Intrinsics.checkExpressionValueIsNotNull(list, "it.adLinkPriority");
            f38973c = list;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01be, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01be, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e7, code lost:
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r6 = r5;
        r5 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        if (com.ss.android.ugc.aweme.poi.e.p.b() != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        if (com.ss.android.ugc.aweme.poi.e.e.k() != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (com.ss.android.ugc.aweme.j.a.a.a(r20) != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0126, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0158, code lost:
        if (com.ss.android.ugc.aweme.j.a.a.a(r20) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016d, code lost:
        if (com.ss.android.g.a.c() == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01be, code lost:
        if (r6 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c0, code lost:
        return r4;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String a(com.ss.android.ugc.aweme.feed.model.Aweme r20, boolean r21, int r22) {
        /*
            r0 = r20
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Byte r4 = java.lang.Byte.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f38971a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 30893(0x78ad, float:4.329E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0062
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r13[r12] = r0
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f38971a
            r16 = 1
            r17 = 30893(0x78ad, float:4.329E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0062:
            r2 = 0
            if (r0 != 0) goto L_0x0066
            return r2
        L_0x0066:
            java.util.List<java.lang.String> r3 = f38973c
            java.util.Iterator r3 = r3.iterator()
        L_0x006c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.hashCode()
            switch(r5) {
                case -1890252483: goto L_0x01ae;
                case -1648893033: goto L_0x0170;
                case -309942941: goto L_0x015b;
                case 111178: goto L_0x00fc;
                case 3089441: goto L_0x00eb;
                case 3321850: goto L_0x00b4;
                case 1429828220: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x00e7
        L_0x0081:
            java.lang.String r5 = "company_link"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.commercialize.model.j r5 = r20.getLinkAdData()
            if (r5 == 0) goto L_0x0098
            int r5 = r5.getLinkType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0099
        L_0x0098:
            r5 = r2
        L_0x0099:
            if (r5 != 0) goto L_0x009c
            goto L_0x00e7
        L_0x009c:
            int r5 = r5.intValue()
            if (r5 != 0) goto L_0x00e7
            com.ss.android.ugc.aweme.commercialize.model.j r5 = r20.getLinkAdData()
            if (r5 == 0) goto L_0x00e7
            if (r21 == 0) goto L_0x00af
            boolean r5 = r5.showOnComment()
            goto L_0x00f7
        L_0x00af:
            boolean r5 = r5.showOnFeed()
            goto L_0x00f7
        L_0x00b4:
            java.lang.String r5 = "link"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.commercialize.model.j r5 = r20.getLinkAdData()
            if (r5 == 0) goto L_0x00cb
            int r5 = r5.getLinkType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00cc
        L_0x00cb:
            r5 = r2
        L_0x00cc:
            if (r5 != 0) goto L_0x00cf
            goto L_0x00e7
        L_0x00cf:
            int r5 = r5.intValue()
            if (r5 != r11) goto L_0x00e7
            com.ss.android.ugc.aweme.commercialize.model.j r5 = r20.getLinkAdData()
            if (r5 == 0) goto L_0x00e7
            if (r21 == 0) goto L_0x00e2
            boolean r5 = r5.showOnComment()
            goto L_0x00f7
        L_0x00e2:
            boolean r5 = r5.showOnFeed()
            goto L_0x00f7
        L_0x00e7:
            r5 = r22
            goto L_0x01bd
        L_0x00eb:
            java.lang.String r5 = "dou+"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            boolean r5 = com.ss.android.ugc.aweme.commercialize.utils.c.v(r20)
        L_0x00f7:
            r6 = r5
            r5 = r22
            goto L_0x01be
        L_0x00fc:
            java.lang.String r5 = "poi"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            if (r21 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r20.getPoiStruct()
            if (r5 == 0) goto L_0x0112
            boolean r5 = com.ss.android.ugc.aweme.poi.e.p.b()
            if (r5 != 0) goto L_0x0124
        L_0x0112:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r20.getPoiStruct()
            if (r5 == 0) goto L_0x011e
            boolean r5 = com.ss.android.ugc.aweme.poi.e.e.k()
            if (r5 != 0) goto L_0x0124
        L_0x011e:
            boolean r5 = com.ss.android.ugc.aweme.j.a.a.a(r20)
            if (r5 == 0) goto L_0x0126
        L_0x0124:
            r5 = 1
            goto L_0x00f7
        L_0x0126:
            r5 = 0
            goto L_0x00f7
        L_0x0128:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r20.getPoiStruct()
            if (r5 == 0) goto L_0x0134
            boolean r5 = com.ss.android.ugc.aweme.poi.e.p.b()
            if (r5 != 0) goto L_0x0124
        L_0x0134:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r5 = r20.getPoiStruct()
            if (r5 == 0) goto L_0x0140
            boolean r5 = com.ss.android.ugc.aweme.poi.e.e.k()
            if (r5 != 0) goto L_0x0124
        L_0x0140:
            com.ss.android.ugc.aweme.opensdk.a.a r5 = r20.getOpenPlatformStruct()
            if (r5 == 0) goto L_0x014b
            java.lang.String r5 = r5.getName()
            goto L_0x014c
        L_0x014b:
            r5 = r2
        L_0x014c:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0124
            boolean r5 = com.ss.android.ugc.aweme.j.a.a.a(r20)
            if (r5 == 0) goto L_0x0126
            goto L_0x0124
        L_0x015b:
            java.lang.String r5 = "iron_man"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.miniapp_api.model.f r5 = r20.getMicroAppInfo()
            if (r5 == 0) goto L_0x0126
            boolean r5 = com.ss.android.g.a.c()
            if (r5 != 0) goto L_0x0126
            goto L_0x0124
        L_0x0170:
            java.lang.String r5 = "shopping_cart"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00e7
            if (r21 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.commerce.service.models.x r5 = r20.getPromotion()
            if (r5 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.app.x r5 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r6 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.app.an r5 = r5.N()
            java.lang.String r6 = "CommonSharePrefCache.inst().enableShoppingTotal"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.Object r5 = r5.c()
            java.lang.String r6 = "CommonSharePrefCache.ins…enableShoppingTotal.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00e7
            r5 = r22
            r6 = 1
            goto L_0x01be
        L_0x01a7:
            r5 = r22
            boolean r6 = com.ss.android.ugc.aweme.commercialize.utils.s.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0, (int) r5)
            goto L_0x01be
        L_0x01ae:
            r5 = r22
            java.lang.String r6 = "sticker"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x01bd
            boolean r6 = com.ss.android.ugc.aweme.feed.ui.ad.a(r20)
            goto L_0x01be
        L_0x01bd:
            r6 = 0
        L_0x01be:
            if (r6 == 0) goto L_0x006c
            return r4
        L_0x01c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.link.f.a(com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int):java.lang.String");
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean a(@NotNull String str, @Nullable Aweme aweme, boolean z, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, aweme, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f38971a, true, 30889, new Class[]{String.class, Aweme.class, Boolean.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, aweme, Byte.valueOf(z), Integer.valueOf(i)}, null, f38971a, true, 30889, new Class[]{String.class, Aweme.class, Boolean.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "tagName");
        return TextUtils.equals(str2, a(aweme, z, i));
    }

    private static /* synthetic */ boolean a(String str, Aweme aweme, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            aweme = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(str, aweme, z, 0);
    }
}
