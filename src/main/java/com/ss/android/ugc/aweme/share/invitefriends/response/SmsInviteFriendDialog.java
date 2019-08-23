package com.ss.android.ugc.aweme.share.invitefriends.response;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.invitefriends.response.a;
import com.ss.android.ugc.aweme.utils.t;
import java.util.Map;

public class SmsInviteFriendDialog extends Dialog implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65136a;

    /* renamed from: b  reason: collision with root package name */
    final User f65137b;

    /* renamed from: c  reason: collision with root package name */
    a.C0702a f65138c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f65139d;
    @BindView(2131494950)
    AvatarImageView mAvatarView;
    @BindView(2131493938)
    Button mConfirmButton;
    @BindView(2131493914)
    TextView mDescription;
    @BindView(2131497590)
    TextView mUserName;

    @OnClick({2131493574})
    public void onCloseClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73587, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73590, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73590, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f65138c != null) {
            this.f65138c.c();
        }
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73582, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73582, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f65137b.getFollowStatus() == 1 || this.f65137b.getFollowStatus() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73584, new Class[0], Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(false);
        this.mConfirmButton.setText(C0906R.string.b2g);
        this.mConfirmButton.setBackgroundResource(2130840212);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.ha));
        this.mDescription.setText(C0906R.string.c92);
    }

    @OnClick({2131493938})
    public void onConfirmButtonClick() {
        boolean z;
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73586, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f65138c.b()) {
            if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73581, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73581, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f65137b.getFollowStatus() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !b()) {
                d dVar = new d(this);
                if (!d.a().isLogin()) {
                    Activity activity = this.f65139d;
                    dVar.getClass();
                    if (PatchProxy.isSupport(new Object[]{dVar}, null, e.f65166a, true, 73592, new Class[]{Runnable.class}, f.class)) {
                        fVar = (f) PatchProxy.accessDispatch(new Object[]{dVar}, null, e.f65166a, true, 73592, new Class[]{Runnable.class}, f.class);
                    } else {
                        fVar = new e(dVar);
                    }
                    e.a(activity, "", "click_follow", fVar);
                    return;
                }
                dVar.run();
            }
        }
    }

    @OnClick({2131494515})
    public void onGotoProfile() {
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73588, new Class[0], Void.TYPE);
            return;
        }
        h a2 = h.a();
        Activity activity = this.f65139d;
        a2.a(activity, j.a("aweme://user/profile/" + this.f65137b.getUid()).a("sec_user_id", this.f65137b.getSecUid()).a());
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73589, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73589, new Class[0], Void.TYPE);
        } else {
            r.a("enter_personal_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "invite_friend_popup").a("scene_id", "1038").a("to_user_id", this.f65137b.getUid()).f34114b);
        }
        dismiss();
    }

    public final void a(FollowStatus followStatus) {
        int i;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f65136a, false, 73583, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f65136a, false, 73583, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(true);
        Button button = this.mConfirmButton;
        if (followStatus.followStatus == 1) {
            i = C0906R.string.agr;
        } else {
            i = C0906R.string.a6x;
        }
        button.setText(i);
        this.mConfirmButton.setBackgroundResource(2130840214);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.yx));
        this.mDescription.setText(C0906R.string.b2l);
    }

    public void onCreate(Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65136a, false, 73579, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65136a, false, 73579, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.kd);
        ButterKnife.bind((Dialog) this);
        if (this.f65137b == null) {
            dismiss();
            return;
        }
        this.f65138c = new c(this, this.f65137b.getFollowStatus(), this.f65137b.getUid());
        if (PatchProxy.isSupport(new Object[0], this, f65136a, false, 73580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65136a, false, 73580, new Class[0], Void.TYPE);
            return;
        }
        if (b()) {
            Button button = this.mConfirmButton;
            if (this.f65137b.getFollowStatus() == 1) {
                i = C0906R.string.agr;
            } else {
                i = C0906R.string.a6x;
            }
            button.setText(i);
            this.mConfirmButton.setBackgroundResource(2130840214);
            this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.yx));
            this.mDescription.setText(C0906R.string.b2m);
        }
        this.mUserName.setText(this.f65137b.getNickname());
        c.b(this.mAvatarView, t.a(this.f65137b));
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f65136a, false, 73585, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f65136a, false, 73585, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(true);
        this.mConfirmButton.setText(C0906R.string.b2g);
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc, C0906R.string.afx);
        this.mConfirmButton.setBackgroundResource(2130840212);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.ha));
        this.mDescription.setText(C0906R.string.c92);
    }

    public SmsInviteFriendDialog(Activity activity, User user) {
        super(activity, C0906R.style.su);
        this.f65139d = activity;
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        this.f65137b = user;
    }
}
