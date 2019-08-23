package com.ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;

public interface IPOIService {

    public interface a {
        void a();

        void a(c cVar, @Nullable PoiStruct poiStruct, String str);

        void b();
    }

    public interface b {
        void a(c cVar, @Nullable PoiStruct poiStruct, String str);
    }

    public enum c {
        RESULT_DEFAULT,
        RESULT_MANUAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    Dialog getPOISearchDialog(Activity activity, Bundle bundle, b bVar);
}
