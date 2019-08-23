package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010\u0013\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/widget/SetNicknameDialog;", "Lcom/ss/android/ugc/aweme/profile/ui/widget/OneLineInputDialog;", "Lcom/ss/android/ugc/aweme/profile/presenter/IUserView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "userPresenter", "Lcom/ss/android/ugc/aweme/profile/presenter/UserPresenter;", "onAllUpdateFinish", "", "isSuccess", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHitIllegalMsg", "toast", "", "back", "onUserUpdateFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "", "onUserUpdateSuccess", "data", "Lcom/ss/android/ugc/aweme/profile/model/User;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SetNicknameDialog extends OneLineInputDialog implements r {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f63098d;

    /* renamed from: e  reason: collision with root package name */
    public ad f63099e = new ad();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class a implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SetNicknameDialog f63100a;

        a(SetNicknameDialog setNicknameDialog) {
            this.f63100a = setNicknameDialog;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f63100a.f63099e.h = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetNicknameDialog f63102b;

        b(SetNicknameDialog setNicknameDialog) {
            this.f63102b = setNicknameDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f63101a, false, 69869, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f63101a, false, 69869, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ad adVar = this.f63102b.f63099e;
            DmtEditText dmtEditText = (DmtEditText) this.f63102b.findViewById(C0906R.id.a_z);
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "etInput");
            adVar.a(String.valueOf(dmtEditText.getText()));
        }
    }

    public final void a(boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetNicknameDialog(@NotNull Context context) {
        super(context, 0, 2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63098d, false, 69865, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63098d, false, 69865, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        ((DmtTextView) findViewById(C0906R.id.d8o)).setText(C0906R.string.c4m);
        ((DmtEditText) findViewById(C0906R.id.a_z)).setHint(C0906R.string.c4n);
        DmtTextView dmtTextView = (DmtTextView) findViewById(C0906R.id.d8f);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tvHint");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) findViewById(C0906R.id.d8f);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tvHint");
        dmtTextView2.setText(getContext().getString(C0906R.string.c4o, new Object[]{"20"}));
        this.f63099e.h = this;
        setOnDismissListener(new a(this));
        ((DmtButton) findViewById(C0906R.id.y0)).setOnClickListener(new b(this));
    }

    public final void a(@Nullable User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f63098d, false, 69866, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f63098d, false, 69866, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bg.a(new c());
        dismiss();
    }

    public final void a(@Nullable Exception exc, int i) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f63098d, false, 69867, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f63098d, false, 69867, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isShowing() && getContext() != null) {
            com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc, C0906R.string.bsd);
        }
    }

    public final void a(@Nullable String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63098d, false, 69868, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f63098d, false, 69868, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str2).a();
    }
}
