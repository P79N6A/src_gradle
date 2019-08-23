package com.ss.android.ugc.aweme.longvideo.feature;

import android.app.Dialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.longvideo.b;
import com.ss.android.ugc.aweme.longvideo.d;
import com.ss.android.ugc.aweme.video.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/feature/MobileWarningInterceptor;", "Lcom/ss/android/ugc/aweme/longvideo/IVideoPlayInterceptor;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "longVideoPlayView", "Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "mPlayManger", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "(Lcom/ss/android/ugc/aweme/feed/DialogController;Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;Lcom/ss/android/ugc/aweme/video/PlayerManager;)V", "getDialogController", "()Lcom/ss/android/ugc/aweme/feed/DialogController;", "getLongVideoPlayView", "()Lcom/ss/android/ugc/aweme/longvideo/ILongVideoPlayView;", "mDialogShowing", "", "getMPlayManger", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "canPlay", "showMobileWarnDialog", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53939a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f53940b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.feed.d f53941c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final b f53942d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final o f53943e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/longvideo/feature/MobileWarningInterceptor$showMobileWarnDialog$1", "Lcom/ss/android/ugc/aweme/freeflowcard/widget/FreeFlowCardDialog$OnDialogButtonClickListener;", "onCancel", "", "dialog", "Landroid/app/Dialog;", "onConfirm", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.a$a  reason: collision with other inner class name */
    public static final class C0625a implements a.C0575a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f53945b;

        C0625a(a aVar) {
            this.f53945b = aVar;
        }

        public final void a(@NotNull Dialog dialog) {
            if (PatchProxy.isSupport(new Object[]{dialog}, this, f53944a, false, 56695, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog}, this, f53944a, false, 56695, new Class[]{Dialog.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            this.f53945b.f53940b = false;
            this.f53945b.f53942d.h();
            this.f53945b.f53942d.b();
        }

        public final void b(@NotNull Dialog dialog) {
            if (PatchProxy.isSupport(new Object[]{dialog}, this, f53944a, false, 56696, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog}, this, f53944a, false, 56696, new Class[]{Dialog.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dialog, "dialog");
            this.f53945b.f53940b = false;
            this.f53945b.f53942d.g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (android.text.TextUtils.isEmpty(r1.c()) == false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53939a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 56693(0xdd75, float:7.9444E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53939a
            r5 = 0
            r6 = 56693(0xdd75, float:7.9444E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            boolean r1 = r10.f53940b
            if (r1 == 0) goto L_0x0031
            return r0
        L_0x0031:
            com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
            boolean r1 = r1.b()
            r2 = 1
            if (r1 == 0) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.String r1 = ""
            com.ss.android.ugc.aweme.feed.d r3 = r10.f53941c
            if (r3 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.feed.d r1 = r10.f53941c
            java.lang.String r1 = r1.l()
            java.lang.String r3 = "dialogController.eventType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
        L_0x004e:
            com.ss.android.ugc.aweme.freeflowcard.a.a r3 = com.ss.android.ugc.aweme.freeflowcard.a.a.a()
            boolean r1 = r3.a(r1)
            if (r1 != 0) goto L_0x00c4
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f53939a
            r6 = 0
            r7 = 56694(0xdd76, float:7.9445E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x007c
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f53939a
            r6 = 0
            r7 = 56694(0xdd76, float:7.9445E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00c3
        L_0x007c:
            com.ss.android.ugc.aweme.base.utils.m r1 = com.ss.android.ugc.aweme.base.utils.m.a()
            java.lang.String r3 = "NetworkStateManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.freeflowcard.b r1 = com.ss.android.ugc.aweme.freeflowcard.b.a()
            java.lang.String r3 = "FlowCardDataManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.String r1 = r1.c()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00c3
        L_0x00a0:
            com.ss.android.ugc.aweme.longvideo.b r1 = r10.f53942d
            int r1 = r1.c()
            r3 = 2
            if (r1 != r3) goto L_0x00b3
            com.ss.android.ugc.aweme.video.o r1 = r10.f53943e
            r1.h()
            com.ss.android.ugc.aweme.longvideo.b r1 = r10.f53942d
            r1.g()
        L_0x00b3:
            com.ss.android.ugc.aweme.feed.d r1 = r10.f53941c
            if (r1 == 0) goto L_0x00c1
            com.ss.android.ugc.aweme.longvideo.feature.a$a r3 = new com.ss.android.ugc.aweme.longvideo.feature.a$a
            r3.<init>(r10)
            com.ss.android.ugc.aweme.freeflowcard.b.a$a r3 = (com.ss.android.ugc.aweme.freeflowcard.b.a.C0575a) r3
            r1.a((com.ss.android.ugc.aweme.freeflowcard.b.a.C0575a) r3)
        L_0x00c1:
            r10.f53940b = r2
        L_0x00c3:
            return r0
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.feature.a.a():boolean");
    }

    public a(@Nullable com.ss.android.ugc.aweme.feed.d dVar, @NotNull b bVar, @NotNull o oVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "longVideoPlayView");
        Intrinsics.checkParameterIsNotNull(oVar, "mPlayManger");
        this.f53941c = dVar;
        this.f53942d = bVar;
        this.f53943e = oVar;
    }
}
