package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/guide/PixaloopStickerGuideData;", "", "()V", "coverImgUrl", "", "<set-?>", "hintText", "getHintText", "()Ljava/lang/String;", "isValid", "", "()Z", "urlPrefixList", "", "videoMD5", "getVideoMD5", "videoUrl", "getVideoUrl", "getCoverImgUrl", "parseJson", "", "bean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "setUrlPrefixList", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69392a;

    /* renamed from: b  reason: collision with root package name */
    public String f69393b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f69394c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f69395d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f69396e;

    @Nullable
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f69392a, false, 78946, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f69392a, false, 78946, new Class[0], String.class);
        }
        List<String> list = this.f69396e;
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (list.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(this.f69394c)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<String> list2 = this.f69396e;
        if (list2 == null) {
            Intrinsics.throwNpe();
        }
        sb.append(list2.get(0));
        String str = this.f69394c;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f69392a, false, 78950, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f69392a, false, 78950, new Class[0], String.class);
        }
        if (this.f69396e != null) {
            List<String> list = this.f69396e;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.isEmpty() || TextUtils.isEmpty(this.f69393b)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            List<String> list2 = this.f69396e;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            sb.append(list2.get(0));
            String str = this.f69393b;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            sb.append(str);
            return sb.toString();
        }
        return null;
    }
}
