package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    static final ArrayList<ac> f31328a = new ArrayList<>(Arrays.asList(new ac[]{new ac(160, 120), new ac(240, 160), new ac(320, 240), new ac(400, 240), new ac(480, 320), new ac(640, 360), new ac(640, 480), new ac(768, 480), new ac(854, 480), new ac(800, 600), new ac(960, 540), new ac(960, 640), new ac(1024, 576), new ac(1024, 600), new ac(1280, 720), new ac(1280, 1024), new ac(1920, 1080), new ac(1920, 1440), new ac(2560, 1440), new ac(3840, 2160)}));

    static abstract class a<T> implements Comparator<T> {
        /* access modifiers changed from: package-private */
        public abstract int a(T t);

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public int compare(T t, T t2) {
            return a(t) - a(t2);
        }
    }

    public static int a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public static int a(int i) {
        return a(i, -1000, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public static int a(Context context) {
        switch (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation()) {
            case 1:
                return 90;
            case 2:
                return 180;
            case 3:
                return 270;
            default:
                return 0;
        }
    }

    public static ac a(@NonNull List<ac> list, final ac acVar) {
        return (ac) Collections.min(list, new a<ac>() {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ int a(Object obj) {
                ac acVar = (ac) obj;
                return Math.abs(acVar.f31335a - acVar.f31335a) + Math.abs(acVar.f31336b - acVar.f31336b);
            }
        });
    }

    public static int[] a(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            private int a(int[] iArr) {
                int i;
                int i2;
                if (iArr[0] > iArr[0]) {
                    i = (iArr[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr[0]) * 3;
                }
                if (iArr[1] > iArr[1]) {
                    i2 = (iArr[1] - iArr[1]) * 4;
                } else {
                    i2 = (iArr[1] - iArr[1]) * 1;
                }
                return i + i2;
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return a((int[]) obj) - a((int[]) obj2);
            }
        });
    }

    public static ac a(@NonNull List<ac> list, ac acVar, @NonNull final ac acVar2) {
        if (acVar != null && acVar.a()) {
            if (acVar.equals(acVar2)) {
                return acVar2;
            }
            Iterator<ac> it2 = list.iterator();
            while (it2.hasNext()) {
                ac next = it2.next();
                if (next.f31335a * acVar.f31336b != next.f31336b * acVar.f31335a) {
                    it2.remove();
                }
            }
        }
        return (ac) Collections.min(list, new a<ac>() {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ int a(Object obj) {
                ac acVar = (ac) obj;
                return Math.abs(acVar2.f31335a - acVar.f31335a) + Math.abs(acVar2.f31336b - acVar.f31336b);
            }
        });
    }

    public static void a(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }
}
