package com.bytedance.android.livesdk.feed;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.feed.BaseFeedRoomPlayComponent;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.android.livesdk.feed.live.CommonLiveViewHolder;
import com.bytedance.android.livesdk.feed.ui.FeedItemDecoration2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LiveFeedRoomPlayComponent extends BaseFeedRoomPlayComponent {
    public static ChangeQuickRedirect q;
    public String r;
    public BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener s;
    public BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener t;
    private boolean u;
    private long v;

    class LargePerspectiveWindowScrollListener extends BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener {
        public static ChangeQuickRedirect h;

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8457, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8457, new Class[0], Void.TYPE);
                return;
            }
            LiveFeedRoomPlayComponent.this.f();
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8450, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8450, new Class[0], Void.TYPE);
            } else if (LiveFeedRoomPlayComponent.this.f1851c != null) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = LiveFeedRoomPlayComponent.this.f1851c.findViewHolderForAdapterPosition(this.f13925b);
                if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof CommonLiveViewHolder)) {
                    ((CommonLiveViewHolder) findViewHolderForAdapterPosition).f();
                }
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8455, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8455, new Class[0], Void.TYPE);
                return;
            }
            View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(this.f13925b);
            if (findViewByPosition == null || findViewByPosition.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f1851c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.f();
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LiveFeedRoomPlayComponent.this.g.getLayoutParams();
            marginLayoutParams.topMargin = (findViewByPosition.getBottom() - marginLayoutParams.height) + ((View) LiveFeedRoomPlayComponent.this.f1851c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = LiveFeedRoomPlayComponent.this.f1851c.getPaddingRight() + ac.a(FeedItemDecoration2.a());
            LiveFeedRoomPlayComponent.this.g.setLayoutParams(marginLayoutParams);
        }

        public final int[] c() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8454, new Class[0], int[].class)) {
                return (int[]) PatchProxy.accessDispatch(new Object[0], this, h, false, 8454, new Class[0], int[].class);
            }
            int[] iArr = {-1, -1};
            if (LiveFeedRoomPlayComponent.this.f1851c == null) {
                return iArr;
            }
            int findFirstVisibleItemPosition = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager()).findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager()).findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) {
                return iArr;
            }
            int height = LiveFeedRoomPlayComponent.this.f1851c.getHeight();
            while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(findFirstVisibleItemPosition);
                float bottom = ((float) (findViewByPosition.getBottom() - findViewByPosition.getTop())) * 0.7f;
                int i2 = (int) (((float) height) - bottom);
                if (findViewByPosition.getTop() > 0 && findViewByPosition.getTop() <= i2) {
                    FeedItem c2 = LiveFeedRoomPlayComponent.this.f1853e.c(findFirstVisibleItemPosition);
                    if (c2 != null && c2.type == 1) {
                        iArr[1] = findFirstVisibleItemPosition;
                    }
                }
                if (findViewByPosition.getBottom() > 0 && ((float) findViewByPosition.getBottom()) < bottom) {
                    iArr[0] = findFirstVisibleItemPosition;
                }
                findFirstVisibleItemPosition++;
            }
            return iArr;
        }

        LargePerspectiveWindowScrollListener() {
            super();
        }

        public final int a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 8451, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 8451, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
            } else if (LiveFeedRoomPlayComponent.this.f1851c == null) {
                return -1;
            } else {
                int findFirstVisibleItemPosition = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager()).findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = ((GridLayoutManager) LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager()).findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1) {
                    return -1;
                }
                int height = LiveFeedRoomPlayComponent.this.f1851c.getHeight() / 2;
                while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(findFirstVisibleItemPosition);
                    if (findViewByPosition.getTop() <= height && findViewByPosition.getBottom() >= height) {
                        return findFirstVisibleItemPosition;
                    }
                    if (findViewByPosition.getTop() > height) {
                        int i2 = findFirstVisibleItemPosition - 1;
                        if (i2 >= 0) {
                            View findViewByPosition2 = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(i2);
                            if (findViewByPosition2 != null && findViewByPosition.getTop() - height >= height - findViewByPosition2.getBottom()) {
                                return i2;
                            }
                            return findFirstVisibleItemPosition;
                        }
                    }
                    findFirstVisibleItemPosition++;
                }
                return -1;
            }
        }

        private void c(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 8453, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 8453, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 != -1) {
                int i3 = i2;
                while (i3 > 0) {
                    i3--;
                    FeedItem c2 = LiveFeedRoomPlayComponent.this.f1853e.c(i3);
                    if (c2 != null && c2.type == 1) {
                        Room room = (Room) c2.item;
                        if (this.f13927d.get(Long.valueOf(room.getId())) == null && this.f13928e.get(Long.valueOf(room.getId())) == null) {
                            this.f13928e.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                            HashMap hashMap = new HashMap();
                            if (c.c() || c.d()) {
                                hashMap.put("enter_from_merge", "live_" + LiveFeedRoomPlayComponent.this.r);
                            } else {
                                hashMap.put("enter_from_merge", "live_merge");
                            }
                            hashMap.put("enter_method", "live_cover");
                            hashMap.put("log_pb", room.getLog_pb());
                            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                            hashMap.put("request_id", room.getRequestId());
                            hashMap.put("room_id", String.valueOf(room.getId()));
                            hashMap.put("show_type", "streak");
                            hashMap.put("event_belong", "live_view");
                            hashMap.put("event_page", "live");
                            hashMap.put("event_type", "core");
                            hashMap.put("event_module", LiveFeedRoomPlayComponent.this.r);
                            b.a().a("live_cover_show", hashMap);
                        }
                    }
                }
            }
        }

        public final void a(int[] iArr) {
            if (PatchProxy.isSupport(new Object[]{iArr}, this, h, false, 8452, new Class[]{int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iArr}, this, h, false, 8452, new Class[]{int[].class}, Void.TYPE);
                return;
            }
            super.a(iArr);
            FeedItem c2 = LiveFeedRoomPlayComponent.this.f1853e.c(iArr[1]);
            if (c2 != null && c2.type == 1) {
                Room room = (Room) c2.item;
                if (this.f13927d.get(Long.valueOf(room.getId())) == null) {
                    this.f13927d.put(Long.valueOf(room.getId()), Long.valueOf(System.currentTimeMillis()));
                    HashMap hashMap = new HashMap();
                    if (c.c() || c.d()) {
                        hashMap.put("enter_from_merge", "live_" + LiveFeedRoomPlayComponent.this.r);
                    } else {
                        hashMap.put("enter_from_merge", "live_merge");
                    }
                    hashMap.put("enter_method", "live_cover");
                    hashMap.put("log_pb", room.getLog_pb());
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                    hashMap.put("request_id", room.getRequestId());
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    hashMap.put("show_type", "stay");
                    hashMap.put("event_belong", "live_view");
                    hashMap.put("event_page", "live");
                    hashMap.put("event_type", "core");
                    hashMap.put("action_type", LiveFeedRoomPlayComponent.this.r);
                    b.a().a("live_cover_show", hashMap);
                    c(iArr[1]);
                }
            }
        }

        public final void a(int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8456, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8456, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i2 == 0 || i3 == 0) {
                LiveFeedRoomPlayComponent.this.g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.f();
            } else {
                View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(this.f13925b);
                if (findViewByPosition != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) LiveFeedRoomPlayComponent.this.g.getLayoutParams();
                    if (i2 > i3) {
                        layoutParams.width = (int) (((float) findViewByPosition.getWidth()) * 0.8f);
                        layoutParams.height = (int) (((((float) layoutParams.width) * 1.0f) * ((float) i3)) / ((float) i2));
                    } else {
                        layoutParams.height = (int) (((float) findViewByPosition.getHeight()) * 0.8f);
                        layoutParams.width = (int) (((((float) layoutParams.height) * 1.0f) * ((float) i2)) / ((float) i3));
                    }
                    LiveFeedRoomPlayComponent.this.g.setLayoutParams(layoutParams);
                }
            }
        }
    }

    class SmallPerspectiveWindowScrollListener extends BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener {
        public static ChangeQuickRedirect h;
        private Random j = new Random();
        private final List<Integer> k = new ArrayList();
        private final List<Integer> l = new ArrayList();
        private Handler m = new Handler(Looper.getMainLooper()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f13934a;

            public final void handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f13934a, false, 8467, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f13934a, false, 8467, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                super.handleMessage(message);
                if (LiveFeedRoomPlayComponent.this.m) {
                    int a2 = SmallPerspectiveWindowScrollListener.this.a(false);
                    if (a2 == -1) {
                        a2 = SmallPerspectiveWindowScrollListener.this.a(true);
                    }
                    SmallPerspectiveWindowScrollListener.this.b(a2);
                }
            }
        };

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8459, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8459, new Class[0], Void.TYPE);
                return;
            }
            super.a();
            this.k.clear();
            this.l.clear();
            this.m.removeCallbacksAndMessages(null);
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8466, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8466, new Class[0], Void.TYPE);
                return;
            }
            LiveFeedRoomPlayComponent.this.f();
        }

        public final void g() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8465, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8465, new Class[0], Void.TYPE);
                return;
            }
            this.m.removeCallbacksAndMessages(null);
            this.m.sendEmptyMessageDelayed(0, 10000);
        }

        private void i() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8462, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8462, new Class[0], Void.TYPE);
            } else if (Lists.isEmpty(this.k)) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager();
                int childCount = gridLayoutManager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = gridLayoutManager.getChildAt(i2);
                    if (gridLayoutManager.isViewPartiallyVisible(childAt, true, true)) {
                        int childAdapterPosition = LiveFeedRoomPlayComponent.this.f1851c.getChildAdapterPosition(childAt);
                        FeedItem c2 = LiveFeedRoomPlayComponent.this.f1853e.c(childAdapterPosition);
                        if (c2 != null && c2.type == 1) {
                            this.k.add(Integer.valueOf(childAdapterPosition));
                        }
                    }
                }
            }
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8463, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8463, new Class[0], Void.TYPE);
            } else if (LiveFeedRoomPlayComponent.this.f1851c != null) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = LiveFeedRoomPlayComponent.this.f1851c.findViewHolderForAdapterPosition(this.f13925b);
                if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof CommonLiveViewHolder)) {
                    ((CommonLiveViewHolder) findViewHolderForAdapterPosition).f();
                }
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 8461, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 8461, new Class[0], Void.TYPE);
                return;
            }
            View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(this.f13925b);
            if (findViewByPosition == null || findViewByPosition.getBottom() <= 0 || LiveFeedRoomPlayComponent.this.f1851c.getParent() == null) {
                LiveFeedRoomPlayComponent.this.g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.f();
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LiveFeedRoomPlayComponent.this.g.getLayoutParams();
            marginLayoutParams.topMargin = findViewByPosition.getTop() + ((View) LiveFeedRoomPlayComponent.this.f1851c.getParent()).getPaddingTop();
            marginLayoutParams.rightMargin = (((((View) LiveFeedRoomPlayComponent.this.f1851c.getParent()).getWidth() - findViewByPosition.getLeft()) - findViewByPosition.getWidth()) - LiveFeedRoomPlayComponent.this.f1851c.getPaddingLeft()) + LiveFeedRoomPlayComponent.this.f1851c.getPaddingRight();
            LiveFeedRoomPlayComponent.this.g.setLayoutParams(marginLayoutParams);
        }

        SmallPerspectiveWindowScrollListener() {
            super();
        }

        public final int a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 8464, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 8464, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
            } else if (LiveFeedRoomPlayComponent.this.f1851c == null) {
                return -1;
            } else {
                if (Lists.isEmpty(this.k)) {
                    i();
                }
                if (Lists.isEmpty(this.l)) {
                    this.l.addAll(this.k);
                }
                if (this.l.contains(Integer.valueOf(this.f13925b))) {
                    this.l.remove(Integer.valueOf(this.f13925b));
                    if (z) {
                        return this.f13925b;
                    }
                }
                while (this.l.size() > 0) {
                    Integer remove = this.l.remove(this.j.nextInt(this.l.size()));
                    Room a2 = a(remove.intValue());
                    if (a2 != null && a2.getMosaicStatus() == 0 && !a2.isLiveTypeAudio() && a2.getStatus() == 2) {
                        return remove.intValue();
                    }
                }
                return -1;
            }
        }

        public final void a(int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8460, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8460, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i2 == 0 || i3 == 0) {
                LiveFeedRoomPlayComponent.this.g.setVisibility(4);
                LiveFeedRoomPlayComponent.this.f();
            } else {
                View findViewByPosition = LiveFeedRoomPlayComponent.this.f1851c.getLayoutManager().findViewByPosition(this.f13925b);
                if (findViewByPosition != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) LiveFeedRoomPlayComponent.this.g.getLayoutParams();
                    layoutParams.height = findViewByPosition.getHeight();
                    layoutParams.width = findViewByPosition.getWidth();
                    LiveFeedRoomPlayComponent.this.g.setLayoutParams(layoutParams);
                }
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8458, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, h, false, 8458, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i2, i3);
            this.k.clear();
            this.l.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 8444, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, q, false, 8444, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.u) {
            return ((Boolean) com.bytedance.android.livesdk.feed.j.b.f14214e.a()).booleanValue();
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener c() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 8446, new Class[0], BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener.class)) {
            return (BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener) PatchProxy.accessDispatch(new Object[0], this, q, false, 8446, new Class[0], BaseFeedRoomPlayComponent.IPerspectiveWindowScrollListener.class);
        } else if (this.u) {
            if (this.s == null) {
                this.s = new SmallPerspectiveWindowScrollListener();
            }
            return this.s;
        } else {
            if (this.t == null) {
                this.t = new LargePerspectiveWindowScrollListener();
            }
            return this.t;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 8447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 8447, new Class[0], Void.TYPE);
        } else if (this.v >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            if (FeedLiveFragment.C != null) {
                this.r = FeedLiveFragment.C.h;
            }
            if (c.c() || c.d()) {
                hashMap.put("enter_from_merge", "live_" + this.r);
            } else {
                hashMap.put("enter_from_merge", "live_merge");
            }
            hashMap.put("enter_method", "live_cover");
            hashMap.put("event_module", this.r);
            if (!(this.l == null || this.l.e() == null)) {
                Room e2 = this.l.e();
                hashMap.put("log_pb", e2.getLog_pb());
                hashMap.put("anchor_id", String.valueOf(e2.getOwnerUserId()));
                hashMap.put("request_id", e2.getRequestId());
                hashMap.put("room_id", String.valueOf(e2.getId()));
            }
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.v));
            b.a().a("live_window_duration", hashMap);
            this.v = -1;
        }
    }

    public LiveFeedRoomPlayComponent(BaseFeedRoomPlayComponent.a aVar) {
        super(aVar);
        this.r = aVar.i();
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, q, false, 8443, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, q, false, 8443, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.u = z;
        super.a();
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, q, false, 8445, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, q, false, 8445, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, q, false, 8448, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, q, false, 8448, new Class[0], Void.TYPE);
            } else {
                this.v = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                if (FeedLiveFragment.C != null) {
                    this.r = FeedLiveFragment.C.h;
                }
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + this.r);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("event_module", this.r);
                if (!(this.l == null || this.l.e() == null)) {
                    Room e2 = this.l.e();
                    hashMap.put("log_pb", e2.getLog_pb());
                    hashMap.put("anchor_id", String.valueOf(e2.getOwnerUserId()));
                    hashMap.put("request_id", e2.getRequestId());
                    hashMap.put("room_id", String.valueOf(e2.getId()));
                }
                b.a().a("live_window_show", hashMap);
            }
        } else {
            f();
        }
    }
}
