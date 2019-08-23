package com.ss.android.ugc.aweme.account.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class FillProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31620a;

    /* renamed from: b  reason: collision with root package name */
    private FillProfileActivity f31621b;

    /* renamed from: c  reason: collision with root package name */
    private View f31622c;

    /* renamed from: d  reason: collision with root package name */
    private View f31623d;

    /* renamed from: e  reason: collision with root package name */
    private View f31624e;

    /* renamed from: f  reason: collision with root package name */
    private View f31625f;
    private View g;
    private View h;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f31620a, false, 19575, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31620a, false, 19575, new Class[0], Void.TYPE);
            return;
        }
        FillProfileActivity fillProfileActivity = this.f31621b;
        if (fillProfileActivity != null) {
            this.f31621b = null;
            fillProfileActivity.mEndText = null;
            fillProfileActivity.mAvatar = null;
            fillProfileActivity.mSetAvatarText = null;
            fillProfileActivity.mUsernameEdit = null;
            fillProfileActivity.mBirthday = null;
            fillProfileActivity.mGender = null;
            fillProfileActivity.mBtnEnterAweme = null;
            this.f31622c.setOnClickListener(null);
            this.f31622c = null;
            this.f31623d.setOnClickListener(null);
            this.f31623d = null;
            this.f31624e.setOnClickListener(null);
            this.f31624e = null;
            this.f31625f.setOnClickListener(null);
            this.f31625f = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FillProfileActivity_ViewBinding(final FillProfileActivity fillProfileActivity, View view) {
        this.f31621b = fillProfileActivity;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.d1m, "field 'mEndText' and method 'onClick'");
        fillProfileActivity.mEndText = (DmtTextView) Utils.castView(findRequiredView, C0906R.id.d1m, "field 'mEndText'", DmtTextView.class);
        this.f31622c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31626a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31626a, false, 19576, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31626a, false, 19576, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.hk, "field 'mAvatar' and method 'onClick'");
        fillProfileActivity.mAvatar = (RemoteImageView) Utils.castView(findRequiredView2, C0906R.id.hk, "field 'mAvatar'", RemoteImageView.class);
        this.f31623d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31629a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31629a, false, 19577, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31629a, false, 19577, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.dip, "field 'mSetAvatarText' and method 'onClick'");
        fillProfileActivity.mSetAvatarText = (TextView) Utils.castView(findRequiredView3, C0906R.id.dip, "field 'mSetAvatarText'", TextView.class);
        this.f31624e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31632a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31632a, false, 19578, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31632a, false, 19578, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
        fillProfileActivity.mUsernameEdit = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.dqn, "field 'mUsernameEdit'", EditText.class);
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.dmr, "field 'mBirthday' and method 'onClick'");
        fillProfileActivity.mBirthday = (TextView) Utils.castView(findRequiredView4, C0906R.id.dmr, "field 'mBirthday'", TextView.class);
        this.f31625f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31635a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31635a, false, 19579, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31635a, false, 19579, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, C0906R.id.dn4, "field 'mGender' and method 'onClick'");
        fillProfileActivity.mGender = (TextView) Utils.castView(findRequiredView5, C0906R.id.dn4, "field 'mGender'", TextView.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31638a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31638a, false, 19580, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31638a, false, 19580, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, C0906R.id.aeg, "field 'mBtnEnterAweme' and method 'onClick'");
        fillProfileActivity.mBtnEnterAweme = (Button) Utils.castView(findRequiredView6, C0906R.id.aeg, "field 'mBtnEnterAweme'", Button.class);
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31641a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f31641a, false, 19581, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f31641a, false, 19581, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                fillProfileActivity.onClick(view2);
            }
        });
    }
}
