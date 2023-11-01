DESCRIPTION = "My own linux kernel recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

SRC_URI = "https://cdn.kernel.org/pub/linux/kernel/v6.x/linux-6.6.tar.xz;name=kernel \
	   file://defconfig"

S = "${WORKDIR}/linux-6.6"

SRC_URI[kernel.sha256sum] = "d926a06c63dd8ac7df3f86ee1ffc2ce2a3b81a2d168484e76b5b389aba8e56d0"

