package com.graphic.RNCanvas;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;

public class CanvasConvert {
    public static int convertColorListToColor(int[] iArr) {
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static Paint.Cap convertLineCap(String str) {
        Paint.Cap cap = Paint.Cap.BUTT;
        if (str.equals("round")) {
            return Paint.Cap.ROUND;
        }
        if (str.equals("square")) {
            return Paint.Cap.SQUARE;
        }
        return cap;
    }

    public static Paint.Join convertLineJoin(String str) {
        Paint.Join join = Paint.Join.MITER;
        if (str.equals("bevel")) {
            return Paint.Join.BEVEL;
        }
        if (str.equals("round")) {
            return Paint.Join.ROUND;
        }
        return join;
    }

    public static Paint.Align convertTextAlign(String str) {
        Paint.Align align = Paint.Align.LEFT;
        if (str.equals("right")) {
            return Paint.Align.RIGHT;
        }
        if (str.equals("center")) {
            return Paint.Align.CENTER;
        }
        return align;
    }

    public static int convertTextBaseline(String str) {
        if (str.equals("top")) {
            return 1;
        }
        if (str.equals("middle")) {
            return 2;
        }
        return 0;
    }

    public static ArrayList<HashMap> convertActions(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList<HashMap> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            try {
                ReadableMap map = readableArray.getMap(i);
                arrayList.add(createAction(map.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD), map.getArray("arguments").toArrayList().toArray()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static int[] convertColor(float[] fArr) {
        if (fArr.length != 4) {
            return new int[]{255, 0, 0, 0};
        }
        return new int[]{(int) (fArr[3] * 255.0f), (int) (fArr[0] * 255.0f), (int) (fArr[1] * 255.0f), (int) (fArr[2] * 255.0f)};
    }

    public static HashMap createAction(String str, Object[] objArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, str);
        hashMap.put("arguments", objArr);
        return hashMap;
    }

    public static DashPathEffect convertLineDash(float[] fArr, float f2) {
        boolean z;
        float[] fArr2;
        float length = (float) fArr.length;
        if (length % 2.0f != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fArr2 = new float[(fArr.length * 2)];
        } else {
            fArr2 = new float[fArr.length];
        }
        for (int i = 0; i < fArr2.length; i++) {
            fArr2[i] = fArr[(int) (((float) i) % length)];
        }
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        return new DashPathEffect(fArr2, f2);
    }
}
