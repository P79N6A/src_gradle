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

public class ProfileEditNicknameFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62214a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileEditNicknameFragment f62215b;

    /* renamed from: c  reason: collision with root package name */
    private View f62216c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62214a, false, 68803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62214a, false, 68803, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditNicknameFragment profileEditNicknameFragment = this.f62215b;
        if (profileEditNicknameFragment != null) {
            this.f62215b = null;
            profileEditNicknameFragment.mNicknameInput = null;
            profileEditNicknameFragment.mClearAllBtn = null;
            profileEditNicknameFragment.mNicknameLengthHint = null;
            this.f62216c.setOnClickListener(null);
            this.f62216c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileEditNicknameFragment_ViewBinding(final ProfileEditNicknameFragment profileEditNicknameFragment, View view) {
        this.f62215b = profileEditNicknameFragment;
        profileEditNicknameFragment.mNicknameInput = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.aac, "field 'mNicknameInput'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.azv, "field 'mClearAllBtn' and method 'onClearInput'");
        profileEditNicknameFragment.mClearAllBtn = (ImageView) Utils.castView(findRequiredView, C0906R.id.azv, "field 'mClearAllBtn'", ImageView.class);
        this.f62216c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62217a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62217a, false, 68804, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62217a, false, 68804, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                profileEditNicknameFragment.onClearInput();
            }
        });
        profileEditNicknameFragment.mNicknameLengthHint = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dj3, "field 'mNicknameLengthHint'", TextView.class);
    }
}
