package com.ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40575a;

    /* renamed from: b  reason: collision with root package name */
    public View f40576b;

    /* renamed from: c  reason: collision with root package name */
    public a f40577c;

    /* renamed from: d  reason: collision with root package name */
    private int f40578d = Build.VERSION.SDK_INT;

    public interface a {
        View f();
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f40575a, false, 33950, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40575a, false, 33950, new Class[0], Boolean.TYPE)).booleanValue();
        }
        View b2 = b();
        if (b2 == null) {
            return false;
        }
        if (b2 instanceof AdapterView) {
            return a((AdapterView) b2);
        }
        if (b2 instanceof ScrollView) {
            return a((ScrollView) b2);
        }
        if (b2 instanceof EnterpriseRecyclerView) {
            return ((EnterpriseRecyclerView) b2).getEnterTabManager().f39418a;
        }
        if (b2 instanceof RecyclerView) {
            return a((RecyclerView) b2);
        }
        if (b2 instanceof WebView) {
            return a((WebView) b2);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    private View b() {
        if (PatchProxy.isSupport(new Object[0], this, f40575a, false, 33949, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f40575a, false, 33949, new Class[0], View.class);
        } else if (this.f40577c == null) {
            return this.f40576b;
        } else {
            return this.f40577c.f();
        }
    }

    private static boolean a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, null, f40575a, true, 33951, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2}, null, f40575a, true, 33951, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
        }
        if (recyclerView2 != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                View childAt = recyclerView2.getChildAt(0);
                if (childAt == null) {
                    return true;
                }
                if (findFirstVisibleItemPosition != 0 || childAt.getTop() < ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean a(WebView webView) {
        if (PatchProxy.isSupport(new Object[]{webView}, null, f40575a, true, 33954, new Class[]{WebView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView}, null, f40575a, true, 33954, new Class[]{WebView.class}, Boolean.TYPE)).booleanValue();
        } else if (webView == null || webView.getScrollY() > 0) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean a(AdapterView adapterView) {
        AdapterView adapterView2 = adapterView;
        if (PatchProxy.isSupport(new Object[]{adapterView2}, null, f40575a, true, 33952, new Class[]{AdapterView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{adapterView2}, null, f40575a, true, 33952, new Class[]{AdapterView.class}, Boolean.TYPE)).booleanValue();
        }
        if (adapterView2 != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView2.getChildAt(0);
            if (childAt == null || (firstVisiblePosition == 0 && childAt != null && childAt.getTop() == 0)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(ScrollView scrollView) {
        if (PatchProxy.isSupport(new Object[]{scrollView}, null, f40575a, true, 33953, new Class[]{ScrollView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scrollView}, null, f40575a, true, 33953, new Class[]{ScrollView.class}, Boolean.TYPE)).booleanValue();
        } else if (scrollView == null || scrollView.getScrollY() > 0) {
            return false;
        } else {
            return true;
        }
    }

    @SuppressLint({"NewApi"})
    public final void a(int i, int i2, int i3) {
        int i4 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40575a, false, 33955, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40575a, false, 33955, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        View b2 = b();
        if (b2 instanceof AbsListView) {
            AbsListView absListView = (AbsListView) b2;
            if (this.f40578d >= 21) {
                absListView.fling(i4);
            } else {
                absListView.smoothScrollBy(i2, i3);
            }
        } else {
            if (b2 instanceof ScrollView) {
                ((ScrollView) b2).fling(i4);
            } else if (b2 instanceof RecyclerView) {
                ((RecyclerView) b2).fling(0, i4);
            } else if (b2 instanceof WebView) {
                ((WebView) b2).flingScroll(0, i4);
            }
        }
    }
}
