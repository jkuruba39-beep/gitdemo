sap.ui.define([
    "sap/ui/core/mvc/Controller"
], function (Controller) {
    "use strict";

    return Controller.extend("anubav.controller.App", {

        onInit: function () {

            // ✅ Create Main View
            var oMainView = sap.ui.view({
                viewName: "anubav.view.Main",
                type: "XML"
            });

            // ✅ Add Main View into App container
            this.byId("idapp").addPage(oMainView);
        }

    });

});