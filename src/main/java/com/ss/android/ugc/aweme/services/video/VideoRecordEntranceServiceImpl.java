package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.util.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;", "Lcom/ss/android/ugc/aweme/services/video/IVideoRecordEntranceService;", "()V", "notifyToolPermissionActivity", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "recreateSupport", "", "clearOld", "isBack2Main", "startToolPermissionActivity", "Landroid/app/Activity;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoRecordEntranceServiceImpl implements IVideoRecordEntranceService {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Lazy INSTANCE$delegate = LazyKt.lazy(VideoRecordEntranceServiceImpl$Companion$INSTANCE$2.INSTANCE);
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;", "INSTANCE$annotations", "getINSTANCE", "()Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;", "INSTANCE$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/video/VideoRecordEntranceServiceImpl;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void INSTANCE$annotations() {
        }

        @NotNull
        public final VideoRecordEntranceServiceImpl getINSTANCE() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71639, new Class[0], VideoRecordEntranceServiceImpl.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71639, new Class[0], VideoRecordEntranceServiceImpl.class);
            } else {
                value = VideoRecordEntranceServiceImpl.INSTANCE$delegate.getValue();
            }
            return (VideoRecordEntranceServiceImpl) value;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public static final VideoRecordEntranceServiceImpl getINSTANCE() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 71638, new Class[0], VideoRecordEntranceServiceImpl.class) ? (VideoRecordEntranceServiceImpl) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 71638, new Class[0], VideoRecordEntranceServiceImpl.class) : Companion.getINSTANCE();
    }

    private VideoRecordEntranceServiceImpl() {
    }

    public /* synthetic */ VideoRecordEntranceServiceImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void startToolPermissionActivity(@Nullable Activity activity, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{activity, intent}, this, changeQuickRedirect, false, 71634, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, intent}, this, changeQuickRedirect, false, 71634, new Class[]{Activity.class, Intent.class}, Void.TYPE);
            return;
        }
        c.a(activity, intent);
    }

    public final void startToolPermissionActivity(@Nullable Context context, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, changeQuickRedirect, false, 71635, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, changeQuickRedirect, false, 71635, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        c.a(context, intent);
    }

    public final void notifyToolPermissionActivity(@NotNull Context context, @NotNull Intent intent, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71637, new Class[]{Context.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, changeQuickRedirect, false, 71637, new Class[]{Context.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(intent2, "intent");
        c.a(context, intent, z, z2, z3);
    }

    public final void startToolPermissionActivity(@NotNull Activity activity, @NotNull Intent intent, boolean z, boolean z2, boolean z3) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{activity2, intent2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71636, new Class[]{Activity.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, intent2, Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, changeQuickRedirect, false, 71636, new Class[]{Activity.class, Intent.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, "context");
        Intrinsics.checkParameterIsNotNull(intent2, "intent");
        c.a(activity, intent, z, z2, z3);
    }
}
