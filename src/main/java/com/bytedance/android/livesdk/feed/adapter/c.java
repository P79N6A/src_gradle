package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout;
import com.bytedance.android.livesdk.feed.j;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13952a;

    /* renamed from: b  reason: collision with root package name */
    public BaseFeedAdapter f13953b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f13954c;

    /* renamed from: d  reason: collision with root package name */
    public BaseFeedDataViewModel f13955d;

    /* renamed from: e  reason: collision with root package name */
    public RecyclerView.LayoutManager f13956e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.ItemDecoration f13957f;
    public LifecycleOwner g;
    public j h;
    public boolean i;
    public b j;
    public BannerSwipeRefreshLayout.a k;
    public Bundle l;
    boolean m;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13960a;

        /* renamed from: b  reason: collision with root package name */
        public BaseFeedAdapter f13961b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView f13962c;

        /* renamed from: d  reason: collision with root package name */
        public BaseFeedDataViewModel f13963d;

        /* renamed from: e  reason: collision with root package name */
        public RecyclerView.LayoutManager f13964e;

        /* renamed from: f  reason: collision with root package name */
        public int f13965f = 2;
        public RecyclerView.ItemDecoration g;
        public LifecycleOwner h;
        public boolean i;
        public j j;
        public b k;
        public BannerSwipeRefreshLayout.a l;
        public Bundle m;

        public a() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f13965f, 1);
            staggeredGridLayoutManager.setGapStrategy(0);
            this.f13964e = staggeredGridLayoutManager;
        }
    }

    public interface b {
        void a(FeedItem feedItem);
    }

    private c() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(BaseFeedRepository.a aVar) {
        if (aVar == BaseFeedRepository.a.START) {
            BaseFeedAdapter baseFeedAdapter = this.f13953b;
            if (PatchProxy.isSupport(new Object[0], baseFeedAdapter, BaseFeedAdapter.o, false, 8478, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], baseFeedAdapter, BaseFeedAdapter.o, false, 8478, new Class[0], Void.TYPE);
            } else {
                Map<String, Long> map = baseFeedAdapter.r;
                if (map != null) {
                    map.size();
                }
            }
        }
        if (aVar == BaseFeedRepository.a.SUCCESS) {
            BaseFeedAdapter baseFeedAdapter2 = this.f13953b;
            if (PatchProxy.isSupport(new Object[0], baseFeedAdapter2, BaseFeedAdapter.o, false, 8479, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], baseFeedAdapter2, BaseFeedAdapter.o, false, 8479, new Class[0], Void.TYPE);
            } else {
                baseFeedAdapter2.a(baseFeedAdapter2.r, false);
            }
            this.f13954c.scrollToPosition(0);
        }
    }

    private c(LifecycleOwner lifecycleOwner, BaseFeedAdapter baseFeedAdapter, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel) {
        this.g = lifecycleOwner;
        this.f13953b = baseFeedAdapter;
        this.f13954c = recyclerView;
        this.f13955d = baseFeedDataViewModel;
    }

    public /* synthetic */ c(LifecycleOwner lifecycleOwner, BaseFeedAdapter baseFeedAdapter, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel, byte b2) {
        this(lifecycleOwner, baseFeedAdapter, recyclerView, baseFeedDataViewModel);
    }
}
