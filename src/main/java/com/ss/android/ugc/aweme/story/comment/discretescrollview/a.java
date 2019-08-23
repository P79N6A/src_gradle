package com.ss.android.ugc.aweme.story.comment.discretescrollview;

import android.graphics.Point;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum a {
    HORIZONTAL {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* access modifiers changed from: package-private */
        public final C0753a createHelper() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82718, new Class[0], C0753a.class)) {
                return new b();
            }
            return (C0753a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82718, new Class[0], C0753a.class);
        }
    },
    VERTICAL {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* access modifiers changed from: package-private */
        public final C0753a createHelper() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82719, new Class[0], C0753a.class)) {
                return new c();
            }
            return (C0753a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82719, new Class[0], C0753a.class);
        }
    };
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.ss.android.ugc.aweme.story.comment.discretescrollview.a$a  reason: collision with other inner class name */
    interface C0753a {
        float a(Point point, int i, int i2);

        int a(int i);

        int a(int i, int i2);

        void a(int i, c cVar);

        void a(Point point, int i, Point point2);

        void a(b bVar, int i, Point point);

        boolean a();

        boolean a(Point point, int i, int i2, int i3, int i4);

        boolean a(DiscreteScrollLayoutManager discreteScrollLayoutManager);

        int b(int i);

        int b(int i, int i2);

        boolean b();

        int c(int i, int i2);
    }

    protected static class b implements C0753a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72166a;

        public final int a(int i) {
            return i;
        }

        public final int a(int i, int i2) {
            return i;
        }

        public final boolean a() {
            return false;
        }

        public final int b(int i) {
            return 0;
        }

        public final int b(int i, int i2) {
            return i;
        }

        public final boolean b() {
            return true;
        }

        public final int c(int i, int i2) {
            return i;
        }

        public final boolean a(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            DiscreteScrollLayoutManager discreteScrollLayoutManager2 = discreteScrollLayoutManager;
            if (PatchProxy.isSupport(new Object[]{discreteScrollLayoutManager2}, this, f72166a, false, 82722, new Class[]{DiscreteScrollLayoutManager.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{discreteScrollLayoutManager2}, this, f72166a, false, 82722, new Class[]{DiscreteScrollLayoutManager.class}, Boolean.TYPE)).booleanValue();
            }
            View d2 = discreteScrollLayoutManager.d();
            View e2 = discreteScrollLayoutManager.e();
            int i = -discreteScrollLayoutManager2.g;
            int width = discreteScrollLayoutManager.getWidth() + discreteScrollLayoutManager2.g;
            if (discreteScrollLayoutManager2.getDecoratedLeft(d2) <= i || discreteScrollLayoutManager2.getPosition(d2) <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (discreteScrollLayoutManager2.getDecoratedRight(e2) >= width || discreteScrollLayoutManager2.getPosition(e2) >= discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }

        public final void a(int i, c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar2}, this, f72166a, false, 82723, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
                Object[] objArr = {Integer.valueOf(i), cVar2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f72166a, false, 82723, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, cVar, c.f72168a, false, 82834, new Class[]{Integer.TYPE}, Void.TYPE)) {
                c cVar3 = cVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, cVar3, c.f72168a, false, 82834, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            cVar2.f72169b.offsetChildrenHorizontal(i);
        }

        public final float a(Point point, int i, int i2) {
            return (float) (i - point.x);
        }

        public final void a(Point point, int i, Point point2) {
            Point point3 = point;
            Point point4 = point2;
            if (PatchProxy.isSupport(new Object[]{point3, Integer.valueOf(i), point4}, this, f72166a, false, 82720, new Class[]{Point.class, Integer.TYPE, Point.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{point3, Integer.valueOf(i), point4}, this, f72166a, false, 82720, new Class[]{Point.class, Integer.TYPE, Point.class}, Void.TYPE);
                return;
            }
            point4.set(point3.x - i, point3.y);
        }

        public final void a(b bVar, int i, Point point) {
            Point point2 = point;
            if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i), point2}, this, f72166a, false, 82721, new Class[]{b.class, Integer.TYPE, Point.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i), point2}, this, f72166a, false, 82721, new Class[]{b.class, Integer.TYPE, Point.class}, Void.TYPE);
                return;
            }
            point2.set(point2.x + bVar.applyTo(i), point2.y);
        }

        public final boolean a(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.x - i;
            int i6 = point.x + i;
            if (i5 >= i3 + i4 || i6 <= (-i4)) {
                return false;
            }
            return true;
        }
    }

    protected static class c implements C0753a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72167a;

        public final int a(int i) {
            return 0;
        }

        public final int a(int i, int i2) {
            return i2;
        }

        public final boolean a() {
            return true;
        }

        public final int b(int i) {
            return i;
        }

        public final int b(int i, int i2) {
            return i2;
        }

        public final boolean b() {
            return false;
        }

        public final int c(int i, int i2) {
            return i2;
        }

        public final boolean a(DiscreteScrollLayoutManager discreteScrollLayoutManager) {
            boolean z;
            boolean z2;
            DiscreteScrollLayoutManager discreteScrollLayoutManager2 = discreteScrollLayoutManager;
            if (PatchProxy.isSupport(new Object[]{discreteScrollLayoutManager2}, this, f72167a, false, 82727, new Class[]{DiscreteScrollLayoutManager.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{discreteScrollLayoutManager2}, this, f72167a, false, 82727, new Class[]{DiscreteScrollLayoutManager.class}, Boolean.TYPE)).booleanValue();
            }
            View d2 = discreteScrollLayoutManager.d();
            View e2 = discreteScrollLayoutManager.e();
            int i = -discreteScrollLayoutManager2.g;
            int height = discreteScrollLayoutManager.getHeight() + discreteScrollLayoutManager2.g;
            if (discreteScrollLayoutManager2.getDecoratedTop(d2) <= i || discreteScrollLayoutManager2.getPosition(d2) <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (discreteScrollLayoutManager2.getDecoratedBottom(e2) >= height || discreteScrollLayoutManager2.getPosition(e2) >= discreteScrollLayoutManager.getItemCount() - 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        }

        public final void a(int i, c cVar) {
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar2}, this, f72167a, false, 82726, new Class[]{Integer.TYPE, c.class}, Void.TYPE)) {
                Object[] objArr = {Integer.valueOf(i), cVar2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f72167a, false, 82726, new Class[]{Integer.TYPE, c.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, cVar, c.f72168a, false, 82835, new Class[]{Integer.TYPE}, Void.TYPE)) {
                c cVar3 = cVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, cVar3, c.f72168a, false, 82835, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            cVar2.f72169b.offsetChildrenVertical(i);
        }

        public final float a(Point point, int i, int i2) {
            return (float) (i2 - point.y);
        }

        public final void a(Point point, int i, Point point2) {
            Point point3 = point;
            Point point4 = point2;
            if (PatchProxy.isSupport(new Object[]{point3, Integer.valueOf(i), point4}, this, f72167a, false, 82724, new Class[]{Point.class, Integer.TYPE, Point.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{point3, Integer.valueOf(i), point4}, this, f72167a, false, 82724, new Class[]{Point.class, Integer.TYPE, Point.class}, Void.TYPE);
                return;
            }
            point4.set(point3.x, point3.y - i);
        }

        public final void a(b bVar, int i, Point point) {
            Point point2 = point;
            if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i), point2}, this, f72167a, false, 82725, new Class[]{b.class, Integer.TYPE, Point.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i), point2}, this, f72167a, false, 82725, new Class[]{b.class, Integer.TYPE, Point.class}, Void.TYPE);
                return;
            }
            point2.set(point2.x, point2.y + bVar.applyTo(i));
        }

        public final boolean a(Point point, int i, int i2, int i3, int i4) {
            int i5 = point.y - i2;
            int i6 = point.y + i2;
            if (i5 >= i3 + i4 || i6 <= (-i4)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C0753a createHelper();
}
