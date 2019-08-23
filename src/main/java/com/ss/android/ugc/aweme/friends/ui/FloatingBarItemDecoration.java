package com.ss.android.ugc.aweme.friends.ui;

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
import com.ss.android.ugc.bytex.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class FloatingBarItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49273a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f49274b;

    /* renamed from: c  reason: collision with root package name */
    private Context f49275c;

    /* renamed from: d  reason: collision with root package name */
    private Resources f49276d;

    /* renamed from: e  reason: collision with root package name */
    private float f49277e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f49278f;
    private Paint g;
    private int h;
    private int i;
    private float j;
    private float k;
    private float l;
    private Bitmap m;
    private Bitmap n;
    private Rect o;
    private Rect p;
    private boolean q;
    private String r;
    private List<String> s = new ArrayList();
    private List<Integer> t = new ArrayList();

    private String a(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49273a, false, 47274, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49273a, false, 47274, new Class[]{Integer.TYPE}, String.class);
        }
        String str = null;
        if (this.f49274b) {
            return null;
        }
        int i4 = 0;
        while (true) {
            if (i3 >= this.t.size()) {
                i3 = -1;
                break;
            }
            i4 += this.t.get(i3).intValue();
            if (i2 < i4) {
                break;
            }
            i3++;
        }
        if (i3 != -1) {
            str = this.s.get(i3);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.r)) {
            str = this.r;
        }
        if ("Recent".equals(str)) {
            str = this.f49275c.getString(C0906R.string.cgi);
        } else if ("Friend".equals(str)) {
            str = this.f49275c.getString(C0906R.string.cnw);
        } else if (i2 == 0) {
            str = this.f49275c.getString(C0906R.string.g5);
        }
        this.r = str;
        return str;
    }

    public FloatingBarItemDecoration(Context context, List<String> list, List<Integer> list2) {
        this.f49275c = context;
        this.f49276d = this.f49275c.getResources();
        this.f49277e = UIUtils.dip2Px(context, 32.0f);
        this.f49278f = new Paint();
        this.f49278f.setColor(859328726);
        this.g = new Paint();
        this.g.setColor(this.f49276d.getColor(C0906R.color.a6i));
        this.g.setTextSize(UIUtils.dip2Px(this.f49275c, 13.0f));
        Paint.FontMetrics fontMetrics = this.g.getFontMetrics();
        this.h = (int) (fontMetrics.bottom - fontMetrics.top);
        this.i = (int) fontMetrics.bottom;
        this.j = UIUtils.dip2Px(this.f49275c, 16.0f);
        this.o = new Rect();
        this.k = UIUtils.dip2Px(this.f49275c, 2.0f);
        this.m = ((BitmapDrawable) a.a(this.f49276d, 2130838862)).getBitmap();
        this.n = ((BitmapDrawable) a.a(this.f49276d, 2130839002)).getBitmap();
        this.l = UIUtils.dip2Px(this.f49275c, 16.0f);
        this.p = new Rect(0, 0, (int) this.l, (int) this.l);
        this.s = list;
        this.t = list2;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state}, this, f49273a, false, 47273, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state}, this, f49273a, false, 47273, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onDrawOver(canvas, recyclerView, state);
        int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
            if (findViewHolderForAdapterPosition != null) {
                View view = findViewHolderForAdapterPosition.itemView;
                String a2 = a(findFirstVisibleItemPosition);
                if (!TextUtils.isEmpty(a2)) {
                    this.q = false;
                    if (TextUtils.equals(this.f49275c.getString(C0906R.string.cnw), a2)) {
                        this.q = true;
                    }
                    int i2 = findFirstVisibleItemPosition + 1;
                    if (a(i2) == null || TextUtils.equals(a(i2), a2) || ((float) (view.getHeight() + view.getTop())) >= this.f49277e) {
                        z = false;
                    } else {
                        canvas.save();
                        canvas2.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f49277e);
                    }
                    this.o.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f49277e));
                    this.f49278f.setColor(this.f49276d.getColor(C0906R.color.a17));
                    Canvas canvas3 = canvas;
                    canvas3.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), this.f49277e + ((float) recyclerView.getPaddingTop()), this.f49278f);
                    canvas2.drawText(a2, ((float) view.getPaddingLeft()) + this.j, ((((float) recyclerView.getPaddingTop()) + this.f49277e) - ((this.f49277e - ((float) this.h)) / 2.0f)) - ((float) this.i), this.g);
                    if (this.q) {
                        this.g.getTextBounds(a2, 0, a2.length(), this.o);
                        canvas2.drawBitmap(this.n, ((float) recyclerView.getPaddingLeft()) + this.j + ((float) this.o.width()) + this.k, ((float) recyclerView.getPaddingTop()) + ((this.f49277e - ((float) this.h)) / 2.0f) + ((float) this.i), this.g);
                    } else if (TextUtils.equals(this.f49275c.getString(C0906R.string.cgi), a2)) {
                        this.g.getTextBounds(a2, 0, a2.length(), this.o);
                        float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.j + ((float) this.o.width()) + this.k;
                        float paddingTop = ((((float) recyclerView.getPaddingTop()) + ((this.f49277e - ((float) this.h)) / 2.0f)) + ((float) this.i)) - this.k;
                        this.p.set((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + this.l), (int) (paddingTop + this.l));
                        canvas2.drawBitmap(this.m, null, this.p, this.g);
                    }
                    if (z) {
                        canvas.restore();
                    }
                }
            }
        }
    }
}
