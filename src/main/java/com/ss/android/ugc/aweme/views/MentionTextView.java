package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;
import javax.annotation.Nullable;

public class MentionTextView extends ClickSpanWorkaroundTextView {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76375b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76376c;

    /* renamed from: d  reason: collision with root package name */
    public int f76377d = -1;

    /* renamed from: e  reason: collision with root package name */
    private e f76378e;

    /* renamed from: f  reason: collision with root package name */
    private int f76379f;
    private float g;
    private int h;
    private SpannableString i;

    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76380a;

        /* renamed from: f  reason: collision with root package name */
        private e f76382f;
        private TextExtraStruct g;
        private int h;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f76380a, false, 89589, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f76380a, false, 89589, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.c.a.a.a(view) && this.f76382f != null) {
                this.f76382f.a(view, this.g);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            if (PatchProxy.isSupport(new Object[]{textPaint}, this, f76380a, false, 89590, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint}, this, f76380a, false, 89590, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            int i = MentionTextView.this.f76377d;
            if (i == -1) {
                i = this.h;
            }
            if (i == 0) {
                i = textPaint.linkColor;
            }
            if (this.f76387d) {
                i = MentionTextView.this.a(i, 0.75f);
            }
            textPaint.setColor(i);
            textPaint.setUnderlineText(MentionTextView.this.f76376c);
        }

        a(e eVar, TextExtraStruct textExtraStruct, int i) {
            super();
            TextPaint textPaint;
            int i2;
            this.f76382f = eVar;
            this.g = textExtraStruct;
            this.h = i;
            if (MentionTextView.this.f76377d != -1) {
                textPaint = MentionTextView.this.getPaint();
                i2 = MentionTextView.this.f76377d;
            } else {
                textPaint = MentionTextView.this.getPaint();
                if (this.h == 0) {
                    i2 = MentionTextView.this.getPaint().linkColor;
                } else {
                    i2 = this.h;
                }
            }
            textPaint.setColor(i2);
        }
    }

    class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76383a;

        /* renamed from: f  reason: collision with root package name */
        private e f76385f;
        private TextExtraStruct g;
        private int h;
        private boolean i;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f76383a, false, 89591, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f76383a, false, 89591, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.c.a.a.a(view) && this.f76385f != null) {
                this.f76385f.a(view, this.g);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            if (PatchProxy.isSupport(new Object[]{textPaint}, this, f76383a, false, 89592, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint}, this, f76383a, false, 89592, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            int i2 = this.h;
            if (i2 == 0) {
                i2 = textPaint.linkColor;
            }
            if (this.f76387d) {
                i2 = MentionTextView.this.a(i2, 0.75f);
            }
            textPaint.setColor(i2);
            textPaint.setUnderlineText(MentionTextView.this.f76376c);
            textPaint.setFakeBoldText(this.i);
        }

        b(e eVar, TextExtraStruct textExtraStruct, int i2) {
            super();
            this.f76385f = eVar;
            this.g = textExtraStruct;
            this.h = i2;
            this.i = textExtraStruct.isBoldText();
        }
    }

    public abstract class c extends ClickableSpan {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f76386c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f76387d;

        public c() {
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76386c, false, 89593, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76386c, false, 89593, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f76387d = z;
            MentionTextView.this.invalidate();
        }
    }

    public interface d {
        boolean a(TextExtraStruct textExtraStruct);
    }

    public interface e {
        void a(View view, TextExtraStruct textExtraStruct);
    }

    public int getSpanColor() {
        return this.h;
    }

    public float getSpanSize() {
        return this.g;
    }

    public int getSpanStyle() {
        return this.f76379f;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76375b, false, 89583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76375b, false, 89583, new Class[0], Void.TYPE);
            return;
        }
        this.f76376c = false;
        this.f76379f = 0;
        this.g = getTextSize();
        this.h = getCurrentTextColor();
        setHighlightColor(0);
    }

    public void setOnSpanClickListener(e eVar) {
        this.f76378e = eVar;
    }

    public void setShowUnderline(boolean z) {
        this.f76376c = z;
    }

    public void setSpanColor(int i2) {
        this.f76377d = i2;
    }

    public void setSpanSize(float f2) {
        this.g = f2;
    }

    public void setSpanStyle(int i2) {
        this.f76379f = i2;
    }

    public MentionTextView(Context context) {
        super(context);
        a();
    }

    public void setMaxSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76375b, false, 89585, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76375b, false, 89585, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public MentionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final int a(@ColorInt int i2, float f2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(0.75f)}, this, f76375b, false, 89588, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return Color.argb(Math.round(((float) Color.alpha(i2)) * 0.75f), Color.red(i2), Color.green(i2), Color.blue(i2));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(0.75f)}, this, f76375b, false, 89588, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76375b, false, 89584, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76375b, false, 89584, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.onMeasure(i2, i3);
        } catch (Exception unused) {
        }
    }

    public final void a(List<TextExtraStruct> list, @Nullable d dVar) {
        int i2;
        int i3;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{list, dVar2}, this, f76375b, false, 89587, new Class[]{List.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, dVar2}, this, f76375b, false, 89587, new Class[]{List.class, d.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty()) {
            SpannableString spannableString = new SpannableString(getText());
            if (!TextUtils.isEmpty(spannableString.toString())) {
                int length = spannableString.length();
                for (TextExtraStruct next : list) {
                    if (!dVar2.a(next) && next.getStart() <= next.getEnd() && next.getStart() <= length && next.getEnd() >= 0) {
                        if (next.getStart() < 0) {
                            i2 = 0;
                        } else {
                            i2 = next.getStart();
                        }
                        if (next.getEnd() > length) {
                            i3 = length;
                        } else {
                            i3 = next.getEnd();
                        }
                        if (i3 > i2) {
                            if (next.getType() == 65281) {
                                n.a(spannableString, next.getCustomSpan(), i2, i3, 33);
                            } else if (next.getType() == 65282) {
                                n.a(spannableString, new b(this.f76378e, next, next.getColor()), i2, i3, 33);
                            } else {
                                if (next.getType() == 2) {
                                    this.h = getResources().getColor(C0906R.color.a08);
                                } else if (next.getType() == 0 || next.getType() == 1) {
                                    this.h = getResources().getColor(C0906R.color.a1s);
                                } else if (next.getType() == 3) {
                                    this.h = getResources().getColor(C0906R.color.a08);
                                }
                                n.a(spannableString, new a(this.f76378e, next, this.h), i2, i3, 33);
                                if (next.getType() == 3) {
                                    n.a(spannableString, new StyleSpan(1), i2, i3, 33);
                                } else {
                                    n.a(spannableString, new StyleSpan(this.f76379f), i2, i3, 33);
                                }
                                n.a(spannableString, new AbsoluteSizeSpan((int) this.g), i2, i3, 33);
                            }
                        }
                    }
                }
                this.i = spannableString;
                setText(spannableString);
            }
        }
    }

    public MentionTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public final void a(int i2, int i3, Object obj) {
        int i4 = i2;
        int i5 = i3;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), obj2}, this, f76375b, false, 89586, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), obj2}, this, f76375b, false, 89586, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
        } else if (this.i != null) {
            int length = this.i.length();
            if (i4 <= length && i5 <= length && i4 <= i5) {
                n.a(this.i, obj2, i4, i5, 33);
                setText(this.i);
            }
        }
    }
}
