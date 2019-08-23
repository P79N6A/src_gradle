package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.notification.widget.BadgeView;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class AggregatedPresenter implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57767a;

    /* renamed from: b  reason: collision with root package name */
    AggregatedAdapter f57768b;

    /* renamed from: c  reason: collision with root package name */
    b f57769c = new b();

    static class AggregatedAdapter extends RecyclerView.Adapter<AggregatedViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57770a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a> f57771b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f57772c;

        /* renamed from: d  reason: collision with root package name */
        private final b f57773d;

        static class AggregatedViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public TextView f57782a;

            /* renamed from: b  reason: collision with root package name */
            public ImageView f57783b;

            /* renamed from: c  reason: collision with root package name */
            public final BadgeView f57784c;

            /* renamed from: d  reason: collision with root package name */
            private TextView f57785d;

            AggregatedViewHolder(View view) {
                super(view);
                this.f57783b = (ImageView) view.findViewById(C0906R.id.dv);
                this.f57782a = (TextView) view.findViewById(C0906R.id.dw);
                this.f57785d = (TextView) view.findViewById(C0906R.id.dl6);
                this.f57784c = new BadgeView(view.getContext());
                this.f57784c.setTargetView(this.f57785d);
                this.f57784c.a(35, Color.parseColor("#face15"));
                this.f57784c.setBadgeGravity(17);
                if (this.f57783b != null) {
                    c.b(this.f57783b);
                }
            }
        }

        private static String a(int i) {
            switch (i) {
                case 0:
                    return "fans";
                case 1:
                    return "like";
                case 2:
                    return "at";
                case 3:
                    return "comment";
                default:
                    switch (i) {
                        case SearchNilInfo.HIT_TYPE_SENSITIVE:
                            return "commentandat";
                        case 13:
                            return "story";
                        default:
                            return null;
                    }
            }
        }

        public int getItemCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f57770a, false, 62705, new Class[0], Integer.TYPE)) {
                return this.f57771b.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57770a, false, 62705, new Class[0], Integer.TYPE)).intValue();
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = viewGroup;
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57770a, false, 62702, new Class[]{ViewGroup.class, Integer.TYPE}, AggregatedViewHolder.class)) {
                return new AggregatedViewHolder(LayoutInflater.from(this.f57772c).inflate(C0906R.layout.ev, viewGroup2, false));
            }
            return (AggregatedViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f57770a, false, 62702, new Class[]{ViewGroup.class, Integer.TYPE}, AggregatedViewHolder.class);
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Drawable drawable;
            final AggregatedViewHolder aggregatedViewHolder = (AggregatedViewHolder) viewHolder;
            if (PatchProxy.isSupport(new Object[]{aggregatedViewHolder, Integer.valueOf(i)}, this, f57770a, false, 62704, new Class[]{AggregatedViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aggregatedViewHolder, Integer.valueOf(i)}, this, f57770a, false, 62704, new Class[]{AggregatedViewHolder.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            final a aVar = this.f57771b.get(i);
            ImageView imageView = aggregatedViewHolder.f57783b;
            int i2 = aVar.f57789b;
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f57770a, true, 62706, new Class[]{Integer.TYPE}, Drawable.class)) {
                switch (i2) {
                    case 0:
                        drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839721);
                        break;
                    case 1:
                        drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839723);
                        break;
                    case 2:
                        drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839725);
                        break;
                    case 3:
                        drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839720);
                        break;
                    default:
                        switch (i2) {
                            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                                drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839722);
                                break;
                            case 13:
                                drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839726);
                                break;
                            default:
                                drawable = null;
                                break;
                        }
                }
            } else {
                drawable = (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f57770a, true, 62706, new Class[]{Integer.TYPE}, Drawable.class);
            }
            imageView.setImageDrawable(drawable);
            aggregatedViewHolder.f57782a.setText(aVar.f57790c);
            aggregatedViewHolder.f57784c.setBadgeCount(aVar.f57791d);
            aggregatedViewHolder.f57783b.setContentDescription(aVar.f57790c);
            aggregatedViewHolder.f57783b.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57774a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57774a, false, 62709, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57774a, false, 62709, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar.f57789b == 3) {
                        com.ss.android.ugc.aweme.message.c.c.a().a(2);
                        com.ss.android.ugc.aweme.message.c.c.a().a(43);
                        com.ss.android.ugc.aweme.message.c.c.a().a(44);
                    }
                    AggregatedAdapter.this.a(view, aVar, aggregatedViewHolder.getAdapterPosition());
                }
            });
            aggregatedViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57778a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f57778a, false, 62710, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f57778a, false, 62710, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (aVar.f57789b == 3) {
                        com.ss.android.ugc.aweme.message.c.c.a().a(2);
                        com.ss.android.ugc.aweme.message.c.c.a().a(43);
                        com.ss.android.ugc.aweme.message.c.c.a().a(44);
                    }
                    AggregatedAdapter.this.a(view, aVar, aggregatedViewHolder.getAdapterPosition());
                }
            });
            aggregatedViewHolder.itemView.setContentDescription(aVar.f57790c);
            a(a(aVar.f57789b), "show", aVar.f57791d);
        }

        AggregatedAdapter(@NonNull Context context, @NonNull List<a> list, b bVar) {
            this.f57772c = context;
            this.f57771b = list;
            this.f57773d = bVar;
        }

        private void a(String str, String str2, int i) {
            String str3 = str;
            String str4 = str2;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, f57770a, false, 62707, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, f57770a, false, 62707, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 > 0 && !TextUtils.isEmpty(str)) {
                r.a("notification_notice", (Map) d.a().a("notice_type", "number_dot").a("account_type", str3).a("action_type", str4).a("show_cnt", i2).f34114b);
            }
        }

        public final void a(View view, a aVar, int i) {
            a aVar2 = aVar;
            int i2 = 3;
            if (PatchProxy.isSupport(new Object[]{view, aVar2, Integer.valueOf(i)}, this, f57770a, false, 62708, new Class[]{View.class, a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aVar2, Integer.valueOf(i)}, this, f57770a, false, 62708, new Class[]{View.class, a.class, Integer.TYPE}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                NotificationDetailActivity.a(this.f57772c, aVar2.f57789b, aVar2.f57791d);
                a(a(aVar2.f57789b), "click", aVar2.f57791d);
                int i3 = aVar2.f57789b;
                switch (i3) {
                    case 0:
                        i2 = 7;
                        break;
                    case 1:
                        break;
                    case 2:
                        i2 = 6;
                        break;
                    case 3:
                        i2 = 44;
                        break;
                    default:
                        switch (i3) {
                            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                                i2 = 28;
                                break;
                            case 13:
                                i2 = 24;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                }
                bg.a(new com.ss.android.ugc.aweme.message.b.c(i2, 0));
                if (this.f57773d != null) {
                    b bVar = this.f57773d;
                    if (PatchProxy.isSupport(new Object[]{1, Integer.valueOf(i)}, bVar, b.f57958a, false, 62695, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{1, Integer.valueOf(i)}, bVar2, b.f57958a, false, 62695, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (bVar.f57959b != null) {
                        bVar.f57959b.a(i);
                    }
                }
            }
        }
    }

    static class ScrollEnabledGridLayoutManager extends GridLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57786a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f57787b = true;

        public boolean canScrollHorizontally() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f57786a, false, 62712, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57786a, false, 62712, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (this.f57787b && super.canScrollHorizontally()) {
                z = true;
            }
            return z;
        }

        public boolean canScrollVertically() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f57786a, false, 62711, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57786a, false, 62711, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (this.f57787b && super.canScrollVertically()) {
                z = true;
            }
            return z;
        }

        ScrollEnabledGridLayoutManager(Context context, int i) {
            super(context, 4);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f57788a;

        /* renamed from: b  reason: collision with root package name */
        int f57789b;

        /* renamed from: c  reason: collision with root package name */
        String f57790c;

        /* renamed from: d  reason: collision with root package name */
        public int f57791d;

        a(int i, int i2, String str) {
            this.f57788a = i;
            this.f57789b = i2;
            this.f57790c = str;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57767a, false, 62700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57767a, false, 62700, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57768b != null) {
            this.f57768b.notifyDataSetChanged();
        }
    }

    public final void a(int i) {
        a aVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57767a, false, 62701, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57767a, false, 62701, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f57768b != null && i2 < this.f57768b.getItemCount() && i2 >= 0) {
            AggregatedAdapter aggregatedAdapter = this.f57768b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aggregatedAdapter, AggregatedAdapter.f57770a, false, 62703, new Class[]{Integer.TYPE}, a.class)) {
                AggregatedAdapter aggregatedAdapter2 = aggregatedAdapter;
                aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aggregatedAdapter2, AggregatedAdapter.f57770a, false, 62703, new Class[]{Integer.TYPE}, a.class);
            } else {
                aVar = aggregatedAdapter.f57771b.get(i2);
            }
            aVar.f57791d = 0;
            this.f57768b.notifyItemChanged(i2);
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57767a, false, 62698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57767a, false, 62698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f57768b != null) {
            for (a next : this.f57768b.f57771b) {
                if (i == next.f57789b) {
                    next.f57791d = i2;
                    this.f57768b.notifyItemChanged(next.f57788a);
                }
            }
        }
    }

    public final void a(RecyclerView recyclerView, Context context) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, context}, this, f57767a, false, 62696, new Class[]{RecyclerView.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, context}, this, f57767a, false, 62696, new Class[]{RecyclerView.class, Context.class}, Void.TYPE);
            return;
        }
        ScrollEnabledGridLayoutManager scrollEnabledGridLayoutManager = new ScrollEnabledGridLayoutManager(context, 4);
        scrollEnabledGridLayoutManager.f57787b = false;
        recyclerView.setLayoutManager(scrollEnabledGridLayoutManager);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(0, 0, context.getString(C0906R.string.agu)));
        arrayList.add(new a(1, 1, context.getString(C0906R.string.aqu)));
        if (com.ss.android.g.a.a()) {
            arrayList.add(new a(2, 2, context.getString(C0906R.string.avw)));
            arrayList.add(new a(3, 3, context.getString(C0906R.string.aq0)));
        } else {
            arrayList.add(new a(2, 12, context.getString(C0906R.string.att)));
            arrayList.add(new a(3, 13, context.getString(C0906R.string.ayj)));
        }
        this.f57769c.f57959b = this;
        this.f57768b = new AggregatedAdapter(context, arrayList, this.f57769c);
        recyclerView.setAdapter(this.f57768b);
    }
}
