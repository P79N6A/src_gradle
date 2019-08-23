package com.ss.android.ugc.aweme.profile.presenter;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.profile.api.d;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/UserIdPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/profile/presenter/UserIdResponse;", "Lcom/ss/android/ugc/aweme/profile/presenter/IUserIdView;", "()V", "bindModel", "", "onFailed", "e", "Ljava/lang/Exception;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ab extends b<com.ss.android.ugc.aweme.common.a<ac>, q> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61567a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00042\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/profile/presenter/UserIdPresenter$bindModel$1", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/profile/presenter/UserIdResponse;", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "sendRequest", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends com.ss.android.ugc.aweme.common.a<ac> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61568a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/presenter/UserIdResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.profile.presenter.ab$a$a  reason: collision with other inner class name */
        static final class C0678a<V> implements Callable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61569a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri.Builder f61570b;

            C0678a(Uri.Builder builder) {
                this.f61570b = builder;
            }

            public final /* synthetic */ Object call() {
                if (!PatchProxy.isSupport(new Object[0], this, f61569a, false, 67629, new Class[0], ac.class)) {
                    return d.a(this.f61570b.toString());
                }
                return (ac) PatchProxy.accessDispatch(new Object[0], this, f61569a, false, 67629, new Class[0], ac.class);
            }
        }

        a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean checkParams(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f61568a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r5 = 0
                r6 = 67627(0x1082b, float:9.4766E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003d
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f61568a
                r13 = 0
                r14 = 67627(0x1082b, float:9.4766E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Boolean.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x003d:
                java.lang.String r2 = "params"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                int r0 = r0.length
                if (r0 != r1) goto L_0x0046
                return r1
            L_0x0046:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.ab.a.checkParams(java.lang.Object[]):boolean");
        }

        public final boolean sendRequest(@NotNull Object... objArr) {
            if (PatchProxy.isSupport(new Object[]{objArr}, this, f61568a, false, 67628, new Class[]{Object[].class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61568a, false, 67628, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(objArr, "params");
            if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                return false;
            }
            String str = objArr[0];
            if (str != null) {
                Uri.Builder buildUpon = Uri.parse("https://aweme.snssdk.com/aweme/v1/user/uniqueid").buildUpon();
                buildUpon.appendQueryParameter("id", str);
                m.a().a(this.mHandler, new C0678a(buildUpon), 0);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public ab() {
        if (PatchProxy.isSupport(new Object[0], this, f61567a, false, 67624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61567a, false, 67624, new Class[0], Void.TYPE);
            return;
        }
        a(new a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f61567a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 67625(0x10829, float:9.4763E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f61567a
            r5 = 0
            r6 = 67625(0x10829, float:9.4763E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.b()
            com.ss.android.ugc.aweme.common.a r0 = r9.f2978e
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.profile.presenter.ac r0 = (com.ss.android.ugc.aweme.profile.presenter.ac) r0
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r0.f61571a
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            com.ss.android.ugc.aweme.common.a r2 = r9.f2978e
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.profile.presenter.ac r2 = (com.ss.android.ugc.aweme.profile.presenter.ac) r2
            if (r2 == 0) goto L_0x0047
            java.lang.String r1 = r2.f61572b
        L_0x0047:
            if (r0 == 0) goto L_0x0052
            if (r1 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.common.o r2 = r9.f2979f
            com.ss.android.ugc.aweme.profile.presenter.q r2 = (com.ss.android.ugc.aweme.profile.presenter.q) r2
            r2.a(r0, r1)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.ab.b():void");
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61567a, false, 67626, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61567a, false, 67626, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        ((q) this.f2979f).Z_();
    }
}
