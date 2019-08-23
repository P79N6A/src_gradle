package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.Observer;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.GuardApi;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.e.x;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.event.al;
import com.bytedance.android.livesdk.chatroom.model.p;
import com.bytedance.android.livesdk.chatroom.model.q;
import com.bytedance.android.livesdk.chatroom.model.s;
import com.bytedance.android.livesdk.chatroom.presenter.f;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.l;
import com.bytedance.android.livesdk.rank.DailyRankDialog;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Locale;
import java.util.Map;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public class DailyRankWidget extends LiveRecyclableWidget implements Observer<KVData>, View.OnClickListener, f.a {
    private static final /* synthetic */ a.C0900a F;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12420a;
    private boolean A;
    private boolean B;
    private int C;
    private CharSequence D;
    private int E;

    /* renamed from: b  reason: collision with root package name */
    public View f12421b;

    /* renamed from: c  reason: collision with root package name */
    public View f12422c;

    /* renamed from: d  reason: collision with root package name */
    public View f12423d;

    /* renamed from: e  reason: collision with root package name */
    public View f12424e;

    /* renamed from: f  reason: collision with root package name */
    public View f12425f;
    public boolean g;
    f h;
    public b i;
    public b j;
    public int k;
    public CharSequence l;
    public int m;
    public AnimatorSet n;
    public AnimatorSet o;
    public boolean p;
    public boolean q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private ImageView v;
    private DailyRankDialog w;
    private Room x;
    private boolean y;
    private boolean z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12448a;

        /* renamed from: b  reason: collision with root package name */
        int f12449b;

        /* renamed from: c  reason: collision with root package name */
        int f12450c;

        /* renamed from: d  reason: collision with root package name */
        public View f12451d;

        /* renamed from: e  reason: collision with root package name */
        public View f12452e;

        /* renamed from: f  reason: collision with root package name */
        public Runnable f12453f;
        private boolean h;
        private int i = 150;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f12448a, false, 6711, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12448a, false, 6711, new Class[0], Void.TYPE);
                return;
            }
            int height = this.f12451d.getHeight();
            int width = this.f12451d.getWidth();
            if (Build.VERSION.SDK_INT >= 16) {
                this.f12451d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                this.f12451d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            this.f12451d.setVisibility(8);
            if (this.h) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f12448a, false, 6712, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f12448a, false, 6712, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    if (DailyRankWidget.this.isViewValid()) {
                        if (this.f12449b <= 0 || this.f12449b >= width || this.f12450c <= 0 || this.f12450c >= height) {
                            DailyRankWidget.this.f();
                            DailyRankWidget.this.b(8);
                            DailyRankWidget.this.f12425f.setVisibility(0);
                            if (this.f12453f != null) {
                                this.f12453f.run();
                            }
                        } else {
                            int i2 = width - this.f12449b;
                            int i3 = height - this.f12450c;
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 10});
                            ofInt.addUpdateListener(new v(this, i2, i3));
                            ofInt.addListener(new AnimatorListenerAdapter() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f12454a;

                                public final void onAnimationEnd(Animator animator) {
                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12454a, false, 6716, new Class[]{Animator.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12454a, false, 6716, new Class[]{Animator.class}, Void.TYPE);
                                        return;
                                    }
                                    if (DailyRankWidget.this.isViewValid()) {
                                        a.this.f12451d.setVisibility(0);
                                        a.this.f12452e.getLayoutParams().width = -2;
                                        a.this.f12452e.getLayoutParams().height = -2;
                                    }
                                    if (a.this.f12453f != null) {
                                        a.this.f12453f.run();
                                    }
                                }
                            });
                            ofInt.setDuration((long) this.i).start();
                        }
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f12448a, false, 6713, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f12448a, false, 6713, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (DailyRankWidget.this.isViewValid()) {
                    if (this.f12449b <= 0 || this.f12449b <= width || this.f12450c <= 0 || this.f12450c <= height) {
                        DailyRankWidget.this.f12425f.setVisibility(8);
                        DailyRankWidget.this.b(0);
                        DailyRankWidget.this.e();
                        if (this.f12453f != null) {
                            this.f12453f.run();
                        }
                    } else {
                        int i4 = this.f12449b - width;
                        int i5 = this.f12450c - height;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{1, 10});
                        ofInt2.addUpdateListener(new w(this, i4, i5));
                        ofInt2.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12456a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f12456a, false, 6717, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f12456a, false, 6717, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (DailyRankWidget.this.isViewValid()) {
                                    a.this.f12451d.setVisibility(0);
                                    a.this.f12452e.getLayoutParams().width = -2;
                                    a.this.f12452e.getLayoutParams().height = -2;
                                }
                                if (a.this.f12453f != null) {
                                    a.this.f12453f.run();
                                }
                            }
                        });
                        ofInt2.setDuration((long) this.i).start();
                    }
                }
            }
        }

        a(int i2, int i3, View view, View view2, boolean z, Runnable runnable) {
            this.f12449b = i2;
            this.f12450c = i3;
            this.f12451d = view;
            this.f12452e = view2;
            this.h = z;
            this.f12453f = runnable;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12458a;

        /* renamed from: b  reason: collision with root package name */
        TextView f12459b;

        /* renamed from: c  reason: collision with root package name */
        View f12460c;

        /* renamed from: d  reason: collision with root package name */
        CharSequence f12461d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f12462e;

        /* renamed from: f  reason: collision with root package name */
        public int f12463f = -1;
        ObjectAnimator g;
        ObjectAnimator h;
        ObjectAnimator i;
        public a j;
        long k;
        int l;

        interface a {
            void a();
        }

        private void e() {
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6718, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6718, new Class[0], Void.TYPE);
                return;
            }
            a();
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6729, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6729, new Class[0], Void.TYPE);
                return;
            }
            b();
            if (this.f12460c != null) {
                this.f12460c.setVisibility(8);
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6730, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6730, new Class[0], Void.TYPE);
                return;
            }
            c();
            this.f12459b = null;
            this.f12460c = null;
            this.f12461d = null;
            this.f12462e = null;
            this.f12463f = -1;
            this.g = null;
            this.h = null;
        }

        private int f() {
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6720, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6720, new Class[0], Integer.TYPE)).intValue();
            }
            if (TextUtils.isEmpty(this.f12461d) || TextUtils.isEmpty(this.f12462e)) {
                f2 = 0.0f;
            } else {
                f2 = this.f12459b.getPaint().measureText(this.f12461d.toString());
            }
            if (f2 == 0.0f) {
                return 0;
            }
            return -((int) (this.f12459b.getPaint().measureText(this.f12462e.toString()) - f2));
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6719, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6719, new Class[0], Void.TYPE);
                return;
            }
            this.g = ObjectAnimator.ofFloat(this.f12459b, "alpha", new float[]{1.0f, 0.0f, 0.0f});
            this.g.setDuration(480);
            this.g.removeAllListeners();
            this.g.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12464a;

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12464a, false, 6732, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12464a, false, 6732, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    b.this.f12459b.setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12464a, false, 6731, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12464a, false, 6731, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    b.this.f12459b.setTranslationX(0.0f);
                    if (b.this.f12463f == 1) {
                        b.this.a(b.this.f12462e);
                        b.this.f12459b.setText(b.this.f12462e);
                        b.this.f12463f = 2;
                    } else if (b.this.f12463f == 2) {
                        b.this.a(b.this.f12461d);
                        b.this.f12459b.setText(b.this.f12461d);
                        b.this.f12463f = -1;
                        b.this.b(5000);
                    } else {
                        return;
                    }
                    if (b.this.i != null) {
                        b.this.i.cancel();
                    }
                    b.this.i = ObjectAnimator.ofFloat(b.this.f12459b, "alpha", new float[]{0.0f, 1.0f, 1.0f});
                    b.this.i.setDuration(480);
                    b.this.i.removeAllListeners();
                    b.this.i.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f12466a;

                        public final void onAnimationEnd(Animator animator) {
                            int i;
                            long j;
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f12466a, false, 6733, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f12466a, false, 6733, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (b.this.f12463f == 2) {
                                b bVar = b.this;
                                if (PatchProxy.isSupport(new Object[0], bVar, b.f12458a, false, 6727, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], bVar, b.f12458a, false, 6727, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (bVar.l > 0) {
                                    i = 0;
                                } else {
                                    i = bVar.l;
                                }
                                bVar.l = i;
                                bVar.h = ObjectAnimator.ofFloat(bVar.f12459b, "translationX", new float[]{0.0f, (float) bVar.l});
                                if (bVar.k <= 0) {
                                    j = 5000;
                                } else {
                                    j = bVar.k;
                                }
                                bVar.k = j;
                                long min = Math.min(bVar.k, (long) (Math.abs(bVar.l) * 60));
                                long j2 = bVar.k - min;
                                bVar.h.setDuration(min);
                                bVar.h.removeAllListeners();
                                bVar.h.addListener(new AnimatorListenerAdapter(j2) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f12470a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ long f12471b;

                                    public final void onAnimationStart(Animator animator) {
                                        b.this.f12463f = 3;
                                    }

                                    public final void onAnimationCancel(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12470a, false, 6735, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12470a, false, 6735, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        b.this.f12459b.setTranslationX(0.0f);
                                        b.this.j = null;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f12470a, false, 6736, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f12470a, false, 6736, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        b.this.f12463f = 2;
                                        if (b.this.j == null) {
                                            b.this.b(this.f12471b);
                                        } else if (b.this.f12460c != null) {
                                            b.this.f12460c.postDelayed(new Runnable() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f12473a;

                                                public final void run() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f12473a, false, 6737, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f12473a, false, 6737, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    if (b.this.j != null) {
                                                        b.this.j.a();
                                                    }
                                                }
                                            }, this.f12471b);
                                        }
                                    }

                                    {
                                        this.f12471b = r2;
                                    }
                                });
                                bVar.h.start();
                            }
                        }
                    });
                    b.this.i.start();
                }
            });
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f12458a, false, 6728, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12458a, false, 6728, new Class[0], Void.TYPE);
                return;
            }
            this.f12463f = -1;
            if (this.h != null) {
                this.h.removeAllListeners();
                this.h.cancel();
                this.h = null;
            }
            if (this.g != null) {
                this.g.removeAllListeners();
                this.g.cancel();
                this.g = null;
            }
            if (this.i != null) {
                this.i.removeAllListeners();
                this.i.cancel();
                this.i = null;
            }
            this.j = null;
            if (this.f12459b != null) {
                this.f12459b.clearAnimation();
                this.f12459b.setText(this.f12461d);
                this.f12459b.setAlpha(1.0f);
                this.f12459b.setTranslationX(0.0f);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(long j2) {
            this.k = j2 * 1000;
        }

        /* access modifiers changed from: package-private */
        public final void b(CharSequence charSequence) {
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f12458a, false, 6723, new Class[]{CharSequence.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence}, this, f12458a, false, 6723, new Class[]{CharSequence.class}, Void.TYPE);
                return;
            }
            this.f12461d = charSequence;
            d(charSequence);
            this.l = f();
        }

        private void d(CharSequence charSequence) {
            String str;
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f12458a, false, 6721, new Class[]{CharSequence.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence}, this, f12458a, false, 6721, new Class[]{CharSequence.class}, Void.TYPE);
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f12459b.getParent();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            TextPaint paint = this.f12459b.getPaint();
            if (charSequence == null) {
                str = "";
            } else {
                str = charSequence.toString();
            }
            layoutParams.width = ((int) paint.measureText(str)) + ac.a(10.0f);
            frameLayout.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: package-private */
        public final void c(CharSequence charSequence) {
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f12458a, false, 6724, new Class[]{CharSequence.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence}, this, f12458a, false, 6724, new Class[]{CharSequence.class}, Void.TYPE);
                return;
            }
            this.f12462e = charSequence;
            this.l = f();
        }

        public final void a(CharSequence charSequence) {
            int i2;
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f12458a, false, 6722, new Class[]{CharSequence.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence}, this, f12458a, false, 6722, new Class[]{CharSequence.class}, Void.TYPE);
                return;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12459b.getLayoutParams();
            if (TextUtils.isEmpty(charSequence)) {
                i2 = -2;
            } else {
                i2 = (int) this.f12459b.getPaint().measureText(charSequence.toString());
            }
            layoutParams.width = i2;
            this.f12459b.setLayoutParams(layoutParams);
        }

        /* access modifiers changed from: package-private */
        public final void b(long j2) {
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f12458a, false, 6726, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f12458a, false, 6726, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if ((!this.g.isRunning() || j2 != 0) && !TextUtils.isEmpty(this.f12462e) && ((this.f12463f == -1 || this.f12463f == 2) && this.f12460c != null)) {
                if (this.f12463f == -1) {
                    this.f12463f = 1;
                }
                e();
                this.f12460c.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f12468a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f12468a, false, 6734, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f12468a, false, 6734, new Class[0], Void.TYPE);
                            return;
                        }
                        if (b.this.g != null) {
                            b.this.g.start();
                        }
                    }
                }, j2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f12458a, false, 6725, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f12458a, false, 6725, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (!TextUtils.isEmpty(this.f12461d)) {
                if (this.f12463f == -1 || this.f12463f == 1) {
                    this.f12459b.setText(this.f12461d);
                    this.f12460c.setVisibility(0);
                }
                if (this.f12463f == -1) {
                    b(5000);
                }
            }
        }

        b(TextView textView, View view) {
            this.f12459b = textView;
            this.f12460c = view;
            e();
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12420a, false, 6692, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6692, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12420a, false, 6693, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12420a, false, 6693, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.amk;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        int i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f12420a, false, 6688, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f12420a, false, 6688, new Class[]{String.class}, Void.TYPE);
        } else if (this.A) {
            if (!TTLiveSDKContext.getHostService().k().c()) {
                TTLiveSDKContext.getHostService().k().a(this.context, i.a().a(ac.a((int) C0906R.string.deq)).c("guard").a(0).a()).compose(getAutoUnbindTransformer()).subscribe((io.reactivex.Observer<? super T>) new g<Object>());
            } else if (!TTLiveSDKContext.getHostService().k().a(h.GUARD)) {
                String format = String.format(Locale.US, str2, new Object[]{Long.valueOf(this.x.getId()), Long.valueOf(this.x.getOwner().getId()), Long.valueOf(TTLiveSDKContext.getHostService().k().b()), "", String.valueOf(com.bytedance.android.livesdk.wallet.b.b.a(TTLiveSDKContext.getHostService().k().a()))});
                float f2 = this.context.getResources().getDisplayMetrics().density;
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
                if (booleanValue) {
                    i2 = (int) (((float) this.context.getResources().getDisplayMetrics().widthPixels) / f2);
                } else {
                    i2 = (int) (((float) this.context.getResources().getDisplayMetrics().heightPixels) / f2);
                }
                int i3 = i2;
                com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
                aa aaVar = new aa(format, "guard", booleanValue ? 80 : 5, i3, i3, 0, 0);
                a2.a((Object) aaVar);
            }
        }
    }

    public DailyRankWidget() {
        boolean z2;
        if (((Integer) LiveSettingKeys.LIVE_ENABLE_GUARD.a()).intValue() != 1 || !com.bytedance.android.live.uikit.a.a.d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.A = z2;
        this.C = 0;
        this.k = 0;
        this.E = -1;
        this.m = -1;
        this.p = true;
        this.q = true;
    }

    public static boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f12420a, true, 6666, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f12420a, true, 6666, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Integer) LiveSettingKeys.LIVE_DAILY_RANK.a()).intValue() != 0) {
            z2 = true;
        }
        return z2;
    }

    private boolean l() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6679, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6679, new Class[0], Boolean.TYPE)).booleanValue();
        }
        s sVar = (s) LiveSettingKeys.LIVE_RANK_CONFIG.a();
        if (sVar != null && sVar.f11162a) {
            z2 = true;
        }
        return z2;
    }

    private int m() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6680, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6680, new Class[0], Integer.TYPE)).intValue();
        }
        s sVar = (s) LiveSettingKeys.LIVE_RANK_CONFIG.a();
        if (sVar == null || sVar.f11163b <= 10) {
            return 100;
        }
        return sVar.f11163b;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6686, new Class[0], Void.TYPE);
            return;
        }
        if (this.A) {
            this.t.setVisibility(0);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6687, new Class[0], Void.TYPE);
            return;
        }
        if (this.A) {
            this.t.setVisibility(8);
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12420a, true, 6691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12420a, true, 6691, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("DailyRankWidget.java", DailyRankWidget.class);
        F = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.DailyRankWidget", "android.view.View", NotifyType.VIBRATE, "", "void"), 301);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6671, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != 1) {
            this.i.b();
            this.i.a();
        }
        k();
        this.j.c();
        this.i.j = null;
        this.i.b(this.l);
        this.i.a(true);
        this.m = 1;
        if (this.q) {
            this.q = false;
            com.bytedance.android.livesdk.j.a.a().a("live_detail_hourly_rank_show", new j(), Room.class);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6672, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != 2) {
            this.j.b();
            this.j.a();
        }
        k();
        this.i.c();
        this.j.j = null;
        this.j.b(this.D);
        this.j.a(true);
        this.m = 2;
        if (this.p) {
            this.p = false;
            com.bytedance.android.livesdk.j.a.a().a("live_detail_regional_rank_show", new j(), Room.class);
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6674, new Class[0], Void.TYPE);
        } else if (this.o == null) {
            this.o = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12423d, "scaleY", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f12424e, "scaleY", new float[]{0.0f, 1.0f});
            this.o.playTogether(new Animator[]{ofFloat, ofFloat2});
            this.o.setDuration(480);
            this.o.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12438a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12438a, false, 6703, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12438a, false, 6703, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12423d.setVisibility(8);
                    DailyRankWidget.this.f12424e.setVisibility(0);
                    DailyRankWidget.this.f12423d.setScaleY(0.0f);
                    DailyRankWidget.this.f12424e.setScaleY(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12438a, false, 6704, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12438a, false, 6704, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12423d.setVisibility(8);
                    if (DailyRankWidget.this.p) {
                        DailyRankWidget.this.p = false;
                        com.bytedance.android.livesdk.j.a.a().a("live_detail_regional_rank_show", new j(), Room.class);
                    }
                    if (!(DailyRankWidget.this.contentView == null || DailyRankWidget.this.n == null)) {
                        DailyRankWidget.this.contentView.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12440a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f12440a, false, 6705, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f12440a, false, 6705, new Class[0], Void.TYPE);
                                    return;
                                }
                                DailyRankWidget.this.d();
                            }
                        }, 5000);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12438a, false, 6702, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12438a, false, 6702, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12423d.setVisibility(0);
                    DailyRankWidget.this.f12424e.setVisibility(0);
                    if (DailyRankWidget.this.j != null) {
                        DailyRankWidget.this.j.b();
                    }
                }
            });
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6676, new Class[0], Void.TYPE);
        } else if (this.n == null) {
            this.n = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12424e, "scaleY", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f12423d, "scaleY", new float[]{0.0f, 1.0f});
            this.n.playTogether(new Animator[]{ofFloat, ofFloat2});
            this.n.setDuration(480);
            this.n.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f12442a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12442a, false, 6707, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12442a, false, 6707, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12423d.setVisibility(0);
                    DailyRankWidget.this.f12424e.setVisibility(8);
                    DailyRankWidget.this.f12423d.setScaleY(1.0f);
                    DailyRankWidget.this.f12424e.setScaleY(0.0f);
                }

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12442a, false, 6706, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12442a, false, 6706, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12423d.setVisibility(0);
                    DailyRankWidget.this.f12424e.setVisibility(0);
                    if (DailyRankWidget.this.i != null) {
                        DailyRankWidget.this.i.b();
                        if (DailyRankWidget.this.i.j == null && DailyRankWidget.this.m == 3) {
                            DailyRankWidget.this.i.j = new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f12444a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f12444a, false, 6709, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f12444a, false, 6709, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (DailyRankWidget.this.o != null) {
                                        DailyRankWidget.this.c();
                                    }
                                }
                            };
                        }
                        DailyRankWidget.this.i.a();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f12442a, false, 6708, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f12442a, false, 6708, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    DailyRankWidget.this.f12424e.setVisibility(8);
                    if (DailyRankWidget.this.q) {
                        DailyRankWidget.this.q = false;
                        com.bytedance.android.livesdk.j.a.a().a("live_detail_hourly_rank_show", new j(), Room.class);
                    }
                    DailyRankWidget dailyRankWidget = DailyRankWidget.this;
                    if (PatchProxy.isSupport(new Object[]{5000L}, dailyRankWidget, DailyRankWidget.f12420a, false, 6677, new Class[]{Long.TYPE}, Void.TYPE)) {
                        DailyRankWidget dailyRankWidget2 = dailyRankWidget;
                        PatchProxy.accessDispatch(new Object[]{5000L}, dailyRankWidget2, DailyRankWidget.f12420a, false, 6677, new Class[]{Long.TYPE}, Void.TYPE);
                    } else if (dailyRankWidget.i != null) {
                        dailyRankWidget.i.b(5000);
                    }
                    if (!(DailyRankWidget.this.i == null || !TextUtils.isEmpty(DailyRankWidget.this.i.f12462e) || DailyRankWidget.this.contentView == null)) {
                        DailyRankWidget.this.contentView.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f12446a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f12446a, false, 6710, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f12446a, false, 6710, new Class[0], Void.TYPE);
                                    return;
                                }
                                DailyRankWidget.this.c();
                            }
                        }, 5000);
                    }
                }
            });
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6678, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        if (this.o != null) {
            this.o.removeAllListeners();
            this.o.cancel();
            this.o = null;
        }
        if (this.f12423d != null) {
            this.f12423d.setScaleY(1.0f);
        }
        if (this.f12424e != null) {
            this.f12424e.setScaleY(1.0f);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6673, new Class[0], Void.TYPE);
            return;
        }
        i();
        this.f12423d.setPivotY((float) this.f12423d.getHeight());
        this.f12424e.setPivotY(0.0f);
        if (this.o != null) {
            this.o.start();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6675, new Class[0], Void.TYPE);
            return;
        }
        j();
        this.f12424e.setPivotY((float) this.f12424e.getHeight());
        this.f12423d.setPivotY(0.0f);
        if (this.n != null) {
            this.n.start();
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6664, new Class[0], Void.TYPE);
            return;
        }
        this.h.d();
        k();
        this.m = -1;
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        if (this.w != null) {
            try {
                this.w.dismiss();
            } catch (IllegalStateException unused) {
            }
            this.w = null;
        }
        this.g = false;
        this.t.setVisibility(8);
        if (this.i != null) {
            this.i.d();
            this.i = null;
        }
        if (this.j != null) {
            this.j.d();
            this.j = null;
        }
        this.l = null;
        this.D = null;
        this.C = 0;
        this.k = 0;
    }

    public void onEvent(al alVar) {
        if (PatchProxy.isSupport(new Object[]{alVar}, this, f12420a, false, 6683, new Class[]{al.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar}, this, f12420a, false, 6683, new Class[]{al.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.w != null) {
            this.w.dismiss();
        }
    }

    private void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12420a, false, 6682, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12420a, false, 6682, new Class[]{String.class}, Void.TYPE);
            return;
        }
        new com.bytedance.android.livesdk.widget.g(this.context).a(str).b(new t(this)).a(u.f13335b).show();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12420a, false, 6685, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12420a, false, 6685, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.w != null) {
            this.w.dismiss();
        } else {
            this.w = DailyRankDialog.a(this.x, this.y, this.z, this.dataCenter, i2);
        }
        this.w.k = i2;
        this.w.show(((FragmentActivity) this.context).getSupportFragmentManager(), DailyRankDialog.f16874b);
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f12420a, false, 6667, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12420a, false, 6667, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(F, this, this, view));
        if (isViewValid()) {
            int id = view.getId();
            if (id == C0906R.id.a2a) {
                this.h.a();
                a(0);
            } else if (id == C0906R.id.bk3) {
                this.h.a();
                a(1);
            } else {
                if (id == C0906R.id.alz) {
                    if (this.y) {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard_list/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    } else {
                        str = "https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?room_id=%s&anchor_id=%s&user_id=%s&source=%s&is_first_consume=%s";
                    }
                    a(str);
                }
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.rank.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f12420a, false, 6668, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f12420a, false, 6668, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE);
        } else if (isViewValid() && aVar != null) {
            this.B = aVar.i;
            if (aVar.i) {
                UIUtils.setViewVisibility(this.f12423d, 8);
                return;
            }
            if (aVar.f17020c != null && !StringUtils.isEmpty(aVar.f17020c.f17028e)) {
                this.l = aVar.f17020c.f17028e;
                this.D = aVar.f17020c.f17028e;
                a(aVar.f17020c.f17027d, this.k);
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12420a, false, 6690, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12420a, false, 6690, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.B) {
            UIUtils.setViewVisibility(this.f12423d, 8);
        } else {
            UIUtils.setViewVisibility(this.f12423d, i2);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12420a, false, 6689, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12420a, false, 6689, new Class[]{KVData.class}, Void.TYPE);
        } else if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == 1433895618 && key.equals("cmd_send_gift")) {
                    c2 = 0;
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6684, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6684, new Class[0], Void.TYPE);
                        break;
                    } else {
                        if (isViewValid() && this.w != null) {
                            this.w.dismiss();
                        }
                        return;
                    }
                case 1:
                    if (isViewValid() && this.w != null) {
                        this.w.dismiss();
                        break;
                    }
            }
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12420a, false, 6660, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12420a, false, 6660, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12422c = this.contentView.findViewById(C0906R.id.a2b);
        this.f12423d = this.contentView.findViewById(C0906R.id.a2a);
        this.r = (TextView) this.contentView.findViewById(C0906R.id.a2_);
        this.f12424e = this.contentView.findViewById(C0906R.id.bk3);
        this.s = (TextView) this.contentView.findViewById(C0906R.id.bk2);
        this.f12425f = this.contentView.findViewById(C0906R.id.a2d);
        this.u = (TextView) this.contentView.findViewById(C0906R.id.a2c);
        this.f12421b = this.contentView.findViewById(C0906R.id.a29);
        this.f12423d.setOnClickListener(this);
        this.f12424e.setOnClickListener(this);
        this.t = (TextView) this.contentView.findViewById(C0906R.id.alz);
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6661, new Class[0], Void.TYPE);
        } else if (this.contentView != null) {
            this.v = (ImageView) this.contentView.findViewById(C0906R.id.c_n);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v.getLayoutParams();
            if (com.bytedance.android.live.uikit.a.a.f()) {
                UIUtils.setViewVisibility(this.v, 0);
                layoutParams.height = ac.a(16.0f);
                layoutParams.width = ac.a(16.0f);
                this.v.setImageDrawable(ac.c(2130841465));
            } else if (!com.bytedance.android.live.uikit.a.a.d() || !l()) {
                UIUtils.setViewVisibility(this.v, 8);
            } else {
                UIUtils.setViewVisibility(this.v, 0);
                layoutParams.height = ac.a(12.0f);
                layoutParams.width = ac.a(12.0f);
                this.v.setImageDrawable(ac.c(2130841314));
            }
            this.v.setLayoutParams(layoutParams);
            if (getContext() != null && com.bytedance.android.live.uikit.a.a.f()) {
                UIUtils.updateLayoutMargin(this.r, (int) UIUtils.dip2Px(getContext(), 2.0f), -3, -3, -3);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6662, new Class[0], Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.d() && l()) {
            this.r.setCompoundDrawables(null, null, null, null);
            this.t.setCompoundDrawables(null, null, null, null);
        }
        if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            this.t.setVisibility(8);
            Drawable[] compoundDrawables = this.r.getCompoundDrawables();
            if (compoundDrawables != null && compoundDrawables.length > 0 && Build.VERSION.SDK_INT >= 19) {
                for (Drawable drawable : compoundDrawables) {
                    if (drawable != null) {
                        drawable.setAutoMirrored(true);
                    }
                }
            }
        }
        this.t.setOnClickListener(this);
    }

    public void onLoad(Object... objArr) {
        GuardApi guardApi;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12420a, false, 6663, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12420a, false, 6663, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.x = (Room) this.dataCenter.get("data_room");
        this.y = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.z = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.h = new f();
        this.h.f11350b = this.x.getOwner().getId();
        this.h.f11351c = this.x.getId();
        this.h.a((f.a) this);
        this.dataCenter.observe("cmd_send_gift", this);
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        com.bytedance.android.livesdk.u.a.a().a(al.class).compose(getAutoUnbindTransformer()).subscribe((Consumer<? super T>) new Consumer<al>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12426a;

            public final /* synthetic */ void accept(Object obj) throws Exception {
                al alVar = (al) obj;
                if (PatchProxy.isSupport(new Object[]{alVar}, this, f12426a, false, 6697, new Class[]{al.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{alVar}, this, f12426a, false, 6697, new Class[]{al.class}, Void.TYPE);
                    return;
                }
                DailyRankWidget.this.onEvent(alVar);
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f12420a, false, 6665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12420a, false, 6665, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.r != null) {
            this.f12423d.setVisibility(8);
            this.f12425f.setVisibility(8);
            this.i = new b(this.r, this.f12423d);
            this.j = new b(this.s, this.f12424e);
            if (b()) {
                this.h.a();
            }
        }
        if (this.A && !this.y) {
            f fVar = this.h;
            if (PatchProxy.isSupport(new Object[0], fVar, f.f11349a, false, 5159, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar, f.f11349a, false, 5159, new Class[0], Void.TYPE);
            } else {
                y d2 = com.bytedance.android.livesdk.v.j.q().d();
                if (PatchProxy.isSupport(new Object[0], d2, y.f18599a, false, 2655, new Class[0], GuardApi.class)) {
                    guardApi = (GuardApi) PatchProxy.accessDispatch(new Object[0], d2, y.f18599a, false, 2655, new Class[0], GuardApi.class);
                } else {
                    guardApi = (GuardApi) d2.a(GuardApi.class);
                }
                fVar.f11352d = ((com.bytedance.android.livesdk.utils.b.b) guardApi.getGuardInfo(fVar.f11351c).as(c.a())).a(3).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new com.bytedance.android.livesdk.chatroom.presenter.g(fVar), new com.bytedance.android.livesdk.chatroom.presenter.h(fVar));
            }
        }
        e();
    }

    public final void a(p pVar) {
        q qVar;
        String str;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{pVar2}, this, f12420a, false, 6681, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2}, this, f12420a, false, 6681, new Class[]{p.class}, Void.TYPE);
        } else if (isViewValid() && pVar2 != null && this.A && pVar2.f11150d != 0) {
            Map map = (Map) com.bytedance.android.livesdk.w.b.aj.a();
            try {
                qVar = (q) com.bytedance.android.live.a.a().fromJson((String) map.get(Long.valueOf(this.x.getOwnerUserId())), q.class);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.c("DailyRankWidget", e2.toString());
                qVar = null;
            }
            if (qVar == null) {
                qVar = new q();
            }
            if (pVar2.f11150d == 1) {
                if (!qVar.f11154a && (pVar2.f11152f.f11153a * 1000) - System.currentTimeMillis() < 604800000) {
                    int currentTimeMillis = ((int) ((pVar2.f11152f.f11153a * 1000) - System.currentTimeMillis())) / com.ss.android.ugc.aweme.main.guide.a.f54802d;
                    if (currentTimeMillis >= 0) {
                        b(ac.a((int) C0906R.string.d3x, Integer.valueOf(currentTimeMillis)));
                        qVar.f11154a = true;
                        map.put(Long.valueOf(this.x.getOwnerUserId()), com.bytedance.android.live.a.a().toJson((Object) qVar));
                    }
                } else if ((pVar2.f11152f.f11153a * 1000) - System.currentTimeMillis() > 604800000) {
                    qVar.f11154a = false;
                    qVar.f11155b = 0;
                    qVar.f11156c = 0;
                    map.put(Long.valueOf(this.x.getOwnerUserId()), com.bytedance.android.live.a.a().toJson((Object) qVar));
                }
            } else if (pVar2.f11150d == 2) {
                int i2 = qVar.f11156c;
                if (i2 < 3 && System.currentTimeMillis() - qVar.f11155b > 604800000) {
                    Object[] objArr = new Object[3];
                    objArr[0] = Long.valueOf(pVar2.f11151e);
                    objArr[1] = Long.valueOf(pVar2.f11149c);
                    Object[] objArr2 = objArr;
                    if (PatchProxy.isSupport(new Object[0], pVar, p.f11147a, false, 5118, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], pVar, p.f11147a, false, 5118, new Class[0], String.class);
                    } else {
                        int i3 = pVar2.f11148b;
                        str = ac.a((int) C0906R.string.d40);
                    }
                    objArr2[2] = str;
                    b(ac.a((int) C0906R.string.d3y, objArr2));
                    qVar.f11155b = System.currentTimeMillis();
                    qVar.f11156c = i2 + 1;
                    map.put(Long.valueOf(this.x.getOwnerUserId()), com.bytedance.android.live.a.a().toJson((Object) qVar));
                }
            }
        }
    }

    public final void a(l lVar) {
        final l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{lVar2}, this, f12420a, false, 6669, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar2}, this, f12420a, false, 6669, new Class[]{l.class}, Void.TYPE);
        } else if (isViewValid() && lVar2 != null) {
            switch (lVar2.f16653f) {
                case 1:
                case 6:
                    if (lVar2.baseMessage != null && !this.g) {
                        String str = lVar2.baseMessage.h;
                        if (TextUtils.equals(str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                            if ((!TextUtils.isEmpty(lVar2.f16649b) || lVar.supportDisplayText()) && lVar2.f16652e > 0) {
                                final Spannable a2 = com.bytedance.android.livesdk.chatroom.e.y.a(lVar2.f16651d, lVar2.f16650c);
                                Spannable a3 = com.bytedance.android.livesdk.chatroom.e.y.a(lVar2.baseMessage.j, lVar2.f16649b);
                                if (a2 != x.f10027b) {
                                    this.l = a2;
                                }
                                if (l()) {
                                    this.i.c(a3);
                                    this.i.a((long) lVar2.f16652e);
                                    a(lVar2.i, this.k);
                                    return;
                                }
                                this.g = true;
                                this.f12422c.setVisibility(8);
                                f();
                                this.u.setText(a3);
                                ViewTreeObserver viewTreeObserver = this.f12425f.getViewTreeObserver();
                                a aVar = new a(this.f12421b.getWidth(), this.f12421b.getHeight(), this.f12425f, this.f12421b, true, null);
                                viewTreeObserver.addOnGlobalLayoutListener(aVar);
                                this.f12425f.setVisibility(0);
                                this.f12425f.postDelayed(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f12428a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f12428a, false, 6698, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f12428a, false, 6698, new Class[0], Void.TYPE);
                                        } else if (DailyRankWidget.this.isViewValid()) {
                                            if (a2 != x.f10027b) {
                                                DailyRankWidget.this.l = a2;
                                                DailyRankWidget.this.a(lVar2.i, DailyRankWidget.this.k);
                                            }
                                            DailyRankWidget.this.f12425f.setVisibility(8);
                                            ViewTreeObserver viewTreeObserver = DailyRankWidget.this.f12422c.getViewTreeObserver();
                                            a aVar = new a(DailyRankWidget.this.f12421b.getWidth(), DailyRankWidget.this.f12421b.getHeight(), DailyRankWidget.this.f12422c, DailyRankWidget.this.f12421b, false, new Runnable() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f12432a;

                                                public final void run() {
                                                    if (PatchProxy.isSupport(new Object[0], this, f12432a, false, 6699, new Class[0], Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[0], this, f12432a, false, 6699, new Class[0], Void.TYPE);
                                                        return;
                                                    }
                                                    DailyRankWidget.this.e();
                                                }
                                            });
                                            viewTreeObserver.addOnGlobalLayoutListener(aVar);
                                            DailyRankWidget.this.f12422c.setVisibility(0);
                                            DailyRankWidget.this.g = false;
                                        }
                                    }
                                }, (long) (lVar2.f16652e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                                this.f12425f.setOnClickListener(new s(this, lVar2));
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("trace_id", lVar2.h);
                                    com.bytedance.android.livesdk.j.f.a(this.context).a("show_hlbutton", "news", 0, 0, jSONObject);
                                    break;
                                } catch (JSONException unused) {
                                    return;
                                }
                            }
                        } else if (TextUtils.equals(str, PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                            Spannable spannable = x.f10027b;
                            if (lVar.supportDisplayText()) {
                                spannable = com.bytedance.android.livesdk.chatroom.e.y.a(lVar2.baseMessage.j, lVar2.f16649b);
                            } else if (!TextUtils.isEmpty(lVar2.f16649b)) {
                                spannable = new SpannableString(lVar2.f16649b);
                            }
                            if (spannable != x.f10027b) {
                                this.f12425f.setVisibility(8);
                                this.l = spannable;
                                a(lVar2.i, this.k);
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
                case 2:
                case 3:
                    d.INSTANCE.add(lVar2);
                    return;
                case 5:
                    if (com.bytedance.android.live.uikit.a.a.d() && l()) {
                        Spannable a4 = com.bytedance.android.livesdk.chatroom.e.y.a(lVar2.f16651d, lVar2.f16650c);
                        Spannable spannable2 = x.f10027b;
                        if (lVar.supportDisplayText()) {
                            spannable2 = com.bytedance.android.livesdk.chatroom.e.y.a(lVar2.baseMessage.j, lVar2.f16649b);
                        } else if (!TextUtils.isEmpty(lVar2.f16649b)) {
                            spannable2 = new SpannableString(lVar2.f16649b);
                        }
                        if (a4 != x.f10027b) {
                            this.D = a4;
                            if (spannable2 != x.f10027b) {
                                this.j.c(spannable2);
                                this.j.a((long) lVar2.f16652e);
                            }
                        } else if (spannable2 != x.f10027b) {
                            this.D = spannable2;
                        }
                        this.k = lVar2.i;
                        a(this.C, lVar2.i);
                        break;
                    }
            }
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12420a, false, 6670, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f12420a, false, 6670, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.d() || !l()) {
            this.f12423d.setVisibility(0);
            this.r.setText(this.l);
        } else {
            if (i2 > 0 || this.C <= 0) {
                i4 = i2;
            } else {
                i4 = this.C;
            }
            Drawable c2 = ac.c(2130840691);
            int b2 = ac.b((int) C0906R.color.abb);
            if (i4 == 1) {
                c2 = ac.c(2130840690);
                b2 = ac.b((int) C0906R.color.ao4);
            } else if (i4 <= 1 || i4 > 10) {
                if (i5 == 1) {
                    this.f12424e.setBackgroundDrawable(ac.c(2130840690));
                    this.s.setTextColor(ac.b((int) C0906R.color.ao4));
                } else if (i5 <= 10) {
                    this.f12424e.setBackgroundDrawable(ac.c(2130840691));
                    this.s.setTextColor(ac.b((int) C0906R.color.ab_));
                } else {
                    this.f12424e.setBackgroundDrawable(ac.c(2130840691));
                    this.s.setTextColor(ac.b((int) C0906R.color.abb));
                }
                if (!l() || TextUtils.isEmpty(this.D) || i5 <= 0) {
                    if (l() && i2 <= 0 && i5 <= 0) {
                        h();
                        this.f12423d.setBackgroundDrawable(c2);
                        this.r.setTextColor(b2);
                        this.C = i4;
                    }
                } else if ((i4 == 0 || i4 > m()) && i5 > 10) {
                    h();
                    this.f12423d.setBackgroundDrawable(c2);
                    this.r.setTextColor(b2);
                    this.C = i4;
                } else {
                    j();
                    i();
                    if (this.m == 1) {
                        this.j.b(this.D);
                        if (TextUtils.isEmpty(this.i.f12462e)) {
                            c();
                        } else {
                            this.i.j = new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f12434a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f12434a, false, 6700, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f12434a, false, 6700, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (DailyRankWidget.this.o != null) {
                                        DailyRankWidget.this.c();
                                    }
                                }
                            };
                        }
                        this.m = 3;
                    } else if (this.m == 2) {
                        this.j.b();
                        this.i.b(this.l);
                        d();
                        this.m = 3;
                    } else if (this.m == 3) {
                        this.i.b(this.l);
                        this.j.b(this.D);
                        if (this.i.j == null) {
                            this.i.j = new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f12436a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f12436a, false, 6701, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f12436a, false, 6701, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (DailyRankWidget.this.o != null) {
                                        DailyRankWidget.this.c();
                                    }
                                }
                            };
                        }
                    }
                    this.f12423d.setBackgroundDrawable(c2);
                    this.r.setTextColor(b2);
                    this.C = i4;
                }
            } else {
                c2 = ac.c(2130840691);
                b2 = ac.b((int) C0906R.color.ab_);
            }
            g();
            this.f12423d.setBackgroundDrawable(c2);
            this.r.setTextColor(b2);
            this.C = i4;
        }
    }
}
