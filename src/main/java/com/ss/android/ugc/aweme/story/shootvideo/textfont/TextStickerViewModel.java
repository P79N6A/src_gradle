package com.ss.android.ugc.aweme.story.shootvideo.textfont;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/textfont/TextStickerViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "inTimeEditView", "Landroid/arch/lifecycle/MutableLiveData;", "", "getInTimeEditView", "()Landroid/arch/lifecycle/MutableLiveData;", "setInTimeEditView", "(Landroid/arch/lifecycle/MutableLiveData;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TextStickerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74162a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Boolean> f74163b;

    @Nullable
    public final MutableLiveData<Boolean> a() {
        if (PatchProxy.isSupport(new Object[0], this, f74162a, false, 86187, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f74162a, false, 86187, new Class[0], MutableLiveData.class);
        }
        MutableLiveData<Boolean> mutableLiveData = this.f74163b;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        throw new IllegalArgumentException("You should set inTimeEditView from outside, like VEVideoEditActivity or StoryController!");
    }
}
