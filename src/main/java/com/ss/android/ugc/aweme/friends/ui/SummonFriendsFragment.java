package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.friends.adapter.SummonFriendAdapter;
import com.ss.android.ugc.aweme.friends.d.f;
import com.ss.android.ugc.aweme.friends.d.k;
import com.ss.android.ugc.aweme.friends.d.l;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class SummonFriendsFragment extends AmeBaseFragment implements View.OnTouchListener, c<SummonFriendItem>, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49352a;

    /* renamed from: b  reason: collision with root package name */
    public SummonFriendAdapter f49353b;

    /* renamed from: c  reason: collision with root package name */
    public l f49354c;

    /* renamed from: d  reason: collision with root package name */
    public k f49355d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f49356e;

    /* renamed from: f  reason: collision with root package name */
    public int f49357f;
    private List<SummonFriendItem> g;
    private String h;
    private boolean i;
    @BindView(2131493213)
    ImageView mBackView;
    @BindView(2131493372)
    View mBtnClear;
    @BindView(2131494165)
    EditText mEditView;
    @BindView(2131495145)
    ImageView mIvSearchBar;
    @BindView(2131495412)
    RecyclerView mListView;
    @BindView(2131498119)
    TextView mSendView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497590)
    TextView mTitleView;
    @BindDimen(2131230879)
    int margin;

    public static String a(int i2) {
        return i2 == 1 ? "comment_user" : i2 == 0 ? "at_user" : "";
    }

    private static String c(int i2) {
        return i2 == 1 ? "comment_at" : i2 == 0 ? "edit_at" : "";
    }

    public final void b(Exception exc) {
    }

    public final void c(Exception exc) {
    }

    public final void c(List<SummonFriendItem> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public final void s_() {
    }

    public final void y_() {
    }

    public final void z_() {
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47492, new Class[0], Void.TYPE);
            return;
        }
        if (this.f49356e) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mStatusView.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.mStatusView.setLayoutParams(layoutParams);
        }
        this.mStatusView.b();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47494, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            b.a((Activity) getActivity(), (View) this.mEditView);
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47491, new Class[0], Void.TYPE);
            return;
        }
        String trim = this.mEditView.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f49356e = true;
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                return;
            }
            r.onEvent(MobClick.obtain().setEventName("search").setLabelName(c(this.f49357f)).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("keyword", trim).b()));
            if (this.f49353b != null) {
                this.f49353b.f48760d = trim;
            }
            this.i = true;
            this.f49354c.a(Boolean.TRUE, trim, a(this.f49357f));
        }
    }

    public final void b() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47488, new Class[0], Void.TYPE);
        } else if (isViewValid() && getActivity() != null) {
            if (this.f49356e) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mStatusView.getLayoutParams();
                if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47493, new Class[0], Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47493, new Class[0], Integer.TYPE)).intValue();
                } else if (getActivity() != null) {
                    int height = getActivity().getWindow().getDecorView().getHeight();
                    Rect rect = new Rect();
                    getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    i2 = height - rect.bottom;
                }
                layoutParams.bottomMargin = i2;
                this.mStatusView.setLayoutParams(layoutParams);
            }
            this.mStatusView.d();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49352a, false, 47489, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49352a, false, 47489, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.i = false;
        if (isViewValid()) {
            g();
            this.mListView.setVisibility(8);
            this.mStatusView.f();
            h();
        }
    }

    @OnClick({2131493213, 2131498119})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49352a, false, 47483, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49352a, false, 47483, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.ix) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return;
        }
        if (id == C0906R.id.di9) {
            f();
        }
    }

    @OnTextChanged({2131494165})
    public void onTextChange(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f49352a, false, 47484, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f49352a, false, 47484, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        this.mSendView.setEnabled(!TextUtils.isEmpty(charSequence));
        if (TextUtils.isEmpty(charSequence)) {
            this.f49356e = false;
            d(this.g, true);
            this.f49353b.a(this.g);
            this.f49353b.resetLoadMoreState();
        }
    }

    private View b(@StringRes int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49352a, false, 47482, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49352a, false, 47482, new Class[]{Integer.TYPE}, View.class);
        } else if (com.ss.android.g.a.a()) {
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(new c.a(getContext()).a(2130839718).b((int) C0906R.string.agd).c(i3).f20493a);
            return a2;
        } else {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new c.a(getContext()).a(2130840145).b((int) C0906R.string.agd).c(i3).f20493a);
            return dmtDefaultView;
        }
    }

    public final void a(List<SummonFriendItem> list) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f49352a, false, 47490, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f49352a, false, 47490, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.i = false;
        if (isViewValid() && !TextUtils.isEmpty(this.mEditView.getText().toString().trim())) {
            g();
            if (list == null || list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (this.f49357f == 0) {
                    DmtStatusView dmtStatusView = this.mStatusView;
                    DmtStatusView.a a2 = this.mStatusView.a();
                    if (com.ss.android.g.a.b()) {
                        i2 = C0906R.string.bdp;
                    } else {
                        i2 = C0906R.string.bhz;
                    }
                    dmtStatusView.setBuilder(a2.b(b(i2)));
                }
                this.mStatusView.e();
                this.mEditView.setHint(getString(C0906R.string.bhz));
                return;
            }
            this.mListView.setVisibility(0);
            this.mStatusView.b();
            this.f49353b.a(list);
            if (this.f49354c.c()) {
                this.f49353b.resetLoadMoreState();
            } else {
                this.f49353b.showLoadMoreEmpty();
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49352a, false, 47495, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49352a, false, 47495, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int id = view.getId();
        if (id == C0906R.id.bd0) {
            if (this.i) {
                return true;
            }
        } else if (id == C0906R.id.aai && this.mEditView != null) {
            this.mEditView.setCursorVisible(true);
        }
        return false;
    }

    private void d(List<SummonFriendItem> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49352a, false, 47486, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49352a, false, 47486, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.mListView != null && this.mStatusView != null && this.mEditView != null && list != null) {
            if (list.isEmpty()) {
                this.mListView.setVisibility(8);
                if (!z && this.f49357f == 0) {
                    this.mStatusView.setBuilder(this.mStatusView.a().b(b((int) C0906R.string.c2m)));
                }
                this.mStatusView.e();
                if (!z) {
                    this.mEditView.setHint(getString(C0906R.string.bhb));
                }
            } else {
                this.mListView.setVisibility(0);
                this.mStatusView.b();
            }
        }
    }

    public final void a(List<SummonFriendItem> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49352a, false, 47485, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49352a, false, 47485, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (list != null) {
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g = list;
            d(list, false);
            this.f49353b.a(this.g);
            this.f49353b.resetLoadMoreState();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f49352a, false, 47480, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f49352a, false, 47480, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.h = getArguments().getString("video_id");
        this.f49357f = getArguments().getInt("source");
        if (PatchProxy.isSupport(new Object[0], this, f49352a, false, 47479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49352a, false, 47479, new Class[0], Void.TYPE);
        } else {
            this.mTitleView.setText(C0906R.string.cgg);
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.f49353b = new SummonFriendAdapter(this.h, this.f49357f);
        this.mListView.setAdapter(this.f49353b);
        this.mListView.setOnTouchListener(this);
        this.f49354c = new l();
        this.f49355d = new k();
        this.f49354c.a(this);
        this.f49355d.a(this);
        this.f49355d.a(true);
        this.f49353b.setShowFooter(true);
        this.f49353b.setLoadMoreListener(new LoadMoreRecyclerViewAdapter.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49358a;

            public final void loadMore() {
                if (PatchProxy.isSupport(new Object[0], this, f49358a, false, 47497, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f49358a, false, 47497, new Class[0], Void.TYPE);
                    return;
                }
                SummonFriendsFragment.this.f49353b.showLoadMoreLoading();
                if (SummonFriendsFragment.this.f49356e) {
                    SummonFriendsFragment.this.f49354c.a(Boolean.FALSE, SummonFriendsFragment.this.mEditView.getText().toString(), SummonFriendsFragment.a(SummonFriendsFragment.this.f49357f));
                    return;
                }
                SummonFriendsFragment.this.f49355d.a(false);
            }
        });
        this.mEditView.setHint(getString(C0906R.string.cgf));
        this.mEditView.setOnTouchListener(this);
        this.mEditView.addTextChangedListener(new com.ss.android.ugc.aweme.base.ui.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49360a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f49360a, false, 47499, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f49360a, false, 47499, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (!TextUtils.isEmpty(editable.toString())) {
                    SummonFriendsFragment.this.f();
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49360a, false, 47498, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49360a, false, 47498, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (TextUtils.isEmpty(charSequence)) {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(8);
                } else {
                    SummonFriendsFragment.this.mBtnClear.setVisibility(0);
                }
            }
        });
        this.mEditView.setOnKeyListener(new View.OnKeyListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49362a;

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f49362a, false, 47500, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f49362a, false, 47500, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 66) {
                    return false;
                } else {
                    SummonFriendsFragment.this.mEditView.setCursorVisible(false);
                    SummonFriendsFragment.this.h();
                    SummonFriendsFragment.this.g();
                    return true;
                }
            }
        });
        this.mBtnClear.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49364a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f49364a, false, 47501, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f49364a, false, 47501, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                SummonFriendsFragment.this.mEditView.setText("");
            }
        });
        h();
        DmtStatusView dmtStatusView = this.mStatusView;
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        if (this.f49357f == 1) {
            i2 = C0906R.string.dmz;
        } else {
            i2 = C0906R.string.dn0;
        }
        dmtStatusView.setBuilder(a2.b(b(i2)).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new ao(this)));
    }

    public final void b(List<SummonFriendItem> list, boolean z) {
        List<SummonFriendItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49352a, false, 47487, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f49352a, false, 47487, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && list2 != null && !list.isEmpty()) {
            g();
            if (AbTestManager.a().d().useRecyclerPartialUpdate) {
                SummonFriendAdapter summonFriendAdapter = this.f49353b;
                if (PatchProxy.isSupport(new Object[]{list2}, summonFriendAdapter, SummonFriendAdapter.f48757a, false, 46350, new Class[]{List.class}, Void.TYPE)) {
                    SummonFriendAdapter summonFriendAdapter2 = summonFriendAdapter;
                    PatchProxy.accessDispatch(new Object[]{list2}, summonFriendAdapter2, SummonFriendAdapter.f48757a, false, 46350, new Class[]{List.class}, Void.TYPE);
                } else {
                    summonFriendAdapter.f48758b = list2;
                    if (summonFriendAdapter.mShowFooter) {
                        summonFriendAdapter.notifyItemRangeChanged(summonFriendAdapter.f48759c - 1, summonFriendAdapter.getItemCount() - summonFriendAdapter.f48759c);
                        summonFriendAdapter.notifyItemChanged(summonFriendAdapter.getItemCount() - 1);
                    } else {
                        summonFriendAdapter.notifyItemRangeChanged(summonFriendAdapter.f48759c, summonFriendAdapter.getItemCount() - summonFriendAdapter.f48759c);
                    }
                }
            } else {
                this.f49353b.a(list2);
            }
            if (z) {
                this.f49353b.resetLoadMoreState();
            } else {
                this.f49353b.showLoadMoreEmpty();
            }
            h();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49352a, false, 47478, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qm, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49352a, false, 47478, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
