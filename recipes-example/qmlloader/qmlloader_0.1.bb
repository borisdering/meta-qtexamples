DESCRIPTION = "Qt Example Application"
SUMMARY = "Qt Qml Loader Application"
LICENSE = "CLOSED"

inherit qmake5

SRC_URI = "file://main.cpp \
    file://qmlloader.pro \
"
BB_STRICT_CHECKSUM = "0"

DEPENDS = "qtbase \
    qtdeclarative \
    qtquickcontrols2 \
    qtdeclarative \
    qtwebengine \
"

RDEPENDS_${PN} = "qtbase \
    qtdeclarative \
    qtquickcontrols2 \
    qtdeclarative \
    qtwebengine \
"

S = "${WORKDIR}"

do_install_append() {
    # Install application
    install -d ${D}${bindir}
    install -m 0755 ${PN} ${D}${bindir}/
}