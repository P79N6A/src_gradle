package com.facebook.fbui.textlayoutbuilder;

import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Field;

public final class b {
    private static boolean a(StaticLayout staticLayout) {
        int lineStart = staticLayout.getLineStart(0);
        int lineCount = staticLayout.getLineCount();
        int i = lineStart;
        int i2 = 0;
        while (i2 < lineCount) {
            int lineEnd = staticLayout.getLineEnd(i2);
            if (lineEnd < i) {
                try {
                    Field declaredField = StaticLayout.class.getDeclaredField("mLines");
                    declaredField.setAccessible(true);
                    Field declaredField2 = StaticLayout.class.getDeclaredField("mColumns");
                    declaredField2.setAccessible(true);
                    int[] iArr = (int[]) declaredField.get(staticLayout);
                    int i3 = declaredField2.getInt(staticLayout);
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = (i3 * i2) + i4;
                        int i6 = i5 + i3;
                        int i7 = iArr[i5];
                        iArr[i5] = iArr[i6];
                        iArr[i6] = i7;
                    }
                    return false;
                } catch (Exception unused) {
                }
            } else {
                i2++;
                i = lineEnd;
            }
        }
        return true;
    }

    private static StaticLayout b(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, float f3, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristicCompat textDirectionHeuristicCompat2 = textDirectionHeuristicCompat;
        try {
            if (textDirectionHeuristicCompat2 == TextDirectionHeuristicsCompat.LTR) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (textDirectionHeuristicCompat2 == TextDirectionHeuristicsCompat.RTL) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                if (textDirectionHeuristicCompat2 != TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR) {
                    if (textDirectionHeuristicCompat2 == TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else if (textDirectionHeuristicCompat2 == TextDirectionHeuristicsCompat.ANYRTL_LTR) {
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    } else if (textDirectionHeuristicCompat2 == TextDirectionHeuristicsCompat.LOCALE) {
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    }
                }
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, textDirectionHeuristic, f2, f3, z, truncateAt, i4, i5);
            return staticLayout;
        } catch (LinkageError unused) {
            StaticLayout staticLayout2 = new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f2, f3, z, truncateAt, i4);
            return staticLayout2;
        }
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f2, float f3, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        CharSequence charSequence2 = charSequence;
        int i6 = i5;
        StaticLayout b2 = b(charSequence, 0, i2, textPaint, i3, alignment, f2, f3, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
        if (i6 > 0) {
            int i7 = i2;
            while (b2.getLineCount() > i6) {
                int lineStart = b2.getLineStart(i6);
                if (lineStart >= i7) {
                    break;
                }
                int i8 = lineStart;
                while (i8 > 0 && Character.isSpace(charSequence2.charAt(i8 - 1))) {
                    i8--;
                }
                b2 = b(charSequence, 0, i8, textPaint, i3, alignment, f2, f3, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                if (b2.getLineCount() >= i6 && b2.getEllipsisCount(i6 - 1) == 0) {
                    String str = charSequence2.subSequence(0, i8) + " …";
                    b2 = b(str, 0, str.length(), textPaint, i3, alignment, f2, f3, z, truncateAt, i4, i5, textDirectionHeuristicCompat);
                }
                i7 = i8;
            }
        }
        do {
        } while (!a(b2));
        return b2;
    }
}
