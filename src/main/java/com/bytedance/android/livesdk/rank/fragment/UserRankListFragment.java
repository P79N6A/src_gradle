package com.bytedance.android.livesdk.rank.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.di;
import com.bytedance.android.livesdk.rank.model.b;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;

public abstract class UserRankListFragment extends BaseFragment implements WeakHandler.IHandler {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f16968c;
    public g<i> A;

    /* renamed from: a  reason: collision with root package name */
    private final CompositeDisposable f16969a = new CompositeDisposable();
    protected View h;
    protected View i;
    protected ImageView j;
    protected TextView k;
    protected ImageView l;
    protected HSImageView m;
    protected TextView n;
    protected TextView o;
    protected View p;
    protected View q;
    protected RecyclerView r;
    protected LoadingStatusView s;
    protected View t;
    protected WeakHandler u = new WeakHandler(this);
    protected boolean v;
    protected long w;
    protected long x;
    protected e y;
    public DataCenter z;

    public abstract void b();

    public abstract int c();

    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f16968c, false, 13052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16968c, false, 13052, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f16969a.clear();
    }

    /* renamed from: d */
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f16968c, false, 13053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16968c, false, 13053, new Class[0], Void.TYPE);
            return;
        }
        this.r.setVisibility(8);
        this.h.setVisibility(8);
        this.t.setVisibility(8);
        this.s.setVisibility(0);
        this.s.b();
        b();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        Bundle bundle = new Bundle();
        bundle.putString("page_source", "contribution_ranklist");
        bundle.putString("enter_from", "live_detail");
        bundle.putString("user_id", String.valueOf(this.x));
        if (c() == 1) {
            bundle.putString("type", "totally_rank");
        } else if (c() == 2) {
            bundle.putString("type", "weekly_rank");
        } else if (c() == 3) {
            bundle.putString("type", "live_room_rank");
        }
        if (this.z != null) {
            User user = new User();
            user.setId(this.x);
            this.z.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
            this.z.lambda$put$1$DataCenter("cmd_send_gift", user);
        }
    }

    public final boolean a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f16968c, false, 13055, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f16968c, false, 13055, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else if (!a.f()) {
            return true;
        } else {
            if (bVar2 == null || bVar2.f17026c <= 0) {
                return false;
            }
            return true;
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16968c, false, 13050, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16968c, false, 13050, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.v = arguments.getBoolean("broadcaster");
        this.w = arguments.getLong("room_id");
        this.x = arguments.getLong("owner_id");
        this.y = TTLiveSDKContext.getHostService().k();
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        Context context;
        int i3;
        di diVar;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16968c, false, 13051, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16968c, false, 13051, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.aim, viewGroup2, false);
        this.r = (RecyclerView) inflate.findViewById(C0906R.id.c_k);
        this.r.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.h = inflate.findViewById(C0906R.id.c_b);
        this.j = (ImageView) inflate.findViewById(C0906R.id.c_h);
        this.k = (TextView) inflate.findViewById(C0906R.id.c_l);
        this.l = (ImageView) inflate.findViewById(C0906R.id.dp2);
        this.m = (HSImageView) inflate.findViewById(C0906R.id.ays);
        this.n = (TextView) inflate.findViewById(C0906R.id.dq2);
        this.o = (TextView) inflate.findViewById(C0906R.id.c_f);
        this.p = inflate.findViewById(C0906R.id.a5u);
        this.q = inflate.findViewById(C0906R.id.cnt);
        this.q.setOnClickListener(new l(this));
        this.i = inflate.findViewById(C0906R.id.c_c);
        View view = this.i;
        if (this.z == null || ((Boolean) this.z.get("data_is_portrait", Boolean.TRUE)).booleanValue()) {
            i2 = 2130840698;
        } else {
            i2 = 2130840788;
        }
        view.setBackgroundResource(i2);
        this.t = inflate.findViewById(C0906R.id.bki);
        this.t.setOnClickListener(new m(this));
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a_c, null).setOnClickListener(new n(this));
        if (this.v) {
            context = getContext();
            i3 = C0906R.string.d1k;
        } else {
            context = getContext();
            i3 = C0906R.string.d1l;
        }
        di a2 = new di(getContext()).a(context.getString(i3));
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (a.f()) {
            a2.a(2130841511);
        }
        this.s = (LoadingStatusView) inflate.findViewById(C0906R.id.cvd);
        LoadingStatusView loadingStatusView = this.s;
        LoadingStatusView.a a3 = LoadingStatusView.a.a(getContext());
        if (PatchProxy.isSupport(new Object[0], this, f16968c, false, 13054, new Class[0], View.class)) {
            diVar = (View) PatchProxy.accessDispatch(new Object[0], this, f16968c, false, 13054, new Class[0], View.class);
        } else if (a.f()) {
            di a4 = new di(getContext()).a(getContext().getString(C0906R.string.dl5)).a(2130840818);
            a4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            diVar = a4;
        } else {
            View inflate2 = LayoutInflater.from(getContext()).inflate(C0906R.layout.a_c, null);
            inflate2.setOnClickListener(new o(this));
            diVar = inflate2;
        }
        loadingStatusView.setBuilder(a3.c(diVar).b((View) a2).a(getResources().getDimensionPixelSize(C0906R.dimen.ms)));
        this.s.b();
        b();
        return inflate;
    }
}
