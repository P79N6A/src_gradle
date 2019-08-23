package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.imagepipeline.e.b;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.bytex.a.a.a;
import javax.annotation.Nullable;

public class GenericDraweeHierarchyInflater {
    @ReturnsOwnership
    private static RoundingParams getRoundingParams(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.getRoundingParams() == null) {
            genericDraweeHierarchyBuilder.setRoundingParams(new RoundingParams());
        }
        return genericDraweeHierarchyBuilder.getRoundingParams();
    }

    public static GenericDraweeHierarchy inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) {
        return inflateBuilder(context, attributeSet).build();
    }

    public static GenericDraweeHierarchyBuilder inflateBuilder(Context context, @Nullable AttributeSet attributeSet) {
        if (b.isTracing()) {
            b.beginSection("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        GenericDraweeHierarchyBuilder updateBuilder = updateBuilder(new GenericDraweeHierarchyBuilder(context.getResources()), context, attributeSet);
        if (b.isTracing()) {
            b.endSection();
        }
        return updateBuilder;
    }

    @Nullable
    private static ScalingUtils.ScaleType getScaleTypeFromXml(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return ScalingUtils.ScaleType.FIT_XY;
            case 1:
                return ScalingUtils.ScaleType.FIT_START;
            case 2:
                return ScalingUtils.ScaleType.FIT_CENTER;
            case 3:
                return ScalingUtils.ScaleType.FIT_END;
            case 4:
                return ScalingUtils.ScaleType.CENTER;
            case 5:
                return ScalingUtils.ScaleType.CENTER_INSIDE;
            case 6:
                return ScalingUtils.ScaleType.CENTER_CROP;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return ScalingUtils.ScaleType.FOCUS_CROP;
            case 8:
                return ScalingUtils.ScaleType.FIT_BOTTOM_START;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    @Nullable
    private static Drawable getDrawable(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return a.a(context.getResources(), resourceId);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01f1, code lost:
        if (r14 != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020c, code lost:
        if (r15 != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.drawee.generic.GenericDraweeHierarchyBuilder updateBuilder(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r20, android.content.Context r21, @javax.annotation.Nullable android.util.AttributeSet r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r4 = 0
            if (r2 == 0) goto L_0x0229
            int[] r6 = com.facebook.drawee.R$styleable.GenericDraweeHierarchy
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r6)
            r6 = 17
            int r7 = r2.getIndexCount()     // Catch:{ all -> 0x0213 }
            r8 = 0
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 1
            r17 = 0
            r18 = 0
        L_0x0023:
            if (r8 >= r7) goto L_0x01bb
            int r5 = r2.getIndex(r8)     // Catch:{ all -> 0x0213 }
            r3 = 6
            if (r5 != r3) goto L_0x003c
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = getScaleTypeFromXml(r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setActualImageScaleType(r3)     // Catch:{ all -> 0x0213 }
        L_0x0033:
            r4 = r16
            r19 = r17
        L_0x0037:
            r6 = r18
        L_0x0039:
            r3 = 0
            goto L_0x01ac
        L_0x003c:
            r3 = 3
            if (r5 != r3) goto L_0x0047
            android.graphics.drawable.Drawable r3 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setPlaceholderImage((android.graphics.drawable.Drawable) r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0047:
            if (r5 != r6) goto L_0x0051
            android.graphics.drawable.Drawable r3 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setPressedStateOverlay(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0051:
            r3 = 5
            if (r5 != r3) goto L_0x005c
            android.graphics.drawable.Drawable r3 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setProgressBarImage((android.graphics.drawable.Drawable) r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x005c:
            r3 = 2
            if (r5 != r3) goto L_0x0067
            int r3 = r2.getInt(r5, r4)     // Catch:{ all -> 0x0213 }
            r0.setFadeDuration(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0067:
            r3 = 28
            if (r5 != r3) goto L_0x0074
            r3 = 0
            float r5 = r2.getFloat(r5, r3)     // Catch:{ all -> 0x0213 }
            r0.setDesiredAspectRatio(r5)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0074:
            r3 = 16
            if (r5 != r3) goto L_0x0080
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = getScaleTypeFromXml(r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setPlaceholderImageScaleType(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0080:
            r3 = 20
            if (r5 != r3) goto L_0x008c
            android.graphics.drawable.Drawable r3 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setRetryImage((android.graphics.drawable.Drawable) r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x008c:
            r3 = 21
            if (r5 != r3) goto L_0x0098
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = getScaleTypeFromXml(r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setRetryImageScaleType(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x0098:
            r3 = 4
            if (r5 != r3) goto L_0x00a3
            android.graphics.drawable.Drawable r3 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setFailureImage((android.graphics.drawable.Drawable) r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x00a3:
            r3 = 1
            if (r5 != r3) goto L_0x00ae
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = getScaleTypeFromXml(r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setFailureImageScaleType(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x00ae:
            r3 = 19
            if (r5 != r3) goto L_0x00bb
            com.facebook.drawee.drawable.ScalingUtils$ScaleType r3 = getScaleTypeFromXml(r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setProgressBarImageScaleType(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0033
        L_0x00bb:
            r3 = 18
            if (r5 != r3) goto L_0x00c8
            r3 = r17
            int r17 = r2.getInteger(r5, r3)     // Catch:{ all -> 0x0213 }
        L_0x00c5:
            r3 = 0
            goto L_0x01b2
        L_0x00c8:
            r3 = r17
            if (r5 != 0) goto L_0x00d9
            android.graphics.drawable.Drawable r5 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setBackground(r5)     // Catch:{ all -> 0x0213 }
        L_0x00d3:
            r19 = r3
            r4 = r16
            goto L_0x0037
        L_0x00d9:
            r6 = 15
            if (r5 != r6) goto L_0x00e5
            android.graphics.drawable.Drawable r5 = getDrawable(r1, r2, r5)     // Catch:{ all -> 0x0213 }
            r0.setOverlay(r5)     // Catch:{ all -> 0x0213 }
            goto L_0x00d3
        L_0x00e5:
            r6 = 7
            if (r5 != r6) goto L_0x00f4
            com.facebook.drawee.generic.RoundingParams r6 = getRoundingParams(r20)     // Catch:{ all -> 0x0213 }
            boolean r5 = r2.getBoolean(r5, r4)     // Catch:{ all -> 0x0213 }
            r6.setRoundAsCircle(r5)     // Catch:{ all -> 0x0213 }
            goto L_0x00d3
        L_0x00f4:
            r6 = 8
            if (r5 != r6) goto L_0x0101
            r6 = r18
            int r18 = r2.getDimensionPixelSize(r5, r6)     // Catch:{ all -> 0x0213 }
            r17 = r3
            goto L_0x00c5
        L_0x0101:
            r6 = r18
            r4 = 9
            if (r5 != r4) goto L_0x0111
            boolean r4 = r2.getBoolean(r5, r9)     // Catch:{ all -> 0x0213 }
            r17 = r3
            r9 = r4
        L_0x010e:
            r18 = r6
            goto L_0x00c5
        L_0x0111:
            r4 = 10
            if (r5 != r4) goto L_0x011d
            boolean r4 = r2.getBoolean(r5, r12)     // Catch:{ all -> 0x0213 }
            r17 = r3
            r12 = r4
            goto L_0x010e
        L_0x011d:
            r4 = 12
            if (r5 != r4) goto L_0x012c
            r4 = r16
            boolean r4 = r2.getBoolean(r5, r4)     // Catch:{ all -> 0x0213 }
        L_0x0127:
            r17 = r3
            r16 = r4
            goto L_0x010e
        L_0x012c:
            r4 = r16
            r1 = 11
            if (r5 != r1) goto L_0x0138
            boolean r1 = r2.getBoolean(r5, r13)     // Catch:{ all -> 0x0213 }
            r13 = r1
            goto L_0x0127
        L_0x0138:
            r1 = 25
            if (r5 != r1) goto L_0x0142
            boolean r1 = r2.getBoolean(r5, r10)     // Catch:{ all -> 0x0213 }
            r10 = r1
            goto L_0x0127
        L_0x0142:
            r1 = 24
            if (r5 != r1) goto L_0x014c
            boolean r1 = r2.getBoolean(r5, r11)     // Catch:{ all -> 0x0213 }
            r11 = r1
            goto L_0x0127
        L_0x014c:
            r1 = 23
            if (r5 != r1) goto L_0x0156
            boolean r1 = r2.getBoolean(r5, r15)     // Catch:{ all -> 0x0213 }
            r15 = r1
            goto L_0x0127
        L_0x0156:
            r1 = 22
            if (r5 != r1) goto L_0x0160
            boolean r1 = r2.getBoolean(r5, r14)     // Catch:{ all -> 0x0213 }
            r14 = r1
            goto L_0x0127
        L_0x0160:
            r1 = 26
            if (r5 != r1) goto L_0x0174
            com.facebook.drawee.generic.RoundingParams r1 = getRoundingParams(r20)     // Catch:{ all -> 0x0213 }
            r19 = r3
            r3 = 0
            int r5 = r2.getColor(r5, r3)     // Catch:{ all -> 0x0213 }
            r1.setOverlayColor(r5)     // Catch:{ all -> 0x0213 }
            goto L_0x0039
        L_0x0174:
            r19 = r3
            r1 = 13
            if (r5 != r1) goto L_0x0189
            com.facebook.drawee.generic.RoundingParams r1 = getRoundingParams(r20)     // Catch:{ all -> 0x0213 }
            r3 = 0
            int r5 = r2.getDimensionPixelSize(r5, r3)     // Catch:{ all -> 0x0213 }
            float r3 = (float) r5     // Catch:{ all -> 0x0213 }
            r1.setBorderWidth(r3)     // Catch:{ all -> 0x0213 }
            goto L_0x0039
        L_0x0189:
            r1 = 14
            if (r5 != r1) goto L_0x019b
            com.facebook.drawee.generic.RoundingParams r1 = getRoundingParams(r20)     // Catch:{ all -> 0x0213 }
            r3 = 0
            int r5 = r2.getColor(r5, r3)     // Catch:{ all -> 0x0213 }
            r1.setBorderColor(r5)     // Catch:{ all -> 0x0213 }
            goto L_0x0039
        L_0x019b:
            r1 = 27
            if (r5 != r1) goto L_0x0039
            com.facebook.drawee.generic.RoundingParams r1 = getRoundingParams(r20)     // Catch:{ all -> 0x0213 }
            r3 = 0
            int r5 = r2.getDimensionPixelSize(r5, r3)     // Catch:{ all -> 0x0213 }
            float r5 = (float) r5     // Catch:{ all -> 0x0213 }
            r1.setPadding(r5)     // Catch:{ all -> 0x0213 }
        L_0x01ac:
            r16 = r4
            r18 = r6
            r17 = r19
        L_0x01b2:
            int r8 = r8 + 1
            r1 = r21
            r4 = 0
            r6 = 17
            goto L_0x0023
        L_0x01bb:
            r4 = r16
            r19 = r17
            r6 = r18
            r3 = 0
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x01f4
            android.content.res.Resources r1 = r21.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01f5
            if (r9 == 0) goto L_0x01e0
            if (r11 == 0) goto L_0x01e0
            r5 = 1
            goto L_0x01e1
        L_0x01e0:
            r5 = 0
        L_0x01e1:
            if (r12 == 0) goto L_0x01e7
            if (r10 == 0) goto L_0x01e7
            r1 = 1
            goto L_0x01e8
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            if (r13 == 0) goto L_0x01ee
            if (r15 == 0) goto L_0x01ee
            r7 = 1
            goto L_0x01ef
        L_0x01ee:
            r7 = 0
        L_0x01ef:
            if (r4 == 0) goto L_0x020f
            if (r14 == 0) goto L_0x020f
            goto L_0x0210
        L_0x01f4:
            r2 = 1
        L_0x01f5:
            if (r9 == 0) goto L_0x01fb
            if (r10 == 0) goto L_0x01fb
            r5 = 1
            goto L_0x01fc
        L_0x01fb:
            r5 = 0
        L_0x01fc:
            if (r12 == 0) goto L_0x0202
            if (r11 == 0) goto L_0x0202
            r1 = 1
            goto L_0x0203
        L_0x0202:
            r1 = 0
        L_0x0203:
            if (r13 == 0) goto L_0x0209
            if (r14 == 0) goto L_0x0209
            r7 = 1
            goto L_0x020a
        L_0x0209:
            r7 = 0
        L_0x020a:
            if (r4 == 0) goto L_0x020f
            if (r15 == 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r2 = 0
        L_0x0210:
            r3 = r19
            goto L_0x022f
        L_0x0213:
            r0 = move-exception
            r2.recycle()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x0228
            android.content.res.Resources r1 = r21.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r1.getLayoutDirection()
        L_0x0228:
            throw r0
        L_0x0229:
            r2 = 1
            r3 = 0
            r1 = 1
            r5 = 1
            r6 = 0
            r7 = 1
        L_0x022f:
            android.graphics.drawable.Drawable r4 = r20.getProgressBarImage()
            if (r4 == 0) goto L_0x0243
            if (r3 <= 0) goto L_0x0243
            com.facebook.drawee.drawable.b r4 = new com.facebook.drawee.drawable.b
            android.graphics.drawable.Drawable r8 = r20.getProgressBarImage()
            r4.<init>(r8, r3)
            r0.setProgressBarImage((android.graphics.drawable.Drawable) r4)
        L_0x0243:
            if (r6 <= 0) goto L_0x0260
            com.facebook.drawee.generic.RoundingParams r3 = getRoundingParams(r20)
            if (r5 == 0) goto L_0x024d
            float r4 = (float) r6
            goto L_0x024e
        L_0x024d:
            r4 = 0
        L_0x024e:
            if (r1 == 0) goto L_0x0252
            float r1 = (float) r6
            goto L_0x0253
        L_0x0252:
            r1 = 0
        L_0x0253:
            if (r7 == 0) goto L_0x0257
            float r5 = (float) r6
            goto L_0x0258
        L_0x0257:
            r5 = 0
        L_0x0258:
            if (r2 == 0) goto L_0x025c
            float r2 = (float) r6
            goto L_0x025d
        L_0x025c:
            r2 = 0
        L_0x025d:
            r3.setCornersRadii(r4, r1, r5, r2)
        L_0x0260:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.GenericDraweeHierarchyInflater.updateBuilder(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder, android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.GenericDraweeHierarchyBuilder");
    }
}
