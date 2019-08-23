package com.ss.android.ugc.aweme.forward.f;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.facebook.c.c;
import com.facebook.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.anim.b;
import com.ss.android.ugc.aweme.anim.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.newfollow.ui.CommentLikeListView;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.cf;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48292a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f48293b;

    /* renamed from: c  reason: collision with root package name */
    public CommentLikeListView f48294c;

    /* renamed from: d  reason: collision with root package name */
    public int f48295d;

    /* renamed from: e  reason: collision with root package name */
    public c f48296e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.newfollow.b.a f48297f;
    public boolean g;
    public Context h;
    public Aweme i;
    public com.ss.android.ugc.aweme.anim.c<ImageView> j = new com.ss.android.ugc.aweme.anim.c<ImageView>() {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f48302b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f48302b, false, 45528, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48302b, false, 45528, new Class[0], Void.TYPE);
                return;
            }
            super.a();
            ImageView imageView = a.this.f48293b;
            imageView.setImageAlpha(254);
            imageView.setImageDrawable(ContextCompat.getDrawable(a.this.h, 2130838053));
        }
    };
    private TextView k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48292a, false, 45518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48292a, false, 45518, new Class[0], Void.TYPE);
            return;
        }
        this.f48293b.animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48298a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f48298a, false, 45526, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48298a, false, 45526, new Class[0], Void.TYPE);
                    return;
                }
                b.a().a(k.a(), "new_follow_anim_likes_explode", new d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48300a;

                    public final void a(@Nullable com.facebook.c.b.k kVar, String str) {
                        if (PatchProxy.isSupport(new Object[]{kVar, str}, this, f48300a, false, 45527, new Class[]{com.facebook.c.b.k.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{kVar, str}, this, f48300a, false, 45527, new Class[]{com.facebook.c.b.k.class, String.class}, Void.TYPE);
                            return;
                        }
                        Drawable drawable = ContextCompat.getDrawable(a.this.h, 2130838958);
                        if (drawable != null) {
                            drawable.setBounds(0, 0, 120, 114);
                            a.this.f48296e = new e().a(kVar).f23423c.a(Pair.create("keyframes", Pair.create(drawable, new Matrix()))).a();
                        }
                        ImageView imageView = a.this.f48293b;
                        imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1).start();
                        imageView.setVisibility(0);
                        imageView.setLayerType(1, null);
                        imageView.setImageDrawable(a.this.f48296e);
                        imageView.setImageAlpha(0);
                        a.this.f48296e.a();
                        a.this.f48296e.c();
                        a.this.f48296e.a((c.C0251c) a.this.j);
                    }
                });
            }
        }).start();
    }

    private String a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48292a, false, 45523, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48292a, false, 45523, new Class[]{Integer.TYPE}, String.class);
        } else if (i3 > 0) {
            return com.ss.android.ugc.aweme.i18n.b.a((long) i3);
        } else {
            if (!cf.a()) {
                return PushConstants.PUSH_TYPE_NOTIFY;
            }
            return com.ss.android.ugc.aweme.base.utils.d.a().getString(C0906R.string.a5h);
        }
    }

    public final void b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f48292a, false, 45521, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f48292a, false, 45521, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.h != null && aweme != null) {
            if (!this.g) {
                this.f48295d++;
                a(true);
                return;
            }
            if (this.g) {
                this.f48295d--;
                a(false);
            }
        }
    }

    public final void a(Aweme aweme) {
        int i2;
        String str;
        Aweme aweme2 = aweme;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f48292a, false, 45515, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f48292a, false, 45515, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.i = aweme2;
        if (!this.r) {
            Aweme aweme3 = this.i;
            if (PatchProxy.isSupport(new Object[]{aweme3}, null, com.ss.android.ugc.aweme.newfollow.a.b.f57062a, true, 61162, new Class[]{Aweme.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{aweme3}, null, com.ss.android.ugc.aweme.newfollow.a.b.f57062a, true, 61162, new Class[]{Aweme.class}, String.class);
            } else {
                AwemeStatistics statistics = aweme3.getStatistics();
                if (statistics != null && aweme3.getAuthor() != null && statistics.getDiggCount() > 0) {
                    str = com.ss.android.ugc.aweme.i18n.b.a((long) statistics.getDiggCount());
                } else if (!cf.a()) {
                    str = PushConstants.PUSH_TYPE_NOTIFY;
                } else {
                    str = com.ss.android.ugc.aweme.base.utils.d.a().getString(C0906R.string.a5h);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.k.setText(str);
            }
        }
        if (this.i.getStatistics() == null) {
            i2 = 0;
        } else {
            i2 = this.i.getStatistics().getDiggCount();
        }
        this.f48295d = i2;
        this.l = this.f48295d;
        this.m = this.i.getUserDigg();
        if (this.i.getUserDigg() != 1) {
            z = false;
        }
        a(z);
    }

    public final void a(@NonNull String str) {
        String str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str}, this, f48292a, false, 45516, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f48292a, false, 45516, new Class[]{String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            if (this.i != null) {
                str2 = this.i.getAid();
            } else {
                str2 = "";
            }
            com.ss.android.ugc.aweme.login.e.a(com.ss.android.ugc.aweme.framework.core.a.b().a(), str, "click_like", ad.a().a("group_id", str2).a("log_pb", aa.g(str2)).f75487b);
        } else {
            Aweme aweme = this.i;
            final ImageView imageView = this.f48293b;
            if (PatchProxy.isSupport(new Object[]{aweme, imageView}, this, f48292a, false, 45517, new Class[]{Aweme.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme, imageView}, this, f48292a, false, 45517, new Class[]{Aweme.class, View.class}, Void.TYPE);
            } else if (aweme != null) {
                if (this.g || aweme.getUserDigg() != 0 || com.ss.android.ugc.aweme.theme.a.a(this.h)) {
                    if (PatchProxy.isSupport(new Object[]{imageView}, this, f48292a, false, 45519, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{imageView}, this, f48292a, false, 45519, new Class[]{View.class}, Void.TYPE);
                    } else if (imageView != null) {
                        imageView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f48304a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f48304a, false, 45529, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f48304a, false, 45529, new Class[0], Void.TYPE);
                                    return;
                                }
                                imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                            }
                        }).start();
                    }
                } else {
                    a();
                }
            }
            if (!NetworkUtils.isNetworkAvailable(this.h)) {
                com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.bgf).a();
                return;
            }
            Aweme aweme2 = this.i;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, f48292a, false, 45520, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme2}, this, f48292a, false, 45520, new Class[]{Aweme.class}, Void.TYPE);
            } else if (this.h != null && aweme2 != null) {
                if (!this.g && aweme2.getUserDigg() == 0) {
                    this.f48295d++;
                    a(true);
                    if (this.f48297f != null) {
                        this.f48297f.a(this.i, 1);
                    }
                } else if (!this.g || aweme2.getUserDigg() == 0) {
                    if (aweme2.getUserDigg() == 1) {
                        z = true;
                    }
                    this.g = z;
                    a(this.g);
                    if (this.g) {
                        this.f48295d++;
                        return;
                    }
                    this.f48295d--;
                } else {
                    this.f48295d--;
                    a(false);
                    if (this.f48297f != null) {
                        this.f48297f.a(this.i, 0);
                    }
                }
            }
        }
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48292a, false, 45522, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48292a, false, 45522, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.g = z;
            this.f48293b.setSelected(z);
            if (!this.r) {
                if (z) {
                    if (this.m == 1) {
                        this.k.setText(a(this.l));
                    } else {
                        this.k.setText(a(this.l + 1));
                    }
                } else if (this.m == 1) {
                    this.k.setText(a(this.l - 1));
                } else {
                    this.k.setText(a(this.l));
                }
            } else if (this.f48294c != null) {
                if (z) {
                    if (this.m != 1) {
                        this.f48294c.a(this.l + 1);
                        return;
                    }
                } else if (this.m == 1) {
                    this.f48294c.a(this.l - 1);
                    return;
                }
                this.f48294c.a(this.l);
            }
        }
    }

    public a(Context context, ImageView imageView, TextView textView, com.ss.android.ugc.aweme.newfollow.b.a aVar, boolean z) {
        this.h = context;
        this.f48297f = aVar;
        this.r = z;
        this.f48293b = imageView;
        this.k = textView;
        if (!this.r || AbTestManager.a().aB() != 2) {
            this.n = (int) UIUtils.dip2Px(this.h, 25.0f);
            this.o = (int) UIUtils.dip2Px(this.h, 25.0f);
            this.p = (int) UIUtils.dip2Px(this.h, 25.0f);
            this.q = this.p;
        } else {
            this.n = (int) UIUtils.dip2Px(this.h, 23.0f);
            this.o = (int) UIUtils.dip2Px(this.h, 20.0f);
            this.p = (int) UIUtils.dip2Px(this.h, 23.0f);
            this.q = (int) UIUtils.dip2Px(this.h, 20.0f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f48292a, false, 45514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48292a, false, 45514, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f48293b.getLayoutParams();
        if (!com.ss.android.ugc.aweme.theme.a.a(this.h) && (layoutParams.width != this.n || layoutParams.height != this.o)) {
            layoutParams.width = this.n;
            layoutParams.height = this.o;
            this.f48293b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f48293b.setLayoutParams(layoutParams);
        } else if (!(layoutParams.width == this.p && layoutParams.height == this.q)) {
            layoutParams.width = this.p;
            layoutParams.height = this.q;
            this.f48293b.setLayoutParams(layoutParams);
        }
        this.f48293b.setImageResource(2130838053);
    }
}
