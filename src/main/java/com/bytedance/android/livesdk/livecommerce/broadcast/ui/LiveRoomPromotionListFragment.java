package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.b;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseDialogFragment;
import com.bytedance.android.livesdk.livecommerce.broadcast.a;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.DataBinderAdapter;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.IronLivePromotionAdapter;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.LiveRoomPromotionAdapter;
import com.bytedance.android.livesdk.livecommerce.broadcast.b;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.LiveRoomPromotionListViewModel;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.PromotionTouchHelperCallback;
import com.bytedance.android.livesdk.livecommerce.c;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.k;
import com.bytedance.android.livesdk.livecommerce.dialog.ECAlertDialog;
import com.bytedance.android.livesdk.livecommerce.dialog.ECBottomDialog;
import com.bytedance.android.livesdk.livecommerce.view.ECHostAddButton;
import com.bytedance.android.livesdk.livecommerce.view.ECHostCloseButton2;
import com.bytedance.android.livesdk.livecommerce.view.ECHostLiveNoPromotionLayout;
import com.bytedance.android.livesdk.livecommerce.view.ECLoadingStateView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class LiveRoomPromotionListFragment extends ECBaseDialogFragment<LiveRoomPromotionListViewModel> implements View.OnClickListener, ECBottomDialog.a {
    public static ChangeQuickRedirect i;
    public RecyclerView j;
    public DataBinderAdapter k;
    public ECHostAddButton l;
    public TextView m;
    public String n = "";
    private TextView o;
    private ECHostLiveNoPromotionLayout p;
    private ECLoadingStateView q;
    private LinearLayoutManager r;
    private ItemTouchHelper s;
    private ECHostCloseButton2 t;
    private float u;
    private String v;
    private String w;

    public final int a() {
        return C0906R.layout.lc;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10581, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        this.q.a();
        this.p.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10585, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 10585, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getDialog() != null && getDialog().isShowing()) {
            z = true;
        }
        return z;
    }

    public final boolean j() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 10587, new Class[0], Boolean.TYPE)) {
            return k();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 10587, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10588, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 10588, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k == null || !((LiveRoomPromotionListViewModel) this.h).k || TextUtils.equals(this.k.a(), this.n)) {
            return false;
        } else {
            if (getActivity() != null) {
                ECAlertDialog eCAlertDialog = new ECAlertDialog(getActivity());
                eCAlertDialog.setTitle((int) C0906R.string.a8w);
                eCAlertDialog.a(C0906R.string.a8v, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16069a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16069a, false, 10590, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16069a, false, 10590, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                        LiveRoomPromotionListFragment.this.dismiss();
                    }
                });
                eCAlertDialog.b(C0906R.string.a_4, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16071a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16071a, false, 10591, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16071a, false, 10591, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                });
                eCAlertDialog.show();
            }
            return true;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10583, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10583, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        this.q.b();
        this.p.setVisibility(8);
        this.j.setVisibility(8);
        if (((LiveRoomPromotionListViewModel) this.h).k) {
            this.m.setVisibility(8);
            this.l.setVisibility(8);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10579, new Class[0], Void.TYPE);
            return;
        }
        this.k.notifyDataSetChanged();
        int itemCount = this.k.getItemCount();
        if (itemCount > 0) {
            this.p.setVisibility(8);
            this.j.setVisibility(0);
            if (((LiveRoomPromotionListViewModel) this.h).k) {
                this.m.setVisibility(0);
                if (((LiveRoomPromotionListViewModel) this.h).j_()) {
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
            } else {
                this.m.setVisibility(8);
            }
        } else {
            this.p.setVisibility(0);
            this.j.setVisibility(8);
            this.m.setVisibility(8);
            this.l.setVisibility(8);
        }
        a(itemCount);
    }

    public final void f() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10582, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10582, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(8);
        this.n = this.k.a();
        LiveRoomPromotionListViewModel liveRoomPromotionListViewModel = (LiveRoomPromotionListViewModel) this.h;
        if (PatchProxy.isSupport(new Object[0], liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10610, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10610, new Class[0], Integer.TYPE)).intValue();
        } else {
            b bVar = liveRoomPromotionListViewModel.g;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f16027a, false, 10480, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], bVar, b.f16027a, false, 10480, new Class[0], Integer.TYPE)).intValue();
            } else {
                if (!TextUtils.isEmpty(bVar.f16029c)) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bVar.f16028b.size()) {
                            break;
                        }
                        e eVar = bVar.f16028b.get(i3);
                        if (eVar != null && TextUtils.equals(bVar.f16029c, eVar.m)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                i2 = -1;
            }
        }
        if (i2 > 0) {
            ((LinearLayoutManager) this.j.getLayoutManager()).scrollToPositionWithOffset(i2, 0);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 10580, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 10580, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.o != null) {
            if (((LiveRoomPromotionListViewModel) this.h).k) {
                this.o.setText(getResources().getString(C0906R.string.a9_, new Object[]{Integer.valueOf(i2)}));
                return;
            }
            this.o.setText(getResources().getString(C0906R.string.a_6, new Object[]{Integer.valueOf(i2)}));
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 10575, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 10575, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        if (bundle != null) {
            this.v = bundle.getString("broadcast_id");
            this.w = bundle.getString("room_id");
        }
    }

    public void onClick(View view) {
        ChoosePromotionFragment choosePromotionFragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, i, false, 10584, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, i, false, 10584, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 == this.l) {
            LiveRoomPromotionListViewModel liveRoomPromotionListViewModel = (LiveRoomPromotionListViewModel) this.h;
            String str = this.v;
            FragmentManager fragmentManager = getFragmentManager();
            if (PatchProxy.isSupport(new Object[]{str, fragmentManager}, liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10618, new Class[]{String.class, FragmentManager.class}, Void.TYPE)) {
                LiveRoomPromotionListViewModel liveRoomPromotionListViewModel2 = liveRoomPromotionListViewModel;
                PatchProxy.accessDispatch(new Object[]{str, fragmentManager}, liveRoomPromotionListViewModel2, LiveRoomPromotionListViewModel.f16083f, false, 10618, new Class[]{String.class, FragmentManager.class}, Void.TYPE);
            } else {
                String a2 = liveRoomPromotionListViewModel.a();
                List<e> list = liveRoomPromotionListViewModel.g.f16028b;
                LiveRoomPromotionListViewModel.AnonymousClass6 r6 = new a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16097a;

                    public final void a(List<e> list) {
                        List<e> list2 = list;
                        if (PatchProxy.isSupport(new Object[]{list2}, this, f16097a, false, 10629, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list2}, this, f16097a, false, 10629, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        if (list2 != null) {
                            LiveRoomPromotionListViewModel liveRoomPromotionListViewModel = LiveRoomPromotionListViewModel.this;
                            if (PatchProxy.isSupport(new Object[]{list2}, liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10617, new Class[]{List.class}, Void.TYPE)) {
                                LiveRoomPromotionListViewModel liveRoomPromotionListViewModel2 = liveRoomPromotionListViewModel;
                                PatchProxy.accessDispatch(new Object[]{list2}, liveRoomPromotionListViewModel2, LiveRoomPromotionListViewModel.f16083f, false, 10617, new Class[]{List.class}, Void.TYPE);
                                return;
                            }
                            b bVar = liveRoomPromotionListViewModel.g;
                            if (PatchProxy.isSupport(new Object[]{list2}, bVar, b.f16027a, false, 10478, new Class[]{List.class}, Void.TYPE)) {
                                Object[] objArr = {list2};
                                Object[] objArr2 = objArr;
                                b bVar2 = bVar;
                                PatchProxy.accessDispatch(objArr2, bVar2, b.f16027a, false, 10478, new Class[]{List.class}, Void.TYPE);
                            } else {
                                if (list2 != null) {
                                    bVar.f16028b.clear();
                                    bVar.f16028b.addAll(list2);
                                }
                                bVar.a();
                            }
                            liveRoomPromotionListViewModel.g().postValue(null);
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{str, a2, list, r6}, null, ChoosePromotionFragment.i, true, 10532, new Class[]{String.class, String.class, List.class, a.class}, ChoosePromotionFragment.class)) {
                    choosePromotionFragment = (ChoosePromotionFragment) PatchProxy.accessDispatch(new Object[]{str, a2, list, r6}, null, ChoosePromotionFragment.i, true, 10532, new Class[]{String.class, String.class, List.class, a.class}, ChoosePromotionFragment.class);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("bundle_user_id", str);
                    bundle.putString("bundle_explain_promotion_id", a2);
                    choosePromotionFragment = ChoosePromotionFragment.a(bundle, list, (a) r6);
                }
                choosePromotionFragment.show(fragmentManager, "live_choose_promotion");
            }
        } else if (view2 == this.m) {
            if (((LiveRoomPromotionListViewModel) this.h).j_()) {
                ((LiveRoomPromotionListViewModel) this.h).a(false, (k<Void>) new k<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16066a;

                    public final /* synthetic */ void a(Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f16066a, false, 10599, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f16066a, false, 10599, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        LiveRoomPromotionListFragment.this.n = LiveRoomPromotionListFragment.this.k.a();
                        LiveRoomPromotionListFragment.this.m.setText(C0906R.string.a9d);
                        LiveRoomPromotionListFragment.this.l.setVisibility(8);
                        LiveRoomPromotionListFragment.this.h();
                    }

                    public final void a(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f16066a, false, 10600, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f16066a, false, 10600, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        ((LiveRoomPromotionListViewModel) LiveRoomPromotionListFragment.this.h).a((int) C0906R.string.a9u);
                    }
                });
                return;
            }
            this.m.setText(C0906R.string.a95);
            ((LiveRoomPromotionListViewModel) this.h).a(true, (k<Void>) null);
            this.l.setVisibility(0);
            this.n = this.k.a();
            this.k.notifyDataSetChanged();
        } else if (view2 == this.t && !k()) {
            dismiss();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 10576, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 10576, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        LiveRoomPromotionListViewModel liveRoomPromotionListViewModel = (LiveRoomPromotionListViewModel) this.h;
        String str = this.v;
        String str2 = this.w;
        if (PatchProxy.isSupport(new Object[]{str, str2}, liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10606, new Class[]{String.class, String.class}, Void.TYPE)) {
            LiveRoomPromotionListViewModel liveRoomPromotionListViewModel2 = liveRoomPromotionListViewModel;
            PatchProxy.accessDispatch(new Object[]{str, str2}, liveRoomPromotionListViewModel2, LiveRoomPromotionListViewModel.f16083f, false, 10606, new Class[]{String.class, String.class}, Void.TYPE);
        } else {
            liveRoomPromotionListViewModel.i = str;
            liveRoomPromotionListViewModel.j = str2;
            liveRoomPromotionListViewModel.k = TextUtils.equals(c.a(), str);
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10577, new Class[0], Void.TYPE);
        } else {
            View view = getView();
            if (view != null) {
                this.o = (TextView) view.findViewById(C0906R.id.de2);
                this.m = (TextView) view.findViewById(C0906R.id.dea);
                this.t = (ECHostCloseButton2) view.findViewById(C0906R.id.b00);
                this.t.a();
                this.p = (ECHostLiveNoPromotionLayout) view.findViewById(C0906R.id.bu7);
                if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    this.m.setTextSize(1, 14.0f);
                    this.m.setTextColor(view.getContext().getResources().getColor(C0906R.color.l8));
                } else {
                    this.m.setTextSize(1, 15.0f);
                }
                Context context = getContext();
                if (context != null) {
                    a(0);
                    this.u = UIUtils.dip2Px(view.getContext().getApplicationContext(), 50.0f);
                    this.j = (RecyclerView) view.findViewById(C0906R.id.cis);
                    this.r = new LinearLayoutManager(getActivity());
                    this.j.setLayoutManager(this.r);
                    if (((LiveRoomPromotionListViewModel) this.h).k) {
                        this.k = new LiveRoomPromotionAdapter((LiveRoomPromotionListViewModel) this.h);
                        if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                            this.o.setTextSize(1, 15.0f);
                            this.o.setTextColor(context.getResources().getColor(C0906R.color.l8));
                        }
                    } else {
                        this.k = new IronLivePromotionAdapter((LiveRoomPromotionListViewModel) this.h);
                        this.t.setVisibility(8);
                        this.m.setVisibility(8);
                        this.o.setTypeface(Typeface.defaultFromStyle(1));
                        if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                            this.o.setTextColor(getResources().getColor(C0906R.color.l8));
                        } else {
                            this.o.setTextColor(getResources().getColor(C0906R.color.l5));
                        }
                        this.o.setTextSize(1, 13.0f);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 19;
                        layoutParams.leftMargin = com.bytedance.android.livesdk.livecommerce.f.a.a(getContext(), 16.0f);
                        this.o.setLayoutParams(layoutParams);
                        ECHostLiveNoPromotionLayout eCHostLiveNoPromotionLayout = this.p;
                        if (PatchProxy.isSupport(new Object[0], eCHostLiveNoPromotionLayout, ECHostLiveNoPromotionLayout.f16251a, false, 10784, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], eCHostLiveNoPromotionLayout, ECHostLiveNoPromotionLayout.f16251a, false, 10784, new Class[0], Void.TYPE);
                        } else {
                            eCHostLiveNoPromotionLayout.f16252b.setText(C0906R.string.a99);
                            eCHostLiveNoPromotionLayout.f16252b.setTypeface(Typeface.DEFAULT_BOLD);
                            if (eCHostLiveNoPromotionLayout.f16253c != null) {
                                eCHostLiveNoPromotionLayout.f16253c.setVisibility(8);
                            }
                            eCHostLiveNoPromotionLayout.f16254d.setVisibility(8);
                        }
                    }
                }
                LiveRoomPromotionListViewModel liveRoomPromotionListViewModel3 = (LiveRoomPromotionListViewModel) this.h;
                DataBinderAdapter dataBinderAdapter = this.k;
                if (PatchProxy.isSupport(new Object[]{dataBinderAdapter}, liveRoomPromotionListViewModel3, LiveRoomPromotionListViewModel.f16083f, false, 10605, new Class[]{com.bytedance.android.livesdk.livecommerce.broadcast.adapter.b.class}, Void.TYPE)) {
                    LiveRoomPromotionListViewModel liveRoomPromotionListViewModel4 = liveRoomPromotionListViewModel3;
                    PatchProxy.accessDispatch(new Object[]{dataBinderAdapter}, liveRoomPromotionListViewModel4, LiveRoomPromotionListViewModel.f16083f, false, 10605, new Class[]{com.bytedance.android.livesdk.livecommerce.broadcast.adapter.b.class}, Void.TYPE);
                } else {
                    dataBinderAdapter.a(liveRoomPromotionListViewModel3.g.f16028b);
                }
                this.s = new ItemTouchHelper(new PromotionTouchHelperCallback(this.k, ((LiveRoomPromotionListViewModel) this.h).g.f16028b, new PromotionTouchHelperCallback.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16060a;

                    public final boolean a() {
                        if (!PatchProxy.isSupport(new Object[0], this, f16060a, false, 10589, new Class[0], Boolean.TYPE)) {
                            return ((LiveRoomPromotionListViewModel) LiveRoomPromotionListFragment.this.h).j_();
                        }
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f16060a, false, 10589, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                }));
                this.s.attachToRecyclerView(this.j);
                this.j.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                        return false;
                    }

                    public void onRequestDisallowInterceptTouchEvent(boolean z) {
                    }

                    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                    }
                });
                this.j.setAdapter(this.k);
                this.p.setOnAddButtonClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16073a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f16073a, false, 10592, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f16073a, false, 10592, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        if (LiveRoomPromotionListFragment.this.l != null) {
                            LiveRoomPromotionListFragment.this.onClick(LiveRoomPromotionListFragment.this.l);
                        }
                    }
                });
                this.q = (ECLoadingStateView) view.findViewById(C0906R.id.a8d);
                this.q.setRetryClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16075a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f16075a, false, 10593, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f16075a, false, 10593, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        LiveRoomPromotionListViewModel liveRoomPromotionListViewModel = (LiveRoomPromotionListViewModel) LiveRoomPromotionListFragment.this.h;
                        if (PatchProxy.isSupport(new Object[0], liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10609, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], liveRoomPromotionListViewModel, LiveRoomPromotionListViewModel.f16083f, false, 10609, new Class[0], Void.TYPE);
                            return;
                        }
                        liveRoomPromotionListViewModel.a(liveRoomPromotionListViewModel.i, liveRoomPromotionListViewModel.j);
                    }
                });
                this.l = (ECHostAddButton) view.findViewById(C0906R.id.amk);
                ECHostAddButton eCHostAddButton = this.l;
                if (PatchProxy.isSupport(new Object[0], eCHostAddButton, ECHostAddButton.f16244a, false, 10776, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], eCHostAddButton, ECHostAddButton.f16244a, false, 10776, new Class[0], Void.TYPE);
                } else if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    eCHostAddButton.setText(C0906R.string.a8k);
                } else {
                    Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(eCHostAddButton.getResources(), 2130838614);
                    a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                    eCHostAddButton.setCompoundDrawables(a2, null, null, null);
                    eCHostAddButton.setText("");
                }
                this.t.setOnClickListener(this);
                this.l.setOnClickListener(this);
                this.m.setOnClickListener(this);
                getDialog().f16188b = this;
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10578, new Class[0], Void.TYPE);
        } else {
            ((LiveRoomPromotionListViewModel) this.h).f().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16077a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16077a, false, 10594, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16077a, false, 10594, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListFragment.this.h();
                }
            });
            ((LiveRoomPromotionListViewModel) this.h).g().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16079a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16079a, false, 10595, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16079a, false, 10595, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListFragment.this.n = LiveRoomPromotionListFragment.this.k.a();
                    LiveRoomPromotionListFragment.this.h();
                }
            });
            ((LiveRoomPromotionListViewModel) this.h).h().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16081a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16081a, false, 10596, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16081a, false, 10596, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    LiveRoomPromotionListFragment.this.k.notifyDataSetChanged();
                    LiveRoomPromotionListFragment.this.a(LiveRoomPromotionListFragment.this.k.getItemCount());
                }
            });
            ((LiveRoomPromotionListViewModel) this.h).i().observe(this, new Observer<com.bytedance.android.livesdk.livecommerce.c.c>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16062a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    com.bytedance.android.livesdk.livecommerce.c.c cVar = (com.bytedance.android.livesdk.livecommerce.c.c) obj;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f16062a, false, 10597, new Class[]{com.bytedance.android.livesdk.livecommerce.c.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f16062a, false, 10597, new Class[]{com.bytedance.android.livesdk.livecommerce.c.c.class}, Void.TYPE);
                        return;
                    }
                    if (cVar != null) {
                        int i2 = cVar.f16123a;
                        int i3 = cVar.f16124b;
                        if (i2 >= 0 && i3 >= 0 && i2 != i3) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) LiveRoomPromotionListFragment.this.j.getLayoutManager();
                            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                            if (findFirstCompletelyVisibleItemPosition >= 0) {
                                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                                i = linearLayoutManager.getDecoratedTop(findViewByPosition) - linearLayoutManager.getTopDecorationHeight(findViewByPosition);
                            }
                            LiveRoomPromotionListFragment.this.k.notifyItemMoved(i2, i3);
                            if (findFirstCompletelyVisibleItemPosition >= 0) {
                                linearLayoutManager.scrollToPositionWithOffset(findFirstCompletelyVisibleItemPosition, i);
                            }
                            LiveRoomPromotionListFragment.this.j.post(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f16064a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f16064a, false, 10598, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f16064a, false, 10598, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (LiveRoomPromotionListFragment.this.j != null && LiveRoomPromotionListFragment.this.j.isAttachedToWindow()) {
                                        RecyclerView.ItemAnimator itemAnimator = LiveRoomPromotionListFragment.this.j.getItemAnimator();
                                        if (itemAnimator == null || !itemAnimator.isRunning(null)) {
                                            LiveRoomPromotionListFragment.this.k.notifyDataSetChanged();
                                            return;
                                        }
                                        LiveRoomPromotionListFragment.this.j.post(this);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        LiveRoomPromotionListViewModel liveRoomPromotionListViewModel5 = (LiveRoomPromotionListViewModel) this.h;
        if (PatchProxy.isSupport(new Object[0], liveRoomPromotionListViewModel5, LiveRoomPromotionListViewModel.f16083f, false, 10607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], liveRoomPromotionListViewModel5, LiveRoomPromotionListViewModel.f16083f, false, 10607, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.livecommerce.b a3 = com.bytedance.android.livesdk.livecommerce.b.a();
        if (!a3.b()) {
            if (PatchProxy.isSupport(new Object[]{liveRoomPromotionListViewModel5}, a3, com.bytedance.android.livesdk.livecommerce.b.f15902a, false, 10409, new Class[]{b.a.class}, Void.TYPE)) {
                Object[] objArr = {liveRoomPromotionListViewModel5};
                com.bytedance.android.livesdk.livecommerce.b bVar = a3;
                PatchProxy.accessDispatch(objArr, bVar, com.bytedance.android.livesdk.livecommerce.b.f15902a, false, 10409, new Class[]{b.a.class}, Void.TYPE);
            } else if (a3.m != null) {
                a3.m.add(liveRoomPromotionListViewModel5);
            }
        }
        liveRoomPromotionListViewModel5.a(liveRoomPromotionListViewModel5.i, liveRoomPromotionListViewModel5.j);
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        TranslateAnimation translateAnimation;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i3)}, this, i, false, 10586, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Animation.class)) {
            return (Animation) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z), Integer.valueOf(i3)}, this, i, false, 10586, new Class[]{Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Animation.class);
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
