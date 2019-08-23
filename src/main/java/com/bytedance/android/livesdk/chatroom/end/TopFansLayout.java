package com.bytedance.android.livesdk.chatroom.end;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.end.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.a;

public class TopFansLayout extends LinearLayout implements LifecycleObserver, j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1837a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f1838b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CompositeDisposable f1839c = new CompositeDisposable();

    /* renamed from: d  reason: collision with root package name */
    a f1840d;

    /* renamed from: e  reason: collision with root package name */
    Activity f1841e;

    /* renamed from: f  reason: collision with root package name */
    public Room f1842f;
    View.OnClickListener g;
    public j h;
    public String i;
    public View j = null;
    public boolean k = true;
    View.OnClickListener l = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10085a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10086c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10085a, true, 4286, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10085a, true, 4286, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("TopFansLayout.java", AnonymousClass3.class);
            f10086c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.TopFansLayout$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 326);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10085a, false, 4285, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10085a, false, 4285, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f10086c, this, this, view));
            if (view.getId() == C0906R.id.b1d) {
                g gVar = (g) view.getTag(C0906R.id.d7q);
                User user = gVar.f18736b;
                if (user != null) {
                    TopFansLayout.this.j = view;
                    if (!TTLiveSDKContext.getHostService().k().c()) {
                        TTLiveSDKContext.getHostService().k().a(TopFansLayout.this.getContext(), i.a().a(f.a()).b(f.b()).d("live_detail").e("follow").c("live").a(1).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<com.bytedance.android.live.base.model.user.i>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10088a;

                            public final void onSubscribe(Disposable disposable) {
                                Disposable disposable2 = disposable;
                                if (PatchProxy.isSupport(new Object[]{disposable2}, this, f10088a, false, 4287, new Class[]{Disposable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{disposable2}, this, f10088a, false, 4287, new Class[]{Disposable.class}, Void.TYPE);
                                    return;
                                }
                                super.onSubscribe(disposable);
                                TopFansLayout.this.f1839c.add(disposable2);
                            }
                        });
                        return;
                    }
                    TopFansLayout.this.h.a(user.getId(), TopFansLayout.this.f1842f, TopFansLayout.this.i, TopFansLayout.this);
                    TopFansLayout.this.a("pm_live_take_anchor_follow_audience", gVar);
                }
            }
        }
    };
    private List<g> m;
    private Fragment n;
    private DataCenter o;

    public interface a {
        void a();
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f10090a;

        /* renamed from: b  reason: collision with root package name */
        public View f10091b;

        /* renamed from: c  reason: collision with root package name */
        public VHeadView f10092c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f10093d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f10094e;

        private b(View view) {
            this.f10091b = view;
            this.f10090a = view.findViewById(C0906R.id.b1d);
            this.f10092c = (VHeadView) view.findViewById(C0906R.id.ane);
            this.f10093d = (TextView) view.findViewById(C0906R.id.d62);
            this.f10094e = (TextView) view.findViewById(C0906R.id.d61);
        }

        /* synthetic */ b(View view, byte b2) {
            this(view);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f1837a, false, 4273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1837a, false, 4273, new Class[0], Void.TYPE);
            return;
        }
        for (b bVar : this.f1838b) {
            final User user = ((g) bVar.f10092c.getTag(C0906R.id.d7q)).f18736b;
            TTLiveSDKContext.getHostService().k().b(user.getId()).subscribe((SingleObserver<? super T>) new SingleObserver<com.bytedance.android.live.base.model.user.i>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f10082a;

                public final void onError(Throwable th) {
                }

                public final void onSubscribe(Disposable disposable) {
                    Disposable disposable2 = disposable;
                    if (PatchProxy.isSupport(new Object[]{disposable2}, this, f10082a, false, 4283, new Class[]{Disposable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{disposable2}, this, f10082a, false, 4283, new Class[]{Disposable.class}, Void.TYPE);
                        return;
                    }
                    TopFansLayout.this.f1839c.add(disposable2);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    com.bytedance.android.live.base.model.user.i iVar = (com.bytedance.android.live.base.model.user.i) obj;
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f10082a, false, 4284, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iVar}, this, f10082a, false, 4284, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE);
                        return;
                    }
                    if (!TopFansLayout.this.f1838b.isEmpty()) {
                        for (b next : TopFansLayout.this.f1838b) {
                            g gVar = (g) next.f10092c.getTag(C0906R.id.d7q);
                            User user = gVar.f18736b;
                            if (user != null && user.getId() == user.getId()) {
                                gVar.f18736b = User.from(user);
                                next.f10092c.setTag(C0906R.id.d7q, gVar);
                                next.f10090a.setTag(C0906R.id.d7q, gVar);
                                if (user.getId() == TTLiveSDKContext.getHostService().k().b() || user.isFollowing() || !TopFansLayout.this.k) {
                                    next.f10090a.setVisibility(8);
                                    return;
                                } else {
                                    next.f10090a.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f1837a, false, 4274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1837a, false, 4274, new Class[0], Void.TYPE);
            return;
        }
        this.f1839c.clear();
        j jVar = this.h;
        if (PatchProxy.isSupport(new Object[0], jVar, j.f10112a, false, 4258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], jVar, j.f10112a, false, 4258, new Class[0], Void.TYPE);
            return;
        }
        jVar.f10113b.clear();
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.o = dataCenter;
    }

    public void setFollowVisible(boolean z) {
        this.k = z;
    }

    public void setTopFansCallBack(a aVar) {
        this.f1840d = aVar;
    }

    public TopFansLayout(Context context) {
        super(context);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f1837a, false, 4276, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f1837a, false, 4276, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
        } else if (this.f1841e != null) {
            if (this.j != null && this.j.getVisibility() == 0) {
                this.j.setVisibility(8);
            }
            com.bytedance.android.live.uikit.d.a.a((Context) this.f1841e, (int) C0906R.string.d36);
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f1837a, false, 4277, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f1837a, false, 4277, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f1841e != null && th != null) {
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f1841e, ((com.bytedance.android.live.a.a.b.a) th).getPrompt());
            } else {
                com.bytedance.android.live.uikit.d.a.a((Context) this.f1841e, (int) C0906R.string.d35);
            }
        }
    }

    public TopFansLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(String str, g gVar) {
        String str2;
        String str3 = str;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str3, gVar2}, this, f1837a, false, 4275, new Class[]{String.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, gVar2}, this, f1837a, false, 4275, new Class[]{String.class, g.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && gVar2 != null) {
            if (gVar2.f18737c == 1) {
                str2 = "no.1";
            } else if (gVar2.f18737c == 2) {
                str2 = "no.2";
            } else {
                str2 = "no.3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "anchor_live_ending");
            hashMap.put("people", str2);
            com.bytedance.android.livesdk.j.a.a().a(str3, hashMap, new k());
        }
    }

    public TopFansLayout(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @RequiresApi(api = 21)
    public TopFansLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @SuppressLint({"CheckResult"})
    public final void a(Activity activity, BaseFragment baseFragment, Room room, String str) {
        Activity activity2 = activity;
        BaseFragment baseFragment2 = baseFragment;
        Room room2 = room;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, baseFragment2, room2, str2}, this, f1837a, false, 4271, new Class[]{Activity.class, BaseFragment.class, Room.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, baseFragment2, room2, str2}, this, f1837a, false, 4271, new Class[]{Activity.class, BaseFragment.class, Room.class, String.class}, Void.TYPE);
        } else if (activity2 != null && room2 != null) {
            this.f1842f = room2;
            this.m = room.getTopFanTickets();
            this.f1841e = activity2;
            this.n = baseFragment2;
            this.i = str2;
            ((com.bytedance.android.livesdk.utils.b.b) Observable.fromIterable(this.m).as(c.a())).b(k.f10118b).toList().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new l(this, baseFragment2), m.f10123b);
            this.g = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f10079a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f10080c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f10079a, true, 4282, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f10079a, true, 4282, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("TopFansLayout.java", AnonymousClass1.class);
                    f10080c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 225);
                }

                public void onClick(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f10079a, false, 4281, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f10079a, false, 4281, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f10080c, this, this, view2));
                    if (view.getId() == C0906R.id.ane) {
                        g gVar = (g) view2.getTag(C0906R.id.d7q);
                        if (gVar != null) {
                            TopFansLayout topFansLayout = TopFansLayout.this;
                            User user = gVar.f18736b;
                            if (PatchProxy.isSupport(new Object[]{user}, topFansLayout, TopFansLayout.f1837a, false, 4272, new Class[]{User.class}, Void.TYPE)) {
                                TopFansLayout topFansLayout2 = topFansLayout;
                                PatchProxy.accessDispatch(new Object[]{user}, topFansLayout2, TopFansLayout.f1837a, false, 4272, new Class[]{User.class}, Void.TYPE);
                            } else if (user != null) {
                                HashMap hashMap = new HashMap(1);
                                hashMap.put("log_enter_live_source", topFansLayout.i);
                                hashMap.put("sec_user_id", user.getSecUid());
                                TTLiveSDKContext.getHostService().i().a(user.getId(), (Map<String, String>) hashMap);
                            }
                        }
                        TopFansLayout.this.a("pm_live_take_audience_pic_click", gVar);
                    }
                }
            };
            this.n.getLifecycle().addObserver(this);
            this.h = new j();
        }
    }
}
