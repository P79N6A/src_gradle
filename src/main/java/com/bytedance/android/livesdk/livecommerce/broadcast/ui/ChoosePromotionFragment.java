package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import android.arch.core.util.Function;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseDialogFragment;
import com.bytedance.android.livesdk.livecommerce.base.b;
import com.bytedance.android.livesdk.livecommerce.broadcast.a;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.ChoosePromotionAdapter;
import com.bytedance.android.livesdk.livecommerce.broadcast.c;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.i;
import com.bytedance.android.livesdk.livecommerce.d.k;
import com.bytedance.android.livesdk.livecommerce.dialog.ECBottomDialog;
import com.bytedance.android.livesdk.livecommerce.view.ECHostCloseButton;
import com.bytedance.android.livesdk.livecommerce.view.ECHostDoneTextButton;
import com.bytedance.android.livesdk.livecommerce.view.ECHostLivingView;
import com.bytedance.android.livesdk.livecommerce.view.ECHostShowcaseNoPromotionLayout;
import com.bytedance.android.livesdk.livecommerce.view.ECLoadingStateView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public class ChoosePromotionFragment extends ECBaseDialogFragment<ChoosePromotionViewModel> implements View.OnClickListener {
    public static ChangeQuickRedirect i;
    private boolean A = true;
    public ECHostShowcaseNoPromotionLayout j;
    public ChoosePromotionAdapter k;
    public ECHostDoneTextButton l;
    public a m;
    public List<e> n;
    private RecyclerView o;
    private LinearLayoutManager p;
    private ECLoadingStateView q;
    private ECHostCloseButton r;
    private View s;
    private View t;
    private TextView u;
    private TextView v;
    private String w;
    private String x;
    private ECHostLivingView y;
    private boolean z;

    public final int a() {
        return C0906R.layout.lb;
    }

    public final int a(ECBottomDialog eCBottomDialog) {
        return -1;
    }

    public final boolean d() {
        return true;
    }

    public final void h() {
        this.z = true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10539, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.k.notifyDataSetChanged();
        i();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10540, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        this.q.a();
        this.o.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10542, new Class[0], Void.TYPE);
            return;
        }
        this.q.setVisibility(0);
        this.q.b();
        this.o.setVisibility(8);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10544, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10544, new Class[0], Void.TYPE);
            return;
        }
        this.A = false;
        super.dismiss();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10541, new Class[0], Void.TYPE);
            return;
        }
        if (this.k.getItemCount() > 0) {
            this.o.setVisibility(0);
            this.s.setVisibility(0);
            this.t.setVisibility(0);
        } else {
            this.j.setVisibility(0);
        }
        this.q.setVisibility(8);
    }

    public final void i() {
        SpannableString spannableString;
        ForegroundColorSpan foregroundColorSpan;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10538, new Class[0], Void.TYPE);
            return;
        }
        ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) this.h;
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context}, choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10571, new Class[]{Context.class}, SpannableString.class)) {
            spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{context}, choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10571, new Class[]{Context.class}, SpannableString.class);
        } else {
            String valueOf = String.valueOf(choosePromotionViewModel.g.c());
            String string = context.getResources().getString(C0906R.string.a9w);
            String str = string + valueOf + "/" + choosePromotionViewModel.g.g;
            SpannableString spannableString2 = new SpannableString(str);
            a.a(spannableString2, new ForegroundColorSpan(context.getResources().getColor(C0906R.color.lt)), 0, str.length(), 33);
            if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(C0906R.color.lo));
            } else {
                foregroundColorSpan = new ForegroundColorSpan(context.getResources().getColor(C0906R.color.lf));
            }
            a.a(spannableString2, foregroundColorSpan, string.length(), string.length() + valueOf.length(), 33);
            spannableString = spannableString2;
        }
        this.u.setText(spannableString);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        List list;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, i, false, 10545, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, i, false, 10545, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.m != null) {
            if (this.A) {
                aVar = this.m;
                list = null;
            } else {
                aVar = this.m;
                ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) this.h;
                if (PatchProxy.isSupport(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10569, new Class[0], List.class)) {
                    list = (List) PatchProxy.accessDispatch(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10569, new Class[0], List.class);
                } else {
                    list = choosePromotionViewModel.g.a();
                }
            }
            aVar.a(list);
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 10533, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 10533, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        if (bundle != null) {
            this.w = bundle.getString("bundle_user_id");
            this.x = bundle.getString("bundle_explain_promotion_id");
        }
    }

    public void onClick(View view) {
        boolean z2;
        SelectedPromotionFragment selectedPromotionFragment;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, i, false, 10543, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, i, false, 10543, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.livecommerce.f.e.f16222a, true, 10751, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.livecommerce.f.e.f16222a, true, 10751, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - com.bytedance.android.livesdk.livecommerce.f.e.f16223b < 500) {
                z2 = true;
            } else {
                com.bytedance.android.livesdk.livecommerce.f.e.f16223b = currentTimeMillis;
                z2 = false;
            }
        }
        if (!z2) {
            FragmentActivity activity = getActivity();
            if ((view2 == this.u || view2 == this.v) && this.z) {
                if (activity != null) {
                    ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) this.h;
                    FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                    b bVar = this.f15961f;
                    if (PatchProxy.isSupport(new Object[]{supportFragmentManager, bVar}, choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10567, new Class[]{FragmentManager.class, b.class}, Void.TYPE)) {
                        ChoosePromotionViewModel choosePromotionViewModel2 = choosePromotionViewModel;
                        PatchProxy.accessDispatch(new Object[]{supportFragmentManager, bVar}, choosePromotionViewModel2, ChoosePromotionViewModel.f16054f, false, 10567, new Class[]{FragmentManager.class, b.class}, Void.TYPE);
                    } else {
                        c cVar = choosePromotionViewModel.g;
                        if (PatchProxy.isSupport(new Object[]{cVar}, null, SelectedPromotionFragment.i, true, 10635, new Class[]{c.class}, SelectedPromotionFragment.class)) {
                            selectedPromotionFragment = (SelectedPromotionFragment) PatchProxy.accessDispatch(new Object[]{cVar}, null, SelectedPromotionFragment.i, true, 10635, new Class[]{c.class}, SelectedPromotionFragment.class);
                        } else {
                            SelectedPromotionFragment selectedPromotionFragment2 = new SelectedPromotionFragment();
                            selectedPromotionFragment2.l = cVar;
                            selectedPromotionFragment = selectedPromotionFragment2;
                        }
                        selectedPromotionFragment.a(bVar);
                        try {
                            selectedPromotionFragment.show(supportFragmentManager, "selected_promotion_fragment");
                        } catch (Exception unused) {
                        }
                    }
                }
            } else if (view2 == this.r) {
                dismiss();
            } else if (view2 == this.l) {
                if (this.z) {
                    j();
                    return;
                }
                ChoosePromotionViewModel choosePromotionViewModel3 = (ChoosePromotionViewModel) this.h;
                AnonymousClass8 r1 = new k<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16052a;

                    public final /* synthetic */ void a(Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f16052a, false, 10553, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f16052a, false, 10553, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        ChoosePromotionFragment.this.j();
                    }

                    public final void a(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f16052a, false, 10554, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f16052a, false, 10554, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        ((ChoosePromotionViewModel) ChoosePromotionFragment.this.h).a((int) C0906R.string.a9u);
                    }
                };
                if (PatchProxy.isSupport(new Object[]{r1}, choosePromotionViewModel3, ChoosePromotionViewModel.f16054f, false, 10563, new Class[]{k.class}, Void.TYPE)) {
                    ChoosePromotionViewModel choosePromotionViewModel4 = choosePromotionViewModel3;
                    PatchProxy.accessDispatch(new Object[]{r1}, choosePromotionViewModel4, ChoosePromotionViewModel.f16054f, false, 10563, new Class[]{k.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.livecommerce.b.a().a(com.bytedance.android.livesdk.livecommerce.f.a.a(choosePromotionViewModel3.g.a(), (Function<T, String>) new Function<e, String>() {
                    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                        e eVar = (e) obj;
                        if (eVar == null) {
                            return null;
                        }
                        return eVar.m;
                    }
                }), (k<Void>) r1);
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, i, false, 10534, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, i, false, 10534, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10535, new Class[0], Void.TYPE);
        } else {
            View view = getView();
            if (view != null) {
                this.o = (RecyclerView) view.findViewById(C0906R.id.cis);
                RecyclerView recyclerView = this.o;
                if (PatchProxy.isSupport(new Object[]{recyclerView}, this, i, false, 10536, new Class[]{RecyclerView.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView}, this, i, false, 10536, new Class[]{RecyclerView.class}, Void.TYPE);
                } else {
                    this.p = new LinearLayoutManager(getActivity());
                    this.o.setLayoutManager(this.p);
                    this.k = new ChoosePromotionAdapter((ChoosePromotionViewModel) this.h);
                    this.k.f15986b = ((ChoosePromotionViewModel) this.h).g.f16031b;
                    this.o.setAdapter(this.k);
                    this.o.addOnScrollListener(new RecyclerView.OnScrollListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16041a;

                        /* renamed from: c  reason: collision with root package name */
                        private int f16043c;

                        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16041a, false, 10548, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f16041a, false, 10548, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                            if (linearLayoutManager != null) {
                                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                                if (findLastVisibleItemPosition == linearLayoutManager.getItemCount() - 1 && findLastVisibleItemPosition != this.f16043c) {
                                    ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) ChoosePromotionFragment.this.h;
                                    if (PatchProxy.isSupport(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10570, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10570, new Class[0], Void.TYPE);
                                    } else if (choosePromotionViewModel.g.f16035f) {
                                        choosePromotionViewModel.a(choosePromotionViewModel.h, choosePromotionViewModel.i);
                                    }
                                }
                                this.f16043c = findLastVisibleItemPosition;
                            }
                        }
                    });
                }
                this.q = (ECLoadingStateView) view.findViewById(C0906R.id.a8c);
                this.q.setRetryClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16037a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f16037a, false, 10546, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f16037a, false, 10546, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) ChoosePromotionFragment.this.h;
                        if (PatchProxy.isSupport(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10562, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10562, new Class[0], Void.TYPE);
                            return;
                        }
                        choosePromotionViewModel.a(PushConstants.PUSH_TYPE_NOTIFY, choosePromotionViewModel.i);
                    }
                });
                this.j = (ECHostShowcaseNoPromotionLayout) view.findViewById(C0906R.id.ao9);
                this.u = (TextView) view.findViewById(C0906R.id.dic);
                if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    this.u.setTypeface(Typeface.DEFAULT_BOLD);
                }
                this.v = (TextView) view.findViewById(C0906R.id.dlo);
                this.l = (ECHostDoneTextButton) view.findViewById(C0906R.id.d_a);
                this.l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f16039a;

                    public final void onGlobalLayout() {
                        if (PatchProxy.isSupport(new Object[0], this, f16039a, false, 10547, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f16039a, false, 10547, new Class[0], Void.TYPE);
                            return;
                        }
                        ChoosePromotionFragment.this.l.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        ECHostDoneTextButton eCHostDoneTextButton = ChoosePromotionFragment.this.l;
                        if (PatchProxy.isSupport(new Object[0], eCHostDoneTextButton, ECHostDoneTextButton.f16250a, false, 10782, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], eCHostDoneTextButton, ECHostDoneTextButton.f16250a, false, 10782, new Class[0], Void.TYPE);
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = eCHostDoneTextButton.getLayoutParams();
                        if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                            if (layoutParams != null) {
                                layoutParams.width = com.bytedance.android.livesdk.livecommerce.f.a.a(eCHostDoneTextButton.getContext(), 96.0f);
                                layoutParams.height = com.bytedance.android.livesdk.livecommerce.f.a.a(eCHostDoneTextButton.getContext(), 32.0f);
                                eCHostDoneTextButton.setLayoutParams(layoutParams);
                            }
                            eCHostDoneTextButton.setBackgroundResource(2130838600);
                            return;
                        }
                        if (layoutParams != null) {
                            layoutParams.width = com.bytedance.android.livesdk.livecommerce.f.a.a(eCHostDoneTextButton.getContext(), 90.0f);
                            layoutParams.height = com.bytedance.android.livesdk.livecommerce.f.a.a(eCHostDoneTextButton.getContext(), 36.0f);
                            eCHostDoneTextButton.setLayoutParams(layoutParams);
                        }
                        eCHostDoneTextButton.setBackgroundResource(2130838599);
                    }
                });
                this.s = view.findViewById(C0906R.id.dqo);
                this.t = view.findViewById(C0906R.id.bfk);
                this.u.setOnClickListener(this);
                this.v.setOnClickListener(this);
                this.l.setOnClickListener(this);
                this.r = (ECHostCloseButton) view.findViewById(C0906R.id.d_l);
                ECHostCloseButton eCHostCloseButton = this.r;
                if (PatchProxy.isSupport(new Object[0], eCHostCloseButton, ECHostCloseButton.f16245a, false, 10777, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], eCHostCloseButton, ECHostCloseButton.f16245a, false, 10777, new Class[0], Void.TYPE);
                } else if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(eCHostCloseButton.getResources(), 2130838616);
                    a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
                    eCHostCloseButton.setCompoundDrawables(a2, null, null, null);
                    eCHostCloseButton.setText("");
                } else {
                    eCHostCloseButton.setText(C0906R.string.a8p);
                }
                this.r.setOnClickListener(this);
                this.y = (ECHostLivingView) view.findViewById(C0906R.id.bh2);
                if (this.z) {
                    this.y.setVisibility(8);
                } else {
                    this.y.setVisibility(0);
                }
                if (!this.z) {
                    this.v.setVisibility(8);
                    this.l.setText(C0906R.string.a91);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, i, false, 10537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 10537, new Class[0], Void.TYPE);
        } else {
            ((ChoosePromotionViewModel) this.h).f().observe(this, new Observer<i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16044a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    i iVar = (i) obj;
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f16044a, false, 10549, new Class[]{i.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iVar}, this, f16044a, false, 10549, new Class[]{i.class}, Void.TYPE);
                        return;
                    }
                    if (!(iVar == null || !CollectionUtils.isEmpty(iVar.f16168c) || iVar.h == null)) {
                        String str = iVar.h.f16172a;
                        String str2 = iVar.h.f16173b;
                        ECHostShowcaseNoPromotionLayout eCHostShowcaseNoPromotionLayout = ChoosePromotionFragment.this.j;
                        if (PatchProxy.isSupport(new Object[]{str, str2}, eCHostShowcaseNoPromotionLayout, ECHostShowcaseNoPromotionLayout.f16260a, false, 10790, new Class[]{String.class, String.class}, Void.TYPE)) {
                            ECHostShowcaseNoPromotionLayout eCHostShowcaseNoPromotionLayout2 = eCHostShowcaseNoPromotionLayout;
                            PatchProxy.accessDispatch(new Object[]{str, str2}, eCHostShowcaseNoPromotionLayout2, ECHostShowcaseNoPromotionLayout.f16260a, false, 10790, new Class[]{String.class, String.class}, Void.TYPE);
                        } else {
                            if (eCHostShowcaseNoPromotionLayout.f16261b != null) {
                                eCHostShowcaseNoPromotionLayout.f16261b.setText(str);
                            }
                            if (eCHostShowcaseNoPromotionLayout.f16262c != null) {
                                eCHostShowcaseNoPromotionLayout.f16262c.setText(str2);
                            }
                        }
                    }
                    ChoosePromotionFragment.this.k.notifyDataSetChanged();
                    ChoosePromotionFragment.this.i();
                }
            });
            ((ChoosePromotionViewModel) this.h).g().observe(this, new Observer<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16046a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f16046a, false, 10550, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f16046a, false, 10550, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    ChoosePromotionFragment.this.k.notifyDataSetChanged();
                }
            });
            ((ChoosePromotionViewModel) this.h).h().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16048a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16048a, false, 10551, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16048a, false, 10551, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    ChoosePromotionFragment.this.k.notifyItemRangeChanged(0, ChoosePromotionFragment.this.k.getItemCount());
                }
            });
            ((ChoosePromotionViewModel) this.h).i().observe(this, new Observer<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16050a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Void voidR = (Void) obj;
                    if (PatchProxy.isSupport(new Object[]{voidR}, this, f16050a, false, 10552, new Class[]{Void.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{voidR}, this, f16050a, false, 10552, new Class[]{Void.class}, Void.TYPE);
                        return;
                    }
                    ChoosePromotionFragment.this.i();
                }
            });
        }
        ChoosePromotionViewModel choosePromotionViewModel = (ChoosePromotionViewModel) this.h;
        boolean z2 = this.z;
        String str = this.x;
        List<e> list = this.n;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), str, list}, choosePromotionViewModel, ChoosePromotionViewModel.f16054f, false, 10560, new Class[]{Boolean.TYPE, String.class, List.class}, Void.TYPE)) {
            ChoosePromotionViewModel choosePromotionViewModel2 = choosePromotionViewModel;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str, list}, choosePromotionViewModel2, ChoosePromotionViewModel.f16054f, false, 10560, new Class[]{Boolean.TYPE, String.class, List.class}, Void.TYPE);
            return;
        }
        choosePromotionViewModel.i = choosePromotionViewModel.a(list);
        choosePromotionViewModel.j = str;
        c cVar = choosePromotionViewModel.g;
        String str2 = choosePromotionViewModel.i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2), str2, list}, cVar, c.f16030a, false, 10481, new Class[]{Boolean.TYPE, String.class, List.class}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), str2, list}, cVar2, c.f16030a, false, 10481, new Class[]{Boolean.TYPE, String.class, List.class}, Void.TYPE);
        } else {
            cVar.f16034e = z2;
            cVar.f16033d = str2;
            cVar.a(list);
        }
        choosePromotionViewModel.a(PushConstants.PUSH_TYPE_NOTIFY, choosePromotionViewModel.i);
    }

    public static ChoosePromotionFragment a(Bundle bundle, List<e> list, a aVar) {
        Bundle bundle2 = bundle;
        List<e> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{bundle2, list2, aVar2}, null, i, true, 10531, new Class[]{Bundle.class, List.class, a.class}, ChoosePromotionFragment.class)) {
            return (ChoosePromotionFragment) PatchProxy.accessDispatch(new Object[]{bundle2, list2, aVar2}, null, i, true, 10531, new Class[]{Bundle.class, List.class, a.class}, ChoosePromotionFragment.class);
        }
        ChoosePromotionFragment choosePromotionFragment = new ChoosePromotionFragment();
        choosePromotionFragment.setArguments(bundle2);
        choosePromotionFragment.m = aVar2;
        choosePromotionFragment.n = list2;
        choosePromotionFragment.a((b) new com.bytedance.android.livesdk.livecommerce.base.a());
        return choosePromotionFragment;
    }

    public static ChoosePromotionFragment a(String str, List<e> list, a aVar) {
        String str2 = str;
        List<e> list2 = list;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, list2, aVar2}, null, i, true, 10530, new Class[]{String.class, List.class, a.class}, ChoosePromotionFragment.class)) {
            return (ChoosePromotionFragment) PatchProxy.accessDispatch(new Object[]{str2, list2, aVar2}, null, i, true, 10530, new Class[]{String.class, List.class, a.class}, ChoosePromotionFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("bundle_user_id", str2);
        return a(bundle, list2, aVar2);
    }
}
