package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ViewPagerBottomSheetDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69937a;

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{bundle}, this, f69937a, false, 79569, new Class[]{Bundle.class}, Dialog.class)) {
            return new ViewPagerBottomSheetDialog(getContext(), getTheme());
        }
        return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f69937a, false, 79569, new Class[]{Bundle.class}, Dialog.class);
    }
}
