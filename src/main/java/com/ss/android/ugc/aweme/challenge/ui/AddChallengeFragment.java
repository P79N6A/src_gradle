package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.adapter.ChallengeAdapter;
import com.ss.android.ugc.aweme.challenge.adapter.SearchChallengeAdapter;
import com.ss.android.ugc.aweme.challenge.c.d;
import com.ss.android.ugc.aweme.challenge.c.e;
import com.ss.android.ugc.aweme.challenge.c.g;
import com.ss.android.ugc.aweme.challenge.c.i;
import com.ss.android.ugc.aweme.challenge.model.SearchChallenge;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class AddChallengeFragment extends AmeBaseFragment implements i, c<Challenge> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2801a;

    /* renamed from: b  reason: collision with root package name */
    private ChallengeAdapter f2802b;

    /* renamed from: c  reason: collision with root package name */
    private SearchChallengeAdapter f2803c;

    /* renamed from: d  reason: collision with root package name */
    private b<d> f2804d;

    /* renamed from: e  reason: collision with root package name */
    private g f2805e;

    /* renamed from: f  reason: collision with root package name */
    private String f2806f;
    @BindView(2131496954)
    EditText mEditView;
    @BindView(2131494871)
    LinearLayout mHideChallengeLayout;
    @BindView(2131494634)
    View mLabelView;
    @BindView(2131495412)
    RecyclerView mListView;
    @BindView(2131495625)
    ImageView mLoadingView;
    @BindView(2131496976)
    TextView mSendView;
    @BindView(2131497604)
    ButtonTitleBar mTitleBar;
    @BindDimen(2131230879)
    int margin;

    public final void b(List<Challenge> list, boolean z) {
    }

    public final void c(Exception exc) {
    }

    public final void c(List<Challenge> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void n_() {
    }

    public final void s_() {
    }

    public final void y_() {
    }

    public final void z_() {
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25967, new Class[0], Void.TYPE);
            return;
        }
        this.mLoadingView.clearAnimation();
        this.mLoadingView.setVisibility(4);
        this.mSendView.setText(C0906R.string.rk);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25968, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) this.mEditView);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25956, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25956, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f2805e != null) {
            this.f2805e.k();
        }
        if (this.f2804d != null) {
            this.f2804d.k();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25964, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25964, new Class[0], Void.TYPE);
        } else if (isViewValid() && getActivity() != null) {
            this.mLoadingView.startAnimation(AnimationUtils.loadAnimation(getActivity(), C0906R.anim.a0));
            this.mLoadingView.setVisibility(0);
            this.mSendView.setText("");
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2801a, false, 25965, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2801a, false, 25965, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            f();
            g();
        }
    }

    public final void a(SearchChallengeList searchChallengeList) {
        List<SearchChallenge> list;
        if (PatchProxy.isSupport(new Object[]{searchChallengeList}, this, f2801a, false, 25966, new Class[]{SearchChallengeList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchChallengeList}, this, f2801a, false, 25966, new Class[]{SearchChallengeList.class}, Void.TYPE);
        } else if (isViewValid()) {
            f();
            SearchChallengeAdapter searchChallengeAdapter = this.f2803c;
            if (searchChallengeList == null) {
                list = null;
            } else {
                list = searchChallengeList.items;
            }
            searchChallengeAdapter.setData(list);
            this.mListView.setAdapter(this.f2803c);
            this.mLabelView.setVisibility(8);
            g();
        }
    }

    @OnTextChanged({2131496954})
    public void onTextChange(CharSequence charSequence) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f2801a, false, 25961, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f2801a, false, 25961, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.mListView.setAdapter(this.f2802b);
            this.f2803c.setData(null);
            View view = this.mLabelView;
            if (this.f2802b.getItemCount() == 0) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f2801a, false, 25962, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f2801a, false, 25962, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mLabelView.setVisibility(8);
        }
    }

    @OnClick({2131496976})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f2801a, false, 25960, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2801a, false, 25960, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.clx) {
            String trim = this.mEditView.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                    a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                    return;
                }
                this.f2805e.a(trim, this.f2806f);
                r.onEvent(MobClick.obtain().setEventName("search").setLabelName("add_challenge").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("keyword", trim).b()));
            }
        }
    }

    @Subscribe
    public void onChallengeReadyEvent(com.ss.android.ugc.aweme.challenge.a.b bVar) {
        com.ss.android.ugc.aweme.challenge.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f2801a, false, 25969, new Class[]{com.ss.android.ugc.aweme.challenge.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f2801a, false, 25969, new Class[]{com.ss.android.ugc.aweme.challenge.a.b.class}, Void.TYPE);
            return;
        }
        if (bVar2.f35316b == 0) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().addChallenge(com.ss.android.ugc.aweme.shortvideo.o.a.b(bVar2.f35315a));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Intent intent = new Intent();
                intent.putExtra("challenge", new com.ss.android.ugc.aweme.shortvideo.o.a().apply(bVar2.f35315a));
                activity.setResult(-1, intent);
                activity.onBackPressed();
            }
            r.onEvent(MobClick.obtain().setEventName("add_challenge").setLabelName("publish").setValue(bVar2.f35315a.getCid()).setExtValueLong(0));
        }
    }

    public final void a(List<Challenge> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2801a, false, 25963, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f2801a, false, 25963, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.f2803c.getItemCount() == 0) {
            this.f2802b.setData(list);
            this.mLabelView.setVisibility(0);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2801a, false, 25959, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2801a, false, 25959, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25957, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f2801a, false, 25958, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2801a, false, 25958, new Class[0], Void.TYPE);
            } else {
                this.mTitleBar.setTitle((int) C0906R.string.cq);
                this.mTitleBar.getTitleView().setTextColor(getResources().getColor(C0906R.color.anp));
                if (!com.ss.android.g.a.a()) {
                    this.mTitleBar.getTitleView().setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838842, 0);
                }
                this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f35439a;

                    public final void b(View view) {
                    }

                    public final void a(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f35439a, false, 25971, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f35439a, false, 25971, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = AddChallengeFragment.this.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                    }
                });
                this.mTitleBar.showDividerLine(false);
            }
            this.mLabelView.setVisibility(4);
            this.mHideChallengeLayout.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35437a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f35437a, false, 25970, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f35437a, false, 25970, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FragmentActivity activity = AddChallengeFragment.this.getActivity();
                    activity.setResult(0, new Intent());
                    activity.onBackPressed();
                }
            });
        }
        this.f2803c = new SearchChallengeAdapter();
        this.f2802b = new ChallengeAdapter();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setAdapter(this.f2802b);
        RecyclerView recyclerView = this.mListView;
        ChallengeItemDecoration challengeItemDecoration = new ChallengeItemDecoration(getActivity(), 2130838327);
        int i = this.margin;
        int i2 = this.margin;
        challengeItemDecoration.f35507b = i;
        challengeItemDecoration.f35508c = 0;
        challengeItemDecoration.f35509d = i2;
        challengeItemDecoration.f35510e = 0;
        recyclerView.addItemDecoration(challengeItemDecoration);
        this.f2804d = new b<>();
        this.f2804d.a(this);
        this.f2804d.a(new d());
        this.f2805e = new g();
        this.f2805e.a(this);
        this.f2805e.a(new e());
        this.f2804d.a(1);
        g();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2801a, false, 25955, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2801a, false, 25955, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.mv, viewGroup2, false);
        this.f2806f = getArguments().getString("from");
        return inflate;
    }
}
