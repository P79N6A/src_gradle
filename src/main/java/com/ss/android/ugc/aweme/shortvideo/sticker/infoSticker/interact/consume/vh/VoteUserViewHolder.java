package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/vh/VoteUserViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivHead", "Lcom/ss/android/ugc/aweme/base/ui/CircleImageView;", "tvName", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteUserViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69975a;

    /* renamed from: b  reason: collision with root package name */
    public final CircleImageView f69976b;

    /* renamed from: c  reason: collision with root package name */
    public final DmtTextView f69977c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteUserViewHolder f69979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f69980c;

        public a(VoteUserViewHolder voteUserViewHolder, User user) {
            this.f69979b = voteUserViewHolder;
            this.f69980c = user;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69978a, false, 79630, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69978a, false, 79630, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View view2 = this.f69979b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            UserProfileActivity.a(view2.getContext(), this.f69980c.getUid(), this.f69980c.getSecUid());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteUserViewHolder f69982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f69983c;

        public b(VoteUserViewHolder voteUserViewHolder, User user) {
            this.f69982b = voteUserViewHolder;
            this.f69983c = user;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f69981a, false, 79631, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f69981a, false, 79631, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View view2 = this.f69982b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            UserProfileActivity.a(view2.getContext(), this.f69983c.getUid(), this.f69983c.getSecUid());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoteUserViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        View findViewById = view.findViewById(C0906R.id.b1u);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_head)");
        this.f69976b = (CircleImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.df7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_name)");
        this.f69977c = (DmtTextView) findViewById2;
    }
}
