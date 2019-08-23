package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.List;

public class FloatingBarItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51975a;

    /* renamed from: b  reason: collision with root package name */
    public int f51976b;

    /* renamed from: c  reason: collision with root package name */
    public int f51977c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f51978d;

    /* renamed from: e  reason: collision with root package name */
    private Context f51979e;

    /* renamed from: f  reason: collision with root package name */
    private Resources f51980f;
    private float g;
    private Paint h;
    private Paint i;
    private int j;
    private int k;
    private float l;
    private float m;
    private float n;
    private Bitmap o;
    private Rect p;
    private Rect q;
    private boolean r;
    private String s;
    private List<String> t;
    private List<Integer> u;
    private boolean v;

    private String a(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51975a, false, 52650, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51975a, false, 52650, new Class[]{Integer.TYPE}, String.class);
        }
        int i4 = 0;
        while (true) {
            if (i3 >= this.u.size()) {
                i3 = -1;
                break;
            }
            i4 += this.u.get(i3).intValue();
            if (i2 < i4) {
                break;
            }
            i3++;
        }
        String str = null;
        if (i3 != -1) {
            str = this.t.get(i3);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.s)) {
            str = this.s;
        }
        if ("recent".equals(str)) {
            if (this.v) {
                str = this.f51979e.getString(C0906R.string.awl);
            } else {
                str = this.f51979e.getString(C0906R.string.awm);
            }
        } else if ("Friend".equals(str)) {
            if (this.v) {
                str = this.f51979e.getString(C0906R.string.arn);
            } else {
                str = this.f51979e.getString(C0906R.string.avj);
            }
        } else if (i2 == 0) {
            if (this.f51977c == 0) {
                str = this.f51979e.getString(C0906R.string.arn);
            } else if (this.f51977c == -1 || this.f51977c == 1) {
                str = this.f51979e.getString(C0906R.string.avi);
            }
        }
        this.s = str;
        return str;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{canvas, recyclerView, state}, this, f51975a, false, 52648, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, recyclerView, state}, this, f51975a, false, 52648, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas, recyclerView, state);
    }

    public FloatingBarItemDecoration(Context context, List<String> list, List<Integer> list2) {
        this.f51979e = context;
        this.f51980f = this.f51979e.getResources();
        this.g = UIUtils.dip2Px(context, 32.0f);
        this.h = new Paint();
        this.h.setColor(this.f51980f.getColor(C0906R.color.q8));
        this.i = new Paint();
        this.i.setColor(this.f51980f.getColor(C0906R.color.qs));
        this.i.setTextSize(UIUtils.dip2Px(this.f51979e, 13.0f));
        Paint.FontMetrics fontMetrics = this.i.getFontMetrics();
        this.j = (int) (fontMetrics.bottom - fontMetrics.top);
        this.k = (int) fontMetrics.bottom;
        this.l = UIUtils.dip2Px(this.f51979e, 16.0f);
        this.p = new Rect();
        this.m = UIUtils.dip2Px(this.f51979e, 2.0f);
        this.o = ((BitmapDrawable) a.a(this.f51980f, 2130840110)).getBitmap();
        this.n = UIUtils.dip2Px(this.f51979e, 16.0f);
        this.q = new Rect(0, 0, (int) this.n, (int) this.n);
        this.t = list;
        this.u = list2;
        this.v = ((IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class)).getAbInterface().e();
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f2;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f51975a, false, 52649, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f51975a, false, 52649, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        this.f51978d = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition != -1 && findFirstVisibleItemPosition >= this.f51976b) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                if (findViewHolderForAdapterPosition != null) {
                    int i2 = findFirstVisibleItemPosition - this.f51976b;
                    View view = findViewHolderForAdapterPosition.itemView;
                    String a2 = a(i2);
                    if (!TextUtils.isEmpty(a2)) {
                        this.f51978d = true;
                        this.r = false;
                        if (TextUtils.equals(this.f51979e.getString(C0906R.string.avj), a2)) {
                            this.r = true;
                        }
                        int i3 = i2 + 1;
                        if (a(i3) == null || TextUtils.equals(a(i3), a2) || ((float) (view.getHeight() + view.getTop())) >= this.g) {
                            z = false;
                        } else {
                            canvas.save();
                            canvas2.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.g);
                        }
                        this.p.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.g));
                        this.h.setColor(this.f51980f.getColor(C0906R.color.a17));
                        Canvas canvas3 = canvas;
                        canvas3.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), this.g + ((float) recyclerView.getPaddingTop()), this.h);
                        canvas2.drawText(a2, ((float) view.getPaddingLeft()) + this.l, ((((float) recyclerView.getPaddingTop()) + this.g) - ((this.g - ((float) this.j)) / 2.0f)) - ((float) this.k), this.i);
                        if (this.r) {
                            this.i.getTextBounds(a2, 0, a2.length(), this.p);
                            float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.l + ((float) this.p.width()) + this.m;
                            if (m.a()) {
                                f2 = ((float) recyclerView.getPaddingTop()) + ((this.g - ((float) this.j)) / 2.0f) + ((float) this.k);
                            } else {
                                f2 = ((((float) recyclerView.getPaddingTop()) + ((this.g - ((float) this.j)) / 2.0f)) + ((float) this.k)) - this.m;
                            }
                            this.q.set((int) paddingLeft, (int) f2, (int) (paddingLeft + this.n), (int) (f2 + this.n));
                            canvas2.drawBitmap(this.o, null, this.q, this.i);
                        }
                        if (z) {
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{rect, view, recyclerView, state}, this, f51975a, false, 52647, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect, view, recyclerView, state};
            PatchProxy.accessDispatch(objArr, this, f51975a, false, 52647, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}
