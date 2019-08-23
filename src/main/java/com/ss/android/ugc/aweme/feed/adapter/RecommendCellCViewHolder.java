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
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.BorderLayout;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.a;
import java.util.List;

public class RecommendCellCViewHolder extends AbsCellViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44775a;

    /* renamed from: b  reason: collision with root package name */
    public String f44776b;
    @BindView(2131493316)
    BorderLayout borderLayout;

    /* renamed from: c  reason: collision with root package name */
    private boolean f44777c;
    @BindView(2131497457)
    TagLayout tagLayout;
    @BindView(2131493628)
    TextView txtCommentCount;
    @BindView(2131493907)
    TextView txtDesc;
    @BindView(2131495351)
    TextView txtLikeCount;

    public final boolean k() {
        return this.f44777c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40629, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40629, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40630, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40630, new Class[0], String.class);
        } else if (this.g != null) {
            return ((Aweme) this.g).getAid();
        } else {
            return "";
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40631, new Class[0], Void.TYPE);
            return;
        }
        m();
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40628, new Class[0], Void.TYPE);
        } else if (this.g != null && ((Aweme) this.g).getStatistics() != null) {
            this.txtCommentCount.setText(b.a(((Aweme) this.g).getStatistics().getCommentCount()));
            this.txtLikeCount.setText(b.a(((Aweme) this.g).getStatistics().getDiggCount()));
        }
    }

    public final void b() {
        List<AwemeLabelModel> list;
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40626, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            i();
            if (TextUtils.isEmpty(((Aweme) this.g).getDesc())) {
                this.txtDesc.setVisibility(8);
            } else {
                this.txtDesc.setVisibility(0);
                this.txtDesc.setText(((Aweme) this.g).getDesc());
            }
            User author = ((Aweme) this.g).getAuthor();
            if (!author.isLive() || !a.a()) {
                this.borderLayout.setVisibility(8);
            } else {
                this.borderLayout.setVisibility(0);
                int color = this.borderLayout.getResources().getColor(C0906R.color.a1z);
                this.borderLayout.a(color, color);
                this.borderLayout.setSelected(true);
                com.ss.android.ugc.aweme.story.live.b.c(this.u, 0, author.getRequestId(), author.getUid(), author.roomId);
            }
            m();
            this.tagLayout.setEventType(this.f44776b);
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
        this.f44777c = true;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f44775a, false, 40632, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f44775a, false, 40632, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.txtDesc.getAlpha() != f2) {
            this.txtDesc.setAlpha(f2);
            this.txtLikeCount.setAlpha(f2);
            this.txtCommentCount.setAlpha(f2);
            this.tagLayout.setAlpha(f2);
        }
    }

    public RecommendCellCViewHolder(final View view, String str, final d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.i = true;
        this.f44776b = str;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44778a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44778a, false, 40633, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44778a, false, 40633, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) RecommendCellCViewHolder.this.g).getStatus() == null || !((Aweme) RecommendCellCViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) RecommendCellCViewHolder.this.g, RecommendCellCViewHolder.this.f44776b);
                    }
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), (int) C0906R.string.dr2).a();
            }
        });
        this.h.setAnimationListener(this.f40163e);
        a(this.h);
        if (PatchProxy.isSupport(new Object[0], this, f44775a, false, 40624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44775a, false, 40624, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.u.getResources(), 2130839044);
            a2.setBounds(0, (int) UIUtils.dip2Px(this.u, 0.5f), (int) UIUtils.dip2Px(this.u, 15.0f), (int) UIUtils.dip2Px(this.u, 15.5f));
            this.txtLikeCount.setCompoundDrawables(a2, null, null, null);
        }
    }

    public final void a(Aweme aweme, int i, boolean z) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f44775a, false, 40625, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f44775a, false, 40625, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        if (aweme2 != null) {
            this.g = aweme2;
            this.f44777c = z;
            if (this.f44777c) {
                b();
            }
        }
    }
}
