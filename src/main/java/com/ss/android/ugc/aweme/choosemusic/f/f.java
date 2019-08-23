package com.ss.android.ugc.aweme.choosemusic.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/utils/PlayMusicInfo;", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "pageType", "", "isLoop", "", "(Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;IZ)V", "()Z", "setLoop", "(Z)V", "getMusicModel", "()Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "setMusicModel", "(Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;)V", "getPageType", "()I", "setPageType", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35907a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public MusicModel f35908b;

    /* renamed from: c  reason: collision with root package name */
    public int f35909c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f35910d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f35907a, false, 26798, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f35907a, false, 26798, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (Intrinsics.areEqual((Object) this.f35908b, (Object) fVar.f35908b)) {
                    if (this.f35909c == fVar.f35909c) {
                        if (this.f35910d == fVar.f35910d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f35907a, false, 26797, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f35907a, false, 26797, new Class[0], Integer.TYPE)).intValue();
        }
        MusicModel musicModel = this.f35908b;
        if (musicModel != null) {
            i = musicModel.hashCode();
        }
        int i2 = ((i * 31) + this.f35909c) * 31;
        boolean z = this.f35910d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f35907a, false, 26796, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f35907a, false, 26796, new Class[0], String.class);
        }
        return "PlayMusicInfo(musicModel=" + this.f35908b + ", pageType=" + this.f35909c + ", isLoop=" + this.f35910d + ")";
    }

    public f(@Nullable MusicModel musicModel, int i, boolean z) {
        this.f35908b = musicModel;
        this.f35909c = i;
        this.f35910d = z;
    }
}
