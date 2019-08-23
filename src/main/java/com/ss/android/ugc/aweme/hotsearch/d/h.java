package com.ss.android.ugc.aweme.hotsearch.d;

import android.support.annotation.NonNull;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ey;
import java.text.Bidi;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49737a;

    public static boolean a(String str, View view) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, view}, null, f49737a, true, 49823, new Class[]{String.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, view}, null, f49737a, true, 49823, new Class[]{String.class, View.class}, Boolean.TYPE)).booleanValue();
        }
        return new Bidi(str2, ey.a(view.getContext()) ? -1 : -2).baseIsLeftToRight();
    }

    public static void a(TextView textView, int i, int i2, String str, a.C0260a aVar) {
        TextView textView2 = textView;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{textView2, Integer.valueOf(i), 4, str, aVar}, null, f49737a, true, 49825, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE, String.class, a.C0260a.class}, Void.TYPE)) {
            Object[] objArr = {textView2, Integer.valueOf(i), 4, str, aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f49737a, true, 49825, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE, String.class, a.C0260a.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() && AbTestManager.a().ay() && i3 > 0 && i3 <= 30) {
            String charSequence = textView.getText().toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence + " T");
            com.ss.android.ugc.aweme.hotsearch.view.h hVar = new com.ss.android.ugc.aweme.hotsearch.view.h(i3, textView.getContext().getString(C0906R.string.cdk), 4);
            if (aVar != null) {
                textView2.setOnClickListener(null);
                spannableStringBuilder.setSpan(a(aVar), 0, charSequence.length(), 33);
            }
            int length = charSequence.length() + 1;
            int length2 = charSequence.length() + 2;
            spannableStringBuilder.setSpan(hVar, length, length2, 33);
            spannableStringBuilder.setSpan(a(str), length, length2, 33);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            float textSize = textView.getTextSize();
            int size = hVar.getSize(textView.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), textView.getPaint().getFontMetricsInt());
            textView.getPaint().setTextSize(textSize);
            textView2.setText(a(spannableStringBuilder, textView.getPaint(), textView.getMaxWidth(), textView.getMaxLines(), 1, size));
            textView.requestLayout();
        }
    }

    private static ClickableSpan a(a.C0260a aVar) {
        final a.C0260a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, f49737a, true, 49827, new Class[]{a.C0260a.class}, ClickableSpan.class)) {
            return new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49746a;

                public final void updateDrawState(TextPaint textPaint) {
                    TextPaint textPaint2 = textPaint;
                    if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f49746a, false, 49832, new Class[]{TextPaint.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f49746a, false, 49832, new Class[]{TextPaint.class}, Void.TYPE);
                        return;
                    }
                    textPaint2.setColor(-1);
                    textPaint2.setUnderlineText(false);
                }

                public final void onClick(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49746a, false, 49831, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49746a, false, 49831, new Class[]{View.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        aVar2.onClick();
                    }
                }
            };
        }
        return (ClickableSpan) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f49737a, true, 49827, new Class[]{a.C0260a.class}, ClickableSpan.class);
    }

    private static ClickableSpan a(String str) {
        final String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f49737a, true, 49826, new Class[]{String.class}, ClickableSpan.class)) {
            return new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49744a;

                public final void onClick(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49744a, false, 49830, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49744a, false, 49830, new Class[]{View.class}, Void.TYPE);
                    } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        r.a("enter_star_board", (Map) d.a().a("enter_from", str2).f34114b);
                        String str = (String) SharePrefCache.inst().getBillboardStarScheme().c();
                        if (!TextUtils.isEmpty(str)) {
                            com.ss.android.ugc.aweme.ag.h.a().a(str);
                        }
                    }
                }
            };
        }
        return (ClickableSpan) PatchProxy.accessDispatch(new Object[]{str2}, null, f49737a, true, 49826, new Class[]{String.class}, ClickableSpan.class);
    }

    public static void a(TextView textView, int i, int i2) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, Integer.valueOf(i), 4}, null, f49737a, true, 49828, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Integer.valueOf(i), 4}, null, f49737a, true, 49828, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" T");
        spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.hotsearch.view.h(i, "", 4), 0, 2, 33);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(spannableStringBuilder);
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        if (!PatchProxy.isSupport(new Object[]{spannableStringBuilder, textPaint, Integer.valueOf(i), Integer.valueOf(i2), 1, Integer.valueOf(i4)}, null, f49737a, true, 49821, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableStringBuilder.class)) {
            return a(spannableStringBuilder, textPaint, i, i2, 1, i4, true);
        }
        Object[] objArr = {spannableStringBuilder, textPaint, Integer.valueOf(i), Integer.valueOf(i2), 1, Integer.valueOf(i4)};
        return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, f49737a, true, 49821, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableStringBuilder.class);
    }

    private static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        TextPaint textPaint2 = textPaint;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 1}, null, f49737a, true, 49822, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, SpannableStringBuilder.class)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 1}, null, f49737a, true, 49822, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, SpannableStringBuilder.class);
        }
        DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i5) {
            return spannableStringBuilder2;
        }
        float measureText = ((float) i) - (textPaint2.measureText("... ") + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i5 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder2.charAt(lineStart)) {
            int i6 = lineStart + 1;
            measureText -= textPaint2.measureText(spannableStringBuilder2, lineStart, i6);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i6;
        }
        CharSequence subSequence = spannableStringBuilder2.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, lineStart));
        spannableStringBuilder3.append("... ");
        spannableStringBuilder3.append(subSequence);
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder, TextView textView, int i, int i2, int i3, int i4, boolean z, View view, boolean z2) {
        boolean z3;
        TextView textView2 = textView;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        char c2 = 1;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        boolean z4 = z2;
        while (true) {
            Object[] objArr = new Object[9];
            objArr[0] = spannableStringBuilder2;
            objArr[c2] = textView2;
            objArr[2] = Integer.valueOf(i);
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Integer.valueOf(i3);
            objArr[5] = Integer.valueOf(i4);
            objArr[6] = Byte.valueOf(z ? (byte) 1 : 0);
            objArr[7] = view;
            objArr[8] = Byte.valueOf(z4 ? (byte) 1 : 0);
            ChangeQuickRedirect changeQuickRedirect = f49737a;
            Class[] clsArr = new Class[9];
            clsArr[0] = SpannableStringBuilder.class;
            clsArr[c2] = TextView.class;
            clsArr[2] = Integer.TYPE;
            clsArr[3] = Integer.TYPE;
            clsArr[4] = Integer.TYPE;
            clsArr[5] = Integer.TYPE;
            clsArr[6] = Boolean.TYPE;
            clsArr[7] = View.class;
            clsArr[8] = Boolean.TYPE;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 49824, clsArr, SpannableStringBuilder.class)) {
                return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{spannableStringBuilder2, textView2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z), view, Byte.valueOf(z4)}, null, f49737a, true, 49824, new Class[]{SpannableStringBuilder.class, TextView.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, View.class, Boolean.TYPE}, SpannableStringBuilder.class);
            }
            DmtTextView dmtTextView = new DmtTextView(textView.getContext());
            TextPaint paint = textView.getPaint();
            dmtTextView.setTextSize(0, textView.getTextSize());
            dmtTextView.setText(spannableStringBuilder2);
            dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
            Layout layout = dmtTextView.getLayout();
            if (dmtTextView.getLineCount() > i6 && !z4) {
                float measureText = ((float) i5) - (paint.measureText("... ") + ((float) i4));
                int lineStart = layout.getLineStart(i6 - 1);
                while (lineStart < spannableStringBuilder2.length() - i7 && 10 != spannableStringBuilder2.charAt(lineStart)) {
                    int i8 = lineStart + 1;
                    measureText -= paint.measureText(spannableStringBuilder2, lineStart, i8);
                    if (measureText <= 0.0f) {
                        break;
                    }
                    lineStart = i8;
                }
                CharSequence subSequence = spannableStringBuilder2.subSequence(spannableStringBuilder2.length() - i7, spannableStringBuilder2.length());
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, lineStart));
                spannableStringBuilder3.append("... ");
                spannableStringBuilder3.append(subSequence);
                spannableStringBuilder2 = spannableStringBuilder3;
                c2 = 1;
                z4 = true;
            } else if (!z || spannableStringBuilder2.length() - 1 < i7) {
                return spannableStringBuilder2;
            } else {
                int lineCount = layout.getLineCount();
                if (layout.getLineStart(lineCount - 1) == spannableStringBuilder2.length() - i7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lineCount > i6 && z4) {
                    final int i9 = lineCount;
                    final Layout layout2 = layout;
                    final TextView textView3 = textView;
                    final SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    final View view2 = view;
                    final int i10 = i;
                    AnonymousClass1 r0 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f49738a;

                        public final void run() {
                            float f2;
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[0], this, f49738a, false, 49829, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f49738a, false, 49829, new Class[0], Void.TYPE);
                                return;
                            }
                            int i2 = i9 - 2;
                            float lineWidth = layout2.getLineWidth(i2);
                            int[] iArr = new int[2];
                            textView3.getLocationInWindow(iArr);
                            if (iArr[0] > 0 && iArr[0] < UIUtils.getScreenWidth(textView3.getContext())) {
                                boolean a2 = h.a(spannableStringBuilder4.toString(), textView3);
                                float dip2Px = UIUtils.dip2Px(textView3.getContext(), 8.0f);
                                View view = view2;
                                float f3 = (float) iArr[0];
                                if (a2) {
                                    f2 = lineWidth + dip2Px;
                                } else {
                                    f2 = ((((float) i10) - lineWidth) - dip2Px) - ((float) view2.getLayoutParams().width);
                                }
                                view.setX(f3 + f2);
                                int lineHeight = textView3.getLineHeight() - view2.getLayoutParams().height;
                                View view2 = view2;
                                int lineTop = iArr[1] + layout2.getLineTop(i2);
                                if (lineHeight > 0) {
                                    i = lineHeight / 2;
                                }
                                view2.setY((float) (lineTop + i));
                            }
                        }
                    };
                    textView2.post(r0);
                    return spannableStringBuilder2;
                } else if (!z3) {
                    return spannableStringBuilder2;
                } else {
                    CharSequence subSequence2 = spannableStringBuilder2.subSequence((spannableStringBuilder2.length() - i7) - 1, spannableStringBuilder2.length());
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, (spannableStringBuilder2.length() - i7) - 1));
                    spannableStringBuilder5.append("\n");
                    spannableStringBuilder5.append(subSequence2);
                    return spannableStringBuilder5;
                }
            }
        }
        if (!z) {
        }
        return spannableStringBuilder2;
    }
}
