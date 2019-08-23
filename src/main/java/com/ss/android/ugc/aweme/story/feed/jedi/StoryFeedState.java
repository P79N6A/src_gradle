package com.ss.android.ugc.aweme.story.feed.jedi;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J=\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "Lcom/bytedance/jedi/arch/State;", "lifeFeed", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "mShowingPopupWindow", "", "motionEvent", "Lcom/ss/android/ugc/aweme/story/feed/jedi/ViewPagerSealedMotionEvent;", "changeUserMode", "", "nextPosition", "", "(Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;ZLcom/ss/android/ugc/aweme/story/feed/jedi/ViewPagerSealedMotionEvent;Ljava/lang/String;I)V", "getChangeUserMode", "()Ljava/lang/String;", "getLifeFeed", "()Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "getMShowingPopupWindow", "()Z", "getMotionEvent", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/ViewPagerSealedMotionEvent;", "getNextPosition", "()I", "storyList", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "getStoryList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFeedState implements x {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String changeUserMode;
    @Nullable
    private final com.ss.android.ugc.aweme.story.feed.model.a lifeFeed;
    private final boolean mShowingPopupWindow;
    @NotNull
    private final p motionEvent;
    private final int nextPosition;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState$Companion;", "", "()V", "AUTO", "", "CLICK_CLOSE", "CLICK_HEAD", "CLICK_NEXT", "CLICK_PREVIOUS", "CLICK_STORY", "SLIDE_DOWN", "SLIDE_LEFT", "SLIDE_RIGHT", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public StoryFeedState() {
        this(null, false, null, null, 0, 31, null);
    }

    public static /* synthetic */ StoryFeedState copy$default(StoryFeedState storyFeedState, com.ss.android.ugc.aweme.story.feed.model.a aVar, boolean z, p pVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = storyFeedState.lifeFeed;
        }
        if ((i2 & 2) != 0) {
            z = storyFeedState.mShowingPopupWindow;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            pVar = storyFeedState.motionEvent;
        }
        p pVar2 = pVar;
        if ((i2 & 8) != 0) {
            str = storyFeedState.changeUserMode;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            i = storyFeedState.nextPosition;
        }
        return storyFeedState.copy(aVar, z2, pVar2, str2, i);
    }

    @Nullable
    public final com.ss.android.ugc.aweme.story.feed.model.a component1() {
        return this.lifeFeed;
    }

    public final boolean component2() {
        return this.mShowingPopupWindow;
    }

    @NotNull
    public final p component3() {
        return this.motionEvent;
    }

    @NotNull
    public final String component4() {
        return this.changeUserMode;
    }

    public final int component5() {
        return this.nextPosition;
    }

    @NotNull
    public final StoryFeedState copy(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar, boolean z, @NotNull p pVar, @NotNull String str, int i) {
        p pVar2 = pVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0), pVar2, str2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 83333, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class, Boolean.TYPE, p.class, String.class, Integer.TYPE}, StoryFeedState.class)) {
            Object[] objArr = {aVar, Byte.valueOf(z), pVar2, str2, Integer.valueOf(i)};
            return (StoryFeedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 83333, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class, Boolean.TYPE, p.class, String.class, Integer.TYPE}, StoryFeedState.class);
        }
        Intrinsics.checkParameterIsNotNull(pVar2, "motionEvent");
        Intrinsics.checkParameterIsNotNull(str2, "changeUserMode");
        StoryFeedState storyFeedState = new StoryFeedState(aVar, z, pVar, str, i);
        return storyFeedState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 83336, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 83336, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof StoryFeedState) {
                StoryFeedState storyFeedState = (StoryFeedState) obj;
                if (Intrinsics.areEqual((Object) this.lifeFeed, (Object) storyFeedState.lifeFeed)) {
                    if ((this.mShowingPopupWindow == storyFeedState.mShowingPopupWindow) && Intrinsics.areEqual((Object) this.motionEvent, (Object) storyFeedState.motionEvent) && Intrinsics.areEqual((Object) this.changeUserMode, (Object) storyFeedState.changeUserMode)) {
                        if (this.nextPosition == storyFeedState.nextPosition) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83335, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83335, new Class[0], Integer.TYPE)).intValue();
        }
        com.ss.android.ugc.aweme.story.feed.model.a aVar = this.lifeFeed;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        boolean z = this.mShowingPopupWindow;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        p pVar = this.motionEvent;
        int hashCode2 = (i2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str = this.changeUserMode;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.nextPosition;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83334, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83334, new Class[0], String.class);
        }
        return "StoryFeedState(lifeFeed=" + this.lifeFeed + ", mShowingPopupWindow=" + this.mShowingPopupWindow + ", motionEvent=" + this.motionEvent + ", changeUserMode=" + this.changeUserMode + ", nextPosition=" + this.nextPosition + ")";
    }

    @NotNull
    public final String getChangeUserMode() {
        return this.changeUserMode;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.story.feed.model.a getLifeFeed() {
        return this.lifeFeed;
    }

    public final boolean getMShowingPopupWindow() {
        return this.mShowingPopupWindow;
    }

    @NotNull
    public final p getMotionEvent() {
        return this.motionEvent;
    }

    public final int getNextPosition() {
        return this.nextPosition;
    }

    @Nullable
    public final List<UserStory> getStoryList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83332, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83332, new Class[0], List.class);
        }
        com.ss.android.ugc.aweme.story.feed.model.a aVar = this.lifeFeed;
        if (aVar != null) {
            return aVar.getUserStoryList();
        }
        return null;
    }

    public StoryFeedState(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar, boolean z, @NotNull p pVar, @NotNull String str, int i) {
        Intrinsics.checkParameterIsNotNull(pVar, "motionEvent");
        Intrinsics.checkParameterIsNotNull(str, "changeUserMode");
        this.lifeFeed = aVar;
        this.mShowingPopupWindow = z;
        this.motionEvent = pVar;
        this.changeUserMode = str;
        this.nextPosition = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoryFeedState(com.ss.android.ugc.aweme.story.feed.model.a r4, boolean r5, com.ss.android.ugc.aweme.story.feed.jedi.p r6, java.lang.String r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            r5 = 0
            r10 = 0
            goto L_0x000d
        L_0x000c:
            r10 = r5
        L_0x000d:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.story.feed.jedi.g r5 = com.ss.android.ugc.aweme.story.feed.jedi.g.f72659a
            r6 = r5
            com.ss.android.ugc.aweme.story.feed.jedi.p r6 = (com.ss.android.ugc.aweme.story.feed.jedi.p) r6
        L_0x0016:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            java.lang.String r7 = ""
        L_0x001d:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0025
            r8 = -1
            r2 = -1
            goto L_0x0026
        L_0x0025:
            r2 = r8
        L_0x0026:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedState.<init>(com.ss.android.ugc.aweme.story.feed.model.a, boolean, com.ss.android.ugc.aweme.story.feed.jedi.p, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
