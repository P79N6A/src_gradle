package com.ss.android.ugc.aweme.discover.alading;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.base.d;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.widget.ShapedRemoteImageView;
import com.ss.android.ugc.aweme.u.n;
import com.ss.android.ugc.aweme.utils.cm;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/MusicCardViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "activity", "Landroid/support/v4/app/FragmentActivity;", "getActivity", "()Landroid/support/v4/app/FragmentActivity;", "setActivity", "(Landroid/support/v4/app/FragmentActivity;)V", "card", "getCard", "()Landroid/view/View;", "setCard", "count", "Landroid/widget/TextView;", "getCount", "()Landroid/widget/TextView;", "setCount", "(Landroid/widget/TextView;)V", "coverView", "Lcom/ss/android/ugc/aweme/shortvideo/widget/ShapedRemoteImageView;", "getCoverView", "()Lcom/ss/android/ugc/aweme/shortvideo/widget/ShapedRemoteImageView;", "setCoverView", "(Lcom/ss/android/ugc/aweme/shortvideo/widget/ShapedRemoteImageView;)V", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "getMusic", "()Lcom/ss/android/ugc/aweme/music/model/Music;", "setMusic", "(Lcom/ss/android/ugc/aweme/music/model/Music;)V", "musicPlayer", "Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;", "getMusicPlayer", "()Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;", "setMusicPlayer", "(Lcom/ss/android/ugc/aweme/discover/base/MusicViewHolderHelper;)V", "playStatus", "Landroid/widget/ImageView;", "getPlayStatus", "()Landroid/widget/ImageView;", "setPlayStatus", "(Landroid/widget/ImageView;)V", "title", "getTitle", "setTitle", "bind", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicCardViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42035a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public View f42036b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public ShapedRemoteImageView f42037c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public TextView f42038d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public TextView f42039e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public ImageView f42040f;
    @Nullable
    public Music g;
    @NotNull
    public FragmentActivity h;
    @NotNull
    public d i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicCardViewHolder(@NotNull final View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f42036b = view;
        ShapedRemoteImageView shapedRemoteImageView = (ShapedRemoteImageView) view.findViewById(C0906R.id.boa);
        Intrinsics.checkExpressionValueIsNotNull(shapedRemoteImageView, "itemView.music_cover");
        this.f42037c = shapedRemoteImageView;
        TextView textView = (TextView) view.findViewById(C0906R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "itemView.title");
        this.f42038d = textView;
        TextView textView2 = (TextView) view.findViewById(C0906R.id.a08);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "itemView.count");
        this.f42039e = textView2;
        ImageView imageView = (ImageView) view.findViewById(C0906R.id.b45);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "itemView.iv_play_status");
        this.f42040f = imageView;
        Context context = view.getContext();
        if (context != null) {
            this.h = (FragmentActivity) context;
            this.i = new d(this.f42040f, this.h);
            this.f42040f.setVisibility(0);
            this.f42037c.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42041a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicCardViewHolder f42042b;

                {
                    this.f42042b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f42041a, false, 35994, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f42041a, false, 35994, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    this.f42042b.f42040f.performClick();
                }
            });
            this.f42036b.setOnClickListener(new View.OnClickListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42043a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ MusicCardViewHolder f42044b;

                {
                    this.f42044b = r1;
                }

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f42043a, false, 35995, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f42043a, false, 35995, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (!NetworkUtils.isNetworkAvailable(view.getContext())) {
                        a.b(view.getContext(), (int) C0906R.string.bgf).a();
                        return;
                    }
                    if (this.f42044b.g != null) {
                        Music music = this.f42044b.g;
                        if (music == null) {
                            Intrinsics.throwNpe();
                        }
                        if (com.ss.android.ugc.aweme.music.util.d.a(music.convertToMusicModel(), view.getContext(), true)) {
                            Object[] objArr = new Object[3];
                            objArr[0] = Integer.valueOf(this.f42044b.getAdapterPosition() + 1);
                            Music music2 = this.f42044b.g;
                            if (music2 == null) {
                                Intrinsics.throwNpe();
                            }
                            objArr[1] = music2.getMid();
                            Music music3 = this.f42044b.g;
                            if (music3 == null) {
                                Intrinsics.throwNpe();
                            }
                            objArr[2] = music3.getMusicName();
                            Intrinsics.checkExpressionValueIsNotNull(String.format("click_search_music(%d-%s): %s", Arrays.copyOf(objArr, 3)), "java.lang.String.format(format, *args)");
                            Music music4 = this.f42044b.g;
                            if (music4 == null) {
                                Intrinsics.throwNpe();
                            }
                            r.a("click_search_music", cm.a("music_id", music4.getMid(), "client_order", Integer.toString(this.f42044b.getAdapterPosition() + 1)));
                        }
                    }
                    h a2 = h.a();
                    StringBuilder sb = new StringBuilder("aweme://music/detail/");
                    Music music5 = this.f42044b.g;
                    if (music5 == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(music5.getMid());
                    a2.a(j.a(sb.toString()).a());
                    n nVar = new n();
                    Music music6 = this.f42044b.g;
                    if (music6 == null) {
                        Intrinsics.throwNpe();
                    }
                    k.a((com.ss.android.ugc.aweme.u.d) nVar.f(music6.getMid()), com.ss.android.ugc.aweme.discover.mob.h.f42664a.a(view));
                    Music music7 = this.f42044b.g;
                    if (music7 == null) {
                        Intrinsics.throwNpe();
                    }
                    String ownerId = music7.getOwnerId();
                    Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                    com.ss.android.ugc.aweme.discover.mob.a.a(PushConstants.CONTENT, ownerId, view);
                }
            });
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
