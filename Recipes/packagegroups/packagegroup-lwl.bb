SUMMARY = "LWL Package group"

inherit packagegroup

RDEPENDS_${PN} = "util-linux \
		  pciutils \
		  usbutils"
