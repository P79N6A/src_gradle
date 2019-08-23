package com.ss.android.ugc.aweme.tools.music.b;

import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.ao.a.g;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager;", "", "()V", "listener", "Lcom/ss/android/ugc/aweme/tools/music/model/MvMusicResponseListener;", "publishMusic", "Lcom/ss/android/ugc/aweme/toolsport/model/IPublishMusic;", "getMusicDetail", "musicIds", "", "", "setMusicResponseListener", "setPublishMusic", "Companion", "SingletonHolder", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74854a;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final c f74855d = b.f74859a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f74856e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.music.d.a f74857b;

    /* renamed from: c  reason: collision with root package name */
    public g f74858c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager;", "getInstance", "()Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static c a() {
            return c.f74855d;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager;", "getHolder", "()Lcom/ss/android/ugc/aweme/tools/music/aimusic/MvMusicManager;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final c f74859a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final b f74860b = new b();

        private b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/music/model/Music;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.tools.music.b.c$c  reason: collision with other inner class name */
    static final class C0779c<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f74862b;

        C0779c(String str) {
            this.f74862b = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f74861a, false, 87203, new Class[0], Music.class)) {
                return ((IMainService) ServiceManager.get().getService(IMainService.class)).musicService().getMusicDetail(this.f74862b, 0);
            }
            return (Music) PatchProxy.accessDispatch(new Object[0], this, f74861a, false, 87203, new Class[0], Music.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/music/model/Music;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements a.g<Music, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f74864b;

        d(c cVar) {
            this.f74864b = cVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f74863a, false, 87204, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f74863a, false, 87204, new Class[]{i.class}, Void.TYPE);
            } else if (this.f74864b.f74857b != null) {
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                e eVar = null;
                if (iVar.e() != null) {
                    MusicModel convertToMusicModel = ((Music) iVar.e()).convertToMusicModel();
                    g gVar = this.f74864b.f74858c;
                    if (gVar != null) {
                        eVar = gVar.b();
                    }
                    if (eVar == null) {
                        z = true;
                    }
                    if (convertToMusicModel != null) {
                        convertToMusicModel.setMvThemeMusic(true);
                        if (z) {
                            g gVar2 = this.f74864b.f74858c;
                            if (gVar2 != null) {
                                gVar2.a(new com.ss.android.ugc.aweme.tools.music.f.b().apply(convertToMusicModel));
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.tools.music.d.a aVar = this.f74864b.f74857b;
                    if (aVar == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.a(convertToMusicModel, z);
                } else {
                    com.ss.android.ugc.aweme.tools.music.d.a aVar2 = this.f74864b.f74857b;
                    if (aVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar2.a(null, false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final c a(@Nullable g gVar) {
        this.f74858c = gVar;
        return this;
    }

    @NotNull
    public final c a(@Nullable com.ss.android.ugc.aweme.tools.music.d.a aVar) {
        this.f74857b = aVar;
        return this;
    }

    @NotNull
    public final c a(@Nullable List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f74854a, false, 87202, new Class[]{List.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{list}, this, f74854a, false, 87202, new Class[]{List.class}, c.class);
        } else if (j.a((Collection<T>) list) || list == null) {
            if (this.f74857b != null) {
                com.ss.android.ugc.aweme.tools.music.d.a aVar = this.f74857b;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                aVar.a(null, false);
            }
            return this;
        } else {
            String str = list.get(0);
            if (TextUtils.isEmpty(str)) {
                if (this.f74857b != null) {
                    com.ss.android.ugc.aweme.tools.music.d.a aVar2 = this.f74857b;
                    if (aVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar2.a(null, false);
                }
                return this;
            }
            i.a((Callable<TResult>) new C0779c<TResult>(str)).a((a.g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this), i.f1052b);
            return this;
        }
    }
}
