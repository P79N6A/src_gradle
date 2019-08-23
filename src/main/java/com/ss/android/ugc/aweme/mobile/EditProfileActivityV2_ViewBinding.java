package com.ss.android.ugc.aweme.mobile;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class EditProfileActivityV2_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56056a;

    /* renamed from: b  reason: collision with root package name */
    private EditProfileActivityV2 f56057b;

    /* renamed from: c  reason: collision with root package name */
    private View f56058c;

    /* renamed from: d  reason: collision with root package name */
    private View f56059d;

    /* renamed from: e  reason: collision with root package name */
    private View f56060e;

    /* renamed from: f  reason: collision with root package name */
    private View f56061f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56056a, false, 59695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56056a, false, 59695, new Class[0], Void.TYPE);
            return;
        }
        EditProfileActivityV2 editProfileActivityV2 = this.f56057b;
        if (editProfileActivityV2 != null) {
            this.f56057b = null;
            editProfileActivityV2.mAvatar = null;
            editProfileActivityV2.mUsernameEdit = null;
            editProfileActivityV2.mBtnEnterAweme = null;
            editProfileActivityV2.txtExtra = null;
            editProfileActivityV2.txtBirthday = null;
            editProfileActivityV2.txtGender = null;
            editProfileActivityV2.mSetAvatarText = null;
            this.f56058c.setOnClickListener(null);
            this.f56058c = null;
            this.f56059d.setOnClickListener(null);
            this.f56059d = null;
            this.f56060e.setOnClickListener(null);
            this.f56060e = null;
            this.f56061f.setOnClickListener(null);
            this.f56061f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public EditProfileActivityV2_ViewBinding(final EditProfileActivityV2 editProfileActivityV2, View view) {
        this.f56057b = editProfileActivityV2;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.hk, "field 'mAvatar' and method 'editAvatar'");
        editProfileActivityV2.mAvatar = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.hk, "field 'mAvatar'", RemoteImageView.class);
        this.f56058c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56062a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56062a, false, 59696, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56062a, false, 59696, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editProfileActivityV2.editAvatar();
            }
        });
        editProfileActivityV2.mUsernameEdit = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.dqn, "field 'mUsernameEdit'", EditText.class);
        editProfileActivityV2.mBtnEnterAweme = (Button) Utils.findRequiredViewAsType(view, C0906R.id.aeg, "field 'mBtnEnterAweme'", Button.class);
        editProfileActivityV2.txtExtra = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d0v, "field 'txtExtra'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.dmr, "field 'txtBirthday' and method 'editBirthday'");
        editProfileActivityV2.txtBirthday = (TextView) Utils.castView(findRequiredView2, C0906R.id.dmr, "field 'txtBirthday'", TextView.class);
        this.f56059d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56065a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f56065a, false, 59697, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f56065a, false, 59697, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editProfileActivityV2.editBirthday(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.dn4, "field 'txtGender' and method 'selectGender'");
        editProfileActivityV2.txtGender = (TextView) Utils.castView(findRequiredView3, C0906R.id.dn4, "field 'txtGender'", TextView.class);
        this.f56060e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56068a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56068a, false, 59698, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56068a, false, 59698, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editProfileActivityV2.selectGender();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.dip, "field 'mSetAvatarText' and method 'editAvatar'");
        editProfileActivityV2.mSetAvatarText = (TextView) Utils.castView(findRequiredView4, C0906R.id.dip, "field 'mSetAvatarText'", TextView.class);
        this.f56061f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56071a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f56071a, false, 59699, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f56071a, false, 59699, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                editProfileActivityV2.editAvatar();
            }
        });
    }
}
