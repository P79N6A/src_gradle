package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.internal.entity.c;

public class MediaGrid extends SquareFrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f82713a;

    /* renamed from: b  reason: collision with root package name */
    public CheckView f82714b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f82715c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f82716d;

    /* renamed from: e  reason: collision with root package name */
    public c f82717e;

    /* renamed from: f  reason: collision with root package name */
    public b f82718f;
    private a g;

    public interface a {
        void a(c cVar, RecyclerView.ViewHolder viewHolder);

        void b(c cVar, RecyclerView.ViewHolder viewHolder);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f82719a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f82720b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f82721c;

        /* renamed from: d  reason: collision with root package name */
        RecyclerView.ViewHolder f82722d;

        public b(int i, Drawable drawable, boolean z, RecyclerView.ViewHolder viewHolder) {
            this.f82719a = i;
            this.f82720b = drawable;
            this.f82721c = z;
            this.f82722d = viewHolder;
        }
    }

    public c getMedia() {
        return this.f82717e;
    }

    public void setOnMediaGridClickListener(a aVar) {
        this.g = aVar;
    }

    public MediaGrid(Context context) {
        super(context);
        a(context);
    }

    public void setCheckEnabled(boolean z) {
        this.f82714b.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.f82714b.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.f82714b.setCheckedNum(i);
    }

    public void onClick(View view) {
        if (this.g != null) {
            if (view == this.f82713a) {
                this.g.a(this.f82717e, this.f82718f.f82722d);
            } else if (view == this.f82714b) {
                this.g.b(this.f82717e, this.f82718f.f82722d);
            }
        }
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(C0906R.layout.aa8, this, true);
        this.f82713a = (ImageView) findViewById(C0906R.id.bm6);
        this.f82714b = (CheckView) findViewById(C0906R.id.sa);
        this.f82715c = (ImageView) findViewById(C0906R.id.ajf);
        this.f82716d = (TextView) findViewById(C0906R.id.ds2);
        this.f82713a.setOnClickListener(this);
        this.f82714b.setOnClickListener(this);
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }
}
