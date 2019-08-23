package com.ss.android.ugc.aweme.av.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fc;

public class CompatBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34448a;

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f34448a, false, 23935, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f34448a, false, 23935, new Class[]{Bundle.class}, Dialog.class);
        } else if (fc.a()) {
            return super.onCreateDialog(bundle);
        } else {
            return new CompatBottomSheetDialog(getContext(), getTheme());
        }
    }
}
