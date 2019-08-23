package com.ss.android.ugc.aweme.account.logindevicemanager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import java.util.List;

public class LoginDeviceAdapter extends BaseAdapter<com.ss.android.ugc.aweme.account.logindevicemanager.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32666a;

    /* renamed from: b  reason: collision with root package name */
    public Context f32667b;

    /* renamed from: c  reason: collision with root package name */
    public a f32668c;

    class LoginDeviceViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32669a;

        /* renamed from: b  reason: collision with root package name */
        CommonItemView f32670b;

        LoginDeviceViewHolder(View view) {
            super(view);
            this.f32670b = (CommonItemView) view.findViewById(C0906R.id.a4a);
            if (PatchProxy.isSupport(new Object[0], this, f32669a, false, 20819, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32669a, false, 20819, new Class[0], Void.TYPE);
                return;
            }
            this.f32670b.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32672a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f32672a, false, 20821, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f32672a, false, 20821, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (LoginDeviceAdapter.this.f32668c != null) {
                        LoginDeviceAdapter.this.f32668c.a(LoginDeviceViewHolder.this.getLayoutPosition());
                    }
                }
            });
        }
    }

    public interface a {
        void a(int i);
    }

    public LoginDeviceAdapter(Context context) {
        this.f32667b = context;
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f32666a, false, 20818, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f32666a, false, 20818, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        return new LoginDeviceViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.we, viewGroup2, false));
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        CommonItemView commonItemView;
        String str2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f32666a, false, 20817, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f32666a, false, 20817, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LoginDeviceViewHolder loginDeviceViewHolder = (LoginDeviceViewHolder) viewHolder;
        List list = this.mItems;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, loginDeviceViewHolder, LoginDeviceViewHolder.f32669a, false, 20820, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, loginDeviceViewHolder, LoginDeviceViewHolder.f32669a, false, 20820, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list) && i2 >= 0 && i2 < list.size()) {
            com.ss.android.ugc.aweme.account.logindevicemanager.a.a aVar = (com.ss.android.ugc.aweme.account.logindevicemanager.a.a) list.get(i2);
            if (!(aVar == null || LoginDeviceAdapter.this.f32667b == null)) {
                loginDeviceViewHolder.f32670b.setDesc(aVar.f32663b);
                if (TextUtils.isEmpty(aVar.f32664c)) {
                    str = LoginDeviceAdapter.this.f32667b.getResources().getString(C0906R.string.b95);
                } else {
                    str = aVar.f32664c;
                }
                loginDeviceViewHolder.f32670b.setLeftText(str);
                if (AppLog.getServerDeviceId() == null || !AppLog.getServerDeviceId().equals(aVar.f32662a)) {
                    commonItemView = loginDeviceViewHolder.f32670b;
                    if (aVar.f32665d) {
                        str2 = LoginDeviceAdapter.this.f32667b.getResources().getString(C0906R.string.a5b);
                    } else {
                        str2 = "";
                    }
                } else {
                    CommonItemView commonItemView2 = loginDeviceViewHolder.f32670b;
                    str2 = LoginDeviceAdapter.this.f32667b.getResources().getString(C0906R.string.b7z);
                    commonItemView = commonItemView2;
                }
                commonItemView.setRightText(str2);
            }
        }
    }
}
