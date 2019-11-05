MediaTek Telephony Extensions Re-implementation
---

These are originally placed directly inside `frameworks/opt/telephony` by phhusson. Since Android 10 introduced a new injection framework for vendor telephony extensions, we can put it here to decouple our code with the framework.

To use this, you need to clone this repository into `vendor/mediatek/hardware/telephony-ext`, as well as HIDL definitions in [another repository](https://github.com/PeterCxy/vendor_mediatek_hardware_interfaces) to `vendor/mediatek/hardware/interfaces`. After that, you need to include `vendor/mediatek/hardware/telephony-ext/overlay.mk` to your `device.mk` to tell the framework to load this injection library. Alternatively you may do this with your own overlay to exclude things you probably do not need.

Ironically, this library only works with QCOM's (rather simple and more elegant than what they used to do) extension to enable RIL injection (<https://github.com/LineageOS/android_frameworks_opt_telephony/commit/d10b37a57c2382f7f74b4e28413c45bd3a4ac7e7>). Make sure you either use LineageOS's latest telephony, or you have merged the aforementioned commit and its dependencies to your source tree.
