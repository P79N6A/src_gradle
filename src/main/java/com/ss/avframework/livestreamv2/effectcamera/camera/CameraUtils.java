package com.ss.avframework.livestreamv2.effectcamera.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraUtils {
    public static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static int clamp(int i) {
        return clamp(i, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public static float dip2Px(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int[] getClosestFpsRange(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            private int diff(int[] iArr) {
                int i;
                int i2;
                if (iArr[0] > iArr[0]) {
                    i = (iArr[0] - iArr[0]) * 9;
                } else {
                    i = (iArr[0] - iArr[0]) * 3;
                }
                if (iArr[1] > iArr[1]) {
                    i2 = (iArr[1] - iArr[1]) * 5;
                } else {
                    i2 = (iArr[1] - iArr[1]) * 1;
                }
                return i + i2;
            }

            public final int compare(int[] iArr, int[] iArr2) {
                return diff(iArr) - diff(iArr2);
            }
        });
    }

    public static Rect calculateTapArea(View view, float[] fArr, float f2, int i) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        int intValue = Float.valueOf(dip2Px(view.getContext(), 60.0f) * f2).intValue();
        int width = ((int) ((f3 * 2000.0f) / ((float) view.getWidth()))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int height = ((int) ((f4 * 2000.0f) / ((float) view.getHeight()))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i2 = intValue / 2;
        int clamp = clamp(width - i2, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        int clamp2 = clamp(height - i2, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        RectUtils.rotateRectForOrientation(i, new Rect(-1000, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), rect);
        Rect rect2 = new Rect(rect.left - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.top - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.right - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.bottom - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
