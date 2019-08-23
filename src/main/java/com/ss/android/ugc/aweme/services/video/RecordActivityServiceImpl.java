package com.ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl;", "Lcom/ss/android/ugc/aweme/services/video/IRecordActivityService;", "()V", "getVideoPublishActivityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "getVideoRecordActivityClass", "instanceOfVideoRecordActivity", "", "activity", "Landroid/content/Context;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecordActivityServiceImpl implements IRecordActivityService {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public static final Lazy instance$delegate = LazyKt.lazy(RecordActivityServiceImpl$Companion$instance$2.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl;", "instance$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/video/RecordActivityServiceImpl;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void instance$annotations() {
        }

        @NotNull
        public final RecordActivityServiceImpl getInstance() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71619, new Class[0], RecordActivityServiceImpl.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71619, new Class[0], RecordActivityServiceImpl.class);
            } else {
                value = RecordActivityServiceImpl.instance$delegate.getValue();
            }
            return (RecordActivityServiceImpl) value;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public static final RecordActivityServiceImpl getInstance() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 71618, new Class[0], RecordActivityServiceImpl.class) ? (RecordActivityServiceImpl) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 71618, new Class[0], RecordActivityServiceImpl.class) : Companion.getInstance();
    }

    private RecordActivityServiceImpl() {
    }

    @NotNull
    public final Class<? extends Activity> getVideoPublishActivityClass() {
        return VideoPublishActivity.class;
    }

    @NotNull
    public final Class<? extends Activity> getVideoRecordActivityClass() {
        return VideoRecordNewActivity.class;
    }

    public /* synthetic */ RecordActivityServiceImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean instanceOfVideoRecordActivity(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        return context instanceof VideoRecordNewActivity;
    }
}
