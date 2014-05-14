$.subscribe('autocompleteChange', function(event, data) {
    var ui = event.originalEvent.ui;
    var message = ui.item.value;
    alert(ui.item.key + ":" + message);
    $.post("consultarPropiedadesPorPCJson.action", {term: message}, function(data)
    {
        var propiedadList = data.propiedadList;
        var injection = "";
        if (propiedadList.length > 0) {
            injection += '<div class="panel-group" id="accordion">';
            for (var i = 0; i < propiedadList.length; i++) {
                dump(propiedadList[i]);
                injection += '<div class="panel-heading">' +
                        '<h4 class="panel-title">' +
                        '<a data-toggle="collapse" data-parent="#accordion" href="#collapse' + propiedadList[i].idPropiedad + '">' +
                        propiedadList[i].nombre +
                        '</a>' +
                        '</h4>' +
                        '</div>' + '<div id="collapse'+propiedadList[i].idPropiedad+'" class="panel-collapse collapse">' +
                        '<div class="panel-body">' + propiedadList[i].descripcion + '</div></div></div>'
                var listaFotos = propiedadList[i].listaFotos;
                if (listaFotos.length > 0) {
                    for (var j = 0; j < listaFotos.length; j++) {
                        var foto = listaFotos[j];
                        if(foto)
                        dump(listaFotos[j]);
                    }
                } else {
                    injection += "<div class=\"alert alert-info\"><b>Esta propiedad no tiene fotos.</b></div>";
                }
            }
            injection += '</div>';
        } else {
            injection = "<div class=\"alert alert-warning\"><b>No hay propiedades a mostrar para dicho criterio, intente con otro.</b></div>";
        }
        $("#inyeccionPropiedades").html(injection);
    });
});


