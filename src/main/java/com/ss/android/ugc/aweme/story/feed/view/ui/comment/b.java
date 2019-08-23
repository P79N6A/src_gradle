package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.view.ui.comment.KeyboardAwareEditText;

public final /* synthetic */ class b implements KeyboardAwareEditText.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72882a;

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardAwareDialog f72883b;

    b(KeyboardAwareDialog keyboardAwareDialog) {
        this.f72883b = keyboardAwareDialog;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72882a, false, 84167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72882a, false, 84167, new Class[0], Void.TYPE);
            return;
        }
        this.f72883b.a();
    }
}
