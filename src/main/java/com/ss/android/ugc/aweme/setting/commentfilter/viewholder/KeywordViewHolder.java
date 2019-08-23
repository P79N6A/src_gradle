package com.ss.android.ugc.aweme.setting.commentfilter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.discover.ui.ai;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\t¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/KeywordViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/Listener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/Listener;)V", "div", "getDiv", "()Landroid/view/View;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "getListener", "()Lcom/ss/android/ugc/aweme/setting/commentfilter/viewholder/Listener;", "mLastItemClickTime", "", "getMLastItemClickTime", "()J", "setMLastItemClickTime", "(J)V", "mPosition", "", "getMPosition", "()I", "setMPosition", "(I)V", "text", "Landroid/widget/EditText;", "getText", "()Landroid/widget/EditText;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "getView", "bind", "", "position", "s", "", "onClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class KeywordViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63916a;

    /* renamed from: b  reason: collision with root package name */
    public long f63917b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f63918c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f63919d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f63920e;

    /* renamed from: f  reason: collision with root package name */
    public int f63921f = -1;
    @NotNull
    public final View g;
    @NotNull
    public final View h;
    @NotNull
    public final a i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ KeywordViewHolder f63931b;

        a(KeywordViewHolder keywordViewHolder) {
            this.f63931b = keywordViewHolder;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f63930a, false, 72207, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f63930a, false, 72207, new Class[0], Void.TYPE);
                return;
            }
            this.f63931b.f63919d.requestFocus();
            this.f63931b.f63919d.setSelection(this.f63931b.f63919d.getText().length());
            Object systemService = this.f63931b.f63919d.getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput(this.f63931b.f63919d, 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63916a, false, 72201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63916a, false, 72201, new Class[0], Void.TYPE);
        } else if (!this.i.a(this.f63921f)) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(-((float) u.a(16.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            this.f63919d.setText(this.f63920e.getText());
            if (Intrinsics.areEqual((Object) this.f63920e.getText().toString(), (Object) this.f63920e.getContext().getString(C0906R.string.du4))) {
                this.f63919d.setText("");
            }
            this.f63918c.setVisibility(0);
            this.f63919d.setVisibility(0);
            this.f63920e.setVisibility(8);
            EditText editText = this.f63919d;
            TranslateAnimation translateAnimation2 = new TranslateAnimation(-((float) u.a(24.0d)), 0.0f, 0.0f, 0.0f);
            translateAnimation2.setDuration(300);
            editText.startAnimation(translateAnimation2);
            TextView textView = this.f63920e;
            TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, (float) u.a(24.0d), 0.0f, 0.0f);
            translateAnimation3.setDuration(300);
            textView.startAnimation(translateAnimation3);
            this.f63918c.startAnimation(animationSet);
            this.f63919d.postDelayed(new a(this), 300);
            this.i.a(this.f63921f, (View) this.f63919d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeywordViewHolder(@NotNull View view, @NotNull a aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.h = view;
        this.i = aVar;
        View findViewById = this.h.findViewById(C0906R.id.aq8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.icon)");
        this.f63918c = (ImageView) findViewById;
        View findViewById2 = this.h.findViewById(C0906R.id.text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.text)");
        this.f63919d = (EditText) findViewById2;
        View findViewById3 = this.h.findViewById(C0906R.id.d23);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.text_view)");
        this.f63920e = (TextView) findViewById3;
        View findViewById4 = this.h.findViewById(C0906R.id.a5q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.div)");
        this.g = findViewById4;
        if (com.ss.android.g.a.b()) {
            View view2 = this.g;
            Context context = this.h.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            view2.setBackgroundColor(context.getResources().getColor(C0906R.color.hi));
            this.f63918c.setImageResource(2130839581);
        }
        this.f63919d.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63922a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ KeywordViewHolder f63923b;

            public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.f63923b = r1;
            }

            public final void afterTextChanged(@Nullable Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f63922a, false, 72203, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f63922a, false, 72203, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                this.f63923b.i.a(this.f63923b.f63921f, String.valueOf(editable));
            }
        });
        this.f63919d.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63924a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ KeywordViewHolder f63925b;

            {
                this.f63925b = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63924a, false, 72204, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f63924a, false, 72204, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z) {
                    this.f63925b.i.a(this.f63925b.f63921f, this.f63925b.f63919d.getText().toString());
                    this.f63925b.f63919d.setSelection(0);
                    AnimationSet animationSet = new AnimationSet(true);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(300);
                    animationSet.addAnimation(alphaAnimation);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -((float) u.a(16.0d)), 0.0f, 0.0f);
                    translateAnimation.setDuration(300);
                    animationSet.addAnimation(translateAnimation);
                    this.f63925b.f63920e.setText(this.f63925b.f63919d.getText());
                    String obj = this.f63925b.f63919d.getText().toString();
                    if (obj != null) {
                        if (Intrinsics.areEqual((Object) StringsKt.trimStart((CharSequence) obj).toString(), (Object) "")) {
                            TextView textView = this.f63925b.f63920e;
                            Context context = this.f63925b.f63920e.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "textView.context");
                            textView.setTextColor(context.getResources().getColor(C0906R.color.k));
                            this.f63925b.f63920e.setText(this.f63925b.f63920e.getContext().getString(C0906R.string.du4));
                        } else {
                            TextView textView2 = this.f63925b.f63920e;
                            Context context2 = this.f63925b.f63920e.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context2, "textView.context");
                            textView2.setTextColor(context2.getResources().getColor(C0906R.color.a6k));
                        }
                        this.f63925b.f63918c.setVisibility(8);
                        this.f63925b.f63919d.setVisibility(8);
                        this.f63925b.f63920e.setVisibility(0);
                        EditText editText = this.f63925b.f63919d;
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, -((float) u.a(24.0d)), 0.0f, 0.0f);
                        translateAnimation2.setDuration(300);
                        editText.startAnimation(translateAnimation2);
                        TextView textView3 = this.f63925b.f63920e;
                        TranslateAnimation translateAnimation3 = new TranslateAnimation((float) u.a(24.0d), 0.0f, 0.0f, 0.0f);
                        translateAnimation3.setDuration(300);
                        textView3.startAnimation(translateAnimation3);
                        this.f63925b.f63918c.startAnimation(animationSet);
                        this.f63925b.i.a();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
        });
        this.h.setOnTouchListener(new ai(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63926a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ KeywordViewHolder f63927b;

            {
                this.f63927b = r1;
            }

            public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f63926a, false, 72205, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f63926a, false, 72205, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                if (System.currentTimeMillis() - this.f63927b.f63917b >= 500) {
                    this.f63927b.f63917b = System.currentTimeMillis();
                    this.f63927b.a();
                }
            }
        });
        this.f63918c.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63928a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ KeywordViewHolder f63929b;

            {
                this.f63929b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63928a, false, 72206, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63928a, false, 72206, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                this.f63929b.f63919d.clearFocus();
                Object systemService = this.f63929b.f63919d.getContext().getSystemService("input_method");
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f63929b.h.getWindowToken(), 0);
                    this.f63929b.i.b(this.f63929b.f63921f);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        });
    }
}
