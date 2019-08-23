package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/share/SilentShareChannel;", "", "key", "", "label", "iconRes", "", "saveType", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", "getIconRes", "()I", "getKey", "()Ljava/lang/String;", "getLabel", "getSaveType", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public enum co {
    ;
    
    public static final a Companion = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int iconRes;
    @NotNull
    private final String key;
    @NotNull
    private final String label;
    private final int saveType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/share/SilentShareChannel$Companion;", "", "()V", "supportChannels", "", "Lcom/ss/android/ugc/aweme/share/SilentShareChannel;", "activity", "Landroid/app/Activity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64995a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Companion = new a((byte) 0);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final int getSaveType() {
        return this.saveType;
    }

    @JvmStatic
    @NotNull
    public static final List<co> supportChannels(@NotNull Activity activity) {
        Object accessDispatch;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, null, changeQuickRedirect, true, 73379, new Class[]{Activity.class}, List.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{activity2}, null, changeQuickRedirect, true, 73379, new Class[]{Activity.class}, List.class);
        } else {
            a aVar = Companion;
            if (PatchProxy.isSupport(new Object[]{activity2}, aVar, a.f64995a, false, 73380, new Class[]{Activity.class}, List.class)) {
                Object[] objArr = {activity2};
                a aVar2 = aVar;
                accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, a.f64995a, false, 73380, new Class[]{Activity.class}, List.class);
            } else {
                Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
                return CollectionsKt.emptyList();
            }
        }
        return (List) accessDispatch;
    }

    private co(String str, String str2, int i, int i2) {
        this.key = str;
        this.label = str2;
        this.iconRes = i;
        this.saveType = i2;
    }
}
