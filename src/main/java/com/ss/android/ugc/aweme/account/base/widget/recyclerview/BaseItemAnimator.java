package com.ss.android.ugc.aweme.account.base.widget.recyclerview;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseItemAnimator extends SimpleItemAnimator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31748a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.ViewHolder>> f31749b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f31750c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f31751d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    protected ArrayList<RecyclerView.ViewHolder> f31752e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<RecyclerView.ViewHolder> f31753f = new ArrayList<>();
    protected ArrayList<RecyclerView.ViewHolder> g = new ArrayList<>();
    public ArrayList<RecyclerView.ViewHolder> h = new ArrayList<>();
    public Interpolator i = new DecelerateInterpolator();
    private ArrayList<RecyclerView.ViewHolder> j = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> k = new ArrayList<>();
    private ArrayList<b> l = new ArrayList<>();
    private ArrayList<a> m = new ArrayList<>();

    protected class DefaultAddVpaListener extends VpaListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31778a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.ViewHolder f31779b;

        public void onAnimationCancel(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31778a, false, 19792, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31778a, false, 19792, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
        }

        public void onAnimationStart(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31778a, false, 19791, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31778a, false, 19791, new Class[]{View.class}, Void.TYPE);
                return;
            }
            BaseItemAnimator.this.dispatchAddStarting(this.f31779b);
        }

        public void onAnimationEnd(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31778a, false, 19793, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31778a, false, 19793, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
            BaseItemAnimator.this.dispatchAddFinished(this.f31779b);
            BaseItemAnimator.this.f31752e.remove(this.f31779b);
            BaseItemAnimator.this.a();
        }

        public DefaultAddVpaListener(RecyclerView.ViewHolder viewHolder) {
            super((byte) 0);
            this.f31779b = viewHolder;
        }
    }

    protected class DefaultRemoveVpaListener extends VpaListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31781a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.ViewHolder f31782b;

        public void onAnimationCancel(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31781a, false, 19795, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31781a, false, 19795, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
        }

        public void onAnimationStart(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31781a, false, 19794, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31781a, false, 19794, new Class[]{View.class}, Void.TYPE);
                return;
            }
            BaseItemAnimator.this.dispatchRemoveStarting(this.f31782b);
        }

        public void onAnimationEnd(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f31781a, false, 19796, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f31781a, false, 19796, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
            BaseItemAnimator.this.dispatchRemoveFinished(this.f31782b);
            BaseItemAnimator.this.g.remove(this.f31782b);
            BaseItemAnimator.this.a();
        }

        public DefaultRemoveVpaListener(RecyclerView.ViewHolder viewHolder) {
            super((byte) 0);
            this.f31782b = viewHolder;
        }
    }

    static class VpaListenerAdapter implements ViewPropertyAnimatorListener {
        public void onAnimationCancel(View view) {
        }

        public void onAnimationEnd(View view) {
        }

        public void onAnimationStart(View view) {
        }

        private VpaListenerAdapter() {
        }

        /* synthetic */ VpaListenerAdapter(byte b2) {
            this();
        }
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31784a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.ViewHolder f31785b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.ViewHolder f31786c;

        /* renamed from: d  reason: collision with root package name */
        public int f31787d;

        /* renamed from: e  reason: collision with root package name */
        public int f31788e;

        /* renamed from: f  reason: collision with root package name */
        public int f31789f;
        public int g;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f31784a, false, 19790, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f31784a, false, 19790, new Class[0], String.class);
            }
            return "ChangeInfo{oldHolder=" + this.f31785b + ", newHolder=" + this.f31786c + ", fromX=" + this.f31787d + ", fromY=" + this.f31788e + ", toX=" + this.f31789f + ", toY=" + this.g + '}';
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f31785b = viewHolder;
            this.f31786c = viewHolder2;
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f31787d = i;
            this.f31788e = i2;
            this.f31789f = i3;
            this.g = i4;
        }

        /* synthetic */ a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4, byte b2) {
            this(viewHolder, viewHolder2, i, i2, i3, i4);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f31790a;

        /* renamed from: b  reason: collision with root package name */
        public int f31791b;

        /* renamed from: c  reason: collision with root package name */
        public int f31792c;

        /* renamed from: d  reason: collision with root package name */
        public int f31793d;

        /* renamed from: e  reason: collision with root package name */
        public int f31794e;

        private b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f31790a = viewHolder;
            this.f31791b = i;
            this.f31792c = i2;
            this.f31793d = i3;
            this.f31794e = i4;
        }

        /* synthetic */ b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4, byte b2) {
            this(viewHolder, i, i2, i3, i4);
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder) {
    }

    public abstract void b(RecyclerView.ViewHolder viewHolder);

    public abstract void c(RecyclerView.ViewHolder viewHolder);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31748a, false, 19777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31748a, false, 19777, new Class[0], Void.TYPE);
            return;
        }
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public BaseItemAnimator() {
        setSupportsChangeAnimations(false);
    }

    public boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f31748a, false, 19776, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f31748a, false, 19776, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.k.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.j.isEmpty() || !this.f31753f.isEmpty() || !this.g.isEmpty() || !this.f31752e.isEmpty() || !this.h.isEmpty() || !this.f31750c.isEmpty() || !this.f31749b.isEmpty() || !this.f31751d.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void endAnimations() {
        if (PatchProxy.isSupport(new Object[0], this, f31748a, false, 19778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31748a, false, 19778, new Class[0], Void.TYPE);
            return;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.l.get(size);
            View view = bVar.f31790a.itemView;
            ViewCompat.setTranslationY(view, 0.0f);
            ViewCompat.setTranslationX(view, 0.0f);
            dispatchMoveFinished(bVar.f31790a);
            this.l.remove(size);
        }
        for (int size2 = this.j.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.j.get(size2));
            this.j.remove(size2);
        }
        for (int size3 = this.k.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.k.get(size3);
            b.a(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
            this.k.remove(size3);
        }
        for (int size4 = this.m.size() - 1; size4 >= 0; size4--) {
            a(this.m.get(size4));
        }
        this.m.clear();
        if (isRunning()) {
            for (int size5 = this.f31750c.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f31750c.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.f31790a.itemView;
                    ViewCompat.setTranslationY(view2, 0.0f);
                    ViewCompat.setTranslationX(view2, 0.0f);
                    dispatchMoveFinished(bVar2.f31790a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f31750c.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f31749b.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f31749b.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                    ViewCompat.setAlpha(viewHolder2.itemView, 1.0f);
                    dispatchAddFinished(viewHolder2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f31749b.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f31751d.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f31751d.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f31751d.remove(arrayList3);
                    }
                }
            }
            a((List<RecyclerView.ViewHolder>) this.g);
            a((List<RecyclerView.ViewHolder>) this.f31753f);
            a((List<RecyclerView.ViewHolder>) this.f31752e);
            a((List<RecyclerView.ViewHolder>) this.h);
            dispatchAnimationsFinished();
        }
    }

    public void runPendingAnimations() {
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[0], this, f31748a, false, 19759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31748a, false, 19759, new Class[0], Void.TYPE);
            return;
        }
        boolean z = !this.j.isEmpty();
        boolean z2 = !this.l.isEmpty();
        boolean z3 = !this.m.isEmpty();
        boolean z4 = !this.k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it2 = this.j.iterator();
            while (it2.hasNext()) {
                RecyclerView.ViewHolder next = it2.next();
                if (PatchProxy.isSupport(new Object[]{next}, this, f31748a, false, 19762, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{next}, this, f31748a, false, 19762, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                } else {
                    if (next instanceof a) {
                        new DefaultRemoveVpaListener(next);
                    } else {
                        b(next);
                    }
                    this.g.add(next);
                }
            }
            this.j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.l);
                this.f31750c.add(arrayList);
                this.l.clear();
                AnonymousClass1 r1 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31754a;

                    public final void run() {
                        char c2 = 0;
                        if (PatchProxy.isSupport(new Object[0], this, f31754a, false, 19780, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f31754a, false, 19780, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f31750c.remove(arrayList)) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                b bVar = (b) it2.next();
                                BaseItemAnimator baseItemAnimator = BaseItemAnimator.this;
                                RecyclerView.ViewHolder viewHolder = bVar.f31790a;
                                int i = bVar.f31791b;
                                int i2 = bVar.f31792c;
                                int i3 = bVar.f31793d;
                                int i4 = bVar.f31794e;
                                Object[] objArr = new Object[5];
                                objArr[c2] = viewHolder;
                                objArr[1] = Integer.valueOf(i);
                                objArr[2] = Integer.valueOf(i2);
                                objArr[3] = Integer.valueOf(i3);
                                objArr[4] = Integer.valueOf(i4);
                                ChangeQuickRedirect changeQuickRedirect = BaseItemAnimator.f31748a;
                                Class[] clsArr = new Class[5];
                                clsArr[c2] = RecyclerView.ViewHolder.class;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                clsArr[4] = Integer.TYPE;
                                if (PatchProxy.isSupport(objArr, baseItemAnimator, changeQuickRedirect, false, 19769, clsArr, Void.TYPE)) {
                                    c2 = 0;
                                    BaseItemAnimator baseItemAnimator2 = baseItemAnimator;
                                    PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, baseItemAnimator2, BaseItemAnimator.f31748a, false, 19769, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                } else {
                                    c2 = 0;
                                    View view = viewHolder.itemView;
                                    int i5 = i3 - i;
                                    int i6 = i4 - i2;
                                    if (i5 != 0) {
                                        ViewCompat.animate(view).translationX(0.0f);
                                    }
                                    if (i6 != 0) {
                                        ViewCompat.animate(view).translationY(0.0f);
                                    }
                                    baseItemAnimator.f31753f.add(viewHolder);
                                    ViewPropertyAnimatorCompat animate = ViewCompat.animate(view);
                                    ViewPropertyAnimatorCompat duration = animate.setDuration(baseItemAnimator.getMoveDuration());
                                    AnonymousClass4 r9 = new VpaListenerAdapter(viewHolder, i5, i6, animate) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f31763a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ RecyclerView.ViewHolder f31764b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ int f31765c;

                                        /* renamed from: d  reason: collision with root package name */
                                        final /* synthetic */ int f31766d;

                                        /* renamed from: e  reason: collision with root package name */
                                        final /* synthetic */ ViewPropertyAnimatorCompat f31767e;

                                        public void onAnimationCancel(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f31763a, false, 19784, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f31763a, false, 19784, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f31765c != 0) {
                                                ViewCompat.setTranslationX(view, 0.0f);
                                            }
                                            if (this.f31766d != 0) {
                                                ViewCompat.setTranslationY(view, 0.0f);
                                            }
                                        }

                                        public void onAnimationStart(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f31763a, false, 19783, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f31763a, false, 19783, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            BaseItemAnimator.this.dispatchMoveStarting(this.f31764b);
                                        }

                                        public void onAnimationEnd(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f31763a, false, 19785, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f31763a, false, 19785, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            this.f31767e.setListener(null);
                                            BaseItemAnimator.this.dispatchMoveFinished(this.f31764b);
                                            BaseItemAnimator.this.f31753f.remove(this.f31764b);
                                            BaseItemAnimator.this.a();
                                        }

                                        {
                                            this.f31764b = r2;
                                            this.f31765c = r3;
                                            this.f31766d = r4;
                                            this.f31767e = r5;
                                        }
                                    };
                                    duration.setListener(r9).start();
                                }
                            }
                            arrayList.clear();
                        }
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(((b) arrayList.get(0)).f31790a.itemView, r1, getRemoveDuration());
                } else {
                    r1.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.m);
                this.f31751d.add(arrayList2);
                this.m.clear();
                AnonymousClass2 r12 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31757a;

                    public final void run() {
                        View view;
                        if (PatchProxy.isSupport(new Object[0], this, f31757a, false, 19781, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f31757a, false, 19781, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f31751d.remove(arrayList2)) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                a aVar = (a) it2.next();
                                BaseItemAnimator baseItemAnimator = BaseItemAnimator.this;
                                if (PatchProxy.isSupport(new Object[]{aVar}, baseItemAnimator, BaseItemAnimator.f31748a, false, 19771, new Class[]{a.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{aVar}, baseItemAnimator, BaseItemAnimator.f31748a, false, 19771, new Class[]{a.class}, Void.TYPE);
                                } else {
                                    RecyclerView.ViewHolder viewHolder = aVar.f31785b;
                                    View view2 = null;
                                    if (viewHolder == null) {
                                        view = null;
                                    } else {
                                        view = viewHolder.itemView;
                                    }
                                    RecyclerView.ViewHolder viewHolder2 = aVar.f31786c;
                                    if (viewHolder2 != null) {
                                        view2 = viewHolder2.itemView;
                                    }
                                    if (view != null) {
                                        baseItemAnimator.h.add(aVar.f31785b);
                                        ViewPropertyAnimatorCompat duration = ViewCompat.animate(view).setDuration(baseItemAnimator.getChangeDuration());
                                        duration.translationX((float) (aVar.f31789f - aVar.f31787d));
                                        duration.translationY((float) (aVar.g - aVar.f31788e));
                                        duration.alpha(0.0f).setListener(new VpaListenerAdapter(aVar, duration) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f31769a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ a f31770b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ ViewPropertyAnimatorCompat f31771c;

                                            public void onAnimationStart(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f31769a, false, 19786, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f31769a, false, 19786, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                BaseItemAnimator.this.dispatchChangeStarting(this.f31770b.f31785b, true);
                                            }

                                            public void onAnimationEnd(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f31769a, false, 19787, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f31769a, false, 19787, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                this.f31771c.setListener(null);
                                                ViewCompat.setAlpha(view, 1.0f);
                                                ViewCompat.setTranslationX(view, 0.0f);
                                                ViewCompat.setTranslationY(view, 0.0f);
                                                BaseItemAnimator.this.dispatchChangeFinished(this.f31770b.f31785b, true);
                                                BaseItemAnimator.this.h.remove(this.f31770b.f31785b);
                                                BaseItemAnimator.this.a();
                                            }

                                            {
                                                this.f31770b = r2;
                                                this.f31771c = r3;
                                            }
                                        }).start();
                                    }
                                    if (view2 != null) {
                                        baseItemAnimator.h.add(aVar.f31786c);
                                        ViewPropertyAnimatorCompat animate = ViewCompat.animate(view2);
                                        animate.translationX(0.0f).translationY(0.0f).setDuration(baseItemAnimator.getChangeDuration()).alpha(1.0f).setListener(new VpaListenerAdapter(aVar, animate, view2) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f31773a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ a f31774b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ ViewPropertyAnimatorCompat f31775c;

                                            /* renamed from: d  reason: collision with root package name */
                                            final /* synthetic */ View f31776d;

                                            public void onAnimationStart(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f31773a, false, 19788, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f31773a, false, 19788, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                BaseItemAnimator.this.dispatchChangeStarting(this.f31774b.f31786c, false);
                                            }

                                            public void onAnimationEnd(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f31773a, false, 19789, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f31773a, false, 19789, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                this.f31775c.setListener(null);
                                                ViewCompat.setAlpha(this.f31776d, 1.0f);
                                                ViewCompat.setTranslationX(this.f31776d, 0.0f);
                                                ViewCompat.setTranslationY(this.f31776d, 0.0f);
                                                BaseItemAnimator.this.dispatchChangeFinished(this.f31774b.f31786c, false);
                                                BaseItemAnimator.this.h.remove(this.f31774b.f31786c);
                                                BaseItemAnimator.this.a();
                                            }

                                            {
                                                this.f31774b = r2;
                                                this.f31775c = r3;
                                                this.f31776d = r4;
                                            }
                                        }).start();
                                    }
                                }
                            }
                            arrayList2.clear();
                        }
                    }
                };
                if (z) {
                    ViewCompat.postOnAnimationDelayed(((a) arrayList2.get(0)).f31785b.itemView, r12, getRemoveDuration());
                } else {
                    r12.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.k);
                this.f31749b.add(arrayList3);
                this.k.clear();
                AnonymousClass3 r13 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31760a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f31760a, false, 19782, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f31760a, false, 19782, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f31749b.remove(arrayList3)) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                BaseItemAnimator.this.d((RecyclerView.ViewHolder) it2.next());
                            }
                            arrayList3.clear();
                        }
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
                    ViewCompat.postOnAnimationDelayed(((RecyclerView.ViewHolder) arrayList3.get(0)).itemView, r13, j2 + Math.max(j3, j4));
                    return;
                }
                r13.run();
            }
        }
    }

    private void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31748a, false, 19773, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31748a, false, 19773, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f31785b != null) {
            a(aVar, aVar.f31785b);
        }
        if (aVar.f31786c != null) {
            a(aVar, aVar.f31786c);
        }
    }

    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f31748a, false, 19764, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f31748a, false, 19764, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        endAnimation(viewHolder);
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f31748a, false, 19760, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f31748a, false, 19760, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else {
            b.a(viewHolder2.itemView);
        }
        this.j.add(viewHolder2);
        return true;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f31748a, false, 19763, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f31748a, false, 19763, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (viewHolder instanceof a) {
            new DefaultAddVpaListener(viewHolder);
        } else {
            c(viewHolder);
        }
        this.f31752e.add(viewHolder);
    }

    private void a(List<RecyclerView.ViewHolder> list) {
        List<RecyclerView.ViewHolder> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f31748a, false, 19779, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f31748a, false, 19779, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.animate(list2.get(size).itemView).cancel();
        }
    }

    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f31748a, false, 19766, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f31748a, false, 19766, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        endAnimation(viewHolder);
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f31748a, false, 19761, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f31748a, false, 19761, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else {
            b.a(viewHolder2.itemView);
            if (!(viewHolder2 instanceof a)) {
                a(viewHolder);
            }
        }
        this.k.add(viewHolder2);
        return true;
    }

    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f31748a, false, 19775, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f31748a, false, 19775, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        View view = viewHolder.itemView;
        ViewCompat.animate(view).cancel();
        for (int size = this.l.size() - 1; size >= 0; size--) {
            if (this.l.get(size).f31790a == viewHolder) {
                ViewCompat.setTranslationY(view, 0.0f);
                ViewCompat.setTranslationX(view, 0.0f);
                dispatchMoveFinished(viewHolder);
                this.l.remove(size);
            }
        }
        a((List<a>) this.m, viewHolder);
        if (this.j.remove(viewHolder)) {
            b.a(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.k.remove(viewHolder)) {
            b.a(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f31751d.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f31751d.get(size2);
            a((List<a>) arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f31751d.remove(size2);
            }
        }
        for (int size3 = this.f31750c.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f31750c.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f31790a == viewHolder) {
                    ViewCompat.setTranslationY(view, 0.0f);
                    ViewCompat.setTranslationX(view, 0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f31750c.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f31749b.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f31749b.get(size5);
            if (arrayList3.remove(viewHolder)) {
                b.a(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f31749b.remove(size5);
                }
            }
        }
        this.g.remove(viewHolder);
        this.f31752e.remove(viewHolder);
        this.h.remove(viewHolder);
        this.f31753f.remove(viewHolder);
        a();
    }

    private void a(List<a> list, RecyclerView.ViewHolder viewHolder) {
        List<a> list2 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{list2, viewHolder2}, this, f31748a, false, 19772, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, viewHolder2}, this, f31748a, false, 19772, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list2.get(size);
            if (a(aVar, viewHolder2) && aVar.f31785b == null && aVar.f31786c == null) {
                list2.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.ViewHolder viewHolder) {
        a aVar2 = aVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2, viewHolder2}, this, f31748a, false, 19774, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, viewHolder2}, this, f31748a, false, 19774, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar2.f31786c == viewHolder2) {
            aVar2.f31786c = null;
        } else if (aVar2.f31785b == viewHolder2) {
            aVar2.f31785b = null;
            z = true;
        } else {
            return false;
        }
        ViewCompat.setAlpha(viewHolder2.itemView, 1.0f);
        ViewCompat.setTranslationX(viewHolder2.itemView, 0.0f);
        ViewCompat.setTranslationY(viewHolder2.itemView, 0.0f);
        dispatchChangeFinished(viewHolder2, z);
        return true;
    }

    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31748a, false, 19768, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31748a, false, 19768, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        View view = viewHolder2.itemView;
        int translationX = (int) (((float) i2) + ViewCompat.getTranslationX(viewHolder2.itemView));
        int translationY = (int) (((float) i3) + ViewCompat.getTranslationY(viewHolder2.itemView));
        endAnimation(viewHolder);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i6 != 0) {
            ViewCompat.setTranslationX(view, (float) (-i6));
        }
        if (i7 != 0) {
            ViewCompat.setTranslationY(view, (float) (-i7));
        }
        ArrayList<b> arrayList = this.l;
        b bVar = new b(viewHolder, translationX, translationY, i4, i5, (byte) 0);
        arrayList.add(bVar);
        return true;
    }

    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        RecyclerView.ViewHolder viewHolder3 = viewHolder;
        RecyclerView.ViewHolder viewHolder4 = viewHolder2;
        if (PatchProxy.isSupport(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31748a, false, 19770, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f31748a, false, 19770, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        float translationX = ViewCompat.getTranslationX(viewHolder3.itemView);
        float translationY = ViewCompat.getTranslationY(viewHolder3.itemView);
        float alpha = ViewCompat.getAlpha(viewHolder3.itemView);
        endAnimation(viewHolder);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        ViewCompat.setTranslationX(viewHolder3.itemView, translationX);
        ViewCompat.setTranslationY(viewHolder3.itemView, translationY);
        ViewCompat.setAlpha(viewHolder3.itemView, alpha);
        if (!(viewHolder4 == null || viewHolder4.itemView == null)) {
            endAnimation(viewHolder4);
            ViewCompat.setTranslationX(viewHolder4.itemView, (float) (-i6));
            ViewCompat.setTranslationY(viewHolder4.itemView, (float) (-i7));
            ViewCompat.setAlpha(viewHolder4.itemView, 0.0f);
        }
        ArrayList<a> arrayList = this.m;
        a aVar = new a(viewHolder, viewHolder2, i2, i3, i4, i5, (byte) 0);
        arrayList.add(aVar);
        return true;
    }
}
