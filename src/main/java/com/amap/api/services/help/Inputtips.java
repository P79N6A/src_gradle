package com.amap.api.services.help;

import android.content.Context;
import com.amap.api.services.a.av;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IInputtipsSearch;
import java.util.List;

public final class Inputtips {

    /* renamed from: a  reason: collision with root package name */
    private IInputtipsSearch f7057a;

    public interface InputtipsListener {
        void onGetInputtips(List<Tip> list, int i);
    }

    public final InputtipsQuery getQuery() {
        if (this.f7057a != null) {
            return this.f7057a.getQuery();
        }
        return null;
    }

    public final List<Tip> requestInputtips() throws AMapException {
        if (this.f7057a != null) {
            return this.f7057a.requestInputtips();
        }
        return null;
    }

    public final void requestInputtipsAsyn() {
        if (this.f7057a != null) {
            this.f7057a.requestInputtipsAsyn();
        }
    }

    public final void setInputtipsListener(InputtipsListener inputtipsListener) {
        if (this.f7057a != null) {
            this.f7057a.setInputtipsListener(inputtipsListener);
        }
    }

    public final void setQuery(InputtipsQuery inputtipsQuery) {
        if (this.f7057a != null) {
            this.f7057a.setQuery(inputtipsQuery);
        }
    }

    public final void requestInputtips(String str, String str2) throws AMapException {
        if (this.f7057a != null) {
            this.f7057a.requestInputtips(str, str2);
        }
    }

    public Inputtips(Context context, InputtipsListener inputtipsListener) {
        try {
            Context context2 = context;
            this.f7057a = (IInputtipsSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.InputtipsSearchWrapper", av.class, new Class[]{Context.class, InputtipsListener.class}, new Object[]{context, inputtipsListener});
        } catch (be unused) {
        }
        if (this.f7057a == null) {
            try {
                this.f7057a = new av(context, inputtipsListener);
            } catch (Exception unused2) {
            }
        }
    }

    public Inputtips(Context context, InputtipsQuery inputtipsQuery) {
        try {
            Context context2 = context;
            this.f7057a = (IInputtipsSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.InputtipsSearchWrapper", av.class, new Class[]{Context.class, InputtipsQuery.class}, new Object[]{context, inputtipsQuery});
        } catch (be unused) {
        }
        if (this.f7057a == null) {
            try {
                this.f7057a = new av(context, inputtipsQuery);
            } catch (Exception unused2) {
            }
        }
    }

    public final void requestInputtips(String str, String str2, String str3) throws AMapException {
        if (this.f7057a != null) {
            this.f7057a.requestInputtips(str, str2, str3);
        }
    }
}
