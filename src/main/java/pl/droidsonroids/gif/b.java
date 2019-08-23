package pl.droidsonroids.gif;

import android.support.annotation.NonNull;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.tencent.bugly.CrashModule;
import java.util.Locale;

public enum b {
    NO_ERROR(0, "No error"),
    OPEN_FAILED(BaseLoginOrRegisterActivity.o, "Failed to open given input"),
    READ_FAILED(102, "Failed to read from given input"),
    NOT_GIF_FILE(103, "Data is not in GIF format"),
    NO_SCRN_DSCR(104, "No screen descriptor detected"),
    NO_IMAG_DSCR(105, "No image descriptor detected"),
    NO_COLOR_MAP(106, "Neither global nor local color map found"),
    WRONG_RECORD(107, "Wrong record type detected"),
    DATA_TOO_BIG(108, "Number of pixels bigger than width * height"),
    NOT_ENOUGH_MEM(109, "Failed to allocate required memory"),
    CLOSE_FAILED(110, "Failed to close given input"),
    NOT_READABLE(111, "Given file was not opened for read"),
    IMAGE_DEFECT(SearchJediMixFeedAdapter.f42516e, "Image is defective, decoding aborted"),
    EOF_TOO_SOON(113, "Image EOF detected before image complete"),
    NO_FRAMES(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, "No frames found, at least one frame required"),
    INVALID_SCR_DIMS(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, "Invalid screen size, dimensions must be positive"),
    INVALID_IMG_DIMS(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "Invalid image size, dimensions must be positive"),
    IMG_NOT_CONFINED(1003, "Image size exceeds screen size"),
    REWIND_FAILED(CrashModule.MODULE_ID, "Input source rewind failed, animation stopped"),
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    
    @NonNull
    public final String description;
    int errorCode;

    public final int getErrorCode() {
        return this.errorCode;
    }

    /* access modifiers changed from: package-private */
    public final String getFormattedDescription() {
        return String.format(Locale.ENGLISH, "GifError %d: %s", new Object[]{Integer.valueOf(this.errorCode), this.description});
    }

    static b fromCode(int i) {
        for (b bVar : values()) {
            if (bVar.errorCode == i) {
                return bVar;
            }
        }
        b bVar2 = UNKNOWN;
        bVar2.errorCode = i;
        return bVar2;
    }

    private b(int i, String str) {
        this.errorCode = i;
        this.description = str;
    }
}
