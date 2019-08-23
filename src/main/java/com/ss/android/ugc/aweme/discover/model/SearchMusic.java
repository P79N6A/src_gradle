package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Ljava/io/Serializable;", "()V", "cardType", "", "getCardType", "()I", "setCardType", "(I)V", "hasMobShow", "", "getHasMobShow", "()Z", "setHasMobShow", "(Z)V", "hasMore", "getHasMore", "setHasMore", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "getMusic", "()Lcom/ss/android/ugc/aweme/music/model/Music;", "setMusic", "(Lcom/ss/android/ugc/aweme/music/model/Music;)V", "musicList", "", "getMusicList", "()Ljava/util/List;", "setMusicList", "(Ljava/util/List;)V", "equals", "other", "", "hashCode", "setRequestId", "", "requestId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class SearchMusic implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_type")
    private int cardType = 1;
    private boolean hasMobShow;
    @SerializedName("has_more")
    private boolean hasMore;
    @SerializedName("music")
    @Nullable
    private Music music;
    @SerializedName("musics")
    @Nullable
    private List<? extends Music> musicList;

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMobShow() {
        return this.hasMobShow;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final Music getMusic() {
        return this.music;
    }

    @Nullable
    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37112, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37112, new Class[0], Integer.TYPE)).intValue();
        }
        Music music2 = this.music;
        if (music2 != null) {
            i = music2.hashCode();
        }
        return i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMobShow(boolean z) {
        this.hasMobShow = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMusic(@Nullable Music music2) {
        this.music = music2;
    }

    public final void setMusicList(@Nullable List<? extends Music> list) {
        this.musicList = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37111, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37111, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if ((obj instanceof SearchMusic) && !(!Intrinsics.areEqual((Object) this.music, (Object) ((SearchMusic) obj).music))) {
                return true;
            }
            return false;
        }
    }

    public final void setRequestId(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 37110, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 37110, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Music music2 = this.music;
        if (music2 != null) {
            music2.setRequestId(str);
        }
        List<? extends Music> list = this.musicList;
        if (list != null) {
            for (Music requestId : list) {
                requestId.setRequestId(str);
            }
        }
    }
}
