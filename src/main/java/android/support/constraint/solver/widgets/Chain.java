package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;

public class Chain {
    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            int i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = constraintWidgetContainer.mVerticalChainsSize;
            i2 = i5;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            ChainHead chainHead = chainHeadArr[i6];
            chainHead.define();
            if (!constraintWidgetContainer.optimizeFor(4) || !Optimizer.applyChainOptimized(constraintWidgetContainer, linearSystem, i, i3, chainHead)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r2.mVerticalChainStyle == 2) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer r44, android.support.constraint.solver.LinearSystem r45, int r46, int r47, android.support.constraint.solver.widgets.ChainHead r48) {
        /*
            r0 = r44
            r9 = r45
            r1 = r48
            android.support.constraint.solver.widgets.ConstraintWidget r11 = r1.mFirst
            android.support.constraint.solver.widgets.ConstraintWidget r12 = r1.mLast
            android.support.constraint.solver.widgets.ConstraintWidget r13 = r1.mFirstVisibleWidget
            android.support.constraint.solver.widgets.ConstraintWidget r14 = r1.mLastVisibleWidget
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r1.mHead
            float r3 = r1.mTotalWeight
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r0.mListDimensionBehaviors
            r4 = r4[r46]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7 = 1
            if (r4 != r5) goto L_0x001d
            r4 = 1
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r46 != 0) goto L_0x003e
            int r8 = r2.mHorizontalChainStyle
            if (r8 != 0) goto L_0x0027
            r8 = 1
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            int r6 = r2.mHorizontalChainStyle
            if (r6 != r7) goto L_0x002e
            r6 = 1
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            int r7 = r2.mHorizontalChainStyle
            if (r7 != r5) goto L_0x0035
        L_0x0033:
            r5 = 1
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r7 = r5
            r18 = r6
            r17 = r8
            r5 = r11
            r6 = 0
            goto L_0x0052
        L_0x003e:
            int r6 = r2.mVerticalChainStyle
            if (r6 != 0) goto L_0x0044
            r8 = 1
            goto L_0x0045
        L_0x0044:
            r8 = 0
        L_0x0045:
            int r6 = r2.mVerticalChainStyle
            r7 = 1
            if (r6 != r7) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            int r7 = r2.mVerticalChainStyle
            if (r7 != r5) goto L_0x0035
            goto L_0x0033
        L_0x0052:
            r21 = 0
            if (r6 != 0) goto L_0x013a
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r5.mListAnchors
            r8 = r8[r47]
            if (r4 != 0) goto L_0x0062
            if (r7 == 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r22 = 4
            goto L_0x0064
        L_0x0062:
            r22 = 1
        L_0x0064:
            int r23 = r8.getMargin()
            r24 = r3
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r8.mTarget
            if (r3 == 0) goto L_0x0078
            if (r5 == r11) goto L_0x0078
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r8.mTarget
            int r3 = r3.getMargin()
            int r23 = r23 + r3
        L_0x0078:
            r3 = r23
            if (r7 == 0) goto L_0x0086
            if (r5 == r11) goto L_0x0086
            if (r5 == r13) goto L_0x0086
            r26 = r2
            r25 = r6
            r6 = 6
            goto L_0x0096
        L_0x0086:
            if (r17 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            r26 = r2
            r25 = r6
            r6 = 4
            goto L_0x0096
        L_0x0090:
            r26 = r2
            r25 = r6
            r6 = r22
        L_0x0096:
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r8.mTarget
            if (r2 == 0) goto L_0x00c3
            if (r5 != r13) goto L_0x00ab
            android.support.constraint.solver.SolverVariable r2 = r8.mSolverVariable
            r27 = r11
            android.support.constraint.solver.widgets.ConstraintAnchor r11 = r8.mTarget
            android.support.constraint.solver.SolverVariable r11 = r11.mSolverVariable
            r28 = r7
            r7 = 5
            r9.addGreaterThan(r2, r11, r3, r7)
            goto L_0x00b9
        L_0x00ab:
            r28 = r7
            r27 = r11
            android.support.constraint.solver.SolverVariable r2 = r8.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r8.mTarget
            android.support.constraint.solver.SolverVariable r7 = r7.mSolverVariable
            r11 = 6
            r9.addGreaterThan(r2, r7, r3, r11)
        L_0x00b9:
            android.support.constraint.solver.SolverVariable r2 = r8.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r8.mTarget
            android.support.constraint.solver.SolverVariable r7 = r7.mSolverVariable
            r9.addEquality(r2, r7, r3, r6)
            goto L_0x00c7
        L_0x00c3:
            r28 = r7
            r27 = r11
        L_0x00c7:
            if (r4 == 0) goto L_0x00fe
            int r2 = r5.getVisibility()
            r3 = 8
            if (r2 == r3) goto L_0x00ed
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r5.mListDimensionBehaviors
            r2 = r2[r46]
            android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x00ed
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.mListAnchors
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.SolverVariable r2 = r2.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r5.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            r6 = 0
            r7 = 5
            r9.addGreaterThan(r2, r3, r6, r7)
            goto L_0x00ee
        L_0x00ed:
            r6 = 0
        L_0x00ee:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.mListAnchors
            r2 = r2[r47]
            android.support.constraint.solver.SolverVariable r2 = r2.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            r7 = 6
            r9.addGreaterThan(r2, r3, r6, r7)
        L_0x00fe:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r5.mListAnchors
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x011f
            android.support.constraint.solver.widgets.ConstraintWidget r2 = r2.mOwner
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x011f
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r2.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            android.support.constraint.solver.widgets.ConstraintWidget r3 = r3.mOwner
            if (r3 == r5) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r21 = r2
        L_0x011f:
            if (r21 == 0) goto L_0x012f
            r5 = r21
            r3 = r24
            r6 = r25
            r2 = r26
            r11 = r27
            r7 = r28
            goto L_0x0052
        L_0x012f:
            r3 = r24
            r2 = r26
            r11 = r27
            r7 = r28
            r6 = 1
            goto L_0x0052
        L_0x013a:
            r26 = r2
            r24 = r3
            r28 = r7
            r27 = r11
            if (r14 == 0) goto L_0x0166
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            int r3 = r47 + 1
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 == 0) goto L_0x0166
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            r2 = r2[r3]
            android.support.constraint.solver.SolverVariable r5 = r2.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.mListAnchors
            r3 = r6[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            int r2 = r2.getMargin()
            int r2 = -r2
            r8 = 5
            r9.addLowerThan(r5, r3, r2, r8)
            goto L_0x0167
        L_0x0166:
            r8 = 5
        L_0x0167:
            if (r4 == 0) goto L_0x0183
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            int r2 = r47 + 1
            r0 = r0[r2]
            android.support.constraint.solver.SolverVariable r0 = r0.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r12.mListAnchors
            r3 = r3[r2]
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r2 = r4[r2]
            int r2 = r2.getMargin()
            r4 = 6
            r9.addGreaterThan(r0, r3, r2, r4)
        L_0x0183:
            java.util.ArrayList<android.support.constraint.solver.widgets.ConstraintWidget> r0 = r1.mWeightedMatchConstraintsWidgets
            if (r0 == 0) goto L_0x023b
            int r2 = r0.size()
            r7 = 1
            if (r2 <= r7) goto L_0x023b
            boolean r3 = r1.mHasUndefinedWeights
            if (r3 == 0) goto L_0x019a
            boolean r3 = r1.mHasComplexMatchWeights
            if (r3 != 0) goto L_0x019a
            int r3 = r1.mWidgetsMatchCount
            float r3 = (float) r3
            goto L_0x019c
        L_0x019a:
            r3 = r24
        L_0x019c:
            r4 = 0
            r6 = r21
            r5 = 0
            r30 = 0
        L_0x01a2:
            if (r5 >= r2) goto L_0x023b
            java.lang.Object r11 = r0.get(r5)
            android.support.constraint.solver.widgets.ConstraintWidget r11 = (android.support.constraint.solver.widgets.ConstraintWidget) r11
            float[] r7 = r11.mWeight
            r7 = r7[r46]
            int r16 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r16 >= 0) goto L_0x01d0
            boolean r7 = r1.mHasComplexMatchWeights
            if (r7 == 0) goto L_0x01cc
            android.support.constraint.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            int r16 = r47 + 1
            r7 = r7[r16]
            android.support.constraint.solver.SolverVariable r7 = r7.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r11 = r11.mListAnchors
            r11 = r11[r47]
            android.support.constraint.solver.SolverVariable r11 = r11.mSolverVariable
            r4 = 4
            r8 = 0
            r9.addEquality(r7, r11, r8, r4)
            r4 = 0
            r8 = 6
            goto L_0x01e9
        L_0x01cc:
            r4 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01d1
        L_0x01d0:
            r4 = 4
        L_0x01d1:
            r8 = 0
            int r16 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r16 != 0) goto L_0x01ee
            android.support.constraint.solver.widgets.ConstraintAnchor[] r7 = r11.mListAnchors
            int r16 = r47 + 1
            r7 = r7[r16]
            android.support.constraint.solver.SolverVariable r7 = r7.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r11 = r11.mListAnchors
            r11 = r11[r47]
            android.support.constraint.solver.SolverVariable r11 = r11.mSolverVariable
            r4 = 0
            r8 = 6
            r9.addEquality(r7, r11, r4, r8)
        L_0x01e9:
            r38 = r0
            r39 = r2
            goto L_0x0230
        L_0x01ee:
            r4 = 0
            r8 = 6
            if (r6 == 0) goto L_0x0229
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r6.mListAnchors
            r4 = r4[r47]
            android.support.constraint.solver.SolverVariable r4 = r4.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r6.mListAnchors
            int r15 = r47 + 1
            r6 = r6[r15]
            android.support.constraint.solver.SolverVariable r6 = r6.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r8 = r11.mListAnchors
            r8 = r8[r47]
            android.support.constraint.solver.SolverVariable r8 = r8.mSolverVariable
            r38 = r0
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r11.mListAnchors
            r0 = r0[r15]
            android.support.constraint.solver.SolverVariable r0 = r0.mSolverVariable
            r39 = r2
            android.support.constraint.solver.ArrayRow r2 = r45.createRow()
            r29 = r2
            r31 = r3
            r32 = r7
            r33 = r4
            r34 = r6
            r35 = r8
            r36 = r0
            r29.createRowEqualMatchDimensions(r30, r31, r32, r33, r34, r35, r36)
            r9.addConstraint(r2)
            goto L_0x022d
        L_0x0229:
            r38 = r0
            r39 = r2
        L_0x022d:
            r30 = r7
            r6 = r11
        L_0x0230:
            int r5 = r5 + 1
            r0 = r38
            r2 = r39
            r4 = 0
            r7 = 1
            r8 = 5
            goto L_0x01a2
        L_0x023b:
            if (r13 == 0) goto L_0x02a8
            if (r13 == r14) goto L_0x0241
            if (r28 == 0) goto L_0x02a8
        L_0x0241:
            r11 = r27
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r11.mListAnchors
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r12.mListAnchors
            int r2 = r47 + 1
            r1 = r1[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x025e
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x0260
        L_0x025e:
            r3 = r21
        L_0x0260:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            if (r4 == 0) goto L_0x0272
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            android.support.constraint.solver.SolverVariable r4 = r4.mSolverVariable
            r5 = r4
            goto L_0x0274
        L_0x0272:
            r5 = r21
        L_0x0274:
            if (r13 != r14) goto L_0x027e
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r2]
        L_0x027e:
            if (r3 == 0) goto L_0x04b6
            if (r5 == 0) goto L_0x04b6
            if (r46 != 0) goto L_0x028a
            r2 = r26
            float r2 = r2.mHorizontalBiasPercent
        L_0x0288:
            r4 = r2
            goto L_0x028f
        L_0x028a:
            r2 = r26
            float r2 = r2.mVerticalBiasPercent
            goto L_0x0288
        L_0x028f:
            int r6 = r0.getMargin()
            int r7 = r1.getMargin()
            android.support.constraint.solver.SolverVariable r2 = r0.mSolverVariable
            android.support.constraint.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b6
        L_0x02a8:
            r11 = r27
            if (r17 == 0) goto L_0x0392
            if (r13 == 0) goto L_0x0392
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x02bb
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L_0x02bb
            r37 = 1
            goto L_0x02bd
        L_0x02bb:
            r37 = 0
        L_0x02bd:
            r0 = r13
            r8 = r0
        L_0x02bf:
            if (r8 == 0) goto L_0x04b4
            android.support.constraint.solver.widgets.ConstraintWidget[] r1 = r8.mListNextVisibleWidget
            r7 = r1[r46]
            if (r7 != 0) goto L_0x02d2
            if (r8 != r14) goto L_0x02ca
            goto L_0x02d2
        L_0x02ca:
            r9 = r7
            r15 = r8
        L_0x02cc:
            r19 = 6
            r20 = 4
            goto L_0x038c
        L_0x02d2:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r8.mListAnchors
            r1 = r1[r47]
            android.support.constraint.solver.SolverVariable r2 = r1.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r1.mTarget
            if (r3 == 0) goto L_0x02e1
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r1.mTarget
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x02e3
        L_0x02e1:
            r3 = r21
        L_0x02e3:
            if (r0 == r8) goto L_0x02ee
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            int r4 = r47 + 1
            r3 = r3[r4]
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x0305
        L_0x02ee:
            if (r8 != r13) goto L_0x0305
            if (r0 != r8) goto L_0x0305
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L_0x0303
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r11.mListAnchors
            r3 = r3[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r3.mTarget
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x0305
        L_0x0303:
            r3 = r21
        L_0x0305:
            int r1 = r1.getMargin()
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r8.mListAnchors
            int r5 = r47 + 1
            r4 = r4[r5]
            int r4 = r4.getMargin()
            if (r7 == 0) goto L_0x031e
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r7.mListAnchors
            r6 = r6[r47]
            r40 = r7
            android.support.constraint.solver.SolverVariable r7 = r6.mSolverVariable
            goto L_0x032d
        L_0x031e:
            r40 = r7
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.mListAnchors
            r6 = r6[r5]
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L_0x032b
            android.support.constraint.solver.SolverVariable r7 = r6.mSolverVariable
            goto L_0x032d
        L_0x032b:
            r7 = r21
        L_0x032d:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r9 = r8.mListAnchors
            r9 = r9[r5]
            android.support.constraint.solver.SolverVariable r9 = r9.mSolverVariable
            if (r6 == 0) goto L_0x033a
            int r6 = r6.getMargin()
            int r4 = r4 + r6
        L_0x033a:
            if (r0 == 0) goto L_0x0345
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r5]
            int r0 = r0.getMargin()
            int r1 = r1 + r0
        L_0x0345:
            if (r2 == 0) goto L_0x0387
            if (r3 == 0) goto L_0x0387
            if (r7 == 0) goto L_0x0387
            if (r9 == 0) goto L_0x0387
            if (r8 != r13) goto L_0x0359
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r47]
            int r0 = r0.getMargin()
            r6 = r0
            goto L_0x035a
        L_0x0359:
            r6 = r1
        L_0x035a:
            if (r8 != r14) goto L_0x0366
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r14.mListAnchors
            r0 = r0[r5]
            int r0 = r0.getMargin()
            r15 = r0
            goto L_0x0367
        L_0x0366:
            r15 = r4
        L_0x0367:
            if (r37 == 0) goto L_0x036c
            r16 = 6
            goto L_0x036e
        L_0x036c:
            r16 = 4
        L_0x036e:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r6
            r19 = 4
            r5 = r7
            r6 = r9
            r9 = r40
            r7 = r15
            r15 = r8
            r19 = 6
            r20 = 4
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x038c
        L_0x0387:
            r15 = r8
            r9 = r40
            goto L_0x02cc
        L_0x038c:
            r8 = r9
            r0 = r15
            r9 = r45
            goto L_0x02bf
        L_0x0392:
            r19 = 6
            r20 = 4
            if (r18 == 0) goto L_0x04b4
            if (r13 == 0) goto L_0x04b4
            int r0 = r1.mWidgetsMatchCount
            if (r0 <= 0) goto L_0x03a7
            int r0 = r1.mWidgetsCount
            int r1 = r1.mWidgetsMatchCount
            if (r0 != r1) goto L_0x03a7
            r37 = 1
            goto L_0x03a9
        L_0x03a7:
            r37 = 0
        L_0x03a9:
            r0 = r13
            r9 = r0
        L_0x03ab:
            if (r9 == 0) goto L_0x044e
            android.support.constraint.solver.widgets.ConstraintWidget[] r1 = r9.mListNextVisibleWidget
            r1 = r1[r46]
            if (r9 == r13) goto L_0x0446
            if (r9 == r14) goto L_0x0446
            if (r1 == 0) goto L_0x0446
            if (r1 != r14) goto L_0x03bc
            r8 = r21
            goto L_0x03bd
        L_0x03bc:
            r8 = r1
        L_0x03bd:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r9.mListAnchors
            r1 = r1[r47]
            android.support.constraint.solver.SolverVariable r2 = r1.mSolverVariable
            android.support.constraint.solver.widgets.ConstraintAnchor[] r3 = r0.mListAnchors
            int r4 = r47 + 1
            r3 = r3[r4]
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            int r1 = r1.getMargin()
            android.support.constraint.solver.widgets.ConstraintAnchor[] r5 = r9.mListAnchors
            r5 = r5[r4]
            int r5 = r5.getMargin()
            if (r8 == 0) goto L_0x03f0
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r8.mListAnchors
            r6 = r6[r47]
            android.support.constraint.solver.SolverVariable r7 = r6.mSolverVariable
            r41 = r7
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r6.mTarget
            if (r7 == 0) goto L_0x03ea
            android.support.constraint.solver.widgets.ConstraintAnchor r7 = r6.mTarget
            android.support.constraint.solver.SolverVariable r7 = r7.mSolverVariable
            goto L_0x03ec
        L_0x03ea:
            r7 = r21
        L_0x03ec:
            r42 = r6
            r6 = r7
            goto L_0x0409
        L_0x03f0:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r9.mListAnchors
            r6 = r6[r4]
            android.support.constraint.solver.widgets.ConstraintAnchor r6 = r6.mTarget
            if (r6 == 0) goto L_0x03fd
            android.support.constraint.solver.SolverVariable r7 = r6.mSolverVariable
            r42 = r6
            goto L_0x0401
        L_0x03fd:
            r42 = r6
            r7 = r21
        L_0x0401:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r9.mListAnchors
            r6 = r6[r4]
            android.support.constraint.solver.SolverVariable r6 = r6.mSolverVariable
            r41 = r7
        L_0x0409:
            if (r42 == 0) goto L_0x0410
            int r7 = r42.getMargin()
            int r5 = r5 + r7
        L_0x0410:
            r7 = r5
            if (r0 == 0) goto L_0x041c
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r0.mListAnchors
            r0 = r0[r4]
            int r0 = r0.getMargin()
            int r1 = r1 + r0
        L_0x041c:
            r4 = r1
            if (r37 == 0) goto L_0x0421
            r15 = 6
            goto L_0x0422
        L_0x0421:
            r15 = 4
        L_0x0422:
            if (r2 == 0) goto L_0x043e
            if (r3 == 0) goto L_0x043e
            if (r41 == 0) goto L_0x043e
            if (r6 == 0) goto L_0x043e
            r5 = 1056964608(0x3f000000, float:0.5)
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r41
            r16 = r8
            r43 = r9
            r9 = 5
            r8 = r15
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0443
        L_0x043e:
            r16 = r8
            r43 = r9
            r9 = 5
        L_0x0443:
            r1 = r16
            goto L_0x0449
        L_0x0446:
            r43 = r9
            r9 = 5
        L_0x0449:
            r9 = r1
            r0 = r43
            goto L_0x03ab
        L_0x044e:
            r9 = 5
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r11.mListAnchors
            r1 = r1[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor r1 = r1.mTarget
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r14.mListAnchors
            int r3 = r47 + 1
            r10 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r2 = r12.mListAnchors
            r2 = r2[r3]
            android.support.constraint.solver.widgets.ConstraintAnchor r11 = r2.mTarget
            if (r1 == 0) goto L_0x04a0
            if (r13 == r14) goto L_0x0478
            android.support.constraint.solver.SolverVariable r2 = r0.mSolverVariable
            android.support.constraint.solver.SolverVariable r1 = r1.mSolverVariable
            int r0 = r0.getMargin()
            r8 = r45
            r8.addEquality(r2, r1, r0, r9)
        L_0x0476:
            r9 = r8
            goto L_0x04a2
        L_0x0478:
            r8 = r45
            if (r11 == 0) goto L_0x0476
            android.support.constraint.solver.SolverVariable r2 = r0.mSolverVariable
            android.support.constraint.solver.SolverVariable r3 = r1.mSolverVariable
            int r4 = r0.getMargin()
            r5 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.solver.SolverVariable r6 = r10.mSolverVariable
            android.support.constraint.solver.SolverVariable r7 = r11.mSolverVariable
            int r15 = r10.getMargin()
            r16 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r15
            r9 = r8
            r8 = r16
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04a2
        L_0x04a0:
            r9 = r45
        L_0x04a2:
            if (r11 == 0) goto L_0x04b6
            if (r13 == r14) goto L_0x04b6
            android.support.constraint.solver.SolverVariable r0 = r10.mSolverVariable
            android.support.constraint.solver.SolverVariable r1 = r11.mSolverVariable
            int r2 = r10.getMargin()
            int r2 = -r2
            r3 = 5
            r9.addEquality(r0, r1, r2, r3)
            goto L_0x04b6
        L_0x04b4:
            r9 = r45
        L_0x04b6:
            if (r17 != 0) goto L_0x04ba
            if (r18 == 0) goto L_0x051e
        L_0x04ba:
            if (r13 == 0) goto L_0x051e
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r14.mListAnchors
            int r2 = r47 + 1
            r1 = r1[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L_0x04cf
            android.support.constraint.solver.widgets.ConstraintAnchor r3 = r0.mTarget
            android.support.constraint.solver.SolverVariable r3 = r3.mSolverVariable
            goto L_0x04d1
        L_0x04cf:
            r3 = r21
        L_0x04d1:
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L_0x04da
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r1.mTarget
            android.support.constraint.solver.SolverVariable r4 = r4.mSolverVariable
            goto L_0x04dc
        L_0x04da:
            r4 = r21
        L_0x04dc:
            if (r12 == r14) goto L_0x04ed
            android.support.constraint.solver.widgets.ConstraintAnchor[] r4 = r12.mListAnchors
            r4 = r4[r2]
            android.support.constraint.solver.widgets.ConstraintAnchor r5 = r4.mTarget
            if (r5 == 0) goto L_0x04eb
            android.support.constraint.solver.widgets.ConstraintAnchor r4 = r4.mTarget
            android.support.constraint.solver.SolverVariable r4 = r4.mSolverVariable
            goto L_0x04ed
        L_0x04eb:
            r4 = r21
        L_0x04ed:
            r5 = r4
            if (r13 != r14) goto L_0x04f8
            android.support.constraint.solver.widgets.ConstraintAnchor[] r0 = r13.mListAnchors
            r0 = r0[r47]
            android.support.constraint.solver.widgets.ConstraintAnchor[] r1 = r13.mListAnchors
            r1 = r1[r2]
        L_0x04f8:
            if (r3 == 0) goto L_0x051e
            if (r5 == 0) goto L_0x051e
            int r4 = r0.getMargin()
            if (r14 != 0) goto L_0x0503
            goto L_0x0504
        L_0x0503:
            r12 = r14
        L_0x0504:
            android.support.constraint.solver.widgets.ConstraintAnchor[] r6 = r12.mListAnchors
            r2 = r6[r2]
            int r7 = r2.getMargin()
            android.support.constraint.solver.SolverVariable r2 = r0.mSolverVariable
            r6 = 1056964608(0x3f000000, float:0.5)
            android.support.constraint.solver.SolverVariable r8 = r1.mSolverVariable
            r10 = 5
            r0 = r45
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r0.addCentering(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x051e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Chain.applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer, android.support.constraint.solver.LinearSystem, int, int, android.support.constraint.solver.widgets.ChainHead):void");
    }
}
