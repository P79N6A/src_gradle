package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import android.widget.Button;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.im.sdk.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.b;
import com.ss.android.ugc.aweme.im.sdk.chat.input.p;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.HorizontalSpaceItemDecoration;
import java.util.List;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50825d;

    /* renamed from: e  reason: collision with root package name */
    public Button f50826e;

    /* renamed from: f  reason: collision with root package name */
    public View f50827f;
    public View g;
    public View h;
    public View i;
    public RecyclerView j;
    public HorizonPhotoSelectAdapter k;
    public p l;
    public m m = m.a();
    public IInputView n;
    private View q;
    private View r;
    private View s;

    public final int d() {
        return C0906R.layout.a1p;
    }

    public final Context e() {
        if (!PatchProxy.isSupport(new Object[0], this, f50825d, false, 50952, new Class[0], Context.class)) {
            return this.f50435b.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f50825d, false, 50952, new Class[0], Context.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50825d, false, 50955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50825d, false, 50955, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.q = this.f50435b.findViewById(C0906R.id.bxy);
        this.r = this.f50435b.findViewById(C0906R.id.bxp);
        this.s = this.f50435b.findViewById(C0906R.id.bxx);
        this.j = (RecyclerView) this.f50435b.findViewById(C0906R.id.by1);
        this.j.setLayoutManager(new LinearLayoutManager(e(), 0, false));
        this.j.addItemDecoration(new HorizontalSpaceItemDecoration((int) UIUtils.dip2Px(e(), 3.0f)));
        this.j.addOnScrollListener(new FrescoRecycleViewScrollListener(e()));
        RecyclerView.ItemAnimator itemAnimator = this.j.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.f50827f = this.f50435b.findViewById(C0906R.id.dy);
        this.f50826e = (Button) this.f50435b.findViewById(C0906R.id.by2);
        this.g = this.f50435b.findViewById(C0906R.id.a9r);
        this.h = this.f50435b.findViewById(C0906R.id.mh);
        this.i = this.f50435b.findViewById(C0906R.id.co0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50825d, false, 50956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50825d, false, 50956, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        if (PatchProxy.isSupport(new Object[0], this, f50825d, false, 50958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50825d, false, 50958, new Class[0], Void.TYPE);
        } else if (this.l == null) {
            this.l = new p() {

                /* renamed from: b  reason: collision with root package name */
                public static ChangeQuickRedirect f50828b;

                public final void onClick(View view) {
                    int i;
                    View view2 = view;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f50828b, false, 50961, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f50828b, false, 50961, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (view2.equals(c.this.f50827f)) {
                        if (c.this.f50436c != null) {
                            c.this.f50436c.a();
                            z a2 = z.a();
                            if (PatchProxy.isSupport(new Object[0], a2, z.f52670a, false, 53600, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], a2, z.f52670a, false, 53600, new Class[0], Void.TYPE);
                            } else {
                                r.onEvent(MobClick.obtain().setEventName("click_album").setLabelName("chat"));
                            }
                        }
                    } else if (view2.equals(c.this.f50826e)) {
                        if (c.this.n == null) {
                            c.this.n = new d(c.this.f50436c, c.this.f50826e.getContext());
                        }
                        c.this.n.a(c.this.m.b());
                        c.this.m.e();
                    } else if (view.getId() == C0906R.id.cn3) {
                        Object tag = view.getTag();
                        if (tag instanceof i) {
                            i iVar = (i) tag;
                            if (view.isSelected()) {
                                c.this.m.b(iVar);
                            } else if (c.this.m.c() >= m.f50859b) {
                                UIUtils.displayToast(c.this.e(), (int) C0906R.string.axf);
                                return;
                            } else {
                                c.this.m.a(iVar);
                            }
                            iVar.f50848c = true;
                            view2.setSelected(!view.isSelected());
                            c.this.k.notifyItemRangeChanged(0, c.this.k.getItemCount(), "selectedStateChanged");
                            Button button = c.this.f50826e;
                            if (c.this.m.c() <= 0) {
                                z = false;
                            }
                            button.setEnabled(z);
                            c.this.f50826e.setText(c.this.m.d());
                            if (c.this.f50826e.isEnabled()) {
                                c.this.f50826e.setTextColor(c.this.e().getResources().getColor(C0906R.color.rk));
                            } else {
                                c.this.f50826e.setTextColor(c.this.e().getResources().getColor(C0906R.color.q7));
                            }
                        }
                    } else if (view.getId() == C0906R.id.bxr) {
                        Object tag2 = view.getTag();
                        if (tag2 instanceof i) {
                            IInputView iInputView = c.this.f50436c;
                            List<i> list = c.this.k.f50738d;
                            HorizonPhotoSelectAdapter horizonPhotoSelectAdapter = c.this.k;
                            i iVar2 = (i) tag2;
                            if (PatchProxy.isSupport(new Object[]{iVar2}, horizonPhotoSelectAdapter, HorizonPhotoSelectAdapter.f50735a, false, 50937, new Class[]{i.class}, Integer.TYPE)) {
                                HorizonPhotoSelectAdapter horizonPhotoSelectAdapter2 = horizonPhotoSelectAdapter;
                                i = ((Integer) PatchProxy.accessDispatch(new Object[]{iVar2}, horizonPhotoSelectAdapter2, HorizonPhotoSelectAdapter.f50735a, false, 50937, new Class[]{i.class}, Integer.TYPE)).intValue();
                            } else if (iVar2 == null || horizonPhotoSelectAdapter.f50738d == null || !horizonPhotoSelectAdapter.f50738d.contains(iVar2)) {
                                i = -1;
                            } else {
                                i = horizonPhotoSelectAdapter.f50738d.indexOf(iVar2);
                            }
                            iInputView.a(list, i);
                        }
                    } else if (view.getId() == C0906R.id.bxy) {
                        k.a().a((Activity) view.getContext(), new a<Boolean>() {
                            public final /* bridge */ /* synthetic */ void run(Object obj) {
                            }
                        });
                    } else if (view.getId() == C0906R.id.co0) {
                        c.this.i.setSelected(!c.this.i.isSelected());
                        c.this.m.f50861c = c.this.i.isSelected();
                    }
                }
            };
        }
        p.a((View.OnClickListener) this.l, this.q, this.f50827f, this.f50826e, this.i);
        a(this.q, this.f50826e, this.f50827f, this.i);
    }

    public final void f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f50825d, false, 50957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50825d, false, 50957, new Class[0], Void.TYPE);
            return;
        }
        this.f50826e.setText(this.m.d());
        this.i.setSelected(this.m.f50861c);
        Button button = this.f50826e;
        if (this.m.c() > 0) {
            z = true;
        }
        button.setEnabled(z);
        Resources resources = GlobalContext.getContext().getResources();
        if (this.f50826e.isEnabled()) {
            this.f50826e.setTextColor(resources.getColor(C0906R.color.rk));
        } else {
            this.f50826e.setTextColor(resources.getColor(C0906R.color.q7));
        }
        if (this.k != null) {
            this.m.f50862d = this.k.f50738d;
            this.k.notifyDataSetChanged();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50825d, false, 50954, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50825d, false, 50954, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.g.setVisibility(0);
        this.j.setVisibility(8);
        if (z) {
            this.r.setVisibility(0);
            this.q.setVisibility(0);
            this.s.setVisibility(8);
            return;
        }
        this.r.setVisibility(8);
        this.q.setVisibility(8);
        this.s.setVisibility(0);
    }

    public c(Context context, IInputView iInputView) {
        super(context, iInputView);
    }
}
