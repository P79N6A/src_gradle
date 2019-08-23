package com.tt.option.permission;

public class PermissionCustomDialogMsgEntity {
    private String addressDialogMsg;
    private String albumDialogMsg;
    private String cameraDialogMsg;
    private String locationDialogMsg;
    private String mPhoneNumberDialogMsg;
    private String recordAudioDialogMsg;
    private String userInfoDialogMsg;

    public static final class Builder {
        public String addressDialogMsg;
        public String albumDialogMsg;
        public String cameraDialogMsg;
        public String locationDialogMsg;
        public String mPhoneNumberDialogMsg;
        public String recordAudioDialogMsg;
        public String userInfoDialogMsg;

        public final PermissionCustomDialogMsgEntity build() {
            return new PermissionCustomDialogMsgEntity(this);
        }

        public final Builder addressDialogMsg(String str) {
            this.addressDialogMsg = str;
            return this;
        }

        public final Builder albumDialogMsg(String str) {
            this.albumDialogMsg = str;
            return this;
        }

        public final Builder cameraDialogMsg(String str) {
            this.cameraDialogMsg = str;
            return this;
        }

        public final Builder locationDialogMsg(String str) {
            this.locationDialogMsg = str;
            return this;
        }

        public final Builder phoneNumberDialogMsg(String str) {
            this.mPhoneNumberDialogMsg = str;
            return this;
        }

        public final Builder recordAudioDialogMsg(String str) {
            this.recordAudioDialogMsg = str;
            return this;
        }

        public final Builder userInfoDialogMsg(String str) {
            this.userInfoDialogMsg = str;
            return this;
        }
    }

    public String getAddressDialogMsg() {
        return this.addressDialogMsg;
    }

    public String getAlbumDialogMsg() {
        return this.albumDialogMsg;
    }

    public String getCameraDialogMsg() {
        return this.cameraDialogMsg;
    }

    public String getLocationDialogMsg() {
        return this.locationDialogMsg;
    }

    public String getPhoneNumberDialogMsg() {
        return this.mPhoneNumberDialogMsg;
    }

    public String getRecordAudioDialogMsg() {
        return this.recordAudioDialogMsg;
    }

    public String getUserInfoDialogMsg() {
        return this.userInfoDialogMsg;
    }

    private PermissionCustomDialogMsgEntity(Builder builder) {
        this.userInfoDialogMsg = builder.userInfoDialogMsg;
        this.locationDialogMsg = builder.locationDialogMsg;
        this.recordAudioDialogMsg = builder.recordAudioDialogMsg;
        this.cameraDialogMsg = builder.cameraDialogMsg;
        this.albumDialogMsg = builder.albumDialogMsg;
        this.addressDialogMsg = builder.addressDialogMsg;
        this.mPhoneNumberDialogMsg = builder.mPhoneNumberDialogMsg;
    }
}
