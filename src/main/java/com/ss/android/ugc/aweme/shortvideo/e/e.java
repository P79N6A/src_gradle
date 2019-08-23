package com.ss.android.ugc.aweme.shortvideo.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ea;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/config/DuetMaxDurationResolverImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/config/MaxDurationResolver;", "()V", "getDurationFromConfig", "", "resolveMaxDuration", "musicPath", "", "videoPath", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66817a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66818b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/config/DuetMaxDurationResolverImpl$Companion;", "", "()V", "DUET_MAX_RECORDING_TIME", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final long a() {
        if (PatchProxy.isSupport(new Object[0], this, f66817a, false, 75290, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f66817a, false, 75290, new Class[0], Long.TYPE)).longValue();
        } else if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.DurationMode)) {
            return com.ss.android.ugc.aweme.port.in.a.L.c(e.a.LongVideoThreshold);
        } else {
            return ea.f66827f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(@org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f66817a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Long.TYPE
            r6 = 0
            r7 = 75289(0x12619, float:1.05502E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004e
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f66817a
            r15 = 0
            r16 = 75289(0x12619, float:1.05502E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Long.TYPE
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x004e:
            long r2 = r19.a()
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = -1
            if (r4 != 0) goto L_0x0088
            com.ss.android.ugc.aweme.property.a r4 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r7 = com.ss.android.ugc.aweme.property.a.C0682a.DuetFixNewPlan
            boolean r4 = r4.a(r7)
            if (r4 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r7 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r4 = r4.getService(r7)
            com.ss.android.ugc.aweme.services.IAVService r4 = (com.ss.android.ugc.aweme.services.IAVService) r4
            int[] r1 = r4.extractVideoFileInfo(r1)
            if (r1 != 0) goto L_0x007b
            int[] r1 = new int[r10]
        L_0x007b:
            int r4 = r1.length
            if (r4 != 0) goto L_0x007f
            r10 = 1
        L_0x007f:
            r4 = r10 ^ 1
            if (r4 == 0) goto L_0x0088
            r4 = 3
            r1 = r1[r4]
            long r7 = (long) r1
            goto L_0x0089
        L_0x0088:
            r7 = r5
        L_0x0089:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x009a
            com.ss.android.ugc.aweme.ao.a r1 = com.ss.android.ugc.aweme.port.in.a.i
            int r0 = r1.b(r0)
            long r0 = (long) r0
            goto L_0x009b
        L_0x009a:
            r0 = r5
        L_0x009b:
            long r0 = java.lang.Math.max(r7, r0)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x00a4
            return r2
        L_0x00a4:
            boolean r4 = com.ss.android.ugc.aweme.shortvideo.e.f.a()
            if (r4 == 0) goto L_0x00ad
            r2 = 60500(0xec54, double:2.9891E-319)
        L_0x00ad:
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.e.e.a(java.lang.String, java.lang.String):long");
    }
}
