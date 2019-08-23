package com.ss.android.ugc.aweme.share.basic.texttoken;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TextTokenDialogDelegate_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64731a;

    /* renamed from: b  reason: collision with root package name */
    private TextTokenDialogDelegate f64732b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64731a, false, 73443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64731a, false, 73443, new Class[0], Void.TYPE);
            return;
        }
        TextTokenDialogDelegate textTokenDialogDelegate = this.f64732b;
        if (textTokenDialogDelegate != null) {
            this.f64732b = null;
            textTokenDialogDelegate.mTextTokenTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TextTokenDialogDelegate_ViewBinding(TextTokenDialogDelegate textTokenDialogDelegate, View view) {
        this.f64732b = textTokenDialogDelegate;
        textTokenDialogDelegate.mTextTokenTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d20, "field 'mTextTokenTextView'", TextView.class);
    }
}
