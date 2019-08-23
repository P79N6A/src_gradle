package com.ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.ss.android.ugc.aweme.discover.mob.h;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.Movie;
import com.ss.android.ugc.aweme.u.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u0003H\u0016J\u000e\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u001a\u0010&\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\n\"\u0004\b+\u0010\f¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixMovieViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "itemView", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "actors", "Landroid/widget/TextView;", "getActors", "()Landroid/widget/TextView;", "setActors", "(Landroid/widget/TextView;)V", "buy", "Landroid/widget/Button;", "getBuy", "()Landroid/widget/Button;", "setBuy", "(Landroid/widget/Button;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "cover", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getCover", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "setCover", "(Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;)V", "date", "getDate", "setDate", "name", "getName", "setName", "score", "getScore", "setScore", "tag", "getTag", "setTag", "type", "getType", "setType", "bind", "", "data", "Lcom/ss/android/ugc/aweme/discover/model/Movie;", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "showViewMore", "", "getView", "goToChallenge", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMixMovieViewHolder extends AbsSearchViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f42602c;
    public static final a m = new a((byte) 0);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f42603d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public TextView f42604e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public TextView f42605f;
    @NotNull
    public TextView g;
    @NotNull
    public TextView h;
    @NotNull
    public RemoteImageView i;
    @NotNull
    public Button j;
    @NotNull
    public TextView k;
    @NotNull
    public Context l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixMovieViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/discover/mixfeed/viewholder/SearchMixMovieViewHolder;", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42606a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42607a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMixMovieViewHolder f42608b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Movie f42609c;

        public b(SearchMixMovieViewHolder searchMixMovieViewHolder, Movie movie) {
            this.f42608b = searchMixMovieViewHolder;
            this.f42609c = movie;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42607a, false, 36923, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42607a, false, 36923, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.discover.mob.a aVar = com.ss.android.ugc.aweme.discover.mob.a.f42647b;
            String challengeId = this.f42609c.getChallengeId();
            if (challengeId == null) {
                challengeId = "";
            }
            View view2 = this.f42608b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            aVar.a("tag", "ticket", challengeId, view2);
            g.a(this.f42608b.l, this.f42609c.getLight_app_tickets_url(), false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMixMovieViewHolder f42611b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Movie f42612c;

        public c(SearchMixMovieViewHolder searchMixMovieViewHolder, Movie movie) {
            this.f42611b = searchMixMovieViewHolder;
            this.f42612c = movie;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42610a, false, 36924, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42610a, false, 36924, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.discover.mob.a aVar = com.ss.android.ugc.aweme.discover.mob.a.f42647b;
            String challengeId = this.f42612c.getChallengeId();
            if (challengeId == null) {
                challengeId = "";
            }
            View view2 = this.f42611b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            aVar.a("tag", "card", challengeId, view2);
            this.f42611b.a(this.f42612c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42613a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchMixMovieViewHolder f42614b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Movie f42615c;

        public d(SearchMixMovieViewHolder searchMixMovieViewHolder, Movie movie) {
            this.f42614b = searchMixMovieViewHolder;
            this.f42615c = movie;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42613a, false, 36925, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42613a, false, 36925, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.discover.mob.a aVar = com.ss.android.ugc.aweme.discover.mob.a.f42647b;
            String challengeId = this.f42615c.getChallengeId();
            if (challengeId == null) {
                challengeId = "";
            }
            View view2 = this.f42614b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            aVar.a("tag", "challenge", challengeId, view2);
            this.f42614b.a(this.f42615c);
        }
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f42602c, false, 36917, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f42602c, false, 36917, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    public final void a(@NotNull Movie movie) {
        Movie movie2 = movie;
        if (PatchProxy.isSupport(new Object[]{movie2}, this, f42602c, false, 36919, new Class[]{Movie.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{movie2}, this, f42602c, false, 36919, new Class[]{Movie.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(movie2, "data");
        r e2 = new r().e(movie.getChallengeId());
        h.a aVar = h.f42664a;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        k.a((com.ss.android.ugc.aweme.u.d) e2, aVar.a(view));
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(j.a("aweme://challenge/detail/" + movie.getChallengeId()).a("enter_from", "general_search").a("is_commerce", PushConstants.PUSH_TYPE_NOTIFY).a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMixMovieViewHolder(@NotNull View view, @NotNull Context context) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.l = context;
        TextView textView = (TextView) view.findViewById(C0906R.id.bnq);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.movieName");
        this.f42603d = textView;
        TextView textView2 = (TextView) view.findViewById(C0906R.id.b0);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.actors");
        this.f42604e = textView2;
        TextView textView3 = (TextView) view.findViewById(C0906R.id.bns);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "itemView.movieType");
        this.f42605f = textView3;
        TextView textView4 = (TextView) view.findViewById(C0906R.id.cd3);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "itemView.releaseDate");
        this.g = textView4;
        TextView textView5 = (TextView) view.findViewById(C0906R.id.cjx);
        Intrinsics.checkExpressionValueIsNotNull(textView5, "itemView.score");
        this.h = textView5;
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(C0906R.id.bnr);
        Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "itemView.moviePicture");
        this.i = remoteImageView;
        Button button = (Button) view.findViewById(C0906R.id.f4428pl);
        Intrinsics.checkExpressionValueIsNotNull(button, "itemView.button5");
        this.j = button;
        TextView textView6 = (TextView) view.findViewById(C0906R.id.cuy);
        Intrinsics.checkExpressionValueIsNotNull(textView6, "itemView.status");
        this.k = textView6;
    }
}
