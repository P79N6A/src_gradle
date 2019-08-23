package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedCommentAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ<\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0014J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/ui/InsFollowFeedCommentLayout;", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedCommentLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "comments", "", "Lcom/ss/android/ugc/aweme/comment/model/Comment;", "likeUsers", "Lcom/ss/android/ugc/aweme/profile/model/User;", "listener", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedCommentLayout$CommentViewInteractListener;", "bindShowAllCommentsLayout", "onFinishInflate", "setDisplayType", "displayType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InsFollowFeedCommentLayout extends FollowFeedCommentLayout {
    public static ChangeQuickRedirect i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InsFollowFeedCommentLayout f57274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FollowFeedCommentLayout.a f57275c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Aweme f57276d;

        a(InsFollowFeedCommentLayout insFollowFeedCommentLayout, FollowFeedCommentLayout.a aVar, Aweme aweme) {
            this.f57274b = insFollowFeedCommentLayout;
            this.f57275c = aVar;
            this.f57276d = aweme;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57273a, false, 61672, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57273a, false, 61672, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FollowFeedCommentLayout.a aVar = this.f57275c;
            if (aVar != null) {
                aVar.a(this.f57274b.mShowAllComments, this.f57276d, false, "click_more_comment");
            }
        }
    }

    @JvmOverloads
    public InsFollowFeedCommentLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public InsFollowFeedCommentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61666, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61666, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        RecyclerView recyclerView = this.mRecComments;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecComments");
        recyclerView.setFocusableInTouchMode(false);
    }

    public final void c() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 61669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 61669, new Class[0], Void.TYPE);
        } else if (b()) {
            if (this.f57214e != null) {
                Aweme aweme = this.f57214e;
                Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
                if (aweme.getStatistics() != null) {
                    Aweme aweme2 = this.f57214e;
                    Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                    AwemeStatistics statistics = aweme2.getStatistics();
                    Intrinsics.checkExpressionValueIsNotNull(statistics, "mAweme.statistics");
                    i2 = statistics.getCommentCount();
                    if (i2 > 0 || this.f57213d == null || i2 <= this.f57213d.size()) {
                        DmtTextView dmtTextView = this.mShowAllComments;
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mShowAllComments");
                        dmtTextView.setVisibility(8);
                        this.mLayoutAddComment.setPadding(0, u.a(12.0d), 0, u.a(12.0d));
                    }
                    DmtTextView dmtTextView2 = this.mShowAllComments;
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "mShowAllComments");
                    dmtTextView2.setVisibility(0);
                    DmtTextView dmtTextView3 = this.mShowAllComments;
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "mShowAllComments");
                    String string = getResources().getString(C0906R.string.c86);
                    Intrinsics.checkExpressionValueIsNotNull(string, "resources.getString(R.string.show_all_comment)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{b.a((long) i2)}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                    dmtTextView3.setText(format);
                    this.mLayoutAddComment.setPadding(0, u.a(12.0d), 0, u.a(12.0d));
                    return;
                }
            }
            i2 = 0;
            if (i2 > 0) {
            }
            DmtTextView dmtTextView4 = this.mShowAllComments;
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "mShowAllComments");
            dmtTextView4.setVisibility(8);
            this.mLayoutAddComment.setPadding(0, u.a(12.0d), 0, u.a(12.0d));
        }
    }

    public final void setDisplayType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 61667, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 61667, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        Intrinsics.checkExpressionValueIsNotNull(commentLikeListView, "mLayoutLikes");
        commentLikeListView.setVisibility(0);
        LinearLayout linearLayout = this.mLayoutAddComment;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mLayoutAddComment");
        linearLayout.setVisibility(0);
        DmtTextView dmtTextView = this.mShowAllComments;
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "mShowAllComments");
        dmtTextView.setVisibility(0);
        a(this.mShowAllComments, 0);
        CircleImageView circleImageView = this.mImgAvatar;
        Intrinsics.checkExpressionValueIsNotNull(circleImageView, "mImgAvatar");
        ViewGroup.LayoutParams layoutParams = circleImageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = u.a(24.0d);
            layoutParams2.height = u.a(24.0d);
            CircleImageView circleImageView2 = this.mImgAvatar;
            Intrinsics.checkExpressionValueIsNotNull(circleImageView2, "mImgAvatar");
            circleImageView2.setLayoutParams(layoutParams2);
            this.mImgAvatar.a(false, false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InsFollowFeedCommentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void a(@Nullable Aweme aweme, @Nullable List<? extends Comment> list, @Nullable List<? extends User> list2, @Nullable FollowFeedCommentLayout.a aVar) {
        Aweme aweme2 = aweme;
        List<? extends Comment> list3 = list;
        List<? extends User> list4 = list2;
        FollowFeedCommentLayout.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aweme2, list3, list4, aVar2}, this, i, false, 61668, new Class[]{Aweme.class, List.class, List.class, FollowFeedCommentLayout.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list3, list4, aVar2}, this, i, false, 61668, new Class[]{Aweme.class, List.class, List.class, FollowFeedCommentLayout.a.class}, Void.TYPE);
            return;
        }
        this.f57213d = list3;
        this.f57214e = aweme2;
        this.f57215f = list4;
        c();
        this.mShowAllComments.setOnClickListener(new a(this, aVar2, aweme2));
        d();
        this.mLayoutLikes.setEventType(this.f57212c);
        CommentLikeListView commentLikeListView = this.mLayoutLikes;
        Aweme aweme3 = this.f57214e;
        Intrinsics.checkExpressionValueIsNotNull(aweme3, "mAweme");
        commentLikeListView.setAuthorId(aweme3.getAuthorUid());
        CommentLikeListView commentLikeListView2 = this.mLayoutLikes;
        Aweme aweme4 = this.f57214e;
        Intrinsics.checkExpressionValueIsNotNull(aweme4, "mAweme");
        commentLikeListView2.setAwemeId(aweme4.getAid());
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        if (curUser.getAvatarThumb() != null) {
            IAccountUserService a3 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
            User curUser2 = a3.getCurUser();
            Intrinsics.checkExpressionValueIsNotNull(curUser2, "AccountUserProxyService.get().curUser");
            c.a((RemoteImageView) this.mImgAvatar, curUser2.getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            this.mImgAvatar.setImageURI(new Uri.Builder().scheme("res").path("2130838756").build());
        }
        if (CollectionUtils.isEmpty(list3)) {
            RecyclerView recyclerView = this.mRecComments;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecComments");
            recyclerView.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = this.mRecComments;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRecComments");
            recyclerView2.setVisibility(0);
        }
        RecyclerView recyclerView3 = this.mRecComments;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRecComments");
        recyclerView3.setLayoutManager(new InsFollowFeedCommentLayout$bind$2(this, getContext()));
        this.h = new FollowFeedCommentAdapter(aweme2, aVar2, true);
        FollowFeedCommentAdapter followFeedCommentAdapter = this.h;
        Intrinsics.checkExpressionValueIsNotNull(followFeedCommentAdapter, "mCommentAdapter");
        followFeedCommentAdapter.setShowFooter(false);
        this.h.f57071c = this.f57212c;
        this.h.f57070b = this.f57211b;
        FollowFeedCommentAdapter followFeedCommentAdapter2 = this.h;
        Intrinsics.checkExpressionValueIsNotNull(followFeedCommentAdapter2, "mCommentAdapter");
        followFeedCommentAdapter2.setData(this.f57213d);
        RecyclerView recyclerView4 = this.mRecComments;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "mRecComments");
        recyclerView4.setAdapter(this.h);
        RecyclerView recyclerView5 = this.mRecComments;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView5, "mRecComments");
        recyclerView5.setFocusable(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsFollowFeedCommentLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
