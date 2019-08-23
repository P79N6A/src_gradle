package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.chatroom.interact.c.aq;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTimeContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.ap;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.ArrayList;

public class InteractPKTimeFragment extends InteractDialogPKTimeContract.View {
    public static ChangeQuickRedirect j;
    private ap k;
    private Button l;
    private InteractDialogPKSettingContract.View m;
    private int[] n = {120, c.f69428f, 600, 900};
    private int o;

    public final float d() {
        return 144.0f;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        int currentItemPosition = this.k.getCurrentItemPosition();
        if (currentItemPosition >= 0 && currentItemPosition < this.n.length) {
            this.m.a(this.n[currentItemPosition], currentItemPosition);
            this.f10827b.a();
        }
    }

    public InteractPKTimeFragment() {
        if (((Boolean) LiveConfigSettingKeys.PK_TEST_TIME.a()).booleanValue()) {
            this.n = new int[]{10, 120, c.f69428f, 600, 900};
        }
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4559, new Class[0], String.class)) {
            return getString(C0906R.string.d6l);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4559, new Class[0], String.class);
    }

    public final View e() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4560, new Class[0], View.class)) {
            return this.f10827b.b();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4560, new Class[0], View.class);
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4561, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4561, new Class[0], View.class);
        }
        if (this.l == null) {
            this.l = new Button(getContext());
            this.l.setLayoutParams(new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 32.0f), (int) UIUtils.dip2Px(getContext(), 32.0f)));
            this.l.setBackgroundResource(2130841005);
            this.l.setOnClickListener(new g(this));
        }
        return this.l;
    }

    public static InteractPKTimeFragment a(b.C0088b bVar, InteractDialogPKSettingContract.View view, int i) {
        b.C0088b bVar2 = bVar;
        InteractDialogPKSettingContract.View view2 = view;
        if (PatchProxy.isSupport(new Object[]{bVar2, view2, Integer.valueOf(i)}, null, j, true, 4557, new Class[]{b.C0088b.class, InteractDialogPKSettingContract.View.class, Integer.TYPE}, InteractPKTimeFragment.class)) {
            return (InteractPKTimeFragment) PatchProxy.accessDispatch(new Object[]{bVar2, view2, Integer.valueOf(i)}, null, j, true, 4557, new Class[]{b.C0088b.class, InteractDialogPKSettingContract.View.class, Integer.TYPE}, InteractPKTimeFragment.class);
        }
        InteractPKTimeFragment interactPKTimeFragment = new InteractPKTimeFragment();
        interactPKTimeFragment.h = new aq(interactPKTimeFragment);
        interactPKTimeFragment.f10827b = bVar2;
        interactPKTimeFragment.m = view2;
        interactPKTimeFragment.o = i;
        return interactPKTimeFragment;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, j, false, 4558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, j, false, 4558, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        ArrayList arrayList = new ArrayList();
        for (int i : this.n) {
            arrayList.add(i + NotifyType.SOUND);
        }
        if (this.o < 0 || this.o >= arrayList.size()) {
            this.o = 1;
        }
        this.k = new ap(getContext());
        this.k.setData(arrayList);
        this.k.setIndicator(true);
        this.k.setIndicatorSize(3);
        this.k.setItemTextSize((int) UIUtils.dip2Px(getContext(), 16.0f));
        this.k.setSelectItemTextSize((int) UIUtils.dip2Px(getContext(), 18.0f));
        this.k.setItemTextColor(Color.parseColor("#a0404040"));
        this.k.setSelectedItemTextColor(Color.parseColor("#404040"));
        this.k.setBackgroundColor(Color.parseColor("#f7f7f7"));
        this.k.a(this.o, false);
        return this.k;
    }
}
