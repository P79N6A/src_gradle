package com.ss.android.ugc.aweme.comment.adapter;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.d;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.an;
import com.ss.android.ugc.aweme.utils.eo;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;
import org.jetbrains.annotations.NotNull;

public class CommentViewHolderNewStyle extends CommentViewHolder {
    public static ChangeQuickRedirect k;
    private String l;
    private d m = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36330a;

        public final void a(@NotNull View view) {
            Comment comment;
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f36330a, false, 27274, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36330a, false, 27274, new Class[]{View.class}, Void.TYPE);
            } else if (CommentViewHolderNewStyle.this.f36314b != null && CommentViewHolderNewStyle.this.j != null) {
                String str2 = "";
                String str3 = "";
                if (view.getId() == C0906R.id.dhb) {
                    if (CommentViewHolderNewStyle.this.f36314b.getRelationLabel() != null) {
                        str2 = CommentViewHolderNewStyle.this.f36314b.getRelationLabel().getUserId();
                    } else {
                        str2 = "";
                    }
                    str3 = CommentViewHolderNewStyle.this.f36314b.getUser().getSecUid();
                } else {
                    if (!CollectionUtils.isEmpty(CommentViewHolderNewStyle.this.f36314b.getReplyComments())) {
                        comment = CommentViewHolderNewStyle.this.f36314b.getReplyComments().get(0);
                    } else {
                        comment = null;
                    }
                    if (comment != null) {
                        if (comment.getRelationLabel() != null) {
                            str = comment.getRelationLabel().getUserId();
                        } else {
                            str = "";
                        }
                        str3 = comment.getUser().getSecUid();
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    CommentViewHolderNewStyle.this.j.b(str2, str3);
                }
            }
        }
    };
    @BindView(2131493647)
    DmtTextView mCommentSplitView;
    @BindView(2131493649)
    TextView mCommentStyleView;
    @BindView(2131493650)
    protected TextView mCommentTimeView;
    @BindView(2131497894)
    TextView mDiggCountView;
    @BindView(2131495247)
    View mDiggLayout;
    @BindView(2131495010)
    ImageView mDiggView;
    @Nullable
    @BindView(2131496401)
    DmtTextView mPostStatus;
    @BindView(2131496702)
    DmtTextView mReplyCommentSplitView;
    @BindView(2131496703)
    TextView mReplyCommentStyleView;
    @Nullable
    @BindView(2131495356)
    DmtTextView mTvLikedByCreator;
    @BindView(2131498087)
    protected RelationLabelTextView mTvRelationLabel;
    @BindView(2131498090)
    protected RelationLabelTextView mTvReplyCommentRelationLabel;

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 27268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 27268, new Class[0], Void.TYPE);
        } else if (this.f36314b != null) {
            a(this.f36314b.isUserDigged(), this.f36314b.getDiggCount(), false, this.f36314b.isAuthorDigged());
        }
    }

    public boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, k, false, 27270, new Class[0], Boolean.TYPE)) {
            return b.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, k, false, 27270, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 27271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 27271, new Class[0], Void.TYPE);
            return;
        }
        this.mCommentSplitView.setTypeface(this.mTitleView.getTypeface());
        this.mCommentSplitView.getPaint().setFakeBoldText(this.mTitleView.getPaint().isFakeBoldText());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 27272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 27272, new Class[0], Void.TYPE);
            return;
        }
        this.mReplyCommentSplitView.setTypeface(this.mReplyTitleView.getTypeface());
        this.mReplyCommentSplitView.getPaint().setFakeBoldText(this.mReplyTitleView.getPaint().isFakeBoldText());
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 27266, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 27266, new Class[0], Void.TYPE);
        } else if (this.f36314b != null) {
            int i = 4;
            if (f.f36433c.a(this.f36314b)) {
                this.mCommentTimeView.setVisibility(8);
                this.mDiggCountView.setVisibility(4);
                this.mDiggLayout.setVisibility(4);
                this.mDiggView.setVisibility(4);
            } else {
                if (!Comment.isSupportReplyComment()) {
                    this.mCommentTimeView.setVisibility(0);
                    this.mCommentTimeView.setText(eo.b(this.itemView.getContext(), ((long) this.f36314b.getCreateTime()) * 1000));
                } else {
                    this.mCommentTimeView.setVisibility(8);
                }
                TextView textView = this.mDiggCountView;
                if (this.f36314b.getDiggCount() != 0) {
                    i = 0;
                }
                textView.setVisibility(i);
                this.mDiggLayout.setVisibility(0);
                this.mDiggView.setVisibility(0);
            }
            f.f36433c.a(this.f36314b, this.mPostStatus);
            d();
        }
    }

    public final void a(String str) {
        this.l = str;
    }

    public void a(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, k, false, 27264, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, k, false, 27264, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        a(comment2, null);
    }

    @OnClick({2131495247})
    public void onClick(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 27267, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 27267, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.b8e) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a(a.b().a(), this.l, "like_comment", ad.a().a("login_title", view.getContext().getString(C0906R.string.b5f)).a("group_id", this.f36317e).a("log_pb", aa.g(this.f36317e)).f75487b);
            } else if (!(this.f36314b == null || this.j == null)) {
                if (com.ss.android.ugc.aweme.comment.c.a.a(this.f36314b)) {
                    boolean z = !this.f36314b.isUserDigged();
                    boolean isAuthorDigged = this.f36314b.isAuthorDigged();
                    if (TextUtils.equals(this.f36318f, c.a().e()) && this.f36314b.getLabelType() != 1) {
                        if (z) {
                            com.ss.android.ugc.aweme.comment.f.a.b(this.l, this.f36317e, this.f36318f, this.f36314b.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f36314b.getDiggCount();
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    a(z, diggCount + i, true, isAuthorDigged);
                }
                this.j.a(this.f36314b, getAdapterPosition());
            }
        }
    }

    public final void a(Comment comment, Rect rect) {
        int i;
        if (PatchProxy.isSupport(new Object[]{comment, rect}, this, k, false, 27265, new Class[]{Comment.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, rect}, this, k, false, 27265, new Class[]{Comment.class, Rect.class}, Void.TYPE);
            return;
        }
        super.a(comment, rect);
        if (this.f36314b != null && comment != null) {
            this.mDiggLayout.setVisibility(0);
            this.mCommentStyleView.setVisibility(0);
            int diggCount = comment.getDiggCount();
            this.mDiggCountView.setText(b.a((long) diggCount));
            a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            TextView textView = this.mDiggCountView;
            if (diggCount == 0) {
                i = 4;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            if (this.mTvLikedByCreator != null && (this.mRootView instanceof ConstraintLayout)) {
                an.a a2 = new an((ConstraintLayout) this.mRootView).a();
                if (a2 != null) {
                    if (!Comment.isSupportReplyComment() || !this.i || this.mReplyContainer.getVisibility() != 0) {
                        a2.a(C0906R.id.bbi, C0906R.id.d6m);
                        a2.a(C0906R.id.cdh, C0906R.id.yp);
                    } else {
                        a2.a(C0906R.id.bbi, C0906R.id.yp);
                        a2.a(C0906R.id.cdh, C0906R.id.bbi);
                    }
                    a2.a();
                } else {
                    return;
                }
            }
            a.a(comment, this.mCommentSplitView);
            a.a(comment, this.mCommentStyleView, e());
            this.mTvRelationLabel.a(comment.getRelationLabel());
            this.mTvRelationLabel.setBackgroundResource(2130838344);
            this.mTvRelationLabel.setTextColor(this.mTvRelationLabel.getResources().getColor(C0906R.color.a08));
            if (this.mReplyContainer.getVisibility() == 0) {
                Comment comment2 = comment.getReplyComments().get(0);
                a.a(comment2, this.mReplyCommentSplitView);
                a.a(comment2, this.mReplyCommentStyleView, e());
                this.mTvReplyCommentRelationLabel.a(comment2.getRelationLabel());
                this.mTvReplyCommentRelationLabel.setBackgroundResource(2130838344);
                this.mTvReplyCommentRelationLabel.setTextColor(this.mTvReplyCommentRelationLabel.getResources().getColor(C0906R.color.a08));
            }
            b.a(this.mTitleView.getContext(), this, comment);
        }
    }

    public CommentViewHolderNewStyle(View view, CommentViewHolder.a aVar, String str) {
        super(view, aVar);
        this.f36315c = str;
        this.mMenuItem.setVisibility(8);
        view.setOnLongClickListener(new CommentViewHolder.b());
        this.mTvRelationLabel.setOnTouchListener(this.m);
        this.mTvReplyCommentRelationLabel.setOnTouchListener(this.m);
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new c.a());
            this.mPostStatus.setOnClickListener(new j(this));
        }
    }

    private void a(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        Resources resources;
        TextView textView;
        int i3 = i;
        int i4 = 4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, k, false, 27269, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Byte.valueOf(z2), Byte.valueOf(z3)}, this, k, false, 27269, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36332a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f36332a, false, 27275, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36332a, false, 27275, new Class[0], Void.TYPE);
                        return;
                    }
                    CommentViewHolderNewStyle.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.mDiggCountView.setText(b.a((long) i3));
        TextView textView2 = this.mDiggCountView;
        if (i3 != 0) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        if (z) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838854));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            i2 = C0906R.color.a1z;
        } else {
            this.mDiggView.setSelected(false);
            if (g()) {
                this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838856));
            } else {
                this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838855));
            }
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (g()) {
                i2 = C0906R.color.a1b;
            } else {
                i2 = C0906R.color.i3;
            }
        }
        textView.setTextColor(resources.getColor(i2));
        if (AbTestManager.a().bZ() && this.mTvLikedByCreator != null) {
            DmtTextView dmtTextView = this.mTvLikedByCreator;
            if (!z3) {
                i5 = 8;
            }
            dmtTextView.setVisibility(i5);
            if (e()) {
                this.mTvLikedByCreator.setBackgroundResource(2130837875);
                this.mTvLikedByCreator.setTextColor(ContextCompat.getColor(this.mTvLikedByCreator.getContext(), C0906R.color.ow));
            }
        }
    }
}
