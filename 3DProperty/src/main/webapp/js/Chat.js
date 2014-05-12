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
            var select = "<label class=\"control-label\">Seleccione una propiedad</label><select id=\"propiedad\" class=\"form-control\" name=\"mensaje.idPropiedad.idPropiedad\">";
            select += "<option value=\"-1\">Ninguna Propiedad</option>";
            for (var i = 0; i < contratoList.length; i++) {
                select += "<option value=\"" + contratoList[i].idPropiedad.idPropiedad + "\">" + contratoList[i].idPropiedad.nombre + "</option>";
            }
            select += "</select>";
            $("#selectPropiedades").html(select);
        }
    });
});

$.subscribe('mensajesComplete', function(event, data) {
    var propiedad = $("#propiedad option[value='" + $("#propiedad").val() + "']").text()
    var mensaje = $("#mensaje").val();
    var destinatario = $("#destinatario_widget").val();
    $("#mensajesEnviadosTable > tbody:first").before("<tr><td>" + mensaje + "</td><td>" + destinatario + "</td><td>" + propiedad + "</td></tr>");
    $.post("consultarMensajesJSON.action", {idUsuario: $("#idUsuario").val}, function(data)
    {
    });
});

$(document).on('click', ".marcarMensaje", updateMensaje);

function updateMensaje(e)
{

    var row = $(this).parents('tr')[0];
    var idUpdate = $(e.target).attr('ide');
    row.remove();
    $.post("marcarMensaje.action", {idMensaje: idUpdate}, function(response)
    {
        
    });
}