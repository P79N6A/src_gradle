package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.feed.guide.f;
import com.ss.android.ugc.aweme.followrequest.FollowRequestActivity;
import com.ss.android.ugc.aweme.followrequest.a.a;
import com.ss.android.ugc.aweme.followrequest.a.b;
import com.ss.android.ugc.aweme.followrequest.a.d;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.notification.view.c;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends AmeBaseFragment implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57816a;

    /* renamed from: b  reason: collision with root package name */
    View f57817b;

    /* renamed from: c  reason: collision with root package name */
    AggregatedPresenter f57818c;

    /* renamed from: d  reason: collision with root package name */
    f f57819d;

    /* renamed from: e  reason: collision with root package name */
    Fragment f57820e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f57821f;
    private View g;
    private NoticeView h;
    private View i;
    private boolean j;
    private com.ss.android.ugc.aweme.notification.b.c k;
    private b l;
    private boolean m = true;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62805, new Class[0], Void.TYPE);
            return;
        }
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57824a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57824a, false, 62818, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57824a, false, 62818, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                NewsFragment newsFragment = NewsFragment.this;
                if (PatchProxy.isSupport(new Object[0], newsFragment, NewsFragment.f57816a, false, 62812, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], newsFragment, NewsFragment.f57816a, false, 62812, new Class[0], Void.TYPE);
                    return;
                }
                newsFragment.f57817b.setVisibility(8);
                if (newsFragment.getActivity() != null) {
                    newsFragment.startActivityForResult(new Intent(newsFragment.getActivity(), FollowRequestActivity.class), 1024);
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62810, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            e();
            if (this.g.getVisibility() == 0) {
                this.f57817b.setVisibility(0);
            }
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62806, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("notice");
        if (findFragmentByTag == null) {
            findFragmentByTag = new NotificationDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("from_where", 10);
            findFragmentByTag.setArguments(bundle);
        }
        if (!findFragmentByTag.isAdded()) {
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.add(C0906R.id.bqj, findFragmentByTag, "session");
            beginTransaction.commitAllowingStateLoss();
        } else {
            FragmentTransaction beginTransaction2 = getChildFragmentManager().beginTransaction();
            beginTransaction2.show(findFragmentByTag);
            beginTransaction2.commitAllowingStateLoss();
        }
        d();
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62807, new Class[0], Void.TYPE);
            return;
        }
        if (this.j && this.i != null) {
            this.j = false;
            this.i.findViewById(C0906R.id.s).setVisibility(0);
            this.g = this.i.findViewById(C0906R.id.b9i);
            this.f57821f = (DmtTextView) this.i.findViewById(C0906R.id.dfk);
            this.f57817b = this.i.findViewById(C0906R.id.brk);
            b();
            this.f57818c.a((RecyclerView) this.i.findViewById(C0906R.id.cir), getContext());
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62814, new Class[0], Void.TYPE);
        } else if (this.l == null) {
            this.l = new b();
            this.l.a(new a());
            this.l.a(this);
            this.l.a(new Object[0]);
        } else {
            this.l.a(new Object[0]);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62799, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62800, new Class[0], Void.TYPE);
        } else {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("label");
                String stringExtra2 = intent.getStringExtra("uid");
                intent.putExtra("label", "");
                if (TextUtils.equals(stringExtra, "follow_request")) {
                    Intent intent2 = new Intent(getContext(), FollowRequestActivity.class);
                    intent2.putExtra("label", stringExtra);
                    intent2.putExtra("uid", stringExtra2);
                    startActivityForResult(intent2, 1024);
                }
            }
        }
        e();
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57822a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f57822a, false, 62817, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57822a, false, 62817, new Class[0], Void.TYPE);
                    return;
                }
                if (NewsFragment.this.isAdded()) {
                    com.ss.android.ugc.aweme.message.c.c.a().a(0);
                }
            }
        }, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        if (!this.m && this.f57818c != null) {
            this.f57818c.a();
        }
        this.m = false;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62811, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.k != null) {
            com.ss.android.ugc.aweme.notification.b.c cVar = this.k;
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.notification.b.c.f3697a, false, 63144, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.notification.b.c.f3697a, false, 63144, new Class[0], Void.TYPE);
            } else {
                bg.d(cVar);
                com.ss.android.ugc.aweme.message.c.c a2 = com.ss.android.ugc.aweme.message.c.c.a();
                if (PatchProxy.isSupport(new Object[]{2}, a2, com.ss.android.ugc.aweme.message.c.c.f55363a, false, 58754, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr = {2};
                    com.ss.android.ugc.aweme.message.c.c cVar2 = a2;
                    PatchProxy.accessDispatch(objArr, cVar2, com.ss.android.ugc.aweme.message.c.c.f55363a, false, 58754, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    a2.f55365b.remove(2);
                }
                cVar.f3698b = null;
                com.ss.android.ugc.aweme.notification.d.a a3 = com.ss.android.ugc.aweme.notification.d.a.a();
                if (PatchProxy.isSupport(new Object[0], a3, com.ss.android.ugc.aweme.notification.d.a.f58093a, false, 63241, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a3, com.ss.android.ugc.aweme.notification.d.a.f58093a, false, 63241, new Class[0], Void.TYPE);
                } else {
                    a3.f58095c.clear();
                }
            }
        }
        if (this.f57818c != null) {
            AggregatedPresenter aggregatedPresenter = this.f57818c;
            if (PatchProxy.isSupport(new Object[0], aggregatedPresenter, AggregatedPresenter.f57767a, false, 62697, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aggregatedPresenter, AggregatedPresenter.f57767a, false, 62697, new Class[0], Void.TYPE);
                return;
            }
            if (aggregatedPresenter.f57769c != null) {
                aggregatedPresenter.f57769c.f57959b = null;
            }
            aggregatedPresenter.f57769c = null;
        }
    }

    public final void a(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f57816a, false, 62815, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f57816a, false, 62815, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.g != null) {
            if (this.l == null || i2 <= 0) {
                this.g.setVisibility(8);
                return;
            }
            if (this.g.getVisibility() == 8) {
                this.f57817b.setVisibility(0);
            }
            this.g.setVisibility(0);
            if (i2 > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i2);
            }
            this.f57821f.setFontType(com.bytedance.ies.dmt.ui.widget.util.c.g);
            this.f57821f.setText(getString(C0906R.string.agk, str));
        }
    }

    public final void a(List<c.a> list) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f57816a, false, 62808, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57816a, false, 62808, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid()) {
            AggregatedPresenter aggregatedPresenter = this.f57818c;
            if (PatchProxy.isSupport(new Object[]{list}, aggregatedPresenter, AggregatedPresenter.f57767a, false, 62699, new Class[]{List.class}, Void.TYPE)) {
                AggregatedPresenter aggregatedPresenter2 = aggregatedPresenter;
                PatchProxy.accessDispatch(new Object[]{list}, aggregatedPresenter2, AggregatedPresenter.f57767a, false, 62699, new Class[]{List.class}, Void.TYPE);
            } else if (aggregatedPresenter.f57768b != null && list != null && list.size() != 0) {
                for (c.a aVar : list) {
                    aggregatedPresenter.f57768b.f57771b.get(i2).f57791d = aVar.f58133b;
                    i2++;
                }
                aggregatedPresenter.f57768b.notifyDataSetChanged();
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f57816a, false, 62797, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f57816a, false, 62797, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (com.ss.android.ugc.aweme.im.b.b()) {
            if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62803, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62803, new Class[0], Void.TYPE);
            } else {
                IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
                if (a2 != null) {
                    this.f57820e = getChildFragmentManager().findFragmentByTag("session");
                    if (this.f57820e == null && a2.getSessionListFragment() != null) {
                        this.f57820e = a2.getSessionListFragment().b();
                    }
                    if (this.f57820e != null) {
                        if (!this.f57820e.isAdded()) {
                            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
                            beginTransaction.add(C0906R.id.bqj, this.f57820e, "session");
                            beginTransaction.commitAllowingStateLoss();
                        } else {
                            FragmentTransaction beginTransaction2 = getChildFragmentManager().beginTransaction();
                            beginTransaction2.show(this.f57820e);
                            beginTransaction2.commitAllowingStateLoss();
                        }
                        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62804, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62804, new Class[0], Void.TYPE);
                        } else if (this.j && (this.f57820e instanceof com.ss.android.ugc.aweme.im.service.c.a)) {
                            this.j = false;
                            Context context = getContext();
                            com.ss.android.ugc.aweme.im.service.c.a aVar = (com.ss.android.ugc.aweme.im.service.c.a) this.f57820e;
                            RecyclerView a3 = aVar.a(context);
                            if (a3 != null) {
                                this.f57818c.a(a3, context);
                            }
                            this.g = aVar.b(context);
                            if (this.g != null) {
                                b();
                                this.f57821f = (DmtTextView) this.g.findViewWithTag("tag_msg_follow_request_count");
                                this.f57817b = this.g.findViewWithTag("tag_msg_follow_request_unread_dot");
                            }
                        }
                    }
                }
                c();
            }
        } else {
            c();
        }
        if (PatchProxy.isSupport(new Object[0], this, f57816a, false, 62798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57816a, false, 62798, new Class[0], Void.TYPE);
        } else if (this.k == null) {
            this.k = new com.ss.android.ugc.aweme.notification.b.c();
        }
        com.ss.android.ugc.aweme.notification.b.c cVar = this.k;
        if (PatchProxy.isSupport(new Object[]{this}, cVar, com.ss.android.ugc.aweme.notification.b.c.f3697a, false, 63143, new Class[]{c.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.notification.b.c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{this}, cVar2, com.ss.android.ugc.aweme.notification.b.c.f3697a, false, 63143, new Class[]{c.class}, Void.TYPE);
            return;
        }
        cVar.f3698b = this;
        bg.c(cVar);
        int b2 = com.ss.android.ugc.aweme.message.c.c.a().b(3);
        int b3 = com.ss.android.ugc.aweme.message.c.c.a().b(44);
        int b4 = com.ss.android.ugc.aweme.message.c.c.a().b(6);
        int b5 = com.ss.android.ugc.aweme.message.c.c.a().b(7);
        int b6 = com.ss.android.ugc.aweme.message.c.c.a().b(28);
        int b7 = com.ss.android.ugc.aweme.message.c.c.a().b(24);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c.a(0, b5));
        arrayList.add(new c.a(1, b2));
        if (com.ss.android.g.a.a()) {
            arrayList.add(new c.a(2, b4));
            arrayList.add(new c.a(3, b3));
        } else {
            arrayList.add(new c.a(12, b6));
            arrayList.add(new c.a(13, b7));
        }
        cVar.f3698b.a(arrayList);
        com.ss.android.ugc.aweme.message.c.c a4 = com.ss.android.ugc.aweme.message.c.c.a();
        if (PatchProxy.isSupport(new Object[]{2, cVar}, a4, com.ss.android.ugc.aweme.message.c.c.f55363a, false, 58753, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.message.c.a.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.message.c.c cVar3 = a4;
            PatchProxy.accessDispatch(new Object[]{2, cVar}, cVar3, com.ss.android.ugc.aweme.message.c.c.f55363a, false, 58753, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.message.c.a.class}, Void.TYPE);
            return;
        }
        a4.f55365b.put(2, cVar);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57816a, false, 62809, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57816a, false, 62809, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f57818c.a(i2, i3);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f57816a, false, 62796, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f57816a, false, 62796, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.j = true;
        this.f57818c = new AggregatedPresenter();
        if (!com.ss.android.g.a.a()) {
            this.f57819d = new f(this.h);
            this.f57819d.a();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f57816a, false, 62813, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f57816a, false, 62813, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1024) {
            e();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57816a, false, 62795, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f57816a, false, 62795, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.i = layoutInflater.inflate(C0906R.layout.p3, viewGroup2, false);
        this.h = (NoticeView) this.i.findViewById(C0906R.id.brl);
        return this.i;
    }
}
