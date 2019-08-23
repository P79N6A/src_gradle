package com.ss.android.ugc.aweme.face2face.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DefaultItemAnimator extends SimpleItemAnimator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43977a;
    private static TimeInterpolator i;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f43978b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<ArrayList<b>> f43979c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<ArrayList<a>> f43980d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f43981e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f43982f = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> g = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> h = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> j = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> k = new ArrayList<>();
    private ArrayList<b> l = new ArrayList<>();
    private ArrayList<a> m = new ArrayList<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44018a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.ViewHolder f44019b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.ViewHolder f44020c;

        /* renamed from: d  reason: collision with root package name */
        public int f44021d;

        /* renamed from: e  reason: collision with root package name */
        public int f44022e;

        /* renamed from: f  reason: collision with root package name */
        public int f44023f;
        public int g;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f44018a, false, 39195, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f44018a, false, 39195, new Class[0], String.class);
            }
            return "ChangeInfo{oldHolder=" + this.f44019b + ", newHolder=" + this.f44020c + ", fromX=" + this.f44021d + ", fromY=" + this.f44022e + ", toX=" + this.f44023f + ", toY=" + this.g + '}';
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f44019b = viewHolder;
            this.f44020c = viewHolder2;
        }

        a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f44021d = i;
            this.f44022e = i2;
            this.f44023f = i3;
            this.g = i4;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f44024a;

        /* renamed from: b  reason: collision with root package name */
        public int f44025b;

        /* renamed from: c  reason: collision with root package name */
        public int f44026c;

        /* renamed from: d  reason: collision with root package name */
        public int f44027d;

        /* renamed from: e  reason: collision with root package name */
        public int f44028e;

        b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f44024a = viewHolder;
            this.f44025b = i;
            this.f44026c = i2;
            this.f44027d = i3;
            this.f44028e = i4;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43977a, false, 39176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43977a, false, 39176, new Class[0], Void.TYPE);
            return;
        }
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f43977a, false, 39175, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43977a, false, 39175, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.k.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.j.isEmpty() || !this.f43982f.isEmpty() || !this.g.isEmpty() || !this.f43981e.isEmpty() || !this.h.isEmpty() || !this.f43979c.isEmpty() || !this.f43978b.isEmpty() || !this.f43980d.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void endAnimations() {
        if (PatchProxy.isSupport(new Object[0], this, f43977a, false, 39177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43977a, false, 39177, new Class[0], Void.TYPE);
            return;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.l.get(size);
            View view = bVar.f44024a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(bVar.f44024a);
            this.l.remove(size);
        }
        for (int size2 = this.j.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.j.get(size2));
            this.j.remove(size2);
        }
        int size3 = this.k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.k.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.k.remove(size3);
        }
        for (int size4 = this.m.size() - 1; size4 >= 0; size4--) {
            a(this.m.get(size4));
        }
        this.m.clear();
        if (isRunning()) {
            for (int size5 = this.f43979c.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f43979c.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.f44024a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(bVar2.f44024a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f43979c.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f43978b.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f43978b.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f43978b.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f43980d.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f43980d.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f43980d.remove(arrayList3);
                    }
                }
            }
            a((List<RecyclerView.ViewHolder>) this.g);
            a((List<RecyclerView.ViewHolder>) this.f43982f);
            a((List<RecyclerView.ViewHolder>) this.f43981e);
            a((List<RecyclerView.ViewHolder>) this.h);
            dispatchAnimationsFinished();
        }
    }

    public void runPendingAnimations() {
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[0], this, f43977a, false, 39161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43977a, false, 39161, new Class[0], Void.TYPE);
            return;
        }
        boolean z = !this.j.isEmpty();
        boolean z2 = !this.l.isEmpty();
        boolean z3 = !this.m.isEmpty();
        boolean z4 = !this.k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it2 = this.j.iterator();
            while (it2.hasNext()) {
                a(it2.next());
            }
            this.j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.l);
                this.f43979c.add(arrayList);
                this.l.clear();
                AnonymousClass1 r6 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43983a;

                    public final void run() {
                        char c2 = 0;
                        if (PatchProxy.isSupport(new Object[0], this, f43983a, false, 39180, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43983a, false, 39180, new Class[0], Void.TYPE);
                            return;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            b bVar = (b) it2.next();
                            DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            RecyclerView.ViewHolder viewHolder = bVar.f44024a;
                            int i = bVar.f44025b;
                            int i2 = bVar.f44026c;
                            int i3 = bVar.f44027d;
                            int i4 = bVar.f44028e;
                            Object[] objArr = new Object[5];
                            objArr[c2] = viewHolder;
                            objArr[1] = Integer.valueOf(i);
                            objArr[2] = Integer.valueOf(i2);
                            objArr[3] = Integer.valueOf(i3);
                            objArr[4] = Integer.valueOf(i4);
                            ChangeQuickRedirect changeQuickRedirect = DefaultItemAnimator.f43977a;
                            Class[] clsArr = new Class[5];
                            clsArr[c2] = RecyclerView.ViewHolder.class;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            clsArr[4] = Integer.TYPE;
                            if (PatchProxy.isSupport(objArr, defaultItemAnimator, changeQuickRedirect, false, 39167, clsArr, Void.TYPE)) {
                                c2 = 0;
                                DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                                PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, defaultItemAnimator2, DefaultItemAnimator.f43977a, false, 39167, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            } else {
                                c2 = 0;
                                View view = viewHolder.itemView;
                                int i5 = i3 - i;
                                int i6 = i4 - i2;
                                if (i5 != 0) {
                                    view.animate().translationX(0.0f);
                                }
                                if (i6 != 0) {
                                    view.animate().translationY(0.0f);
                                }
                                ViewPropertyAnimator animate = view.animate();
                                defaultItemAnimator.f43982f.add(viewHolder);
                                ViewPropertyAnimator duration = animate.setDuration(defaultItemAnimator.getMoveDuration());
                                AnonymousClass6 r9 = new AnimatorListenerAdapter(viewHolder, i5, view, i6, animate) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f44002a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ RecyclerView.ViewHolder f44003b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ int f44004c;

                                    /* renamed from: d  reason: collision with root package name */
                                    final /* synthetic */ View f44005d;

                                    /* renamed from: e  reason: collision with root package name */
                                    final /* synthetic */ int f44006e;

                                    /* renamed from: f  reason: collision with root package name */
                                    final /* synthetic */ ViewPropertyAnimator f44007f;

                                    public final void onAnimationStart(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f44002a, false, 39188, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f44002a, false, 39188, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        DefaultItemAnimator.this.dispatchMoveStarting(this.f44003b);
                                    }

                                    public final void onAnimationCancel(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f44002a, false, 39189, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f44002a, false, 39189, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        if (this.f44004c != 0) {
                                            this.f44005d.setTranslationX(0.0f);
                                        }
                                        if (this.f44006e != 0) {
                                            this.f44005d.setTranslationY(0.0f);
                                        }
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f44002a, false, 39190, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f44002a, false, 39190, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        this.f44007f.setListener(null);
                                        DefaultItemAnimator.this.dispatchMoveFinished(this.f44003b);
                                        DefaultItemAnimator.this.f43982f.remove(this.f44003b);
                                        DefaultItemAnimator.this.a();
                                    }

                                    {
                                        this.f44003b = r2;
                                        this.f44004c = r3;
                                        this.f44005d = r4;
                                        this.f44006e = r5;
                                        this.f44007f = r6;
                                    }
                                };
                                duration.setListener(r9).start();
                            }
                        }
                        arrayList.clear();
                        DefaultItemAnimator.this.f43979c.remove(arrayList);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(((b) arrayList.get(0)).f44024a.itemView, r6, getRemoveDuration());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.m);
                this.f43980d.add(arrayList2);
                this.m.clear();
                AnonymousClass2 r62 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43986a;

                    public final void run() {
                        View view;
                        if (PatchProxy.isSupport(new Object[0], this, f43986a, false, 39181, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43986a, false, 39181, new Class[0], Void.TYPE);
                            return;
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            a aVar = (a) it2.next();
                            DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                            if (PatchProxy.isSupport(new Object[]{aVar}, defaultItemAnimator, DefaultItemAnimator.f43977a, false, 39169, new Class[]{a.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{aVar}, defaultItemAnimator, DefaultItemAnimator.f43977a, false, 39169, new Class[]{a.class}, Void.TYPE);
                            } else {
                                RecyclerView.ViewHolder viewHolder = aVar.f44019b;
                                View view2 = null;
                                if (viewHolder == null) {
                                    view = null;
                                } else {
                                    view = viewHolder.itemView;
                                }
                                RecyclerView.ViewHolder viewHolder2 = aVar.f44020c;
                                if (viewHolder2 != null) {
                                    view2 = viewHolder2.itemView;
                                }
                                if (view != null) {
                                    ViewPropertyAnimator duration = view.animate().setDuration(defaultItemAnimator.getChangeDuration());
                                    defaultItemAnimator.h.add(aVar.f44019b);
                                    duration.translationX((float) (aVar.f44023f - aVar.f44021d));
                                    duration.translationY((float) (aVar.g - aVar.f44022e));
                                    duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f44008a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ a f44009b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ ViewPropertyAnimator f44010c;

                                        /* renamed from: d  reason: collision with root package name */
                                        final /* synthetic */ View f44011d;

                                        public final void onAnimationStart(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f44008a, false, 39191, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f44008a, false, 39191, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            DefaultItemAnimator.this.dispatchChangeStarting(this.f44009b.f44019b, true);
                                        }

                                        public final void onAnimationEnd(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f44008a, false, 39192, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f44008a, false, 39192, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            this.f44010c.setListener(null);
                                            this.f44011d.setAlpha(1.0f);
                                            this.f44011d.setTranslationX(0.0f);
                                            this.f44011d.setTranslationY(0.0f);
                                            DefaultItemAnimator.this.dispatchChangeFinished(this.f44009b.f44019b, true);
                                            DefaultItemAnimator.this.h.remove(this.f44009b.f44019b);
                                            DefaultItemAnimator.this.a();
                                        }

                                        {
                                            this.f44009b = r2;
                                            this.f44010c = r3;
                                            this.f44011d = r4;
                                        }
                                    }).start();
                                }
                                if (view2 != null) {
                                    ViewPropertyAnimator animate = view2.animate();
                                    defaultItemAnimator.h.add(aVar.f44020c);
                                    animate.translationX(0.0f).translationY(0.0f).setDuration(defaultItemAnimator.getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f44013a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ a f44014b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ ViewPropertyAnimator f44015c;

                                        /* renamed from: d  reason: collision with root package name */
                                        final /* synthetic */ View f44016d;

                                        public final void onAnimationStart(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f44013a, false, 39193, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f44013a, false, 39193, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            DefaultItemAnimator.this.dispatchChangeStarting(this.f44014b.f44020c, false);
                                        }

                                        public final void onAnimationEnd(Animator animator) {
                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f44013a, false, 39194, new Class[]{Animator.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f44013a, false, 39194, new Class[]{Animator.class}, Void.TYPE);
                                                return;
                                            }
                                            this.f44015c.setListener(null);
                                            this.f44016d.setAlpha(1.0f);
                                            this.f44016d.setTranslationX(0.0f);
                                            this.f44016d.setTranslationY(0.0f);
                                            DefaultItemAnimator.this.dispatchChangeFinished(this.f44014b.f44020c, false);
                                            DefaultItemAnimator.this.h.remove(this.f44014b.f44020c);
                                            DefaultItemAnimator.this.a();
                                        }

                                        {
                                            this.f44014b = r2;
                                            this.f44015c = r3;
                                            this.f44016d = r4;
                                        }
                                    }).start();
                                }
                            }
                        }
                        arrayList2.clear();
                        DefaultItemAnimator.this.f43980d.remove(arrayList2);
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(((a) arrayList2.get(0)).f44019b.itemView, r62, getRemoveDuration());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.k);
                this.f43978b.add(arrayList3);
                this.k.clear();
                AnonymousClass3 r5 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43989a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f43989a, false, 39182, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43989a, false, 39182, new Class[0], Void.TYPE);
                            return;
                        }
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            DefaultItemAnimator.this.b((RecyclerView.ViewHolder) it2.next());
                        }
                        arrayList3.clear();
                        DefaultItemAnimator.this.f43978b.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j4 = 0;
                    if (z) {
                        j2 = getRemoveDuration();
                    } else {
                        j2 = 0;
                    }
                    if (z2) {
                        j3 = getMoveDuration();
                    } else {
                        j3 = 0;
                    }
                    if (z3) {
                        j4 = getChangeDuration();
                    }
                    ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder) arrayList3.get(0)).itemView, r5, j2 + Math.max(j3, j4));
                    return;
                }
                r5.run();
            }
        }
    }

    private void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f43977a, false, 39171, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f43977a, false, 39171, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f44019b != null) {
            a(aVar, aVar.f44019b);
        }
        if (aVar.f44020c != null) {
            a(aVar, aVar.f44020c);
        }
    }

    private void c(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f43977a, false, 39174, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f43977a, false, 39174, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (i == null) {
            i = new ValueAnimator().getInterpolator();
        }
        viewHolder2.itemView.animate().setInterpolator(i);
        endAnimation(viewHolder);
    }

    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f43977a, false, 39164, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f43977a, false, 39164, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        c(viewHolder);
        viewHolder2.itemView.setAlpha(0.0f);
        this.k.add(viewHolder2);
        return true;
    }

    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f43977a, false, 39162, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f43977a, false, 39162, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        c(viewHolder);
        this.j.add(viewHolder2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(final RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f43977a, false, 39165, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f43977a, false, 39165, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.f43981e.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43997a;

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43997a, false, 39186, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43997a, false, 39186, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                view.setAlpha(1.0f);
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43997a, false, 39185, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43997a, false, 39185, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DefaultItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43997a, false, 39187, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43997a, false, 39187, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                animate.setListener(null);
                DefaultItemAnimator.this.dispatchAddFinished(viewHolder);
                DefaultItemAnimator.this.f43981e.remove(viewHolder);
                DefaultItemAnimator.this.a();
            }
        }).start();
    }

    private void a(List<RecyclerView.ViewHolder> list) {
        List<RecyclerView.ViewHolder> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43977a, false, 39178, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43977a, false, 39178, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            list2.get(size).itemView.animate().cancel();
        }
    }

    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f43977a, false, 39173, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f43977a, false, 39173, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.l.size() - 1; size >= 0; size--) {
            if (this.l.get(size).f44024a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.l.remove(size);
            }
        }
        a((List<a>) this.m, viewHolder);
        if (this.j.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.k.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f43980d.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f43980d.get(size2);
            a((List<a>) arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f43980d.remove(size2);
            }
        }
        for (int size3 = this.f43979c.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f43979c.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f44024a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f43979c.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f43978b.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f43978b.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f43978b.remove(size5);
                }
            }
        }
        this.g.remove(viewHolder);
        this.f43981e.remove(viewHolder);
        this.h.remove(viewHolder);
        this.f43982f.remove(viewHolder);
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(final RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f43977a, false, 39163, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f43977a, false, 39163, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        this.g.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43992a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43992a, false, 39183, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43992a, false, 39183, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                DefaultItemAnimator.this.dispatchRemoveStarting(viewHolder);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43992a, false, 39184, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43992a, false, 39184, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                animate.setListener(null);
                view.setAlpha(1.0f);
                DefaultItemAnimator.this.dispatchRemoveFinished(viewHolder);
                DefaultItemAnimator.this.g.remove(viewHolder);
                DefaultItemAnimator.this.a();
            }
        }).start();
    }

    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, list}, this, f43977a, false, 39179, new Class[]{RecyclerView.ViewHolder.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder, list}, this, f43977a, false, 39179, new Class[]{RecyclerView.ViewHolder.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        } else {
            return false;
        }
    }

    private void a(List<a> list, RecyclerView.ViewHolder viewHolder) {
        List<a> list2 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{list2, viewHolder2}, this, f43977a, false, 39170, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, viewHolder2}, this, f43977a, false, 39170, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list2.get(size);
            if (a(aVar, viewHolder2) && aVar.f44019b == null && aVar.f44020c == null) {
                list2.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.ViewHolder viewHolder) {
        a aVar2 = aVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2, viewHolder2}, this, f43977a, false, 39172, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, viewHolder2}, this, f43977a, false, 39172, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar2.f44020c == viewHolder2) {
            aVar2.f44020c = null;
        } else if (aVar2.f44019b == viewHolder2) {
            aVar2.f44019b = null;
            z = true;
        } else {
            return false;
        }
        viewHolder2.itemView.setAlpha(1.0f);
        viewHolder2.itemView.setTranslationX(0.0f);
        viewHolder2.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder2, z);
        return true;
    }

    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f43977a, false, 39166, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f43977a, false, 39166, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        View view = viewHolder2.itemView;
        int translationX = i2 + ((int) viewHolder2.itemView.getTranslationX());
        int translationY = i3 + ((int) viewHolder2.itemView.getTranslationY());
        c(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList<b> arrayList = this.l;
        b bVar = new b(viewHolder, translationX, translationY, i4, i5);
        arrayList.add(bVar);
        return true;
    }

    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        RecyclerView.ViewHolder viewHolder3 = viewHolder;
        RecyclerView.ViewHolder viewHolder4 = viewHolder2;
        if (PatchProxy.isSupport(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f43977a, false, 39168, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f43977a, false, 39168, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (viewHolder3 == viewHolder4) {
            return animateMove(viewHolder, i2, i3, i4, i5);
        } else {
            float translationX = viewHolder3.itemView.getTranslationX();
            float translationY = viewHolder3.itemView.getTranslationY();
            float alpha = viewHolder3.itemView.getAlpha();
            c(viewHolder);
            int i6 = (int) (((float) (i4 - i2)) - translationX);
            int i7 = (int) (((float) (i5 - i3)) - translationY);
            viewHolder3.itemView.setTranslationX(translationX);
            viewHolder3.itemView.setTranslationY(translationY);
            viewHolder3.itemView.setAlpha(alpha);
            if (viewHolder4 != null) {
                c(viewHolder4);
                viewHolder4.itemView.setTranslationX((float) (-i6));
                viewHolder4.itemView.setTranslationY((float) (-i7));
                viewHolder4.itemView.setAlpha(0.0f);
            }
            ArrayList<a> arrayList = this.m;
            a aVar = new a(viewHolder, viewHolder2, i2, i3, i4, i5);
            arrayList.add(aVar);
            return true;
        }
    }
}
