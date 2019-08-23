package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
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
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.utils.RecyclerViewVisibilityObserver;
import com.ss.android.ugc.aweme.discover.base.d;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.cm;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002>?B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010+\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020\u0004H\u0016J>\u00103\u001a\u00020,2\u0006\u00104\u001a\u0002012\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u0010:\u001a\u0002012\u0006\u0010;\u001a\u000201H\u0016J\u000e\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/AbsSearchViewHolder;", "Lcom/ss/android/ugc/aweme/common/utils/RecyclerViewVisibilityObserver$Listener;", "itemView", "Landroid/view/View;", "keyword", "", "listener", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;", "provider", "Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "(Landroid/view/View;Ljava/lang/String;Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;)V", "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", "getListener", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;", "mEnterFrom", "mIvAvatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mIvPlayStatus", "Landroid/widget/ImageView;", "mMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "mOriginalTag", "mPlayHelper", "Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "mRotateAnimation", "Landroid/view/animation/Animation;", "mTvAuthor", "Landroid/widget/TextView;", "mTvMusicDuration", "mTvMusicTitle", "mTvUsedCnt", "musicPlayer", "Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;", "getMusicPlayer", "()Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;", "setMusicPlayer", "(Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;)V", "getProvider", "()Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "bind", "", "suggestMusic", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestMusic;", "music", "getItemPosition", "", "getView", "onVisibilityChanged", "pos", "id", "", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "from", "to", "setEnterFrom", "enterFrom", "Companion", "MusicItemListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicViewHolder extends AbsSearchViewHolder implements RecyclerViewVisibilityObserver.d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41842c;
    public static final a j = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public Music f41843d;

    /* renamed from: e  reason: collision with root package name */
    public String f41844e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public d f41845f;
    @NotNull
    public String g;
    @Nullable
    public final b h;
    @Nullable
    public final p i;
    private final ImageView k;
    private final RemoteImageView l;
    private final ImageView m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$Companion;", "", "()V", "TAG", "", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder;", "parent", "Landroid/view/ViewGroup;", "mKeyword", "listener", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;", "provider", "Lcom/ss/android/ugc/aweme/discover/adapter/IPositionProvider;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41849a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SearchMusicViewHolder a(@NotNull ViewGroup viewGroup, @NotNull String str, @Nullable b bVar, @Nullable p pVar) {
            ViewGroup viewGroup2 = viewGroup;
            String str2 = str;
            b bVar2 = bVar;
            p pVar2 = pVar;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, str2, bVar2, pVar2}, this, f41849a, false, 35854, new Class[]{ViewGroup.class, String.class, b.class, p.class}, SearchMusicViewHolder.class)) {
                Object[] objArr = {viewGroup2, str2, bVar2, pVar2};
                return (SearchMusicViewHolder) PatchProxy.accessDispatch(objArr, this, f41849a, false, 35854, new Class[]{ViewGroup.class, String.class, b.class, p.class}, SearchMusicViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            Intrinsics.checkParameterIsNotNull(str2, "mKeyword");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a0_, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new SearchMusicViewHolder(inflate, str2, bVar2, pVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;", "", "sendEnterMusicDetail", "", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "order", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull Music music, int i);
    }

    @NotNull
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f41842c, false, 35845, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f41842c, false, 35845, new Class[0], View.class);
        }
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        return view;
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f41842c, false, 35850, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41842c, false, 35850, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.i != null) {
            p pVar = this.i;
            Music music = this.f41843d;
            if (music == null) {
                Intrinsics.throwNpe();
            }
            int a2 = pVar.a(music);
            if (a2 >= 0) {
                return a2;
            }
        }
        return getAdapterPosition();
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f41842c, false, 35846, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f41842c, false, 35846, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        this.f41844e = str2;
    }

    public final void a(@Nullable Music music, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{music, str}, this, f41842c, false, 35848, new Class[]{Music.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music, str}, this, f41842c, false, 35848, new Class[]{Music.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        if (music != null) {
            this.g = str;
            this.f41843d = music;
            if (music.getCoverThumb() != null) {
                c.b(this.l, music.getCoverThumb());
            }
            this.q.setText(ey.a(music.getDuration() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            this.p.setText(com.ss.android.ugc.aweme.i18n.b.a((long) music.getUserCount()));
            if (!TextUtils.isEmpty(music.getMusicName())) {
                if (music.isOriginMusic()) {
                    this.m.setVisibility(0);
                } else {
                    this.m.setVisibility(8);
                }
                Context context = this.n.getContext();
                Music music2 = this.f41843d;
                if (music2 == null) {
                    Intrinsics.throwNpe();
                }
                String musicName = music2.getMusicName();
                Music music3 = this.f41843d;
                if (music3 == null) {
                    Intrinsics.throwNpe();
                }
                this.n.setText(com.ss.android.ugc.aweme.base.utils.a.a(context, musicName, music3.getPositions()));
                com.ss.android.ugc.aweme.music.ui.a.b.f56658c.a(this.n, music, com.ss.android.g.a.b());
            }
            if (!TextUtils.isEmpty(music.getAuthorName())) {
                this.o.setText(music.getAuthorName());
            } else {
                this.o.setVisibility(8);
            }
            d dVar = this.f41845f;
            if (dVar != null) {
                dVar.a(music);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchMusicViewHolder(@NotNull final View view, @NotNull String str, @Nullable b bVar, @Nullable p pVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        this.g = str;
        this.h = bVar;
        this.i = pVar;
        View findViewById = view.findViewById(C0906R.id.b45);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.iv_play_status)");
        this.k = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.ayr);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.l = (RemoteImageView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.b3q);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_original_tag)");
        this.m = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.df4);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.tv_music_title)");
        this.n = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.dez);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tv_music_author)");
        this.o = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.dld);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tv_used_count)");
        this.p = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.df1);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.tv_music_duration)");
        this.q = (TextView) findViewById7;
        if (!com.ss.android.g.a.a()) {
            ImageView imageView = this.k;
            FragmentActivity b2 = b();
            Intrinsics.checkExpressionValueIsNotNull(b2, PushConstants.INTENT_ACTIVITY_NAME);
            this.f41845f = new d(imageView, b2);
        }
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41846a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchMusicViewHolder f41847b;

            {
                this.f41847b = r1;
            }

            public final void onClick(View view) {
                int i;
                if (PatchProxy.isSupport(new Object[]{view}, this, f41846a, false, 35853, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41846a, false, 35853, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    int c2 = this.f41847b.c();
                    if (this.f41847b.f41843d != null) {
                        com.ss.android.ugc.aweme.music.util.c cVar = com.ss.android.ugc.aweme.music.util.c.f56796b;
                        Music music = this.f41847b.f41843d;
                        if (music == null) {
                            Intrinsics.throwNpe();
                        }
                        if (com.ss.android.ugc.aweme.music.util.d.a(cVar.a(music), view.getContext(), true)) {
                            if (TextUtils.isEmpty(this.f41847b.g) && com.ss.android.g.a.a()) {
                                Object[] objArr = new Object[3];
                                int i2 = c2 + 1;
                                objArr[0] = Integer.valueOf(i2);
                                Music music2 = this.f41847b.f41843d;
                                if (music2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                objArr[1] = music2.getMid();
                                Music music3 = this.f41847b.f41843d;
                                if (music3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                objArr[2] = music3.getMusicName();
                                Intrinsics.checkExpressionValueIsNotNull(String.format("click_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
                                Music music4 = this.f41847b.f41843d;
                                if (music4 == null) {
                                    Intrinsics.throwNpe();
                                }
                                r.a("click_search_music", cm.a("music_id", music4.getMid(), "client_order", Integer.toString(i2)));
                            }
                        } else {
                            return;
                        }
                    }
                    h a2 = h.a();
                    StringBuilder sb = new StringBuilder("aweme://music/detail/");
                    Music music5 = this.f41847b.f41843d;
                    if (music5 == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(music5.getMid());
                    a2.a(j.a(sb.toString()).a("extra_music_from", this.f41847b.f41844e).a());
                    if (this.f41847b.h == null) {
                        if (this.f41847b.f41524b.f41974f) {
                            i = 3;
                        } else {
                            i = 1;
                        }
                        String str = this.f41847b.f41524b.f41973e;
                        if (str == null) {
                            str = k.a(this.f41847b.g);
                            Intrinsics.checkExpressionValueIsNotNull(str, "SearchStatistics.getEnterMethod(keyword)");
                        }
                        String str2 = str;
                        String str3 = this.f41847b.g;
                        Music music6 = this.f41847b.f41843d;
                        if (music6 == null) {
                            Intrinsics.throwNpe();
                        }
                        String requestId = music6.getRequestId();
                        Music music7 = this.f41847b.f41843d;
                        if (music7 == null) {
                            Intrinsics.throwNpe();
                        }
                        k.a(c2, str3, i, requestId, music7, str2);
                        return;
                    }
                    b bVar = this.f41847b.h;
                    Music music8 = this.f41847b.f41843d;
                    if (music8 == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar.a(music8, c2);
                }
            }
        });
    }

    public final void a(int i2, @Nullable Object obj, @Nullable RecyclerView.ViewHolder viewHolder, @Nullable View view, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), obj, viewHolder, view, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f41842c, false, 35849, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), obj, viewHolder, view, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f41842c, false, 35849, new Class[]{Integer.TYPE, Object.class, RecyclerView.ViewHolder.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 == 0 && i4 != 0 && this.f41843d != null && TextUtils.isEmpty(this.g) && com.ss.android.g.a.a()) {
            Object[] objArr = new Object[3];
            int c2 = c() + 1;
            objArr[0] = Integer.valueOf(c2);
            Music music = this.f41843d;
            if (music == null) {
                Intrinsics.throwNpe();
            }
            objArr[1] = music.getMid();
            Music music2 = this.f41843d;
            if (music2 == null) {
                Intrinsics.throwNpe();
            }
            objArr[2] = music2.getMusicName();
            Intrinsics.checkExpressionValueIsNotNull(String.format("show_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
            Music music3 = this.f41843d;
            if (music3 == null) {
                Intrinsics.throwNpe();
            }
            r.a("show_search_music", cm.a("music_id", music3.getMid(), "client_order", Integer.toString(c2)));
        }
    }
}
