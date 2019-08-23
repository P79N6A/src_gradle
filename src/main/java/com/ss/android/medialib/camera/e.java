package com.ss.android.medialib.camera;

import android.graphics.Point;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29522a;

    public static int a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] a(int[] r19, java.util.List<int[]> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f29522a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<int[]> r4 = int[].class
            r8[r10] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r11] = r4
            java.lang.Class<int[]> r9 = int[].class
            r4 = 0
            r6 = 1
            r7 = 16754(0x4172, float:2.3477E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f29522a
            r15 = 1
            r16 = 16754(0x4172, float:2.3477E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<int[]> r1 = int[].class
            r0[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r11] = r1
            java.lang.Class<int[]> r18 = int[].class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            int[] r0 = (int[]) r0
            return r0
        L_0x0046:
            com.ss.android.medialib.camera.e$1 r2 = new com.ss.android.medialib.camera.e$1
            r2.<init>(r0)
            java.lang.Object r0 = java.util.Collections.min(r1, r2)
            int[] r0 = (int[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.camera.e.a(int[], java.util.List):int[]");
    }

    public static Point a(List<Point> list, int i, int i2) {
        List<Point> list2 = list;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f29522a, true, 16755, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f29522a, true, 16755, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, Point.class);
        } else if (list2 == null || list.isEmpty() || i3 <= 0 || i4 <= 0) {
            return null;
        } else {
            Point point = new Point(0, 0);
            float f2 = Float.MAX_VALUE;
            for (Point next : list) {
                int i5 = next.x;
                int i6 = next.y;
                if (i5 == i3 && i6 == i4) {
                    return next;
                }
                float a2 = a((float) i3, (float) i4, (float) i5, (float) i6);
                if (a2 < f2) {
                    point.x = i5;
                    point.y = i6;
                    f2 = a2;
                }
            }
            if (point.x > 0 && point.y > 0) {
                return point;
            }
            Collections.sort(list2, new Comparator<Point>() {
                public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                    Point point = (Point) obj;
                    Point point2 = (Point) obj2;
                    return (point.x * point.y) - (point2.x * point2.y);
                }
            });
            return list2.get(list.size() / 2);
        }
    }

    private static float a(float f2, float f3, float f4, float f5) {
        float f6;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, null, f29522a, true, 16760, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)) {
            Object[] objArr = {Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
            return ((Float) PatchProxy.accessDispatch(objArr, null, f29522a, true, 16760, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Float.TYPE)).floatValue();
        }
        if (f4 * f5 > f2 * f3) {
            f6 = 1.0f;
        } else {
            f6 = 1.2f;
        }
        return (Math.abs((f2 / f3) - (f4 / f5)) * 1000.0f) + ((Math.abs(f2 - f4) + Math.abs(f3 - f5)) * f6);
    }

    private static Point b(List<Point> list, Point point, float f2, float f3) {
        Point point2 = point;
        float f4 = f2;
        float f5 = f3;
        if (PatchProxy.isSupport(new Object[]{list, point2, Float.valueOf(f2), Float.valueOf(f3)}, null, f29522a, true, 16756, new Class[]{List.class, Point.class, Float.TYPE, Float.TYPE}, Point.class)) {
            Object[] objArr = {list, point2, Float.valueOf(f2), Float.valueOf(f3)};
            return (Point) PatchProxy.accessDispatch(objArr, null, f29522a, true, 16756, new Class[]{List.class, Point.class, Float.TYPE, Float.TYPE}, Point.class);
        } else if (list == null || list.isEmpty() || point2 == null || point2.x <= 0 || point2.y <= 0 || f4 <= 0.0f || f5 <= 0.0f) {
            return null;
        } else {
            float f6 = Float.MAX_VALUE;
            Point point3 = new Point(0, 0);
            for (Point next : list) {
                if (((double) Math.abs((((float) next.x) * f5) - (((float) next.y) * f4))) <= 1.0E-5d) {
                    float a2 = a(f4, f5, (float) next.x, (float) next.y);
                    if (a2 < f6) {
                        point3.x = next.x;
                        point3.y = next.y;
                        f6 = a2;
                    }
                }
            }
            if (point3.x <= 0 || point3.y <= 0) {
                return null;
            }
            return point3;
        }
    }

    public static Point a(List<Point> list, Point point, float f2, float f3) {
        List<Point> list2 = list;
        Point point2 = point;
        float f4 = f2;
        if (PatchProxy.isSupport(new Object[]{list2, point2, Float.valueOf(f2), Float.valueOf(f3)}, null, f29522a, true, 16757, new Class[]{List.class, Point.class, Float.TYPE, Float.TYPE}, Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[]{list2, point2, Float.valueOf(f2), Float.valueOf(f3)}, null, f29522a, true, 16757, new Class[]{List.class, Point.class, Float.TYPE, Float.TYPE}, Point.class);
        }
        Point b2 = b(list2, point2, f4, (((float) point2.y) * f4) / ((float) point2.x));
        if (b2 != null) {
            return b2;
        }
        Point b3 = b(list, point, f2, f3);
        if (b3 != null) {
            return b3;
        }
        return a(list2, (int) f4, (int) f3);
    }

    private static Pair<Point, Point> b(List<Point> list, int i, int i2, List<Point> list2, int i3, int i4) {
        List<Point> list3 = list2;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i), Integer.valueOf(i2), list3, Integer.valueOf(i3), Integer.valueOf(i4)}, null, f29522a, true, 16758, new Class[]{List.class, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE}, Pair.class)) {
            Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), list3, Integer.valueOf(i3), Integer.valueOf(i4)};
            return (Pair) PatchProxy.accessDispatch(objArr, null, f29522a, true, 16758, new Class[]{List.class, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE}, Pair.class);
        }
        Point a2 = a(list, i, i2);
        float f2 = (float) i3;
        return new Pair<>(a2, b(list3, a2, f2, (((float) a2.y) * f2) / ((float) a2.x)));
    }

    public static Point a(List<Point> list, int i, int i2, List<Point> list2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i), Integer.valueOf(i2), list2, Integer.valueOf(i3), Integer.valueOf(i4)}, null, f29522a, true, 16759, new Class[]{List.class, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE}, Point.class)) {
            Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), list2, Integer.valueOf(i3), Integer.valueOf(i4)};
            return (Point) PatchProxy.accessDispatch(objArr, null, f29522a, true, 16759, new Class[]{List.class, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE}, Point.class);
        }
        Pair<Point, Point> b2 = b(list, i, i2, list2, i3, i4);
        if (b2.second == null && ((Point) b2.first).x * 9 != ((Point) b2.first).y * 16) {
            b2 = b(list, i, (i * 9) / 16, list2, i3, i4);
        }
        if (b2.second == null && ((Point) b2.first).x * 3 != ((Point) b2.first).y * 4) {
            b2 = b(list, i, (i * 3) / 4, list2, i3, i4);
        }
        return (Point) b2.first;
    }
}
