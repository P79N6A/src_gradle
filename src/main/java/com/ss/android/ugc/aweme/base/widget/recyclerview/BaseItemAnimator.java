package com.ss.android.ugc.aweme.base.widget.recyclerview;

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
    public static ChangeQuickRedirect f35129a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.ViewHolder>> f35130b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f35131c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f35132d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    protected ArrayList<RecyclerView.ViewHolder> f35133e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<RecyclerView.ViewHolder> f35134f = new ArrayList<>();
    protected ArrayList<RecyclerView.ViewHolder> g = new ArrayList<>();
    public ArrayList<RecyclerView.ViewHolder> h = new ArrayList<>();
    public Interpolator i = new DecelerateInterpolator();
    private ArrayList<RecyclerView.ViewHolder> j = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> k = new ArrayList<>();
    private ArrayList<b> l = new ArrayList<>();
    private ArrayList<a> m = new ArrayList<>();

    public class DefaultAddVpaListener extends VpaListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35159a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.ViewHolder f35160b;

        public void onAnimationCancel(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35159a, false, 25565, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35159a, false, 25565, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
        }

        public void onAnimationStart(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35159a, false, 25564, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35159a, false, 25564, new Class[]{View.class}, Void.TYPE);
                return;
            }
            BaseItemAnimator.this.dispatchAddStarting(this.f35160b);
        }

        public void onAnimationEnd(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35159a, false, 25566, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35159a, false, 25566, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
            BaseItemAnimator.this.dispatchAddFinished(this.f35160b);
            BaseItemAnimator.this.f35133e.remove(this.f35160b);
            BaseItemAnimator.this.a();
        }

        public DefaultAddVpaListener(RecyclerView.ViewHolder viewHolder) {
            super((byte) 0);
            this.f35160b = viewHolder;
        }
    }

    public class DefaultRemoveVpaListener extends VpaListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35162a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.ViewHolder f35163b;

        public void onAnimationCancel(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35162a, false, 25568, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35162a, false, 25568, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
        }

        public void onAnimationStart(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35162a, false, 25567, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35162a, false, 25567, new Class[]{View.class}, Void.TYPE);
                return;
            }
            BaseItemAnimator.this.dispatchRemoveStarting(this.f35163b);
        }

        public void onAnimationEnd(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35162a, false, 25569, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35162a, false, 25569, new Class[]{View.class}, Void.TYPE);
                return;
            }
            b.a(view);
            BaseItemAnimator.this.dispatchRemoveFinished(this.f35163b);
            BaseItemAnimator.this.g.remove(this.f35163b);
            BaseItemAnimator.this.a();
        }

        public DefaultRemoveVpaListener(RecyclerView.ViewHolder viewHolder) {
            super((byte) 0);
            this.f35163b = viewHolder;
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
        public static ChangeQuickRedirect f35165a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.ViewHolder f35166b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.ViewHolder f35167c;

        /* renamed from: d  reason: collision with root package name */
        public int f35168d;

        /* renamed from: e  reason: collision with root package name */
        public int f35169e;

        /* renamed from: f  reason: collision with root package name */
        public int f35170f;
        public int g;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f35165a, false, 25563, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f35165a, false, 25563, new Class[0], String.class);
            }
            return "ChangeInfo{oldHolder=" + this.f35166b + ", newHolder=" + this.f35167c + ", fromX=" + this.f35168d + ", fromY=" + this.f35169e + ", toX=" + this.f35170f + ", toY=" + this.g + '}';
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f35166b = viewHolder;
            this.f35167c = viewHolder2;
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f35168d = i;
            this.f35169e = i2;
            this.f35170f = i3;
            this.g = i4;
        }

        /* synthetic */ a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4, byte b2) {
            this(viewHolder, viewHolder2, i, i2, i3, i4);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f35171a;

        /* renamed from: b  reason: collision with root package name */
        public int f35172b;

        /* renamed from: c  reason: collision with root package name */
        public int f35173c;

        /* renamed from: d  reason: collision with root package name */
        public int f35174d;

        /* renamed from: e  reason: collision with root package name */
        public int f35175e;

        private b(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f35171a = viewHolder;
            this.f35172b = i;
            this.f35173c = i2;
            this.f35174d = i3;
            this.f35175e = i4;
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
        if (PatchProxy.isSupport(new Object[0], this, f35129a, false, 25550, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35129a, false, 25550, new Class[0], Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[0], this, f35129a, false, 25549, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35129a, false, 25549, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.k.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.j.isEmpty() || !this.f35134f.isEmpty() || !this.g.isEmpty() || !this.f35133e.isEmpty() || !this.h.isEmpty() || !this.f35131c.isEmpty() || !this.f35130b.isEmpty() || !this.f35132d.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void endAnimations() {
        if (PatchProxy.isSupport(new Object[0], this, f35129a, false, 25551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35129a, false, 25551, new Class[0], Void.TYPE);
            return;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.l.get(size);
            View view = bVar.f35171a.itemView;
            ViewCompat.setTranslationY(view, 0.0f);
            ViewCompat.setTranslationX(view, 0.0f);
            dispatchMoveFinished(bVar.f35171a);
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
            for (int size5 = this.f35131c.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f35131c.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.f35171a.itemView;
                    ViewCompat.setTranslationY(view2, 0.0f);
                    ViewCompat.setTranslationX(view2, 0.0f);
                    dispatchMoveFinished(bVar2.f35171a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f35131c.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f35130b.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f35130b.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                    ViewCompat.setAlpha(viewHolder2.itemView, 1.0f);
                    dispatchAddFinished(viewHolder2);
                    if (size8 < arrayList2.size()) {
                        arrayList2.remove(size8);
                    }
                    if (arrayList2.isEmpty()) {
                        this.f35130b.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f35132d.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f35132d.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f35132d.remove(arrayList3);
                    }
                }
            }
            a((List<RecyclerView.ViewHolder>) this.g);
            a((List<RecyclerView.ViewHolder>) this.f35134f);
            a((List<RecyclerView.ViewHolder>) this.f35133e);
            a((List<RecyclerView.ViewHolder>) this.h);
            dispatchAnimationsFinished();
        }
    }

    public void runPendingAnimations() {
        long j2;
        long j3;
        if (PatchProxy.isSupport(new Object[0], this, f35129a, false, 25532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35129a, false, 25532, new Class[0], Void.TYPE);
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
                if (PatchProxy.isSupport(new Object[]{next}, this, f35129a, false, 25535, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{next}, this, f35129a, false, 25535, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
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
                this.f35131c.add(arrayList);
                this.l.clear();
                AnonymousClass1 r1 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35135a;

                    public final void run() {
                        char c2 = 0;
                        if (PatchProxy.isSupport(new Object[0], this, f35135a, false, 25553, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35135a, false, 25553, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f35131c.remove(arrayList)) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                b bVar = (b) it2.next();
                                BaseItemAnimator baseItemAnimator = BaseItemAnimator.this;
                                RecyclerView.ViewHolder viewHolder = bVar.f35171a;
                                int i = bVar.f35172b;
                                int i2 = bVar.f35173c;
                                int i3 = bVar.f35174d;
                                int i4 = bVar.f35175e;
                                Object[] objArr = new Object[5];
                                objArr[c2] = viewHolder;
                                objArr[1] = Integer.valueOf(i);
                                objArr[2] = Integer.valueOf(i2);
                                objArr[3] = Integer.valueOf(i3);
                                objArr[4] = Integer.valueOf(i4);
                                ChangeQuickRedirect changeQuickRedirect = BaseItemAnimator.f35129a;
                                Class[] clsArr = new Class[5];
                                clsArr[c2] = RecyclerView.ViewHolder.class;
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                                clsArr[3] = Integer.TYPE;
                                clsArr[4] = Integer.TYPE;
                                if (PatchProxy.isSupport(objArr, baseItemAnimator, changeQuickRedirect, false, 25542, clsArr, Void.TYPE)) {
                                    c2 = 0;
                                    BaseItemAnimator baseItemAnimator2 = baseItemAnimator;
                                    PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, baseItemAnimator2, BaseItemAnimator.f35129a, false, 25542, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
                                    baseItemAnimator.f35134f.add(viewHolder);
                                    ViewPropertyAnimatorCompat animate = ViewCompat.animate(view);
                                    ViewPropertyAnimatorCompat duration = animate.setDuration(baseItemAnimator.getMoveDuration());
                                    AnonymousClass4 r9 = new VpaListenerAdapter(viewHolder, i5, i6, animate) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f35144a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ RecyclerView.ViewHolder f35145b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ int f35146c;

                                        /* renamed from: d  reason: collision with root package name */
                                        final /* synthetic */ int f35147d;

                                        /* renamed from: e  reason: collision with root package name */
                                        final /* synthetic */ ViewPropertyAnimatorCompat f35148e;

                                        public void onAnimationCancel(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f35144a, false, 25557, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f35144a, false, 25557, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            if (this.f35146c != 0) {
                                                ViewCompat.setTranslationX(view, 0.0f);
                                            }
                                            if (this.f35147d != 0) {
                                                ViewCompat.setTranslationY(view, 0.0f);
                                            }
                                        }

                                        public void onAnimationStart(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f35144a, false, 25556, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f35144a, false, 25556, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            BaseItemAnimator.this.dispatchMoveStarting(this.f35145b);
                                        }

                                        public void onAnimationEnd(View view) {
                                            if (PatchProxy.isSupport(new Object[]{view}, this, f35144a, false, 25558, new Class[]{View.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{view}, this, f35144a, false, 25558, new Class[]{View.class}, Void.TYPE);
                                                return;
                                            }
                                            this.f35148e.setListener(null);
                                            BaseItemAnimator.this.dispatchMoveFinished(this.f35145b);
                                            BaseItemAnimator.this.f35134f.remove(this.f35145b);
                                            BaseItemAnimator.this.a();
                                        }

                                        {
                                            this.f35145b = r2;
                                            this.f35146c = r3;
                                            this.f35147d = r4;
                                            this.f35148e = r5;
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
                    ViewCompat.postOnAnimationDelayed(((b) arrayList.get(0)).f35171a.itemView, r1, getRemoveDuration());
                } else {
                    r1.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.m);
                this.f35132d.add(arrayList2);
                this.m.clear();
                AnonymousClass2 r12 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35138a;

                    public final void run() {
                        View view;
                        if (PatchProxy.isSupport(new Object[0], this, f35138a, false, 25554, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35138a, false, 25554, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f35132d.remove(arrayList2)) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                a aVar = (a) it2.next();
                                BaseItemAnimator baseItemAnimator = BaseItemAnimator.this;
                                if (PatchProxy.isSupport(new Object[]{aVar}, baseItemAnimator, BaseItemAnimator.f35129a, false, 25544, new Class[]{a.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{aVar}, baseItemAnimator, BaseItemAnimator.f35129a, false, 25544, new Class[]{a.class}, Void.TYPE);
                                } else {
                                    RecyclerView.ViewHolder viewHolder = aVar.f35166b;
                                    View view2 = null;
                                    if (viewHolder == null) {
                                        view = null;
                                    } else {
                                        view = viewHolder.itemView;
                                    }
                                    RecyclerView.ViewHolder viewHolder2 = aVar.f35167c;
                                    if (viewHolder2 != null) {
                                        view2 = viewHolder2.itemView;
                                    }
                                    if (view != null) {
                                        baseItemAnimator.h.add(aVar.f35166b);
                                        ViewPropertyAnimatorCompat duration = ViewCompat.animate(view).setDuration(baseItemAnimator.getChangeDuration());
                                        duration.translationX((float) (aVar.f35170f - aVar.f35168d));
                                        duration.translationY((float) (aVar.g - aVar.f35169e));
                                        duration.alpha(0.0f).setListener(new VpaListenerAdapter(aVar, duration) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f35150a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ a f35151b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ ViewPropertyAnimatorCompat f35152c;

                                            public void onAnimationStart(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f35150a, false, 25559, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f35150a, false, 25559, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                BaseItemAnimator.this.dispatchChangeStarting(this.f35151b.f35166b, true);
                                            }

                                            public void onAnimationEnd(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f35150a, false, 25560, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f35150a, false, 25560, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                this.f35152c.setListener(null);
                                                ViewCompat.setAlpha(view, 1.0f);
                                                ViewCompat.setTranslationX(view, 0.0f);
                                                ViewCompat.setTranslationY(view, 0.0f);
                                                BaseItemAnimator.this.dispatchChangeFinished(this.f35151b.f35166b, true);
                                                BaseItemAnimator.this.h.remove(this.f35151b.f35166b);
                                                BaseItemAnimator.this.a();
                                            }

                                            {
                                                this.f35151b = r2;
                                                this.f35152c = r3;
                                            }
                                        }).start();
                                    }
                                    if (view2 != null) {
                                        baseItemAnimator.h.add(aVar.f35167c);
                                        ViewPropertyAnimatorCompat animate = ViewCompat.animate(view2);
                                        animate.translationX(0.0f).translationY(0.0f).setDuration(baseItemAnimator.getChangeDuration()).alpha(1.0f).setListener(new VpaListenerAdapter(aVar, animate, view2) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f35154a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ a f35155b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ ViewPropertyAnimatorCompat f35156c;

                                            /* renamed from: d  reason: collision with root package name */
                                            final /* synthetic */ View f35157d;

                                            public void onAnimationStart(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f35154a, false, 25561, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f35154a, false, 25561, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                BaseItemAnimator.this.dispatchChangeStarting(this.f35155b.f35167c, false);
                                            }

                                            public void onAnimationEnd(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f35154a, false, 25562, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f35154a, false, 25562, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                this.f35156c.setListener(null);
                                                ViewCompat.setAlpha(this.f35157d, 1.0f);
                                                ViewCompat.setTranslationX(this.f35157d, 0.0f);
                                                ViewCompat.setTranslationY(this.f35157d, 0.0f);
                                                BaseItemAnimator.this.dispatchChangeFinished(this.f35155b.f35167c, false);
                                                BaseItemAnimator.this.h.remove(this.f35155b.f35167c);
                                                BaseItemAnimator.this.a();
                                            }

                                            {
                                                this.f35155b = r2;
                                                this.f35156c = r3;
                                                this.f35157d = r4;
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
                    ViewCompat.postOnAnimationDelayed(((a) arrayList2.get(0)).f35166b.itemView, r12, getRemoveDuration());
                } else {
                    r12.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.k);
                this.f35130b.add(arrayList3);
                this.k.clear();
                AnonymousClass3 r13 = new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35141a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f35141a, false, 25555, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f35141a, false, 25555, new Class[0], Void.TYPE);
                        } else if (BaseItemAnimator.this.f35130b.remove(arrayList3)) {
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
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f35129a, false, 25546, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f35129a, false, 25546, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar.f35166b != null) {
            a(aVar, aVar.f35166b);
        }
        if (aVar.f35167c != null) {
            a(aVar, aVar.f35167c);
        }
    }

    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f35129a, false, 25537, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f35129a, false, 25537, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        endAnimation(viewHolder);
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f35129a, false, 25533, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f35129a, false, 25533, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else {
            b.a(viewHolder2.itemView);
        }
        this.j.add(viewHolder2);
        return true;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f35129a, false, 25536, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f35129a, false, 25536, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (viewHolder instanceof a) {
            new DefaultAddVpaListener(viewHolder);
        } else {
            c(viewHolder);
        }
        this.f35133e.add(viewHolder);
    }

    public final long e(RecyclerView.ViewHolder viewHolder) {
        if (!PatchProxy.isSupport(new Object[]{viewHolder}, this, f35129a, false, 25538, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)) {
            return Math.abs((((long) viewHolder.getOldPosition()) * getRemoveDuration()) / 4);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f35129a, false, 25538, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)).longValue();
    }

    public final long f(RecyclerView.ViewHolder viewHolder) {
        if (!PatchProxy.isSupport(new Object[]{viewHolder}, this, f35129a, false, 25540, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)) {
            return Math.abs((((long) viewHolder.getAdapterPosition()) * getAddDuration()) / 4);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f35129a, false, 25540, new Class[]{RecyclerView.ViewHolder.class}, Long.TYPE)).longValue();
    }

    private void a(List<RecyclerView.ViewHolder> list) {
        List<RecyclerView.ViewHolder> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f35129a, false, 25552, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f35129a, false, 25552, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.animate(list2.get(size).itemView).cancel();
        }
    }

    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f35129a, false, 25539, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f35129a, false, 25539, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        endAnimation(viewHolder);
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f35129a, false, 25534, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f35129a, false, 25534, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f35129a, false, 25548, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f35129a, false, 25548, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        View view = viewHolder.itemView;
        ViewCompat.animate(view).cancel();
        for (int size = this.l.size() - 1; size >= 0; size--) {
            if (this.l.get(size).f35171a == viewHolder) {
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
        for (int size2 = this.f35132d.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f35132d.get(size2);
            a((List<a>) arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f35132d.remove(size2);
            }
        }
        for (int size3 = this.f35131c.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f35131c.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f35171a == viewHolder) {
                    ViewCompat.setTranslationY(view, 0.0f);
                    ViewCompat.setTranslationX(view, 0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f35131c.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f35130b.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f35130b.get(size5);
            if (arrayList3.remove(viewHolder)) {
                b.a(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f35130b.remove(size5);
                }
            }
        }
        this.g.remove(viewHolder);
        this.f35133e.remove(viewHolder);
        this.h.remove(viewHolder);
        this.f35134f.remove(viewHolder);
        a();
    }

    private void a(List<a> list, RecyclerView.ViewHolder viewHolder) {
        List<a> list2 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{list2, viewHolder2}, this, f35129a, false, 25545, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, viewHolder2}, this, f35129a, false, 25545, new Class[]{List.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list2.get(size);
            if (a(aVar, viewHolder2) && aVar.f35166b == null && aVar.f35167c == null) {
                list2.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.ViewHolder viewHolder) {
        a aVar2 = aVar;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2, viewHolder2}, this, f35129a, false, 25547, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, viewHolder2}, this, f35129a, false, 25547, new Class[]{a.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (aVar2.f35167c == viewHolder2) {
            aVar2.f35167c = null;
        } else if (aVar2.f35166b == viewHolder2) {
            aVar2.f35166b = null;
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
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35129a, false, 25541, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35129a, false, 25541, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
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
        if (PatchProxy.isSupport(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35129a, false, 25543, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder3, viewHolder4, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f35129a, false, 25543, new Class[]{RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (viewHolder3 == viewHolder4) {
            return animateMove(viewHolder, i2, i3, i4, i5);
        } else {
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
}
