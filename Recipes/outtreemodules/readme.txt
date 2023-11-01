/*We cannot do IMAGE_INSTALL in image recipe for modules
so we in local.conf add 
--------------------------------------------------------------------------
----MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel-module-hello"--------------
or MACHINE_EXTRA_RDEPENDS
---------------------------------------------------------------------------
if we want to load module on boot use in local.conf
--------KERNEL_MODULE_AUTOLOAD += "hello"-----------------------------------
----------------------------------------------------------------------------
*/
