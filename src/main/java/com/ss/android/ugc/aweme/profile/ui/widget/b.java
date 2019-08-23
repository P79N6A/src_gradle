package com.ss.android.ugc.aweme.profile.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63115a;

    /* renamed from: b  reason: collision with root package name */
    public NoticeView f63116b;

    /* renamed from: c  reason: collision with root package name */
    Context f63117c = this.f63116b.getContext();

    /* renamed from: d  reason: collision with root package name */
    public boolean f63118d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63119e;

    /* renamed from: f  reason: collision with root package name */
    String f63120f;
    private String g;

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63115a, false, 69703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63115a, false, 69703, new Class[0], Void.TYPE);
            return;
        }
        c.a(this.f63117c, "perfect_user_info", 0).edit().putLong("last_guide_close_time", System.currentTimeMillis()).apply();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f63115a, false, 69700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63115a, false, 69700, new Class[0], Void.TYPE);
            return;
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f63116b, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(decelerateInterpolator);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63129a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f63129a, false, 69710, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f63129a, false, 69710, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                b.this.f63116b.setVisibility(8);
                b.this.f63116b.setAlpha(1.0f);
            }
        });
        ofFloat.start();
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f63115a, false, 69705, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63115a, false, 69705, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - c.a(this.f63117c, "perfect_user_info", 0).getLong("last_guide_close_time", 0) > TimeUnit.DAYS.toMillis(7)) {
            z = true;
        }
        return z;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63115a, false, 69697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63115a, false, 69697, new Class[0], Void.TYPE);
        } else if (!this.f63118d) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("show_from", this.f63120f);
            } catch (Exception unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("profile_tip_show").setLabelName("profile_edit_link").setJsonObject(jSONObject));
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f63115a, false, 69704, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f63115a, false, 69704, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User curUser = d.a().getCurUser();
        if (curUser == null || !d.a().isLogin()) {
            return false;
        }
        if (TextUtils.isEmpty(curUser.getBindPhone())) {
            if (!((Boolean) SharePrefCache.inst().getHasEnterBindPhone().c()).booleanValue()) {
                this.f63118d = true;
                return true;
            }
        } else if (curUser.getGender() == 0 || TextUtils.isEmpty(curUser.getBirthday())) {
            return e();
        }
        return false;
    }

    public b(NoticeView noticeView) {
        this.f63116b = noticeView;
        this.f63116b.setVisibility(8);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f63115a, false, 69692, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f63115a, false, 69692, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.g = str;
        this.f63116b.setTitleText(str);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63115a, false, 69698, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63115a, false, 69698, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f63116b != null && this.f63119e) {
            this.f63119e = false;
            if (z) {
                d();
            } else {
                this.f63116b.setVisibility(8);
            }
            if (!this.f63118d) {
                b();
            }
            this.f63116b.setOnClickListener(null);
        }
    }

    public final void a(String str, boolean z, long j) {
        final String str2 = str;
        final boolean z2 = z;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j2)}, this, f63115a, false, 69695, new Class[]{String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), new Long(j2)}, this, f63115a, false, 69695, new Class[]{String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.i18n.c.a()) {
            this.f63120f = str2;
            if (!this.f63119e) {
                if (c()) {
                    this.f63119e = true;
                    if (this.f63118d) {
                        this.f63116b.setTitleText((int) C0906R.string.mw);
                    } else {
                        a();
                        if (TextUtils.isEmpty(this.g)) {
                            this.f63116b.setTitleText((int) C0906R.string.blv);
                        } else {
                            this.f63116b.setTitleText(this.g);
                        }
                    }
                    if (z2) {
                        this.f63116b.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f63121a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f63121a, false, 69706, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f63121a, false, 69706, new Class[0], Void.TYPE);
                                    return;
                                }
                                b bVar = b.this;
                                if (PatchProxy.isSupport(new Object[0], bVar, b.f63115a, false, 69699, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], bVar, b.f63115a, false, 69699, new Class[0], Void.TYPE);
                                    return;
                                }
                                AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.0f);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f63116b, "translationY", new float[]{(float) bVar.f63116b.getHeight(), 0.0f});
                                ofFloat.setDuration(250);
                                ofFloat.setInterpolator(accelerateInterpolator);
                                ofFloat.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f63127a;

                                    public final void onAnimationStart(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f63127a, false, 69709, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f63127a, false, 69709, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        super.onAnimationStart(animator);
                                        b.this.f63116b.setVisibility(0);
                                    }
                                });
                                ofFloat.start();
                            }
                        }, j2);
                    } else {
                        this.f63116b.setVisibility(0);
                    }
                    this.f63116b.setOnInternalClickListener(new NoticeView.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f63123a;

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f63123a, false, 69708, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f63123a, false, 69708, new Class[0], Void.TYPE);
                                return;
                            }
                            b bVar = b.this;
                            if (PatchProxy.isSupport(new Object[0], bVar, b.f63115a, false, 69702, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bVar, b.f63115a, false, 69702, new Class[0], Void.TYPE);
                            } else if (bVar.f63118d) {
                                SharePrefCache.inst().getHasEnterBindPhone().a(Boolean.TRUE);
                            } else {
                                bVar.b();
                            }
                            b.this.a(z2);
                            bg.a(new com.ss.android.ugc.aweme.profile.a.c(0));
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f63123a, false, 69707, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f63123a, false, 69707, new Class[0], Void.TYPE);
                                return;
                            }
                            if (!b.this.f63118d) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("click_from", str2);
                                } catch (JSONException unused) {
                                }
                                r.onEvent(MobClick.obtain().setEventName("profile_tip_click").setLabelName("profile_edit_link").setJsonObject(jSONObject));
                            }
                            b bVar = b.this;
                            if (PatchProxy.isSupport(new Object[0], bVar, b.f63115a, false, 69701, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bVar, b.f63115a, false, 69701, new Class[0], Void.TYPE);
                            } else if (bVar.f63118d) {
                                String str = "";
                                if (TextUtils.equals("personal_homepage", bVar.f63120f)) {
                                    str = "personal_home";
                                }
                                com.ss.android.ugc.aweme.account.c.c().bindMobile((Activity) bVar.f63117c, str, null, null);
                                r.onEvent(MobClick.obtain().setEventName("tip_click").setLabelName("mobile_link"));
                                SharePrefCache.inst().getHasEnterBindPhone().a(Boolean.TRUE);
                            } else {
                                h.a().a("aweme://profile_edit");
                                bVar.b();
                            }
                            b.this.a(z2);
                            bg.a(new com.ss.android.ugc.aweme.profile.a.c(0));
                        }
                    });
                    return;
                }
                this.f63116b.setVisibility(8);
            }
        }
    }
}
