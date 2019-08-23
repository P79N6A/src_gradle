package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerItemDecoration;
import com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter;
import com.ss.android.ugc.aweme.feed.ui.masklayer.a;
import com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoActivity;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.Map;

public class DisLikeAwemeLayout extends FrameLayout implements WeakHandler.IHandler, aa<ar>, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46123a;
    public static int n = 0;
    private static final float o = ((float) com.ss.android.ugc.aweme.feed.ui.masklayer.a.f46695b);
    private static boolean w = false;
    private static boolean y = false;
    private Exception A;
    private int B;
    private int C;
    private int D;
    private boolean E;

    /* renamed from: b  reason: collision with root package name */
    public Context f46124b;

    /* renamed from: c  reason: collision with root package name */
    public a f46125c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView f46126d;

    /* renamed from: e  reason: collision with root package name */
    public View f46127e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f46128f;
    public View g;
    public View h;
    public View i;
    public TextView j;
    protected WeakHandler k;
    public String l;
    public boolean m;
    private View p;
    private Activity q;
    private MaskLayerOptionsAdapter r;
    private TextView s;
    private RemoteImageView t;
    private LinearLayout u;
    private ValueAnimator v;
    private AnimatorListenerAdapter x;
    private com.ss.android.ugc.aweme.similarvideo.a.a z;

    public interface a {
        void a(boolean z);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public MaskLayerOptionsAdapter getAdapter() {
        return this.r;
    }

    public final String a(boolean z2) {
        return this.l;
    }

    public void setInDislikeMode(boolean z2) {
        this.m = z2;
    }

    public void setListener(a aVar) {
        this.f46125c = aVar;
    }

    public DisLikeAwemeLayout(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46123a, false, 42497, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46123a, false, 42497, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.m) {
            return false;
        } else {
            requestDisallowInterceptTouchEvent(true);
            return super.onTouchEvent(motionEvent);
        }
    }

    public final void b(boolean z2) {
        ObjectAnimator objectAnimator;
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f46123a, false, 42501, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f46123a, false, 42501, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(0.0f, 0.0f);
        w = false;
        y = false;
        if (this.k.hasMessages(1)) {
            this.k.removeMessages(1);
        }
        if (this.v != null) {
            this.v.removeListener(this.x);
            this.v.cancel();
            this.v = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.p, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.u, "alpha", new float[]{1.0f, 0.0f});
        ofFloat2.setDuration(200);
        if (this.E) {
            objectAnimator = ObjectAnimator.ofFloat(this.u, "translationY", new float[]{0.0f, o});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.u, "translationY", new float[]{o, 0.0f});
        }
        objectAnimator.setDuration(250);
        if (!a.C0563a.a()) {
            objectAnimator.setInterpolator(new b());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46134a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f46134a, false, 42509, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f46134a, false, 42509, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DisLikeAwemeLayout.this.f46126d.setVisibility(8);
                DisLikeAwemeLayout.this.f46127e.setVisibility(8);
                DisLikeAwemeLayout.this.g.setVisibility(8);
                DisLikeAwemeLayout.this.i.setVisibility(8);
                DisLikeAwemeLayout.this.h.setVisibility(8);
                DisLikeAwemeLayout.this.setVisibility(8);
                super.onAnimationEnd(animator);
            }
        });
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f46123a, false, 42491, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f46123a, false, 42491, new Class[]{Message.class}, Void.TYPE);
        } else if (getVisibility() == 0 || w) {
            if (message != null && message.what == 1) {
                y = true;
                if (this.z != null) {
                    a(this.z.f71502a, this.z.f71503b);
                    this.z = null;
                } else if (this.A != null) {
                    a(false, (UrlModel) null);
                }
            }
            if (message.obj instanceof Exception) {
                this.A = (Exception) message.obj;
                if (y) {
                    a(false, (UrlModel) null);
                }
                return;
            }
            if (message.obj instanceof com.ss.android.ugc.aweme.similarvideo.a.a) {
                this.z = (com.ss.android.ugc.aweme.similarvideo.a.a) message.obj;
                if (y) {
                    a(this.z.f71502a, this.z.f71503b);
                    this.z = null;
                }
            }
        }
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(final boolean z2, UrlModel urlModel) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), urlModel}, this, f46123a, false, 42505, new Class[]{Boolean.TYPE, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), urlModel}, this, f46123a, false, 42505, new Class[]{Boolean.TYPE, UrlModel.class}, Void.TYPE);
            return;
        }
        y = false;
        if (this.v != null) {
            this.v.removeListener(this.x);
            this.v.cancel();
            this.v = null;
        }
        if (z2) {
            d a2 = new d().a("enter_from", this.l);
            if (this.f46128f == null) {
                str = "";
            } else {
                str = this.f46128f.getAid();
            }
            r.a("similar_videos", (Map) a2.a("group_id", str).a("action_type", "show").f34114b);
        }
        if (z2) {
            if (urlModel != null) {
                com.ss.android.ugc.aweme.base.c.b(this.t, urlModel);
            } else {
                this.t.setImageResource(2130840456);
            }
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46140a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f46140a, false, 42512, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f46140a, false, 42512, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DisLikeAwemeLayout.this.g.setVisibility(8);
                if (z2) {
                    DisLikeAwemeLayout.this.i.setAlpha(0.0f);
                    DisLikeAwemeLayout.this.i.setVisibility(0);
                    return;
                }
                DisLikeAwemeLayout.this.h.setAlpha(0.0f);
                DisLikeAwemeLayout.this.h.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        if (z2) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.i, "alpha", new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat2);
        } else {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.h, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setDuration(200);
            animatorSet.play(ofFloat).before(ofFloat3);
        }
        animatorSet.start();
    }

    private void a(float f2, float f3) {
        p pVar;
        double d2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f46123a, false, 42498, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f46123a, false, 42498, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.p == null && getChildCount() == 0) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f46123a, false, 42496, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f46123a, false, 42496, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            View.inflate(this.f46124b, C0906R.layout.l3, this);
            if (PatchProxy.isSupport(new Object[0], this, f46123a, false, 42492, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46123a, false, 42492, new Class[0], Void.TYPE);
            } else {
                this.p = findViewById(C0906R.id.a5k);
                this.f46126d = (RecyclerView) findViewById(C0906R.id.cow);
                this.s = (TextView) findViewById(C0906R.id.cox);
                this.f46127e = findViewById(C0906R.id.a5r);
                this.f46127e.setVisibility(8);
                this.g = findViewById(C0906R.id.aed);
                this.u = (LinearLayout) findViewById(C0906R.id.blx);
                if (a.C0563a.a()) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f46126d.getLayoutParams());
                    layoutParams.gravity = 17;
                    layoutParams.topMargin = 0;
                    this.f46126d.setLayoutParams(layoutParams);
                } else {
                    v.b((View) this.s, 0);
                    if (com.ss.android.g.a.a()) {
                        this.s.setTextColor(ContextCompat.getColor(this.f46124b, C0906R.color.uj));
                    }
                }
                setOnClickListener(new h(this));
            }
            if (PatchProxy.isSupport(new Object[0], this, f46123a, false, 42493, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46123a, false, 42493, new Class[0], Void.TYPE);
            } else {
                this.g.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return true;
                    }
                });
                this.g.setVisibility(8);
                this.j = (TextView) findViewById(C0906R.id.aef);
                this.i = findViewById(C0906R.id.aeb);
                this.i.setVisibility(8);
                this.i.setOnTouchListener(new View.OnTouchListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46130a;

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f46130a, false, 42507, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f46130a, false, 42507, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        if (motionEvent.getAction() == 0) {
                            DisLikeAwemeLayout disLikeAwemeLayout = DisLikeAwemeLayout.this;
                            if (PatchProxy.isSupport(new Object[0], disLikeAwemeLayout, DisLikeAwemeLayout.f46123a, false, 42503, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], disLikeAwemeLayout, DisLikeAwemeLayout.f46123a, false, 42503, new Class[0], Void.TYPE);
                            } else {
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(disLikeAwemeLayout.i, "alpha", new float[]{1.0f, 0.75f});
                                ofFloat.setDuration(150);
                                ofFloat.start();
                            }
                        }
                        return false;
                    }
                });
                this.i.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46132a;

                    public final void onClick(View view) {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{view}, this, f46132a, false, 42508, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f46132a, false, 42508, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (DisLikeAwemeLayout.this.f46125c != null) {
                            DisLikeAwemeLayout.this.f46125c.a(false);
                        }
                        Context context = DisLikeAwemeLayout.this.f46124b;
                        Aweme aweme = DisLikeAwemeLayout.this.f46128f;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, SimilarVideoActivity.f71522a, true, 81625, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, SimilarVideoActivity.f71522a, true, 81625, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                        } else if (!(context == null || aweme == null)) {
                            SimilarVideoActivity.f71524c = (Activity) context;
                            Intent intent = new Intent(context, SimilarVideoActivity.class);
                            intent.putExtra("aweme_to_similar", aweme);
                            context.startActivity(intent);
                            SimilarVideoActivity.f71524c.overridePendingTransition(C0906R.anim.r, 0);
                        }
                        d a2 = new d().a("enter_from", DisLikeAwemeLayout.this.l);
                        if (DisLikeAwemeLayout.this.f46128f == null) {
                            str = "";
                        } else {
                            str = DisLikeAwemeLayout.this.f46128f.getAid();
                        }
                        r.a("similar_videos", (Map) a2.a("group_id", str).a("action_type", "click").f34114b);
                    }
                });
                this.t = (RemoteImageView) findViewById(C0906R.id.cj3);
                this.h = findViewById(C0906R.id.aec);
                this.h.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f46123a, false, 42494, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f46123a, false, 42494, new Class[0], Void.TYPE);
                return;
            }
            if (a.C0563a.a()) {
                this.f46126d.setLayoutManager(new WrapLinearLayoutManager(this.f46124b, 1, false));
                this.f46126d.addItemDecoration(new MaskLayerItemDecoration(1, 16));
            } else {
                this.f46126d.setLayoutManager(new WrapLinearLayoutManager(this.f46124b, 0, false));
                this.f46126d.addItemDecoration(new MaskLayerItemDecoration(0, 12));
            }
            this.f46126d.setItemAnimator(new DefaultItemAnimator());
            Context context = this.f46124b;
            if (PatchProxy.isSupport(new Object[0], this, f46123a, false, 42495, new Class[0], p.class)) {
                pVar = (p) PatchProxy.accessDispatch(new Object[0], this, f46123a, false, 42495, new Class[0], p.class);
            } else if (com.ss.android.g.a.a()) {
                com.ss.android.ugc.aweme.forward.e.a.a();
                pVar = new p();
            } else {
                pVar = new p(this.q, this, this.l, 0, com.ss.android.ugc.aweme.forward.e.a.a());
            }
            this.r = new MaskLayerOptionsAdapter(context, pVar);
            this.r.h = this.f46125c;
            this.f46126d.setAdapter(this.r);
            if (com.ss.android.g.a.a()) {
                d2 = 230.0d;
            } else {
                d2 = 210.0d;
            }
            this.D = u.a(d2);
            this.B = u.a(60.0d);
            this.C = this.f46124b.getResources().getDisplayMetrics().heightPixels - this.B;
        }
    }

    public DisLikeAwemeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.E = true;
        this.f46124b = context;
        this.q = (Activity) this.f46124b;
        this.k = new WeakHandler(Looper.getMainLooper(), this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r23, float r24, java.lang.String r25, com.ss.android.ugc.aweme.feed.model.Aweme r26) {
        /*
            r22 = this;
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Float r1 = java.lang.Float.valueOf(r23)
            r11 = 0
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r24)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r8
            r14 = 3
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42499(0xa603, float:5.9554E-41)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Float r1 = java.lang.Float.valueOf(r23)
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r24)
            r0[r12] = r1
            r0[r13] = r8
            r0[r14] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42499(0xa603, float:5.9554E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0071:
            android.app.Activity r0 = r7.q
            if (r0 == 0) goto L_0x0086
            android.app.Activity r0 = r7.q
            java.lang.String r1 = "vibrator"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            if (r0 == 0) goto L_0x0086
            r1 = 15
            r0.vibrate(r1)
        L_0x0086:
            r7.f46128f = r9
            r7.l = r8
            java.lang.String r0 = "homepage_follow"
            boolean r0 = android.text.TextUtils.equals(r8, r0)
            if (r0 == 0) goto L_0x0094
            r8 = 0
            goto L_0x009f
        L_0x0094:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            boolean r0 = r0.correlatedVideosSearch
            r8 = r0
        L_0x009f:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x00a7
            if (r8 != 0) goto L_0x00ad
        L_0x00a7:
            boolean r0 = com.ss.android.ugc.aweme.feed.ui.masklayer.a.C0563a.a()
            if (r0 == 0) goto L_0x00de
        L_0x00ad:
            android.content.Context r0 = r22.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r0 = r0 / r13
            r1 = 4637089135075524608(0x405a400000000000, double:105.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            int r0 = r0 + r3
            float r0 = (float) r0
            android.content.Context r3 = r22.getContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.heightPixels
            int r3 = r3 / r13
            int r1 = com.ss.android.ugc.aweme.base.utils.u.a((double) r1)
            int r3 = r3 + r1
            float r1 = (float) r3
            r9 = r1
            goto L_0x00e2
        L_0x00de:
            r0 = r23
            r9 = r24
        L_0x00e2:
            w = r12
            r7.a((float) r0, (float) r9)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42500(0xa604, float:5.9555E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x010e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42500(0xa604, float:5.9555E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0351
        L_0x010e:
            com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter r0 = r7.r
            if (r0 == 0) goto L_0x0351
            com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter r0 = r7.r
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f46128f
            java.lang.String r2 = r7.l
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r15[r11] = r1
            r15[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43381(0xa975, float:6.079E-41)
            java.lang.Class[] r3 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r3[r11] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r12] = r4
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r3 == 0) goto L_0x015d
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r15[r11] = r1
            r15[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43381(0xa975, float:6.079E-41)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r1[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r12] = r2
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0351
        L_0x015d:
            r0.f46688e = r1
            r0.g = r2
            com.ss.android.ugc.aweme.feed.ui.p r1 = r0.f46686c
            if (r1 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.feed.ui.p r1 = r0.f46686c
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            r1.f46811c = r2
        L_0x016b:
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43383(0xa977, float:6.0793E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x0198
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43383(0xa977, float:6.0793E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x024f
        L_0x0198:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            boolean r1 = com.ss.android.ugc.aweme.utils.bj.a(r1)
            if (r1 == 0) goto L_0x01bd
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x01ea
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            java.util.List r1 = r1.getImageInfos()
            if (r1 == 0) goto L_0x01ea
            android.content.Context r1 = r0.f46685b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = com.ss.android.ugc.aweme.feed.share.i.c(r1, r2, r3)
            r0.f46687d = r1
            goto L_0x01ea
        L_0x01bd:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x01ea
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            if (r1 == 0) goto L_0x01ea
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x01e0
            android.content.Context r1 = r0.f46685b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r3 = r0.g
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = com.ss.android.ugc.aweme.feed.share.i.b(r1, r2, r3)
            r0.f46687d = r1
            goto L_0x01ea
        L_0x01e0:
            android.content.Context r1 = r0.f46685b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r1, (com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            r0.f46687d = r1
        L_0x01ea:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            if (r1 != 0) goto L_0x01f5
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r1.<init>()
            r0.f46687d = r1
        L_0x01f5:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            r1.authorId = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            java.lang.String r2 = r0.g
            r1.enterFrom = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.o(r2)
            r1.contentType = r2
            java.lang.String r1 = r0.g
            boolean r1 = com.ss.android.ugc.aweme.u.aa.c((java.lang.String) r1)
            if (r1 == 0) goto L_0x022b
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.e((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            r1.poiId = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.h(r2)
            r1.poiType = r2
        L_0x022b:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.a()
            r1.cityInfo = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            java.lang.String r2 = com.ss.android.ugc.aweme.u.aa.i(r2)
            r1.distnceInfo = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r0.f46687d
            com.ss.android.ugc.aweme.feed.ai r2 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
            java.lang.String r2 = r2.a((java.lang.String) r3)
            r1.logPb = r2
        L_0x024f:
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43382(0xa976, float:6.0791E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x027c
            java.lang.Object[] r15 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter.f46684a
            r18 = 0
            r19 = 43382(0xa976, float:6.0791E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r0
            r20 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0351
        L_0x027c:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            if (r1 == 0) goto L_0x0351
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            int r1 = r1.getAwemeType()
            r2 = 13
            if (r1 == r2) goto L_0x0351
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            if (r1 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r1 = r1.getUid()
            boolean r1 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x02ae
            java.lang.String r1 = r0.g
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x02ae
            r1 = 1
            goto L_0x02af
        L_0x02ae:
            r1 = 0
        L_0x02af:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 == 0) goto L_0x02bc
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            boolean r2 = com.ss.android.ugc.aweme.utils.u.f(r2)
            goto L_0x030f
        L_0x02bc:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            boolean r2 = com.ss.android.ugc.aweme.report.b.b(r2)
            if (r2 != 0) goto L_0x02ce
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.f46688e
            boolean r2 = com.ss.android.ugc.aweme.report.b.a(r2)
            if (r2 != 0) goto L_0x02ce
            r2 = 1
            goto L_0x02cf
        L_0x02ce:
            r2 = 0
        L_0x02cf:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            int r3 = r3.getDistributeType()
            if (r3 != r13) goto L_0x02ea
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            com.ss.android.ugc.aweme.feed.model.VideoControl r3 = r3.getVideoControl()
            if (r3 == 0) goto L_0x02ea
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            com.ss.android.ugc.aweme.feed.model.VideoControl r3 = r3.getVideoControl()
            int r3 = r3.preventDownloadType
            if (r3 != r12) goto L_0x02ea
            r2 = 0
        L_0x02ea:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x030f
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.f46688e
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            java.lang.String r3 = r3.getUid()
            boolean r3 = com.ss.android.ugc.aweme.share.cg.a((java.lang.String) r3)
            if (r3 != 0) goto L_0x030f
            java.lang.String r3 = r0.g
            java.lang.String r4 = "homepage_follow"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x030f
            r3 = r2
            r2 = 1
            goto L_0x0311
        L_0x030f:
            r3 = r2
            r2 = 0
        L_0x0311:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r4 = r0.f46689f
            r4.clear()
            if (r3 == 0) goto L_0x0321
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r3 = r0.f46689f
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r4 = r0.a((int) r12)
            r3.add(r4)
        L_0x0321:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r3 = r0.f46689f
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r4 = r0.a((int) r13)
            r3.add(r4)
            if (r1 == 0) goto L_0x0345
            boolean r1 = com.ss.android.ugc.aweme.feed.ui.masklayer.a.C0563a.a()
            if (r1 == 0) goto L_0x033c
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r1 = r0.f46689f
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r3 = r0.a((int) r14)
            r1.add(r11, r3)
            goto L_0x0345
        L_0x033c:
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r1 = r0.f46689f
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r3 = r0.a((int) r14)
            r1.add(r3)
        L_0x0345:
            if (r2 == 0) goto L_0x0351
            java.util.List<com.ss.android.ugc.aweme.feed.model.MaskLayerOption> r1 = r0.f46689f
            r2 = 5
            com.ss.android.ugc.aweme.feed.model.MaskLayerOption r0 = r0.a((int) r2)
            r1.add(r0)
        L_0x0351:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.widget.LinearLayout r1 = r7.u
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0.<init>(r1)
            boolean r1 = com.ss.android.ugc.aweme.feed.ui.masklayer.a.C0563a.a()
            if (r1 == 0) goto L_0x036a
            r0.setMargins(r11, r11, r11, r11)
            r1 = 17
            r0.gravity = r1
            goto L_0x0389
        L_0x036a:
            int r1 = (int) r9
            int r2 = r7.D
            int r2 = r1 - r2
            int r3 = r7.B
            if (r2 >= r3) goto L_0x0376
            r7.E = r11
            goto L_0x0386
        L_0x0376:
            int r1 = r7.C
            int r3 = r7.D
            int r1 = r1 - r3
            if (r2 <= r1) goto L_0x0383
            int r1 = r7.C
            int r2 = r7.D
            int r1 = r1 - r2
            goto L_0x0384
        L_0x0383:
            r1 = r2
        L_0x0384:
            r7.E = r12
        L_0x0386:
            r0.setMargins(r11, r1, r11, r11)
        L_0x0389:
            android.widget.LinearLayout r1 = r7.u
            r1.setLayoutParams(r0)
            android.support.v7.widget.RecyclerView r0 = r7.f46126d
            r0.setVisibility(r11)
            r7.setVisibility(r11)
            boolean r0 = com.ss.android.ugc.aweme.feed.ui.masklayer.a.C0563a.a()
            if (r0 == 0) goto L_0x039f
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x03a1
        L_0x039f:
            r0 = 300(0x12c, float:4.2E-43)
        L_0x03a1:
            android.view.View r1 = r7.p
            java.lang.String r2 = "alpha"
            float[] r3 = new float[r13]
            r3 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
            r2 = 150(0x96, double:7.4E-322)
            r1.setDuration(r2)
            android.widget.LinearLayout r2 = r7.u
            java.lang.String r3 = "alpha"
            float[] r4 = new float[r13]
            r4 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            long r3 = (long) r0
            r2.setDuration(r3)
            boolean r0 = r7.E
            r9 = 0
            if (r0 == 0) goto L_0x03da
            android.widget.LinearLayout r0 = r7.u
            java.lang.String r5 = "translationY"
            float[] r6 = new float[r13]
            float r10 = o
            r6[r11] = r10
            r6[r12] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r6)
            goto L_0x03ea
        L_0x03da:
            android.widget.LinearLayout r0 = r7.u
            java.lang.String r5 = "translationY"
            float[] r6 = new float[r13]
            r6[r11] = r9
            float r10 = o
            r6[r12] = r10
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r5, r6)
        L_0x03ea:
            r0.setDuration(r3)
            boolean r3 = com.ss.android.ugc.aweme.feed.ui.masklayer.a.C0563a.a()
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto L_0x0401
            android.view.animation.OvershootInterpolator r3 = new android.view.animation.OvershootInterpolator
            r4 = 1065688760(0x3f851eb8, float:1.04)
            r3.<init>(r4)
            r0.setInterpolator(r3)
            goto L_0x040e
        L_0x0401:
            com.ss.android.ugc.aweme.shortvideo.au r3 = new com.ss.android.ugc.aweme.shortvideo.au
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r5 = 1048576000(0x3e800000, float:0.25)
            r3.<init>(r5, r4, r5, r10)
            r0.setInterpolator(r3)
        L_0x040e:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.AnimatorSet$Builder r1 = r3.play(r1)
            android.animation.AnimatorSet$Builder r0 = r1.with(r0)
            r0.with(r2)
            r3.start()
            android.content.Context r0 = r7.f46124b
            boolean r0 = com.ss.android.ad.splash.utils.NetworkUtils.b(r0)
            if (r0 == 0) goto L_0x04f4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46128f
            if (r0 == 0) goto L_0x04f4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46128f
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x04f4
            if (r8 == 0) goto L_0x04f4
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x04f4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42504(0xa608, float:5.9561E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0463
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42504(0xa608, float:5.9561E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04b3
        L_0x0463:
            android.view.View r0 = r7.f46127e
            r0.setVisibility(r11)
            android.view.View r0 = r7.h
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r7.h
            r0.setAlpha(r9)
            android.view.View r0 = r7.i
            r0.setVisibility(r1)
            android.view.View r0 = r7.i
            r0.setAlpha(r9)
            android.view.View r0 = r7.g
            r0.setVisibility(r11)
            android.view.View r0 = r7.g
            r0.setAlpha(r10)
            int[] r0 = new int[r13]
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r7.v = r0
            android.animation.ValueAnimator r0 = r7.v
            r1 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r7.v
            r1 = -1
            r0.setRepeatCount(r1)
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout$6 r0 = new com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout$6
            r0.<init>()
            r7.x = r0
            android.animation.ValueAnimator r0 = r7.v
            android.animation.AnimatorListenerAdapter r1 = r7.x
            r0.addListener(r1)
            android.animation.ValueAnimator r0 = r7.v
            r0.start()
        L_0x04b3:
            y = r11
            com.bytedance.common.utility.collection.WeakHandler r0 = r7.k
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.sendEmptyMessageDelayed(r12, r1)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42502(0xa606, float:5.9558E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04e2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f46123a
            r3 = 0
            r4 = 42502(0xa606, float:5.9558E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x04e2:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46128f
            if (r0 == 0) goto L_0x04f4
            com.ss.android.ugc.aweme.base.m r0 = com.ss.android.ugc.aweme.base.m.a()
            com.bytedance.common.utility.collection.WeakHandler r1 = r7.k
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout$5 r2 = new com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout$5
            r2.<init>()
            r0.a(r1, r2, r11)
        L_0x04f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout.a(float, float, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
