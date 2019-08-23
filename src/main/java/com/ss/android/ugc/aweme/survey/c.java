package com.ss.android.ugc.aweme.survey;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/survey/SurveyAnswer;", "", "actionType", "", "dialogId", "originalId", "(III)V", "getActionType", "()I", "setActionType", "(I)V", "getDialogId", "setDialogId", "getOriginalId", "setOriginalId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74498a;
    @SerializedName("action_type")

    /* renamed from: b  reason: collision with root package name */
    public int f74499b;
    @SerializedName("dialog_id")

    /* renamed from: c  reason: collision with root package name */
    public int f74500c;
    @SerializedName("original_id")

    /* renamed from: d  reason: collision with root package name */
    public int f74501d;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f74499b == cVar.f74499b) {
                    if (this.f74500c == cVar.f74500c) {
                        if (this.f74501d == cVar.f74501d) {
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
        return (((this.f74499b * 31) + this.f74500c) * 31) + this.f74501d;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74498a, false, 86680, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74498a, false, 86680, new Class[0], String.class);
        }
        return "SurveyAnswer(actionType=" + this.f74499b + ", dialogId=" + this.f74500c + ", originalId=" + this.f74501d + ")";
    }

    public c(int i, int i2, int i3) {
        this.f74499b = i;
        this.f74500c = i2;
        this.f74501d = i3;
    }
}
