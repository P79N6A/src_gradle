package com.ss.android.ugc.aweme.cloudcontrol.c;

import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;

public interface c {
    TemplateResponse a(@NonNull TemplateModel templateModel);

    boolean b(@NonNull TemplateModel templateModel);
}
