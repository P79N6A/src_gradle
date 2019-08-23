package com.ss.android.ugc.aweme.friends;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000e¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "Lcom/bytedance/jedi/arch/State;", "isFirstEnter", "", "isSearching", "hadShowedFriendList", "hadShowedFindFriend", "currentIndex", "", "clickBackBtn", "eventActionUpCount", "enableFace2Face", "(ZZZZIZIZ)V", "getClickBackBtn", "()Z", "getCurrentIndex", "()I", "getEnableFace2Face", "getEventActionUpCount", "getHadShowedFindFriend", "getHadShowedFriendList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddFriendsState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean clickBackBtn;
    private final int currentIndex;
    private final boolean enableFace2Face;
    private final int eventActionUpCount;
    private final boolean hadShowedFindFriend;
    private final boolean hadShowedFriendList;
    private final boolean isFirstEnter;
    private final boolean isSearching;

    public AddFriendsState() {
        this(false, false, false, false, 0, false, 0, false, 255, null);
    }

    public static /* synthetic */ AddFriendsState copy$default(AddFriendsState addFriendsState, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, boolean z6, int i3, Object obj) {
        AddFriendsState addFriendsState2 = addFriendsState;
        int i4 = i3;
        return addFriendsState.copy((i4 & 1) != 0 ? addFriendsState2.isFirstEnter : z, (i4 & 2) != 0 ? addFriendsState2.isSearching : z2, (i4 & 4) != 0 ? addFriendsState2.hadShowedFriendList : z3, (i4 & 8) != 0 ? addFriendsState2.hadShowedFindFriend : z4, (i4 & 16) != 0 ? addFriendsState2.currentIndex : i, (i4 & 32) != 0 ? addFriendsState2.clickBackBtn : z5, (i4 & 64) != 0 ? addFriendsState2.eventActionUpCount : i2, (i4 & SearchJediMixFeedAdapter.f42517f) != 0 ? addFriendsState2.enableFace2Face : z6);
    }

    public final boolean component1() {
        return this.isFirstEnter;
    }

    public final boolean component2() {
        return this.isSearching;
    }

    public final boolean component3() {
        return this.hadShowedFriendList;
    }

    public final boolean component4() {
        return this.hadShowedFindFriend;
    }

    public final int component5() {
        return this.currentIndex;
    }

    public final boolean component6() {
        return this.clickBackBtn;
    }

    public final int component7() {
        return this.eventActionUpCount;
    }

    public final boolean component8() {
        return this.enableFace2Face;
    }

    @NotNull
    public final AddFriendsState copy(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, boolean z6) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0), Integer.valueOf(i), Byte.valueOf(z5 ? (byte) 1 : 0), Integer.valueOf(i2), Byte.valueOf(z6 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 46193, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, AddFriendsState.class)) {
            return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), Byte.valueOf(z4), Integer.valueOf(i), Byte.valueOf(z5), Integer.valueOf(i2), Byte.valueOf(z6)}, this, changeQuickRedirect, false, 46193, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, AddFriendsState.class);
        }
        AddFriendsState addFriendsState = new AddFriendsState(z, z2, z3, z4, i, z5, i2, z6);
        return addFriendsState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof AddFriendsState) {
                AddFriendsState addFriendsState = (AddFriendsState) obj;
                if (this.isFirstEnter == addFriendsState.isFirstEnter) {
                    if (this.isSearching == addFriendsState.isSearching) {
                        if (this.hadShowedFriendList == addFriendsState.hadShowedFriendList) {
                            if (this.hadShowedFindFriend == addFriendsState.hadShowedFindFriend) {
                                if (this.currentIndex == addFriendsState.currentIndex) {
                                    if (this.clickBackBtn == addFriendsState.clickBackBtn) {
                                        if (this.eventActionUpCount == addFriendsState.eventActionUpCount) {
                                            if (this.enableFace2Face == addFriendsState.enableFace2Face) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isFirstEnter;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isSearching;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hadShowedFriendList;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.hadShowedFindFriend;
        if (z5) {
            z5 = true;
        }
        int i4 = (((i3 + (z5 ? 1 : 0)) * 31) + this.currentIndex) * 31;
        boolean z6 = this.clickBackBtn;
        if (z6) {
            z6 = true;
        }
        int i5 = (((i4 + (z6 ? 1 : 0)) * 31) + this.eventActionUpCount) * 31;
        boolean z7 = this.enableFace2Face;
        if (!z7) {
            z2 = z7;
        }
        return i5 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46194, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46194, new Class[0], String.class);
        }
        return "AddFriendsState(isFirstEnter=" + this.isFirstEnter + ", isSearching=" + this.isSearching + ", hadShowedFriendList=" + this.hadShowedFriendList + ", hadShowedFindFriend=" + this.hadShowedFindFriend + ", currentIndex=" + this.currentIndex + ", clickBackBtn=" + this.clickBackBtn + ", eventActionUpCount=" + this.eventActionUpCount + ", enableFace2Face=" + this.enableFace2Face + ")";
    }

    public final boolean getClickBackBtn() {
        return this.clickBackBtn;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final boolean getEnableFace2Face() {
        return this.enableFace2Face;
    }

    public final int getEventActionUpCount() {
        return this.eventActionUpCount;
    }

    public final boolean getHadShowedFindFriend() {
        return this.hadShowedFindFriend;
    }

    public final boolean getHadShowedFriendList() {
        return this.hadShowedFriendList;
    }

    public final boolean isFirstEnter() {
        return this.isFirstEnter;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public AddFriendsState(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, boolean z6) {
        this.isFirstEnter = z;
        this.isSearching = z2;
        this.hadShowedFriendList = z3;
        this.hadShowedFindFriend = z4;
        this.currentIndex = i;
        this.clickBackBtn = z5;
        this.eventActionUpCount = i2;
        this.enableFace2Face = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddFriendsState(boolean r10, boolean r11, boolean r12, boolean r13, int r14, boolean r15, int r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = 0
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = 0
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = 0
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = 0
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = 0
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.AddFriendsState.<init>(boolean, boolean, boolean, boolean, int, boolean, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
