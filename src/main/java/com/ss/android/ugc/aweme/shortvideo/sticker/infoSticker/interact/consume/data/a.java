package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import a.i;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.y;
import com.ss.android.ugc.playerkit.videoview.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001`B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0001\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0002\u0010\u001aJ\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020LJ\u0006\u0010N\u001a\u00020LJ\u0006\u0010O\u001a\u00020LJ\u001c\u0010P\u001a\u0016\u0012\u0004\u0012\u00020R\u0018\u00010Qj\n\u0012\u0004\u0012\u00020R\u0018\u0001`SH\u0002J\u000e\u0010T\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u001cJ\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`SJ \u0010W\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`S2\b\u0010X\u001a\u0004\u0018\u00010YJ\u0016\u0010Z\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`SJ\"\u0010[\u001a\u00020L2\u001a\u0010\\\u001a\u0016\u0012\u0004\u0012\u00020R\u0018\u00010Qj\n\u0012\u0004\u0012\u00020R\u0018\u0001`SJ\u000e\u0010]\u001a\u00020L2\u0006\u0010^\u001a\u00020_R\u000e\u0010\u001b\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0019\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00106\"\u0004\b>\u00108R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006a"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData;", "", "builder", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData$Builder;", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData$Builder;)V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "eventListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;", "adaptionStrategy", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "eventParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "playerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "videoPlayerView", "Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;", "voteListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "needConsumeEvent", "", "viewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;", "showVote", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;Lcom/ss/android/ugc/aweme/video/PlayerManager;Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;ZLcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;Z)V", "BUSINESS_KEY_ANDROID", "", "BUSINESS_KEY_BYTEDANCE", "BUSINESS_KEY_INFORMATION", "BUSINESS_KEY_IOS", "BUSINESS_KEY_STICKER", "getAdaptionStrategy", "()Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "setAdaptionStrategy", "(Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getDataCenter", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "setDataCenter", "(Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;)V", "getEventListener", "()Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;", "setEventListener", "(Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;)V", "getEventParams", "()Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "setEventParams", "(Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;)V", "getNeedConsumeEvent", "()Z", "setNeedConsumeEvent", "(Z)V", "getPlayerManager", "()Lcom/ss/android/ugc/aweme/video/PlayerManager;", "setPlayerManager", "(Lcom/ss/android/ugc/aweme/video/PlayerManager;)V", "getShowVote", "setShowVote", "getVideoPlayerView", "()Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;", "setVideoPlayerView", "(Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;)V", "getViewModel", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;", "setViewModel", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;)V", "getVoteListener", "()Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "setVoteListener", "(Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;)V", "bindAwemeStickersData", "", "bindParamsData", "bindVideoStickersData", "clearData", "getPlayerData", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "Lkotlin/collections/ArrayList;", "isNeedAddSticker", "attr", "mockBusinessFakeData", "mockFakeData", "poiStruct", "Lcom/ss/android/ugc/aweme/poi/model/PoiStruct;", "mockVoteData", "removeNotSupportStickers", "listData", "sendAwemeStickersShowEvent", "context", "Landroid/content/Context;", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69873a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Aweme f69874b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f69875c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.a.a f69876d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.a.b f69877e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.c f69878f;
    @Nullable
    public o g;
    @Nullable
    public g h;
    @Nullable
    public com.ss.android.ugc.aweme.sticker.a.c i;
    public boolean j;
    @Nullable
    public InteractStickerViewModel k;
    public boolean l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001c\u001a\u0004\u0018\u00010\bJ\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\b\u0010\u001e\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u001f\u001a\u00020\u000eJ\b\u0010 \u001a\u0004\u0018\u00010\u0010J\u0006\u0010!\u001a\u00020\u000eJ\b\u0010\"\u001a\u0004\u0018\u00010\u0013J\b\u0010#\u001a\u0004\u0018\u00010\u0015J\b\u0010$\u001a\u0004\u0018\u00010\u0017J\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010'\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u000eJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u000e\u0010/\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u00100\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0017R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData$Builder;", "", "()V", "adaptionStrategy", "Lcom/ss/android/ugc/aweme/sticker/listener/IVideoAdaptionStrategy;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "dataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "eventListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IInteractSticketEventListener;", "eventParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerEventParams;", "needConsumeEvent", "", "playerManager", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "showVote", "videoPlayerView", "Lcom/ss/android/ugc/playerkit/videoview/VideoPlayerView;", "viewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/widget/InteractStickerViewModel;", "voteEventListener", "Lcom/ss/android/ugc/aweme/sticker/listener/IVoteEventListener;", "build", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData;", "getAdaptionStrategy", "getAweme", "getDataCenter", "getEventListener", "getEventParams", "getNeedConsumeEvent", "getPlayerManager", "getShowVote", "getVideoPlayerView", "getViewModel", "getVoteEventListener", "setAdaptionStrategy", "setAweme", "setDataCenter", "setEventListener", "setEventParams", "setNeedConsumeEvent", "setPlayerManager", "setShowVote", "show", "setVideoPlayerView", "setViewModel", "setVoteEventListener", "listener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$a  reason: collision with other inner class name */
    public static final class C0734a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69879a;

        /* renamed from: b  reason: collision with root package name */
        public Aweme f69880b;

        /* renamed from: c  reason: collision with root package name */
        public DataCenter f69881c;

        /* renamed from: d  reason: collision with root package name */
        public com.ss.android.ugc.aweme.sticker.a.a f69882d;

        /* renamed from: e  reason: collision with root package name */
        public com.ss.android.ugc.aweme.sticker.a.b f69883e;

        /* renamed from: f  reason: collision with root package name */
        public com.ss.android.ugc.aweme.sticker.c f69884f;
        public o g;
        public g h;
        public com.ss.android.ugc.aweme.sticker.a.c i;
        public boolean j = true;
        public InteractStickerViewModel k;
        public boolean l;

        @NotNull
        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f69879a, false, 79514, new Class[0], a.class)) {
                return new a(this, (byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f69879a, false, 79514, new Class[0], a.class);
        }

        @NotNull
        public final C0734a a(@Nullable DataCenter dataCenter) {
            this.f69881c = dataCenter;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable Aweme aweme) {
            this.f69880b = aweme;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable com.ss.android.ugc.aweme.sticker.a.a aVar) {
            this.f69882d = aVar;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable com.ss.android.ugc.aweme.sticker.a.b bVar) {
            this.f69883e = bVar;
            return this;
        }

        @NotNull
        public final C0734a a(@NotNull InteractStickerViewModel interactStickerViewModel) {
            if (PatchProxy.isSupport(new Object[]{interactStickerViewModel}, this, f69879a, false, 79513, new Class[]{InteractStickerViewModel.class}, C0734a.class)) {
                return (C0734a) PatchProxy.accessDispatch(new Object[]{interactStickerViewModel}, this, f69879a, false, 79513, new Class[]{InteractStickerViewModel.class}, C0734a.class);
            }
            Intrinsics.checkParameterIsNotNull(interactStickerViewModel, "viewModel");
            this.k = interactStickerViewModel;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable com.ss.android.ugc.aweme.sticker.a.c cVar) {
            this.i = cVar;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable com.ss.android.ugc.aweme.sticker.c cVar) {
            this.f69884f = cVar;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable o oVar) {
            this.g = oVar;
            return this;
        }

        @NotNull
        public final C0734a a(@Nullable g gVar) {
            this.h = gVar;
            return this;
        }

        @NotNull
        public final C0734a a(boolean z) {
            this.j = false;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "Lkotlin/collections/ArrayList;", "call"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69886b;

        b(a aVar) {
            this.f69886b = aVar;
        }

        public final /* synthetic */ Object call() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f69885a, false, 79515, new Class[0], ArrayList.class)) {
                return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f69885a, false, 79515, new Class[0], ArrayList.class);
            }
            ArrayList<InteractStickerStruct> e2 = this.f69886b.e();
            a aVar = this.f69886b;
            if (PatchProxy.isSupport(new Object[]{e2}, aVar, a.f69873a, false, 79508, new Class[]{ArrayList.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{e2}, aVar2, a.f69873a, false, 79508, new Class[]{ArrayList.class}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(e2)) {
                List arrayList = new ArrayList();
                if (e2 != null) {
                    for (InteractStickerStruct interactStickerStruct : e2) {
                        if (interactStickerStruct != null) {
                            str = interactStickerStruct.getAttr();
                        } else {
                            str = null;
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str, "it?.attr");
                        if (!aVar.a(str)) {
                            arrayList.add(interactStickerStruct);
                        }
                    }
                }
                if (e2 != null) {
                    e2.removeAll(arrayList);
                }
            }
            return e2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012B\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006 \u0007*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements a.g<ArrayList<InteractStickerStruct>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69888b;

        c(a aVar) {
            this.f69888b = aVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f69887a, false, 79516, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f69887a, false, 79516, new Class[]{i.class}, Void.class);
            }
            if (this.f69888b.f69875c != null) {
                DataCenter dataCenter = this.f69888b.f69875c;
                if (dataCenter != null) {
                    Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                    dataCenter.a("interact_sticker_video_data", iVar.e());
                }
            } else if (this.f69888b.k != null) {
                InteractStickerViewModel interactStickerViewModel = this.f69888b.k;
                if (interactStickerViewModel != null) {
                    Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                    interactStickerViewModel.a("interact_sticker_video_data", iVar.e());
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/FeedStickerData$getPlayerData$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "Lkotlin/collections/ArrayList;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends TypeToken<ArrayList<InteractStickerStruct>> {
        d() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
    public static final class e<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69889a;

        public final int compare(T t, T t2) {
            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f69889a, false, 79517, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                return ComparisonsKt.compareValues(Integer.valueOf(((InteractStickerStruct) t).getIndex()), Integer.valueOf(((InteractStickerStruct) t2).getIndex()));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f69889a, false, 79517, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
    }

    public final void b() {
        List<InteractStickerStruct> list;
        ArrayList arrayList;
        if (PatchProxy.isSupport(new Object[0], this, f69873a, false, 79503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69873a, false, 79503, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f69874b;
        if (aweme != null) {
            list = aweme.getInteractStickerStructs();
        } else {
            list = null;
        }
        if (list == null) {
            arrayList = new ArrayList();
        } else {
            Aweme aweme2 = this.f69874b;
            if (aweme2 == null) {
                Intrinsics.throwNpe();
            }
            new ArrayList(aweme2.getInteractStickerStructs());
        }
        Aweme aweme3 = this.f69874b;
        if (aweme3 != null && aweme3.isProhibited()) {
            arrayList = new ArrayList();
        }
        if (this.f69875c != null) {
            DataCenter dataCenter = this.f69875c;
            if (dataCenter != null) {
                dataCenter.a("interact_sticker_aweme_data", (Object) arrayList);
            }
        } else if (this.k != null) {
            InteractStickerViewModel interactStickerViewModel = this.k;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.a("interact_sticker_aweme_data", (Object) arrayList);
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69873a, false, 79505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69873a, false, 79505, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f69874b;
        if (aweme == null || !aweme.isProhibited()) {
            i.a((Callable<TResult>) new b<TResult>(this)).a((a.g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
            return;
        }
        if (this.f69875c != null) {
            DataCenter dataCenter = this.f69875c;
            if (dataCenter != null) {
                dataCenter.a("interact_sticker_video_data", (Object) new ArrayList());
            }
        } else if (this.k != null) {
            InteractStickerViewModel interactStickerViewModel = this.k;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.a("interact_sticker_video_data", (Object) new ArrayList());
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69873a, false, 79506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69873a, false, 79506, new Class[0], Void.TYPE);
            return;
        }
        if (this.f69875c != null) {
            DataCenter dataCenter = this.f69875c;
            if (dataCenter != null) {
                dataCenter.a("interact_sticker_clear_data", (Object) null);
            }
            DataCenter dataCenter2 = this.f69875c;
            if (dataCenter2 != null) {
                dataCenter2.a("interact_sticker_aweme_data", (Object) null);
            }
            DataCenter dataCenter3 = this.f69875c;
            if (dataCenter3 != null) {
                dataCenter3.a("interact_sticker_video_data", (Object) null);
            }
        } else {
            InteractStickerViewModel interactStickerViewModel = this.k;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.a("interact_sticker_clear_data", (Object) null);
            }
            InteractStickerViewModel interactStickerViewModel2 = this.k;
            if (interactStickerViewModel2 != null) {
                interactStickerViewModel2.a("interact_sticker_aweme_data", (Object) null);
            }
            InteractStickerViewModel interactStickerViewModel3 = this.k;
            if (interactStickerViewModel3 != null) {
                interactStickerViewModel3.a("interact_sticker_video_data", (Object) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f69873a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79502(0x1368e, float:1.11406E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f69873a
            r5 = 0
            r6 = 79502(0x1368e, float:1.11406E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.sticker.d r0 = new com.ss.android.ugc.aweme.sticker.d
            r0.<init>()
            com.ss.android.ugc.aweme.sticker.a.a r1 = r9.f69876d
            com.ss.android.ugc.aweme.sticker.d r1 = r0.a((com.ss.android.ugc.aweme.sticker.a.a) r1)
            com.ss.android.ugc.aweme.sticker.a.b r2 = r9.f69877e
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((com.ss.android.ugc.aweme.sticker.a.b) r2)
            com.ss.android.ugc.aweme.sticker.a.c r2 = r9.i
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((com.ss.android.ugc.aweme.sticker.a.c) r2)
            com.ss.android.ugc.aweme.sticker.c r2 = r9.f69878f
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((com.ss.android.ugc.aweme.sticker.c) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            com.ss.android.ugc.aweme.profile.model.User r2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((com.ss.android.ugc.aweme.profile.model.User) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            java.lang.String r2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((java.lang.String) r2)
            boolean r2 = r9.j
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((boolean) r2)
            boolean r2 = r9.l
            com.ss.android.ugc.aweme.sticker.d r1 = r1.b((boolean) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            r3 = 0
            if (r2 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = r2.getLogExtra()
            goto L_0x0073
        L_0x0072:
            r2 = r3
        L_0x0073:
            com.ss.android.ugc.aweme.sticker.d r1 = r1.b((java.lang.String) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            if (r2 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x0085
            java.lang.String r3 = r2.getPageFrom()
        L_0x0085:
            com.ss.android.ugc.aweme.sticker.d r1 = r1.c(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            if (r2 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x009e
            java.lang.Long r2 = r2.getCreativeId()
            if (r2 == 0) goto L_0x009e
            long r2 = r2.longValue()
            goto L_0x00a0
        L_0x009e:
            r2 = 0
        L_0x00a0:
            com.ss.android.ugc.aweme.sticker.d r1 = r1.a((long) r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f69874b
            if (r2 != 0) goto L_0x00ab
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ab:
            long r2 = com.ss.android.ugc.aweme.commercialize.log.w.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            r1.b((long) r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r9.f69875c
            if (r1 == 0) goto L_0x00c1
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r9.f69875c
            if (r1 == 0) goto L_0x00c0
            java.lang.String r2 = "interact_sticker_data"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            goto L_0x00cf
        L_0x00c0:
            return
        L_0x00c1:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r9.k
            if (r1 == 0) goto L_0x00cf
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r1 = r9.k
            if (r1 == 0) goto L_0x00cf
            java.lang.String r2 = "interact_sticker_data"
            r1.a((java.lang.String) r2, (java.lang.Object) r0)
            return
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a.a():void");
    }

    public final ArrayList<InteractStickerStruct> e() {
        String str;
        String str2;
        ArrayList<InteractStickerStruct> arrayList;
        if (PatchProxy.isSupport(new Object[0], this, f69873a, false, 79507, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f69873a, false, 79507, new Class[0], ArrayList.class);
        }
        if (this.g != null) {
            o oVar = this.g;
            if (oVar == null) {
                Intrinsics.throwNpe();
            }
            str = oVar.b(this.m);
            if (str == null) {
                o oVar2 = this.g;
                if (oVar2 == null) {
                    Intrinsics.throwNpe();
                }
                str = oVar2.b(this.n);
            }
            if (str == null) {
                o oVar3 = this.g;
                if (oVar3 == null) {
                    Intrinsics.throwNpe();
                }
                str = oVar3.b(this.o);
            }
        } else if (this.h != null) {
            String a2 = y.a(this.h, this.m);
            if (a2 == null) {
                a2 = y.a(this.h, this.n);
            }
            if (str == null) {
                str = y.a(this.h, this.o);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            str2 = new JSONObject(new JSONObject(str).getString(this.p)).getString(this.q);
        } catch (Exception unused) {
            str2 = null;
        }
        try {
            arrayList = (ArrayList) m.d().fromJson(str2, new d().getType());
        } catch (JsonSyntaxException unused2) {
            arrayList = null;
        }
        return arrayList;
    }

    private a(C0734a aVar) {
        this(aVar.f69880b, aVar.f69881c, aVar.f69882d, aVar.f69883e, aVar.f69884f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x019d, code lost:
        if (r4 == null) goto L_0x019f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.content.Context r12) {
        /*
            r11 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f69873a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79504(0x13690, float:1.11409E-40)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f69873a
            r3 = 0
            r4 = 79504(0x13690, float:1.11409E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            r8 = 0
            if (r0 == 0) goto L_0x0041
            java.util.List r0 = r0.getInteractStickerStructs()
            goto L_0x0042
        L_0x0041:
            r0 = r8
        L_0x0042:
            if (r0 != 0) goto L_0x004a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x005c
        L_0x004a:
            java.util.ArrayList r0 = new java.util.ArrayList
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f69874b
            if (r1 != 0) goto L_0x0053
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0053:
            java.util.List r1 = r1.getInteractStickerStructs()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
        L_0x005c:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$e r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a$e
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.sortedWith(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x006f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r0 = r9.next()
            r10 = r0
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r10 = (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r10
            int r0 = r10.getType()
            if (r0 == r7) goto L_0x00e9
            r1 = 3
            if (r0 == r1) goto L_0x0086
            goto L_0x006f
        L_0x0086:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.isAd()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0094
        L_0x0093:
            r0 = r8
        L_0x0094:
            if (r0 != 0) goto L_0x0099
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0099:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r0.getLogExtra()
            r1 = r0
            goto L_0x00b0
        L_0x00af:
            r1 = r8
        L_0x00b0:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x00c0
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = r0.getPageFrom()
            r2 = r0
            goto L_0x00c1
        L_0x00c0:
            r2 = r8
        L_0x00c1:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            goto L_0x00cb
        L_0x00ca:
            r0 = r8
        L_0x00cb:
            if (r0 != 0) goto L_0x00d0
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00d0:
            java.lang.String r3 = "aweme?.awemeRawAd!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            java.lang.String r3 = com.ss.android.ugc.aweme.commercialize.log.w.a((com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 != 0) goto L_0x00e0
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00e0:
            long r4 = com.ss.android.ugc.aweme.commercialize.log.w.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            r0 = r12
            com.ss.android.ugc.aweme.commercialize.log.w.a(r0, r1, r2, r3, r4)
            goto L_0x006f
        L_0x00e9:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r0.isAd()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00f7
        L_0x00f6:
            r0 = r8
        L_0x00f7:
            if (r0 != 0) goto L_0x00fc
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00fc:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0158
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r0 = r10.getPoiStruct()
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = r0.getPoiId()
            r1 = r0
            goto L_0x010f
        L_0x010e:
            r1 = r8
        L_0x010f:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x011f
            java.lang.String r0 = r0.getLogExtra()
            r2 = r0
            goto L_0x0120
        L_0x011f:
            r2 = r8
        L_0x0120:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x0130
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r0.getPageFrom()
            r3 = r0
            goto L_0x0131
        L_0x0130:
            r3 = r8
        L_0x0131:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 == 0) goto L_0x013a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            goto L_0x013b
        L_0x013a:
            r0 = r8
        L_0x013b:
            if (r0 != 0) goto L_0x0140
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0140:
            java.lang.String r4 = "aweme?.awemeRawAd!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r4)
            java.lang.String r4 = com.ss.android.ugc.aweme.commercialize.log.w.a((com.ss.android.ugc.aweme.feed.model.AwemeRawAd) r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f69874b
            if (r0 != 0) goto L_0x0150
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0150:
            long r5 = com.ss.android.ugc.aweme.commercialize.log.w.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            r0 = r12
            com.ss.android.ugc.aweme.commercialize.log.w.a(r0, r1, r2, r3, r4, r5)
        L_0x0158:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r11.f69875c
            if (r0 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r11.f69875c
            if (r0 == 0) goto L_0x017a
            java.lang.String r1 = "interact_sticker_data"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.sticker.d r0 = (com.ss.android.ugc.aweme.sticker.d) r0
            goto L_0x017b
        L_0x0169:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r0 = r11.k
            if (r0 == 0) goto L_0x017a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel r0 = r11.k
            if (r0 == 0) goto L_0x017a
            java.lang.String r1 = "interact_sticker_data"
            java.lang.Object r0 = r0.a(r1)
            com.ss.android.ugc.aweme.sticker.d r0 = (com.ss.android.ugc.aweme.sticker.d) r0
            goto L_0x017b
        L_0x017a:
            r0 = r8
        L_0x017b:
            java.lang.String r1 = "poi_sticker_show"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "enter_from"
            if (r0 == 0) goto L_0x018c
            com.ss.android.ugc.aweme.sticker.c r4 = r0.n
            if (r4 == 0) goto L_0x018c
            java.lang.String r4 = r4.f71627b
            goto L_0x018d
        L_0x018c:
            r4 = r8
        L_0x018d:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r10)
            if (r4 == 0) goto L_0x019f
            java.lang.String r4 = r4.getPoiStickerId()
            if (r4 != 0) goto L_0x01a1
        L_0x019f:
            java.lang.String r4 = ""
        L_0x01a1:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "group_id"
            if (r0 == 0) goto L_0x01b0
            com.ss.android.ugc.aweme.sticker.c r4 = r0.n
            if (r4 == 0) goto L_0x01b0
            java.lang.String r4 = r4.f71629d
            goto L_0x01b1
        L_0x01b0:
            r4 = r8
        L_0x01b1:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "log_pb"
            if (r0 == 0) goto L_0x01c0
            com.ss.android.ugc.aweme.sticker.c r4 = r0.n
            if (r4 == 0) goto L_0x01c0
            java.lang.String r4 = r4.f71630e
            goto L_0x01c1
        L_0x01c0:
            r4 = r8
        L_0x01c1:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            if (r0 == 0) goto L_0x01d0
            com.ss.android.ugc.aweme.sticker.c r0 = r0.n
            if (r0 == 0) goto L_0x01d0
            java.lang.String r0 = r0.f71628c
            goto L_0x01d1
        L_0x01d0:
            r0 = r8
        L_0x01d1:
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.sticker.data.PoiStruct r3 = r10.getPoiStruct()
            if (r3 == 0) goto L_0x01e2
            java.lang.String r3 = r3.getPoiId()
            goto L_0x01e3
        L_0x01e2:
            r3 = r8
        L_0x01e3:
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            goto L_0x006f
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a.a(android.content.Context):void");
    }

    public final boolean a(@NotNull String str) {
        BusinessExtraData businessExtraData;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f69873a, false, 79509, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f69873a, false, 79509, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "attr");
        List list = null;
        try {
            businessExtraData = (BusinessExtraData) m.d().fromJson(new JSONObject(str2).getString("interaction_extra"), BusinessExtraData.class);
        } catch (Exception unused) {
            businessExtraData = null;
        }
        if (businessExtraData == null) {
            return false;
        }
        Aweme aweme = this.f69874b;
        if (aweme != null) {
            String stickerIDs = aweme.getStickerIDs();
            if (stickerIDs != null) {
                list = StringsKt.split$default((CharSequence) stickerIDs, new String[]{","}, false, 0, 6, (Object) null);
            }
        }
        if (!CollectionUtils.isEmpty(list) && list != null) {
            return list.contains(businessExtraData.getStickerId());
        }
        return false;
    }

    public /* synthetic */ a(C0734a aVar, byte b2) {
        this(aVar);
    }

    @SuppressLint({"TooManyMethodParam"})
    private a(@Nullable Aweme aweme, @Nullable DataCenter dataCenter, @Nullable com.ss.android.ugc.aweme.sticker.a.a aVar, @Nullable com.ss.android.ugc.aweme.sticker.a.b bVar, @Nullable com.ss.android.ugc.aweme.sticker.c cVar, @Nullable o oVar, @Nullable g gVar, @Nullable com.ss.android.ugc.aweme.sticker.a.c cVar2, boolean z, @Nullable InteractStickerViewModel interactStickerViewModel, boolean z2) {
        this.f69874b = aweme;
        this.f69875c = dataCenter;
        this.f69876d = aVar;
        this.f69877e = bVar;
        this.f69878f = cVar;
        this.g = oVar;
        this.h = gVar;
        this.i = cVar2;
        this.j = z;
        this.k = interactStickerViewModel;
        this.l = z2;
        this.m = "information";
        this.n = "com.android.information";
        this.o = "com.apple.quicktime.information";
        this.p = "com.bytedance.info";
        this.q = "interaction_stickers";
    }
}
