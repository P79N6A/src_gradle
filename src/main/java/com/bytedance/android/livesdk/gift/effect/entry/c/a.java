package com.bytedance.android.livesdk.gift.effect.entry.c;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.support.v4.graphics.ColorUtils;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterLevelView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserEnterRankView;
import com.bytedance.android.livesdk.gift.effect.entry.view.UserSpecialEntryView;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.common.utility.Lists;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.LinkedList;
import java.util.ListIterator;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14822a;
    private static final /* synthetic */ a.C0900a k;

    /* renamed from: b  reason: collision with root package name */
    public LinkedList<com.bytedance.android.livesdk.gift.effect.entry.e.a> f14823b;

    /* renamed from: c  reason: collision with root package name */
    public EnterAnimationView f14824c;

    /* renamed from: d  reason: collision with root package name */
    public e f14825d;

    /* renamed from: e  reason: collision with root package name */
    public int f14826e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f14827f;
    public int g;
    private Context h;
    private com.bytedance.android.livesdk.gift.effect.entry.e.a i;
    private int j = ((Integer) LiveSettingKeys.LIVE_MESSAGE_QUEUE_MAX_LENGTH.a()).intValue();

    private ViewGroup c() {
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9444, new Class[0], ViewGroup.class)) {
            return (ViewGroup) PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9444, new Class[0], ViewGroup.class);
        }
        UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) LayoutInflater.from(this.h).inflate(C0906R.layout.aog, this.f14824c, false);
        userSpecialEntryView.setupUi(this.i);
        return userSpecialEntryView;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9454, new Class[0], Void.TYPE);
            return;
        }
        e();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f14822a, true, 9456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f14822a, true, 9456, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("DefaultEntryController.java", a.class);
        k = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.gift.effect.entry.controller.DefaultEntryController", "android.view.View", NotifyType.VIBRATE, "", "void"), 449);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9442, new Class[0], Void.TYPE);
            return;
        }
        ListIterator listIterator = this.f14823b.listIterator();
        while (listIterator.hasNext()) {
            if (!((com.bytedance.android.livesdk.gift.effect.entry.e.a) listIterator.next()).b()) {
                listIterator.previous();
                listIterator.remove();
                return;
            }
        }
        this.f14823b.remove();
    }

    private boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9445, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9445, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Activity activity = null;
        if (this.h instanceof Activity) {
            activity = (Activity) this.h;
        } else if ((this.h instanceof ContextWrapper) && (((ContextWrapper) this.h).getBaseContext() instanceof Activity)) {
            activity = (Activity) ((ContextWrapper) this.h).getBaseContext();
        }
        if (activity == null) {
            return false;
        }
        if (activity.getRequestedOrientation() == 0) {
            z = true;
        }
        return z;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9446, new Class[0], Void.TYPE);
        } else if (!this.f14823b.isEmpty() && this.g <= 0) {
            this.g++;
            this.i = this.f14823b.poll();
            if (this.i != null) {
                as.a aVar = this.i.l;
                if (com.bytedance.android.live.uikit.a.a.a()) {
                    c(this.i);
                } else if (aVar != null && aVar.f16490a == 3) {
                    a(aVar);
                } else if (aVar != null && aVar.f16490a == 2) {
                    b(aVar);
                } else if (aVar != null) {
                    c(aVar);
                } else if (com.bytedance.android.live.uikit.a.a.f()) {
                    c(this.i);
                } else {
                    f();
                }
            }
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f14822a, false, 9451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14822a, false, 9451, new Class[0], Void.TYPE);
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.h).inflate(C0906R.layout.aoe, this.f14824c, false);
        if (d()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f14826e;
            viewGroup.setLayoutParams(marginLayoutParams);
        }
        UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(C0906R.id.dur);
        userEnterLevelView.setUI(this.i);
        userEnterLevelView.setOnClickListener(this);
        UserEnterRankView userEnterRankView = (UserEnterRankView) viewGroup.findViewById(C0906R.id.b9z);
        userEnterRankView.setupUI(this.i);
        userEnterRankView.setOnClickListener(this);
        viewGroup.setX((float) this.f14824c.getWidth());
        viewGroup.setY(0.0f);
        this.f14824c.addView(viewGroup);
        com.bytedance.android.livesdk.gift.effect.entry.f.a.a(viewGroup, new com.bytedance.android.livesdk.gift.effect.entry.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14843a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14843a, false, 9464, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14843a, false, 9464, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f14824c.removeView(viewGroup);
                a.this.g--;
                a.this.a();
            }

            public final void a(Animator animator) {
                float f2;
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14843a, false, 9463, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14843a, false, 9463, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                UserEnterLevelView userEnterLevelView = (UserEnterLevelView) viewGroup.findViewById(C0906R.id.dur);
                if (userEnterLevelView != null) {
                    if (PatchProxy.isSupport(new Object[0], userEnterLevelView, UserEnterLevelView.f14859a, false, 9497, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], userEnterLevelView, UserEnterLevelView.f14859a, false, 9497, new Class[0], Void.TYPE);
                        return;
                    }
                    float f3 = 0.0f;
                    if (userEnterLevelView.u == 2) {
                        float f4 = userEnterLevelView.o;
                        float f5 = userEnterLevelView.p;
                        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, userEnterLevelView, UserEnterLevelView.f14859a, false, 9498, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                            UserEnterLevelView userEnterLevelView2 = userEnterLevelView;
                            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f4), Float.valueOf(f5)}, userEnterLevelView2, UserEnterLevelView.f14859a, false, 9498, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                        } else if (!userEnterLevelView.s) {
                            userEnterLevelView.s = true;
                            userEnterLevelView.f14861c = new Matrix();
                            if (userEnterLevelView.q) {
                                f2 = f4;
                            } else {
                                f2 = -f4;
                            }
                            userEnterLevelView.f14860b = f2 * 3.0f;
                            int color = userEnterLevelView.getResources().getColor(C0906R.color.ai5);
                            float f6 = f4 * 4.0f;
                            int alphaComponent = ColorUtils.setAlphaComponent(color, 180);
                            LinearGradient linearGradient = r11;
                            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f6, 0.0f, alphaComponent, ColorUtils.setAlphaComponent(color, 180), Shader.TileMode.CLAMP);
                            Bitmap createBitmap = Bitmap.createBitmap((int) f6, (int) f5, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            userEnterLevelView.f14862d = new BitmapShader(createBitmap, tileMode, tileMode);
                            float f7 = f4 / 4.0f;
                            float f8 = f5 / 4.0f;
                            float dimension = userEnterLevelView.getResources().getDimension(C0906R.dimen.qu);
                            float dimension2 = userEnterLevelView.getResources().getDimension(C0906R.dimen.qt);
                            float f9 = f7 * 2.0f;
                            float f10 = f8 * 2.0f;
                            float f11 = f9 + dimension;
                            float f12 = f7 * 1.0f;
                            float f13 = f8 * 3.0f;
                            float f14 = 0.0f * f7;
                            float f15 = f14 + dimension;
                            float f16 = f7 * 3.0f;
                            float f17 = f8 * 1.0f;
                            float f18 = dimension + f16;
                            float f19 = 2.0f * f4;
                            float f20 = f4 * 3.0f;
                            canvas.drawPaint(userEnterLevelView.n);
                            userEnterLevelView.m.setShader(linearGradient);
                            userEnterLevelView.m.setStrokeWidth(dimension2);
                            canvas.drawLines(new float[]{f9, f10, f11, f10, f12, f13, f12 + dimension, f13, f14 + f4, f10, f15 + f4, f10, f9 + f4, f13, f11 + f4, f13, f16 + f4, f17, f18 + f4, f17, f14 + f19, f13, f15 + f19, f13, f16 + f19, f17, f19 + f18, f17, f14 + f20, f13, f15 + f20, f13, f16 + f20, f17, f18 + f20, f17}, userEnterLevelView.m);
                            userEnterLevelView.f14862d.setLocalMatrix(userEnterLevelView.l);
                        }
                    } else {
                        if (PatchProxy.isSupport(new Object[0], userEnterLevelView, UserEnterLevelView.f14859a, false, 9499, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], userEnterLevelView, UserEnterLevelView.f14859a, false, 9499, new Class[0], Void.TYPE);
                        } else if (!userEnterLevelView.t) {
                            userEnterLevelView.t = true;
                            int color2 = userEnterLevelView.getResources().getColor(C0906R.color.ai2);
                            int color3 = userEnterLevelView.getResources().getColor(C0906R.color.ai4);
                            int color4 = userEnterLevelView.getResources().getColor(C0906R.color.ai3);
                            userEnterLevelView.j = new Matrix();
                            if (userEnterLevelView.q) {
                                f3 = userEnterLevelView.o;
                            }
                            userEnterLevelView.k = f3;
                            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, userEnterLevelView.o, userEnterLevelView.p, color2, color2, Shader.TileMode.CLAMP);
                            userEnterLevelView.f14863e = linearGradient3;
                            LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, 30.0f, 7.0f, new int[]{color4, color3, color4}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                            userEnterLevelView.f14864f = linearGradient4;
                            userEnterLevelView.g = new ComposeShader(userEnterLevelView.f14863e, userEnterLevelView.f14864f, PorterDuff.Mode.DST_ATOP);
                            userEnterLevelView.h = Bitmap.createBitmap((int) userEnterLevelView.o, (int) userEnterLevelView.p, Bitmap.Config.ARGB_8888);
                            userEnterLevelView.i = new Canvas(userEnterLevelView.h);
                            userEnterLevelView.f14863e.setLocalMatrix(userEnterLevelView.l);
                            userEnterLevelView.f14864f.setLocalMatrix(userEnterLevelView.l);
                            userEnterLevelView.g.setLocalMatrix(userEnterLevelView.l);
                        }
                    }
                    userEnterLevelView.invalidate();
                }
            }
        }).start();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14822a, false, 9455, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14822a, false, 9455, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(k, this, this, view));
        if (!(this.i == null || this.f14825d == null)) {
            this.f14825d.a(this.i.f14847b);
        }
    }

    private void a(as.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14822a, false, 9448, new Class[]{as.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14822a, false, 9448, new Class[]{as.a.class}, Void.TYPE);
            return;
        }
        final ViewGroup c2 = c();
        View findViewById = c2.findViewById(C0906R.id.te);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        if (d()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c2.getLayoutParams();
            marginLayoutParams.bottomMargin = this.f14826e;
            c2.setLayoutParams(marginLayoutParams);
        }
        c2.setX((float) this.f14824c.getWidth());
        c2.setY(0.0f);
        this.f14824c.addView(c2);
        com.bytedance.android.livesdk.gift.effect.entry.f.a.a(c2, new com.bytedance.android.livesdk.gift.effect.entry.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14831a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14831a, false, 9459, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14831a, false, 9459, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f14824c.removeView(c2);
                a.this.g--;
                a.this.a();
            }

            public final void a(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14831a, false, 9458, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14831a, false, 9458, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                UserSpecialEntryView userSpecialEntryView = (UserSpecialEntryView) c2.findViewById(C0906R.id.dus);
                if (userSpecialEntryView != null) {
                    if (PatchProxy.isSupport(new Object[0], userSpecialEntryView, UserSpecialEntryView.f14869a, false, 9518, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], userSpecialEntryView, UserSpecialEntryView.f14869a, false, 9518, new Class[0], Void.TYPE);
                    } else if (!(userSpecialEntryView.f14872c == null || userSpecialEntryView.f14871b == null)) {
                        int width = userSpecialEntryView.f14872c.getWidth() - userSpecialEntryView.f14871b.getWidth();
                        if (width > 0) {
                            ObjectAnimator.ofInt(userSpecialEntryView.f14871b, "scrollX", new int[]{0, width}).setDuration((long) userSpecialEntryView.f14873d).start();
                        }
                    }
                }
            }
        }, aVar.f16495f).start();
    }

    private void b(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        com.bytedance.android.livesdk.gift.effect.entry.e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f14822a, false, 9443, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14822a, false, 9443, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
            return;
        }
        ListIterator listIterator = this.f14823b.listIterator();
        while (listIterator.hasNext()) {
            if (!((com.bytedance.android.livesdk.gift.effect.entry.e.a) listIterator.next()).b()) {
                listIterator.previous();
                listIterator.add(aVar2);
                return;
            }
        }
        listIterator.add(aVar2);
    }

    private void c(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14822a, false, 9447, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14822a, false, 9447, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
        } else if (this.f14824c != null && this.f14824c.getContext() != null && aVar != null && aVar.a()) {
            final com.bytedance.android.livesdk.gift.effect.entry.view.b bVar = new com.bytedance.android.livesdk.gift.effect.entry.view.b(this.f14824c.getContext());
            bVar.a(aVar);
            bVar.setX((float) this.f14824c.getWidth());
            bVar.setY(0.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 80;
            this.f14824c.addView(bVar, layoutParams);
            if (d()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bVar.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f14826e;
                bVar.setLayoutParams(marginLayoutParams);
            }
            this.f14827f = com.bytedance.android.livesdk.gift.effect.entry.f.a.a(bVar, new com.bytedance.android.livesdk.gift.effect.entry.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14828a;

                public final void a(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f14828a, false, 9457, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f14828a, false, 9457, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.f14824c.removeView(bVar);
                    a.this.g--;
                    a.this.a();
                }
            });
            this.f14827f.start();
        }
    }

    private void b(as.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14822a, false, 9449, new Class[]{as.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14822a, false, 9449, new Class[]{as.a.class}, Void.TYPE);
        } else if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.h).inflate(C0906R.layout.aof, this.f14824c, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0906R.id.big);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C0906R.id.ai_);
            if (d()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f14826e;
                viewGroup3.setLayoutParams(marginLayoutParams);
            }
            viewGroup2.setVisibility(0);
            viewGroup3.setVisibility(8);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(C0906R.id.azl);
            HSImageView hSImageView2 = (HSImageView) viewGroup.findViewById(C0906R.id.azm);
            final TextView textView = (TextView) viewGroup.findViewById(C0906R.id.d_0);
            if (aVar.f16493d == 1) {
                hSImageView.setVisibility(0);
                k.a(hSImageView, this.i.f14850e);
            } else {
                hSImageView.setVisibility(8);
            }
            if (aVar.f16491b != null && !Lists.isEmpty(aVar.f16491b.getUrls())) {
                hSImageView2.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(aVar.f16491b.getUrls().get(0))).setAutoPlayAnimations(true)).build());
            }
            a(textView, aVar);
            textView.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14834a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f14834a, false, 9460, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f14834a, false, 9460, new Class[0], Void.TYPE);
                        return;
                    }
                    textView.setSelected(true);
                }
            });
            viewGroup.setX((float) this.f14824c.getWidth());
            viewGroup.setY(0.0f);
            this.f14824c.addView(viewGroup);
            com.bytedance.android.livesdk.gift.effect.entry.f.a.a(viewGroup, new com.bytedance.android.livesdk.gift.effect.entry.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14837a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f14837a, false, 9461, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f14837a, false, 9461, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.f14824c.removeView(viewGroup);
                    a.this.g--;
                    a.this.a();
                }
            }, 40.0f, -40.0f).start();
        }
    }

    private void c(as.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14822a, false, 9450, new Class[]{as.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14822a, false, 9450, new Class[]{as.a.class}, Void.TYPE);
        } else if (aVar != null) {
            final ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.h).inflate(C0906R.layout.aof, this.f14824c, false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0906R.id.big);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C0906R.id.ai_);
            if (d()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup3.getLayoutParams();
                marginLayoutParams.bottomMargin = this.f14826e;
                viewGroup3.setLayoutParams(marginLayoutParams);
            }
            viewGroup2.setVisibility(8);
            viewGroup3.setVisibility(0);
            HSImageView hSImageView = (HSImageView) viewGroup.findViewById(C0906R.id.b58);
            TextView textView = (TextView) viewGroup.findViewById(C0906R.id.dja);
            if (aVar.f16494e != null && !Lists.isEmpty(aVar.f16494e.getUrls())) {
                hSImageView.setController(((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(aVar.f16494e.getUrls().get(0))).setAutoPlayAnimations(true)).build());
            }
            a(textView, aVar);
            textView.setSelected(true);
            viewGroup.setX((float) this.f14824c.getWidth());
            viewGroup.setY(0.0f);
            this.f14824c.addView(viewGroup);
            com.bytedance.android.livesdk.gift.effect.entry.f.a.a(viewGroup, new com.bytedance.android.livesdk.gift.effect.entry.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14840a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f14840a, false, 9462, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f14840a, false, 9462, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.f14824c.removeView(viewGroup);
                    a.this.g--;
                    a.this.a();
                }
            }).start();
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14822a, false, 9441, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14822a, false, 9441, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
            return;
        }
        if (aVar.b()) {
            b(aVar);
        } else {
            this.f14823b.add(aVar);
        }
        if (this.f14823b.size() > this.j) {
            b();
        }
        e();
    }

    public a(Context context, EnterAnimationView enterAnimationView) {
        this.h = context;
        this.f14824c = enterAnimationView;
        this.f14823b = new LinkedList<>();
    }

    private void a(TextView textView, as.a aVar) {
        TextView textView2 = textView;
        as.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{textView2, aVar2}, this, f14822a, false, 9452, new Class[]{TextView.class, as.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, aVar2}, this, f14822a, false, 9452, new Class[]{TextView.class, as.a.class}, Void.TYPE);
        } else if (aVar2 != null && textView2 != null) {
            com.bytedance.android.livesdkapi.h.e eVar = aVar2.f16492c;
            String str = null;
            String str2 = eVar.f18783b;
            if (eVar.f18782a != null) {
                str = com.bytedance.android.livesdk.i18n.b.a().a(eVar.f18782a);
            }
            if (!(str == null && str2 == null)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                textView2.setText(y.a(str, eVar));
            }
        }
    }
}
