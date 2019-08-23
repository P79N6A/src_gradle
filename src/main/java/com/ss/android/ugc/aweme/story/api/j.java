package com.ss.android.ugc.aweme.story.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010-\u001a\u00020.H\u0014J\u0006\u0010/\u001a\u000200J\b\u00101\u001a\u00020%H\u0016R\"\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "Lcom/ss/android/ugc/aweme/story/api/IPublishState;", "", "()V", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Ljava/lang/Exception;", "setError", "(Ljava/lang/Exception;)V", "errorTime", "", "getErrorTime", "()J", "setErrorTime", "(J)V", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "publishStatus", "publishStatus$annotations", "getPublishStatus", "setPublishStatus", "startTime", "getStartTime", "setStartTime", "successResult", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "getSuccessResult", "()Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "setSuccessResult", "(Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;)V", "taskPath", "", "getTaskPath", "()Ljava/lang/String;", "setTaskPath", "(Ljava/lang/String;)V", "uploadPath", "getUploadPath", "setUploadPath", "clone", "", "reset", "", "toString", "storyservices_release"}, k = 1, mv = {1, 1, 11})
public final class j implements IPublishState, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71839a;

    /* renamed from: b  reason: collision with root package name */
    public long f71840b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f71841c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f71842d;

    /* renamed from: e  reason: collision with root package name */
    public int f71843e;

    /* renamed from: f  reason: collision with root package name */
    public int f71844f;
    @Nullable
    public LifeStory g;
    @Nullable
    public Exception h;
    public long i;

    @NotNull
    public final Object clone() {
        if (!PatchProxy.isSupport(new Object[0], this, f71839a, false, 82151, new Class[0], Object.class)) {
            return super.clone();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f71839a, false, 82151, new Class[0], Object.class);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f71839a, false, 82152, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f71839a, false, 82152, new Class[0], String.class);
        }
        return "StoryPublishState{status=" + this.f71843e + ", progress=" + this.f71844f + ", successResult=" + this.g + ", error=" + this.h + ", taskPath=" + this.f71841c + ", uploadPath=" + this.f71842d + ", startTime=" + this.f71840b + ", errorTime=" + this.i + "}";
    }
}
