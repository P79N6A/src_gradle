package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseChallengeAdapter extends RecyclerView.Adapter<EnterpriseChallengeViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61806a;

    /* renamed from: b  reason: collision with root package name */
    Map<Integer, Boolean> f61807b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private List<Challenge> f61808c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f61809d;

    /* renamed from: e  reason: collision with root package name */
    private q f61810e;

    static class EnterpriseChallengeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61811a;

        /* renamed from: b  reason: collision with root package name */
        TextView f61812b;

        /* renamed from: c  reason: collision with root package name */
        TextView f61813c;

        /* renamed from: d  reason: collision with root package name */
        View f61814d;

        EnterpriseChallengeViewHolder(View view) {
            super(view);
            this.f61814d = view.findViewById(C0906R.id.rs);
            this.f61812b = (TextView) view.findViewById(C0906R.id.rx);
            this.f61813c = (TextView) view.findViewById(C0906R.id.ru);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61806a, false, 68002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61806a, false, 68002, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61808c != null) {
            for (int i = 0; i < this.f61808c.size(); i++) {
                this.f61807b.put(Integer.valueOf(i), Boolean.FALSE);
            }
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f61806a, false, 68009, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61806a, false, 68009, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f61808c == null) {
            return 0;
        } else {
            return this.f61808c.size();
        }
    }

    public /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        EnterpriseChallengeViewHolder enterpriseChallengeViewHolder = (EnterpriseChallengeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{enterpriseChallengeViewHolder}, this, f61806a, false, 68006, new Class[]{EnterpriseChallengeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enterpriseChallengeViewHolder}, this, f61806a, false, 68006, new Class[]{EnterpriseChallengeViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(enterpriseChallengeViewHolder);
    }

    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        EnterpriseChallengeViewHolder enterpriseChallengeViewHolder = (EnterpriseChallengeViewHolder) viewHolder;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{enterpriseChallengeViewHolder}, this, f61806a, false, 68005, new Class[]{EnterpriseChallengeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enterpriseChallengeViewHolder}, this, f61806a, false, 68005, new Class[]{EnterpriseChallengeViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(enterpriseChallengeViewHolder);
        if (!(enterpriseChallengeViewHolder == null || this.f61809d == null)) {
            if (this.f61808c != null) {
                i = this.f61808c.size();
            }
            int adapterPosition = enterpriseChallengeViewHolder.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < i) {
                Challenge challenge = this.f61808c.get(adapterPosition);
                if (challenge != null && !this.f61807b.get(Integer.valueOf(adapterPosition)).booleanValue()) {
                    this.f61810e.a((Context) this.f61809d, challenge);
                    this.f61807b.put(Integer.valueOf(adapterPosition), Boolean.TRUE);
                }
            }
        }
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61806a, false, 68004, new Class[]{ViewGroup.class, Integer.TYPE}, EnterpriseChallengeViewHolder.class)) {
            return (EnterpriseChallengeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f61806a, false, 68004, new Class[]{ViewGroup.class, Integer.TYPE}, EnterpriseChallengeViewHolder.class);
        }
        if (AbTestManager.a().bR() == 1) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.f4510tv, viewGroup2, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tu, viewGroup2, false);
        }
        return new EnterpriseChallengeViewHolder(view);
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        int i4 = i;
        EnterpriseChallengeViewHolder enterpriseChallengeViewHolder = (EnterpriseChallengeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{enterpriseChallengeViewHolder, Integer.valueOf(i)}, this, f61806a, false, 68007, new Class[]{EnterpriseChallengeViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enterpriseChallengeViewHolder, Integer.valueOf(i)}, this, f61806a, false, 68007, new Class[]{EnterpriseChallengeViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(CollectionUtils.isEmpty(this.f61808c) || enterpriseChallengeViewHolder == null || this.f61809d == null || this.f61808c.size() <= i4 || this.f61810e == null)) {
            Challenge challenge = this.f61808c.get(i4);
            if (challenge != null) {
                if (AbTestManager.a().bR() == 1) {
                    Activity activity = this.f61809d;
                    q qVar = this.f61810e;
                    q qVar2 = qVar;
                    Activity activity2 = activity;
                    if (PatchProxy.isSupport(new Object[]{activity, challenge, qVar}, enterpriseChallengeViewHolder, EnterpriseChallengeViewHolder.f61811a, false, 68011, new Class[]{Activity.class, Challenge.class, q.class}, Void.TYPE)) {
                        EnterpriseChallengeViewHolder enterpriseChallengeViewHolder2 = enterpriseChallengeViewHolder;
                        PatchProxy.accessDispatch(new Object[]{activity2, challenge, qVar2}, enterpriseChallengeViewHolder2, EnterpriseChallengeViewHolder.f61811a, false, 68011, new Class[]{Activity.class, Challenge.class, q.class}, Void.TYPE);
                    } else {
                        Context context = enterpriseChallengeViewHolder.f61812b.getContext();
                        TextView textView = enterpriseChallengeViewHolder.f61812b;
                        textView.setText("#" + challenge.getChallengeName());
                        if (challenge.getViewCount() >= 0) {
                            i3 = C0906R.string.rp;
                        } else {
                            i3 = C0906R.string.ab7;
                        }
                        enterpriseChallengeViewHolder.f61813c.setText(context.getString(i3, new Object[]{b.a(challenge.getDisplayCount())}));
                        c.a(enterpriseChallengeViewHolder.f61814d);
                        View view = enterpriseChallengeViewHolder.f61814d;
                        EnterpriseChallengeViewHolder.AnonymousClass2 r0 = new View.OnClickListener(qVar2, context, challenge, activity2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f61821a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ q f61822b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ Context f61823c;

                            /* renamed from: d  reason: collision with root package name */
                            final /* synthetic */ Challenge f61824d;

                            /* renamed from: e  reason: collision with root package name */
                            final /* synthetic */ Activity f61825e;

                            public final void onClick(View view) {
                                if (PatchProxy.isSupport(new Object[]{view}, this, f61821a, false, 68013, new Class[]{View.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view}, this, f61821a, false, 68013, new Class[]{View.class}, Void.TYPE);
                                    return;
                                }
                                ClickInstrumentation.onClick(view);
                                this.f61822b.b(this.f61823c, this.f61824d);
                                this.f61822b.a(this.f61825e, this.f61824d);
                            }

                            {
                                this.f61822b = r2;
                                this.f61823c = r3;
                                this.f61824d = r4;
                                this.f61825e = r5;
                            }
                        };
                        view.setOnClickListener(r0);
                    }
                } else {
                    Activity activity3 = this.f61809d;
                    q qVar3 = this.f61810e;
                    q qVar4 = qVar3;
                    Activity activity4 = activity3;
                    if (PatchProxy.isSupport(new Object[]{activity3, challenge, qVar3}, enterpriseChallengeViewHolder, EnterpriseChallengeViewHolder.f61811a, false, 68010, new Class[]{Activity.class, Challenge.class, q.class}, Void.TYPE)) {
                        EnterpriseChallengeViewHolder enterpriseChallengeViewHolder3 = enterpriseChallengeViewHolder;
                        PatchProxy.accessDispatch(new Object[]{activity4, challenge, qVar4}, enterpriseChallengeViewHolder3, EnterpriseChallengeViewHolder.f61811a, false, 68010, new Class[]{Activity.class, Challenge.class, q.class}, Void.TYPE);
                        return;
                    }
                    Context context2 = enterpriseChallengeViewHolder.f61812b.getContext();
                    SpannableString spannableString = new SpannableString("[label] " + challenge.getChallengeName());
                    com.ss.android.ugc.aweme.commercialize.ad.b bVar = new com.ss.android.ugc.aweme.commercialize.ad.b(context2, 2130839575);
                    int length = "[label] ".length() - 1;
                    Object[] objArr = {spannableString, bVar, 0, Integer.valueOf(length), 17};
                    if (PatchProxy.isSupport(objArr, null, p.f62964a, true, 68014, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {spannableString, bVar, 0, Integer.valueOf(length), 17};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, p.f62964a, true, 68014, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        spannableString.setSpan(bVar, 0, length, 17);
                    }
                    enterpriseChallengeViewHolder.f61812b.setText(spannableString);
                    if (challenge.getViewCount() >= 0) {
                        i2 = C0906R.string.rp;
                    } else {
                        i2 = C0906R.string.ab7;
                    }
                    enterpriseChallengeViewHolder.f61813c.setText(context2.getString(i2, new Object[]{b.a(challenge.getDisplayCount())}));
                    c.a(enterpriseChallengeViewHolder.f61814d);
                    View view2 = enterpriseChallengeViewHolder.f61814d;
                    EnterpriseChallengeViewHolder.AnonymousClass1 r02 = new View.OnClickListener(qVar4, context2, challenge, activity4) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61815a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ q f61816b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Context f61817c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ Challenge f61818d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ Activity f61819e;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f61815a, false, 68012, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f61815a, false, 68012, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            this.f61816b.b(this.f61817c, this.f61818d);
                            this.f61816b.a(this.f61819e, this.f61818d);
                        }

                        {
                            this.f61816b = r2;
                            this.f61817c = r3;
                            this.f61818d = r4;
                            this.f61819e = r5;
                        }
                    };
                    view2.setOnClickListener(r02);
                }
            }
        }
    }

    public EnterpriseChallengeAdapter(Activity activity, List<Challenge> list, q qVar) {
        this.f61809d = activity;
        this.f61808c = list;
        this.f61810e = qVar;
        a();
    }
}
