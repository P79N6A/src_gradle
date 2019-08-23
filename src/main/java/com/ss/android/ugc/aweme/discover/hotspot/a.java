package com.ss.android.ugc.aweme.discover.hotspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.feed.c.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0014J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0014J\"\u0010\u0018\u001a\u00020\u00142\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0004H\u0016J\u001c\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0004J\b\u0010\"\u001a\u00020\u0014H\u0014J\b\u0010#\u001a\u00020\u0014H\u0014J\u000e\u0010\t\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailFragmentPanel;", "Lcom/ss/android/ugc/aweme/detail/panel/DetailFragmentPanel;", "()V", "mIsPauseBeforeHotSpotDialogShow", "", "getMIsPauseBeforeHotSpotDialogShow", "()Z", "setMIsPauseBeforeHotSpotDialogShow", "(Z)V", "toIndex", "", "getToIndex", "()I", "setToIndex", "(I)V", "getCurrentIndex", "list", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mobScroll", "", "pageChangeDown", "fromAweme", "toAweme", "onRefreshResult", "", "hasMore", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pauseVideoWhenHotSpotDialogShow", "isShowing", "showDetailFragment", "showDetailSeekBarFragment", "index", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends DetailFragmentPanel {
    public static ChangeQuickRedirect r;
    public int s;
    public boolean t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailFragmentPanel$showDetailSeekBarFragment$1", "Lcom/ss/android/ugc/aweme/feed/ui/seekbar/detailvideo/DispatchTouchEventLinearLayout$DispatchTouchEventCallBack;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.discover.hotspot.a$a  reason: collision with other inner class name */
    public static final class C0540a implements DispatchTouchEventLinearLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42423a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f42424b;

        C0540a(a aVar) {
            this.f42424b = aVar;
        }

        public final boolean a(@Nullable KeyEvent keyEvent) {
            KeyEvent keyEvent2 = keyEvent;
            if (!PatchProxy.isSupport(new Object[]{keyEvent2}, this, f42423a, false, 36436, new Class[]{KeyEvent.class}, Boolean.TYPE)) {
                return this.f42424b.ar.dispatchKeyEvent(keyEvent2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{keyEvent2}, this, f42423a, false, 36436, new Class[]{KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }

        public final boolean a(@Nullable MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f42423a, false, 36435, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f42423a, false, 36435, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Fragment fragment = this.f42424b.as;
            Intrinsics.checkExpressionValueIsNotNull(fragment, "fragment");
            LinearLayout linearLayout = (LinearLayout) fragment.getView().findViewById(C0906R.id.cti);
            if (linearLayout != null) {
                return linearLayout.dispatchTouchEvent(motionEvent2);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final void p() {
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 36431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 36431, new Class[0], Void.TYPE);
            return;
        }
        super.q();
        this.f3002e.f46875d = new C0540a(this);
        if (com.ss.android.ugc.aweme.discover.hotspot.b.a.f42443b.a()) {
            this.f3002e.h = true;
        }
    }

    public final int a(@Nullable List<Aweme> list) {
        return this.s;
    }

    public final void h(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 36432, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, r, false, 36432, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            n nVar = this.U;
            Intrinsics.checkExpressionValueIsNotNull(nVar, "mPlayerController");
            com.ss.android.ugc.aweme.feed.b.a aVar = nVar.j;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "mPlayerController.playStateHelper");
            if (aVar.f45077a != 3) {
                z2 = false;
            }
            this.t = z2;
            aK();
        } else {
            if (!this.t) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, DetailFragmentPanel.w, "resume play by comment dialog dismiss");
                v();
            }
        }
    }

    public final void a(@Nullable View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 36430, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 36430, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
    }

    public final void a(@Nullable List<Object> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, r, false, 36433, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, r, false, 36433, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a((List) list, z);
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.mRefreshLayout;
        Intrinsics.checkExpressionValueIsNotNull(feedSwipeRefreshLayout, "mRefreshLayout");
        feedSwipeRefreshLayout.setRefreshing(false);
    }

    public final void a(boolean z, @Nullable Aweme aweme, @Nullable Aweme aweme2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme, aweme2}, this, r, false, 36434, new Class[]{Boolean.TYPE, Aweme.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme, aweme2}, this, r, false, 36434, new Class[]{Boolean.TYPE, Aweme.class, Aweme.class}, Void.TYPE);
            return;
        }
        super.a(z, aweme, aweme2);
        if (z) {
            SpotChangeCallBack.a aVar = SpotChangeCallBack.f42414d;
            Activity activity = this.ar;
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            r.a("trending_slide_down", (Map) aVar.b(activity));
        }
    }
}
