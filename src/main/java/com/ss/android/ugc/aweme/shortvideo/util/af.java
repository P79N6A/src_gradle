package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.port.in.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/util/RecordPermissionChecker;", "", "()V", "permissionGuildDialog", "Landroid/app/Dialog;", "showCheckPermissionGuideDialog", "", "context", "Landroid/content/Context;", "onCancel", "Lkotlin/Function0;", "onConfirm", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71093a;

    /* renamed from: b  reason: collision with root package name */
    static Dialog f71094b;

    /* renamed from: c  reason: collision with root package name */
    public static final af f71095c = new af();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<Unit> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f71097b;

        c(Function0 function0) {
            this.f71097b = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71096a, false, 81031, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71096a, false, 81031, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            dialogInterface.dismiss();
            this.f71097b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f71099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f71100c;

        d(Context context, Function0 function0) {
            this.f71099b = context;
            this.f71100c = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71098a, false, 81032, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f71098a, false, 81032, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            dialogInterface.dismiss();
            k kVar = com.ss.android.ugc.aweme.port.in.a.H;
            Intrinsics.checkExpressionValueIsNotNull(kVar, "AVEnv.sAPI");
            kVar.E().d(this.f71099b);
            this.f71100c.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class e implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71101a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f71102b = new e();

        e() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f71101a, false, 81033, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f71101a, false, 81033, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            af afVar = af.f71095c;
            af.f71094b = null;
        }
    }

    private af() {
    }

    public final void a(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Context context2 = context;
        Function0<Unit> function03 = function0;
        Function0<Unit> function04 = function02;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context2, function03, function04}, this, f71093a, false, 81030, new Class[]{Context.class, Function0.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, function03, function04}, this, f71093a, false, 81030, new Class[]{Context.class, Function0.class, Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(function03, "onCancel");
        Intrinsics.checkParameterIsNotNull(function04, "onConfirm");
        if (f71094b == null) {
            Dialog a2 = new a.C0185a(context2).b((int) C0906R.string.fr).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new c(function03)).a((int) C0906R.string.a0x, (DialogInterface.OnClickListener) new d(context2, function04)).a().a();
            a2.setOnDismissListener(e.f71102b);
            f71094b = a2;
        }
        Dialog dialog = f71094b;
        if (dialog != null) {
            if (!(context2 instanceof Activity) || ((Activity) context2).isFinishing() || dialog.isShowing()) {
                z = false;
            }
            if (!z) {
                dialog = null;
            }
            if (dialog != null) {
                try {
                    dialog.show();
                    v.a(dialog);
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.util.c.a(e2.toString());
                }
            }
        }
    }
}
