package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseDialogFragment;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.SelectedPromotionAdapter;
import com.bytedance.android.livesdk.livecommerce.broadcast.c;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.PromotionTouchHelperCallback;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.dialog.ECAlertDialog;
import com.bytedance.android.livesdk.livecommerce.dialog.ECBottomDialog;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdk.livecommerce.view.ECHostCloseButton2;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class SelectedPromotionFragment extends ECBaseDialogFragment<SelectedPromotionViewModel> implements View.OnClickListener {
    public static ChangeQuickRedirect i;
    public RecyclerView j;
    public SelectedPromotionAdapter k;
    public c l;
    private TextView m;
    private View n;
    private LinearLayoutManager o;
    private ItemTouchHelper p;
    private ECHostCloseButton2 q;
    private TextView r;
    private View s;
    private float t;

    public final int a() {
        return C0906R.layout.ld;
    }

    public final int a(ECBottomDialog eCBottomDialog) {
        return -1;
    }

    public final boolean d() {
        return true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10638, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            if (this.l.c() == 0) {
                this.n.setVisibility(0);
                this.j.setVisibility(8);
                return;
            }
            this.n.setVisibility(8);
            this.j.setVisibility(0);
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, i, false, 10639, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, i, false, 10639, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (!(context == null || this.l == null)) {
            int c2 = this.l.c();
            this.m.setText(context.getResources().getString(C0906R.string.a_5, new Object[]{Integer.valueOf(c2)}));
            if (c2 > 0) {
                this.r.setVisibility(0);
                return;
            }
            this.r.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, i, false, 10641, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, i, false, 10641, new Class[]{View.class}, Void.TYPE);
        } else if (view == this.r) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                ECAlertDialog eCAlertDialog = new ECAlertDialog(activity);
                eCAlertDialog.setTitle((int) C0906R.string.a8t);
                eCAlertDialog.a(C0906R.string.a8z, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16111a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16111a, false, 10646, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16111a, false, 10646, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        SelectedPromotionViewModel selectedPromotionViewModel = (SelectedPromotionViewModel) SelectedPromotionFragment.this.h;
                        if (PatchProxy.isSupport(new Object[0], selectedPromotionViewModel, SelectedPromotionViewModel.f16115f, false, 10653, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], selectedPromotionViewModel, SelectedPromotionViewModel.f16115f, false, 10653, new Class[0], Void.TYPE);
                        } else {
                            if (selectedPromotionViewModel.g != null) {
                                selectedPromotionViewModel.g.b();
                            }
                            selectedPromotionViewModel.g().postValue(null);
                        }
                        dialogInterface.dismiss();
                        SelectedPromotionFragment.this.dismiss();
                    }
                });
                eCAlertDialog.b(C0906R.string.a_4, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16113a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16113a, false, 10647, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16113a, false, 10647, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                });
                eCAlertDialog.show();
            }
        } else {
            if (view == this.q) {
                dismiss();
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 10636, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 10636, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10637, new Class[0], Void.TYPE);
        } else {
            View view = getView();
            if (view != null) {
                this.t = UIUtils.dip2Px(view.getContext().getApplicationContext(), 50.0f);
                this.m = (TextView) view.findViewById(C0906R.id.dkk);
                this.r = (TextView) view.findViewById(C0906R.id.d_j);
                Context context = getContext();
                if (a.a()) {
                    this.r.setTextSize(1, 14.0f);
                    if (context != null) {
                        this.r.setTextColor(context.getResources().getColor(C0906R.color.l8));
                        this.r.setTypeface(Typeface.DEFAULT_BOLD);
                    }
                }
                a(context);
                this.n = view.findViewById(C0906R.id.bu8);
                this.j = (RecyclerView) view.findViewById(C0906R.id.cis);
                this.o = new LinearLayoutManager(getActivity());
                this.j.setLayoutManager(this.o);
                this.k = new SelectedPromotionAdapter((SelectedPromotionViewModel) this.h);
                if (this.l != null) {
                    List<e> a2 = this.l.a();
                    this.k.f16018b = a2;
                    this.p = new ItemTouchHelper(new PromotionTouchHelperCallback(this.k, a2, new PromotionTouchHelperCallback.a() {
                        public final boolean a() {
                            return true;
                        }
                    }));
                    this.p.attachToRecyclerView(this.j);
                    this.j.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                            return false;
                        }

                        public void onRequestDisallowInterceptTouchEvent(boolean z) {
                        }

                        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                        }
                    });
                }
                this.j.setAdapter(this.k);
                h();
                this.q = (ECHostCloseButton2) view.findViewById(C0906R.id.b00);
                this.q.a();
                this.s = view.findViewById(C0906R.id.dqq);
                if (!a.a()) {
                    this.s.setVisibility(8);
                }
                this.q.setOnClickListener(this);
                this.r.setOnClickListener(this);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10640, new Class[0], Void.TYPE);
        } else {
            ((SelectedPromotionViewModel) this.h).g().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16105a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16105a, false, 10643, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16105a, false, 10643, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    SelectedPromotionFragment.this.k.f16018b = SelectedPromotionFragment.this.l.a();
                    SelectedPromotionFragment.this.k.notifyDataSetChanged();
                    SelectedPromotionFragment.this.a(SelectedPromotionFragment.this.getContext());
                    SelectedPromotionFragment.this.h();
                }
            });
            ((SelectedPromotionViewModel) this.h).f().observe(this, new Observer<com.bytedance.android.livesdk.livecommerce.c.c>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16107a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    com.bytedance.android.livesdk.livecommerce.c.c cVar = (com.bytedance.android.livesdk.livecommerce.c.c) obj;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f16107a, false, 10644, new Class[]{com.bytedance.android.livesdk.livecommerce.c.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f16107a, false, 10644, new Class[]{com.bytedance.android.livesdk.livecommerce.c.c.class}, Void.TYPE);
                        return;
                    }
                    if (cVar != null) {
                        int i2 = cVar.f16123a;
                        int i3 = cVar.f16124b;
                        if (i2 >= 0 && i3 >= 0 && i2 != i3) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) SelectedPromotionFragment.this.j.getLayoutManager();
                            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                            if (findFirstCompletelyVisibleItemPosition >= 0) {
                                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                                i = linearLayoutManager.getDecoratedTop(findViewByPosition) - linearLayoutManager.getTopDecorationHeight(findViewByPosition);
                            }
                            SelectedPromotionFragment.this.k.notifyItemMoved(i2, i3);
                            if (findFirstCompletelyVisibleItemPosition >= 0) {
                                linearLayoutManager.scrollToPositionWithOffset(findFirstCompletelyVisibleItemPosition, i);
                            }
                            SelectedPromotionFragment.this.j.post(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f16109a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f16109a, false, 10645, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f16109a, false, 10645, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (SelectedPromotionFragment.this.j != null && SelectedPromotionFragment.this.j.isAttachedToWindow()) {
                                        RecyclerView.ItemAnimator itemAnimator = SelectedPromotionFragment.this.j.getItemAnimator();
                                        if (itemAnimator == null || !itemAnimator.isRunning(null)) {
                                            SelectedPromotionFragment.this.k.notifyDataSetChanged();
                                            return;
                                        }
                                        SelectedPromotionFragment.this.j.post(this);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        ((SelectedPromotionViewModel) this.h).g = this.l;
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        TranslateAnimation translateAnimation;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3)}, this, i, false, 10642, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3)}, this, i, false, 10642, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Animation.class);
        }
        if (z) {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        }
        translateAnimation.setDuration(300);
        return translateAnimation;
    }
}
