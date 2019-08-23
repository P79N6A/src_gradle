package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.SearchParamProvider;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;
import java.util.Map;

public class RecommendCellBViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44766a;
    @BindView(2131493160)
    RemoteImageView authorAvatar;

    /* renamed from: b  reason: collision with root package name */
    public boolean f44767b;

    /* renamed from: c  reason: collision with root package name */
    public String f44768c;
    public boolean k;
    private boolean l;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131493162)
    TextView txtAuthorName;
    @BindView(2131493907)
    TextView txtDesc;
    @BindView(2131495351)
    TextView txtLikeCount;

    public final boolean k() {
        return this.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40616, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40619, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40619, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.f44767b || !a.a()) {
            return super.e();
        } else {
            return false;
        }
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40617, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40617, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40618, new Class[0], Void.TYPE);
            return;
        }
        n();
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40615, new Class[0], Void.TYPE);
        } else if (this.g != null && ((Aweme) this.g).getStatistics() != null) {
            this.txtLikeCount.setText(b.a(((Aweme) this.g).getStatistics().getDiggCount()));
        }
    }

    public final void m() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40621, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44767b) {
            SearchResultParam a2 = SearchParamProvider.f42643b.a(this.itemView.getContext());
            d a3 = d.a();
            if (this.k) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            d a4 = a3.a("enter_from", str);
            if (a2 == null) {
                str2 = "";
            } else {
                str2 = a2.getKeyword();
            }
            r.a("search_result_show_video", (Map) a4.a("search_keyword", str2).a("log_pb", ai.a().a(((Aweme) this.g).getRequestId())).a("group_id", aa.m((Aweme) this.g)).f34114b);
        }
    }

    public final void b() {
        List<AwemeLabelModel> list;
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40613, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                if (TextUtils.equals(this.f44768c, "search_result") && !a.a() && !((Aweme) this.g).isHashTag()) {
                    ((Aweme) this.g).convertChallengeToHashTag();
                }
                if (((Aweme) this.g).getPosition() == null || (this.f44767b && a.a())) {
                    this.txtDesc.setText(((Aweme) this.g).getDesc());
                } else {
                    this.txtDesc.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.u, ((Aweme) this.g).getDesc(), ((Aweme) this.g).getPosition()));
                }
            }
            User author = ((Aweme) this.g).getAuthor();
            if (author != null) {
                this.txtAuthorName.setText(author.getNickname());
                c.b(this.authorAvatar, author.getAvatarThumb());
            }
            n();
            this.tagLayout.setEventType(this.f44768c);
            if (((Aweme) this.g).getVideoLabels() != null) {
                TagLayout tagLayout2 = this.tagLayout;
                Aweme aweme = (Aweme) this.g;
                if (((Aweme) this.g).getVideoLabels().size() > 0) {
                    list = ((Aweme) this.g).getVideoLabels().subList(0, 1);
                } else {
                    list = ((Aweme) this.g).getVideoLabels();
                }
                tagLayout2.b(aweme, list, new TagLayout.a(7, 16));
            }
        }
    }

    public final void d(boolean z) {
        this.l = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44766a, false, 40620, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44766a, false, 40620, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.txtDesc.getAlpha() != f2) {
            this.txtDesc.setAlpha(f2);
            this.txtAuthorName.setAlpha(f2);
            this.txtLikeCount.setAlpha(f2);
            this.authorAvatar.setAlpha(f2);
            this.tagLayout.setAlpha(f2);
        }
    }

    public RecommendCellBViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
        this(view, str, dVar, false);
    }

    public final void a(Aweme aweme, int i, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f44766a, false, 40612, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f44766a, false, 40612, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.l = z;
            if (this.l) {
                b();
            }
        }
    }

    public RecommendCellBViewHolder(final View view, String str, final com.ss.android.ugc.aweme.challenge.d dVar, boolean z) {
        super(view);
        this.f44767b = z;
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.i = true;
        this.f44768c = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44769a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44769a, false, 40622, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44769a, false, 40622, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) RecommendCellBViewHolder.this.g).getStatus() == null || !((Aweme) RecommendCellBViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) RecommendCellBViewHolder.this.g, RecommendCellBViewHolder.this.f44768c);
                    }
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.h.setAnimationListener(this.f40163e);
        a(this.h);
        if (PatchProxy.isSupport(new Object[0], this, f44766a, false, 40611, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44766a, false, 40611, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null && (!a.a() || !this.f44767b)) {
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.u.getResources(), 2130839044);
            a2.setBounds(0, (int) UIUtils.dip2Px(this.u, 0.5f), (int) UIUtils.dip2Px(this.u, 15.0f), (int) UIUtils.dip2Px(this.u, 15.5f));
            this.txtLikeCount.setCompoundDrawables(a2, null, null, null);
        }
    }
}
