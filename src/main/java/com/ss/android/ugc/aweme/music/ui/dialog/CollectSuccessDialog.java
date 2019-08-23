package com.ss.android.ugc.aweme.music.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/music/ui/dialog/CollectSuccessDialog;", "Landroid/support/v4/app/DialogFragment;", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectSuccessDialog extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56678a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f56679b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectSuccessDialog f56681b;

        a(CollectSuccessDialog collectSuccessDialog) {
            this.f56681b = collectSuccessDialog;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f56680a, false, 60549, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f56680a, false, 60549, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f56681b.dismiss();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f56678a, false, 60548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56678a, false, 60548, new Class[0], Void.TYPE);
            return;
        }
        if (this.f56679b != null) {
            this.f56679b.clear();
        }
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56678a, false, 60546, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f56678a, false, 60546, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(C0906R.layout.ip);
        dialog.findViewById(C0906R.id.oq).setOnClickListener(new a(this));
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        window.setBackgroundDrawableResource(C0906R.color.a7l);
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        double b2 = (double) p.b(getContext());
        Double.isNaN(b2);
        attributes.width = (int) (b2 * 0.75d);
        attributes.height = -2;
        attributes.horizontalMargin = 0.0f;
        window.setAttributes(attributes);
        return dialog;
    }
}
