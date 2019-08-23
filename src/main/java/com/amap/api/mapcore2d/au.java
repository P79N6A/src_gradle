package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Point;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.amap.api.maps2d.model.LatLng;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class au extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private y f5637a;

    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5638a;

        /* renamed from: b  reason: collision with root package name */
        public LatLng f5639b;

        /* renamed from: c  reason: collision with root package name */
        public int f5640c;

        /* renamed from: d  reason: collision with root package name */
        public int f5641d;

        /* renamed from: e  reason: collision with root package name */
        public int f5642e;

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5638a = 1;
            this.f5642e = 51;
        }

        public a(int i, int i2, LatLng latLng, int i3, int i4, int i5) {
            super(i, i2);
            this.f5638a = 1;
            this.f5642e = 51;
            this.f5638a = 0;
            this.f5639b = latLng;
            this.f5640c = i3;
            this.f5641d = i4;
            this.f5642e = i5;
        }
    }

    public void a() {
        onLayout(false, 0, 0, 0, 0);
    }

    public au(Context context, y yVar) {
        super(context);
        this.f5637a = yVar;
        setWillNotDraw(false);
    }

    private void a(View view, a aVar) {
        int[] iArr = new int[2];
        a(view, aVar.width, aVar.height, iArr);
        a(view, iArr[0], iArr[1], aVar.f5640c, aVar.f5641d, aVar.f5642e);
    }

    private void b(View view, a aVar) {
        int[] iArr = new int[2];
        a(view, aVar.width, aVar.height, iArr);
        if (view instanceof ce) {
            a((ce) view, iArr, aVar.f5642e);
        } else if (view instanceof ap) {
            a(view, iArr[0], iArr[1], getWidth() - iArr[0], iArr[1], aVar.f5642e);
        } else if (view instanceof p) {
            a(view, iArr[0], iArr[1], 0, 0, aVar.f5642e);
        } else {
            if (aVar.f5639b != null) {
                Point point = null;
                try {
                    point = this.f5637a.d().a(new w((int) (aVar.f5639b.latitude * 1000000.0d), (int) (aVar.f5639b.longitude * 1000000.0d)), (Point) null);
                } catch (RemoteException e2) {
                    cm.a(e2, "MapOverlayViewGroup", "layoutMap");
                }
                if (point != null) {
                    point.x += aVar.f5640c;
                    point.y += aVar.f5641d;
                    a(view, iArr[0], iArr[1], point.x, point.y, aVar.f5642e);
                }
            }
        }
    }

    private void a(ce ceVar, int[] iArr, int i) {
        int b2 = ceVar.b();
        if (b2 == 1) {
            a(ceVar, iArr[0], iArr[1], getWidth() - iArr[0], (getHeight() + iArr[1]) / 2, i);
            return;
        }
        if (b2 == 0) {
            a(ceVar, iArr[0], iArr[1], getWidth() - iArr[0], getHeight(), i);
        }
    }

    private void a(View view, int i, int i2, int[] iArr) {
        if (view instanceof ListView) {
            View view2 = (View) view.getParent();
            if (view2 != null) {
                iArr[0] = view2.getWidth();
                iArr[1] = view2.getHeight();
            }
        }
        if (i <= 0 || i2 <= 0) {
            view.measure(0, 0);
        }
        if (i == -2) {
            iArr[0] = view.getMeasuredWidth();
        } else if (i == -1) {
            iArr[0] = getMeasuredWidth();
        } else {
            iArr[0] = i;
        }
        if (i2 == -2) {
            iArr[1] = view.getMeasuredHeight();
        } else if (i2 == -1) {
            iArr[1] = getMeasuredHeight();
        } else {
            iArr[1] = i2;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                if (childAt.getLayoutParams() instanceof a) {
                    a aVar = (a) childAt.getLayoutParams();
                    if (aVar.f5638a == 0) {
                        b(childAt, aVar);
                    } else {
                        a(childAt, aVar);
                    }
                } else {
                    a(childAt, new a(childAt.getLayoutParams()));
                }
            }
        }
    }

    private void a(View view, int i, int i2, int i3, int i4, int i5) {
        int i6 = i5 & 7;
        int i7 = i5 & SearchJediMixFeedAdapter.f42516e;
        if (i6 == 5) {
            i3 -= i;
        } else if (i6 == 1) {
            i3 -= i / 2;
        }
        if (i7 == 80) {
            i4 -= i2;
        } else if (i7 == 16) {
            i4 -= i2 / 2;
        }
        view.layout(i3, i4, i + i3, i2 + i4);
    }
}
