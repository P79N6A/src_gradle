package com.ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.utils.bi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/permission/SimplePermissionUtils;", "", "()V", "ensureExternalStoragePermission", "", "activity", "Landroid/app/Activity;", "onSuccess", "Lkotlin/Function0;", "onFail", "verifyPermissions", "", "grantResults", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75946a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f75947b = new g();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    static final class a implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f75949b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f75950c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function0 f75951d;

        a(Function0 function0, Activity activity, Function0 function02) {
            this.f75949b = function0;
            this.f75950c = activity;
            this.f75951d = function02;
        }

        public final void a(String[] strArr, int[] iArr) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f75948a, false, 88803, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f75948a, false, 88803, new Class[]{String[].class, int[].class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(iArr, "grantResults");
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (iArr[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f75949b.invoke();
                return;
            }
            new a.C0185a(this.f75950c).a((int) C0906R.string.a0x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75952a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f75953b;

                {
                    this.f75953b = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75952a, false, 88804, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75952a, false, 88804, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    bi.a(this.f75953b.f75950c);
                }
            }).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) AnonymousClass2.f75955b).b((int) C0906R.string.fs).a().a();
            this.f75951d.invoke();
        }
    }

    private g() {
    }

    @JvmStatic
    public static final void a(@NotNull Activity activity, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Activity activity2 = activity;
        Function0<Unit> function03 = function0;
        Function0<Unit> function04 = function02;
        if (PatchProxy.isSupport(new Object[]{activity2, function03, function04}, null, f75946a, true, 88802, new Class[]{Activity.class, Function0.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, function03, function04}, null, f75946a, true, 88802, new Class[]{Activity.class, Function0.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(function03, "onSuccess");
        Intrinsics.checkParameterIsNotNull(function04, "onFail");
        b.a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new a(function03, activity2, function04));
    }
}
