package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a\f\u0010\t\u001a\u00020\u0007*\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"getEffectTag", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getTrackType", "", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "hasTag", "", "targetTag", "isLocalResources", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67035a;

    public static final int a(@Nullable cb cbVar) {
        if (cbVar == null || !cbVar.isFastImport) {
            return 1;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.effectmanager.effect.model.Effect r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f67035a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 76590(0x12b2e, float:1.07325E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f67035a
            r13 = 1
            r14 = 76590(0x12b2e, float:1.07325E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = r0.effect_id
            if (r0 == 0) goto L_0x004c
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            if (r0 == 0) goto L_0x004c
            int r0 = r0.intValue()
            goto L_0x004d
        L_0x004c:
            r0 = -1
        L_0x004d:
            if (r0 >= 0) goto L_0x0050
            return r1
        L_0x0050:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r2 == null) goto L_0x0065;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.effectmanager.effect.model.Effect r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f67035a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 76592(0x12b30, float:1.07328E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f67035a
            r13 = 1
            r14 = 76592(0x12b30, float:1.07328E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            if (r17 == 0) goto L_0x0065
            java.util.List r0 = r17.getTags()
            if (r0 == 0) goto L_0x0065
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x005c
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            if (r3 == 0) goto L_0x0043
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0067
        L_0x0065:
            java.lang.String r2 = ""
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b(com.ss.android.ugc.effectmanager.effect.model.Effect):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.effectmanager.effect.model.Effect r19, @org.jetbrains.annotations.Nullable java.lang.String r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f67035a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 76591(0x12b2f, float:1.07327E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f67035a
            r15 = 1
            r16 = 76591(0x12b2f, float:1.07327E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            if (r1 != 0) goto L_0x004d
            return r10
        L_0x004d:
            r2 = 0
            if (r19 == 0) goto L_0x0072
            java.util.List r0 = r19.getTags()
            if (r0 == 0) goto L_0x0072
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x005c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
            if (r4 == 0) goto L_0x005c
            r2 = r3
        L_0x0070:
            java.lang.String r2 = (java.lang.String) r2
        L_0x0072:
            if (r2 == 0) goto L_0x0075
            return r11
        L_0x0075:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String):boolean");
    }
}
