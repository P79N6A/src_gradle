package com.ss.android.ugc.aweme.challenge.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.AbsAwemeViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.d.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

public class DetailAwemeViewHolder extends AbsAwemeViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35329a = null;
    private static final String k = "DetailAwemeViewHolder";

    /* renamed from: b  reason: collision with root package name */
    public Context f35330b;

    /* renamed from: c  reason: collision with root package name */
    public String f35331c;
    private ImageView l;
    private RemoteImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private DmtTextView q;

    private boolean j() {
        if (!PatchProxy.isSupport(new Object[0], this, f35329a, false, 25792, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.f35331c, "sticker_prop_detail");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35329a, false, 25792, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f35329a, false, 25791, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35329a, false, 25791, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.f35331c, "single_song") || TextUtils.equals(this.f35331c, "single_song_fresh")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f35329a, false, 25793, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35329a, false, 25793, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.f35331c, "challenge") || TextUtils.equals(this.f35331c, "challenge_fresh")) {
            return true;
        } else {
            return false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35329a, false, 25790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35329a, false, 25790, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (!e() || !a(video.getDynamicCover())) {
                    c.b(this.h, video.getCover());
                } else {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35329a, false, 25785, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35329a, false, 25785, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            Video video = ((Aweme) this.g).getVideo();
            if (video != null) {
                if (!e() || !a(video.getDynamicCover())) {
                    c.b(this.h, video.getCover());
                } else {
                    this.h.a(video.getDynamicCover());
                    this.i = true;
                }
            }
        }
    }

    private void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f35329a, false, 25787, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f35329a, false, 25787, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        if (aweme.getStatistics() != null) {
            String a2 = b.a(aweme.getStatistics().getDiggCount());
            this.q.setText(a2);
            this.q.setContentDescription(this.f35330b.getString(C0906R.string.brw, new Object[]{a2}));
        }
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35329a, false, 25789, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35329a, false, 25789, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (com.ss.android.ugc.aweme.i18n.c.a()) {
            this.l.setVisibility(4);
        } else if (i >= 3 || !TextUtils.equals(this.f35331c, "single_song")) {
            this.l.setVisibility(4);
        } else {
            this.l.setVisibility(0);
            switch (i) {
                case 0:
                    this.l.setImageResource(2130839432);
                    return;
                case 1:
                    this.l.setImageResource(2130839433);
                    return;
                case 2:
                    this.l.setImageResource(2130839434);
                    return;
                default:
                    this.l.setVisibility(4);
                    return;
            }
        }
    }

    private void a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, awemeTextLabelModel}, this, f35329a, false, 25788, new Class[]{TextView.class, AwemeTextLabelModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, awemeTextLabelModel}, this, f35329a, false, 25788, new Class[]{TextView.class, AwemeTextLabelModel.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(awemeTextLabelModel.getLabelName());
            textView2.setTextSize(0, (float) u.a(12.0d));
            textView2.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
            textView2.setBackground(v.a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) u.a(2.0d)));
            textView.setSingleLine();
        }
    }

    public DetailAwemeViewHolder(View view, String str, final d dVar) {
        super(view);
        this.f35330b = view.getContext();
        this.f35331c = str;
        this.h = (AnimatedImageView) view.findViewById(C0906R.id.a1a);
        this.l = (ImageView) view.findViewById(C0906R.id.d4o);
        this.m = (RemoteImageView) view.findViewById(C0906R.id.b0h);
        this.o = (TextView) view.findViewById(C0906R.id.b5_);
        this.p = (TextView) view.findViewById(C0906R.id.b5b);
        this.n = (TextView) view.findViewById(C0906R.id.b5y);
        this.q = (DmtTextView) view.findViewById(C0906R.id.bbd);
        this.q.setVisibility(8);
        this.l.setVisibility(8);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35332a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f35332a, false, 25795, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35332a, false, 25795, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) DetailAwemeViewHolder.this.g).getStatus() == null || !((Aweme) DetailAwemeViewHolder.this.g).getStatus().isDelete()) {
                    if (dVar != null) {
                        dVar.a(view, (Aweme) DetailAwemeViewHolder.this.g, DetailAwemeViewHolder.this.f35331c);
                    }
                    return;
                }
                a.c(DetailAwemeViewHolder.this.f35330b, (int) C0906R.string.dr2).a();
            }
        });
        this.h.setAnimationListener(this.f40163e);
    }

    public final void a(Aweme aweme, int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Aweme aweme2 = aweme;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f35329a, false, 25786, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Byte.valueOf(z)}, this, f35329a, false, 25786, new Class[]{Aweme.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(aweme, i);
        AnimatedImageView animatedImageView = this.h;
        if (PatchProxy.isSupport(new Object[]{animatedImageView, Integer.valueOf(i)}, this, f35329a, false, 25794, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView, Integer.valueOf(i)}, this, f35329a, false, 25794, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else {
            animatedImageView.setContentDescription(this.f35330b.getString(C0906R.string.dr3, new Object[]{Integer.valueOf(i2 + 1)}));
        }
        if (aweme2 != null) {
            this.g = aweme2;
            if (z) {
                b();
            }
            this.m.setVisibility(4);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            if (i()) {
                if (aweme.getMusicStarter() != null) {
                    this.p.setVisibility(0);
                    if (!TextUtils.isEmpty(aweme.getLabelMusicStarterText())) {
                        this.p.setText(aweme.getLabelMusicStarterText());
                    }
                }
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71831, new Class[0], Boolean.TYPE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71831, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        z4 = false;
                    } else {
                        z4 = d2.isMusicLikeShow();
                    }
                }
                if (z4) {
                    a(aweme);
                } else {
                    a(i2);
                }
            }
            if (j()) {
                if (aweme.isEffectDesigner()) {
                    this.p.setText(C0906R.string.aa2);
                    this.p.setVisibility(0);
                }
                AbTestManager a3 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a3, AbTestManager.f63777a, false, 71833, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, AbTestManager.f63777a, false, 71833, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d3 = a3.d();
                    if (d3 == null) {
                        z3 = false;
                    } else {
                        z3 = d3.isEffectLikeShow();
                    }
                }
                if (z3) {
                    a(aweme);
                }
            }
            if (k()) {
                AbTestManager a4 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a4, AbTestManager.f63777a, false, 71832, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a4, AbTestManager.f63777a, false, 71832, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    AbTestModel d4 = a4.d();
                    if (d4 == null) {
                        z2 = false;
                    } else {
                        z2 = d4.isChallengeLikeShow();
                    }
                }
                if (z2) {
                    a(aweme);
                }
            }
            if (!com.ss.android.g.a.a() || !aweme.isPgcShow()) {
                if (i() || aweme.getOriginAuthor() == null) {
                    if (aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null) {
                        if ((TextUtils.equals(this.f35331c, "challenge") || j()) && aweme.getIsTop() == 1) {
                            if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                                this.n.setVisibility(8);
                                this.m.setVisibility(0);
                                c.a(this.m, aweme.getLabelTop(), (int) UIUtils.dip2Px(this.f35330b, 6.0f), (int) UIUtils.dip2Px(this.f35330b, 6.0f));
                                return;
                            }
                            this.n.setVisibility(0);
                            this.m.setVisibility(8);
                            a(this.n, aweme.getTextTopLabels().get(0));
                            return;
                        }
                    } else if (j() && com.ss.android.g.a.a() && aweme.getIsTop() == 1) {
                        if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                            this.n.setVisibility(0);
                            this.m.setVisibility(8);
                            AwemeTextLabelModel awemeTextLabelModel = new AwemeTextLabelModel();
                            awemeTextLabelModel.setTextColor("#FFFFFF");
                            awemeTextLabelModel.setLabelType(8);
                            awemeTextLabelModel.setBgColor("#FE2C55");
                            awemeTextLabelModel.setShowSeconds(0.0f);
                            awemeTextLabelModel.setLabelName(this.f35330b.getResources().getString(C0906R.string.bjf));
                            a(this.n, awemeTextLabelModel);
                        } else {
                            this.n.setVisibility(0);
                            this.m.setVisibility(8);
                            a(this.n, aweme.getTextTopLabels().get(0));
                            return;
                        }
                    }
                } else if (!k()) {
                    this.o.setVisibility(0);
                    if (!TextUtils.isEmpty(aweme.getLabelOriginAuthorText())) {
                        this.o.setText(aweme.getLabelOriginAuthorText());
                    }
                    this.m.setVisibility(4);
                    return;
                }
                return;
            }
            if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                this.n.setVisibility(0);
                this.m.setVisibility(8);
                a(this.n, aweme.getTextTopLabels().get(0));
            }
            a(aweme.getOriginalPos());
        }
    }
}
