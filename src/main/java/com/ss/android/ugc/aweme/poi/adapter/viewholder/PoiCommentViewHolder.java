package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.util.m;
import com.ss.android.ugc.aweme.poi.adapter.PoiCommentImageAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.e.f;
import com.ss.android.ugc.aweme.poi.e.g;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.ui.comment.CommentImageDecoration;
import com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentPresenter;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

public class PoiCommentViewHolder extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59524a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59525b;

    /* renamed from: c  reason: collision with root package name */
    public View f59526c;

    /* renamed from: d  reason: collision with root package name */
    public o f59527d;

    /* renamed from: e  reason: collision with root package name */
    Rect f59528e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    int[] f59529f = new int[2];
    public c g;
    public PoiCommentPresenter h;
    protected a i;
    private boolean j;
    private l k;
    private m l = new m() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59530a;

        public final void a(int i) {
        }

        public final void b() {
        }

        public final void f() {
            if (PatchProxy.isSupport(new Object[0], this, f59530a, false, 64813, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59530a, false, 64813, new Class[0], Void.TYPE);
                return;
            }
            PoiCommentViewHolder.this.a();
        }

        public final void g() {
            if (PatchProxy.isSupport(new Object[0], this, f59530a, false, 64814, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59530a, false, 64814, new Class[0], Void.TYPE);
                return;
            }
            PoiCommentViewHolder.this.b();
        }

        public final Rect a() {
            if (PatchProxy.isSupport(new Object[0], this, f59530a, false, 64815, new Class[0], Rect.class)) {
                return (Rect) PatchProxy.accessDispatch(new Object[0], this, f59530a, false, 64815, new Class[0], Rect.class);
            }
            PoiCommentViewHolder poiCommentViewHolder = PoiCommentViewHolder.this;
            if (PatchProxy.isSupport(new Object[0], poiCommentViewHolder, PoiCommentViewHolder.f59524a, false, 64811, new Class[0], Rect.class)) {
                return (Rect) PatchProxy.accessDispatch(new Object[0], poiCommentViewHolder, PoiCommentViewHolder.f59524a, false, 64811, new Class[0], Rect.class);
            }
            poiCommentViewHolder.itemView.getLocationOnScreen(poiCommentViewHolder.f59529f);
            poiCommentViewHolder.f59528e.set(poiCommentViewHolder.f59529f[0], poiCommentViewHolder.f59529f[1], poiCommentViewHolder.f59529f[0] + poiCommentViewHolder.itemView.getWidth(), poiCommentViewHolder.f59529f[1] + poiCommentViewHolder.itemView.getHeight());
            return poiCommentViewHolder.f59528e;
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f59530a, false, 64812, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59530a, false, 64812, new Class[0], Void.TYPE);
                return;
            }
            h.b(PoiCommentViewHolder.this.g, "show", d.a().a("enter_from", "poi_page").a("previous_page", PoiCommentViewHolder.this.g.getPreviousPage()).a("poi_id", PoiCommentViewHolder.this.g.getPoiId()).a("content_type", "comment"));
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59524a, false, 64809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59524a, false, 64809, new Class[0], Void.TYPE);
        } else if (this.j) {
            f c2 = c();
            if (c2 != null) {
                c2.a();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59524a, false, 64810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59524a, false, 64810, new Class[0], Void.TYPE);
        } else if (this.j) {
            f c2 = c();
            if (c2 != null) {
                c2.b();
            }
        }
    }

    private f c() {
        String str;
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f59524a, false, 64808, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f59524a, false, 64808, new Class[0], f.class);
        }
        g a2 = g.a();
        String e2 = this.i.e();
        String commentId = this.f59527d.getCommentId();
        if (PatchProxy.isSupport(new Object[]{e2, commentId}, null, f.f59785a, true, 66818, new Class[]{String.class, String.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{e2, commentId}, null, f.f59785a, true, 66818, new Class[]{String.class, String.class}, String.class);
        } else {
            str = e2 + "_" + commentId;
        }
        if (PatchProxy.isSupport(new Object[]{str}, a2, g.f59789a, false, 66825, new Class[]{String.class}, f.class)) {
            fVar = (f) PatchProxy.accessDispatch(new Object[]{str}, a2, g.f59789a, false, 66825, new Class[]{String.class}, f.class);
        } else if (a2.f59790b.isEmpty()) {
            fVar = null;
        } else {
            fVar = a2.f59790b.get(str);
        }
        if (fVar == null) {
            String a3 = com.ss.android.ugc.aweme.newfollow.util.d.a(this.i.e(), this.f59527d.getCommentId());
            o oVar = this.f59527d;
            a.C0670a b2 = new a.C0670a().b(this.g.getPoiId());
            b2.n = this.g.getPoiChannel();
            f fVar2 = new f(oVar, b2.e(this.g.getPreviousPage()).a(this.g).a());
            g a4 = g.a();
            if (PatchProxy.isSupport(new Object[]{a3, fVar2}, a4, g.f59789a, false, 66822, new Class[]{String.class, f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a3, fVar2}, a4, g.f59789a, false, 66822, new Class[]{String.class, f.class}, Void.TYPE);
            } else {
                a4.f59790b.put(a3, fVar2);
            }
            fVar = fVar2;
        }
        return fVar;
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59524a, false, 64806, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59524a, false, 64806, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.k.a(this.l);
        a();
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59524a, false, 64807, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59524a, false, 64807, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b();
        this.k.b(this.l);
    }

    public PoiCommentViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, boolean z) {
        super(followFeedLayout);
        this.j = z;
        this.i = aVar;
        this.k = lVar;
        this.f59526c = followFeedLayout;
        this.f59525b = followFeedLayout.getContext();
        this.h = new PoiCommentPresenter();
        PoiCommentPresenter poiCommentPresenter = this.h;
        if (PatchProxy.isSupport(new Object[]{followFeedLayout}, poiCommentPresenter, PoiCommentPresenter.f60579a, false, 66280, new Class[]{View.class}, Void.TYPE)) {
            PoiCommentPresenter poiCommentPresenter2 = poiCommentPresenter;
            PatchProxy.accessDispatch(new Object[]{followFeedLayout}, poiCommentPresenter2, PoiCommentPresenter.f60579a, false, 66280, new Class[]{View.class}, Void.TYPE);
        } else {
            poiCommentPresenter.f60582d = ButterKnife.bind((Object) poiCommentPresenter, (View) followFeedLayout);
            poiCommentPresenter.f60581c = followFeedLayout.getContext();
            if (PatchProxy.isSupport(new Object[0], poiCommentPresenter, PoiCommentPresenter.f60579a, false, 66281, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], poiCommentPresenter, PoiCommentPresenter.f60579a, false, 66281, new Class[0], Void.TYPE);
            } else {
                WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(poiCommentPresenter.f60581c, 3);
                wrapGridLayoutManager.setOrientation(1);
                wrapGridLayoutManager.setItemPrefetchEnabled(true);
                poiCommentPresenter.mImagesList.setLayoutManager(wrapGridLayoutManager);
                poiCommentPresenter.mImagesList.setHasFixedSize(true);
                poiCommentPresenter.f60580b = new PoiCommentImageAdapter(poiCommentPresenter.f60581c, poiCommentPresenter.mImagesList);
                poiCommentPresenter.mImagesList.setAdapter(poiCommentPresenter.f60580b);
                poiCommentPresenter.f60583e = (int) UIUtils.dip2Px(poiCommentPresenter.f60581c, 4.0f);
                poiCommentPresenter.mImagesList.addItemDecoration(new CommentImageDecoration(3, poiCommentPresenter.f60583e));
            }
        }
        followFeedLayout.setOnAttachStateChangeListener(this);
    }
}
