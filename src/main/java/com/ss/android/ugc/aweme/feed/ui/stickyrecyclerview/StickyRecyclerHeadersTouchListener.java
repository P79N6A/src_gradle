package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StickyRecyclerHeadersTouchListener implements RecyclerView.OnItemTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46907a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f46908b;

    /* renamed from: c  reason: collision with root package name */
    public final StickyRecyclerHeadersDecoration f46909c;

    /* renamed from: d  reason: collision with root package name */
    public a f46910d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f46911e;

    public interface a {
    }

    class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46912a;

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        private b() {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            c cVar;
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f46912a, false, 43567, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f46912a, false, 43567, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            int a2 = StickyRecyclerHeadersTouchListener.this.f46909c.a((int) motionEvent.getX(), (int) motionEvent.getY());
            if (a2 == -1) {
                return false;
            }
            View a3 = StickyRecyclerHeadersTouchListener.this.f46909c.a(StickyRecyclerHeadersTouchListener.this.f46908b, a2);
            StickyRecyclerHeadersTouchListener stickyRecyclerHeadersTouchListener = StickyRecyclerHeadersTouchListener.this;
            if (PatchProxy.isSupport(new Object[0], stickyRecyclerHeadersTouchListener, StickyRecyclerHeadersTouchListener.f46907a, false, 43565, new Class[0], c.class)) {
                cVar = (c) PatchProxy.accessDispatch(new Object[0], stickyRecyclerHeadersTouchListener, StickyRecyclerHeadersTouchListener.f46907a, false, 43565, new Class[0], c.class);
            } else if (stickyRecyclerHeadersTouchListener.f46908b.getAdapter() instanceof c) {
                cVar = (c) stickyRecyclerHeadersTouchListener.f46908b.getAdapter();
            } else {
                throw new IllegalStateException("A RecyclerView with " + StickyRecyclerHeadersTouchListener.class.getSimpleName() + " requires a " + c.class.getSimpleName());
            }
            cVar.a(a2);
            StickyRecyclerHeadersTouchListener.this.f46908b.playSoundEffect(0);
            a3.onTouchEvent(motionEvent2);
            return true;
        }

        /* synthetic */ b(StickyRecyclerHeadersTouchListener stickyRecyclerHeadersTouchListener, byte b2) {
            this();
        }
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public StickyRecyclerHeadersTouchListener(RecyclerView recyclerView, StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration) {
        this.f46911e = new GestureDetector(recyclerView.getContext(), new b(this, (byte) 0));
        this.f46908b = recyclerView;
        this.f46909c = stickyRecyclerHeadersDecoration;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, motionEvent}, this, f46907a, false, 43566, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, motionEvent}, this, f46907a, false, 43566, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f46910d != null) {
            if (this.f46911e.onTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() != 0 || this.f46909c.a((int) motionEvent.getX(), (int) motionEvent.getY()) == -1) {
                return false;
            }
            return true;
        }
        return false;
    }
}
