package com.bytedance.android.livesdk.admin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.admin.b.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8941a;

    /* renamed from: b  reason: collision with root package name */
    private Context f8942b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f8943c;

    class MenuViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8944a;

        /* renamed from: b  reason: collision with root package name */
        TextView f8945b;

        /* renamed from: c  reason: collision with root package name */
        public d f8946c;

        MenuViewHolder(View view) {
            super(view);
            this.f8945b = (TextView) view.findViewById(C0906R.id.bmg);
            this.f8945b.setOnClickListener(new View.OnClickListener(MenuAdapter.this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8948a;

                /* renamed from: d  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f8949d;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f8948a, true, 3082, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f8948a, true, 3082, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("MenuAdapter.java", AnonymousClass1.class);
                    f8949d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.admin.MenuAdapter$MenuViewHolder$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 92);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8948a, false, 3081, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8948a, false, 3081, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f8949d, this, this, view));
                    com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.admin.a.b(MenuViewHolder.this.f8946c.f8961b));
                }
            });
        }
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f8941a, false, 3078, new Class[0], Integer.TYPE)) {
            return this.f8943c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8941a, false, 3078, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8941a, false, 3079, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f8943c.get(i).f8960a;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8941a, false, 3079, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MenuViewHolder menuViewHolder = (MenuViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{menuViewHolder, Integer.valueOf(i)}, this, f8941a, false, 3077, new Class[]{MenuViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{menuViewHolder, Integer.valueOf(i)}, this, f8941a, false, 3077, new Class[]{MenuViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = this.f8943c.get(i);
        if (PatchProxy.isSupport(new Object[]{dVar}, menuViewHolder, MenuViewHolder.f8944a, false, 3080, new Class[]{d.class}, Void.TYPE)) {
            MenuViewHolder menuViewHolder2 = menuViewHolder;
            PatchProxy.accessDispatch(new Object[]{dVar}, menuViewHolder2, MenuViewHolder.f8944a, false, 3080, new Class[]{d.class}, Void.TYPE);
            return;
        }
        menuViewHolder.f8946c = dVar;
        menuViewHolder.f8945b.setText(dVar.f8962c);
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8941a, false, 3076, new Class[]{ViewGroup.class, Integer.TYPE}, MenuViewHolder.class)) {
            return (MenuViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8941a, false, 3076, new Class[]{ViewGroup.class, Integer.TYPE}, MenuViewHolder.class);
        }
        View inflate = LayoutInflater.from(this.f8942b).inflate(C0906R.layout.aju, viewGroup, false);
        switch (i) {
            case 0:
                inflate.setBackgroundResource(2130840864);
                break;
            case 1:
                inflate.setBackgroundResource(2130840866);
                break;
            case 2:
                inflate.setBackgroundResource(2130840865);
                break;
            case 3:
                inflate.setBackgroundResource(2130840863);
                break;
            default:
                inflate.setBackgroundResource(2130840864);
                break;
        }
        return new MenuViewHolder(inflate);
    }
}
