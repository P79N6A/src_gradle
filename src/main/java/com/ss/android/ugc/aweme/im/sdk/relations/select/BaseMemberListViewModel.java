package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\b\u0010.\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020,H&J\u0012\u00100\u001a\u00020,2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u000e\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0010J\u000e\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020\u0010J\u000e\u00105\u001a\u00020,2\u0006\u00106\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR/\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00150\u001b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010!\"\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b*\u0010!¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "isMultiSelect", "", "()Z", "isSearch", "keyword", "", "getKeyword", "()Ljava/lang/String;", "mCurrentKeyword", "Landroid/arch/lifecycle/MutableLiveData;", "getMCurrentKeyword", "()Landroid/arch/lifecycle/MutableLiveData;", "mCurrentSearchMode", "", "getMCurrentSearchMode", "mCurrentSelectedMode", "getMCurrentSelectedMode", "mMemberList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "getMMemberList", "mSearchList", "getMSearchList", "mSectionIndexer", "Lkotlin/Pair;", "getMSectionIndexer", "mSelectedMember", "getMSelectedMember", "memberListCount", "getMemberListCount", "()I", "memberListType", "getMemberListType", "setMemberListType", "(I)V", "selectMemberList", "getSelectMemberList", "()Ljava/util/List;", "selectedMemberCount", "getSelectedMemberCount", "clearSelectMember", "", "deleteSelectMember", "onCleared", "refresh", "search", "setCurrentSearchMode", "searchMode", "setCurrentSelectMode", "selectMode", "setSelectedMember", "contact", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseMemberListViewModel extends ViewModel {
    public static ChangeQuickRedirect h;
    public int i;
    @NotNull
    public final MutableLiveData<List<IMContact>> j = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<List<IMContact>> k = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Pair<List<String>, List<Integer>>> l = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Integer> m = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<Integer> n = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<List<IMContact>> o = new MutableLiveData<>();
    @NotNull
    public final MutableLiveData<String> p = new MutableLiveData<>();

    public abstract void a();

    public abstract void a(@Nullable String str);

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52939, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 52939, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Integer num = (Integer) this.m.getValue();
        if (num != null && num.intValue() == 3) {
            z = true;
        }
        return z;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52940, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 52940, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Integer num = (Integer) this.n.getValue();
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<IMContact> d() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52941, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 52941, new Class[0], List.class);
        }
        List<IMContact> list = (List) this.o.getValue();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    public final int e() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52942, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 52942, new Class[0], Integer.TYPE)).intValue();
        }
        List list = (List) this.o.getValue();
        if (list != null) {
            i2 = list.size();
        }
        return i2;
    }

    @NotNull
    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52943, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, h, false, 52943, new Class[0], String.class);
        }
        String str = (String) this.p.getValue();
        if (str == null) {
            str = "";
        }
        return str;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 52948, new Class[0], Void.TYPE);
            return;
        }
        this.o.postValue(CollectionsKt.emptyList());
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 52949, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 52947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 52947, new Class[0], Void.TYPE);
            return;
        }
        int e2 = e();
        MutableLiveData<List<IMContact>> mutableLiveData = this.o;
        Collection arrayList = new ArrayList();
        int i2 = 0;
        for (Object next : d()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            boolean z = true;
            if (i2 >= e2 - 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
            i2 = i3;
        }
        mutableLiveData.postValue((List) arrayList);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 52944, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 52944, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m.postValue(Integer.valueOf(i2));
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 52945, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 52945, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.n.postValue(Integer.valueOf(i2));
        if (i2 == 0) {
            this.p.postValue("");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r0 == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.im.service.model.IMContact r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = h
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 52946(0xced2, float:7.4193E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = h
            r3 = 0
            r4 = 52946(0xced2, float:7.4193E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "contact"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r0 = r9.o
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0058
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r0)
            if (r0 == 0) goto L_0x0058
            boolean r1 = r0.contains(r10)
            if (r1 == 0) goto L_0x0053
            r0.remove(r10)
            goto L_0x0056
        L_0x0053:
            r0.add(r10)
        L_0x0056:
            if (r0 != 0) goto L_0x005c
        L_0x0058:
            java.util.List r0 = java.util.Collections.singletonList(r10)
        L_0x005c:
            android.arch.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.im.service.model.IMContact>> r1 = r9.o
            r1.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseMemberListViewModel.a(com.ss.android.ugc.aweme.im.service.model.IMContact):void");
    }
}
