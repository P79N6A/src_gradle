package com.ss.android.ugc.aweme.follow.ui;

import android.animation.Animator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.l;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.profile.d.q;
import com.ss.android.ugc.aweme.profile.d.r;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.s;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class RecommendUserView extends LinearLayout implements View.OnClickListener, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47814a;

    /* renamed from: b  reason: collision with root package name */
    View f47815b;

    /* renamed from: c  reason: collision with root package name */
    public Context f47816c;

    /* renamed from: d  reason: collision with root package name */
    public LottieComposition f47817d;

    /* renamed from: e  reason: collision with root package name */
    public AnimationImageView f47818e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f47819f;
    private User g;
    private AvatarWithBorderView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private q l;
    private i m;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f47814a, false, 44733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47814a, false, 44733, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.m.k();
    }

    public RecommendUserView(Context context) {
        super(context);
        a(context);
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47814a, false, 44728, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47814a, false, 44728, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            this.f47818e.setAnimation("anim_follow_people.json");
            this.f47818e.setVisibility(0);
            this.f47818e.setProgress(0.0f);
        } else if (!this.f47819f) {
            this.f47818e.setVisibility(4);
        }
    }

    public void onFollowFail(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f47814a, false, 44732, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f47814a, false, 44732, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a(getContext(), exc2, C0906R.string.afx);
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f47814a, false, 44731, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f47814a, false, 44731, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (this.g != null && TextUtils.equals(this.g.getUid(), followStatus.userId)) {
            a(followStatus.followStatus);
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f47814a, false, 44724, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f47814a, false, 44724, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f47816c = context;
        this.f47815b = LayoutInflater.from(context).inflate(C0906R.layout.arm, this, true);
        this.h = (AvatarWithBorderView) this.f47815b.findViewById(C0906R.id.hk);
        this.f47818e = (AnimationImageView) this.f47815b.findViewById(C0906R.id.agq);
        this.i = (TextView) this.f47815b.findViewById(C0906R.id.dlg);
        this.j = (TextView) this.f47815b.findViewById(C0906R.id.dau);
        this.k = (LinearLayout) this.f47815b.findViewById(C0906R.id.czc);
        this.h.setOnClickListener(this);
        this.f47818e.setOnClickListener(this);
        this.f47815b.setOnClickListener(this);
        if (this.f47817d == null) {
            LottieComposition.Factory.fromAssetFileName(context, "anim_follow_people.json", new l() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47820a;

                public final void a(LottieComposition lottieComposition) {
                    if (PatchProxy.isSupport(new Object[]{lottieComposition}, this, f47820a, false, 44734, new Class[]{LottieComposition.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lottieComposition}, this, f47820a, false, 44734, new Class[]{LottieComposition.class}, Void.TYPE);
                        return;
                    }
                    RecommendUserView.this.f47817d = lottieComposition;
                    RecommendUserView.this.f47818e.setComposition(RecommendUserView.this.f47817d);
                }
            });
        } else {
            this.f47818e.setComposition(this.f47817d);
        }
        this.f47818e.loop(false);
        this.l = new r(this.k, (int) (((float) (UIUtils.getScreenWidth(this.f47816c) / 2)) - UIUtils.dip2Px(this.f47816c, 21.0f)));
        this.m = new i();
        this.m.a(this);
    }

    public void setUser(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f47814a, false, 44725, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f47814a, false, 44725, new Class[]{User.class}, Void.TYPE);
        } else if (user != null) {
            this.g = user;
            if (PatchProxy.isSupport(new Object[0], this, f47814a, false, 44727, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47814a, false, 44727, new Class[0], Void.TYPE);
                return;
            }
            if (this.g != null) {
                this.l.a(this.g);
                this.h.a(this.g.getAvatarThumb());
                this.i.setText(this.g.getNickname());
                this.j.setText(this.g.getRecommendReason());
                a(this.g.getFollowStatus());
                if (this.m != null && this.m.i() == null) {
                    this.m.c();
                }
            }
        }
    }

    public final void a(final User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f47814a, false, 44726, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f47814a, false, 44726, new Class[]{User.class}, Void.TYPE);
        } else if (this.g == null || user == null || TextUtils.equals(this.g.getUid(), user.getUid())) {
            setUser(user);
        } else {
            this.f47815b.animate().alpha(0.0f).scaleX(0.9f).scaleY(0.9f).setDuration(150).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f47822a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f47822a, false, 44735, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f47822a, false, 44735, new Class[0], Void.TYPE);
                        return;
                    }
                    RecommendUserView.this.f47815b.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f47825a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f47825a, false, 44736, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f47825a, false, 44736, new Class[0], Void.TYPE);
                                return;
                            }
                            RecommendUserView.this.setUser(user);
                            RecommendUserView.this.f47815b.setScaleX(1.0f);
                            RecommendUserView.this.f47815b.setScaleY(1.0f);
                            RecommendUserView.this.f47815b.setTranslationY(UIUtils.dip2Px(RecommendUserView.this.f47816c, 8.0f));
                            RecommendUserView.this.f47815b.animate().alpha(1.0f).translationY(0.0f).setDuration(150).start();
                        }
                    }, 50);
                }
            }).start();
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f47814a, false, 44730, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f47814a, false, 44730, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.g != null) {
            if (view.getId() == C0906R.id.agq) {
                if (PatchProxy.isSupport(new Object[0], this, f47814a, false, 44729, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47814a, false, 44729, new Class[0], Void.TYPE);
                } else {
                    if (this.g != null) {
                        if (this.g.getFollowStatus() == 0 && !TextUtils.equals(this.g.getUid(), d.a().getCurUserId())) {
                            this.f47818e.playAnimation();
                            this.f47818e.addAnimatorListener(new Animator.AnimatorListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f47827a;

                                public final void onAnimationCancel(Animator animator) {
                                }

                                public final void onAnimationRepeat(Animator animator) {
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f47827a, false, 44737, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f47827a, false, 44737, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    RecommendUserView.this.f47819f = false;
                                    RecommendUserView.this.f47818e.setVisibility(4);
                                }
                            });
                            this.f47819f = true;
                        }
                    }
                    if (this.m != null) {
                        if (!this.m.l()) {
                            this.m.a(this);
                        }
                        this.m.a(new i.a().a(this.g.getUid()).b(this.g.getSecUid()).a(1).a());
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("rec_card").setValue(this.g.getUid()));
                    new s().b("rec_card").f("").h(this.g.getUid()).i("").e();
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("enter_from", "follow_rec");
                    jSONObject.put("enter_type", "normal_way");
                } catch (JSONException unused) {
                }
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setJsonObject(jSONObject));
                com.ss.android.ugc.aweme.common.r.a("enter_personal_detail_backup", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("to_user_id", this.g.getUid()).f34114b);
                UserProfileActivity.b(this.f47816c, this.g, "follow_rec");
            }
        }
    }

    public RecommendUserView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public RecommendUserView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
