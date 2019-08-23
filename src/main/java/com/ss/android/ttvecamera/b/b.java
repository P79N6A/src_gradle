package com.ss.android.ttvecamera.b;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.aa;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f31351f;

    /* renamed from: a  reason: collision with root package name */
    protected final int f31352a = 90;

    /* renamed from: b  reason: collision with root package name */
    protected final float f31353b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    protected final float f31354c = 2.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f31355d;

    /* renamed from: e  reason: collision with root package name */
    public List<Camera.Area> f31356e = new ArrayList();
    @TECameraSettings.CameraType
    private int g = 1;
    private List<Camera.Area> h = new ArrayList();

    static {
        ArrayList arrayList = new ArrayList();
        f31351f = arrayList;
        arrayList.add("multilaser");
        f31351f.add("ms40");
    }

    public static boolean a(Camera.Parameters parameters) {
        if (parameters == null || parameters.getMaxNumMeteringAreas() <= 0) {
            return false;
        }
        return true;
    }

    public b(@TECameraSettings.CameraType int i) {
    }

    public final List<Camera.Area> a(int i, int i2, float f2, int i3, int i4, int i5) {
        Rect a2 = a(i, i2, f2, 180.0f, i3, i4, i5);
        if (this.h.size() > 0) {
            this.h.clear();
        }
        this.h.add(new Camera.Area(a2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        return this.h;
    }

    public final Rect a(int i, int i2, float f2, float f3, int i3, int i4, int i5) {
        int intValue = Float.valueOf((f2 * f3) + 0.5f).intValue();
        int i6 = ((int) ((((float) (i3 * 2000)) * 1.0f) / ((float) i))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i7 = ((int) ((((float) (i4 * 2000)) * 1.0f) / ((float) i2))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        if (this.f31355d == 1) {
            i6 = -i6;
        }
        int i8 = intValue / 2;
        int a2 = aa.a(i6 - i8, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        int a3 = aa.a(i7 - i8, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        RectF rectF = new RectF((float) a2, (float) a3, (float) aa.a(a2 + intValue), (float) aa.a(a3 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        aa.a(i5, new Rect(-1000, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), rect);
        Rect rect2 = new Rect(rect.left - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.top - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.right - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.bottom - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        rect2.left = aa.a(rect2.left);
        rect2.right = aa.a(rect2.right);
        rect2.top = aa.a(rect2.top);
        rect2.bottom = aa.a(rect2.bottom);
        return rect2;
    }
}
