package com.ss.android.ugc.aweme.story.feed.jedi;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolderViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u001d\u0018\u0000 =2\u00020\u0001:\u0002=>B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bJ\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020$J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020!H\u0002J\u0010\u00101\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002J\b\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u0010/\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u00020$H\u0002J\u0010\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020)H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u0010/\u001a\u00020\u0012H\u0002J\u000e\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u0012J\b\u0010:\u001a\u00020\u0012H\u0002J\b\u0010;\u001a\u00020\u0012H\u0002J\u0010\u0010<\u001a\u00020$2\u0006\u0010/\u001a\u00020\u0012H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2;", "Lcom/ss/android/ugc/aweme/story/base/jedi/SSViewPager2;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "curViewHolder", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "getCurViewHolder", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "mDownTime", "", "mGestureDetector", "Landroid/view/GestureDetector;", "mIsCleanMode", "", "mIsScrolling", "mLastToastShowTime", "mLongPressHandler", "Landroid/os/Handler;", "mLongPressRunnable", "Ljava/lang/Runnable;", "mOnMotionEventChangeListeners", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$OnMotionEventChangeListener;", "mOnPageChangeListener", "com/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$mOnPageChangeListener$1", "Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$mOnPageChangeListener$1;", "mShowingPopupWindow", "mStartX", "", "mStartY", "addOnMotionEventChangeListener", "", "onMotionEventChangeListener", "addOnPageChange", "dragFinish", "event", "Landroid/view/MotionEvent;", "forceCallOnPageSelected", "getChildDrawingOrder", "childCount", "i", "isEnd", "isNext", "x", "isStart", "onCleanMode", "onDown", "onSwipeUp", "onTouchEvent", "ev", "onUp", "setShowingPopupWindow", "showingPopupWindow", "shouldDoLoadMore", "shouldDoPreLoadMore", "switchItem", "Companion", "OnMotionEventChangeListener", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ParentViewPager2 extends com.ss.android.ugc.aweme.story.base.jedi.c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72505b;
    public static final a i = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f72506c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f72507d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f72508e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f72509f;
    ArrayList<b> g;
    public final e h;
    private float m;
    private float n;
    private long o;
    private long p;
    private boolean q;
    private final GestureDetector r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$Companion;", "", "()V", "LONG_PRESS_TIME", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$OnMotionEventChangeListener;", "", "onCancel", "", "onCleanMode", "onMotionDown", "isNext", "", "onMotionUp", "onSwtichItem", "onWipeUp", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(boolean z);

        void b();

        void b(boolean z);

        void c();

        void c(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ParentViewPager2 f72513b;

        c(ParentViewPager2 parentViewPager2) {
            this.f72513b = parentViewPager2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72512a, false, 83243, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72512a, false, 83243, new Class[0], Void.TYPE);
                return;
            }
            this.f72513b.h.a(this.f72513b.getCurrentItem());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ParentViewPager2 f72515b;

        d(ParentViewPager2 parentViewPager2) {
            this.f72515b = parentViewPager2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72514a, false, 83244, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72514a, false, 83244, new Class[0], Void.TYPE);
                return;
            }
            ParentViewPager2 parentViewPager2 = this.f72515b;
            if (PatchProxy.isSupport(new Object[0], parentViewPager2, ParentViewPager2.f72505b, false, 83235, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], parentViewPager2, ParentViewPager2.f72505b, false, 83235, new Class[0], Void.TYPE);
                return;
            }
            if (!parentViewPager2.f72506c) {
                ArrayList<b> arrayList = parentViewPager2.g;
                if (arrayList != null) {
                    Iterator<b> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
                parentViewPager2.f72506c = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J \u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$mOnPageChangeListener$1", "Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "mCurIndex", "", "mPageChangeDown", "", "mSelectedPage", "getMSelectedPage", "()I", "setMSelectedPage", "(I)V", "shouldDoUnselected", "getShouldDoUnselected", "()Z", "setShouldDoUnselected", "(Z)V", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e extends ViewPager2.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72516a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f72517b;

        /* renamed from: c  reason: collision with root package name */
        public int f72518c = -1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f72519d = true;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ParentViewPager2 f72520e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f72521f;
        private int g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72522a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f72523b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f72524c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f72525d;

            a(e eVar, int i, int i2) {
                this.f72523b = eVar;
                this.f72524c = i;
                this.f72525d = i2;
            }

            public final void run() {
                Integer num;
                if (PatchProxy.isSupport(new Object[0], this, f72522a, false, 83247, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72522a, false, 83247, new Class[0], Void.TYPE);
                    return;
                }
                RecyclerView recyclerView = this.f72523b.f72520e.getRecyclerView();
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    Intrinsics.checkExpressionValueIsNotNull(layoutManager, "recyclerView.layoutManager ?: return@postDelayed");
                    StringBuilder sb = new StringBuilder("onPageSelected()2 called with: position = [");
                    sb.append(this.f72524c);
                    sb.append(']');
                    sb.append("count:");
                    RecyclerView recyclerView2 = this.f72523b.f72520e.getRecyclerView();
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recyclerView");
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 != null) {
                        num = Integer.valueOf(layoutManager2.getChildCount());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    int childCount = layoutManager.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        RecyclerView.ViewHolder a2 = b.a(this.f72523b.f72520e, i);
                        if (!(a2 instanceof StoryMainHolder2)) {
                            a2 = null;
                        }
                        StoryMainHolder2 storyMainHolder2 = (StoryMainHolder2) a2;
                        if (storyMainHolder2 != null) {
                            RecyclerView.Adapter adapter = this.f72523b.f72520e.getAdapter();
                            if (adapter != null) {
                                StoryMainRawPagerAdapter2 storyMainRawPagerAdapter2 = (StoryMainRawPagerAdapter2) adapter;
                                if (!this.f72523b.f72519d || !g.f72503b.a((UserStory) storyMainRawPagerAdapter2.b(this.f72525d), storyMainHolder2.p())) {
                                    g.f72503b.a((UserStory) storyMainRawPagerAdapter2.b(this.f72524c), storyMainHolder2.p());
                                } else {
                                    boolean z = this.f72523b.f72517b;
                                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, storyMainHolder2, StoryMainHolder2.f72581b, false, 83373, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, storyMainHolder2, StoryMainHolder2.f72581b, false, 83373, new Class[]{Boolean.TYPE}, Void.TYPE);
                                    } else {
                                        UserStory p = storyMainHolder2.p();
                                        com.ss.android.ugc.aweme.story.feed.view.adapter.a b2 = storyMainHolder2.b(storyMainHolder2.f72583d.getCurrentItem());
                                        if (b2 != null) {
                                            b2.e();
                                        }
                                        if (!storyMainHolder2.h() && g.f72503b.c(p) && p.getCurPos() > 0) {
                                            StoryMainHolderViewModel k = storyMainHolder2.k();
                                            String b3 = g.f72503b.b(p);
                                            if (PatchProxy.isSupport(new Object[]{b3}, k, StoryMainHolderViewModel.f72602d, false, 83424, new Class[]{String.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{b3}, k, StoryMainHolderViewModel.f72602d, false, 83424, new Class[]{String.class}, Void.TYPE);
                                            } else {
                                                Intrinsics.checkParameterIsNotNull(b3, "uid");
                                                k.b(new StoryMainHolderViewModel.d(k, b3));
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.feed.jedi.StoryMainRawPagerAdapter2");
                            }
                        }
                    }
                }
            }
        }

        public final void a(int i) {
            int i2;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72516a, false, 83245, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72516a, false, 83245, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.player.c.d().a();
            this.f72520e.f72507d = false;
            if (i < this.g) {
                z = false;
            }
            this.f72517b = z;
            this.f72518c = i;
            if (this.f72517b) {
                i2 = i - 1;
            } else {
                i2 = i + 1;
            }
            ViewPager2ViewModel.f72608b.a(this.f72521f, i);
            this.f72520e.getRecyclerView().postDelayed(new a(this, i, i2), 0);
            this.g = i;
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72516a, false, 83246, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72516a, false, 83246, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            switch (i) {
                case 0:
                    return;
                case 1:
                case 2:
                    this.f72520e.f72507d = true;
                    this.f72520e.f72508e.removeCallbacks(this.f72520e.f72509f);
                    break;
            }
        }

        e(ParentViewPager2 parentViewPager2, Context context) {
            this.f72520e = parentViewPager2;
            this.f72521f = context;
        }

        public final void a(int i, float f2, int i2) {
            boolean z;
            ParentViewPager2 parentViewPager2 = this.f72520e;
            if (f2 >= 1.0E-10f) {
                z = true;
            } else {
                z = false;
            }
            parentViewPager2.f72507d = z;
            if (i == this.f72518c && f2 < 1.0E-10f) {
                this.g = i;
                this.f72518c = -1;
            }
        }
    }

    @JvmOverloads
    public ParentViewPager2(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ParentViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final StoryMainHolder2 getCurViewHolder() {
        if (PatchProxy.isSupport(new Object[0], this, f72505b, false, 83223, new Class[0], StoryMainHolder2.class)) {
            return (StoryMainHolder2) PatchProxy.accessDispatch(new Object[0], this, f72505b, false, 83223, new Class[0], StoryMainHolder2.class);
        }
        RecyclerView.ViewHolder a2 = b.a(this, getCurrentItem());
        if (!(a2 instanceof StoryMainHolder2)) {
            a2 = null;
        }
        return (StoryMainHolder2) a2;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72505b, false, 83225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72505b, false, 83225, new Class[0], Void.TYPE);
            return;
        }
        postDelayed(new c(this), 10);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72505b, false, 83236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72505b, false, 83236, new Class[0], Void.TYPE);
            return;
        }
        ArrayList<b> arrayList = this.g;
        if (arrayList != null) {
            Iterator<b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    public final void setShowingPopupWindow(boolean z) {
        this.q = z;
    }

    private final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72505b, false, 83234, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72505b, false, 83234, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f72506c = false;
        ArrayList<b> arrayList = this.g;
        if (arrayList != null) {
            Iterator<b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().b(z);
            }
        }
    }

    private final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72505b, false, 83238, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72505b, false, 83238, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ArrayList<b> arrayList = this.g;
        if (arrayList != null) {
            Iterator<b> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().c(z);
            }
        }
    }

    private final boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72505b, false, 83227, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72505b, false, 83227, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (f2 >= ((float) (UIUtils.getScreenWidth(getContext()) / 3))) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        boolean z;
        String str;
        MotionEvent motionEvent2 = motionEvent;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72505b, false, 83226, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72505b, false, 83226, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "ev");
        if (this.f72507d || !this.r.onTouchEvent(motionEvent2)) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (!this.q) {
                        this.n = motionEvent.getY();
                        this.m = motionEvent.getX();
                        this.o = System.currentTimeMillis();
                        boolean a2 = a(motionEvent.getX());
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a2 ? (byte) 1 : 0)}, this, f72505b, false, 83233, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a2)}, this, f72505b, false, 83233, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else {
                            ArrayList<b> arrayList = this.g;
                            if (arrayList != null) {
                                Iterator<b> it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(a2);
                                }
                            }
                        }
                        this.f72508e.postDelayed(this.f72509f, 500);
                        break;
                    } else {
                        this.f72508e.removeCallbacks(this.f72509f);
                        return super.onTouchEvent(motionEvent);
                    }
                case 1:
                    if (!this.q) {
                        if (System.currentTimeMillis() - this.o < 500 && Math.abs(motionEvent.getX() - this.m) < 48.0f && Math.abs(motionEvent.getY() - this.n) < 48.0f) {
                            b(a(motionEvent.getX()));
                        }
                        a(a(motionEvent.getX()));
                        this.f72508e.removeCallbacks(this.f72509f);
                        break;
                    } else {
                        StoryMainHolder2 curViewHolder = getCurViewHolder();
                        if (curViewHolder != null) {
                            if (PatchProxy.isSupport(new Object[0], curViewHolder, StoryMainHolder2.f72581b, false, 83390, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], curViewHolder, StoryMainHolder2.f72581b, false, 83390, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.feed.view.adapter.a i2 = curViewHolder.i();
                                if (i2 != null) {
                                    i2.f();
                                }
                            }
                            if (PatchProxy.isSupport(new Object[0], curViewHolder, StoryMainHolder2.f72581b, false, 83391, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], curViewHolder, StoryMainHolder2.f72581b, false, 83391, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.feed.view.adapter.a i3 = curViewHolder.i();
                                if (i3 != null) {
                                    i3.m();
                                }
                            }
                        }
                        this.f72508e.removeCallbacks(this.f72509f);
                        this.q = false;
                        return super.onTouchEvent(motionEvent);
                    }
                case 2:
                    if (this.q) {
                        this.f72508e.removeCallbacks(this.f72509f);
                        return super.onTouchEvent(motionEvent);
                    }
                    if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72505b, false, 83230, new Class[]{MotionEvent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72505b, false, 83230, new Class[]{MotionEvent.class}, Void.TYPE);
                        break;
                    } else if (System.currentTimeMillis() - this.p > 3000) {
                        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72505b, false, 83228, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72505b, false, 83228, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            RecyclerView.Adapter adapter = getAdapter();
                            if (adapter == null || getCurrentItem() != adapter.getItemCount() - 1 || motionEvent.getX() - this.m >= 0.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72505b, false, 83229, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72505b, false, 83229, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        } else if (getAdapter() == null || getCurrentItem() != 0 || motionEvent.getX() - this.m <= 0.0f) {
                            z2 = false;
                        }
                        if (z || z2) {
                            int dip2Px = (int) UIUtils.dip2Px(getContext(), 50.0f);
                            float abs = Math.abs(motionEvent.getX() - this.m);
                            if (abs > Math.abs(motionEvent.getY() - this.n) && abs > ((float) dip2Px)) {
                                this.p = System.currentTimeMillis();
                                Context context = getContext();
                                if (context != null) {
                                    com.ss.android.ugc.aweme.arch.widgets.base.b a3 = ChangeUserModeViewModel.a((FragmentActivity) context);
                                    Intrinsics.checkExpressionValueIsNotNull(a3, "ChangeUserModeViewModel.…text as FragmentActivity)");
                                    if (z) {
                                        str = "slide_left";
                                    } else {
                                        str = "slide_right";
                                    }
                                    a3.setValue(str);
                                    Context context2 = getContext();
                                    if (context2 != null) {
                                        ((FragmentActivity) context2).supportFinishAfterTransition();
                                        break;
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    this.f72508e.removeCallbacks(this.f72509f);
                    ArrayList<b> arrayList2 = this.g;
                    if (arrayList2 != null) {
                        Iterator<b> it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            it3.next().c();
                        }
                        break;
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f72508e.removeCallbacks(this.f72509f);
        return true;
    }

    public final int getChildDrawingOrder(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72505b, false, 83239, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72505b, false, 83239, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            i4 = super.getChildDrawingOrder(i2, i3);
        } catch (IndexOutOfBoundsException unused) {
            i4 = i3;
        }
        return i4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ParentViewPager2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f72508e = new Handler();
        this.f72509f = new d(this);
        getRecyclerView().setItemViewCacheSize(10);
        this.h = new e(this, context);
        setOverScrollMode(2);
        if (PatchProxy.isSupport(new Object[0], this, f72505b, false, 83224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72505b, false, 83224, new Class[0], Void.TYPE);
        } else {
            a(this.h);
        }
        this.r = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72510a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ParentViewPager2 f72511b;

            {
                this.f72511b = r1;
            }

            public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f2, float f3) {
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72510a, false, 83242, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72510a, false, 83242, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (this.f72511b.f72506c || f3 >= 0.0f || this.f72511b.f72507d) {
                    return false;
                } else {
                    Context context = this.f72511b.getContext();
                    if (context != null) {
                        com.ss.android.ugc.aweme.arch.widgets.base.b a2 = ChangeUserModeViewModel.a((FragmentActivity) context);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "ChangeUserModeViewModel.…xt() as FragmentActivity)");
                        CharSequence charSequence = (String) a2.getValue();
                        if (TextUtils.equals(charSequence, "slide_left") || TextUtils.equals(charSequence, "slide_right")) {
                            return false;
                        }
                        this.f72511b.b();
                        return true;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentViewPager2(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? -1 : i2);
    }
}
