package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43133a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f43134b = k.indexOf("general");

    /* renamed from: c  reason: collision with root package name */
    public static final int f43135c = k.indexOf("video");

    /* renamed from: d  reason: collision with root package name */
    public static final int f43136d = k.indexOf(AllStoryActivity.f73306b);

    /* renamed from: e  reason: collision with root package name */
    public static final int f43137e = k.indexOf("poi");

    /* renamed from: f  reason: collision with root package name */
    public static final int f43138f = k.indexOf("music");
    public static final int g = k.indexOf("hashtag");
    public static final int h = k.indexOf("goods");
    private static final List<String> i = Collections.unmodifiableList(Arrays.asList(new String[]{"general", "video", AllStoryActivity.f73306b, "poi", "music", "hashtag", "goods"}));
    private static final List<String> j = Collections.unmodifiableList(Arrays.asList(new String[]{"general", AllStoryActivity.f73306b, "music", "hashtag", "video"}));
    private static List<String> k;

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f43133a, true, 38032, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f43133a, true, 38032, new Class[0], Integer.TYPE)).intValue();
        }
        return k.size();
    }

    private static List<String> b() {
        List<String> list;
        if (PatchProxy.isSupport(new Object[0], null, f43133a, true, 38029, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f43133a, true, 38029, new Class[0], List.class);
        }
        if (a.a()) {
            list = j;
        } else {
            list = i;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018c, code lost:
        if (r1 != 0) goto L_0x0203;
     */
    static {
        /*
            r0 = 7
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "general"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "video"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "user"
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "poi"
            r5 = 3
            r0[r5] = r1
            java.lang.String r1 = "music"
            r6 = 4
            r0[r6] = r1
            java.lang.String r1 = "hashtag"
            r7 = 5
            r0[r7] = r1
            java.lang.String r1 = "goods"
            r8 = 6
            r0[r8] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            i = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "general"
            r0[r2] = r1
            java.lang.String r1 = "user"
            r0[r3] = r1
            java.lang.String r1 = "music"
            r0[r4] = r1
            java.lang.String r1 = "hashtag"
            r0[r5] = r1
            java.lang.String r1 = "video"
            r0[r6] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            j = r0
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getSearchTabIndex()
            java.lang.Object r0 = r0.c()
            java.lang.String r0 = (java.lang.String) r0
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0074 }
            r1.<init>()     // Catch:{ Exception -> 0x0074 }
            com.ss.android.ugc.aweme.discover.ui.aw$1 r4 = new com.ss.android.ugc.aweme.discover.ui.aw$1     // Catch:{ Exception -> 0x0074 }
            r4.<init>()     // Catch:{ Exception -> 0x0074 }
            java.lang.reflect.Type r4 = r4.getType()     // Catch:{ Exception -> 0x0074 }
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r4)     // Catch:{ Exception -> 0x0074 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0074 }
            k = r0     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            java.util.List<java.lang.String> r0 = k
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            k = r0
            java.util.List r1 = b()
            r0.addAll(r1)
        L_0x008a:
            java.util.List<java.lang.String> r0 = k
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f43133a
            r7 = 1
            r8 = 38030(0x948e, float:5.3291E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r2] = r10
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x00d4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f43133a
            r8 = 1
            r9 = 38030(0x948e, float:5.3291E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r10[r2] = r1
            java.lang.Class r11 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0204
        L_0x00d4:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f43133a
            r7 = 1
            r8 = 38031(0x948f, float:5.3293E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r2] = r10
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x010b
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = f43133a
            r8 = 1
            r9 = 38031(0x948f, float:5.3293E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r10[r2] = r4
            java.lang.Class r11 = java.lang.Boolean.TYPE
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x0113
        L_0x010b:
            java.util.List r4 = b()
            boolean r4 = r4.contains(r1)
        L_0x0113:
            if (r4 != 0) goto L_0x0118
        L_0x0115:
            r1 = 0
            goto L_0x0204
        L_0x0118:
            java.lang.String r4 = "goods"
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L_0x0190
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0127
            goto L_0x0115
        L_0x0127:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r7 = 1
            r8 = 36310(0x8dd6, float:5.0881E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0153
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r7 = 1
            r8 = 36310(0x8dd6, float:5.0881E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0204
        L_0x0153:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r7 = 0
            r8 = 71836(0x1189c, float:1.00664E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Integer.TYPE
            r5 = r1
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0182
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r7 = 0
            r8 = 71836(0x1189c, float:1.00664E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Integer.TYPE
            r5 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x018c
        L_0x0182:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            if (r1 != 0) goto L_0x018a
            r1 = 0
            goto L_0x018c
        L_0x018a:
            int r1 = r1.commoditySearchState
        L_0x018c:
            if (r1 == 0) goto L_0x0115
            goto L_0x0203
        L_0x0190:
            java.lang.String r4 = "video"
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0203
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0203
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r7 = 1
            r8 = 36308(0x8dd4, float:5.0878E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x01c9
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r7 = 1
            r8 = 36308(0x8dd4, float:5.0878E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0204
        L_0x01c9:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r7 = 0
            r8 = 71853(0x118ad, float:1.00687E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r1
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x01f8
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r7 = 0
            r8 = 71853(0x118ad, float:1.00687E-40)
            java.lang.Class[] r9 = new java.lang.Class[r2]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0204
        L_0x01f8:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r1.d()
            if (r1 != 0) goto L_0x0200
            goto L_0x0115
        L_0x0200:
            boolean r1 = r1.enableMTVideoSearch
            goto L_0x0204
        L_0x0203:
            r1 = 1
        L_0x0204:
            if (r1 != 0) goto L_0x0090
            r0.remove()
            goto L_0x0090
        L_0x020b:
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "general"
            int r0 = r0.indexOf(r1)
            f43134b = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "video"
            int r0 = r0.indexOf(r1)
            f43135c = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "user"
            int r0 = r0.indexOf(r1)
            f43136d = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "music"
            int r0 = r0.indexOf(r1)
            f43138f = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "hashtag"
            int r0 = r0.indexOf(r1)
            g = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "poi"
            int r0 = r0.indexOf(r1)
            f43137e = r0
            java.util.List<java.lang.String> r0 = k
            java.lang.String r1 = "goods"
            int r0 = r0.indexOf(r1)
            h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.aw.<clinit>():void");
    }
}
