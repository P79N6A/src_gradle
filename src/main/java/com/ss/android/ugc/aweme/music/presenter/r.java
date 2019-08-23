package com.ss.android.ugc.aweme.music.presenter;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.music.api.MusicRingtoneApi;
import com.ss.android.ugc.aweme.music.model.RingtoneStatus;
import com.ss.android.ugc.aweme.net.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/music/presenter/RingtoneStatusPresenter;", "Lcom/ss/android/ugc/aweme/common/BasePresenter;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/music/model/RingtoneStatus;", "Lcom/ss/android/ugc/aweme/music/presenter/IRingtoneStatusView;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "onSuccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r extends b<a<RingtoneStatus>, f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56404a;

    public final void a(@Nullable Exception exc) {
    }

    public r() {
        a(new a<RingtoneStatus>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56405a;

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
                    com.meituan.robust.ChangeQuickRedirect r4 = f56405a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r5 = 0
                    r6 = 60090(0xeaba, float:8.4204E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x003d
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f56405a
                    r13 = 0
                    r14 = 60090(0xeaba, float:8.4204E-41)
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
                    r2 = 2
                    if (r0 != r2) goto L_0x0047
                    return r1
                L_0x0047:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.presenter.r.AnonymousClass1.checkParams(java.lang.Object[]):boolean");
            }

            public final boolean sendRequest(@NotNull Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f56405a, false, 60091, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f56405a, false, 60091, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkParameterIsNotNull(objArr, "params");
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                String str = objArr[0];
                if (str != null) {
                    String str2 = str;
                    String str3 = objArr[1];
                    if (str3 != null) {
                        MusicRingtoneApi.a(str2, str3).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
                        return true;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56404a, false, 60089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56404a, false, 60089, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f2978e;
        if (!(aVar == null || ((RingtoneStatus) aVar.getData()) == null)) {
            f fVar = (f) this.f2979f;
            if (fVar != null) {
                a aVar2 = this.f2978e;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "mModel");
                fVar.b(((RingtoneStatus) aVar2.getData()).action);
            }
        }
    }
}
