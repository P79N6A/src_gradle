package com.ss.android.ugc.aweme.comment.adapter;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.e.b;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.d;
import com.ss.android.ugc.aweme.comment.widget.a;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.aweme.views.RelationLabelTextView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class CommentReplyViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36295a;

    /* renamed from: b  reason: collision with root package name */
    public CommentViewHolder.a f36296b;

    /* renamed from: c  reason: collision with root package name */
    public Comment f36297c;

    /* renamed from: d  reason: collision with root package name */
    a f36298d;

    /* renamed from: e  reason: collision with root package name */
    public String f36299e;

    /* renamed from: f  reason: collision with root package name */
    public String f36300f;
    public String g;
    private d h = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36301a;

        public final void a(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36301a, false, 27245, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36301a, false, 27245, new Class[]{View.class}, Void.TYPE);
            } else if (CommentReplyViewHolder.this.f36297c != null && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
                User user = CommentReplyViewHolder.this.f36297c.getUser();
                if (!TextUtils.isEmpty(user.getUid()) && CommentReplyViewHolder.this.f36296b != null) {
                    CommentReplyViewHolder.this.f36296b.a(user.getUid(), user.getSecUid());
                }
            }
        }
    };
    private d i = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36303a;

        public final void a(@NotNull View view) {
            Comment comment;
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f36303a, false, 27246, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36303a, false, 27246, new Class[]{View.class}, Void.TYPE);
            } else if (CommentReplyViewHolder.this.f36297c != null && CommentReplyViewHolder.this.f36296b != null) {
                String str2 = "";
                String str3 = "";
                if (view.getId() == C0906R.id.dhb) {
                    if (CommentReplyViewHolder.this.f36297c.getRelationLabel() != null) {
                        str2 = CommentReplyViewHolder.this.f36297c.getRelationLabel().getUserId();
                    } else {
                        str2 = "";
                    }
                    str3 = CommentReplyViewHolder.this.f36297c.getUser().getSecUid();
                } else {
                    if (!CollectionUtils.isEmpty(CommentReplyViewHolder.this.f36297c.getReplyComments())) {
                        comment = CommentReplyViewHolder.this.f36297c.getReplyComments().get(0);
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
                    CommentReplyViewHolder.this.f36296b.b(str2, str3);
                }
            }
        }
    };
    @BindView(2131493169)
    CircleImageView mAvatarView;
    @Nullable
    @BindView(2131493737)
    View mBgView;
    @BindView(2131493647)
    DmtTextView mCommentSplitView;
    @BindView(2131493649)
    TextView mCommentStyleView;
    @BindView(2131493751)
    MentionTextView mContentView;
    @BindView(2131497894)
    TextView mDiggCountView;
    @BindView(2131495247)
    View mDiggLayout;
    @BindView(2131495010)
    ImageView mDiggView;
    @Nullable
    @BindView(2131496401)
    DmtTextView mPostStatus;
    @BindView(2131495290)
    View mRootView;
    @BindView(2131497590)
    DmtTextView mTitleView;
    @Nullable
    @BindView(2131497706)
    CommentTranslationStatusView mTranslationView;
    @BindView(2131495356)
    DmtTextView mTvLikedByCreator;
    @BindView(2131498087)
    RelationLabelTextView mTvRelationLabel;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36295a, false, 27236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36295a, false, 27236, new Class[0], Void.TYPE);
        } else if (this.f36297c != null) {
            a(this.f36297c.isUserDigged(), this.f36297c.getDiggCount(), false, this.f36297c.isAuthorDigged());
        }
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f36295a, false, 27238, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36295a, false, 27238, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity) || (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36295a, false, 27234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36295a, false, 27234, new Class[0], Void.TYPE);
        } else if (this.f36297c != null) {
            int i2 = 4;
            if (f.f36433c.a(this.f36297c)) {
                this.mDiggCountView.setVisibility(4);
                this.mDiggLayout.setVisibility(4);
                this.mDiggView.setVisibility(4);
            } else {
                TextView textView = this.mDiggCountView;
                if (this.f36297c.getDiggCount() != 0) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                this.mDiggLayout.setVisibility(0);
                this.mDiggView.setVisibility(0);
            }
            f.f36433c.a(this.f36297c, this.mPostStatus);
            c();
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36295a, false, 27233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36295a, false, 27233, new Class[0], Void.TYPE);
            return;
        }
        String displayText = this.f36297c.getDisplayText(!f.f36433c.a(this.f36297c));
        if (!TextUtils.isEmpty(displayText)) {
            this.mContentView.setText(displayText);
            g.a((TextView) this.mContentView);
        }
        if (this.f36297c.hasTextExtra()) {
            this.mContentView.setSpanColor(this.mContentView.getResources().getColor(C0906R.color.zm));
            this.mContentView.setOnSpanClickListener(new f(this));
            MentionTextView mentionTextView = this.mContentView;
            List<TextExtraStruct> displayTextExtra = this.f36297c.getDisplayTextExtra();
            AbTestManager.a();
            mentionTextView.a(displayTextExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36295a, false, 27232, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36295a, false, 27232, new Class[]{Comment.class}, Void.TYPE);
        } else if (comment != null) {
            if ((com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity) || (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity)) {
                this.mRootView.setBackgroundResource(2130837886);
            } else {
                this.mRootView.setBackgroundResource(2130837885);
            }
            this.f36297c = comment;
            User user = this.f36297c.getUser();
            this.f36298d.a(this.mContentView.getContext(), comment, new com.ss.android.ugc.aweme.comment.ui.f(this.mContentView.getContext(), this.mContentView), new com.ss.android.ugc.aweme.comment.ui.f(this.mContentView.getContext(), null), this.mTranslationView);
            int a2 = u.a(24.0d);
            if (user != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    c.a((RemoteImageView) this.mAvatarView, 2130839027);
                } else {
                    this.mAvatarView.a(avatarThumb, a2, a2, null);
                }
                this.mTitleView.setText(ae.c(user));
            }
            a();
            this.mDiggCountView.setText(b.a((long) comment.getDiggCount()));
            a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
            a.a(comment, this.mCommentSplitView);
            a.a(comment, this.mCommentStyleView, d());
            this.mTvRelationLabel.a(comment.getRelationLabel());
        }
    }

    @OnClick({2131495247})
    public void onClick(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f36295a, false, 27235, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36295a, false, 27235, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.b8e) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), this.f36299e, "like_comment", ad.a().a("group_id", this.f36300f).a("log_pb", aa.g(this.f36300f)).f75487b);
            } else if (!(this.f36297c == null || this.f36296b == null)) {
                if (com.ss.android.ugc.aweme.comment.c.a.a(this.f36297c)) {
                    boolean z = !this.f36297c.isUserDigged();
                    boolean isAuthorDigged = this.f36297c.isAuthorDigged();
                    if (TextUtils.equals(this.g, com.ss.android.ugc.aweme.user.c.a().e()) && this.f36297c.getLabelType() != 1) {
                        if (z) {
                            com.ss.android.ugc.aweme.comment.f.a.b(this.f36299e, this.f36300f, this.g, this.f36297c.getCid());
                        }
                        isAuthorDigged = z;
                    }
                    int diggCount = this.f36297c.getDiggCount();
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    a(z, diggCount + i2, true, isAuthorDigged);
                }
                this.f36296b.a(this.f36297c, getAdapterPosition());
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public CommentReplyViewHolder(View view, CommentViewHolder.a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f36296b = aVar;
        if (com.ss.android.g.a.b()) {
            this.mAvatarView.a(true, false);
        }
        if (((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderWidth((float) u.a(0.5d));
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderColor(this.mAvatarView.getResources().getColor(C0906R.color.hm));
        }
        view.setOnClickListener(new c(this));
        view.setOnLongClickListener(new d(this));
        if (d()) {
            this.mTitleView.setTextColor(view.getResources().getColor(C0906R.color.zx));
            this.mCommentSplitView.setTextColor(view.getResources().getColor(C0906R.color.zx));
            this.mContentView.setTextColor(view.getResources().getColor(C0906R.color.zt));
            this.mTvRelationLabel.setTextColor(view.getResources().getColor(C0906R.color.a0b));
            this.mTvRelationLabel.setBackgroundResource(2130838158);
        }
        if (this.mPostStatus != null) {
            this.mPostStatus.setOnTouchListener(new b.a());
            this.mPostStatus.setOnClickListener(new e(this));
        }
        this.mAvatarView.setOnTouchListener(this.h);
        this.mTitleView.setOnTouchListener(this.h);
        this.mTvRelationLabel.setOnTouchListener(this.i);
        if (PatchProxy.isSupport(new Object[0], this, f36295a, false, 27231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36295a, false, 27231, new Class[0], Void.TYPE);
        } else {
            this.f36298d = new a(this.mContentView.getContext());
        }
        com.ss.android.ugc.aweme.comment.g.d.a(this.mContentView);
        if (Build.VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
        }
        if (com.ss.android.g.a.a()) {
            this.mContentView.setLineSpacing(UIUtils.dip2Px(GlobalContext.getContext(), 3.0f), 1.0f);
        }
    }

    private void a(boolean z, int i2, boolean z2, boolean z3) {
        int i3;
        Resources resources;
        TextView textView;
        int i4 = i2;
        int i5 = 4;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f36295a, false, 27237, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f36295a, false, 27237, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            this.mDiggView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36305a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f36305a, false, 27247, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36305a, false, 27247, new Class[0], Void.TYPE);
                        return;
                    }
                    CommentReplyViewHolder.this.mDiggView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.mDiggCountView.setText(com.ss.android.ugc.aweme.i18n.b.a((long) i4));
        TextView textView2 = this.mDiggCountView;
        if (i4 != 0) {
            i5 = 0;
        }
        textView2.setVisibility(i5);
        if (z) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838854));
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            i3 = C0906R.color.hs;
        } else {
            this.mDiggView.setSelected(false);
            if (d()) {
                this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838856));
            } else {
                this.mDiggView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(this.mDiggView.getResources(), 2130838855));
            }
            textView = this.mDiggCountView;
            resources = this.mDiggCountView.getResources();
            if (d()) {
                i3 = C0906R.color.zx;
            } else {
                i3 = C0906R.color.i3;
            }
        }
        textView.setTextColor(resources.getColor(i3));
        if (AbTestManager.a().bZ() && this.mTvLikedByCreator != null) {
            DmtTextView dmtTextView = this.mTvLikedByCreator;
            if (!z3) {
                i6 = 8;
            }
            dmtTextView.setVisibility(i6);
            if (d()) {
                this.mTvLikedByCreator.setBackgroundResource(2130837875);
                this.mTvLikedByCreator.setTextColor(ContextCompat.getColor(this.mTvLikedByCreator.getContext(), C0906R.color.ow));
            }
        }
    }
}
