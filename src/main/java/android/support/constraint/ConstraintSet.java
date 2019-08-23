package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.a.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static SparseIntArray mapToConstant;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    static class Constraint {
        public float alpha;
        public boolean applyElevation;
        public int baselineToBaseline;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public float elevation;
        public int endMargin;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public int mBarrierDirection;
        public int mHeight;
        public int mHelperType;
        boolean mIsGuideline;
        public int[] mReferenceIds;
        int mViewId;
        public int mWidth;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int visibility;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        private Constraint() {
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1.0f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.circleConstraint = -1;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.leftMargin = -1;
            this.rightMargin = -1;
            this.topMargin = -1;
            this.bottomMargin = -1;
            this.endMargin = -1;
            this.startMargin = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneEndMargin = -1;
            this.goneStartMargin = -1;
            this.alpha = 1.0f;
            this.scaleX = 1.0f;
            this.scaleY = 1.0f;
            this.transformPivotX = Float.NaN;
            this.transformPivotY = Float.NaN;
            this.widthMax = -1;
            this.heightMax = -1;
            this.widthMin = -1;
            this.heightMin = -1;
            this.widthPercent = 1.0f;
            this.heightPercent = 1.0f;
            this.mBarrierDirection = -1;
            this.mHelperType = -1;
        }

        public Constraint clone() {
            Constraint constraint = new Constraint();
            constraint.mIsGuideline = this.mIsGuideline;
            constraint.mWidth = this.mWidth;
            constraint.mHeight = this.mHeight;
            constraint.guideBegin = this.guideBegin;
            constraint.guideEnd = this.guideEnd;
            constraint.guidePercent = this.guidePercent;
            constraint.leftToLeft = this.leftToLeft;
            constraint.leftToRight = this.leftToRight;
            constraint.rightToLeft = this.rightToLeft;
            constraint.rightToRight = this.rightToRight;
            constraint.topToTop = this.topToTop;
            constraint.topToBottom = this.topToBottom;
            constraint.bottomToTop = this.bottomToTop;
            constraint.bottomToBottom = this.bottomToBottom;
            constraint.baselineToBaseline = this.baselineToBaseline;
            constraint.startToEnd = this.startToEnd;
            constraint.startToStart = this.startToStart;
            constraint.endToStart = this.endToStart;
            constraint.endToEnd = this.endToEnd;
            constraint.horizontalBias = this.horizontalBias;
            constraint.verticalBias = this.verticalBias;
            constraint.dimensionRatio = this.dimensionRatio;
            constraint.editorAbsoluteX = this.editorAbsoluteX;
            constraint.editorAbsoluteY = this.editorAbsoluteY;
            constraint.horizontalBias = this.horizontalBias;
            constraint.horizontalBias = this.horizontalBias;
            constraint.horizontalBias = this.horizontalBias;
            constraint.horizontalBias = this.horizontalBias;
            constraint.horizontalBias = this.horizontalBias;
            constraint.orientation = this.orientation;
            constraint.leftMargin = this.leftMargin;
            constraint.rightMargin = this.rightMargin;
            constraint.topMargin = this.topMargin;
            constraint.bottomMargin = this.bottomMargin;
            constraint.endMargin = this.endMargin;
            constraint.startMargin = this.startMargin;
            constraint.visibility = this.visibility;
            constraint.goneLeftMargin = this.goneLeftMargin;
            constraint.goneTopMargin = this.goneTopMargin;
            constraint.goneRightMargin = this.goneRightMargin;
            constraint.goneBottomMargin = this.goneBottomMargin;
            constraint.goneEndMargin = this.goneEndMargin;
            constraint.goneStartMargin = this.goneStartMargin;
            constraint.verticalWeight = this.verticalWeight;
            constraint.horizontalWeight = this.horizontalWeight;
            constraint.horizontalChainStyle = this.horizontalChainStyle;
            constraint.verticalChainStyle = this.verticalChainStyle;
            constraint.alpha = this.alpha;
            constraint.applyElevation = this.applyElevation;
            constraint.elevation = this.elevation;
            constraint.rotation = this.rotation;
            constraint.rotationX = this.rotationX;
            constraint.rotationY = this.rotationY;
            constraint.scaleX = this.scaleX;
            constraint.scaleY = this.scaleY;
            constraint.transformPivotX = this.transformPivotX;
            constraint.transformPivotY = this.transformPivotY;
            constraint.translationX = this.translationX;
            constraint.translationY = this.translationY;
            constraint.translationZ = this.translationZ;
            constraint.constrainedWidth = this.constrainedWidth;
            constraint.constrainedHeight = this.constrainedHeight;
            constraint.widthDefault = this.widthDefault;
            constraint.heightDefault = this.heightDefault;
            constraint.widthMax = this.widthMax;
            constraint.heightMax = this.heightMax;
            constraint.widthMin = this.widthMin;
            constraint.heightMin = this.heightMin;
            constraint.widthPercent = this.widthPercent;
            constraint.heightPercent = this.heightPercent;
            constraint.mBarrierDirection = this.mBarrierDirection;
            constraint.mHelperType = this.mHelperType;
            if (this.mReferenceIds != null) {
                constraint.mReferenceIds = Arrays.copyOf(this.mReferenceIds, this.mReferenceIds.length);
            }
            constraint.circleConstraint = this.circleConstraint;
            constraint.circleRadius = this.circleRadius;
            constraint.circleAngle = this.circleAngle;
            return constraint;
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.leftToLeft = this.leftToLeft;
            layoutParams.leftToRight = this.leftToRight;
            layoutParams.rightToLeft = this.rightToLeft;
            layoutParams.rightToRight = this.rightToRight;
            layoutParams.topToTop = this.topToTop;
            layoutParams.topToBottom = this.topToBottom;
            layoutParams.bottomToTop = this.bottomToTop;
            layoutParams.bottomToBottom = this.bottomToBottom;
            layoutParams.baselineToBaseline = this.baselineToBaseline;
            layoutParams.startToEnd = this.startToEnd;
            layoutParams.startToStart = this.startToStart;
            layoutParams.endToStart = this.endToStart;
            layoutParams.endToEnd = this.endToEnd;
            layoutParams.leftMargin = this.leftMargin;
            layoutParams.rightMargin = this.rightMargin;
            layoutParams.topMargin = this.topMargin;
            layoutParams.bottomMargin = this.bottomMargin;
            layoutParams.goneStartMargin = this.goneStartMargin;
            layoutParams.goneEndMargin = this.goneEndMargin;
            layoutParams.horizontalBias = this.horizontalBias;
            layoutParams.verticalBias = this.verticalBias;
            layoutParams.circleConstraint = this.circleConstraint;
            layoutParams.circleRadius = this.circleRadius;
            layoutParams.circleAngle = this.circleAngle;
            layoutParams.dimensionRatio = this.dimensionRatio;
            layoutParams.editorAbsoluteX = this.editorAbsoluteX;
            layoutParams.editorAbsoluteY = this.editorAbsoluteY;
            layoutParams.verticalWeight = this.verticalWeight;
            layoutParams.horizontalWeight = this.horizontalWeight;
            layoutParams.verticalChainStyle = this.verticalChainStyle;
            layoutParams.horizontalChainStyle = this.horizontalChainStyle;
            layoutParams.constrainedWidth = this.constrainedWidth;
            layoutParams.constrainedHeight = this.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = this.widthDefault;
            layoutParams.matchConstraintDefaultHeight = this.heightDefault;
            layoutParams.matchConstraintMaxWidth = this.widthMax;
            layoutParams.matchConstraintMaxHeight = this.heightMax;
            layoutParams.matchConstraintMinWidth = this.widthMin;
            layoutParams.matchConstraintMinHeight = this.heightMin;
            layoutParams.matchConstraintPercentWidth = this.widthPercent;
            layoutParams.matchConstraintPercentHeight = this.heightPercent;
            layoutParams.orientation = this.orientation;
            layoutParams.guidePercent = this.guidePercent;
            layoutParams.guideBegin = this.guideBegin;
            layoutParams.guideEnd = this.guideEnd;
            layoutParams.width = this.mWidth;
            layoutParams.height = this.mHeight;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.startMargin);
                layoutParams.setMarginEnd(this.endMargin);
            }
            layoutParams.validate();
        }

        public void fillFromConstraints(int i, Constraints.LayoutParams layoutParams) {
            fillFrom(i, layoutParams);
            this.alpha = layoutParams.alpha;
            this.rotation = layoutParams.rotation;
            this.rotationX = layoutParams.rotationX;
            this.rotationY = layoutParams.rotationY;
            this.scaleX = layoutParams.scaleX;
            this.scaleY = layoutParams.scaleY;
            this.transformPivotX = layoutParams.transformPivotX;
            this.transformPivotY = layoutParams.transformPivotY;
            this.translationX = layoutParams.translationX;
            this.translationY = layoutParams.translationY;
            this.translationZ = layoutParams.translationZ;
            this.elevation = layoutParams.elevation;
            this.applyElevation = layoutParams.applyElevation;
        }

        public void fillFrom(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.guidePercent = layoutParams.guidePercent;
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.mWidth = layoutParams.width;
            this.mHeight = layoutParams.height;
            this.leftMargin = layoutParams.leftMargin;
            this.rightMargin = layoutParams.rightMargin;
            this.topMargin = layoutParams.topMargin;
            this.bottomMargin = layoutParams.bottomMargin;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.widthDefault = layoutParams.matchConstraintDefaultWidth;
            this.heightDefault = layoutParams.matchConstraintDefaultHeight;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.widthMax = layoutParams.matchConstraintMaxWidth;
            this.heightMax = layoutParams.matchConstraintMaxHeight;
            this.widthMin = layoutParams.matchConstraintMinWidth;
            this.heightMin = layoutParams.matchConstraintMinHeight;
            this.widthPercent = layoutParams.matchConstraintPercentWidth;
            this.heightPercent = layoutParams.matchConstraintPercentHeight;
            if (Build.VERSION.SDK_INT >= 17) {
                this.endMargin = layoutParams.getMarginEnd();
                this.startMargin = layoutParams.getMarginStart();
            }
        }

        public void fillFromConstraints(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                this.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                this.mBarrierDirection = barrier.getType();
                this.mReferenceIds = barrier.getReferencedIds();
            }
        }
    }

    private String sideToString(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case e.l /*7*/:
                return "end";
            default:
                return "undefined";
        }
    }

    public void setBarrierType(int i, int i2) {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        mapToConstant = sparseIntArray;
        sparseIntArray.append(47, 25);
        mapToConstant.append(48, 26);
        mapToConstant.append(50, 29);
        mapToConstant.append(51, 30);
        mapToConstant.append(56, 36);
        mapToConstant.append(55, 35);
        mapToConstant.append(29, 4);
        mapToConstant.append(28, 3);
        mapToConstant.append(26, 1);
        mapToConstant.append(64, 6);
        mapToConstant.append(65, 7);
        mapToConstant.append(36, 17);
        mapToConstant.append(37, 18);
        mapToConstant.append(38, 19);
        mapToConstant.append(0, 27);
        mapToConstant.append(52, 32);
        mapToConstant.append(53, 33);
        mapToConstant.append(35, 10);
        mapToConstant.append(34, 9);
        mapToConstant.append(68, 13);
        mapToConstant.append(71, 16);
        mapToConstant.append(69, 14);
        mapToConstant.append(66, 11);
        mapToConstant.append(70, 15);
        mapToConstant.append(67, 12);
        mapToConstant.append(59, 40);
        mapToConstant.append(45, 39);
        mapToConstant.append(44, 41);
        mapToConstant.append(58, 42);
        mapToConstant.append(43, 20);
        mapToConstant.append(57, 37);
        mapToConstant.append(33, 5);
        mapToConstant.append(46, 64);
        mapToConstant.append(54, 64);
        mapToConstant.append(49, 64);
        mapToConstant.append(27, 64);
        mapToConstant.append(25, 64);
        mapToConstant.append(5, 24);
        mapToConstant.append(7, 28);
        mapToConstant.append(19, 31);
        mapToConstant.append(20, 8);
        mapToConstant.append(6, 34);
        mapToConstant.append(8, 2);
        mapToConstant.append(3, 23);
        mapToConstant.append(4, 21);
        mapToConstant.append(2, 22);
        mapToConstant.append(9, 43);
        mapToConstant.append(22, 44);
        mapToConstant.append(17, 45);
        mapToConstant.append(18, 46);
        mapToConstant.append(16, 60);
        mapToConstant.append(14, 47);
        mapToConstant.append(15, 48);
        mapToConstant.append(10, 49);
        mapToConstant.append(11, 50);
        mapToConstant.append(12, 51);
        mapToConstant.append(13, 52);
        mapToConstant.append(21, 53);
        mapToConstant.append(60, 54);
        mapToConstant.append(39, 55);
        mapToConstant.append(61, 56);
        mapToConstant.append(40, 57);
        mapToConstant.append(62, 58);
        mapToConstant.append(41, 59);
        mapToConstant.append(30, 61);
        mapToConstant.append(32, 62);
        mapToConstant.append(31, 63);
        mapToConstant.append(1, 38);
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public boolean getApplyElevation(int i) {
        return get(i).applyElevation;
    }

    public void clear(int i) {
        this.mConstraints.remove(Integer.valueOf(i));
    }

    private Constraint get(int i) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i));
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer next : constraintSet.mConstraints.keySet()) {
            this.mConstraints.put(next, constraintSet.mConstraints.get(next).clone());
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    constraint.fillFromConstraints((ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.fillFromConstraints(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void removeFromVerticalChain(int i) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            int i2 = constraint.topToBottom;
            int i3 = constraint.bottomToTop;
            if (!(i2 == -1 && i3 == -1)) {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 4, i3, 3, 0);
                    connect(i3, 3, i2, 4, 0);
                } else if (!(i2 == -1 && i3 == -1)) {
                    if (constraint.bottomToBottom != -1) {
                        connect(i2, 4, constraint.bottomToBottom, 4, 0);
                    } else if (constraint.topToTop != -1) {
                        connect(i3, 3, constraint.topToTop, 3, 0);
                    }
                }
            }
        }
        clear(i, 3);
        clear(i, 4);
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                    this.mConstraints.put(Integer.valueOf(id), new Constraint());
                }
                Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                constraint.fillFrom(id, layoutParams);
                constraint.visibility = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    constraint.alpha = childAt.getAlpha();
                    constraint.rotation = childAt.getRotation();
                    constraint.rotationX = childAt.getRotationX();
                    constraint.rotationY = childAt.getRotationY();
                    constraint.scaleX = childAt.getScaleX();
                    constraint.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        constraint.transformPivotX = pivotX;
                        constraint.transformPivotY = pivotY;
                    }
                    constraint.translationX = childAt.getTranslationX();
                    constraint.translationY = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        constraint.translationZ = childAt.getTranslationZ();
                        if (constraint.applyElevation) {
                            constraint.elevation = childAt.getElevation();
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void removeFromHorizontalChain(int i) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            int i2 = constraint.leftToRight;
            int i3 = constraint.rightToLeft;
            if (i2 == -1 && i3 == -1) {
                int i4 = constraint.startToEnd;
                int i5 = constraint.endToStart;
                if (!(i4 == -1 && i5 == -1)) {
                    if (i4 != -1 && i5 != -1) {
                        connect(i4, 7, i5, 6, 0);
                        connect(i5, 6, i2, 7, 0);
                    } else if (!(i2 == -1 && i5 == -1)) {
                        if (constraint.rightToRight != -1) {
                            connect(i2, 7, constraint.rightToRight, 7, 0);
                        } else if (constraint.leftToLeft != -1) {
                            connect(i5, 6, constraint.leftToLeft, 6, 0);
                        }
                    }
                }
                clear(i, 6);
                clear(i, 7);
            } else {
                if (i2 != -1 && i3 != -1) {
                    connect(i2, 2, i3, 1, 0);
                    connect(i3, 1, i2, 2, 0);
                } else if (!(i2 == -1 && i3 == -1)) {
                    if (constraint.rightToRight != -1) {
                        connect(i2, 2, constraint.rightToRight, 2, 0);
                    } else if (constraint.leftToLeft != -1) {
                        connect(i3, 1, constraint.leftToLeft, 1, 0);
                    }
                }
                clear(i, 1);
                clear(i, 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void applyToInternal(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                    if (constraint.mHelperType != -1 && constraint.mHelperType == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setReferencedIds(constraint.mReferenceIds);
                        barrier.setType(constraint.mBarrierDirection);
                        constraint.applyTo(constraintLayout.generateDefaultLayoutParams());
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    constraint.applyTo(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(constraint.visibility);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(constraint.alpha);
                        childAt.setRotation(constraint.rotation);
                        childAt.setRotationX(constraint.rotationX);
                        childAt.setRotationY(constraint.rotationY);
                        childAt.setScaleX(constraint.scaleX);
                        childAt.setScaleY(constraint.scaleY);
                        if (!Float.isNaN(constraint.transformPivotX)) {
                            childAt.setPivotX(constraint.transformPivotX);
                        }
                        if (!Float.isNaN(constraint.transformPivotY)) {
                            childAt.setPivotY(constraint.transformPivotY);
                        }
                        childAt.setTranslationX(constraint.translationX);
                        childAt.setTranslationY(constraint.translationY);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(constraint.translationZ);
                            if (constraint.applyElevation) {
                                childAt.setElevation(constraint.elevation);
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2.mHelperType != -1 && constraint2.mHelperType == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                barrier2.setReferencedIds(constraint2.mReferenceIds);
                barrier2.setType(constraint2.mBarrierDirection);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                constraint2.applyTo(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (constraint2.mIsGuideline) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.applyTo(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void constrainDefaultHeight(int i, int i2) {
        get(i).heightDefault = i2;
    }

    public void constrainDefaultWidth(int i, int i2) {
        get(i).widthDefault = i2;
    }

    public void constrainHeight(int i, int i2) {
        get(i).mHeight = i2;
    }

    public void constrainMaxHeight(int i, int i2) {
        get(i).heightMax = i2;
    }

    public void constrainMaxWidth(int i, int i2) {
        get(i).widthMax = i2;
    }

    public void constrainMinHeight(int i, int i2) {
        get(i).heightMin = i2;
    }

    public void constrainMinWidth(int i, int i2) {
        get(i).widthMin = i2;
    }

    public void constrainPercentHeight(int i, float f2) {
        get(i).heightPercent = f2;
    }

    public void constrainPercentWidth(int i, float f2) {
        get(i).widthPercent = f2;
    }

    public void constrainWidth(int i, int i2) {
        get(i).mWidth = i2;
    }

    public void setAlpha(int i, float f2) {
        get(i).alpha = f2;
    }

    public void setApplyElevation(int i, boolean z) {
        get(i).applyElevation = z;
    }

    public void setDimensionRatio(int i, String str) {
        get(i).dimensionRatio = str;
    }

    public void setHorizontalBias(int i, float f2) {
        get(i).horizontalBias = f2;
    }

    public void setHorizontalChainStyle(int i, int i2) {
        get(i).horizontalChainStyle = i2;
    }

    public void setHorizontalWeight(int i, float f2) {
        get(i).horizontalWeight = f2;
    }

    public void setRotation(int i, float f2) {
        get(i).rotation = f2;
    }

    public void setRotationX(int i, float f2) {
        get(i).rotationX = f2;
    }

    public void setRotationY(int i, float f2) {
        get(i).rotationY = f2;
    }

    public void setScaleX(int i, float f2) {
        get(i).scaleX = f2;
    }

    public void setScaleY(int i, float f2) {
        get(i).scaleY = f2;
    }

    public void setTransformPivotX(int i, float f2) {
        get(i).transformPivotX = f2;
    }

    public void setTransformPivotY(int i, float f2) {
        get(i).transformPivotY = f2;
    }

    public void setTranslationX(int i, float f2) {
        get(i).translationX = f2;
    }

    public void setTranslationY(int i, float f2) {
        get(i).translationY = f2;
    }

    public void setTranslationZ(int i, float f2) {
        get(i).translationZ = f2;
    }

    public void setVerticalBias(int i, float f2) {
        get(i).verticalBias = f2;
    }

    public void setVerticalChainStyle(int i, int i2) {
        get(i).verticalChainStyle = i2;
    }

    public void setVerticalWeight(int i, float f2) {
        get(i).verticalWeight = f2;
    }

    public void setVisibility(int i, int i2) {
        get(i).visibility = i2;
    }

    public void clone(Context context, int i) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    public void create(int i, int i2) {
        Constraint constraint = get(i);
        constraint.mIsGuideline = true;
        constraint.orientation = i2;
    }

    public void setElevation(int i, float f2) {
        get(i).elevation = f2;
        get(i).applyElevation = true;
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
        populateConstraint(constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    public void centerHorizontally(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i, int i2) {
        if (i2 == 0) {
            center(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    public void setGuidelineBegin(int i, int i2) {
        get(i).guideBegin = i2;
        get(i).guideEnd = -1;
        get(i).guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i, int i2) {
        get(i).guideEnd = i2;
        get(i).guideBegin = -1;
        get(i).guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i, float f2) {
        get(i).guidePercent = f2;
        get(i).guideEnd = -1;
        get(i).guideBegin = -1;
    }

    public void clear(int i, int i2) {
        if (this.mConstraints.containsKey(Integer.valueOf(i))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    constraint.leftToRight = -1;
                    constraint.leftToLeft = -1;
                    constraint.leftMargin = -1;
                    constraint.goneLeftMargin = -1;
                    return;
                case 2:
                    constraint.rightToRight = -1;
                    constraint.rightToLeft = -1;
                    constraint.rightMargin = -1;
                    constraint.goneRightMargin = -1;
                    return;
                case 3:
                    constraint.topToBottom = -1;
                    constraint.topToTop = -1;
                    constraint.topMargin = -1;
                    constraint.goneTopMargin = -1;
                    return;
                case 4:
                    constraint.bottomToTop = -1;
                    constraint.bottomToBottom = -1;
                    constraint.bottomMargin = -1;
                    constraint.goneBottomMargin = -1;
                    return;
                case 5:
                    constraint.baselineToBaseline = -1;
                    return;
                case 6:
                    constraint.startToEnd = -1;
                    constraint.startToStart = -1;
                    constraint.startMargin = -1;
                    constraint.goneStartMargin = -1;
                    return;
                case e.l /*7*/:
                    constraint.endToStart = -1;
                    constraint.endToEnd = -1;
                    constraint.endMargin = -1;
                    constraint.goneEndMargin = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void load(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint fillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        fillFromAttributeList.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(fillFromAttributeList.mViewId), fillFromAttributeList);
                }
            }
        } catch (XmlPullParserException unused) {
        } catch (IOException unused2) {
        }
    }

    private void populateConstraint(Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = mapToConstant.get(index);
            switch (i2) {
                case 1:
                    constraint.baselineToBaseline = lookupID(typedArray, index, constraint.baselineToBaseline);
                    break;
                case 2:
                    constraint.bottomMargin = typedArray.getDimensionPixelSize(index, constraint.bottomMargin);
                    break;
                case 3:
                    constraint.bottomToBottom = lookupID(typedArray, index, constraint.bottomToBottom);
                    break;
                case 4:
                    constraint.bottomToTop = lookupID(typedArray, index, constraint.bottomToTop);
                    break;
                case 5:
                    constraint.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    constraint.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, constraint.editorAbsoluteX);
                    break;
                case e.l /*7*/:
                    constraint.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, constraint.editorAbsoluteY);
                    break;
                case 8:
                    constraint.endMargin = typedArray.getDimensionPixelSize(index, constraint.endMargin);
                    break;
                case 9:
                    constraint.endToEnd = lookupID(typedArray, index, constraint.endToEnd);
                    break;
                case 10:
                    constraint.endToStart = lookupID(typedArray, index, constraint.endToStart);
                    break;
                case 11:
                    constraint.goneBottomMargin = typedArray.getDimensionPixelSize(index, constraint.goneBottomMargin);
                    break;
                case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    constraint.goneEndMargin = typedArray.getDimensionPixelSize(index, constraint.goneEndMargin);
                    break;
                case 13:
                    constraint.goneLeftMargin = typedArray.getDimensionPixelSize(index, constraint.goneLeftMargin);
                    break;
                case 14:
                    constraint.goneRightMargin = typedArray.getDimensionPixelSize(index, constraint.goneRightMargin);
                    break;
                case 15:
                    constraint.goneStartMargin = typedArray.getDimensionPixelSize(index, constraint.goneStartMargin);
                    break;
                case SearchJediMixFeedAdapter.f42514c /*16*/:
                    constraint.goneTopMargin = typedArray.getDimensionPixelSize(index, constraint.goneTopMargin);
                    break;
                case 17:
                    constraint.guideBegin = typedArray.getDimensionPixelOffset(index, constraint.guideBegin);
                    break;
                case 18:
                    constraint.guideEnd = typedArray.getDimensionPixelOffset(index, constraint.guideEnd);
                    break;
                case 19:
                    constraint.guidePercent = typedArray.getFloat(index, constraint.guidePercent);
                    break;
                case 20:
                    constraint.horizontalBias = typedArray.getFloat(index, constraint.horizontalBias);
                    break;
                case 21:
                    constraint.mHeight = typedArray.getLayoutDimension(index, constraint.mHeight);
                    break;
                case 22:
                    constraint.visibility = typedArray.getInt(index, constraint.visibility);
                    constraint.visibility = VISIBILITY_FLAGS[constraint.visibility];
                    break;
                case 23:
                    constraint.mWidth = typedArray.getLayoutDimension(index, constraint.mWidth);
                    break;
                case 24:
                    constraint.leftMargin = typedArray.getDimensionPixelSize(index, constraint.leftMargin);
                    break;
                case 25:
                    constraint.leftToLeft = lookupID(typedArray, index, constraint.leftToLeft);
                    break;
                case 26:
                    constraint.leftToRight = lookupID(typedArray, index, constraint.leftToRight);
                    break;
                case 27:
                    constraint.orientation = typedArray.getInt(index, constraint.orientation);
                    break;
                case 28:
                    constraint.rightMargin = typedArray.getDimensionPixelSize(index, constraint.rightMargin);
                    break;
                case 29:
                    constraint.rightToLeft = lookupID(typedArray, index, constraint.rightToLeft);
                    break;
                case c.f69366e /*30*/:
                    constraint.rightToRight = lookupID(typedArray, index, constraint.rightToRight);
                    break;
                case c.f69367f /*31*/:
                    constraint.startMargin = typedArray.getDimensionPixelSize(index, constraint.startMargin);
                    break;
                case 32:
                    constraint.startToEnd = lookupID(typedArray, index, constraint.startToEnd);
                    break;
                case 33:
                    constraint.startToStart = lookupID(typedArray, index, constraint.startToStart);
                    break;
                case 34:
                    constraint.topMargin = typedArray.getDimensionPixelSize(index, constraint.topMargin);
                    break;
                case 35:
                    constraint.topToBottom = lookupID(typedArray, index, constraint.topToBottom);
                    break;
                case 36:
                    constraint.topToTop = lookupID(typedArray, index, constraint.topToTop);
                    break;
                case 37:
                    constraint.verticalBias = typedArray.getFloat(index, constraint.verticalBias);
                    break;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    break;
                case 39:
                    constraint.horizontalWeight = typedArray.getFloat(index, constraint.horizontalWeight);
                    break;
                case 40:
                    constraint.verticalWeight = typedArray.getFloat(index, constraint.verticalWeight);
                    break;
                case 41:
                    constraint.horizontalChainStyle = typedArray.getInt(index, constraint.horizontalChainStyle);
                    break;
                case 42:
                    constraint.verticalChainStyle = typedArray.getInt(index, constraint.verticalChainStyle);
                    break;
                case 43:
                    constraint.alpha = typedArray.getFloat(index, constraint.alpha);
                    break;
                case 44:
                    constraint.applyElevation = true;
                    constraint.elevation = typedArray.getDimension(index, constraint.elevation);
                    break;
                case 45:
                    constraint.rotationX = typedArray.getFloat(index, constraint.rotationX);
                    break;
                case 46:
                    constraint.rotationY = typedArray.getFloat(index, constraint.rotationY);
                    break;
                case 47:
                    constraint.scaleX = typedArray.getFloat(index, constraint.scaleX);
                    break;
                case 48:
                    constraint.scaleY = typedArray.getFloat(index, constraint.scaleY);
                    break;
                case 49:
                    constraint.transformPivotX = typedArray.getFloat(index, constraint.transformPivotX);
                    break;
                case 50:
                    constraint.transformPivotY = typedArray.getFloat(index, constraint.transformPivotY);
                    break;
                case 51:
                    constraint.translationX = typedArray.getDimension(index, constraint.translationX);
                    break;
                case 52:
                    constraint.translationY = typedArray.getDimension(index, constraint.translationY);
                    break;
                case 53:
                    constraint.translationZ = typedArray.getDimension(index, constraint.translationZ);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            constraint.rotation = typedArray.getFloat(index, constraint.rotation);
                            break;
                        case 61:
                            constraint.circleConstraint = lookupID(typedArray, index, constraint.circleConstraint);
                            break;
                        case 62:
                            constraint.circleRadius = typedArray.getDimensionPixelSize(index, constraint.circleRadius);
                            break;
                        case 63:
                            constraint.circleAngle = typedArray.getFloat(index, constraint.circleAngle);
                            break;
                    }
            }
        }
    }

    private static int lookupID(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    public void createBarrier(int i, int i2, int... iArr) {
        Constraint constraint = get(i);
        constraint.mHelperType = 1;
        constraint.mBarrierDirection = i2;
        constraint.mIsGuideline = false;
        constraint.mReferenceIds = iArr;
    }

    public void setTransformPivot(int i, float f2, float f3) {
        Constraint constraint = get(i);
        constraint.transformPivotY = f3;
        constraint.transformPivotX = f2;
    }

    public void setTranslation(int i, float f2, float f3) {
        Constraint constraint = get(i);
        constraint.translationX = f2;
        constraint.translationY = f3;
    }

    public void addToHorizontalChain(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        connect(i, 1, i2, i4, 0);
        if (i3 == 0) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        connect(i, 2, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            connect(i3, 1, i, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        connect(i, 6, i2, i4, 0);
        if (i3 == 0) {
            i5 = 7;
        } else {
            i5 = 6;
        }
        connect(i, 7, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            connect(i3, 6, i, 7, 0);
        }
    }

    public void addToVerticalChain(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 3;
        } else {
            i4 = 4;
        }
        connect(i, 3, i2, i4, 0);
        if (i3 == 0) {
            i5 = 4;
        } else {
            i5 = 3;
        }
        connect(i, 4, i3, i5, 0);
        if (i2 != 0) {
            connect(i2, 4, i, 3, 0);
        }
        if (i2 != 0) {
            connect(i3, 3, i, 4, 0);
        }
    }

    public void setGoneMargin(int i, int i2, int i3) {
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.goneLeftMargin = i3;
                return;
            case 2:
                constraint.goneRightMargin = i3;
                return;
            case 3:
                constraint.goneTopMargin = i3;
                return;
            case 4:
                constraint.goneBottomMargin = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.goneStartMargin = i3;
                return;
            case e.l /*7*/:
                constraint.goneEndMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setMargin(int i, int i2, int i3) {
        Constraint constraint = get(i);
        switch (i2) {
            case 1:
                constraint.leftMargin = i3;
                return;
            case 2:
                constraint.rightMargin = i3;
                return;
            case 3:
                constraint.topMargin = i3;
                return;
            case 4:
                constraint.bottomMargin = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                constraint.startMargin = i3;
                return;
            case e.l /*7*/:
                constraint.endMargin = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void constrainCircle(int i, int i2, int i3, float f2) {
        Constraint constraint = get(i);
        constraint.circleConstraint = i2;
        constraint.circleRadius = i3;
        constraint.circleAngle = f2;
    }

    public void connect(int i, int i2, int i3, int i4) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.leftToLeft = i3;
                    constraint.leftToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.leftToRight = i3;
                    constraint.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + sideToString(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    constraint.rightToLeft = i3;
                    constraint.rightToRight = -1;
                    return;
                } else if (i4 == 2) {
                    constraint.rightToRight = i3;
                    constraint.rightToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    constraint.topToTop = i3;
                    constraint.topToBottom = -1;
                    constraint.baselineToBaseline = -1;
                    return;
                } else if (i4 == 4) {
                    constraint.topToBottom = i3;
                    constraint.topToTop = -1;
                    constraint.baselineToBaseline = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    constraint.bottomToBottom = i3;
                    constraint.bottomToTop = -1;
                    constraint.baselineToBaseline = -1;
                    return;
                } else if (i4 == 3) {
                    constraint.bottomToTop = i3;
                    constraint.bottomToBottom = -1;
                    constraint.baselineToBaseline = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    constraint.baselineToBaseline = i3;
                    constraint.bottomToBottom = -1;
                    constraint.bottomToTop = -1;
                    constraint.topToTop = -1;
                    constraint.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    constraint.startToStart = i3;
                    constraint.startToEnd = -1;
                    return;
                } else if (i4 == 7) {
                    constraint.startToEnd = i3;
                    constraint.startToStart = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            case e.l /*7*/:
                if (i4 == 7) {
                    constraint.endToEnd = i3;
                    constraint.endToStart = -1;
                    return;
                } else if (i4 == 6) {
                    constraint.endToStart = i3;
                    constraint.endToEnd = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
        }
    }

    public void connect(int i, int i2, int i3, int i4, int i5) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i))) {
            this.mConstraints.put(Integer.valueOf(i), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    constraint.leftToLeft = i3;
                    constraint.leftToRight = -1;
                } else if (i4 == 2) {
                    constraint.leftToRight = i3;
                    constraint.leftToLeft = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + sideToString(i4) + " undefined");
                }
                constraint.leftMargin = i5;
                return;
            case 2:
                if (i4 == 1) {
                    constraint.rightToLeft = i3;
                    constraint.rightToRight = -1;
                } else if (i4 == 2) {
                    constraint.rightToRight = i3;
                    constraint.rightToLeft = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.rightMargin = i5;
                return;
            case 3:
                if (i4 == 3) {
                    constraint.topToTop = i3;
                    constraint.topToBottom = -1;
                    constraint.baselineToBaseline = -1;
                } else if (i4 == 4) {
                    constraint.topToBottom = i3;
                    constraint.topToTop = -1;
                    constraint.baselineToBaseline = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.topMargin = i5;
                return;
            case 4:
                if (i4 == 4) {
                    constraint.bottomToBottom = i3;
                    constraint.bottomToTop = -1;
                    constraint.baselineToBaseline = -1;
                } else if (i4 == 3) {
                    constraint.bottomToTop = i3;
                    constraint.bottomToBottom = -1;
                    constraint.baselineToBaseline = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.bottomMargin = i5;
                return;
            case 5:
                if (i4 == 5) {
                    constraint.baselineToBaseline = i3;
                    constraint.bottomToBottom = -1;
                    constraint.bottomToTop = -1;
                    constraint.topToTop = -1;
                    constraint.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    constraint.startToStart = i3;
                    constraint.startToEnd = -1;
                } else if (i4 == 7) {
                    constraint.startToEnd = i3;
                    constraint.startToStart = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.startMargin = i5;
                return;
            case e.l /*7*/:
                if (i4 == 7) {
                    constraint.endToEnd = i3;
                    constraint.endToStart = -1;
                } else if (i4 == 6) {
                    constraint.endToStart = i3;
                    constraint.endToEnd = -1;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i4) + " undefined");
                }
                constraint.endMargin = i5;
                return;
            default:
                throw new IllegalArgumentException(sideToString(i2) + " to " + sideToString(i4) + " unknown");
        }
    }

    public void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    public void createHorizontalChainRtl(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        createHorizontalChain(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    public void createVerticalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                get(iArr2[0]).verticalWeight = fArr2[0];
            }
            get(iArr2[0]).verticalChainStyle = i5;
            connect(iArr2[0], 3, i, i2, 0);
            for (int i6 = 1; i6 < iArr2.length; i6++) {
                int i7 = i6 - 1;
                connect(iArr2[i6], 3, iArr2[i7], 4, 0);
                connect(iArr2[i7], 4, iArr2[i6], 3, 0);
                if (fArr2 != null) {
                    get(iArr2[i6]).verticalWeight = fArr2[i6];
                }
            }
            connect(iArr2[iArr2.length - 1], 4, i3, i4, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void centerHorizontally(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        connect(i, 1, i2, i3, i4);
        connect(i, 2, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).horizontalBias = f2;
    }

    public void centerHorizontallyRtl(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        connect(i, 6, i2, i3, i4);
        connect(i, 7, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).horizontalBias = f2;
    }

    public void centerVertically(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        connect(i, 3, i2, i3, i4);
        connect(i, 4, i5, i6, i7);
        this.mConstraints.get(Integer.valueOf(i)).verticalBias = f2;
    }

    public void center(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        int i8 = i3;
        float f3 = f2;
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f3 <= 0.0f || f3 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i8 == 1 || i8 == 2) {
            int i9 = i;
            connect(i9, 1, i2, i3, i4);
            connect(i9, 2, i5, i6, i7);
            this.mConstraints.get(Integer.valueOf(i)).horizontalBias = f3;
        } else if (i8 == 6 || i8 == 7) {
            int i10 = i;
            connect(i10, 6, i2, i3, i4);
            connect(i10, 7, i5, i6, i7);
            this.mConstraints.get(Integer.valueOf(i)).horizontalBias = f3;
        } else {
            int i11 = i;
            connect(i11, 3, i2, i3, i4);
            connect(i11, 4, i5, i6, i7);
            this.mConstraints.get(Integer.valueOf(i)).verticalBias = f3;
        }
    }

    private void createHorizontalChain(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                get(iArr2[0]).horizontalWeight = fArr2[0];
            }
            get(iArr2[0]).horizontalChainStyle = i5;
            connect(iArr2[0], i6, i, i2, -1);
            for (int i8 = 1; i8 < iArr2.length; i8++) {
                int i9 = i8 - 1;
                connect(iArr2[i8], i6, iArr2[i9], i7, -1);
                connect(iArr2[i9], i7, iArr2[i8], i6, -1);
                if (fArr2 != null) {
                    get(iArr2[i8]).horizontalWeight = fArr2[i8];
                }
            }
            connect(iArr2[iArr2.length - 1], i7, i3, i4, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }
}
