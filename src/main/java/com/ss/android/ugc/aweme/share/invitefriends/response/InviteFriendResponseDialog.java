package com.ss.android.ugc.aweme.share.invitefriends.response;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AdsAppActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.share.a.d;
import com.ss.android.ugc.aweme.share.invitefriends.response.a;
import com.ss.android.ugc.aweme.u.d;
import com.ss.android.ugc.aweme.u.s;

public class InviteFriendResponseDialog extends Dialog implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65117a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f65118b;

    /* renamed from: c  reason: collision with root package name */
    private a.C0702a f65119c;

    /* renamed from: d  reason: collision with root package name */
    private a f65120d;
    @BindView(2131494950)
    AvatarImageView mAvatarView;
    @BindView(2131493938)
    Button mConfirmButton;
    @BindView(2131493914)
    TextView mDescription;
    @BindView(2131497590)
    TextView mUserName;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65121a;

        /* renamed from: b  reason: collision with root package name */
        public d f65122b;

        /* renamed from: c  reason: collision with root package name */
        public String f65123c;

        /* renamed from: d  reason: collision with root package name */
        public String f65124d;

        /* renamed from: e  reason: collision with root package name */
        public UrlModel f65125e;
    }

    @OnClick({2131493574})
    public void onCloseClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73568, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73569, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.f65119c != null) {
            this.f65119c.c();
        }
    }

    private boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73563, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73563, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f65120d == null || this.f65120d.f65122b == null || this.f65120d.f65122b.getSchemeDetail() == null || (this.f65120d.f65122b.getSchemeDetail().getFollowStatus() != 1 && this.f65120d.f65122b.getSchemeDetail().getFollowStatus() != 2)) {
            return false;
        } else {
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73565, new Class[0], Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(false);
        this.mConfirmButton.setText(C0906R.string.b2g);
        this.mConfirmButton.setBackgroundResource(2130840212);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.ha));
        this.mDescription.setText(C0906R.string.b2k);
    }

    @OnClick({2131493938})
    public void onConfirmButtonClick() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73567, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f65119c.b()) {
            if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73562, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73562, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (!(this.f65120d == null || this.f65120d.f65122b == null || this.f65120d.f65122b.getSchemeDetail() == null || this.f65120d.f65122b.getSchemeDetail().getFollowStatus() != 2)) {
                z = true;
            }
            if (!z && !b()) {
                if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                    e.a(this.f65118b, "", "story_reflow");
                    return;
                }
                this.f65119c.a();
                s h = new s("follow").b("token").c("follow_button").f("qr_code").g("other_places").k(this.f65120d.f65122b.getRid()).h(this.f65120d.f65122b.getShareUserId());
                h.a("log_pb", new Gson().toJson((Object) this.f65120d.f65122b.getLogPbBean()), d.a.f75112a);
                h.e();
                return;
            }
        }
        Intent intent = new Intent(getContext(), AdsAppActivity.class);
        intent.putExtra("from_token", this.f65120d.f65123c);
        intent.putExtra("token_request_id", this.f65120d.f65122b.getRid());
        intent.setData(Uri.parse(this.f65120d.f65122b.getSchema()));
        getContext().startActivity(intent);
        dismiss();
    }

    public final void a(FollowStatus followStatus) {
        int i;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f65117a, false, 73564, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f65117a, false, 73564, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(true);
        Button button = this.mConfirmButton;
        if (followStatus.followStatus == 1) {
            i = C0906R.string.b2h;
        } else {
            i = C0906R.string.b2i;
        }
        button.setText(i);
        this.mConfirmButton.setBackgroundResource(2130840214);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.yx));
        this.mDescription.setText(C0906R.string.b2l);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f65117a, false, 73566, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f65117a, false, 73566, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.mConfirmButton.setEnabled(true);
        this.mConfirmButton.setText(C0906R.string.b2g);
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), exc, C0906R.string.afx);
        this.mConfirmButton.setBackgroundResource(2130840212);
        this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.ha));
        this.mDescription.setText(C0906R.string.b2k);
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65117a, false, 73560, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65117a, false, 73560, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.jc);
        ButterKnife.bind((Dialog) this);
        if (this.f65120d != null) {
            a aVar = this.f65120d;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f65121a, false, 73571, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f65121a, false, 73571, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (aVar.f65122b == null || aVar.f65122b.getSchemeDetail() == null) {
                z = false;
            }
            if (z) {
                this.f65119c = new c(this, this.f65120d.f65122b.getSchemeDetail().getFollowStatus(), this.f65120d.f65122b.getShareUserId());
                if (PatchProxy.isSupport(new Object[0], this, f65117a, false, 73561, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f65117a, false, 73561, new Class[0], Void.TYPE);
                    return;
                }
                if (b()) {
                    this.mConfirmButton.setText(C0906R.string.b2j);
                    this.mConfirmButton.setBackgroundResource(2130840214);
                    this.mConfirmButton.setTextColor(getContext().getResources().getColor(C0906R.color.yx));
                    this.mDescription.setText(C0906R.string.b2m);
                }
                this.mUserName.setText(this.f65120d.f65124d);
                c.b(this.mAvatarView, this.f65120d.f65125e);
                return;
            }
        }
        this.mAvatarView.post(new b(this));
    }

    public InviteFriendResponseDialog(Activity activity, a aVar) {
        super(activity, C0906R.style.su);
        this.f65118b = activity;
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        this.f65120d = aVar;
    }
}
