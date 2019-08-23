package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.a.a;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d.b;

public class StickyRecyclerHeadersDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46901a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Rect> f46902b;

    /* renamed from: c  reason: collision with root package name */
    public final a f46903c;

    /* renamed from: d  reason: collision with root package name */
    private final c f46904d;

    /* renamed from: e  reason: collision with root package name */
    private final b f46905e;

    /* renamed from: f  reason: collision with root package name */
    private final b f46906f;
    private final a g;
    private final com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a h;
    private final com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a i;
    private final Rect j;

    public StickyRecyclerHeadersDecoration(c cVar) {
        this(cVar, new com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d.a(), new com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a(), null);
    }

    public final View a(RecyclerView recyclerView, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (!PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i2)}, this, f46901a, false, 43563, new Class[]{RecyclerView.class, Integer.TYPE}, View.class)) {
            return this.f46903c.a(recyclerView2, i2);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i2)}, this, f46901a, false, 43563, new Class[]{RecyclerView.class, Integer.TYPE}, View.class);
    }

    public final int a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46901a, false, 43562, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46901a, false, 43562, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        for (int i4 = 0; i4 < this.f46902b.size(); i4++) {
            if (this.f46902b.get(this.f46902b.keyAt(i4)).contains(i2, i3)) {
                int keyAt = this.f46902b.keyAt(i4);
                if (this.f46905e == null || this.f46905e.a()) {
                    return keyAt;
                }
            }
        }
        return -1;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        int i8 = 3;
        char c2 = 2;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f46901a, false, 43561, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f46901a, false, 43561, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0 && this.f46904d.getItemCount() > 0) {
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = recyclerView2.getChildAt(i9);
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    a aVar = this.g;
                    int a2 = this.f46906f.a(recyclerView2);
                    Object[] objArr = new Object[i8];
                    objArr[0] = childAt;
                    objArr[1] = Integer.valueOf(a2);
                    objArr[c2] = Integer.valueOf(childAdapterPosition);
                    ChangeQuickRedirect changeQuickRedirect = a.f46914a;
                    Class[] clsArr = new Class[i8];
                    clsArr[0] = View.class;
                    clsArr[1] = Integer.TYPE;
                    clsArr[c2] = Integer.TYPE;
                    if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, 43548, clsArr, Boolean.TYPE)) {
                        Object[] objArr2 = new Object[i8];
                        objArr2[0] = childAt;
                        objArr2[1] = Integer.valueOf(a2);
                        objArr2[c2] = Integer.valueOf(childAdapterPosition);
                        ChangeQuickRedirect changeQuickRedirect2 = a.f46914a;
                        Class[] clsArr2 = new Class[i8];
                        clsArr2[0] = View.class;
                        clsArr2[1] = Integer.TYPE;
                        clsArr2[c2] = Integer.TYPE;
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, 43548, clsArr2, Boolean.TYPE)).booleanValue();
                    } else {
                        aVar.f46918e.a(aVar.f46919f, childAt);
                        if (a2 == 1) {
                            i7 = childAt.getTop();
                            i6 = aVar.f46919f.top;
                        } else {
                            i7 = childAt.getLeft();
                            i6 = aVar.f46919f.left;
                        }
                        if (i7 > i6 || aVar.f46915b.a(childAdapterPosition) < 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z || this.g.a(childAdapterPosition, this.f46906f.b(recyclerView2))) {
                        View a3 = this.f46903c.a(recyclerView2, childAdapterPosition);
                        Rect rect = this.f46902b.get(childAdapterPosition);
                        if (rect == null) {
                            rect = new Rect();
                            this.f46902b.put(childAdapterPosition, rect);
                        }
                        a aVar2 = this.g;
                        Object[] objArr3 = new Object[5];
                        objArr3[0] = rect;
                        objArr3[1] = recyclerView2;
                        objArr3[c2] = a3;
                        objArr3[i8] = childAt;
                        objArr3[4] = Byte.valueOf(z ? (byte) 1 : 0);
                        ChangeQuickRedirect changeQuickRedirect3 = a.f46914a;
                        Class[] clsArr3 = new Class[5];
                        clsArr3[0] = Rect.class;
                        clsArr3[1] = RecyclerView.class;
                        clsArr3[c2] = View.class;
                        clsArr3[3] = View.class;
                        clsArr3[4] = Boolean.TYPE;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, 43551, clsArr3, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{rect, recyclerView2, a3, childAt, Byte.valueOf(z)}, aVar2, a.f46914a, false, 43551, new Class[]{Rect.class, RecyclerView.class, View.class, View.class, Boolean.TYPE}, Void.TYPE);
                        } else {
                            int a4 = aVar2.f46916c.a(recyclerView2);
                            if (PatchProxy.isSupport(new Object[]{rect, recyclerView2, a3, childAt, Integer.valueOf(a4)}, aVar2, a.f46914a, false, 43552, new Class[]{Rect.class, RecyclerView.class, View.class, View.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{rect, recyclerView2, a3, childAt, Integer.valueOf(a4)}, aVar2, a.f46914a, false, 43552, new Class[]{Rect.class, RecyclerView.class, View.class, View.class, Integer.TYPE}, Void.TYPE);
                            } else {
                                aVar2.f46918e.a(aVar2.f46919f, a3);
                                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                    i2 = marginLayoutParams.leftMargin;
                                    i3 = marginLayoutParams.topMargin;
                                } else {
                                    i3 = 0;
                                    i2 = 0;
                                }
                                if (a4 == 1) {
                                    int left = (childAt.getLeft() - i2) + aVar2.f46919f.left;
                                    i4 = Math.max(((childAt.getTop() - i3) - a3.getHeight()) - aVar2.f46919f.bottom, aVar2.a(recyclerView2) + aVar2.f46919f.top);
                                    i5 = left;
                                } else {
                                    i4 = (childAt.getTop() - i3) + aVar2.f46919f.top;
                                    i5 = Math.max(((childAt.getLeft() - i2) - a3.getWidth()) - aVar2.f46919f.right, aVar2.b(recyclerView2) + aVar2.f46919f.left);
                                }
                                rect.set(i5, i4, a3.getWidth() + i5, a3.getHeight() + i4);
                            }
                            if (z) {
                                if (PatchProxy.isSupport(new Object[]{recyclerView2, a3}, aVar2, a.f46914a, false, 43553, new Class[]{RecyclerView.class, View.class}, Boolean.TYPE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2, a3}, aVar2, a.f46914a, false, 43553, new Class[]{RecyclerView.class, View.class}, Boolean.TYPE)).booleanValue();
                                } else {
                                    View a5 = aVar2.a(recyclerView2, a3);
                                    int childAdapterPosition2 = recyclerView2.getChildAdapterPosition(a5);
                                    if (childAdapterPosition2 != -1) {
                                        boolean b2 = aVar2.f46916c.b(recyclerView2);
                                        if (childAdapterPosition2 > 0 && aVar2.a(childAdapterPosition2, b2)) {
                                            View a6 = aVar2.f46917d.a(recyclerView2, childAdapterPosition2);
                                            aVar2.f46918e.a(aVar2.f46919f, a6);
                                            aVar2.f46918e.a(aVar2.g, a3);
                                            if (aVar2.f46916c.a(recyclerView2) != 1 ? ((a5.getLeft() - aVar2.f46919f.right) - a6.getWidth()) - aVar2.f46919f.left < recyclerView.getPaddingLeft() + a3.getRight() + aVar2.g.left + aVar2.g.right : ((a5.getTop() - aVar2.f46919f.bottom) - a6.getHeight()) - aVar2.f46919f.top < recyclerView.getPaddingTop() + a3.getBottom() + aVar2.g.top + aVar2.g.bottom) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                    z2 = false;
                                }
                                if (z2) {
                                    View a7 = aVar2.a(recyclerView2, a3);
                                    View a8 = aVar2.f46917d.a(recyclerView2, recyclerView2.getChildAdapterPosition(a7));
                                    int a9 = aVar2.f46916c.a(recyclerView2);
                                    if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(a9), rect, a3, a7, a8}, aVar2, a.f46914a, false, 43554, new Class[]{RecyclerView.class, Integer.TYPE, Rect.class, View.class, View.class, View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(a9), rect, a3, a7, a8}, aVar2, a.f46914a, false, 43554, new Class[]{RecyclerView.class, Integer.TYPE, Rect.class, View.class, View.class, View.class}, Void.TYPE);
                                    } else {
                                        aVar2.f46918e.a(aVar2.f46919f, a8);
                                        aVar2.f46918e.a(aVar2.g, a3);
                                        if (a9 == 1) {
                                            int a10 = aVar2.a(recyclerView2) + aVar2.g.top + aVar2.g.bottom;
                                            int top = ((((a7.getTop() - a8.getHeight()) - aVar2.f46919f.bottom) - aVar2.f46919f.top) - a3.getHeight()) - a10;
                                            if (top < a10) {
                                                rect.top += top;
                                            }
                                        } else {
                                            int b3 = aVar2.b(recyclerView2) + aVar2.g.left + aVar2.g.right;
                                            int left2 = ((((a7.getLeft() - a8.getWidth()) - aVar2.f46919f.right) - aVar2.f46919f.left) - a3.getWidth()) - b3;
                                            if (left2 < b3) {
                                                rect.left += left2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a aVar3 = this.h;
                        if (PatchProxy.isSupport(new Object[]{recyclerView2, canvas2, a3, rect}, aVar3, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a.f46925a, false, 43572, new Class[]{RecyclerView.class, Canvas.class, View.class, Rect.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{recyclerView2, canvas2, a3, rect}, aVar3, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a.f46925a, false, 43572, new Class[]{RecyclerView.class, Canvas.class, View.class, Rect.class}, Void.TYPE);
                        } else {
                            canvas.save();
                            if (recyclerView.getLayoutManager().getClipToPadding()) {
                                Rect rect2 = aVar3.f46928d;
                                if (PatchProxy.isSupport(new Object[]{rect2, recyclerView2, a3}, aVar3, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a.f46925a, false, 43573, new Class[]{Rect.class, RecyclerView.class, View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{rect2, recyclerView2, a3}, aVar3, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a.f46925a, false, 43573, new Class[]{Rect.class, RecyclerView.class, View.class}, Void.TYPE);
                                } else {
                                    aVar3.f46926b.a(rect2, a3);
                                    if (aVar3.f46927c.a(recyclerView2) == 1) {
                                        rect2.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect2.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                                    } else {
                                        rect2.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect2.bottom);
                                    }
                                }
                                canvas2.clipRect(aVar3.f46928d);
                            }
                            canvas2.translate((float) rect.left, (float) rect.top);
                            a3.draw(canvas2);
                            canvas.restore();
                        }
                    }
                }
                i9++;
                i8 = 3;
                c2 = 2;
            }
        }
    }

    private StickyRecyclerHeadersDecoration(c cVar, b bVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a aVar, b bVar2) {
        this(cVar, bVar, aVar, new com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a(bVar), new com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.a.b(cVar, bVar), null);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f46901a, false, 43559, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f46901a, false, 43559, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
        if (childAdapterPosition != -1 && this.g.a(childAdapterPosition, this.f46906f.b(recyclerView2))) {
            View a2 = a(recyclerView2, childAdapterPosition);
            int a3 = this.f46906f.a(recyclerView2);
            if (PatchProxy.isSupport(new Object[]{rect2, a2, Integer.valueOf(a3)}, this, f46901a, false, 43560, new Class[]{Rect.class, View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{rect2, a2, Integer.valueOf(a3)}, this, f46901a, false, 43560, new Class[]{Rect.class, View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.i.a(this.j, a2);
            if (a3 == 1) {
                rect2.top = a2.getHeight() + this.j.top + this.j.bottom;
                return;
            }
            rect2.left = a2.getWidth() + this.j.left + this.j.right;
        }
    }

    private StickyRecyclerHeadersDecoration(c cVar, b bVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a aVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a aVar2, a aVar3, b bVar2) {
        this(cVar, aVar2, bVar, aVar, aVar3, new a(cVar, aVar3, bVar, aVar), bVar2);
    }

    private StickyRecyclerHeadersDecoration(c cVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c.a aVar, b bVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b.a aVar2, a aVar3, a aVar4, b bVar2) {
        this.f46902b = new SparseArray<>();
        this.j = new Rect();
        this.f46904d = cVar;
        this.f46903c = aVar3;
        this.f46906f = bVar;
        this.h = aVar;
        this.i = aVar2;
        this.g = aVar4;
        this.f46905e = bVar2;
    }
}
