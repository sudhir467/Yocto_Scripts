DESCRIPTION = "My own linux kernel recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git; \
	   file://defconfig \
	   file://0001-my-first-msg.patch"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

