package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MultilineInputFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61916a;

    /* renamed from: b  reason: collision with root package name */
    private MultilineInputFragment f61917b;

    /* renamed from: c  reason: collision with root package name */
    private View f61918c;

    /* renamed from: d  reason: collision with root package name */
    private View f61919d;

    /* renamed from: e  reason: collision with root package name */
    private View f61920e;

    /* renamed from: f  reason: collision with root package name */
    private View f61921f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61916a, false, 68150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61916a, false, 68150, new Class[0], Void.TYPE);
            return;
        }
        MultilineInputFragment multilineInputFragment = this.f61917b;
        if (multilineInputFragment != null) {
            this.f61917b = null;
            multilineInputFragment.mTitleBar = null;
            multilineInputFragment.mInput = null;
            multilineInputFragment.mClearAllBtn = null;
            multilineInputFragment.mLengthHint = null;
            multilineInputFragment.mPopRemarkname = null;
            multilineInputFragment.mTvContactname = null;
            multilineInputFragment.mTvSetting = null;
            this.f61918c.setOnClickListener(null);
            this.f61918c = null;
            this.f61919d.setOnClickListener(null);
            this.f61919d = null;
            this.f61920e.setOnClickListener(null);
            this.f61920e = null;
            this.f61921f.setOnClickListener(null);
            this.f61921f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MultilineInputFragment_ViewBinding(final MultilineInputFragment multilineInputFragment, View view) {
        this.f61917b = multilineInputFragment;
        multilineInputFragment.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", ButtonTitleBar.class);
        multilineInputFragment.mInput = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.aup, "field 'mInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.azv, "field 'mClearAllBtn' and method 'onClick'");
        multilineInputFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.azv, "field 'mClearAllBtn'", ImageView.class);
        this.f61918c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61922a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61922a, false, 68151, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61922a, false, 68151, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                multilineInputFragment.onClick(view2);
            }
        });
        multilineInputFragment.mLengthHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ddo, "field 'mLengthHint'", TextView.class);
        multilineInputFragment.mPopRemarkname = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.c4b, "field 'mPopRemarkname'", RelativeLayout.class);
        multilineInputFragment.mTvContactname = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d_z, "field 'mTvContactname'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dir, "field 'mTvSetting' and method 'onClick'");
        multilineInputFragment.mTvSetting = (DmtTextView) Utils.castView(findRequiredView2, C0906R.id.dir, "field 'mTvSetting'", DmtTextView.class);
        this.f61919d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61925a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61925a, false, 68152, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61925a, false, 68152, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                multilineInputFragment.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.ix, "method 'onClick'");
        this.f61920e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61928a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61928a, false, 68153, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61928a, false, 68153, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                multilineInputFragment.onClick(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.ceh, "method 'onClick'");
        this.f61921f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61931a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f61931a, false, 68154, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f61931a, false, 68154, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                multilineInputFragment.onClick(view2);
            }
        });
    }
}
