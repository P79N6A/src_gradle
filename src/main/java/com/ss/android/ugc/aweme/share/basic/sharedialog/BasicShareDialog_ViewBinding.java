package com.ss.android.ugc.aweme.share.basic.sharedialog;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BasicShareDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64715a;

    /* renamed from: b  reason: collision with root package name */
    private BasicShareDialog f64716b;

    /* renamed from: c  reason: collision with root package name */
    private View f64717c;

    /* renamed from: d  reason: collision with root package name */
    private View f64718d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64715a, false, 73424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64715a, false, 73424, new Class[0], Void.TYPE);
        } else if (this.f64716b != null) {
            this.f64716b = null;
            this.f64717c.setOnClickListener(null);
            this.f64717c = null;
            if (this.f64718d != null) {
                this.f64718d.setOnClickListener(null);
                this.f64718d = null;
            }
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public BasicShareDialog_ViewBinding(final BasicShareDialog basicShareDialog, View view) {
        this.f64716b = basicShareDialog;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.d67, "method 'onTouchOutside'");
        this.f64717c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64719a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64719a, false, 73425, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64719a, false, 73425, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                basicShareDialog.onTouchOutside();
            }
        });
        View findViewById = view.findViewById(C0906R.id.iu);
        if (findViewById != null) {
            this.f64718d = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64722a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f64722a, false, 73426, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f64722a, false, 73426, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    basicShareDialog.onBackClick();
                }
            });
        }
    }
}
