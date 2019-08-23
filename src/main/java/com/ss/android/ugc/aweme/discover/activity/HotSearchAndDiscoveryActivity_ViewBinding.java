package com.ss.android.ugc.aweme.discover.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class HotSearchAndDiscoveryActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41507a;

    /* renamed from: b  reason: collision with root package name */
    private HotSearchAndDiscoveryActivity f41508b;

    /* renamed from: c  reason: collision with root package name */
    private View f41509c;

    /* renamed from: d  reason: collision with root package name */
    private View f41510d;

    /* renamed from: e  reason: collision with root package name */
    private TextWatcher f41511e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41507a, false, 35459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41507a, false, 35459, new Class[0], Void.TYPE);
        } else if (this.f41508b != null) {
            this.f41508b = null;
            this.f41509c.setOnClickListener(null);
            this.f41509c = null;
            ((TextView) this.f41510d).removeTextChangedListener(this.f41511e);
            this.f41511e = null;
            this.f41510d = null;
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public HotSearchAndDiscoveryActivity_ViewBinding(final HotSearchAndDiscoveryActivity hotSearchAndDiscoveryActivity, View view) {
        this.f41508b = hotSearchAndDiscoveryActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ns, "method 'onClick'");
        this.f41509c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41512a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f41512a, false, 35460, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f41512a, false, 35460, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                hotSearchAndDiscoveryActivity.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.aai, "method 'onTextChanged'");
        this.f41510d = findRequiredView2;
        this.f41511e = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41515a;

            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                CharSequence charSequence2 = charSequence;
                if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f41515a, false, 35461, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f41515a, false, 35461, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                hotSearchAndDiscoveryActivity.onTextChanged(charSequence2);
            }
        };
        ((TextView) findRequiredView2).addTextChangedListener(this.f41511e);
    }
}
