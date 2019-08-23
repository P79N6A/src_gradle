package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.widgets.ConstraintWidget;

public class Optimizer {
    static boolean[] flags = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean optimizableMatchConstraint(android.support.constraint.solver.widgets.ConstraintWidget r4, int r5) {
        /*
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r4.mListDimensionBehaviors
            r0 = r0[r5]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            float r0 = r4.mDimensionRatio
            r1 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0020
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r4.mListDimensionBehaviors
            if (r5 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r4 = r4[r3]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x001f
            return r2
        L_0x001f:
            return r2
        L_0x0020:
            if (r5 != 0) goto L_0x0030
            int r5 = r4.mMatchConstraintDefaultWidth
            if (r5 == 0) goto L_0x0027
            return r2
        L_0x0027:
            int r5 = r4.mMatchConstraintMinWidth
            if (r5 != 0) goto L_0x002f
            int r4 = r4.mMatchConstraintMaxWidth
            if (r4 == 0) goto L_0x003e
        L_0x002f:
            return r2
        L_0x0030:
            int r5 = r4.mMatchConstraintDefaultHeight
            if (r5 == 0) goto L_0x0035
            return r2
        L_0x0035:
            int r5 = r4.mMatchConstraintMinHeight
            if (r5 != 0) goto L_0x003f
            int r4 = r4.mMatchConstraintMaxHeight
            if (r4 == 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r3
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Optimizer.optimizableMatchConstraint(android.support.constraint.solver.widgets.ConstraintWidget, int):boolean");
    }

    static void analyze(int i, ConstraintWidget constraintWidget) {
        boolean z;
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget2 = constraintWidget;
        constraintWidget.updateResolutionNodes();
        ResolutionAnchor resolutionNode = constraintWidget2.mLeft.getResolutionNode();
        ResolutionAnchor resolutionNode2 = constraintWidget2.mTop.getResolutionNode();
        ResolutionAnchor resolutionNode3 = constraintWidget2.mRight.getResolutionNode();
        ResolutionAnchor resolutionNode4 = constraintWidget2.mBottom.getResolutionNode();
        if ((i & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (constraintWidget2.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || !optimizableMatchConstraint(constraintWidget2, 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(resolutionNode.type == 4 || resolutionNode3.type == 4)) {
            if (constraintWidget2.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.FIXED || (z2 && constraintWidget.getVisibility() == 8)) {
                if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    if (z) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, constraintWidget.getWidth());
                    }
                } else if (constraintWidget2.mLeft.mTarget != null && constraintWidget2.mRight.mTarget == null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    if (z) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, constraintWidget.getWidth());
                    }
                } else if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget != null) {
                    resolutionNode.setType(1);
                    resolutionNode3.setType(1);
                    resolutionNode.dependsOn(resolutionNode3, -constraintWidget.getWidth());
                    if (z) {
                        resolutionNode.dependsOn(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.dependsOn(resolutionNode3, -constraintWidget.getWidth());
                    }
                } else if (!(constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                    resolutionNode.setType(2);
                    resolutionNode3.setType(2);
                    if (z) {
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode);
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode3);
                        resolutionNode.setOpposite(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                        resolutionNode3.setOpposite(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.setOpposite(resolutionNode3, (float) (-constraintWidget.getWidth()));
                        resolutionNode3.setOpposite(resolutionNode, (float) constraintWidget.getWidth());
                    }
                }
            } else if (z2) {
                int width = constraintWidget.getWidth();
                resolutionNode.setType(1);
                resolutionNode3.setType(1);
                if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null) {
                    if (z) {
                        resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode3.dependsOn(resolutionNode, width);
                    }
                } else if (constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget != null) {
                    if (constraintWidget2.mLeft.mTarget != null || constraintWidget2.mRight.mTarget == null) {
                        if (!(constraintWidget2.mLeft.mTarget == null || constraintWidget2.mRight.mTarget == null)) {
                            if (z) {
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode);
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode3);
                            }
                            if (constraintWidget2.mDimensionRatio == 0.0f) {
                                resolutionNode.setType(3);
                                resolutionNode3.setType(3);
                                resolutionNode.setOpposite(resolutionNode3, 0.0f);
                                resolutionNode3.setOpposite(resolutionNode, 0.0f);
                            } else {
                                resolutionNode.setType(2);
                                resolutionNode3.setType(2);
                                resolutionNode.setOpposite(resolutionNode3, (float) (-width));
                                resolutionNode3.setOpposite(resolutionNode, (float) width);
                                constraintWidget2.setWidth(width);
                            }
                        }
                    } else if (z) {
                        resolutionNode.dependsOn(resolutionNode3, -1, constraintWidget.getResolutionWidth());
                    } else {
                        resolutionNode.dependsOn(resolutionNode3, -width);
                    }
                } else if (z) {
                    resolutionNode3.dependsOn(resolutionNode, 1, constraintWidget.getResolutionWidth());
                } else {
                    resolutionNode3.dependsOn(resolutionNode, width);
                }
            }
        }
        if (constraintWidget2.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || !optimizableMatchConstraint(constraintWidget2, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!(resolutionNode2.type == 4 || resolutionNode4.type == 4)) {
            if (constraintWidget2.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.FIXED || (z3 && constraintWidget.getVisibility() == 8)) {
                if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (z) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaseline.mTarget != null) {
                        constraintWidget2.mBaseline.getResolutionNode().setType(1);
                        resolutionNode2.dependsOn(1, constraintWidget2.mBaseline.getResolutionNode(), -constraintWidget2.mBaselineDistance);
                    }
                } else if (constraintWidget2.mTop.mTarget != null && constraintWidget2.mBottom.mTarget == null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (z) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                } else if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget != null) {
                    resolutionNode2.setType(1);
                    resolutionNode4.setType(1);
                    if (z) {
                        resolutionNode2.dependsOn(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode2.dependsOn(resolutionNode4, -constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                } else if (!(constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget == null)) {
                    resolutionNode2.setType(2);
                    resolutionNode4.setType(2);
                    if (z) {
                        resolutionNode2.setOpposite(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                        resolutionNode4.setOpposite(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                        constraintWidget.getResolutionHeight().addDependent(resolutionNode2);
                        constraintWidget.getResolutionWidth().addDependent(resolutionNode4);
                    } else {
                        resolutionNode2.setOpposite(resolutionNode4, (float) (-constraintWidget.getHeight()));
                        resolutionNode4.setOpposite(resolutionNode2, (float) constraintWidget.getHeight());
                    }
                    if (constraintWidget2.mBaselineDistance > 0) {
                        constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                    }
                }
            } else if (z3) {
                int height = constraintWidget.getHeight();
                resolutionNode2.setType(1);
                resolutionNode4.setType(1);
                if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null) {
                    if (z) {
                        resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode4.dependsOn(resolutionNode2, height);
                    }
                } else if (constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget != null) {
                    if (constraintWidget2.mTop.mTarget != null || constraintWidget2.mBottom.mTarget == null) {
                        if (!(constraintWidget2.mTop.mTarget == null || constraintWidget2.mBottom.mTarget == null)) {
                            if (z) {
                                constraintWidget.getResolutionHeight().addDependent(resolutionNode2);
                                constraintWidget.getResolutionWidth().addDependent(resolutionNode4);
                            }
                            if (constraintWidget2.mDimensionRatio == 0.0f) {
                                resolutionNode2.setType(3);
                                resolutionNode4.setType(3);
                                resolutionNode2.setOpposite(resolutionNode4, 0.0f);
                                resolutionNode4.setOpposite(resolutionNode2, 0.0f);
                                return;
                            }
                            resolutionNode2.setType(2);
                            resolutionNode4.setType(2);
                            resolutionNode2.setOpposite(resolutionNode4, (float) (-height));
                            resolutionNode4.setOpposite(resolutionNode2, (float) height);
                            constraintWidget2.setHeight(height);
                            if (constraintWidget2.mBaselineDistance > 0) {
                                constraintWidget2.mBaseline.getResolutionNode().dependsOn(1, resolutionNode2, constraintWidget2.mBaselineDistance);
                            }
                        }
                    } else if (z) {
                        resolutionNode2.dependsOn(resolutionNode4, -1, constraintWidget.getResolutionHeight());
                    } else {
                        resolutionNode2.dependsOn(resolutionNode4, -height);
                    }
                } else if (z) {
                    resolutionNode4.dependsOn(resolutionNode2, 1, constraintWidget.getResolutionHeight());
                } else {
                    resolutionNode4.dependsOn(resolutionNode2, height);
                }
            }
        }
    }

    static void checkMatchParent(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        if (constraintWidgetContainer.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            constraintWidget.mLeft.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mRight);
            linearSystem.addEquality(constraintWidget.mLeft.mSolverVariable, i);
            linearSystem.addEquality(constraintWidget.mRight.mSolverVariable, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i2 = constraintWidget.mTop.mMargin;
            int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
            constraintWidget.mTop.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mTop);
            constraintWidget.mBottom.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBottom);
            linearSystem.addEquality(constraintWidget.mTop.mSolverVariable, i2);
            linearSystem.addEquality(constraintWidget.mBottom.mSolverVariable, height);
            if (constraintWidget.mBaselineDistance > 0 || constraintWidget.getVisibility() == 8) {
                constraintWidget.mBaseline.mSolverVariable = linearSystem.createObjectVariable(constraintWidget.mBaseline);
                linearSystem.addEquality(constraintWidget.mBaseline.mSolverVariable, constraintWidget.mBaselineDistance + i2);
            }
            constraintWidget.mVerticalResolution = 2;
            constraintWidget.setVerticalDimension(i2, height);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r6.mHorizontalChainStyle == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r6.mVerticalChainStyle == 2) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean applyChainOptimized(android.support.constraint.solver.widgets.ConstraintWidgetContainer r20, android.support.constraint.solver.LinearSystem r21, int r22, int r23, android.support.constraint.solver.widgets.ChainHead r24) {
        /*
            r0 = r21
            r1 = r24
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r1.mFirst
            android.support.constraint.solver.widgets.ConstraintWidget r3 = r1.mLast
            android.support.constraint.solver.widgets.ConstraintWidget r4 = r1.mFirstVisibleWidget
            android.support.constraint.solver.widgets.ConstraintWidget r5 = r1.mLastVisibleWidget
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r1.mHead
            float r1 = r1.mTotalWeight
            r7 = 2
            r9 = 1
            if (r22 != 0) goto L_0x002a
            int r10 = r6.mHorizontalChainStyle
            if (r10 != 0) goto L_0x001a
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            int r11 = r6.mHorizontalChainStyle
            if (r11 != r9) goto L_0x0021
            r11 = 1
            goto L_0x0022
        L_0x0021:
            r11 = 0
        L_0x0022:
            int r6 = r6.mHorizontalChainStyle
            if (r6 != r7) goto L_0x0028
        L_0x0026:
            r6 = 1
            goto L_0x003d
        L_0x0028:
            r6 = 0
            goto L_0x003d
        L_0x002a:
            int r10 = r6.mVerticalChainStyle
            if (r10 != 0) goto L_0x0030
            r10 = 1
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            int r11 = r6.mVerticalChainStyle
            if (r11 != r9) goto L_0x0037
            r11 = 1
            goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            int r6 = r6.mVerticalChainStyle
            if (r6 != r7) goto L_0x0028
            goto L_0x0026
        L_0x003d:
            r13 = r2
            r7 = 0
            r9 = 0
            r12 = 0
            r14 = 0
            r15 = 0
        L_0x0043:
            if (r12 != 0) goto L_0x00e2
            int r8 = r13.getVisibility()
            r16 = r12
            r12 = 8
            if (r8 == r12) goto L_0x0082
            int r7 = r7 + 1
            if (r22 != 0) goto L_0x005a
            int r8 = r13.getWidth()
            float r8 = (float) r8
            float r14 = r14 + r8
            goto L_0x0060
        L_0x005a:
            int r8 = r13.getHeight()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x0060:
            if (r13 == r4) goto L_0x006c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.mListAnchors
            r8 = r8[r23]
            int r8 = r8.getMargin()
            float r8 = (float) r8
            float r14 = r14 + r8
        L_0x006c:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.mListAnchors
            r8 = r8[r23]
            int r8 = r8.getMargin()
            float r8 = (float) r8
            float r15 = r15 + r8
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.mListAnchors
            int r17 = r23 + 1
            r8 = r8[r17]
            int r8 = r8.getMargin()
            float r8 = (float) r8
            float r15 = r15 + r8
        L_0x0082:
            int r8 = r13.getVisibility()
            if (r8 == r12) goto L_0x00b3
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r13.mListDimensionBehaviors
            r8 = r8[r22]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r8 != r12) goto L_0x00b3
            int r9 = r9 + 1
            if (r22 != 0) goto L_0x00a4
            int r8 = r13.mMatchConstraintDefaultWidth
            if (r8 == 0) goto L_0x009a
            r8 = 0
            return r8
        L_0x009a:
            r8 = 0
            int r12 = r13.mMatchConstraintMinWidth
            if (r12 != 0) goto L_0x00a3
            int r12 = r13.mMatchConstraintMaxWidth
            if (r12 == 0) goto L_0x00b3
        L_0x00a3:
            return r8
        L_0x00a4:
            r8 = 0
            int r12 = r13.mMatchConstraintDefaultHeight
            if (r12 == 0) goto L_0x00aa
            return r8
        L_0x00aa:
            int r12 = r13.mMatchConstraintMinHeight
            if (r12 != 0) goto L_0x00b2
            int r12 = r13.mMatchConstraintMaxHeight
            if (r12 == 0) goto L_0x00b3
        L_0x00b2:
            return r8
        L_0x00b3:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r13.mListAnchors
            int r12 = r23 + 1
            r8 = r8[r12]
            android.support.constraint.solver.widgets.ConstraintAnchor r8 = r8.mTarget
            if (r8 == 0) goto L_0x00d5
            android.support.constraint.solver.widgets.ConstraintWidget r8 = r8.mOwner
            android.support.constraint.solver.widgets.ConstraintAnchor[] r12 = r8.mListAnchors
            r12 = r12[r23]
            android.support.constraint.solver.widgets.ConstraintAnchor r12 = r12.mTarget
            if (r12 == 0) goto L_0x00d5
            android.support.constraint.solver.widgets.ConstraintAnchor[] r12 = r8.mListAnchors
            r12 = r12[r23]
            android.support.constraint.solver.widgets.ConstraintAnchor r12 = r12.mTarget
            android.support.constraint.solver.widgets.ConstraintWidget r12 = r12.mOwner
            if (r12 == r13) goto L_0x00d2
            goto L_0x00d5
        L_0x00d2:
            r18 = r8
            goto L_0x00d7
        L_0x00d5:
            r18 = 0
        L_0x00d7:
            if (r18 == 0) goto L_0x00df
            r12 = r16
            r13 = r18
            goto L_0x0043
        L_0x00df:
            r12 = 1
            goto L_0x0043
        L_0x00e2:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r2.mListAnchors
            r8 = r8[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r8 = r8.getResolutionNode()
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r3.mListAnchors
            int r12 = r23 + 1
            r3 = r3[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r3 = r3.getResolutionNode()
            r19 = r2
            android.support.constraint.solver.widgets.ResolutionAnchor r2 = r8.target
            if (r2 == 0) goto L_0x0342
            android.support.constraint.solver.widgets.ResolutionAnchor r2 = r3.target
            if (r2 != 0) goto L_0x0100
            goto L_0x0342
        L_0x0100:
            android.support.constraint.solver.widgets.ResolutionAnchor r2 = r8.target
            int r2 = r2.state
            r0 = 1
            if (r2 == r0) goto L_0x010f
            android.support.constraint.solver.widgets.ResolutionAnchor r2 = r3.target
            int r2 = r2.state
            if (r2 == r0) goto L_0x010f
            r0 = 0
            return r0
        L_0x010f:
            r0 = 0
            if (r9 <= 0) goto L_0x0115
            if (r9 == r7) goto L_0x0115
            return r0
        L_0x0115:
            if (r6 != 0) goto L_0x011e
            if (r10 != 0) goto L_0x011e
            if (r11 == 0) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            r0 = 0
            goto L_0x0137
        L_0x011e:
            if (r4 == 0) goto L_0x012a
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r4.mListAnchors
            r0 = r0[r23]
            int r0 = r0.getMargin()
            float r0 = (float) r0
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r5 == 0) goto L_0x0137
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.mListAnchors
            r2 = r2[r12]
            int r2 = r2.getMargin()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x0137:
            android.support.constraint.solver.widgets.ResolutionAnchor r2 = r8.target
            float r2 = r2.resolvedOffset
            android.support.constraint.solver.widgets.ResolutionAnchor r3 = r3.target
            float r3 = r3.resolvedOffset
            int r16 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r16 >= 0) goto L_0x0146
            float r3 = r3 - r2
            float r3 = r3 - r14
            goto L_0x0149
        L_0x0146:
            float r3 = r2 - r3
            float r3 = r3 - r14
        L_0x0149:
            r16 = 1
            if (r9 <= 0) goto L_0x020b
            if (r9 != r7) goto L_0x020b
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r13.getParent()
            if (r6 == 0) goto L_0x0163
            android.support.constraint.solver.widgets.ConstraintWidget r6 = r13.getParent()
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r6.mListDimensionBehaviors
            r6 = r6[r22]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r6 != r7) goto L_0x0163
            r6 = 0
            return r6
        L_0x0163:
            float r3 = r3 + r14
            float r3 = r3 - r15
            if (r10 == 0) goto L_0x0169
            float r15 = r15 - r0
            float r3 = r3 - r15
        L_0x0169:
            if (r10 == 0) goto L_0x0185
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r4.mListAnchors
            r0 = r0[r12]
            int r0 = r0.getMargin()
            float r0 = (float) r0
            float r2 = r2 + r0
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.mListNextVisibleWidget
            r0 = r0[r22]
            if (r0 == 0) goto L_0x0185
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r23]
            int r0 = r0.getMargin()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x0185:
            if (r4 == 0) goto L_0x0209
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            if (r0 == 0) goto L_0x01a3
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.nonresolvedWidgets
            long r6 = r6 - r16
            r0.nonresolvedWidgets = r6
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.resolvedWidgets
            long r6 = r6 + r16
            r0.resolvedWidgets = r6
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.chainConnectionResolved
            long r6 = r6 + r16
            r0.chainConnectionResolved = r6
        L_0x01a3:
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.mListNextVisibleWidget
            r0 = r0[r22]
            if (r0 != 0) goto L_0x01b0
            if (r4 != r5) goto L_0x01ac
            goto L_0x01b0
        L_0x01ac:
            r7 = 0
            r13 = r21
            goto L_0x0206
        L_0x01b0:
            float r6 = (float) r9
            float r6 = r3 / r6
            r7 = 0
            int r10 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x01bf
            float[] r6 = r4.mWeight
            r6 = r6[r22]
            float r6 = r6 * r3
            float r6 = r6 / r1
        L_0x01bf:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.mListAnchors
            r10 = r10[r23]
            int r10 = r10.getMargin()
            float r10 = (float) r10
            float r2 = r2 + r10
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.mListAnchors
            r10 = r10[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r11 = r8.resolvedTarget
            r10.resolve(r11, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r10 = r4.mListAnchors
            r10 = r10[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r10 = r10.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r11 = r8.resolvedTarget
            float r2 = r2 + r6
            r10.resolve(r11, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            r13 = r21
            r6.addResolvedValue(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            r6.addResolvedValue(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r4 = r4[r12]
            int r4 = r4.getMargin()
            float r4 = (float) r4
            float r2 = r2 + r4
        L_0x0206:
            r4 = r0
            goto L_0x0185
        L_0x0209:
            r0 = 1
            return r0
        L_0x020b:
            r13 = r21
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0213
            r1 = 0
            return r1
        L_0x0213:
            if (r6 == 0) goto L_0x029a
            float r3 = r3 - r0
            float r0 = r19.getHorizontalBiasPercent()
            float r3 = r3 * r0
            float r2 = r2 + r3
        L_0x021d:
            if (r4 == 0) goto L_0x0297
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            if (r0 == 0) goto L_0x023b
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.nonresolvedWidgets
            long r6 = r6 - r16
            r0.nonresolvedWidgets = r6
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.resolvedWidgets
            long r6 = r6 + r16
            r0.resolvedWidgets = r6
            android.support.constraint.solver.Metrics r0 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r0.chainConnectionResolved
            long r6 = r6 + r16
            r0.chainConnectionResolved = r6
        L_0x023b:
            android.support.constraint.solver.widgets.ConstraintWidget[] r0 = r4.mListNextVisibleWidget
            r0 = r0[r22]
            if (r0 != 0) goto L_0x0243
            if (r4 != r5) goto L_0x0295
        L_0x0243:
            if (r22 != 0) goto L_0x024b
            int r1 = r4.getWidth()
            float r1 = (float) r1
            goto L_0x0250
        L_0x024b:
            int r1 = r4.getHeight()
            float r1 = (float) r1
        L_0x0250:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.mListAnchors
            r3 = r3[r23]
            int r3 = r3.getMargin()
            float r3 = (float) r3
            float r2 = r2 + r3
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.mListAnchors
            r3 = r3[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r3 = r3.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r8.resolvedTarget
            r3.resolve(r6, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r4.mListAnchors
            r3 = r3[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r3 = r3.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r8.resolvedTarget
            float r2 = r2 + r1
            r3.resolve(r6, r2)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            r1 = r1[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            r1.addResolvedValue(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            r1 = r1[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r1 = r1.getResolutionNode()
            r1.addResolvedValue(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            r1 = r1[r12]
            int r1 = r1.getMargin()
            float r1 = (float) r1
            float r2 = r2 + r1
        L_0x0295:
            r4 = r0
            goto L_0x021d
        L_0x0297:
            r0 = 1
            goto L_0x0341
        L_0x029a:
            if (r10 != 0) goto L_0x029e
            if (r11 == 0) goto L_0x0297
        L_0x029e:
            if (r10 == 0) goto L_0x02a2
            float r3 = r3 - r0
            goto L_0x02a5
        L_0x02a2:
            if (r11 == 0) goto L_0x02a5
            float r3 = r3 - r0
        L_0x02a5:
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r3 / r0
            if (r11 == 0) goto L_0x02b9
            r1 = 1
            if (r7 <= r1) goto L_0x02b5
            int r0 = r7 + -1
            float r0 = (float) r0
            float r0 = r3 / r0
            goto L_0x02b9
        L_0x02b5:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3 / r0
        L_0x02b9:
            float r1 = r2 + r0
            if (r11 == 0) goto L_0x02ca
            r3 = 1
            if (r7 <= r3) goto L_0x02ca
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r4.mListAnchors
            r1 = r1[r23]
            int r1 = r1.getMargin()
            float r1 = (float) r1
            float r1 = r1 + r2
        L_0x02ca:
            if (r10 == 0) goto L_0x02d8
            if (r4 == 0) goto L_0x02d8
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r4.mListAnchors
            r2 = r2[r23]
            int r2 = r2.getMargin()
            float r2 = (float) r2
            float r1 = r1 + r2
        L_0x02d8:
            if (r4 == 0) goto L_0x0297
            android.support.constraint.solver.Metrics r2 = android.support.constraint.solver.LinearSystem.sMetrics
            if (r2 == 0) goto L_0x02f6
            android.support.constraint.solver.Metrics r2 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r2.nonresolvedWidgets
            long r6 = r6 - r16
            r2.nonresolvedWidgets = r6
            android.support.constraint.solver.Metrics r2 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r2.resolvedWidgets
            long r6 = r6 + r16
            r2.resolvedWidgets = r6
            android.support.constraint.solver.Metrics r2 = android.support.constraint.solver.LinearSystem.sMetrics
            long r6 = r2.chainConnectionResolved
            long r6 = r6 + r16
            r2.chainConnectionResolved = r6
        L_0x02f6:
            android.support.constraint.solver.widgets.ConstraintWidget[] r2 = r4.mListNextVisibleWidget
            r2 = r2[r22]
            if (r2 != 0) goto L_0x02fe
            if (r4 != r5) goto L_0x033f
        L_0x02fe:
            if (r22 != 0) goto L_0x0306
            int r3 = r4.getWidth()
            float r3 = (float) r3
            goto L_0x030b
        L_0x0306:
            int r3 = r4.getHeight()
            float r3 = (float) r3
        L_0x030b:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r7 = r8.resolvedTarget
            r6.resolve(r7, r1)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            android.support.constraint.solver.widgets.ResolutionAnchor r7 = r8.resolvedTarget
            float r9 = r1 + r3
            r6.resolve(r7, r9)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r4.mListAnchors
            r6 = r6[r23]
            android.support.constraint.solver.widgets.ResolutionAnchor r6 = r6.getResolutionNode()
            r6.addResolvedValue(r13)
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r4.mListAnchors
            r4 = r4[r12]
            android.support.constraint.solver.widgets.ResolutionAnchor r4 = r4.getResolutionNode()
            r4.addResolvedValue(r13)
            float r3 = r3 + r0
            float r1 = r1 + r3
        L_0x033f:
            r4 = r2
            goto L_0x02d8
        L_0x0341:
            return r0
        L_0x0342:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Optimizer.applyChainOptimized(android.support.constraint.solver.widgets.ConstraintWidgetContainer, android.support.constraint.solver.LinearSystem, int, int, android.support.constraint.solver.widgets.ChainHead):boolean");
    }
}
