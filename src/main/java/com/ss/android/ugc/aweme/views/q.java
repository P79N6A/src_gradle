package com.ss.android.ugc.aweme.views;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76516a;

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f76517b = Pattern.compile("(#|＃)([0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*[a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc][0-9\\uff10-\\uff19_a-zA-Z\\u00c0-\\u00d6\\u00d8-\\u00f6\\u00f8-\\u00ff\\u0100-\\u024f\\u0253\\u0254\\u0256\\u0257\\u0259\\u025b\\u0263\\u0268\\u026f\\u0272\\u0289\\u028b\\u02bb\\u0300-\\u036f\\u1e00-\\u1eff\\u0400-\\u04ff\\u0500-\\u0527\\u2de0-\\u2dff\\ua640-\\ua69f\\u0591-\\u05bf\\u05c1-\\u05c2\\u05c4-\\u05c5\\u05c7\\u05d0-\\u05ea\\u05f0-\\u05f4\\ufb1d-\\ufb28\\ufb2a-\\ufb36\\ufb38-\\ufb3c\\ufb3e\\ufb40-\\ufb41\\ufb43-\\ufb44\\ufb46-\\ufb4f\\u0610-\\u061a\\u0620-\\u065f\\u066e-\\u06d3\\u06d5-\\u06dc\\u06de-\\u06e8\\u06ea-\\u06ef\\u06fa-\\u06fc\\u06ff\\u0750-\\u077f\\u08a0\\u08a2-\\u08ac\\u08e4-\\u08fe\\ufb50-\\ufbb1\\ufbd3-\\ufd3d\\ufd50-\\ufd8f\\ufd92-\\ufdc7\\ufdf0-\\ufdfb\\ufe70-\\ufe74\\ufe76-\\ufefc\\u200c\\u0e01-\\u0e3a\\u0e40-\\u0e4e\\u1100-\\u11ff\\u3130-\\u3185\\uA960-\\uA97F\\uAC00-\\uD7AF\\uD7B0-\\uD7FF\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}\\u3003\\u3005\\u303b\\uff21-\\uff3a\\uff41-\\uff5a\\uff66-\\uff9f\\uffa1-\\uffdc]*)");

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f76518e = Pattern.compile("@([\\u4e00-\\u9fa5\\w\\.]{1,19}[\\u4e00-\\u9fa5\\w])");

    /* renamed from: c  reason: collision with root package name */
    public b f76519c;

    /* renamed from: d  reason: collision with root package name */
    public Typeface f76520d;

    /* renamed from: f  reason: collision with root package name */
    private int f76521f = 2;
    private int g = 1;
    private Pattern h = f76517b;
    private Pattern i = f76518e;

    @SuppressLint({"ParcelCreator"})
    static class a extends TypefaceSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76525a;

        /* renamed from: b  reason: collision with root package name */
        private final Typeface f76526b;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f76525a, false, 89662, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f76525a, false, 89662, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            a(textPaint2, this.f76526b);
        }

        public final void updateMeasureState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f76525a, false, 89663, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f76525a, false, 89663, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            a(textPaint2, this.f76526b);
        }

        a(String str, Typeface typeface) {
            super(str);
            this.f76526b = typeface;
        }

        private static void a(Paint paint, Typeface typeface) {
            Paint paint2 = paint;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{paint2, typeface}, null, f76525a, true, 89664, new Class[]{Paint.class, Typeface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{paint2, typeface}, null, f76525a, true, 89664, new Class[]{Paint.class, Typeface.class}, Void.TYPE);
                return;
            }
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 != null) {
                i = typeface2.getStyle();
            }
            int style = (typeface.getStyle() ^ -1) & i;
            if ((style & 1) != 0) {
                paint2.setFakeBoldText(true);
            }
            if ((2 & style) != 0) {
                paint2.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }

    public interface b {
        void a(TextPaint textPaint);

        void a(View view, String str, int i);
    }

    class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76527a;

        /* renamed from: c  reason: collision with root package name */
        private String f76529c;

        /* renamed from: d  reason: collision with root package name */
        private int f76530d;

        public final void updateDrawState(TextPaint textPaint) {
            if (PatchProxy.isSupport(new Object[]{textPaint}, this, f76527a, false, 89666, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint}, this, f76527a, false, 89666, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            if (q.this.f76519c != null) {
                q.this.f76519c.a(textPaint);
            }
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f76527a, false, 89665, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f76527a, false, 89665, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (q.this.f76519c != null) {
                q.this.f76519c.a(view, this.f76529c, this.f76530d);
            }
        }

        private c(String str, int i) {
            this.f76529c = str;
            this.f76530d = i;
        }

        /* synthetic */ c(q qVar, String str, int i, byte b2) {
            this(str, i);
        }
    }

    private boolean a(Spannable spannable) {
        if (PatchProxy.isSupport(new Object[]{spannable}, this, f76516a, false, 89657, new Class[]{Spannable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{spannable}, this, f76516a, false, 89657, new Class[]{Spannable.class}, Boolean.TYPE)).booleanValue();
        }
        String obj = spannable.toString();
        Matcher matcher = this.h.matcher(obj);
        Matcher matcher2 = this.i.matcher(obj);
        boolean z = false;
        while (matcher2.find()) {
            spannable.setSpan(new c(this, matcher2.group(this.g), 1, (byte) 0), matcher2.start(), matcher2.end(), 33);
            a(spannable, matcher2.start(), matcher2.end());
            z = true;
        }
        while (matcher.find()) {
            spannable.setSpan(new c(this, matcher.group(this.f76521f), 0, (byte) 0), matcher.start(), matcher.end(), 33);
            a(spannable, matcher.start(), matcher.end());
            z = true;
        }
        return z;
    }

    public final boolean a(TextView textView) {
        if (PatchProxy.isSupport(new Object[]{textView}, this, f76516a, false, 89656, new Class[]{TextView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView}, this, f76516a, false, 89656, new Class[]{TextView.class}, Boolean.TYPE)).booleanValue();
        } else if (textView == null) {
            return false;
        } else {
            final SpannableString spannableString = new SpannableString(textView.getText());
            if (!a((Spannable) spannableString)) {
                return false;
            }
            textView.setText(spannableString);
            textView.setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76522a;

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f76522a, false, 89661, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f76522a, false, 89661, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    TextView textView = (TextView) view;
                    if (motionEvent.getAction() == 1) {
                        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                        int scrollX = x + textView.getScrollX();
                        int scrollY = y + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        if (layout == null) {
                            return false;
                        }
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), (float) scrollX);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            clickableSpanArr[0].onClick(textView);
                        }
                    }
                    return true;
                }
            });
            return true;
        }
    }

    public final void a(Pattern pattern, int i2) {
        this.h = pattern;
        this.f76521f = 0;
    }

    private void a(Spannable spannable, int i2, int i3) {
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{spannable2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76516a, false, 89660, new Class[]{Spannable.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannable2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76516a, false, 89660, new Class[]{Spannable.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f76520d != null) {
            int i4 = i2;
            spannable.setSpan(new a("", this.f76520d), i2, i3, 0);
        }
    }
}
