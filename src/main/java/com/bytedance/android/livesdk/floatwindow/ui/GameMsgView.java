package com.bytedance.android.livesdk.floatwindow.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.presenter.bu;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.floatwindow.g;
import com.bytedance.android.livesdk.floatwindow.h;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.aspectj.lang.a;

public final class GameMsgView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14588a = null;
    static int h = -1;

    /* renamed from: b  reason: collision with root package name */
    TextView f14589b;

    /* renamed from: c  reason: collision with root package name */
    TextView f14590c;

    /* renamed from: d  reason: collision with root package name */
    LiveMessageRecyclerView f14591d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14592e = true;

    /* renamed from: f  reason: collision with root package name */
    GameMsgAdapter f14593f;
    public a g;
    public ArrayList<Integer> i;
    private ImageView j;
    private List<b> k;
    private Disposable l;
    private SmoothLinearLayoutManager m;
    private bu n;
    private View o;

    class GameMsgAdapter extends RecyclerView.Adapter<GameMsgViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14597a;

        /* renamed from: b  reason: collision with root package name */
        public List<b> f14598b;

        /* renamed from: d  reason: collision with root package name */
        private final LayoutInflater f14600d;

        public int getItemCount() {
            if (PatchProxy.isSupport(new Object[0], this, f14597a, false, 9139, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14597a, false, 9139, new Class[0], Integer.TYPE)).intValue();
            } else if (this.f14598b == null) {
                return 0;
            } else {
                return this.f14598b.size();
            }
        }

        GameMsgAdapter() {
            this.f14600d = LayoutInflater.from(GameMsgView.this.getContext());
        }

        /* access modifiers changed from: package-private */
        public final void a(List<b> list) {
            List<b> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f14597a, false, 9136, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f14597a, false, 9136, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f14598b = list2;
            notifyDataSetChanged();
        }

        @NonNull
        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f14597a, false, 9137, new Class[]{ViewGroup.class, Integer.TYPE}, GameMsgViewHolder.class)) {
                return new GameMsgViewHolder(this.f14600d.inflate(C0906R.layout.ajb, viewGroup, false));
            }
            return (GameMsgViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f14597a, false, 9137, new Class[]{ViewGroup.class, Integer.TYPE}, GameMsgViewHolder.class);
        }

        public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            GameMsgViewHolder gameMsgViewHolder = (GameMsgViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{gameMsgViewHolder, Integer.valueOf(i)}, this, f14597a, false, 9138, new Class[]{GameMsgViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gameMsgViewHolder, Integer.valueOf(i)}, this, f14597a, false, 9138, new Class[]{GameMsgViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            b bVar = this.f14598b.get(i);
            if (PatchProxy.isSupport(new Object[]{bVar}, gameMsgViewHolder, GameMsgViewHolder.f14601a, false, 9140, new Class[]{b.class}, Void.TYPE)) {
                GameMsgViewHolder gameMsgViewHolder2 = gameMsgViewHolder;
                PatchProxy.accessDispatch(new Object[]{bVar}, gameMsgViewHolder2, GameMsgViewHolder.f14601a, false, 9140, new Class[]{b.class}, Void.TYPE);
                return;
            }
            if ((bVar.f10013b.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType() || bVar.f10013b.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getIntType()) && !((Boolean) com.bytedance.android.livesdk.w.b.Y.a()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bVar.f10013b.getIntType() != com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType() || ((Boolean) com.bytedance.android.livesdk.w.b.X.a()).booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            int intType = bVar.f10013b.getIntType();
            if (z || z2 || !GameMsgView.this.i.contains(Integer.valueOf(intType)) || bVar.h) {
                bVar.h = true;
            } else {
                bVar.h = false;
                Spannable p = bVar.p();
                if (p != null) {
                    gameMsgViewHolder.f14602b.setVisibility(0);
                    gameMsgViewHolder.f14602b.setText(p);
                    return;
                }
            }
            gameMsgViewHolder.f14602b.setVisibility(8);
        }
    }

    class GameMsgViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14601a;

        /* renamed from: b  reason: collision with root package name */
        TextView f14602b;

        GameMsgViewHolder(View view) {
            super(view);
            this.f14602b = (TextView) view.findViewById(C0906R.id.text);
        }
    }

    public interface a {
        void a(boolean z);
    }

    private int getLayoutId() {
        return C0906R.layout.amf;
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14588a, false, 9131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14588a, false, 9131, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.dispose();
        }
        this.n = null;
        super.onDetachedFromWindow();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14588a, false, 9128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14588a, false, 9128, new Class[0], Void.TYPE);
            return;
        }
        a(this.f14592e);
        if (this.f14592e) {
            this.j.setImageResource(2130841167);
            this.f14591d.setVisibility(8);
            this.f14589b.setVisibility(0);
            a();
            return;
        }
        this.j.setImageResource(2130841166);
        this.f14591d.setVisibility(0);
        this.f14593f.a(this.k);
        this.f14589b.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f14588a, false, 9125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14588a, false, 9125, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            List<b> list = this.n.f11325d;
            if (!CollectionUtils.isEmpty(list)) {
                b bVar = list.get(list.size() - 1);
                if (bVar != null) {
                    boolean z2 = !((Boolean) com.bytedance.android.livesdk.w.b.Y.a()).booleanValue();
                    boolean z3 = !((Boolean) com.bytedance.android.livesdk.w.b.X.a()).booleanValue();
                    if (bVar.f10014c != 1 && this.i.contains(Integer.valueOf(bVar.f10013b.getIntType()))) {
                        if ((bVar.f10013b.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType() || bVar.f10013b.getIntType() == com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getIntType()) && z2) {
                            z = true;
                        }
                        if (!z) {
                            if (bVar.f10013b.getIntType() != com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType() || !z3) {
                                this.f14589b.setText(bVar.p());
                            }
                        }
                    }
                }
            }
        }
    }

    public static void a(int i2) {
        h = i2;
    }

    public final void setOnViewClickListener(a aVar) {
        this.g = aVar;
    }

    private void setMsgList(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f14588a, false, 9127, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f14588a, false, 9127, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.k = list;
        this.f14593f.a(list);
    }

    public final void setPresenter(bu buVar) {
        if (PatchProxy.isSupport(new Object[]{buVar}, this, f14588a, false, 9130, new Class[]{bu.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{buVar}, this, f14588a, false, 9130, new Class[]{bu.class}, Void.TYPE);
            return;
        }
        this.n = buVar;
        if (buVar != null) {
            setMsgList(buVar.f11325d);
        }
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14588a, false, 9129, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14588a, false, 9129, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        g gVar = (g) h.a("msg_view");
        if (gVar != null && gVar.c()) {
            if (z) {
                gVar.f14548b.b((int) ak.a(getContext(), 280.0f), (int) ak.a(getContext(), 24.0f));
            } else {
                gVar.f14548b.b((int) ak.a(getContext(), 280.0f), (int) ak.a(getContext(), 220.0f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameMsgView(Context context) {
        super(context);
        Flowable flowable;
        if (PatchProxy.isSupport(new Object[0], this, f14588a, false, 9123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14588a, false, 9123, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        this.f14589b = (TextView) findViewById(C0906R.id.deu);
        this.f14590c = (TextView) findViewById(C0906R.id.dfl);
        this.j = (ImageView) findViewById(C0906R.id.ayn);
        this.o = findViewById(C0906R.id.y_);
        this.f14591d = (LiveMessageRecyclerView) findViewById(C0906R.id.bmu);
        this.o.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14594a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f14595c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f14594a, true, 9135, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f14594a, true, 9135, new Class[0], Void.TYPE);
                    return;
                }
                org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("GameMsgView.java", AnonymousClass1.class);
                f14595c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.floatwindow.ui.GameMsgView$1", "android.view.View", "view", "", "void"), 103);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14594a, false, 9134, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14594a, false, 9134, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f14595c, this, this, view));
                GameMsgView.this.f14592e = !GameMsgView.this.f14592e;
                GameMsgView.this.b();
                if (GameMsgView.this.g != null) {
                    GameMsgView.this.g.a(GameMsgView.this.f14592e);
                }
            }
        });
        b();
        this.f14593f = new GameMsgAdapter();
        this.m = new SmoothLinearLayoutManager(getContext(), 1, false);
        this.f14591d.setLayoutManager(this.m);
        this.f14591d.setAdapter(this.f14593f);
        this.f14591d.setItemAnimator(null);
        this.i = new ArrayList<>();
        this.i.add(Integer.valueOf(com.bytedance.android.livesdkapi.depend.f.a.GIFT.getIntType()));
        this.i.add(Integer.valueOf(com.bytedance.android.livesdkapi.depend.f.a.DOODLE_GIFT.getIntType()));
        this.i.add(Integer.valueOf(com.bytedance.android.livesdkapi.depend.f.a.CHAT.getIntType()));
        a(0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (PatchProxy.isSupport(new Object[]{1L, timeUnit}, null, com.bytedance.android.livesdk.utils.b.a.f17589a, true, 13809, new Class[]{Long.TYPE, TimeUnit.class}, Flowable.class)) {
            Object[] objArr = {1L, timeUnit};
            flowable = (Flowable) PatchProxy.accessDispatch(objArr, null, com.bytedance.android.livesdk.utils.b.a.f17589a, true, 13809, new Class[]{Long.TYPE, TimeUnit.class}, Flowable.class);
        } else {
            Scheduler computation = Schedulers.computation();
            Object[] objArr2 = {new Long(1), new Long(1), timeUnit, computation};
            if (PatchProxy.isSupport(objArr2, null, com.bytedance.android.livesdk.utils.b.a.f17589a, true, 13808, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Flowable.class)) {
                Object[] objArr3 = {new Long(1), new Long(1), timeUnit, computation};
                Object[] objArr4 = objArr3;
                flowable = (Flowable) PatchProxy.accessDispatch(objArr4, null, com.bytedance.android.livesdk.utils.b.a.f17589a, true, 13808, new Class[]{Long.TYPE, Long.TYPE, TimeUnit.class, Scheduler.class}, Flowable.class);
            } else {
                ObjectHelper.requireNonNull(timeUnit, "unit is null");
                ObjectHelper.requireNonNull(computation, "scheduler is null");
                FlowableInterval flowableInterval = new FlowableInterval(Math.max(0, 1), Math.max(0, 1), timeUnit, computation);
                flowable = RxJavaPlugins.onAssembly((Flowable<T>) flowableInterval);
            }
        }
        this.l = flowable.onBackpressureBuffer(100).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(this), b.f14607b);
    }
}
