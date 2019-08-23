package com.ss.android.ugc.aweme.comment.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class CommentViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36313a;

    /* renamed from: b  reason: collision with root package name */
    public Comment f36314b;

    /* renamed from: c  reason: collision with root package name */
    protected String f36315c;

    /* renamed from: d  reason: collision with root package name */
    protected String f36316d;

    /* renamed from: e  reason: collision with root package name */
    public String f36317e;

    /* renamed from: f  reason: collision with root package name */
    public String f36318f;
    public int g;
    public com.ss.android.ugc.aweme.comment.widget.a h;
    public boolean i = true;
    public a j;
    private d k = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36319a;

        public final void a(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36319a, false, 27258, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36319a, false, 27258, new Class[]{View.class}, Void.TYPE);
            } else if (CommentViewHolder.this.f36314b != null && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
                User user = CommentViewHolder.this.f36314b.getUser();
                if (!TextUtils.isEmpty(user.getUid()) && CommentViewHolder.this.j != null) {
                    CommentViewHolder.this.j.a(user.getUid(), user.getSecUid());
                }
            }
        }
    };
    @BindView(2131493169)
    CircleImageView mAvatarView;
    @Nullable
    @BindView(2131493737)
    View mBgView;
    @BindView(2131493751)
    protected MentionTextView mContentView;
    @Nullable
    @BindView(2131494185)
    ImageView mMenuItem;
    @BindView(2131496704)
    public View mReplyContainer;
    @BindView(2131496705)
    protected MentionTextView mReplyContentView;
    @BindView(2131496706)
    protected View mReplyDivider;
    @BindView(2131496707)
    DmtTextView mReplyTitleView;
    @BindView(2131495290)
    View mRootView;
    @BindView(2131497590)
    DmtTextView mTitleView;
    @Nullable
    @BindView(2131497706)
    CommentTranslationStatusView mTranslationView;
    @BindDimen(2131230886)
    int size;

    public interface a {
        void a(Comment comment, int i);

        void a(CommentReplyButtonStruct commentReplyButtonStruct, int i);

        void a(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment);

        void a(String str, String str2);

        void b();

        void b(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment);

        void b(String str, String str2);

        void c(Comment comment);
    }

    class b implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36328a;

        b() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36328a, false, 27262, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36328a, false, 27262, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (!(CommentViewHolder.this.j == null || CommentViewHolder.this.f36314b == null)) {
                CommentViewHolder.this.j.a(CommentViewHolder.this.h, CommentViewHolder.this.f36314b);
            }
        }

        public final boolean onLongClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36328a, false, 27263, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f36328a, false, 27263, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            if (!(CommentViewHolder.this.j == null || CommentViewHolder.this.f36314b == null)) {
                CommentViewHolder.this.j.b(CommentViewHolder.this.h, CommentViewHolder.this.f36314b);
            }
            return true;
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36313a, false, 27252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36313a, false, 27252, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f36313a, false, 27255, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36313a, false, 27255, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity) || (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity)) {
            return true;
        } else {
            return false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36313a, false, 27253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36313a, false, 27253, new Class[0], Void.TYPE);
            return;
        }
        if (!(com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof ForwardDetailActivity)) {
            com.ss.android.ugc.aweme.framework.core.a.b().a();
        }
        String displayText = this.f36314b.getDisplayText(!f.f36433c.a(this.f36314b));
        if (!TextUtils.isEmpty(displayText)) {
            this.mContentView.setText(displayText);
            g.a((TextView) this.mContentView);
        }
        if (this.f36314b.hasTextExtra()) {
            this.mContentView.setSpanColor(this.mContentView.getResources().getColor(C0906R.color.zm));
            this.mContentView.setOnSpanClickListener(new h(this));
            MentionTextView mentionTextView = this.mContentView;
            List<TextExtraStruct> displayTextExtra = this.f36314b.getDisplayTextExtra();
            AbTestManager.a();
            mentionTextView.a(displayTextExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            this.mContentView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public void a(String str) {
        this.f36316d = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        if (p.a().e() != null) {
            h a2 = h.a();
            Activity e2 = p.a().e();
            a2.a(e2, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a());
        }
        r.a(this.mContentView.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        r.a("enter_personal_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f36316d).a("to_user_id", textExtraStruct.getUserId()).a("group_id", this.f36317e).a("author_id", this.f36318f).a("enter_method", "comment_at").f34114b);
        z.a(z.c.PROFILE);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public CommentViewHolder(View view, a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.j = aVar;
        if (com.ss.android.g.a.b()) {
            this.mAvatarView.a(true, false);
        }
        if (((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderWidth((float) u.a(0.5d));
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderColor(this.mAvatarView.getResources().getColor(C0906R.color.hm));
        }
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36321a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f36321a, false, 27259, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f36321a, false, 27259, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (CommentViewHolder.this.j != null && CommentViewHolder.this.f36314b != null && CommentViewHolder.this.f36314b.getUser() != null) {
                    CommentViewHolder.this.j.a(CommentViewHolder.this.h, CommentViewHolder.this.f36314b);
                }
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f36313a, false, 27250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36313a, false, 27250, new Class[0], Void.TYPE);
        } else {
            this.h = new com.ss.android.ugc.aweme.comment.widget.a(this.mContentView.getContext());
        }
        com.ss.android.ugc.aweme.comment.g.d.a(this.mContentView);
        com.ss.android.ugc.aweme.comment.g.d.a(this.mReplyContentView);
        this.mAvatarView.setOnTouchListener(this.k);
        this.mTitleView.setOnTouchListener(this.k);
        if (Build.VERSION.SDK_INT >= 23) {
            this.mContentView.setBreakStrategy(0);
            this.mReplyContentView.setBreakStrategy(0);
        }
        if (com.ss.android.g.a.a()) {
            float dip2Px = UIUtils.dip2Px(GlobalContext.getContext(), 3.0f);
            this.mContentView.setLineSpacing(dip2Px, 1.0f);
            this.mReplyContentView.setLineSpacing(dip2Px, 1.0f);
        }
    }

    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
    public void a(Comment comment, Rect rect) {
        if (PatchProxy.isSupport(new Object[]{comment, rect}, this, f36313a, false, 27251, new Class[]{Comment.class, Rect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, rect}, this, f36313a, false, 27251, new Class[]{Comment.class, Rect.class}, Void.TYPE);
        } else if (comment != null) {
            CommentAdapter.a(rect, this.mRootView);
            this.f36314b = comment;
            User user = this.f36314b.getUser();
            this.h.a(this.mContentView.getContext(), comment, new com.ss.android.ugc.aweme.comment.ui.f(this.mContentView.getContext(), this.mContentView), new com.ss.android.ugc.aweme.comment.ui.f(this.mContentView.getContext(), this.mReplyContentView), this.mTranslationView);
            if (user != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    c.a((RemoteImageView) this.mAvatarView, 2130839027);
                } else {
                    this.mAvatarView.a(avatarThumb, this.size, this.size, null);
                }
                this.mTitleView.setText(ae.c(user));
                if (Comment.isSupportReplyComment()) {
                    a();
                }
            }
            if (!this.i || CollectionUtils.isEmpty(this.f36314b.getReplyComments())) {
                this.mReplyContainer.setVisibility(8);
            } else {
                final Comment comment2 = this.f36314b.getReplyComments().get(0);
                String c2 = ae.c(comment2.getUser());
                if (comment2 == null || comment2.getUser() == null || c2 == null) {
                    this.mReplyContainer.setVisibility(8);
                } else {
                    this.mReplyContainer.setVisibility(0);
                    this.mReplyTitleView.setText(c2);
                    this.mReplyTitleView.setTag(comment2.getUser().getUid());
                    this.mReplyTitleView.setOnTouchListener(new d() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f36323a;

                        public final void a(@NotNull View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f36323a, false, 27260, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f36323a, false, 27260, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            if (!TextUtils.isEmpty(comment2.getUser().getUid()) && CommentViewHolder.this.j != null) {
                                CommentViewHolder.this.j.a(comment2.getUser().getUid(), comment2.getUser().getSecUid());
                            }
                        }
                    });
                    if (Comment.isSupportReplyComment()) {
                        b();
                    }
                    this.mReplyContentView.setText(comment2.getDisplayText());
                    g.a((TextView) this.mReplyContentView);
                    if (comment2.hasTextExtra()) {
                        this.mReplyContentView.setSpanColor(this.mReplyContentView.getResources().getColor(C0906R.color.zm));
                        this.mReplyContentView.setOnSpanClickListener(new MentionTextView.e() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f36326a;

                            public final void a(View view, TextExtraStruct textExtraStruct) {
                                if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f36326a, false, 27261, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f36326a, false, 27261, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
                                    return;
                                }
                                if (p.a().e() != null) {
                                    r.a("enter_personal_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", CommentViewHolder.this.f36316d).a("to_user_id", textExtraStruct.getUserId()).a("group_id", CommentViewHolder.this.f36317e).a("author_id", CommentViewHolder.this.f36318f).a("enter_method", "comment_at").f34114b);
                                    z.a(z.c.PROFILE);
                                    h a2 = h.a();
                                    Activity e2 = p.a().e();
                                    a2.a(e2, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a());
                                }
                            }
                        });
                        MentionTextView mentionTextView = this.mReplyContentView;
                        List<TextExtraStruct> displayTextExtra = comment2.getDisplayTextExtra();
                        AbTestManager.a();
                        mentionTextView.a(displayTextExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
                        this.mReplyContentView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
            }
            if (this.mContentView != null) {
                c();
            }
        }
    }
}
