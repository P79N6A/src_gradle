package com.ss.android.ugc.aweme.choosemusic.view;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class PreloadRecyclerViewConverter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36029a;

    /* renamed from: b  reason: collision with root package name */
    public int f36030b;

    /* renamed from: c  reason: collision with root package name */
    int f36031c;

    /* renamed from: d  reason: collision with root package name */
    int f36032d;

    /* renamed from: e  reason: collision with root package name */
    int f36033e;

    /* renamed from: f  reason: collision with root package name */
    public int f36034f;
    public int g;
    private a h;
    private int i;
    private boolean j = true;

    class RVScrollListener extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36035a;

        private RVScrollListener() {
        }

        /* synthetic */ RVScrollListener(PreloadRecyclerViewConverter preloadRecyclerViewConverter, byte b2) {
            this();
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36035a, false, 26861, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36035a, false, 26861, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            PreloadRecyclerViewConverter.this.b(recyclerView2);
        }
    }

    public interface a {
        void a(int i, int i2);
    }

    @TargetApi(23)
    class b implements View.OnScrollChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36037a;

        private b() {
        }

        /* synthetic */ b(PreloadRecyclerViewConverter preloadRecyclerViewConverter, byte b2) {
            this();
        }

        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f36037a, false, 26860, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f36037a, false, 26860, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (view2 instanceof RecyclerView) {
                PreloadRecyclerViewConverter.this.b((RecyclerView) view2);
            }
        }
    }

    public final void a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f36029a, false, 26858, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f36029a, false, 26858, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 23) {
            recyclerView.setOnScrollChangeListener(new b(this, (byte) 0));
        } else {
            recyclerView.setOnScrollListener(new RVScrollListener(this, (byte) 0));
        }
    }

    public final void b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f36029a, false, 26859, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f36029a, false, 26859, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f36032d = recyclerView.getChildCount();
        this.f36033e = linearLayoutManager.getItemCount();
        this.f36031c = linearLayoutManager.findFirstVisibleItemPosition();
        if (this.f36033e < this.f36030b) {
            this.g = this.f36034f;
            this.f36030b = this.f36033e;
            if (this.f36033e == 0) {
                this.j = true;
            }
        }
        if (this.j && this.f36033e > this.f36030b) {
            this.j = false;
            this.f36030b = this.f36033e;
            this.g++;
        }
        if (!this.j && this.f36033e - this.f36032d <= this.f36031c + this.i) {
            if (this.h != null) {
                this.h.a(this.g + 1, this.f36033e);
            }
            this.j = true;
        }
    }

    public PreloadRecyclerViewConverter(a aVar, int i2) {
        this.h = aVar;
        this.i = i2;
    }
}
