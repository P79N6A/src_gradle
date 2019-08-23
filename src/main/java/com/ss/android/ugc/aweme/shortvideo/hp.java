package com.ss.android.ugc.aweme.shortvideo;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ui.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.ae;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import java.lang.reflect.Type;
import kotlin.Pair;

public final class hp implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68161a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f68162b;

    /* renamed from: c  reason: collision with root package name */
    c f68163c;

    /* renamed from: d  reason: collision with root package name */
    b f68164d;

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f68161a, false, 74859, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f68161a, false, 74859, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ae.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68165a;

                /* renamed from: b  reason: collision with root package name */
                RecordLayout f68166b;

                /* renamed from: c  reason: collision with root package name */
                RecordTitleViewModel f68167c;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f68165a, false, 74863, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68165a, false, 74863, new Class[0], Void.TYPE);
                        return;
                    }
                    hp.this.f68162b.d(false);
                    hp.this.f68164d.k(4);
                    this.f68166b.setVisibility(4);
                    hp.this.f68163c.e(4);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f68165a, false, 74864, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f68165a, false, 74864, new Class[0], Void.TYPE);
                        return;
                    }
                    boolean z = true;
                    hp.this.f68162b.d(true);
                    if (hp.this.f68162b.r().f65401b.n != 0) {
                        z = false;
                    }
                    if (z) {
                        hp.this.f68164d.k(0);
                        hp.this.f68163c.e(8);
                    } else {
                        hp.this.f68163c.e(0);
                    }
                    this.f68166b.setVisibility(0);
                }

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f68165a, false, 74860, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f68165a, false, 74860, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (this.f68166b == null) {
                        this.f68166b = (RecordLayout) hp.this.f68162b.getView().findViewById(C0906R.id.ca_);
                    }
                    ae aeVar = (ae) t;
                    if (aeVar.f74607c == 0 && aeVar.f74608d) {
                        if (PatchProxy.isSupport(new Object[0], this, f68165a, false, 74861, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f68165a, false, 74861, new Class[0], Void.TYPE);
                        } else {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                            alphaAnimation.setDuration(150);
                            alphaAnimation.setAnimationListener(new Animation.AnimationListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68169a;

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (PatchProxy.isSupport(new Object[]{animation}, this, f68169a, false, 74865, new Class[]{Animation.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animation}, this, f68169a, false, 74865, new Class[]{Animation.class}, Void.TYPE);
                                        return;
                                    }
                                    AnonymousClass1.this.a();
                                }
                            });
                            if (this.f68167c == null) {
                                this.f68167c = (RecordTitleViewModel) a.a(hp.this.f68162b.getActivity()).get(RecordTitleViewModel.class);
                            }
                            UIUtils.clearAnimation(hp.this.f68162b.O);
                            hp.this.f68164d.m();
                            UIUtils.clearAnimation(this.f68166b);
                            if (hp.this.f68162b.O != null) {
                                hp.this.f68162b.O.startAnimation(alphaAnimation);
                                this.f68167c.a(new Pair<>(Float.valueOf(1.0f), Float.valueOf(0.0f)));
                            }
                            hp.this.f68164d.a(alphaAnimation);
                            this.f68166b.startAnimation(alphaAnimation);
                        }
                    } else if (aeVar.f74607c == 0) {
                        a();
                    } else if (aeVar.f74607c != 8 || !aeVar.f74608d) {
                        b();
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, f68165a, false, 74862, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f68165a, false, 74862, new Class[0], Void.TYPE);
                        } else {
                            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation2.setDuration(150);
                            alphaAnimation2.setAnimationListener(new Animation.AnimationListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68171a;

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    if (PatchProxy.isSupport(new Object[]{animation}, this, f68171a, false, 74866, new Class[]{Animation.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animation}, this, f68171a, false, 74866, new Class[]{Animation.class}, Void.TYPE);
                                        return;
                                    }
                                    AnonymousClass1.this.b();
                                }
                            });
                            if (this.f68167c == null) {
                                this.f68167c = (RecordTitleViewModel) a.a(hp.this.f68162b.getActivity()).get(RecordTitleViewModel.class);
                            }
                            UIUtils.clearAnimation(hp.this.f68162b.O);
                            hp.this.f68164d.m();
                            UIUtils.clearAnimation(this.f68166b);
                            if (hp.this.f68162b.O != null) {
                                hp.this.f68162b.O.startAnimation(alphaAnimation2);
                                this.f68167c.a(new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f)));
                            }
                            hp.this.f68164d.a(alphaAnimation2);
                            this.f68166b.startAnimation(alphaAnimation2);
                        }
                    }
                }
            };
        }
    }

    public hp(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, c cVar, b bVar) {
        this.f68162b = shortVideoRecordingOperationPanelFragment;
        this.f68163c = cVar;
        this.f68164d = bVar;
    }
}
