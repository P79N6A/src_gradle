package com.ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\rH\u0014J\u0016\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0004J \u0010\u001d\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0011J\u0006\u0010\u001e\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper;", "Landroid/arch/lifecycle/ViewModel;", "()V", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "musicManager", "Lcom/ss/android/ugc/musicprovider/MusicManager;", "playMusicStatus", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lkotlin/Pair;", "", "", "addMusicPlayObserver", "", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "observer", "Landroid/arch/lifecycle/Observer;", "isMusicLoading", "", "id", "isMusicPlaying", "mobMusicPlay", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "onCleared", "play", "context", "Landroid/support/v4/app/FragmentActivity;", "removeMusicPlayObserver", "stopPlaying", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicPlayHelper extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42284a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f42285e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.arch.widgets.base.b<Pair<Integer, Long>> f42286b = new com.ss.android.ugc.aweme.arch.widgets.base.b<>();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.b.b f42287c = new com.ss.android.ugc.b.b();

    /* renamed from: d  reason: collision with root package name */
    public Music f42288d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/helper/MusicPlayHelper$Companion;", "", "()V", "PLAYING_STATUS_LOADING", "", "PLAYING_STATUS_PLAYING", "PLAYING_STATUS_STOPPED", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "soure", "", "duration", "onStartPlay"}, k = 3, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.b.a.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42289a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f42290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Music f42291c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MusicModel f42292d;

        public b(MusicPlayHelper musicPlayHelper, Music music, MusicModel musicModel) {
            this.f42290b = musicPlayHelper;
            this.f42291c = music;
            this.f42292d = musicModel;
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{4, Integer.valueOf(i2)}, this, f42289a, false, 36331, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{4, Integer.valueOf(i2)}, this, f42289a, false, 36331, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f42290b.f42286b.setValue(new Pair(2, Long.valueOf(this.f42291c.getId())));
            MusicPlayHelper musicPlayHelper = this.f42290b;
            MusicModel musicModel = this.f42292d;
            if (PatchProxy.isSupport(new Object[]{musicModel}, musicPlayHelper, MusicPlayHelper.f42284a, false, 36329, new Class[]{MusicModel.class}, Void.TYPE)) {
                MusicPlayHelper musicPlayHelper2 = musicPlayHelper;
                PatchProxy.accessDispatch(new Object[]{musicModel}, musicPlayHelper2, MusicPlayHelper.f42284a, false, 36329, new Class[]{MusicModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(musicModel, "musicModel");
            r.a("play_music", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", musicModel.getMusicId()).a("enter_from", "search_result").a("enter_method", "click_play_music").f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onPlayCompeleted"}, k = 3, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f42294b;

        public c(MusicPlayHelper musicPlayHelper) {
            this.f42294b = musicPlayHelper;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42293a, false, 36332, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42293a, false, 36332, new Class[0], Void.TYPE);
                return;
            }
            this.f42294b.f42286b.setValue(new Pair(0, -1L));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "what", "", "extra", "onPlayError"}, k = 3, mv = {1, 1, 15})
    public static final class d implements com.ss.android.ugc.b.a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f42296b;

        public d(MusicPlayHelper musicPlayHelper) {
            this.f42296b = musicPlayHelper;
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42295a, false, 36333, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42295a, false, 36333, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f42296b.f42286b.setValue(new Pair(0, -1L));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "locationUrl", "", "kotlin.jvm.PlatformType", "goPlay"}, k = 3, mv = {1, 1, 15})
    public static final class e implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42297a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicPlayHelper f42298b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.b.b.a f42299c;

        public e(MusicPlayHelper musicPlayHelper, com.ss.android.ugc.b.b.a aVar) {
            this.f42298b = musicPlayHelper;
            this.f42299c = aVar;
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f42297a, false, 36334, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f42297a, false, 36334, new Class[]{String.class}, Void.TYPE);
                return;
            }
            this.f42299c.f77131a = str;
            this.f42298b.f42287c.a(this.f42299c, false);
        }
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f42284a, false, 36330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42284a, false, 36330, new Class[0], Void.TYPE);
            return;
        }
        a();
        com.ss.android.ugc.aweme.music.c.a().f56320b = null;
        this.f42287c.a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42284a, false, 36324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42284a, false, 36324, new Class[0], Void.TYPE);
            return;
        }
        this.f42287c.b();
        this.f42288d = null;
        this.f42286b.setValue(new Pair(0, -1L));
    }

    public final boolean b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f42284a, false, 36326, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f42284a, false, 36326, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f42286b.getValue() != null) {
            Pair pair = (Pair) this.f42286b.getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == 1) {
                Pair pair2 = (Pair) this.f42286b.getValue();
                if (pair2 == null || ((Number) pair2.getSecond()).longValue() != j) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull Observer<Pair<Integer, Long>> observer) {
        Observer<Pair<Integer, Long>> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{observer2}, this, f42284a, false, 36328, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer2}, this, f42284a, false, 36328, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(observer2, "observer");
        this.f42286b.removeObserver(observer2);
    }

    public final boolean a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f42284a, false, 36325, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f42284a, false, 36325, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f42286b.getValue() != null) {
            Pair pair = (Pair) this.f42286b.getValue();
            if (pair != null && ((Number) pair.getFirst()).intValue() == 2) {
                Pair pair2 = (Pair) this.f42286b.getValue();
                if (pair2 == null || ((Number) pair2.getSecond()).longValue() != j) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<Pair<Integer, Long>> observer) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        Observer<Pair<Integer, Long>> observer2 = observer;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2, observer2}, this, f42284a, false, 36327, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2, observer2}, this, f42284a, false, 36327, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(lifecycleOwner2, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(observer2, "observer");
        this.f42286b.a(lifecycleOwner2, observer2, false);
    }
}
