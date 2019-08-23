package com.ss.android.ugc.aweme.commerce.preview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "switchAppListener", "Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver$SwitchAppListener;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "setSwitchAppListener", "Companion", "SwitchAppListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewHomeWatcherReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37255a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37256c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public b f37257b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver$Companion;", "", "()V", "SYSTEM_DIALOG_REASON_ASSIST", "", "SYSTEM_DIALOG_REASON_HOME_KEY", "SYSTEM_DIALOG_REASON_KEY", "SYSTEM_DIALOG_REASON_RECENT_APPS", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewHomeWatcherReceiver$SwitchAppListener;", "", "onSwitchApp", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();
    }

    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String str;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f37255a, false, 28786, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f37255a, false, 28786, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        String str2 = null;
        if (intent2 != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (StringsKt.equals$default(str, "android.intent.action.CLOSE_SYSTEM_DIALOGS", false, 2, null)) {
            if (intent2 != null) {
                str2 = intent2.getStringExtra("reason");
            }
            CharSequence charSequence = str2;
            if (TextUtils.equals("homekey", charSequence) || TextUtils.equals("recentapps", charSequence) || TextUtils.equals("assist", charSequence)) {
                b bVar = this.f37257b;
                if (bVar != null) {
                    bVar.a();
                    return;
                }
            }
        }
    }
}
