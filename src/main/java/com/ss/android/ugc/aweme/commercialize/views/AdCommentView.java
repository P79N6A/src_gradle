package com.ss.android.ugc.aweme.commercialize.views;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.g.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.c.b;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.im.f;
import com.ss.android.ugc.aweme.commercialize.model.c;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.utils.u;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.bytex.a.a.a;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;

public class AdCommentView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39843a;

    /* renamed from: b  reason: collision with root package name */
    b f39844b;

    /* renamed from: c  reason: collision with root package name */
    private c f39845c;
    @BindView(2131493759)
    LinearLayout contentll;

    /* renamed from: d  reason: collision with root package name */
    private Aweme f39846d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<CommentViewHolder.a> f39847e;

    /* renamed from: f  reason: collision with root package name */
    private e f39848f;
    @BindView(2131493169)
    CircleImageView mAvatarView;
    @BindView(2131493649)
    TextView mCommentStyleView;
    @BindView(2131493650)
    TextView mCommentTimeView;
    @BindView(2131493751)
    MentionTextView mContentView;
    @BindView(2131495247)
    RelativeLayout mDiggLayout;
    @BindView(2131495010)
    ImageView mDiggView;
    @Nullable
    @BindView(2131494185)
    ImageView mMenuItem;
    @BindView(2131496703)
    TextView mReplyCommentStyleView;
    @BindView(2131496704)
    View mReplyContainer;
    @BindView(2131496705)
    MentionTextView mReplyContentView;
    @BindView(2131496706)
    View mReplyDivider;
    @BindView(2131496707)
    TextView mReplyTitleView;
    @BindView(2131497590)
    DmtTextView mTitleView;
    @BindDimen(2131230886)
    int size;

    public c getData() {
        return this.f39845c;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32739, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39847e.get() != null) {
            ((CommentViewHolder.a) this.f39847e.get()).b();
        }
    }

    private String getDiggSpKey() {
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32740, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32740, new Class[0], String.class);
        }
        return "COMMENT_DIGG" + this.f39845c.getAwemeId();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32736, new Class[0], Void.TYPE);
            return;
        }
        boolean a2 = com.ss.android.ugc.aweme.comment.adapter.b.a();
        if (this.f39845c.getUserDigged() == 1) {
            this.mDiggView.setSelected(true);
            this.mDiggView.setImageDrawable(a.a(this.mDiggView.getResources(), 2130838854));
            return;
        }
        this.mDiggView.setSelected(false);
        if (a2) {
            this.mDiggView.setImageDrawable(a.a(this.mDiggView.getResources(), 2130838856));
        } else {
            this.mDiggView.setImageDrawable(a.a(this.mDiggView.getResources(), 2130838855));
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32738, new Class[0], Void.TYPE);
        } else if (this.f39845c != null && this.f39846d != null && this.f39846d.isAd()) {
            if (!this.f39848f.a()) {
                this.f39848f.a(getContext(), this.f39846d);
            }
            if (g.a(getContext(), this.f39846d, this.f39848f, 4, this.f39844b)) {
                c();
            }
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32732, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.f39846d != null && this.f39846d.isAd()) {
            Context context = getContext();
            AwemeRawAd awemeRawAd = this.f39846d.getAwemeRawAd();
            if (PatchProxy.isSupport(new Object[]{context, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31614, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31614, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.g.a(context, "comment_first_show", awemeRawAd, com.ss.android.ugc.aweme.commercialize.log.g.e(context, awemeRawAd, "raw feed comment first show"));
        }
    }

    public AdCommentView(Context context) {
        this(context, null);
    }

    public void setOnInternalEventListener(CommentViewHolder.a aVar) {
        CommentViewHolder.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f39843a, false, 32733, new Class[]{CommentViewHolder.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f39843a, false, 32733, new Class[]{CommentViewHolder.a.class}, Void.TYPE);
            return;
        }
        this.f39847e = new WeakReference<>(aVar2);
    }

    @OnClick({2131495247, 2131493169, 2131497590, 2131493640, 2131493759, 2131493751})
    public void onClick(View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f39843a, false, 32737, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39843a, false, 32737, new Class[]{View.class}, Void.TYPE);
        } else if (this.f39845c != null && this.f39846d != null && this.f39846d.isAd()) {
            AwemeRawAd awemeRawAd = this.f39846d.getAwemeRawAd();
            String openUrl = awemeRawAd.getOpenUrl();
            int id = view.getId();
            if (id == C0906R.id.b8e) {
                c cVar = this.f39845c;
                if (this.f39845c.getUserDigged() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                cVar.setUserDigged(i);
                a();
                u a2 = u.a();
                String diggSpKey = getDiggSpKey();
                int userDigged = this.f39845c.getUserDigged();
                if (PatchProxy.isSupport(new Object[]{diggSpKey, Integer.valueOf(userDigged)}, a2, u.f39829a, false, 32459, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                    u uVar = a2;
                    PatchProxy.accessDispatch(new Object[]{diggSpKey, Integer.valueOf(userDigged)}, uVar, u.f39829a, false, 32459, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                } else {
                    if (a2.a(diggSpKey)) {
                        if (PatchProxy.isSupport(new Object[]{diggSpKey, Integer.valueOf(userDigged)}, a2, u.f39829a, false, 32465, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                            u uVar2 = a2;
                            PatchProxy.accessDispatch(new Object[]{diggSpKey, Integer.valueOf(userDigged)}, uVar2, u.f39829a, false, 32465, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                        } else {
                            Uri parse = Uri.parse(a2.c() + diggSpKey);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(diggSpKey, String.valueOf(userDigged));
                            if (PatchProxy.isSupport(new Object[]{parse, contentValues}, a2, u.f39829a, false, 32471, new Class[]{Uri.class, ContentValues.class}, Void.TYPE)) {
                                u uVar3 = a2;
                                PatchProxy.accessDispatch(new Object[]{parse, contentValues}, uVar3, u.f39829a, false, 32471, new Class[]{Uri.class, ContentValues.class}, Void.TYPE);
                            } else {
                                u.f39830b.insert(parse, contentValues);
                            }
                        }
                    } else {
                        a2.f39834c = a2.b();
                        SharedPreferences sharedPreferences = a2.f39834c;
                        if (PatchProxy.isSupport(new Object[]{sharedPreferences, diggSpKey, Integer.valueOf(userDigged)}, null, w.f39837a, true, 32500, new Class[]{SharedPreferences.class, String.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{sharedPreferences, diggSpKey, Integer.valueOf(userDigged)}, null, w.f39837a, true, 32500, new Class[]{SharedPreferences.class, String.class, Integer.TYPE}, Void.TYPE);
                        } else if (sharedPreferences != null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putInt(diggSpKey, userDigged);
                            if (Build.VERSION.SDK_INT >= 9) {
                                edit.apply();
                            } else {
                                edit.commit();
                            }
                        }
                    }
                }
            } else if (id == C0906R.id.title || id == C0906R.id.hk) {
                com.ss.android.ugc.aweme.commercialize.log.g.a(getContext(), awemeRawAd);
                b();
                if (f.b(openUrl)) {
                    Context context = getContext();
                    Aweme aweme = this.f39846d;
                    if (PatchProxy.isSupport(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31576, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31576, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.a(context, "comment_first_ad", "click_message", aweme, com.ss.android.ugc.aweme.commercialize.log.g.a(context, aweme, "raw ad click", false));
                    }
                } else {
                    Context context2 = getContext();
                    if (PatchProxy.isSupport(new Object[]{context2, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31616, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31616, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.a(context2, "click_source", awemeRawAd, com.ss.android.ugc.aweme.commercialize.log.g.e(context2, awemeRawAd, "raw feed comment click source"));
                    }
                }
            } else if (id == C0906R.id.z6) {
                com.ss.android.ugc.aweme.commercialize.log.g.a(getContext(), awemeRawAd);
                b();
                if (f.b(openUrl)) {
                    Context context3 = getContext();
                    Aweme aweme2 = this.f39846d;
                    if (PatchProxy.isSupport(new Object[]{context3, aweme2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31577, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context3, aweme2}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31577, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commercialize.log.g.a(context3, "comment_first_ad", "click_message", aweme2, com.ss.android.ugc.aweme.commercialize.log.g.a(context3, aweme2, "raw ad click", false));
                    }
                } else {
                    Context context4 = getContext();
                    if (PatchProxy.isSupport(new Object[]{context4, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31617, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context4, awemeRawAd}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31617, new Class[]{Context.class, AwemeRawAd.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.commercialize.log.g.a(context4, "click_title", awemeRawAd, com.ss.android.ugc.aweme.commercialize.log.g.e(context4, awemeRawAd, "raw feed comment click title"));
                }
            }
        }
    }

    public void setData(c cVar) {
        String str;
        String str2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f39843a, false, 32731, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f39843a, false, 32731, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f39845c = cVar2;
        this.f39846d = j.a().a(this.f39845c.getAid());
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32734, new Class[0], Void.TYPE);
            return;
        }
        if (((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderWidth((float) com.ss.android.ugc.aweme.base.utils.u.a(0.5d));
            ((GenericDraweeHierarchy) this.mAvatarView.getHierarchy()).getRoundingParams().setBorderColor(this.mAvatarView.getResources().getColor(C0906R.color.hm));
        }
        User user = this.f39845c.getUser();
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mAvatarView, 2130839027);
            } else {
                this.mAvatarView.a(avatarThumb, this.size, this.size, null);
            }
        }
        if (!TextUtils.isEmpty(this.f39845c.getCommentInfo())) {
            this.mContentView.setText(this.f39845c.getDisplayText());
            MentionTextView mentionTextView = this.mContentView;
            List<TextExtraStruct> displayTextExtra = this.f39845c.getDisplayTextExtra();
            AbTestManager.a();
            mentionTextView.a(displayTextExtra, (MentionTextView.d) new com.ss.android.ugc.aweme.shortvideo.view.f(true));
            com.ss.android.ugc.aweme.utils.c.a(this.contentll);
        }
        if (Comment.isSupportReplyComment()) {
            this.mCommentTimeView.setVisibility(8);
        } else {
            this.mCommentTimeView.setVisibility(0);
            TextView textView = this.mCommentTimeView;
            Context context = getContext();
            long commentTime = this.f39845c.getCommentTime() * 1000;
            if (PatchProxy.isSupport(new Object[]{context, new Long(commentTime)}, null, r.f61667a, true, 67348, new Class[]{Context.class, Long.TYPE}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{context, new Long(commentTime)}, null, r.f61667a, true, 67348, new Class[]{Context.class, Long.TYPE}, String.class);
            } else {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(commentTime);
                if (instance.get(1) < Calendar.getInstance().get(1)) {
                    str2 = r.f61669c.format(instance.getTime());
                } else {
                    long currentTimeMillis = System.currentTimeMillis() - commentTime;
                    if (currentTimeMillis <= 60000) {
                        str2 = context.getString(C0906R.string.b41);
                    } else if (currentTimeMillis <= 3600000) {
                        str2 = context.getString(C0906R.string.bbu, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
                    } else if (currentTimeMillis <= 86400000) {
                        str2 = context.getString(C0906R.string.an2, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
                    } else if (currentTimeMillis <= 259200000) {
                        str2 = context.getString(C0906R.string.a49, new Object[]{Long.valueOf(currentTimeMillis / 86400000)});
                    } else {
                        str2 = r.f61668b.format(instance.getTime());
                    }
                }
            }
            textView.setText(str2);
        }
        if (com.ss.android.g.a.a()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mCommentTimeView.getLayoutParams();
            layoutParams.topMargin = com.ss.android.ugc.aweme.base.utils.u.a(12.0d);
            this.mCommentTimeView.setLayoutParams(layoutParams);
        }
        this.mDiggLayout.setVisibility(0);
        if (PatchProxy.isSupport(new Object[0], this, f39843a, false, 32735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39843a, false, 32735, new Class[0], Void.TYPE);
        } else {
            int a2 = u.a().a(getDiggSpKey(), -1);
            if (a2 != -1) {
                this.f39845c.setUserDigged(a2);
            }
        }
        a();
        if (!com.ss.android.g.a.a()) {
            this.mCommentStyleView.setVisibility(0);
        } else {
            this.mCommentStyleView.setVisibility(8);
        }
        this.mCommentStyleView.setText(getResources().getText(C0906R.string.hu));
        this.mCommentStyleView.setBackgroundResource(2130838343);
        DmtTextView dmtTextView = this.mTitleView;
        if (TextUtils.isEmpty(this.f39845c.getCommentNickName())) {
            str = "";
        } else {
            str = this.f39845c.getCommentNickName();
        }
        dmtTextView.setText(str);
        if (Comment.isSupportReplyComment()) {
            this.mTitleView.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.f20595b);
            this.mTitleView.getPaint().setFakeBoldText(true);
        }
    }

    private AdCommentView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private AdCommentView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f39848f = new e();
        this.f39844b = new b() {
            public final void a() {
            }
        };
        LayoutInflater.from(context).inflate(C0906R.layout.s5, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ButterKnife.bind((View) this);
        setOrientation(1);
        d.a(this.mContentView);
        d.a(this.mReplyContentView);
    }
}
