SUMMARY = "Firmware package"
DESCRIPTION = "Firmware for usb-wifi(ath9k,rt73),wl12xx,bluetooth"
LICENSE = "LGPL"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup


MACHINE_ESSENTIAL_EXTRA_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS ?= ""

RDEPENDS_${PN} = "\
  linux-firmware-trik-wl1271 \
  linux-firmware-ath9k \
  linux-firmware-ralink \
  linux-firmware-msp \
  kernel-module-systec-can \
  linux-firmware-systec-can \
  ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS} \
 "

RRECOMMENDS_${PN} = "\
  ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS} \
 "

