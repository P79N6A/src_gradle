package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.R$styleable;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.model.g;
import java.util.ArrayList;
import java.util.List;

public class StoryCommentView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72850a;

    /* renamed from: b  reason: collision with root package name */
    public int f72851b;

    /* renamed from: c  reason: collision with root package name */
    public d f72852c;

    /* renamed from: d  reason: collision with root package name */
    private g f72853d;

    /* renamed from: e  reason: collision with root package name */
    private List<b> f72854e;

    /* renamed from: f  reason: collision with root package name */
    private int f72855f;
    private String g;
    private int h;
    private int i;

    class a extends ClickableSpan implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72859a;

        /* renamed from: c  reason: collision with root package name */
        private final View.OnClickListener f72861c;

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f72859a, false, 84180, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f72859a, false, 84180, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f72861c.onClick(view2);
        }

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f72859a, false, 84181, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f72859a, false, 84181, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            textPaint2.setUnderlineText(false);
            textPaint2.setColor(StoryCommentView.this.f72851b);
            textPaint2.setTypeface(Typeface.defaultFromStyle(1));
        }

        public a(View.OnClickListener onClickListener) {
            this.f72861c = onClickListener;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f72862a;

        /* renamed from: b  reason: collision with root package name */
        int f72863b;

        /* renamed from: c  reason: collision with root package name */
        String f72864c;

        public b(int i, int i2, String str) {
            this.f72862a = i;
            this.f72863b = i2;
            this.f72864c = str;
        }
    }

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f72850a, false, 84175, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72850a, false, 84175, new Class[0], Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(this.g)) {
            return 0;
        } else {
            return this.g.length();
        }
    }

    private boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72850a, false, 84176, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72850a, false, 84176, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.g)) {
            z = true;
        }
        return z;
    }

    public StoryCommentView(Context context) {
        this(context, null);
    }

    private void setSpannableContent(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f72850a, false, 84177, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f72850a, false, 84177, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        for (final b next : this.f72854e) {
            c.a(spannableString, new a(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72856a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f72856a, false, 84179, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f72856a, false, 84179, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (StoryCommentView.this.f72852c != null && !TextUtils.isEmpty(next.f72864c)) {
                        StoryCommentView.this.f72852c.a(StoryCommentView.this.getContext(), next.f72864c, "");
                    }
                }
            }), next.f72862a, next.f72863b, 17);
            c.a(spannableString, new AbsoluteSizeSpan(this.h), next.f72862a, next.f72863b, 17);
        }
        setText(spannableString);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f72850a, false, 84178, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f72850a, false, 84178, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int lineCount = getLineCount();
        if (getMaxLines() == -1 || lineCount <= getMaxLines()) {
            return;
        }
        CharSequence text = getText();
        int lineVisibleEnd = getLayout().getLineVisibleEnd(getMaxLines() - 1);
        if (text.length() - 1 > lineVisibleEnd) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(text.subSequence(0, lineVisibleEnd - 1)).append("...");
            setText(spannableStringBuilder);
        }
    }

    public void setComment(g gVar) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f72850a, false, 84172, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f72850a, false, 84172, new Class[]{g.class}, Void.TYPE);
            return;
        }
        this.f72853d = gVar;
        this.f72854e.clear();
        if (PatchProxy.isSupport(new Object[0], this, f72850a, false, 84173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72850a, false, 84173, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f72850a, false, 84174, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f72850a, false, 84174, new Class[0], String.class);
        } else {
            StringBuilder sb = new StringBuilder();
            User user = this.f72853d.f71853c;
            this.f72854e.add(new b(0, user.getNickname().length() + a(), user.getUid()));
            StringBuilder sb2 = new StringBuilder();
            if (b()) {
                str2 = this.g;
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(user.getNickname());
            sb.append(sb2.toString());
            if (!TextUtils.isEmpty(this.f72853d.f71855e)) {
                int length = user.getNickname().length() + getContext().getString(C0906R.string.cfj).length() + (b() ? 1 : 0);
                this.f72854e.add(new b(length, this.f72853d.f71854d.length() + length + a(), this.f72853d.f71855e));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getContext().getString(C0906R.string.cfj));
                if (b()) {
                    str3 = this.g;
                } else {
                    str3 = "";
                }
                sb3.append(str3);
                sb3.append(this.f72853d.f71854d);
                sb.append(sb3.toString());
            }
            sb.append("：" + this.f72853d.f71852b);
            str = sb.toString();
        }
        setSpannableContent(str);
    }

    public StoryCommentView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoryCommentView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f72850a, false, 84171, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f72850a, false, 84171, new Class[]{AttributeSet.class}, Void.TYPE);
        } else {
            this.f72851b = getResources().getColor(C0906R.color.ao4);
            this.f72855f = getResources().getColor(C0906R.color.ao4);
            this.h = (int) UIUtils.sp2px(getContext(), 14.0f);
            this.i = (int) UIUtils.sp2px(getContext(), 14.0f);
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.StoryCommentView);
                this.f72851b = obtainStyledAttributes.getColor(2, this.f72851b);
                this.f72855f = obtainStyledAttributes.getColor(0, this.f72855f);
                this.g = obtainStyledAttributes.getString(3);
                this.h = obtainStyledAttributes.getDimensionPixelSize(4, this.h);
                this.i = obtainStyledAttributes.getDimensionPixelSize(1, this.h);
                obtainStyledAttributes.recycle();
            }
            setMovementMethod(LinkMovementMethod.getInstance());
            setTextSize(0, (float) this.i);
            setTextColor(this.f72855f);
            this.f72854e = new ArrayList();
        }
        if (PatchProxy.isSupport(new Object[0], this, f72850a, false, 84170, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72850a, false, 84170, new Class[0], Void.TYPE);
            return;
        }
        this.f72852c = (d) ServiceManager.get().getService(d.class);
    }
}
