package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioMobClickHelper;", "", "()V", "getEventParamSafely", "", "key", "mModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67073a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f67074b = new e();

    private e() {
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String str, @Nullable cb cbVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, cbVar}, null, f67073a, true, 76678, new Class[]{String.class, cb.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, cbVar}, null, f67073a, true, 76678, new Class[]{String.class, cb.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        String str3 = "";
        int hashCode = str.hashCode();
        AVETParameter aVETParameter = null;
        if (hashCode != 502589089) {
            if (hashCode != 831846208) {
                if (hashCode == 2061724374 && str2.equals("shoot_entrance")) {
                    if (cbVar != null) {
                        aVETParameter = cbVar.getAvetParameter();
                    }
                    if (aVETParameter != null) {
                        str3 = cbVar.getAvetParameter().getStoryShootEntrance();
                    }
                }
            } else if (str2.equals("content_type")) {
                if (cbVar != null) {
                    aVETParameter = cbVar.getAvetParameter();
                }
                if (aVETParameter != null) {
                    str3 = cbVar.getAvetParameter().getContentType();
                }
            }
        } else if (str2.equals("content_source")) {
            if (cbVar != null) {
                aVETParameter = cbVar.getAvetParameter();
            }
            if (aVETParameter != null) {
                str3 = cbVar.getAvetParameter().getContentSource();
            }
        }
        if (str3 == null || TextUtils.equals("null", str3)) {
            str3 = "";
        }
        return str3;
    }
}
