$.subscribe('autocompleteChange', function(event, data) {
    var ui = event.originalEvent.ui;
    var message = ui.item.value;
    if (ui.item.key) {
        message = '( ' + ui.item.key + ' ) ' + message;
    }
    $.post("consultarPropiedadesPorUsuarioJson.action", {idUsuario: ui.item.key}, function(data)
    {
        var contratoList = data.contratoList;
        if (contratoList)
        {
            var select = "<label class=\"control-label\">Seleccione una propiedad</label><select class=\"form-control\" name=\"mensaje.idPropiedad.idPropiedad\">";
            select+="<option value=\"null\">Ninguna Propiedad</option>";
            for (var i = 0; i < contratoList.length; i++) {
                select += "<option value=\"" + contratoList[i].idPropiedad.idPropiedad + "\">" + contratoList[i].idPropiedad.nombre + "</option>";
            }
            select += "</select>";
            $("#selectPropiedades").html(select);
        }
    });
});

$.subscribe('mensajesComplete', function(event, data) {
    $.post("consultarMensajesJSON.action", {idUsuario: 1}, function(data)
    {
        var mensajeList = data.mensajeList;
        if (mensajeList)
        {
            var mensajeHtml="";
            for (var i = 0; i < mensajeList.length; i++) {
                mensajeHtml += "<div>" + mensajeList[i].mensaje + "</div>";
            }
            $("#mensajes").html(mensajeHtml);
        }
    });
});