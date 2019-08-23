package com.bytedance.android.livesdk.rank.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.adapter.LiveMultiTypeAdapter;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.di;
import com.bytedance.android.livesdk.rank.a.b;
import com.bytedance.android.livesdk.rank.f;
import com.bytedance.android.livesdk.rank.i;
import com.bytedance.android.livesdk.rank.model.a;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankItemViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankTextViewBinder;
import com.bytedance.android.livesdk.rank.viewbinder.DailyRankTimeViewBinder;
import com.bytedance.android.livesdk.utils.ad;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.a;

public class TopRankFragment extends Fragment implements b.C0118b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16956a;
    @IgnoreStyleCheck

    /* renamed from: b  reason: collision with root package name */
    public String f16957b;

    /* renamed from: c  reason: collision with root package name */
    public a f16958c;

    /* renamed from: d  reason: collision with root package name */
    public Room f16959d;

    /* renamed from: e  reason: collision with root package name */
    public LiveMultiTypeAdapter f16960e;

    /* renamed from: f  reason: collision with root package name */
    public int f16961f;
    public DataCenter g;
    private View h;
    private RecyclerView i;
    private View j;
    private ImageView k;
    private TextView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private LoadingStatusView p;
    private View q;
    private b.a r;
    private List<Object> s = new ArrayList();
    private boolean t;
    private int u;
    private f v;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13036, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13036, new Class[0], Void.TYPE);
        } else if (!com.bytedance.android.live.uikit.a.a.c() && !com.bytedance.android.live.uikit.a.a.e()) {
            this.i.addItemDecoration(new RecyclerView.ItemDecoration() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16965a;

                public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                    Rect rect2 = rect;
                    View view2 = view;
                    RecyclerView recyclerView2 = recyclerView;
                    if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f16965a, false, 13049, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state}, this, f16965a, false, 13049, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                        return;
                    }
                    super.getItemOffsets(rect, view, recyclerView, state);
                    int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
                    int itemCount = TopRankFragment.this.f16960e.getItemCount();
                    if (childAdapterPosition == itemCount - 1) {
                        rect2.bottom = (int) UIUtils.dip2Px(TopRankFragment.this.getContext(), 16.0f);
                        return;
                    }
                    if (childAdapterPosition == itemCount - 2) {
                        rect2.top = (int) UIUtils.dip2Px(TopRankFragment.this.getContext(), 16.0f);
                        rect2.bottom = (int) UIUtils.dip2Px(TopRankFragment.this.getContext(), 4.0f);
                    }
                }
            });
        }
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, f16956a, false, 13039, new Class[0], Context.class)) {
            return super.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13039, new Class[0], Context.class);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13033, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13034, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.r != null) {
            this.r.b();
        }
        if (this.f16960e != null) {
            this.f16960e.f83976c.a(com.bytedance.android.livesdk.rank.model.b.class);
            this.f16960e.f83976c.a(String.class);
        }
    }

    private void a() {
        int i2;
        float f2;
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13035, new Class[0], Void.TYPE);
        } else if (this.f16958c != null && !CollectionUtils.isEmpty(this.f16958c.f17019b) && this.j != null) {
            UIUtils.setViewVisibility(this.p, 8);
            Observable.fromIterable(this.f16958c.f17019b).filter(g.f16983b).toList().subscribe(new h(this), i.f16987b);
            this.s.clear();
            boolean z = true;
            if ((com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) && this.f16961f == 1 && !CollectionUtils.isEmpty(this.f16958c.f17021d) && this.f16958c.f17021d.get(0).f17025b != null) {
                this.f16958c.f17021d.get(0).g = true;
                this.s.addAll(this.f16958c.f17021d.subList(0, 1));
            }
            if (com.bytedance.android.live.uikit.a.a.c() || com.bytedance.android.live.uikit.a.a.e()) {
                this.s.addAll(this.f16958c.f17019b);
                this.u = 1;
            } else {
                this.s.addAll(this.f16958c.f17019b);
                this.s.add(this.f16958c.f17022e);
                List<Object> list = this.s;
                list.add(this.f16958c.f17023f + "00:00:00");
                this.u = this.s.size() - 1;
            }
            b();
            if (this.f16960e == null) {
                this.f16960e = new LiveMultiTypeAdapter();
                this.f16960e.a(com.bytedance.android.livesdk.rank.model.b.class).a(new DailyRankContributorViewBinder(), new DailyRankItemViewBinder(this.f16961f)).a(j.f16989b);
                this.f16960e.a(String.class).a(new DailyRankTextViewBinder(), new DailyRankTimeViewBinder()).a(new k(this));
                this.i.setLayoutManager(new SSLinearLayoutManager(getContext()));
                this.i.setAdapter(this.f16960e);
            }
            try {
                this.f16960e.a(this.s);
            } catch (Exception unused) {
                this.i.getRecycledViewPool().clear();
                this.f16960e.notifyDataSetChanged();
            }
            this.r.a();
            com.bytedance.android.livesdk.rank.model.b bVar = this.f16958c.f17020c;
            if (bVar != null) {
                if (bVar.f17027d > 0 || getContext() == null) {
                    switch (bVar.f17027d) {
                        case 1:
                            this.k.setImageResource(2130841414);
                            this.k.setVisibility(0);
                            this.l.setVisibility(8);
                            break;
                        case 2:
                            this.k.setImageResource(2130841415);
                            this.k.setVisibility(0);
                            this.l.setVisibility(8);
                            break;
                        case 3:
                            this.k.setImageResource(2130841416);
                            this.k.setVisibility(0);
                            this.l.setVisibility(8);
                            break;
                        default:
                            TextView textView = this.l;
                            if (bVar.f17027d > 99) {
                                obj = "99+";
                            } else {
                                obj = Integer.valueOf(bVar.f17027d);
                            }
                            textView.setText(String.valueOf(obj));
                            this.l.setVisibility(0);
                            this.k.setVisibility(8);
                            break;
                    }
                } else {
                    this.l.setText(getContext().getResources().getString(C0906R.string.d8s));
                    this.l.setVisibility(0);
                    this.k.setVisibility(8);
                }
                if (!(getContext() == null || getContext().getResources() == null)) {
                    if (bVar.f17027d <= 0) {
                        z = false;
                    }
                    TextView textView2 = this.l;
                    Resources resources = getContext().getResources();
                    if (z) {
                        i2 = C0906R.color.ai8;
                    } else {
                        i2 = C0906R.color.ai9;
                    }
                    textView2.setTextColor(resources.getColor(i2));
                    TextView textView3 = this.l;
                    if (z) {
                        f2 = 20.0f;
                    } else {
                        f2 = 12.0f;
                    }
                    textView3.setTextSize(f2);
                }
                User user = bVar.f17025b;
                if (user != null) {
                    com.bytedance.android.livesdk.chatroom.f.b.b(this.m, user.getAvatarThumb(), this.m.getWidth(), this.m.getHeight(), 2130841141);
                    this.n.setText(user.getNickName());
                }
                if (!TextUtils.isEmpty(bVar.f17028e)) {
                    this.o.setText(bVar.f17028e);
                } else {
                    this.o.setVisibility(8);
                }
                if (this.t) {
                    this.q.setVisibility(8);
                } else {
                    this.q.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16962a;

                        /* renamed from: c  reason: collision with root package name */
                        private static final /* synthetic */ a.C0900a f16963c;

                        static {
                            if (PatchProxy.isSupport(new Object[0], null, f16962a, true, 13048, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], null, f16962a, true, 13048, new Class[0], Void.TYPE);
                                return;
                            }
                            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("TopRankFragment.java", AnonymousClass1.class);
                            f16963c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.rank.fragment.TopRankFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 287);
                        }

                        public void onClick(View view) {
                            String str;
                            String str2;
                            View view2 = view;
                            if (PatchProxy.isSupport(new Object[]{view2}, this, f16962a, false, 13047, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view2}, this, f16962a, false, 13047, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f16963c, this, this, view2));
                            com.bytedance.android.livesdk.rank.model.a aVar = TopRankFragment.this.f16958c;
                            if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.rank.model.a.f17018a, false, 13060, new Class[0], String.class)) {
                                str = (String) PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.rank.model.a.f17018a, false, 13060, new Class[0], String.class);
                            } else if (aVar.f17020c != null) {
                                str = String.valueOf(aVar.f17020c.f17027d);
                            } else {
                                str = "";
                            }
                            if (TextUtils.isEmpty(str)) {
                                com.bytedance.android.livesdk.j.f.a(TopRankFragment.this.getContext()).a("fast_gift", "unland_top_billboard", 0, 0);
                            } else {
                                com.bytedance.android.livesdk.j.f.a(TopRankFragment.this.getContext()).a("fast_gift", "normal_top_billboard", 0, 0);
                            }
                            Bundle bundle = new Bundle();
                            if (TopRankFragment.this.f16961f == 1) {
                                str2 = "hourly";
                            } else {
                                str2 = "regional";
                            }
                            bundle.putString("type", str2);
                            if (TopRankFragment.this.g != null) {
                                TopRankFragment.this.g.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                                TopRankFragment.this.g.lambda$put$1$DataCenter("cmd_send_gift", TopRankFragment.this.f16959d.getOwner());
                            }
                        }
                    });
                }
                this.j.setVisibility(0);
            }
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            this.p.setVisibility(0);
            this.p.c();
        } else {
            UIUtils.setViewVisibility(this.p, 8);
        }
    }

    private void a(b.a aVar) {
        this.r = aVar;
    }

    public final void a(com.bytedance.android.livesdk.rank.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f16956a, false, 13037, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f16956a, false, 13037, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE);
        } else if (aVar != null) {
            this.f16958c = aVar;
            this.r.a(aVar);
            a();
        }
    }

    public final void a(String str) {
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4}, this, f16956a, false, 13038, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4}, this, f16956a, false, 13038, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str4}, this, f16956a, false, 13040, new Class[]{String.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{str4}, this, f16956a, false, 13040, new Class[]{String.class}, String.class);
        } else if (com.bytedance.android.live.uikit.a.a.c() || com.bytedance.android.live.uikit.a.a.e()) {
            if (!StringUtils.isEmpty(str)) {
                String[] split = str4.split(":");
                if (getContext() != null && split.length == 3) {
                    int a2 = ad.a(split[1]);
                    int a3 = ad.a(split[2]);
                    if (a2 > 0) {
                        str2 = getContext().getResources().getString(C0906R.string.cz2, new Object[]{Integer.valueOf(a2)});
                    } else {
                        str2 = getContext().getResources().getString(C0906R.string.cz3, new Object[]{Integer.valueOf(a3)});
                    }
                }
            }
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            if (this.f16958c == null) {
                str3 = "";
            } else {
                str3 = this.f16958c.f17023f;
            }
            sb.append(str3);
            sb.append(str4);
            str2 = sb.toString();
        }
        if (this.f16960e != null && this.s.size() > 1) {
            this.s.set(this.u, str2);
            try {
                this.f16960e.notifyItemChanged(this.u);
            } catch (Exception unused) {
                this.i.getRecycledViewPool().clear();
                this.f16960e.notifyDataSetChanged();
            }
        }
        if (TextUtils.equals(str4, "00:00:01")) {
            com.bytedance.android.livesdk.j.f.a(getContext()).a("wait", "top_billboard", this.f16959d.getId(), 0);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        int i3;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16956a, false, 13030, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16956a, false, 13030, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.h = layoutInflater.inflate(C0906R.layout.ans, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13031, new Class[0], Void.TYPE);
        } else {
            this.i = (RecyclerView) this.h.findViewById(C0906R.id.d5p);
            this.j = this.h.findViewById(C0906R.id.bey);
            this.k = (ImageView) this.j.findViewById(C0906R.id.d5n);
            this.l = (TextView) this.j.findViewById(C0906R.id.d5q);
            this.m = (ImageView) this.j.findViewById(C0906R.id.d5z);
            this.n = (TextView) this.j.findViewById(C0906R.id.d62);
            this.q = this.j.findViewById(C0906R.id.d5t);
            this.o = (TextView) this.j.findViewById(C0906R.id.d5m);
            View view = this.j;
            if (this.g == null || ((Boolean) this.g.get("data_is_portrait", Boolean.TRUE)).booleanValue()) {
                i2 = 2130840698;
            } else {
                i2 = 2130840788;
            }
            view.setBackgroundResource(i2);
            if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13032, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13032, new Class[0], Void.TYPE);
            } else {
                this.p = (LoadingStatusView) this.h.findViewById(C0906R.id.a2e);
                if (!com.bytedance.android.live.uikit.a.a.f() || getContext() == null) {
                    UIUtils.setViewVisibility(this.p, 8);
                } else {
                    Context context = getContext();
                    if (this.t) {
                        i3 = C0906R.string.d1k;
                    } else {
                        i3 = C0906R.string.d1m;
                    }
                    di a2 = new di(getContext()).a(context.getString(i3));
                    a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    a2.a(2130841511);
                    this.p.setBuilder(LoadingStatusView.a.a(getContext()).b((View) a2).a(getResources().getDimensionPixelSize(C0906R.dimen.ms)));
                    this.p.setVisibility(0);
                    this.p.b();
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f16956a, false, 13041, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16956a, false, 13041, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.n.b bVar = (com.bytedance.android.livesdk.n.b) j.q().k().a(com.bytedance.android.livesdk.n.b.class);
                if (bVar != null) {
                    getContext();
                    this.v = bVar.a();
                }
                if (this.v == null) {
                    this.v = new f() {
                    };
                }
            }
        }
        return this.h;
    }

    public static TopRankFragment a(com.bytedance.android.livesdk.rank.model.a aVar, Room room, boolean z, String str, int i2, DataCenter dataCenter) {
        com.bytedance.android.livesdk.rank.model.a aVar2 = aVar;
        Room room2 = room;
        String str2 = str;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{aVar2, room2, Byte.valueOf(z ? (byte) 1 : 0), str2, Integer.valueOf(i2), dataCenter2}, null, f16956a, true, 13029, new Class[]{com.bytedance.android.livesdk.rank.model.a.class, Room.class, Boolean.TYPE, String.class, Integer.TYPE, DataCenter.class}, TopRankFragment.class)) {
            Object[] objArr = {aVar2, room2, Byte.valueOf(z), str2, Integer.valueOf(i2), dataCenter2};
            return (TopRankFragment) PatchProxy.accessDispatch(objArr, null, f16956a, true, 13029, new Class[]{com.bytedance.android.livesdk.rank.model.a.class, Room.class, Boolean.TYPE, String.class, Integer.TYPE, DataCenter.class}, TopRankFragment.class);
        }
        TopRankFragment topRankFragment = new TopRankFragment();
        topRankFragment.f16958c = aVar2;
        topRankFragment.f16959d = room2;
        topRankFragment.t = z;
        topRankFragment.f16957b = str2;
        topRankFragment.f16961f = i2;
        topRankFragment.g = dataCenter2;
        topRankFragment.a((b.a) new com.bytedance.android.livesdk.rank.c.b(topRankFragment, aVar2));
        i.a();
        return topRankFragment;
    }
}
