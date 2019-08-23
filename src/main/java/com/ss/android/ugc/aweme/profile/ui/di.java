package com.ss.android.ugc.aweme.profile.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.translation.model.VideoTranslationCache;
import com.ss.android.ugc.aweme.translation.model.c;
import com.ss.android.ugc.aweme.translation.model.d;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.translation.ui.a;
import java.util.ArrayList;

public final class di implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62640a;

    /* renamed from: b  reason: collision with root package name */
    public TranslationStatusView f62641b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f62642c;

    /* renamed from: d  reason: collision with root package name */
    public User f62643d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.translation.a.a f62644e = new com.ss.android.ugc.aweme.translation.a.a(new c(), this);

    /* renamed from: f  reason: collision with root package name */
    public String f62645f;
    private Context g;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62640a, false, 68948, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62640a, false, 68948, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this.g, (Throwable) exc);
        this.f62641b.setStatus(0);
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f62640a, false, 68947, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f62640a, false, 68947, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.f62641b.setStatus(2);
        VideoTranslationCache videoTranslationCache = new VideoTranslationCache();
        videoTranslationCache.f74967b = 2;
        videoTranslationCache.f74966a = dVar.f74981a.toString();
        videoTranslationCache.f74968c = new ArrayList();
        com.ss.android.ugc.aweme.translation.a.a().a(this.f62645f, videoTranslationCache);
        a(this.f62642c, videoTranslationCache.f74966a);
    }

    public final void a(User user) {
        final String str;
        if (PatchProxy.isSupport(new Object[]{user}, this, f62640a, false, 68945, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f62640a, false, 68945, new Class[]{User.class}, Void.TYPE);
            return;
        }
        this.f62643d = user;
        if (!AbTestManager.a().aN() || this.f62641b == null || !com.ss.android.g.a.a()) {
            if (this.f62641b != null) {
                this.f62641b.setVisibility(8);
            }
            return;
        }
        this.f62641b.b();
        this.f62645f = this.f62643d.getSignature();
        VideoTranslationCache a2 = com.ss.android.ugc.aweme.translation.a.a().a(this.f62645f);
        final String appLanguage = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage();
        if (TextUtils.isEmpty(this.f62643d.getSignatureLanguage()) || TextUtils.equals("un", this.f62643d.getSignatureLanguage())) {
            str = this.f62643d.getLanguage();
        } else {
            str = this.f62643d.getSignatureLanguage();
        }
        final String signature = this.f62643d.getSignature();
        if (a2 != null) {
            this.f62641b.setVisibility(0);
            this.f62641b.setStatusWithoutAnim(a2.f74967b);
            if (a2.f74967b == 2) {
                this.f62642c.setText(a2.f74966a);
            }
        } else if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str) || appLanguage.equals(str)) {
            this.f62641b.setVisibility(8);
            return;
        } else {
            this.f62641b.setVisibility(0);
        }
        this.f62641b.setOnTranslationViewClickListener(new TranslationStatusView.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62646a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62646a, false, 68950, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62646a, false, 68950, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.translation.a.a().a(di.this.f62645f).f74967b = 0;
                di.this.a(di.this.f62642c, di.this.f62643d.getSignature());
            }

            public final void a(View view, boolean z) {
                if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62646a, false, 68949, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f62646a, false, 68949, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                VideoTranslationCache a2 = com.ss.android.ugc.aweme.translation.a.a().a(di.this.f62645f);
                if (a2 != null) {
                    di.this.f62641b.setStatus(2);
                    a2.f74967b = 2;
                    di.this.a(di.this.f62642c, a2.f74966a);
                    return;
                }
                di.this.f62644e.a(signature, str, appLanguage);
            }
        });
    }

    public final void a(TextView textView, String str) {
        final TextView textView2 = textView;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{textView2, str2}, this, f62640a, false, 68946, new Class[]{TextView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, str2}, this, f62640a, false, 68946, new Class[]{TextView.class, String.class}, Void.TYPE);
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView2, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62651a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f62651a, false, 68951, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f62651a, false, 68951, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                textView2.setText(str2);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }

    public di(Context context, TranslationStatusView translationStatusView, TextView textView) {
        this.g = context;
        this.f62641b = translationStatusView;
        this.f62642c = textView;
    }
}
