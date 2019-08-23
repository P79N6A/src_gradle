package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.commercialize.model.p;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;

public class SearchChallengeViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41778c;

    /* renamed from: d  reason: collision with root package name */
    Challenge f41779d;

    /* renamed from: e  reason: collision with root package name */
    String f41780e;

    /* renamed from: f  reason: collision with root package name */
    public String f41781f;
    a g;
    private String h;
    @BindView(2131497825)
    TextView mTvChallengeName;
    @BindView(2131498042)
    TextView mTvPartCnt;

    public interface a {
        void a(Challenge challenge, int i);
    }

    static class b implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41785a;

        /* renamed from: b  reason: collision with root package name */
        private final View f41786b;

        /* renamed from: c  reason: collision with root package name */
        private final String f41787c;

        /* renamed from: d  reason: collision with root package name */
        private p f41788d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f41789e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f41790f;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f41785a, false, 35781, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41785a, false, 35781, new Class[0], Void.TYPE);
            } else if (this.f41789e) {
                if (this.f41788d != null) {
                    if (!ao.b(this.f41786b)) {
                        this.f41790f = false;
                    } else if (!this.f41790f) {
                        this.f41790f = true;
                    }
                }
                this.f41786b.postDelayed(this, 500);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41785a, false, 35779, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41785a, false, 35779, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f41789e = true;
            this.f41790f = false;
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41785a, false, 35780, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41785a, false, 35780, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f41789e = false;
            this.f41790f = false;
            this.f41786b.removeCallbacks(this);
        }

        private void a(p pVar) {
            if (PatchProxy.isSupport(new Object[]{pVar}, this, f41785a, false, 35778, new Class[]{p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar}, this, f41785a, false, 35778, new Class[]{p.class}, Void.TYPE);
            } else if (this.f41788d != pVar) {
                if (pVar == null) {
                    this.f41788d = null;
                    return;
                }
                this.f41788d = pVar;
                this.f41790f = false;
                run();
            }
        }

        private b(View view, String str) {
            this.f41786b = view;
            this.f41787c = str;
        }

        public static void a(View view, p pVar) {
            View view2 = view;
            p pVar2 = pVar;
            if (PatchProxy.isSupport(new Object[]{view2, pVar2}, null, f41785a, true, 35777, new Class[]{View.class, p.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, pVar2}, null, f41785a, true, 35777, new Class[]{View.class, p.class}, Void.TYPE);
                return;
            }
            Object tag = view2.getTag(C0906R.id.cl4);
            if (tag instanceof b) {
                ((b) tag).a(pVar2);
            }
        }

        public static void a(View view, String str) {
            View view2 = view;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{view2, str2}, null, f41785a, true, 35776, new Class[]{View.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, str2}, null, f41785a, true, 35776, new Class[]{View.class, String.class}, Void.TYPE);
                return;
            }
            b bVar = new b(view2, str2);
            view2.addOnAttachStateChangeListener(bVar);
            view2.setTag(C0906R.id.cl4, bVar);
        }
    }

    public final View a() {
        return this.itemView;
    }

    public final void a(SuggestChallenge suggestChallenge, String str) {
        if (PatchProxy.isSupport(new Object[]{suggestChallenge, str}, this, f41778c, false, 35773, new Class[]{SuggestChallenge.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{suggestChallenge, str}, this, f41778c, false, 35773, new Class[]{SuggestChallenge.class, String.class}, Void.TYPE);
        } else if (suggestChallenge != null && suggestChallenge.challenge != null) {
            this.f41780e = str;
            this.f41779d = suggestChallenge.challenge;
            this.mTvPartCnt.setText(this.itemView.getContext().getString(C0906R.string.rp, new Object[]{com.ss.android.ugc.aweme.i18n.b.a(this.f41779d.getDisplayCount())}));
            this.mTvChallengeName.setText(this.f41779d.getChallengeName());
        }
    }

    public final void a(SearchChallenge searchChallenge, String str) {
        if (PatchProxy.isSupport(new Object[]{searchChallenge, str}, this, f41778c, false, 35774, new Class[]{SearchChallenge.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchChallenge, str}, this, f41778c, false, 35774, new Class[]{SearchChallenge.class, String.class}, Void.TYPE);
        } else if (searchChallenge != null) {
            this.f41780e = str;
            if (searchChallenge.getChallenge() != null) {
                this.f41779d = searchChallenge.getChallenge();
            }
            this.mTvPartCnt.setText(this.itemView.getContext().getString(C0906R.string.rp, new Object[]{com.ss.android.ugc.aweme.i18n.b.a(this.f41779d.getDisplayCount())}));
            this.mTvChallengeName.setText(com.ss.android.ugc.aweme.base.utils.a.a(this.mTvChallengeName.getContext(), this.f41779d.getChallengeName(), searchChallenge.getPosition()));
            b.a(this.itemView, searchChallenge.getAdData());
        }
    }

    private SearchChallengeViewHolder(View view, final String str, a aVar, String str2) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41780e = str;
        this.g = aVar;
        this.h = str2;
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41782a;

            public final void onClick(View view) {
                String str;
                int i;
                if (PatchProxy.isSupport(new Object[]{view}, this, f41782a, false, 35775, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41782a, false, 35775, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    r.a(SearchChallengeViewHolder.this.f41779d);
                    int adapterPosition = SearchChallengeViewHolder.this.getAdapterPosition();
                    if (SearchChallengeViewHolder.this.g == null) {
                        String str2 = str;
                        if (SearchChallengeViewHolder.this.f41524b.f41974f) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        k.c(adapterPosition, str2, i, SearchChallengeViewHolder.this.f41779d.getRequestId(), SearchChallengeViewHolder.this.f41779d.getCid(), k.a(str));
                    } else {
                        SearchChallengeViewHolder.this.g.a(SearchChallengeViewHolder.this.f41779d, adapterPosition);
                    }
                    h a2 = h.a();
                    j a3 = j.a("aweme://challenge/detail/" + SearchChallengeViewHolder.this.f41779d.getCid()).a("enter_from", SearchChallengeViewHolder.this.f41781f);
                    if (r.b(SearchChallengeViewHolder.this.f41779d)) {
                        str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                    } else {
                        str = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    a2.a(a3.a("is_commerce", str).a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", SearchChallengeViewHolder.this.f41779d.getSubType()).a());
                }
            }
        });
    }

    @NonNull
    public static SearchChallengeViewHolder a(ViewGroup viewGroup, String str, a aVar, String str2) {
        ViewGroup viewGroup2 = viewGroup;
        String str3 = str;
        a aVar2 = aVar;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, str3, aVar2, str4}, null, f41778c, true, 35772, new Class[]{ViewGroup.class, String.class, a.class, String.class}, SearchChallengeViewHolder.class)) {
            Object[] objArr = {viewGroup2, str3, aVar2, str4};
            return (SearchChallengeViewHolder) PatchProxy.accessDispatch(objArr, null, f41778c, true, 35772, new Class[]{ViewGroup.class, String.class, a.class, String.class}, SearchChallengeViewHolder.class);
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.zy, viewGroup2, false);
        b.a(inflate, str4);
        return new SearchChallengeViewHolder(inflate, str3, aVar2, str4);
    }
}
