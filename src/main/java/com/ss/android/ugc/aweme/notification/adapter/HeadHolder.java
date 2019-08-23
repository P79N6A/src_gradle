package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/HeadHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "mActivity", "Landroid/app/Activity;", "avatarImageView", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;", "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;)V", "mUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "bind", "", "user", "onClick", "v", "Landroid/view/View;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeadHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57906a;

    /* renamed from: b  reason: collision with root package name */
    User f57907b;

    /* renamed from: c  reason: collision with root package name */
    final AvatarImageWithVerify f57908c;

    /* renamed from: d  reason: collision with root package name */
    private final Activity f57909d;

    public final void onClick(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57906a, false, 63032, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57906a, false, 63032, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        User user = this.f57907b;
        if (user != null) {
            h a2 = h.a();
            Activity activity = this.f57909d;
            a2.a(activity, j.a("aweme://user/profile/" + user.getUid()).a("sec_user_id", user.getSecUid()).a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeadHolder(@NotNull Activity activity, @NotNull AvatarImageWithVerify avatarImageWithVerify) {
        super(avatarImageWithVerify);
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        Intrinsics.checkParameterIsNotNull(avatarImageWithVerify, "avatarImageView");
        this.f57909d = activity;
        this.f57908c = avatarImageWithVerify;
        this.f57908c.setOnClickListener(this);
    }
}
