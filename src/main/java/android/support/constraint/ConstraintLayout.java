package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.solver.Metrics;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidgetContainer;
import android.support.constraint.solver.widgets.Guideline;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    private ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    private ConstraintSet mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    private boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    ConstraintWidgetContainer mLayoutWidget = new ConstraintWidgetContainer();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    private Metrics mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOptimizationLevel = 3;
    private final ArrayList<ConstraintWidget> mVariableDimensionsWidgets = new ArrayList<>(100);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int baselineToBaseline = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle;
        public int circleConstraint = -1;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        int dimensionRatioSide = 1;
        float dimensionRatioValue;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneLeftMargin = -1;
        public int goneRightMargin = -1;
        public int goneStartMargin = -1;
        public int goneTopMargin = -1;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed = true;
        public float horizontalWeight = -1.0f;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        boolean needsBaseline;
        public int orientation = -1;
        int resolveGoneLeftMargin = -1;
        int resolveGoneRightMargin = -1;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias = 0.5f;
        int resolvedLeftToLeft = -1;
        int resolvedLeftToRight = -1;
        int resolvedRightToLeft = -1;
        int resolvedRightToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle;
        boolean verticalDimensionFixed = true;
        public float verticalWeight = -1.0f;
        ConstraintWidget widget = new ConstraintWidget();

        static class Table {
            public static final SparseIntArray map;

            private Table() {
            }

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                map = sparseIntArray;
                sparseIntArray.append(34, 8);
                map.append(35, 9);
                map.append(37, 10);
                map.append(38, 11);
                map.append(43, 12);
                map.append(42, 13);
                map.append(16, 14);
                map.append(15, 15);
                map.append(13, 16);
                map.append(17, 2);
                map.append(19, 3);
                map.append(18, 4);
                map.append(51, 49);
                map.append(52, 50);
                map.append(23, 5);
                map.append(24, 6);
                map.append(25, 7);
                map.append(0, 1);
                map.append(39, 17);
                map.append(40, 18);
                map.append(22, 19);
                map.append(21, 20);
                map.append(55, 21);
                map.append(58, 22);
                map.append(56, 23);
                map.append(53, 24);
                map.append(57, 25);
                map.append(54, 26);
                map.append(30, 29);
                map.append(44, 30);
                map.append(20, 44);
                map.append(32, 45);
                map.append(46, 46);
                map.append(31, 47);
                map.append(45, 48);
                map.append(11, 27);
                map.append(10, 28);
                map.append(47, 31);
                map.append(26, 32);
                map.append(49, 33);
                map.append(48, 34);
                map.append(50, 35);
                map.append(28, 36);
                map.append(27, 37);
                map.append(29, 38);
                map.append(33, 39);
                map.append(41, 40);
                map.append(36, 41);
                map.append(14, 42);
                map.append(12, 43);
            }
        }

        public void reset() {
            if (this.widget != null) {
                this.widget.reset();
            }
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            if (this.width == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }
            if (this.height == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.horizontalDimensionFixed = false;
                if (this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.verticalDimensionFixed = false;
                if (this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }
                ((Guideline) this.widget).setOrientation(this.orientation);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.widget = layoutParams.widget;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r6) {
            /*
                r5 = this;
                int r0 = r5.leftMargin
                int r1 = r5.rightMargin
                super.resolveLayoutDirection(r6)
                r6 = -1
                r5.resolvedRightToLeft = r6
                r5.resolvedRightToRight = r6
                r5.resolvedLeftToLeft = r6
                r5.resolvedLeftToRight = r6
                r5.resolveGoneLeftMargin = r6
                r5.resolveGoneRightMargin = r6
                int r2 = r5.goneLeftMargin
                r5.resolveGoneLeftMargin = r2
                int r2 = r5.goneRightMargin
                r5.resolveGoneRightMargin = r2
                float r2 = r5.horizontalBias
                r5.resolvedHorizontalBias = r2
                int r2 = r5.guideBegin
                r5.resolvedGuideBegin = r2
                int r2 = r5.guideEnd
                r5.resolvedGuideEnd = r2
                float r2 = r5.guidePercent
                r5.resolvedGuidePercent = r2
                int r2 = r5.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0036
                r2 = 1
                goto L_0x0037
            L_0x0036:
                r2 = 0
            L_0x0037:
                if (r2 == 0) goto L_0x00ac
                int r2 = r5.startToEnd
                if (r2 == r6) goto L_0x0043
                int r2 = r5.startToEnd
                r5.resolvedRightToLeft = r2
            L_0x0041:
                r3 = 1
                goto L_0x004c
            L_0x0043:
                int r2 = r5.startToStart
                if (r2 == r6) goto L_0x004c
                int r2 = r5.startToStart
                r5.resolvedRightToRight = r2
                goto L_0x0041
            L_0x004c:
                int r2 = r5.endToStart
                if (r2 == r6) goto L_0x0055
                int r2 = r5.endToStart
                r5.resolvedLeftToRight = r2
                r3 = 1
            L_0x0055:
                int r2 = r5.endToEnd
                if (r2 == r6) goto L_0x005e
                int r2 = r5.endToEnd
                r5.resolvedLeftToLeft = r2
                r3 = 1
            L_0x005e:
                int r2 = r5.goneStartMargin
                if (r2 == r6) goto L_0x0066
                int r2 = r5.goneStartMargin
                r5.resolveGoneRightMargin = r2
            L_0x0066:
                int r2 = r5.goneEndMargin
                if (r2 == r6) goto L_0x006e
                int r2 = r5.goneEndMargin
                r5.resolveGoneLeftMargin = r2
            L_0x006e:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0078
                float r3 = r5.horizontalBias
                float r3 = r2 - r3
                r5.resolvedHorizontalBias = r3
            L_0x0078:
                boolean r3 = r5.isGuideline
                if (r3 == 0) goto L_0x00dc
                int r3 = r5.orientation
                if (r3 != r4) goto L_0x00dc
                float r3 = r5.guidePercent
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 == 0) goto L_0x0092
                float r3 = r5.guidePercent
                float r2 = r2 - r3
                r5.resolvedGuidePercent = r2
                r5.resolvedGuideBegin = r6
                r5.resolvedGuideEnd = r6
                goto L_0x00dc
            L_0x0092:
                int r2 = r5.guideBegin
                if (r2 == r6) goto L_0x009f
                int r2 = r5.guideBegin
                r5.resolvedGuideEnd = r2
                r5.resolvedGuideBegin = r6
                r5.resolvedGuidePercent = r4
                goto L_0x00dc
            L_0x009f:
                int r2 = r5.guideEnd
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.guideEnd
                r5.resolvedGuideBegin = r2
                r5.resolvedGuideEnd = r6
                r5.resolvedGuidePercent = r4
                goto L_0x00dc
            L_0x00ac:
                int r2 = r5.startToEnd
                if (r2 == r6) goto L_0x00b4
                int r2 = r5.startToEnd
                r5.resolvedLeftToRight = r2
            L_0x00b4:
                int r2 = r5.startToStart
                if (r2 == r6) goto L_0x00bc
                int r2 = r5.startToStart
                r5.resolvedLeftToLeft = r2
            L_0x00bc:
                int r2 = r5.endToStart
                if (r2 == r6) goto L_0x00c4
                int r2 = r5.endToStart
                r5.resolvedRightToLeft = r2
            L_0x00c4:
                int r2 = r5.endToEnd
                if (r2 == r6) goto L_0x00cc
                int r2 = r5.endToEnd
                r5.resolvedRightToRight = r2
            L_0x00cc:
                int r2 = r5.goneStartMargin
                if (r2 == r6) goto L_0x00d4
                int r2 = r5.goneStartMargin
                r5.resolveGoneLeftMargin = r2
            L_0x00d4:
                int r2 = r5.goneEndMargin
                if (r2 == r6) goto L_0x00dc
                int r2 = r5.goneEndMargin
                r5.resolveGoneRightMargin = r2
            L_0x00dc:
                int r2 = r5.endToStart
                if (r2 != r6) goto L_0x012e
                int r2 = r5.endToEnd
                if (r2 != r6) goto L_0x012e
                int r2 = r5.startToStart
                if (r2 != r6) goto L_0x012e
                int r2 = r5.startToEnd
                if (r2 != r6) goto L_0x012e
                int r2 = r5.rightToLeft
                if (r2 == r6) goto L_0x00fd
                int r2 = r5.rightToLeft
                r5.resolvedRightToLeft = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
                goto L_0x010d
            L_0x00fd:
                int r2 = r5.rightToRight
                if (r2 == r6) goto L_0x010d
                int r2 = r5.rightToRight
                r5.resolvedRightToRight = r2
                int r2 = r5.rightMargin
                if (r2 > 0) goto L_0x010d
                if (r1 <= 0) goto L_0x010d
                r5.rightMargin = r1
            L_0x010d:
                int r1 = r5.leftToLeft
                if (r1 == r6) goto L_0x011e
                int r6 = r5.leftToLeft
                r5.resolvedLeftToLeft = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
                return
            L_0x011e:
                int r1 = r5.leftToRight
                if (r1 == r6) goto L_0x012e
                int r6 = r5.leftToRight
                r5.resolvedLeftToRight = r6
                int r6 = r5.leftMargin
                if (r6 > 0) goto L_0x012e
                if (r0 <= 0) goto L_0x012e
                r5.leftMargin = r0
            L_0x012e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = Table.map.get(index);
                switch (i3) {
                    case 0:
                        break;
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        this.circleConstraint = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        if (this.circleConstraint != -1) {
                            break;
                        } else {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        if (this.circleAngle >= 0.0f) {
                            break;
                        } else {
                            this.circleAngle = (360.0f - this.circleAngle) % 360.0f;
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case e.l /*7*/:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        this.leftToLeft = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        if (this.leftToLeft != -1) {
                            break;
                        } else {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.leftToRight = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        if (this.leftToRight != -1) {
                            break;
                        } else {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.rightToLeft = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        if (this.rightToLeft != -1) {
                            break;
                        } else {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.rightToRight = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        if (this.rightToRight != -1) {
                            break;
                        } else {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        this.topToTop = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        if (this.topToTop != -1) {
                            break;
                        } else {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.topToBottom = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        if (this.topToBottom != -1) {
                            break;
                        } else {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.bottomToTop = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        if (this.bottomToTop != -1) {
                            break;
                        } else {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.bottomToBottom = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        if (this.bottomToBottom != -1) {
                            break;
                        } else {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case SearchJediMixFeedAdapter.f42514c /*16*/:
                        this.baselineToBaseline = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        if (this.baselineToBaseline != -1) {
                            break;
                        } else {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.startToEnd = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        if (this.startToEnd != -1) {
                            break;
                        } else {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.startToStart = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        if (this.startToStart != -1) {
                            break;
                        } else {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.endToStart = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        if (this.endToStart != -1) {
                            break;
                        } else {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.endToEnd = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        if (this.endToEnd != -1) {
                            break;
                        } else {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case c.f69366e /*30*/:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case c.f69367f /*31*/:
                        this.matchConstraintDefaultWidth = obtainStyledAttributes.getInt(index, 0);
                        int i4 = this.matchConstraintDefaultWidth;
                        break;
                    case 32:
                        this.matchConstraintDefaultHeight = obtainStyledAttributes.getInt(index, 0);
                        int i5 = this.matchConstraintDefaultHeight;
                        break;
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinWidth = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinHeight = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                this.dimensionRatio = obtainStyledAttributes.getString(index);
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (this.dimensionRatio == null) {
                                    break;
                                } else {
                                    int length = this.dimensionRatio.length();
                                    int indexOf = this.dimensionRatio.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.dimensionRatio.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.dimensionRatio.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.dimensionRatio.substring(i, indexOf2);
                                        String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.dimensionRatioSide != 1) {
                                                        this.dimensionRatioValue = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.dimensionRatioValue = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.dimensionRatio.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.dimensionRatioValue = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.mVariableDimensionsWidgets.clear();
            setChildrenConstraints();
        }
    }

    private void updatePostMeasures() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Placeholder) {
                ((Placeholder) childAt).updatePostMeasure(this);
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).updatePostMeasure(this);
            }
        }
    }

    private void setChildrenConstraints() {
        int i;
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        boolean z = false;
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).setDebugName(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i7));
            if (viewWidget != null) {
                viewWidget.reset();
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        if (this.mConstraintSet != null) {
            this.mConstraintSet.applyToInternal(this);
        }
        this.mLayoutWidget.removeAllChildren();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.mConstraintHelpers.get(i9).updatePreLayout(this);
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt4 = getChildAt(i11);
            ConstraintWidget viewWidget2 = getViewWidget(childAt4);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt4.getLayoutParams();
                layoutParams.validate();
                if (layoutParams.helped) {
                    layoutParams.helped = z;
                } else if (isInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt4.getId());
                        setDesignInformation(z ? 1 : 0, resourceName2, Integer.valueOf(childAt4.getId()));
                        getTargetWidget(childAt4.getId()).setDebugName(resourceName2.substring(resourceName2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                viewWidget2.setVisibility(childAt4.getVisibility());
                if (layoutParams.isInPlaceholder) {
                    viewWidget2.setVisibility(8);
                }
                viewWidget2.setCompanionWidget(childAt4);
                this.mLayoutWidget.add(viewWidget2);
                if (!layoutParams.verticalDimensionFixed || !layoutParams.horizontalDimensionFixed) {
                    this.mVariableDimensionsWidgets.add(viewWidget2);
                }
                if (layoutParams.isGuideline) {
                    Guideline guideline = (Guideline) viewWidget2;
                    int i12 = layoutParams.resolvedGuideBegin;
                    int i13 = layoutParams.resolvedGuideEnd;
                    float f3 = layoutParams.resolvedGuidePercent;
                    if (Build.VERSION.SDK_INT < 17) {
                        i12 = layoutParams.guideBegin;
                        i13 = layoutParams.guideEnd;
                        f3 = layoutParams.guidePercent;
                    }
                    if (f3 != -1.0f) {
                        guideline.setGuidePercent(f3);
                    } else if (i12 != -1) {
                        guideline.setGuideBegin(i12);
                    } else if (i13 != -1) {
                        guideline.setGuideEnd(i13);
                    }
                } else if (layoutParams.leftToLeft != -1 || layoutParams.leftToRight != -1 || layoutParams.rightToLeft != -1 || layoutParams.rightToRight != -1 || layoutParams.startToStart != -1 || layoutParams.startToEnd != -1 || layoutParams.endToStart != -1 || layoutParams.endToEnd != -1 || layoutParams.topToTop != -1 || layoutParams.topToBottom != -1 || layoutParams.bottomToTop != -1 || layoutParams.bottomToBottom != -1 || layoutParams.baselineToBaseline != -1 || layoutParams.editorAbsoluteX != -1 || layoutParams.editorAbsoluteY != -1 || layoutParams.circleConstraint != -1 || layoutParams.width == -1 || layoutParams.height == -1) {
                    int i14 = layoutParams.resolvedLeftToLeft;
                    int i15 = layoutParams.resolvedLeftToRight;
                    int i16 = layoutParams.resolvedRightToLeft;
                    int i17 = layoutParams.resolvedRightToRight;
                    int i18 = layoutParams.resolveGoneLeftMargin;
                    int i19 = layoutParams.resolveGoneRightMargin;
                    float f4 = layoutParams.resolvedHorizontalBias;
                    if (Build.VERSION.SDK_INT < 17) {
                        int i20 = layoutParams.leftToLeft;
                        int i21 = layoutParams.leftToRight;
                        i16 = layoutParams.rightToLeft;
                        i17 = layoutParams.rightToRight;
                        int i22 = layoutParams.goneLeftMargin;
                        int i23 = layoutParams.goneRightMargin;
                        f4 = layoutParams.horizontalBias;
                        if (i20 == -1 && i21 == -1) {
                            if (layoutParams.startToStart != -1) {
                                i20 = layoutParams.startToStart;
                            } else if (layoutParams.startToEnd != -1) {
                                i21 = layoutParams.startToEnd;
                            }
                        }
                        int i24 = i21;
                        i14 = i20;
                        i3 = i24;
                        if (i16 == -1 && i17 == -1) {
                            if (layoutParams.endToStart != -1) {
                                i16 = layoutParams.endToStart;
                            } else if (layoutParams.endToEnd != -1) {
                                i17 = layoutParams.endToEnd;
                            }
                        }
                        i2 = i22;
                        i = i23;
                    } else {
                        i3 = i15;
                        i = i19;
                        i2 = i18;
                    }
                    int i25 = i17;
                    float f5 = f4;
                    int i26 = i16;
                    if (layoutParams.circleConstraint != -1) {
                        ConstraintWidget targetWidget = getTargetWidget(layoutParams.circleConstraint);
                        if (targetWidget != null) {
                            viewWidget2.connectCircularConstraint(targetWidget, layoutParams.circleAngle, layoutParams.circleRadius);
                        }
                    } else {
                        if (i14 != -1) {
                            ConstraintWidget targetWidget2 = getTargetWidget(i14);
                            if (targetWidget2 != null) {
                                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                                f2 = f5;
                                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                                i5 = i25;
                                viewWidget2.immediateConnect(type, targetWidget2, type2, layoutParams.leftMargin, i2);
                            } else {
                                f2 = f5;
                                i5 = i25;
                            }
                            i4 = i5;
                        } else {
                            f2 = f5;
                            i4 = i25;
                            if (i3 != -1) {
                                ConstraintWidget targetWidget3 = getTargetWidget(i3);
                                if (targetWidget3 != null) {
                                    viewWidget2.immediateConnect(ConstraintAnchor.Type.LEFT, targetWidget3, ConstraintAnchor.Type.RIGHT, layoutParams.leftMargin, i2);
                                }
                            }
                        }
                        if (i26 != -1) {
                            ConstraintWidget targetWidget4 = getTargetWidget(i26);
                            if (targetWidget4 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.RIGHT, targetWidget4, ConstraintAnchor.Type.LEFT, layoutParams.rightMargin, i);
                            }
                        } else if (i4 != -1) {
                            ConstraintWidget targetWidget5 = getTargetWidget(i4);
                            if (targetWidget5 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.RIGHT, targetWidget5, ConstraintAnchor.Type.RIGHT, layoutParams.rightMargin, i);
                            }
                        }
                        if (layoutParams.topToTop != -1) {
                            ConstraintWidget targetWidget6 = getTargetWidget(layoutParams.topToTop);
                            if (targetWidget6 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.TOP, targetWidget6, ConstraintAnchor.Type.TOP, layoutParams.topMargin, layoutParams.goneTopMargin);
                            }
                        } else if (layoutParams.topToBottom != -1) {
                            ConstraintWidget targetWidget7 = getTargetWidget(layoutParams.topToBottom);
                            if (targetWidget7 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.TOP, targetWidget7, ConstraintAnchor.Type.BOTTOM, layoutParams.topMargin, layoutParams.goneTopMargin);
                            }
                        }
                        if (layoutParams.bottomToTop != -1) {
                            ConstraintWidget targetWidget8 = getTargetWidget(layoutParams.bottomToTop);
                            if (targetWidget8 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.BOTTOM, targetWidget8, ConstraintAnchor.Type.TOP, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                            }
                        } else if (layoutParams.bottomToBottom != -1) {
                            ConstraintWidget targetWidget9 = getTargetWidget(layoutParams.bottomToBottom);
                            if (targetWidget9 != null) {
                                viewWidget2.immediateConnect(ConstraintAnchor.Type.BOTTOM, targetWidget9, ConstraintAnchor.Type.BOTTOM, layoutParams.bottomMargin, layoutParams.goneBottomMargin);
                            }
                        }
                        if (layoutParams.baselineToBaseline != -1) {
                            View view = this.mChildrenByIds.get(layoutParams.baselineToBaseline);
                            ConstraintWidget targetWidget10 = getTargetWidget(layoutParams.baselineToBaseline);
                            if (!(targetWidget10 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams))) {
                                layoutParams.needsBaseline = true;
                                ((LayoutParams) view.getLayoutParams()).needsBaseline = true;
                                viewWidget2.getAnchor(ConstraintAnchor.Type.BASELINE).connect(targetWidget10.getAnchor(ConstraintAnchor.Type.BASELINE), 0, -1, ConstraintAnchor.Strength.STRONG, 0, true);
                                viewWidget2.getAnchor(ConstraintAnchor.Type.TOP).reset();
                                viewWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).reset();
                            }
                        }
                        float f6 = f2;
                        if (f6 >= 0.0f && f6 != 0.5f) {
                            viewWidget2.setHorizontalBiasPercent(f6);
                        }
                        if (layoutParams.verticalBias >= 0.0f && layoutParams.verticalBias != 0.5f) {
                            viewWidget2.setVerticalBiasPercent(layoutParams.verticalBias);
                        }
                    }
                    if (isInEditMode && !(layoutParams.editorAbsoluteX == -1 && layoutParams.editorAbsoluteY == -1)) {
                        viewWidget2.setOrigin(layoutParams.editorAbsoluteX, layoutParams.editorAbsoluteY);
                    }
                    if (layoutParams.horizontalDimensionFixed) {
                        viewWidget2.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                        viewWidget2.setWidth(layoutParams.width);
                    } else if (layoutParams.width == -1) {
                        viewWidget2.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.getAnchor(ConstraintAnchor.Type.LEFT).mMargin = layoutParams.leftMargin;
                        viewWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).mMargin = layoutParams.rightMargin;
                    } else {
                        viewWidget2.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                        viewWidget2.setWidth(0);
                    }
                    if (layoutParams.verticalDimensionFixed) {
                        z = false;
                        viewWidget2.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                        viewWidget2.setHeight(layoutParams.height);
                    } else if (layoutParams.height == -1) {
                        viewWidget2.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                        viewWidget2.getAnchor(ConstraintAnchor.Type.TOP).mMargin = layoutParams.topMargin;
                        viewWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).mMargin = layoutParams.bottomMargin;
                        z = false;
                    } else {
                        viewWidget2.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                        z = false;
                        viewWidget2.setHeight(0);
                    }
                    if (layoutParams.dimensionRatio != null) {
                        viewWidget2.setDimensionRatio(layoutParams.dimensionRatio);
                    }
                    viewWidget2.setHorizontalWeight(layoutParams.horizontalWeight);
                    viewWidget2.setVerticalWeight(layoutParams.verticalWeight);
                    viewWidget2.setHorizontalChainStyle(layoutParams.horizontalChainStyle);
                    viewWidget2.setVerticalChainStyle(layoutParams.verticalChainStyle);
                    viewWidget2.setHorizontalMatchStyle(layoutParams.matchConstraintDefaultWidth, layoutParams.matchConstraintMinWidth, layoutParams.matchConstraintMaxWidth, layoutParams.matchConstraintPercentWidth);
                    viewWidget2.setVerticalMatchStyle(layoutParams.matchConstraintDefaultHeight, layoutParams.matchConstraintMinHeight, layoutParams.matchConstraintMaxHeight, layoutParams.matchConstraintPercentHeight);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.fillMetrics(metrics);
    }

    public void setOptimizationLevel(int i) {
        this.mLayoutWidget.setOptimizationLevel(i);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    /* access modifiers changed from: protected */
    public void solveLinearSystem(String str) {
        this.mLayoutWidget.layout();
        if (this.mMetrics != null) {
            this.mMetrics.resolutions++;
        }
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.remove(viewWidget);
        this.mConstraintHelpers.remove(view);
        this.mVariableDimensionsWidgets.remove(viewWidget);
        this.mDirtyHierarchy = true;
    }

    public ConstraintLayout(Context context) {
        super(context);
        init(null);
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.widget = new Guideline();
            layoutParams.isGuideline = true;
            ((Guideline) layoutParams.widget).setOrientation(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    private void init(AttributeSet attributeSet) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 4) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 2) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 59) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 8) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.load(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int parseInt3 = Integer.parseInt(split[2]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f2 = (float) i2;
                            float f3 = (float) i3;
                            float f4 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                            Canvas canvas2 = canvas;
                            float f5 = f3;
                            float f6 = f3;
                            float f7 = f4;
                            float f8 = f2;
                            Paint paint2 = paint;
                            canvas2.drawLine(f2, f5, f7, f6, paint);
                            float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                            float f9 = f4;
                            float f10 = parseInt4;
                            canvas2.drawLine(f9, f6, f7, f10, paint);
                            float f11 = parseInt4;
                            float f12 = f8;
                            canvas2.drawLine(f9, f11, f12, f10, paint);
                            float f13 = f8;
                            canvas2.drawLine(f13, f11, f12, f6, paint);
                            paint.setColor(-16711936);
                            float f14 = f4;
                            Paint paint3 = paint;
                            canvas2.drawLine(f13, f6, f14, parseInt4, paint);
                            canvas2.drawLine(f13, parseInt4, f14, f6, paint);
                        }
                    }
                }
            }
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            if (this.mDesignIds != null && this.mDesignIds.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
        }
        return null;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    private void setSelfDimensionBehaviour(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                size = Math.min(this.mMaxWidth, size) - paddingLeft;
            }
            size = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.mMaxHeight, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        this.mLayoutWidget.setMinWidth(0);
        this.mLayoutWidget.setMinHeight(0);
        this.mLayoutWidget.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.mLayoutWidget.setWidth(size);
        this.mLayoutWidget.setVerticalDimensionBehaviour(dimensionBehaviour2);
        this.mLayoutWidget.setHeight(size2);
        this.mLayoutWidget.setMinWidth((this.mMinWidth - getPaddingLeft()) - getPaddingRight());
        this.mLayoutWidget.setMinHeight((this.mMinHeight - getPaddingTop()) - getPaddingBottom());
    }

    private void internalMeasureChildren(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5 = i;
        int i6 = i2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ConstraintWidget constraintWidget = layoutParams.widget;
                if (!layoutParams.isGuideline && !layoutParams.isHelper) {
                    constraintWidget.setVisibility(childAt.getVisibility());
                    int i8 = layoutParams.width;
                    int i9 = layoutParams.height;
                    if (layoutParams.horizontalDimensionFixed || layoutParams.verticalDimensionFixed || ((!layoutParams.horizontalDimensionFixed && layoutParams.matchConstraintDefaultWidth == 1) || layoutParams.width == -1 || (!layoutParams.verticalDimensionFixed && (layoutParams.matchConstraintDefaultHeight == 1 || layoutParams.height == -1)))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (i8 == 0) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -2);
                            z3 = true;
                        } else if (i8 == -1) {
                            i3 = getChildMeasureSpec(i5, paddingLeft, -1);
                            z3 = false;
                        } else {
                            if (i8 == -2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            i3 = getChildMeasureSpec(i5, paddingLeft, i8);
                        }
                        if (i9 == 0) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -2);
                            z2 = true;
                        } else if (i9 == -1) {
                            i4 = getChildMeasureSpec(i6, paddingTop, -1);
                            z2 = false;
                        } else {
                            if (i9 == -2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i4 = getChildMeasureSpec(i6, paddingTop, i9);
                        }
                        childAt.measure(i3, i4);
                        if (this.mMetrics != null) {
                            this.mMetrics.measures++;
                        }
                        if (i8 == -2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        constraintWidget.setWidthWrapContent(z4);
                        if (i9 == -2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        constraintWidget.setHeightWrapContent(z5);
                        i8 = childAt.getMeasuredWidth();
                        i9 = childAt.getMeasuredHeight();
                    } else {
                        z3 = false;
                        z2 = false;
                    }
                    constraintWidget.setWidth(i8);
                    constraintWidget.setHeight(i9);
                    if (z3) {
                        constraintWidget.setWrapWidth(i8);
                    }
                    if (z2) {
                        constraintWidget.setWrapHeight(i9);
                    }
                    if (layoutParams.needsBaseline) {
                        int baseline = childAt.getBaseline();
                        if (baseline != -1) {
                            constraintWidget.setBaselineDistance(baseline);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void internalMeasureDimensions(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.getPaddingTop()
            int r4 = r24.getPaddingBottom()
            int r3 = r3 + r4
            int r4 = r24.getPaddingLeft()
            int r5 = r24.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r24.getChildCount()
            r7 = 0
        L_0x001d:
            r8 = 1
            r10 = 8
            r12 = -2
            if (r7 >= r5) goto L_0x00e1
            android.view.View r14 = r0.getChildAt(r7)
            int r15 = r14.getVisibility()
            if (r15 == r10) goto L_0x00d7
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r10 = (android.support.constraint.ConstraintLayout.LayoutParams) r10
            android.support.constraint.solver.widgets.ConstraintWidget r15 = r10.widget
            boolean r6 = r10.isGuideline
            if (r6 != 0) goto L_0x00d7
            boolean r6 = r10.isHelper
            if (r6 != 0) goto L_0x00d7
            int r6 = r14.getVisibility()
            r15.setVisibility(r6)
            int r6 = r10.width
            int r13 = r10.height
            if (r6 == 0) goto L_0x00c6
            if (r13 != 0) goto L_0x004f
            goto L_0x00c6
        L_0x004f:
            if (r6 != r12) goto L_0x0054
            r16 = 1
            goto L_0x0056
        L_0x0054:
            r16 = 0
        L_0x0056:
            int r11 = getChildMeasureSpec(r1, r4, r6)
            if (r13 != r12) goto L_0x005f
            r17 = 1
            goto L_0x0061
        L_0x005f:
            r17 = 0
        L_0x0061:
            int r12 = getChildMeasureSpec(r2, r3, r13)
            r14.measure(r11, r12)
            android.support.constraint.solver.Metrics r11 = r0.mMetrics
            if (r11 == 0) goto L_0x0076
            android.support.constraint.solver.Metrics r11 = r0.mMetrics
            r18 = r3
            long r2 = r11.measures
            long r2 = r2 + r8
            r11.measures = r2
            goto L_0x0078
        L_0x0076:
            r18 = r3
        L_0x0078:
            r2 = -2
            if (r6 != r2) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            r15.setWidthWrapContent(r3)
            if (r13 != r2) goto L_0x0085
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            r15.setHeightWrapContent(r2)
            int r2 = r14.getMeasuredWidth()
            int r3 = r14.getMeasuredHeight()
            r15.setWidth(r2)
            r15.setHeight(r3)
            if (r16 == 0) goto L_0x009c
            r15.setWrapWidth(r2)
        L_0x009c:
            if (r17 == 0) goto L_0x00a1
            r15.setWrapHeight(r3)
        L_0x00a1:
            boolean r6 = r10.needsBaseline
            if (r6 == 0) goto L_0x00af
            int r6 = r14.getBaseline()
            r8 = -1
            if (r6 == r8) goto L_0x00af
            r15.setBaselineDistance(r6)
        L_0x00af:
            boolean r6 = r10.horizontalDimensionFixed
            if (r6 == 0) goto L_0x00d9
            boolean r6 = r10.verticalDimensionFixed
            if (r6 == 0) goto L_0x00d9
            android.support.constraint.solver.widgets.ResolutionDimension r6 = r15.getResolutionWidth()
            r6.resolve(r2)
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r15.getResolutionHeight()
            r2.resolve(r3)
            goto L_0x00d9
        L_0x00c6:
            r18 = r3
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r15.getResolutionWidth()
            r2.invalidate()
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r15.getResolutionHeight()
            r2.invalidate()
            goto L_0x00d9
        L_0x00d7:
            r18 = r3
        L_0x00d9:
            int r7 = r7 + 1
            r3 = r18
            r2 = r26
            goto L_0x001d
        L_0x00e1:
            r18 = r3
            android.support.constraint.solver.widgets.ConstraintWidgetContainer r2 = r0.mLayoutWidget
            r2.solveGraph()
            r2 = 0
        L_0x00e9:
            if (r2 >= r5) goto L_0x02e0
            android.view.View r3 = r0.getChildAt(r2)
            int r6 = r3.getVisibility()
            if (r6 == r10) goto L_0x02c8
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.constraint.ConstraintLayout$LayoutParams r6 = (android.support.constraint.ConstraintLayout.LayoutParams) r6
            android.support.constraint.solver.widgets.ConstraintWidget r7 = r6.widget
            boolean r11 = r6.isGuideline
            if (r11 != 0) goto L_0x02c8
            boolean r11 = r6.isHelper
            if (r11 != 0) goto L_0x02c8
            int r11 = r3.getVisibility()
            r7.setVisibility(r11)
            int r11 = r6.width
            int r12 = r6.height
            if (r11 == 0) goto L_0x0114
            if (r12 != 0) goto L_0x02c8
        L_0x0114:
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r13 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT
            android.support.constraint.solver.widgets.ConstraintAnchor r13 = r7.getAnchor(r13)
            android.support.constraint.solver.widgets.ResolutionAnchor r13 = r13.getResolutionNode()
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r14 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT
            android.support.constraint.solver.widgets.ConstraintAnchor r14 = r7.getAnchor(r14)
            android.support.constraint.solver.widgets.ResolutionAnchor r14 = r14.getResolutionNode()
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r15 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r7.getAnchor(r15)
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r15.getTarget()
            if (r15 == 0) goto L_0x0142
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r15 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r7.getAnchor(r15)
            android.support.constraint.solver.widgets.ConstraintAnchor r15 = r15.getTarget()
            if (r15 == 0) goto L_0x0142
            r15 = 1
            goto L_0x0143
        L_0x0142:
            r15 = 0
        L_0x0143:
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r10 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            android.support.constraint.solver.widgets.ConstraintAnchor r10 = r7.getAnchor(r10)
            android.support.constraint.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r8 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r7.getAnchor(r8)
            android.support.constraint.solver.widgets.ResolutionAnchor r8 = r8.getResolutionNode()
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r9 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r7.getAnchor(r9)
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.getTarget()
            if (r9 == 0) goto L_0x0171
            android.support.constraint.solver.widgets.ConstraintAnchor$Type r9 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r7.getAnchor(r9)
            android.support.constraint.solver.widgets.ConstraintAnchor r9 = r9.getTarget()
            if (r9 == 0) goto L_0x0171
            r9 = 1
            goto L_0x0172
        L_0x0171:
            r9 = 0
        L_0x0172:
            if (r11 != 0) goto L_0x0189
            if (r12 != 0) goto L_0x0189
            if (r15 == 0) goto L_0x0189
            if (r9 != 0) goto L_0x017b
            goto L_0x0189
        L_0x017b:
            r22 = r2
            r21 = r5
            r9 = r18
            r3 = -1
            r8 = r26
            r13 = -2
            r19 = 1
            goto L_0x02d4
        L_0x0189:
            r21 = r5
            android.support.constraint.solver.widgets.ConstraintWidgetContainer r5 = r0.mLayoutWidget
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r5.getHorizontalDimensionBehaviour()
            r22 = r2
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r2) goto L_0x0199
            r2 = 1
            goto L_0x019a
        L_0x0199:
            r2 = 0
        L_0x019a:
            android.support.constraint.solver.widgets.ConstraintWidgetContainer r5 = r0.mLayoutWidget
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = r5.getVerticalDimensionBehaviour()
            r23 = r6
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r5 == r6) goto L_0x01a8
            r6 = 1
            goto L_0x01a9
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            if (r2 != 0) goto L_0x01b2
            android.support.constraint.solver.widgets.ResolutionDimension r5 = r7.getResolutionWidth()
            r5.invalidate()
        L_0x01b2:
            if (r6 != 0) goto L_0x01bb
            android.support.constraint.solver.widgets.ResolutionDimension r5 = r7.getResolutionHeight()
            r5.invalidate()
        L_0x01bb:
            if (r11 != 0) goto L_0x01ee
            if (r2 == 0) goto L_0x01e5
            boolean r5 = r7.isSpreadWidth()
            if (r5 == 0) goto L_0x01e5
            if (r15 == 0) goto L_0x01e5
            boolean r5 = r13.isResolved()
            if (r5 == 0) goto L_0x01e5
            boolean r5 = r14.isResolved()
            if (r5 == 0) goto L_0x01e5
            float r5 = r14.getResolvedValue()
            float r11 = r13.getResolvedValue()
            float r5 = r5 - r11
            int r11 = (int) r5
            android.support.constraint.solver.widgets.ResolutionDimension r5 = r7.getResolutionWidth()
            r5.resolve(r11)
            goto L_0x01fd
        L_0x01e5:
            r5 = -2
            int r2 = getChildMeasureSpec(r1, r4, r5)
            r13 = r2
            r2 = 0
            r5 = 1
            goto L_0x0202
        L_0x01ee:
            r5 = -2
            r13 = -1
            if (r11 != r13) goto L_0x01f9
            int r14 = getChildMeasureSpec(r1, r4, r13)
            r13 = r14
            r5 = 0
            goto L_0x0202
        L_0x01f9:
            if (r11 != r5) goto L_0x01fd
            r5 = 1
            goto L_0x01fe
        L_0x01fd:
            r5 = 0
        L_0x01fe:
            int r13 = getChildMeasureSpec(r1, r4, r11)
        L_0x0202:
            if (r12 != 0) goto L_0x023d
            if (r6 == 0) goto L_0x0230
            boolean r14 = r7.isSpreadHeight()
            if (r14 == 0) goto L_0x0230
            if (r9 == 0) goto L_0x0230
            boolean r9 = r10.isResolved()
            if (r9 == 0) goto L_0x0230
            boolean r9 = r8.isResolved()
            if (r9 == 0) goto L_0x0230
            float r8 = r8.getResolvedValue()
            float r9 = r10.getResolvedValue()
            float r8 = r8 - r9
            int r12 = (int) r8
            android.support.constraint.solver.widgets.ResolutionDimension r8 = r7.getResolutionHeight()
            r8.resolve(r12)
            r9 = r18
            r8 = r26
            goto L_0x0250
        L_0x0230:
            r9 = r18
            r8 = r26
            r10 = -2
            int r6 = getChildMeasureSpec(r8, r9, r10)
            r14 = r6
            r6 = 0
            r10 = 1
            goto L_0x0255
        L_0x023d:
            r9 = r18
            r8 = r26
            r10 = -2
            r14 = -1
            if (r12 != r14) goto L_0x024c
            int r15 = getChildMeasureSpec(r8, r9, r14)
            r14 = r15
            r10 = 0
            goto L_0x0255
        L_0x024c:
            if (r12 != r10) goto L_0x0250
            r10 = 1
            goto L_0x0251
        L_0x0250:
            r10 = 0
        L_0x0251:
            int r14 = getChildMeasureSpec(r8, r9, r12)
        L_0x0255:
            r3.measure(r13, r14)
            android.support.constraint.solver.Metrics r13 = r0.mMetrics
            if (r13 == 0) goto L_0x0267
            android.support.constraint.solver.Metrics r13 = r0.mMetrics
            long r14 = r13.measures
            r19 = 1
            long r14 = r14 + r19
            r13.measures = r14
            goto L_0x0269
        L_0x0267:
            r19 = 1
        L_0x0269:
            r13 = -2
            if (r11 != r13) goto L_0x026e
            r11 = 1
            goto L_0x026f
        L_0x026e:
            r11 = 0
        L_0x026f:
            r7.setWidthWrapContent(r11)
            if (r12 != r13) goto L_0x0276
            r11 = 1
            goto L_0x0277
        L_0x0276:
            r11 = 0
        L_0x0277:
            r7.setHeightWrapContent(r11)
            int r11 = r3.getMeasuredWidth()
            int r12 = r3.getMeasuredHeight()
            r7.setWidth(r11)
            r7.setHeight(r12)
            if (r5 == 0) goto L_0x028d
            r7.setWrapWidth(r11)
        L_0x028d:
            if (r10 == 0) goto L_0x0292
            r7.setWrapHeight(r12)
        L_0x0292:
            if (r2 == 0) goto L_0x029c
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r7.getResolutionWidth()
            r2.resolve(r11)
            goto L_0x02a3
        L_0x029c:
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r7.getResolutionWidth()
            r2.remove()
        L_0x02a3:
            if (r6 == 0) goto L_0x02af
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r7.getResolutionHeight()
            r2.resolve(r12)
        L_0x02ac:
            r6 = r23
            goto L_0x02b7
        L_0x02af:
            android.support.constraint.solver.widgets.ResolutionDimension r2 = r7.getResolutionHeight()
            r2.remove()
            goto L_0x02ac
        L_0x02b7:
            boolean r2 = r6.needsBaseline
            if (r2 == 0) goto L_0x02c6
            int r2 = r3.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x02d4
            r7.setBaselineDistance(r2)
            goto L_0x02d4
        L_0x02c6:
            r3 = -1
            goto L_0x02d4
        L_0x02c8:
            r22 = r2
            r21 = r5
            r19 = r8
            r9 = r18
            r3 = -1
            r8 = r26
            r13 = -2
        L_0x02d4:
            int r2 = r22 + 1
            r18 = r9
            r8 = r19
            r5 = r21
            r10 = 8
            goto L_0x00e9
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.internalMeasureDimensions(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i10;
        boolean z7;
        int i11 = i;
        int i12 = i2;
        System.currentTimeMillis();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.mLastMeasureWidthMode = mode;
        this.mLastMeasureHeightMode = mode2;
        this.mLastMeasureWidthSize = size;
        this.mLastMeasureHeightSize = size2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.mLayoutWidget.setX(paddingLeft);
        this.mLayoutWidget.setY(paddingTop);
        this.mLayoutWidget.setMaxWidth(this.mMaxWidth);
        this.mLayoutWidget.setMaxHeight(this.mMaxHeight);
        if (Build.VERSION.SDK_INT >= 17) {
            ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            if (getLayoutDirection() == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            constraintWidgetContainer.setRtl(z7);
        }
        setSelfDimensionBehaviour(i, i2);
        int width = this.mLayoutWidget.getWidth();
        int height = this.mLayoutWidget.getHeight();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            updateHierarchy();
        }
        if ((this.mOptimizationLevel & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mLayoutWidget.preOptimize();
            this.mLayoutWidget.optimizeForDimensions(width, height);
            internalMeasureDimensions(i, i2);
        } else {
            internalMeasureChildren(i, i2);
        }
        updatePostMeasures();
        if (getChildCount() > 0) {
            solveLinearSystem("First pass");
        }
        int size3 = this.mVariableDimensionsWidgets.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            if (this.mLayoutWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.mLayoutWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z3 = true;
            } else {
                z3 = false;
            }
            int max = Math.max(this.mLayoutWidget.getWidth(), this.mMinWidth);
            int max2 = Math.max(this.mLayoutWidget.getHeight(), this.mMinHeight);
            int i13 = 0;
            boolean z8 = false;
            int i14 = 0;
            while (i13 < size3) {
                ConstraintWidget constraintWidget = this.mVariableDimensionsWidgets.get(i13);
                int i15 = size3;
                View view = (View) constraintWidget.getCompanionWidget();
                if (view != null) {
                    i7 = height;
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    i6 = width;
                    if (layoutParams.isHelper || layoutParams.isGuideline) {
                        i8 = paddingBottom;
                        z6 = z8;
                    } else {
                        z6 = z8;
                        if (view.getVisibility() == 8 || (z && constraintWidget.getResolutionWidth().isResolved() && constraintWidget.getResolutionHeight().isResolved())) {
                            i8 = paddingBottom;
                        } else {
                            if (layoutParams.width != -2 || !layoutParams.horizontalDimensionFixed) {
                                i9 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getWidth(), 1073741824);
                            } else {
                                i9 = getChildMeasureSpec(i11, paddingRight, layoutParams.width);
                            }
                            if (layoutParams.height != -2 || !layoutParams.verticalDimensionFixed) {
                                i10 = View.MeasureSpec.makeMeasureSpec(constraintWidget.getHeight(), 1073741824);
                            } else {
                                i10 = getChildMeasureSpec(i12, paddingBottom, layoutParams.height);
                            }
                            view.measure(i9, i10);
                            if (this.mMetrics != null) {
                                i5 = paddingBottom;
                                this.mMetrics.additionalMeasures++;
                            } else {
                                i5 = paddingBottom;
                            }
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            if (measuredWidth != constraintWidget.getWidth()) {
                                constraintWidget.setWidth(measuredWidth);
                                if (z) {
                                    constraintWidget.getResolutionWidth().resolve(measuredWidth);
                                }
                                if (z2 && constraintWidget.getRight() > max) {
                                    max = Math.max(max, constraintWidget.getRight() + constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                z8 = true;
                            } else {
                                z8 = z6;
                            }
                            if (measuredHeight != constraintWidget.getHeight()) {
                                constraintWidget.setHeight(measuredHeight);
                                if (z) {
                                    constraintWidget.getResolutionHeight().resolve(measuredHeight);
                                }
                                if (z3 && constraintWidget.getBottom() > max2) {
                                    max2 = Math.max(max2, constraintWidget.getBottom() + constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                z8 = true;
                            }
                            if (layoutParams.needsBaseline) {
                                int baseline = view.getBaseline();
                                if (!(baseline == -1 || baseline == constraintWidget.getBaselineDistance())) {
                                    constraintWidget.setBaselineDistance(baseline);
                                    z8 = true;
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                i14 = combineMeasuredStates(i14, view.getMeasuredState());
                            } else {
                                int i16 = i14;
                            }
                            i13++;
                            size3 = i15;
                            height = i7;
                            width = i6;
                            paddingBottom = i5;
                            i11 = i;
                        }
                    }
                } else {
                    i8 = paddingBottom;
                    i6 = width;
                    z6 = z8;
                    i7 = height;
                }
                i14 = i14;
                z8 = z6;
                i13++;
                size3 = i15;
                height = i7;
                width = i6;
                paddingBottom = i5;
                i11 = i;
            }
            i3 = paddingBottom;
            int i17 = width;
            int i18 = height;
            int i19 = size3;
            i4 = i14;
            if (z8) {
                this.mLayoutWidget.setWidth(i17);
                this.mLayoutWidget.setHeight(i18);
                if (z) {
                    this.mLayoutWidget.solveGraph();
                }
                solveLinearSystem("2nd pass");
                if (this.mLayoutWidget.getWidth() < max) {
                    this.mLayoutWidget.setWidth(max);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.mLayoutWidget.getHeight() < max2) {
                    this.mLayoutWidget.setHeight(max2);
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (z5) {
                    solveLinearSystem("3rd pass");
                }
            }
            int i20 = i19;
            for (int i21 = 0; i21 < i20; i21++) {
                ConstraintWidget constraintWidget2 = this.mVariableDimensionsWidgets.get(i21);
                View view2 = (View) constraintWidget2.getCompanionWidget();
                if (view2 != null && (view2.getMeasuredWidth() != constraintWidget2.getWidth() || view2.getMeasuredHeight() != constraintWidget2.getHeight())) {
                    if (constraintWidget2.getVisibility() != 8) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(constraintWidget2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(constraintWidget2.getHeight(), 1073741824));
                        if (this.mMetrics != null) {
                            this.mMetrics.additionalMeasures++;
                        }
                    }
                }
            }
        } else {
            i3 = paddingBottom;
            i4 = 0;
        }
        int width2 = this.mLayoutWidget.getWidth() + paddingRight;
        int height2 = this.mLayoutWidget.getHeight() + i3;
        if (Build.VERSION.SDK_INT >= 11) {
            int min = Math.min(this.mMaxWidth, resolveSizeAndState(width2, i, i4) & 16777215);
            int min2 = Math.min(this.mMaxHeight, resolveSizeAndState(height2, i12, i4 << 16) & 16777215);
            if (this.mLayoutWidget.isWidthMeasuredTooSmall()) {
                min |= 16777216;
            }
            if (this.mLayoutWidget.isHeightMeasuredTooSmall()) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.mLastMeasureWidth = min;
            this.mLastMeasureHeight = min2;
            return;
        }
        setMeasuredDimension(width2, height2);
        this.mLastMeasureWidth = width2;
        this.mLastMeasureHeight = height2;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || isInEditMode) && !layoutParams.isInPlaceholder) {
                int drawX = constraintWidget.getDrawX();
                int drawY = constraintWidget.getDrawY();
                int width = constraintWidget.getWidth() + drawX;
                int height = constraintWidget.getHeight() + drawY;
                childAt.layout(drawX, drawY, width, height);
                if (childAt instanceof Placeholder) {
                    View content = ((Placeholder) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(drawX, drawY, width, height);
                    }
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }
}
