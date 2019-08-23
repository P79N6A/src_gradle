package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public class RCTVirtualText extends FlatTextShadowNode {
    private FontStylingSpan mFontStylingSpan = FontStylingSpan.INSTANCE;
    private ShadowStyleSpan mShadowStyleSpan = ShadowStyleSpan.INSTANCE;

    /* access modifiers changed from: protected */
    public int getDefaultFontSize() {
        return -1;
    }

    /* access modifiers changed from: protected */
    public final int getFontSize() {
        return this.mFontStylingSpan.getFontSize();
    }

    RCTVirtualText() {
    }

    /* access modifiers changed from: protected */
    public final int getFontStyle() {
        int fontStyle = this.mFontStylingSpan.getFontStyle();
        if (fontStyle >= 0) {
            return fontStyle;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final SpannableStringBuilder getText() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        collectText(spannableStringBuilder);
        applySpans(spannableStringBuilder, isEditable());
        return spannableStringBuilder;
    }

    private final ShadowStyleSpan getShadowSpan() {
        if (this.mShadowStyleSpan.isFrozen()) {
            this.mShadowStyleSpan = this.mShadowStyleSpan.mutableCopy();
        }
        return this.mShadowStyleSpan;
    }

    /* access modifiers changed from: protected */
    public final FontStylingSpan getSpan() {
        if (this.mFontStylingSpan.isFrozen()) {
            this.mFontStylingSpan = this.mFontStylingSpan.mutableCopy();
        }
        return this.mFontStylingSpan;
    }

    static int fontSizeFromSp(float f2) {
        return (int) Math.ceil((double) PixelUtil.toPixelFromSP(f2));
    }

    /* access modifiers changed from: protected */
    public void performCollectAttachDetachListeners(StateBuilder stateBuilder) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((FlatTextShadowNode) getChildAt(i)).performCollectAttachDetachListeners(stateBuilder);
        }
    }

    /* access modifiers changed from: protected */
    public void performCollectText(SpannableStringBuilder spannableStringBuilder) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((FlatTextShadowNode) getChildAt(i)).collectText(spannableStringBuilder);
        }
    }

    public void setBackgroundColor(int i) {
        if (!isVirtual()) {
            super.setBackgroundColor(i);
        } else if (this.mFontStylingSpan.getBackgroundColor() != i) {
            getSpan().setBackgroundColor(i);
            notifyChanged(false);
        }
    }

    @ReactProp(defaultDouble = Double.NaN, name = "color")
    public void setColor(double d2) {
        if (this.mFontStylingSpan.getTextColor() != d2) {
            getSpan().setTextColor(d2);
            notifyChanged(false);
        }
    }

    @ReactProp(name = "fontFamily")
    public void setFontFamily(@Nullable String str) {
        if (!TextUtils.equals(this.mFontStylingSpan.getFontFamily(), str)) {
            getSpan().setFontFamily(str);
            notifyChanged(true);
        }
    }

    @ReactProp(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (this.mShadowStyleSpan.getColor() != i) {
            getShadowSpan().setColor(i);
            notifyChanged(false);
        }
    }

    @ReactProp(name = "textShadowRadius")
    public void setTextShadowRadius(float f2) {
        float pixelFromDIP = PixelUtil.toPixelFromDIP(f2);
        if (this.mShadowStyleSpan.getRadius() != pixelFromDIP) {
            getShadowSpan().setRadius(pixelFromDIP);
            notifyChanged(false);
        }
    }

    private static int parseNumericFontWeight(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    @ReactProp(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f2) {
        int i;
        if (Float.isNaN(f2)) {
            i = getDefaultFontSize();
        } else {
            i = fontSizeFromSp(f2);
        }
        if (this.mFontStylingSpan.getFontSize() != i) {
            getSpan().setFontSize(i);
            notifyChanged(true);
        }
    }

    @ReactProp(name = "fontStyle")
    public void setFontStyle(@Nullable String str) {
        int i;
        if (str == null) {
            i = -1;
        } else if ("italic".equals(str)) {
            i = 2;
        } else if ("normal".equals(str)) {
            i = 0;
        } else {
            throw new RuntimeException("invalid font style " + str);
        }
        if (this.mFontStylingSpan.getFontStyle() != i) {
            getSpan().setFontStyle(i);
            notifyChanged(true);
        }
    }

    @ReactProp(name = "textShadowOffset")
    public void setTextShadowOffset(@Nullable ReadableMap readableMap) {
        float f2;
        float f3 = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width")) {
                f2 = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            } else {
                f2 = 0.0f;
            }
            if (readableMap.hasKey("height")) {
                f3 = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        } else {
            f2 = 0.0f;
        }
        if (!this.mShadowStyleSpan.offsetMatches(f2, f3)) {
            getShadowSpan().setOffset(f2, f3);
            notifyChanged(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r2 >= 500) goto L_0x000d;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "fontWeight")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFontWeight(@javax.annotation.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            if (r4 != 0) goto L_0x0005
            goto L_0x0037
        L_0x0005:
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x000f
        L_0x000d:
            r0 = 1
            goto L_0x0037
        L_0x000f:
            java.lang.String r2 = "normal"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0036
            int r2 = parseNumericFontWeight(r4)
            if (r2 == r0) goto L_0x0022
            r4 = 500(0x1f4, float:7.0E-43)
            if (r2 < r4) goto L_0x0036
            goto L_0x000d
        L_0x0022:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid font weight "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0036:
            r0 = 0
        L_0x0037:
            com.facebook.react.flat.FontStylingSpan r4 = r3.mFontStylingSpan
            int r4 = r4.getFontWeight()
            if (r4 == r0) goto L_0x0049
            com.facebook.react.flat.FontStylingSpan r4 = r3.getSpan()
            r4.setFontWeight(r0)
            r3.notifyChanged(r1)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.RCTVirtualText.setFontWeight(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [int] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "textDecorationLine")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextDecorationLine(@javax.annotation.Nullable java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0029
            java.lang.String r2 = " "
            java.lang.String[] r8 = r8.split(r2)
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r0 >= r2) goto L_0x0027
            r5 = r8[r0]
            java.lang.String r6 = "underline"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x001b
            r3 = 1
            goto L_0x0024
        L_0x001b:
            java.lang.String r6 = "line-through"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0024
            r4 = 1
        L_0x0024:
            int r0 = r0 + 1
            goto L_0x000d
        L_0x0027:
            r0 = r3
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            com.facebook.react.flat.FontStylingSpan r8 = r7.mFontStylingSpan
            boolean r8 = r8.hasUnderline()
            if (r0 != r8) goto L_0x003a
            com.facebook.react.flat.FontStylingSpan r8 = r7.mFontStylingSpan
            boolean r8 = r8.hasStrikeThrough()
            if (r4 == r8) goto L_0x0047
        L_0x003a:
            com.facebook.react.flat.FontStylingSpan r8 = r7.getSpan()
            r8.setHasUnderline(r0)
            r8.setHasStrikeThrough(r4)
            r7.notifyChanged(r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.flat.RCTVirtualText.setTextDecorationLine(java.lang.String):void");
    }

    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        notifyChanged(true);
    }

    /* access modifiers changed from: protected */
    public void performApplySpans(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        int i3;
        this.mFontStylingSpan.freeze();
        if (z) {
            i3 = 33;
        } else if (i == 0) {
            i3 = 18;
        } else {
            i3 = 34;
        }
        spannableStringBuilder.setSpan(this.mFontStylingSpan, i, i2, i3);
        if (!(this.mShadowStyleSpan.getColor() == 0 || this.mShadowStyleSpan.getRadius() == 0.0f)) {
            this.mShadowStyleSpan.freeze();
            spannableStringBuilder.setSpan(this.mShadowStyleSpan, i, i2, i3);
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((FlatTextShadowNode) getChildAt(i4)).applySpans(spannableStringBuilder, z);
        }
    }
}