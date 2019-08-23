package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedCommentAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.CommentLikeListView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.h;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public class FollowFeedCommentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57210a;

    /* renamed from: b  reason: collision with root package name */
    protected int f57211b;

    /* renamed from: c  reason: collision with root package name */
    protected String f57212c;

    /* renamed from: d  reason: collision with root package name */
    protected List<Comment> f57213d;

    /* renamed from: e  reason: collision with root package name */
    protected Aweme f57214e;

    /* renamed from: f  reason: collision with root package name */
    protected List<User> f57215f;
    protected int g;
    protected FollowFeedCommentAdapter h;
    @BindDimen(2131231019)
    int mAvatarSize;
    @BindView(2131494751)
    CircleImageView mImgAvatar;
    @BindView(2131495231)
    LinearLayout mLayoutAddComment;
    @BindView(2131495266)
    CommentLikeListView mLayoutLikes;
    @BindView(2131496666)
    RecyclerView mRecComments;
    @BindView(2131498142)
    DmtTextView mShowAllComments;
    @Nullable
    @BindView(2131497206)
    View mSpace;

    public interface a {
        void a(View view, Aweme aweme);

        void a(View view, Aweme aweme, boolean z, String str);

        void a(Aweme aweme, Comment comment);

        void a(Aweme aweme, Comment comment, int i);

        void a(Aweme aweme, Comment comment, String str);

        void a(Aweme aweme, String str, String str2);

        void b(Aweme aweme, String str, String str2);
    }

    public CommentLikeListView getLayoutLikes() {
        return this.mLayoutLikes;
    }

    public final boolean b() {
        if (this.g > 0) {
            return true;
        }
        return false;
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f57210a, false, 61464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57210a, false, 61464, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        ButterKnife.bind((View) this);
        this.mRecComments.setFocusableInTouchMode(false);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57210a, false, 61467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57210a, false, 61467, new Class[0], Void.TYPE);
        } else if (this.mLayoutAddComment.getVisibility() != 0) {
            this.mLayoutAddComment.setVisibility(0);
            h.a(this.mLayoutAddComment, 0, this.mImgAvatar.getLayoutParams().height).start();
        }
    }

    public final void d() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f57210a, false, 61473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57210a, false, 61473, new Class[0], Void.TYPE);
        } else if (b()) {
            if (!(this.f57214e == null || this.f57214e.getStatistics() == null)) {
                i = this.f57214e.getStatistics().getDiggCount();
            }
            this.mLayoutLikes.a(this.f57215f, i);
        }
    }

    public void c() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f57210a, false, 61472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57210a, false, 61472, new Class[0], Void.TYPE);
        } else if (b()) {
            if (this.f57214e == null || this.f57214e.getStatistics() == null) {
                i = 0;
            } else {
                i = this.f57214e.getStatistics().getCommentCount();
            }
            if (i <= 0 || this.f57213d == null || i <= this.f57213d.size()) {
                this.mShowAllComments.setVisibility(8);
                this.mLayoutAddComment.setPadding(0, u.a(12.0d), 0, u.a(12.0d));
                return;
            }
            this.mShowAllComments.setVisibility(0);
            this.mShowAllComments.setText(String.format(getResources().getString(C0906R.string.c86), new Object[]{b.a((long) i)}));
            this.mLayoutAddComment.setPadding(0, u.a(10.0d), 0, u.a(12.0d));
        }
    }

    public void setEventType(String str) {
        this.f57212c = str;
    }

    public void setPageType(int i) {
        this.f57211b = i;
    }

    public FollowFeedCommentLayout(Context context) {
        this(context, null);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61469, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61469, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.notifyItemRemoved(i);
            if (CollectionUtils.isEmpty(this.h.getData())) {
                this.mRecComments.setVisibility(8);
            }
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.notifyItemChanged(i, 0);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61468, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61468, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.mRecComments.getVisibility() == 8) {
            this.mRecComments.setVisibility(0);
        }
        if (!b() && this.f57213d != null && this.f57213d.size() > 1) {
            Comment comment = this.f57213d.get(1);
            if (!(d.a().getCurUser() == null || comment.getUser() == null || !d.a().getCurUser().getUid().equals(comment.getUser().getUid()))) {
                this.f57213d.remove(1);
            }
        }
        if (this.h != null) {
            this.h.notifyDataSetChanged();
        }
    }

    public void setDisplayType(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61465, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57210a, false, 61465, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i;
        if (b()) {
            if (this.g == 1) {
                i2 = u.a(12.0d);
            } else {
                i2 = u.a(8.0d);
            }
            setBackgroundResource(2130837876);
            this.mSpace.setVisibility(0);
            this.mLayoutLikes.setVisibility(0);
            this.mLayoutAddComment.setVisibility(0);
            this.mShowAllComments.setVisibility(0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mRecComments.getLayoutParams();
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = i2;
            layoutParams.leftMargin = i2;
            this.mRecComments.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mLayoutAddComment.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.rightMargin = i2;
            layoutParams2.leftMargin = i2;
            this.mLayoutAddComment.setLayoutParams(layoutParams2);
            a(this.mShowAllComments, i2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mLayoutLikes.getLayoutParams();
            layoutParams3.topMargin = i2;
            layoutParams3.rightMargin = i2;
            layoutParams3.leftMargin = i2;
            this.mLayoutLikes.setLayoutParams(layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.mImgAvatar.getLayoutParams();
            layoutParams4.width = u.a(16.0d);
            layoutParams4.height = u.a(16.0d);
            this.mImgAvatar.setLayoutParams(layoutParams4);
            this.mImgAvatar.a(false, false);
            this.mImgAvatar.setImageURI(new Uri.Builder().scheme("res").path("2130838756").build());
            return;
        }
        this.mSpace.setVisibility(8);
        this.mLayoutLikes.setVisibility(8);
        this.mLayoutAddComment.setVisibility(8);
        this.mShowAllComments.setVisibility(8);
    }

    public FollowFeedCommentLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(View view, int i) {
        View view2 = view;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f57210a, false, 61471, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f57210a, false, 61471, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        view2.setLayoutParams(layoutParams);
    }

    public FollowFeedCommentLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(Aweme aweme, List<Comment> list, List<User> list2, a aVar) {
        final Aweme aweme2 = aweme;
        List<Comment> list3 = list;
        List<User> list4 = list2;
        final a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aweme2, list3, list4, aVar2}, this, f57210a, false, 61466, new Class[]{Aweme.class, List.class, List.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list3, list4, aVar2}, this, f57210a, false, 61466, new Class[]{Aweme.class, List.class, List.class, a.class}, Void.TYPE);
            return;
        }
        this.f57213d = list3;
        this.f57214e = aweme2;
        this.f57215f = list4;
        if (!b() && this.f57213d != null && this.f57213d.size() > 2) {
            this.f57213d.clear();
            this.f57213d.add(this.f57213d.get(0));
            this.f57213d.add(this.f57213d.get(1));
        }
        if (b()) {
            c();
            this.mShowAllComments.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57216a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57216a, false, 61475, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57216a, false, 61475, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar2 != null) {
                        aVar2.a(FollowFeedCommentLayout.this.mShowAllComments, aweme2, false, "click_more_comment");
                    }
                }
            });
            this.mLayoutLikes.setDiggCountCallback(new CommentLikeListView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57220a;

                public final void a(int i) {
                    int i2 = 0;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57220a, false, 61476, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57220a, false, 61476, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    View view = FollowFeedCommentLayout.this.mSpace;
                    if (FollowFeedCommentLayout.this.g == 3 || i <= 0) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
            });
            d();
            this.mLayoutLikes.setEventType(this.f57212c);
            this.mLayoutLikes.setAuthorId(this.f57214e.getAuthorUid());
            this.mLayoutLikes.setAwemeId(this.f57214e.getAid());
        } else if (d.a().getCurUser().getAvatarThumb() != null) {
            c.a((RemoteImageView) this.mImgAvatar, d.a().getCurUser().getAvatarThumb(), this.mAvatarSize, this.mAvatarSize);
        } else {
            c.a((RemoteImageView) this.mImgAvatar, "", this.mAvatarSize, this.mAvatarSize);
        }
        if (CollectionUtils.isEmpty(list)) {
            this.mRecComments.setVisibility(8);
        } else {
            this.mRecComments.setVisibility(0);
        }
        this.mRecComments.setLayoutManager(new WrapLinearLayoutManager(getContext()) {
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.h = new FollowFeedCommentAdapter(aweme2, aVar2, b());
        this.h.setShowFooter(false);
        this.h.f57071c = this.f57212c;
        this.h.f57070b = this.f57211b;
        this.h.setData(this.f57213d);
        this.mRecComments.setAdapter(this.h);
        this.mRecComments.setFocusable(false);
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f57210a, true, 61474, new Class[]{Aweme.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f57210a, true, 61474, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null || aweme.isCmtSwt()) {
            z = false;
        }
        if (z) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }
}
