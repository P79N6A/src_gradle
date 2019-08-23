package com.ss.android.ugc.aweme.commerce.service.pop;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/pop/FixedDialog;", "Landroid/support/design/widget/BottomSheetDialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class FixedDialog extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38247a;

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f38247a, false, 29919, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f38247a, false, 29919, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedDialog(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
