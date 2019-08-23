package com.ss.android.ugc.aweme.story.profile.a;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"groupSameDay", "", "Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "position", "", "dataList", "", "awemestory_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73277a;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        if (r3 == null) goto L_0x00c6;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> a(int r19, @org.jetbrains.annotations.Nullable java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f73277a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 84901(0x14ba5, float:1.18972E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0050
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f73277a
            r15 = 1
            r16 = 84901(0x14ba5, float:1.18972E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0050:
            if (r1 == 0) goto L_0x0059
            java.lang.Object r2 = r1.get(r0)
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r2 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r2
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r1 == 0) goto L_0x00c6
            java.util.List r3 = r1.subList(r10, r0)
            if (r3 == 0) goto L_0x00c6
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x006d
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00c4
        L_0x006d:
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L_0x0075:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r4.previous()
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r5 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r5
            long r5 = r5.getDate()
            if (r2 == 0) goto L_0x0091
            long r7 = r2.getDate()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0091
            r5 = 1
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 != 0) goto L_0x0075
            r4.next()
            int r3 = r3.size()
            int r5 = r4.nextIndex()
            int r3 = r3 - r5
            if (r3 != 0) goto L_0x00a7
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00c4
        L_0x00a7:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
        L_0x00ac:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r3 = r4.next()
            r5.add(r3)
            goto L_0x00ac
        L_0x00ba:
            r3 = r5
            java.util.List r3 = (java.util.List) r3
            goto L_0x00c4
        L_0x00be:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
        L_0x00c4:
            if (r3 != 0) goto L_0x00ca
        L_0x00c6:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00ca:
            if (r1 == 0) goto L_0x0108
            int r4 = r20.size()
            java.util.List r0 = r1.subList(r0, r4)
            if (r0 == 0) goto L_0x0108
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00e1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0105
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r5 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r5
            long r5 = r5.getDate()
            if (r2 == 0) goto L_0x00fe
            long r7 = r2.getDate()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x00fe
            r5 = 1
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            if (r5 == 0) goto L_0x0105
            r1.add(r4)
            goto L_0x00e1
        L_0x0105:
            java.util.List r1 = (java.util.List) r1
            goto L_0x010c
        L_0x0108:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x010c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.a.a.a(int, java.util.List):java.util.List");
    }
}
