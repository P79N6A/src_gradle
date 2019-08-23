package com.ss.android.ugc.aweme.discover.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J \u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/GuideSearchBar;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "guideSearchBar", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "(Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;)V", "isAnimating", "", "isHanding", "isVisible", "()Z", "shouldShowBar", "bindData", "", "wordList", "", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "originalKeyword", "", "listen", "view", "Landroid/support/v7/widget/RecyclerView;", "onScrolled", "recyclerView", "dx", "", "dy", "resetBar", "showAnimation", "hide", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GuideSearchBar extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42895a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42896b;

    /* renamed from: c  reason: collision with root package name */
    public final GuideSearchHeadView f42897c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f42898d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f42899e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuideSearchBar f42901b;

        a(GuideSearchBar guideSearchBar) {
            this.f42901b = guideSearchBar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42900a, false, 37600, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42900a, false, 37600, new Class[0], Void.TYPE);
                return;
            }
            this.f42901b.f42897c.setTranslationY((float) (-this.f42901b.f42897c.getHeight()));
            this.f42901b.f42897c.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/GuideSearchBar$showAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuideSearchBar f42903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f42904c;

        public final void onAnimationCancel(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42902a, false, 37603, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42902a, false, 37603, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f42904c) {
                this.f42903b.f42897c.setVisibility(8);
            }
            this.f42903b.f42896b = false;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42902a, false, 37602, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42902a, false, 37602, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (this.f42904c) {
                this.f42903b.f42897c.setVisibility(8);
            }
            this.f42903b.f42896b = false;
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f42902a, false, 37601, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f42902a, false, 37601, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!this.f42904c) {
                this.f42903b.f42897c.setVisibility(0);
            }
            this.f42903b.f42896b = true;
        }

        b(GuideSearchBar guideSearchBar, boolean z) {
            this.f42903b = guideSearchBar;
            this.f42904c = z;
        }
    }

    private final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42895a, false, 37594, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42895a, false, 37594, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f42897c.getVisibility() == 0) {
            z = true;
        }
        return z;
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42895a, false, 37597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42895a, false, 37597, new Class[0], Void.TYPE);
            return;
        }
        this.f42897c.setVisibility(4);
        this.f42897c.post(new a(this));
    }

    public GuideSearchBar(@NotNull GuideSearchHeadView guideSearchHeadView) {
        Intrinsics.checkParameterIsNotNull(guideSearchHeadView, "guideSearchBar");
        this.f42897c = guideSearchHeadView;
        b();
    }

    public final void a(@Nullable List<GuideSearchWord> list, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, f42895a, false, 37595, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str}, this, f42895a, false, 37595, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "originalKeyword");
        this.f42898d = !CollectionUtils.isEmpty(list);
        if (!this.f42898d) {
            b();
            return;
        }
        GuideSearchHeadView guideSearchHeadView = this.f42897c;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        guideSearchHeadView.a(list, str, null, false);
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42895a, false, 37599, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42895a, false, 37599, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.f42898d && i2 != 0) {
            int i5 = -1;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            GuideSearchHeadView guideSearchHeadView = null;
            if (!(adapter instanceof HeaderAndFooterWrapper)) {
                adapter = null;
            }
            HeaderAndFooterWrapper headerAndFooterWrapper = (HeaderAndFooterWrapper) adapter;
            if (headerAndFooterWrapper != null) {
                List c2 = headerAndFooterWrapper.c();
                int size = c2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    } else if (c2.get(i6) instanceof GuideSearchHeadView) {
                        Object obj = c2.get(i6);
                        if (obj != null) {
                            guideSearchHeadView = (GuideSearchHeadView) obj;
                            i5 = i6;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView");
                        }
                    } else {
                        i6++;
                    }
                }
                if (guideSearchHeadView != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                        if (guideSearchHeadView.getTop() >= 0) {
                            this.f42897c.setVisibility(8);
                            return;
                        }
                        if (guideSearchHeadView.getTop() >= 0 || findFirstVisibleItemPosition != i5) {
                            if (findFirstVisibleItemPosition > i5) {
                                if (!a() || !this.f42899e) {
                                    if (i2 > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42895a, false, 37598, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42895a, false, 37598, new Class[]{Boolean.TYPE}, Void.TYPE);
                                        return;
                                    } else if (!this.f42896b && ((!z || a()) && (z || !a()))) {
                                        if (z) {
                                            i3 = 0;
                                        } else {
                                            i3 = -this.f42897c.getHeight();
                                        }
                                        if (z) {
                                            i4 = -this.f42897c.getHeight();
                                        } else {
                                            i4 = 0;
                                        }
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f42897c, "translationY", new float[]{((float) i3) * 1.0f, ((float) i4) * 1.0f});
                                        ofFloat.addListener(new b(this, z));
                                        ofFloat.start();
                                    } else {
                                        return;
                                    }
                                } else {
                                    this.f42897c.setVisibility(8);
                                    this.f42899e = false;
                                    return;
                                }
                            }
                        } else if (a()) {
                            this.f42899e = true;
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
        }
    }
}
