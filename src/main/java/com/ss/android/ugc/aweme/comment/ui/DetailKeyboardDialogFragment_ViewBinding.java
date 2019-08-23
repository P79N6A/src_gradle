package com.ss.android.ugc.aweme.comment.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DetailKeyboardDialogFragment_ViewBinding extends KeyboardDialogFragment_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36506a;

    /* renamed from: c  reason: collision with root package name */
    private DetailKeyboardDialogFragment f36507c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36506a, false, 27535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36506a, false, 27535, new Class[0], Void.TYPE);
            return;
        }
        DetailKeyboardDialogFragment detailKeyboardDialogFragment = this.f36507c;
        if (detailKeyboardDialogFragment != null) {
            this.f36507c = null;
            detailKeyboardDialogFragment.tabDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DetailKeyboardDialogFragment_ViewBinding(DetailKeyboardDialogFragment detailKeyboardDialogFragment, View view) {
        super(detailKeyboardDialogFragment, view);
        this.f36507c = detailKeyboardDialogFragment;
        detailKeyboardDialogFragment.tabDivider = Utils.findRequiredView(view, C0906R.id.cyp, "field 'tabDivider'");
    }
}
