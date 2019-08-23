package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileEditIdFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62191a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileEditIdFragment f62192b;

    /* renamed from: c  reason: collision with root package name */
    private View f62193c;

    /* renamed from: d  reason: collision with root package name */
    private View f62194d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62191a, false, 68768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62191a, false, 68768, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditIdFragment profileEditIdFragment = this.f62192b;
        if (profileEditIdFragment != null) {
            this.f62192b = null;
            profileEditIdFragment.mIdInput = null;
            profileEditIdFragment.mClearAllBtn = null;
            profileEditIdFragment.mCopyButton = null;
            profileEditIdFragment.mIdEditHintText = null;
            this.f62193c.setOnClickListener(null);
            this.f62193c = null;
            this.f62194d.setOnClickListener(null);
            this.f62194d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileEditIdFragment_ViewBinding(final ProfileEditIdFragment profileEditIdFragment, View view) {
        this.f62192b = profileEditIdFragment;
        profileEditIdFragment.mIdInput = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.aa6, "field 'mIdInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.azv, "field 'mClearAllBtn' and method 'onClearInput'");
        profileEditIdFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.azv, "field 'mClearAllBtn'", ImageView.class);
        this.f62193c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62195a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62195a, false, 68769, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62195a, false, 68769, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditIdFragment.onClearInput();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.zs, "field 'mCopyButton' and method 'copyId'");
        profileEditIdFragment.mCopyButton = (TextView) Utils.castView(findRequiredView2, C0906R.id.zs, "field 'mCopyButton'", TextView.class);
        this.f62194d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62198a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62198a, false, 68770, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62198a, false, 68770, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditIdFragment.copyId();
            }
        });
        profileEditIdFragment.mIdEditHintText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dd6, "field 'mIdEditHintText'", TextView.class);
    }
}
