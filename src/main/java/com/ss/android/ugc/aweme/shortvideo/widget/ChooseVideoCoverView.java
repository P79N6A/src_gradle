package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.ugc.aweme.tools.R$styleable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Pair;

public class ChooseVideoCoverView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71316a;

    /* renamed from: b  reason: collision with root package name */
    public int f71317b;

    /* renamed from: c  reason: collision with root package name */
    public VideoCoverFrameView f71318c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f71319d;

    /* renamed from: e  reason: collision with root package name */
    private Context f71320e;

    /* renamed from: f  reason: collision with root package name */
    private float f71321f;
    private float g;
    private View h;
    private View i;
    private FrameLayout.LayoutParams j;
    private FrameLayout.LayoutParams k;
    private int l;
    private int m;
    private a n;

    public interface a {
        void a(float f2);

        void b(float f2);

        void c(float f2);
    }

    public static class Adapter extends RecyclerView.Adapter<ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71322a;

        /* renamed from: b  reason: collision with root package name */
        n f71323b;

        /* renamed from: c  reason: collision with root package name */
        Pair[] f71324c;

        /* renamed from: d  reason: collision with root package name */
        boolean f71325d;

        /* renamed from: e  reason: collision with root package name */
        Disposable f71326e;

        /* renamed from: f  reason: collision with root package name */
        private int f71327f;
        private int g;

        public static class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public ImageView f71330a;

            public ViewHolder(View view) {
                super(view);
                this.f71330a = (ImageView) view.findViewById(C0906R.id.b61);
            }
        }

        public int getItemCount() {
            return this.f71323b.f71473b;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f71322a, false, 81302, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71322a, false, 81302, new Class[0], Void.TYPE);
                return;
            }
            this.f71326e.dispose();
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71322a, false, 81300, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class)) {
                return (ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71322a, false, 81300, new Class[]{ViewGroup.class, Integer.TYPE}, ViewHolder.class);
            }
            ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ae0, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.g;
            layoutParams.width = this.f71327f;
            imageView.setLayoutParams(layoutParams);
            return new ViewHolder(imageView);
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f71322a, false, 81301, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f71322a, false, 81301, new Class[]{ViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f71324c[i] == null) {
                Pair pair = this.f71324c[0];
                if (pair != null) {
                    viewHolder2.f71330a.setImageBitmap((Bitmap) pair.getSecond());
                } else {
                    viewHolder2.f71330a.setImageBitmap(null);
                }
            } else {
                viewHolder2.f71330a.setImageBitmap((Bitmap) this.f71324c[i].getSecond());
            }
            if (i != 0) {
                getItemCount();
            }
            viewHolder2.f71330a.setPadding(0, 0, 0, 0);
        }

        public Adapter(b bVar, int i, int i2) {
            this(new n(bVar, i, i2, bVar.a()), i, i2);
        }

        public Adapter(n nVar, int i, int i2) {
            this.f71325d = true;
            this.f71323b = nVar;
            this.f71327f = i;
            this.g = i2;
            this.f71324c = new Pair[nVar.f71473b];
            this.f71326e = this.f71323b.a().subscribe((Consumer<? super T>) new Consumer<Pair<Integer, Bitmap>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71328a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Pair pair = (Pair) obj;
                    if (PatchProxy.isSupport(new Object[]{pair}, this, f71328a, false, 81303, new Class[]{Pair.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pair}, this, f71328a, false, 81303, new Class[]{Pair.class}, Void.TYPE);
                        return;
                    }
                    Adapter.this.f71324c[((Integer) pair.getFirst()).intValue()] = pair;
                    if (Adapter.this.f71325d) {
                        Adapter.this.f71325d = false;
                        Adapter.this.notifyDataSetChanged();
                        return;
                    }
                    Adapter.this.notifyItemChanged(((Integer) pair.getFirst()).intValue());
                }
            });
        }
    }

    public int getCoverSize() {
        return this.f71317b;
    }

    public int getFrameHeight() {
        return this.m;
    }

    public int getFrameWidth() {
        return this.l;
    }

    public RecyclerView.Adapter getAdapter() {
        if (!PatchProxy.isSupport(new Object[0], this, f71316a, false, 81297, new Class[0], RecyclerView.Adapter.class)) {
            return this.f71319d.getAdapter();
        }
        return (RecyclerView.Adapter) PatchProxy.accessDispatch(new Object[0], this, f71316a, false, 81297, new Class[0], RecyclerView.Adapter.class);
    }

    public float getOneThumbWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f71316a, false, 81294, new Class[0], Float.TYPE)) {
            return (float) (getMeasuredWidth() / this.f71317b);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f71316a, false, 81294, new Class[0], Float.TYPE)).floatValue();
    }

    public float getOneThumbHeight() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f71316a, false, 81295, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f71316a, false, 81295, new Class[0], Float.TYPE)).floatValue();
        }
        float height = (float) this.f71318c.getHeight();
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(1.0f)}, this, f71316a, false, 81296, new Class[]{Float.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(1.0f)}, this, f71316a, false, 81296, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = UIUtils.dip2Px(getContext(), 1.0f);
        }
        return height - (f2 * 2.0f);
    }

    public void setCoverSize(int i2) {
        this.f71317b = i2;
    }

    public void setOnScrollListener(a aVar) {
        this.n = aVar;
    }

    public ChooseVideoCoverView(@NonNull Context context) {
        this(context, null);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = adapter;
        if (PatchProxy.isSupport(new Object[]{adapter2}, this, f71316a, false, 81284, new Class[]{RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter2}, this, f71316a, false, 81284, new Class[]{RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        this.f71319d.setAdapter(adapter2);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (PatchProxy.isSupport(new Object[]{layoutManager2}, this, f71316a, false, 81283, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutManager2}, this, f71316a, false, 81283, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE);
            return;
        }
        this.f71319d.setLayoutManager(layoutManager2);
    }

    private float b(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81287, new Class[]{Float.TYPE}, Float.TYPE)) {
            return f2 / ((float) (this.f71318c.getWidth() * this.f71317b));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81287, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
    }

    private void c(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81288, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81288, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.a(b(f2));
        }
    }

    private void d(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81289, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81289, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.c(b(f2));
        }
    }

    private void e(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81290, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81290, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.b(b(f2));
        }
    }

    public void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81293, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71316a, false, 81293, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.j.width = (int) (f2 - 0.0f);
        this.h.setLayoutParams(this.j);
        this.k.width = (int) ((((float) getMeasuredWidth()) - f2) + ((float) this.f71318c.getWidth()));
        this.i.setX(((float) this.f71318c.getWidth()) + f2);
        this.i.setLayoutParams(this.k);
    }

    public void setVideoCoverFrameView(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f71316a, false, 81298, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f71316a, false, 81298, new Class[]{Bitmap.class}, Void.TYPE);
        } else if (bitmap2 != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int oneThumbWidth = (int) getOneThumbWidth();
            int oneThumbHeight = (int) getOneThumbHeight();
            int i2 = height * oneThumbWidth;
            int i3 = width * oneThumbHeight;
            if (i2 > i3) {
                oneThumbHeight = i2 / width;
            } else {
                oneThumbWidth = i3 / height;
            }
            this.f71318c.setImageBitmap(Bitmap.createScaledBitmap(bitmap2, oneThumbWidth, oneThumbHeight, true));
        }
    }

    private float a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71316a, false, 81291, new Class[]{MotionEvent.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71316a, false, 81291, new Class[]{MotionEvent.class}, Float.TYPE)).floatValue();
        }
        this.f71321f = (float) ((ViewGroup) getParent()).getPaddingLeft();
        this.g = (float) getPaddingLeft();
        float rawX = (this.g + (motionEvent.getRawX() - this.f71321f)) - ((float) (this.f71318c.getWidth() / 2));
        if (rawX > ((float) (this.f71318c.getWidth() * (this.f71317b - 1)))) {
            rawX = (float) (this.f71318c.getWidth() * (this.f71317b - 1));
        }
        float f2 = 0.0f;
        if (rawX >= 0.0f) {
            f2 = rawX;
        }
        return f2;
    }

    private void b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71316a, false, 81292, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71316a, false, 81292, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        float a2 = a(motionEvent);
        this.f71318c.animate().x(a2).y(this.f71318c.getY()).setDuration(0).start();
        a(a2);
        e(a2);
    }

    public ChooseVideoCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71316a, false, 81282, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71316a, false, 81282, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        VideoCoverFrameView videoCoverFrameView = this.f71318c;
        int i4 = measuredWidth / this.f71317b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), Integer.valueOf(measuredHeight)}, videoCoverFrameView, VideoCoverFrameView.f71393a, false, 81486, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            VideoCoverFrameView videoCoverFrameView2 = videoCoverFrameView;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), Integer.valueOf(measuredHeight)}, videoCoverFrameView2, VideoCoverFrameView.f71393a, false, 81486, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            videoCoverFrameView.f71394b = i4;
            videoCoverFrameView.f71395c = measuredHeight;
            videoCoverFrameView.f71397e = new RectF(videoCoverFrameView.f71396d / 2.0f, videoCoverFrameView.f71396d / 2.0f, ((float) i4) - (videoCoverFrameView.f71396d / 2.0f), ((float) measuredHeight) - (videoCoverFrameView.f71396d / 2.0f));
            videoCoverFrameView.invalidate();
        }
        a(this.f71318c.getX());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f71316a, false, 81286, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f71316a, false, 81286, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        String str = (String) view.getTag();
        if (str == null) {
            return false;
        }
        if (str.equals("tag_VideoCoverFrameView")) {
            switch (motionEvent.getAction()) {
                case 0:
                    c(a(motionEvent));
                    break;
                case 1:
                    d(a(motionEvent));
                    break;
                case 2:
                    b(motionEvent);
                    break;
            }
            return true;
        } else if (!str.equals("tag_RecyclerView")) {
            return super.onTouchEvent(motionEvent);
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    c(a(motionEvent));
                    break;
                case 1:
                    b(motionEvent);
                    d(a(motionEvent));
                    break;
            }
            return true;
        }
    }

    public ChooseVideoCoverView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f71317b = 7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VideoEditView);
            this.l = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
            this.m = Math.round(obtainStyledAttributes.getDimension(4, 0.0f));
        }
        this.f71320e = context;
        if (PatchProxy.isSupport(new Object[0], this, f71316a, false, 81281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71316a, false, 81281, new Class[0], Void.TYPE);
            return;
        }
        this.f71319d = new RecyclerView(this.f71320e);
        this.f71319d.setTag("tag_RecyclerView");
        this.f71319d.setOnTouchListener(this);
        addView(this.f71319d, new FrameLayout.LayoutParams(-1, -1));
        this.f71318c = new VideoCoverFrameView(this.f71320e);
        this.f71318c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f71318c.setColor(this.f71320e.getResources().getColor(C0906R.color.lv));
        this.f71318c.setTag("tag_VideoCoverFrameView");
        this.f71318c.setOnTouchListener(this);
        addView(this.f71318c);
        this.h = new View(this.f71320e);
        this.j = new FrameLayout.LayoutParams(-1, -1);
        this.h.setBackgroundResource(2130837848);
        this.i = new View(this.f71320e);
        this.k = new FrameLayout.LayoutParams(-1, -1);
        this.i.setBackgroundResource(2130837848);
    }
}
