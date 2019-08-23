package com.ss.android.ugc.aweme.shortvideo.music.collect;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences;", "", "()V", "sPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSPreferences", "()Landroid/content/SharedPreferences;", "clearCollectMusicList", "", "getCollectMusic", "", "saveCollectMusicList", "musicListString", "Companion", "SingletonHolder", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68454a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final b f68455c = C0722b.f68458a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f68456d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f68457b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        @NotNull
        public static b a() {
            return b.f68455c;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences;", "getHolder", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicSharedPreferences;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.b$b  reason: collision with other inner class name */
    static final class C0722b {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final b f68458a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final C0722b f68459b = new C0722b();

        private C0722b() {
        }
    }

    public b() {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        this.f68457b = c.a(((IAVServiceProxy) service).getApplication(), "collect_music", 0);
    }
}
