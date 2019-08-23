package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import javax.annotation.Nullable;

public class LayoutShadowNode extends ReactShadowNodeImpl {
    private final MutableYogaValue mTempYogaValue;

    static class MutableYogaValue {
        YogaUnit unit;
        float value;

        private MutableYogaValue() {
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }

        /* access modifiers changed from: package-private */
        public void setFromDynamic(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.unit = YogaUnit.UNDEFINED;
                this.value = 1.0E21f;
                return;
            }
            if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    this.unit = YogaUnit.AUTO;
                    this.value = 1.0E21f;
                } else if (asString.endsWith("%")) {
                    this.unit = YogaUnit.PERCENT;
                    this.value = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    throw new IllegalArgumentException("Unknown value: " + asString);
                }
            } else {
                this.unit = YogaUnit.POINT;
                this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
            }
        }
    }

    public LayoutShadowNode mutableCopy() {
        return new LayoutShadowNode(this);
    }

    public LayoutShadowNode() {
        this.mTempYogaValue = new MutableYogaValue();
    }

    @ReactProp(defaultFloat = 1.0E21f, name = "aspectRatio")
    public void setAspectRatio(float f2) {
        setStyleAspectRatio(f2);
    }

    @ReactProp(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @ReactProp(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f2) {
        if (!isVirtual()) {
            super.setFlex(f2);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f2) {
        if (!isVirtual()) {
            super.setFlexGrow(f2);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f2) {
        if (!isVirtual()) {
            super.setFlexShrink(f2);
        }
    }

    protected LayoutShadowNode(LayoutShadowNode layoutShadowNode) {
        super(layoutShadowNode);
        this.mTempYogaValue = new MutableYogaValue(layoutShadowNode.mTempYogaValue);
    }

    private int maybeTransformLeftRightToStartEnd(int i) {
        if (!I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @ReactProp(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            switch (this.mTempYogaValue.unit) {
                case POINT:
                case UNDEFINED:
                    setFlexBasis(this.mTempYogaValue.value);
                    break;
                case AUTO:
                    setFlexBasisAuto();
                    break;
                case PERCENT:
                    setFlexBasisPercent(this.mTempYogaValue.value);
                    break;
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            switch (this.mTempYogaValue.unit) {
                case POINT:
                case UNDEFINED:
                    setStyleHeight(this.mTempYogaValue.value);
                    break;
                case AUTO:
                    setStyleHeightAuto();
                    break;
                case PERCENT:
                    setStyleHeightPercent(this.mTempYogaValue.value);
                    break;
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        setStyleMaxHeight(this.mTempYogaValue.value);
                        break;
                }
            } else {
                setStyleMaxHeightPercent(this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        setStyleMaxWidth(this.mTempYogaValue.value);
                        break;
                }
            } else {
                setStyleMaxWidthPercent(this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        setStyleMinHeight(this.mTempYogaValue.value);
                        break;
                }
            } else {
                setStyleMinHeightPercent(this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i != 4) {
                switch (i) {
                    case 1:
                    case 2:
                        setStyleMinWidth(this.mTempYogaValue.value);
                        break;
                }
            } else {
                setStyleMinWidthPercent(this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.setFromDynamic(dynamic);
            switch (this.mTempYogaValue.unit) {
                case POINT:
                case UNDEFINED:
                    setStyleWidth(this.mTempYogaValue.value);
                    break;
                case AUTO:
                    setStyleWidthAuto();
                    break;
                case PERCENT:
                    setStyleWidthPercent(this.mTempYogaValue.value);
                    break;
            }
            dynamic.recycle();
        }
    }

    @ReactProp(name = "display")
    public void setDisplay(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setDisplay(YogaDisplay.FLEX);
                return;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3145721) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c2 = 1;
                }
            } else if (str.equals("flex")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    setDisplay(YogaDisplay.FLEX);
                    return;
                case 1:
                    setDisplay(YogaDisplay.NONE);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
            }
        }
    }

    @ReactProp(name = "flexWrap")
    public void setFlexWrap(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexWrap(YogaWrap.NO_WRAP);
                return;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1039592053) {
                if (hashCode == 3657802 && str.equals("wrap")) {
                    c2 = 1;
                }
            } else if (str.equals("nowrap")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    setFlexWrap(YogaWrap.NO_WRAP);
                    return;
                case 1:
                    setFlexWrap(YogaWrap.WRAP);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
            }
        }
    }

    @ReactProp(name = "overflow")
    public void setOverflow(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setOverflow(YogaOverflow.VISIBLE);
                return;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode != -907680051) {
                    if (hashCode == 466743410 && str.equals("visible")) {
                        c2 = 0;
                    }
                } else if (str.equals("scroll")) {
                    c2 = 2;
                }
            } else if (str.equals("hidden")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    setOverflow(YogaOverflow.VISIBLE);
                    return;
                case 1:
                    setOverflow(YogaOverflow.HIDDEN);
                    return;
                case 2:
                    setOverflow(YogaOverflow.SCROLL);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
            }
        }
    }

    @ReactProp(name = "position")
    public void setPosition(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setPositionType(YogaPositionType.RELATIVE);
                return;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -554435892) {
                if (hashCode == 1728122231 && str.equals("absolute")) {
                    c2 = 1;
                }
            } else if (str.equals("relative")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    setPositionType(YogaPositionType.RELATIVE);
                    return;
                case 1:
                    setPositionType(YogaPositionType.ABSOLUTE);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
            }
        }
    }

    @ReactProp(name = "alignContent")
    public void setAlignContent(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignContent(YogaAlign.FLEX_START);
                return;
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    setAlignContent(YogaAlign.AUTO);
                    return;
                case 1:
                    setAlignContent(YogaAlign.FLEX_START);
                    return;
                case 2:
                    setAlignContent(YogaAlign.CENTER);
                    return;
                case 3:
                    setAlignContent(YogaAlign.FLEX_END);
                    return;
                case 4:
                    setAlignContent(YogaAlign.STRETCH);
                    return;
                case 5:
                    setAlignContent(YogaAlign.BASELINE);
                    return;
                case 6:
                    setAlignContent(YogaAlign.SPACE_BETWEEN);
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    setAlignContent(YogaAlign.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
            }
        }
    }

    @ReactProp(name = "alignItems")
    public void setAlignItems(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignItems(YogaAlign.STRETCH);
                return;
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    setAlignItems(YogaAlign.AUTO);
                    return;
                case 1:
                    setAlignItems(YogaAlign.FLEX_START);
                    return;
                case 2:
                    setAlignItems(YogaAlign.CENTER);
                    return;
                case 3:
                    setAlignItems(YogaAlign.FLEX_END);
                    return;
                case 4:
                    setAlignItems(YogaAlign.STRETCH);
                    return;
                case 5:
                    setAlignItems(YogaAlign.BASELINE);
                    return;
                case 6:
                    setAlignItems(YogaAlign.SPACE_BETWEEN);
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    setAlignItems(YogaAlign.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
            }
        }
    }

    @ReactProp(name = "alignSelf")
    public void setAlignSelf(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignSelf(YogaAlign.AUTO);
                return;
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals("auto")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    setAlignSelf(YogaAlign.AUTO);
                    return;
                case 1:
                    setAlignSelf(YogaAlign.FLEX_START);
                    return;
                case 2:
                    setAlignSelf(YogaAlign.CENTER);
                    return;
                case 3:
                    setAlignSelf(YogaAlign.FLEX_END);
                    return;
                case 4:
                    setAlignSelf(YogaAlign.STRETCH);
                    return;
                case 5:
                    setAlignSelf(YogaAlign.BASELINE);
                    return;
                case 6:
                    setAlignSelf(YogaAlign.SPACE_BETWEEN);
                    return;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    setAlignSelf(YogaAlign.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
            }
        }
    }

    @ReactProp(name = "flexDirection")
    public void setFlexDirection(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexDirection(YogaFlexDirection.COLUMN);
                return;
            }
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1448970769) {
                if (hashCode != -1354837162) {
                    if (hashCode != 113114) {
                        if (hashCode == 1272730475 && str.equals("column-reverse")) {
                            c2 = 1;
                        }
                    } else if (str.equals("row")) {
                        c2 = 2;
                    }
                } else if (str.equals("column")) {
                    c2 = 0;
                }
            } else if (str.equals("row-reverse")) {
                c2 = 3;
            }
            switch (c2) {
                case 0:
                    setFlexDirection(YogaFlexDirection.COLUMN);
                    return;
                case 1:
                    setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                    return;
                case 2:
                    setFlexDirection(YogaFlexDirection.ROW);
                    return;
                case 3:
                    setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
            }
        }
    }

    @ReactProp(name = "justifyContent")
    public void setJustifyContent(@Nullable String str) {
        if (!isVirtual()) {
            if (str == null) {
                setJustifyContent(YogaJustify.FLEX_START);
                return;
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals("space-evenly")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    setJustifyContent(YogaJustify.FLEX_START);
                    return;
                case 1:
                    setJustifyContent(YogaJustify.CENTER);
                    return;
                case 2:
                    setJustifyContent(YogaJustify.FLEX_END);
                    return;
                case 3:
                    setJustifyContent(YogaJustify.SPACE_BETWEEN);
                    return;
                case 4:
                    setJustifyContent(YogaJustify.SPACE_AROUND);
                    return;
                case 5:
                    setJustifyContent(YogaJustify.SPACE_EVENLY);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
            }
        }
    }

    @ReactPropGroup(defaultFloat = 1.0E21f, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f2) {
        if (!isVirtual()) {
            setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i]), PixelUtil.toPixelFromDIP(f2));
        }
    }

    @ReactPropGroup(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i]);
            this.mTempYogaValue.setFromDynamic(dynamic);
            switch (this.mTempYogaValue.unit) {
                case POINT:
                case UNDEFINED:
                    setMargin(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                    break;
                case AUTO:
                    setMarginAuto(maybeTransformLeftRightToStartEnd);
                    break;
                case PERCENT:
                    setMarginPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                    break;
            }
            dynamic.recycle();
        }
    }

    @ReactPropGroup(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i]);
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                    case 2:
                        setPadding(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                        break;
                }
            } else {
                setPaddingPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }

    @ReactPropGroup(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.mTempYogaValue.setFromDynamic(dynamic);
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                    case 2:
                        setPosition(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                        break;
                }
            } else {
                setPositionPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
            }
            dynamic.recycle();
        }
    }
}