package android.support.v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ColorStateListInflaterCompat {
    private ColorStateListInflaterCompat() {
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f2) << 24);
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList inflate(@android.support.annotation.NonNull android.content.res.Resources r17, @android.support.annotation.NonNull org.xmlpull.v1.XmlPullParser r18, @android.support.annotation.NonNull android.util.AttributeSet r19, @android.support.annotation.Nullable android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L_0x0010:
            int r7 = r18.next()
            if (r7 == r2) goto L_0x00a6
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L_0x001f
            r9 = 3
            if (r7 == r9) goto L_0x00a6
        L_0x001f:
            r9 = 2
            if (r7 != r9) goto L_0x009f
            if (r8 > r1) goto L_0x009f
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x009f
            int[] r7 = android.support.compat.R$styleable.ColorStateListItem
            r8 = r17
            r10 = r20
            android.content.res.TypedArray r7 = obtainAttributes(r8, r10, r0, r7)
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r11 = r7.getColor(r5, r11)
            boolean r12 = r7.hasValue(r2)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x004e
            float r13 = r7.getFloat(r2, r13)
            goto L_0x0058
        L_0x004e:
            boolean r12 = r7.hasValue(r9)
            if (r12 == 0) goto L_0x0058
            float r13 = r7.getFloat(r9, r13)
        L_0x0058:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r9 = new int[r7]
            r12 = 0
            r14 = 0
        L_0x0063:
            if (r12 >= r7) goto L_0x0089
            int r15 = r0.getAttributeNameResource(r12)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x0085
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x0085
            r2 = 2130772017(0x7f010031, float:1.714714E38)
            if (r15 == r2) goto L_0x0085
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r12, r5)
            if (r16 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            int r15 = -r15
        L_0x0082:
            r9[r14] = r15
            r14 = r2
        L_0x0085:
            int r12 = r12 + 1
            r2 = 1
            goto L_0x0063
        L_0x0089:
            int[] r2 = android.util.StateSet.trimStateSet(r9, r14)
            int r7 = modulateColorAlpha(r11, r13)
            int[] r3 = android.support.v4.content.res.GrowingArrayUtils.append((int[]) r3, (int) r6, (int) r7)
            java.lang.Object[] r2 = android.support.v4.content.res.GrowingArrayUtils.append((T[]) r4, (int) r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto L_0x00a3
        L_0x009f:
            r8 = r17
            r10 = r20
        L_0x00a3:
            r2 = 1
            goto L_0x0010
        L_0x00a6:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.res.ColorStateListInflaterCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
