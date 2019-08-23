package com.ss.android.sdk.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    View f30646a;

    /* renamed from: b  reason: collision with root package name */
    int f30647b;

    /* renamed from: c  reason: collision with root package name */
    int f30648c;

    /* renamed from: d  reason: collision with root package name */
    int f30649d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup.LayoutParams f30650e;

    b(View view) {
        this.f30646a = view;
        this.f30646a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int i;
                b bVar = b.this;
                Rect rect = new Rect();
                bVar.f30646a.getWindowVisibleDisplayFrame(rect);
                int i2 = rect.bottom - rect.top;
                if (bVar.f30648c == 0) {
                    bVar.f30648c = bVar.f30646a.getHeight();
                }
                if (i2 != bVar.f30647b) {
                    int height = bVar.f30646a.getRootView().getHeight();
                    int i3 = height - i2;
                    if (i3 > height / 4) {
                        ViewGroup.LayoutParams layoutParams = bVar.f30650e;
                        int i4 = height - i3;
                        if (bVar.f30649d > 0) {
                            i = bVar.f30649d;
                        } else {
                            i = 0;
                        }
                        layoutParams.height = i4 + i;
                    } else {
                        bVar.f30650e.height = bVar.f30648c;
                    }
                    bVar.f30646a.requestLayout();
                    bVar.f30647b = i2;
                }
            }
        });
        this.f30650e = this.f30646a.getLayoutParams();
    }

    public b(View view, int i) {
        this(view);
        this.f30649d = i;
    }
}
