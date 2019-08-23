package com.facebook.react.flat;

import android.graphics.Typeface;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.fbui.textlayoutbuilder.TextLayoutBuilder;
import com.facebook.fbui.textlayoutbuilder.a.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.b;
import javax.annotation.Nullable;

public final class RCTText extends RCTVirtualText implements YogaMeasureFunction {
    private static final TextLayoutBuilder sTextLayoutBuilder;
    private int mAlignment;
    @Nullable
    private DrawTextLayout mDrawCommand;
    private boolean mIncludeFontPadding = true;
    private int mNumberOfLines = Integer.MAX_VALUE;
    private float mSpacingAdd;
    private float mSpacingMult = 1.0f;
    @Nullable
    private CharSequence mText;

    /* access modifiers changed from: package-private */
    public final boolean doesDraw() {
        return true;
    }

    public final boolean isVirtual() {
        return false;
    }

    public final boolean isVirtualAnchor() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int getDefaultFontSize() {
        return fontSizeFromSp(14.0f);
    }

    static {
        TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
        textLayoutBuilder.f23759e = false;
        textLayoutBuilder.f23760f = true;
        textLayoutBuilder.f23758d = new a();
        sTextLayoutBuilder = textLayoutBuilder;
    }

    public RCTText() {
        setMeasureFunction(this);
        getSpan().setFontSize(getDefaultFontSize());
    }

    public final Layout.Alignment getAlignment() {
        boolean z;
        if (getLayoutDirection() == YogaDirection.RTL) {
            z = true;
        } else {
            z = false;
        }
        int i = this.mAlignment;
        char c2 = 4;
        if (i == 3) {
            if (!z) {
                c2 = 3;
            }
            return Layout.Alignment.values()[c2];
        } else if (i == 5) {
            if (z) {
                c2 = 3;
            }
            return Layout.Alignment.values()[c2];
        } else if (i != 17) {
            return Layout.Alignment.ALIGN_NORMAL;
        } else {
            return Layout.Alignment.ALIGN_CENTER;
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyChanged(boolean z) {
        dirty();
    }

    @ReactProp(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    @ReactProp(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public final void setNumberOfLines(int i) {
        this.mNumberOfLines = i;
        notifyChanged(true);
    }

    @ReactProp(defaultDouble = Double.NaN, name = "lineHeight")
    public final void setLineHeight(double d2) {
        if (Double.isNaN(d2)) {
            this.mSpacingMult = 1.0f;
            this.mSpacingAdd = 0.0f;
        } else {
            this.mSpacingMult = 0.0f;
            this.mSpacingAdd = PixelUtil.toPixelFromSP((float) d2);
        }
        notifyChanged(true);
    }

    @ReactProp(name = "textAlign")
    public final void setTextAlign(@Nullable String str) {
        if (str == null || "auto".equals(str)) {
            this.mAlignment = 0;
        } else if ("left".equals(str)) {
            this.mAlignment = 3;
        } else if ("right".equals(str)) {
            this.mAlignment = 5;
        } else if ("center".equals(str)) {
            this.mAlignment = 17;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
        }
        notifyChanged(false);
    }

    public final long measure(YogaNode yogaNode, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2) {
        boolean z;
        SpannableStringBuilder text = getText();
        if (TextUtils.isEmpty(text)) {
            this.mText = null;
            return b.a(0, 0);
        }
        this.mText = text;
        int ceil = (int) Math.ceil((double) f2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        boolean z2 = this.mIncludeFontPadding;
        int i = this.mNumberOfLines;
        if (this.mNumberOfLines == 1) {
            z = true;
        } else {
            z = false;
        }
        Layout createTextLayout = createTextLayout(ceil, yogaMeasureMode, truncateAt, z2, i, z, text, getFontSize(), this.mSpacingAdd, this.mSpacingMult, getFontStyle(), getAlignment());
        if (this.mDrawCommand == null || this.mDrawCommand.isFrozen()) {
            this.mDrawCommand = new DrawTextLayout(createTextLayout);
        } else {
            this.mDrawCommand.setLayout(createTextLayout);
        }
        return b.a(this.mDrawCommand.getLayoutWidth(), this.mDrawCommand.getLayoutHeight());
    }

    /* access modifiers changed from: package-private */
    public final void updateNodeRegion(float f2, float f3, float f4, float f5, boolean z) {
        NodeRegion nodeRegion = getNodeRegion();
        if (this.mDrawCommand == null) {
            if (!nodeRegion.matches(f2, f3, f4, f5, z)) {
                TextNodeRegion textNodeRegion = new TextNodeRegion(f2, f3, f4, f5, getReactTag(), z, null);
                setNodeRegion(textNodeRegion);
            }
            return;
        }
        Layout layout = null;
        if (nodeRegion instanceof TextNodeRegion) {
            layout = ((TextNodeRegion) nodeRegion).getLayout();
        }
        Layout layout2 = layout;
        Layout layout3 = this.mDrawCommand.getLayout();
        if (!nodeRegion.matches(f2, f3, f4, f5, z) || layout2 != layout3) {
            TextNodeRegion textNodeRegion2 = new TextNodeRegion(f2, f3, f4, f5, getReactTag(), z, layout3);
            setNodeRegion(textNodeRegion2);
        }
    }

    /* access modifiers changed from: protected */
    public final void collectState(StateBuilder stateBuilder, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        boolean z;
        boolean z2;
        super.collectState(stateBuilder, f2, f3, f4, f5, f6, f7, f8, f9);
        if (this.mText == null) {
            if (f5 - f3 > 0.0f && f4 - f2 > 0.0f) {
                SpannableStringBuilder text = getText();
                if (!TextUtils.isEmpty(text)) {
                    this.mText = text;
                }
            }
            if (this.mText == null) {
                return;
            }
        }
        if (this.mDrawCommand == null) {
            int ceil = (int) Math.ceil((double) (f4 - f2));
            YogaMeasureMode yogaMeasureMode = YogaMeasureMode.EXACTLY;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            boolean z3 = this.mIncludeFontPadding;
            int i = this.mNumberOfLines;
            if (this.mNumberOfLines == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            CharSequence charSequence = this.mText;
            int fontSize = getFontSize();
            float f10 = this.mSpacingAdd;
            this.mDrawCommand = new DrawTextLayout(createTextLayout(ceil, yogaMeasureMode, truncateAt, z3, i, z2, charSequence, fontSize, f10, this.mSpacingMult, getFontStyle(), getAlignment()));
            z = true;
        } else {
            z = false;
        }
        float padding = f2 + getPadding(0);
        float padding2 = f3 + getPadding(1);
        this.mDrawCommand = (DrawTextLayout) this.mDrawCommand.updateBoundsAndFreeze(padding, padding2, padding + this.mDrawCommand.getLayoutWidth(), padding2 + this.mDrawCommand.getLayoutHeight(), f6, f7, f8, f9);
        stateBuilder.addDrawCommand(this.mDrawCommand);
        if (z) {
            NodeRegion nodeRegion = getNodeRegion();
            if (nodeRegion instanceof TextNodeRegion) {
                ((TextNodeRegion) nodeRegion).setLayout(this.mDrawCommand.getLayout());
            }
        }
        performCollectAttachDetachListeners(stateBuilder);
    }

    private static Layout createTextLayout(int i, YogaMeasureMode yogaMeasureMode, TextUtils.TruncateAt truncateAt, boolean z, int i2, boolean z2, CharSequence charSequence, int i3, float f2, float f3, int i4, Layout.Alignment alignment) {
        int i5;
        switch (yogaMeasureMode) {
            case UNDEFINED:
                i5 = 0;
                break;
            case EXACTLY:
                i5 = 1;
                break;
            case AT_MOST:
                i5 = 2;
                break;
            default:
                throw new IllegalStateException("Unexpected size mode: " + yogaMeasureMode);
        }
        TextLayoutBuilder textLayoutBuilder = sTextLayoutBuilder;
        if (textLayoutBuilder.f23756b.h != truncateAt) {
            textLayoutBuilder.f23756b.h = truncateAt;
            textLayoutBuilder.f23757c = null;
        }
        if (textLayoutBuilder.f23756b.j != i2) {
            textLayoutBuilder.f23756b.j = i2;
            textLayoutBuilder.f23757c = null;
        }
        if (textLayoutBuilder.f23756b.i != z2) {
            textLayoutBuilder.f23756b.i = z2;
            textLayoutBuilder.f23757c = null;
        }
        TextLayoutBuilder a2 = textLayoutBuilder.a(charSequence);
        float f4 = (float) i3;
        if (a2.f23756b.f23765a.getTextSize() != f4) {
            a2.f23756b.a();
            a2.f23756b.f23765a.setTextSize(f4);
            a2.f23757c = null;
        }
        if (!(a2.f23756b.f23766b == i && a2.f23756b.f23767c == i5)) {
            a2.f23756b.f23766b = i;
            a2.f23756b.f23767c = i5;
            a2.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder2 = sTextLayoutBuilder;
        Typeface defaultFromStyle = Typeface.defaultFromStyle(i4);
        if (textLayoutBuilder2.f23756b.f23765a.getTypeface() != defaultFromStyle) {
            textLayoutBuilder2.f23756b.a();
            textLayoutBuilder2.f23756b.f23765a.setTypeface(defaultFromStyle);
            textLayoutBuilder2.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder3 = sTextLayoutBuilder;
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        if (textLayoutBuilder3.f23756b.l != textDirectionHeuristicCompat) {
            textLayoutBuilder3.f23756b.l = textDirectionHeuristicCompat;
            textLayoutBuilder3.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder4 = sTextLayoutBuilder;
        if (textLayoutBuilder4.f23756b.g != z) {
            textLayoutBuilder4.f23756b.g = z;
            textLayoutBuilder4.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder5 = sTextLayoutBuilder;
        if (textLayoutBuilder5.f23756b.f23770f != f2) {
            textLayoutBuilder5.f23756b.f23770f = f2;
            textLayoutBuilder5.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder6 = sTextLayoutBuilder;
        if (textLayoutBuilder6.f23756b.f23769e != f3) {
            textLayoutBuilder6.f23756b.f23769e = f3;
            textLayoutBuilder6.f23757c = null;
        }
        TextLayoutBuilder textLayoutBuilder7 = sTextLayoutBuilder;
        if (textLayoutBuilder7.f23756b.k != alignment) {
            textLayoutBuilder7.f23756b.k = alignment;
            textLayoutBuilder7.f23757c = null;
        }
        Layout a3 = sTextLayoutBuilder.a();
        sTextLayoutBuilder.a(null);
        return a3;
    }
}
