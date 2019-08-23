package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.a.a;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.profile.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedEmptyFriendHeadViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "mTabType", "", "followFeedViewHolder", "Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedViewHolder;", "adapter", "Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFeedAdapter;", "(Landroid/view/View;Landroid/app/Activity;Ljava/lang/String;Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedViewHolder;Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFeedAdapter;)V", "getActivity", "()Landroid/app/Activity;", "getAdapter", "()Lcom/ss/android/ugc/aweme/newfollow/adapter/FollowFeedAdapter;", "addFriendView", "Lcom/ss/android/ugc/aweme/profile/IThirdPartyView;", "getFollowFeedViewHolder", "()Lcom/ss/android/ugc/aweme/newfollow/vh/FollowFeedViewHolder;", "getMTabType", "()Ljava/lang/String;", "bind", "", "update", "", "updateSyncContactsView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowFeedEmptyFriendHeadViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57541a;

    /* renamed from: b  reason: collision with root package name */
    public h f57542b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Activity f57543c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f57544d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final n f57545e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final FollowFeedAdapter f57546f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowFeedEmptyFriendHeadViewHolder f57548b;

        public a(FollowFeedEmptyFriendHeadViewHolder followFeedEmptyFriendHeadViewHolder) {
            this.f57548b = followFeedEmptyFriendHeadViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57547a, false, 62206, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57547a, false, 62206, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.newfollow.a.a.a(this.f57548b.f57543c, (a.C0649a) new a.C0649a(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57549a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f57550b;

                {
                    this.f57550b = r1;
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f57549a, false, 62207, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57549a, false, 62207, new Class[0], Void.TYPE);
                        return;
                    }
                    this.f57550b.f57548b.f57545e.r();
                    this.f57550b.f57548b.f57546f.P = false;
                    this.f57550b.f57548b.f57542b.a(false);
                    this.f57550b.f57548b.f57542b.b(false);
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFeedEmptyFriendHeadViewHolder(@NotNull View view, @NotNull Activity activity, @NotNull String str, @NotNull n nVar, @NotNull FollowFeedAdapter followFeedAdapter) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(str, "mTabType");
        Intrinsics.checkParameterIsNotNull(nVar, "followFeedViewHolder");
        Intrinsics.checkParameterIsNotNull(followFeedAdapter, "adapter");
        this.f57543c = activity;
        this.f57544d = str;
        this.f57545e = nVar;
        this.f57546f = followFeedAdapter;
        h createThirdPartyAddFriendView = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createThirdPartyAddFriendView(this.f57543c);
        Intrinsics.checkExpressionValueIsNotNull(createThirdPartyAddFriendView, "ServiceManager.get().get…tyAddFriendView(activity)");
        this.f57542b = createThirdPartyAddFriendView;
        ((ViewGroup) view).addView(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createFollowFeedEmptyHeadView(this.f57543c, this.f57544d, this.f57542b));
    }
}
