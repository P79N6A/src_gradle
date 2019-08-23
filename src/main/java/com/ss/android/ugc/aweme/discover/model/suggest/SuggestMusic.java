package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestMusic;", "", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "(Lcom/ss/android/ugc/aweme/music/model/Music;)V", "getMusic", "()Lcom/ss/android/ugc/aweme/music/model/Music;", "setMusic", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SuggestMusic {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("music_info")
    @Nullable
    public Music music;

    public SuggestMusic() {
        this(null, 1, null);
    }

    public static /* synthetic */ SuggestMusic copy$default(SuggestMusic suggestMusic, Music music2, int i, Object obj) {
        if ((i & 1) != 0) {
            music2 = suggestMusic.music;
        }
        return suggestMusic.copy(music2);
    }

    @NotNull
    public final SuggestMusic copy(@Nullable Music music2) {
        Music music3 = music2;
        if (!PatchProxy.isSupport(new Object[]{music3}, this, changeQuickRedirect, false, 37138, new Class[]{Music.class}, SuggestMusic.class)) {
            return new SuggestMusic(music3);
        }
        return (SuggestMusic) PatchProxy.accessDispatch(new Object[]{music3}, this, changeQuickRedirect, false, 37138, new Class[]{Music.class}, SuggestMusic.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37141, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof SuggestMusic) && Intrinsics.areEqual((Object) this.music, (Object) ((SuggestMusic) obj).music));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37141, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37140, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37140, new Class[0], Integer.TYPE)).intValue();
        }
        Music music2 = this.music;
        if (music2 != null) {
            i = music2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37139, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37139, new Class[0], String.class);
        }
        return "SuggestMusic(music=" + this.music + ")";
    }

    public SuggestMusic(@Nullable Music music2) {
        this.music = music2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuggestMusic(Music music2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : music2);
    }
}
