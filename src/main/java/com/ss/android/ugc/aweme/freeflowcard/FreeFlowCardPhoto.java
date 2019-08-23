package com.ss.android.ugc.aweme.freeflowcard;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;

public class FreeFlowCardPhoto {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48531a = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f48532d = "FreeFlowCardPhoto";

    /* renamed from: b  reason: collision with root package name */
    public Activity f48533b;

    /* renamed from: c  reason: collision with root package name */
    public View f48534c = this.f48533b.getLayoutInflater().inflate(C0906R.layout.r_, null);
    @BindView(2131493186)
    RemoteImageView mAvatarView;
    @BindView(2131497965)
    TextView mInviteCodeView;
    @BindView(2131498026)
    TextView mNickNameView;

    public interface a {
        void a();

        void a(String str);
    }

    public FreeFlowCardPhoto(Activity activity, String str) {
        this.f48533b = activity;
        ButterKnife.bind((Object) this, this.f48534c);
        if (PatchProxy.isSupport(new Object[]{str}, this, f48531a, false, 46033, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48531a, false, 46033, new Class[]{String.class}, Void.TYPE);
            return;
        }
        User curUser = d.a().getCurUser();
        if (curUser != null) {
            this.mNickNameView.setText(curUser.getNickname());
            c.b(this.mAvatarView, curUser.getAvatarThumb());
            this.mInviteCodeView.setText(str);
            return;
        }
        throw new IllegalArgumentException("current user is empty");
    }
}
