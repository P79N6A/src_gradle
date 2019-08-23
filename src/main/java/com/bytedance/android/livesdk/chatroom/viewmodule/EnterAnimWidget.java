package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.entry.a.b;
import com.bytedance.android.livesdk.gift.effect.entry.b.a;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public class EnterAnimWidget extends LiveRecyclableWidget implements Observer<KVData>, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12496a;

    /* renamed from: b  reason: collision with root package name */
    public EnterAnimationView f12497b;

    /* renamed from: c  reason: collision with root package name */
    private int f12498c;

    /* renamed from: d  reason: collision with root package name */
    private b f12499d;

    public int getLayoutId() {
        return C0906R.layout.aor;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f12496a, false, 6791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12496a, false, 6791, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12496a, false, 6790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12496a, false, 6790, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12496a, false, 6789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12496a, false, 6789, new Class[0], Void.TYPE);
            return;
        }
        this.dataCenter.removeObserver(this);
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f12496a, false, 6792, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f12496a, false, 6792, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j2 != 0) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j2));
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12496a, false, 6785, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12496a, false, 6785, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12499d = new b();
        this.f12497b = (EnterAnimationView) this.contentView.findViewById(C0906R.id.a_a);
        if (objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f12497b.setChildMarginBottom(objArr[0].intValue());
        }
        this.f12497b.setUserEventListener(this);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12496a, false, 6786, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12496a, false, 6786, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.dataCenter.observe("data_member_message", this);
        if (a.a()) {
            this.dataCenter.observe("data_member_count", this);
        }
        if (this.f12497b != null && objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f12497b.setChildMarginBottom(objArr[0].intValue());
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12496a, false, 6784, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12496a, false, 6784, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -970251873) {
                if (hashCode == -407049065 && key.equals("data_member_message")) {
                    c2 = 0;
                }
            } else if (key.equals("data_member_count")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    as asVar = (as) kVData.getData();
                    if (PatchProxy.isSupport(new Object[]{asVar}, this, f12496a, false, 6787, new Class[]{as.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{asVar}, this, f12496a, false, 6787, new Class[]{as.class}, Void.TYPE);
                        break;
                    } else if (!(asVar == null || !isViewValid() || this.f12497b == null || asVar == null || asVar.a() != 1)) {
                        final com.bytedance.android.livesdk.gift.effect.entry.e.a a2 = this.f12499d.a(asVar);
                        if (a.a() || a.f()) {
                            EnterAnimationView enterAnimationView = this.f12497b;
                            int i = this.f12498c;
                            if (!PatchProxy.isSupport(new Object[]{asVar, Integer.valueOf(i)}, enterAnimationView, EnterAnimationView.f14855a, false, 9489, new Class[]{as.class, Integer.TYPE}, Void.TYPE)) {
                                com.bytedance.android.livesdk.gift.effect.entry.e.a a3 = enterAnimationView.f14857c.a(asVar);
                                a3.q = i;
                                if (enterAnimationView.f14858d && a3.a()) {
                                    enterAnimationView.f14856b.a(a3);
                                    break;
                                }
                            } else {
                                Object[] objArr = {asVar, Integer.valueOf(i)};
                                Object[] objArr2 = objArr;
                                EnterAnimationView enterAnimationView2 = enterAnimationView;
                                PatchProxy.accessDispatch(objArr2, enterAnimationView2, EnterAnimationView.f14855a, false, 9489, new Class[]{as.class, Integer.TYPE}, Void.TYPE);
                            }
                        } else if (!(asVar.l == null && asVar.j == 0)) {
                            if (a2.b()) {
                                if (!PatchProxy.isSupport(new Object[]{a2}, this, f12496a, false, 6788, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
                                    ImageModel imageModel = a2.l.f16494e;
                                    if (imageModel != null) {
                                        if (!TextUtils.isEmpty(com.bytedance.android.livesdk.gift.effect.entry.b.a.f14816a.a(imageModel))) {
                                            this.f12497b.a(a2);
                                            break;
                                        } else {
                                            a.C0105a aVar = com.bytedance.android.livesdk.gift.effect.entry.b.a.f14816a;
                                            AnonymousClass1 r2 = new a.c() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f12500a;

                                                public final void a(@NotNull ImageModel imageModel) {
                                                    if (PatchProxy.isSupport(new Object[]{imageModel}, this, f12500a, false, 6793, new Class[]{ImageModel.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{imageModel}, this, f12500a, false, 6793, new Class[]{ImageModel.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (EnterAnimWidget.this.isViewValid()) {
                                                        EnterAnimWidget.this.f12497b.a(a2);
                                                    }
                                                }
                                            };
                                            if (PatchProxy.isSupport(new Object[]{imageModel, r2}, aVar, a.C0105a.f14817a, false, 9436, new Class[]{ImageModel.class, a.c.class}, Void.TYPE)) {
                                                a.C0105a aVar2 = aVar;
                                                PatchProxy.accessDispatch(new Object[]{imageModel, r2}, aVar2, a.C0105a.f14817a, false, 9436, new Class[]{ImageModel.class, a.c.class}, Void.TYPE);
                                                break;
                                            } else {
                                                Intrinsics.checkParameterIsNotNull(imageModel, "imageModel");
                                                Intrinsics.checkParameterIsNotNull(r2, "callback");
                                                new a.b(imageModel, r2).a();
                                            }
                                        }
                                    }
                                } else {
                                    PatchProxy.accessDispatch(new Object[]{a2}, this, f12496a, false, 6788, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
                                }
                            } else {
                                this.f12497b.a(a2);
                            }
                        }
                        return;
                    }
                    break;
                case 1:
                    if (isViewValid()) {
                        this.f12498c = ((Integer) kVData.getData()).intValue();
                        break;
                    }
                    break;
            }
        }
    }
}
