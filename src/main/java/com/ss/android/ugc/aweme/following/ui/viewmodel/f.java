package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationUser;", "", "type", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "order", "(ILcom/ss/android/ugc/aweme/profile/model/User;I)V", "getOrder", "()I", "getType", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48215a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48216b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final User f48217c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48218d;

    /* access modifiers changed from: private */
    @NotNull
    public f a(int i, @NotNull User user, int i2) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user2, Integer.valueOf(i2)}, this, f48215a, false, 45275, new Class[]{Integer.TYPE, User.class, Integer.TYPE}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user2, Integer.valueOf(i2)}, this, f48215a, false, 45275, new Class[]{Integer.TYPE, User.class, Integer.TYPE}, f.class);
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        return new f(i, user2, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48215a, false, 45278, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f48215a, false, 45278, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if ((this.f48216b == fVar.f48216b) && Intrinsics.areEqual((Object) this.f48217c, (Object) fVar.f48217c)) {
                    if (this.f48218d == fVar.f48218d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f48215a, false, 45277, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48215a, false, 45277, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f48216b * 31;
        User user = this.f48217c;
        if (user != null) {
            i = user.hashCode();
        }
        return ((i2 + i) * 31) + this.f48218d;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f48215a, false, 45276, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48215a, false, 45276, new Class[0], String.class);
        }
        return "RelationUser(type=" + this.f48216b + ", user=" + this.f48217c + ", order=" + this.f48218d + ")";
    }

    public f(int i, @NotNull User user, int i2) {
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        this.f48216b = i;
        this.f48217c = user;
        this.f48218d = i2;
    }

    public /* synthetic */ f(int i, User user, int i2, int i3) {
        this(i, user, 0);
    }
}
