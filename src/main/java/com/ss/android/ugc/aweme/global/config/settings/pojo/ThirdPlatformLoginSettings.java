package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.c.a;
import com.bytedance.ies.c.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ThirdPlatformLoginSettings extends Message<ThirdPlatformLoginSettings, Builder> {
    public static final DefaultValueProtoAdapter<ThirdPlatformLoginSettings> ADAPTER = new ProtoAdapter_ThirdPlatformLoginSettings();
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.LoginJumpStruct#ADAPTER", label = 2, tag = 1)
    public final List<LoginJumpStruct> login_jump;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct#ADAPTER", label = 2, tag = 2)
    public final List<BindWindowsStruct> other_bind_window;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct#ADAPTER", label = 2, tag = 3)
    public final List<BindWindowsStruct> profile_bind_window;

    public static final class Builder extends Message.Builder<ThirdPlatformLoginSettings, Builder> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<LoginJumpStruct> login_jump = Internal.newMutableList();
        public List<BindWindowsStruct> other_bind_window = Internal.newMutableList();
        public List<BindWindowsStruct> profile_bind_window = Internal.newMutableList();

        public final ThirdPlatformLoginSettings build() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49200, new Class[0], ThirdPlatformLoginSettings.class)) {
                return new ThirdPlatformLoginSettings(this.login_jump, this.other_bind_window, this.profile_bind_window, super.buildUnknownFields());
            }
            return (ThirdPlatformLoginSettings) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49200, new Class[0], ThirdPlatformLoginSettings.class);
        }

        public final Builder login_jump(List<LoginJumpStruct> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49197, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49197, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.login_jump = list;
            return this;
        }

        public final Builder other_bind_window(List<BindWindowsStruct> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49198, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49198, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.other_bind_window = list;
            return this;
        }

        public final Builder profile_bind_window(List<BindWindowsStruct> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 49199, new Class[]{List.class}, Builder.class)) {
                return (Builder) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 49199, new Class[]{List.class}, Builder.class);
            }
            Internal.checkElementsNotNull(list);
            this.profile_bind_window = list;
            return this;
        }
    }

    static final class ProtoAdapter_ThirdPlatformLoginSettings extends DefaultValueProtoAdapter<ThirdPlatformLoginSettings> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final ThirdPlatformLoginSettings redact(ThirdPlatformLoginSettings thirdPlatformLoginSettings) {
            return thirdPlatformLoginSettings;
        }

        public ProtoAdapter_ThirdPlatformLoginSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, ThirdPlatformLoginSettings.class);
        }

        public final ThirdPlatformLoginSettings decode(ProtoReader protoReader) throws IOException {
            ProtoReader protoReader2 = protoReader;
            if (!PatchProxy.isSupport(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49203, new Class[]{ProtoReader.class}, ThirdPlatformLoginSettings.class)) {
                return decode(protoReader2, (ThirdPlatformLoginSettings) null);
            }
            return (ThirdPlatformLoginSettings) PatchProxy.accessDispatch(new Object[]{protoReader2}, this, changeQuickRedirect, false, 49203, new Class[]{ProtoReader.class}, ThirdPlatformLoginSettings.class);
        }

        public final int encodedSize(ThirdPlatformLoginSettings thirdPlatformLoginSettings) {
            ThirdPlatformLoginSettings thirdPlatformLoginSettings2 = thirdPlatformLoginSettings;
            if (!PatchProxy.isSupport(new Object[]{thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49201, new Class[]{ThirdPlatformLoginSettings.class}, Integer.TYPE)) {
                return LoginJumpStruct.ADAPTER.asRepeated().encodedSizeWithTag(1, thirdPlatformLoginSettings2.login_jump) + BindWindowsStruct.ADAPTER.asRepeated().encodedSizeWithTag(2, thirdPlatformLoginSettings2.other_bind_window) + BindWindowsStruct.ADAPTER.asRepeated().encodedSizeWithTag(3, thirdPlatformLoginSettings2.profile_bind_window) + thirdPlatformLoginSettings.unknownFields().size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49201, new Class[]{ThirdPlatformLoginSettings.class}, Integer.TYPE)).intValue();
        }

        public final void encode(ProtoWriter protoWriter, ThirdPlatformLoginSettings thirdPlatformLoginSettings) throws IOException {
            ProtoWriter protoWriter2 = protoWriter;
            ThirdPlatformLoginSettings thirdPlatformLoginSettings2 = thirdPlatformLoginSettings;
            if (PatchProxy.isSupport(new Object[]{protoWriter2, thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49202, new Class[]{ProtoWriter.class, ThirdPlatformLoginSettings.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{protoWriter2, thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49202, new Class[]{ProtoWriter.class, ThirdPlatformLoginSettings.class}, Void.TYPE);
                return;
            }
            LoginJumpStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 1, thirdPlatformLoginSettings2.login_jump);
            BindWindowsStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 2, thirdPlatformLoginSettings2.other_bind_window);
            BindWindowsStruct.ADAPTER.asRepeated().encodeWithTag(protoWriter2, 3, thirdPlatformLoginSettings2.profile_bind_window);
            protoWriter2.writeBytes(thirdPlatformLoginSettings.unknownFields());
        }

        public final ThirdPlatformLoginSettings decode(ProtoReader protoReader, ThirdPlatformLoginSettings thirdPlatformLoginSettings) throws IOException {
            Builder builder;
            ProtoReader protoReader2 = protoReader;
            ThirdPlatformLoginSettings thirdPlatformLoginSettings2 = thirdPlatformLoginSettings;
            if (PatchProxy.isSupport(new Object[]{protoReader2, thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49204, new Class[]{ProtoReader.class, ThirdPlatformLoginSettings.class}, ThirdPlatformLoginSettings.class)) {
                return (ThirdPlatformLoginSettings) PatchProxy.accessDispatch(new Object[]{protoReader2, thirdPlatformLoginSettings2}, this, changeQuickRedirect, false, 49204, new Class[]{ProtoReader.class, ThirdPlatformLoginSettings.class}, ThirdPlatformLoginSettings.class);
            }
            ThirdPlatformLoginSettings thirdPlatformLoginSettings3 = (ThirdPlatformLoginSettings) a.a().a(ThirdPlatformLoginSettings.class, thirdPlatformLoginSettings2);
            if (thirdPlatformLoginSettings3 != null) {
                builder = thirdPlatformLoginSettings3.newBuilder();
            } else {
                builder = new Builder();
            }
            Builder builder2 = builder;
            List<LoginJumpStruct> newMutableList = Internal.newMutableList();
            List<BindWindowsStruct> newMutableList2 = Internal.newMutableList();
            List<BindWindowsStruct> newMutableList3 = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            newMutableList.add(LoginJumpStruct.ADAPTER.decode(protoReader2, a.a().a(LoginJumpStruct.class)));
                            break;
                        case 2:
                            newMutableList2.add(BindWindowsStruct.ADAPTER.decode(protoReader2, a.a().a(BindWindowsStruct.class)));
                            break;
                        case 3:
                            newMutableList3.add(BindWindowsStruct.ADAPTER.decode(protoReader2, a.a().a(BindWindowsStruct.class)));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder2.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader2));
                                break;
                            } catch (b e2) {
                                if (thirdPlatformLoginSettings3 != null) {
                                    break;
                                } else {
                                    throw e2;
                                }
                            }
                    }
                } else {
                    protoReader2.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder2.login_jump = newMutableList;
                    }
                    if (!newMutableList2.isEmpty()) {
                        builder2.other_bind_window = newMutableList2;
                    }
                    if (!newMutableList3.isEmpty()) {
                        builder2.profile_bind_window = newMutableList3;
                    }
                    return builder2.build();
                }
            }
        }
    }

    public final List<LoginJumpStruct> getLoginJump() {
        return this.login_jump;
    }

    public final List<BindWindowsStruct> getOtherBindWindow() {
        return this.other_bind_window;
    }

    public final List<BindWindowsStruct> getProfileBindWindow() {
        return this.profile_bind_window;
    }

    public final int hashCode() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49195, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49195, new Class[0], Integer.TYPE)).intValue();
        }
        int i = this.hashCode;
        if (i == 0) {
            i = (((((unknownFields().hashCode() * 37) + this.login_jump.hashCode()) * 37) + this.other_bind_window.hashCode()) * 37) + this.profile_bind_window.hashCode();
            this.hashCode = i;
        }
        return i;
    }

    public final Builder newBuilder() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49193, new Class[0], Builder.class)) {
            return (Builder) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49193, new Class[0], Builder.class);
        }
        Builder builder = new Builder();
        builder.login_jump = Internal.copyOf("login_jump", this.login_jump);
        builder.other_bind_window = Internal.copyOf("other_bind_window", this.other_bind_window);
        builder.profile_bind_window = Internal.copyOf("profile_bind_window", this.profile_bind_window);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49196, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49196, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!this.login_jump.isEmpty()) {
            sb.append(", login_jump=");
            sb.append(this.login_jump);
        }
        if (!this.other_bind_window.isEmpty()) {
            sb.append(", other_bind_window=");
            sb.append(this.other_bind_window);
        }
        if (!this.profile_bind_window.isEmpty()) {
            sb.append(", profile_bind_window=");
            sb.append(this.profile_bind_window);
        }
        StringBuilder replace = sb.replace(0, 2, "ThirdPlatformLoginSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 49194, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 49194, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == this) {
            return true;
        } else {
            if (!(obj instanceof ThirdPlatformLoginSettings)) {
                return false;
            }
            ThirdPlatformLoginSettings thirdPlatformLoginSettings = (ThirdPlatformLoginSettings) obj;
            if (!unknownFields().equals(thirdPlatformLoginSettings.unknownFields()) || !this.login_jump.equals(thirdPlatformLoginSettings.login_jump) || !this.other_bind_window.equals(thirdPlatformLoginSettings.other_bind_window) || !this.profile_bind_window.equals(thirdPlatformLoginSettings.profile_bind_window)) {
                return false;
            }
            return true;
        }
    }

    public ThirdPlatformLoginSettings(List<LoginJumpStruct> list, List<BindWindowsStruct> list2, List<BindWindowsStruct> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public ThirdPlatformLoginSettings(List<LoginJumpStruct> list, List<BindWindowsStruct> list2, List<BindWindowsStruct> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.login_jump = Internal.immutableCopyOf("login_jump", list);
        this.other_bind_window = Internal.immutableCopyOf("other_bind_window", list2);
        this.profile_bind_window = Internal.immutableCopyOf("profile_bind_window", list3);
    }
}
