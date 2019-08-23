package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import com.ss.android.vesdk.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction;", "", "actionType", "", "seekTo", "", "seekMode", "Lcom/ss/android/vesdk/VEEditor$SEEK_MODE;", "(IJLcom/ss/android/vesdk/VEEditor$SEEK_MODE;)V", "performByUser", "", "(IZ)V", "getActionType", "()I", "getPerformByUser", "()Z", "setPerformByUser", "(Z)V", "getSeekMode", "()Lcom/ss/android/vesdk/VEEditor$SEEK_MODE;", "setSeekMode", "(Lcom/ss/android/vesdk/VEEditor$SEEK_MODE;)V", "getSeekTo", "()J", "setSeekTo", "(J)V", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0709a f66601e = new C0709a((byte) 0);
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public p.d f66602a;

    /* renamed from: b  reason: collision with root package name */
    public long f66603b;

    /* renamed from: c  reason: collision with root package name */
    public final int f66604c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f66605d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEPreviewAction$Companion;", "", "()V", "ACTION_PAUSE", "", "ACTION_PLAY", "ACTION_SEEK", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C0709a {
        private C0709a() {
        }

        public /* synthetic */ C0709a(byte b2) {
            this();
        }
    }

    public a(int i, boolean z) {
        this.f66604c = i;
        this.f66605d = z;
        this.f66602a = p.d.EDITOR_SEEK_FLAG_LastSeek;
    }

    public /* synthetic */ a(int i, boolean z, int i2) {
        this(i, true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(int i, long j, @NotNull p.d dVar) {
        this(3, false, 2);
        Intrinsics.checkParameterIsNotNull(dVar, "seekMode");
        this.f66603b = j;
        this.f66602a = dVar;
    }
}
