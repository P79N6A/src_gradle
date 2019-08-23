package com.ss.android.ugc.aweme.ai;

import android.app.Activity;
import android.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IPrivacySettingService;
import com.ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ \u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/servicimpl/PrivacySettingServiceImpl;", "Lcom/ss/android/ugc/aweme/services/privacysetting/IAVPrivacySettingService;", "()V", "service", "Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;", "getService", "()Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;", "service$delegate", "Lkotlin/Lazy;", "needShowPrivacyConfirmationDialog", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "showPrivacyConfirmationDialog", "Landroid/app/AlertDialog;", "onPostNowClickListener", "Lkotlin/Function0;", "", "tools.dmt-integration_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements IAVPrivacySettingService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33289a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f33290b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "service", "getService()Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;"))};

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f33291c = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/services/IPrivacySettingService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<IPrivacySettingService> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final IPrivacySettingService invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71653, new Class[0], IPrivacySettingService.class)) {
                return (IPrivacySettingService) ServiceManager.get().getService(IPrivacySettingService.class);
            }
            return (IPrivacySettingService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71653, new Class[0], IPrivacySettingService.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPostNowClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.ai.b$b  reason: collision with other inner class name */
    static final class C0422b implements IPrivacySettingService.OnPostNowClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f33293b;

        C0422b(Function0 function0) {
            this.f33293b = function0;
        }

        public final void onPostNowClick() {
            if (PatchProxy.isSupport(new Object[0], this, f33292a, false, 71654, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33292a, false, 71654, new Class[0], Void.TYPE);
                return;
            }
            this.f33293b.invoke();
        }
    }

    private final IPrivacySettingService a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f33289a, false, 71650, new Class[0], IPrivacySettingService.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f33289a, false, 71650, new Class[0], IPrivacySettingService.class);
        } else {
            value = this.f33291c.getValue();
        }
        return (IPrivacySettingService) value;
    }

    @Nullable
    public final Boolean needShowPrivacyConfirmationDialog(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f33289a, false, 71651, new Class[]{Activity.class}, Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[]{activity2}, this, f33289a, false, 71651, new Class[]{Activity.class}, Boolean.class);
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        IPrivacySettingService a2 = a();
        if (a2 != null) {
            return Boolean.valueOf(a2.needShowPrivacyConfirmationDialog(activity2));
        }
        return null;
    }

    @Nullable
    public final AlertDialog showPrivacyConfirmationDialog(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
        Activity activity2 = activity;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{activity2, function02}, this, f33289a, false, 71652, new Class[]{Activity.class, Function0.class}, AlertDialog.class)) {
            return (AlertDialog) PatchProxy.accessDispatch(new Object[]{activity2, function02}, this, f33289a, false, 71652, new Class[]{Activity.class, Function0.class}, AlertDialog.class);
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(function02, "onPostNowClickListener");
        IPrivacySettingService a2 = a();
        if (a2 != null) {
            return a2.showPrivacyConfirmationDialog(activity2, new C0422b(function02));
        }
        return null;
    }
}
