package com.ss.android.ugc.aweme.share.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/share/viewmodel/DialogShowingManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "viewModel", "Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "isDownloadDialogShowing", "", "isDownloadedVideoShareDialogShowing", "isGifDownloadDialogShowing", "isGifShareDialogShowing", "setCommentPanelShowing", "", "isShowing", "setDownloadDialogShowing", "setFollowGuidePopupShowingState", "setLoginPanelShowing", "setSharePanelShowing", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65316a;

    /* renamed from: d  reason: collision with root package name */
    public static final C0706a f65317d = new C0706a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final FeedPanelStateViewModel f65318b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Context f65319c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/share/viewmodel/DialogShowingManager$Companion;", "", "()V", "getInstance", "Lcom/ss/android/ugc/aweme/share/viewmodel/DialogShowingManager;", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.viewmodel.a$a  reason: collision with other inner class name */
    public static final class C0706a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65320a;

        private C0706a() {
        }

        public /* synthetic */ C0706a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final a a(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f65320a, false, 73846, new Class[]{Context.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f65320a, false, 73846, new Class[]{Context.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            return new a(context2, (byte) 0);
        }
    }

    @JvmStatic
    @NotNull
    public static final a a(@NotNull Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f65316a, true, 73845, new Class[]{Context.class}, a.class)) {
            return f65317d.a(context2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f65316a, true, 73845, new Class[]{Context.class}, a.class);
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65316a, false, 73836, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65316a, false, 73836, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.f65318b == null || this.f65318b.g.getValue() == null)) {
            Object value = this.f65318b.g.getValue();
            if (value == null) {
                Intrinsics.throwNpe();
            }
            if (((Boolean) value).booleanValue()) {
                z = true;
            }
        }
        return z;
    }

    private a(Context context) {
        FeedPanelStateViewModel feedPanelStateViewModel;
        this.f65319c = context;
        if (this.f65319c instanceof FragmentActivity) {
            feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of((FragmentActivity) this.f65319c).get(FeedPanelStateViewModel.class);
        } else {
            feedPanelStateViewModel = null;
        }
        this.f65318b = feedPanelStateViewModel;
    }

    public final void a(boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65316a, false, 73840, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65316a, false, 73840, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FeedPanelStateViewModel feedPanelStateViewModel = this.f65318b;
        if (feedPanelStateViewModel != null) {
            mutableLiveData = feedPanelStateViewModel.f65315f;
        } else {
            mutableLiveData = null;
        }
        if (mutableLiveData != null) {
            this.f65318b.f65315f.setValue(Boolean.valueOf(z));
        }
    }

    public final void b(boolean z) {
        MutableLiveData<Boolean> mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65316a, false, 73841, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65316a, false, 73841, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        FeedPanelStateViewModel feedPanelStateViewModel = this.f65318b;
        if (feedPanelStateViewModel != null) {
            mutableLiveData = feedPanelStateViewModel.j;
        } else {
            mutableLiveData = null;
        }
        if (mutableLiveData != null) {
            this.f65318b.j.setValue(Boolean.valueOf(z));
        }
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
