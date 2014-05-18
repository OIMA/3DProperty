window.setInterval(function() {
    $.post(
            "consultarMensajesNoLeidosJSON.action",
            {idUsuario: $("#nombreUsuario").attr('idUsuario')},
    function(data) {
        var nuevosMensajes = data.mensajeRecibidosList;
        $.each(nuevosMensajes, function(index, datos) {
            console.log(index);
        });
    }
    );
}, 10000);

//window.setInterval(function() {
var id = $("#nombreUsuario").attr('idUsuario');
$.post(
        "contratoPorId.action",
        {idUsuario: id},
function(data) {
    alert(id);
    var contratos = data.mensajeRecibidosList;
    if (contratos) {
        for (i = 0; i < contratos.length; i++) {
            var nombre = contratos[i].idPropiedad.Nombre;
            alert(nombre);
        }
    }
}
);
//}, 10000);