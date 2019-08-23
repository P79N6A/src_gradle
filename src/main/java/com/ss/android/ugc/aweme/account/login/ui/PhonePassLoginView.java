package com.ss.android.ugc.aweme.account.login.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.a.l;
import com.ss.android.ugc.aweme.account.util.ab;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.views.TipsPopupWindow;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class PhonePassLoginView extends LinearLayout implements l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32551a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32552b = "PhonePassLoginView";

    /* renamed from: c  reason: collision with root package name */
    LoginButton f32553c;

    /* renamed from: d  reason: collision with root package name */
    public a f32554d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32555e;

    /* renamed from: f  reason: collision with root package name */
    public LifecycleOwner f32556f;
    public EditText g;
    public TipsPopupWindow h;
    private TextView i;
    private String j;
    private View k;
    private String l;
    private int m;
    private View.OnClickListener n;
    private Animation o;

    public interface a {
        void a();
    }

    static class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32561a;

        /* renamed from: b  reason: collision with root package name */
        private String f32562b;

        /* renamed from: c  reason: collision with root package name */
        private int f32563c;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f32561a, false, 20737, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f32561a, false, 20737, new Class[]{View.class}, Void.TYPE);
                return;
            }
            view.setTag(Boolean.TRUE);
            if (TextUtils.equals(this.f32562b, "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true")) {
                ((v) w.a(v.class)).a(w.b(), this.f32562b, true, -1);
            } else {
                ((v) w.a(v.class)).a((Context) w.b(), this.f32562b, true);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32561a, false, 20738, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32561a, false, 20738, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32563c);
            textPaint2.setUnderlineText(false);
        }

        public b(String str, int i) {
            this.f32562b = str;
            this.f32563c = i;
        }
    }

    static class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32564a;

        /* renamed from: b  reason: collision with root package name */
        private int f32565b;

        public c(int i) {
            this.f32565b = i;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f32564a, false, 20739, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f32564a, false, 20739, new Class[]{View.class}, Void.TYPE);
                return;
            }
            view2.setTag(Boolean.TRUE);
            ((v) w.a(v.class)).a((Context) w.b(), "https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/", true);
        }

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32564a, false, 20740, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32564a, false, 20740, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32565b);
            textPaint2.setUnderlineText(false);
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32568a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f32568a, false, 20742, new Class[]{Parcel.class}, d.class)) {
                    return new d(parcel2, (byte) 0);
                }
                return (d) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f32568a, false, 20742, new Class[]{Parcel.class}, d.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32566a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f32567b;

        private d(Parcel parcel) {
            super(parcel);
            this.f32567b = parcel.readInt() != 1 ? false : true;
        }

        /* synthetic */ d(Parcel parcel, byte b2) {
            this(parcel);
        }

        d(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f32567b = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f32566a, false, 20741, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f32566a, false, 20741, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f32567b ? 1 : 0);
        }
    }

    static class e extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32569a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<Context> f32570b;

        /* renamed from: c  reason: collision with root package name */
        private int f32571c;

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f32569a, false, 20743, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f32569a, false, 20743, new Class[]{View.class}, Void.TYPE);
                return;
            }
            view2.setTag(Boolean.TRUE);
            if (this.f32570b.get() instanceof AmeActivity) {
                ((v) w.a(v.class)).a((Context) w.b(), "https://www.douyin.com/falcon/douyin_falcon/user_agreement/", true);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f32569a, false, 20744, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f32569a, false, 20744, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(this.f32571c);
            textPaint2.setUnderlineText(false);
        }

        public e(Context context, int i) {
            this.f32570b = new WeakReference<>(context);
            this.f32571c = i;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32551a, false, 20728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32551a, false, 20728, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32553c != null) {
            this.f32553c.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32551a, false, 20729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32551a, false, 20729, new Class[0], Void.TYPE);
            return;
        }
        if (this.f32553c != null) {
            this.f32553c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f32551a, false, 20724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32551a, false, 20724, new Class[0], Void.TYPE);
            return;
        }
        r.a("login_terms_agree_click", (Map) null);
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        if (!PatchProxy.isSupport(new Object[0], this, f32551a, false, 20731, new Class[0], Parcelable.class)) {
            return new d(super.onSaveInstanceState(), this.f32555e);
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f32551a, false, 20731, new Class[0], Parcelable.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f32551a, false, 20730, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32551a, false, 20730, new Class[0], Void.TYPE);
        } else if (getContext() != null) {
            if (this.o == null) {
                this.o = AnimationUtils.loadAnimation(getContext(), C0906R.anim.cs);
                this.o.setInterpolator(new CycleInterpolator(3.0f));
                this.o.setAnimationListener(new Animation.AnimationListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32559a;

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PatchProxy.isSupport(new Object[]{animation}, this, f32559a, false, 20736, new Class[]{Animation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animation}, this, f32559a, false, 20736, new Class[]{Animation.class}, Void.TYPE);
                        } else if (PhonePassLoginView.this.getContext() != null) {
                            if (PhonePassLoginView.this.h == null) {
                                PhonePassLoginView.this.h = new TipsPopupWindow(PhonePassLoginView.this.getContext(), PhonePassLoginView.this.f32556f);
                                TipsPopupWindow tipsPopupWindow = PhonePassLoginView.this.h;
                                String string = PhonePassLoginView.this.getContext().getString(C0906R.string.b8z);
                                if (PatchProxy.isSupport(new Object[]{string}, tipsPopupWindow, TipsPopupWindow.f2577a, false, 21532, new Class[]{String.class}, TipsPopupWindow.class)) {
                                    TipsPopupWindow tipsPopupWindow2 = tipsPopupWindow;
                                    TipsPopupWindow tipsPopupWindow3 = (TipsPopupWindow) PatchProxy.accessDispatch(new Object[]{string}, tipsPopupWindow2, TipsPopupWindow.f2577a, false, 21532, new Class[]{String.class}, TipsPopupWindow.class);
                                } else {
                                    Intrinsics.checkParameterIsNotNull(string, "text");
                                    tipsPopupWindow.f2578b.setText(string);
                                }
                            }
                            int a2 = u.a(2.0d);
                            int a3 = u.a(6.0d);
                            TipsPopupWindow tipsPopupWindow4 = PhonePassLoginView.this.h;
                            View findViewById = PhonePassLoginView.this.findViewById(C0906R.id.c60);
                            if (PatchProxy.isSupport(new Object[]{findViewById, Integer.valueOf(a2), Integer.valueOf(a3)}, tipsPopupWindow4, TipsPopupWindow.f2577a, false, 21533, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                TipsPopupWindow tipsPopupWindow5 = tipsPopupWindow4;
                                PatchProxy.accessDispatch(new Object[]{findViewById, Integer.valueOf(a2), Integer.valueOf(a3)}, tipsPopupWindow5, TipsPopupWindow.f2577a, false, 21533, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else if (!tipsPopupWindow4.isShowing() && findViewById != null) {
                                Lifecycle lifecycle = tipsPopupWindow4.f2581e.getLifecycle();
                                Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycleOwner.lifecycle");
                                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                                    int[] iArr = new int[2];
                                    findViewById.getLocationOnScreen(iArr);
                                    tipsPopupWindow4.getContentView().measure(tipsPopupWindow4.getWidth(), tipsPopupWindow4.getHeight());
                                    View contentView = tipsPopupWindow4.getContentView();
                                    Intrinsics.checkExpressionValueIsNotNull(contentView, "contentView");
                                    tipsPopupWindow4.showAtLocation(findViewById, 0, iArr[0] + a2, (iArr[1] - contentView.getMeasuredHeight()) + a3);
                                    tipsPopupWindow4.getContentView().removeCallbacks(tipsPopupWindow4.f2579c);
                                    tipsPopupWindow4.getContentView().postDelayed(tipsPopupWindow4.f2579c, 2000);
                                }
                            }
                        }
                    }
                });
            }
            this.k.startAnimation(this.o);
        }
    }

    public void setEditText(EditText editText) {
        this.g = editText;
    }

    public void setEnterMethod(String str) {
        this.j = str;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.f32556f = lifecycleOwner;
    }

    public void setLoginListener(a aVar) {
        this.f32554d = aVar;
    }

    public PhonePassLoginView(Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f32551a, false, 20732, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f32551a, false, 20732, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        if (this.f32555e != dVar.f32567b) {
            a(dVar.f32567b);
        }
    }

    public void setLoginBtnEnable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32551a, false, 20727, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32551a, false, 20727, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f32553c.setEnabled(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32551a, false, 20725, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32551a, false, 20725, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = (ImageView) findViewById(C0906R.id.c60);
        if (z) {
            imageView.setImageResource(2130840254);
        } else {
            imageView.setImageResource(2130840253);
        }
        if (imageView.getVisibility() == 0) {
            if (z) {
                imageView.setContentDescription(getResources().getString(C0906R.string.s6, new Object[]{this.l}));
                this.i.setContentDescription(getResources().getString(C0906R.string.s6, new Object[]{this.l}));
            } else {
                imageView.setContentDescription(getResources().getString(C0906R.string.dnq, new Object[]{this.l}));
                this.i.setContentDescription(getResources().getString(C0906R.string.dnq, new Object[]{this.l}));
            }
        }
        this.f32555e = z;
    }

    public PhonePassLoginView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z, String str) {
        int i2;
        int i3;
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3}, this, f32551a, false, 20723, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3}, this, f32551a, false, 20723, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f32555e = n.a();
        Resources resources = getResources();
        if (this.f32555e) {
            i2 = C0906R.string.ba;
        } else {
            i2 = C0906R.string.b8x;
        }
        String string = resources.getString(i2);
        String string2 = getResources().getString(C0906R.string.b91);
        String string3 = getResources().getString(C0906R.string.b90);
        String str4 = "";
        boolean equals = TextUtils.equals(str3, "mobile");
        boolean equals2 = TextUtils.equals(str3, "telecom");
        if (z) {
            StringBuilder sb = new StringBuilder(string);
            sb.append("\n");
            sb.append(getResources().getString(C0906R.string.bjt));
            if (equals) {
                sb.append(" " + getResources().getString(C0906R.string.bjv));
                string = sb.toString();
                str4 = getResources().getString(C0906R.string.bjv);
                i3 = string.indexOf(str4);
            } else if (equals2) {
                sb.append(" " + getResources().getString(C0906R.string.bjx));
                string = sb.toString();
                str4 = getResources().getString(C0906R.string.bjx);
                i3 = string.indexOf(str4);
            } else {
                sb.append(" " + getResources().getString(C0906R.string.bjz));
                string = sb.toString();
                str4 = getResources().getString(C0906R.string.bjz);
                i3 = string.indexOf(str4);
            }
        } else {
            i3 = 0;
        }
        int indexOf = string.indexOf(string2);
        int indexOf2 = string.indexOf(string3);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string);
        newSpannable.setSpan(new e(getContext(), this.m), indexOf, string2.length() + indexOf, 33);
        newSpannable.setSpan(new c(this.m), indexOf2, string3.length() + indexOf2, 33);
        if (z) {
            if (equals) {
                str2 = "https://wap.cmpassport.com/resources/html/contract.html";
            } else if (equals2) {
                str2 = "https://e.189.cn/sdk/agreement/detail.do?hidetop=true";
            } else {
                str2 = "https://opencloud.wostore.cn/authz/resource/html/disclaimer.html?fromsdk=true";
            }
            newSpannable.setSpan(new b(str2, this.m), i3, str4.length() + i3, 33);
        }
        this.i.setText(newSpannable);
        this.i.setMovementMethod(LinkMovementMethod.getInstance());
        this.l = newSpannable.toString();
        View findViewById = findViewById(C0906R.id.c60);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 8.0f);
        float f2 = (float) dip2Px;
        ab.a(findViewById, dip2Px, dip2Px, f2, f2);
        if (!this.f32555e) {
            findViewById.setVisibility(0);
            a(false);
        }
        this.i.setOnClickListener(new x(this, findViewById));
        findViewById.setOnClickListener(new y(this));
    }

    public PhonePassLoginView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32557a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32557a, false, 20735, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32557a, false, 20735, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (view.getId() == C0906R.id.og) {
                    ((com.ss.android.ugc.aweme.main.h.d) w.a(com.ss.android.ugc.aweme.main.h.d.class)).a("login");
                }
                KeyboardUtils.c(PhonePassLoginView.this.g);
                if (PhonePassLoginView.this.f32554d != null) {
                    PhonePassLoginView.this.f32554d.a();
                }
            }
        };
        LayoutInflater.from(context).inflate(C0906R.layout.ar4, this);
        setOrientation(1);
        this.f32553c = (LoginButton) findViewById(C0906R.id.og);
        this.f32553c.setOnClickListener(this.n);
        this.f32553c.setEnabled(false);
        this.i = (TextView) findViewById(C0906R.id.de9);
        this.k = findViewById(C0906R.id.c61);
        this.m = getResources().getColor(C0906R.color.zn);
        a(false, null);
    }
}
