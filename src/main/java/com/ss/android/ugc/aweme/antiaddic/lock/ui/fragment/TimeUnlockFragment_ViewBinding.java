package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TimeUnlockFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33514a;

    /* renamed from: b  reason: collision with root package name */
    private TimeUnlockFragment f33515b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33514a, false, 22004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33514a, false, 22004, new Class[0], Void.TYPE);
            return;
        }
        TimeUnlockFragment timeUnlockFragment = this.f33515b;
        if (timeUnlockFragment != null) {
            this.f33515b = null;
            timeUnlockFragment.desc = null;
            timeUnlockFragment.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TimeUnlockFragment_ViewBinding(TimeUnlockFragment timeUnlockFragment, View view) {
        this.f33515b = timeUnlockFragment;
        timeUnlockFragment.desc = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dmv, "field 'desc'", TextView.class);
        timeUnlockFragment.title = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.dnn, "field 'title'", TextView.class);
    }
}
