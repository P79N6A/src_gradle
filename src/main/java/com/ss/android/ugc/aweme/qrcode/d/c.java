package com.ss.android.ugc.aweme.qrcode.d;

import a.i;
import android.app.Activity;
import android.content.Intent;
import android.os.Vibrator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.qrcode.c.g;
import com.ss.android.ugc.aweme.qrcode.d.m;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J \u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0016H\u0016J(\u0010#\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/presenter/MaterialObjectScanPresenter;", "Lcom/ss/android/ugc/aweme/qrcode/presenter/ScanContract$Presenter;", "activity", "Landroid/app/Activity;", "view", "Lcom/ss/android/ugc/aweme/qrcode/presenter/ScanContract$IScanView;", "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/qrcode/presenter/ScanContract$IScanView;)V", "getActivity", "()Landroid/app/Activity;", "getView", "()Lcom/ss/android/ugc/aweme/qrcode/presenter/ScanContract$IScanView;", "setView", "(Lcom/ss/android/ugc/aweme/qrcode/presenter/ScanContract$IScanView;)V", "getRequirement", "", "getRequirementStrings", "", "", "()[Ljava/lang/String;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onScanFailed", "isFromAlbum", "", "errorType", "code", "onScanSuccess", "type", "result", "scanPageFrom", "open", "Lcom/ss/android/ugc/aweme/commercialize/model/EasterEggInfo;", "start", "vibrate", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63388a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f63389d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f63390b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public m.a f63391c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/qrcode/presenter/MaterialObjectScanPresenter$Companion;", "", "()V", "REQUIREMENT_AR_SCAN", "", "REQUIREMENT_OBJECT_SCAN", "REQUIREMENT_STRING_AR_SCAN", "", "REQUIREMENT_STRING_OBJECT_SCAN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f63393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63394c;

        b(c cVar, String str) {
            this.f63393b = cVar;
            this.f63394c = str;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f63392a, false, 70436, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63392a, false, 70436, new Class[0], Void.TYPE);
            } else {
                m.a aVar = this.f63393b.f63391c;
                if (aVar != null) {
                    aVar.g();
                }
                final g gVar = new g();
                gVar.addNotifyListener(new p(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f63395a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f63396b;

                    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
                    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void b() {
                        /*
                            r12 = this;
                            r0 = 0
                            java.lang.Object[] r1 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r3 = f63395a
                            java.lang.Class[] r6 = new java.lang.Class[r0]
                            java.lang.Class r7 = java.lang.Void.TYPE
                            r4 = 0
                            r5 = 70437(0x11325, float:9.8703E-41)
                            r2 = r12
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                            if (r1 == 0) goto L_0x0025
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = f63395a
                            r5 = 0
                            r6 = 70437(0x11325, float:9.8703E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class r8 = java.lang.Void.TYPE
                            r3 = r12
                            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            return
                        L_0x0025:
                            com.ss.android.ugc.aweme.qrcode.d.c$b r1 = r12.f63396b
                            com.ss.android.ugc.aweme.qrcode.d.c r1 = r1.f63393b
                            com.ss.android.ugc.aweme.qrcode.d.m$a r1 = r1.f63391c
                            if (r1 == 0) goto L_0x0030
                            r1.h()
                        L_0x0030:
                            java.util.HashMap r1 = new java.util.HashMap
                            r1.<init>()
                            com.ss.android.ugc.aweme.qrcode.c.g r2 = r0
                            T r2 = r2.mData
                            if (r2 == 0) goto L_0x0122
                            com.ss.android.ugc.aweme.qrcode.c.g r2 = r0
                            T r2 = r2.mData
                            com.ss.android.ugc.aweme.qrcode.c.h r2 = (com.ss.android.ugc.aweme.qrcode.c.h) r2
                            if (r2 != 0) goto L_0x0046
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x0046:
                            com.ss.android.ugc.aweme.commercialize.model.i r2 = r2.getEasterEgg()
                            if (r2 == 0) goto L_0x0122
                            com.ss.android.ugc.aweme.qrcode.c.g r2 = r0
                            T r2 = r2.mData
                            com.ss.android.ugc.aweme.qrcode.c.h r2 = (com.ss.android.ugc.aweme.qrcode.c.h) r2
                            if (r2 != 0) goto L_0x0057
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x0057:
                            int r2 = r2.status_code
                            if (r2 != 0) goto L_0x0122
                            com.ss.android.ugc.aweme.qrcode.d.c$b r2 = r12.f63396b
                            com.ss.android.ugc.aweme.qrcode.d.c r2 = r2.f63393b
                            com.ss.android.ugc.aweme.qrcode.c.g r3 = r0
                            T r3 = r3.mData
                            com.ss.android.ugc.aweme.qrcode.c.h r3 = (com.ss.android.ugc.aweme.qrcode.c.h) r3
                            if (r3 != 0) goto L_0x006a
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x006a:
                            com.ss.android.ugc.aweme.commercialize.model.i r10 = r3.getEasterEgg()
                            if (r10 != 0) goto L_0x0073
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x0073:
                            r11 = 1
                            java.lang.Object[] r3 = new java.lang.Object[r11]
                            r3[r0] = r10
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.qrcode.d.c.f63388a
                            r6 = 0
                            r7 = 70434(0x11322, float:9.8699E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r11]
                            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.i> r4 = com.ss.android.ugc.aweme.commercialize.model.i.class
                            r8[r0] = r4
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                            if (r3 == 0) goto L_0x00a4
                            java.lang.Object[] r3 = new java.lang.Object[r11]
                            r3[r0] = r10
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.qrcode.d.c.f63388a
                            r6 = 0
                            r7 = 70434(0x11322, float:9.8699E-41)
                            java.lang.Class[] r8 = new java.lang.Class[r11]
                            java.lang.Class<com.ss.android.ugc.aweme.commercialize.model.i> r4 = com.ss.android.ugc.aweme.commercialize.model.i.class
                            r8[r0] = r4
                            java.lang.Class r9 = java.lang.Void.TYPE
                            r4 = r2
                            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
                            goto L_0x00fa
                        L_0x00a4:
                            boolean r3 = r10.isH5()
                            if (r3 == 0) goto L_0x00d6
                            android.app.Activity r3 = r2.f63390b
                            android.content.Context r3 = (android.content.Context) r3
                            java.lang.String r4 = r10.getOpenUrl()
                            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r3, (java.lang.String) r4, (boolean) r0)
                            if (r0 != 0) goto L_0x00c7
                            android.app.Activity r0 = r2.f63390b
                            android.content.Context r0 = (android.content.Context) r0
                            java.lang.String r3 = r10.getWebUrl()
                            java.lang.String r4 = r10.getWebTitle()
                            com.ss.android.ugc.aweme.commercialize.utils.g.a((android.content.Context) r0, (java.lang.String) r3, (java.lang.String) r4)
                        L_0x00c7:
                            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r2.f63391c
                            if (r0 == 0) goto L_0x00ce
                            r0.d()
                        L_0x00ce:
                            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r2.f63391c
                            if (r0 == 0) goto L_0x00fa
                            r0.finish()
                            goto L_0x00fa
                        L_0x00d6:
                            com.ss.android.ugc.aweme.commercialize.k r0 = new com.ss.android.ugc.aweme.commercialize.k
                            r0.<init>()
                            r0.setEasterEggInfo(r10)
                            java.lang.String r3 = "qr_code_scan"
                            r0.setEnterFrom(r3)
                            android.app.Activity r3 = r2.f63390b
                            android.content.Context r3 = (android.content.Context) r3
                            r4 = 101(0x65, float:1.42E-43)
                            com.ss.android.ugc.aweme.commercialize.utils.p.a(r3, r0, r4)
                            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r2.f63391c
                            if (r0 == 0) goto L_0x00f3
                            r0.d()
                        L_0x00f3:
                            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r2.f63391c
                            if (r0 == 0) goto L_0x00fa
                            r0.f()
                        L_0x00fa:
                            r0 = r1
                            java.util.Map r0 = (java.util.Map) r0
                            java.lang.String r2 = "next_page"
                            com.ss.android.ugc.aweme.qrcode.c.g r3 = r0
                            T r3 = r3.mData
                            com.ss.android.ugc.aweme.qrcode.c.h r3 = (com.ss.android.ugc.aweme.qrcode.c.h) r3
                            if (r3 != 0) goto L_0x010a
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x010a:
                            com.ss.android.ugc.aweme.commercialize.model.i r3 = r3.getEasterEgg()
                            if (r3 != 0) goto L_0x0113
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x0113:
                            boolean r3 = r3.isH5()
                            if (r3 == 0) goto L_0x011c
                            java.lang.String r3 = "direct"
                            goto L_0x011e
                        L_0x011c:
                            java.lang.String r3 = "egg_ad"
                        L_0x011e:
                            r0.put(r2, r3)
                            goto L_0x012d
                        L_0x0122:
                            com.ss.android.ugc.aweme.qrcode.d.c$b r0 = r12.f63396b
                            com.ss.android.ugc.aweme.qrcode.d.c r0 = r0.f63393b
                            com.ss.android.ugc.aweme.qrcode.d.m$a r0 = r0.f63391c
                            if (r0 == 0) goto L_0x012d
                            r0.ae_()
                        L_0x012d:
                            java.util.Map r1 = (java.util.Map) r1
                            java.lang.String r0 = "enter_from"
                            java.lang.String r2 = "qr_code_scan"
                            r1.put(r0, r2)
                            java.lang.String r0 = "fail_code"
                            com.ss.android.ugc.aweme.qrcode.c.g r2 = r0
                            T r2 = r2.mData
                            com.ss.android.ugc.aweme.qrcode.c.h r2 = (com.ss.android.ugc.aweme.qrcode.c.h) r2
                            if (r2 == 0) goto L_0x0147
                            int r2 = r2.status_code
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                            goto L_0x0148
                        L_0x0147:
                            r2 = 0
                        L_0x0148:
                            java.lang.String r2 = java.lang.String.valueOf(r2)
                            r1.put(r0, r2)
                            java.lang.String r0 = "recognation_status"
                            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.d.c.b.AnonymousClass1.b():void");
                    }

                    public final void a(@Nullable Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f63395a, false, 70438, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f63395a, false, 70438, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        m.a aVar = this.f63396b.f63393b.f63391c;
                        if (aVar != null) {
                            aVar.h();
                        }
                        m.a aVar2 = this.f63396b.f63393b.f63391c;
                        if (aVar2 != null) {
                            aVar2.ae_();
                        }
                    }

                    {
                        this.f63396b = r1;
                    }
                });
                gVar.a(this.f63394c);
            }
            return Unit.INSTANCE;
        }
    }

    public final long a() {
        return 35734127902720L;
    }

    public final void a(boolean z, int i, int i2) {
    }

    public final void b() {
        this.f63391c = null;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f63388a, false, 70431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63388a, false, 70431, new Class[0], Void.TYPE);
            return;
        }
        m.a aVar = this.f63391c;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    public c(@NotNull Activity activity, @Nullable m.a aVar) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f63390b = activity;
        this.f63391c = aVar;
    }

    public final void a(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f63388a, false, 70433, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f63388a, false, 70433, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (i == 101) {
            if (i2 != 1002) {
                m.a aVar = this.f63391c;
                if (aVar != null) {
                    aVar.finish();
                }
            } else {
                m.a aVar2 = this.f63391c;
                if (aVar2 != null) {
                    aVar2.ae_();
                }
                m.a aVar3 = this.f63391c;
                if (aVar3 != null) {
                    aVar3.e();
                }
            }
        }
    }

    public final void a(boolean z, int i, @NotNull String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f63388a, false, 70432, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f63388a, false, 70432, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "result");
        i.a((Callable<TResult>) new b<TResult>(this, str2), i.f1052b);
        if (PatchProxy.isSupport(new Object[0], this, f63388a, false, 70435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63388a, false, 70435, new Class[0], Void.TYPE);
            return;
        }
        Vibrator vibrator = (Vibrator) this.f63390b.getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200);
        }
    }
}
