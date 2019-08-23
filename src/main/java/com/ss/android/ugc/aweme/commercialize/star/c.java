package com.ss.android.ugc.aweme.commercialize.star;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.commercialize.star.StarConfirmActivity;
import com.ss.android.ugc.aweme.commercialize.star.a;
import com.ss.android.ugc.aweme.music.util.f;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016JB\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishExtension;", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension;", "Lcom/ss/android/ugc/aweme/shortvideo/model/StarAtlasPublishModel;", "()V", "delegate", "Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishSettingItem;", "getDelegate", "()Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishSettingItem;", "setDelegate", "(Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishSettingItem;)V", "name", "", "getName", "()Ljava/lang/String;", "createStarAtlasPublishSettingItem", "container", "Landroid/widget/LinearLayout;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "publishOutput", "Lcom/ss/android/ugc/aweme/services/publish/PublishOutput;", "onCreate", "fragment", "Landroid/support/v4/app/Fragment;", "extensionWidgetContainer", "savedInstanceState", "Landroid/os/Bundle;", "contentType", "Lcom/ss/android/ugc/aweme/services/publish/AVPublishContentType;", "extensionMisc", "Lcom/ss/android/ugc/aweme/services/publish/ExtensionMisc;", "callback", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension$Callback;", "onDestroy", "onEnterChildrenMode", "onPublish", "onSaveDraft", "onSaveInstanceState", "outState", "provideExtensionData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements IAVPublishExtension<StarAtlasPublishModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39488a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public d f39489b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f39491b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f39492c;

        a(c cVar, Fragment fragment) {
            this.f39491b = cVar;
            this.f39492c = fragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39490a, false, 32039, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39490a, false, 32039, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            StarConfirmActivity.a aVar = StarConfirmActivity.f39470b;
            Fragment fragment = this.f39492c;
            boolean hasStarAtlasOrder = this.f39491b.a().getHasStarAtlasOrder();
            if (PatchProxy.isSupport(new Object[]{fragment, 100, Byte.valueOf(hasStarAtlasOrder ? (byte) 1 : 0)}, aVar, StarConfirmActivity.a.f39471a, false, 32071, new Class[]{Fragment.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr = {fragment, 100, Byte.valueOf(hasStarAtlasOrder)};
                ChangeQuickRedirect changeQuickRedirect = StarConfirmActivity.a.f39471a;
                StarConfirmActivity.a aVar2 = aVar;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect2, false, 32071, new Class[]{Fragment.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            Intent intent = new Intent(fragment.getActivity(), StarConfirmActivity.class);
            intent.putExtra("confirm", hasStarAtlasOrder);
            fragment.startActivityForResult(intent, 100);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f39494b;

        b(c cVar) {
            this.f39494b = cVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39493a, false, 32040, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39493a, false, 32040, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String uri = f.a(a.f39482e).a("order_id", String.valueOf(this.f39494b.a().getStarAtlasOrderId())).a().toString();
            Intrinsics.checkExpressionValueIsNotNull(uri, "SchemeHelper.parseRnSche…              .toString()");
            h.a().a(uri);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commercialize/star/StarAtlasPublishExtension$onCreate$3", "Lcom/ss/android/ugc/aweme/commercialize/star/StarAtlasManager$ICheckOrder;", "hasOrder", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.c$c  reason: collision with other inner class name */
    public static final class C0514c implements a.C0513a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f39496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExtensionMisc f39497c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39495a, false, 32041, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39495a, false, 32041, new Class[0], Void.TYPE);
                return;
            }
            this.f39496b.a().setVisibility(0);
            d a2 = this.f39496b.a();
            if (PatchProxy.isSupport(new Object[0], a2, d.f2937a, false, 32046, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], a2, d.f2937a, false, 32046, new Class[0], Void.TYPE);
            } else {
                a2.setHasStarAtlasOrder(false);
                a2.setStarAtlasOrderId(0);
                a2.f2938b = false;
            }
            String str = null;
            if (com.ss.android.g.a.a()) {
                d a3 = this.f39496b.a();
                af.a commerceDataContainer = this.f39497c.getCommerceDataContainer();
                if (commerceDataContainer != null) {
                    str = commerceDataContainer.a();
                }
                e b2 = e.b(str);
                Intrinsics.checkExpressionValueIsNotNull(b2, "CommercePublishModel.fro…aContainer?.commerceData)");
                a3.setHasStarAtlasOrder(b2.f39378e);
                return;
            }
            d a4 = this.f39496b.a();
            af.a commerceDataContainer2 = this.f39497c.getCommerceDataContainer();
            if (commerceDataContainer2 != null) {
                str = commerceDataContainer2.a();
            }
            e b3 = e.b(str);
            Intrinsics.checkExpressionValueIsNotNull(b3, "CommercePublishModel.fro…aContainer?.commerceData)");
            a4.setStarAtlasOrderId(b3.a());
        }

        C0514c(c cVar, ExtensionMisc extensionMisc) {
            this.f39496b = cVar;
            this.f39497c = extensionMisc;
        }
    }

    @NotNull
    public final String getName() {
        return "StarAtlasPublishExtension";
    }

    public final void onBackPressed(@NotNull PublishOutput publishOutput) {
        PublishOutput publishOutput2 = publishOutput;
        if (PatchProxy.isSupport(new Object[]{publishOutput2}, this, f39488a, false, 32033, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput2}, this, f39488a, false, 32033, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput2, "publishOutput");
    }

    public final void onDestroy() {
    }

    public final void onPublish(@NotNull PublishOutput publishOutput) {
        PublishOutput publishOutput2 = publishOutput;
        if (PatchProxy.isSupport(new Object[]{publishOutput2}, this, f39488a, false, 32034, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput2}, this, f39488a, false, 32034, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput2, "publishOutput");
    }

    public final void onSaveDraft(@NotNull PublishOutput publishOutput) {
        PublishOutput publishOutput2 = publishOutput;
        if (PatchProxy.isSupport(new Object[]{publishOutput2}, this, f39488a, false, 32032, new Class[]{PublishOutput.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{publishOutput2}, this, f39488a, false, 32032, new Class[]{PublishOutput.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(publishOutput2, "publishOutput");
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f39488a, false, 32036, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f39488a, false, 32036, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle2, "outState");
    }

    @NotNull
    public final d a() {
        if (PatchProxy.isSupport(new Object[0], this, f39488a, false, 32028, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f39488a, false, 32028, new Class[0], d.class);
        }
        d dVar = this.f39489b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        return dVar;
    }

    public final void onEnterChildrenMode() {
        if (PatchProxy.isSupport(new Object[0], this, f39488a, false, 32031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39488a, false, 32031, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f39489b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        dVar.setVisibility(8);
    }

    public final /* synthetic */ Object provideExtensionData() {
        if (!PatchProxy.isSupport(new Object[0], this, f39488a, false, 32037, new Class[0], StarAtlasPublishModel.class)) {
            return new StarAtlasPublishModel();
        }
        return (StarAtlasPublishModel) PatchProxy.accessDispatch(new Object[0], this, f39488a, false, 32037, new Class[0], StarAtlasPublishModel.class);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2 = intent;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f39488a, false, 32035, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f39488a, false, 32035, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i == 100 && i2 == -1) {
            d dVar = this.f39489b;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("delegate");
            }
            if (intent2 != null) {
                z = intent2.getBooleanExtra("confirm", false);
            }
            dVar.setHasStarAtlasOrder(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x026b, code lost:
        if (r0.getStarAtlas() == 1) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0292, code lost:
        if (r0.isWithStarAtlasEntry() == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0295, code lost:
        com.google.common.util.concurrent.l.a(com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi.a().checkStarAtlasOrder(1, 10), new com.ss.android.ugc.aweme.commercialize.star.a.b(r1), com.ss.android.ugc.aweme.base.k.f34752b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x02ad, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.NotNull android.support.v4.app.Fragment r25, @org.jetbrains.annotations.NotNull android.widget.LinearLayout r26, @org.jetbrains.annotations.Nullable android.os.Bundle r27, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.services.publish.AVPublishContentType r28, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.services.publish.PublishOutput r29, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.services.publish.ExtensionMisc r30, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback r31) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r31
            r15 = 7
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r6 = 0
            r0[r6] = r8
            r5 = 1
            r0[r5] = r9
            r16 = 2
            r0[r16] = r27
            r17 = 3
            r0[r17] = r11
            r18 = 4
            r0[r18] = r12
            r19 = 5
            r0[r19] = r13
            r20 = 6
            r0[r20] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f39488a
            java.lang.Class[] r4 = new java.lang.Class[r15]
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r4[r6] = r1
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            r4[r5] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r4[r16] = r1
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.AVPublishContentType> r1 = com.ss.android.ugc.aweme.services.publish.AVPublishContentType.class
            r4[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.PublishOutput> r1 = com.ss.android.ugc.aweme.services.publish.PublishOutput.class
            r4[r18] = r1
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.ExtensionMisc> r1 = com.ss.android.ugc.aweme.services.publish.ExtensionMisc.class
            r4[r19] = r1
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback> r1 = com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback.class
            r4[r20] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r3 = 0
            r22 = 32030(0x7d1e, float:4.4884E-41)
            r1 = r24
            r23 = r4
            r4 = r22
            r5 = r23
            r6 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a9
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r6 = 0
            r0[r6] = r8
            r5 = 1
            r0[r5] = r9
            r0[r16] = r27
            r0[r17] = r11
            r0[r18] = r12
            r0[r19] = r13
            r0[r20] = r14
            com.meituan.robust.ChangeQuickRedirect r1 = f39488a
            r2 = 0
            r3 = 32030(0x7d1e, float:4.4884E-41)
            java.lang.Class[] r4 = new java.lang.Class[r15]
            java.lang.Class<android.support.v4.app.Fragment> r8 = android.support.v4.app.Fragment.class
            r4[r6] = r8
            java.lang.Class<android.widget.LinearLayout> r6 = android.widget.LinearLayout.class
            r4[r5] = r6
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r4[r16] = r5
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.AVPublishContentType> r5 = com.ss.android.ugc.aweme.services.publish.AVPublishContentType.class
            r4[r17] = r5
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.PublishOutput> r5 = com.ss.android.ugc.aweme.services.publish.PublishOutput.class
            r4[r18] = r5
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.ExtensionMisc> r5 = com.ss.android.ugc.aweme.services.publish.ExtensionMisc.class
            r4[r19] = r5
            java.lang.Class<com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback> r5 = com.ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback.class
            r4[r20] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r25 = r0
            r26 = r24
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)
            return
        L_0x00a9:
            r5 = 1
            r6 = 0
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "extensionWidgetContainer"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "contentType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "publishOutput"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            java.lang.String r0 = "extensionMisc"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f39488a
            r3 = 0
            r4 = 32038(0x7d26, float:4.4895E-41)
            java.lang.Class[] r10 = new java.lang.Class[r5]
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            r10[r6] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.star.d> r11 = com.ss.android.ugc.aweme.commercialize.star.d.class
            r1 = r24
            r12 = 1
            r5 = r10
            r10 = 0
            r6 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0100
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f39488a
            r3 = 0
            r4 = 32038(0x7d26, float:4.4895E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.star.d> r6 = com.ss.android.ugc.aweme.commercialize.star.d.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.commercialize.star.d r0 = (com.ss.android.ugc.aweme.commercialize.star.d) r0
            goto L_0x012f
        L_0x0100:
            com.ss.android.ugc.aweme.commercialize.star.d r0 = new com.ss.android.ugc.aweme.commercialize.star.d
            android.content.Context r1 = r26.getContext()
            r0.<init>(r1)
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            android.content.Context r4 = r26.getContext()
            r5 = 1112539136(0x42500000, float:52.0)
            float r4 = com.ss.android.ttve.utils.c.a(r4, r5)
            int r4 = (int) r4
            r2.<init>(r3, r4)
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r9.addView(r1, r2)
            r1 = 16
            r0.setGravity(r1)
            r0.setOrientation(r10)
            r1 = 8
            r0.setVisibility(r1)
        L_0x012f:
            r7.f39489b = r0
            com.ss.android.ugc.aweme.commercialize.star.d r0 = r7.f39489b
            if (r0 != 0) goto L_0x013a
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x013a:
            com.ss.android.ugc.aweme.port.in.af$a r1 = r30.getCommerceDataContainer()
            r0.setCommerceDataContainer(r1)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.commercialize.star.d r0 = r7.f39489b
            if (r0 != 0) goto L_0x0150
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0150:
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.star.d.f2937a
            r17 = 0
            r18 = 32042(0x7d2a, float:4.49E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x0178
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.star.d.f2937a
            r17 = 0
            r18 = 32042(0x7d2a, float:4.49E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0198
        L_0x0178:
            java.lang.String r1 = com.ss.android.ugc.aweme.commercialize.star.a.d()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x018b
            r1 = 2131560920(0x7f0d09d8, float:1.8747226E38)
            r0.setTitle((int) r1)
            goto L_0x0192
        L_0x018b:
            java.lang.String r1 = com.ss.android.ugc.aweme.commercialize.star.a.d()
            r0.setTitle((java.lang.String) r1)
        L_0x0192:
            r1 = 2131562680(0x7f0d10b8, float:1.8750796E38)
            r0.setSubtitle((int) r1)
        L_0x0198:
            com.ss.android.ugc.aweme.commercialize.star.d r0 = r7.f39489b
            if (r0 != 0) goto L_0x01a1
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01a1:
            com.ss.android.ugc.aweme.commercialize.star.c$a r1 = new com.ss.android.ugc.aweme.commercialize.star.c$a
            r1.<init>(r7, r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            goto L_0x01fc
        L_0x01ac:
            com.ss.android.ugc.aweme.commercialize.star.d r0 = r7.f39489b
            if (r0 != 0) goto L_0x01b5
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01b5:
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.star.d.f2937a
            r17 = 0
            r18 = 32043(0x7d2b, float:4.4902E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x01dd
            java.lang.Object[] r14 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.star.d.f2937a
            r17 = 0
            r18 = 32043(0x7d2b, float:4.4902E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01e9
        L_0x01dd:
            r1 = 2131559163(0x7f0d02fb, float:1.8743662E38)
            r0.setTitle((int) r1)
            r1 = 2131562670(0x7f0d10ae, float:1.8750775E38)
            r0.setSubtitle((int) r1)
        L_0x01e9:
            com.ss.android.ugc.aweme.commercialize.star.d r0 = r7.f39489b
            if (r0 != 0) goto L_0x01f2
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01f2:
            com.ss.android.ugc.aweme.commercialize.star.c$b r1 = new com.ss.android.ugc.aweme.commercialize.star.c$b
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x01fc:
            com.ss.android.ugc.aweme.commercialize.star.a r0 = com.ss.android.ugc.aweme.commercialize.star.a.f39483f
            com.ss.android.ugc.aweme.commercialize.star.c$c r1 = new com.ss.android.ugc.aweme.commercialize.star.c$c
            r1.<init>(r7, r13)
            com.ss.android.ugc.aweme.commercialize.star.a$a r1 = (com.ss.android.ugc.aweme.commercialize.star.a.C0513a) r1
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.commercialize.star.a.f39478a
            r4 = 0
            r5 = 32024(0x7d18, float:4.4875E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.star.a$a> r8 = com.ss.android.ugc.aweme.commercialize.star.a.C0513a.class
            r6[r10] = r8
            java.lang.Class r8 = java.lang.Void.TYPE
            r25 = r2
            r26 = r0
            r27 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r31 = r8
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r25, r26, r27, r28, r29, r30, r31)
            if (r2 == 0) goto L_0x024d
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.commercialize.star.a.f39478a
            r3 = 0
            r4 = 32024(0x7d18, float:4.4875E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.star.a$a> r6 = com.ss.android.ugc.aweme.commercialize.star.a.C0513a.class
            r5[r10] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r25 = r2
            r26 = r0
            r27 = r1
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            com.meituan.robust.PatchProxy.accessDispatch(r25, r26, r27, r28, r29, r30, r31)
            return
        L_0x024d:
            java.lang.String r0 = "iCheckOrder"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.c.d()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x026d
            com.ss.android.ugc.aweme.profile.model.CommerceUserInfo r0 = r0.getCommerceUserInfo()
            if (r0 == 0) goto L_0x026d
            int r0 = r0.getStarAtlas()
            if (r0 == r12) goto L_0x0295
        L_0x026d:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.c.d()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            if (r0 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.c.d()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurUser()
            java.lang.String r2 = "AccountProxyService.userService().curUser"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r0 = r0.isWithStarAtlasEntry()
            if (r0 != 0) goto L_0x0295
            goto L_0x02ae
        L_0x0295:
            com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi$IStarAtlasOrderApi r0 = com.ss.android.ugc.aweme.commercialize.star.StarAtlasOrderApi.a()
            r2 = 10
            com.google.common.util.concurrent.q r0 = r0.checkStarAtlasOrder(r12, r2)
            com.ss.android.ugc.aweme.commercialize.star.a$b r2 = new com.ss.android.ugc.aweme.commercialize.star.a$b
            r2.<init>(r1)
            com.google.common.util.concurrent.k r2 = (com.google.common.util.concurrent.k) r2
            com.ss.android.ugc.aweme.base.k r1 = com.ss.android.ugc.aweme.base.k.f34752b
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.common.util.concurrent.l.a(r0, r2, r1)
            return
        L_0x02ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.star.c.onCreate(android.support.v4.app.Fragment, android.widget.LinearLayout, android.os.Bundle, com.ss.android.ugc.aweme.services.publish.AVPublishContentType, com.ss.android.ugc.aweme.services.publish.PublishOutput, com.ss.android.ugc.aweme.services.publish.ExtensionMisc, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension$Callback):void");
    }
}
