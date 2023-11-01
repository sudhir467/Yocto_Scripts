FILESEXTRAPATHS:prepend = "${THISDIR}/${PN}:"
SRC_URI += "file://0001-bbappend-patch.patch
	    file://lwlfragment.cfg"

LINUX_VERSION_EXTENSION = "-lwl"
