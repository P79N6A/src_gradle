package com.ss.android.ugc.aweme.survey;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003Jw\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/survey/SurveyData;", "", "dialogId", "", "title", "", "question", "answer1", "answer2", "resultTitle", "resultDesc", "originalQuestion", "originId", "originAnswer1", "originAnswer2", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAnswer1", "()Ljava/lang/String;", "setAnswer1", "(Ljava/lang/String;)V", "getAnswer2", "setAnswer2", "getDialogId", "()I", "setDialogId", "(I)V", "getOriginAnswer1", "setOriginAnswer1", "getOriginAnswer2", "setOriginAnswer2", "getOriginId", "setOriginId", "getOriginalQuestion", "setOriginalQuestion", "getQuestion", "setQuestion", "getResultDesc", "setResultDesc", "getResultTitle", "setResultTitle", "getTitle", "setTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74502a;
    @SerializedName("dialog_id")

    /* renamed from: b  reason: collision with root package name */
    public int f74503b;
    @SerializedName("title")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f74504c;
    @SerializedName("question")
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f74505d;
    @SerializedName("answer1")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f74506e;
    @SerializedName("answer2")
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public String f74507f;
    @SerializedName("end_title")
    @NotNull
    public String g;
    @SerializedName("end_sub_title")
    @NotNull
    public String h;
    @SerializedName("orig_question")
    @NotNull
    public String i;
    @SerializedName("original_id")
    public int j;
    @SerializedName("orig_answer1")
    @NotNull
    public String k;
    @SerializedName("orig_answer2")
    @NotNull
    public String l;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f74502a, false, 86695, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f74502a, false, 86695, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((this.f74503b == eVar.f74503b) && Intrinsics.areEqual((Object) this.f74504c, (Object) eVar.f74504c) && Intrinsics.areEqual((Object) this.f74505d, (Object) eVar.f74505d) && Intrinsics.areEqual((Object) this.f74506e, (Object) eVar.f74506e) && Intrinsics.areEqual((Object) this.f74507f, (Object) eVar.f74507f) && Intrinsics.areEqual((Object) this.g, (Object) eVar.g) && Intrinsics.areEqual((Object) this.h, (Object) eVar.h) && Intrinsics.areEqual((Object) this.i, (Object) eVar.i)) {
                    if (!(this.j == eVar.j) || !Intrinsics.areEqual((Object) this.k, (Object) eVar.k) || !Intrinsics.areEqual((Object) this.l, (Object) eVar.l)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f74502a, false, 86694, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74502a, false, 86694, new Class[0], Integer.TYPE)).intValue();
        }
        int i3 = this.f74503b * 31;
        String str = this.f74504c;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f74505d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f74506e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f74507f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.h;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.i;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.j) * 31;
        String str8 = this.k;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.l;
        if (str9 != null) {
            i2 = str9.hashCode();
        }
        return hashCode8 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74502a, false, 86693, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74502a, false, 86693, new Class[0], String.class);
        }
        return "SurveyData(dialogId=" + this.f74503b + ", title=" + this.f74504c + ", question=" + this.f74505d + ", answer1=" + this.f74506e + ", answer2=" + this.f74507f + ", resultTitle=" + this.g + ", resultDesc=" + this.h + ", originalQuestion=" + this.i + ", originId=" + this.j + ", originAnswer1=" + this.k + ", originAnswer2=" + this.l + ")";
    }
}
